import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class92 {

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    private int field1141 = -1;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "I")
    private int field1150 = -32768;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    private int field1159 = -1;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "Z")
    private boolean field1169 = false;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Z")
    private boolean field1147 = false;

    @OriginalMember(owner = "client!vr", name = "N", descriptor = "I")
    public int field1177;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "B")
    private byte field1138;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "B")
    private byte field1158;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public int field1154;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    private int field1161;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "I")
    private int field1167;

    @OriginalMember(owner = "client!vr", name = "K", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "Z")
    private boolean field1156;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "Z")
    public static boolean field1153 = false;

    @OriginalMember(owner = "client!vr", name = "I", descriptor = "Ltn;")
    public static class60 field1172 = new class60(26, 15);

    @OriginalMember(owner = "client!vr", name = "P", descriptor = "I")
    public static int field1179 = 1;

    @OriginalMember(owner = "client!vr", name = "O", descriptor = "Lfc;")
    public static class174 field1178 = new class174(8);

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    private int field1143;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!vr", name = "J", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!vr", name = "L", descriptor = "I")
    private int field1175;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "Li;")
    private class31 field1146;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "Llm;")
    public class351 field1157;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "Le;")
    private class377 field1144;

    @OriginalMember(owner = "client!vr", name = "M", descriptor = "Leb;")
    private class449 field1176;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "[I")
    public static int[] field1162;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "[Z")
    private boolean[] field1155;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([ILet;[II[I)V")
    public static final void method652(int[] arg0, class429 arg1, int[] arg2, int arg3, int[] arg4) {
        field1164++;
        for (int var5 = arg3; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg1.field3295.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field3295[var9] = null;
                    } else {
                        class449 var10 = class62.field784.method2566(var6, -19);
                        int var11 = var10.field6286;
                        class265 var12 = arg1.field3295[var9];
                        if (var12 != null) {
                            if (var12.field3881 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field3295[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field3883 = 0;
                                    var12.field3886 = 1;
                                    var12.field3889 = 0;
                                    var12.field3885 = 0;
                                    var12.field3880 = var8;
                                    class190.method1213(0, arg1.field1896, (byte) 43, var10, arg1.field1904, false, arg1.field1899);
                                } else if (var11 == 2) {
                                    var12.field3885 = 0;
                                }
                            } else if (var10.field6274 >= class62.field784.method2566(var12.field3881, -19).field6274) {
                                var12 = arg1.field3295[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class265 var13 = arg1.field3295[var9] = new class265();
                            var13.field3883 = 0;
                            var13.field3881 = var6;
                            var13.field3880 = var8;
                            var13.field3886 = 1;
                            var13.field3885 = 0;
                            var13.field3889 = 0;
                            class190.method1213(0, arg1.field1896, (byte) -108, var10, arg1.field1904, false, arg1.field1899);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lza;I)V")
    public final void method653(class290 arg0, int arg1) {
        if (arg1 != -1) {
            this.field1150 = -36;
        }
        this.method662(this.field1161, true, (byte) 112, true, this.field1167, arg0, 262144);
        field1152++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Z")
    public final boolean method654(byte arg0) {
        if (arg0 != 105) {
            method655(false, 81, null);
        }
        field1142++;
        return this.field1156;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZI[F)[F")
    public static final float[] method655(boolean arg0, int arg1, float[] arg2) {
        if (!arg0) {
            method661(null, -75, null, null, 111, -58);
        }
        field1171++;
        float[] var3 = new float[arg1];
        class182.method1138(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)I")
    public final int method656(byte arg0) {
        field1166++;
        if (arg0 != -66) {
            this.method657(false, null);
        }
        return this.field1150;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ZLza;)V")
    public final void method657(boolean arg0, class290 arg1) {
        if (this.field1146 != null) {
            class264.method1680(this.field1146, this.field1138, this.field1167, this.field1161, this.field1155);
            this.field1155 = null;
            this.field1146 = null;
        }
        field1163++;
        if (arg0) {
            this.field1146 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)V")
    public static void method658(byte arg0) {
        if (arg0 != -103) {
            method655(true, 104, null);
        }
        field1172 = null;
        field1178 = null;
        field1162 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/awt/Canvas;)Lvs;")
    public static final class426 method659(int arg0, Canvas arg1) {
        field1149++;
        if (arg0 < 23) {
            field1153 = false;
        }
        try {
            Class var2 = Class.forName("eu");
            class426 var3 = (class426) var2.getDeclaredConstructor().newInstance();
            var3.method492(arg1, -4);
            return var3;
        } catch (Throwable var5) {
            class61 var4 = new class61();
            var4.method492(arg1, -4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II)V")
    public final void method660(int arg0, int arg1) {
        if (arg0 >= 17) {
            this.field1147 = true;
            field1148++;
            this.method663(arg1, 98);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
    public static final void method661(String arg0, int arg1, String arg2, String arg3, int arg4, int arg5) {
        class387.method2241(null, arg5, arg0, (byte) 109, arg2, arg4, arg1, arg3);
        field1160++;
    }

    @OriginalMember(owner = "client!vr", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1165++;
        if (this.field1157 != null) {
            this.field1157.method2085();
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IZBZILza;I)Le;")
    public final class377 method662(int arg0, boolean arg1, byte arg2, boolean arg3, int arg4, class290 arg5, int arg6) {
        field1139++;
        class270 var8 = class377.field5338.method1901(50, this.field1174);
        if (var8.field3998 != null) {
            var8 = var8.method1704((byte) -71, class163.field2413);
        }
        if (var8 == null) {
            this.method657(false, arg5);
            this.field1141 = -1;
            this.field1159 = this.field1151;
            return null;
        }
        if (!this.field1147 && this.field1141 != var8.field3952) {
            this.field1144 = null;
            this.method663(-1, 114);
        }
        this.method666(arg4, arg0, -122);
        boolean var9 = arg3 & this.field1156 & class4.field81.method726(class405.field5737, 30) != 0;
        boolean var10 = var9 & (this.field1141 != var8.field3952 || (this.field1159 != this.field1151 || this.field1176 != null && (this.field1176.field6279 || class26.field318) && this.field1168 != this.field1151) && class4.field81.method726(class405.field5737, 120) >= 2);
        if (arg1 && !var10) {
            this.field1159 = this.field1151;
            this.field1141 = var8.field3952;
            return null;
        }
        if (var10) {
            class264.method1680(this.field1146, this.field1138, this.field1167, this.field1161, this.field1155);
        }
        class38 var11 = class330.field4818[this.field1138];
        class38 var12;
        if (this.field1169) {
            var12 = class68.field858[0];
        } else {
            var12 = this.field1138 < 3 ? class330.field4818[this.field1138 + 1] : null;
        }
        class377 var13 = null;
        if (this.field1176 != null) {
            if (var10) {
                arg6 |= 0x40000;
            }
            var13 = var8.method1699(arg6, this.field1176, this.field1151, var11.method11(this.field1167, this.field1161), var11, 30607, this.field1167, arg5, this.field1177 == 11 ? 10 : this.field1177, this.field1175, this.field1177 == 11 ? this.field1154 + 4 : this.field1154, var12, this.field1161, this.field1168);
            if (var13 == null) {
                this.field1155 = null;
                this.field1146 = null;
                this.field1150 = 0;
            } else {
                if (var10) {
                    if (this.field1155 == null) {
                        this.field1155 = new boolean[4];
                    }
                    this.field1146 = var13.method1614(this.field1146);
                    class265.method1681(this.field1146, this.field1138, arg4, arg0, this.field1155);
                }
                this.field1150 = var13.method1568();
            }
            this.field1144 = null;
        } else if (this.field1144 != null && arg6 == (this.field1144.method1605() & arg6) && this.field1141 == var8.field3952) {
            var13 = this.field1144;
        } else {
            if (this.field1144 != null) {
                arg6 |= this.field1144.method1605();
            }
            class48 var14 = var8.method1697(arg5, this.field1177 == 11 ? 10 : this.field1177, arg6, this.field1177 == 11 ? this.field1154 + 4 : this.field1154, this.field1161, this.field1167, (byte) -125, var10, var11, var11.method11(this.field1167, this.field1161), var12);
            if (var14 == null) {
                this.field1155 = null;
                this.field1144 = null;
                this.field1150 = 0;
                this.field1146 = null;
            } else {
                var13 = var14.field555;
                this.field1144 = var14.field555;
                if (var10) {
                    this.field1146 = var14.field556;
                    this.field1155 = null;
                    class265.method1681(this.field1146, this.field1138, arg4, arg0, null);
                }
                this.field1150 = var13.method1568();
            }
        }
        if (arg2 < 79) {
            return null;
        }
        this.field1167 = arg4;
        this.field1141 = var8.field3952;
        this.field1159 = this.field1151;
        this.field1161 = arg0;
        return var13;
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(II)V")
    private final void method663(int arg0, int arg1) {
        field1170++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class270 var5 = class377.field5338.method1901(50, this.field1174);
            class270 var6 = var5;
            if (var5.field3998 != null) {
                var5 = var5.method1704((byte) 115, class163.field2413);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3960 != null) {
                if (this.field1176 != null && var5.method1702((byte) 46, this.field1176.field6269)) {
                    return;
                }
                var3 = var5.method1705(-11659);
                if (this.field1141 != var5.field3952) {
                    var4 = var5.field3992;
                }
            } else if (var5.field3956 == -1) {
                if (var6 != null && var6.field3960 != null) {
                    if (this.field1176 != null && var6.method1702((byte) 46, this.field1176.field6269)) {
                        return;
                    }
                    var3 = var6.method1705(-11659);
                    if (this.field1141 != var6.field3952) {
                        var4 = var6.field3992;
                    }
                } else if (var6 != null && var6.field3956 != -1 && this.field1141 != var6.field3952) {
                    var4 = var6.field3992;
                    var3 = var6.field3956;
                }
            } else if (this.field1141 != var5.field3952) {
                var4 = var5.field3992;
                var3 = var5.field3956;
            }
        }
        if (var3 == -1) {
            this.field1176 = null;
            return;
        }
        this.field1144 = null;
        if (this.field1176 == null || this.field1176.field6269 != var3) {
            this.field1176 = class62.field784.method2566(var3, -19);
        } else if (this.field1176.field6286 == 0) {
            return;
        }
        if (arg1 < 96) {
            field1179 = -8;
        }
        if (this.field1176.field6276 == null) {
            this.field1176 = null;
            return;
        }
        if (var4) {
            this.field1151 = (int) ((double) this.field1176.field6276.length * Math.random());
            this.field1175 = (int) ((double) this.field1176.field6258[this.field1151] * Math.random()) + 1;
        } else {
            this.field1175 = 1;
            this.field1151 = 0;
        }
        this.field1168 = this.field1151 + 1;
        if (this.field1168 < 0 || this.field1176.field6276.length <= this.field1168) {
            this.field1168 = -1;
        }
        this.field1143 = class390.field5481 - this.field1175;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Le;ZILza;ZIII)V")
    public final void method664(class377 arg0, boolean arg1, int arg2, class290 arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field1145++;
        class462[] var9 = arg0.method1593();
        class63[] var10 = arg0.method1579();
        if (!arg4) {
            method659(71, null);
        }
        if ((this.field1157 == null || this.field1157.field5038) && (var9 != null || var10 != null)) {
            class270 var11 = class377.field5338.method1901(50, this.field1174);
            if (var11.field3998 != null) {
                var11 = var11.method1704((byte) -13, class163.field2413);
            }
            if (var11 != null) {
                this.field1157 = new class351(class390.field5481);
            }
        }
        if (this.field1157 == null) {
            return;
        }
        if (arg1) {
            this.field1157.method2076(arg3, (long) class390.field5481, var9, var10, false);
        } else {
            this.field1157.method2082((long) class390.field5481);
        }
        this.field1157.method2081(this.field1158, arg5, arg2, arg7, arg6);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Z")
    public static final boolean method665(int arg0) throws IOException {
        field1140++;
        if (class50.field608 == null) {
            return false;
        }
        if (class211.field3061 == null) {
            if (class279.field4126) {
                if (!class50.field608.method1356(1, 96)) {
                    return false;
                }
                class50.field608.method1358(0, (byte) -125, class264.field3874.field5663, 1);
                class241.field3512++;
                class184.field2664 = 0;
                class279.field4126 = false;
            }
            class264.field3874.field5665 = 0;
            if (class264.field3874.method1516((byte) -127)) {
                if (!class50.field608.method1356(1, 118)) {
                    return false;
                }
                class50.field608.method1358(1, (byte) -96, class264.field3874.field5663, 1);
                class241.field3512++;
                class184.field2664 = 0;
            }
            class279.field4126 = true;
            class246[] var1 = class336.method2011(-94);
            int var2 = class264.field3874.method1518(arg0 ^ 0x7F);
            if (var2 < 0 || var2 >= var1.length) {
                throw new IOException("invo:" + var2 + " ip:" + class264.field3874.field5665);
            }
            class211.field3061 = var1[var2];
            class190.field2715 = class211.field3061.field3592;
        }
        if (class190.field2715 == -1) {
            if (!class50.field608.method1356(1, 92)) {
                return false;
            }
            class50.field608.method1358(0, (byte) -79, class264.field3874.field5663, 1);
            class241.field3512++;
            class190.field2715 = class264.field3874.field5663[0] & 0xFF;
            class184.field2664 = 0;
        }
        if (class190.field2715 == -2) {
            if (!class50.field608.method1356(2, 107)) {
                return false;
            }
            class50.field608.method1358(0, (byte) -98, class264.field3874.field5663, 2);
            class264.field3874.field5665 = 0;
            class190.field2715 = class264.field3874.method2338(0);
            class184.field2664 = 0;
            class241.field3512 += 2;
        }
        if (~class190.field2715 < arg0) {
            if (!class50.field608.method1356(class190.field2715, 100)) {
                return false;
            }
            class264.field3874.field5665 = 0;
            class50.field608.method1358(0, (byte) -94, class264.field3874.field5663, class190.field2715);
            class184.field2664 = 0;
            class241.field3512 += class190.field2715;
        }
        class15.field195 = class455.field6390;
        class455.field6390 = class497.field7039;
        class497.field7039 = class211.field3061;
        if (class514.field7591 == class211.field3061) {
            int var3 = class264.field3874.method2338(0);
            if (var3 == 65535) {
                var3 = -1;
            }
            int var4 = class264.field3874.method2357((byte) 127);
            int var5 = class264.field3874.method2338(arg0 + 1);
            int var6 = class264.field3874.method2357((byte) 107);
            class251.method1634(-692, var4, var3, var6, var5);
            class211.field3061 = null;
            return true;
        } else if (class426.field5987 == class211.field3061) {
            int var7 = class264.field3874.method2324(arg0 ^ 0x3D9BFBF7);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class264.field3874.method2333(-1640531527);
            int var9 = class264.field3874.method2380(arg0 ^ 0xF4180467);
            if (class147.method921(var9, (byte) 73)) {
                class410.method2421((byte) -118, var8, var7);
            }
            class211.field3061 = null;
            return true;
        } else if (class375.field5325 == class211.field3061) {
            boolean var10 = class264.field3874.method2357((byte) 121) == 1;
            String var11 = class264.field3874.method2356(arg0 ^ 0x6259);
            String var12 = var11;
            if (var10) {
                var12 = class264.field3874.method2356(-25178);
            }
            int var13 = class264.field3874.method2357((byte) 126);
            boolean var14 = false;
            if (var13 <= 1) {
                if (!(!class236.field3442 || class215.field3120) || class467.field6528) {
                    var14 = true;
                } else if (var13 <= 1 && class167.method1051(var12, (byte) -119)) {
                    var14 = true;
                }
            }
            if (!var14 && class225.field3233 == 0) {
                String var15 = class31.method187((byte) -124, class288.method1776(class264.field3874, true));
                if (var13 == 2) {
                    class387.method2241(null, 0, var15, (byte) 95, "<img=1>" + var12, 24, -1, "<img=1>" + var11);
                } else if (var13 == 1) {
                    class387.method2241(null, 0, var15, (byte) 81, "<img=0>" + var12, 24, -1, "<img=0>" + var11);
                } else {
                    class387.method2241(null, 0, var15, (byte) -57, var12, 24, -1, var11);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class47.field535 == class211.field3061) {
            int var16 = class264.field3874.method2370((byte) 41);
            String var17 = class264.field3874.method2356(-25178);
            int var18 = class264.field3874.method2326(arg0 ^ 0x955D93DF);
            int var19 = class264.field3874.method2324(-1033632760);
            if (var19 == 65535) {
                var19 = -1;
            }
            if (var16 >= 1 && var16 <= 8) {
                if (var17.equalsIgnoreCase("null")) {
                    var17 = null;
                }
                class447.field6239[var16 - 1] = var17;
                class208.field3021[var16 - 1] = var19;
                class279.field4123[var16 - 1] = var18 == 0;
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class139.field1817) {
            int var20 = class264.field3874.method2338(0);
            int var21 = class264.field3874.method2357((byte) 107);
            int var22 = class264.field3874.method2357((byte) 112);
            int var23 = class264.field3874.method2338(0) << 0;
            int var24 = class264.field3874.method2357((byte) 120);
            int var25 = class264.field3874.method2357((byte) 118);
            if (class147.method921(var20, (byte) -105)) {
                class415.method2460(8, var22, var24, var23, var21, var25);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class100.field1332) {
            boolean var26 = class264.field3874.method2357((byte) 117) == 1;
            byte[] var27 = new byte[class190.field2715 - 1];
            class264.field3874.method2379(class190.field2715 - 1, arg0 + 22, var27, 0);
            class530.method3117(var26, var27, arg0 + 1);
            class211.field3061 = null;
            return true;
        } else if (class38.field418 == class211.field3061) {
            int var28 = class264.field3874.method2319((byte) 95);
            class507.field7500 = class268.field3914.method960(-113, var28);
            class211.field3061 = null;
            return true;
        } else if (class350.field5033 == class211.field3061) {
            class29.method180(class217.field3149, -123);
            class211.field3061 = null;
            return true;
        } else if (class509.field7544 == class211.field3061) {
            int var29 = class264.field3874.method2324(arg0 - 1033632759);
            int var30 = class264.field3874.method2324(-1033632760);
            int var31 = class264.field3874.method2380(199752600);
            int var32 = class264.field3874.method2324(-1033632760);
            int var33 = class264.field3874.method2345((byte) 37);
            if (class147.method921(var30, (byte) 90)) {
                class532.method3140(5000, var33, var31 | var32 << 16, 7, var29);
            }
            class211.field3061 = null;
            return true;
        } else if (class386.field5421 == class211.field3061) {
            if (class311.method1886(-25866, class488.field6832)) {
                class503.field7252 = (int) ((float) class264.field3874.method2338(0) * 2.5F);
            } else {
                class503.field7252 = class264.field3874.method2338(~arg0) * 30;
            }
            class211.field3061 = null;
            class430.field6068 = class371.field5285;
            return true;
        } else if (class269.field3919 == class211.field3061) {
            int var34 = class264.field3874.method2338(0);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = class264.field3874.method2324(arg0 ^ 0x3D9BFBF7);
            int var36 = class264.field3874.method2342(29707);
            int var37 = class264.field3874.method2324(arg0 ^ 0x3D9BFBF7);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var38 = class264.field3874.method2380(arg0 ^ 0xF4180467);
            if (class147.method921(var38, (byte) 39)) {
                for (int var39 = var37; var39 <= var34; var39++) {
                    long var40 = ((long) var36 << 32) + (long) var39;
                    class496 var42 = (class496) class221.field3183.method2405(var40, arg0 ^ 0x57);
                    class496 var43;
                    if (var42 != null) {
                        var43 = new class496(var42.field7033, var35);
                        var42.method2891(37);
                    } else if (var39 == -1) {
                        var43 = new class496(client.method1276(94, var36).field2101.field7033, var35);
                    } else {
                        var43 = new class496(0, var35);
                    }
                    class221.field3183.method2413(var40, var43, -1);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class471.field6566 == class211.field3061) {
            class29.method180(class496.field7023, -111);
            class211.field3061 = null;
            return true;
        } else if (class285.field4171 == class211.field3061) {
            class29.method180(class330.field4821, arg0 ^ 0x54);
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class168.field2453) {
            class29.method180(class354.field5080, -81);
            class211.field3061 = null;
            return true;
        } else if (class427.field6023 == class211.field3061) {
            boolean var44 = class264.field3874.method2357((byte) 120) == 1;
            String var45 = class264.field3874.method2356(-25178);
            String var46 = var45;
            if (var44) {
                var46 = class264.field3874.method2356(-25178);
            }
            long var47 = (long) class264.field3874.method2338(0);
            long var49 = (long) class264.field3874.method2323((byte) 110);
            int var51 = class264.field3874.method2357((byte) 127);
            int var52 = class264.field3874.method2338(0);
            long var53 = (var47 << 32) + var49;
            boolean var55 = false;
            int var56 = 0;
            while (true) {
                if (var56 >= 100) {
                    if (var51 <= 1 && class167.method1051(var46, (byte) -112)) {
                        var55 = true;
                    }
                    break;
                }
                if (class320.field4626[var56] == var53) {
                    var55 = true;
                    break;
                }
                var56++;
            }
            if (!var55 && class225.field3233 == 0) {
                class320.field4626[class35.field394] = var53;
                class35.field394 = (class35.field394 + 1) % 100;
                String var57 = class186.field2679.method526(var52, 5364).method641((byte) -120, class264.field3874);
                if (var51 == 2) {
                    class387.method2241(null, 0, var57, (byte) -78, "<img=1>" + var46, 18, var52, "<img=1>" + var45);
                } else if (var51 == 1) {
                    class387.method2241(null, 0, var57, (byte) -84, "<img=0>" + var46, 18, var52, "<img=0>" + var45);
                } else {
                    class387.method2241(null, 0, var57, (byte) -87, var46, 18, var52, var45);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class12.field155) {
            int var58 = class264.field3874.method2338(0);
            int var59 = class264.field3874.method2357((byte) 113);
            int var60 = class264.field3874.method2357((byte) 111);
            int var61 = class264.field3874.method2338(0) << 0;
            int var62 = class264.field3874.method2357((byte) 110);
            int var63 = class264.field3874.method2357((byte) 117);
            if (class147.method921(var58, (byte) -127)) {
                class338.method2017(var59, var60, true, var61, -20073, var62, var63);
            }
            class211.field3061 = null;
            return true;
        } else if (class371.field5292 == class211.field3061) {
            String var64 = class264.field3874.method2356(-25178);
            int var65 = class264.field3874.method2338(arg0 + 1);
            String var66 = class186.field2679.method526(var65, arg0 + 5365).method641((byte) -106, class264.field3874);
            class387.method2241(null, 0, var66, (byte) -83, var64, 19, var65, var64);
            class211.field3061 = null;
            return true;
        } else if (class372.field5299 == class211.field3061) {
            class334.method1993(-1, class190.field2715, class268.field3914, class264.field3874);
            class211.field3061 = null;
            return true;
        } else if (class319.field4623 == class211.field3061) {
            int var67 = class264.field3874.method2342(29707);
            int var68 = class264.field3874.method2324(-1033632760);
            int var69 = class264.field3874.method2334(-128);
            if (class147.method921(var69, (byte) -3)) {
                class269.method1694(arg0 ^ 0xFFFFFF9D, var68, var67);
            }
            class211.field3061 = null;
            return true;
        } else if (class6.field106 == class211.field3061) {
            int var70 = class264.field3874.method2357((byte) 127);
            int var71 = class264.field3874.method2324(-1033632760);
            int var72 = class264.field3874.method2333(-1640531527);
            if (class147.method921(var71, (byte) -120)) {
                class10.method59((byte) -128, var70, var72);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class202.field2899) {
            int var73 = class264.field3874.method2342(29707);
            int var74 = class264.field3874.method2338(0);
            int var75 = class264.field3874.method2343((byte) 53);
            if (class147.method921(var74, (byte) 113)) {
                class74.method548((byte) -126, var73, var75);
            }
            class211.field3061 = null;
            return true;
        } else if (class424.field5970 == class211.field3061) {
            class335.field4857 = class524.method3097(12419, class264.field3874.method2357((byte) 117));
            class211.field3061 = null;
            return true;
        } else if (class419.field5896 == class211.field3061) {
            int var76 = class264.field3874.method2380(199752600);
            int var77 = class264.field3874.method2370((byte) 41);
            int var78 = class264.field3874.method2334(-128);
            class378 var79 = (class378) class125.field1687.method2405((long) var76, -125);
            if (var79 != null) {
                class353.method2090(var77, ~arg0, var79.field5353, var78);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class117.field1617) {
            int var80 = class264.field3874.method2342(29707);
            int var81 = class264.field3874.method2319((byte) 109);
            int var82 = class264.field3874.method2334(arg0 ^ 0x7F);
            int var83 = class264.field3874.method2324(-1033632760);
            if (class147.method921(var82, (byte) -3)) {
                class532.method3140(5000, var81, var83, 5, var80);
            }
            class211.field3061 = null;
            return true;
        } else if (class263.field3869 == class211.field3061) {
            int var84 = class264.field3874.method2345((byte) 37);
            int var85 = class264.field3874.method2334(-128);
            int var86 = class264.field3874.method2342(arg0 ^ 0xFFFF8BF4);
            if (class147.method921(var85, (byte) -114)) {
                class489 var87 = (class489) class255.field3763.method2405((long) var86, arg0 ^ 0x6A);
                class489 var88 = (class489) class255.field3763.method2405((long) var84, -54);
                if (var88 != null) {
                    class309.method1870(var88, -26349, var87 == null || var87.field6840 != var88.field6840, false);
                }
                if (var87 != null) {
                    var87.method2891(-124);
                    class255.field3763.method2413((long) var84, var87, -1);
                }
                class150 var89 = client.method1276(arg0 + 90, var86);
                if (var89 != null) {
                    class187.method1190(var89, 117);
                }
                class150 var90 = client.method1276(124, var84);
                if (var90 != null) {
                    class187.method1190(var90, 112);
                    class509.method3040(true, (byte) 73, var90);
                }
                if (class472.field6578 != -1) {
                    class171.method1071(class472.field6578, 2, 1);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class292.field4260 == class211.field3061) {
            boolean var91 = class264.field3874.method2357((byte) 108) == 1;
            String var92 = class264.field3874.method2356(-25178);
            String var93 = var92;
            if (var91) {
                var93 = class264.field3874.method2356(-25178);
            }
            long var94 = class264.field3874.method2351(-128);
            long var96 = (long) class264.field3874.method2338(~arg0);
            long var98 = (long) class264.field3874.method2323((byte) 121);
            int var100 = class264.field3874.method2357((byte) 127);
            int var101 = class264.field3874.method2338(0);
            long var102 = (var96 << 32) + var98;
            boolean var104 = false;
            int var105 = 0;
            while (true) {
                if (var105 >= 100) {
                    if (var100 <= 1 && class167.method1051(var93, (byte) -118)) {
                        var104 = true;
                    }
                    break;
                }
                if (class320.field4626[var105] == var102) {
                    var104 = true;
                    break;
                }
                var105++;
            }
            if (!var104 && class225.field3233 == 0) {
                class320.field4626[class35.field394] = var102;
                class35.field394 = (class35.field394 + 1) % 100;
                String var106 = class186.field2679.method526(var101, 5364).method641((byte) -84, class264.field3874);
                if (var100 == 2) {
                    class387.method2241(class505.method3009(-9697, var94), 0, var106, (byte) -70, "<img=1>" + var93, 20, var101, "<img=1>" + var92);
                } else if (var100 == 1) {
                    class387.method2241(class505.method3009(arg0 ^ 0x25E0, var94), 0, var106, (byte) -50, "<img=0>" + var93, 20, var101, "<img=0>" + var92);
                } else {
                    class387.method2241(class505.method3009(-9697, var94), 0, var106, (byte) 125, var93, 20, var101, var92);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class117.field1633) {
            int var107 = class264.field3874.method2370((byte) 41);
            int var108 = class264.field3874.method2361(255);
            if (var107 == 255) {
                var107 = -1;
                var108 = -1;
            }
            class143.method894(var107, 0, var108);
            class211.field3061 = null;
            return true;
        } else if (class287.field4192 == class211.field3061) {
            int var109 = class264.field3874.method2324(-1033632760);
            int var110 = class264.field3874.method2370((byte) 41);
            if (class147.method921(var109, (byte) 15)) {
                class366.field5219 = var110;
            }
            class211.field3061 = null;
            return true;
        } else if (class460.field6439 == class211.field3061) {
            int var111 = class264.field3874.method2324(-1033632760);
            int var112 = class264.field3874.method2357((byte) 125);
            class163.field2413.method2228((byte) 99, var111, var112);
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class1.field6) {
            boolean var113 = class264.field3874.method2357((byte) 122) == 1;
            String var114 = class264.field3874.method2356(-25178);
            String var115 = var114;
            if (var113) {
                var115 = class264.field3874.method2356(-25178);
            }
            long var116 = class264.field3874.method2351(-128);
            long var118 = (long) class264.field3874.method2338(arg0 + 1);
            long var120 = (long) class264.field3874.method2323((byte) 90);
            int var122 = class264.field3874.method2357((byte) 118);
            long var123 = (var118 << 32) + var120;
            boolean var125 = false;
            int var126 = 0;
            while (true) {
                if (var126 >= 100) {
                    if (var122 <= 1) {
                        if (!(!class236.field3442 || class215.field3120) || class467.field6528) {
                            var125 = true;
                        } else if (class167.method1051(var115, (byte) -95)) {
                            var125 = true;
                        }
                    }
                    break;
                }
                if (class320.field4626[var126] == var123) {
                    var125 = true;
                    break;
                }
                var126++;
            }
            if (!var125 && class225.field3233 == 0) {
                class320.field4626[class35.field394] = var123;
                class35.field394 = (class35.field394 + 1) % 100;
                String var127 = class31.method187((byte) -125, class288.method1776(class264.field3874, true));
                if (var122 == 2 || var122 == 3) {
                    class387.method2241(class505.method3009(-9697, var116), 0, var127, (byte) 77, "<img=1>" + var115, 9, -1, "<img=1>" + var114);
                } else if (var122 == 1) {
                    class387.method2241(class505.method3009(-9697, var116), 0, var127, (byte) -124, "<img=0>" + var115, 9, -1, "<img=0>" + var114);
                } else {
                    class387.method2241(class505.method3009(-9697, var116), 0, var127, (byte) 107, var115, 9, -1, var114);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class100.field1336) {
            int var128 = class264.field3874.method2357((byte) 104);
            boolean var129 = (var128 & 0x1) == 1;
            String var130 = class264.field3874.method2356(-25178);
            String var131 = class264.field3874.method2356(-25178);
            if (var131.equals("")) {
                var131 = var130;
            }
            String var132 = class264.field3874.method2356(-25178);
            String var133 = class264.field3874.method2356(-25178);
            if (var133.equals("")) {
                var133 = var132;
            }
            if (var129) {
                for (int var134 = 0; var134 < class419.field5909; var134++) {
                    if (class388.field5452[var134].equals(var133)) {
                        class366.field5229[var134] = var130;
                        class388.field5452[var134] = var131;
                        class213.field3081[var134] = var132;
                        class152.field2192[var134] = var133;
                        break;
                    }
                }
            } else {
                class366.field5229[class419.field5909] = var130;
                class388.field5452[class419.field5909] = var131;
                class213.field3081[class419.field5909] = var132;
                class152.field2192[class419.field5909] = var133;
                class66.field845[class419.field5909] = class239.method1507(2, var128) == 2;
                class419.field5909++;
            }
            class211.field3061 = null;
            class360.field5154 = class371.field5285;
            return true;
        } else if (class95.field1238 == class211.field3061) {
            int var135 = class264.field3874.method2357((byte) 123);
            if (class264.field3874.method2357((byte) 123) == 0) {
                class345.field5011[var135] = new class62();
            } else {
                class264.field3874.field5665--;
                class345.field5011[var135] = new class62(class264.field3874);
            }
            class211.field3061 = null;
            class369.field5268 = class371.field5285;
            return true;
        } else if (class396.field5618 == class211.field3061) {
            int var136 = class264.field3874.method2380(199752600);
            byte var137 = class264.field3874.method2359(-125);
            int var138 = class264.field3874.method2334(-128);
            if (class147.method921(var138, (byte) 93)) {
                class256.method1650(var136, (byte) 81, var137);
            }
            class211.field3061 = null;
            return true;
        } else if (class344.field5003 == class211.field3061) {
            class29.method180(class461.field6447, -78);
            class211.field3061 = null;
            return true;
        } else if (class400.field5634 == class211.field3061) {
            int var139 = class264.field3874.method2338(0);
            int var140 = class264.field3874.method2338(0);
            int var141 = class264.field3874.method2338(0);
            int var142 = class264.field3874.method2338(0);
            if (class147.method921(var139, (byte) 54) && class494.field6988[var140] != null) {
                for (int var143 = var141; var143 < var142; var143++) {
                    int var144 = class264.field3874.method2323((byte) 118);
                    if (class494.field6988[var140].length > var143 && class494.field6988[var140][var143] != null) {
                        class494.field6988[var140][var143].field2131 = var144;
                    }
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class205.field2972) {
            int var145 = class264.field3874.method2342(29707);
            int var146 = class264.field3874.method2334(arg0 - 127);
            class163.field2413.method2232(var146, var145, -46);
            class211.field3061 = null;
            return true;
        } else if (class526.field7738 == class211.field3061) {
            int var147 = class264.field3874.method2338(0);
            int var148 = class264.field3874.method2357((byte) 104);
            int var149 = class264.field3874.method2357((byte) 114);
            int var150 = class264.field3874.method2357((byte) 126);
            int var151 = class264.field3874.method2357((byte) 114);
            int var152 = class264.field3874.method2338(0);
            if (class147.method921(var147, (byte) 74)) {
                class345.field5006[var148] = true;
                class471.field6568[var148] = var149;
                class262.field3862[var148] = var150;
                class176.field2530[var148] = var151;
                class129.field1722[var148] = var152;
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class15.field194) {
            if (class472.field6578 != -1) {
                class171.method1071(class472.field6578, arg0 ^ 0xFFFFFFFD, 0);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class12.field157) {
            class29.method180(class31.field364, -127);
            class211.field3061 = null;
            return true;
        } else if (class488.field6831 == class211.field3061) {
            class163.field2413.method2226(-1887687385);
            class125.field1689 += 32;
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class155.field2244) {
            class486.field6784 = class264.field3874.method2346((byte) 2);
            class236.field3442 = class264.field3874.method2357((byte) 114) == 1;
            class211.field3061 = null;
            return true;
        } else if (class318.field4600 == class211.field3061) {
            int var153 = class264.field3874.method2338(0);
            if (var153 == 65535) {
                var153 = -1;
            }
            int var154 = class264.field3874.method2357((byte) 122);
            int var155 = class264.field3874.method2338(0);
            int var156 = class264.field3874.method2357((byte) 117);
            class464.method2695((byte) 125, var155, var153, var154, var156);
            class211.field3061 = null;
            return true;
        } else if (class446.field6231 == class211.field3061) {
            class419.field5909 = class264.field3874.method2357((byte) 126);
            for (int var157 = 0; var157 < class419.field5909; var157++) {
                class366.field5229[var157] = class264.field3874.method2356(-25178);
                class388.field5452[var157] = class264.field3874.method2356(-25178);
                if (class388.field5452[var157].equals("")) {
                    class388.field5452[var157] = class366.field5229[var157];
                }
                class213.field3081[var157] = class264.field3874.method2356(class509.method3039(arg0, 25177));
                class152.field2192[var157] = class264.field3874.method2356(-25178);
                if (class152.field2192[var157].equals("")) {
                    class152.field2192[var157] = class213.field3081[var157];
                }
                class66.field845[var157] = false;
            }
            class211.field3061 = null;
            class360.field5154 = class371.field5285;
            return true;
        } else if (class53.field657 == class211.field3061) {
            int var158 = class264.field3874.method2380(199752600);
            int var159 = class264.field3874.method2324(-1033632760);
            String var160 = class264.field3874.method2356(arg0 - 25177);
            if (class147.method921(var159, (byte) 23)) {
                class161.method1025(var160, (byte) -94, var158);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class204.field2905) {
            int var161 = class264.field3874.method2345((byte) 37);
            int var162 = class264.field3874.method2343((byte) 53);
            int var163 = class264.field3874.method2371(arg0 ^ 0xFFFFE405);
            int var164 = class264.field3874.method2334(-128);
            if (class147.method921(var164, (byte) -96)) {
                class481.method2774(-84, var162, var161, var163);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class12.field160) {
            int var165 = class264.field3874.method2334(-128);
            int var166 = class264.field3874.method2326(1789029408);
            boolean var167 = (var166 & 0x1) == 1;
            class393.method2278((byte) -56, var165, var167);
            class225.field3236[class239.method1507(class189.field2705++, 31)] = var165;
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class121.field1663) {
            int var168 = class264.field3874.method2338(~arg0);
            if (class147.method921(var168, (byte) -121)) {
                class522.method3086((byte) 102);
            }
            class211.field3061 = null;
            return true;
        } else if (class322.field4713 == class211.field3061) {
            int var169 = class264.field3874.method2370((byte) 41);
            int var170 = class264.field3874.method2345((byte) 37);
            int var171 = class264.field3874.method2326(1789029408);
            class62.field780[var171] = var170;
            class324.field4725[var171] = var169;
            class30.field358[var171] = 1;
            int var172 = class466.field6516[var171] - 1;
            for (int var173 = 0; var173 < var172; var173++) {
                if (var170 >= class260.field3842[var173]) {
                    class30.field358[var171] = var173 + 2;
                }
            }
            class446.field6232[class239.method1507(class437.field6131++, 31)] = var171;
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class194.field2759) {
            int var174 = class264.field3874.method2345((byte) 37);
            int var175 = class264.field3874.method2380(199752600);
            int var176 = class264.field3874.method2338(0);
            if (var176 == 65535) {
                var176 = -1;
            }
            if (class147.method921(var175, (byte) -117)) {
                class532.method3140(arg0 + 5001, var174, var176, 2, -1);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class190.field2721) {
            class295.method1819(110, class190.field2715, class264.field3874);
            class211.field3061 = null;
            return true;
        } else if (class353.field5074 == class211.field3061) {
            int var177 = class264.field3874.method2333(-1640531527);
            int var178 = class264.field3874.method2324(-1033632760);
            if (var178 == 65535) {
                var178 = -1;
            }
            int var179 = class264.field3874.method2334(-128);
            if (class147.method921(var179, (byte) 90)) {
                class532.method3140(5000, var177, var178, 1, -1);
            }
            class211.field3061 = null;
            return true;
        } else if (class437.field6123 == class211.field3061) {
            class478.field6653 = class371.field5285;
            if (class190.field2715 == 0) {
                class4.field80 = null;
                class305.field4435 = 0;
                class211.field3061 = null;
                class371.field5293 = null;
                class77.field1009 = null;
                return true;
            }
            class371.field5293 = class264.field3874.method2356(-25178);
            boolean var180 = class264.field3874.method2357((byte) 114) == 1;
            if (var180) {
                class264.field3874.method2356(-25178);
            }
            long var181 = class264.field3874.method2351(-128);
            class77.field1009 = class269.method1693((byte) 100, var181);
            class360.field5146 = class264.field3874.method2359(108);
            int var183 = class264.field3874.method2357((byte) 113);
            if (var183 == 255) {
                class211.field3061 = null;
                return true;
            }
            class305.field4435 = var183;
            class528[] var184 = new class528[100];
            for (int var185 = 0; var185 < class305.field4435; var185++) {
                var184[var185] = new class528();
                var184[var185].field7755 = class264.field3874.method2356(-25178);
                boolean var191 = class264.field3874.method2357((byte) 113) == 1;
                if (var191) {
                    var184[var185].field7749 = class264.field3874.method2356(arg0 ^ 0x6259);
                } else {
                    var184[var185].field7749 = var184[var185].field7755;
                }
                var184[var185].field7747 = class487.method2806(arg0 ^ 0x5D48, var184[var185].field7749);
                var184[var185].field7753 = class264.field3874.method2338(0);
                var184[var185].field7756 = class264.field3874.method2359(-2);
                var184[var185].field7750 = class264.field3874.method2356(-25178);
                if (var184[var185].field7749.equals(class246.field3587.field256)) {
                    class338.field4879 = var184[var185].field7756;
                }
            }
            boolean var186 = false;
            int var187 = class305.field4435;
            while (var187 > 0) {
                var187--;
                boolean var188 = true;
                for (int var189 = 0; var189 < var187; var189++) {
                    if (var184[var189].field7747.compareTo(var184[var189 + 1].field7747) > 0) {
                        class528 var190 = var184[var189];
                        var184[var189] = var184[var189 + 1];
                        var188 = false;
                        var184[var189 + 1] = var190;
                    }
                }
                if (var188) {
                    break;
                }
            }
            class4.field80 = var184;
            class211.field3061 = null;
            return true;
        } else if (class57.field722 == class211.field3061) {
            int var192 = class264.field3874.method2361(255);
            int var193 = class264.field3874.method2324(arg0 ^ 0x3D9BFBF7);
            int var194 = class264.field3874.method2334(-128);
            if (class147.method921(var193, (byte) 3)) {
                if (var192 == 2) {
                    class368.method2172((byte) 98);
                }
                class472.field6578 = var194;
                class315.method1895(var194, (byte) 3);
                class106.method719(2, false);
                class495.method2867(class472.field6578);
                for (int var195 = 0; var195 < 100; var195++) {
                    class306.field4450[var195] = true;
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class308.field4470 == class211.field3061) {
            class187.method1191(-4612);
            class211.field3061 = null;
            return false;
        } else if (class211.field3061 == class117.field1600) {
            String var196 = class264.field3874.method2356(-25178);
            int var197 = class264.field3874.method2338(arg0 + 1);
            int var198 = class264.field3874.method2342(29707);
            if (class147.method921(var197, (byte) 83)) {
                class328.method1976(var196, -21322, var198);
            }
            class211.field3061 = null;
            return true;
        } else if (class392.field5511 == class211.field3061) {
            int var199 = class264.field3874.method2338(0);
            int var200 = class264.field3874.method2319((byte) 112);
            if (class147.method921(var199, (byte) -107)) {
                class489 var201 = (class489) class255.field3763.method2405((long) var200, arg0 - 40);
                if (var201 != null) {
                    class309.method1870(var201, -26349, true, false);
                }
                if (class411.field5809 != null) {
                    class187.method1190(class411.field5809, 97);
                    class411.field5809 = null;
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class284.field4164 == class211.field3061) {
            int var202 = class264.field3874.method2338(0);
            int var203 = class264.field3874.method2357((byte) 105);
            boolean var204 = (var203 & 0x1) == 1;
            class389.method2255(var204, 0, var202);
            int var205 = class264.field3874.method2338(0);
            for (int var206 = 0; var206 < var205; var206++) {
                int var207 = class264.field3874.method2357((byte) 111);
                if (var207 == 255) {
                    var207 = class264.field3874.method2342(29707);
                }
                int var208 = class264.field3874.method2334(-128);
                class542.method3185(var204, arg0 ^ 0xFFFFFF9A, var207, var206, var208 - 1, var202);
            }
            class225.field3236[class239.method1507(class189.field2705++, 31)] = var202;
            class211.field3061 = null;
            return true;
        } else if (class304.field4434 == class211.field3061) {
            int var209 = class264.field3874.method2325(true);
            int var210 = class264.field3874.method2319((byte) 114);
            int var211 = class264.field3874.method2357((byte) 119);
            String var212 = "";
            String var213 = var212;
            if ((var211 & 0x1) != 0) {
                var212 = class264.field3874.method2356(-25178);
                if ((var211 & 0x2) == 0) {
                    var213 = var212;
                } else {
                    var213 = class264.field3874.method2356(-25178);
                }
            }
            String var214 = class264.field3874.method2356(-25178);
            if (var209 == 99) {
                class486.method2805(125, var214);
            } else if (var213.equals("") || !class167.method1051(var213, (byte) -116)) {
                method661(var214, arg0, var213, var212, var209, var210);
            } else {
                class211.field3061 = null;
                return true;
            }
            class211.field3061 = null;
            return true;
        } else if (class411.field5801 == class211.field3061) {
            class467.method2711(6591);
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class20.field237) {
            boolean var215 = class264.field3874.method2357((byte) 105) == 1;
            String var216 = class264.field3874.method2356(arg0 ^ 0x6259);
            String var217 = var216;
            if (var215) {
                var217 = class264.field3874.method2356(-25178);
            }
            int var218 = class264.field3874.method2357((byte) 117);
            int var219 = class264.field3874.method2338(0);
            boolean var220 = false;
            if (var218 <= 1 && class167.method1051(var217, (byte) -96)) {
                var220 = true;
            }
            if (!var220 && class225.field3233 == 0) {
                String var221 = class186.field2679.method526(var219, 5364).method641((byte) -100, class264.field3874);
                if (var218 == 2) {
                    class387.method2241(null, 0, var221, (byte) 101, "<img=1>" + var217, 25, var219, "<img=1>" + var216);
                } else if (var218 == 1) {
                    class387.method2241(null, 0, var221, (byte) 105, "<img=0>" + var217, 25, var219, "<img=0>" + var216);
                } else {
                    class387.method2241(null, 0, var221, (byte) 87, var217, 25, var219, var216);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class207.field2998) {
            int var222 = class264.field3874.method2334(-128);
            int var223 = class264.field3874.method2342(29707);
            int var224 = class264.field3874.method2380(199752600);
            int var225 = class264.field3874.method2380(199752600);
            int var226 = class264.field3874.method2338(0);
            if (class147.method921(var226, (byte) -119)) {
                class485.method2795(var224, -14571, var225, var223, var222);
            }
            class211.field3061 = null;
            return true;
        } else if (class380.field5362 == class211.field3061) {
            class29.method180(class386.field5420, arg0 - 116);
            class211.field3061 = null;
            return true;
        } else if (class514.field7586 == class211.field3061) {
            class213.field3082 = class264.field3874.method2357((byte) 106);
            class430.field6068 = class371.field5285;
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class152.field2189) {
            class29.method180(class241.field3504, -94);
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class127.field1708) {
            int var227 = class264.field3874.method2338(0);
            int var228 = class264.field3874.method2357((byte) 125);
            boolean var229 = (var228 & 0x1) == 1;
            while (class264.field3874.field5665 < class190.field2715) {
                int var230 = class264.field3874.method2325(true);
                int var231 = class264.field3874.method2338(0);
                int var232 = 0;
                if (var231 != 0) {
                    var232 = class264.field3874.method2357((byte) 125);
                    if (var232 == 255) {
                        var232 = class264.field3874.method2319((byte) 84);
                    }
                }
                class542.method3185(var229, arg0 ^ 0xFFFFFFF2, var232, var230, var231 - 1, var227);
            }
            class225.field3236[class239.method1507(31, class189.field2705++)] = var227;
            class211.field3061 = null;
            return true;
        } else if (class389.field5467 == class211.field3061) {
            int var233 = class264.field3874.method2345((byte) 37);
            int var234 = class264.field3874.method2380(arg0 + 199752601);
            int var235 = class264.field3874.method2324(-1033632760);
            if (class147.method921(var235, (byte) 78)) {
                class135.method852(var234, var233, (byte) 18);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class179.field2562) {
            class413.method2447(true, false);
            class211.field3061 = null;
            return true;
        } else if (class354.field5079 == class211.field3061) {
            class211.field3061 = null;
            return false;
        } else if (class88.field1107 == class211.field3061) {
            int var236 = class264.field3874.method2342(arg0 ^ 0xFFFF8BF4);
            int var237 = class264.field3874.method2324(-1033632760);
            class163.field2413.method2228((byte) 117, var237, var236);
            class211.field3061 = null;
            return true;
        } else if (class500.field7084 == class211.field3061) {
            int var238 = class264.field3874.method2334(arg0 ^ 0x7F);
            int var239 = class264.field3874.method2338(0);
            int var240 = class264.field3874.method2338(0);
            if (class147.method921(var239, (byte) 79)) {
                class481.method2772(var238, 0, var240, 3);
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class188.field2701) {
            class287.method1771(false, arg0 ^ 0x800);
            class211.field3061 = null;
            return false;
        } else if (class211.field3061 == class108.field1475) {
            class29.method180(class510.field7557, -101);
            class211.field3061 = null;
            return true;
        } else if (class97.field1277 == class211.field3061) {
            class29.method180(class161.field2378, -103);
            class211.field3061 = null;
            return true;
        } else if (class460.field6431 == class211.field3061) {
            class413.method2447(false, false);
            class211.field3061 = null;
            return true;
        } else if (class435.field6116 == class211.field3061) {
            int var241 = class264.field3874.method2334(arg0 ^ 0x7F);
            int var242 = class264.field3874.method2319((byte) 91);
            if (class147.method921(var241, (byte) 84)) {
                class532.method3140(5000, var242, -1, 3, -1);
            }
            class211.field3061 = null;
            return true;
        } else if (class282.field4149 == class211.field3061) {
            int var243 = class264.field3874.method2338(0);
            if (class147.method921(var243, (byte) -109)) {
                class61.method493(22991);
            }
            class211.field3061 = null;
            return true;
        } else if (class511.field7566 == class211.field3061) {
            String var244 = class264.field3874.method2356(-25178);
            int var245 = class264.field3874.method2334(-128);
            int var246 = class264.field3874.method2338(0);
            if (class147.method921(var246, (byte) 114)) {
                class161.method1025(var244, (byte) -90, var245);
            }
            class211.field3061 = null;
            return true;
        } else if (class80.field1046 == class211.field3061) {
            int var247 = class264.field3874.method2338(0);
            int var248 = class264.field3874.method2319((byte) 126);
            int var249 = class264.field3874.method2333(-1640531527);
            int var250 = class264.field3874.method2324(-1033632760);
            if (var250 == 65535) {
                var250 = -1;
            }
            int var251 = class264.field3874.method2334(-128);
            if (var251 == 65535) {
                var251 = -1;
            }
            if (class147.method921(var247, (byte) 97)) {
                for (int var252 = var250; var252 <= var251; var252++) {
                    long var253 = ((long) var249 << 32) + (long) var252;
                    class496 var255 = (class496) class221.field3183.method2405(var253, -128);
                    class496 var256;
                    if (var255 != null) {
                        var256 = new class496(var248, var255.field7026);
                        var255.method2891(111);
                    } else if (var252 == -1) {
                        var256 = new class496(var248, client.method1276(112, var249).field2101.field7026);
                    } else {
                        var256 = new class496(var248, -1);
                    }
                    class221.field3183.method2413(var253, var256, -1);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class215.field3117 == class211.field3061) {
            class360.field5154 = class371.field5285;
            class246.field3589 = 1;
            class211.field3061 = null;
            return true;
        } else if (class31.field369 == class211.field3061) {
            class230.field3393 = class264.field3874.method2357((byte) 119);
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class105.field1388) {
            int var257 = class264.field3874.method2333(-1640531527);
            int var258 = class264.field3874.method2338(arg0 + 1);
            if (class147.method921(var258, (byte) 36)) {
                class532.method3140(5000, var257, class343.field4982, 5, 0);
            }
            class211.field3061 = null;
            return true;
        } else if (class372.field5300 == class211.field3061) {
            int var259 = class264.field3874.method2338(0);
            String var260 = class264.field3874.method2356(-25178);
            Object[] var261 = new Object[var260.length() + 1];
            for (int var262 = var260.length() - 1; var262 >= 0; var262--) {
                if (var260.charAt(var262) == 's') {
                    var261[var262 + 1] = class264.field3874.method2356(-25178);
                } else {
                    var261[var262 + 1] = Integer.valueOf(class264.field3874.method2319((byte) 83));
                }
            }
            var261[0] = Integer.valueOf(class264.field3874.method2319((byte) 90));
            if (class147.method921(var259, (byte) -100)) {
                class389 var263 = new class389();
                var263.field5466 = var261;
                class495.method2866(var263);
            }
            class211.field3061 = null;
            return true;
        } else if (class422.field5953 == class211.field3061) {
            int var264 = class264.field3874.method2338(0);
            int var265 = class264.field3874.method2333(-1640531527);
            int var266 = class264.field3874.method2334(-128);
            if (class147.method921(var264, (byte) 70)) {
                class460.method2680(var265, 101, var266);
            }
            class211.field3061 = null;
            return true;
        } else if (class56.field708 == class211.field3061) {
            int var267 = class264.field3874.method2357((byte) 105);
            int var268 = var267 >> 5;
            int var269 = var267 & 0x1F;
            if (var269 == 0) {
                class20.field234[var268] = null;
                class211.field3061 = null;
                return true;
            }
            class373 var270 = new class373();
            var270.field5302 = var269;
            var270.field5306 = class264.field3874.method2357((byte) 123);
            if (var270.field5306 >= 0 && class536.field7852.length > var270.field5306) {
                if (var270.field5302 == 1 || var270.field5302 == 10) {
                    var270.field5310 = class264.field3874.method2338(0);
                    class264.field3874.field5665 += 6;
                } else if (var270.field5302 >= 2 && var270.field5302 <= 6) {
                    if (var270.field5302 == 2) {
                        var270.field5305 = 64;
                        var270.field5308 = 64;
                    }
                    if (var270.field5302 == 3) {
                        var270.field5305 = 64;
                        var270.field5308 = 0;
                    }
                    if (var270.field5302 == 4) {
                        var270.field5305 = 64;
                        var270.field5308 = 128;
                    }
                    if (var270.field5302 == 5) {
                        var270.field5305 = 0;
                        var270.field5308 = 64;
                    }
                    if (var270.field5302 == 6) {
                        var270.field5305 = 128;
                        var270.field5308 = 64;
                    }
                    var270.field5302 = 2;
                    var270.field5307 = class264.field3874.method2357((byte) 126);
                    var270.field5308 += class264.field3874.method2338(arg0 + 1) - class441.field6171 << 7;
                    var270.field5305 += class264.field3874.method2338(0) - class367.field5241 << 7;
                    var270.field5303 = class264.field3874.method2357((byte) 118) << 0;
                    var270.field5311 = class264.field3874.method2338(0);
                }
                var270.field5313 = class264.field3874.method2338(0);
                if (var270.field5313 == 65535) {
                    var270.field5313 = -1;
                }
                class20.field234[var268] = var270;
            }
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class146.field1923) {
            boolean var271 = class264.field3874.method2357((byte) 105) == 1;
            String var272 = class264.field3874.method2356(-25178);
            String var273 = var272;
            if (var271) {
                var273 = class264.field3874.method2356(arg0 - 25177);
            }
            long var274 = (long) class264.field3874.method2338(0);
            long var276 = (long) class264.field3874.method2323((byte) 80);
            int var278 = class264.field3874.method2357((byte) 123);
            long var279 = (var274 << 32) + var276;
            boolean var281 = false;
            int var282 = 0;
            while (true) {
                if (var282 >= 100) {
                    if (var278 <= 1) {
                        if (!(!class236.field3442 || class215.field3120) || class467.field6528) {
                            var281 = true;
                        } else if (class167.method1051(var273, (byte) -122)) {
                            var281 = true;
                        }
                    }
                    break;
                }
                if (class320.field4626[var282] == var279) {
                    var281 = true;
                    break;
                }
                var282++;
            }
            if (!var281 && class225.field3233 == 0) {
                class320.field4626[class35.field394] = var279;
                class35.field394 = (class35.field394 + 1) % 100;
                String var283 = class31.method187((byte) 68, class288.method1776(class264.field3874, true));
                if (var278 == 2) {
                    class387.method2241(null, 0, var283, (byte) 115, "<img=1>" + var273, 7, -1, "<img=1>" + var272);
                } else if (var278 == 1) {
                    class387.method2241(null, 0, var283, (byte) -94, "<img=0>" + var273, 7, -1, "<img=0>" + var272);
                } else {
                    class387.method2241(null, 0, var283, (byte) 99, var273, 3, -1, var272);
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class393.field5522 == class211.field3061) {
            int var284 = class264.field3874.method2324(-1033632760);
            byte var285 = class264.field3874.method2352(128);
            class163.field2413.method2232(var284, var285, -104);
            class211.field3061 = null;
            return true;
        } else if (class37.field406 == class211.field3061) {
            int var286 = class264.field3874.method2333(-1640531527);
            int var287 = class264.field3874.method2338(0);
            int var288 = class264.field3874.method2338(arg0 + 1);
            if (var288 == 65535) {
                var288 = -1;
            }
            int var289 = class264.field3874.method2345((byte) 37);
            if (class147.method921(var287, (byte) -112)) {
                class189.method1205((byte) -72, var286, var289, var288);
                class395 var290 = class344.field5000.method993(var288, true);
                class485.method2795(var290.field5543, -14571, var290.field5563, var289, var290.field5570);
                class251.method1633(var290.field5591, var290.field5606, 8, var289, var290.field5601);
            }
            class211.field3061 = null;
            return true;
        } else if (class384.field5403 == class211.field3061) {
            class287.method1771(class137.field1794, -2049);
            class211.field3061 = null;
            return false;
        } else if (class519.field7645 == class211.field3061) {
            class29.method180(class58.field730, -99);
            class211.field3061 = null;
            return true;
        } else if (class386.field5424 == class211.field3061) {
            int var291 = class264.field3874.method2380(199752600);
            if (var291 == 65535) {
                var291 = -1;
            }
            int var292 = class264.field3874.method2357((byte) 104);
            int var293 = class264.field3874.method2357((byte) 110);
            class48.method278(var292, var291, var293, -1);
            class211.field3061 = null;
            return true;
        } else if (class450.field6292 == class211.field3061) {
            int var294 = class264.field3874.method2380(199752600);
            if (var294 == 65535) {
                var294 = -1;
            }
            int var295 = class264.field3874.method2362(-3);
            int var296 = class264.field3874.method2361(255);
            class29.method184(var294, var296, var295, 110);
            class211.field3061 = null;
            return true;
        } else if (class498.field7051 == class211.field3061) {
            class380.field5370 = class264.field3874.method2357((byte) 121);
            class254.field3754 = class264.field3874.method2370((byte) 41);
            class211.field3061 = null;
            return true;
        } else if (class441.field6156 == class211.field3061) {
            int var297 = class264.field3874.method2324(-1033632760);
            int var298 = class264.field3874.method2370((byte) 41);
            int var299 = class264.field3874.method2338(0);
            int var300 = class264.field3874.method2342(29707);
            int var301 = class264.field3874.method2338(~arg0);
            boolean var302 = (var298 & 0x80) != 0;
            if ((var300 >> 30) != 0) {
                int var334 = var300 >> 28 & 0x3;
                int var335 = ((var300 & 0xFFFC272) >> 14) - class441.field6171;
                int var336 = (var300 & 0x3FFF) - class367.field5241;
                if (var335 >= 0 && var336 >= 0 && var335 < class43.field494 && class500.field7068 > var336) {
                    int var337 = var335 * 128 + 64;
                    int var338 = var336 * 128 + 64;
                    int var339 = var334;
                    if (var334 < 3 && class362.method2135(var336, arg0 ^ 0xFFFFFF8C, var335)) {
                        var339 = var334 + 1;
                    }
                    class196 var340 = new class196(var299, 0, class390.field5481, var334, var339, var337, class488.method2817(var337, true, var338, var334) - var297, var338, var335, var335, var336, var336, var298);
                    class424.field5976.method2657(arg0 + 8493, new class300(var340));
                }
            } else if (var300 >> 29 != 0) {
                int var303 = var300 & 0xFFFF;
                class378 var304 = (class378) class125.field1687.method2405((long) var303, -103);
                if (var304 != null) {
                    class429 var305 = var304.field5353;
                    if (var299 == 65535) {
                        var299 = -1;
                    }
                    boolean var306 = true;
                    int var307 = var302 ? var305.field3350 : var305.field3275;
                    if (var299 != -1 && var307 != -1) {
                        if (var299 == var307) {
                            class508 var308 = class125.field1688.method2457(var299, (byte) 87);
                            if (var308.field7520 && var308.field7504 != -1) {
                                class449 var309 = class62.field784.method2566(var308.field7504, arg0 ^ 0x12);
                                int var310 = var309.field6286;
                                if (var310 == 0 || var310 == 2) {
                                    var306 = false;
                                } else if (var310 == 1) {
                                    var306 = true;
                                }
                            }
                        } else {
                            class508 var311 = class125.field1688.method2457(var299, (byte) 87);
                            class508 var312 = class125.field1688.method2457(var307, (byte) 87);
                            if (var311.field7504 != -1 && var312.field7504 != -1) {
                                class449 var313 = class62.field784.method2566(var311.field7504, arg0 - 18);
                                class449 var314 = class62.field784.method2566(var312.field7504, -19);
                                if (var314.field6274 > var313.field6274) {
                                    var306 = false;
                                }
                            }
                        }
                    }
                    if (var306) {
                        if (var302) {
                            var305.field3291 = class390.field5481 + var301;
                            var305.field3350 = var299;
                            var305.field3279 = var297;
                            var305.field3322 = 0;
                            var305.field3344 = 1;
                            var305.field3364 = var298 & 0x7;
                            var305.field3321 = 0;
                            if (var305.field3291 > class390.field5481) {
                                var305.field3322 = -1;
                            }
                            if (var305.field3350 != -1 && class390.field5481 == var305.field3291) {
                                int var317 = class125.field1688.method2457(var305.field3350, (byte) 87).field7504;
                                if (var317 != -1) {
                                    class449 var318 = class62.field784.method2566(var317, -19);
                                    if (var318 != null && var318.field6276 != null) {
                                        class190.method1213(0, var305.field1896, (byte) 49, var318, var305.field1904, false, var305.field1899);
                                    }
                                }
                            }
                        } else {
                            var305.field3296 = class390.field5481 + var301;
                            var305.field3318 = 1;
                            var305.field3276 = 0;
                            var305.field3346 = var297;
                            var305.field3280 = var298 & 0x7;
                            var305.field3362 = 0;
                            var305.field3275 = var299;
                            if (var305.field3296 > class390.field5481) {
                                var305.field3362 = -1;
                            }
                            if (var305.field3275 != -1 && class390.field5481 == var305.field3296) {
                                int var315 = class125.field1688.method2457(var305.field3275, (byte) 87).field7504;
                                if (var315 != -1) {
                                    class449 var316 = class62.field784.method2566(var315, -19);
                                    if (var316 != null && var316.field6276 != null) {
                                        class190.method1213(0, var305.field1896, (byte) 113, var316, var305.field1904, false, var305.field1899);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var300 >> 28 != 0) {
                int var319 = var300 & 0xFFFF;
                class22 var320;
                if (class343.field4982 == var319) {
                    var320 = class246.field3587;
                } else {
                    var320 = class378.field5355[var319];
                }
                if (var320 != null) {
                    if (var299 == 65535) {
                        var299 = -1;
                    }
                    boolean var321 = true;
                    int var322 = var302 ? var320.field3350 : var320.field3275;
                    if (var299 != -1 && var322 != -1) {
                        if (var299 == var322) {
                            class508 var323 = class125.field1688.method2457(var299, (byte) 87);
                            if (var323.field7520 && var323.field7504 != -1) {
                                class449 var324 = class62.field784.method2566(var323.field7504, -19);
                                int var325 = var324.field6286;
                                if (var325 == 0 || var325 == 2) {
                                    var321 = false;
                                } else if (var325 == 1) {
                                    var321 = true;
                                }
                            }
                        } else {
                            class508 var326 = class125.field1688.method2457(var299, (byte) 87);
                            class508 var327 = class125.field1688.method2457(var322, (byte) 87);
                            if (var326.field7504 != -1 && var327.field7504 != -1) {
                                class449 var328 = class62.field784.method2566(var326.field7504, -19);
                                class449 var329 = class62.field784.method2566(var327.field7504, -19);
                                if (var328.field6274 < var329.field6274) {
                                    var321 = false;
                                }
                            }
                        }
                    }
                    if (var321) {
                        if (var302) {
                            var320.field3291 = class390.field5481 + var301;
                            var320.field3279 = var297;
                            var320.field3350 = var299;
                            var320.field3321 = 0;
                            var320.field3344 = 1;
                            var320.field3322 = 0;
                            var320.field3364 = var298 & 0x7;
                            if (class390.field5481 < var320.field3291) {
                                var320.field3322 = -1;
                            }
                            if (var320.field3350 == 65535) {
                                var320.field3350 = -1;
                            }
                            if (var320.field3350 != -1 && class390.field5481 == var320.field3291) {
                                int var330 = class125.field1688.method2457(var320.field3350, (byte) 87).field7504;
                                if (var330 != -1) {
                                    class449 var331 = class62.field784.method2566(var330, arg0 - 18);
                                    if (var331 != null && var331.field6276 != null) {
                                        class190.method1213(0, var320.field1896, (byte) -116, var331, var320.field1904, class246.field3587 == var320, var320.field1899);
                                    }
                                }
                            }
                        } else {
                            var320.field3280 = var298 & 0x7;
                            var320.field3346 = var297;
                            var320.field3275 = var299;
                            var320.field3276 = 0;
                            var320.field3362 = 0;
                            var320.field3318 = 1;
                            var320.field3296 = class390.field5481 + var301;
                            if (var320.field3275 == 65535) {
                                var320.field3275 = -1;
                            }
                            if (class390.field5481 < var320.field3296) {
                                var320.field3362 = -1;
                            }
                            if (var320.field3275 != -1 && class390.field5481 == var320.field3296) {
                                int var332 = class125.field1688.method2457(var320.field3275, (byte) 87).field7504;
                                if (var332 != -1) {
                                    class449 var333 = class62.field784.method2566(var332, -19);
                                    if (var333 != null && var333.field6276 != null) {
                                        class190.method1213(0, var320.field1896, (byte) -106, var333, var320.field1904, class246.field3587 == var320, var320.field1899);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class476.field6631 == class211.field3061) {
            class29.method180(class48.field548, -94);
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class158.field2361) {
            String var341 = class264.field3874.method2356(arg0 ^ 0x6259);
            boolean var342 = class264.field3874.method2357((byte) 105) == 1;
            String var343;
            if (var342) {
                var343 = class264.field3874.method2356(-25178);
            } else {
                var343 = var341;
            }
            int var344 = class264.field3874.method2338(0);
            byte var345 = class264.field3874.method2359(113);
            boolean var346 = false;
            if (var345 == -128) {
                var346 = true;
            }
            if (var346) {
                if (class305.field4435 == 0) {
                    class211.field3061 = null;
                    return true;
                }
                boolean var352 = false;
                int var353;
                for (var353 = 0; var353 < class305.field4435 && (!class4.field80[var353].field7749.equals(var343) || class4.field80[var353].field7753 != var344); var353++) {
                }
                if (var353 < class305.field4435) {
                    while (var353 < (class305.field4435 - 1)) {
                        class4.field80[var353] = class4.field80[var353 + 1];
                        var353++;
                    }
                    class305.field4435--;
                    class4.field80[class305.field4435] = null;
                }
            } else {
                String var347 = class264.field3874.method2356(arg0 - 25177);
                class528 var348 = new class528();
                var348.field7755 = var341;
                var348.field7749 = var343;
                var348.field7747 = class487.method2806(-23881, var348.field7749);
                var348.field7756 = var345;
                var348.field7750 = var347;
                var348.field7753 = var344;
                int var349;
                for (var349 = class305.field4435 - 1; var349 >= 0; var349--) {
                    int var350 = class4.field80[var349].field7747.compareTo(var348.field7747);
                    if (var350 == 0) {
                        class4.field80[var349].field7753 = var344;
                        class4.field80[var349].field7756 = var345;
                        class4.field80[var349].field7750 = var347;
                        if (var343.equals(class246.field3587.field256)) {
                            class338.field4879 = var345;
                        }
                        class478.field6653 = class371.field5285;
                        class211.field3061 = null;
                        return true;
                    }
                    if (var350 < 0) {
                        break;
                    }
                }
                if (class305.field4435 >= class4.field80.length) {
                    class211.field3061 = null;
                    return true;
                }
                for (int var351 = class305.field4435 - 1; var351 > var349; var351--) {
                    class4.field80[var351 + 1] = class4.field80[var351];
                }
                if (class305.field4435 == 0) {
                    class4.field80 = new class528[100];
                }
                class4.field80[var349 + 1] = var348;
                class305.field4435++;
                if (var343.equals(class246.field3587.field256)) {
                    class338.field4879 = var345;
                }
            }
            class211.field3061 = null;
            class478.field6653 = class371.field5285;
            return true;
        } else if (class211.field3061 == class207.field3002) {
            for (int var354 = 0; var354 < class378.field5355.length; var354++) {
                if (class378.field5355[var354] != null) {
                    class378.field5355[var354].field3320 = -1;
                }
            }
            for (int var355 = 0; var355 < class481.field6704; var355++) {
                class367.field5245[var355].field5353.field3320 = -1;
            }
            class211.field3061 = null;
            return true;
        } else if (class353.field5064 == class211.field3061) {
            String var356 = class264.field3874.method2356(-25178);
            String var357 = class31.method187((byte) 98, class288.method1776(class264.field3874, true));
            method661(var357, arg0, var356, var356, 6, 0);
            class211.field3061 = null;
            return true;
        } else if (class81.field1049 == class211.field3061) {
            class422.method2505(class264.field3874.method2356(-25178), 112);
            class211.field3061 = null;
            return true;
        } else if (class455.field6391 == class211.field3061) {
            class225.field3240 = class190.field2715 <= 2 ? class294.field4306.method3116(class149.field1979, (byte) 120) : class264.field3874.method2356(-25178);
            class295.field4330 = class190.field2715 <= 0 ? -1 : class264.field3874.method2338(0);
            if (class295.field4330 == 65535) {
                class295.field4330 = -1;
            }
            class211.field3061 = null;
            return true;
        } else if (class438.field6142 == class211.field3061) {
            int var358 = class264.field3874.method2380(199752600);
            if (var358 == 65535) {
                var358 = -1;
            }
            int var359 = class264.field3874.method2326(1789029408);
            int var360 = var359 >> 2;
            int var361 = var359 & 0x3;
            int var362 = class107.field1452[var360];
            int var363 = class264.field3874.method2333(arg0 - 1640531526);
            int var364 = var363 >> 28 & 0x3;
            int var365 = (var363 & 0xFFFFB9F) >> 14;
            int var366 = var363 & 0x3FFF;
            int var367 = var365 - class441.field6171;
            int var368 = var366 - class367.field5241;
            class48.method281(var367, var361, var368, var360, var364, var358, var362, false);
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class162.field2395) {
            class285.field4172 = class264.field3874.method2341(false) << 3;
            class430.field6069 = class264.field3874.method2357((byte) 105);
            class340.field4927 = class264.field3874.method2352(128) << 3;
            while (class264.field3874.field5665 < class190.field2715) {
                class242 var369 = class542.method3183(28576)[class264.field3874.method2357((byte) 114)];
                class29.method180(var369, -95);
            }
            class211.field3061 = null;
            return true;
        } else if (class442.field6185 == class211.field3061) {
            class192.method1222(0);
            class211.field3061 = null;
            return false;
        } else if (class462.field6465 == class211.field3061) {
            class264.field3874.field5665 += 28;
            if (class264.field3874.method2328((byte) 106)) {
                class412.method2440(class264.field3874.field5665 - 28, (byte) -104, class264.field3874);
            }
            class211.field3061 = null;
            return true;
        } else if (class503.field7309 == class211.field3061) {
            int var370 = class264.field3874.method2324(-1033632760);
            int var371 = class264.field3874.method2370((byte) 41);
            int var372 = class264.field3874.method2319((byte) 115);
            int var373 = class264.field3874.method2338(0);
            if (class147.method921(var370, (byte) 109)) {
                class489 var374 = (class489) class255.field3763.method2405((long) var372, -74);
                if (var374 != null) {
                    class309.method1870(var374, arg0 ^ 0x66EC, var374.field6840 != var373, false);
                }
                class371.method2177(var373, false, 19089, var372, var371);
            }
            class211.field3061 = null;
            return true;
        } else if (class378.field5354 == class211.field3061) {
            class29.method180(class485.field6765, arg0 ^ 0x54);
            class211.field3061 = null;
            return true;
        } else if (class316.field4589 == class211.field3061) {
            while (class264.field3874.field5665 < class190.field2715) {
                boolean var385 = class264.field3874.method2357((byte) 106) == 1;
                String var386 = class264.field3874.method2356(-25178);
                String var387 = class264.field3874.method2356(arg0 - 25177);
                int var388 = class264.field3874.method2338(0);
                int var389 = class264.field3874.method2357((byte) 107);
                String var390 = "";
                boolean var391 = false;
                if (var388 > 0) {
                    var390 = class264.field3874.method2356(-25178);
                    var391 = class264.field3874.method2357((byte) 109) == 1;
                }
                for (int var392 = 0; var392 < class520.field7656; var392++) {
                    if (var385) {
                        if (var387.equals(class540.field7902[var392])) {
                            class540.field7902[var392] = var386;
                            class474.field6600[var392] = var387;
                            var386 = null;
                            break;
                        }
                    } else if (var386.equals(class540.field7902[var392])) {
                        if (class505.field7488[var392] != var388) {
                            boolean var393 = true;
                            for (class440 var394 = (class440) class466.field6510.method2748(2); var394 != null; var394 = (class440) class466.field6510.method2751(-16195)) {
                                if (var394.field6151.equals(var386)) {
                                    if (var388 != 0 && var394.field6150 == 0) {
                                        var394.method1805((byte) 89);
                                        var393 = false;
                                    } else if (var388 == 0 && var394.field6150 != 0) {
                                        var393 = false;
                                        var394.method1805((byte) 89);
                                    }
                                }
                            }
                            if (var393) {
                                class466.field6510.method2753(4, new class440(var386, var388));
                            }
                            class505.field7488[var392] = var388;
                        }
                        class474.field6600[var392] = var387;
                        class363.field5200[var392] = var390;
                        class62.field775[var392] = var389;
                        class215.field3103[var392] = var391;
                        var386 = null;
                        break;
                    }
                }
                if (var386 != null && class520.field7656 < 200) {
                    class540.field7902[class520.field7656] = var386;
                    class474.field6600[class520.field7656] = var387;
                    class505.field7488[class520.field7656] = var388;
                    class363.field5200[class520.field7656] = var390;
                    class62.field775[class520.field7656] = var389;
                    class215.field3103[class520.field7656] = var391;
                    class520.field7656++;
                }
            }
            class360.field5154 = class371.field5285;
            class246.field3589 = 2;
            boolean var375 = false;
            int var376 = class520.field7656;
            while (var376 > 0) {
                var376--;
                boolean var377 = true;
                for (int var378 = 0; var378 < var376; var378++) {
                    if (class505.field7488[var378] != class426.field5989.field5885 && class505.field7488[var378 + 1] == class426.field5989.field5885 || class505.field7488[var378] == 0 && class505.field7488[var378 + 1] != 0) {
                        int var379 = class505.field7488[var378];
                        class505.field7488[var378] = class505.field7488[var378 + 1];
                        class505.field7488[var378 + 1] = var379;
                        String var380 = class363.field5200[var378];
                        class363.field5200[var378] = class363.field5200[var378 + 1];
                        class363.field5200[var378 + 1] = var380;
                        String var381 = class540.field7902[var378];
                        class540.field7902[var378] = class540.field7902[var378 + 1];
                        class540.field7902[var378 + 1] = var381;
                        String var382 = class474.field6600[var378];
                        class474.field6600[var378] = class474.field6600[var378 + 1];
                        class474.field6600[var378 + 1] = var382;
                        int var383 = class62.field775[var378];
                        class62.field775[var378] = class62.field775[var378 + 1];
                        class62.field775[var378 + 1] = var383;
                        boolean var384 = class215.field3103[var378];
                        class215.field3103[var378] = class215.field3103[var378 + 1];
                        class215.field3103[var378 + 1] = var384;
                        var377 = false;
                    }
                }
                if (var377) {
                    break;
                }
            }
            class211.field3061 = null;
            return true;
        } else if (class427.field6017 == class211.field3061) {
            class285.field4172 = class264.field3874.method2341(false) << 3;
            class430.field6069 = class264.field3874.method2357((byte) 110);
            class340.field4927 = class264.field3874.method2365(false) << 3;
            class211.field3061 = null;
            return true;
        } else if (class211.field3061 == class121.field1667) {
            if (class258.field3835 != null) {
                class207.method1322(-1, false, -105, -1, class4.field81.field1415);
            }
            byte[] var395 = new byte[class190.field2715];
            class264.field3874.method1521(var395, 438851265, 0, class190.field2715);
            String var396 = class538.method3165((byte) 123, class190.field2715, 0, var395);
            class443.method2602(class268.field3914, var396, true, 0, class405.field5737 == 1);
            class211.field3061 = null;
            return true;
        } else if (class79.field1030 == class211.field3061) {
            int var397 = class264.field3874.method2380(199752600);
            int var398 = class264.field3874.method2345((byte) 37);
            int var399 = class264.field3874.method2324(arg0 - 1033632759);
            int var400 = class264.field3874.method2324(-1033632760);
            if (class147.method921(var397, (byte) 50)) {
                class525.method3107((var400 << 16) + var399, var398, (byte) 88);
            }
            class211.field3061 = null;
            return true;
        } else if (class513.field7580 == class211.field3061) {
            int var401 = class264.field3874.method2338(0);
            int var402 = class264.field3874.method2334(-128);
            int var403 = class264.field3874.method2333(-1640531527);
            if (class147.method921(var402, (byte) 115)) {
                class256.method1650(var401, (byte) -115, var403);
            }
            class211.field3061 = null;
            return true;
        } else if (class258.field3832 == class211.field3061) {
            class6.field99 = class264.field3874.method2371(arg0 ^ 0xFFFFE405);
            class430.field6068 = class371.field5285;
            class211.field3061 = null;
            return true;
        } else if (class461.field6444 == class211.field3061) {
            class29.method180(class334.field4847, arg0 - 119);
            class211.field3061 = null;
            return true;
        } else if (class330.field4815 == class211.field3061) {
            class29.method180(class486.field6778, -118);
            class211.field3061 = null;
            return true;
        } else if (class400.field5633 == class211.field3061) {
            class285.field4172 = class264.field3874.method2341(false) << 3;
            class340.field4927 = class264.field3874.method2341(false) << 3;
            class430.field6069 = class264.field3874.method2326(1789029408);
            for (class176 var404 = (class176) class62.field773.method2414((byte) -127); var404 != null; var404 = (class176) class62.field773.method2410((byte) 78)) {
                int var406 = (int) (var404.field7060 >> 28 & 0x3L);
                int var407 = (int) (var404.field7060 & 0x3FFFL);
                int var408 = var407 - class441.field6171;
                int var409 = (int) (var404.field7060 >> 14 & 0x3FFFL);
                int var410 = var409 - class367.field5241;
                if (class430.field6069 == var406 && class340.field4927 <= var408 && var408 < (class340.field4927 + 8) && class285.field4172 <= var410 && var410 < (class285.field4172 + 8)) {
                    var404.method2891(14);
                    if (var408 >= 0 && var410 >= 0 && class43.field494 > var408 && class500.field7068 > var410) {
                        class195.method1232(var408, class430.field6069, var410, arg0 + 4916);
                    }
                }
            }
            for (class408 var405 = (class408) class191.field2730.method2655(arg0 ^ 0xFFFFC4CF); var405 != null; var405 = (class408) class191.field2730.method2660((byte) 67)) {
                if (class340.field4927 <= var405.field5770 && var405.field5770 < class340.field4927 + 8 && var405.field5773 >= class285.field4172 && class285.field4172 + 8 > var405.field5773 && class430.field6069 == var405.field5777) {
                    var405.field5776 = 0;
                }
            }
            class211.field3061 = null;
            return true;
        } else {
            class406.method2409(3896, null, "T1 - " + (class211.field3061 == null ? -1 : class211.field3061.method1559(arg0 ^ 0x71)) + "," + (class455.field6390 == null ? -1 : class455.field6390.method1559(arg0 ^ 0x74)) + "," + (class15.field195 == null ? -1 : class15.field195.method1559(-125)) + " - " + class190.field2715);
            class287.method1771(false, -2049);
            return true;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
    private final void method666(int arg0, int arg1, int arg2) {
        field1173++;
        if (arg2 > -25) {
            return;
        }
        label90: while (true) {
            if (this.field1176 == null) {
                if (this.field1147) {
                    return;
                }
                this.method663(-1, 97);
                if (this.field1176 == null) {
                    return;
                }
            }
            int var4 = class390.field5481 - this.field1143;
            if (var4 > 100 && this.field1176.field6264 > 0) {
                int var5 = this.field1176.field6276.length - this.field1176.field6264;
                while (this.field1151 < var5 && this.field1176.field6258[this.field1151] < var4) {
                    var4 -= this.field1176.field6258[this.field1151];
                    this.field1151++;
                }
                if (this.field1151 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field1176.field6276.length; var7++) {
                        var6 += this.field1176.field6258[var7];
                    }
                    var4 %= var6;
                }
                this.field1168 = this.field1151 + 1;
                if (this.field1176.field6276.length <= this.field1168) {
                    this.field1168 -= this.field1176.field6264;
                    if (this.field1168 < 0 || this.field1168 >= this.field1176.field6276.length) {
                        this.field1168 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field1176.field6258[this.field1151]) {
                            this.field1175 = var4;
                            this.field1143 = class390.field5481 - var4;
                            return;
                        }
                        class190.method1213(this.field1151, arg0, (byte) 80, this.field1176, this.field1158, false, arg1);
                        var4 -= this.field1176.field6258[this.field1151];
                        this.field1151++;
                        if (this.field1151 >= this.field1176.field6276.length) {
                            this.field1151 -= this.field1176.field6264;
                            if (this.field1151 < 0 || this.field1151 >= this.field1176.field6276.length) {
                                this.field1176 = null;
                                continue label90;
                            }
                        }
                        this.field1168 = this.field1151 + 1;
                    } while (this.field1176.field6276.length > this.field1168);
                    this.field1168 -= this.field1176.field6264;
                } while (this.field1168 >= 0 && this.field1176.field6276.length > this.field1168);
                this.field1168 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lza;Lfu;IIIIIIZI)V")
    public class92(class290 arg0, class270 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field1177 = arg2;
        this.field1138 = (byte) arg5;
        this.field1158 = (byte) arg4;
        this.field1169 = arg8;
        this.field1154 = arg3;
        this.field1161 = arg7;
        this.field1167 = arg6;
        this.field1174 = arg1.field3952;
        this.field1156 = arg0.method339() && arg1.field3975 && !this.field1169;
        if (arg9 != -1) {
            this.field1147 = true;
        }
        this.method663(arg9, 100);
    }
}
