import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class172 {

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lwm;")
    private class89 field2826 = null;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "Lrk;")
    private class277 field2835;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "Z")
    private boolean field2844;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "Z")
    private boolean field2846;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "Lbl;")
    public static class191 field2853 = new class191();

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Ldb;")
    public static class102 field2858 = new class102(5);

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "Ljava/lang/String;")
    public static String field2862 = "flash1:";

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field2840;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field2863;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Lak;")
    public static class172 field2864;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "[Ljava/lang/Object;")
    private Object[] field2842;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2861;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)Z", line = 4)
    public final boolean method1269(int arg0, int arg1, byte arg2) {
        field2829++;
        if (!this.method1284(0, arg0, arg1)) {
            return false;
        } else if (this.field2861[arg1] != null && this.field2861[arg1][arg0] != null) {
            return true;
        } else if (this.field2842[arg1] == null) {
            if (arg2 > -11) {
                field2853 = (class191) null;
            }
            this.method1297(-112, arg1);
            return this.field2842[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)I", line = 30)
    public final int method1270(int arg0) {
        field2847++;
        if (!this.method1301(32141)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != -23483) {
            this.field2835 = (class277) null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2842.length; var4++) {
            if (this.field2826.field1231[var4] > 0) {
                var3 += this.method1290(var4, (byte) 22);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZBZ)V", line = 72)
    public final void method1271(boolean arg0, byte arg1, boolean arg2) {
        field2833++;
        if (arg1 >= -36) {
            this.method1301(114);
        }
        if (!this.method1301(32141)) {
            return;
        }
        if (arg2) {
            this.field2826.field1233 = null;
            this.field2826.field1244 = null;
        }
        if (arg0) {
            this.field2826.field1245 = (int[][]) null;
            this.field2826.field1223 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)[B", line = 100)
    public final byte[] method1272(int arg0, int arg1, int arg2) {
        field2843++;
        if (!this.method1284(0, arg1, arg0)) {
            return null;
        }
        if (this.field2861[arg0] == null || this.field2861[arg0][arg1] == null) {
            boolean var4 = this.method1275(arg0, 61, (int[]) null);
            if (!var4) {
                this.method1297(-118, arg0);
                boolean var5 = this.method1275(arg0, 97, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg2 <= 91 ? (byte[]) null : class336.method2348(false, true, this.field2861[arg0][arg1]);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I[IIB)[B", line = 135)
    public final byte[] method1273(int arg0, int[] arg1, int arg2, byte arg3) {
        field2860++;
        if (arg3 != -71) {
            this.method1280((byte) -27, -47);
        }
        if (!this.method1284(0, arg2, arg0)) {
            return null;
        }
        if (this.field2861[arg0] == null || this.field2861[arg0][arg2] == null) {
            boolean var5 = this.method1275(arg0, arg3 ^ 0xFFFFFFF5, arg1);
            if (!var5) {
                this.method1297(arg3 - 57, arg0);
                boolean var6 = this.method1275(arg0, 56, arg1);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class336.method2348(false, true, this.field2861[arg0][arg2]);
        if (this.field2846) {
            this.field2861[arg0][arg2] = null;
            if (this.field2826.field1239[arg0] == 1) {
                this.field2861[arg0] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;)I", line = 175)
    public static final int method1274(int arg0, String arg1) {
        field2841++;
        if (class20.field289 == null || arg1.length() == 0) {
            return -1;
        }
        if (arg0 != -1) {
            field2858 = (class102) null;
        }
        for (int var2 = 0; var2 < class20.field289.field3270; var2++) {
            if (class94.method627(class115.method791(arg0 ^ 0x7F, " ", "<br>", class20.field289.field3262[var2]), 128, arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[I)Z", line = 210)
    private final boolean method1275(int arg0, int arg1, int[] arg2) {
        field2825++;
        if (!this.method1279(78, arg0)) {
            return false;
        } else if (this.field2842[arg0] == null) {
            return false;
        } else {
            int var4 = this.field2826.field1231[arg0];
            int[] var5 = this.field2826.field1241[arg0];
            if (arg1 < 8) {
                this.field2842 = (Object[]) null;
            }
            boolean var6 = true;
            if (this.field2861[arg0] == null) {
                this.field2861[arg0] = new Object[this.field2826.field1239[arg0]];
            }
            Object[] var7 = this.field2861[arg0];
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
                var10 = class336.method2348(true, true, this.field2842[arg0]);
                class44 var11 = new class44(var10);
                var11.method285(arg2, 5, var11.field573.length, 18);
            } else {
                var10 = class336.method2348(false, true, this.field2842[arg0]);
            }
            byte[] var12;
            try {
                var12 = class144.method1062(0, var10);
            } catch (RuntimeException var31) {
                throw class217.method1548(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class179.method1341((byte) -81, var10.length, var10) + "," + class179.method1341((byte) -81, var10.length - 2, var10) + "," + this.field2826.field1243[arg0] + "," + this.field2826.field1236);
            }
            if (this.field2844) {
                this.field2842[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class44 var16 = new class44(var12);
                int[] var17 = new int[var4];
                int var18 = var32 - var4 * var15 * 4;
                var16.field586 = var18;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 != null) {
                        }
                        var20 += var16.method238((byte) 82);
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                var16.field586 = var18;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method238((byte) 82);
                        class9.method46(var12, var24, var22[var27], var17[var27], var26);
                        var24 += var26;
                        var17[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field2846) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class20.method109(false, -55, var22[var28]);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field2846) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class20.method109(false, -57, var12);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Z", line = 406)
    public final boolean method1276(int arg0, int arg1) {
        field2824++;
        if (!this.method1301(32141)) {
            return false;
        }
        int var3 = -109 % ((arg1 - 8) / 47);
        if (this.field2826.field1239.length == 1) {
            return this.method1269(arg0, 0, (byte) -36);
        } else if (!this.method1279(12, arg0)) {
            return false;
        } else if (this.field2826.field1239[arg0] == 1) {
            return this.method1269(0, arg0, (byte) -37);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V", line = 434)
    public final void method1277(int arg0, int arg1) {
        field2830++;
        int var3 = -99 / ((arg1 + 27) / 63);
        if (this.method1279(106, arg0) && this.field2861 != null) {
            this.field2861[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 452)
    public final boolean method1278(int arg0, String arg1) {
        field2856++;
        if (!this.method1301(32141)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2826.field1244.method1639(class62.method422(var3, -15), 121);
        if (var4 >= 0) {
            if (arg0 > -31) {
                this.method1299(77, (byte) -114);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Z", line = 478)
    private final boolean method1279(int arg0, int arg1) {
        field2849++;
        if (!this.method1301(32141)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field2826.field1239.length && this.field2826.field1239[arg1] != 0) {
            if (arg0 < 1) {
                this.field2861 = (Object[][]) ((Object[][]) null);
            }
            return true;
        } else if (class198.field3223) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Z", line = 505)
    public final boolean method1280(byte arg0, int arg1) {
        if (arg0 > -83) {
            field2858 = (class102) null;
        }
        field2845++;
        if (!this.method1279(74, arg1)) {
            return false;
        } else if (this.field2842[arg1] == null) {
            this.method1297(-114, arg1);
            return this.field2842[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(II)V", line = 527)
    private final void method1281(int arg0, int arg1) {
        field2855++;
        this.field2835.method1990(arg1, arg0 ^ 0x2);
        if (arg0 != 0) {
            field2853 = (class191) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 540)
    public final void method1282(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (this.field2861 != null) {
            for (int var2 = 0; var2 < this.field2861.length; var2++) {
                this.field2861[var2] = null;
            }
        }
        field2848++;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V", line = 566)
    public static void method1283(int arg0) {
        field2864 = null;
        field2862 = null;
        field2853 = null;
        if (arg0 != 0) {
            field2864 = (class172) null;
        }
        field2858 = null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)Z", line = 579)
    private final boolean method1284(int arg0, int arg1, int arg2) {
        field2822++;
        if (!this.method1301(32141)) {
            return false;
        } else if (arg0 <= arg2 && arg1 >= 0 && arg2 < this.field2826.field1239.length && this.field2826.field1239[arg2] > arg1) {
            return true;
        } else if (class198.field3223) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Z)Z", line = 599)
    public final boolean method1285(String arg0, boolean arg1) {
        field2828++;
        if (!this.method1301(32141)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field2826.field1244.method1639(class62.method422(var3, 41), 126);
        if (arg1) {
            method1274(52, (String) null);
        }
        return this.method1280((byte) -92, var4);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 622)
    public final void method1286(String arg0, byte arg1) {
        field2857++;
        if (this.method1301(32141)) {
            String var3 = arg0.toLowerCase();
            int var4 = 118 % ((arg1 + 74) / 50);
            int var5 = this.field2826.field1244.method1639(class62.method422(var3, 105), 117);
            this.method1281(0, var5);
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)[B", line = 642)
    public final byte[] method1287(int arg0, int arg1, int arg2) {
        field2834++;
        if (arg2 != -1) {
            field2866 = -9;
        }
        return this.method1273(arg1, (int[]) null, arg0, (byte) -71);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I", line = 653)
    public final int method1288(int arg0) {
        field2859++;
        if (arg0 != -927) {
            this.field2861 = (Object[][]) ((Object[][]) null);
        }
        if (!this.method1301(32141)) {
            throw new IllegalStateException("");
        }
        return this.field2826.field1236;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(ILjava/lang/String;)I", line = 668)
    public final int method1289(int arg0, String arg1) {
        if (arg0 != 0) {
            return 9;
        }
        field2831++;
        if (this.method1301(32141)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2826.field1244.method1639(class62.method422(var3, 15), 124);
            return this.method1290(var4, (byte) 22);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I", line = 686)
    private final int method1290(int arg0, byte arg1) {
        field2865++;
        if (arg1 != 22) {
            return 28;
        } else if (this.method1279(104, arg0)) {
            return this.field2842[arg0] == null ? this.field2835.method2000(-118121624, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)I", line = 706)
    public final int method1291(int arg0) {
        field2850++;
        if (this.method1301(32141)) {
            return arg0 == 5362 ? this.field2826.field1239.length : 74;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)[B", line = 723)
    public final byte[] method1292(boolean arg0, int arg1) {
        field2827++;
        if (!this.method1301(32141)) {
            return null;
        } else if (this.field2826.field1239.length == 1) {
            return this.method1287(arg1, 0, -1);
        } else if (this.method1279(46, arg1)) {
            if (arg0) {
                this.method1285((String) null, true);
            }
            if (this.field2826.field1239[arg1] != 1) {
                throw new RuntimeException();
            }
            return this.method1287(0, arg1, -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 750)
    public final boolean method1293(String arg0, String arg1, byte arg2) {
        if (arg2 != 15) {
            this.method1286((String) null, (byte) -89);
        }
        field2823++;
        if (!this.method1301(32141)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2826.field1244.method1639(class62.method422(var4, 91), 9);
        if (this.method1279(59, var6)) {
            int var7 = this.field2826.field1223[var6].method1639(class62.method422(var5, 18), 118);
            return this.method1269(var7, var6, (byte) -35);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)[B", line = 775)
    public final byte[] method1294(String arg0, String arg1, boolean arg2) {
        field2832++;
        if (!this.method1301(32141)) {
            return null;
        }
        if (!arg2) {
            field2858 = (class102) null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field2826.field1244.method1639(class62.method422(var4, 30), -32);
        if (this.method1279(14, var6)) {
            int var7 = this.field2826.field1223[var6].method1639(class62.method422(var5, 27), -65);
            return this.method1287(var7, var6, -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)Z", line = 803)
    public final boolean method1295(int arg0) {
        field2852++;
        if (!this.method1301(32141)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2826.field1224.length; var3++) {
            int var4 = this.field2826.field1224[var3];
            if (this.field2842[var4] == null) {
                this.method1297(arg0 ^ 0xFFFFFF8C, var4);
                if (this.field2842[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V", line = 835)
    public static final void method1296(int arg0) {
        field2837++;
        int var1 = 45 % ((arg0 + 21) / 58);
        class106.method732(class105.field1537, (byte) -50);
        int var2 = (class260.field4150 >> 10) + (class205.field3367 >> 3);
        byte var3 = 0;
        int var4 = (class70.field989 >> 3) + (class120.field1825 >> 10);
        byte var5 = 8;
        byte var6 = 8;
        byte var7 = 18;
        class330.field5109 = new int[var7];
        class342.field5319 = new int[var7];
        class23.field317 = new int[var7][4];
        class143.field2233 = new byte[var7][];
        class342.field5328 = new int[var7];
        class150.field2321 = new int[var7];
        class110.field1641 = new int[var7];
        class129.field2017 = new byte[var7][];
        class156.field2413 = new byte[var7][];
        class256.field4120 = new byte[var7][];
        class4.field69 = new byte[var7][];
        class157.field2594 = new int[var7];
        int var8 = 0;
        for (int var9 = (var4 - 6) / 8; var9 <= ((var4 + 6) / 8); var9++) {
            for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                int var11 = (var9 << 8) + var10;
                class330.field5109[var8] = var11;
                class150.field2321[var8] = class234.field3748.method1298((byte) -108, "m" + var9 + "_" + var10);
                class110.field1641[var8] = class234.field3748.method1298((byte) -88, "l" + var9 + "_" + var10);
                class157.field2594[var8] = class234.field3748.method1298((byte) -114, "n" + var9 + "_" + var10);
                class342.field5328[var8] = class234.field3748.method1298((byte) -60, "um" + var9 + "_" + var10);
                class342.field5319[var8] = class234.field3748.method1298((byte) -106, "ul" + var9 + "_" + var10);
                if (class157.field2594[var8] == -1) {
                    class150.field2321[var8] = -1;
                    class110.field1641[var8] = -1;
                    class342.field5328[var8] = -1;
                    class342.field5319[var8] = -1;
                }
                var8++;
            }
        }
        for (int var12 = var8; var12 < class157.field2594.length; var12++) {
            class157.field2594[var12] = -1;
            class150.field2321[var12] = -1;
            class110.field1641[var12] = -1;
            class342.field5328[var12] = -1;
            class342.field5319[var12] = -1;
        }
        class227.method1610(true, -794, var5, var3, var2, var4, var6, false);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)V", line = 923)
    private final void method1297(int arg0, int arg1) {
        if (this.field2844) {
            this.field2842[arg1] = this.field2835.method1987(112, arg1);
        } else {
            this.field2842[arg1] = class20.method109(false, -92, this.field2835.method1987(68, arg1));
        }
        field2863++;
        if (arg0 > -110) {
            this.field2861 = (Object[][]) ((Object[][]) null);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLjava/lang/String;)I", line = 953)
    public final int method1298(byte arg0, String arg1) {
        field2840++;
        if (this.method1301(32141)) {
            String var3 = arg1.toLowerCase();
            int var4 = 106 / ((8 - arg0) / 60);
            int var5 = this.field2826.field1244.method1639(class62.method422(var3, -109), 47);
            return this.method1279(18, var5) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IB)I", line = 972)
    public final int method1299(int arg0, byte arg1) {
        field2854++;
        if (arg1 < 40) {
            this.method1287(70, -28, 50);
        }
        return this.method1279(95, arg0) ? this.field2826.field1239[arg0] : 0;
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lrk;ZZ)V", line = 1051)
    public class172(class277 arg0, boolean arg1, boolean arg2) {
        this.field2835 = arg0;
        this.field2844 = arg1;
        this.field2846 = arg2;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)[I", line = 993)
    public final int[] method1300(int arg0, boolean arg1) {
        field2838++;
        if (!this.method1279(8, arg0)) {
            return null;
        }
        if (!arg1) {
            this.method1293((String) null, (String) null, (byte) -37);
        }
        int[] var3 = this.field2826.field1241[arg0];
        if (var3 == null) {
            var3 = new int[this.field2826.field1231[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "(I)Z", line = 1026)
    private final boolean method1301(int arg0) {
        field2839++;
        if (arg0 != 32141) {
            return true;
        }
        if (this.field2826 == null) {
            this.field2826 = this.field2835.method1991(false);
            if (this.field2826 == null) {
                return false;
            }
            this.field2861 = new Object[this.field2826.field1237][];
            this.field2842 = new Object[this.field2826.field1237];
        }
        return true;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)Lrg;", line = 1063)
    public static final class326 method1302(byte arg0) {
        class326 var1 = new class326(class303.field4757, class243.field3832, class270.field4364[0], class51.field732[0], class102.field1489[0], class184.field3046[0], class278.field4481[0], class205.field3370);
        field2836++;
        if (arg0 < 61) {
            field2866 = -68;
        }
        class106.method727(true);
        return var1;
    }
}
