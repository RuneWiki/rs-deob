import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class107 extends class212 {

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "[F")
    public static float[] field1873 = new float[16384];

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "[F")
    public static float[] field1875 = new float[16384];

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "Lmu;")
    public static class303 field1882;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!kba", name = "x", descriptor = "Lmj;")
    public static class655 field1880;

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "Lin;")
    public static class91 field1877;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1881;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        if (arg0) {
            this.method965(-57);
        }
        ++field1879;
        if (super.field3004.method2058(674) != class456.field6431) {
            super.field3006 = 1;
        } else if (super.field3004.method2061(-95)) {
            super.field3006 = 0;
        }
        if (~super.field3006 != -1 && ~super.field3006 != -2) {
            super.field3006 = this.method422(20014);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        int var3 = 107 / ((arg0 - 82) / 35);
        ++field1878;
        super.field3006 = arg1;
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)Z")
    public final boolean method965(int arg0) {
        ++field1872;
        if (super.field3004.method2061(-80)) {
            return false;
        } else {
            if (arg0 < 85) {
                this.method418(true);
            }
            return super.field3004.method2058(674) == class456.field6431;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Ldh;)V")
    public class107(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        if (arg0 != 20014) {
            field1882 = null;
        }
        ++field1876;
        return 1;
    }

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)I")
    public final int method966(int arg0) {
        if (arg0 != -32350) {
            this.method418(true);
        }
        ++field1874;
        return super.field3006;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            field1881 = null;
        }
        ++field1871;
        if (super.field3004.method2061(-63)) {
            return 3;
        } else {
            return super.field3004.method2058(674) == class456.field6431 ? 1 : 3;
        }
    }

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "(I)V")
    public static void method967(int arg0) {
        field1877 = null;
        field1873 = null;
        field1881 = null;
        if (arg0 != 21921) {
            method967(11);
        }
        field1875 = null;
        field1880 = null;
        field1882 = null;
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(ILdh;)V")
    public class107(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field1873[var2] = (float) Math.sin((double) var2 * var0);
            field1875[var2] = (float) Math.cos((double) var2 * var0);
        }
        field1882 = new class303(34, 12);
    }
}
