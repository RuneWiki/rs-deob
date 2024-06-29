import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class212 {

    @OriginalMember(owner = "client!us", name = "h", descriptor = "Lap;")
    public static class310 field3090;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public int field3086;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public int field3087;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "Lrl;")
    public class439 field3084;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static final void method1439(int arg0) {
        field3085++;
        if (class439.field6229 != null) {
            return;
        }
        class439.field6229 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFDB8) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3E1) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if ((var4 * 3.0D < 2.0D)) {
                    var12 = (0.6666666666666666D - var4) * (var16 - var18) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class439.field6229[var3] = var35;
        }
        if (arg0 != -16086) {
            method1443((byte) 110);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Ljava/lang/String;IZ)V")
    public static final void method1440(String arg0, int arg1, boolean arg2) {
        field3089++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[arg1];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = (arg2 ? class119.field1649 : class12.field90) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class384 var11 = class172.method1244(32767, var8);
            if (var11.field5271 && var11.method2340((byte) -104).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class428.field5968 = null;
                    class487.field6894 = -1;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class487.field6894 = var5;
        class428.field5968 = var4;
        class103.field1458 = 0;
        String[] var9 = new String[class487.field6894];
        for (int var10 = 0; var10 < class487.field6894; var10++) {
            var9[var10] = class172.method1244(32767, var4[var10]).method2340((byte) -112);
        }
        class430.method2572((byte) -22, var9, class428.field5968);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILkk;)V")
    public final void method1441(int arg0, class161 arg1) {
        field3092++;
        int var3 = 48 % ((-arg0 - 39) / 59);
        while (true) {
            int var4 = arg1.method1172((byte) 115);
            if (var4 == 0) {
                return;
            }
            this.method1444(arg1, 16, var4);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "()V")
    public static final void method1442() {
        class199.method1389(1, class310.field4398);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
    public static void method1443(byte arg0) {
        if (arg0 != 6) {
            method1442();
        }
        field3090 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lkk;II)V")
    private final void method1444(class161 arg0, int arg1, int arg2) {
        if (arg1 != 16) {
            this.field3087 = -68;
        }
        if (arg2 == 1) {
            this.field3083 = arg0.method1134(-16848);
        } else if (arg2 == 2) {
            this.field3086 = arg0.method1172((byte) -112);
            this.field3087 = arg0.method1172((byte) 82);
        }
        field3088++;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Lgm;")
    public final synchronized class355 method1445(int arg0) {
        field3091++;
        class355 var2 = (class355) this.field3084.field6228.method2113(arg0, (long) this.field3083);
        if (var2 != null) {
            return var2;
        }
        class355 var3 = class355.method2187(this.field3084.field6227, this.field3083, 0);
        if (var3 != null) {
            this.field3084.field6228.method2116((long) this.field3083, (byte) -79, var3);
        }
        return var3;
    }

    static {
        new class151("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field3090 = new class310(16, 8);
    }
}
