import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class702 implements Runnable {

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "[Lab;")
    private class669[] field9488 = new class669[8];

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "[I")
    private int[] field9487 = new int[3];

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Z")
    private volatile boolean field9490 = true;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Z")
    private volatile boolean field9485 = true;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "Z")
    private volatile boolean field9484 = false;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    private int field9489;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "Lha;")
    private class59 field9486;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "J")
    private long field9482;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "Lcia;")
    private class613 field9483;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "()J")
    public final long method3917() {
        return this.field9482;
    }

    @OriginalMember(owner = "client!waa", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field9485) {
            this.method3920();
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "()V")
    public final void method3918() {
        this.field9490 = false;
        this.field9485 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lcia;)V")
    public final void method3919(class613 arg0) {
        if (this.field9483 != null) {
            this.field9483.method3474(null, (byte) -108);
        }
        this.field9483 = arg0;
        if (this.field9483 != null) {
            this.field9483.method3474(this, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "()V")
    private final void method3920() {
        this.field9486.method249(this.field9489);
        while (!this.field9490 && this.field9485) {
            if (this.field9483 == null || this.field9483.method3478(-112)) {
                this.field9484 = false;
                this.field9482 = class29.field765.method2053(1);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field9484 = true;
                class726 var1 = this.field9483.method3480(25061);
                if (var1 instanceof class404) {
                    class404 var2 = (class404) var1;
                    if (var2.field5932) {
                        var2.method31(class44.field982, -127);
                    } else {
                        class479.method2810(var2, this.field9488);
                        if (class130.field2182 != null) {
                            class130.field2182.method639(this.field9483.field8382, -256, var2.field5925, var2.field5931, -16777216, -114);
                        }
                    }
                } else {
                    int var3 = ((class42) var1).field971;
                    if (var3 >= 1 && var3 <= 4) {
                        class281 var4 = class683.field9250[var3 - 1];
                        for (int var5 = 0; var5 < class708.field9611 + class708.field9611; var5++) {
                            for (int var6 = 0; var6 < class708.field9611 + class708.field9611; var6++) {
                                if (class375.field5307[var3 - 1][var5][var6]) {
                                    int var7 = class134.field2256 + var5 - class708.field9611;
                                    int var8 = class492.field6813 + var6 - class708.field9611;
                                    if (var7 >= 0 && var7 < var4.field3937 && var8 >= 0 && var8 < var4.field3940) {
                                        class44.field982.method289(var7 << class130.field2185, var4.method1851((byte) -86, var8, var7), var8 << class130.field2185, this.field9487);
                                        if (class108.method968(this.field9487[0]) == this.field9489 - 1) {
                                            var4.method1150(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field9486.method312(this.field9489);
        while (this.field9490 && this.field9485) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "()V")
    public final void method3921() {
        this.field9490 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "()V")
    public final void method3922() {
        this.field9490 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "()Z")
    public final boolean method3923() {
        return this.field9483 == null || !this.field9484 && this.field9483.method3478(70);
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILha;)V")
    public class702(int arg0, class59 arg1) {
        this.field9489 = arg0;
        this.field9486 = arg1;
    }
}
