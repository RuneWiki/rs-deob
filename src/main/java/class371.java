import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class371 extends class426 {

    @OriginalMember(owner = "client!g", name = "K", descriptor = "[Ldm;")
    public static class265[] field5410 = new class265[14];

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Loa;")
    public static class149 field5416;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!g", name = "P", descriptor = "I")
    public static int field5415;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "[I")
    public static int[] field5418;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method2230(boolean arg0) {
        field5412++;
        if (arg0) {
            field5418 = null;
        }
        class265.field4045.method1485(-22032);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method2231(int arg0, int arg1) {
        field5411++;
        class241 var2 = class136.field1828;
        synchronized (class136.field1828) {
            if (arg0 < 113) {
                method2233(false, -8, -14, 26);
            }
            class136.field1828.method1481(3, arg1);
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
    public static void method2232(byte arg0) {
        if (arg0 == 120) {
            field5416 = null;
            field5418 = null;
            field5410 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZIII)I")
    public static final int method2233(boolean arg0, int arg1, int arg2, int arg3) {
        field5415++;
        if (arg0) {
            return 38;
        } else if ((class341.field5085[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class341.field5085[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIZLjava/lang/String;BLjava/lang/String;IJZ)V")
    public static final void method2234(int arg0, int arg1, int arg2, boolean arg3, String arg4, byte arg5, String arg6, int arg7, long arg8, boolean arg9) {
        field5417++;
        if (arg5 != -65) {
            method2234(-92, -6, 65, true, (String) null, (byte) 95, (String) null, -65, -68L, false);
        }
        if (!class306.field4628 && class149.field2067 < 500) {
            int var11 = arg7 == -1 ? class1.field5 : arg7;
            class306 var12 = new class306(arg4, arg6, var11, arg1, arg8, arg2, arg0, arg9, arg3);
            class372.field5433.method2504(42, var12);
            class149.field2067++;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IJ)V")
    public static final void method2235(int arg0, long arg1) {
        field5414++;
        int var3 = class331.field4950;
        int var4 = class155.field2138;
        if (class136.field1804 != var3) {
            int var5 = var3 - class136.field1804;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class136.field1804 += var6;
        }
        if (!class212.field3193) {
            class188.field2811 += (float) arg1 * class228.field3472 / 40.0F * 8.0F;
            class462.field6810 += (float) arg1 * class1.field16 / 40.0F * 8.0F;
        }
        if (arg0 != 0) {
            method2233(false, 103, 13, -118);
        }
        if (class103.field1401 != var4) {
            int var7 = var4 - class103.field1401;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class103.field1401 += var8;
        }
        class43.method250(-77);
    }

    static {
        new class151("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field5413 = 0;
        field5416 = new class149(128);
    }
}
