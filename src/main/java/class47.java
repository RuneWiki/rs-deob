import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class47 {

    @OriginalMember(owner = "client!f", name = "m", descriptor = "Z")
    private boolean field849;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "Z")
    private boolean field840;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lsd;")
    public static class166 field846 = class135.method935("<img=0>", 0);

    @OriginalMember(owner = "client!f", name = "s", descriptor = "Lsd;")
    private static class166 field855 = class135.method935("This world is running a closed Beta)3", 0);

    @OriginalMember(owner = "client!f", name = "P", descriptor = "Lsd;")
    public static class166 field878 = class135.method935("_", 0);

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Lsd;")
    private static class166 field875 = class135.method935("Walk here", 0);

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Lsd;")
    public static class166 field865 = field875;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "Lsd;")
    public static class166 field874 = field855;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public int field850;

    @OriginalMember(owner = "client!f", name = "q", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!f", name = "B", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    private int field873;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!f", name = "W", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Laa;")
    public static class2 field861;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "Le;")
    private class38 field856;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "[I")
    public int[] field838;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
    private int[] field843;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
    public int[] field847;

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[I")
    public int[] field851;

    @OriginalMember(owner = "client!f", name = "r", descriptor = "[I")
    private int[] field854;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "[I")
    public static int[] field884;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "[Le;")
    private class38[] field859;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "[Ljava/lang/Object;")
    public Object[] field842;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "[[I")
    private int[][] field844;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "[[I")
    private int[][] field852;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field862;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)[I")
    public final int[] method350(boolean arg0, int arg1) {
        if (!arg0) {
            this.field862 = null;
        }
        field870++;
        return this.field852[arg1];
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
    public final boolean method351(int arg0) {
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field854.length; var3++) {
            int var4 = this.field854[var3];
            if (this.field842[var4] == null) {
                this.method143(119, var4);
                if (this.field842[var4] == null) {
                    var2 = false;
                }
            }
        }
        field841++;
        return var2;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[B")
    public final byte[] method352(int arg0, int arg1) {
        field871++;
        if (this.field862.length == 1) {
            return this.method353(0, arg0, arg1 - 75);
        } else if (arg1 != 0) {
            return null;
        } else if (this.field862[arg0].length == 1) {
            return this.method353(arg0, 0, arg1 ^ 0xFFFFFFB3);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)[B")
    public final byte[] method353(int arg0, int arg1, int arg2) {
        field879++;
        if (arg2 > -52) {
            this.field873 = 84;
        }
        return this.method355(null, arg0, -109, arg1);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(III)Z")
    public final boolean method354(int arg0, int arg1, int arg2) {
        field839++;
        if (arg1 < 0 || this.field862.length <= arg1 || this.field862[arg1] == null || arg0 < 0 || this.field862[arg1].length <= arg0) {
            return false;
        } else if (this.field862[arg1][arg0] != null) {
            return true;
        } else if (this.field842[arg1] == null) {
            this.method143(109, arg1);
            if (arg2 >= -36) {
                this.method370(113, (byte) -28, null);
            }
            return this.field842[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "([IIII)[B")
    public final byte[] method355(int[] arg0, int arg1, int arg2, int arg3) {
        field857++;
        if (arg1 < 0 || arg1 >= this.field862.length || this.field862[arg1] == null || arg3 < 0 || this.field862[arg1].length <= arg3) {
            return null;
        }
        if (this.field862[arg1][arg3] == null) {
            boolean var5 = this.method370(arg1, (byte) -103, arg0);
            if (!var5) {
                this.method143(117, arg1);
                boolean var6 = this.method370(arg1, (byte) -99, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg2 >= -106) {
            this.field873 = -17;
        }
        byte[] var7 = class138.method948(12, false, this.field862[arg1][arg3]);
        if (this.field849) {
            this.field862[arg1][arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsd;I)V")
    public final void method356(class166 arg0, int arg1) {
        class166 var3 = arg0.method1127((byte) 119);
        field863++;
        int var4 = this.field856.method263(var3.method1119(255), arg1 ^ 0xFFFFFFB8);
        if (arg1 <= var4) {
            this.method145(var4, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
    public final int method357(byte arg0) {
        if (arg0 == -105) {
            field860++;
            return this.field862.length;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(II)I")
    public final int method358(int arg0, int arg1) {
        field882++;
        if (arg1 != -1) {
            this.method353(63, 64, -121);
        }
        return this.field862[arg0].length;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lsd;ZLsd;)[B")
    public final byte[] method359(class166 arg0, boolean arg1, class166 arg2) {
        if (!arg1) {
            return null;
        }
        class166 var4 = arg0.method1127((byte) 122);
        field845++;
        class166 var5 = arg2.method1127((byte) 106);
        int var6 = this.field856.method263(var4.method1119(255), -76);
        int var7 = this.field859[var6].method263(var5.method1119(255), -114);
        return this.method353(var6, var7, -84);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z[B)V")
    public final void method360(boolean arg0, byte[] arg1) {
        field848++;
        this.field850 = class76.method631(arg1, 115, arg1.length);
        class53 var3 = new class53(class29.method219(arg1, (byte) 49));
        int var4 = var3.method400(255);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException("Incorrect JS5 protocol number: " + var4);
        }
        if (var4 >= 6) {
            var3.method419(-4);
        }
        int var5 = var3.method400(255);
        int var6 = -1;
        this.field873 = var3.method405(2);
        int var7 = 0;
        this.field854 = new int[this.field873];
        if (!arg0) {
            this.method353(-99, 2, 87);
        }
        for (int var8 = 0; var8 < this.field873; var8++) {
            this.field854[var8] = var7 += var3.method405(2);
            if (this.field854[var8] > var6) {
                var6 = this.field854[var8];
            }
        }
        this.field851 = new int[var6 + 1];
        this.field838 = new int[var6 + 1];
        this.field862 = new Object[var6 + 1][];
        this.field847 = new int[var6 + 1];
        this.field852 = new int[var6 + 1][];
        this.field842 = new Object[var6 + 1];
        if (var5 != 0) {
            this.field843 = new int[var6 + 1];
            for (int var9 = 0; var9 < var6 + 1; var9++) {
                this.field843[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field873; var10++) {
                this.field843[this.field854[var10]] = var3.method419(-4);
            }
            this.field856 = new class38(this.field843);
        }
        for (int var11 = 0; var11 < this.field873; var11++) {
            this.field851[this.field854[var11]] = var3.method419(-4);
        }
        for (int var12 = 0; var12 < this.field873; var12++) {
            this.field847[this.field854[var12]] = var3.method419(-4);
        }
        for (int var13 = 0; var13 < this.field873; var13++) {
            this.field838[this.field854[var13]] = var3.method405(2);
        }
        for (int var14 = 0; var14 < this.field873; var14++) {
            int var20 = this.field854[var14];
            int var21 = this.field838[var20];
            int var22 = 0;
            this.field852[var20] = new int[var21];
            int var23 = -1;
            for (int var24 = 0; var24 < var21; var24++) {
                int var25 = this.field852[var20][var24] = var22 += var3.method405(2);
                if (var23 < var25) {
                    var23 = var25;
                }
            }
            this.field862[var20] = new Object[var23 + 1];
        }
        if (var5 == 0) {
            return;
        }
        this.field859 = new class38[var6 + 1];
        this.field844 = new int[var6 + 1][];
        for (int var15 = 0; var15 < this.field873; var15++) {
            int var16 = this.field854[var15];
            int var17 = this.field838[var16];
            this.field844[var16] = new int[this.field862[var16].length];
            for (int var18 = 0; var18 < this.field862[var16].length; var18++) {
                this.field844[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                this.field844[var16][this.field852[var16][var19]] = var3.method419(-4);
            }
            this.field859[var16] = new class38(this.field844[var16]);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V")
    public static void method361(boolean arg0) {
        field865 = null;
        field874 = null;
        if (arg0) {
            field878 = null;
        }
        field855 = null;
        field875 = null;
        field846 = null;
        field878 = null;
        field884 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(II)V")
    public void method143(int arg0, int arg1) {
        if (arg0 >= 93) {
            field872++;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILsd;I)I")
    public final int method362(int arg0, class166 arg1, int arg2) {
        int var4 = -100 % ((arg2 - 28) / 45);
        field876++;
        class166 var5 = arg1.method1127((byte) 127);
        return this.field859[arg0].method263(var5.method1119(255), -101);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lsd;I)I")
    public final int method363(class166 arg0, int arg1) {
        if (arg1 != 0) {
            this.field852 = null;
        }
        class166 var3 = arg0.method1127((byte) 116);
        field877++;
        return this.field856.method263(var3.method1119(255), 74);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILsd;)V")
    public static final void method364(int arg0, class166 arg1) {
        field881++;
        if (class103.field2022 >= 2) {
            if (arg1.method1146((byte) -79, class93.field1824)) {
                System.gc();
            }
            if (arg1.method1146((byte) -126, class116.field2254)) {
                class10.method58(true);
            }
            if (arg1.method1146((byte) -93, class3.field56)) {
                class127.field2493 = true;
            }
            if (arg1.method1146((byte) -107, class144.field2798)) {
                class127.field2493 = false;
            }
            if (arg1.method1146((byte) -102, class192.field3652)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class46.field822[var2].field2748[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method1146((byte) -101, class130.field2550) && class102.field2015 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1142(27575, class203.field4006)) {
                class23.field401 = arg1.method1155(12, (byte) -72).method1150(false).method1139((byte) 12);
                class150.method1023((byte) -125, 0, class22.method148(new class166[] { class119.field2339, class174.method1192(false, class23.field401) }, 0), null);
            }
            if (arg1.method1146((byte) -90, class51.field937)) {
                class8.field163 = true;
            }
        }
        class19.field333++;
        class156.field2989.method705(194, (byte) 9);
        class156.field2989.method429(arg1.method1143(true) - 1, (byte) 97);
        if (arg0 != 4) {
            method361(true);
        }
        class156.field2989.method396(arg1.method1155(2, (byte) -72), false);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIB)[B")
    public final byte[] method365(int arg0, int arg1, byte arg2) {
        field866++;
        if (arg2 != 78) {
            this.field850 = 120;
        }
        if (arg1 < 0 || this.field862.length <= arg1 || this.field862[arg1] == null || arg0 < 0 || this.field862[arg1].length <= arg0) {
            return null;
        }
        if (this.field862[arg1][arg0] == null) {
            boolean var4 = this.method370(arg1, (byte) -81, null);
            if (!var4) {
                this.method143(116, arg1);
                boolean var5 = this.method370(arg1, (byte) -51, null);
                if (!var5) {
                    return null;
                }
            }
        }
        return class138.method948(12, false, this.field862[arg1][arg0]);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB)V")
    public void method145(int arg0, byte arg1) {
        field853++;
        int var3 = -117 % ((arg1 + 76) / 50);
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
    public final void method366(byte arg0) {
        field885++;
        if (arg0 >= -49) {
            this.field854 = null;
        }
        for (int var2 = 0; var2 < this.field862.length; var2++) {
            if (this.field862[var2] != null) {
                for (int var3 = 0; var3 < this.field862[var2].length; var3++) {
                    this.field862[var2][var3] = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZ)Z")
    public final boolean method367(int arg0, boolean arg1) {
        field868++;
        if (this.field862.length == 1) {
            return this.method354(arg0, 0, -57);
        } else if (this.field862[arg0].length == 1) {
            return this.method354(0, arg0, -100);
        } else if (arg1) {
            throw new RuntimeException();
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLsd;Lsd;)Z")
    public final boolean method368(byte arg0, class166 arg1, class166 arg2) {
        class166 var4 = arg2.method1127((byte) 118);
        class166 var5 = arg1.method1127((byte) 107);
        int var6 = this.field856.method263(var4.method1119(255), -73);
        int var7 = this.field859[var6].method263(var5.method1119(255), -116);
        int var8 = 117 % ((-arg0 - 79) / 42);
        field858++;
        return this.method354(var7, var6, -88);
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(II)V")
    public final void method369(int arg0, int arg1) {
        field864++;
        for (int var3 = 0; var3 < this.field862[arg1].length; var3++) {
            this.field862[arg1][var3] = null;
        }
        if (arg0 != -3) {
            field846 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(ZZ)V")
    public class47(boolean arg0, boolean arg1) {
        this.field849 = arg1;
        this.field840 = arg0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IB[I)Z")
    private final boolean method370(int arg0, byte arg1, int[] arg2) {
        field867++;
        if (this.field842[arg0] == null) {
            return false;
        }
        int[] var4 = this.field852[arg0];
        Object[] var5 = this.field862[arg0];
        int var6 = this.field838[arg0];
        boolean var7 = true;
        for (int var8 = 0; var8 < var6; var8++) {
            if (var5[var4[var8]] == null) {
                var7 = false;
                break;
            }
        }
        int var9 = 105 % ((-arg1 - 6) / 39);
        if (var7) {
            return true;
        }
        byte[] var10;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var10 = class138.method948(12, false, this.field842[arg0]);
        } else {
            var10 = class138.method948(12, true, this.field842[arg0]);
            class53 var11 = new class53(var10);
            var11.method410(var11.field988.length, arg2, -155643227, 5);
        }
        byte[] var12;
        try {
            var12 = class29.method219(var10, (byte) 49);
        } catch (RuntimeException var29) {
            throw class199.method1316(var29, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class76.method631(var10, -71, var10.length) + "," + class76.method631(var10, -49, var10.length - 2) + "," + this.field851[arg0] + "," + this.field850);
        }
        if (this.field840) {
            this.field842[arg0] = null;
        }
        if (var6 > 1) {
            int var14 = var12.length;
            int var30 = var14 - 1;
            int var15 = var12[var30] & 0xFF;
            int var16 = var30 - var15 * 4 * var6;
            class53 var17 = new class53(var12);
            int[] var18 = new int[var6];
            var17.field1000 = var16;
            for (int var19 = 0; var19 < var15; var19++) {
                int var20 = 0;
                for (int var21 = 0; var21 < var6; var21++) {
                    var20 += var17.method419(-4);
                    var18[var21] += var20;
                }
            }
            byte[][] var22 = new byte[var6][];
            for (int var23 = 0; var23 < var6; var23++) {
                var22[var23] = new byte[var18[var23]];
                var18[var23] = 0;
            }
            var17.field1000 = var16;
            int var24 = 0;
            for (int var25 = 0; var25 < var15; var25++) {
                int var26 = 0;
                for (int var27 = 0; var27 < var6; var27++) {
                    var26 += var17.method419(-4);
                    class71.method569(var12, var24, var22[var27], var18[var27], var26);
                    var24 += var26;
                    var18[var27] += var26;
                }
            }
            for (int var28 = 0; var28 < var6; var28++) {
                if (this.field849) {
                    var5[var4[var28]] = var22[var28];
                } else {
                    var5[var4[var28]] = class69.method558(false, var22[var28], false);
                }
            }
        } else if (this.field849) {
            var5[var4[0]] = var12;
        } else {
            var5[var4[0]] = class69.method558(false, var12, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
    public final boolean method371(byte arg0, int arg1) {
        if (arg0 != -28) {
            return false;
        }
        field883++;
        if (this.field842[arg1] == null) {
            this.method143(arg0 + 122, arg1);
            return this.field842[arg1] != null;
        } else {
            return true;
        }
    }
}
