import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class133 extends class7 {

    @OriginalMember(owner = "client!qa", name = "J", descriptor = "Lpp;")
    public static class221 field2087 = null;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    public static int field2082;

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!qa", name = "H", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!qa", name = "I", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!qa", name = "K", descriptor = "Ljava/lang/String;")
    public String field2088;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[C")
    public char[] field2077;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "[C")
    public char[] field2083;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "[I")
    public int[] field2080;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "[I")
    public int[] field2090;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(CZ)I", line = 5)
    public final int method970(char arg0, boolean arg1) {
        field2089++;
        if (this.field2090 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field2090.length; var3++) {
            if (this.field2083[var3] == arg0) {
                return this.field2090[var3];
            }
        }
        if (arg1) {
            this.method980(-7, (class186) null);
        }
        return -1;
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)V", line = 29)
    public static final void method971(byte arg0) {
        if (class183.field2983 && class232.field3856[81] && class144.field2267 > 2) {
            class187.method1332(false, (class418) class86.field1089.field459.field2536.field2536);
        } else {
            class187.method1332(false, (class418) class86.field1089.field459.field2536);
        }
        if (arg0 < 97) {
            field2078 = -64;
        }
        field2092++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIII)V", line = 49)
    public static final void method972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2076++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg2 - arg1;
        int var12 = arg3 - arg1;
        int var13 = arg2 * arg2;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        if (arg5 <= 40) {
            method972(-93, -26, 103, 81, 65, 109, -127, 46);
        }
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class277.field4414[arg4];
        class256.method1769(arg7 - var11, var39, (byte) 106, arg6, arg7 - arg2);
        class256.method1769(arg7 + var11, var39, (byte) 77, arg0, arg7 - var11);
        class256.method1769(arg2 + arg7, var39, (byte) 117, arg6, arg7 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var10++;
                    var33 += var30;
                    var37 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var8++;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg7 + var8;
            int var44 = arg7 - var8;
            if (var40) {
                int var45 = arg7 + var10;
                int var46 = arg7 - var10;
                class256.method1769(var46, class277.field4414[var41], (byte) 106, arg6, var44);
                class256.method1769(var45, class277.field4414[var41], (byte) 67, arg0, var46);
                class256.method1769(var43, class277.field4414[var41], (byte) 104, arg6, var45);
                class256.method1769(var46, class277.field4414[var42], (byte) 96, arg6, var44);
                class256.method1769(var45, class277.field4414[var42], (byte) 73, arg0, var46);
                class256.method1769(var43, class277.field4414[var42], (byte) 55, arg6, var45);
            } else {
                class256.method1769(var43, class277.field4414[var41], (byte) 85, arg6, var44);
                class256.method1769(var43, class277.field4414[var42], (byte) 95, arg6, var44);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLmo;)V", line = 221)
    public static final void method973(byte arg0, class447 arg1) {
        class292.field4666 = arg1;
        if (arg0 == 30) {
            field2082++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILjg;)V", line = 232)
    private final void method974(int arg0, int arg1, class186 arg2) {
        field2081++;
        if (arg0 != -4) {
            this.method975('\u0013', false);
        }
        if (arg1 == 1) {
            this.field2088 = arg2.method1270(-9970);
        } else if (arg1 == 2) {
            int var7 = arg2.method1322(false);
            this.field2083 = new char[var7];
            this.field2090 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2090[var8] = arg2.method1272((byte) -86);
                byte var9 = arg2.method1327((byte) -103);
                this.field2083[var8] = var9 == 0 ? 0 : class394.method2488(-1206145460, var9);
            }
        } else if (arg1 == 3) {
            int var4 = arg2.method1322(false);
            this.field2080 = new int[var4];
            this.field2077 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2080[var5] = arg2.method1272((byte) -102);
                byte var6 = arg2.method1327((byte) -106);
                this.field2077[var5] = var6 == 0 ? 0 : class394.method2488(class121.method873(arg0, 1206145456), var6);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(CZ)I", line = 295)
    public final int method975(char arg0, boolean arg1) {
        field2075++;
        if (this.field2080 == null) {
            return -1;
        }
        if (!arg1) {
            this.field2083 = null;
        }
        for (int var3 = 0; var3 < this.field2080.length; var3++) {
            if (this.field2077[var3] == arg0) {
                return this.field2080[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLe;II)V", line = 321)
    public static final void method976(byte arg0, class312 arg1, int arg2, int arg3) {
        field2091++;
        class136.field2139 = new class375[arg2][arg3];
        class296.field4710 = arg1;
        if (class50.field618 != null) {
            class318.field4974 = class36.method238(class50.field618[3], class50.field618[4], false, class50.field618[0], class50.field618[1], class50.field618[2], class50.field618[5]);
        }
        if (arg0 < -101) {
            class267.field4302 = new class375();
            class53.method342(0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 345)
    public static final String method977(long arg0, int arg1) {
        field2079++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class250.field4084[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            if (arg1 > -8) {
                method977(119L, 68);
            }
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 396)
    public final void method978(int arg0) {
        if (this.field2080 != null) {
            for (int var2 = 0; var2 < this.field2080.length; var2++) {
                this.field2080[var2] = class35.method227(this.field2080[var2], 32768);
            }
        }
        int var3 = -39 % ((79 - arg0) / 32);
        field2073++;
        if (this.field2090 != null) {
            for (int var4 = 0; var4 < this.field2090.length; var4++) {
                this.field2090[var4] = class35.method227(this.field2090[var4], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lne;III)V", line = 425)
    public static final void method979(class172 arg0, int arg1, int arg2, int arg3) {
        field2086++;
        class245 var4 = arg0.method1197(class284.field4547, -4);
        if (arg3 != 3) {
            field2087 = null;
        }
        if (var4 == null) {
            return;
        }
        class284.field4547.method671(arg1, arg2, arg0.field2705 + arg1, arg0.field2834 + arg2);
        if (class193.field3143 < 3) {
            class369.field5612.method2316((float) arg0.field2705 / 2.0F + (float) arg1, (float) arg0.field2834 / 2.0F + (float) arg2, 4096, ((int) (-class329.field5153) & 0x3FFF) << 2, var4, arg1, arg2);
        } else {
            class284.field4547.method632(-16777216, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILjg;)V", line = 451)
    public final void method980(int arg0, class186 arg1) {
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                field2084++;
                if (arg0 != -1) {
                    method979((class172) null, 50, -11, -38);
                    return;
                }
                return;
            }
            this.method974(-4, var3, arg1);
        }
    }
}
