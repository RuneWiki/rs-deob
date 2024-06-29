import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class189 extends class249 {

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public int field3310;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public int field3299;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "Lmb;")
    public static class96 field3307 = class243.method1708("headicons_prayer", (byte) 118);

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "Lmb;")
    public static class96 field3306 = class243.method1708(" )2> <col=00ffff>", (byte) 93);

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "[[[I")
    public static int[][][] field3300 = new int[2][][];

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "Lmb;")
    private static class96 field3305 = class243.method1708("Loaded sprites", (byte) 92);

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "Lmb;")
    public static class96 field3308 = field3305;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "Lmb;")
    public static class96 field3312 = class243.method1708("settings", (byte) 114);

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Lff;")
    public static class3 field3309;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public static final void method1331(int arg0, int arg1) {
        field3303++;
        if (class225.method1534(arg1 - 2644, arg0)) {
            class77.method555((byte) -106, -1, class100.field1704[arg0]);
            if (arg1 != 2643) {
                method1331(117, -25);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(II)Lpk;")
    public static final class67 method1332(int arg0, int arg1) {
        class67 var2 = (class67) class31.field491.method84(-119, (long) arg0);
        field3302++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class251.field4344.method23(class178.method1267(arg0, (byte) 119), 103, class154.method1129(arg0, (byte) -127));
        if (arg1 != 2) {
            field3312 = null;
        }
        class67 var4 = new class67();
        if (var3 != null) {
            var4.method468(new class239(var3), 0);
        }
        var4.method466((byte) -120);
        class31.field491.method88(var4, arg1 ^ 0x4084, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(II)V")
    public static final void method1333(int arg0, int arg1) {
        class167.field2946.method82((byte) -109, arg1);
        field3304++;
        class34.field604.method82((byte) -109, arg1);
        class241.field4190.method82((byte) -109, arg1);
        if (arg0 != 2) {
            method1335(43);
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public static final void method1334(int arg0) {
        class274.field4790 = null;
        class245.field4259 = null;
        class11.field199 = null;
        field3301++;
        if (arg0 != -14682) {
            method1332(-94, -128);
        }
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(II)V")
    public class189(int arg0, int arg1) {
        this.field3310 = arg0;
        this.field3299 = arg1;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field3309 = null;
        field3300 = null;
        field3305 = null;
        if (arg0 != -20504) {
            field3306 = null;
        }
        field3312 = null;
        field3306 = null;
        field3307 = null;
        field3308 = null;
    }
}
