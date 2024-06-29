import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class68 extends class264 {

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    private int field1244;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "I")
    public static int field1235 = -2;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "Lcf;")
    private static class93 field1240 = class147.method1066("Unable to find ", -48);

    @OriginalMember(owner = "client!af", name = "K", descriptor = "Lcf;")
    public static class93 field1236 = field1240;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "Lcf;")
    private static class93 field1237 = class147.method1066("flash1:", -48);

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field1239 = 0;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "Lcf;")
    public static class93 field1247 = field1237;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "Lcf;")
    public static class93 field1238 = field1237;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!af", name = "U", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!af", name = "W", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "Ldh;")
    public static class120 field1241;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "Ljl;")
    public static class245 field1243;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ls;I)I")
    public static final int method461(class237 arg0, int arg1) {
        ++field1245;
        int var2 = arg0.field4248;
        class50 var3 = arg0.method1483(arg1 ^ arg1);
        if (~arg0.field3797 != ~var3.field800) {
            if (arg0.field3797 != var3.field824 && arg0.field3797 != var3.field807 && ~arg0.field3797 != ~var3.field795 && arg0.field3797 != var3.field826) {
                if (arg0.field3797 == var3.field820 || arg0.field3797 == var3.field806 || arg0.field3797 == var3.field818 || arg0.field3797 == var3.field799) {
                    var2 = arg0.field4245;
                }
            } else {
                var2 = arg0.field4237;
            }
        } else {
            var2 = arg0.field4233;
        }
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I)V")
    private class68(int arg0) {
        super(0, true);
        this.field1244 = 4096;
        this.field1244 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field1246;
        if (arg1 >= -83) {
            this.method20(-42, -119, (class280) null);
        }
        int[] var3 = super.field4716.method532((byte) 112, arg0);
        if (super.field4716.field1424) {
            class107.method773(var3, 0, class176.field3060, this.field1244);
        }
        return var3;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 <= 11) {
            this.method22(10, (byte) 45);
        }
        ++field1248;
        if (~arg1 == -1) {
            this.field1244 = (arg2.method1907(16832) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(B)V")
    public static void method462(byte arg0) {
        field1241 = null;
        field1238 = null;
        field1243 = null;
        if (arg0 != -119) {
            field1241 = null;
        }
        field1237 = null;
        field1240 = null;
        field1236 = null;
        field1247 = null;
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(I)V")
    public static final void method463(int arg0) {
        ++field1242;
        class250.field4504.method1570((byte) 127);
        int var1 = class250.field4504.method1569(false, 1);
        if (arg0 != var1) {
            int var2 = class250.field4504.method1569(false, 2);
            if (~var2 == -1) {
                class264.field4708[class138.field2407++] = 2047;
            } else if (var2 == 1) {
                int var3 = class250.field4504.method1569(false, 3);
                class166.field2927.method1489(var3, 1, 13269);
                int var4 = class250.field4504.method1569(false, 1);
                if (~var4 == -2) {
                    class264.field4708[class138.field2407++] = 2047;
                }
            } else if (~var2 == -3) {
                if (~class250.field4504.method1569(false, 1) != -2) {
                    int var5 = class250.field4504.method1569(false, 3);
                    class166.field2927.method1489(var5, 0, arg0 ^ 13269);
                } else {
                    int var6 = class250.field4504.method1569(false, 3);
                    class166.field2927.method1489(var6, 2, 13269);
                    int var7 = class250.field4504.method1569(false, 3);
                    class166.field2927.method1489(var7, 2, 13269);
                }
                int var8 = class250.field4504.method1569(false, 1);
                if (~var8 == -2) {
                    class264.field4708[class138.field2407++] = 2047;
                }
            } else if (var2 == 3) {
                int var9 = class250.field4504.method1569(false, 7);
                int var10 = class250.field4504.method1569(false, 1);
                if (~var10 == -2) {
                    class264.field4708[class138.field2407++] = 2047;
                }
                int var11 = class250.field4504.method1569(false, 1);
                class138.field2405 = class250.field4504.method1569(false, 2);
                int var12 = class250.field4504.method1569(false, 7);
                class166.field2927.method1614((byte) -40, var12, ~var11 == -2, var9);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class68() {
        this(4096);
    }
}
