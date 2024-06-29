import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class599 {

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[J")
    public static long[] field8835 = new long[256];

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field8834;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field8837;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lkl;")
    public static class69 field8839;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method3539(int arg0) {
        field8834++;
        if (arg0 != 1) {
            method3539(-16);
        }
        for (int var1 = 0; var1 < class359.field4885; var1++) {
            class300 var2 = class378.field5206[var1];
            boolean var3 = false;
            if (var2.field4121 == null) {
                var2.field4125--;
                if ((var2.field4119 == 2 ? -1500 : -10) <= var2.field4125) {
                    if (var2.field4119 == 1 && var2.field4122 == null) {
                        var2.field4122 = class154.method1120(class472.field6666, var2.field4110, 0);
                        if (var2.field4122 == null) {
                            continue;
                        }
                        var2.field4125 += var2.field4122.method1121();
                    } else if (var2.field4119 == 2 && (var2.field4118 == null || var2.field4114 == null)) {
                        if (var2.field4118 == null) {
                            var2.field4118 = class475.method2861(class623.field9185, var2.field4110);
                        }
                        if (var2.field4118 == null) {
                            continue;
                        }
                        if (var2.field4114 == null) {
                            var2.field4114 = var2.field4118.method2857(new int[] { 22050 });
                            if (var2.field4114 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field4125 < 0) {
                        int var4;
                        if (var2.field4116 == 0) {
                            var4 = class56.field668.field6840 * var2.field4112 >> 8;
                        } else {
                            int var5 = (var2.field4116 & 0x3DBD532) >> 24;
                            if (class541.field8119.field8501 == var5) {
                                int var6 = (var2.field4116 & 0xFF) << 7;
                                int var7 = var2.field4116 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class541.field8119.field8496;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field4116 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class541.field8119.field8500;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var10 + var8 - 128;
                                if (var6 < var11) {
                                    var2.field4125 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = class56.field668.field6873 * var2.field4112 * (var6 - var11) / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class16 var12 = null;
                            if (var2.field4119 == 1) {
                                var12 = var2.field4122.method1119().method107(class341.field4716);
                            } else if (var2.field4119 == 2) {
                                var12 = var2.field4114;
                            }
                            class91 var13 = var2.field4121 = class91.method703(var12, 100, var4);
                            var13.method706(var2.field4123 - 1);
                            class155.field2316.method267(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field4121.method2453(64)) {
                var3 = true;
            }
            if (var3) {
                class359.field4885--;
                for (int var14 = var1; var14 < class359.field4885; var14++) {
                    class378.field5206[var14] = class378.field5206[var14 + 1];
                }
                var1--;
            }
        }
        if (class568.field8385 && !class523.method3083((byte) -115)) {
            if (class56.field668.field6850 != 0 && class625.field9210 != -1) {
                class604.method3561(class625.field9210, -229575572, false, 0, class56.field668.field6850, class333.field4619);
            }
            class568.field8385 = false;
        } else if (class56.field668.field6850 != 0 && class625.field9210 != -1 && !class523.method3083((byte) -115)) {
            class402.method2367(class199.field2925, (byte) 100);
            class481.field6833++;
            class112.field1589.method1058(arg0 + 602643079, class625.field9210);
            class625.field9210 = -1;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)Z")
    public static final boolean method3540(int arg0, int arg1, int arg2) {
        field8837++;
        if (arg0 != 0) {
            method3541(-103);
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method3541(int arg0) {
        if (arg0 == 20830) {
            field8835 = null;
            field8839 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIB)I")
    public static final int method3542(int arg0, int arg1, int arg2, byte arg3) {
        field8836++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (arg3 <= 50) {
            return -92;
        } else if (var4 == 1) {
            return 1023 - arg1;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg1;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8835[var0] = var1;
        }
        field8838 = 0;
        new class572("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
        field8840 = 0;
        field8841 = 0;
    }
}
