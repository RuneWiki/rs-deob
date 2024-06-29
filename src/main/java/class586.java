import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class586 {

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "I")
    private int field8376 = -1;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Z")
    public boolean field8380 = true;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
    private int field8369;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "Ltv;")
    private class481 field8381;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Lwr;")
    private class388 field8366;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
    private int field8377;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    private int field8375;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    private int field8372;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Luj;")
    private class321 field8371;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public int field8379;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lwn;")
    private class617 field8370;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "J")
    public static long field8367 = -1L;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "Ldv;")
    public static class566 field8385;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "[I")
    public static int[] field8386;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "F")
    public static float field8382;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field8378;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field8384;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ag", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field8387;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method3435(int arg0) {
        field8385 = null;
        field8386 = null;
        if (arg0 != -28136) {
            method3438(-121, 95, 61, -16, 105, -94, 7, 10);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Luj;II)V")
    public final void method3436(class321 arg0, int arg1, int arg2) {
        if (arg2 > 0) {
            this.method3440(26392);
            this.field8366.method2267(arg1 ^ 0x7FFFFFFD, this.field8370);
            this.field8366.method1615(false, this.field8372 + 1 - this.field8375, arg0, this.field8375, arg2, 0, class481.field6784);
        }
        if (arg1 != Integer.MAX_VALUE) {
            method3435(72);
        }
        field8368++;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public static final void method3437(int arg0) {
        field8384++;
        if (class178.field2554 != null) {
            if (class178.field2554.field5134 == 1) {
                class178.field2554 = null;
                return;
            }
            if (class178.field2554.field5134 == 2) {
                class104.method735(class40.field800, 2, class165.field2373, false);
                class178.field2554 = null;
                return;
            }
        }
        if (arg0 != 4) {
            method3437(21);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8383++;
        int var8 = 42 / ((arg6 + 7) / 41);
        if (arg3 < 0 || arg4 < 0 || class32.field513 - 1 <= arg3 || (class611.field8786 - 1) <= arg4) {
            return;
        }
        if (class356.field4807 == null) {
            return;
        }
        if (arg7 != 0) {
            if (arg7 != 1) {
                if (arg7 == 2) {
                    class115 var10 = (class115) class582.method3324(arg1, arg3, arg4, field8387 == null ? (field8387 = method3441("wf")) : field8387);
                    if (var10 == null) {
                        return;
                    }
                    if (arg0 == 11) {
                        arg0 = 10;
                    }
                    if (var10 instanceof class473) {
                        ((class473) var10).field6652.method522(37, arg5);
                        return;
                    }
                    class212.method1386(arg0, arg1, arg3, arg4, arg7, -23807, arg2, var10.method748(false), arg5);
                } else if (arg7 == 3) {
                    class115 var9 = (class115) class404.method2411(arg1, arg3, arg4);
                    if (var9 != null) {
                        if (!(var9 instanceof class217)) {
                            class212.method1386(arg0, arg1, arg3, arg4, arg7, -23807, arg2, var9.method748(false), arg5);
                            return;
                        }
                        ((class217) var9).field3096.method522(87, arg5);
                        return;
                    }
                }
                return;
            }
            class115 var11 = (class115) class548.method3127(arg1, arg3, arg4);
            if (var11 == null) {
                return;
            }
            if (var11 instanceof class386) {
                ((class386) var11).field5173.method522(117, arg5);
                return;
            }
            int var12 = var11.method748(false);
            if (arg0 == 4 || arg0 == 5) {
                class212.method1386(4, arg1, arg3, arg4, arg7, -23807, arg2, var12, arg5);
                return;
            }
            if (arg0 == 6) {
                class212.method1386(4, arg1, arg3, arg4, arg7, -23807, arg2 + 4, var12, arg5);
            } else if (arg0 == 7) {
                class212.method1386(4, arg1, arg3, arg4, arg7, -23807, (arg2 + 2 & 0x3) + 4, var12, arg5);
                return;
            } else if (arg0 == 8) {
                class212.method1386(4, arg1, arg3, arg4, arg7, -23807, arg2 + 4, var12, arg5);
                class212.method1386(4, arg1, arg3, arg4, arg7, -23807, (arg2 + 2 & 0x3) + 4, var12, arg5);
                return;
            }
            return;
        }
        class115 var13 = (class115) class265.method1739(arg1, arg3, arg4);
        class115 var14 = (class115) class282.method1817(arg1, arg3, arg4);
        if (var13 != null && arg0 != 2) {
            if (var13 instanceof class106) {
                ((class106) var13).field1594.method522(31, arg5);
            } else {
                class212.method1386(arg0, arg1, arg3, arg4, arg7, -23807, arg2, var13.method748(false), arg5);
            }
        }
        if (var14 == null) {
            return;
        }
        if (var14 instanceof class106) {
            ((class106) var14).field1594.method522(117, arg5);
            return;
        }
        class212.method1386(arg0, arg1, arg3, arg4, arg7, -23807, arg2, var14.method748(false), arg5);
        return;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public final void method3439(int arg0) {
        if (arg0 != -2) {
            method3438(116, -111, 89, 101, 107, 53, 86, 35);
        }
        this.method3436(this.field8371, Integer.MAX_VALUE, this.field8379);
        field8374++;
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    private final void method3440(int arg0) {
        field8378++;
        if (!this.field8380) {
            return;
        }
        this.field8380 = false;
        byte[] var2 = this.field8381.field6772;
        int var3 = 0;
        int var4 = this.field8381.field6770;
        int var5 = this.field8381.field6770 * this.field8377 + this.field8369;
        int var6 = -128;
        if (arg0 != 26392) {
            return;
        }
        while (var6 < 0) {
            var3 = (var3 << 8) - var3;
            for (int var17 = -128; var17 < 0; var17++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
            var6++;
        }
        if (this.field8370 != null && this.field8376 == var3) {
            this.field8380 = false;
            return;
        }
        this.field8376 = var3;
        int var7 = 0;
        int var8 = this.field8369 + (this.field8377 * var4);
        if (!this.field8366.method1632(0, class519.field7310, class608.field8759)) {
            if (class180.field2561 == null) {
                class180.field2561 = new int[16384];
            }
            int[] var9 = class180.field2561;
            for (int var10 = -128; var10 < 0; var10++) {
                for (int var11 = -128; var11 < 0; var11++) {
                    if (var2[var8] == 0) {
                        int var12 = 0;
                        if (var2[var8 - 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var12++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var12++;
                        }
                        if (var2[var8 + var4] != 0) {
                            var12++;
                        }
                        var9[var7++] = var12 * 17 << 24;
                    } else {
                        var9[var7++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field8381.field6770 - 128;
            }
            if (this.field8370 == null) {
                this.field8370 = this.field8366.method2322(128, class180.field2561, 128, 8, false);
                this.field8370.method1812(false, false, arg0 - 47893);
            } else {
                this.field8370.method1813(class180.field2561, 128, 0, (byte) 95, 128, 128, 0, 0);
            }
            return;
        }
        if (class523.field7353 == null) {
            class523.field7353 = new byte[16384];
        }
        byte[] var13 = class523.field7353;
        for (int var14 = -128; var14 < 0; var14++) {
            for (int var15 = -128; var15 < 0; var15++) {
                if (var2[var8] == 0) {
                    int var16 = 0;
                    if (var2[var8 - 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var16++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var16++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var16++;
                    }
                    var13[var7++] = (byte) (var16 * 17);
                } else {
                    var13[var7++] = 68;
                }
                var8++;
            }
            var8 += this.field8381.field6770 - 128;
        }
        if (this.field8370 == null) {
            this.field8370 = this.field8366.method2327(arg0 ^ 0xFFFFC950, 128, class519.field7310, false, 128, class523.field7353);
            this.field8370.method1812(false, false, -21501);
        } else {
            this.field8370.method1810(class523.field7353, 128, 128, class519.field7310, 128, -30786, 0, 0, 0);
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lwr;Ltv;Luw;IIIII)V")
    public class586(class388 arg0, class481 arg1, class352 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field8369 = arg6;
        this.field8381 = arg1;
        this.field8366 = arg0;
        this.field8377 = arg7;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field2505 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field4721[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field8379 = 0;
            this.field8370 = null;
        } else {
            this.field8375 = Integer.MAX_VALUE;
            this.field8372 = Integer.MIN_VALUE;
            this.field8371 = this.field8366.method1588(false, (byte) -55);
            this.field8371.method1477(-18855, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field8371.method613(true, -25838);
                if (var15 != null) {
                    Stream var16 = this.field8366.method2269(106, var15);
                    if (Stream.method3294()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field2505 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field4721[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field8372 < var22) {
                                            this.field8372 = var22;
                                        }
                                        if (this.field8375 > var22) {
                                            this.field8375 = var22;
                                        }
                                        var16.method3291(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field2505 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field4721[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (this.field8375 > var28) {
                                            this.field8375 = var28;
                                        }
                                        if (this.field8372 < var28) {
                                            this.field8372 = var28;
                                        }
                                        var16.method3298(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3288();
                    if (this.field8371.method616((byte) -122)) {
                        break;
                    }
                }
            }
            this.field8379 = var10 / 3;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3441(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class104("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field8385 = new class566(42, 3);
        field8386 = new int[1024];
    }
}
