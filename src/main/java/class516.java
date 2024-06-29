import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class516 {

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field7548 = 0;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    private int field7549;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field7551;

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "I")
    public static int field7552;

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "I")
    public static int field7553;

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "I")
    public int field7554;

    @OriginalMember(owner = "client!nda", name = "j", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!nda", name = "k", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!nda", name = "l", descriptor = "I")
    public static int field7558;

    @OriginalMember(owner = "client!nda", name = "m", descriptor = "I")
    public static int field7559;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "[[Ln;")
    public static class17[][] field7555;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "[[Lub;")
    public static class20[][] field7547;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(II)V", line = 8)
    public final void method3053(int arg0, int arg1) {
        this.field7549 = arg1;
        field7556++;
        this.field7554 = arg0;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method3054(boolean arg0) {
        field7553++;
        int var1 = class394.field5564;
        int[] var2 = class82.field1176;
        for (int var3 = 0; var3 < var1; var3++) {
            class613 var9 = class184.field2252[var2[var3]];
            if (var9 != null && var9.field2621 > 0) {
                var9.field2621--;
                if (var9.field2621 == 0) {
                    var9.field2639 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class99.field1332; var4++) {
            long var5 = (long) class600.field8658[var4];
            class633 var7 = (class633) class522.field7662.method3678(var5, -125);
            if (var7 != null) {
                class557 var8 = var7.field9097;
                if (var8.field2621 > 0) {
                    var8.field2621--;
                    if (var8.field2621 == 0) {
                        var8.field2639 = null;
                    }
                }
            }
        }
        if (!arg0) {
            field7548 = -3;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIB)Z", line = 78)
    public final boolean method3055(int arg0, int arg1, int arg2, byte arg3) {
        field7557++;
        int var5 = this.field7549;
        if (this.field7554 == arg2 && this.field7549 == 0) {
            return false;
        }
        int var6 = -92 / ((-arg3 - 44) / 54);
        boolean var7;
        if (this.field7549 == 0) {
            if (arg2 > this.field7554 && arg2 <= (this.field7554 + arg0) || this.field7554 > arg2 && arg2 >= (this.field7554 - arg0)) {
                this.field7554 = arg2;
                return false;
            }
            var7 = true;
        } else if (this.field7549 > 0 && arg2 > this.field7554) {
            int var8 = this.field7549 * this.field7549 / (arg0 * 2);
            int var9 = this.field7554 + var8;
            if (arg2 > var9 && var9 >= this.field7554) {
                var7 = true;
            } else {
                var7 = false;
            }
        } else if (this.field7549 < 0 && this.field7554 > arg2) {
            int var10 = this.field7549 * this.field7549 / (arg0 * 2);
            int var11 = this.field7554 - var10;
            if (arg2 < var11 && var11 <= this.field7554) {
                var7 = true;
            } else {
                var7 = false;
            }
        } else {
            var7 = false;
        }
        if (var7) {
            if (this.field7554 >= arg2) {
                this.field7549 -= arg0;
                if (arg1 != 0 && -arg1 > this.field7549) {
                    this.field7549 = -arg1;
                }
            } else {
                this.field7549 += arg0;
                if (arg1 != 0 && arg1 < this.field7549) {
                    this.field7549 = arg1;
                }
            }
            if (this.field7549 != var5) {
                int var12 = this.field7549 * this.field7549 / (arg0 * 2);
                if (this.field7554 >= arg2) {
                    if (arg2 < this.field7554 && this.field7554 - var12 < arg2) {
                        this.field7549 = var5;
                    }
                } else if (arg2 < (this.field7554 + var12)) {
                    this.field7549 = var5;
                }
            }
        } else if (this.field7549 <= 0) {
            this.field7549 += arg0;
            if (this.field7549 > 0) {
                this.field7549 = 0;
            }
        } else {
            this.field7549 -= arg0;
            if (this.field7549 < 0) {
                this.field7549 = 0;
            }
        }
        this.field7554 += this.field7549 + var5 >> 1;
        return var7;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(II)I", line = 214)
    public static final int method3056(int arg0, int arg1) {
        if (arg0 != 2) {
            method3056(108, 76);
        }
        field7552++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 225)
    public static final void method3057(byte arg0) {
        field7551++;
        class245.method1487(11, -21316);
        class515.method3052(false);
        System.gc();
        if (arg0 > -63) {
            method3057((byte) -32);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)V", line = 239)
    public final void method3058(int arg0) {
        field7559++;
        if (arg0 == -30451) {
            this.field7554 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(B)V", line = 251)
    public static void method3059(byte arg0) {
        field7547 = null;
        int var1 = -92 / ((arg0 + 35) / 63);
        field7555 = null;
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(I)I", line = 267)
    public final int method3060(int arg0) {
        field7550++;
        return arg0 == 16383 ? this.field7554 & 0x3FFF : 75;
    }
}
