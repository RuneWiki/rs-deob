import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class289 {

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field4614 = 0;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static final void method1942(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field4613++;
        for (int var1 = 0; var1 < class254.field4039; var1++) {
            int var2 = class200.field3251[var1];
            class213 var3 = class191.field3129[var2];
            int var4 = class143.field2360.method1012(4);
            if ((var4 & 0x2) != 0) {
                var4 += class143.field2360.method1012(arg0 ^ 0x6) << 8;
            }
            class124.method917(arg0 + 119, var2, var3, var4);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZI)V")
    public static final void method1943(int arg0, boolean arg1, int arg2) {
        field4612++;
        if (!arg1) {
            method1942(-91);
        }
        class23 var3 = class91.method694(arg0, 1, 106);
        var3.method190(0);
        var3.field361 = arg2;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lig;I)V")
    public static final void method1944(class136 arg0, int arg1) {
        field4615++;
        while (true) {
            while (arg0.field2231 < arg0.field2263.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1012(4) == 1) {
                    var4 = arg0.method1012(4);
                    var3 = arg0.method1012(4);
                    var2 = true;
                }
                int var5 = arg0.method1012(4);
                int var6 = arg0.method1012(4);
                int var7 = var5 * 64 - class285.field4524;
                int var8 = class253.field4030 + class31.field524 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class159.field2574 && var8 < class31.field524) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || (var4 * 8) <= var11 && (var4 * 8 + 8) > var11 && (var3 * 8) <= var12 && var3 * 8 + 8 > var12) {
                                int var13 = arg0.method1012(4);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method1012(4);
                                        if (class81.field1333[var9][var10] == null) {
                                            class81.field1333[var9][var10] = new byte[4096];
                                        }
                                        class81.field1333[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method1009(115);
                                        if (class172.field2911[var9][var10] == null) {
                                            class172.field2911[var9][var10] = new int[4096];
                                        }
                                        class172.field2911[var9][var10][(63 - var12 << 6) + var11] = var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = arg0.method1009(116);
                                        if (class149.field2446[var9][var10] == null) {
                                            class149.field2446[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class248 var17 = class46.method396(var16, (byte) 63);
                                        if (var17.field3897 != null) {
                                            var17 = var17.method1656(0);
                                            if (var17 == null || var17.field3907 == -1) {
                                                continue;
                                            }
                                        }
                                        class149.field2446[var9][var10][(63 - var12 << 6) + var11] = var17.field3893 + 1;
                                        class61 var18 = new class61();
                                        var18.field1043 = var17.field3907;
                                        var18.field1038 = var7;
                                        var18.field1042 = var8;
                                        class187.field3057.method1809(5, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method1012(4);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field2231++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field2231 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field2231 += 3;
                            }
                        }
                    }
                }
            }
            if (arg1 > -58) {
                method1944((class136) null, -56);
                return;
            }
            return;
        }
    }
}
