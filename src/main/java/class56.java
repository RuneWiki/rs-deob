import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class56 {

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public int field904 = -1;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Z")
    public boolean field908 = false;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public int field907 = 5;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public int field901 = -1;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public int field909 = 2;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public int field890 = -1;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "I")
    public int field913 = 99;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "Z")
    private boolean field893 = false;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public int field910 = -1;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "I")
    public int field900 = -1;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "[I")
    public static int[] field888 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lck;")
    public static class119 field894 = class298.method1987((byte) 11, ")3");

    @OriginalMember(owner = "client!we", name = "D", descriptor = "I")
    public static int field917 = -1;

    @OriginalMember(owner = "client!we", name = "E", descriptor = "Lck;")
    public static class119 field918 = class298.method1987((byte) 11, "0(U");

    @OriginalMember(owner = "client!we", name = "G", descriptor = "Lml;")
    public static class134 field920 = null;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!we", name = "F", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!we", name = "H", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Z")
    public static boolean field899;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[I")
    public int[] field905;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
    private int[] field906;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "[I")
    private int[] field914;

    @OriginalMember(owner = "client!we", name = "C", descriptor = "[I")
    public int[] field916;

    @OriginalMember(owner = "client!we", name = "B", descriptor = "[[I")
    public int[][] field915;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILva;ZI)Z", line = 5)
    public static final boolean method414(int arg0, class36 arg1, boolean arg2, int arg3) {
        field912++;
        byte[] var4 = arg1.method261(-1, arg3, arg0);
        if (var4 == null) {
            return false;
        }
        class214.method1349(var4, -3);
        if (arg2) {
            method420((byte) 24);
        }
        return true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 32)
    public final void method415(int arg0) {
        if (arg0 != -4) {
            return;
        }
        if (this.field904 == -1) {
            if (this.field906 == null) {
                this.field904 = 0;
            } else {
                this.field904 = 2;
            }
        }
        if (this.field910 == -1) {
            if (this.field906 == null) {
                this.field910 = 0;
            } else {
                this.field910 = 2;
            }
        }
        field898++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)Lck;", line = 63)
    public static final class119 method416(int arg0, byte arg1) {
        field891++;
        class119 var2 = class234.method1506(arg0, (byte) -79);
        if (arg1 < 113) {
            field894 = (class119) null;
        }
        for (int var3 = var2.method776((byte) -29) - 3; var3 > 0; var3 -= 3) {
            var2 = class170.method1074(new class119[] { var2.method762(var3, 0, 0), class298.field5020, var2.method769(-73, var3) }, -98);
        }
        if (var2.method776((byte) -87) > 9) {
            return class170.method1074(new class119[] { class63.field1001, var2.method762(var2.method776((byte) -61) - 8, 0, 0), class20.field278, class131.field2004, var2, class59.field963 }, -117);
        } else if (var2.method776((byte) -78) > 6) {
            return class170.method1074(new class119[] { class147.field2367, var2.method762(var2.method776((byte) -98) - 4, 0, 0), class229.field3714, class131.field2004, var2, class59.field963 }, -83);
        } else {
            return class170.method1074(new class119[] { class108.field1654, var2, class270.field4457 }, -98);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lfj;I)V", line = 110)
    public final void method417(class3 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method64((byte) 43);
            if (var3 == 0) {
                if (arg1 != -472) {
                    this.field909 = 34;
                }
                field919++;
                return;
            }
            this.method423(arg1 ^ 0xFFFFFE28, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILec;IBLwe;)Lec;", line = 127)
    public final class28 method418(int arg0, class28 arg1, int arg2, byte arg3, class56 arg4) {
        int var6 = this.field916[arg2];
        field902++;
        class113 var7 = class243.method1583(7, var6 >> 16);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method421(arg1, arg0, 17565744);
        }
        int var9 = arg4.field916[arg0];
        class113 var10 = class243.method1583(7, var9 >> 16);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class28 var12 = arg1.method217(!var7.method724(83, var8), !this.field893);
            var12.method219(var7, var8, this.field893);
            return var12;
        }
        class28 var13 = arg1.method217(!var7.method724(-118, var8) & !var10.method724(-103, var11), !arg4.field893 & !this.field893);
        if (arg3 < 62) {
            method414(66, (class36) null, false, -53);
        }
        var13.method211(var7, var8, var10, var11, this.field906, this.field893 | arg4.field893);
        return var13;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILec;II)Lec;", line = 168)
    public final class28 method419(int arg0, class28 arg1, int arg2, int arg3) {
        field892++;
        int var5 = this.field916[arg2];
        class113 var6 = class243.method1583(arg3 + 6, var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg1.method217(true, true);
        }
        int var8 = arg0 & 0x3;
        class28 var9 = arg1.method217(!var6.method724(-105, var7), !this.field893);
        if (arg3 != 1) {
            field896 = -19;
        }
        if (var8 == 1) {
            var9.method220();
        } else if (var8 == 2) {
            var9.method207();
        } else if (var8 == 3) {
            var9.method216();
        }
        var9.method219(var6, var7, this.field893);
        if (var8 == 1) {
            var9.method216();
        } else if (var8 == 2) {
            var9.method207();
        } else if (var8 == 3) {
            var9.method220();
        }
        return var9;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)I", line = 242)
    public static final int method420(byte arg0) {
        field921++;
        if (arg0 >= -76) {
            method416(-98, (byte) -51);
        }
        return class120.field1887;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lec;II)Lec;", line = 254)
    public final class28 method421(class28 arg0, int arg1, int arg2) {
        field895++;
        int var4 = this.field916[arg1];
        class113 var5 = class243.method1583(arg2 ^ 0x10C0837, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method217(true, true);
        } else if (arg2 == 17565744) {
            class28 var7 = arg0.method217(!var5.method724(-128, var6), !this.field893);
            var7.method219(var5, var6, this.field893);
            return var7;
        } else {
            return (class28) null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILec;)Lec;", line = 276)
    public final class28 method422(int arg0, int arg1, class28 arg2) {
        field911++;
        int var4 = this.field916[arg1];
        class113 var5 = class243.method1583(7, var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method217(true, true);
        }
        class113 var7 = null;
        int var8 = 0;
        if (this.field914 != null && this.field914.length > arg1) {
            int var9 = this.field914[arg1];
            var7 = class243.method1583(7, var9 >> 16);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class28 var11 = arg2.method217(!var5.method724(17, var6), !this.field893);
            var11.method219(var5, var6, this.field893);
            return var11;
        }
        if (arg0 >= -47) {
            method416(-3, (byte) -4);
        }
        class28 var10 = arg2.method217(!var5.method724(-12, var6) & !var7.method724(-115, var8), !this.field893);
        var10.method219(var5, var6, this.field893);
        var10.method219(var7, var8, this.field893);
        return var10;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILfj;I)V", line = 319)
    private final void method423(int arg0, class3 arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg1.method63((byte) 1);
            this.field905 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field905[var5] = arg1.method63((byte) 1);
            }
            this.field916 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field916[var6] = arg1.method63((byte) 1);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field916[var7] += arg1.method63((byte) 1) << 16;
            }
        } else if (arg2 == 2) {
            this.field900 = arg1.method63((byte) 1);
        } else if (arg2 == 3) {
            int var15 = arg1.method64((byte) -94);
            this.field906 = new int[var15 + 1];
            for (int var16 = 0; var16 < var15; var16++) {
                this.field906[var16] = arg1.method64((byte) 17);
            }
            this.field906[var15] = 9999999;
        } else if (arg2 == 4) {
            this.field908 = true;
        } else if (arg2 == 5) {
            this.field907 = arg1.method64((byte) 121);
        } else if (arg2 == 6) {
            this.field901 = arg1.method63((byte) 1);
        } else if (arg2 == 7) {
            this.field890 = arg1.method63((byte) 1);
        } else if (arg2 == 8) {
            this.field913 = arg1.method64((byte) 39);
        } else if (arg2 == 9) {
            this.field910 = arg1.method64((byte) 4);
        } else if (arg2 == 10) {
            this.field904 = arg1.method64((byte) 12);
        } else if (arg2 == 11) {
            this.field909 = arg1.method64((byte) -93);
        } else if (arg2 == 12) {
            int var12 = arg1.method64((byte) 17);
            this.field914 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field914[var13] = arg1.method63((byte) 1);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field914[var14] += arg1.method63((byte) 1) << 16;
            }
        } else if (arg2 == 13) {
            int var8 = arg1.method63((byte) 1);
            this.field915 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg1.method64((byte) -106);
                if (var10 > 0) {
                    this.field915[var9] = new int[var10];
                    this.field915[var9][0] = arg1.method48(64);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field915[var9][var11] = arg1.method63((byte) 1);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field893 = true;
        }
        if (arg0 != 0) {
            method416(-10, (byte) 94);
        }
        field889++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 491)
    public static void method424(boolean arg0) {
        field920 = null;
        field888 = null;
        field894 = null;
        if (arg0) {
            field917 = -40;
        }
        field918 = null;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(Lec;II)Lec;", line = 504)
    public final class28 method425(class28 arg0, int arg1, int arg2) {
        int var4 = this.field916[arg1];
        class113 var5 = class243.method1583(arg2 ^ 0xFFF8, var4 >> 16);
        field897++;
        int var6 = var4 & arg2;
        if (var5 == null) {
            return arg0.method218(true, true);
        } else {
            class28 var7 = arg0.method218(!var5.method724(arg2 - 65470, var6), !this.field893);
            var7.method219(var5, var6, this.field893);
            return var7;
        }
    }
}
