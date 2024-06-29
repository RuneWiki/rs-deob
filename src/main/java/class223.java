import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class223 {

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "Lnb;")
    private class304 field3696;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "Lkk;")
    private class225 field3697;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Lkc;")
    private class33 field3703;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Z")
    public static boolean field3704 = true;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "Lqd;")
    private static class40 field3706 = class147.method1106("slide:", (byte) -124);

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Lqd;")
    public static class40 field3709 = field3706;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Lqd;")
    public static class40 field3710 = field3706;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Lsd;")
    private class26 field3694;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Lqd;")
    public static class40 field3698;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "[Luk;")
    private class87[] field3695;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 5)
    public final void method1558(int arg0) {
        if (arg0 >= -122) {
            field3704 = true;
        }
        field3699++;
        if (this.field3695 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3695.length; var2++) {
            if (this.field3695[var2] != null) {
                this.field3695[var2].method683((byte) 113);
            }
        }
        for (int var3 = 0; var3 < this.field3695.length; var3++) {
            if (this.field3695[var3] != null) {
                this.field3695[var3].method670(1);
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V", line = 44)
    public static final void method1559(boolean arg0) {
        field3705++;
        int var1 = class160.field2681;
        int var2 = class27.field550;
        int var3 = class250.field4138;
        int var4 = 6116423;
        int var5 = class178.field2934;
        if (class21.field350) {
            class111.method846(var1, var2, var3, var5, var4);
            class111.method846(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class111.method835(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        } else {
            class115.method880(var1, var2, var3, var5, var4);
            class115.method880(var1 + 1, var2 + 1, var3 - 2, 16, 0);
            class115.method881(var1 + 1, var2 + 18, var3 - 2, var5 + -19, 0);
        }
        class230.field3789.method1831(class98.field1756, var1 + 3, var2 + 14, var4, -1);
        if (arg0) {
            method1565(85);
        }
        int var6 = class48.field936;
        int var7 = class46.field893;
        for (int var8 = 0; var8 < class255.field4252; var8++) {
            int var9 = (class255.field4252 - var8 - 1) * 15 + (var2 + 31);
            int var10 = 16777215;
            if (var6 > var1 && (var1 + var3) > var6 && var7 > (var9 - 13) && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class230.field3789.method1831(class108.method819(var8, (byte) -63), var1 + 3, var9, var10, 0);
        }
        class51.method444(class250.field4138, class160.field2681, class178.field2934, class27.field550, 108);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZLce;BLce;)V", line = 98)
    public static final void method1560(boolean arg0, class239 arg1, byte arg2, class239 arg3) {
        class55.field1074 = arg0;
        class93.field1693 = arg1;
        class274.field4554 = arg3;
        field3708++;
        if (arg2 != 122) {
            field3704 = false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)[B", line = 111)
    public static final byte[] method1561(int arg0, byte[] arg1) {
        field3707++;
        if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class234.method1627(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLfk;ZLfk;I)Luk;", line = 131)
    private final class87 method1562(byte arg0, class41 arg1, boolean arg2, class41 arg3, int arg4) {
        field3701++;
        if (this.field3694 == null) {
            throw new RuntimeException();
        }
        this.field3694.field478 = arg4 * 8 + 5;
        if (this.field3694.field478 >= this.field3694.field472.length) {
            throw new RuntimeException();
        } else if (this.field3695[arg4] != null) {
            return this.field3695[arg4];
        } else if (arg0 == 11) {
            int var6 = this.field3694.method203(-22066);
            int var7 = this.field3694.method203(-22066);
            class87 var8 = new class87(arg4, arg3, arg1, this.field3696, this.field3697, var6, var7, arg2);
            this.field3695[arg4] = var8;
            return var8;
        } else {
            return (class87) null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)Z", line = 174)
    public final boolean method1563(int arg0) {
        field3700++;
        if (this.field3694 != null) {
            return true;
        }
        if (arg0 >= -48) {
            field3706 = (class40) null;
        }
        if (this.field3703 == null) {
            if (this.field3696.method2077(0)) {
                return false;
            }
            this.field3703 = this.field3696.method2084(255, (byte) 75, true, 255, (byte) 0);
        }
        if (this.field3703.field4515) {
            return false;
        } else {
            this.field3694 = new class26(this.field3703.method289((byte) -56));
            this.field3695 = new class87[(this.field3694.field472.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILfk;Lfk;)Luk;", line = 204)
    public final class87 method1564(int arg0, int arg1, class41 arg2, class41 arg3) {
        field3702++;
        return arg0 >= -92 ? (class87) null : this.method1562((byte) 11, arg2, true, arg3, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lnb;Lkk;)V", line = 229)
    public class223(class304 arg0, class225 arg1) {
        this.field3696 = arg0;
        this.field3697 = arg1;
        if (!this.field3696.method2077(0)) {
            this.field3703 = this.field3696.method2084(255, (byte) 102, true, 255, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 244)
    public static void method1565(int arg0) {
        field3710 = null;
        field3698 = null;
        field3709 = null;
        field3706 = null;
        if (arg0 != 13782) {
            field3704 = false;
        }
    }
}
