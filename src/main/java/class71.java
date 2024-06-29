import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class71 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "[Lfk;")
    public static class14[] field1000 = new class14[50];

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "[I")
    public static int[] field1008 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Z")
    public static volatile boolean field1009 = true;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public int field1001;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Ldl;")
    public static class123 field999;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[I")
    public static int[] field998;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method478(byte arg0, String arg1) {
        field1002++;
        if (arg0 >= -33) {
            method478((byte) 117, (String) null);
        }
        if (class107.field1644 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class107.field1644.field1110; var2++) {
            if (class33.method266(" ", class107.field1644.field1112[var2], 0, "<br>").equals(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLlk;)V")
    public static final void method479(byte arg0, class82 arg1) {
        field1003++;
        arg1.field1207 = false;
        if (arg1.field1196 != -1) {
            class198 var2 = class104.method688(arg1.field1196, 30091);
            if (var2 == null || var2.field3107 == null) {
                arg1.field1196 = -1;
            } else {
                arg1.field1249++;
                if (arg1.field1291 < var2.field3107.length && var2.field3080[arg1.field1291] < arg1.field1249) {
                    arg1.field1244++;
                    arg1.field1249 = 1;
                    arg1.field1291++;
                    class279.method1870((byte) 65, class149.field2227 == arg1, var2, arg1.field1291, arg1.field1226, arg1.field1273);
                }
                if (arg1.field1291 >= var2.field3107.length) {
                    arg1.field1249 = 0;
                    arg1.field1291 = 0;
                    class279.method1870((byte) 65, class149.field2227 == arg1, var2, arg1.field1291, arg1.field1226, arg1.field1273);
                }
                arg1.field1244 = arg1.field1291 + 1;
                if (var2.field3107.length <= arg1.field1244) {
                    arg1.field1244 = 0;
                }
            }
        }
        if (arg1.field1280 != -1 && class111.field1684 >= arg1.field1266) {
            int var3 = class77.method521(arg1.field1280, (byte) -42).field985;
            if (var3 == -1) {
                arg1.field1280 = -1;
            } else {
                class198 var4 = class104.method688(var3, 30091);
                if (var4 == null || var4.field3107 == null) {
                    arg1.field1280 = -1;
                } else {
                    if (arg1.field1292 < 0) {
                        arg1.field1292 = 0;
                        class279.method1870((byte) 65, class149.field2227 == arg1, var4, 0, arg1.field1226, arg1.field1273);
                    }
                    arg1.field1195++;
                    if (arg1.field1292 < var4.field3107.length && arg1.field1195 > var4.field3080[arg1.field1292]) {
                        arg1.field1195 = 1;
                        arg1.field1292++;
                        class279.method1870((byte) 65, class149.field2227 == arg1, var4, arg1.field1292, arg1.field1226, arg1.field1273);
                    }
                    if (var4.field3107.length <= arg1.field1292) {
                        arg1.field1280 = -1;
                    }
                    arg1.field1191 = arg1.field1292 + 1;
                    if (arg1.field1191 >= var4.field3107.length) {
                        arg1.field1191 = -1;
                    }
                }
            }
        }
        if (arg0 != -7) {
            method483(-111, -121);
        }
        if (arg1.field1252 != -1 && arg1.field1287 <= 1) {
            class198 var5 = class104.method688(arg1.field1252, 30091);
            if (var5.field3102 == 1 && arg1.field1224 > 0 && class111.field1684 >= arg1.field1208 && class111.field1684 > arg1.field1290) {
                arg1.field1287 = 1;
                return;
            }
        }
        if (arg1.field1252 != -1 && arg1.field1287 == 0) {
            class198 var6 = class104.method688(arg1.field1252, 30091);
            if (var6 == null || var6.field3107 == null) {
                arg1.field1252 = -1;
            } else {
                arg1.field1214++;
                if (arg1.field1288 < var6.field3107.length && arg1.field1214 > var6.field3080[arg1.field1288]) {
                    arg1.field1214 = 1;
                    arg1.field1288++;
                    class279.method1870((byte) 65, class149.field2227 == arg1, var6, arg1.field1288, arg1.field1226, arg1.field1273);
                }
                if (arg1.field1288 >= var6.field3107.length) {
                    arg1.field1288 -= var6.field3079;
                    arg1.field1286++;
                    if (var6.field3097 <= arg1.field1286) {
                        arg1.field1252 = -1;
                    } else if (arg1.field1288 >= 0 && arg1.field1288 < var6.field3107.length) {
                        class279.method1870((byte) 65, class149.field2227 == arg1, var6, arg1.field1288, arg1.field1226, arg1.field1273);
                    } else {
                        arg1.field1252 = -1;
                    }
                }
                arg1.field1215 = arg1.field1288 + 1;
                if (arg1.field1215 >= var6.field3107.length) {
                    arg1.field1215 -= var6.field3079;
                    if (var6.field3097 <= (arg1.field1286 + 1)) {
                        arg1.field1215 = -1;
                    } else if (arg1.field1215 < 0 || var6.field3107.length <= arg1.field1215) {
                        arg1.field1215 = -1;
                    }
                }
                arg1.field1207 = var6.field3090;
            }
        }
        if (arg1.field1287 > 0) {
            arg1.field1287--;
        }
        for (int var7 = 0; var7 < arg1.field1236.length; var7++) {
            class205 var8 = arg1.field1236[var7];
            if (var8 != null) {
                if (var8.field3211 > 0) {
                    var8.field3211--;
                } else {
                    class198 var9 = class104.method688(var8.field3205, arg0 ^ 0xFFFF8A72);
                    if (var9 == null || var9.field3107 == null) {
                        arg1.field1236[var7] = null;
                    } else {
                        var8.field3206++;
                        if (var9.field3107.length > var8.field3209 && var9.field3080[var8.field3209] < var8.field3206) {
                            var8.field3209++;
                            var8.field3206 = 1;
                            class279.method1870((byte) 65, class149.field2227 == arg1, var9, var8.field3209, arg1.field1226, arg1.field1273);
                        }
                        if (var8.field3209 >= var9.field3107.length) {
                            var8.field3208++;
                            var8.field3209 -= var9.field3079;
                            if (var9.field3097 <= var8.field3208) {
                                arg1.field1236[var7] = null;
                            } else if (var8.field3209 >= 0 && var9.field3107.length > var8.field3209) {
                                class279.method1870((byte) 65, class149.field2227 == arg1, var9, var8.field3209, arg1.field1226, arg1.field1273);
                            } else {
                                arg1.field1236[var7] = null;
                            }
                        }
                        var8.field3210 = var8.field3209 + 1;
                        if (var8.field3210 >= var9.field3107.length) {
                            var8.field3210 -= var9.field3079;
                            if ((var8.field3208 + 1) >= var9.field3097) {
                                var8.field3210 = -1;
                            } else if (var8.field3210 < 0 || var9.field3107.length <= var8.field3210) {
                                var8.field3210 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method480(int arg0) {
        if (arg0 != 144) {
            method482((class123) null, -81, (byte) -41);
        }
        field999 = null;
        field1008 = null;
        field1000 = null;
        field998 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIZ)V")
    public static final void method481(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg3 != -9267) {
            field1000 = null;
        }
        field1005++;
        class169.field2656 = 0L;
        boolean var5 = false;
        int var6 = class277.method1859(-94);
        if (arg0 == 3 || var6 == 3) {
            arg4 = true;
        }
        if (arg0 <= 0 != var6 <= 0) {
            var5 = true;
        }
        if (class20.field244.startsWith("mac") && arg0 > 0) {
            arg4 = true;
        }
        if (arg4 && arg0 > 0) {
            var5 = true;
        }
        class10.method64(arg0, var6, arg2, (byte) -78, arg4, var5, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Ldl;IB)Lfg;")
    public static final class12 method482(class123 arg0, int arg1, byte arg2) {
        field1007++;
        if (class98.method653(arg2 ^ 0x17, arg1, arg0)) {
            return arg2 == -24 ? class246.method1660((byte) 127) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)I")
    public static final int method483(int arg0, int arg1) {
        field1006++;
        if (arg0 >= -17) {
            method478((byte) -104, (String) null);
        }
        return arg1 & 0xFF;
    }
}
