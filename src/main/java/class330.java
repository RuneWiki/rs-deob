import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class330 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    private int field4483;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    private int field4492;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[[I")
    private int[][] field4489;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field4488 = 2;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "Lkc;")
    public static class157 field4487 = new class157("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I")
    public final int method1946(int arg0, int arg1) {
        if (this.field4489 != null) {
            arg0 = ((int) ((long) this.field4483 * (long) arg0 / (long) this.field4492)) + 6;
        }
        if (arg1 != 1011) {
            field4488 = 21;
        }
        field4484++;
        return arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)Z")
    public static final boolean method1947(int arg0, int arg1, int arg2) {
        if (arg2 != 1408) {
            field4487 = null;
        }
        field4490++;
        return (arg0 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)I")
    public static final int method1948(int arg0, int arg1) {
        field4486++;
        if (arg0 != -28009) {
            method1950(24);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([BB)[B")
    public final byte[] method1949(byte[] arg0, byte arg1) {
        field4485++;
        if (this.field4489 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field4483 / (long) this.field4492) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field4489[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4483 + var6;
                int var14 = var13 / this.field4492;
                var6 = var13 - this.field4492 * var14;
                var5 += var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        if (arg1 != 110) {
            field4488 = 39;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static void method1950(int arg0) {
        field4487 = null;
        if (arg0 >= -32) {
            method1950(-30);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
    public final int method1951(byte arg0, int arg1) {
        field4491++;
        if (this.field4489 != null) {
            arg1 = (int) ((long) this.field4483 * (long) arg1 / (long) this.field4492);
        }
        if (arg0 != 46) {
            this.field4483 = 121;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(II)V")
    public class330(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class360.method2152(arg1, arg0, 8946);
            int var4 = arg0 / var3;
            int var5 = arg1 / var3;
            this.field4483 = var5;
            this.field4492 = var4;
            this.field4489 = new int[var4][14];
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field4489[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    static {
        new class157("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
