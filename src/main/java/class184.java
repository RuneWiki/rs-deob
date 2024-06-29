import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class184 extends class74 {

    @OriginalMember(owner = "client!kw", name = "D", descriptor = "Z")
    private boolean field2347 = false;

    @OriginalMember(owner = "client!kw", name = "B", descriptor = "Z")
    public static boolean field2345 = false;

    @OriginalMember(owner = "client!kw", name = "C", descriptor = "[I")
    public static int[] field2346 = new int[1];

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!kw", name = "u", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!kw", name = "v", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!kw", name = "w", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!kw", name = "x", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!kw", name = "y", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!kw", name = "A", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Z", line = 3)
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            field2345 = false;
        }
        ++field2344;
        return true;
    }

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "(I)V", line = 17)
    public final void method343(int arg0) {
        ++field2341;
        if (!this.field2347) {
            super.field1011.method2561(0, class5.field119, -18836);
        } else {
            super.field1011.method2589(arg0 + 19092, 1);
            super.field1011.method1677(class102.field1383, -6);
            super.field1011.method2550(class112.field1466, true, class112.field1466);
            super.field1011.method2602(2, 1, class700.field9903);
            super.field1011.method2561(0, class5.field119, -18836);
            super.field1011.method2554((byte) -70);
            super.field1011.method2596((class466) null, arg0 + 19092);
            super.field1011.method2589(arg0 ^ -19092, 0);
            this.field2347 = false;
        }
        if (arg0 != -19092) {
            this.method346(61);
        }
        super.field1011.method2550(class112.field1466, true, class112.field1466);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IZ)V", line = 43)
    public final void method347(int arg0, boolean arg1) {
        ++field2342;
        int var3 = -9 % ((52 - arg0) / 36);
        class660 var4 = super.field1011.method2581(2);
        if (var4 != null && arg1) {
            super.field1011.method2589(0, 1);
            super.field1011.method2596(var4, 0);
            super.field1011.method1677(class186.field2359, -43);
            super.field1011.method2589(0, 1);
            super.field1011.method2550(class542.field7243, true, class538.field7226);
            super.field1011.method1676(false, class141.field1830, 2, true, (byte) -54);
            super.field1011.method2561(0, class563.field7825, -18836);
            class691 var5 = super.field1011.method2562(96);
            var5.method3883(0, super.field1011.method2600(-9813));
            super.field1011.method2524(119, class8.field160);
            super.field1011.method2589(0, 0);
            this.field2347 = true;
        } else {
            super.field1011.method2561(0, class563.field7825, -18836);
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ZZ)V", line = 73)
    public final void method339(boolean arg0, boolean arg1) {
        ++field2343;
        super.field1011.method2550(class112.field1466, arg0, class538.field7226);
    }

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "(I)V", line = 82)
    public static void method1143(int arg0) {
        if (arg0 != 6) {
            field2346 = null;
        }
        field2346 = null;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIB)V", line = 93)
    public final void method340(int arg0, int arg1, byte arg2) {
        if (arg2 != 65) {
            field2339 = -118;
        }
        ++field2337;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IILhfa;)V", line = 104)
    public final void method341(int arg0, int arg1, class466 arg2) {
        super.field1011.method2596(arg2, 0);
        if (arg1 < 47) {
            this.method340(-40, 113, (byte) 6);
        }
        ++field2340;
        super.field1011.method2595(arg0, 0);
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V", line = 118)
    public static final void method1144(int arg0, int arg1) {
        class30.method202((byte) 127);
        ++field2338;
        int var2 = class659.field9342.method125(arg1, true).field2989;
        if (arg0 != var2) {
            int var3 = class684.field9606.field2467[arg1];
            if (var2 == 5) {
                class700.field9906 = var3;
            }
            if (var2 == 6) {
                class502.field6623 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Len;)V", line = 141)
    public class184(class478 arg0) {
        super(arg0);
    }
}
