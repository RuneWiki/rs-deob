import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class380 extends class294 {

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "Lfa;")
    public static class156 field5611 = new class156(200);

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field5612 = -1;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "[I")
    public static int[] field5617 = new int[6];

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field5618 = 0;

    @OriginalMember(owner = "client!nd", name = "S", descriptor = "J")
    public static long field5619;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "[B")
    private byte[] field5610;

    static {
        new class331("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
        field5619 = -1L;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BII)V", line = 5)
    public final void method1861(byte arg0, int arg1, int arg2) {
        field5609++;
        int var4 = arg1 * 2;
        int var5 = arg0 & 0xFF;
        int var10001 = var4;
        int var7 = var4 + 1;
        this.field5610[var10001] = (byte) (var5 * 3 >> 5);
        int var6 = 101 / ((arg2 + 21) / 51);
        this.field5610[var7] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILuu;Lya;)V", line = 21)
    public static final void method2324(int arg0, class188 arg1, class38 arg2) {
        field5615++;
        boolean var3 = class270.field3995.method3(arg2, arg1.field2617, arg0 + 16777101, arg1.field2657 ? class435.field6375.field5065 : null, arg1.field2704, arg1.field2710, arg1.field2709, arg1.field2616 | arg0) == null;
        if (var3) {
            class315.field4484.method1015(false, new class465(arg1.field2617, arg1.field2710, arg1.field2709, arg1.field2616 | 0xFF000000, arg1.field2704, arg1.field2657));
            class120.method951(arg1, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 37)
    public static void method2325(int arg0) {
        field5611 = null;
        field5617 = null;
        if (arg0 != -11878) {
            method2324(-124, null, null);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lwn;I[[B)V", line = 51)
    public static final void method2326(class507 arg0, int arg1, byte[][] arg2) {
        field5613++;
        if (arg1 != 8) {
            return;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg0.field4002; var4++) {
            class106.method876((byte) -109);
            for (int var5 = 0; var5 < class397.field5828 >> 3; var5++) {
                for (int var6 = 0; var6 < (class457.field6713 >> 3); var6++) {
                    boolean var7 = false;
                    int var8 = class310.field4420[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0.field3990 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFC909) >> 14;
                            int var12 = (var8 & 0x3FFC) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class411.field6110.length; var14++) {
                                if (class411.field6110[var14] == var13 && arg2[var14] != null) {
                                    class65 var15 = new class65(arg2[var14]);
                                    arg0.method1740(var10, var15, var9, class455.field6684, (byte) -12, var12, var4, var6 * 8, var5 * 8, var11);
                                    arg0.method3027(var4, var6 * 8, var15, var3[0] == -1 ? var3 : null, class225.field3300, var12, var11, var10, arg1, var9, var5 * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg0.method1731(true, 8, var4, 8, var6 * 8, var5 * 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class423.field6245 = class428.field6311.method2702(var3[1], var3[0], 118, var3[2], var3[3], class172.field2451);
            class487.field7161 = var3[4];
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V", line = 141)
    public class380() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([ILrs;[IZ[I)V", line = 151)
    public static final void method2327(int[] arg0, class461 arg1, int[] arg2, boolean arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg4[var5];
            int var8 = arg0[var5];
            for (int var9 = 0; var7 != 0 && arg1.field1760.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field1760[var9] = null;
                    } else {
                        class267 var10 = class153.field2169.method1585(3, var6);
                        int var11 = var10.field3932;
                        class287 var12 = arg1.field1760[var9];
                        if (var12 != null) {
                            if (var12.field4140 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field1760[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4141 = 1;
                                    var12.field4138 = 0;
                                    var12.field4143 = 0;
                                    var12.field4144 = 0;
                                    var12.field4142 = var8;
                                    class20.method183(arg1.field6335, 0, arg1.field6328, arg1.field6334, !arg3, var10, false);
                                } else if (var11 == 2) {
                                    var12.field4144 = 0;
                                }
                            } else if (var10.field3942 >= class153.field2169.method1585(3, var12.field4140).field3942) {
                                var12 = arg1.field1760[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class287 var13 = arg1.field1760[var9] = new class287();
                            var13.field4141 = 1;
                            var13.field4142 = var8;
                            var13.field4140 = var6;
                            var13.field4143 = 0;
                            var13.field4138 = 0;
                            var13.field4144 = 0;
                            class20.method183(arg1.field6335, 0, arg1.field6328, arg1.field6334, !arg3, var10, false);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        field5607++;
        if (arg3) {
            field5611 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIII)[B", line = 255)
    public final byte[] method2328(int arg0, int arg1, int arg2, int arg3) {
        field5608++;
        this.field5610 = new byte[arg0 * 2 * arg2 * arg3];
        if (arg1 != -201) {
            field5618 = -74;
        }
        this.method1769((byte) -95, arg2, arg0, arg3);
        return this.field5610;
    }
}
