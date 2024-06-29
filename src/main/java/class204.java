import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class204 extends class200 {

    @OriginalMember(owner = "client!td", name = "R", descriptor = "I")
    public int field3646 = 2;

    @OriginalMember(owner = "client!td", name = "eb", descriptor = "I")
    public int field3659 = -1;

    @OriginalMember(owner = "client!td", name = "X", descriptor = "I")
    public int field3652 = -1;

    @OriginalMember(owner = "client!td", name = "N", descriptor = "I")
    public int field3643 = 5;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public int field3656 = -1;

    @OriginalMember(owner = "client!td", name = "ib", descriptor = "I")
    public int field3663 = -1;

    @OriginalMember(owner = "client!td", name = "M", descriptor = "I")
    public int field3642 = 99;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public int field3655 = -1;

    @OriginalMember(owner = "client!td", name = "kb", descriptor = "Z")
    public boolean field3665 = false;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "Ldj;")
    public static class44 field3647 = class89.method650(255, "title_mute");

    @OriginalMember(owner = "client!td", name = "hb", descriptor = "Ldj;")
    public static class44 field3662 = class89.method650(255, ")1");

    @OriginalMember(owner = "client!td", name = "jb", descriptor = "Ldj;")
    public static class44 field3664 = class89.method650(255, "Das ist eine Mitglieder)2Welt(Q");

    @OriginalMember(owner = "client!td", name = "L", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!td", name = "O", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!td", name = "V", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!td", name = "fb", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!td", name = "gb", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!td", name = "lb", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!td", name = "mb", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!td", name = "K", descriptor = "[I")
    private int[] field3640;

    @OriginalMember(owner = "client!td", name = "P", descriptor = "[I")
    private int[] field3645;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "[I")
    public int[] field3648;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "[I")
    public int[] field3649;

    @OriginalMember(owner = "client!td", name = "db", descriptor = "[I")
    public int[] field3658;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IBLdj;)V")
    public static final void method1315(int arg0, byte arg1, class44 arg2) {
        class200.field3542.method1170(134, (byte) -113);
        class212.field3800++;
        field3650++;
        class200.field3542.method484((byte) -124, arg0);
        class200.field3542.method536(arg2.method306(-58), 32);
        if (arg1 != 22) {
            field3647 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIIII)V")
    public static final void method1316(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class68 var6 = class32.field567[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class237 var7 = var6.field1313;
        if (var7 != null) {
            int var8 = var7.field4391;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class26 var10 = var6.field1301;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field471;
        int var12 = var10.field474;
        int var13 = var10.field473;
        int var14 = var10.field461;
        int[] var15 = class192.field3341[var11];
        int[] var16 = class101.field1849[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(II)Z")
    public static final boolean method1317(int arg0, int arg1) {
        field3651++;
        if (arg0 != 57) {
            method1316(null, -125, 94, -30, 72, -31);
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IILlg;)Llg;")
    public final class127 method1318(int arg0, int arg1, class127 arg2) {
        field3667++;
        int var4 = this.field3658[arg0];
        class238 var5 = class15.method129(arg1 + 25871, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method66(true);
        } else if (arg1 == -25768) {
            class127 var7 = arg2.method66(!var5.method1546(var6, (byte) -127));
            var7.method48(var5, var6);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public static void method1319(int arg0) {
        field3664 = null;
        field3647 = null;
        if (arg0 == -1753) {
            field3662 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Llg;IILtd;I)Llg;")
    public final class127 method1320(class127 arg0, int arg1, int arg2, class204 arg3, int arg4) {
        field3666++;
        int var6 = this.field3658[arg1];
        class238 var7 = class15.method129(33, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg3.method1318(arg4, -25768, arg0);
        }
        int var9 = arg3.field3658[arg4];
        class238 var10 = class15.method129(98, var9 >> 16);
        int var11 = var9 & arg2;
        if (var10 == null) {
            class127 var12 = arg0.method66(!var7.method1546(var8, (byte) -127));
            var12.method48(var7, var8);
            return var12;
        } else {
            class127 var13 = arg0.method66(!var7.method1546(var8, (byte) -127) & !var10.method1546(var11, (byte) -127));
            var13.method68(var7, var8, var10, var11, this.field3645);
            return var13;
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
    public final void method1321(byte arg0) {
        if (this.field3656 == -1) {
            if (this.field3645 == null) {
                this.field3656 = 0;
            } else {
                this.field3656 = 2;
            }
        }
        field3641++;
        if (arg0 <= 13) {
            this.method1320(null, 40, 93, null, 21);
        }
        if (this.field3663 != -1) {
            return;
        }
        if (this.field3645 == null) {
            this.field3663 = 0;
        } else {
            this.field3663 = 2;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(IILlg;)Llg;")
    public final class127 method1322(int arg0, int arg1, class127 arg2) {
        field3654++;
        int var4 = this.field3658[arg0];
        class238 var5 = class15.method129(105, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method71(true);
        }
        class127 var7 = arg2.method71(!var5.method1546(var6, (byte) -127));
        if (arg1 > -13) {
            this.field3648 = null;
        }
        var7.method48(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BLfj;I)V")
    private final void method1323(byte arg0, class66 arg1, int arg2) {
        if (arg0 != 21) {
            return;
        }
        field3661++;
        if (arg2 == 1) {
            int var11 = arg1.method500(39);
            this.field3648 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3648[var12] = arg1.method500(class13.method116(arg0, 85));
            }
            this.field3658 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field3658[var13] = arg1.method500(53);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field3658[var14] = (arg1.method500(50) << 16) + this.field3658[var14];
            }
        } else if (arg2 == 2) {
            this.field3659 = arg1.method500(54);
        } else if (arg2 == 3) {
            int var4 = arg1.method506(255);
            this.field3645 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3645[var5] = arg1.method506(255);
            }
            this.field3645[var4] = 9999999;
        } else if (arg2 == 4) {
            this.field3665 = true;
        } else if (arg2 == 5) {
            this.field3643 = arg1.method506(255);
        } else if (arg2 == 6) {
            this.field3652 = arg1.method500(114);
        } else if (arg2 == 7) {
            this.field3655 = arg1.method500(116);
        } else if (arg2 == 8) {
            this.field3642 = arg1.method506(255);
        } else if (arg2 == 9) {
            this.field3656 = arg1.method506(255);
        } else if (arg2 == 10) {
            this.field3663 = arg1.method506(255);
        } else if (arg2 == 11) {
            this.field3646 = arg1.method506(255);
        } else if (arg2 == 12) {
            int var6 = arg1.method506(255);
            this.field3640 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3640[var7] = arg1.method500(122);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field3640[var8] += arg1.method500(66) << 16;
            }
            return;
        } else if (arg2 == 13) {
            int var9 = arg1.method506(255);
            this.field3649 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3649[var10] = arg1.method480(89);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILfj;)V")
    public final void method1324(int arg0, class66 arg1) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method506(255);
            if (var3 == 0) {
                field3657++;
                return;
            }
            this.method1323((byte) 21, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(IILlg;)Llg;")
    public final class127 method1325(int arg0, int arg1, class127 arg2) {
        field3644++;
        int var4 = this.field3658[arg0];
        class238 var5 = class15.method129(23, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method66(true);
        }
        class238 var7 = null;
        int var8 = arg1;
        if (this.field3640 != null && this.field3640.length > arg0) {
            int var9 = this.field3640[arg0];
            var7 = class15.method129(44, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class127 var11 = arg2.method66(!var5.method1546(var6, (byte) -127));
            var11.method48(var5, var6);
            return var11;
        } else {
            class127 var10 = arg2.method66(!var5.method1546(var6, (byte) -127) & !var7.method1546(var8, (byte) -127));
            var10.method48(var5, var6);
            var10.method48(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILlg;II)Llg;")
    public final class127 method1326(int arg0, class127 arg1, int arg2, int arg3) {
        if (arg2 != -21748) {
            return null;
        }
        int var5 = this.field3658[arg3];
        class238 var6 = class15.method129(73, var5 >> 16);
        field3653++;
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method66(true);
        }
        int var8 = arg0 & 0x3;
        class127 var9 = arg1.method66(!var6.method1546(var7, (byte) -127));
        if (var8 == 1) {
            var9.method45();
        } else if (var8 == 2) {
            var9.method44();
        } else if (var8 == 3) {
            var9.method64();
        }
        var9.method48(var6, var7);
        if (var8 == 1) {
            var9.method64();
        } else if (var8 == 2) {
            var9.method44();
        } else if (var8 == 3) {
            var9.method45();
        }
        return var9;
    }
}
