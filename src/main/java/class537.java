import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class537 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Lhv;")
    public static class546 field7304 = new class546(7, 2);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Lwt;")
    public static class330 field7308 = new class330();

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field7310 = "";

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Lhi;")
    public static class218 field7309 = new class218();

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "S")
    public static short field7311 = 32767;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "[Lcj;")
    public static class723[] field7312;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II[BI)[B", line = 8)
    public static final byte[] method3069(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 > -44) {
            return null;
        }
        field7306++;
        byte[] var4;
        if (arg1 > 0) {
            var4 = new byte[arg3];
            for (int var5 = 0; var5 < arg3; var5++) {
                var4[var5] = arg2[arg1 + var5];
            }
        } else {
            var4 = arg2;
        }
        class488 var6 = new class488();
        var6.method2835((byte) 121);
        var6.method2836(var4, (byte) 75, (long) (arg3 * 8));
        byte[] var7 = new byte[64];
        var6.method2832(-2091170296, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLaj;)V", line = 41)
    public static final void method3070(byte arg0, class333 arg1) {
        field7305++;
        if (arg0 != 86) {
            field7310 = null;
        }
        class302.field4359 = arg1;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Ljp;I)Lmba;", line = 54)
    public static final class444 method3071(class376 arg0, int arg1) {
        field7303++;
        if (arg1 != -1) {
            field7312 = null;
        }
        class651 var2 = class652.method3628(arg0, false);
        int var3 = arg0.method2384(127);
        int var4 = arg0.method2384(92);
        return new class444(var2.field9027, var2.field9024, var2.field9031, var2.field9028, var2.field9033, var2.field9025, var2.field9029, var2.field9034, var2.field9032, var3, var4);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)V", line = 77)
    public static void method3072(int arg0) {
        if (arg0 != 1210843136) {
            field7314 = 102;
        }
        field7310 = null;
        field7308 = null;
        field7312 = null;
        field7309 = null;
        field7304 = null;
    }
}
