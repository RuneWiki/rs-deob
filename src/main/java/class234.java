import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class234 {

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lda;")
    private static class275 field4085 = class255.method1672(93, "Take");

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lda;")
    public static class275 field4088 = field4085;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field4081;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "[Lwb;")
    public static class179[] field4091;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Lsd;")
    public static final class246 method1520(int arg0, int arg1) {
        field4087++;
        class246 var2 = (class246) class249.field4378.method990((long) arg1, (byte) -121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class119.field2130.method775(arg0, arg1, -24799);
        class246 var4 = new class246();
        if (var3 != null) {
            var4.method1613(new class85(var3), -23985);
        }
        class249.field4378.method986(arg0 ^ 0x3, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIII)V")
    public void method1335(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4082++;
        if (arg0 != 128) {
            field4085 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)I")
    public static final int method1521(int arg0, int arg1) {
        field4092++;
        return arg1 >= -123 ? 122 : arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBI)V")
    public static final void method1522(int arg0, byte arg1, int arg2) {
        if (arg1 != 106) {
            field4085 = null;
        }
        field4090++;
        class184 var3 = class147.method1044(6, (byte) 49, arg2);
        var3.method1226((byte) 26);
        var3.field3145 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()Z")
    public boolean method1523() {
        field4084++;
        return false;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lak;")
    public class234 method1524(int arg0, int arg1, int arg2) {
        field4081++;
        return this;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "()I")
    public abstract int method664();

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lgi;Lgd;IIILfb;IB)V")
    public static final void method1525(class34 arg0, class165 arg1, int arg2, int arg3, int arg4, class109 arg5, int arg6, byte arg7) {
        field4080++;
        if (arg7 != -53) {
            method1520(37, -69);
        }
        class249 var8 = new class249();
        var8.field4377 = arg3 * 128;
        var8.field4385 = arg6;
        var8.field4374 = arg4 * 128;
        if (arg0 != null) {
            var8.field4397 = arg0.field519;
            var8.field4387 = arg0.field518 * 128;
            var8.field4376 = arg0;
            var8.field4394 = arg0.field498;
            var8.field4386 = arg0.field515;
            var8.field4392 = arg0.field513;
            int var10 = arg0.field559;
            int var11 = arg0.field526;
            if (arg2 == 1 || arg2 == 3) {
                var11 = arg0.field559;
                var10 = arg0.field526;
            }
            var8.field4388 = (arg4 + var10) * 128;
            var8.field4381 = (arg3 + var11) * 128;
            if (arg0.field528 != null) {
                var8.field4398 = true;
                var8.method1632((byte) -113);
            }
            if (var8.field4397 != null) {
                var8.field4393 = var8.field4394 + (int) ((double) (var8.field4386 - var8.field4394) * Math.random());
            }
            class277.field4835.method547(arg7 + 157, var8);
            return;
        }
        if (arg1 != null) {
            var8.field4384 = arg1;
            class23 var9 = arg1.field2873;
            if (var9.field406 != null) {
                var8.field4398 = true;
                var9 = var9.method140(1);
            }
            if (var9 != null) {
                var8.field4381 = (var9.field399 + arg3) * 128;
                var8.field4388 = (var9.field399 + arg4) * 128;
                var8.field4392 = class133.method977(arg1, arg7 ^ 0x34);
                var8.field4387 = var9.field378 * 128;
            }
            class135.field2387.method547(arg7 + 157, var8);
            return;
        }
        if (arg5 == null) {
            return;
        }
        var8.field4395 = arg5;
        var8.field4388 = (arg4 + arg5.method750((byte) -104)) * 128;
        var8.field4381 = (arg5.method750((byte) -118) + arg3) * 128;
        var8.field4392 = class256.method1676((byte) -128, arg5);
        var8.field4387 = arg5.field1896 * 128;
        class35.field566.method1867(true, arg5.field1910.method1833(0), var8);
        return;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method1526(boolean arg0) {
        field4085 = null;
        field4088 = null;
        field4091 = null;
        if (arg0) {
            field4083 = 10;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lak;IIIZ)V")
    public void method1527(class234 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field4086++;
    }
}
