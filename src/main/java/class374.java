import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class374 extends class11 {

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    private int field5490 = 4096;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    private int field5488 = 0;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "Lqp;")
    public static class466 field5487 = new class466("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!ur", name = "J", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ur", name = "K", descriptor = "Ljava/lang/String;")
    public static String field5486;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIZII)V")
    public static final void method2234(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field5489;
        if (arg2) {
            method2239((byte) -40);
        }
        class97 var5 = class348.method2064(arg0, 8, -125);
        var5.method712((byte) -105);
        var5.field1471 = arg3;
        var5.field1472 = arg4;
        var5.field1468 = arg1;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class374() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method2235(long arg0, byte arg1) {
        ++field5492;
        if (arg1 != 112) {
            method2239((byte) -124);
        }
        if (arg0 > 0L && ~arg0 > -6582952005840035282L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (~arg0 != -1L) {
                    long var7 = arg0;
                    arg0 /= 37L;
                    char var9 = class60.field754[(int) (-(arg0 * 37L) + var7)];
                    if (~var9 == -96) {
                        int var10 = var6.length() + -1;
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                        var9 = 160;
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "(I)V")
    public static void method2236(int arg0) {
        field5486 = null;
        field5487 = null;
        if (arg0 != -1) {
            method2237(46, 59, 90);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 == 1) {
                this.field5490 = arg0.method2353((byte) 124);
            }
        } else {
            this.field5488 = arg0.method2353((byte) 104);
        }
        ++field5491;
        if (arg1 > -40) {
            method2234(7, -103, true, 84, -8);
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field5485;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 > -42) {
            method2235(-125L, (byte) 22);
        }
        if (super.field158.field2966) {
            int[] var4 = this.method48(arg1, 0, (byte) -123);
            for (int var5 = 0; ~var5 > ~class90.field1316; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field5488 && ~var6 >= ~this.field5490 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(III)I")
    public static final int method2237(int arg0, int arg1, int arg2) {
        ++field5483;
        if (arg2 != 15124) {
            field5486 = null;
        }
        int var3 = arg0 + -1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg0 + var3;
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)V")
    public static final void method2238(byte arg0) {
        class179.field2631.method1278(0);
        ++field5482;
        if (arg0 <= 105) {
            field5487 = null;
        }
        int var1 = class179.field2631.method1282(-26364, 8);
        if (class275.field3772 > var1) {
            for (int var2 = var1; class275.field3772 > var2; ++var2) {
                class138.field1960[class520.field7705++] = class65.field899[var2];
            }
        }
        if (~var1 < ~class275.field3772) {
            throw new RuntimeException("gnpov1");
        } else {
            class275.field3772 = 0;
            for (int var3 = 0; var1 > var3; ++var3) {
                int var4 = class65.field899[var3];
                class502 var5 = class378.field5533[var4];
                int var6 = class179.field2631.method1282(-26364, 1);
                if (var6 == 0) {
                    class65.field899[class275.field3772++] = var4;
                    var5.field1027 = class441.field6516;
                } else {
                    int var7 = class179.field2631.method1282(-26364, 2);
                    if (var7 == 0) {
                        class65.field899[class275.field3772++] = var4;
                        var5.field1027 = class441.field6516;
                        class435.field6374[class225.field3203++] = var4;
                    } else if (var7 == 1) {
                        class65.field899[class275.field3772++] = var4;
                        var5.field1027 = class441.field6516;
                        int var8 = class179.field2631.method1282(-26364, 3);
                        var5.method2944(-55, 1, var8);
                        int var9 = class179.field2631.method1282(-26364, 1);
                        if (var9 == 1) {
                            class435.field6374[class225.field3203++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class65.field899[class275.field3772++] = var4;
                        var5.field1027 = class441.field6516;
                        if (class179.field2631.method1282(-26364, 1) == 1) {
                            int var10 = class179.field2631.method1282(-26364, 3);
                            var5.method2944(-93, 2, var10);
                            int var11 = class179.field2631.method1282(-26364, 3);
                            var5.method2944(87, 2, var11);
                        } else {
                            int var12 = class179.field2631.method1282(-26364, 3);
                            var5.method2944(-59, 0, var12);
                        }
                        int var13 = class179.field2631.method1282(-26364, 1);
                        if (var13 == 1) {
                            class435.field6374[class225.field3203++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class138.field1960[class520.field7705++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)V")
    public static final void method2239(byte arg0) {
        for (int var1 = 0; var1 < 5; ++var1) {
            class80.field1225[var1] = false;
        }
        if (arg0 >= -56) {
            field5487 = null;
        }
        ++field5484;
        class325.field4443 = 0;
        class186.field2704 = class94.field1399;
        class397.field5795 = class329.field4493;
        class353.field5179 = class107.field1604;
        class76.field1019 = class62.field766;
        class58.field711 = class373.field5478;
        class491.field7168 = 5;
        class21.field280 = 0;
        class59.field721 = -1;
        class369.field5401 = class441.field6516;
        class401.field5886 = -1;
    }

    static {
        new class466("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
    }
}
