import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class3 {

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static final void method14(byte arg0) {
        field32++;
        if (class24.field416 < 1024.0F) {
            class24.field416 = 1024.0F;
        }
        if (class24.field416 > 3072.0F) {
            class24.field416 = 3072.0F;
        }
        while (class333.field4599 >= 16384.0F) {
            class333.field4599 -= 16384.0F;
        }
        while (class333.field4599 < 0.0F) {
            class333.field4599 += 16384.0F;
        }
        int var1 = class67.field999 >> 7;
        int var2 = class447.field6265 >> 7;
        int var3 = class285.method1858(class67.field999, class142.field2034, class447.field6265, -117);
        if (arg0 != 126) {
            method14((byte) 6);
        }
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class142.field2034;
                    if (var7 < 3 && class112.method791((byte) -116, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class132.field1889 != null && class132.field1889[var7] != null) {
                        var8 = (class132.field1889[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 - (class375.field5354[var7].method737(var5, var6) - var8);
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (class214.field2981 < var10) {
            class214.field2981 += (var10 - class214.field2981) / 24;
        } else if (class214.field2981 > var10) {
            class214.field2981 += (var10 - class214.field2981) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLij;I[Lhh;BLuo;)V")
    public static final void method15(boolean arg0, class242 arg1, int arg2, class67[] arg3, byte arg4, class345 arg5) {
        field31++;
        if (!arg0) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class211.field2954; var7++) {
                    for (int var8 = 0; var8 < class290.field4061; var8++) {
                        if ((class368.field5193[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class368.field5193[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg3[var9].method523(var8, var7, (byte) -38);
                            }
                        }
                    }
                }
            }
        }
        int[][] var10 = new int[class211.field2954][class290.field4061];
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var13 = 0; var13 < class290.field4061; var13++) {
                class329.field4569[var13] = 0;
                class442.field6205[var13] = 0;
                class348.field4796[var13] = 0;
                class397.field5672[var13] = 0;
                class170.field2329[var13] = 0;
            }
            for (int var14 = -5; var14 < class211.field2954; var14++) {
                for (int var15 = 0; var15 < class290.field4061; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (class211.field2954 > var24) {
                        int var25 = class414.field5879[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class40 var26 = class194.method1252(var25 - 1, false);
                            class329.field4569[var15] += var26.field576;
                            class442.field6205[var15] += var26.field577;
                            class348.field4796[var15] += var26.field580;
                            class397.field5672[var15] += var26.field585;
                            var10002 = class170.field2329[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class414.field5879[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class40 var29 = class194.method1252(var28 - 1, false);
                            class329.field4569[var15] -= var29.field576;
                            class442.field6205[var15] -= var29.field577;
                            class348.field4796[var15] -= var29.field580;
                            class397.field5672[var15] -= var29.field585;
                            var10002 = class170.field2329[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class290.field4061; var21++) {
                        int var22 = var21 + 5;
                        if (class290.field4061 > var22) {
                            var16 += class329.field4569[var22];
                            var19 += class397.field5672[var22];
                            var17 += class442.field6205[var22];
                            var18 += class348.field4796[var22];
                            var20 += class170.field2329[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var18 -= class348.field4796[var23];
                            var20 -= class170.field2329[var23];
                            var17 -= class442.field6205[var23];
                            var16 -= class329.field4569[var23];
                            var19 -= class397.field5672[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class76.method562(68, var17 / var20, var16 * 256 / var19, var18 / var20);
                        }
                    }
                }
            }
            class417.method2618((byte) -29, arg1, var10, var11, arg0, class65.field968[var11], class211.field2954, class290.field4074[var11], class414.field5879[var11], class290.field4061, class375.field5354[var11], class277.field3882[var11], arg5);
            class414.field5879[var11] = null;
            class277.field3882[var11] = null;
            class290.field4074[var11] = null;
            class65.field968[var11] = null;
        }
        if (!arg0) {
            if (class312.field4271) {
                class124.method835();
            }
            if (class327.field4508 != 0) {
                class146.method995();
            }
        }
        for (int var12 = 0; var12 < arg2; var12++) {
            class375.field5354[var12].method722();
        }
        if (arg4 != -4) {
            method14((byte) 64);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method16(String arg0, int arg1) {
        field30++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class272.field3777; var2++) {
            if (arg0.equalsIgnoreCase(class288.field4045[var2])) {
                return true;
            }
        }
        return arg0.equalsIgnoreCase(class412.field5841.field1922);
    }

    static {
        new class420(64);
        new class442("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
    }
}
