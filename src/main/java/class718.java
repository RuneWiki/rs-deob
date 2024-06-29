import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class718 implements Runnable {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Z")
    private volatile boolean field10019 = true;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "[I")
    private int[] field10020 = new int[3];

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "Z")
    private volatile boolean field10024 = true;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Z")
    private volatile boolean field10021 = false;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "[Lmfa;")
    private class217[] field10026 = new class217[8];

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    private int field10022;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lha;")
    private class475 field10025;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "J")
    private long field10023;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "Lgda;")
    private class544 field10027;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()V", line = 3)
    public final void method3997() {
        this.field10019 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()V", line = 13)
    public final void method3998() {
        this.field10019 = false;
        this.field10024 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!rh", name = "run", descriptor = "()V", line = 22)
    public final void run() {
        while (this.field10024) {
            this.method4003();
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "()Z", line = 32)
    public final boolean method3999() {
        return this.field10027 == null || !this.field10021 && this.field10027.method3154(true);
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()V", line = 35)
    public final void method4000() {
        this.field10019 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lgda;)V", line = 42)
    public final void method4001(class544 arg0) {
        if (this.field10027 != null) {
            this.field10027.method3149(null, -122);
        }
        this.field10027 = arg0;
        if (this.field10027 != null) {
            this.field10027.method3149(this, -45);
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "()J", line = 52)
    public final long method4002() {
        return this.field10023;
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class718(int arg0, class475 arg1) {
        this.field10022 = arg0;
        this.field10025 = arg1;
    }

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "()V", line = 59)
    private final void method4003() {
        this.field10025.method430(this.field10022);
        while (!this.field10019 && this.field10024) {
            if (this.field10027 == null || this.field10027.method3154(true)) {
                this.field10021 = false;
                this.field10023 = class205.field3010.method1454((byte) 55);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field10021 = true;
                class91 var1 = this.field10027.method3153(-1);
                if (var1 instanceof class745) {
                    class745 var2 = (class745) var1;
                    if (var2.field10351) {
                        var2.method192(122, class29.field307);
                    } else {
                        class334.method2051(var2, this.field10026);
                        if (class203.field3004 != null) {
                            class203.field3004.method2628(-256, this.field10027.field7549, var2.field10352, -124, var2.field10355, -16777216);
                        }
                    }
                } else {
                    int var3 = ((class139) var1).field2295;
                    if (var3 >= 1 && var3 <= 4) {
                        class419 var4 = class678.field9594[var3 - 1];
                        for (int var5 = 0; var5 < class162.field2499 + class162.field2499; var5++) {
                            for (int var6 = 0; var6 < class162.field2499 + class162.field2499; var6++) {
                                if (class542.field7502[var3 - 1][var5][var6]) {
                                    int var7 = class277.field3995 + var5 - class162.field2499;
                                    int var8 = class3.field47 + var6 - class162.field2499;
                                    if (var7 >= 0 && var7 < var4.field5808 && var8 >= 0 && var8 < var4.field5809) {
                                        class29.field307.method482(var7 << class679.field9600, var4.method2476(var8, var7, -1), var8 << class679.field9600, this.field10020);
                                        if (class217.method1496(this.field10020[0]) == this.field10022 - 1) {
                                            var4.method821(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field10025.method456(this.field10022);
        while (this.field10019 && this.field10024) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }
}
