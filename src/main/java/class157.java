import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class157 extends class89 {

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "I")
    private int field3618;

    @OriginalMember(owner = "client!wd", name = "nb", descriptor = "I")
    private int field3623;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "I")
    private int field3610;

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
    private int field3619;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lw;")
    private class153 field3615;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
    private int field3617;

    @OriginalMember(owner = "client!wd", name = "xb", descriptor = "I")
    private int field3633;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
    public static int field3616 = 1;

    @OriginalMember(owner = "client!wd", name = "mb", descriptor = "I")
    public static int field3622 = 0;

    @OriginalMember(owner = "client!wd", name = "ob", descriptor = "Lr;")
    public static class118 field3624 = class153.method1136(81, "<col=c0ff00>");

    @OriginalMember(owner = "client!wd", name = "sb", descriptor = "[I")
    public static int[] field3628 = new int[2048];

    @OriginalMember(owner = "client!wd", name = "ub", descriptor = "I")
    public static int field3630 = 0;

    @OriginalMember(owner = "client!wd", name = "pb", descriptor = "Lr;")
    private static class118 field3625 = class153.method1136(103, "Error loading your profile)3");

    @OriginalMember(owner = "client!wd", name = "tb", descriptor = "Lr;")
    public static class118 field3629 = field3625;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!wd", name = "rb", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!wd", name = "vb", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!wd", name = "wb", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "Lff;")
    public static class42 field3613;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lff;")
    public static class42 field3614;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lke;")
    public static class74 field3611;

    @OriginalMember(owner = "client!wd", name = "qb", descriptor = "Lba;")
    public static class9 field3626;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "[Lke;")
    public static class74[] field3612;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I")
    public static final int method1223(int arg0, int arg1, int arg2) {
        field3632++;
        class97 var3 = (class97) class64.field1464.method297((long) arg2, -1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            if (arg1 != -13083) {
                method1224(11);
            }
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2262.length; var5++) {
                if (var3.field2260[var5] == arg0) {
                    var4 += var3.field2262[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "(I)V")
    public static final void method1224(int arg0) {
        field3631++;
        class85.field2050 = new class113();
        if (arg0 != 0) {
            method1224(51);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
    public static void method1225(byte arg0) {
        field3629 = null;
        if (arg0 != 27) {
            field3624 = null;
        }
        field3612 = null;
        field3624 = null;
        field3628 = null;
        field3614 = null;
        field3611 = null;
        field3613 = null;
        field3625 = null;
        field3626 = null;
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)Lwb;")
    public final class155 method215(int arg0) {
        if (this.field3615 != null) {
            int var2 = class65.field1479 - this.field3633;
            if (var2 > 100 && this.field3615.field3443 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field3615.field3478[this.field3617]) {
                            break label51;
                        }
                        var2 -= this.field3615.field3478[this.field3617];
                        this.field3617++;
                    } while (this.field3617 < this.field3615.field3464.length);
                    this.field3617 -= this.field3615.field3443;
                } while (this.field3617 >= 0 && this.field3615.field3464.length > this.field3617);
                this.field3615 = null;
            }
            this.field3633 = class65.field1479 - var2;
        }
        field3627++;
        class148 var3 = class47.method396(117, this.field3610);
        if (var3.field3310 != null) {
            var3 = var3.method1085(arg0 ^ 0xFFFFC471);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field3623 == 1 || this.field3623 == 3) {
            var4 = var3.field3279;
            var5 = var3.field3287;
        } else {
            var4 = var3.field3287;
            var5 = var3.field3279;
        }
        int var6 = (var5 >> 1) + this.field3621;
        int var7 = (var4 + 1 >> 1) + this.field3618;
        int var8 = (var5 + 1 >> 1) + this.field3621;
        int var9 = this.field3618 + (var4 >> 1);
        int[][] var10 = class72.field1668[this.field3619];
        int var11 = (this.field3618 << 7) + (var4 << 6);
        int var12 = var10[var6][var9] + var10[var8][var9] + var10[var6][var7] + var10[var8][var7] >> 2;
        if (arg0 != 15246) {
            method1226((byte) 72, 43);
        }
        int var13 = (this.field3621 << 7) + (var5 << 6);
        return var3.method1079(var13, -50, var10, var12, this.field3617, var11, this.field3615, this.field3623, this.field3620);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lr;")
    public static final class118 method1226(byte arg0, int arg1) {
        field3609++;
        if (arg0 != 62) {
            method1224(-74);
        }
        return arg1 < 999999999 ? class43.method359(arg1, (byte) -122) : class65.field1484;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(IIIIIIIZLmf;)V")
    public class157(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class89 arg8) {
        this.field3621 = arg4;
        this.field3618 = arg5;
        this.field3623 = arg2;
        this.field3620 = arg1;
        this.field3610 = arg0;
        this.field3619 = arg3;
        if (arg6 != -1) {
            this.field3615 = class125.method970((byte) -68, arg6);
            this.field3617 = 0;
            this.field3633 = class65.field1479 - 1;
            if (this.field3615.field3466 == 0 && arg8 != null && arg8 instanceof class157) {
                class157 var10 = (class157) arg8;
                if (this.field3615 == var10.field3615) {
                    this.field3617 = var10.field3617;
                    this.field3633 = var10.field3633;
                    return;
                }
            }
            if (arg7 && this.field3615.field3443 != -1) {
                this.field3617 = (int) ((double) this.field3615.field3464.length * Math.random());
                this.field3633 -= (int) ((double) this.field3615.field3478[this.field3617] * Math.random());
                return;
            }
        }
    }
}
