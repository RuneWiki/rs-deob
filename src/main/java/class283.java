import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class283 extends class265 {

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "Lwa;")
    public static class75 field4872 = class66.method560("welle2:", false);

    @OriginalMember(owner = "client!qh", name = "V", descriptor = "Lwa;")
    public static class75 field4880 = class66.method560("(R", false);

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field4873 = -1;

    @OriginalMember(owner = "client!qh", name = "cb", descriptor = "Lwa;")
    public static class75 field4887 = class66.method560("hint_mapedge", false);

    @OriginalMember(owner = "client!qh", name = "eb", descriptor = "I")
    public static int field4889 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qh", name = "bb", descriptor = "Z")
    public static boolean field4886 = false;

    @OriginalMember(owner = "client!qh", name = "fb", descriptor = "Z")
    public static boolean field4890 = false;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public int field4871;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!qh", name = "S", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!qh", name = "U", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!qh", name = "W", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!qh", name = "X", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!qh", name = "Y", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!qh", name = "ab", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "Lva;")
    public static class137 field4876;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "Lci;")
    public class188 field4877;

    @OriginalMember(owner = "client!qh", name = "Z", descriptor = "Lcb;")
    public static class267 field4884;

    @OriginalMember(owner = "client!qh", name = "db", descriptor = "[B")
    public byte[] field4888;

    @OriginalMember(owner = "client!qh", name = "gb", descriptor = "[Lqj;")
    public static class238[] field4891;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "[[[B")
    public static byte[][][] field4875;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IILja;)Lwa;", line = 21)
    public static final class75 method2002(int arg0, int arg1, class60 arg2) {
        field4882++;
        try {
            class75 var3 = new class75();
            var3.field1280 = arg2.method504(-33);
            if (var3.field1280 > arg0) {
                var3.field1280 = arg0;
            }
            var3.field1296 = new byte[var3.field1280];
            arg2.field1012 += class87.field1437.method1393(arg1 ^ 0x0, var3.field1296, arg1, arg2.field1012, arg2.field997, var3.field1280);
            return var3;
        } catch (Exception var5) {
            return class28.field370;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V", line = 45)
    public static void method2003(byte arg0) {
        field4876 = null;
        if (arg0 != 96) {
            return;
        }
        field4884 = null;
        field4887 = null;
        field4875 = (byte[][][]) null;
        field4891 = null;
        field4880 = null;
        field4872 = null;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IIIIIII)V", line = 63)
    public static final void method2004(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != -28) {
            field4884 = (class267) null;
        }
        field4883++;
        int var7 = 0;
        class51[] var8 = class219.field3747;
        while (var7 < var8.length) {
            class51 var9 = var8[var7];
            if (var9 != null && var9.field839 == 2) {
                class161.method1206(var9.field838 * 2, arg3, (var9.field835 - class275.field4737 << 7) + var9.field848, 50, arg1 >> 1, (var9.field831 - class175.field2939 << 7) + var9.field855, arg5, arg6 >> 1);
                if (class16.field208 > -1 && (class143.field2463 % 20) < 10) {
                    class63.field1101[var9.field846].method157(class16.field208 + arg2 - 12, field4873 + arg4 + -28);
                }
            }
            var7++;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)I", line = 95)
    public static final int method2005(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4874++;
        if (arg0 == 16) {
            int var5 = 65536 - class21.field286[arg2 * 1024 / arg3] >> 1;
            return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
        } else {
            return -3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIB)V", line = 118)
    public static final void method2006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        int var8 = -36 / ((14 - arg7) / 58);
        field4878++;
        if (class51.method375(arg1, -113)) {
            client.method1728(class249.field4198[arg1], -1, arg0, arg2, arg3, arg5, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)[B", line = 130)
    public final byte[] method1751(boolean arg0) {
        field4885++;
        if (this.field4575) {
            throw new RuntimeException();
        }
        if (!arg0) {
            field4884 = (class267) null;
        }
        return this.field4888;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)I", line = 163)
    public final int method1756(int arg0) {
        field4879++;
        if (this.field4575) {
            return 0;
        } else {
            int var2 = -51 / ((75 - arg0) / 38);
            return 100;
        }
    }
}
