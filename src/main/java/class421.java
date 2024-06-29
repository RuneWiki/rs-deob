import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class421 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public int field5932 = 128;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "I")
    public int field5939 = 128;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field5936;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public int field5930;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public int field5937;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field5934;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field5931 = 0;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "[S")
    public static short[] field5942;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "[Z")
    public static boolean[] field5943;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method2496(byte arg0) {
        field5942 = null;
        field5943 = null;
        if (arg0 != 9) {
            field5931 = 42;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILwm;)Lbu;")
    public static final class17 method2497(int arg0, class403 arg1) {
        arg1.method2357((byte) 116);
        field5940++;
        int var2 = arg1.method2357((byte) 104);
        if (arg0 != -27935) {
            field5943 = null;
        }
        class17 var3 = class332.method1988(true, var2);
        var3.field202 = arg1.method2357((byte) 125);
        int var4 = arg1.method2357((byte) 115);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method2357((byte) 119);
            var3.method34(arg1, var6, 5159);
        }
        var3.method31(arg0 ^ 0x6D16);
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)Lid;")
    public final class421 method2498(int arg0) {
        int var2 = -88 % ((-arg0 - 20) / 49);
        field5938++;
        return new class421(this.field5936, this.field5932, this.field5939, this.field5930, this.field5937, this.field5934);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLid;)V")
    public final void method2499(byte arg0, class421 arg1) {
        this.field5939 = arg1.field5939;
        field5941++;
        this.field5936 = arg1.field5936;
        this.field5937 = arg1.field5937;
        this.field5930 = arg1.field5930;
        this.field5932 = arg1.field5932;
        if (arg0 <= 7) {
            method2497(-128, null);
        }
        this.field5934 = arg1.field5934;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static final void method2500(int arg0) {
        field5933++;
        try {
            if (class15.field189 == 1) {
                int var1 = class22.field267.method584(120);
                if (var1 > 0 && class22.field267.method568((byte) 32)) {
                    int var2 = var1 - class463.field6473;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class22.field267.method563(21431, var2);
                    return;
                }
                class22.field267.method550((byte) -4);
                class22.field267.method573(-97);
                class494.field6992 = null;
                class486.field6783 = null;
                if (class234.field3410 == null) {
                    class15.field189 = 0;
                } else {
                    class15.field189 = 2;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class22.field267.method550((byte) -4);
            class234.field3410 = null;
            class15.field189 = 0;
            class494.field6992 = null;
            class486.field6783 = null;
        }
        if (arg0 < 113) {
            field5943 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(I)V")
    public class421(int arg0) {
        this.field5936 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIII)V")
    private class421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5930 = arg3;
        this.field5937 = arg4;
        this.field5934 = arg5;
        this.field5939 = arg2;
        this.field5936 = arg0;
        this.field5932 = arg1;
    }

    static {
        new class530("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
