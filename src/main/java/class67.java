import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class67 extends class110 {

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "Ljava/lang/String;")
    public static String field879 = "Connection lost.";

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "I")
    public static int field883 = 0;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "Z")
    public static boolean field882 = false;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "Ljava/lang/String;")
    public static String field876 = "green:";

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "I")
    public static int field889 = 0;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "[I")
    public static int[] field887 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "Ljava/lang/String;")
    public static String field892 = "Loading sprites - ";

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!uh", name = "L", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "(I)V", line = 6)
    public static void method442(int arg0) {
        field879 = null;
        field887 = null;
        if (arg0 != 0) {
            method446((Object) null, false, true);
        }
        field892 = null;
        field876 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[I", line = 20)
    public final int[] method46(int arg0, int arg1) {
        if (arg0 != 1) {
            return (int[]) null;
        }
        field877++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (this.field1695.field875) {
            int[] var4 = this.method764(0, true, arg1);
            for (int var5 = 0; var5 < class124.field1936; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILre;I)V", line = 53)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field1705 = arg1.method1787(false) == 1;
        }
        field891++;
        if (arg2 >= -37) {
            method443(87, (byte) -64, 41, (class210) null);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IBILlm;)[Lea;", line = 68)
    public static final class235[] method443(int arg0, byte arg1, int arg2, class210 arg3) {
        field885++;
        if (class249.method1680(arg0, arg3, arg2, (byte) 59)) {
            if (arg1 != -6) {
                field889 = -124;
            }
            return class225.method1571(-58);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lf;ZI)V", line = 93)
    public static final void method444(class329 arg0, boolean arg1, int arg2) {
        field884++;
        int var3 = arg0.field5034 == 0 ? arg0.field5018 : arg0.field5034;
        int var4 = arg0.field4932 == 0 ? arg0.field4994 : arg0.field4932;
        if (arg2 != -1245723888) {
            return;
        }
        class290.method2033(var4, arg0.field5086, arg1, false, class278.field4231[arg0.field5086 >> 16], var3);
        if (arg0.field4964 != null) {
            class290.method2033(var4, arg0.field5086, arg1, false, arg0.field4964, var3);
        }
        class167 var5 = (class167) class295.field4522.method1320((long) arg0.field5086, 13002);
        if (var5 != null) {
            class203.method1390(var4, var3, arg1, var5.field2505, (byte) -6);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)[[I", line = 119)
    public final int[][] method445(int arg0, boolean arg1) {
        field881++;
        if (arg1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field1701.method1477((byte) 62, arg0);
        if (this.field1701.field3255) {
            int[][] var4 = this.method770(arg0, (byte) 126, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class124.field1936; var11++) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var7[var11];
                var10[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B", line = 166)
    public static final byte[] method446(Object arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            return (byte[]) null;
        }
        field878++;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg0);
            return arg1 ? class235.method1613(var3, 354978147) : var3;
        } else if ((arg0 instanceof class278)) {
            class278 var4 = (class278) arg0;
            return var4.method1939(12186);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BJLjava/lang/String;ZZIZLjava/lang/String;III)V", line = 208)
    public static final void method447(byte arg0, long arg1, String arg2, boolean arg3, boolean arg4, int arg5, boolean arg6, String arg7, int arg8, int arg9, int arg10) {
        field890++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class263 var14 = new class263(128);
        var14.method1813(-121, 10);
        var14.method1823((arg3 ? 4 : 0) | (arg6 ? 1 : 0) | (arg4 ? 2 : 0), (byte) -31);
        var14.method1816(arg1, 21054);
        var14.method1815(75, var12[0]);
        var14.method1825(arg7, (byte) 105);
        var14.method1815(87, var12[1]);
        var14.method1823(class5.field24, (byte) -99);
        var14.method1813(-83, arg5);
        var14.method1813(30, arg9);
        var14.method1815(119, var12[2]);
        var14.method1823(arg10, (byte) -32);
        var14.method1823(arg8, (byte) -102);
        var14.method1815(87, var12[3]);
        var14.method1796(867204152, class96.field1439, class140.field2114);
        class263 var15 = new class263(350);
        var15.method1825(arg2, (byte) 53);
        int var16 = 8 - (class224.method1565((byte) 123, arg2) % 8);
        if (arg0 > -77) {
            method450(-90, (char) 65464);
        }
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1813(24, (int) (Math.random() * 255.0D));
        }
        var15.method1836(73, var12);
        class234.field3507.field4025 = 0;
        class234.field3507.method1813(-99, 22);
        class234.field3507.method1823(var14.field4025 + var15.field4025 + 2, (byte) -69);
        class234.field3507.method1823(534, (byte) -123);
        class234.field3507.method1814(var14.field4025, -1157288507, var14.field3986, 0);
        class234.field3507.method1814(var15.field4025, -1157288507, var15.field3986, 0);
        class234.field3515 = 1;
        class56.field709 = -3;
        class138.field2095 = 0;
        class126.field1975 = 0;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V", line = 276)
    public class67() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZ)V", line = 284)
    public static final void method448(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        field886++;
        class296.field4534 = arg1;
        if (!class296.field4534) {
            int var2 = class207.field3137.method1849(-75);
            int var3 = class207.field3137.method1835(false);
            int var4 = class207.field3137.method1835(false);
            int var5 = class207.field3137.method1830((byte) -77);
            int var6 = (class3.field13 - class207.field3137.field4025) / 16;
            class51.field637 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class51.field637[var7][var8] = class207.field3137.method1826(-206227536);
                }
            }
            boolean var9 = false;
            int var10 = class207.field3137.method1838((byte) -33);
            class211.field3217 = new int[var6];
            class304.field4631 = new byte[var6][];
            class21.field257 = new byte[var6][];
            if ((var5 / 8 == 48 || (var5 / 8) == 49) && (var10 / 8) == 48) {
                var9 = true;
            }
            class96.field1443 = (byte[][]) null;
            client.field1947 = new int[var6];
            class205.field3100 = new int[var6];
            if (var5 / 8 == 48 && var10 / 8 == 148) {
                var9 = true;
            }
            class158.field2371 = new int[var6];
            class28.field381 = null;
            class110.field1692 = new int[var6];
            class73.field947 = new byte[var6][];
            class21.field262 = new byte[var6][];
            int var11 = 0;
            for (int var12 = (var5 - 6) / 8; var12 <= (var5 + 6) / 8; var12++) {
                for (int var13 = (var10 - 6) / 8; var13 <= (var10 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var9 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        client.field1947[var11] = var14;
                        class110.field1692[var11] = -1;
                        class158.field2371[var11] = -1;
                        class211.field3217[var11] = -1;
                        class205.field3100[var11] = -1;
                    } else {
                        client.field1947[var11] = var14;
                        class110.field1692[var11] = class222.field3389.method1448((byte) 10, "m" + var12 + "_" + var13);
                        class158.field2371[var11] = class222.field3389.method1448((byte) 10, "l" + var12 + "_" + var13);
                        class211.field3217[var11] = class222.field3389.method1448((byte) 10, "um" + var12 + "_" + var13);
                        class205.field3100[var11] = class222.field3389.method1448((byte) 10, "ul" + var12 + "_" + var13);
                    }
                    var11++;
                }
            }
            class30.method196(var3, var10, var4, false, var5, 0, var2);
            return;
        }
        int var15 = class207.field3137.method1807(-100);
        class207.field3137.method25((byte) 7);
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class207.field3137.method24((byte) -122, 1);
                    if (var19 == 1) {
                        class259.field3943[var16][var17][var18] = class207.field3137.method24((byte) -122, 26);
                    } else {
                        class259.field3943[var16][var17][var18] = -1;
                    }
                }
            }
        }
        class207.field3137.method27((byte) 0);
        int var20 = (class3.field13 - class207.field3137.field4025) / 16;
        class51.field637 = new int[var20][4];
        for (int var21 = 0; var21 < var20; var21++) {
            for (int var22 = 0; var22 < 4; var22++) {
                class51.field637[var21][var22] = class207.field3137.method1788(18914);
            }
        }
        int var23 = class207.field3137.method1794(-124);
        int var24 = class207.field3137.method1794(-113);
        int var25 = class207.field3137.method1830((byte) -77);
        int var26 = class207.field3137.method1830((byte) -77);
        class28.field381 = null;
        class110.field1692 = new int[var20];
        class96.field1443 = (byte[][]) null;
        class158.field2371 = new int[var20];
        class304.field4631 = new byte[var20][];
        class21.field262 = new byte[var20][];
        client.field1947 = new int[var20];
        class205.field3100 = new int[var20];
        class21.field257 = new byte[var20][];
        class211.field3217 = new int[var20];
        class73.field947 = new byte[var20][];
        int var27 = 0;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 13; var29++) {
                for (int var30 = 0; var30 < 13; var30++) {
                    int var31 = class259.field3943[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = var31 >> 14 & 0x3FF;
                        int var33 = (var31 & 0x3FFC) >> 3;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (client.field1947[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            client.field1947[var27] = var34;
                            int var36 = var34 >> 8 & 0xFF;
                            int var37 = var34 & 0xFF;
                            class110.field1692[var27] = class222.field3389.method1448((byte) 10, "m" + var36 + "_" + var37);
                            class158.field2371[var27] = class222.field3389.method1448((byte) 10, "l" + var36 + "_" + var37);
                            class211.field3217[var27] = class222.field3389.method1448((byte) 10, "um" + var36 + "_" + var37);
                            class205.field3100[var27] = class222.field3389.method1448((byte) 10, "ul" + var36 + "_" + var37);
                            var27++;
                        }
                    }
                }
            }
        }
        class30.method196(var23, var25, var26, false, var24, 0, var15);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIZ)V", line = 529)
    public static final void method449(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class311.field4734 = arg1;
        class191.field2844 = arg2;
        class90.field1339 = arg3;
        class241.field3585 = new class221[arg0][class311.field4734][class191.field2844];
        class55.field690 = new int[arg0][class311.field4734 + 1][class191.field2844 + 1];
        if (class117.field1817) {
            class209.field3152 = new class86[4][];
        }
        if (arg4) {
            class38.field460 = new class221[1][class311.field4734][class191.field2844];
            class56.field705 = new int[class311.field4734][class191.field2844];
            class318.field4797 = new int[1][class311.field4734 + 1][class191.field2844 + 1];
            if (class117.field1817) {
                class81.field1139 = new class86[1][];
            }
        } else {
            class38.field460 = (class221[][][]) null;
            class56.field705 = (int[][]) null;
            class318.field4797 = (int[][][]) null;
            class81.field1139 = (class86[][]) null;
        }
        class152.method1092(false);
        class154.field2314 = new class44[500];
        class302.field4616 = 0;
        class68.field893 = new class44[500];
        class194.field2896 = 0;
        class3.field18 = new int[arg0][class311.field4734 + 1][class191.field2844 + 1];
        class247.field3686 = new class311[5000];
        class130.field2016 = 0;
        class161.field2411 = new class311[100];
        class293.field4487 = new boolean[class90.field1339 + class90.field1339 + 1][class90.field1339 + class90.field1339 + 1];
        class94.field1419 = new boolean[class90.field1339 + class90.field1339 + 2][class90.field1339 + class90.field1339 + 2];
        class187.field2783 = new byte[arg0][class311.field4734][class191.field2844];
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IC)B", line = 572)
    public static final byte method450(int arg0, char arg1) {
        field880++;
        if (arg0 > -59) {
            field888 = -34;
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }
}
