import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class136 extends class583 {

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[B")
    public byte[] field1981;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public static int field1978 = 0;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "[I")
    public static int[] field1976 = new int[2048];

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Ljba;")
    public static class398 field1975;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZB)V")
    public static final void method966(boolean arg0, byte arg1) {
        field1979++;
        int var2 = 77 % ((53 - arg1) / 36);
        int var3 = class319.field4414;
        int var4 = class258.field3729;
        if (arg0 && class180.field2409) {
            var3 <<= 0x1;
            var4 = -var3;
        }
        class268.field3831.method455(var4, var3);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BII)I")
    public static final int method967(byte arg0, int arg1, int arg2) {
        if (arg0 > -48) {
            method968((byte) 33);
        }
        field1980++;
        int var3 = 1;
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg1 >>= 0x1;
        }
        if (arg1 == 1) {
            return arg2 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
    public static void method968(byte arg0) {
        if (arg0 < 105) {
            field1975 = null;
        }
        field1976 = null;
        field1975 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII)Z")
    public static final boolean method969(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method971(-111, null, null, null);
        }
        field1983++;
        return class711.method4004(arg2, arg1, (byte) -96) | (arg2 & 0x70000) != 0 || class757.method4207((byte) 106, arg1, arg2);
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "([B)V")
    public class136(byte[] arg0) {
        this.field1981 = arg0;
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)V")
    public static final void method970(byte arg0) {
        class514.method3026(0);
        field1984++;
        if (arg0 != 8) {
            method970((byte) 88);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[ILfp;Lfp;)V")
    public static final void method971(int arg0, int[] arg1, class323 arg2, class323 arg3) {
        if (arg0 != 458752) {
            return;
        }
        class735.field10238 = arg2;
        field1977++;
        class288.field4076 = arg3;
        if (arg1 != null) {
            class24.field340 = arg1;
        }
    }
}
