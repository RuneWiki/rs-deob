import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class10 extends class325 {

    @OriginalMember(owner = "client!l", name = "N", descriptor = "[Lqa;")
    public class104[] field146;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "I")
    public static int field142 = 0;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Z")
    public static boolean field139 = true;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Ljd;")
    public static class95 field143;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)Z", line = 7)
    public final boolean method90(int arg0, int arg1) {
        if (arg1 < 96) {
            field144 = -117;
        }
        field141++;
        return this.field146[arg0].field1522;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V", line = 21)
    public static void method91(int arg0) {
        field143 = null;
        if (arg0 >= -81) {
            method92(55);
        }
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)Z", line = 39)
    public static final boolean method92(int arg0) {
        if (arg0 != 31880) {
            return true;
        }
        field145++;
        if (class99.field1427) {
            try {
                class199.method1445(-128, "showVideoAd", class330.field5074.field95);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Z", line = 61)
    public final boolean method93(int arg0, byte arg1) {
        int var3 = -109 % ((-arg1 - 45) / 61);
        field138++;
        return this.field146[arg0].field1523;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljd;Ljd;IZ)V", line = 76)
    public class10(class95 arg0, class95 arg1, int arg2, boolean arg3) {
        class281 var5 = new class281();
        int var6 = arg0.method685((byte) 15, arg2);
        this.field146 = new class104[var6];
        int[] var7 = arg0.method688(arg2, 23201);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method696(var7[var8], (byte) 99, arg2);
            class234 var10 = null;
            int var11 = var9[0] & 0xFF << 8 | var9[1] & 0xFF;
            for (class234 var12 = (class234) var5.method1954(-66); var12 != null; var12 = (class234) var5.method1950((byte) 87)) {
                if (var12.field3568 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method691(0, (byte) 66, var11);
                } else {
                    var13 = arg1.method691(var11, (byte) 80, 0);
                }
                var10 = new class234(var11, var13);
                var5.method1952(var10, 124);
            }
            this.field146[var7[var8]] = new class104(var9, var10);
        }
    }
}
