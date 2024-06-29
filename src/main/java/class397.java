import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class397 extends class339 {

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Lbv;")
    private class282 field6025;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    private int field6023;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    private int field6029;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    private int field6040;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    private int field6028;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    private int field6034;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    private int field6037;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Lcm;")
    public static class449 field6024 = new class449(69, 0);

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field6036 = 205;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field6032 = 0;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field6033 = new String[200];

    @OriginalMember(owner = "client!op", name = "E", descriptor = "[I")
    public static int[] field6039 = new int[8];

    @OriginalMember(owner = "client!op", name = "G", descriptor = "F")
    public static float field6041;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Llr;")
    private class237 field6026;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "[Z")
    public static boolean[] field6038;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)I")
    public static final int method2439(int arg0, int arg1, int arg2) {
        field6027++;
        int var3 = 0;
        while (arg2 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg2--;
        }
        int var4 = -15 % ((arg0 - 56) / 52);
        return var3;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)Llr;")
    public final class237 method445(byte arg0) {
        field6035++;
        if (this.field6026 == null) {
            class319.field4893[5] = this.field6034;
            class373 var2 = this.field6025.field7256;
            class319.field4893[1] = this.field6040;
            class319.field4893[0] = this.field6023;
            class319.field4893[4] = this.field6029;
            class319.field4893[2] = this.field6028;
            class319.field4893[3] = this.field6037;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1556(true, class319.field4893[var5])) {
                    return null;
                }
                class263 var7 = var2.method1558(class319.field4893[var5], (byte) 106);
                int var8 = var7.field3654 ? 64 : 128;
                if (var7.field3673 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class142.field2061[var6] = var2.method1552(1.0F, class319.field4893[var6], true, var4, false, var4);
            }
            this.field6026 = new class237(this.field6025, 6407, var4, var3 != 0, class142.field2061);
        }
        if (arg0 <= 68) {
            field6036 = -56;
        }
        return this.field6026;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public static final void method2440(int arg0) {
        if (class337.field5242.method1040()) {
            class337.field5242.method1049(class245.field3430);
            class76.method501((byte) 122);
            class337.field5242.method1090(class245.field3430);
            class337.field5242.method1082(class245.field3430);
        } else {
            class310.method1995(true, class441.field6563);
        }
        if (arg0 == 0) {
            field6030++;
            class268.method1710(true);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lbv;IIIIII)V")
    public class397(class282 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6025 = arg0;
        this.field6023 = arg1;
        this.field6029 = arg5;
        this.field6040 = arg2;
        this.field6028 = arg3;
        this.field6034 = arg6;
        this.field6037 = arg4;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
    public static void method2441(int arg0) {
        field6039 = null;
        field6038 = null;
        if (arg0 >= -52) {
            method2441(-118);
        }
        field6033 = null;
        field6024 = null;
    }
}
