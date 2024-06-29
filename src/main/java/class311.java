import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class311 {

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lwaa;")
    private class652 field4108 = new class652(256);

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lwaa;")
    private class652 field4114 = new class652(256);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "Ljn;")
    private class668 field4105;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "Ljn;")
    private class668 field4109;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lwo;")
    public static class690 field4104 = new class690(25, 6);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "Lf;")
    public static class701 field4111;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
    public static void method1825(int arg0) {
        field4111 = null;
        if (arg0 != 65528) {
            method1826(-81, true, null);
        }
        field4104 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1826(int arg0, boolean arg1, String arg2) {
        field4113++;
        class670.field9635++;
        class543 var3 = class299.method1780(class84.field1196, class635.field9112, 61);
        var3.field7872.method2281((byte) 58, class251.method1534(arg2, (byte) 108) + 1);
        var3.field7872.method2269(arg2, -121);
        var3.field7872.method2237(-70, arg0);
        if (!arg1) {
            method1826(97, false, null);
        }
        class511.method3028(7482, var3);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[III)Lep;")
    private final class387 method1827(int arg0, int[] arg1, int arg2, int arg3) {
        field4110++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF8) ^ arg2;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class387 var9 = (class387) this.field4114.method3678(var7, -124);
        if (arg3 != 0) {
            return null;
        } else if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class476 var10 = (class476) this.field4108.method3678(var7, -121);
            if (var10 == null) {
                var10 = class476.method2803(this.field4109, arg0, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field4108.method3670(var7, var10, (byte) 127);
            }
            class387 var11 = var10.method2798(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method3045(true);
                this.field4114.method3670(var7, var11, (byte) 127);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI[I)Lep;")
    public final class387 method1828(byte arg0, int arg1, int[] arg2) {
        field4106++;
        if (this.field4109.method3779(5) == 1) {
            return this.method1827(0, arg2, arg1, 0);
        } else if (this.field4109.method3805(arg1, false) == 1) {
            return this.method1827(arg1, arg2, 0, 0);
        } else {
            if (arg0 <= 82) {
                field4104 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)I")
    public static final int method1829(int arg0, int arg1) {
        return class285.field3860 == null ? 0 : class285.field3860[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I[III)Lep;")
    private final class387 method1830(int arg0, int[] arg1, int arg2, int arg3) {
        field4107++;
        int var5 = arg0 ^ (arg2 >>> 12 | (arg2 & 0x10000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6;
        class387 var9 = (class387) this.field4114.method3678(var7, -123);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class319 var10 = class319.method1858(this.field4105, arg2, arg0);
            if (var10 == null) {
                return null;
            }
            class387 var11 = var10.method1860();
            if (arg3 != -25579) {
                method1826(-110, false, null);
            }
            this.field4114.method3670(var7, var11, (byte) 127);
            if (arg1 != null) {
                arg1[0] -= var11.field5150.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "([IBI)Lep;")
    public final class387 method1831(int[] arg0, byte arg1, int arg2) {
        if (arg1 != 8) {
            this.field4114 = null;
        }
        field4112++;
        if (this.field4105.method3779(5) == 1) {
            return this.method1830(arg2, arg0, 0, -25579);
        } else if (this.field4105.method3805(arg2, false) == 1) {
            return this.method1830(0, arg0, arg2, -25579);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljn;Ljn;)V")
    public class311(class668 arg0, class668 arg1) {
        this.field4105 = arg0;
        this.field4109 = arg1;
    }
}
