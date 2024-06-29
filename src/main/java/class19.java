import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class19 implements Runnable {

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
    private volatile boolean field244 = true;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
    private volatile boolean field247 = true;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Z")
    private volatile boolean field250 = false;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
    private int[] field251 = new int[3];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "[Lta;")
    private class330[] field246 = new class330[8];

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Lha;")
    private class18 field245;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "J")
    private long field249;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "Lai;")
    private class376 field252;

    @OriginalMember(owner = "client!f", name = "run", descriptor = "()V", line = 3)
    public final void run() {
        while (this.field247) {
            this.method252();
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "()V", line = 13)
    public final void method246() {
        this.field244 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "()Z", line = 20)
    public final boolean method247() {
        return this.field252 == null || !this.field250 && this.field252.method2974(126);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "()V", line = 24)
    public final void method248() {
        this.field244 = false;
        this.field247 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "()V", line = 32)
    public final void method249() {
        this.field244 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ILha;)V", line = 168)
    public class19(int arg0, class18 arg1) {
        this.field248 = arg0;
        this.field245 = arg1;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lai;)V", line = 47)
    public final void method250(class376 arg0) {
        if (this.field252 != null) {
            this.field252.method2976(null, (byte) 65);
        }
        this.field252 = arg0;
        if (this.field252 != null) {
            this.field252.method2976(this, (byte) -74);
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "()J", line = 56)
    public final long method251() {
        return this.field249;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "()V", line = 60)
    private final void method252() {
        this.field245.method205(this.field248);
        while (!this.field244 && this.field247) {
            if (this.field252 == null || this.field252.method2974(123)) {
                this.field250 = false;
                this.field249 = class552.field8052.method1763((byte) -52);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field250 = true;
                class651 var1 = this.field252.method2975(-1);
                if (var1 instanceof class202) {
                    class202 var2 = (class202) var1;
                    if (var2.field2976) {
                        var2.method586(class531.field7699, 0);
                    } else {
                        class590.method4357(var2, this.field246);
                        if (class287.field4066 != null) {
                            class287.field4066.method1828(var2.field2982, this.field252.field5488, true, -16777216, var2.field2974, -256);
                        }
                    }
                } else {
                    int var3 = ((class257) var1).field3675;
                    if (var3 >= 1 && var3 <= 4) {
                        class751 var4 = class107.field1413[var3 - 1];
                        for (int var5 = 0; var5 < class501.field7316 + class501.field7316; var5++) {
                            for (int var6 = 0; var6 < class501.field7316 + class501.field7316; var6++) {
                                if (class173.field2290[var3 - 1][var5][var6]) {
                                    int var7 = class269.field3812 + var5 - class501.field7316;
                                    int var8 = class98.field1331 + var6 - class501.field7316;
                                    if (var7 >= 0 && var7 < var4.field10701 && var8 >= 0 && var8 < var4.field10703) {
                                        class531.field7699.method223(var7 << class179.field2328, var4.method5442(var7, var8, 31844), var8 << class179.field2328, this.field251);
                                        if (class316.method2516(this.field251[0]) == this.field248 - 1) {
                                            var4.method2470(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field245.method130(this.field248);
        while (this.field244 && this.field247) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }
}
