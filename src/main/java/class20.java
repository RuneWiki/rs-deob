import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class20 extends class288 {

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "Ljava/lang/String;")
    public String field249;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field241 = 0;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "[Loe;")
    public static class54[] field244 = new class54[32768];

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "I")
    public static int field247 = -2;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[I")
    public static int[] field248 = new int[1000];

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "Lok;")
    public static class40 field243;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static final void method121(int arg0) {
        field242++;
        try {
            if (class296.field4676 == 1) {
                int var1 = class296.field4684.method943(arg0 ^ 0x19);
                if (var1 > 0 && class296.field4684.method964(-1)) {
                    int var2 = var1 - class226.field3176;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class296.field4684.method961(var2, 32632);
                    return;
                }
                class296.field4684.method942(-18874);
                class296.field4684.method953((byte) 66);
                if (class117.field1645 == null) {
                    class296.field4676 = 0;
                } else {
                    class296.field4676 = 2;
                }
                class74.field886 = null;
                class58.field689 = null;
            }
            if (arg0 != 0) {
                field241 = -72;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class296.field4684.method942(arg0 - 18874);
            class74.field886 = null;
            class58.field689 = null;
            class117.field1645 = null;
            class296.field4676 = 0;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II[Lwe;)V")
    public static final void method122(int arg0, int arg1, class82[] arg2) {
        if (arg0 != 32768) {
            field248 = null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class82 var4 = arg2[var3];
            if (var4 != null && var4.field1101 == arg1 && (!var4.field1126 || !client.method1918(var4))) {
                if (var4.field1026 == 0) {
                    if (!var4.field1126 && client.method1918(var4) && class246.field3580 != var4) {
                        continue;
                    }
                    method122(arg0, var4.field1025, arg2);
                    if (var4.field1034 != null) {
                        method122(arg0, var4.field1025, var4.field1034);
                    }
                    class166 var5 = (class166) class189.field2705.method1895((long) var4.field1025, -120);
                    if (var5 != null) {
                        class101.method619(arg0 ^ 0x8108, var5.field2395);
                    }
                }
                if (var4.field1026 == 6) {
                    if (var4.field969 != -1 || var4.field966 != -1) {
                        boolean var6 = class61.method377(var4, 32767);
                        int var7;
                        if (var6) {
                            var7 = var4.field966;
                        } else {
                            var7 = var4.field969;
                        }
                        if (var7 != -1) {
                            class274 var8 = class27.method165(var7, (byte) -112);
                            if (var8 != null) {
                                var4.field1043 += class123.field1771;
                                while (var4.field1043 > var8.field4081[var4.field1088]) {
                                    var4.field1043 -= var8.field4081[var4.field1088];
                                    var4.field1088++;
                                    if (var8.field4072.length <= var4.field1088) {
                                        var4.field1088 -= var8.field4068;
                                        if (var4.field1088 < 0 || var4.field1088 >= var8.field4072.length) {
                                            var4.field1088 = 0;
                                        }
                                    }
                                    var4.field1092 = var4.field1088 + 1;
                                    if (var4.field1092 >= var8.field4072.length) {
                                        var4.field1092 -= var8.field4068;
                                        if (var4.field1092 < 0 || var8.field4072.length <= var4.field1092) {
                                            var4.field1092 = -1;
                                        }
                                    }
                                    class255.method1632(16711680, var4);
                                }
                            }
                        }
                    }
                    if (var4.field1110 != 0 && !var4.field1126) {
                        int var9 = var4.field1110 >> 16;
                        int var10 = var4.field1110 << 16 >> 16;
                        int var11 = class123.field1771 * var9;
                        int var12 = class123.field1771 * var10;
                        var4.field964 = var4.field964 + var11 & 0x7FF;
                        var4.field1141 = var4.field1141 + var12 & 0x7FF;
                        class255.method1632(16711680, var4);
                    }
                }
            }
        }
        field246++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lf;")
    public static final class226 method123(int arg0, int arg1) {
        field245++;
        class226 var2 = (class226) class75.field902.method1567((long) arg1, arg0 ^ 0x7FF7);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != 32767) {
            method121(53);
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class27.field326.method1861(arg1 & 0x7FFF, 1, 1);
        } else {
            var3 = class199.field2832.method1861(arg1, 1, 1);
        }
        class226 var4 = new class226();
        if (var3 != null) {
            var4.method1468(-118, new class216(var3));
        }
        if (arg1 >= 32768) {
            var4.method1465(arg0 - 32721);
        }
        class75.field902.method1568((byte) -108, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class20() {
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V")
    public static void method124(int arg0) {
        field248 = null;
        field244 = null;
        if (arg0 != -743019920) {
            method124(27);
        }
        field243 = null;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class20(String arg0) {
        this.field249 = arg0;
    }
}
