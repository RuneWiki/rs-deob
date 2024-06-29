import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class239 {

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Lpd;")
    private class3 field3971 = null;

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Z")
    private boolean field3973;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "Lof;")
    private class230 field3940;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "Z")
    private boolean field3969;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Lqd;")
    public static class40 field3930 = class147.method1106("::qa_op_test", (byte) -128);

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Lqd;")
    private static class40 field3947 = class147.method1106("Loading wordpack )2 ", (byte) -49);

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Lqd;")
    public static class40 field3933 = field3947;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field3959 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lqd;")
    public static class40 field3942 = class147.method1106("weiss:", (byte) -89);

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Lqd;")
    public static class40 field3963 = class147.method1106("; Max)2Age=", (byte) -79);

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "[Ljava/lang/Object;")
    private Object[] field3951;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3953;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Z", line = 7)
    private final boolean method1645(int arg0, int arg1) {
        field3952++;
        if (!this.method1652((byte) 103)) {
            return false;
        } else if (arg1 != 2) {
            return true;
        } else if (arg0 >= 0 && this.field3971.field25.length > arg0 && this.field3971.field25[arg0] != 0) {
            return true;
        } else if (class238.field3920) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLqd;)V", line = 30)
    public final void method1646(byte arg0, class40 arg1) {
        field3941++;
        if (!this.method1652((byte) 103)) {
            return;
        }
        if (arg0 <= 110) {
            this.method1676(63, 79);
        }
        class40 var3 = arg1.method337(40);
        int var4 = this.field3971.field47.method1256(26398, var3.method369(0));
        this.method1661(-59, var4);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lqd;Lqd;I)Z", line = 47)
    public final boolean method1647(class40 arg0, class40 arg1, int arg2) {
        field3934++;
        if (arg2 != 25716) {
            this.field3940 = (class230) null;
        }
        if (!this.method1652((byte) 103)) {
            return false;
        }
        class40 var4 = arg0.method337(40);
        class40 var5 = arg1.method337(40);
        int var6 = this.field3971.field47.method1256(26398, var4.method369(arg2 - 25716));
        if (this.method1645(var6, arg2 ^ 0x6476)) {
            int var7 = this.field3971.field41[var6].method1256(26398, var5.method369(0));
            return this.method1657(var6, 0, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Z", line = 74)
    public final boolean method1648(boolean arg0, int arg1) {
        field3935++;
        if (!this.method1645(arg1, 2)) {
            return false;
        } else if (arg0) {
            return false;
        } else if (this.field3951[arg1] == null) {
            this.method1653(-1, arg1);
            return this.field3951[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I", line = 97)
    public final int method1649(int arg0) {
        field3948++;
        if (!this.method1652((byte) 103)) {
            throw new IllegalStateException("");
        }
        int var2 = -71 / ((arg0 - 19) / 32);
        return this.field3971.field32;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIZ[I)[B", line = 112)
    public final byte[] method1650(int arg0, int arg1, boolean arg2, int[] arg3) {
        field3962++;
        if (!this.method1663(arg0, !arg2, arg1)) {
            return null;
        }
        if (this.field3953[arg0] == null || this.field3953[arg0][arg1] == null) {
            boolean var5 = this.method1659(arg0, 110, arg3);
            if (!var5) {
                this.method1653(-1, arg0);
                boolean var6 = this.method1659(arg0, 97, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class317.method2188(arg2, 1, this.field3953[arg0][arg1]);
        if (this.field3969) {
            this.field3953[arg0][arg1] = null;
            if (this.field3971.field25[arg0] == 1) {
                this.field3953[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)[B", line = 150)
    public final byte[] method1651(int arg0, int arg1, int arg2) {
        field3966++;
        if (arg2 != -1) {
            field3930 = (class40) null;
        }
        return this.method1650(arg0, arg1, false, (int[]) null);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Z", line = 167)
    private final boolean method1652(byte arg0) {
        field3956++;
        if (this.field3971 == null) {
            this.field3971 = this.field3940.method676(0);
            if (this.field3971 == null) {
                return false;
            }
            this.field3953 = new Object[this.field3971.field24][];
            this.field3951 = new Object[this.field3971.field24];
        }
        return arg0 == 103 ? true : true;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V", line = 189)
    private final void method1653(int arg0, int arg1) {
        if (this.field3973) {
            this.field3951[arg1] = this.field3940.method675(arg1, true);
        } else {
            this.field3951[arg1] = class204.method1434(this.field3940.method675(arg1, true), false, true);
        }
        if (arg0 != -1) {
            this.field3953 = (Object[][]) ((Object[][]) null);
        }
        field3939++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)I", line = 205)
    private final int method1654(int arg0, boolean arg1) {
        field3961++;
        if (!this.method1645(arg0, 2)) {
            return 0;
        } else if (this.field3951[arg0] == null) {
            if (!arg1) {
                this.method1676(-79, 71);
            }
            return this.field3940.method671(-109, arg0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BLqd;)Z", line = 235)
    public final boolean method1655(byte arg0, class40 arg1) {
        field3944++;
        if (!this.method1652((byte) 103)) {
            return false;
        }
        class40 var3 = arg1.method337(40);
        if (arg0 != 83) {
            field3947 = (class40) null;
        }
        int var4 = this.field3971.field47.method1256(26398, var3.method369(0));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIZ)V", line = 256)
    public static final void method1656(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class90.field1632 = arg1;
        class285.field4807 = arg2;
        class173.field2820 = arg3;
        class290.field4857 = new class14[arg0][class90.field1632][class285.field4807];
        class244.field4020 = new int[arg0][class90.field1632 + 1][class285.field4807 + 1];
        if (class21.field350) {
            class147.field2439 = new class47[4][];
        }
        if (arg4) {
            class27.field591 = new class14[1][class90.field1632][class285.field4807];
            class103.field1807 = new int[class90.field1632][class285.field4807];
            class160.field2687 = new int[1][class90.field1632 + 1][class285.field4807 + 1];
            if (class21.field350) {
                class158.field2645 = new class47[1][];
            }
        } else {
            class27.field591 = (class14[][][]) null;
            class103.field1807 = (int[][]) null;
            class160.field2687 = (int[][][]) null;
            class158.field2645 = (class47[][]) null;
        }
        class193.method1381(false);
        class39.field709 = new class236[500];
        class120.field2033 = 0;
        class163.field2710 = new class236[500];
        class125.field2168 = 0;
        class185.field2982 = new int[arg0][class90.field1632 + 1][class285.field4807 + 1];
        class243.field4010 = new class193[5000];
        class207.field3300 = 0;
        class195.field3137 = new class193[100];
        class30.field634 = new boolean[class173.field2820 + class173.field2820 + 1][class173.field2820 + class173.field2820 + 1];
        class271.field4502 = new boolean[class173.field2820 + class173.field2820 + 2][class173.field2820 + class173.field2820 + 2];
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(III)Z", line = 298)
    public final boolean method1657(int arg0, int arg1, int arg2) {
        field3932++;
        if (!this.method1663(arg0, true, arg2)) {
            return false;
        } else if (this.field3953[arg0] != null && this.field3953[arg0][arg2] != null) {
            return true;
        } else if (this.field3951[arg0] == null) {
            this.method1653(-1, arg0);
            if (arg1 != 0) {
                this.method1672((byte) 58, (class40) null);
            }
            return this.field3951[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIZ)V", line = 333)
    public final void method1658(boolean arg0, int arg1, boolean arg2) {
        field3936++;
        if (!this.method1652((byte) 103)) {
            return;
        }
        if (arg0) {
            this.field3971.field42 = (int[][]) null;
            this.field3971.field41 = null;
        }
        if (arg1 != 143) {
            method1679((byte) -128);
        }
        if (arg2) {
            this.field3971.field45 = null;
            this.field3971.field47 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II[I)Z", line = 364)
    private final boolean method1659(int arg0, int arg1, int[] arg2) {
        field3928++;
        if (!this.method1645(arg0, 2)) {
            return false;
        } else if (this.field3951[arg0] == null) {
            return false;
        } else {
            int var4 = this.field3971.field44[arg0];
            int[] var5 = this.field3971.field23[arg0];
            if (arg1 <= 18) {
                return true;
            }
            if (this.field3953[arg0] == null) {
                this.field3953[arg0] = new Object[this.field3971.field25[arg0]];
            }
            boolean var6 = true;
            Object[] var7 = this.field3953[arg0];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg2 != null && (arg2[0] != 0 || arg2[1] != 0 || arg2[2] != 0 || arg2[3] != 0)) {
                var10 = class317.method2188(true, 1, this.field3951[arg0]);
                class26 var11 = new class26(var10);
                var11.method223(arg2, (byte) 4, var11.field472.length, 5);
            } else {
                var10 = class317.method2188(false, 1, this.field3951[arg0]);
            }
            byte[] var12;
            try {
                var12 = method1671(0, var10);
            } catch (RuntimeException var31) {
                throw class168.method1254(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class31.method282(var10.length, var10, true) + "," + class31.method282(var10.length - 2, var10, true) + "," + this.field3971.field39[arg0] + "," + this.field3971.field32);
            }
            if (this.field3973) {
                this.field3951[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int[] var15 = new int[var4];
                int var32 = var14 - 1;
                int var16 = var12[var32] & 0xFF;
                class26 var17 = new class26(var12);
                int var18 = var32 - var4 * 4 * var16;
                var17.field478 = var18;
                for (int var19 = 0; var19 < var16; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 != null) {
                        }
                        var20 += var17.method203(-22066);
                        var15[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var15[var23]];
                    var15[var23] = 0;
                }
                int var24 = 0;
                var17.field478 = var18;
                for (int var25 = 0; var25 < var16; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method203(-22066);
                        class234.method1627(var12, var24, var22[var27], var15[var27], var26);
                        var15[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3969) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class204.method1434(var22[var28], false, true);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3969) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class204.method1434(var12, false, true);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I", line = 560)
    public final int method1660(int arg0) {
        if (arg0 != -22800) {
            field3930 = (class40) null;
        }
        field3950++;
        return this.method1652((byte) 103) ? this.field3971.field25.length : -1;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)V", line = 575)
    private final void method1661(int arg0, int arg1) {
        int var3 = -88 / ((52 - arg0) / 59);
        field3929++;
        this.field3940.method677(49, arg1);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(III)[B", line = 599)
    public final byte[] method1662(int arg0, int arg1, int arg2) {
        field3958++;
        if (!this.method1663(arg2, true, arg0)) {
            return null;
        }
        if (this.field3953[arg2] == null || this.field3953[arg2][arg0] == null) {
            boolean var4 = this.method1659(arg2, 31, (int[]) null);
            if (!var4) {
                this.method1653(-1, arg2);
                boolean var5 = this.method1659(arg2, 123, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        if (arg1 < 18) {
            this.method1645(12, -106);
        }
        return class317.method2188(false, 1, this.field3953[arg2][arg0]);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZI)Z", line = 632)
    private final boolean method1663(int arg0, boolean arg1, int arg2) {
        field3965++;
        if (!this.method1652((byte) 103)) {
            return false;
        } else if (arg0 >= 0 && arg2 >= 0 && arg0 < this.field3971.field25.length && arg2 < this.field3971.field25[arg0]) {
            if (!arg1) {
                this.field3969 = false;
            }
            return true;
        } else if (class238.field3920) {
            throw new IllegalArgumentException(arg0 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)I", line = 658)
    public final int method1664(int arg0, byte arg1) {
        field3974++;
        if (this.method1645(arg0, arg1 ^ 0x1C)) {
            if (arg1 != 30) {
                this.method1661(-31, 24);
            }
            return this.field3971.field25[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lqd;B)I", line = 680)
    public final int method1665(class40 arg0, byte arg1) {
        field3960++;
        if (!this.method1652((byte) 103)) {
            return -1;
        }
        class40 var3 = arg0.method337(40);
        int var4 = this.field3971.field47.method1256(26398, var3.method369(0));
        if (arg1 > -8) {
            method1667(-90, 62, 14, (class239) null);
        }
        return this.method1645(var4, 2) ? var4 : -1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)V", line = 703)
    public final void method1666(byte arg0, int arg1) {
        field3955++;
        if (!this.method1645(arg1, 2)) {
            return;
        }
        if (this.field3953 != null) {
            this.field3953[arg1] = null;
        }
        if (arg0 > 0) {
            this.field3951 = (Object[]) null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILce;)[Lcm;", line = 722)
    public static final class185[] method1667(int arg0, int arg1, int arg2, class239 arg3) {
        if (arg0 != 11) {
            field3942 = (class40) null;
        }
        field3957++;
        return class272.method1881(arg3, arg1, arg2, arg0 ^ 0x3AA) ? class157.method1210((byte) -77) : null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 755)
    public static void method1668(byte arg0) {
        field3930 = null;
        field3933 = null;
        if (arg0 >= -19) {
            method1681(-126, -30, -37, 77, -21, 86, 80, 71, 3, 106, true, -6);
        }
        field3963 = null;
        field3947 = null;
        field3942 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)V", line = 777)
    public static final void method1669(byte arg0, int arg1) {
        class92.field1675 = arg1;
        field3954++;
        class160.field2677 = -1;
        if (arg0 == 38) {
            class160.field2677 = -1;
            class309.method2113(arg0 ^ 0xFFFF847C);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)Z", line = 791)
    public final boolean method1670(boolean arg0) {
        field3946++;
        if (!this.method1652((byte) 103)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field3971.field36.length; var3++) {
            int var4 = this.field3971.field36[var3];
            if (this.field3951[var4] == null) {
                this.method1653(-1, var4);
                if (this.field3951[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0) {
            this.method1657(14, 115, -111);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I[B)[B", line = 832)
    public static final byte[] method1671(int arg0, byte[] arg1) {
        class26 var2 = new class26(arg1);
        field3926++;
        int var3 = var2.method226(255);
        int var4 = var2.method203(-22066);
        if (var4 < 0 || !(class213.field3567 == 0 || class213.field3567 >= var4)) {
            throw new RuntimeException();
        } else if (arg0 != 0) {
            return (byte[]) null;
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method207(var5, var4, 1367096328, 0);
            return var5;
        } else {
            int var6 = var2.method203(-22066);
            if (var6 < 0 || class213.field3567 != 0 && class213.field3567 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class224.method1571(var7, var6, arg1, var4, 9);
            } else {
                class63.field1191.method1778(var7, var2, arg0 ^ 0xFFFFDDB5);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(BLqd;)I", line = 888)
    public final int method1672(byte arg0, class40 arg1) {
        field3945++;
        if (!this.method1652((byte) 103)) {
            return 0;
        }
        class40 var3 = arg1.method337(40);
        if (arg0 != -22) {
            this.field3971 = (class3) null;
        }
        int var4 = this.field3971.field47.method1256(26398, var3.method369(0));
        return this.method1654(var4, true);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(BI)[I", line = 905)
    public final int[] method1673(byte arg0, int arg1) {
        field3964++;
        if (!this.method1645(arg1, 2)) {
            return null;
        }
        if (arg0 >= -124) {
            field3959 = 71;
        }
        int[] var3 = this.field3971.field23[arg1];
        if (var3 == null) {
            var3 = new int[this.field3971.field44[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(II)[B", line = 936)
    public final byte[] method1674(int arg0, int arg1) {
        field3970++;
        if (!this.method1652((byte) 103)) {
            return null;
        } else if (~this.field3971.field25.length == arg1) {
            return this.method1651(0, arg0, arg1 + 1);
        } else if (!this.method1645(arg0, 2)) {
            return null;
        } else if (this.field3971.field25[arg0] == 1) {
            return this.method1651(arg0, 0, -1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILnh;I)V", line = 966)
    public static final void method1675(int arg0, class109 arg1, int arg2) {
        Object[] var3 = arg1.field1908;
        field3967++;
        int var4 = (Integer) var3[0];
        class112 var5 = class302.method2064((byte) 58, var4);
        if (var5 == null) {
            return;
        }
        class41.field779 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        if (arg0 != -7182) {
            return;
        }
        int[] var9 = var5.field1952;
        int[] var10 = var5.field1940;
        byte var11 = -1;
        try {
            class194.field3123 = new class40[var5.field1943];
            class91.field1663 = new int[var5.field1944];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field1900;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field1904;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field1910 == null ? -1 : arg1.field1910.field3507;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field1918;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field1910 == null ? -1 : arg1.field1910.field3494;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field1902 == null ? -1 : arg1.field1902.field3507;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field1902 == null ? -1 : arg1.field1902.field3494;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field1901;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field1911;
                    }
                    class91.field1663[var13++] = var16;
                } else if (var3[var14] instanceof class40) {
                    class40 var15 = (class40) var3[var14];
                    if (var15.method345(class312.field5264, false)) {
                        var15 = arg1.field1915;
                    }
                    class194.field3123[var12++] = var15;
                }
            }
            int var17 = 0;
            label4025: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var486 = var9[var8];
                if (var486 < 100) {
                    if (var486 == 0) {
                        class291.field4872[var6++] = var10[var8];
                        continue;
                    }
                    if (var486 == 1) {
                        int var18 = var10[var8];
                        class291.field4872[var6++] = class192.field3098[var18];
                        continue;
                    }
                    if (var486 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class131.method970(class291.field4872[var6], var19, -37);
                        continue;
                    }
                    if (var486 == 3) {
                        class247.field4096[var7++] = var5.field1953[var8];
                        continue;
                    }
                    if (var486 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var486 == 7) {
                        var6 -= 2;
                        if (class291.field4872[var6 + 1] != class291.field4872[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var486 == 8) {
                        var6 -= 2;
                        if (class291.field4872[var6 + 1] == class291.field4872[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var486 == 9) {
                        var6 -= 2;
                        if (class291.field4872[var6 + 1] > class291.field4872[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var486 == 10) {
                        var6 -= 2;
                        if (class291.field4872[var6 + 1] < class291.field4872[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var486 == 21) {
                        if (class41.field779 == 0) {
                            return;
                        }
                        class171 var20 = class9.field146[--class41.field779];
                        var8 = var20.field2798;
                        var5 = var20.field2804;
                        var10 = var5.field1940;
                        class91.field1663 = var20.field2801;
                        var9 = var5.field1952;
                        class194.field3123 = var20.field2803;
                        continue;
                    }
                    if (var486 == 25) {
                        int var21 = var10[var8];
                        class291.field4872[var6++] = class153.method1193(var21, arg0 + 7055);
                        continue;
                    }
                    if (var486 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class148.method1112(class291.field4872[var6], (byte) -96, var22);
                        continue;
                    }
                    if (var486 == 31) {
                        var6 -= 2;
                        if (class291.field4872[var6 + 1] >= class291.field4872[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var486 == 32) {
                        var6 -= 2;
                        if (class291.field4872[var6 + 1] <= class291.field4872[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var486 == 33) {
                        class291.field4872[var6++] = class91.field1663[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var486 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class91.field1663[var10001] = class291.field4872[var6];
                        continue;
                    }
                    if (var486 == 35) {
                        class247.field4096[var7++] = class194.field3123[var10[var8]];
                        continue;
                    }
                    if (var486 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class194.field3123[var10001] = class247.field4096[var7];
                        continue;
                    }
                    if (var486 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class40 var24 = class298.method2035(var23, (byte) -28, var7, class247.field4096);
                        class247.field4096[var7++] = var24;
                        continue;
                    }
                    if (var486 == 38) {
                        var6--;
                        continue;
                    }
                    if (var486 == 39) {
                        var7--;
                        continue;
                    }
                    if (var486 == 40) {
                        int var25 = var10[var8];
                        class112 var26 = class302.method2064((byte) 79, var25);
                        int[] var27 = new int[var26.field1944];
                        class40[] var28 = new class40[var26.field1943];
                        for (int var29 = 0; var29 < var26.field1946; var29++) {
                            var27[var29] = class291.field4872[var6 + var29 - var26.field1946];
                        }
                        for (int var30 = 0; var30 < var26.field1939; var30++) {
                            var28[var30] = class247.field4096[var7 + var30 - var26.field1939];
                        }
                        var7 -= var26.field1939;
                        var6 -= var26.field1946;
                        class171 var31 = new class171();
                        var31.field2801 = class91.field1663;
                        var31.field2803 = class194.field3123;
                        var31.field2798 = var8;
                        var31.field2804 = var5;
                        if (class9.field146.length <= class41.field779) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        class9.field146[class41.field779++] = var31;
                        var5 = var26;
                        var9 = var26.field1952;
                        class91.field1663 = var27;
                        var10 = var26.field1940;
                        class194.field3123 = var28;
                        continue;
                    }
                    if (var486 == 42) {
                        class291.field4872[var6++] = class134.field2280[var10[var8]];
                        continue;
                    }
                    if (var486 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class134.field2280[var32] = class291.field4872[var6];
                        class149.method1120(var32, arg0 + 7295);
                        continue;
                    }
                    if (var486 == 44) {
                        int var33 = var10[var8] & 0xFFFF;
                        int var34 = var10[var8] >> 16;
                        var6--;
                        int var35 = class291.field4872[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class218.field3643[var34] = var35;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4025;
                                }
                                class11.field176[var34][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var486 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class291.field4872[var6];
                        if (var39 >= 0 && class218.field3643[var38] > var39) {
                            class291.field4872[var6++] = class11.field176[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var486 == 46) {
                        var6 -= 2;
                        int var40 = var10[var8];
                        int var41 = class291.field4872[var6];
                        if (var41 >= 0 && class218.field3643[var40] > var41) {
                            class11.field176[var40][var41] = class291.field4872[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var486 == 47) {
                        class40 var42 = class195.field3149[var10[var8]];
                        if (var42 == null) {
                            var42 = class120.field2029;
                        }
                        class247.field4096[var7++] = var42;
                        continue;
                    }
                    if (var486 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class195.field3149[var43] = class247.field4096[var7];
                        class58.method490(58, var43);
                        continue;
                    }
                    if (var486 == 51) {
                        class199 var44 = var5.field1951[var10[var8]];
                        var6--;
                        class270 var45 = (class270) var44.method1405((byte) 115, (long) class291.field4872[var6]);
                        if (var45 != null) {
                            var8 += var45.field4483;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var486 < 300) {
                    if (var486 == 100) {
                        var6 -= 3;
                        int var47 = class291.field4872[var6 + 1];
                        int var48 = class291.field4872[var6 + 2];
                        int var49 = class291.field4872[var6];
                        if (var47 != 0) {
                            class213 var50 = class314.method2172((byte) 100, var49);
                            if (var50.field3415 == null) {
                                var50.field3415 = new class213[var48 + 1];
                            }
                            if (var50.field3415.length <= var48) {
                                class213[] var51 = new class213[var48 + 1];
                                for (int var52 = 0; var52 < var50.field3415.length; var52++) {
                                    var51[var52] = var50.field3415[var52];
                                }
                                var50.field3415 = var51;
                            }
                            if (var48 > 0 && var50.field3415[var48 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class213 var53 = new class213();
                            var53.field3494 = var48;
                            var53.field3421 = var53.field3507 = var50.field3507;
                            var53.field3525 = var47;
                            var53.field3520 = true;
                            var50.field3415[var48] = var53;
                            if (var46) {
                                class315.field5324 = var53;
                            } else {
                                class148.field2489 = var53;
                            }
                            class25.method188(arg0 + 7182, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var486 == 101) {
                        class213 var54 = var46 ? class315.field5324 : class148.field2489;
                        if (var54.field3494 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class213 var55 = class314.method2172((byte) -124, var54.field3507);
                        var55.field3415[var54.field3494] = null;
                        class25.method188(arg0 + 7182, var55);
                        continue;
                    }
                    if (var486 == 102) {
                        var6--;
                        class213 var56 = class314.method2172((byte) -118, class291.field4872[var6]);
                        var56.field3415 = null;
                        class25.method188(0, var56);
                        continue;
                    }
                    if (var486 == 200) {
                        var6 -= 2;
                        int var57 = class291.field4872[var6];
                        int var58 = class291.field4872[var6 + 1];
                        class213 var59 = class211.method1483(var58, var57, arg0 ^ 0x5A3C);
                        if (var59 != null && var58 != -1) {
                            class291.field4872[var6++] = 1;
                            if (var46) {
                                class315.field5324 = var59;
                            } else {
                                class148.field2489 = var59;
                            }
                            continue;
                        }
                        class291.field4872[var6++] = 0;
                        continue;
                    }
                    if (var486 == 201) {
                        var6--;
                        int var60 = class291.field4872[var6];
                        class213 var61 = class314.method2172((byte) -116, var60);
                        if (var61 == null) {
                            class291.field4872[var6++] = 0;
                        } else {
                            class291.field4872[var6++] = 1;
                            if (var46) {
                                class315.field5324 = var61;
                            } else {
                                class148.field2489 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var486 < 500) {
                    if (var486 == 403) {
                        var6 -= 2;
                        int var62 = class291.field4872[var6];
                        int var63 = class291.field4872[var6 + 1];
                        if (var62 >= 7) {
                            var62 -= 7;
                        }
                        class255.field4233.field4294.method449(-103, var63, var62);
                        continue;
                    }
                    if (var486 == 404) {
                        var6 -= 2;
                        int var64 = class291.field4872[var6];
                        int var65 = class291.field4872[var6 + 1];
                        class255.field4233.field4294.method447(var64, var65, arg0 - 20867);
                        continue;
                    }
                    if (var486 == 410) {
                        var6--;
                        boolean var66 = class291.field4872[var6] != 0;
                        class255.field4233.field4294.method454(arg0 ^ 0x38FC, var66);
                        continue;
                    }
                } else if (var486 >= 1000 && var486 < 1100 || var486 >= 2000 && var486 < 2100) {
                    class213 var474;
                    if (var486 >= 2000) {
                        var6--;
                        var474 = class314.method2172((byte) 21, class291.field4872[var6]);
                        var486 -= 1000;
                    } else {
                        var474 = var46 ? class315.field5324 : class148.field2489;
                    }
                    if (var486 == 1000) {
                        var6 -= 4;
                        var474.field3474 = class291.field4872[var6];
                        var474.field3555 = class291.field4872[var6 + 1];
                        int var475 = class291.field4872[var6 + 3];
                        int var476 = class291.field4872[var6 + 2];
                        if (var475 < 0) {
                            var475 = 0;
                        } else if (var475 > 5) {
                            var475 = 5;
                        }
                        var474.field3539 = (byte) var475;
                        if (var476 < 0) {
                            var476 = 0;
                        } else if (var476 > 5) {
                            var476 = 5;
                        }
                        var474.field3580 = (byte) var476;
                        class25.method188(0, var474);
                        class288.method1994((byte) 123, var474);
                        if (var474.field3494 == -1) {
                            class279.method1950(1, var474.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1001) {
                        var6 -= 4;
                        var474.field3540 = class291.field4872[var6];
                        var474.field3439 = class291.field4872[var6 + 1];
                        var474.field3485 = 0;
                        var474.field3568 = 0;
                        int var477 = class291.field4872[var6 + 3];
                        int var478 = class291.field4872[var6 + 2];
                        if (var477 < 0) {
                            var477 = 0;
                        } else if (var477 > 4) {
                            var477 = 4;
                        }
                        var474.field3424 = (byte) var477;
                        if (var478 < 0) {
                            var478 = 0;
                        } else if (var478 > 4) {
                            var478 = 4;
                        }
                        var474.field3528 = (byte) var478;
                        class25.method188(0, var474);
                        class288.method1994((byte) 120, var474);
                        if (var474.field3525 == 0) {
                            class299.method2041(false, (byte) -117, var474);
                        }
                        continue;
                    }
                    if (var486 == 1003) {
                        var6--;
                        boolean var479 = class291.field4872[var6] == 1;
                        if (var479 != var474.field3441) {
                            var474.field3441 = var479;
                            class25.method188(0, var474);
                        }
                        if (var474.field3494 == -1) {
                            class80.method621(var474.field3507, arg0 ^ 0xFFFFF3F2);
                        }
                        continue;
                    }
                    if (var486 == 1004) {
                        var6 -= 2;
                        var474.field3484 = class291.field4872[var6];
                        var474.field3496 = class291.field4872[var6 + 1];
                        class25.method188(0, var474);
                        class288.method1994((byte) 121, var474);
                        if (var474.field3525 == 0) {
                            class299.method2041(false, (byte) -93, var474);
                        }
                        continue;
                    }
                } else if (var486 >= 1100 && var486 < 1200 || var486 >= 2100 && var486 < 2200) {
                    class213 var471;
                    if (var486 < 2000) {
                        var471 = var46 ? class315.field5324 : class148.field2489;
                    } else {
                        var6--;
                        var471 = class314.method2172((byte) 87, class291.field4872[var6]);
                        var486 -= 1000;
                    }
                    if (var486 == 1100) {
                        var6 -= 2;
                        var471.field3530 = class291.field4872[var6];
                        if (var471.field3530 > var471.field3571 - var471.field3502) {
                            var471.field3530 = var471.field3571 - var471.field3502;
                        }
                        if (var471.field3530 < 0) {
                            var471.field3530 = 0;
                        }
                        var471.field3583 = class291.field4872[var6 + 1];
                        if (var471.field3583 > (var471.field3437 - var471.field3565)) {
                            var471.field3583 = var471.field3437 - var471.field3565;
                        }
                        if (var471.field3583 < 0) {
                            var471.field3583 = 0;
                        }
                        class25.method188(0, var471);
                        if (var471.field3494 == -1) {
                            class195.method1387(12, var471.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1101) {
                        var6--;
                        var471.field3480 = class291.field4872[var6];
                        class25.method188(0, var471);
                        if (var471.field3494 == -1) {
                            class168.method1255((byte) -109, var471.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1102) {
                        var6--;
                        var471.field3411 = class291.field4872[var6] == 1;
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1103) {
                        var6--;
                        var471.field3544 = class291.field4872[var6];
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1104) {
                        var6--;
                        var471.field3579 = class291.field4872[var6];
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1105) {
                        var6--;
                        var471.field3503 = class291.field4872[var6];
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1106) {
                        var6--;
                        var471.field3430 = class291.field4872[var6];
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1107) {
                        var6--;
                        var471.field3478 = class291.field4872[var6] == 1;
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1108) {
                        var471.field3451 = 1;
                        var6--;
                        var471.field3526 = class291.field4872[var6];
                        class25.method188(0, var471);
                        if (var471.field3494 == -1) {
                            class225.method1576(arg0 + 7186, var471.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1109) {
                        var6 -= 6;
                        var471.field3493 = class291.field4872[var6];
                        var471.field3468 = class291.field4872[var6 + 1];
                        var471.field3551 = class291.field4872[var6 + 2];
                        var471.field3458 = class291.field4872[var6 + 3];
                        var471.field3536 = class291.field4872[var6 + 4];
                        var471.field3481 = class291.field4872[var6 + 5];
                        class25.method188(0, var471);
                        if (var471.field3494 == -1) {
                            class290.method1998((byte) 68, var471.field3507);
                            class181.method1321(true, var471.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1110) {
                        var6--;
                        int var472 = class291.field4872[var6];
                        if (var471.field3521 != var472) {
                            var471.field3443 = 0;
                            var471.field3521 = var472;
                            var471.field3514 = 0;
                            class25.method188(arg0 + 7182, var471);
                        }
                        if (var471.field3494 == -1) {
                            class28.method271(var471.field3507, -124);
                        }
                        continue;
                    }
                    if (var486 == 1111) {
                        var6--;
                        var471.field3509 = class291.field4872[var6] == 1;
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1112) {
                        var7--;
                        class40 var473 = class247.field4096[var7];
                        if (!var473.method345(var471.field3517, false)) {
                            var471.field3517 = var473;
                            class25.method188(0, var471);
                        }
                        if (var471.field3494 == -1) {
                            class37.method310(3, var471.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1113) {
                        var6--;
                        var471.field3575 = class291.field4872[var6];
                        class25.method188(arg0 + 7182, var471);
                        continue;
                    }
                    if (var486 == 1114) {
                        var6 -= 3;
                        var471.field3464 = class291.field4872[var6];
                        var471.field3452 = class291.field4872[var6 + 1];
                        var471.field3566 = class291.field4872[var6 + 2];
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1115) {
                        var6--;
                        var471.field3448 = class291.field4872[var6] == 1;
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1116) {
                        var6--;
                        var471.field3519 = class291.field4872[var6];
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1117) {
                        var6--;
                        var471.field3416 = class291.field4872[var6];
                        class25.method188(arg0 + 7182, var471);
                        continue;
                    }
                    if (var486 == 1118) {
                        var6--;
                        var471.field3560 = class291.field4872[var6] == 1;
                        class25.method188(arg0 + 7182, var471);
                        continue;
                    }
                    if (var486 == 1119) {
                        var6--;
                        var471.field3413 = class291.field4872[var6] == 1;
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1120) {
                        var6 -= 2;
                        var471.field3571 = class291.field4872[var6];
                        var471.field3437 = class291.field4872[var6 + 1];
                        class25.method188(0, var471);
                        if (var471.field3525 == 0) {
                            class299.method2041(false, (byte) -94, var471);
                        }
                        continue;
                    }
                    if (var486 == 1121) {
                        var6 -= 2;
                        var471.field3487 = (short) class291.field4872[var6];
                        var471.field3538 = (short) class291.field4872[var6 + 1];
                        class25.method188(0, var471);
                        continue;
                    }
                    if (var486 == 1122) {
                        var6--;
                        var471.field3562 = class291.field4872[var6] == 1;
                        class25.method188(0, var471);
                        continue;
                    }
                } else if (var486 >= 1200 && var486 < 1300 || var486 >= 2200 && var486 < 2300) {
                    class213 var67;
                    if (var486 >= 2000) {
                        var6--;
                        var67 = class314.method2172((byte) -120, class291.field4872[var6]);
                        var486 -= 1000;
                    } else {
                        var67 = var46 ? class315.field5324 : class148.field2489;
                    }
                    class25.method188(arg0 ^ 0xFFFFE3F2, var67);
                    if (var486 == 1200 || var486 == 1205) {
                        var6 -= 2;
                        int var68 = class291.field4872[var6];
                        int var69 = class291.field4872[var6 + 1];
                        if (var67.field3494 == -1) {
                            class110.method831(var67.field3507, (byte) -124);
                            class290.method1998((byte) 68, var67.field3507);
                            class181.method1321(true, var67.field3507);
                        }
                        if (var68 == -1) {
                            var67.field3526 = -1;
                            var67.field3438 = -1;
                            var67.field3451 = 1;
                        } else {
                            var67.field3418 = var69;
                            var67.field3438 = var68;
                            class277 var70 = class165.method1243(-120, var68);
                            var67.field3481 = var70.field4664;
                            if (var486 == 1205) {
                                var67.field3561 = false;
                            } else {
                                var67.field3561 = true;
                            }
                            var67.field3468 = var70.field4659;
                            var67.field3458 = var70.field4629;
                            var67.field3493 = var70.field4684;
                            var67.field3536 = var70.field4687;
                            if (var67.field3485 > 0) {
                                var67.field3481 = var67.field3481 * 32 / var67.field3485;
                            } else if (var67.field3540 > 0) {
                                var67.field3481 = var67.field3481 * 32 / var67.field3540;
                            }
                            var67.field3551 = var70.field4632;
                        }
                        continue;
                    }
                    if (var486 == 1201) {
                        var67.field3451 = 2;
                        var6--;
                        var67.field3526 = class291.field4872[var6];
                        if (var67.field3494 == -1) {
                            class225.method1576(4, var67.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1202) {
                        var67.field3451 = 3;
                        var67.field3526 = class255.field4233.field4294.method448((byte) 123);
                        if (var67.field3494 == -1) {
                            class225.method1576(4, var67.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1203) {
                        var67.field3451 = 6;
                        var6--;
                        var67.field3526 = class291.field4872[var6];
                        if (var67.field3494 == -1) {
                            class225.method1576(4, var67.field3507);
                        }
                        continue;
                    }
                    if (var486 == 1204) {
                        var67.field3451 = 5;
                        var6--;
                        var67.field3526 = class291.field4872[var6];
                        if (var67.field3494 == -1) {
                            class225.method1576(arg0 ^ 0xFFFFE3F6, var67.field3507);
                        }
                        continue;
                    }
                } else if ((var486 < 1300 || var486 >= 1400) && (var486 < 2300 || var486 >= 2400)) {
                    if (var486 >= 1400 && var486 < 1500 || var486 >= 2400 && var486 < 2500) {
                        class213 var71;
                        if (var486 < 2000) {
                            var71 = var46 ? class315.field5324 : class148.field2489;
                        } else {
                            var6--;
                            var71 = class314.method2172((byte) -122, class291.field4872[var6]);
                            var486 -= 1000;
                        }
                        var7--;
                        class40 var72 = class247.field4096[var7];
                        int[] var73 = null;
                        if (var72.method350(true) > 0 && var72.method366(-1, var72.method350(true) - 1) == 89) {
                            var6--;
                            int var74 = class291.field4872[var6];
                            if (var74 > 0) {
                                var73 = new int[var74];
                                while (var74-- > 0) {
                                    var6--;
                                    var73[var74] = class291.field4872[var6];
                                }
                            }
                            var72 = var72.method333(0, 104, var72.method350(true) - 1);
                        }
                        Object[] var75 = new Object[var72.method350(true) + 1];
                        for (int var76 = var75.length - 1; var76 >= 1; var76--) {
                            if (var72.method366(-1, var76 - 1) == 115) {
                                var7--;
                                var75[var76] = class247.field4096[var7];
                            } else {
                                var6--;
                                var75[var76] = Integer.valueOf(class291.field4872[var6]);
                            }
                        }
                        var6--;
                        int var77 = class291.field4872[var6];
                        if (var77 == -1) {
                            var75 = null;
                        } else {
                            var75[0] = Integer.valueOf(var77);
                        }
                        var71.field3523 = true;
                        if (var486 == 1400) {
                            var71.field3550 = var75;
                        } else if (var486 == 1401) {
                            var71.field3460 = var75;
                        } else if (var486 == 1402) {
                            var71.field3513 = var75;
                        } else if (var486 == 1403) {
                            var71.field3426 = var75;
                        } else if (var486 == 1404) {
                            var71.field3501 = var75;
                        } else if (var486 == 1405) {
                            var71.field3552 = var75;
                        } else if (var486 == 1406) {
                            var71.field3537 = var75;
                        } else if (var486 == 1407) {
                            var71.field3574 = var75;
                            var71.field3515 = var73;
                        } else if (var486 == 1408) {
                            var71.field3433 = var75;
                        } else if (var486 == 1409) {
                            var71.field3542 = var75;
                        } else if (var486 == 1410) {
                            var71.field3500 = var75;
                        } else if (var486 == 1411) {
                            var71.field3435 = var75;
                        } else if (var486 == 1412) {
                            var71.field3490 = var75;
                        } else if (var486 == 1414) {
                            var71.field3511 = var73;
                            var71.field3548 = var75;
                        } else if (var486 == 1415) {
                            var71.field3459 = var73;
                            var71.field3581 = var75;
                        } else if (var486 == 1416) {
                            var71.field3524 = var75;
                        } else if (var486 == 1417) {
                            var71.field3527 = var75;
                        } else if (var486 == 1418) {
                            var71.field3429 = var75;
                        } else if (var486 == 1419) {
                            var71.field3506 = var75;
                        } else if (var486 == 1420) {
                            var71.field3412 = var75;
                        } else if (var486 == 1421) {
                            var71.field3461 = var75;
                        } else if (var486 == 1422) {
                            var71.field3434 = var75;
                        } else if (var486 == 1423) {
                            var71.field3479 = var75;
                        } else if (var486 == 1424) {
                            var71.field3436 = var75;
                        } else if (var486 == 1425) {
                            var71.field3491 = var75;
                        } else if (var486 == 1426) {
                            var71.field3445 = var75;
                        } else if (var486 == 1427) {
                            var71.field3504 = var75;
                        } else if (var486 == 1428) {
                            var71.field3495 = var75;
                            var71.field3477 = var73;
                        } else if (var486 == 1429) {
                            var71.field3454 = var75;
                            var71.field3475 = var73;
                        }
                        continue;
                    }
                    if (var486 < 1600) {
                        class213 var78 = var46 ? class315.field5324 : class148.field2489;
                        if (var486 == 1500) {
                            class291.field4872[var6++] = var78.field3442;
                            continue;
                        }
                        if (var486 == 1501) {
                            class291.field4872[var6++] = var78.field3554;
                            continue;
                        }
                        if (var486 == 1502) {
                            class291.field4872[var6++] = var78.field3502;
                            continue;
                        }
                        if (var486 == 1503) {
                            class291.field4872[var6++] = var78.field3565;
                            continue;
                        }
                        if (var486 == 1504) {
                            class291.field4872[var6++] = var78.field3441 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 1505) {
                            class291.field4872[var6++] = var78.field3421;
                            continue;
                        }
                    } else if (var486 < 1700) {
                        class213 var466 = var46 ? class315.field5324 : class148.field2489;
                        if (var486 == 1600) {
                            class291.field4872[var6++] = var466.field3530;
                            continue;
                        }
                        if (var486 == 1601) {
                            class291.field4872[var6++] = var466.field3583;
                            continue;
                        }
                        if (var486 == 1602) {
                            class247.field4096[var7++] = var466.field3517;
                            continue;
                        }
                        if (var486 == 1603) {
                            class291.field4872[var6++] = var466.field3571;
                            continue;
                        }
                        if (var486 == 1604) {
                            class291.field4872[var6++] = var466.field3437;
                            continue;
                        }
                        if (var486 == 1605) {
                            class291.field4872[var6++] = var466.field3481;
                            continue;
                        }
                        if (var486 == 1606) {
                            class291.field4872[var6++] = var466.field3551;
                            continue;
                        }
                        if (var486 == 1607) {
                            class291.field4872[var6++] = var466.field3536;
                            continue;
                        }
                        if (var486 == 1608) {
                            class291.field4872[var6++] = var466.field3458;
                            continue;
                        }
                        if (var486 == 1609) {
                            class291.field4872[var6++] = var466.field3544;
                            continue;
                        }
                    } else if (var486 < 1800) {
                        class213 var465 = var46 ? class315.field5324 : class148.field2489;
                        if (var486 == 1700) {
                            class291.field4872[var6++] = var465.field3438;
                            continue;
                        }
                        if (var486 == 1701) {
                            if (var465.field3438 == -1) {
                                class291.field4872[var6++] = 0;
                            } else {
                                class291.field4872[var6++] = var465.field3418;
                            }
                            continue;
                        }
                        if (var486 == 1702) {
                            class291.field4872[var6++] = var465.field3494;
                            continue;
                        }
                    } else if (var486 < 1900) {
                        class213 var79 = var46 ? class315.field5324 : class148.field2489;
                        if (var486 == 1800) {
                            class291.field4872[var6++] = class22.method168(client.method1720(var79), -1556662293);
                            continue;
                        }
                        if (var486 == 1801) {
                            var6--;
                            int var80 = class291.field4872[var6];
                            int var487 = var80 - 1;
                            if (var79.field3432 != null && var487 < var79.field3432.length && var79.field3432[var487] != null) {
                                class247.field4096[var7++] = var79.field3432[var487];
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 1802) {
                            if (var79.field3535 == null) {
                                class247.field4096[var7++] = class228.field3764;
                            } else {
                                class247.field4096[var7++] = var79.field3535;
                            }
                            continue;
                        }
                    } else if (var486 < 2600) {
                        var6--;
                        class213 var81 = class314.method2172((byte) 118, class291.field4872[var6]);
                        if (var486 == 2500) {
                            class291.field4872[var6++] = var81.field3442;
                            continue;
                        }
                        if (var486 == 2501) {
                            class291.field4872[var6++] = var81.field3554;
                            continue;
                        }
                        if (var486 == 2502) {
                            class291.field4872[var6++] = var81.field3502;
                            continue;
                        }
                        if (var486 == 2503) {
                            class291.field4872[var6++] = var81.field3565;
                            continue;
                        }
                        if (var486 == 2504) {
                            class291.field4872[var6++] = var81.field3441 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 2505) {
                            class291.field4872[var6++] = var81.field3421;
                            continue;
                        }
                    } else if (var486 < 2700) {
                        var6--;
                        class213 var82 = class314.method2172((byte) -119, class291.field4872[var6]);
                        if (var486 == 2600) {
                            class291.field4872[var6++] = var82.field3530;
                            continue;
                        }
                        if (var486 == 2601) {
                            class291.field4872[var6++] = var82.field3583;
                            continue;
                        }
                        if (var486 == 2602) {
                            class247.field4096[var7++] = var82.field3517;
                            continue;
                        }
                        if (var486 == 2603) {
                            class291.field4872[var6++] = var82.field3571;
                            continue;
                        }
                        if (var486 == 2604) {
                            class291.field4872[var6++] = var82.field3437;
                            continue;
                        }
                        if (var486 == 2605) {
                            class291.field4872[var6++] = var82.field3481;
                            continue;
                        }
                        if (var486 == 2606) {
                            class291.field4872[var6++] = var82.field3551;
                            continue;
                        }
                        if (var486 == 2607) {
                            class291.field4872[var6++] = var82.field3536;
                            continue;
                        }
                        if (var486 == 2608) {
                            class291.field4872[var6++] = var82.field3458;
                            continue;
                        }
                        if (var486 == 2609) {
                            class291.field4872[var6++] = var82.field3544;
                            continue;
                        }
                    } else if (var486 < 2800) {
                        if (var486 == 2700) {
                            var6--;
                            class213 var83 = class314.method2172((byte) -128, class291.field4872[var6]);
                            class291.field4872[var6++] = var83.field3438;
                            continue;
                        }
                        if (var486 == 2701) {
                            var6--;
                            class213 var84 = class314.method2172((byte) 69, class291.field4872[var6]);
                            if (var84.field3438 == -1) {
                                class291.field4872[var6++] = 0;
                            } else {
                                class291.field4872[var6++] = var84.field3418;
                            }
                            continue;
                        }
                        if (var486 == 2702) {
                            var6--;
                            int var85 = class291.field4872[var6];
                            class297 var86 = (class297) class165.field2731.method1405((byte) 115, (long) var85);
                            if (var86 == null) {
                                class291.field4872[var6++] = 0;
                            } else {
                                class291.field4872[var6++] = 1;
                            }
                            continue;
                        }
                        if (var486 == 2703) {
                            var6--;
                            class213 var87 = class314.method2172((byte) -115, class291.field4872[var6]);
                            if (var87.field3415 == null) {
                                class291.field4872[var6++] = 0;
                                continue;
                            }
                            int var88 = var87.field3415.length;
                            for (int var89 = 0; var89 < var87.field3415.length; var89++) {
                                if (var87.field3415[var89] == null) {
                                    var88 = var89;
                                    break;
                                }
                            }
                            class291.field4872[var6++] = var88;
                            continue;
                        }
                        if (var486 == 2704 || var486 == 2705) {
                            var6 -= 2;
                            int var90 = class291.field4872[var6];
                            int var91 = class291.field4872[var6 + 1];
                            class297 var92 = (class297) class165.field2731.method1405((byte) 115, (long) var90);
                            if (var92 != null && var92.field4959 == var91) {
                                class291.field4872[var6++] = 1;
                            } else {
                                class291.field4872[var6++] = 0;
                            }
                            continue;
                        }
                    } else if (var486 < 2900) {
                        var6--;
                        class213 var93 = class314.method2172((byte) -123, class291.field4872[var6]);
                        if (var486 == 2800) {
                            class291.field4872[var6++] = class22.method168(client.method1720(var93), -1556662293);
                            continue;
                        }
                        if (var486 == 2801) {
                            var6--;
                            int var94 = class291.field4872[var6];
                            int var488 = var94 - 1;
                            if (var93.field3432 != null && var488 < var93.field3432.length && var93.field3432[var488] != null) {
                                class247.field4096[var7++] = var93.field3432[var488];
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 2802) {
                            if (var93.field3535 == null) {
                                class247.field4096[var7++] = class228.field3764;
                            } else {
                                class247.field4096[var7++] = var93.field3535;
                            }
                            continue;
                        }
                    } else if (var486 < 3200) {
                        if (var486 == 3100) {
                            var7--;
                            class40 var450 = class247.field4096[var7];
                            class303.method2071(class228.field3764, 26, 0, var450);
                            continue;
                        }
                        if (var486 == 3101) {
                            var6 -= 2;
                            class164.method1242(class255.field4233, class291.field4872[var6], 1103216, class291.field4872[var6 + 1]);
                            continue;
                        }
                        if (var486 == 3103) {
                            class43.method395(true);
                            continue;
                        }
                        if (var486 == 3104) {
                            class27.field582++;
                            int var451 = 0;
                            var7--;
                            class40 var452 = class247.field4096[var7];
                            if (var452.method348(-98)) {
                                var451 = var452.method349(-34);
                            }
                            class19.field295.method1464(178, 0);
                            class19.field295.method239((byte) 97, var451);
                            continue;
                        }
                        if (var486 == 3105) {
                            class26.field489++;
                            var7--;
                            class40 var453 = class247.field4096[var7];
                            class19.field295.method1464(129, 0);
                            class19.field295.method241(var453.method362(-25194), 102);
                            continue;
                        }
                        if (var486 == 3106) {
                            class299.field5002++;
                            var7--;
                            class40 var454 = class247.field4096[var7];
                            class19.field295.method1464(10, arg0 ^ 0xFFFFE3F2);
                            class19.field295.method218(var454.method350(true) + 1, arg0 ^ 0x51C4);
                            class19.field295.method206(var454, (byte) -128);
                            continue;
                        }
                        if (var486 == 3107) {
                            var6--;
                            int var455 = class291.field4872[var6];
                            var7--;
                            class40 var456 = class247.field4096[var7];
                            class56.method474(arg0 + 7188, var456, var455);
                            continue;
                        }
                        if (var486 == 3108) {
                            var6 -= 3;
                            int var457 = class291.field4872[var6];
                            int var458 = class291.field4872[var6 + 2];
                            int var459 = class291.field4872[var6 + 1];
                            class213 var460 = class314.method2172((byte) -116, var458);
                            class78.method584(var460, (byte) 110, var457, var459);
                            continue;
                        }
                        if (var486 == 3109) {
                            var6 -= 2;
                            int var461 = class291.field4872[var6];
                            int var462 = class291.field4872[var6 + 1];
                            class213 var463 = var46 ? class315.field5324 : class148.field2489;
                            class78.method584(var463, (byte) 96, var461, var462);
                            continue;
                        }
                        if (var486 == 3110) {
                            class313.field5279++;
                            var6--;
                            int var464 = class291.field4872[var6];
                            class19.field295.method1464(143, arg0 + 7182);
                            class19.field295.method209(16711680, var464);
                            continue;
                        }
                    } else if (var486 < 3300) {
                        if (var486 == 3200) {
                            var6 -= 3;
                            class128.method956(class291.field4872[var6 + 1], (byte) 76, class291.field4872[var6 + 2], class291.field4872[var6]);
                            continue;
                        }
                        if (var486 == 3201) {
                            var6--;
                            class164.method1240(class291.field4872[var6], true);
                            continue;
                        }
                        if (var486 == 3202) {
                            var6 -= 2;
                            class242.method1705(class291.field4872[var6], class291.field4872[var6 + 1], arg0 ^ 0x1C0D);
                            continue;
                        }
                    } else if (var486 < 3400) {
                        if (var486 == 3300) {
                            class291.field4872[var6++] = class256.field4266;
                            continue;
                        }
                        if (var486 == 3301) {
                            var6 -= 2;
                            int var423 = class291.field4872[var6 + 1];
                            int var424 = class291.field4872[var6];
                            class291.field4872[var6++] = class118.method888(-73, var424, var423);
                            continue;
                        }
                        if (var486 == 3302) {
                            var6 -= 2;
                            int var425 = class291.field4872[var6];
                            int var426 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class91.method699(var425, (byte) 123, var426);
                            continue;
                        }
                        if (var486 == 3303) {
                            var6 -= 2;
                            int var427 = class291.field4872[var6];
                            int var428 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class140.method1035(var428, class88.method686(arg0, 7277), var427);
                            continue;
                        }
                        if (var486 == 3304) {
                            var6--;
                            int var429 = class291.field4872[var6];
                            class291.field4872[var6++] = class276.method1917(var429, (byte) 100).field1076;
                            continue;
                        }
                        if (var486 == 3305) {
                            var6--;
                            int var430 = class291.field4872[var6];
                            class291.field4872[var6++] = class280.field4733[var430];
                            continue;
                        }
                        if (var486 == 3306) {
                            var6--;
                            int var431 = class291.field4872[var6];
                            class291.field4872[var6++] = class308.field5170[var431];
                            continue;
                        }
                        if (var486 == 3307) {
                            var6--;
                            int var432 = class291.field4872[var6];
                            class291.field4872[var6++] = class150.field2519[var432];
                            continue;
                        }
                        if (var486 == 3308) {
                            int var433 = class160.field2671;
                            int var434 = (class255.field4233.field1497 >> 7) + class263.field4407;
                            int var435 = (class255.field4233.field1531 >> 7) + class196.field3152;
                            class291.field4872[var6++] = (var435 << 14) + ((var433 << 28) + var434);
                            continue;
                        }
                        if (var486 == 3309) {
                            var6--;
                            int var436 = class291.field4872[var6];
                            class291.field4872[var6++] = class276.method1923(268424888, var436) >> 14;
                            continue;
                        }
                        if (var486 == 3310) {
                            var6--;
                            int var437 = class291.field4872[var6];
                            class291.field4872[var6++] = var437 >> 28;
                            continue;
                        }
                        if (var486 == 3311) {
                            var6--;
                            int var438 = class291.field4872[var6];
                            class291.field4872[var6++] = class276.method1923(var438, 16383);
                            continue;
                        }
                        if (var486 == 3312) {
                            class291.field4872[var6++] = class308.field5164 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3313) {
                            var6 -= 2;
                            int var439 = class291.field4872[var6 + 1];
                            int var440 = class291.field4872[var6] + 32768;
                            class291.field4872[var6++] = class118.method888(-72, var440, var439);
                            continue;
                        }
                        if (var486 == 3314) {
                            var6 -= 2;
                            int var441 = class291.field4872[var6 + 1];
                            int var442 = class291.field4872[var6] + 32768;
                            class291.field4872[var6++] = class91.method699(var442, (byte) 123, var441);
                            continue;
                        }
                        if (var486 == 3315) {
                            var6 -= 2;
                            int var443 = class291.field4872[var6] + 32768;
                            int var444 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class140.method1035(var444, -48, var443);
                            continue;
                        }
                        if (var486 == 3316) {
                            if (class162.field2689 >= 2) {
                                class291.field4872[var6++] = class162.field2689;
                            } else {
                                class291.field4872[var6++] = 0;
                            }
                            continue;
                        }
                        if (var486 == 3317) {
                            class291.field4872[var6++] = class166.field2753;
                            continue;
                        }
                        if (var486 == 3318) {
                            class291.field4872[var6++] = class81.field1426;
                            continue;
                        }
                        if (var486 == 3321) {
                            class291.field4872[var6++] = class205.field3274;
                            continue;
                        }
                        if (var486 == 3322) {
                            class291.field4872[var6++] = class254.field4206;
                            continue;
                        }
                        if (var486 == 3323) {
                            if (class271.field4490 >= 5 && class271.field4490 <= 9) {
                                class291.field4872[var6++] = 1;
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3324) {
                            if (class271.field4490 >= 5 && class271.field4490 <= 9) {
                                class291.field4872[var6++] = class271.field4490;
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3325) {
                            class291.field4872[var6++] = class267.field4457 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3326) {
                            class291.field4872[var6++] = class255.field4233.field4320;
                            continue;
                        }
                        if (var486 == 3327) {
                            class291.field4872[var6++] = class255.field4233.field4294.field1016 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3328) {
                            class291.field4872[var6++] = class208.field3333 && !class11.field180 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3329) {
                            class291.field4872[var6++] = class300.field5038 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3330) {
                            var6--;
                            int var445 = class291.field4872[var6];
                            class291.field4872[var6++] = class178.method1316(var445, (byte) -122);
                            continue;
                        }
                        if (var486 == 3331) {
                            var6 -= 2;
                            int var446 = class291.field4872[var6];
                            int var447 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class30.method279(var447, false, var446, (byte) -123);
                            continue;
                        }
                        if (var486 == 3332) {
                            var6 -= 2;
                            int var448 = class291.field4872[var6];
                            int var449 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class30.method279(var449, true, var448, (byte) -123);
                            continue;
                        }
                        if (var486 == 3333) {
                            class291.field4872[var6++] = class233.field3832;
                            continue;
                        }
                        if (var486 == 3335) {
                            class291.field4872[var6++] = class248.field4106;
                            continue;
                        }
                    } else if (var486 < 3500) {
                        if (var486 == 3400) {
                            var6 -= 2;
                            int var406 = class291.field4872[var6];
                            int var407 = class291.field4872[var6 + 1];
                            class247 var408 = class204.method1436(var406, (byte) -128);
                            if (var408.field4095 != 115) {
                            }
                            class247.field4096[var7++] = var408.method1750(var407, 1);
                            continue;
                        }
                        if (var486 == 3408) {
                            var6 -= 4;
                            int var409 = class291.field4872[var6 + 1];
                            int var410 = class291.field4872[var6];
                            int var411 = class291.field4872[var6 + 2];
                            int var412 = class291.field4872[var6 + 3];
                            class247 var413 = class204.method1436(var411, (byte) -40);
                            if (var413.field4089 == var410 && var413.field4095 == var409) {
                                if (var409 == 115) {
                                    class247.field4096[var7++] = var413.method1750(var412, 1);
                                } else {
                                    class291.field4872[var6++] = var413.method1744(var412, false);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var486 == 3409) {
                            var6 -= 3;
                            int var414 = class291.field4872[var6 + 2];
                            int var415 = class291.field4872[var6 + 1];
                            int var416 = class291.field4872[var6];
                            if (var415 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class247 var417 = class204.method1436(var415, (byte) -77);
                            if (var417.field4095 != var416) {
                                throw new RuntimeException("C3409-1");
                            }
                            class291.field4872[var6++] = var417.method1742(-2, var414) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3410) {
                            var6--;
                            int var418 = class291.field4872[var6];
                            var7--;
                            class40 var419 = class247.field4096[var7];
                            if (var418 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class247 var420 = class204.method1436(var418, (byte) -74);
                            if (var420.field4095 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class291.field4872[var6++] = var420.method1748(0, var419) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3411) {
                            var6--;
                            int var421 = class291.field4872[var6];
                            class247 var422 = class204.method1436(var421, (byte) -63);
                            class291.field4872[var6++] = var422.field4090.method1397((byte) 86);
                            continue;
                        }
                    } else if (var486 < 3700) {
                        if (var486 == 3600) {
                            if (class160.field2684 == 0) {
                                class291.field4872[var6++] = -2;
                            } else if (class160.field2684 == 1) {
                                class291.field4872[var6++] = -1;
                            } else {
                                class291.field4872[var6++] = class233.field3844;
                            }
                            continue;
                        }
                        if (var486 == 3601) {
                            var6--;
                            int var384 = class291.field4872[var6];
                            if (class160.field2684 == 2 && var384 < class233.field3844) {
                                class247.field4096[var7++] = class15.field242[var384];
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 3602) {
                            var6--;
                            int var385 = class291.field4872[var6];
                            if (class160.field2684 == 2 && class233.field3844 > var385) {
                                class291.field4872[var6++] = class72.field1277[var385];
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3603) {
                            var6--;
                            int var386 = class291.field4872[var6];
                            if (class160.field2684 == 2 && var386 < class233.field3844) {
                                class291.field4872[var6++] = class268.field4466[var386];
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3604) {
                            var6--;
                            int var387 = class291.field4872[var6];
                            var7--;
                            class40 var388 = class247.field4096[var7];
                            class92.method703(var388, var387, false);
                            continue;
                        }
                        if (var486 == 3605) {
                            var7--;
                            class40 var389 = class247.field4096[var7];
                            class227.method1593(true, var389.method362(arg0 ^ 0x7E64));
                            continue;
                        }
                        if (var486 == 3606) {
                            var7--;
                            class40 var390 = class247.field4096[var7];
                            class135.method1003(arg0 + 7094, var390.method362(-25194));
                            continue;
                        }
                        if (var486 == 3607) {
                            var7--;
                            class40 var391 = class247.field4096[var7];
                            class159.method1226(var391.method362(arg0 - 18012), 0);
                            continue;
                        }
                        if (var486 == 3608) {
                            var7--;
                            class40 var392 = class247.field4096[var7];
                            class314.method2169(arg0 ^ 0xFFFFE3F3, var392.method362(-25194));
                            continue;
                        }
                        if (var486 == 3609) {
                            var7--;
                            class40 var393 = class247.field4096[var7];
                            if (var393.method365(class157.field2627, 0) || var393.method365(class205.field3272, 0)) {
                                var393 = var393.method371(7, false);
                            }
                            class291.field4872[var6++] = class208.method1475(true, var393) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3610) {
                            var6--;
                            int var394 = class291.field4872[var6];
                            if (class160.field2684 == 2 && class233.field3844 > var394) {
                                class247.field4096[var7++] = class237.field3898[var394];
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 3611) {
                            if (class31.field648 == null) {
                                class247.field4096[var7++] = class228.field3764;
                            } else {
                                class247.field4096[var7++] = class31.field648.method372((byte) -89);
                            }
                            continue;
                        }
                        if (var486 == 3612) {
                            if (class31.field648 == null) {
                                class291.field4872[var6++] = 0;
                            } else {
                                class291.field4872[var6++] = class147.field2446;
                            }
                            continue;
                        }
                        if (var486 == 3613) {
                            var6--;
                            int var395 = class291.field4872[var6];
                            if (class31.field648 != null && var395 < class147.field2446) {
                                class247.field4096[var7++] = class276.field4603[var395].field2935.method372((byte) -91);
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 3614) {
                            var6--;
                            int var396 = class291.field4872[var6];
                            if (class31.field648 != null && class147.field2446 > var396) {
                                class291.field4872[var6++] = class276.field4603[var396].field2936;
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3615) {
                            var6--;
                            int var397 = class291.field4872[var6];
                            if (class31.field648 != null && var397 < class147.field2446) {
                                class291.field4872[var6++] = class276.field4603[var397].field2926;
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3616) {
                            class291.field4872[var6++] = class132.field2234;
                            continue;
                        }
                        if (var486 == 3617) {
                            var7--;
                            class40 var398 = class247.field4096[var7];
                            class109.method826(0, var398);
                            continue;
                        }
                        if (var486 == 3618) {
                            class291.field4872[var6++] = class197.field3164;
                            continue;
                        }
                        if (var486 == 3619) {
                            var7--;
                            class40 var399 = class247.field4096[var7];
                            class31.method283(var399.method362(-25194), -128);
                            continue;
                        }
                        if (var486 == 3620) {
                            class247.method1743(true);
                            continue;
                        }
                        if (var486 == 3621) {
                            if (class160.field2684 == 0) {
                                class291.field4872[var6++] = -1;
                            } else {
                                class291.field4872[var6++] = field3968;
                            }
                            continue;
                        }
                        if (var486 == 3622) {
                            var6--;
                            int var400 = class291.field4872[var6];
                            if (class160.field2684 != 0 && field3968 > var400) {
                                class247.field4096[var7++] = class199.method1401(class282.field4751[var400], 1).method372((byte) -72);
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 3623) {
                            var7--;
                            class40 var401 = class247.field4096[var7];
                            if (var401.method365(class157.field2627, 0) || var401.method365(class205.field3272, 0)) {
                                var401 = var401.method371(7, false);
                            }
                            class291.field4872[var6++] = class250.method1768(var401, class88.method686(arg0, 7240)) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3624) {
                            var6--;
                            int var402 = class291.field4872[var6];
                            if (class276.field4603 != null && var402 < class147.field2446 && class276.field4603[var402].field2935.method327(class255.field4233.field4319, -21581)) {
                                class291.field4872[var6++] = 1;
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3625) {
                            if (class307.field5144 == null) {
                                class247.field4096[var7++] = class228.field3764;
                            } else {
                                class247.field4096[var7++] = class307.field5144.method372((byte) -105);
                            }
                            continue;
                        }
                        if (var486 == 3626) {
                            var6--;
                            int var403 = class291.field4872[var6];
                            if (class31.field648 != null && var403 < class147.field2446) {
                                class247.field4096[var7++] = class276.field4603[var403].field2924;
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 3627) {
                            var6--;
                            int var404 = class291.field4872[var6];
                            if (class160.field2684 == 2 && var404 >= 0 && var404 < class233.field3844) {
                                class291.field4872[var6++] = class298.field4986[var404] ? 1 : 0;
                                continue;
                            }
                            class291.field4872[var6++] = 0;
                            continue;
                        }
                        if (var486 == 3628) {
                            var7--;
                            class40 var405 = class247.field4096[var7];
                            if (var405.method365(class157.field2627, 0) || var405.method365(class205.field3272, 0)) {
                                var405 = var405.method371(7, false);
                            }
                            class291.field4872[var6++] = class188.method1359(var405, false);
                            continue;
                        }
                        if (var486 == 3629) {
                            class291.field4872[var6++] = class6.field80;
                            continue;
                        }
                    } else if (var486 < 4000) {
                        if (var486 == 3903) {
                            var6--;
                            int var370 = class291.field4872[var6];
                            class291.field4872[var6++] = class6.field88[var370].method944(arg0 - 22176);
                            continue;
                        }
                        if (var486 == 3904) {
                            var6--;
                            int var371 = class291.field4872[var6];
                            class291.field4872[var6++] = class6.field88[var371].field2179;
                            continue;
                        }
                        if (var486 == 3905) {
                            var6--;
                            int var372 = class291.field4872[var6];
                            class291.field4872[var6++] = class6.field88[var372].field2174;
                            continue;
                        }
                        if (var486 == 3906) {
                            var6--;
                            int var373 = class291.field4872[var6];
                            class291.field4872[var6++] = class6.field88[var373].field2172;
                            continue;
                        }
                        if (var486 == 3907) {
                            var6--;
                            int var374 = class291.field4872[var6];
                            class291.field4872[var6++] = class6.field88[var374].field2183;
                            continue;
                        }
                        if (var486 == 3908) {
                            var6--;
                            int var375 = class291.field4872[var6];
                            class291.field4872[var6++] = class6.field88[var375].field2181;
                            continue;
                        }
                        if (var486 == 3910) {
                            var6--;
                            int var376 = class291.field4872[var6];
                            int var377 = class6.field88[var376].method946((byte) -80);
                            class291.field4872[var6++] = var377 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3911) {
                            var6--;
                            int var378 = class291.field4872[var6];
                            int var379 = class6.field88[var378].method946((byte) -121);
                            class291.field4872[var6++] = var379 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3912) {
                            var6--;
                            int var380 = class291.field4872[var6];
                            int var381 = class6.field88[var380].method946((byte) -126);
                            class291.field4872[var6++] = var381 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 3913) {
                            var6--;
                            int var382 = class291.field4872[var6];
                            int var383 = class6.field88[var382].method946((byte) -66);
                            class291.field4872[var6++] = var383 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var486 < 4100) {
                        if (var486 == 4000) {
                            var6 -= 2;
                            int var325 = class291.field4872[var6];
                            int var326 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = var325 + var326;
                            continue;
                        }
                        if (var486 == 4001) {
                            var6 -= 2;
                            int var327 = class291.field4872[var6];
                            int var328 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = var327 - var328;
                            continue;
                        }
                        if (var486 == 4002) {
                            var6 -= 2;
                            int var329 = class291.field4872[var6];
                            int var330 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = var329 * var330;
                            continue;
                        }
                        if (var486 == 4003) {
                            var6 -= 2;
                            int var331 = class291.field4872[var6];
                            int var332 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = var331 / var332;
                            continue;
                        }
                        if (var486 == 4004) {
                            var6--;
                            int var333 = class291.field4872[var6];
                            class291.field4872[var6++] = (int) ((double) var333 * Math.random());
                            continue;
                        }
                        if (var486 == 4005) {
                            var6--;
                            int var334 = class291.field4872[var6];
                            class291.field4872[var6++] = (int) (Math.random() * (double) (var334 + 1));
                            continue;
                        }
                        if (var486 == 4006) {
                            var6 -= 5;
                            int var335 = class291.field4872[var6];
                            int var336 = class291.field4872[var6 + 3];
                            int var337 = class291.field4872[var6 + 2];
                            int var338 = class291.field4872[var6 + 1];
                            int var339 = class291.field4872[var6 + 4];
                            class291.field4872[var6++] = (var338 - var335) * (var339 - var337) / (var336 - var337) + var335;
                            continue;
                        }
                        if (var486 == 4007) {
                            var6 -= 2;
                            long var340 = (long) class291.field4872[var6];
                            long var342 = (long) class291.field4872[var6 + 1];
                            class291.field4872[var6++] = (int) (var340 * var342 / 100L + var340);
                            continue;
                        }
                        if (var486 == 4008) {
                            var6 -= 2;
                            int var344 = class291.field4872[var6 + 1];
                            int var345 = class291.field4872[var6];
                            class291.field4872[var6++] = class11.method71(var345, 0x1 << var344);
                            continue;
                        }
                        if (var486 == 4009) {
                            var6 -= 2;
                            int var346 = class291.field4872[var6];
                            int var347 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class276.method1923(-(0x1 << var347) - 1, var346);
                            continue;
                        }
                        if (var486 == 4010) {
                            var6 -= 2;
                            int var348 = class291.field4872[var6];
                            int var349 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class276.method1923(var348, 0x1 << var349) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var486 == 4011) {
                            var6 -= 2;
                            int var350 = class291.field4872[var6 + 1];
                            int var351 = class291.field4872[var6];
                            class291.field4872[var6++] = var351 % var350;
                            continue;
                        }
                        if (var486 == 4012) {
                            var6 -= 2;
                            int var352 = class291.field4872[var6];
                            int var353 = class291.field4872[var6 + 1];
                            if (var352 == 0) {
                                class291.field4872[var6++] = 0;
                            } else {
                                class291.field4872[var6++] = (int) Math.pow((double) var352, (double) var353);
                            }
                            continue;
                        }
                        if (var486 == 4013) {
                            var6 -= 2;
                            int var354 = class291.field4872[var6 + 1];
                            int var355 = class291.field4872[var6];
                            if (var355 == 0) {
                                class291.field4872[var6++] = 0;
                            } else if (var354 == 0) {
                                class291.field4872[var6++] = Integer.MAX_VALUE;
                            } else {
                                class291.field4872[var6++] = (int) Math.pow((double) var355, 1.0D / (double) var354);
                            }
                            continue;
                        }
                        if (var486 == 4014) {
                            var6 -= 2;
                            int var356 = class291.field4872[var6];
                            int var357 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = class276.method1923(var356, var357);
                            continue;
                        }
                        if (var486 == 4015) {
                            var6 -= 2;
                            int var358 = class291.field4872[var6 + 1];
                            int var359 = class291.field4872[var6];
                            class291.field4872[var6++] = class11.method71(var359, var358);
                            continue;
                        }
                        if (var486 == 4016) {
                            var6 -= 2;
                            int var360 = class291.field4872[var6];
                            int var361 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = var361 <= var360 ? var361 : var360;
                            continue;
                        }
                        if (var486 == 4017) {
                            var6 -= 2;
                            int var362 = class291.field4872[var6];
                            int var363 = class291.field4872[var6 + 1];
                            class291.field4872[var6++] = var362 <= var363 ? var363 : var362;
                            continue;
                        }
                        if (var486 == 4018) {
                            var6 -= 3;
                            long var364 = (long) class291.field4872[var6 + 2];
                            long var366 = (long) class291.field4872[var6 + 1];
                            long var368 = (long) class291.field4872[var6];
                            class291.field4872[var6++] = (int) (var364 * var368 / var366);
                            continue;
                        }
                    } else if (var486 < 4200) {
                        if (var486 == 4100) {
                            var6--;
                            int var95 = class291.field4872[var6];
                            var7--;
                            class40 var96 = class247.field4096[var7];
                            class247.field4096[var7++] = class153.method1192(new class40[] { var96, class276.method1927((byte) -81, var95) }, (byte) -66);
                            continue;
                        }
                        if (var486 == 4101) {
                            var7 -= 2;
                            class40 var97 = class247.field4096[var7];
                            class40 var98 = class247.field4096[var7 + 1];
                            class247.field4096[var7++] = class153.method1192(new class40[] { var97, var98 }, (byte) -110);
                            continue;
                        }
                        if (var486 == 4102) {
                            var6--;
                            int var99 = class291.field4872[var6];
                            var7--;
                            class40 var100 = class247.field4096[var7];
                            class247.field4096[var7++] = class153.method1192(new class40[] { var100, class232.method1612(true, var99, true) }, (byte) -77);
                            continue;
                        }
                        if (var486 == 4103) {
                            var7--;
                            class40 var101 = class247.field4096[var7];
                            class247.field4096[var7++] = var101.method337(40);
                            continue;
                        }
                        if (var486 == 4104) {
                            var6--;
                            int var102 = class291.field4872[var6];
                            long var103 = ((long) var102 + 11745L) * 86400000L;
                            class192.field3097.setTime(new Date(var103));
                            int var105 = class192.field3097.get(5);
                            int var106 = class192.field3097.get(2);
                            int var107 = class192.field3097.get(1);
                            class247.field4096[var7++] = class153.method1192(new class40[] { class276.method1927((byte) -103, var105), class15.field243, class147.field2455[var106], class15.field243, class276.method1927((byte) -88, var107) }, (byte) 127);
                            continue;
                        }
                        if (var486 == 4105) {
                            var7 -= 2;
                            class40 var108 = class247.field4096[var7 + 1];
                            class40 var109 = class247.field4096[var7];
                            if (class255.field4233.field4294 != null && class255.field4233.field4294.field1016) {
                                class247.field4096[var7++] = var108;
                                continue;
                            }
                            class247.field4096[var7++] = var109;
                            continue;
                        }
                        if (var486 == 4106) {
                            var6--;
                            int var110 = class291.field4872[var6];
                            class247.field4096[var7++] = class276.method1927((byte) -118, var110);
                            continue;
                        }
                        if (var486 == 4107) {
                            var7 -= 2;
                            class291.field4872[var6++] = class247.field4096[var7].method340(class247.field4096[var7 + 1], class88.method686(arg0, 13756));
                            continue;
                        }
                        if (var486 == 4108) {
                            var6 -= 2;
                            var7--;
                            class40 var111 = class247.field4096[var7];
                            int var112 = class291.field4872[var6];
                            int var113 = class291.field4872[var6 + 1];
                            byte[] var114 = class41.field791.method1651(var113, 0, arg0 ^ 0x1C0D);
                            class262 var115 = new class262(var114);
                            var115.method1823(class246.field4077, (int[]) null);
                            class291.field4872[var6++] = var115.method1834(var111, var112);
                            continue;
                        }
                        if (var486 == 4109) {
                            var6 -= 2;
                            int var116 = class291.field4872[var6 + 1];
                            int var117 = class291.field4872[var6];
                            var7--;
                            class40 var118 = class247.field4096[var7];
                            byte[] var119 = class41.field791.method1651(var116, 0, -1);
                            class262 var120 = new class262(var119);
                            var120.method1823(class246.field4077, (int[]) null);
                            class291.field4872[var6++] = var120.method1838(var118, var117);
                            continue;
                        }
                        if (var486 == 4110) {
                            var7 -= 2;
                            class40 var121 = class247.field4096[var7];
                            class40 var122 = class247.field4096[var7 + 1];
                            var6--;
                            if (class291.field4872[var6] == 1) {
                                class247.field4096[var7++] = var121;
                            } else {
                                class247.field4096[var7++] = var122;
                            }
                            continue;
                        }
                        if (var486 == 4111) {
                            var7--;
                            class40 var123 = class247.field4096[var7];
                            class247.field4096[var7++] = class259.method1824(var123);
                            continue;
                        }
                        if (var486 == 4112) {
                            var7--;
                            class40 var124 = class247.field4096[var7];
                            var6--;
                            int var125 = class291.field4872[var6];
                            if (var125 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class247.field4096[var7++] = var124.method339(var125, (byte) -83);
                            continue;
                        }
                        if (var486 == 4113) {
                            var6--;
                            int var126 = class291.field4872[var6];
                            class291.field4872[var6++] = class104.method781(var126, 7127) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 4114) {
                            var6--;
                            int var127 = class291.field4872[var6];
                            class291.field4872[var6++] = class209.method1476(class88.method686(arg0, -7245), var127) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 4115) {
                            var6--;
                            int var128 = class291.field4872[var6];
                            class291.field4872[var6++] = class288.method1991(false, var128) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 4116) {
                            var6--;
                            int var129 = class291.field4872[var6];
                            class291.field4872[var6++] = class177.method1304(var129, 57) ? 1 : 0;
                            continue;
                        }
                        if (var486 == 4117) {
                            var7--;
                            class40 var130 = class247.field4096[var7];
                            if (var130 == null) {
                                class291.field4872[var6++] = 0;
                            } else {
                                class291.field4872[var6++] = var130.method350(true);
                            }
                            continue;
                        }
                        if (var486 == 4118) {
                            var6 -= 2;
                            var7--;
                            class40 var131 = class247.field4096[var7];
                            int var132 = class291.field4872[var6];
                            int var133 = class291.field4872[var6 + 1];
                            class247.field4096[var7++] = var131.method333(var132, 40, var133);
                            continue;
                        }
                        if (var486 == 4119) {
                            var7--;
                            class40 var134 = class247.field4096[var7];
                            class40 var135 = class29.method274((byte) -118, var134.method350(true));
                            boolean var136 = false;
                            for (int var137 = 0; var137 < var134.method350(true); var137++) {
                                int var138 = var134.method366(-1, var137);
                                if (var138 == 60) {
                                    var136 = true;
                                } else if (var138 == 62) {
                                    var136 = false;
                                } else if (!var136) {
                                    var135.method356(-81, var138);
                                }
                            }
                            var135.method336(-18690);
                            class247.field4096[var7++] = var135;
                            continue;
                        }
                        if (var486 == 4120) {
                            var6 -= 2;
                            var7--;
                            class40 var139 = class247.field4096[var7];
                            int var140 = class291.field4872[var6 + 1];
                            int var141 = class291.field4872[var6];
                            class291.field4872[var6++] = var139.method370(var141, var140, (byte) -126);
                            continue;
                        }
                        if (var486 == 4121) {
                            var7 -= 2;
                            class40 var142 = class247.field4096[var7 + 1];
                            class40 var143 = class247.field4096[var7];
                            var6--;
                            int var144 = class291.field4872[var6];
                            class291.field4872[var6++] = var143.method326(class88.method686(arg0, 7224), var144, var142);
                            continue;
                        }
                        if (var486 == 4122) {
                            var6--;
                            int var145 = class291.field4872[var6];
                            class291.field4872[var6++] = class83.method636(var145, 17576);
                            continue;
                        }
                        if (var486 == 4123) {
                            var6--;
                            int var146 = class291.field4872[var6];
                            class291.field4872[var6++] = class63.method518(-256, var146);
                            continue;
                        }
                    } else if (var486 < 4300) {
                        if (var486 == 4200) {
                            var6--;
                            int var306 = class291.field4872[var6];
                            class247.field4096[var7++] = class165.method1243(class88.method686(arg0, 7242), var306).field4628;
                            continue;
                        }
                        if (var486 == 4201) {
                            var6 -= 2;
                            int var307 = class291.field4872[var6 + 1];
                            int var308 = class291.field4872[var6];
                            class277 var309 = class165.method1243(-86, var308);
                            if (var307 >= 1 && var307 <= 5 && var309.field4662[var307 - 1] != null) {
                                class247.field4096[var7++] = var309.field4662[var307 - 1];
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 4202) {
                            var6 -= 2;
                            int var310 = class291.field4872[var6];
                            int var311 = class291.field4872[var6 + 1];
                            class277 var312 = class165.method1243(-30, var310);
                            if (var311 >= 1 && var311 <= 5 && var312.field4656[var311 - 1] != null) {
                                class247.field4096[var7++] = var312.field4656[var311 - 1];
                                continue;
                            }
                            class247.field4096[var7++] = class228.field3764;
                            continue;
                        }
                        if (var486 == 4203) {
                            var6--;
                            int var313 = class291.field4872[var6];
                            class291.field4872[var6++] = class165.method1243(-105, var313).field4677;
                            continue;
                        }
                        if (var486 == 4204) {
                            var6--;
                            int var314 = class291.field4872[var6];
                            class291.field4872[var6++] = class165.method1243(-45, var314).field4637 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 4205) {
                            var6--;
                            int var315 = class291.field4872[var6];
                            class277 var316 = class165.method1243(arg0 + 7099, var315);
                            if (var316.field4648 == -1 && var316.field4661 >= 0) {
                                class291.field4872[var6++] = var316.field4661;
                                continue;
                            }
                            class291.field4872[var6++] = var315;
                            continue;
                        }
                        if (var486 == 4206) {
                            var6--;
                            int var317 = class291.field4872[var6];
                            class277 var318 = class165.method1243(-21, var317);
                            if (var318.field4648 >= 0 && var318.field4661 >= 0) {
                                class291.field4872[var6++] = var318.field4661;
                                continue;
                            }
                            class291.field4872[var6++] = var317;
                            continue;
                        }
                        if (var486 == 4207) {
                            var6--;
                            int var319 = class291.field4872[var6];
                            class291.field4872[var6++] = class165.method1243(-110, var319).field4627 ? 1 : 0;
                            continue;
                        }
                        if (var486 == 4208) {
                            var6 -= 2;
                            int var320 = class291.field4872[var6];
                            int var321 = class291.field4872[var6 + 1];
                            class290 var322 = class19.method115(var321, (byte) 69);
                            if (var322.method2002(115)) {
                                class247.field4096[var7++] = class165.method1243(class88.method686(arg0, 7188), var320).method1934(67, var321, var322.field4863);
                            } else {
                                class291.field4872[var6++] = class165.method1243(-22, var320).method1938(var321, var322.field4847, (byte) -127);
                            }
                            continue;
                        }
                        if (var486 == 4210) {
                            var7--;
                            class40 var323 = class247.field4096[var7];
                            var6--;
                            int var324 = class291.field4872[var6];
                            class118.method891(var324 == 1, arg0 ^ 0xFFFFE3F2, var323);
                            class291.field4872[var6++] = class101.field1781;
                            continue;
                        }
                        if (var486 == 4211) {
                            if (class244.field4019 != null && class101.field1781 > class68.field1252) {
                                class291.field4872[var6++] = class276.method1923(class244.field4019[class68.field1252++], 65535);
                                continue;
                            }
                            class291.field4872[var6++] = -1;
                            continue;
                        }
                        if (var486 == 4212) {
                            class68.field1252 = 0;
                            continue;
                        }
                    } else if (var486 < 4400) {
                        if (var486 == 4300) {
                            var6 -= 2;
                            int var296 = class291.field4872[var6];
                            int var297 = class291.field4872[var6 + 1];
                            class290 var298 = class19.method115(var297, (byte) 69);
                            if (var298.method2002(115)) {
                                class247.field4096[var7++] = class246.method1740(var296, (byte) -32).method919(var297, -3964, var298.field4863);
                            } else {
                                class291.field4872[var6++] = class246.method1740(var296, (byte) -32).method911(var297, var298.field4847, 54);
                            }
                            continue;
                        }
                        if (var486 == 4301) {
                            var6--;
                            int var299 = class291.field4872[var6];
                            class291.field4872[var6++] = class246.method1740(var299, (byte) -32).field2078;
                            continue;
                        }
                        if (var486 == 4302) {
                            var6--;
                            int var300 = class291.field4872[var6];
                            class291.field4872[var6++] = class246.method1740(var300, (byte) -32).field2107;
                            continue;
                        }
                        if (var486 == 4303) {
                            var6--;
                            int var301 = class291.field4872[var6];
                            class291.field4872[var6++] = class246.method1740(var301, (byte) -32).field2069;
                            continue;
                        }
                        if (var486 == 4304) {
                            var6--;
                            int var302 = class291.field4872[var6];
                            class291.field4872[var6++] = class246.method1740(var302, (byte) -32).field2090;
                            continue;
                        }
                        if (var486 == 4305) {
                            var6--;
                            int var303 = class291.field4872[var6];
                            class291.field4872[var6++] = class246.method1740(var303, (byte) -32).field2103;
                            continue;
                        }
                        if (var486 == 4306) {
                            var6--;
                            int var304 = class291.field4872[var6];
                            class291.field4872[var6++] = class246.method1740(var304, (byte) -32).field2067;
                            continue;
                        }
                        if (var486 == 4307) {
                            var6--;
                            int var305 = class291.field4872[var6];
                            class291.field4872[var6++] = class246.method1740(var305, (byte) -32).field2077;
                            continue;
                        }
                    } else if (var486 < 4500) {
                        if (var486 == 4400) {
                            var6 -= 2;
                            int var147 = class291.field4872[var6];
                            int var148 = class291.field4872[var6 + 1];
                            class290 var149 = class19.method115(var148, (byte) 69);
                            if (var149.method2002(arg0 ^ 0xFFFFE381)) {
                                class247.field4096[var7++] = class72.method540(0, var147).method253(var149.field4863, var148, -65536);
                            } else {
                                class291.field4872[var6++] = class72.method540(class88.method686(arg0, -7182), var147).method252(var148, (byte) -56, var149.field4847);
                            }
                            continue;
                        }
                    } else if (var486 >= 4600) {
                        if (var486 < 5100) {
                            if (var486 == 5000) {
                                class291.field4872[var6++] = class165.field2729;
                                continue;
                            }
                            if (var486 == 5001) {
                                var6 -= 3;
                                class165.field2729 = class291.field4872[var6];
                                class252.field4186++;
                                class304.field5083 = class291.field4872[var6 + 1];
                                class292.field4880 = class291.field4872[var6 + 2];
                                class19.field295.method1464(121, 0);
                                class19.field295.method218(class165.field2729, arg0 - 12732);
                                class19.field295.method218(class304.field5083, -19914);
                                class19.field295.method218(class292.field4880, -19914);
                                continue;
                            }
                            if (var486 == 5002) {
                                var6 -= 2;
                                var7--;
                                class40 var150 = class247.field4096[var7];
                                class310.field5193++;
                                int var151 = class291.field4872[var6];
                                int var152 = class291.field4872[var6 + 1];
                                class19.field295.method1464(104, 0);
                                class19.field295.method241(var150.method362(-25194), 119);
                                class19.field295.method218(var151 - 1, -19914);
                                class19.field295.method218(var152, -19914);
                                continue;
                            }
                            if (var486 == 5003) {
                                class40 var153 = null;
                                var6--;
                                int var154 = class291.field4872[var6];
                                if (var154 < 100) {
                                    var153 = class279.field4706[var154];
                                }
                                if (var153 == null) {
                                    var153 = class228.field3764;
                                }
                                class247.field4096[var7++] = var153;
                                continue;
                            }
                            if (var486 == 5004) {
                                var6--;
                                int var155 = class291.field4872[var6];
                                int var156 = -1;
                                if (var155 < 100 && class279.field4706[var155] != null) {
                                    var156 = class209.field3344[var155];
                                }
                                class291.field4872[var6++] = var156;
                                continue;
                            }
                            if (var486 == 5005) {
                                class291.field4872[var6++] = class304.field5083;
                                continue;
                            }
                            if (var486 == 5008) {
                                var7--;
                                class40 var157 = class247.field4096[var7];
                                if (!var157.method365(class233.field3841, 0)) {
                                    if (class162.field2689 == 0 && (class208.field3333 && !class11.field180 || class300.field5038)) {
                                        continue;
                                    }
                                    class51.field981++;
                                    byte var158 = 0;
                                    byte var159 = 0;
                                    class40 var160 = var157.method337(40);
                                    if (var160.method365(class313.field5274, 0)) {
                                        var158 = 0;
                                        var157 = var157.method371(class313.field5274.method350(true), false);
                                    } else if (var160.method365(class301.field5043, 0)) {
                                        var158 = 1;
                                        var157 = var157.method371(class301.field5043.method350(true), false);
                                    } else if (var160.method365(class186.field3003, 0)) {
                                        var158 = 2;
                                        var157 = var157.method371(class186.field3003.method350(true), false);
                                    } else if (var160.method365(class292.field4874, arg0 ^ 0xFFFFE3F2)) {
                                        var158 = 3;
                                        var157 = var157.method371(class292.field4874.method350(true), false);
                                    } else if (var160.method365(class169.field2786, 0)) {
                                        var157 = var157.method371(class169.field2786.method350(true), false);
                                        var158 = 4;
                                    } else if (var160.method365(class293.field4925, 0)) {
                                        var157 = var157.method371(class293.field4925.method350(true), false);
                                        var158 = 5;
                                    } else if (var160.method365(class237.field3912, 0)) {
                                        var158 = 6;
                                        var157 = var157.method371(class237.field3912.method350(true), false);
                                    } else if (var160.method365(class207.field3314, 0)) {
                                        var157 = var157.method371(class207.field3314.method350(true), false);
                                        var158 = 7;
                                    } else if (var160.method365(class314.field5301, 0)) {
                                        var157 = var157.method371(class314.field5301.method350(true), false);
                                        var158 = 8;
                                    } else if (var160.method365(class204.field3240, 0)) {
                                        var158 = 9;
                                        var157 = var157.method371(class204.field3240.method350(true), false);
                                    } else if (var160.method365(class134.field2268, 0)) {
                                        var158 = 10;
                                        var157 = var157.method371(class134.field2268.method350(true), false);
                                    } else if (var160.method365(class76.field1307, 0)) {
                                        var158 = 11;
                                        var157 = var157.method371(class76.field1307.method350(true), false);
                                    } else if (class248.field4106 != 0) {
                                        if (var160.method365(class313.field5286, 0)) {
                                            var157 = var157.method371(class313.field5286.method350(true), false);
                                            var158 = 0;
                                        } else if (var160.method365(class301.field5047, arg0 ^ 0xFFFFE3F2)) {
                                            var158 = 1;
                                            var157 = var157.method371(class301.field5047.method350(true), false);
                                        } else if (var160.method365(class186.field3006, 0)) {
                                            var158 = 2;
                                            var157 = var157.method371(class186.field3006.method350(true), false);
                                        } else if (var160.method365(class292.field4883, 0)) {
                                            var157 = var157.method371(class292.field4883.method350(true), false);
                                            var158 = 3;
                                        } else if (var160.method365(class169.field2783, 0)) {
                                            var157 = var157.method371(class169.field2783.method350(true), false);
                                            var158 = 4;
                                        } else if (var160.method365(class293.field4914, 0)) {
                                            var158 = 5;
                                            var157 = var157.method371(class293.field4914.method350(true), false);
                                        } else if (var160.method365(class237.field3914, 0)) {
                                            var158 = 6;
                                            var157 = var157.method371(class237.field3914.method350(true), false);
                                        } else if (var160.method365(class207.field3303, 0)) {
                                            var157 = var157.method371(class207.field3303.method350(true), false);
                                            var158 = 7;
                                        } else if (var160.method365(class314.field5304, 0)) {
                                            var158 = 8;
                                            var157 = var157.method371(class314.field5304.method350(true), false);
                                        } else if (var160.method365(class204.field3229, 0)) {
                                            var157 = var157.method371(class204.field3229.method350(true), false);
                                            var158 = 9;
                                        } else if (var160.method365(class134.field2283, arg0 + 7182)) {
                                            var158 = 10;
                                            var157 = var157.method371(class134.field2283.method350(true), false);
                                        } else if (var160.method365(class76.field1309, 0)) {
                                            var158 = 11;
                                            var157 = var157.method371(class76.field1309.method350(true), false);
                                        }
                                    }
                                    class40 var161 = var157.method337(40);
                                    if (var161.method365(class313.field5288, 0)) {
                                        var159 = 1;
                                        var157 = var157.method371(class313.field5288.method350(true), false);
                                    } else if (var161.method365(class299.field4989, 0)) {
                                        var157 = var157.method371(class299.field4989.method350(true), false);
                                        var159 = 2;
                                    } else if (var161.method365(class204.field3237, arg0 ^ 0xFFFFE3F2)) {
                                        var157 = var157.method371(class204.field3237.method350(true), false);
                                        var159 = 3;
                                    } else if (var161.method365(class88.field1591, 0)) {
                                        var159 = 4;
                                        var157 = var157.method371(class88.field1591.method350(true), false);
                                    } else if (var161.method365(class223.field3710, 0)) {
                                        var159 = 5;
                                        var157 = var157.method371(class223.field3710.method350(true), false);
                                    } else if (class248.field4106 != 0) {
                                        if (var161.method365(class313.field5283, 0)) {
                                            var157 = var157.method371(class313.field5283.method350(true), false);
                                            var159 = 1;
                                        } else if (var161.method365(class299.field5000, 0)) {
                                            var159 = 2;
                                            var157 = var157.method371(class299.field5000.method350(true), false);
                                        } else if (var161.method365(class204.field3231, 0)) {
                                            var157 = var157.method371(class204.field3231.method350(true), false);
                                            var159 = 3;
                                        } else if (var161.method365(class88.field1592, 0)) {
                                            var157 = var157.method371(class88.field1592.method350(true), false);
                                            var159 = 4;
                                        } else if (var161.method365(class223.field3709, 0)) {
                                            var157 = var157.method371(class223.field3709.method350(true), false);
                                            var159 = 5;
                                        }
                                    }
                                    class19.field295.method1464(151, 0);
                                    class19.field295.method218(0, -19914);
                                    int var162 = class19.field295.field478;
                                    class19.field295.method218(var158, arg0 ^ 0x51C4);
                                    class19.field295.method218(var159, arg0 - 12732);
                                    class249.method1758(var157, class19.field295, (byte) -22);
                                    class19.field295.method233(false, class19.field295.field478 - var162);
                                    continue;
                                }
                                class132.method974(103, var157);
                                continue;
                            }
                            if (var486 == 5009) {
                                var7 -= 2;
                                class40 var163 = class247.field4096[var7 + 1];
                                class40 var164 = class247.field4096[var7];
                                if (class162.field2689 != 0 || (!class208.field3333 || class11.field180) && !class300.field5038) {
                                    class19.field295.method1464(91, 0);
                                    class19.field295.method218(0, arg0 ^ 0x51C4);
                                    class243.field4012++;
                                    int var165 = class19.field295.field478;
                                    class19.field295.method241(var164.method362(arg0 ^ 0x7E64), arg0 + 7291);
                                    class249.method1758(var163, class19.field295, (byte) -44);
                                    class19.field295.method233(false, class19.field295.field478 - var165);
                                }
                                continue;
                            }
                            if (var486 == 5010) {
                                var6--;
                                int var166 = class291.field4872[var6];
                                class40 var167 = null;
                                if (var166 < 100) {
                                    var167 = class61.field1164[var166];
                                }
                                if (var167 == null) {
                                    var167 = class228.field3764;
                                }
                                class247.field4096[var7++] = var167;
                                continue;
                            }
                            if (var486 == 5011) {
                                var6--;
                                int var168 = class291.field4872[var6];
                                class40 var169 = null;
                                if (var168 < 100) {
                                    var169 = class194.field3127[var168];
                                }
                                if (var169 == null) {
                                    var169 = class228.field3764;
                                }
                                class247.field4096[var7++] = var169;
                                continue;
                            }
                            if (var486 == 5012) {
                                int var170 = -1;
                                var6--;
                                int var171 = class291.field4872[var6];
                                if (var171 < 100) {
                                    var170 = class81.field1433[var171];
                                }
                                class291.field4872[var6++] = var170;
                                continue;
                            }
                            if (var486 == 5015) {
                                class40 var172;
                                if (class255.field4233 == null || class255.field4233.field4319 == null) {
                                    var172 = class264.field4434;
                                } else {
                                    var172 = class255.field4233.method1814(0);
                                }
                                class247.field4096[var7++] = var172;
                                continue;
                            }
                            if (var486 == 5016) {
                                class291.field4872[var6++] = class292.field4880;
                                continue;
                            }
                            if (var486 == 5017) {
                                class291.field4872[var6++] = class98.field1755;
                                continue;
                            }
                            if (var486 == 5050) {
                                var6--;
                                int var173 = class291.field4872[var6];
                                class247.field4096[var7++] = class14.method83(var173, (byte) -84).field3275;
                                continue;
                            }
                            if (var486 == 5051) {
                                var6--;
                                int var174 = class291.field4872[var6];
                                class206 var175 = class14.method83(var174, (byte) -127);
                                if (var175.field3286 == null) {
                                    class291.field4872[var6++] = 0;
                                } else {
                                    class291.field4872[var6++] = var175.field3286.length;
                                }
                                continue;
                            }
                            if (var486 == 5052) {
                                var6 -= 2;
                                int var176 = class291.field4872[var6];
                                int var177 = class291.field4872[var6 + 1];
                                class206 var178 = class14.method83(var176, (byte) 53);
                                int var179 = var178.field3286[var177];
                                class291.field4872[var6++] = var179;
                                continue;
                            }
                            if (var486 == 5053) {
                                var6--;
                                int var180 = class291.field4872[var6];
                                class206 var181 = class14.method83(var180, (byte) -127);
                                if (var181.field3277 == null) {
                                    class291.field4872[var6++] = 0;
                                } else {
                                    class291.field4872[var6++] = var181.field3277.length;
                                }
                                continue;
                            }
                            if (var486 == 5054) {
                                var6 -= 2;
                                int var182 = class291.field4872[var6];
                                int var183 = class291.field4872[var6 + 1];
                                class291.field4872[var6++] = class14.method83(var182, (byte) -66).field3277[var183];
                                continue;
                            }
                            if (var486 == 5055) {
                                var6--;
                                int var184 = class291.field4872[var6];
                                class247.field4096[var7++] = class68.method531(var184, 32767).method1903((byte) -114);
                                continue;
                            }
                            if (var486 == 5056) {
                                var6--;
                                int var185 = class291.field4872[var6];
                                class274 var186 = class68.method531(var185, arg0 ^ 0xFFFF9C0D);
                                if (var186.field4541 == null) {
                                    class291.field4872[var6++] = 0;
                                } else {
                                    class291.field4872[var6++] = var186.field4541.length;
                                }
                                continue;
                            }
                            if (var486 == 5057) {
                                var6 -= 2;
                                int var187 = class291.field4872[var6];
                                int var188 = class291.field4872[var6 + 1];
                                class291.field4872[var6++] = class68.method531(var187, 32767).field4541[var188];
                                continue;
                            }
                            if (var486 == 5058) {
                                class275.field4570 = new class94();
                                var6--;
                                class275.field4570.field1697 = class291.field4872[var6];
                                class275.field4570.field1694 = class68.method531(class275.field4570.field1697, 32767);
                                class275.field4570.field1699 = new int[class275.field4570.field1694.method1905(0)];
                                continue;
                            }
                            if (var486 == 5059) {
                                class19.field295.method1464(88, arg0 ^ 0xFFFFE3F2);
                                class122.field2119++;
                                class19.field295.method218(0, -19914);
                                int var189 = class19.field295.field478;
                                class19.field295.method218(0, arg0 - 12732);
                                class19.field295.method209(arg0 ^ 0xFF00E3F2, class275.field4570.field1697);
                                class275.field4570.field1694.method1904(class19.field295, class275.field4570.field1699, -1);
                                class19.field295.method233(false, class19.field295.field478 - var189);
                                continue;
                            }
                            if (var486 == 5060) {
                                class272.field4522++;
                                var7--;
                                class40 var190 = class247.field4096[var7];
                                class19.field295.method1464(202, 0);
                                class19.field295.method218(0, -19914);
                                int var191 = class19.field295.field478;
                                class19.field295.method241(var190.method362(-25194), 100);
                                class19.field295.method209(16711680, class275.field4570.field1697);
                                class275.field4570.field1694.method1904(class19.field295, class275.field4570.field1699, -1);
                                class19.field295.method233(false, class19.field295.field478 - var191);
                                continue;
                            }
                            if (var486 == 5061) {
                                class19.field295.method1464(88, 0);
                                class19.field295.method218(0, arg0 ^ 0x51C4);
                                class122.field2119++;
                                int var192 = class19.field295.field478;
                                class19.field295.method218(1, -19914);
                                class19.field295.method209(16711680, class275.field4570.field1697);
                                class275.field4570.field1694.method1904(class19.field295, class275.field4570.field1699, arg0 ^ 0x1C0D);
                                class19.field295.method233(false, class19.field295.field478 - var192);
                                continue;
                            }
                            if (var486 == 5062) {
                                var6 -= 2;
                                int var193 = class291.field4872[var6 + 1];
                                int var194 = class291.field4872[var6];
                                class291.field4872[var6++] = class14.method83(var194, (byte) 68).field3292[var193];
                                continue;
                            }
                            if (var486 == 5063) {
                                var6 -= 2;
                                int var195 = class291.field4872[var6];
                                int var196 = class291.field4872[var6 + 1];
                                class291.field4872[var6++] = class14.method83(var195, (byte) 87).field3276[var196];
                                continue;
                            }
                            if (var486 == 5064) {
                                var6 -= 2;
                                int var197 = class291.field4872[var6 + 1];
                                int var198 = class291.field4872[var6];
                                if (var197 == -1) {
                                    class291.field4872[var6++] = -1;
                                } else {
                                    class291.field4872[var6++] = class14.method83(var198, (byte) 127).method1455((byte) -46, var197);
                                }
                                continue;
                            }
                            if (var486 == 5065) {
                                var6 -= 2;
                                int var199 = class291.field4872[var6];
                                int var200 = class291.field4872[var6 + 1];
                                if (var200 == -1) {
                                    class291.field4872[var6++] = -1;
                                } else {
                                    class291.field4872[var6++] = class14.method83(var199, (byte) 97).method1453(-1, var200);
                                }
                                continue;
                            }
                            if (var486 == 5066) {
                                var6--;
                                int var201 = class291.field4872[var6];
                                class291.field4872[var6++] = class68.method531(var201, 32767).method1905(0);
                                continue;
                            }
                            if (var486 == 5067) {
                                var6 -= 2;
                                int var202 = class291.field4872[var6 + 1];
                                int var203 = class291.field4872[var6];
                                int var204 = class68.method531(var203, 32767).method1896(-9848, var202);
                                class291.field4872[var6++] = var204;
                                continue;
                            }
                            if (var486 == 5068) {
                                var6 -= 2;
                                int var205 = class291.field4872[var6 + 1];
                                int var206 = class291.field4872[var6];
                                class275.field4570.field1699[var206] = var205;
                                continue;
                            }
                            if (var486 == 5069) {
                                var6 -= 2;
                                int var207 = class291.field4872[var6 + 1];
                                int var208 = class291.field4872[var6];
                                class275.field4570.field1699[var208] = var207;
                                continue;
                            }
                            if (var486 == 5070) {
                                var6 -= 3;
                                int var209 = class291.field4872[var6];
                                int var210 = class291.field4872[var6 + 1];
                                int var211 = class291.field4872[var6 + 2];
                                class274 var212 = class68.method531(var209, 32767);
                                if (var212.method1896(-9848, var210) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class291.field4872[var6++] = var212.method1909(var210, var211, arg0 + 7177);
                                continue;
                            }
                            if (var486 == 5071) {
                                var7--;
                                class40 var213 = class247.field4096[var7];
                                var6--;
                                boolean var214 = class291.field4872[var6] == 1;
                                class102.method771(arg0 ^ 0xFFFFDCBF, var213, var214);
                                class291.field4872[var6++] = class101.field1781;
                                continue;
                            }
                            if (var486 == 5072) {
                                if (class244.field4019 != null && class68.field1252 < class101.field1781) {
                                    class291.field4872[var6++] = class276.method1923(65535, class244.field4019[class68.field1252++]);
                                    continue;
                                }
                                class291.field4872[var6++] = -1;
                                continue;
                            }
                            if (var486 == 5073) {
                                class68.field1252 = 0;
                                continue;
                            }
                        } else if (var486 < 5200) {
                            if (var486 == 5100) {
                                if (class251.field4162[86]) {
                                    class291.field4872[var6++] = 1;
                                } else {
                                    class291.field4872[var6++] = 0;
                                }
                                continue;
                            }
                            if (var486 == 5101) {
                                if (class251.field4162[82]) {
                                    class291.field4872[var6++] = 1;
                                } else {
                                    class291.field4872[var6++] = 0;
                                }
                                continue;
                            }
                            if (var486 == 5102) {
                                if (class251.field4162[81]) {
                                    class291.field4872[var6++] = 1;
                                } else {
                                    class291.field4872[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var486 < 5300) {
                            if (var486 == 5200) {
                                var6--;
                                class160.method1231(true, class291.field4872[var6]);
                                continue;
                            }
                            if (var486 == 5201) {
                                class291.field4872[var6++] = class62.method512(-4145);
                                continue;
                            }
                            if (var486 == 5202) {
                                var6--;
                                class80.method600((byte) -74, class291.field4872[var6]);
                                continue;
                            }
                            if (var486 == 5203) {
                                var7--;
                                class309.method2111(true, class247.field4096[var7]);
                                continue;
                            }
                            if (var486 == 5204) {
                                class247.field4096[var7 - 1] = class116.method883((byte) -123, class247.field4096[var7 - 1]);
                                continue;
                            }
                            if (var486 == 5205) {
                                var7--;
                                class212.method1488((byte) -114, class247.field4096[var7]);
                                continue;
                            }
                            if (var486 == 5206) {
                                var6--;
                                int var290 = class291.field4872[var6];
                                class208 var291 = class132.method976(var290 >> 14 & 0x3FFF, var290 & 0x3FFF, -8824);
                                if (var291 == null) {
                                    class247.field4096[var7++] = class228.field3764;
                                } else {
                                    class247.field4096[var7++] = var291.field3319;
                                }
                                continue;
                            }
                            if (var486 == 5207) {
                                var7--;
                                class208 var292 = class189.method1365((byte) -38, class247.field4096[var7]);
                                if (var292 != null && var292.field3318 != null) {
                                    class247.field4096[var7++] = var292.field3318;
                                    continue;
                                }
                                class247.field4096[var7++] = class228.field3764;
                                continue;
                            }
                        } else if (var486 < 5400) {
                            if (var486 == 5300) {
                                var6 -= 2;
                                int var277 = class291.field4872[var6];
                                int var278 = class291.field4872[var6 + 1];
                                class289.method1997(var278, 3, false, true, var277);
                                class291.field4872[var6++] = class271.field4503 == null ? 0 : 1;
                                continue;
                            }
                            if (var486 == 5301) {
                                if (class271.field4503 != null) {
                                    class289.method1997(-1, class204.field3230, false, true, -1);
                                }
                                continue;
                            }
                            if (var486 == 5302) {
                                class197[] var279 = class25.method181(-25532);
                                class291.field4872[var6++] = var279.length;
                                continue;
                            }
                            if (var486 == 5303) {
                                var6--;
                                int var280 = class291.field4872[var6];
                                class197[] var281 = class25.method181(-25532);
                                class291.field4872[var6++] = var281[var280].field3162;
                                class291.field4872[var6++] = var281[var280].field3163;
                                continue;
                            }
                            if (var486 == 5305) {
                                int var282 = -1;
                                int var283 = class182.field2961;
                                int var284 = class159.field2665;
                                class197[] var285 = class25.method181(-25532);
                                for (int var286 = 0; var286 < var285.length; var286++) {
                                    class197 var287 = var285[var286];
                                    if (var287.field3162 == var284 && var287.field3163 == var283) {
                                        var282 = var286;
                                        break;
                                    }
                                }
                                class291.field4872[var6++] = var282;
                                continue;
                            }
                            if (var486 == 5306) {
                                class291.field4872[var6++] = class304.method2073((byte) 112);
                                continue;
                            }
                            if (var486 == 5307) {
                                var6--;
                                int var288 = class291.field4872[var6];
                                if (var288 < 0 || var288 > 2) {
                                    var288 = 0;
                                }
                                class289.method1997(-1, var288, false, true, -1);
                                continue;
                            }
                            if (var486 == 5308) {
                                class291.field4872[var6++] = class204.field3230;
                                continue;
                            }
                            if (var486 == 5309) {
                                var6--;
                                int var289 = class291.field4872[var6];
                                if (var289 < 0 || var289 > 2) {
                                    var289 = 0;
                                }
                                class204.field3230 = var289;
                                class94.method714(1, class275.field4573);
                                continue;
                            }
                        } else if (var486 < 5500) {
                            if (var486 == 5400) {
                                class130.field2223++;
                                var7 -= 2;
                                class40 var255 = class247.field4096[var7];
                                class40 var256 = class247.field4096[var7 + 1];
                                var6--;
                                int var257 = class291.field4872[var6];
                                class19.field295.method1464(9, 0);
                                class19.field295.method218(class34.method294(var255, (byte) 9) + class34.method294(var256, (byte) 36) + 1, -19914);
                                class19.field295.method206(var255, (byte) -124);
                                class19.field295.method206(var256, (byte) -72);
                                class19.field295.method218(var257, -19914);
                                continue;
                            }
                            if (var486 == 5401) {
                                var6 -= 2;
                                class265.field4446[class291.field4872[var6]] = (short) class15.method88(class291.field4872[var6 + 1], false);
                                class125.method940(arg0 + 7181);
                                class55.method469((byte) 36);
                                class252.method1779(false);
                                class63.method516(-4670);
                                class298.method2031(114);
                                continue;
                            }
                            if (var486 == 5405) {
                                var6 -= 2;
                                int var258 = class291.field4872[var6 + 1];
                                int var259 = class291.field4872[var6];
                                if (var259 >= 0 && var259 < 2) {
                                    class33.field667[var259] = new int[var258 << 1][4];
                                }
                                continue;
                            }
                            if (var486 == 5406) {
                                var6 -= 7;
                                int var260 = class291.field4872[var6 + 2];
                                int var261 = class291.field4872[var6 + 1] << 1;
                                int var262 = class291.field4872[var6];
                                int var263 = class291.field4872[var6 + 5];
                                int var264 = class291.field4872[var6 + 4];
                                int var265 = class291.field4872[var6 + 6];
                                int var266 = class291.field4872[var6 + 3];
                                if (var262 >= 0 && var262 < 2 && class33.field667[var262] != null && var261 >= 0 && var261 < class33.field667[var262].length) {
                                    class33.field667[var262][var261] = new int[] { class276.method1923(var260 >> 14, 16383) * 128, var266, class276.method1923(16383, var260) * 128, var265 };
                                    class33.field667[var262][var261 + 1] = new int[] { (class276.method1923(var264, 268429985) >> 14) * 128, var263, class276.method1923(16383, var264) * 128 };
                                }
                                continue;
                            }
                            if (var486 == 5407) {
                                var6--;
                                int var267 = class33.field667[class291.field4872[var6]].length >> 1;
                                class291.field4872[var6++] = var267;
                                continue;
                            }
                            if (var486 == 5411) {
                                if (class271.field4503 != null) {
                                    class289.method1997(-1, class204.field3230, false, true, -1);
                                }
                                if (class106.field1867 == null) {
                                    class236.method1638(arg0 ^ 0xFFFFE3BC, false, class280.method1954(-22763));
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var486 == 5419) {
                                class40 var268 = class228.field3764;
                                if (class193.field3119 != null) {
                                    var268 = class217.method1522(class193.field3119.field1259, (byte) -87);
                                    try {
                                        if (class193.field3119.field1260 != null) {
                                            byte[] var269 = ((String) class193.field3119.field1260).getBytes("ISO-8859-1");
                                            var268 = class34.method298(var269, -22277, var269.length, 0);
                                        }
                                    } catch (UnsupportedEncodingException var484) {
                                    }
                                }
                                class247.field4096[var7++] = var268;
                                continue;
                            }
                            if (var486 == 5420) {
                                class291.field4872[var6++] = class107.field1884 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 5421) {
                                if (class271.field4503 != null) {
                                    class289.method1997(-1, class204.field3230, false, true, -1);
                                }
                                var7--;
                                class40 var271 = class247.field4096[var7];
                                var6--;
                                boolean var272 = class291.field4872[var6] == 1;
                                class40 var273 = class153.method1192(new class40[] { class280.method1954(arg0 ^ 0x44E7), var271 }, (byte) 125);
                                if (class106.field1867 == null && (!var272 || class107.field1884 == 3 || !class107.field1883.startsWith("win") || class177.field2914)) {
                                    class236.method1638(arg0 + 7111, var272, var273);
                                    continue;
                                }
                                class25.field444 = var272;
                                class48.field931 = var273;
                                class149.field2504 = class275.field4573.method803(-90, new String(var273.method360(-20563), "ISO-8859-1"));
                                continue;
                            }
                            if (var486 == 5422) {
                                var7 -= 2;
                                var6--;
                                int var274 = class291.field4872[var6];
                                class40 var275 = class247.field4096[var7 + 1];
                                class40 var276 = class247.field4096[var7];
                                if (var276.method350(true) > 0) {
                                    if (class50.field956 == null) {
                                        class50.field956 = new class40[class31.field647[class249.field4110]];
                                    }
                                    class50.field956[var274] = var276;
                                }
                                if (var275.method350(true) > 0) {
                                    if (class25.field435 == null) {
                                        class25.field435 = new class40[class31.field647[class249.field4110]];
                                    }
                                    class25.field435[var274] = var275;
                                }
                                continue;
                            }
                            if (var486 == 5423) {
                                var7--;
                                class247.field4096[var7].method346(-16907);
                                continue;
                            }
                        } else if (var486 < 5600) {
                            if (var486 == 5500) {
                                var6 -= 4;
                                int var243 = class291.field4872[var6];
                                int var244 = class291.field4872[var6 + 3];
                                int var245 = class291.field4872[var6 + 1];
                                int var246 = class291.field4872[var6 + 2];
                                class218.method1526(false, (var243 >> 14 & 0x3FFF) - class196.field3152, var246, (var243 & 0x3FFF) - class263.field4407, var244, (byte) -98, var245);
                                continue;
                            }
                            if (var486 == 5501) {
                                var6 -= 4;
                                int var247 = class291.field4872[var6];
                                int var248 = class291.field4872[var6 + 1];
                                int var249 = class291.field4872[var6 + 2];
                                int var250 = class291.field4872[var6 + 3];
                                class106.method798((var247 >> 14 & 0x3FFF) - class196.field3152, var249, (var247 & 0x3FFF) - class263.field4407, (byte) -117, var248, var250);
                                continue;
                            }
                            if (var486 == 5502) {
                                var6 -= 6;
                                int var251 = class291.field4872[var6];
                                if (var251 >= 2) {
                                    throw new RuntimeException();
                                }
                                class30.field632 = var251;
                                int var252 = class291.field4872[var6 + 1];
                                if (class33.field667[class30.field632].length >> 1 <= var252 + 1) {
                                    throw new RuntimeException();
                                }
                                class257.field4279 = 0;
                                class94.field1696 = var252;
                                class58.field1115 = class291.field4872[var6 + 2];
                                class206.field3279 = class291.field4872[var6 + 3];
                                int var253 = class291.field4872[var6 + 4];
                                if (var253 >= 2) {
                                    throw new RuntimeException();
                                }
                                class315.field5349 = var253;
                                int var254 = class291.field4872[var6 + 5];
                                if ((class33.field667[class315.field5349].length >> 1) <= (var254 + 1)) {
                                    throw new RuntimeException();
                                }
                                class202.field3205 = var254;
                                class103.field1814 = 3;
                                continue;
                            }
                            if (var486 == 5503) {
                                class270.method1871(arg0 ^ 0xFFFFE3F7);
                                continue;
                            }
                            if (var486 == 5504) {
                                var6 -= 2;
                                class298.field4977 = class291.field4872[var6];
                                class108.field1893 = class291.field4872[var6 + 1];
                                class120.method907(125);
                                continue;
                            }
                            if (var486 == 5505) {
                                class291.field4872[var6++] = class298.field4977;
                                continue;
                            }
                            if (var486 == 5506) {
                                class291.field4872[var6++] = class108.field1893;
                                continue;
                            }
                        } else if (var486 < 5700) {
                            if (var486 == 5600) {
                                var7 -= 2;
                                class40 var239 = class247.field4096[var7 + 1];
                                var6--;
                                int var240 = class291.field4872[var6];
                                class40 var241 = class247.field4096[var7];
                                if (class6.field87 == 10 && class194.field3134 == 0 && class54.field1062 == 0 && class272.field4520 == 0 && class217.field3624 == 0) {
                                    class237.method1641(var239, 100, var240, var241);
                                }
                                continue;
                            }
                            if (var486 == 5601) {
                                class278.method1947(arg0 ^ 0x1C08);
                                continue;
                            }
                            if (var486 == 5602) {
                                if (class54.field1062 == 0) {
                                    class271.field4501 = -2;
                                }
                                continue;
                            }
                            if (var486 == 5603) {
                                var6 -= 4;
                                if (class6.field87 == 10 && class194.field3134 == 0 && class54.field1062 == 0 && class272.field4520 == 0 && class217.field3624 == 0) {
                                    class5.method25(class291.field4872[var6 + 2], 68, class291.field4872[var6 + 1], class291.field4872[var6], class291.field4872[var6 + 3]);
                                }
                                continue;
                            }
                            if (var486 == 5604) {
                                var7--;
                                if (class6.field87 == 10 && class194.field3134 == 0 && class54.field1062 == 0 && class272.field4520 == 0 && class217.field3624 == 0) {
                                    class296.method2023(class247.field4096[var7].method362(-25194), (byte) 35);
                                }
                                continue;
                            }
                            if (var486 == 5605) {
                                var6 -= 4;
                                var7 -= 2;
                                if (class6.field87 == 10 && class194.field3134 == 0 && class54.field1062 == 0 && class272.field4520 == 0 && class217.field3624 == 0) {
                                    class292.method2008(class247.field4096[var7 + 1], class247.field4096[var7].method362(-25194), class291.field4872[var6 + 1], class291.field4872[var6 + 3], class291.field4872[var6 + 2], (byte) 95, class291.field4872[var6]);
                                }
                                continue;
                            }
                            if (var486 == 5606) {
                                if (class272.field4520 == 0) {
                                    class189.field3069 = -2;
                                }
                                continue;
                            }
                            if (var486 == 5607) {
                                class291.field4872[var6++] = class271.field4501;
                                continue;
                            }
                            if (var486 == 5608) {
                                class291.field4872[var6++] = class242.field4003;
                                continue;
                            }
                            if (var486 == 5609) {
                                class291.field4872[var6++] = class189.field3069;
                                continue;
                            }
                            if (var486 == 5610) {
                                for (int var242 = 0; var242 < 5; var242++) {
                                    class247.field4096[var7++] = class244.field4032.length > var242 ? class244.field4032[var242].method372((byte) -101) : class228.field3764;
                                }
                                class244.field4032 = null;
                                continue;
                            }
                            if (var486 == 5611) {
                                class291.field4872[var6++] = class249.field4111;
                                continue;
                            }
                        } else if (var486 < 6100) {
                            if (var486 == 6001) {
                                var6--;
                                int var232 = class291.field4872[var6];
                                if (var232 < 1) {
                                    var232 = 1;
                                }
                                if (var232 > 4) {
                                    var232 = 4;
                                }
                                class162.field2692 = var232;
                                if (!class21.field350 || !class1.field8) {
                                    if (class162.field2692 == 1) {
                                        class203.method1422(0.9F);
                                    }
                                    if (class162.field2692 == 2) {
                                        class203.method1422(0.8F);
                                    }
                                    if (class162.field2692 == 3) {
                                        class203.method1422(0.7F);
                                    }
                                    if (class162.field2692 == 4) {
                                        class203.method1422(0.6F);
                                    }
                                }
                                if (class21.field350) {
                                    class153.method1195(arg0 ^ 0xBD38EE14);
                                    if (!class1.field8) {
                                        class48.method430(-77);
                                    }
                                }
                                class55.method469((byte) 36);
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6002) {
                                var6--;
                                class129.method963(false, class291.field4872[var6] == 1);
                                class314.method2166(arg0 + 23511);
                                class48.method430(-78);
                                class255.method1795((byte) 124);
                                class94.method714(arg0 ^ 0xFFFFE3F3, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6003) {
                                var6--;
                                class194.field3131 = class291.field4872[var6] == 1;
                                class255.method1795((byte) 124);
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6005) {
                                var6--;
                                class217.field3623 = class291.field4872[var6] == 1;
                                class48.method430(arg0 ^ 0x1C43);
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6006) {
                                var6--;
                                class81.field1429 = class291.field4872[var6] == 1;
                                ((class212) class203.field3217).method1492(!class81.field1429, 2);
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6007) {
                                var6--;
                                class250.field4144 = class291.field4872[var6] == 1;
                                class94.method714(arg0 ^ 0xFFFFE3F3, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6008) {
                                var6--;
                                class223.field3704 = class291.field4872[var6] == 1;
                                class94.method714(arg0 ^ 0xFFFFE3F3, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6009) {
                                var6--;
                                class104.field1847 = class291.field4872[var6] == 1;
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6010) {
                                var6--;
                                class96.field1728 = class291.field4872[var6] == 1;
                                class94.method714(arg0 ^ 0xFFFFE3F3, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6011) {
                                var6--;
                                int var233 = class291.field4872[var6];
                                if (var233 < 0 || var233 > 2) {
                                    var233 = 0;
                                }
                                class285.field4804 = var233;
                                class94.method714(arg0 ^ 0xFFFFE3F3, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6012) {
                                if (class21.field350) {
                                    class60.method504(0, 0, 20789);
                                }
                                var6--;
                                class1.field8 = class291.field4872[var6] == 1;
                                if (class21.field350 && class1.field8) {
                                    class203.method1422(0.7F);
                                } else {
                                    if (class162.field2692 == 1) {
                                        class203.method1422(0.9F);
                                    }
                                    if (class162.field2692 == 2) {
                                        class203.method1422(0.8F);
                                    }
                                    if (class162.field2692 == 3) {
                                        class203.method1422(0.7F);
                                    }
                                    if (class162.field2692 == 4) {
                                        class203.method1422(0.6F);
                                    }
                                }
                                class48.method430(-100);
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6014) {
                                var6--;
                                class178.field2929 = class291.field4872[var6] == 1;
                                if (class21.field350) {
                                    class48.method430(-109);
                                }
                                class94.method714(arg0 + 7183, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6015) {
                                var6--;
                                class206.field3287 = class291.field4872[var6] == 1;
                                if (class21.field350) {
                                    class153.method1195(1120341478);
                                }
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6016) {
                                var6--;
                                int var234 = class291.field4872[var6];
                                if (class21.field350) {
                                    class156.field2617 = true;
                                }
                                if (var234 < 0 || var234 > 2) {
                                    var234 = 0;
                                }
                                class104.field1848 = var234;
                                continue;
                            }
                            if (var486 == 6017) {
                                var6--;
                                class142.field2387 = class291.field4872[var6] == 1;
                                class284.method1979(117);
                                class94.method714(arg0 + 7183, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6018) {
                                var6--;
                                int var235 = class291.field4872[var6];
                                if (var235 < 0) {
                                    var235 = 0;
                                }
                                if (var235 > 127) {
                                    var235 = 127;
                                }
                                class94.field1698 = var235;
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6019) {
                                var6--;
                                int var236 = class291.field4872[var6];
                                if (var236 < 0) {
                                    var236 = 0;
                                }
                                if (var236 > 255) {
                                    var236 = 255;
                                }
                                if (class90.field1636 != var236) {
                                    if (class90.field1636 == 0 && class217.field3611 != -1) {
                                        class150.method1127(false, 0, class199.field3189, (byte) 117, var236, class217.field3611);
                                        class101.field1775 = false;
                                    } else if (var236 == 0) {
                                        class188.method1356((byte) 91);
                                        class101.field1775 = false;
                                    } else {
                                        class309.method2112(var236, (byte) 118);
                                    }
                                    class90.field1636 = var236;
                                }
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6020) {
                                var6--;
                                int var237 = class291.field4872[var6];
                                if (var237 < 0) {
                                    var237 = 0;
                                }
                                if (var237 > 127) {
                                    var237 = 127;
                                }
                                class105.field1854 = var237;
                                class94.method714(1, class275.field4573);
                                client.field4051 = false;
                                continue;
                            }
                            if (var486 == 6021) {
                                var6--;
                                class314.field5309 = class291.field4872[var6] == 1;
                                class255.method1795((byte) 124);
                                continue;
                            }
                            if (var486 == 6024) {
                                var6--;
                                int var238 = class291.field4872[var6];
                                if (var238 < 0 || var238 > 2) {
                                    var238 = 0;
                                }
                                class296.field4952 = var238;
                                class94.method714(arg0 ^ 0xFFFFE3F3, class275.field4573);
                                continue;
                            }
                        } else if (var486 < 6200) {
                            if (var486 == 6101) {
                                class291.field4872[var6++] = class162.field2692;
                                continue;
                            }
                            if (var486 == 6102) {
                                class291.field4872[var6++] = class118.method893(2) ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6103) {
                                class291.field4872[var6++] = class194.field3131 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6105) {
                                class291.field4872[var6++] = class217.field3623 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6106) {
                                class291.field4872[var6++] = class81.field1429 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6107) {
                                class291.field4872[var6++] = class250.field4144 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6108) {
                                class291.field4872[var6++] = class223.field3704 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6109) {
                                class291.field4872[var6++] = class104.field1847 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6110) {
                                class291.field4872[var6++] = class96.field1728 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6111) {
                                class291.field4872[var6++] = class285.field4804;
                                continue;
                            }
                            if (var486 == 6112) {
                                class291.field4872[var6++] = class1.field8 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6114) {
                                class291.field4872[var6++] = class178.field2929 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6115) {
                                class291.field4872[var6++] = class206.field3287 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6116) {
                                class291.field4872[var6++] = class104.field1848;
                                continue;
                            }
                            if (var486 == 6117) {
                                class291.field4872[var6++] = class142.field2387 ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6118) {
                                class291.field4872[var6++] = class94.field1698;
                                continue;
                            }
                            if (var486 == 6119) {
                                class291.field4872[var6++] = class90.field1636;
                                continue;
                            }
                            if (var486 == 6120) {
                                class291.field4872[var6++] = class105.field1854;
                                continue;
                            }
                            if (var486 == 6121) {
                                if (class21.field350) {
                                    class291.field4872[var6++] = class21.field363 ? 1 : 0;
                                } else {
                                    class291.field4872[var6++] = 0;
                                }
                                continue;
                            }
                            if (var486 == 6124) {
                                class291.field4872[var6++] = class296.field4952;
                                continue;
                            }
                        } else if (var486 < 6300) {
                            if (var486 == 6200) {
                                var6 -= 2;
                                class15.field253 = (short) class291.field4872[var6];
                                if (class15.field253 <= 0) {
                                    class15.field253 = 256;
                                }
                                class98.field1758 = (short) class291.field4872[var6 + 1];
                                if (class98.field1758 <= 0) {
                                    class98.field1758 = 205;
                                }
                                continue;
                            }
                            if (var486 == 6201) {
                                var6 -= 2;
                                class48.field932 = (short) class291.field4872[var6];
                                if (class48.field932 <= 0) {
                                    class48.field932 = 256;
                                }
                                class20.field341 = (short) class291.field4872[var6 + 1];
                                if (class20.field341 <= 0) {
                                    class20.field341 = 320;
                                }
                                continue;
                            }
                            if (var486 == 6202) {
                                var6 -= 4;
                                class34.field673 = (short) class291.field4872[var6];
                                if (class34.field673 <= 0) {
                                    class34.field673 = 1;
                                }
                                class177.field2916 = (short) class291.field4872[var6 + 1];
                                if (class177.field2916 <= 0) {
                                    class177.field2916 = 32767;
                                } else if (class34.field673 > class177.field2916) {
                                    class177.field2916 = class34.field673;
                                }
                                class60.field1156 = (short) class291.field4872[var6 + 2];
                                if (class60.field1156 <= 0) {
                                    class60.field1156 = 1;
                                }
                                class134.field2269 = (short) class291.field4872[var6 + 3];
                                if (class134.field2269 <= 0) {
                                    class134.field2269 = 32767;
                                } else if (class60.field1156 > class134.field2269) {
                                    class134.field2269 = class60.field1156;
                                }
                                continue;
                            }
                            if (var486 == 6203) {
                                class257.method1808(0, 0, 83, class221.field3671.field3502, class221.field3671.field3565, false);
                                class291.field4872[var6++] = class130.field2225;
                                class291.field4872[var6++] = class265.field4448;
                                continue;
                            }
                            if (var486 == 6204) {
                                class291.field4872[var6++] = class48.field932;
                                class291.field4872[var6++] = class20.field341;
                                continue;
                            }
                            if (var486 == 6205) {
                                class291.field4872[var6++] = class15.field253;
                                class291.field4872[var6++] = class98.field1758;
                                continue;
                            }
                        } else if (var486 < 6400) {
                            if (var486 == 6300) {
                                class291.field4872[var6++] = (int) (class69.method535(true) / 60000L);
                                continue;
                            }
                            if (var486 == 6301) {
                                class291.field4872[var6++] = (int) (class69.method535(true) / 86400000L) - 11745;
                                continue;
                            }
                            if (var486 == 6302) {
                                var6 -= 3;
                                int var227 = class291.field4872[var6];
                                int var228 = class291.field4872[var6 + 1];
                                int var229 = class291.field4872[var6 + 2];
                                class192.field3097.clear();
                                class192.field3097.set(11, 12);
                                class192.field3097.set(var229, var228, var227);
                                class291.field4872[var6++] = (int) (class192.field3097.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var486 == 6303) {
                                class192.field3097.clear();
                                class192.field3097.setTime(new Date(class69.method535(true)));
                                class291.field4872[var6++] = class192.field3097.get(1);
                                continue;
                            }
                            if (var486 == 6304) {
                                var6--;
                                int var230 = class291.field4872[var6];
                                boolean var231 = true;
                                if (var230 < 0) {
                                    var231 = ((var230 + 1) % 4) == 0;
                                } else if (var230 < 1582) {
                                    var231 = var230 % 4 == 0;
                                } else if ((var230 % 4) != 0) {
                                    var231 = false;
                                } else if (var230 % 100 != 0) {
                                    var231 = true;
                                } else if ((var230 % 400) != 0) {
                                    var231 = false;
                                }
                                class291.field4872[var6++] = var231 ? 1 : 0;
                                continue;
                            }
                        } else if (var486 < 6500) {
                            if (var486 == 6405) {
                                class291.field4872[var6++] = class7.method35(15) ? 1 : 0;
                                continue;
                            }
                            if (var486 == 6406) {
                                class291.field4872[var6++] = class3.method12((byte) -47) ? 1 : 0;
                                continue;
                            }
                        } else if (var486 < 6600) {
                            if (var486 == 6500) {
                                if (class6.field87 == 10 && class194.field3134 == 0 && class54.field1062 == 0 && class272.field4520 == 0) {
                                    class291.field4872[var6++] = class271.method1876(true) == -1 ? 0 : 1;
                                    continue;
                                }
                                class291.field4872[var6++] = 1;
                                continue;
                            }
                            if (var486 == 6501) {
                                class291 var215 = class103.method774(16969);
                                if (var215 == null) {
                                    class291.field4872[var6++] = -1;
                                    class291.field4872[var6++] = 0;
                                    class247.field4096[var7++] = class228.field3764;
                                    class291.field4872[var6++] = 0;
                                    class247.field4096[var7++] = class228.field3764;
                                    class291.field4872[var6++] = 0;
                                } else {
                                    class291.field4872[var6++] = var215.field4866;
                                    class291.field4872[var6++] = var215.field684;
                                    class247.field4096[var7++] = var215.field4864;
                                    class256 var216 = var215.method2004(-1);
                                    class291.field4872[var6++] = var216.field4271;
                                    class247.field4096[var7++] = var216.field4263;
                                    class291.field4872[var6++] = var215.field681;
                                }
                                continue;
                            }
                            if (var486 == 6502) {
                                class291 var217 = class89.method687((byte) 69);
                                if (var217 == null) {
                                    class291.field4872[var6++] = -1;
                                    class291.field4872[var6++] = 0;
                                    class247.field4096[var7++] = class228.field3764;
                                    class291.field4872[var6++] = 0;
                                    class247.field4096[var7++] = class228.field3764;
                                    class291.field4872[var6++] = 0;
                                } else {
                                    class291.field4872[var6++] = var217.field4866;
                                    class291.field4872[var6++] = var217.field684;
                                    class247.field4096[var7++] = var217.field4864;
                                    class256 var218 = var217.method2004(-1);
                                    class291.field4872[var6++] = var218.field4271;
                                    class247.field4096[var7++] = var218.field4263;
                                    class291.field4872[var6++] = var217.field681;
                                }
                                continue;
                            }
                            if (var486 == 6503) {
                                var6--;
                                int var219 = class291.field4872[var6];
                                if (class6.field87 == 10 && class194.field3134 == 0 && class54.field1062 == 0 && class272.field4520 == 0) {
                                    class291.field4872[var6++] = class54.method464((byte) 108, var219) ? 1 : 0;
                                    continue;
                                }
                                class291.field4872[var6++] = 0;
                                continue;
                            }
                            if (var486 == 6504) {
                                var6--;
                                class213.field3497 = class291.field4872[var6];
                                class94.method714(arg0 ^ 0xFFFFE3F3, class275.field4573);
                                continue;
                            }
                            if (var486 == 6505) {
                                class291.field4872[var6++] = class213.field3497;
                                continue;
                            }
                            if (var486 == 6506) {
                                var6--;
                                int var220 = class291.field4872[var6];
                                class291 var221 = class78.method579(var220, true);
                                if (var221 == null) {
                                    class291.field4872[var6++] = -1;
                                    class247.field4096[var7++] = class228.field3764;
                                    class291.field4872[var6++] = 0;
                                    class247.field4096[var7++] = class228.field3764;
                                    class291.field4872[var6++] = 0;
                                } else {
                                    class291.field4872[var6++] = var221.field684;
                                    class247.field4096[var7++] = var221.field4864;
                                    class256 var222 = var221.method2004(arg0 ^ 0x1C0D);
                                    class291.field4872[var6++] = var222.field4271;
                                    class247.field4096[var7++] = var222.field4263;
                                    class291.field4872[var6++] = var221.field681;
                                }
                                continue;
                            }
                            if (var486 == 6507) {
                                var6 -= 4;
                                boolean var223 = class291.field4872[var6 + 1] == 1;
                                int var224 = class291.field4872[var6];
                                int var225 = class291.field4872[var6 + 2];
                                boolean var226 = class291.field4872[var6 + 3] == 1;
                                class307.method2102(var226, var225, var224, var223, 0);
                                continue;
                            }
                        }
                    } else if (var486 == 4500) {
                        var6 -= 2;
                        int var293 = class291.field4872[var6 + 1];
                        int var294 = class291.field4872[var6];
                        class290 var295 = class19.method115(var293, (byte) 69);
                        if (var295.method2002(115)) {
                            class247.field4096[var7++] = class134.method990((byte) -33, var294).method1213(var295.field4863, false, var293);
                        } else {
                            class291.field4872[var6++] = class134.method990((byte) -116, var294).method1211((byte) -86, var293, var295.field4847);
                        }
                        continue;
                    }
                } else {
                    class213 var467;
                    if (var486 < 2000) {
                        var467 = var46 ? class315.field5324 : class148.field2489;
                    } else {
                        var486 -= 1000;
                        var6--;
                        var467 = class314.method2172((byte) -113, class291.field4872[var6]);
                    }
                    if (var486 == 1300) {
                        var6--;
                        int var468 = class291.field4872[var6] - 1;
                        if (var468 >= 0 && var468 <= 9) {
                            var7--;
                            var467.method1502(class247.field4096[var7], (byte) -125, var468);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var486 == 1301) {
                        var6 -= 2;
                        int var469 = class291.field4872[var6];
                        int var470 = class291.field4872[var6 + 1];
                        var467.field3446 = class211.method1483(var470, var469, -17970);
                        continue;
                    }
                    if (var486 == 1302) {
                        var6--;
                        var467.field3469 = class291.field4872[var6] == 1;
                        continue;
                    }
                    if (var486 == 1303) {
                        var6--;
                        var467.field3467 = class291.field4872[var6];
                        continue;
                    }
                    if (var486 == 1304) {
                        var6--;
                        var467.field3488 = class291.field4872[var6];
                        continue;
                    }
                    if (var486 == 1305) {
                        var7--;
                        var467.field3535 = class247.field4096[var7];
                        continue;
                    }
                    if (var486 == 1306) {
                        var7--;
                        var467.field3531 = class247.field4096[var7];
                        continue;
                    }
                    if (var486 == 1307) {
                        var467.field3432 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var485) {
            if (var5.field1950 == null) {
                if (class188.field3049 != 0) {
                    class303.method2071(class228.field3764, 126, 0, class95.field1719);
                }
                class44.method412(var485, -14997, "CS2 - scr:" + var5.field5149 + " op:" + var11);
            } else {
                class40 var481 = class29.method274((byte) -118, 30);
                var481.method334(class312.field5260, false).method334(var5.field1950, false);
                for (int var482 = class41.field779 - 1; var482 >= 0; var482--) {
                    var481.method334(class225.field3735, false).method334(class9.field146[var482].field2804.field1950, false);
                }
                if (var11 == 40) {
                    int var483 = var10[var8];
                    var481.method334(class258.field4303, false).method334(class276.method1927((byte) -81, var483), false);
                }
                if (class188.field3049 != 0) {
                    class303.method2071(class228.field3764, 34, 0, class153.method1192(new class40[] { class284.field4772, var5.field1950 }, (byte) 122));
                }
                class44.method412(var485, arg0 ^ 0x2699, "CS2 - scr:" + var5.field5149 + " op:" + var11 + new String(var481.method360(-20563)));
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(II)Z", line = 6872)
    public final boolean method1676(int arg0, int arg1) {
        field3972++;
        if (!this.method1652((byte) 103)) {
            return false;
        } else if (this.field3971.field25.length == 1) {
            return this.method1657(0, 0, arg0);
        } else if (arg1 != -20034) {
            return false;
        } else if (!this.method1645(arg0, 2)) {
            return false;
        } else if (this.field3971.field25[arg0] == 1) {
            return this.method1657(arg0, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lof;ZZ)V", line = 7317)
    public class239(class230 arg0, boolean arg1, boolean arg2) {
        this.field3973 = arg1;
        this.field3940 = arg0;
        this.field3969 = arg2;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)I", line = 6903)
    public final int method1677(byte arg0) {
        field3927++;
        if (!this.method1652((byte) 103)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = -1 / ((54 - arg0) / 51);
        for (int var5 = 0; var5 < this.field3951.length; var5++) {
            if (this.field3971.field44[var5] > 0) {
                var2 += 100;
                var3 += this.method1654(var5, true);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V", line = 6941)
    public final void method1678(byte arg0) {
        field3938++;
        if (arg0 != -82) {
            field3930 = (class40) null;
        }
        if (this.field3953 != null) {
            for (int var2 = 0; var2 < this.field3953.length; var2++) {
                this.field3953[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "(B)V", line = 6967)
    public static final void method1679(byte arg0) {
        field3949++;
        int var1 = 82 / ((arg0 + 56) / 41);
        if (class244.field4029) {
            class194.field3132 = null;
            class244.field4029 = false;
            class308.field5165 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BLqd;Lqd;)[B", line = 6983)
    public final byte[] method1680(byte arg0, class40 arg1, class40 arg2) {
        field3937++;
        if (arg0 != 34) {
            this.method1651(35, -117, -104);
        }
        if (!this.method1652((byte) 103)) {
            return null;
        }
        class40 var4 = arg2.method337(40);
        class40 var5 = arg1.method337(40);
        int var6 = this.field3971.field47.method1256(26398, var4.method369(0));
        if (this.method1645(var6, arg0 - 32)) {
            int var7 = this.field3971.field41[var6].method1256(arg0 ^ 0x673C, var5.method369(arg0 - 34));
            return this.method1651(var6, var7, -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIIIIIZI)Z", line = 7008)
    public static final boolean method1681(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field3943++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class5.field58[var12][var13] = 0;
                class272.field4514[var12][var13] = 99999999;
            }
        }
        class5.field58[arg6][arg1] = 99;
        int var14 = arg1;
        int var15 = arg6;
        class272.field4514[arg6][arg1] = 0;
        byte var16 = 0;
        boolean var17 = false;
        int var18 = 0;
        class71.field1266[var16] = arg6;
        int var32 = var16 + 1;
        class308.field5169[var16] = arg1;
        int[][] var19 = class255.field4247[class160.field2671].field839;
        while (var32 != var18) {
            var15 = class71.field1266[var18];
            var14 = class308.field5169[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg7 == var15 && arg8 == var14) {
                var17 = true;
                break;
            }
            if (arg4 != 0) {
                if ((arg4 < 5 || arg4 == 10) && class255.field4247[class160.field2671].method411(var14, (byte) 84, var15, arg8, arg7, arg4 - 1, arg5, 1)) {
                    var17 = true;
                    break;
                }
                if (arg4 < 10 && class255.field4247[class160.field2671].method405(arg7, arg4 - 1, arg5, var14, false, arg8, 1, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg3 != 0 && class255.field4247[class160.field2671].method408(arg0, false, arg7, arg8, var14, var15, arg9, arg3, 1)) {
                var17 = true;
                break;
            }
            int var20 = class272.field4514[var15][var14] + 1;
            if (var15 > 0 && class5.field58[var15 - 1][var14] == 0 && (var19[var15 - 1][var14] & 0x12C0108) == 0) {
                class71.field1266[var32] = var15 - 1;
                class308.field5169[var32] = var14;
                class5.field58[var15 - 1][var14] = 2;
                class272.field4514[var15 - 1][var14] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 103 && class5.field58[var15 + 1][var14] == 0 && (var19[var15 + 1][var14] & 0x12C0180) == 0) {
                class71.field1266[var32] = var15 + 1;
                class308.field5169[var32] = var14;
                class5.field58[var15 + 1][var14] = 8;
                class272.field4514[var15 + 1][var14] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && class5.field58[var15][var14 - 1] == 0 && (var19[var15][var14 - 1] & 0x12C0102) == 0) {
                class71.field1266[var32] = var15;
                class308.field5169[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class5.field58[var15][var14 - 1] = 1;
                class272.field4514[var15][var14 - 1] = var20;
            }
            if (var14 < 103 && class5.field58[var15][var14 + 1] == 0 && (var19[var15][var14 + 1] & 0x12C0120) == 0) {
                class71.field1266[var32] = var15;
                class308.field5169[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class5.field58[var15][var14 + 1] = 4;
                class272.field4514[var15][var14 + 1] = var20;
            }
            if (var15 > 0 && var14 > 0 && class5.field58[var15 - 1][var14 - 1] == 0 && (var19[var15 - 1][var14 - 1] & 0x12C010E) == 0 && (var19[var15 - 1][var14] & 0x12C0108) == 0 && (var19[var15][var14 - 1] & 0x12C0102) == 0) {
                class71.field1266[var32] = var15 - 1;
                class308.field5169[var32] = var14 - 1;
                class5.field58[var15 - 1][var14 - 1] = 3;
                class272.field4514[var15 - 1][var14 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 103 && var14 > 0 && class5.field58[var15 + 1][var14 - 1] == 0 && (var19[var15 + 1][var14 - 1] & 0x12C0183) == 0 && (var19[var15 + 1][var14] & 0x12C0180) == 0 && (var19[var15][var14 - 1] & 0x12C0102) == 0) {
                class71.field1266[var32] = var15 + 1;
                class308.field5169[var32] = var14 - 1;
                class5.field58[var15 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class272.field4514[var15 + 1][var14 - 1] = var20;
            }
            if (var15 > 0 && var14 < 103 && class5.field58[var15 - 1][var14 + 1] == 0 && (var19[var15 - 1][var14 + 1] & 0x12C0138) == 0 && (var19[var15 - 1][var14] & 0x12C0108) == 0 && (var19[var15][var14 + 1] & 0x12C0120) == 0) {
                class71.field1266[var32] = var15 - 1;
                class308.field5169[var32] = var14 + 1;
                class5.field58[var15 - 1][var14 + 1] = 6;
                class272.field4514[var15 - 1][var14 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 103 && var14 < 103 && class5.field58[var15 + 1][var14 + 1] == 0 && (var19[var15 + 1][var14 + 1] & 0x12C01E0) == 0 && (var19[var15 + 1][var14] & 0x12C0180) == 0 && (var19[var15][var14 + 1] & 0x12C0120) == 0) {
                class71.field1266[var32] = var15 + 1;
                class308.field5169[var32] = var14 + 1;
                class5.field58[var15 + 1][var14 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class272.field4514[var15 + 1][var14 + 1] = var20;
            }
        }
        class303.field5081 = 0;
        if (!var17) {
            if (!arg10) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg7 - var22; var24 <= arg7 + var22; var24++) {
                for (int var25 = arg8 - var22; var25 <= arg8 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class272.field4514[var24][var25] < 100) {
                        int var26 = 0;
                        if (var25 < arg8) {
                            var26 = arg8 - var25;
                        } else if (arg3 + arg8 - 1 < var25) {
                            var26 = var25 - (arg8 - 1) - arg3;
                        }
                        int var27 = 0;
                        if (arg7 > var24) {
                            var27 = arg7 - var24;
                        } else if (arg0 + arg7 - 1 < var24) {
                            var27 = 1 - arg7 - (arg0 - var24);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && var23 > class272.field4514[var24][var25]) {
                            var14 = var25;
                            var23 = class272.field4514[var24][var25];
                            var15 = var24;
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg6 == var15 && arg1 == var14) {
                return false;
            }
            class303.field5081 = 1;
        }
        byte var29 = 0;
        if (arg2 >= -16) {
            field3942 = (class40) null;
        }
        class71.field1266[var29] = var15;
        int var33 = var29 + 1;
        class308.field5169[var29] = var14;
        int var30;
        int var31 = var30 = class5.field58[var15][var14];
        while (arg6 != var15 || arg1 != var14) {
            if (var30 != var31) {
                var30 = var31;
                class71.field1266[var33] = var15;
                class308.field5169[var33++] = var14;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var14++;
            } else if ((var31 & 0x4) != 0) {
                var14--;
            }
            var31 = class5.field58[var15][var14];
        }
        if (var33 > 0) {
            class226.method1586(arg11, var33, -9065);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILqd;)Z", line = 7296)
    public final boolean method1682(int arg0, class40 arg1) {
        field3931++;
        if (this.method1652((byte) 103)) {
            class40 var3 = arg1.method337(40);
            int var4 = this.field3971.field47.method1256(26398, var3.method369(0));
            return arg0 >= -63 ? true : this.method1648(false, var4);
        } else {
            return false;
        }
    }
}
