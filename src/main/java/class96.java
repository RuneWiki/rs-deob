import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class96 {

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "[I")
    private int[] field1644 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Z")
    public boolean field1645 = false;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public int field1665 = -1;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Lve;")
    private static class255 field1639 = class87.method607(101, "wave:");

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Lve;")
    public static class255 field1652 = class87.method607(125, "details");

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lve;")
    public static class255 field1657 = field1639;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "Lve;")
    public static class255 field1666 = field1639;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field1661;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field1662;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field1663;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[I")
    public static int[] field1641;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
    private int[] field1653;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "[S")
    private short[] field1642;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[S")
    private short[] field1647;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[S")
    private short[] field1651;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[S")
    private short[] field1660;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "[[[B")
    public static byte[][][] field1664;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 5)
    public static void method749(int arg0) {
        field1657 = null;
        field1664 = (byte[][][]) null;
        if (arg0 != 0) {
            method756((byte) -99);
        }
        field1652 = null;
        field1641 = null;
        field1639 = null;
        field1666 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLpb;)V", line = 20)
    public final void method750(byte arg0, class70 arg1) {
        field1658++;
        int var3 = -99 % ((-arg0 - 63) / 62);
        while (true) {
            int var4 = arg1.method481(0);
            if (var4 == 0) {
                return;
            }
            this.method760(arg1, (byte) -73, var4);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I", line = 45)
    public static final int method751(int arg0, int arg1, int arg2) {
        if (arg1 > -11) {
            field1657 = (class255) null;
        }
        class262 var3 = (class262) class68.field1008.method280((long) arg2, 29153);
        field1643++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field4440.length; var5++) {
                if (var3.field4448[var5] == arg0) {
                    var4 += var3.field4440[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Llb;", line = 77)
    public final class200 method752(byte arg0) {
        field1663++;
        int var2 = 0;
        class200[] var3 = new class200[5];
        if (arg0 >= -15) {
            this.method757(22);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1644[var4] != -1) {
                var3[var2++] = class200.method1431(class23.field352, this.field1644[var4], 0);
            }
        }
        class200 var5 = new class200(var3, var2);
        if (this.field1660 != null) {
            for (int var6 = 0; var6 < this.field1660.length; var6++) {
                var5.method1438(this.field1660[var6], this.field1642[var6]);
            }
        }
        if (this.field1651 != null) {
            for (int var7 = 0; var7 < this.field1651.length; var7++) {
                var5.method1448(this.field1651[var7], this.field1647[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)I", line = 132)
    public static final int method753(byte arg0) {
        if (arg0 < 105) {
            return 113;
        } else {
            field1661++;
            return 6;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)V", line = 148)
    public static final void method754(int arg0, long arg1) {
        class255.field4318.field1068 = 0;
        class255.field4318.method463(false, 249);
        class255.field4318.method449(arg0 ^ 0xFF00C0A2, arg1);
        class88.field1433 = 1;
        class46.field693 = -3;
        class274.field4715 = 0;
        class172.field2852 = 0;
        if (arg0 != -16222) {
            method756((byte) 43);
        }
        field1648++;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIIIIII)V", line = 167)
    public static final void method755(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= -114) {
            field1639 = (class255) null;
        }
        field1646++;
        if (arg2 < 0 || arg1 < 0 || arg2 >= 103 || arg1 >= 103) {
            return;
        }
        if (arg5 == 0) {
            class216 var8 = class101.method786(arg7, arg2, arg1);
            if (var8 != null) {
                int var9 = (int) (var8.field3674 >>> 32) & Integer.MAX_VALUE;
                if (arg4 == 2) {
                    var8.field3663 = new class72(var9, 2, arg6 + 4, arg7, arg2, arg1, arg3, false, var8.field3663);
                    var8.field3668 = new class72(var9, 2, arg6 + 1 & 0x3, arg7, arg2, arg1, arg3, false, var8.field3668);
                } else {
                    var8.field3663 = new class72(var9, arg4, arg6, arg7, arg2, arg1, arg3, false, var8.field3663);
                }
            }
        }
        if (arg5 == 1) {
            class213 var10 = class81.method561(arg7, arg2, arg1);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field3625 >>> 32);
                if (arg4 == 4 || arg4 == 5) {
                    var10.field3634 = new class72(var11, 4, arg6, arg7, arg2, arg1, arg3, false, var10.field3634);
                } else if (arg4 == 6) {
                    var10.field3634 = new class72(var11, 4, arg6 + 4, arg7, arg2, arg1, arg3, false, var10.field3634);
                } else if (arg4 == 7) {
                    var10.field3634 = new class72(var11, 4, (arg6 + 2 & 0x3) + 4, arg7, arg2, arg1, arg3, false, var10.field3634);
                } else if (arg4 == 8) {
                    var10.field3634 = new class72(var11, 4, arg6 + 4, arg7, arg2, arg1, arg3, false, var10.field3634);
                    var10.field3637 = new class72(var11, 4, (arg6 + 2 & 0x3) + 4, arg7, arg2, arg1, arg3, false, var10.field3637);
                }
            }
        }
        if (arg5 == 2) {
            class250 var12 = class292.method2066(arg7, arg2, arg1);
            if (arg4 == 11) {
                arg4 = 10;
            }
            if (var12 != null) {
                var12.field4215 = new class72(Integer.MAX_VALUE & (int) (var12.field4206 >>> 32), arg4, arg6, arg7, arg2, arg1, arg3, false, var12.field4215);
            }
        }
        if (arg5 == 3) {
            class304 var13 = class55.method343(arg7, arg2, arg1);
            if (var13 != null) {
                var13.field5194 = new class72((int) (var13.field5200 >>> 32) & Integer.MAX_VALUE, 22, arg6, arg7, arg2, arg1, arg3, false, var13.field5194);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)[Lud;", line = 261)
    public static final class269[] method756(byte arg0) {
        field1640++;
        class269[] var1 = new class269[class109.field1850];
        if (arg0 > -44) {
            field1650 = -42;
        }
        for (int var2 = 0; var2 < class109.field1850; var2++) {
            int var3 = class187.field3027[var2] * class132.field2173[var2];
            byte[] var4 = class282.field4849[var2];
            if (class244.field4114[var2]) {
                byte[] var5 = class150.field2539[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class264.method1836(class18.field296[class154.method1134(var4[var7], 255)], class154.method1134(-16777216, var5[var7] << 24));
                }
                if (class281.field4827) {
                    var1[var2] = new class146(class153.field2608, class154.field2632, class131.field2167[var2], class298.field5098[var2], class132.field2173[var2], class187.field3027[var2], var6);
                } else {
                    var1[var2] = new class65(class153.field2608, class154.field2632, class131.field2167[var2], class298.field5098[var2], class132.field2173[var2], class187.field3027[var2], var6);
                }
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class18.field296[class154.method1134(255, var4[var9])];
                }
                if (class281.field4827) {
                    var1[var2] = new class98(class153.field2608, class154.field2632, class131.field2167[var2], class298.field5098[var2], class132.field2173[var2], class187.field3027[var2], var8);
                } else {
                    var1[var2] = new class83(class153.field2608, class154.field2632, class131.field2167[var2], class298.field5098[var2], class132.field2173[var2], class187.field3027[var2], var8);
                }
            }
        }
        class111.method850(-3);
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)Z", line = 325)
    public final boolean method757(int arg0) {
        field1662++;
        if (this.field1653 == null) {
            return true;
        }
        int var2 = 71 / ((arg0 + 52) / 54);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1653.length; var4++) {
            if (!class23.field352.method625(this.field1653[var4], 0, 0)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)V", line = 359)
    public static final void method758(int arg0, int arg1) {
        int var2 = -102 / ((-arg0 - 37) / 57);
        field1649++;
        class262 var3 = (class262) class68.field1008.method280((long) arg1, 29153);
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field4448.length; var4++) {
                var3.field4448[var4] = -1;
                var3.field4440[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Z", line = 384)
    public final boolean method759(int arg0) {
        field1655++;
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1644[var3] != -1 && !class23.field352.method625(this.field1644[var3], 0, 0)) {
                var2 = false;
            }
        }
        if (arg0 != -5) {
            this.field1644 = (int[]) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lpb;BI)V", line = 424)
    private final void method760(class70 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field1665 = arg0.method481(0);
        } else if (arg2 == 2) {
            int var8 = arg0.method481(0);
            this.field1653 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1653[var9] = arg0.method423(255);
            }
        } else if (arg2 == 3) {
            this.field1645 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method481(0);
            this.field1642 = new short[var4];
            this.field1660 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1660[var5] = (short) arg0.method423(255);
                this.field1642[var5] = (short) arg0.method423(255);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method481(0);
            this.field1647 = new short[var6];
            this.field1651 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1651[var7] = (short) arg0.method423(255);
                this.field1647[var7] = (short) arg0.method423(255);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1644[arg2 - 60] = arg0.method423(255);
        }
        if (arg1 < -17) {
            field1654++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Z", line = 512)
    public static final boolean method761(boolean arg0) {
        if (!arg0) {
            method763((byte) -42, -128, 8, (class88) null);
        }
        field1667++;
        return class281.field4827 ? true : class47.field723;
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Llb;", line = 536)
    public final class200 method762(int arg0) {
        field1659++;
        if (this.field1653 == null) {
            return null;
        }
        class200[] var2 = new class200[this.field1653.length];
        int var3 = 0;
        if (arg0 > 0) {
            return (class200) null;
        }
        while (this.field1653.length > var3) {
            var2[var3] = class200.method1431(class23.field352, this.field1653[var3], 0);
            var3++;
        }
        class200 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class200(var2, var2.length);
        }
        if (this.field1660 != null) {
            for (int var5 = 0; var5 < this.field1660.length; var5++) {
                var4.method1438(this.field1660[var5], this.field1642[var5]);
            }
        }
        if (this.field1651 != null) {
            for (int var6 = 0; var6 < this.field1651.length; var6++) {
                var4.method1448(this.field1651[var6], this.field1647[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIILrg;)Z", line = 593)
    public static final boolean method763(byte arg0, int arg1, int arg2, class88 arg3) {
        field1656++;
        byte[] var4 = arg3.method636(arg1, (byte) 109, arg2);
        if (arg0 < 27) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class124.method917(var4, false);
            return true;
        }
    }
}
