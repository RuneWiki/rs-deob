import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class81 implements Runnable {

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "[Lada;")
    private class163[] field847 = new class163[8];

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "[I")
    private int[] field848 = new int[3];

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "Z")
    private volatile boolean field851 = true;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "Z")
    private volatile boolean field846 = true;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
    private volatile boolean field849 = false;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    private int field843;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Lha;")
    private class58 field845;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "J")
    private long field844;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "Lot;")
    private class588 field850;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "()V")
    public final void method567() {
        this.field851 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "()V")
    public final void method568() {
        this.field851 = false;
        this.field846 = false;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "()V")
    public final void method569() {
        this.field851 = true;
        synchronized (this) {
            this.notify();
        }
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "()Z")
    public final boolean method570() {
        return this.field850 == null || !this.field849 && this.field850.method3372((byte) -38);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Lot;)V")
    public final void method571(class588 arg0) {
        if (this.field850 != null) {
            this.field850.method3370(-1, null);
        }
        this.field850 = arg0;
        if (this.field850 != null) {
            this.field850.method3370(-1, this);
        }
    }

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "()V")
    private final void method572() {
        this.field845.method392(this.field843);
        while (!this.field851 && this.field846) {
            if (this.field850 == null || this.field850.method3372((byte) -38)) {
                this.field849 = false;
                this.field844 = class30.field349.method280((byte) 64);
                synchronized (this) {
                    try {
                        this.wait();
                    } catch (InterruptedException var13) {
                    }
                }
            } else {
                this.field849 = true;
                class389 var1 = this.field850.method3374(-23);
                if (var1 instanceof class361) {
                    class361 var2 = (class361) var1;
                    if (var2.field4640) {
                        var2.method990(class563.field8026, -89);
                    } else {
                        class141.method887(var2, this.field847);
                        if (class254.field3055 != null) {
                            class254.field3055.method442(var2.field4631, -16777216, var2.field4636, -256, this.field850.field8306, 0);
                        }
                    }
                } else {
                    int var3 = ((class89) var1).field934;
                    if (var3 >= 1 && var3 <= 4) {
                        class278 var4 = class504.field7120[var3 - 1];
                        for (int var5 = 0; var5 < class626.field8992 + class626.field8992; var5++) {
                            for (int var6 = 0; var6 < class626.field8992 + class626.field8992; var6++) {
                                if (class391.field5395[var3 - 1][var5][var6]) {
                                    int var7 = class440.field6387 + var5 - class626.field8992;
                                    int var8 = class444.field6433 + var6 - class626.field8992;
                                    if (var7 >= 0 && var7 < var4.field3410 && var8 >= 0 && var8 < var4.field3408) {
                                        class563.field8026.method333(var7 << class748.field10430, var4.method1671(var8, var7, (byte) 103), var8 << class748.field10430, this.field848);
                                        if (class507.method3008(this.field848[0]) == this.field843 - 1) {
                                            var4.method1672(var7, var8);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.field845.method433(this.field843);
        while (this.field851 && this.field846) {
            synchronized (this) {
                try {
                    this.wait();
                } catch (InterruptedException var11) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!gv", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field846) {
            this.method572();
        }
    }

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "()J")
    public final long method573() {
        return this.field844;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(ILha;)V")
    public class81(int arg0, class58 arg1) {
        this.field843 = arg0;
        this.field845 = arg1;
    }
}
