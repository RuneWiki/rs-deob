import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class204 {

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "Lsh;")
    public static class472 field3104;

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "[[I")
    public static int[][] field3105;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "Lqm;")
    public static class262 field3097;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Lui;")
    public static class451 field3102;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bm", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field3106;

    // $FF: synthetic method
    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1395(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class332("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field3104 = new class472(13, -2);
        field3105 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
    }

    @OriginalMember(owner = "client!bm", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field3098++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILtq;IIIIIII)V", line = 14)
    public static final void method1389(int arg0, class63 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3099++;
        class218 var9 = (class218) class147.method1006(arg6, arg5, arg0);
        if (arg8 <= 110) {
            method1389(-96, (class63) null, 29, 62, -24, -20, 89, -57, -6);
        }
        if (var9 != null) {
            class271 var10 = class206.field3124.method338((byte) 115, var9.method257(false));
            int var11 = var9.method244((byte) -97) & 0x3;
            int var12 = var9.method250((byte) -119);
            if (var10.field4064 == -1) {
                int var13 = arg7;
                if (var10.field4053 > 0) {
                    var13 = arg4;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg1.method549(48, var13, 4, arg2, arg3);
                    } else if (var11 == 1) {
                        arg1.method582(arg2, 4, var13, arg3, -15118);
                    } else if (var11 == 2) {
                        arg1.method549(48, var13, 4, arg2, arg3 + 3);
                    } else if (var11 == 3) {
                        arg1.method582(arg2 + 3, 4, var13, arg3, -15118);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg1.method530(1, var13, arg2, (byte) 108, arg3, 1);
                    } else if (var11 == 1) {
                        arg1.method530(1, var13, arg2, (byte) 108, arg3 + 3, 1);
                    } else if (var11 == 2) {
                        arg1.method530(1, var13, arg2 + 3, (byte) 108, arg3 + 3, 1);
                    } else if (var11 == 3) {
                        arg1.method530(1, var13, arg2 + 3, (byte) 108, arg3, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg1.method582(arg2, 4, var13, arg3, -15118);
                    } else if (var11 == 1) {
                        arg1.method549(48, var13, 4, arg2, arg3 + 3);
                    } else if (var11 == 2) {
                        arg1.method582(arg2 + 3, 4, var13, arg3, -15118);
                    } else if (var11 == 3) {
                        arg1.method549(48, var13, 4, arg2, arg3);
                    }
                }
            } else {
                class269.method1751(arg2, 0, var10, var11, arg3, arg1);
            }
        }
        class218 var14 = (class218) class390.method2350(arg6, arg5, arg0, field3106 == null ? (field3106 = method1395("ki")) : field3106);
        if (var14 != null) {
            class271 var15 = class206.field3124.method338((byte) 118, var14.method257(false));
            int var16 = var14.method244((byte) -46) & 0x3;
            int var17 = var14.method250((byte) -123);
            if (var15.field4064 != -1) {
                class269.method1751(arg2, 0, var15, var16, arg3, arg1);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field4053 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg1.method545(1, arg2, var18, arg3, arg2 + 3, arg3 - -3);
                } else {
                    arg1.method545(1, arg2 + 3, var18, arg3, arg2, arg3 + 3);
                }
            }
        }
        class218 var19 = (class218) class487.method2848(arg6, arg5, arg0);
        if (var19 == null) {
            return;
        }
        class271 var20 = class206.field3124.method338((byte) 115, var19.method257(false));
        int var21 = var19.method244((byte) -15) & 0x3;
        if (var20.field4064 != -1) {
            class269.method1751(arg2, 0, var20, var21, arg3, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lbg;B)V", line = 155)
    public static final void method1390(class257 arg0, byte arg1) {
        if (arg1 != 1) {
            return;
        }
        field3096++;
        class43 var2 = (class43) class4.field82.method2305((long) arg0.field4609, (byte) 61);
        if (var2 == null) {
            return;
        }
        if (var2.field580 != null) {
            class452.field6419.method2415(var2.field580);
            var2.field580 = null;
        }
        var2.method283(arg1 ^ 0x3);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)Z", line = 193)
    public static final boolean method1391(int arg0) {
        field3095++;
        try {
            if (arg0 != -6115) {
                method1389(73, (class63) null, 26, -18, 37, -77, -24, 124, -78);
            }
            return class111.method811(-2);
        } catch (IOException var4) {
            class4.method31((byte) 109);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class147.field2099 == null ? -1 : class147.field2099.method2755(false)) + "," + (class273.field4143 == null ? -1 : class273.field4143.method2755(false)) + "," + (class392.field5788 == null ? -1 : class392.field5788.method2755(false)) + " - " + class95.field1342 + "," + (class68.field922 + class472.field6622.field4675[0]) + "," + (class468.field6588 + class472.field6622.field4674[0]) + " - ";
            for (int var3 = 0; var3 < class95.field1342 && var3 < 50; var3++) {
                var2 = var2 + class220.field3246.field6316[var3] + ",";
            }
            class416.method2475(false, var5, var2);
            class38.method295(arg0 + 6191);
            return true;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Z)V", line = 227)
    public static void method1392(boolean arg0) {
        if (!arg0) {
            method1392(false);
        }
        field3102 = null;
        field3104 = null;
        field3097 = null;
        field3105 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)I", line = 243)
    public final int method1393(byte arg0) {
        if (arg0 >= -49) {
            return 1;
        } else {
            field3101++;
            return this.field3103;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lug;Z)Z", line = 258)
    public static final boolean method1394(class305 arg0, boolean arg1) {
        boolean var2 = class55.field765 == class479.field6745;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method1469(-7360);
        if (arg0.field4542 < 0 || arg0.field4547 < 0 || arg0.field4541 >= class412.field5957 || arg0.field4552 >= class315.field4743) {
            return false;
        }
        for (int var6 = arg0.field4542; var6 <= arg0.field4541; var6++) {
            for (int var9 = arg0.field4547; var9 <= arg0.field4552; var9++) {
                class337 var10 = class15.method139(arg0.field4545, var6, var9);
                if (var10 != null) {
                    int var11 = 0;
                    if (var6 > arg0.field4542) {
                        var11++;
                    }
                    if (var6 < arg0.field4541) {
                        var11 += 4;
                    }
                    if (var9 > arg0.field4547) {
                        var11 += 8;
                    }
                    if (var9 < arg0.field4552) {
                        var11 += 2;
                    }
                    class448 var12 = class236.method1531(var11, arg0, (byte) 119);
                    class448 var13 = var10.field5054;
                    if (var13 == null) {
                        var10.field5054 = var12;
                    } else {
                        while (var13.field6340 != null) {
                            var13 = var13.field6340;
                        }
                        var13.field6340 = var12;
                    }
                    var10.field5065 = (byte) (var10.field5065 | var11);
                    if (var2 && (class111.field1568[var6][var9] & 0xFF000000) != 0) {
                        var3 = class111.field1568[var6][var9];
                        var4 = class318.field4780[var6][var9];
                        var5 = class314.field4724[var6][var9];
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var7 = arg0.field4542; var7 <= arg0.field4541; var7++) {
                for (int var8 = arg0.field4547; var8 <= arg0.field4552; var8++) {
                    if ((class111.field1568[var7][var8] & 0xFF000000) == 0) {
                        class111.field1568[var7][var8] = var3;
                        class318.field4780[var7][var8] = var4;
                        class314.field4724[var7][var8] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class166.field2343[class270.field3992++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 360)
    public class204(String arg0, int arg1) {
        this.field3103 = arg1;
    }
}
