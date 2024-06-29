import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class253 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lnk;")
    public static class16 field4015;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[I")
    public static int[] field4009;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)I", line = 7)
    public static final int method1791(int arg0, boolean arg1) {
        field4007++;
        if (!arg1) {
            field4003 = -118;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lhi;I)Z", line = 19)
    public static final boolean method1792(class323 arg0, int arg1) {
        int var2 = 42 / ((17 - arg1) / 39);
        field4006++;
        if (arg0.field5182 == 205) {
            class227.field3436 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZII)V", line = 37)
    public static final void method1793(boolean arg0, int arg1, int arg2) {
        class255.field4041[arg2] = arg1;
        field4011++;
        class161 var3 = (class161) class181.field2727.method770((long) arg2, -52);
        if (!arg0) {
            method1797(-57);
        }
        if (var3 == null) {
            class161 var4 = new class161(class9.method57(-14133) + 500L);
            class181.field2727.method764(24369, var4, (long) arg2);
        } else {
            var3.field2485 = class9.method57(-14133) + 500L;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I", line = 78)
    public static final int method1794(int arg0, int arg1) {
        field4013++;
        if (arg1 >= -41) {
            field4015 = (class16) null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 114)
    public static final void method1795(int arg0) {
        class49.field557.method383((byte) -48);
        if (arg0 > 14) {
            field4005++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V", line = 127)
    public static final void method1796(int arg0) {
        for (class238 var1 = (class238) class88.field1166.method761(17); var1 != null; var1 = (class238) class88.field1166.method757(-1)) {
            int var2 = var1.field3658;
            if (class296.method2104((byte) -64, var2)) {
                boolean var3 = true;
                class323[] var4 = class232.field3512[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field5172;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2834;
                    class323 var7 = class45.method277(-12866, var6);
                    if (var7 != null) {
                        class107.method693(var7, 6);
                    }
                }
            }
        }
        if (arg0 > -49) {
            field4004 = 63;
        }
        field4002++;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V", line = 202)
    public static void method1797(int arg0) {
        field4009 = null;
        if (arg0 == -32682) {
            field4015 = null;
        }
    }
}
