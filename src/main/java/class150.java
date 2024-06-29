import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class150 extends class409 {

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "Lrv;")
    public static class121 field1870 = new class121(8);

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!fn", name = "y", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!fn", name = "z", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!fn", name = "A", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "Ltf;")
    private class312 field1868;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "Ltf;")
    private class312 field1871;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "Ltf;")
    public class312 field1872;

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "Ltf;")
    private class312 field1874;

    @OriginalMember(owner = "client!fn", name = "x", descriptor = "Ltf;")
    private class312 field1877;

    @OriginalMember(owner = "client!fn", name = "B", descriptor = "Ltf;")
    private class312 field1881;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZII)V")
    public final void method680(int arg0, boolean arg1, int arg2, int arg3) {
        ++field1879;
        int var5 = arg0 + this.field1874.method1634();
        int var6 = super.field5359.field7694 + arg0 - this.field1871.method1634();
        int var7 = arg3 - -this.field1881.method1636();
        int var8 = super.field5359.field7703 + arg3 + -this.field1877.method1636();
        int var9 = -var5 + var6;
        int var10 = -var7 + var8;
        int var11 = var9 * this.method2450((byte) 59) / 10000;
        int[] var12 = new int[4];
        class363.field4526.method566(var12);
        class363.field4526.method556(var5, var7, var5 + var11, var8);
        this.method1079(var9, var10, var7, var5, arg2 + 3312);
        class363.field4526.method556(var5 + var11, var7, var6, var8);
        this.field1868.method1844(var5, var7, var9, var10);
        if (arg2 != -30315) {
            field1878 = -36;
        }
        class363.field4526.method556(var12[0], var12[1], var12[2], var12[3]);
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lbt;Lbt;Lin;)V")
    public class150(class48 arg0, class48 arg1, class99 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public final void method684(int arg0) {
        ++field1869;
        super.method684(arg0);
        class99 var2 = (class99) super.field5359;
        this.field1872 = class481.method2858(var2.field1290, -1, super.field5362);
        this.field1868 = class481.method2858(var2.field1294, -1, super.field5362);
        this.field1874 = class481.method2858(var2.field1296, -1, super.field5362);
        this.field1871 = class481.method2858(var2.field1295, arg0 + -30574, super.field5362);
        this.field1881 = class481.method2858(var2.field1291, arg0 + -30574, super.field5362);
        this.field1877 = class481.method2858(var2.field1289, -1, super.field5362);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Z")
    public final boolean method685(int arg0) {
        ++field1880;
        if (!super.method685(arg0)) {
            return false;
        } else {
            class99 var2 = (class99) super.field5359;
            if (!super.field5362.method433((byte) -110, var2.field1290)) {
                return false;
            } else if (!super.field5362.method433((byte) -112, var2.field1294)) {
                return false;
            } else if (!super.field5362.method433((byte) -80, var2.field1296)) {
                return false;
            } else if (!super.field5362.method433((byte) -110, var2.field1295)) {
                return false;
            } else if (!super.field5362.method433((byte) -108, var2.field1291)) {
                return false;
            } else {
                return super.field5362.method433((byte) -80, var2.field1289);
            }
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method1078(int arg0, String arg1) {
        if (arg0 != 2) {
            field1878 = -128;
        }
        ++field1876;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var3 = (var3 << 5) + (-var3 - -((long) arg1.charAt(var5)));
        }
        return var3;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIII)V")
    public void method1079(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -27003) {
            ++field1873;
            this.field1872.method1844(arg3, arg2, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZIB)V")
    public final void method681(int arg0, boolean arg1, int arg2, byte arg3) {
        ++field1875;
        if (arg1) {
            int[] var5 = new int[4];
            class363.field4526.method566(var5);
            class363.field4526.method556(arg0, arg2, super.field5359.field7694 + arg0, arg2 - -super.field5359.field7703);
            int var6 = this.field1874.method1634();
            int var7 = this.field1874.method1636();
            int var8 = this.field1871.method1634();
            int var9 = this.field1871.method1636();
            this.field1874.method1838(arg0, (super.field5359.field7703 - var7) / 2 + arg2);
            this.field1871.method1838(super.field5359.field7694 + arg0 + -var8, (-var9 + super.field5359.field7703) / 2 + arg2);
            class363.field4526.method556(arg0, arg2, super.field5359.field7694 + arg0, this.field1881.method1636() + arg2);
            this.field1881.method1844(arg0 + var6, arg2, -var6 + super.field5359.field7694 - var8, super.field5359.field7703);
            int var10 = this.field1877.method1636();
            class363.field4526.method556(arg0, super.field5359.field7703 + arg2 - var10, super.field5359.field7694 + arg0, super.field5359.field7703 + arg2);
            this.field1877.method1844(arg0 + var6, super.field5359.field7703 + arg2 - var10, -var8 + super.field5359.field7694 + -var6, super.field5359.field7703);
            class363.field4526.method556(var5[0], var5[1], var5[2], var5[3]);
        }
        if (arg3 >= -52) {
            this.field1877 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(Z)V")
    public static void method1080(boolean arg0) {
        field1870 = null;
        if (arg0) {
            method1080(false);
        }
    }
}
