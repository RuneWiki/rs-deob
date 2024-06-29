import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class284 extends class95 {

    @OriginalMember(owner = "client!ee", name = "I", descriptor = "[Log;")
    public class208[] field4968;

    @OriginalMember(owner = "client!ee", name = "K", descriptor = "Lsf;")
    public static class108 field4970 = class140.method973(255, ":assistreq:");

    @OriginalMember(owner = "client!ee", name = "N", descriptor = "Lsf;")
    public static class108 field4973 = class140.method973(255, "Veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!ee", name = "M", descriptor = "Lsf;")
    public static class108 field4972 = class140.method973(255, "ondulation2:");

    @OriginalMember(owner = "client!ee", name = "P", descriptor = "Lsf;")
    public static class108 field4975 = class140.method973(255, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ee", name = "Q", descriptor = "Lsf;")
    public static class108 field4976 = class140.method973(255, "headicons_pk");

    @OriginalMember(owner = "client!ee", name = "H", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ee", name = "J", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ee", name = "L", descriptor = "[Lvd;")
    public static class135[] field4971;

    @OriginalMember(owner = "client!ee", name = "O", descriptor = "[Lwm;")
    public static class154[] field4974;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)Z", line = 4)
    public final boolean method2039(int arg0, byte arg1) {
        field4969++;
        int var3 = -23 % ((arg1 - 44) / 44);
        return this.field4968[arg0].field3719;
    }

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "(B)V", line = 53)
    public static void method2040(byte arg0) {
        field4975 = null;
        field4972 = null;
        field4976 = null;
        field4970 = null;
        field4971 = null;
        field4974 = null;
        if (arg0 != -99) {
            field4971 = (class135[]) null;
        }
        field4973 = null;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(Lik;Lik;IZ)V", line = 67)
    public class284(class262 arg0, class262 arg1, int arg2, boolean arg3) {
        class1 var5 = new class1();
        int var6 = arg0.method1876(arg2, (byte) -119);
        this.field4968 = new class208[var6];
        int[] var7 = arg0.method1889((byte) -24, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1868(12236, arg2, var7[var8]);
            class172 var10 = null;
            int var11 = var9[1] & 0xFF | var9[0] & 0xFF << 8;
            for (class172 var12 = (class172) var5.method13(0); var12 != null; var12 = (class172) var5.method15((byte) 47)) {
                if (var12.field3149 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1888(0, var11, -124);
                } else {
                    var13 = arg1.method1888(var11, 0, 118);
                }
                var10 = new class172(var11, var13);
                var5.method5(var10, (byte) 93);
            }
            this.field4968[var7[var8]] = new class208(var9, var10);
        }
    }
}
