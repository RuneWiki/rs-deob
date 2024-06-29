import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class154 {

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "Lng;")
    private class226 field2275 = new class226(128);

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "Lic;")
    private class491 field2277;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "[I")
    public static int[] field2273;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "Z")
    public static boolean field2280;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
    public static int[] field2279;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field2272;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public static int field2278;

    static {
        new class475("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field2273 = new int[256];
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2273[var0] = var1;
        }
        new class475("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
        field2280 = false;
        field2279 = new int[1000];
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILmv;)V", line = 17)
    public static final void method993(int arg0, int arg1, class252 arg2) {
        field2274++;
        boolean var3 = arg2.method1690((byte) 1, 1) == 1;
        if (var3) {
            class314.field4472[class310.field4450++] = arg1;
        }
        int var4 = arg2.method1690((byte) 1, 2);
        class239 var5 = class44.field707[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field3512 = false;
            } else if (class172.field2546 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class105 var6 = class244.field3610[arg1] = new class105();
                var6.field1523 = (class24.field259 + var5.field1996[0] >> 6) + ((var5.field1768 << 28) + (var5.field1997[0] + class68.field1038 >> 6 << 14));
                if (var5.field3556 == -1) {
                    var6.field1519 = var5.field1945.method757(88);
                } else {
                    var6.field1519 = var5.field3556;
                }
                var6.field1518 = var5.field3525;
                var6.field1526 = var5.field1904;
                if (var5.field3534 > 0) {
                    class229.method1576(var5, 83);
                }
                class44.field707[arg1] = null;
                if (arg2.method1690((byte) 1, 1) != 0) {
                    class528.method3120(arg2, arg1, -92);
                }
            }
        } else if (arg0 < -92) {
            if (var4 == 1) {
                int var7 = arg2.method1690((byte) 1, 3);
                int var8 = var5.field1997[0];
                int var9 = var5.field1996[0];
                if (var7 == 0) {
                    var8--;
                    var9--;
                } else if (var7 == 1) {
                    var9--;
                } else if (var7 == 2) {
                    var9--;
                    var8++;
                } else if (var7 == 3) {
                    var8--;
                } else if (var7 == 4) {
                    var8++;
                } else if (var7 == 5) {
                    var9++;
                    var8--;
                } else if (var7 == 6) {
                    var9++;
                } else if (var7 == 7) {
                    var9++;
                    var8++;
                }
                if (var3) {
                    var5.field3536 = var8;
                    var5.field3509 = var9;
                    var5.field3512 = true;
                } else {
                    var5.method1615(class284.field4082[arg1], var9, var8, (byte) 126);
                }
            } else if (var4 == 2) {
                int var10 = arg2.method1690((byte) 1, 4);
                int var11 = var5.field1997[0];
                int var12 = var5.field1996[0];
                if (var10 == 0) {
                    var12 -= 2;
                    var11 -= 2;
                } else if (var10 == 1) {
                    var12 -= 2;
                    var11--;
                } else if (var10 == 2) {
                    var12 -= 2;
                } else if (var10 == 3) {
                    var12 -= 2;
                    var11++;
                } else if (var10 == 4) {
                    var11 += 2;
                    var12 -= 2;
                } else if (var10 == 5) {
                    var12--;
                    var11 -= 2;
                } else if (var10 == 6) {
                    var12--;
                    var11 += 2;
                } else if (var10 == 7) {
                    var11 -= 2;
                } else if (var10 == 8) {
                    var11 += 2;
                } else if (var10 == 9) {
                    var11 -= 2;
                    var12++;
                } else if (var10 == 10) {
                    var11 += 2;
                    var12++;
                } else if (var10 == 11) {
                    var12 += 2;
                    var11 -= 2;
                } else if (var10 == 12) {
                    var12 += 2;
                    var11--;
                } else if (var10 == 13) {
                    var12 += 2;
                } else if (var10 == 14) {
                    var11++;
                    var12 += 2;
                } else if (var10 == 15) {
                    var11 += 2;
                    var12 += 2;
                }
                if (var3) {
                    var5.field3509 = var12;
                    var5.field3536 = var11;
                    var5.field3512 = true;
                } else {
                    var5.method1615(class284.field4082[arg1], var12, var11, (byte) 127);
                }
            } else {
                int var13 = arg2.method1690((byte) 1, 1);
                if (var13 == 0) {
                    int var14 = arg2.method1690((byte) 1, 12);
                    int var15 = var14 >> 10;
                    int var16 = (var14 & 0x3FF) >> 5;
                    if (var16 > 15) {
                        var16 -= 32;
                    }
                    int var17 = var14 & 0x1F;
                    if (var17 > 15) {
                        var17 -= 32;
                    }
                    int var18 = var5.field1997[0] + var16;
                    int var19 = var5.field1996[0] + var17;
                    if (var3) {
                        var5.field3536 = var18;
                        var5.field3512 = true;
                        var5.field3509 = var19;
                    } else {
                        var5.method1615(class284.field4082[arg1], var19, var18, (byte) 127);
                    }
                    var5.field1768 = (byte) (var5.field1768 + var15 & 0x3);
                    if (class172.field2546 == arg1) {
                        class79.field1192 = var5.field1768;
                    }
                } else {
                    int var20 = arg2.method1690((byte) 1, 30);
                    int var21 = var20 >> 28;
                    int var22 = (var20 & 0xFFFDCDC) >> 14;
                    int var23 = var20 & 0x3FFF;
                    int var24 = (var5.field1997[0] + class68.field1038 + var22 & 0x3FFF) - class68.field1038;
                    int var25 = (var5.field1996[0] + class24.field259 + var23 & 0x3FFF) - class24.field259;
                    if (var3) {
                        var5.field3509 = var25;
                        var5.field3536 = var24;
                        var5.field3512 = true;
                    } else {
                        var5.method1615(class284.field4082[arg1], var25, var24, (byte) 127);
                    }
                    var5.field1768 = (byte) (var5.field1768 + var21 & 0x3);
                    if (class172.field2546 == arg1) {
                        class79.field1192 = var5.field1768;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 331)
    public static void method994(int arg0) {
        field2273 = null;
        if (arg0 < 74) {
            field2273 = null;
        }
        field2279 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)Lei;", line = 343)
    public final class116 method995(int arg0, int arg1) {
        field2276++;
        class226 var3 = this.field2275;
        class116 var4;
        synchronized (this.field2275) {
            var4 = (class116) this.field2275.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2277.method2945(class269.method1779(arg0 - 1760350295, arg1), class115.method768((byte) 57, arg1), true);
        class116 var6 = new class116();
        if (var5 != null) {
            var6.method778((byte) -84, new class209(var5));
        }
        class226 var7 = this.field2275;
        synchronized (this.field2275) {
            this.field2275.method1542(var6, (byte) 112, (long) arg1);
            if (arg0 != 16383) {
                field2278 = 60;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lai;ILic;)V", line = 378)
    public class154(class423 arg0, int arg1, class491 arg2) {
        this.field2277 = arg2;
        if (this.field2277 != null) {
            int var4 = this.field2277.method2943((byte) -33) - 1;
            this.field2277.method2942(false, var4);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZI)I", line = 435)
    public static final int method996(int arg0, int arg1, boolean arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field2272++;
        if (var4 == 0) {
            return arg0;
        }
        if (!arg2) {
            field2279 = null;
        }
        if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }
}
