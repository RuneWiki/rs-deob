import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lff;")
    private class9 field62 = new class9(64);

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lvh;")
    private class240 field63;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field69;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "[Lid;")
    public static class413[] field64 = new class413[4];

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "[Ld;")
    public static class102[] field65 = new class102[14];

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 3)
    public static final void method34(int arg0) {
        class329.field4490.method525(((float) class437.field6374.field4255 * 0.1F + 0.7F) * 1.1523438F);
        field68++;
        class329.field4490.method520(class161.field2295, 0.69921875F, 1.2F, -50.0F, (float) arg0, -50.0F);
        class329.field4490.method448(class349.field4786, -1, 256);
        class329.field4490.method524(class253.field3525);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIILqa;III)Lc;", line = 16)
    public static final class121 method35(int arg0, int arg1, int arg2, class162 arg3, int arg4, int arg5, int arg6) {
        field67++;
        long var7 = (long) arg4;
        if (arg2 != 14004) {
            method34(-99);
        }
        class121 var9 = (class121) class504.field7413.method56(var7, 44);
        short var10 = 2055;
        if (var9 == null) {
            class94 var11 = class183.method1110(class86.field1188, -5960, arg4, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field1251 < 13) {
                var11.method630(46, 0);
            }
            var9 = arg3.method540(var11, var10, class432.field6289, 64, 768);
            class504.field7413.method73(var7, var9, 26425);
        }
        class121 var12 = var9.method761((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method798(arg5);
        }
        if (arg0 != 0) {
            var12.method773(arg0);
        }
        if (arg1 != 0) {
            var12.method805(arg1);
        }
        if (arg6 != 0) {
            var12.method797(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Llk;", line = 82)
    public final class414 method36(int arg0, boolean arg1) {
        field66++;
        class9 var3 = this.field62;
        class414 var4;
        synchronized (this.field62) {
            var4 = (class414) this.field62.method56((long) arg0, 67);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field63.method1411(arg1, arg0, 19);
        class414 var6 = new class414();
        if (var5 != null) {
            var6.method2479((byte) -126, new class365(var5));
        }
        class9 var7 = this.field62;
        synchronized (this.field62) {
            this.field62.method73((long) arg0, var6, 26425);
        }
        if (!arg1) {
            this.field62 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 111)
    public static void method37(int arg0) {
        field65 = null;
        if (arg0 < 54) {
            field64 = null;
        }
        field64 = null;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Llf;ILvh;)V", line = 125)
    public class6(class157 arg0, int arg1, class240 arg2) {
        this.field63 = arg2;
        this.field69 = this.field63.method1397((byte) -111, 19);
    }
}
