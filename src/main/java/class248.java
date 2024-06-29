import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class248 extends class130 {

    @OriginalMember(owner = "client!id", name = "A", descriptor = "Lcd;")
    private static class64 field4310 = class44.method335((byte) 71, "Allocating memory");

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lcd;")
    public static class64 field4311 = field4310;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "Lcd;")
    public static class64 field4313 = class44.method335((byte) 71, "Titelbild geladen)3");

    @OriginalMember(owner = "client!id", name = "H", descriptor = "I")
    public static int field4317 = 0;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "Lcd;")
    public static class64 field4321 = class44.method335((byte) 71, " loggt sich aus)3");

    @OriginalMember(owner = "client!id", name = "C", descriptor = "Lcd;")
    public static class64 field4312 = class44.method335((byte) 71, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Lcd;")
    public static class64 field4320 = class44.method335((byte) 71, "blaugr-Un:");

    @OriginalMember(owner = "client!id", name = "y", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "I")
    public int field4315;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "I")
    public int field4319;

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    public int field4325;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lcd;")
    public class64 field4307;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "[I")
    public int[] field4306;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "[I")
    public int[] field4314;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "[Ldh;")
    public class159[] field4324;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[Lcd;")
    public class64[] field4309;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V", line = 21)
    public static final void method1789(byte arg0, int arg1) {
        field4318++;
        if (arg0 != -44) {
            return;
        }
        if (class238.field4072 == 0) {
            class258.field4463.method1702(arg1, (byte) 49);
        } else {
            class122.field2197 = arg1;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BIII)V", line = 73)
    public static final void method1790(byte arg0, int arg1, int arg2, int arg3) {
        field4323++;
        if (arg0 == 83) {
            class299 var4 = class158.method1135(arg2, 32, 11);
            var4.method2091(69);
            var4.field5152 = arg3;
            var4.field5153 = arg1;
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)V", line = 97)
    public static void method1791(int arg0) {
        field4321 = null;
        if (arg0 != 0) {
            method1791(-121);
        }
        field4311 = null;
        field4312 = null;
        field4320 = null;
        field4313 = null;
        field4310 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lcd;IIBJSLcd;)V", line = 112)
    public static final void method1792(class64 arg0, int arg1, int arg2, byte arg3, long arg4, short arg5, class64 arg6) {
        field4322++;
        int var8 = -59 / ((65 - arg3) / 56);
        if (class101.field1828 || class220.field3736 >= 500) {
            return;
        }
        class153.field2715[class220.field3736] = arg6;
        class69.field1334[class220.field3736] = arg0;
        class289.field4934[class220.field3736] = arg5;
        class64.field1237[class220.field3736] = arg4;
        class223.field3806[class220.field3736] = arg1;
        class235.field3964[class220.field3736] = arg2;
        class220.field3736++;
    }
}
