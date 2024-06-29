import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vca")
public class class282 extends class212 {

    @OriginalMember(owner = "client!vca", name = "o", descriptor = "I")
    public static int field3944 = 0;

    @OriginalMember(owner = "client!vca", name = "u", descriptor = "[[I")
    public static int[][] field3950 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!vca", name = "w", descriptor = "Lmu;")
    public static class303 field3952 = new class303(26, 11);

    @OriginalMember(owner = "client!vca", name = "p", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!vca", name = "q", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!vca", name = "r", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!vca", name = "s", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!vca", name = "t", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!vca", name = "v", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            return -9;
        } else {
            ++field3951;
            return 0;
        }
    }

    @OriginalMember(owner = "client!vca", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        ++field3947;
        if (!class362.method2313(7351, super.field3004.field4468.method1099(-32350))) {
            return 3;
        } else {
            if (arg0 != 3) {
                method1856((byte) 64);
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(ILdh;)V")
    public class282(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)Z")
    public final boolean method1855(int arg0) {
        if (arg0 < 85) {
            this.method417(-53, -119);
        }
        ++field3945;
        return class362.method2313(7351, super.field3004.field4468.method1099(-32350));
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
    public static void method1856(byte arg0) {
        field3950 = null;
        if (arg0 != -121) {
            field3950 = null;
        }
        field3952 = null;
    }

    @OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Ldh;)V")
    public class282(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vca", name = "e", descriptor = "(I)I")
    public final int method1857(int arg0) {
        ++field3949;
        if (arg0 != -32350) {
            field3944 = -97;
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = 38 / ((82 - arg0) / 35);
        ++field3948;
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        ++field3946;
        if (arg0) {
            this.method417(-51, -128);
        }
        if (super.field3004.field4468.method1100((byte) -123) && !class362.method2313(7351, super.field3004.field4468.method1099(-32350))) {
            super.field3006 = 0;
        }
        if (super.field3006 < 0 || ~super.field3006 < -3) {
            super.field3006 = this.method422(20014);
        }
    }
}
