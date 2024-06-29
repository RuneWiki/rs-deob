import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class627 extends class638 {

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Z")
    private boolean field8791 = false;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Z")
    public boolean field8793 = false;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public int field8796 = 0;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Lfa;")
    private class564 field8788 = new class564();

    @OriginalMember(owner = "client!em", name = "r", descriptor = "I")
    private int field8798 = 0;

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Ltg;")
    public class605 field8797 = new class605();

    @OriginalMember(owner = "client!em", name = "t", descriptor = "Z")
    public boolean field8800 = false;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "I")
    private int field8803 = 0;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "Z")
    private boolean field8802 = false;

    @OriginalMember(owner = "client!em", name = "u", descriptor = "Lmp;")
    public class315 field8801 = new class315();

    @OriginalMember(owner = "client!em", name = "i", descriptor = "[Laba;")
    public class653[] field8789 = new class653[8192];

    @OriginalMember(owner = "client!em", name = "n", descriptor = "[Z")
    private static boolean[] field8794 = new boolean[8];

    @OriginalMember(owner = "client!em", name = "l", descriptor = "[Z")
    private static boolean[] field8792 = new boolean[32];

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public int field8799;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "J")
    private long field8790;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "J")
    private long field8795;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()Lmp;")
    public final class315 method3546() {
        this.field8801.field4735.method1458((byte) 66);
        for (int var1 = 0; var1 < this.field8789.length; var1++) {
            if (this.field8789[var1] != null && this.field8789[var1].field9263 != null) {
                this.field8801.field4735.method1456(this.field8789[var1], 0);
            }
        }
        return this.field8801;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "()V")
    public final void method3547() {
        this.field8793 = true;
        for (class330 var1 = (class330) this.field8797.method3463((byte) -50); var1 != null; var1 = (class330) this.field8797.method3469((byte) 107)) {
            if (var1.field4866.field4936 == 1) {
                var1.method1507(1);
            }
        }
        for (int var2 = 0; var2 < this.field8789.length; var2++) {
            if (this.field8789[var2] != null) {
                this.field8789[var2].method3672();
                this.field8789[var2] = null;
            }
        }
        this.field8796 = 0;
        this.field8788 = new class564();
        this.field8798 = 0;
        this.field8797 = new class605();
        this.field8803 = 0;
        this.method3610(-25057);
        class44.field747[class258.field4048] = this;
        class258.field4048 = class258.field4048 + 1 & class648.field9214[class630.field8864];
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "()V")
    public final void method3548() {
        this.field8802 = true;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([Lsn;Z)V")
    private final void method3549(class158[] arg0, boolean arg1) {
        for (int var3 = 0; var3 < 8; var3++) {
            field8794[var3] = false;
        }
        label76: for (class330 var4 = (class330) this.field8797.method3463((byte) -50); var4 != null; var4 = (class330) this.field8797.method3469((byte) 107)) {
            if (arg0 != null) {
                for (int var7 = 0; var7 < arg0.length; var7++) {
                    if (arg0[var7] == var4.field4863 || arg0[var7].field2450 == var4.field4863) {
                        field8794[var7] = true;
                        var4.method2129((byte) -118);
                        continue label76;
                    }
                }
            }
            if (!arg1) {
                var4.method636((byte) 97);
                this.field8803--;
                if (var4.method1506((byte) 88)) {
                    var4.method1507(1);
                    class692.field9814--;
                }
            }
        }
        if (arg0 == null) {
            return;
        }
        for (int var5 = 0; var5 < arg0.length && var5 != 8 && this.field8803 != 8; var5++) {
            if (!field8794[var5]) {
                class330 var6 = null;
                if (arg0[var5].method1179(20416).field4936 == 1 && class692.field9814 < 32) {
                    var6 = new class330(arg0[var5], this);
                    class643.field9183.method3751((byte) -95, (long) arg0[var5].field2446, var6);
                    class692.field9814++;
                }
                if (var6 == null) {
                    var6 = new class330(arg0[var5], this);
                }
                this.field8797.method3472(97, var6);
                this.field8803++;
                field8794[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "()V")
    private final void method3550() {
        this.field8791 = false;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(J)V")
    public final void method3551(long arg0) {
        this.field8795 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "()V")
    public static void method3552() {
        field8792 = null;
        field8794 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lha;)V")
    public final void method3553(class544 arg0) {
        this.field8801.field4735.method1458((byte) 66);
        for (class386 var2 = (class386) this.field8788.method3272(-128); var2 != null; var2 = (class386) this.field8788.method3274(false)) {
            var2.method2417(arg0, -1, this.field8790);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lha;J)Z")
    public final boolean method3554(class544 arg0, long arg1) {
        if (this.field8795 == this.field8790) {
            this.method3550();
        } else {
            this.method3557();
        }
        if (arg1 - this.field8795 > 750L) {
            this.method3547();
            return false;
        }
        int var4 = (int) (arg1 - this.field8790);
        if (this.field8802) {
            for (class386 var5 = (class386) this.field8788.method3272(-125); var5 != null; var5 = (class386) this.field8788.method3274(false)) {
                for (int var6 = 0; var6 < var5.field5779.field1335; var6++) {
                    var5.method2419(!this.field8791, false, arg0, arg1, 1);
                }
            }
            this.field8802 = false;
        }
        for (class386 var7 = (class386) this.field8788.method3272(-123); var7 != null; var7 = (class386) this.field8788.method3274(false)) {
            var7.method2419(!this.field8791, false, arg0, arg1, var4);
        }
        this.field8790 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZ)Lem;")
    public static final class627 method3555(int arg0, boolean arg1) {
        if (class329.field4860 == class258.field4048) {
            return new class627(arg0, arg1);
        } else {
            class627 var2 = class44.field747[class329.field4860];
            class329.field4860 = class329.field4860 + 1 & class648.field9214[class630.field8864];
            var2.method3558(arg0, arg1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "()Lmp;")
    public final class315 method3556() {
        return this.field8801;
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "()V")
    public final void method3557() {
        this.field8791 = true;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(IZ)V")
    private final void method3558(int arg0, boolean arg1) {
        class494.field7152.method3266(this, true);
        this.field8795 = arg0;
        this.field8790 = arg0;
        this.field8802 = true;
        this.field8800 = arg1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lha;[Lou;Z)V")
    private final void method3559(class544 arg0, class157[] arg1, boolean arg2) {
        for (int var4 = 0; var4 < 32; var4++) {
            field8792[var4] = false;
        }
        label67: for (class386 var5 = (class386) this.field8788.method3272(-120); var5 != null; var5 = (class386) this.field8788.method3274(false)) {
            if (arg1 != null) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    if (arg1[var8] == var5.field5776 || arg1[var8].field2428 == var5.field5776) {
                        field8792[var8] = true;
                        var5.method2418((byte) 111);
                        var5.field5774 = false;
                        continue label67;
                    }
                }
            }
            if (!arg2) {
                if (var5.field5780 == 0) {
                    var5.method3610(-25057);
                    this.field8798--;
                } else {
                    var5.field5774 = true;
                }
            }
        }
        if (arg1 == null) {
            return;
        }
        for (int var6 = 0; var6 < arg1.length && var6 != 32 && this.field8798 != 32; var6++) {
            if (!field8792[var6]) {
                class386 var7 = new class386(arg0, arg1[var6], this, this.field8795);
                this.field8788.method3266(var7, true);
                this.field8798++;
                field8792[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIII)V")
    public final void method3560(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field8799 = arg0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lha;J[Lou;[Lsn;Z)V")
    public final void method3561(class544 arg0, long arg1, class157[] arg2, class158[] arg3, boolean arg4) {
        if (!this.field8793) {
            this.method3559(arg0, arg2, arg4);
            this.method3549(arg3, arg4);
            this.field8795 = arg1;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(IZ)V")
    private class627(int arg0, boolean arg1) {
        this.method3558(arg0, arg1);
    }
}
