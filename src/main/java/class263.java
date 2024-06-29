import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class263 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lpf;")
    public static class17 field4388 = new class17(200);

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4391 = "Loaded fonts";

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[S")
    public static short[] field4394 = new short[256];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIZLud;III)Lud;")
    public static final class242 method1862(int arg0, int arg1, boolean arg2, class242 arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) arg5;
        class242 var9 = (class242) class45.field703.method99(var7, true);
        field4392++;
        if (arg2) {
            return null;
        }
        if (var9 == null) {
            class229 var10 = class229.method1644(class26.field463, arg5, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1618(64, 768, -50, -10, -50);
            class45.field703.method100(var7, var9, 125);
        }
        int var11 = arg3.method844();
        int var12 = arg3.method835();
        int var13 = arg3.method834();
        int var14 = arg3.method861();
        class242 var15 = var9.method857(true, true, true);
        if (arg1 != 0) {
            var15.method858(arg1);
        }
        class112 var16 = (class112) var15;
        if (class277.method1939(class182.field2898, arg0 + var11, arg4 + var13, (byte) -34) != arg6 || arg6 != class277.method1939(class182.field2898, arg0 + var12, arg4 + var14, (byte) -34)) {
            for (int var17 = 0; var17 < var16.field1841; var17++) {
                var16.field1874[var17] += class277.method1939(class182.field2898, var16.field1849[var17] + arg0, var16.field1848[var17] + arg4, (byte) -34) - arg6;
            }
            var16.field1844 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        class36.method225(arg3, arg5, arg0, 0, arg6, arg4, arg2, arg1, true);
        field4387++;
        if (arg7 < 17) {
            method1866(false);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILaj;II)Lbj;")
    public static final class92 method1864(int arg0, class151 arg1, int arg2, int arg3) {
        field4396++;
        if (class167.method1242(arg1, arg3, arg2, 64)) {
            return arg0 == 32767 ? class136.method1010(arg0 - 32871) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)Lde;")
    public static final class270 method1865(byte arg0, int arg1) {
        field4390++;
        class270 var2 = (class270) class159.field2605.method252((long) arg1, false);
        if (arg0 != -79) {
            method1866(true);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class206.field3329.method1149(1, (byte) 66, arg1);
        } else {
            var3 = class130.field2150.method1149(1, (byte) 98, arg1 & 0x7FFF);
        }
        class270 var4 = new class270();
        if (var3 != null) {
            var4.method1898(new class249(var3), (byte) 96);
        }
        if (arg1 >= 32768) {
            var4.method1901(-30294);
        }
        class159.field2605.method247(var4, (long) arg1, arg0 + 114);
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method1866(boolean arg0) {
        field4391 = null;
        field4388 = null;
        field4394 = null;
        if (!arg0) {
            method1865((byte) -119, -98);
        }
    }
}
