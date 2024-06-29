import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public abstract class class200 {

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "I")
    public static int field3325 = 4;

    @OriginalMember(owner = "client!vt", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3327 = null;

    @OriginalMember(owner = "client!vt", name = "f", descriptor = "Z")
    public static boolean field3329 = false;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!vt", name = "e", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!vt", name = "c", descriptor = "[[Luq;")
    public static class114[][] field3326;

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
    public static final void method1398(int arg0) {
        int var1 = 0;
        if (arg0 < 102) {
            field3326 = null;
        }
        while (var1 < class384.field5774) {
            label132: {
                class85 var2 = class522.field7636[var1];
                boolean var3 = false;
                if (var2.field1225 == null) {
                    var2.field1217--;
                    if ((var2.field1227 == 2 ? -1500 : -10) > var2.field1217) {
                        var3 = true;
                    } else {
                        if (var2.field1227 == 1 && var2.field1221 == null) {
                            var2.field1221 = class535.method3172(class338.field5040, var2.field1220, 0);
                            if (var2.field1221 == null) {
                                break label132;
                            }
                            var2.field1217 += var2.field1221.method3169();
                        } else if (var2.field1227 == 2 && (var2.field1226 == null || var2.field1223 == null)) {
                            if (var2.field1226 == null) {
                                var2.field1226 = class170.method1144(class409.field6102, var2.field1220);
                            }
                            if (var2.field1226 == null) {
                                break label132;
                            }
                            if (var2.field1223 == null) {
                                var2.field1223 = var2.field1226.method1136(new int[] { 22050 });
                                if (var2.field1223 == null) {
                                    break label132;
                                }
                            }
                        }
                        if (var2.field1217 < 0) {
                            int var4;
                            if (var2.field1214 == 0) {
                                var4 = class193.field3258.field7251 * var2.field1222 >> 8;
                            } else {
                                int var5 = var2.field1214 >> 24 & 0x3;
                                if (class398.field5947.field5826 == var5) {
                                    int var6 = var2.field1214 & 0xFF << 7;
                                    int var7 = (var2.field1214 & 0xFF814B) >> 16;
                                    int var8 = (var7 << 7) + 64 - class398.field5947.field5837;
                                    if (var8 < 0) {
                                        var8 = -var8;
                                    }
                                    int var9 = var2.field1214 >> 8 & 0xFF;
                                    int var10 = (var9 << 7) + 64 - class398.field5947.field5833;
                                    if (var10 < 0) {
                                        var10 = -var10;
                                    }
                                    int var11 = var10 + var8 - 128;
                                    if (var6 < var11) {
                                        var2.field1217 = -99999;
                                        break label132;
                                    }
                                    if (var11 < 0) {
                                        var11 = 0;
                                    }
                                    var4 = class193.field3258.field7218 * var2.field1222 * (var6 - var11) / var6 >> 8;
                                } else {
                                    var4 = 0;
                                }
                            }
                            if (var4 > 0) {
                                class79 var12 = null;
                                if (var2.field1227 == 1) {
                                    var12 = var2.field1221.method3170().method676(class180.field2705);
                                } else if (var2.field1227 == 2) {
                                    var12 = var2.field1223;
                                }
                                class392 var13 = var2.field1225 = class392.method2442(var12, 100, var4);
                                var13.method2454(var2.field1215 - 1);
                                class359.field5328.method392(var13);
                            }
                        }
                    }
                } else if (!var2.field1225.method2674(26931)) {
                    var3 = true;
                }
                if (var3) {
                    class384.field5774--;
                    for (int var14 = var1; var14 < class384.field5774; var14++) {
                        class522.field7636[var14] = class522.field7636[var14 + 1];
                    }
                    var1--;
                }
            }
            var1++;
        }
        field3324++;
        if (class459.field6673 && !class173.method1169(true)) {
            if (class193.field3258.field7249 != 0 && class491.field7055 != -1) {
                class519.method3084(class313.field4720, -20096, false, 0, class193.field3258.field7249, class491.field7055);
            }
            class459.field6673 = false;
        } else if (class193.field3258.field7249 != 0 && class491.field7055 != -1 && !class173.method1169(true)) {
            class74.method640(-29627, class141.field2160);
            class350.field5174++;
            class71.field1020.method1566(true, class491.field7055);
            class491.field7055 = -1;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(III)[B")
    public abstract byte[] method1399(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vt", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1400(int arg0);

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII[Ljava/lang/String;[S)V")
    public static final void method1401(byte arg0, int arg1, int arg2, String[] arg3, short[] arg4) {
        if (arg1 < arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg1;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg1; var9 < arg2; var9++) {
                if (var7 == null || arg3[var9] != null && arg3[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg3[arg2] = arg3[var6];
            arg3[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method1401((byte) -63, arg1, var6 - 1, arg3, arg4);
            method1401((byte) -116, var6 + 1, arg2, arg3, arg4);
        }
        field3328++;
        if (arg0 >= -49) {
            field3326 = null;
        }
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(Z)V")
    public static void method1402(boolean arg0) {
        if (!arg0) {
            field3325 = 117;
        }
        field3326 = null;
        field3327 = null;
    }

    @OriginalMember(owner = "client!vt", name = "a", descriptor = "(I[B)V")
    public abstract void method1403(int arg0, byte[] arg1);
}
