import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class173 extends class34 {

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "J")
    public long field3161;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "Lcc;")
    public static class209 field3157 = class95.method669(113, "<col=ffffff>");

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lrh;")
    public static class46 field3156 = null;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Lcc;")
    public static class209 field3155 = class95.method669(98, "::replacecanvas");

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "Lcc;")
    public static class209 field3158 = class95.method669(93, "null");

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V")
    public static final void method1191(byte arg0) {
        class37.field636.method170(-30820);
        field3154++;
        for (int var1 = 0; var1 < 32; var1++) {
            class88.field1746[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class20.field386[var2] = 0L;
        }
        class103.field1995 = 0;
        if (arg0 < 30) {
            method1192(-104, -63);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
    public static final void method1192(int arg0, int arg1) {
        field3159++;
        class118.field2370 = arg1;
        class279.field4919 = -1;
        class279.field4919 = arg0;
        class112.method801((byte) -88);
    }

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)Ldl;")
    public static final class122 method1193(int arg0) {
        field3160++;
        if (arg0 >= -120) {
            field3158 = null;
        }
        try {
            return (class122) Class.forName("db").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class222();
        }
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class173() {
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(J)V")
    public class173(long arg0) {
        this.field3161 = arg0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lcc;Lcc;II)V")
    public static final void method1194(class209 arg0, class209 arg1, int arg2, int arg3) {
        field3153++;
        class84.field1675 = arg2;
        class246.field4463 = arg0;
        class246.field4467 = arg1;
        if (class246.field4467.method1457((byte) -95, class246.field4451) || class246.field4463.method1457((byte) -96, class246.field4451)) {
            class8.field164 = 3;
        } else if (class37.field646 == -1) {
            class12.field231 = 0;
            if (arg3 == 32) {
                class168.field3018 = 1;
                class284.field4982 = 0;
                class8.field164 = -3;
                class106 var4 = new class106(128);
                var4.method773(-6385, 10);
                var4.method740(arg3 ^ 0xDF, (int) (Math.random() * 99999.0D));
                var4.method740(255, 523);
                var4.method756(class246.field4467.method1448(true), (byte) -56);
                var4.method758((int) (Math.random() * 9.9999999E7D), arg3 + 1469334168);
                var4.method745(class246.field4463, (byte) -115);
                var4.method758((int) (Math.random() * 9.9999999E7D), 1469334200);
                var4.method727(-121, class234.field4211, class129.field2477);
                class84.field1677.field2085 = 0;
                class84.field1677.method773(-6385, 199);
                class84.field1677.method773(-6385, var4.field2085);
                class84.field1677.method743(var4.field2108, 0, var4.field2085, -30266);
            }
        } else {
            class59.method450(6362);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public static void method1195(boolean arg0) {
        field3157 = null;
        field3155 = null;
        field3158 = null;
        field3156 = null;
        if (!arg0) {
            field3155 = null;
        }
    }
}
