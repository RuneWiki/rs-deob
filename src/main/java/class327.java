import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class327 implements class243 {

    @OriginalMember(owner = "client!le", name = "n", descriptor = "Lfs;")
    private class288 field5119 = new class288(256);

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lok;")
    private class74 field5116;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lok;")
    private class74 field5115;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "[Lqg;")
    private class161[] field5108;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
    public static int[] field5114 = new int[1024];

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field5106;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZIFII)[I")
    public final int[] method1484(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        field5107++;
        if (arg0 < 83) {
            this.field5115 = null;
        }
        return this.method2034(arg4, false).method11((double) arg3, arg2, arg1, this, this.field5115, arg5, 1, this.field5108[arg4].field2424);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public static void method2032(byte arg0) {
        field5114 = null;
        if (arg0 != -72) {
            method2033(-96);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZFIIII)[I")
    public final int[] method1481(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5) {
        field5120++;
        if (arg2 != 28907) {
            field5114 = null;
        }
        return this.method2034(arg3, false).method9(this, -115, this.field5115, arg4, (double) arg1, arg5, this.field5108[arg3].field2424);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Lqg;")
    public final class161 method1480(int arg0, int arg1) {
        if (arg1 == 14270) {
            field5112++;
            return this.field5108[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BI)Z")
    public final boolean method1482(byte arg0, int arg1) {
        if (arg0 <= 112) {
            return true;
        } else {
            field5111++;
            class3 var3 = this.method2034(arg1, false);
            return var3 != null && var3.method10(this.field5115, (byte) 103, this);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
    public static final void method2033(int arg0) {
        field5106++;
        if (class17.field275 != null) {
            if (class17.field275.field7848 == 1) {
                class17.field275 = null;
                return;
            }
            if (class17.field275.field7848 == 2) {
                class473.method2815(2, arg0 - 1, class535.field7866, class222.field3159);
                class17.field275 = null;
                return;
            }
        }
        if (arg0 != -2) {
            field5118 = 94;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IZ)Lar;")
    private final class3 method2034(int arg0, boolean arg1) {
        field5110++;
        class405 var3 = this.field5119.method1781((long) arg0, 24);
        if (var3 != null) {
            return (class3) var3;
        }
        if (arg1) {
            this.method2034(-25, true);
        }
        byte[] var4 = this.field5116.method526(arg0, 1);
        if (var4 == null) {
            return null;
        } else {
            class3 var5 = new class3(new class468(var4));
            this.field5119.method1780(var5, -20892, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIFIZI)[F")
    public final float[] method1483(int arg0, int arg1, float arg2, int arg3, boolean arg4, int arg5) {
        field5117++;
        if (arg5 != -373) {
            field5114 = null;
        }
        return this.method2034(arg0, false).method13(arg3, this, this.field5115, this.field5108[arg0].field2424, arg1, false);
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lok;Lok;Lok;)V")
    public class327(class74 arg0, class74 arg1, class74 arg2) {
        this.field5116 = arg1;
        this.field5115 = arg2;
        class468 var4 = new class468(arg0.method541(0, 0, (byte) -122));
        int var5 = var4.method2727((byte) 43);
        this.field5108 = new class161[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2765(92) == 1) {
                this.field5108[var6] = new class161();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field5108[var7] != null) {
                this.field5108[var7].field2405 = var4.method2765(115) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field5108[var8] != null) {
                this.field5108[var8].field2407 = var4.method2765(95) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5108[var9] != null) {
                this.field5108[var9].field2421 = var4.method2765(66) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field5108[var10] != null) {
                this.field5108[var10].field2422 = var4.method2765(113) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field5108[var11] != null) {
                this.field5108[var11].field2404 = var4.method2714((byte) -42);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field5108[var12] != null) {
                this.field5108[var12].field2419 = var4.method2714((byte) -45);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field5108[var13] != null) {
                this.field5108[var13].field2412 = var4.method2714((byte) -78);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field5108[var14] != null) {
                this.field5108[var14].field2417 = var4.method2714((byte) -103);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field5108[var15] != null) {
                this.field5108[var15].field2409 = (short) var4.method2727((byte) 43);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field5108[var16] != null) {
                this.field5108[var16].field2410 = var4.method2714((byte) -75);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field5108[var17] != null) {
                this.field5108[var17].field2403 = var4.method2714((byte) -107);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field5108[var18] != null) {
                this.field5108[var18].field2420 = var4.method2765(58) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field5108[var19] != null) {
                this.field5108[var19].field2424 = var4.method2765(62) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field5108[var20] != null) {
                this.field5108[var20].field2418 = var4.method2714((byte) -97);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field5108[var21] != null) {
                this.field5108[var21].field2415 = var4.method2765(68) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field5108[var22] != null) {
                this.field5108[var22].field2402 = var4.method2765(126) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field5108[var23] != null) {
                this.field5108[var23].field2416 = var4.method2765(106) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field5108[var24] != null) {
                this.field5108[var24].field2425 = var4.method2765(125);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field5108[var25] != null) {
                this.field5108[var25].field2411 = var4.method2722(false);
            }
        }
    }

    static {
        new class347("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }
}
