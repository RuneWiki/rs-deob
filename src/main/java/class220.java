import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class220 extends class26 {

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Z")
    public static boolean field3985 = false;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Lg;")
    public static class276 field3983 = new class276(64);

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public static int field3994 = -1;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field3993 = -1;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "[S")
    public static short[] field3996 = new short[256];

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "Lcf;")
    public static class93 field3992 = class147.method1066(" )2> <col=00ffff>", -48);

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "Lcf;")
    private static class93 field3995 = class147.method1066("glow1:", -48);

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "Lcf;")
    public static class93 field3998 = field3995;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "Lcf;")
    public static class93 field3991 = class147.method1066("Versteckt", -48);

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "[I")
    public static int[] field3999 = new int[200];

    @OriginalMember(owner = "client!og", name = "db", descriptor = "Lcf;")
    public static class93 field3997 = field3995;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "B")
    public byte field3982;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public int field3988;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "Lee;")
    public class280 field3989;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZZ)V")
    public static final void method1533(boolean arg0, boolean arg1) {
        class135.field2370 = new int[104];
        class174.field3036 = 99;
        byte var2;
        if (!arg0) {
            var2 = 4;
        } else {
            var2 = 1;
        }
        ++field3990;
        client.field2738 = new int[104];
        class70.field1283 = new byte[var2][104][104];
        class249.field4490 = new byte[var2][104][104];
        class187.field3447 = new byte[var2][104][104];
        class164.field2887 = new byte[var2][104][104];
        class200.field3620 = new int[var2][105][105];
        class167.field2942 = new int[104];
        if (arg1) {
            class94.field1705 = new int[104];
            class125.field2223 = new int[104];
            class227.field4071 = new byte[var2][105][105];
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)V")
    public static final void method1534(int arg0, boolean arg1) {
        ++field3986;
        byte var2 = 4;
        byte[][] var3 = class204.field3675;
        if (arg0 != 14387) {
            field3991 = null;
        }
        for (int var4 = 0; var4 < var2; ++var4) {
            class226.method1559(false);
            for (int var5 = 0; ~var5 > -14; ++var5) {
                for (int var6 = 0; ~var6 > -14; ++var6) {
                    boolean var7 = false;
                    int var8 = class126.field2231[var4][var5][var6];
                    if (~var8 != 0) {
                        int var9 = 3 & var8 >> 24;
                        if (!arg1 || ~var9 == -1) {
                            int var10 = (var8 & 6) >> 1;
                            int var11 = (16379 & var8) >> 3;
                            int var12 = 1023 & var8 >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; ~var14 > ~class149.field2614.length; ++var14) {
                                if (class149.field2614[var14] == var13 && var3[var14] != null) {
                                    class140.method1022(var3[var14], var9, var10, var4, (7 & var12) * 8, var5 * 8, arg0 + 2269, arg1, var6 * 8, class148.field2605, (var11 & 7) * 8);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class82.method578(8, var6 * 8, var5 * 8, var4, arg0 ^ 23158, 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public static void method1535(boolean arg0) {
        field3992 = null;
        field3996 = null;
        if (arg0) {
            method1535(false);
        }
        field3999 = null;
        field3983 = null;
        field3991 = null;
        field3997 = null;
        field3995 = null;
        field3998 = null;
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(I)[B")
    public final byte[] method144(int arg0) {
        ++field3987;
        if (arg0 != -24385) {
            this.method144(96);
        }
        if (!super.field343 && this.field3989.field5027 >= this.field3989.field5011.length + -this.field3982) {
            return this.field3989.field5011;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)I")
    public final int method141(boolean arg0) {
        if (arg0) {
            return -46;
        } else {
            ++field3984;
            return this.field3989 == null ? 0 : this.field3989.field5027 * 100 / (this.field3989.field5011.length + -this.field3982);
        }
    }
}
