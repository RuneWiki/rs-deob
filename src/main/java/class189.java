import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class189 {

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lsb;")
    public static class98 field3263 = class47.method368("VOLL", 0);

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field3272 = -1;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lsb;")
    private static class98 field3270 = class47.method368("Continue", 0);

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lsb;")
    public static class98 field3274 = field3270;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Lsb;")
    public static class98 field3280 = class47.method368("gr-Un:", 0);

    @OriginalMember(owner = "client!j", name = "c", descriptor = "[[B")
    public static byte[][] field3261 = new byte[50][];

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public int field3262;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public int field3265;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public int field3266;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field3276;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Lt;")
    public static class239 field3278;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Ltg;")
    public static class75 field3268;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lnj;")
    public static class82 field3271;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lsb;")
    public class98 field3273;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "Z")
    public boolean field3269;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static final void method1301(byte arg0) {
        field3275++;
        class23.field464.method1565(-1);
        if (arg0 == 9) {
            class255.field4528.method1565(-1);
            class255.field4509.method1565(arg0 - 10);
            class116.field2074.method1565(arg0 - 10);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ILsb;BLsb;)V")
    public static final void method1302(int arg0, class98 arg1, byte arg2, class98 arg3) {
        class233.field4010 = arg3;
        field3259++;
        class205.field3511 = arg0;
        class233.field4017 = arg1;
        class80.field1412 = 0;
        class101.field1789 = false;
        if (class233.field4017.method748(true, class233.field4011) || class233.field4010.method748(true, class233.field4011)) {
            class81.field1427 = 0;
            class176.field3068 = 3;
            return;
        }
        class81.field1427 = 1;
        class237.field4094 = 0;
        class176.field3068 = -3;
        class62.field1043 = 0;
        if (arg2 != 9) {
            method1301((byte) 112);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1303(int arg0) {
        field3271 = null;
        field3274 = null;
        field3263 = null;
        field3268 = null;
        field3280 = null;
        field3270 = null;
        if (arg0 != 50) {
            method1303(-83);
        }
        field3278 = null;
        field3261 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/lang/String;I)Lsb;")
    public static final class98 method1304(String arg0, int arg1) {
        field3260++;
        byte[] var2;
        try {
            var2 = arg0.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg0.getBytes();
        }
        if (arg1 != -1) {
            return null;
        }
        class98 var3 = new class98();
        var3.field1733 = var2;
        var3.field1694 = 0;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1694++] = var2[var4];
            }
        }
        return var3;
    }
}
