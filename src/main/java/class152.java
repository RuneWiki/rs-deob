import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class152 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field2917 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "[Z")
    public static boolean[] field2919 = new boolean[100];

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "[I")
    public static int[] field2918 = new int[2000];

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "Lai;")
    public static class10 field2920 = class44.method278("<br>(X100(U(Y", -46);

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "[Lta;")
    public static class173[] field2924;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1034(int arg0) {
        field2918 = null;
        field2920 = null;
        if (arg0 != 913) {
            method1035((byte) 30, null);
        }
        field2924 = null;
        field2919 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLme;)Lpf;")
    public static final class142 method1035(byte arg0, class114 arg1) {
        field2922++;
        int var2 = arg1.method767(true);
        int var3 = arg1.method767(true);
        if (arg0 != 103) {
            return null;
        }
        Class var4 = class38.method254(var3, arg0 ^ 0x40C0);
        try {
            class142 var5 = (class142) var4.getDeclaredConstructor().newInstance();
            if (var5 != null) {
                var5.field2670 = var2;
                var5.field2671 = arg1.method767(true);
                int var6 = arg1.method767(true);
                for (int var7 = 0; var7 < var6; var7++) {
                    int var8 = arg1.method767(true);
                    var5.method78(arg1, var8, (byte) -108);
                }
            }
            var5.method80(-1);
            return var5;
        } catch (IllegalAccessException var9) {
            throw new RuntimeException();
        } catch (InstantiationException var10) {
            throw new RuntimeException();
        }
    }
}
