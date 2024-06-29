import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class217 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Ljd;")
    public static class86 field3906 = class122.method868("scrollbar", true);

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "Ljd;")
    public static class86 field3908 = class122.method868("<img=0>", true);

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3905 = 0;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Ljd;")
    private static class86 field3911 = class122.method868("Ok", true);

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "Ljd;")
    public static class86 field3913 = field3911;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Ljd;")
    private static class86 field3912 = class122.method868("Loaded interfaces", true);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Ljd;")
    public static class86 field3904 = field3912;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Ljd;")
    public static class86 field3915 = class122.method868(")4a=", true);

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field3916 = 0;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3914;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3909;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method1531(int arg0) {
        field3912 = null;
        field3909 = null;
        field3913 = null;
        field3915 = null;
        field3908 = null;
        field3911 = null;
        field3904 = null;
        field3906 = null;
        if (arg0 != 2047) {
            method1534((class6) null, 77);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lpe;")
    public static final class234 method1532(int arg0, int arg1) {
        field3914++;
        int var2 = 123 / ((arg1 + 45) / 34);
        class234 var3 = (class234) class206.field3743.method701((byte) -120, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class159.field2982.method1084((byte) -117, 1, arg0);
        class234 var5 = new class234();
        if (var4 != null) {
            var5.method1624(new class200(var4), arg0, false);
        }
        class206.field3743.method696((long) arg0, var5, (byte) -96);
        return var5;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Z")
    public static final boolean method1533(int arg0) {
        field3907++;
        try {
            if (arg0 != 0) {
                field3913 = null;
            }
            return class59.method429((byte) 103);
        } catch (IOException var4) {
            class130.method915(-14139);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class44.field969 + "," + class116.field2234 + "," + field3916 + " - " + class112.field2143 + "," + (class124.field2412.field707[0] + class252.field4481) + "," + (class79.field1554 + class124.field2412.field705[0]) + " - ";
            for (int var3 = 0; var3 < class112.field2143 && var3 < 50; var3++) {
                var2 = var2 + class168.field3102.field3547[var3] + ",";
            }
            class143.method1018(var5, var2, 72);
            class9.method74(123);
            return true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lwj;I)V")
    public static final void method1534(class6 arg0, int arg1) {
        field3910++;
        if (arg1 != -5459) {
            return;
        }
        int var2 = arg0.field100;
        if (var2 == 324) {
            if (class267.field4712 == -1) {
                class243.field4345 = arg0.field137;
                class267.field4712 = arg0.field219;
            }
            if (class267.field4708.field1425) {
                arg0.field219 = class267.field4712;
            } else {
                arg0.field219 = class243.field4345;
            }
        } else if (var2 == 325) {
            if (class267.field4712 == -1) {
                class267.field4712 = arg0.field219;
                class243.field4345 = arg0.field137;
            }
            if (class267.field4708.field1425) {
                arg0.field219 = class243.field4345;
            } else {
                arg0.field219 = class267.field4712;
            }
        } else if (var2 == 327) {
            arg0.field192 = 150;
            arg0.field110 = (int) (Math.sin((double) class236.field4265 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field195 = -1;
            arg0.field162 = 5;
        } else if (var2 == 328) {
            if (class124.field2412.field4029 == null) {
                arg0.field195 = 0;
            } else {
                arg0.field192 = 150;
                arg0.field110 = (int) (Math.sin((double) class236.field4265 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field162 = 5;
                arg0.field195 = ((int) class124.field2412.field4029.method622(arg1 + 5457) << 11) + 2047;
                arg0.field79 = class124.field2412.field701;
                arg0.field119 = class124.field2412.field693;
            }
        }
    }
}
