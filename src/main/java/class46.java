import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class46 extends class17 {

    @OriginalMember(owner = "client!gd", name = "qb", descriptor = "[[B")
    private byte[][] field1213 = new byte[256][];

    @OriginalMember(owner = "client!gd", name = "eb", descriptor = "I")
    public int field1201 = 0;

    @OriginalMember(owner = "client!gd", name = "Ib", descriptor = "[I")
    private int[] field1231;

    @OriginalMember(owner = "client!gd", name = "cb", descriptor = "[I")
    private int[] field1199;

    @OriginalMember(owner = "client!gd", name = "ib", descriptor = "[I")
    private int[] field1205;

    @OriginalMember(owner = "client!gd", name = "zb", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!gd", name = "Cb", descriptor = "I")
    private int field1225;

    @OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lkd;")
    private static class73 field1196 = class126.method1070((byte) -66, "i");

    @OriginalMember(owner = "client!gd", name = "hb", descriptor = "Lkd;")
    private static class73 field1204 = class126.method1070((byte) -66, "col=");

    @OriginalMember(owner = "client!gd", name = "db", descriptor = "Lkd;")
    private static class73 field1200 = class126.method1070((byte) -66, "b");

    @OriginalMember(owner = "client!gd", name = "fb", descriptor = "I")
    private static int field1202 = -1;

    @OriginalMember(owner = "client!gd", name = "ab", descriptor = "Lkd;")
    private static class73 field1197 = class126.method1070((byte) -66, "str");

    @OriginalMember(owner = "client!gd", name = "jb", descriptor = "Lkd;")
    private static class73 field1206 = class126.method1070((byte) -66, ")4str");

    @OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lkd;")
    private static class73 field1218 = class126.method1070((byte) -66, "img=");

    @OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lkd;")
    private static class73 field1195 = class126.method1070((byte) -66, "str=");

    @OriginalMember(owner = "client!gd", name = "rb", descriptor = "Lkd;")
    private static class73 field1214 = class126.method1070((byte) -66, "u=");

    @OriginalMember(owner = "client!gd", name = "mb", descriptor = "Lkd;")
    private static class73 field1209 = class126.method1070((byte) -66, "shad=");

    @OriginalMember(owner = "client!gd", name = "ob", descriptor = "Lkd;")
    private static class73 field1211 = class126.method1070((byte) -66, ")4col");

    @OriginalMember(owner = "client!gd", name = "sb", descriptor = "I")
    private static int field1215 = -1;

    @OriginalMember(owner = "client!gd", name = "kb", descriptor = "I")
    private static int field1207 = 256;

    @OriginalMember(owner = "client!gd", name = "bb", descriptor = "Lkd;")
    private static class73 field1198 = class126.method1070((byte) -66, ")4shad");

    @OriginalMember(owner = "client!gd", name = "wb", descriptor = "I")
    private static int field1219 = 0;

    @OriginalMember(owner = "client!gd", name = "yb", descriptor = "I")
    private static int field1221 = 0;

    @OriginalMember(owner = "client!gd", name = "tb", descriptor = "Lkd;")
    private static class73 field1216 = class126.method1070((byte) -66, "gt");

    @OriginalMember(owner = "client!gd", name = "gb", descriptor = "Lkd;")
    private static class73 field1203 = class126.method1070((byte) -66, ")4b");

    @OriginalMember(owner = "client!gd", name = "pb", descriptor = "I")
    private static int field1212 = -1;

    @OriginalMember(owner = "client!gd", name = "ub", descriptor = "I")
    private static int field1217 = 0;

    @OriginalMember(owner = "client!gd", name = "lb", descriptor = "Lkd;")
    private static class73 field1208 = class126.method1070((byte) -66, "shad");

    @OriginalMember(owner = "client!gd", name = "Db", descriptor = "Lkd;")
    private static class73 field1226 = class126.method1070((byte) -66, ")4u");

    @OriginalMember(owner = "client!gd", name = "Eb", descriptor = "Lkd;")
    private static class73 field1227 = class126.method1070((byte) -66, "lt");

    @OriginalMember(owner = "client!gd", name = "Gb", descriptor = "I")
    private static int field1229 = 0;

    @OriginalMember(owner = "client!gd", name = "Ab", descriptor = "I")
    private static int field1223 = -1;

    @OriginalMember(owner = "client!gd", name = "xb", descriptor = "Lkd;")
    private static class73 field1220 = class126.method1070((byte) -66, "u");

    @OriginalMember(owner = "client!gd", name = "Bb", descriptor = "Lkd;")
    private static class73 field1224 = class126.method1070((byte) -66, ")4i");

    @OriginalMember(owner = "client!gd", name = "Fb", descriptor = "Lkd;")
    private static class73 field1228 = class126.method1070((byte) -66, "br");

    @OriginalMember(owner = "client!gd", name = "nb", descriptor = "Ljava/util/Random;")
    private static Random field1210 = new Random();

    @OriginalMember(owner = "client!gd", name = "Jb", descriptor = "[Lkd;")
    private static class73[] field1232 = new class73[100];

    @OriginalMember(owner = "client!gd", name = "Hb", descriptor = "[Lde;")
    private static class27[] field1230;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;IIIII)V")
    public final void method340(class73 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method358(arg3, arg4);
        int[] var7 = new int[arg0.field1880];
        for (int var8 = 0; var8 < arg0.field1880; var8++) {
            var7[var8] = (int) (Math.sin((double) arg5 / 5.0D + (double) var8 / 2.0D) * 5.0D);
        }
        this.method356(arg0, arg1 - this.method357(arg0) / 2, arg2, null, var7);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIII)V")
    private static final void method341(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = class17.field503 * arg2 + arg1;
        int var7 = class17.field503 - arg3;
        int var8 = 0;
        int var9 = 0;
        if (arg2 < class17.field504) {
            int var10 = class17.field504 - arg2;
            arg4 -= var10;
            arg2 = class17.field504;
            var9 += arg3 * var10;
            var6 += class17.field503 * var10;
        }
        if (arg2 + arg4 > class17.field501) {
            arg4 -= arg2 + arg4 - class17.field501;
        }
        if (arg1 < class17.field502) {
            int var11 = class17.field502 - arg1;
            arg3 -= var11;
            arg1 = class17.field502;
            var9 += var11;
            var6 += var11;
            var8 += var11;
            var7 += var11;
        }
        if (arg1 + arg3 > class17.field507) {
            int var12 = arg1 + arg3 - class17.field507;
            arg3 -= var12;
            var8 += var12;
            var7 += var12;
        }
        if (arg3 > 0 && arg4 > 0) {
            method359(class17.field506, arg0, arg5, var9, var6, arg3, arg4, var7, var8);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;[I[Lkd;)I")
    private final int method342(class73 arg0, int[] arg1, class73[] arg2) {
        if (arg0 == null) {
            return 0;
        }
        int var4 = 0;
        int var5 = 0;
        class73 var6 = class86.method720(47, 100);
        int var7 = -1;
        int var8 = 0;
        byte var9 = 0;
        int var10 = -1;
        int var11 = 0;
        int var12 = arg0.method632((byte) -121);
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = arg0.method624(var13, false);
            if (var14 == 60) {
                var10 = var13;
            } else {
                if (var14 == 62 && var10 != -1) {
                    class73 var15 = arg0.method630(var13, var10 + 1, -24023);
                    var10 = -1;
                    var6.method641(60, (byte) 58);
                    var6.method626((byte) -106, var15);
                    var6.method641(62, (byte) 5);
                    if (var15.method616(-98, field1228)) {
                        arg2[var11++] = var6.method630(var6.method632((byte) -79), var5, -24023);
                        var5 = var6.method632((byte) -92);
                        var4 = 0;
                        var7 = -1;
                    } else if (var15.method616(-111, field1227)) {
                        var4 += this.method363(60);
                    } else if (var15.method616(-99, field1216)) {
                        var4 += this.method363(62);
                    } else if (var15.method642(84, field1218)) {
                        try {
                            int var16 = var15.method638(4, 127).method618((byte) 126);
                            var4 += field1230[var16].field772;
                        } catch (Exception var17) {
                        }
                    }
                    var14 = -1;
                }
                if (var10 == -1) {
                    if (var14 != -1) {
                        var6.method641(var14, (byte) -122);
                        var4 += this.method363(var14);
                    }
                    if (var14 == 32) {
                        var7 = var6.method632((byte) -71);
                        var8 = var4;
                        var9 = 1;
                    }
                    if (arg1 != null && var4 > arg1[var11 < arg1.length ? var11 : arg1.length - 1] && var7 >= 0) {
                        arg2[var11++] = var6.method630(var7 - var9, var5, -24023);
                        var5 = var7;
                        var7 = -1;
                        var4 -= var8;
                    }
                    if (var14 == 45) {
                        var7 = var6.method632((byte) -70);
                        var8 = var4;
                        var9 = 0;
                    }
                }
            }
        }
        if (var6.method632((byte) -60) > var5) {
            arg2[var11++] = var6.method630(var6.method632((byte) -55), var5, -24023);
        }
        return var11;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;IIII)V")
    public final void method343(class73 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method358(arg3, arg4);
            this.method352(arg0, arg1 - this.method357(arg0) / 2, arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lkd;IIIII)V")
    public final void method344(class73 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method358(arg3, arg4);
        int[] var7 = new int[arg0.field1880];
        int[] var8 = new int[arg0.field1880];
        for (int var9 = 0; var9 < arg0.field1880; var9++) {
            var7[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 5.0D) * 5.0D);
            var8[var9] = (int) (Math.sin((double) arg5 / 5.0D + (double) var9 / 3.0D) * 5.0D);
        }
        this.method356(arg0, arg1 - this.method357(arg0) / 2, arg2, var7, var8);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;I)I")
    public final int method345(class73 arg0, int arg1) {
        return this.method342(arg0, new int[] { arg1 }, field1232);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;)Lkd;")
    public static final class73 method346(class73 arg0) {
        int var1 = arg0.method632((byte) -113);
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            byte var8 = arg0.field1858[var3];
            if (var8 == 60 || var8 == 62) {
                var2 += 3;
            }
        }
        class73 var4 = new class73();
        var4.field1880 = var1 + var2;
        var4.field1858 = new byte[var4.field1880];
        int var5 = 0;
        for (int var6 = 0; var6 < var1; var6++) {
            byte var7 = arg0.field1858[var6];
            if (var7 == 60) {
                var4.field1858[var5++] = 60;
                var4.field1858[var5++] = 108;
                var4.field1858[var5++] = 116;
                var4.field1858[var5++] = 62;
            } else if (var7 == 62) {
                var4.field1858[var5++] = 60;
                var4.field1858[var5++] = 103;
                var4.field1858[var5++] = 116;
                var4.field1858[var5++] = 62;
            } else {
                var4.field1858[var5++] = var7;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lkd;)V")
    private final void method347(class73 arg0) {
        try {
            if (arg0.method642(105, field1204)) {
                field1219 = arg0.method638(4, -47).method629(false, 16);
                return;
            }
            if (arg0.method616(-91, field1211)) {
                field1219 = field1221;
                return;
            }
            if (arg0.method642(73, field1195)) {
                field1223 = arg0.method638(4, -127).method629(false, 16);
                return;
            }
            if (arg0.method616(-66, field1197)) {
                field1223 = 8388608;
                return;
            }
            if (arg0.method616(-73, field1206)) {
                field1223 = -1;
                return;
            }
            if (!arg0.method616(-121, field1200) && !arg0.method616(-69, field1203) && !arg0.method616(-109, field1196) && !arg0.method616(-100, field1224)) {
                if (arg0.method642(71, field1214)) {
                    field1215 = arg0.method638(2, -41).method629(false, 16);
                    return;
                }
                if (arg0.method616(-65, field1220)) {
                    field1215 = 0;
                    return;
                }
                if (arg0.method616(-76, field1226)) {
                    field1215 = -1;
                    return;
                }
                if (arg0.method642(120, field1209)) {
                    field1212 = arg0.method638(5, -69).method629(false, 16);
                    return;
                }
                if (arg0.method616(-63, field1208)) {
                    field1212 = 0;
                    return;
                }
                if (arg0.method616(-58, field1198)) {
                    field1212 = field1202;
                    return;
                }
                if (arg0.method616(-127, field1228)) {
                    this.method358(field1221, field1202);
                    return;
                }
            }
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()V")
    public static void method348() {
        field1227 = null;
        field1216 = null;
        field1218 = null;
        field1228 = null;
        field1204 = null;
        field1211 = null;
        field1200 = null;
        field1203 = null;
        field1196 = null;
        field1224 = null;
        field1214 = null;
        field1220 = null;
        field1226 = null;
        field1209 = null;
        field1208 = null;
        field1198 = null;
        field1195 = null;
        field1197 = null;
        field1206 = null;
        field1230 = null;
        field1210 = null;
        field1232 = null;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lkd;IIIII)V")
    public final void method349(class73 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 == null) {
            return;
        }
        this.method358(arg3, arg4);
        field1210.setSeed((long) arg5);
        field1207 = (field1210.nextInt() & 0x1F) + 192;
        int[] var7 = new int[arg0.field1880];
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1880; var9++) {
            var7[var9] = var8;
            if ((field1210.nextInt() & 0x3) == 0) {
                var8++;
            }
        }
        this.method356(arg0, arg1, arg2, var7, null);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;IIIIII)V")
    public final void method350(class73 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 == null) {
            return;
        }
        this.method358(arg3, arg4);
        double var8 = 7.0D - (double) arg6 / 8.0D;
        if (var8 < 0.0D) {
            var8 = 0.0D;
        }
        int[] var10 = new int[arg0.field1880];
        for (int var11 = 0; var11 < arg0.field1880; var11++) {
            var10[var11] = (int) (Math.sin((double) var11 / 1.5D + (double) arg5) * var8);
        }
        this.method356(arg0, arg1 - this.method357(arg0) / 2, arg2, null, var10);
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lkd;I)I")
    public final int method351(class73 arg0, int arg1) {
        int var3 = this.method342(arg0, new int[] { arg1 }, field1232);
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            int var6 = this.method357(field1232[var5]);
            if (var6 > var4) {
                var4 = var6;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;II)V")
    private final void method352(class73 arg0, int arg1, int arg2) {
        int var4 = arg2 - this.field1201;
        int var5 = -1;
        for (int var6 = 0; var6 < arg0.field1880; var6++) {
            int var7 = arg0.field1858[var6] & 0xFF;
            if (var7 == 60) {
                var5 = var6;
            } else {
                if (var7 == 62 && var5 != -1) {
                    class73 var8 = arg0.method630(var6, var5 + 1, -24023);
                    var5 = -1;
                    if (var8.method616(-111, field1227)) {
                        var7 = 60;
                    } else {
                        if (!var8.method616(-79, field1216)) {
                            if (var8.method642(96, field1218)) {
                                try {
                                    int var9 = var8.method638(4, -44).method618((byte) 125);
                                    class27 var10 = field1230[var9];
                                    var10.method208(arg1, this.field1201 + var4 - var10.field774);
                                    arg1 += var10.field772;
                                } catch (Exception var13) {
                                }
                            } else {
                                this.method347(var8);
                            }
                            continue;
                        }
                        var7 = 62;
                    }
                }
                if (var5 == -1) {
                    int var11 = this.field1199[var7];
                    int var12 = this.field1205[var7];
                    if (var7 == 32) {
                        if (field1229 > 0) {
                            field1217 += field1229;
                            arg1 += field1217 >> 8;
                            field1217 &= 0xFF;
                        }
                    } else if (field1207 == 256) {
                        if (field1212 != -1) {
                            method341(this.field1213[var7], arg1 + 1, this.field1231[var7] + var4 + 1, var11, var12, field1212);
                        }
                        method341(this.field1213[var7], arg1, this.field1231[var7] + var4, var11, var12, field1219);
                    } else {
                        if (field1212 != -1) {
                            method360(this.field1213[var7], arg1 + 1, this.field1231[var7] + var4 + 1, var11, var12, field1212, field1207);
                        }
                        method360(this.field1213[var7], arg1, this.field1231[var7] + var4, var11, var12, field1219, field1207);
                    }
                    if (field1223 != -1) {
                        class17.method136(arg1, (int) ((double) this.field1201 * 0.7D) + var4, var11, field1223);
                    }
                    if (field1215 != -1) {
                        class17.method136(arg1, this.field1201 + var4 + 1, var11, field1215);
                    }
                    arg1 += var11;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lkd;I)V")
    private final void method353(class73 arg0, int arg1) {
        int var3 = 0;
        boolean var4 = false;
        for (int var5 = 0; var5 < arg0.method632((byte) -127); var5++) {
            int var6 = arg0.method624(var5, false);
            if (var6 == 60) {
                var4 = true;
            } else if (var6 == 62) {
                var4 = false;
            } else if (!var4 && var6 == 32) {
                var3++;
            }
        }
        if (var3 > 0) {
            field1229 = (arg1 - this.method357(arg0) << 8) / var3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIIII)V")
    private static final void method354(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = ((arg2 & 0xFF00FF) * arg9 & 0xFF00FF00) + ((arg2 & 0xFF00) * arg9 & 0xFF0000) >> 8;
        int var11 = 256 - arg9;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = arg0[arg4];
                    arg0[arg4++] = (((var14 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var14 & 0xFF00) * var11 & 0xFF0000) >> 8) + var10;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Lkd;IIII)V")
    public final void method355(class73 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method358(arg3, arg4);
            this.method352(arg0, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;II[I[I)V")
    private final void method356(class73 arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        int var6 = arg2 - this.field1201;
        int var7 = -1;
        int var8 = 0;
        for (int var9 = 0; var9 < arg0.field1880; var9++) {
            int var10 = arg0.field1858[var9] & 0xFF;
            if (var10 == 60) {
                var7 = var9;
            } else {
                if (var10 == 62 && var7 != -1) {
                    class73 var11 = arg0.method630(var9, var7 + 1, -24023);
                    var7 = -1;
                    if (var11.method616(-96, field1227)) {
                        var10 = 60;
                    } else {
                        if (!var11.method616(-44, field1216)) {
                            if (var11.method642(-98, field1218)) {
                                try {
                                    int var12;
                                    if (arg3 == null) {
                                        var12 = 0;
                                    } else {
                                        var12 = arg3[var8];
                                    }
                                    int var13;
                                    if (arg4 == null) {
                                        var13 = 0;
                                    } else {
                                        var13 = arg4[var8];
                                    }
                                    var8++;
                                    int var14 = var11.method638(4, -67).method618((byte) 126);
                                    class27 var15 = field1230[var14];
                                    var15.method208(arg1 + var12, this.field1201 + var6 - var15.field774 + var13);
                                    arg1 += var15.field772;
                                } catch (Exception var20) {
                                }
                            } else {
                                this.method347(var11);
                            }
                            continue;
                        }
                        var10 = 62;
                    }
                }
                if (var7 == -1) {
                    int var16 = this.field1199[var10];
                    int var17 = this.field1205[var10];
                    int var18;
                    if (arg3 == null) {
                        var18 = 0;
                    } else {
                        var18 = arg3[var8];
                    }
                    int var19;
                    if (arg4 == null) {
                        var19 = 0;
                    } else {
                        var19 = arg4[var8];
                    }
                    var8++;
                    if (var10 == 32) {
                        if (field1229 > 0) {
                            field1217 += field1229;
                            arg1 += field1217 >> 8;
                            field1217 &= 0xFF;
                        }
                    } else if (field1207 == 256) {
                        if (field1212 != -1) {
                            method341(this.field1213[var10], arg1 + var18 + 1, this.field1231[var10] + var6 + 1 + var19, var16, var17, field1212);
                        }
                        method341(this.field1213[var10], arg1 + var18, this.field1231[var10] + var6 + var19, var16, var17, field1219);
                    } else {
                        if (field1212 != -1) {
                            method360(this.field1213[var10], arg1 + var18 + 1, this.field1231[var10] + var6 + 1 + var19, var16, var17, field1212, field1207);
                        }
                        method360(this.field1213[var10], arg1 + var18, this.field1231[var10] + var6 + var19, var16, var17, field1219, field1207);
                    }
                    if (field1223 != -1) {
                        class17.method136(arg1, (int) ((double) this.field1201 * 0.7D) + var6, var16, field1223);
                    }
                    if (field1215 != -1) {
                        class17.method136(arg1, this.field1201 + var6, var16, field1215);
                    }
                    arg1 += var16;
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lkd;)I")
    public final int method357(class73 arg0) {
        if (arg0 == null) {
            return 0;
        }
        int var2 = -1;
        int var3 = 0;
        for (int var4 = 0; var4 < arg0.field1880; var4++) {
            int var5 = arg0.field1858[var4] & 0xFF;
            if (var5 == 60) {
                var2 = var4;
            } else if (var5 == 62 && var2 != -1) {
                class73 var6 = arg0.method630(var4, var2 + 1, -24023);
                var2 = -1;
                if (var6.method616(-49, field1227)) {
                    var3 += this.field1199[60];
                } else if (var6.method616(-66, field1216)) {
                    var3 += this.field1199[62];
                } else if (var6.method642(-87, field1218)) {
                    try {
                        int var7 = var6.method638(4, 125).method618((byte) 127);
                        var3 += field1230[var7].field772;
                    } catch (Exception var8) {
                    }
                }
            } else if (var2 == -1) {
                var3 += this.field1199[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
    private final void method358(int arg0, int arg1) {
        field1223 = -1;
        field1215 = -1;
        field1202 = arg1;
        field1212 = arg1;
        field1221 = arg0;
        field1219 = arg0;
        field1207 = 256;
        field1229 = 0;
        field1217 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([I[BIIIIIII)V")
    private static final void method359(int[] arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg3++] == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([BIIIIII)V")
    private static final void method360(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class17.field503 * arg2 + arg1;
        int var8 = class17.field503 - arg3;
        int var9 = 0;
        int var10 = 0;
        if (arg2 < class17.field504) {
            int var11 = class17.field504 - arg2;
            arg4 -= var11;
            arg2 = class17.field504;
            var10 += arg3 * var11;
            var7 += class17.field503 * var11;
        }
        if (arg2 + arg4 > class17.field501) {
            arg4 -= arg2 + arg4 - class17.field501;
        }
        if (arg1 < class17.field502) {
            int var12 = class17.field502 - arg1;
            arg3 -= var12;
            arg1 = class17.field502;
            var10 += var12;
            var7 += var12;
            var9 += var12;
            var8 += var12;
        }
        if (arg1 + arg3 > class17.field507) {
            int var13 = arg1 + arg3 - class17.field507;
            arg3 -= var13;
            var9 += var13;
            var8 += var13;
        }
        if (arg3 > 0 && arg4 > 0) {
            method354(class17.field506, arg0, arg5, var10, var7, arg3, arg4, var8, var9, arg6);
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(Lkd;IIII)V")
    public final void method361(class73 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != null) {
            this.method358(arg3, arg4);
            this.method352(arg0, arg1 - this.method357(arg0), arg2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lkd;IIIIIIIII)V")
    public final void method362(class73 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == null) {
            return;
        }
        this.method358(arg5, arg6);
        if (arg9 == 0) {
            arg9 = this.field1201;
        }
        int[] var11 = new int[] { arg3 };
        if (arg4 < this.field1225 + this.field1222 + arg9 && arg4 < arg9 + arg9) {
            var11 = null;
        }
        int var12 = this.method342(arg0, var11, field1232);
        if (arg8 == 3 && var12 == 1) {
            arg8 = 1;
        }
        int var13;
        if (arg8 == 0) {
            var13 = this.field1222 + arg2;
        } else if (arg8 == 1) {
            var13 = (arg4 - this.field1222 - this.field1225 - (var12 - 1) * arg9) / 2 + this.field1222 + arg2;
        } else if (arg8 == 2) {
            var13 = arg2 + arg4 - this.field1225 - (var12 - 1) * arg9;
        } else {
            int var14 = (arg4 - this.field1222 - this.field1225 - (var12 - 1) * arg9) / (var12 + 1);
            if (var14 < 0) {
                var14 = 0;
            }
            var13 = this.field1222 + arg2 + var14;
            arg9 += var14;
        }
        for (int var15 = 0; var15 < var12; var15++) {
            if (arg7 == 0) {
                this.method352(field1232[var15], arg1, var13);
            } else if (arg7 == 1) {
                this.method352(field1232[var15], arg1 + (arg3 - this.method357(field1232[var15])) / 2, var13);
            } else if (arg7 == 2) {
                this.method352(field1232[var15], arg1 + arg3 - this.method357(field1232[var15]), var13);
            } else if (var12 - 1 == var15) {
                this.method352(field1232[var15], arg1, var13);
            } else {
                this.method353(field1232[var15], arg3);
                this.method352(field1232[var15], arg1, var13);
                field1229 = 0;
            }
            var13 += arg9;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([I[I[I[I[[B)V")
    public class46(int[] arg0, int[] arg1, int[] arg2, int[] arg3, byte[][] arg4) {
        this.field1231 = arg0;
        this.field1199 = arg1;
        this.field1205 = arg2;
        byte var6 = 0;
        for (int var7 = 1; var7 < arg3.length; var7++) {
            if (arg3[var7] == 1) {
                var6 = (byte) var7;
            }
        }
        this.field1213 = arg4;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        for (int var10 = 0; var10 < 256; var10++) {
            if (this.field1231[var10] < var8 && this.field1205[var10] != 0) {
                var8 = this.field1231[var10];
            }
            if (this.field1231[var10] + this.field1205[var10] > var9) {
                var9 = this.field1231[var10] + this.field1205[var10];
            }
            byte[] var11 = this.field1213[var10];
            int var12 = var11.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11[var13] = (byte) (var11[var13] == var6 ? 0 : 1);
            }
        }
        this.field1201 = this.field1231[32] + this.field1205[32];
        this.field1222 = this.field1201 - var8;
        this.field1225 = var9 - this.field1201;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I")
    public final int method363(int arg0) {
        return this.field1199[arg0 & 0xFF];
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "([B)V")
    public class46(byte[] arg0) {
        this.field1199 = new int[arg0.length];
        for (int var2 = 0; var2 < this.field1199.length; var2++) {
            this.field1199[var2] = arg0[var2] & 0xFF;
        }
    }
}
