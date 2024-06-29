import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class119 implements class394 {

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Lid;")
    private class260 field1481 = new class260(256);

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "Lg;")
    private class470 field1479;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "Lg;")
    private class470 field1483;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "[Lns;")
    private class189[] field1477;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "Z")
    public static boolean field1484 = true;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "[[I")
    public static int[][] field1488 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "Lsd;")
    public static class74 field1485 = new class74(76, 4);

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "Lab;")
    public static class256 field1474;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(ZIIFII)[I")
    public final int[] method573(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        field1476++;
        int var7 = -84 % ((-arg1 - 29) / 35);
        return this.method574(-10070, arg2).method686(this.field1477[arg2].field2583, arg5, this, this.field1483, (byte) 126, (double) arg3, arg4);
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(II)Lrn;")
    private final class145 method574(int arg0, int arg1) {
        field1475++;
        class15 var3 = this.field1481.method1599((byte) 13, (long) arg1);
        if (var3 != null) {
            return (class145) var3;
        }
        byte[] var4 = this.field1479.method2779(1, arg1);
        if (arg0 != -10070) {
            this.method573(true, 49, -96, -1.3993621F, -124, -113);
        }
        if (var4 == null) {
            return null;
        } else {
            class145 var5 = new class145(new class179(var4));
            this.field1481.method1597(var5, (long) arg1, -30892);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)Z")
    public final boolean method575(int arg0, byte arg1) {
        field1478++;
        class145 var3 = this.method574(-10070, arg0);
        if (arg1 <= 101) {
            field1488 = null;
        }
        return var3 != null && var3.method688(0, this, this.field1483);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static void method576(byte arg0) {
        field1474 = null;
        if (arg0 < 38) {
            method580(82, -50, 117, (byte) -2, 44, -41);
        }
        field1485 = null;
        field1488 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)Lns;")
    public final class189 method577(int arg0, int arg1) {
        if (arg1 > -116) {
            return null;
        } else {
            field1482++;
            return this.field1477[arg0];
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZIIFII)[I")
    public final int[] method578(boolean arg0, int arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg4 >= -3) {
            this.method575(-84, (byte) 97);
        }
        field1486++;
        return this.method574(-10070, arg1).method685(this.field1477[arg1].field2583, (byte) -92, this.field1483, arg0, this, (double) arg3, arg2, arg5);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIZFII)[F")
    public final float[] method579(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field1480++;
        if (arg5 != 11554) {
            field1484 = false;
        }
        return this.method574(-10070, arg0).method690(this, this.field1477[arg0].field2583, arg4, this.field1483, arg5 - 20072, arg1);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lg;Lg;Lg;)V")
    public class119(class470 arg0, class470 arg1, class470 arg2) {
        this.field1479 = arg1;
        this.field1483 = arg2;
        class179 var4 = new class179(arg0.method2768(-20472, 0, 0));
        int var5 = var4.method916(21933);
        this.field1477 = new class189[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method895((byte) -106) == 1) {
                this.field1477[var6] = new class189();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1477[var7] != null) {
                this.field1477[var7].field2573 = var4.method895((byte) -102) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1477[var8] != null) {
                this.field1477[var8].field2582 = var4.method895((byte) -101) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1477[var9] != null) {
                this.field1477[var9].field2592 = var4.method895((byte) -103) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1477[var10] != null) {
                this.field1477[var10].field2581 = var4.method895((byte) -80) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1477[var11] != null) {
                this.field1477[var11].field2589 = var4.method922(32429);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1477[var12] != null) {
                this.field1477[var12].field2584 = var4.method922(32429);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1477[var13] != null) {
                this.field1477[var13].field2576 = var4.method922(32429);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1477[var14] != null) {
                this.field1477[var14].field2575 = var4.method922(32429);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1477[var15] != null) {
                this.field1477[var15].field2587 = (short) var4.method916(21933);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field1477[var16] != null) {
                this.field1477[var16].field2574 = var4.method922(32429);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field1477[var17] != null) {
                this.field1477[var17].field2586 = var4.method922(32429);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field1477[var18] != null) {
                this.field1477[var18].field2591 = var4.method895((byte) -95) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field1477[var19] != null) {
                this.field1477[var19].field2583 = var4.method895((byte) -122) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field1477[var20] != null) {
                this.field1477[var20].field2578 = var4.method922(32429);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field1477[var21] != null) {
                this.field1477[var21].field2590 = var4.method895((byte) -89) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field1477[var22] != null) {
                this.field1477[var22].field2572 = var4.method895((byte) -86) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field1477[var23] != null) {
                this.field1477[var23].field2577 = var4.method895((byte) -110) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIBII)I")
    public static final int method580(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1487++;
        if (class398.field5667 == null) {
            return 0;
        }
        if (arg5 < 3) {
            int var6 = arg2 >> 7;
            int var7 = arg1 >> 7;
            if (arg4 < 0 || arg0 < 0 || arg4 > (class159.field1895 - 1) || (class289.field4316 - 1) < arg0) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class159.field1895 - 1 < var6 || class289.field4316 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class140.field1686[1][arg2 >> 7][arg1 >> 7] & 0x2) != 0;
            if ((arg2 & 0x7F) == 0) {
                boolean var9 = (class140.field1686[1][var6 - 1][arg1 >> 7] & 0x2) != 0;
                boolean var10 = (class140.field1686[1][var6][arg1 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class140.field1686[1][arg4][arg0] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x7F) == 0) {
                boolean var11 = (class140.field1686[1][arg2 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class140.field1686[1][arg2 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class140.field1686[1][arg4][arg0] & 0x2) != 0;
                }
            }
            if (var8) {
                arg5++;
            }
        }
        int var13 = -5 % ((43 - arg3) / 33);
        return class398.field5667[arg5].method1857(arg2, arg1);
    }

    static {
        new class40("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
    }
}
