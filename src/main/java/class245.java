import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class245 extends class259 {

    @OriginalMember(owner = "client!ta", name = "kb", descriptor = "Z")
    public boolean field3816 = true;

    @OriginalMember(owner = "client!ta", name = "eb", descriptor = "I")
    public static int field3810 = 50;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "[I")
    public static int[] field3797 = new int[field3810];

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "[I")
    public static int[] field3799 = new int[field3810];

    @OriginalMember(owner = "client!ta", name = "db", descriptor = "[Ljava/lang/String;")
    public static String[] field3809 = new String[field3810];

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "[I")
    public static int[] field3793 = new int[field3810];

    @OriginalMember(owner = "client!ta", name = "cb", descriptor = "[I")
    public static int[] field3808 = new int[field3810];

    @OriginalMember(owner = "client!ta", name = "gb", descriptor = "[I")
    public static int[] field3812 = new int[field3810];

    @OriginalMember(owner = "client!ta", name = "bb", descriptor = "[I")
    public static int[] field3807 = new int[field3810];

    @OriginalMember(owner = "client!ta", name = "pb", descriptor = "[I")
    public static int[] field3821 = new int[field3810];

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ta", name = "Y", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ta", name = "Z", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ta", name = "ab", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ta", name = "fb", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!ta", name = "hb", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!ta", name = "ib", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!ta", name = "jb", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ta", name = "lb", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!ta", name = "mb", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!ta", name = "nb", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "Lua;")
    public static class244 field3794;

    @OriginalMember(owner = "client!ta", name = "ob", descriptor = "Ljk;")
    public static class297 field3820;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "[I")
    private int[] field3795;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "[I")
    public int[] field3803;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "[Ljava/lang/String;")
    private String[] field3800;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "[[I")
    private int[][] field3796;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lpk;ZLpk;B)V")
    public static final void method1667(class237 arg0, boolean arg1, class237 arg2, byte arg3) {
        field3801++;
        class10.field136 = arg2;
        class4.field55 = arg1;
        class169.field2495 = arg0;
        if (arg3 > -21) {
            method1671(39, 15, 95, -40);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLca;)Ln;")
    public static final class283 method1668(int arg0, boolean arg1, class54 arg2) {
        field3806++;
        class283 var3 = new class283(arg0, arg2.method439((byte) -72), arg2.method439((byte) -122), arg2.method420((byte) 52), arg2.method420((byte) 49), arg2.method407(255) == 1, arg2.method407(255));
        if (!arg1) {
            field3809 = null;
        }
        int var4 = arg2.method407(255);
        for (int var5 = 0; var5 < var4; var5++) {
            var3.field4349.method1881(new class150(arg2.method407(255), arg2.method407(255), arg2.method423(52), arg2.method423(-111), arg2.method423(-105), arg2.method423(70), arg2.method423(49), arg2.method423(58), arg2.method423(57), arg2.method423(-102)), (byte) -56);
        }
        var3.method1880((byte) 123);
        return var3;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILpk;I)[Lji;")
    public static final class256[] method1669(int arg0, int arg1, class237 arg2, int arg3) {
        field3813++;
        if (arg0 != 23971) {
            method1667((class237) null, false, (class237) null, (byte) -102);
        }
        return class223.method1526(arg3, arg1, (byte) 112, arg2) ? class89.method676(19748) : null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lca;B)V")
    public final void method1670(class54 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                int var4 = 92 % ((41 - arg1) / 58);
                field3811++;
                return;
            }
            this.method1677(arg0, var3, -1);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIII)V")
    public static final void method1671(int arg0, int arg1, int arg2, int arg3) {
        field3818++;
        String var4 = "::tele " + arg2 + "," + (arg3 >> 6) + "," + (arg1 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var4);
        if (arg0 > -68) {
            method1671(-75, 56, 103, -5);
        }
        class277.method1844((byte) -39, var4);
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public final void method1672(int arg0) {
        if (this.field3803 != null) {
            for (int var2 = 0; var2 < this.field3803.length; var2++) {
                this.field3803[var2] = class186.method1215(this.field3803[var2], 32768);
            }
        }
        field3819++;
        int var3 = 50 / ((73 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)Lqf;")
    public static final class293 method1673(int arg0) {
        field3805++;
        if (class101.field1471.length > class243.field3769) {
            return class101.field1471[class243.field3769++];
        } else {
            if (arg0 != 0) {
                method1680();
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lca;I)Ljava/lang/String;")
    public final String method1674(class54 arg0, int arg1) {
        field3802++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field3795 != null) {
            for (int var4 = 0; var4 < this.field3795.length; var4++) {
                var3.append(this.field3800[var4]);
                var3.append(class194.method1309(this.field3796[var4], arg0.method455(class269.field4207[this.field3795[var4]], 0), -1, this.field3795[var4]));
            }
        }
        var3.append(this.field3800[this.field3800.length - arg1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)I")
    public final int method1675(int arg0, int arg1, int arg2) {
        field3792++;
        if (this.field3795 == null || arg0 < 0 || this.field3795.length < arg0) {
            return -1;
        } else {
            int var4 = 6 % ((3 - arg2) / 59);
            return this.field3796[arg0] == null || arg1 < 0 || arg1 > this.field3796[arg0].length ? -1 : this.field3796[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)Ljava/lang/String;")
    public final String method1676(byte arg0) {
        field3817++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field3800 == null) {
            return "";
        }
        var2.append(this.field3800[0]);
        for (int var3 = 1; var3 < this.field3800.length; var3++) {
            var2.append("...");
            var2.append(this.field3800[var3]);
        }
        if (arg0 >= -57) {
            field3808 = null;
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lca;II)V")
    private final void method1677(class54 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field3798 = -3;
        }
        field3815++;
        if (arg1 == 1) {
            this.field3800 = class227.method1554('<', (byte) 119, arg0.method439((byte) 43));
        } else if (arg1 == 2) {
            int var4 = arg0.method407(255);
            this.field3803 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3803[var5] = arg0.method423(-121);
            }
        } else if (arg1 == 3) {
            int var6 = arg0.method407(255);
            this.field3796 = new int[var6][];
            this.field3795 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method423(arg2 ^ 0xFFFFFFD3);
                this.field3795[var7] = var8;
                this.field3796[var7] = new int[class25.field434[var8]];
                for (int var9 = 0; var9 < class25.field434[var8]; var9++) {
                    this.field3796[var7][var9] = arg0.method423(-113);
                }
            }
        } else if (arg1 == 4) {
            this.field3816 = false;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([ILca;I)V")
    public final void method1678(int[] arg0, class54 arg1, int arg2) {
        field3804++;
        if (this.field3795 == null) {
            return;
        }
        for (int var4 = arg2; var4 < this.field3795.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class114.field1739[this.method1682(arg2 ^ 0xFFFFFFA7, var4)];
            if (var5 > 0) {
                arg1.method404((byte) -58, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "(I)V")
    public static void method1679(int arg0) {
        if (arg0 >= -68) {
            method1668(-76, true, (class54) null);
        }
        field3797 = null;
        field3812 = null;
        field3793 = null;
        field3807 = null;
        field3799 = null;
        field3809 = null;
        field3820 = null;
        field3794 = null;
        field3808 = null;
        field3821 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()V")
    public static final void method1680() {
        for (int var0 = 0; var0 < class239.field3689; var0++) {
            class128 var1 = class236.field3633[var0];
            class114.method821(var1);
            class236.field3633[var0] = null;
        }
        class239.field3689 = 0;
    }

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "(I)I")
    public final int method1681(int arg0) {
        field3791++;
        if (this.field3795 == null) {
            return 0;
        } else if (arg0 == 0) {
            return this.field3795.length;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(II)I")
    public final int method1682(int arg0, int arg1) {
        field3814++;
        if (this.field3795 == null || arg1 < 0 || this.field3795.length < arg1) {
            return -1;
        } else {
            int var3 = -28 / ((3 - arg0) / 54);
            return this.field3795[arg1];
        }
    }
}
