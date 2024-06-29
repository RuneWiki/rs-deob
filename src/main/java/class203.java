import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class203 implements Runnable {

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "Z")
    private volatile boolean field3027 = true;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "[I")
    private int[] field3030 = new int[3];

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "[Lraa;")
    private class609[] field3028 = new class609[8];

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "Z")
    private volatile boolean field3031 = true;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Z")
    private volatile boolean field3026 = false;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "I")
    private int field3025;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "Lha;")
    private class60 field3032;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "J")
    private long field3029;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "Lvba;")
    private class41 field3033;

    @OriginalMember(owner = "client!tw", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3031) {
            this.method1390();
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "()J")
    public final long method1384() {
        return this.field3029;
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "()V")
    public final void method1385() {
        this.field3027 = false;
        this.field3031 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "()V")
    public final void method1386() {
        this.field3027 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lvba;)V")
    public final void method1387(class41 arg0) {
        if (this.field3033 != null) {
            this.field3033.method292(null, -1);
        }
        this.field3033 = arg0;
        if (this.field3033 != null) {
            this.field3033.method292(this, -1);
        }
    }

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "()Z")
    public final boolean method1388() {
        return this.field3033 == null || !this.field3026 && this.field3033.method294(-65);
    }

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "()V")
    public final void method1389() {
        this.field3027 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "()V")
    private final void method1390() {
        this.field3032.method471(this.field3025);
        while (!this.field3027 && this.field3031) {
            if (this.field3033 == null || this.field3033.method294(-105)) {
                this.field3026 = false;
                this.field3029 = class115.field1596.method2683(2);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field3026 = true;
                class55 var1 = this.field3033.method289((byte) 80);
                if (var1 instanceof class593) {
                    class593 var2 = (class593) var1;
                    if (var2.field8430) {
                        var2.method314(class118.field1620, false);
                    } else {
                        class91.method724(var2, this.field3028);
                        if (class654.field9181 != null) {
                            class654.field9181.method546(false, -16777216, var2.field8424, this.field3033.field446, var2.field8420, -256);
                        }
                    }
                } else {
                    int var3 = ((class105) var1).field1472;
                    if (var3 >= 1 && var3 <= 4) {
                        class280 var4 = class582.field8287[var3 - 1];
                        for (int var5 = 0; var5 < class60.field843 + class60.field843; var5++) {
                            for (int var6 = 0; var6 < class60.field843 + class60.field843; var6++) {
                                if (class727.field10148[var3 - 1][var5][var6]) {
                                    int var7 = class736.field10315 + var5 - class60.field843;
                                    int var8 = class116.field1600 + var6 - class60.field843;
                                    if (var7 >= 0 && var7 < var4.field3963 && var8 >= 0 && var8 < var4.field3962) {
                                        class118.field1620.method421(var7 << class459.field6769, var4.method1787(var7, 19646, var8), var8 << class459.field6769, this.field3030);
                                        if (class409.method2600(this.field3030[0]) == this.field3025 - 1) {
                                            var4.method960(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field3032.method480(this.field3025);
        while (this.field3027 && this.field3031) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(ILha;)V")
    public class203(int arg0, class60 arg1) {
        this.field3025 = arg0;
        this.field3032 = arg1;
    }
}
