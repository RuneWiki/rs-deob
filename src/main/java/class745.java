import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class745 extends class219 {

    @OriginalMember(owner = "client!jga", name = "x", descriptor = "[B")
    public byte[] field10370;

    @OriginalMember(owner = "client!jga", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field10367 = new String[100];

    @OriginalMember(owner = "client!jga", name = "t", descriptor = "Ljo;")
    public static class351 field10366 = new class351(1, 3);

    @OriginalMember(owner = "client!jga", name = "A", descriptor = "[I")
    public static int[] field10373 = new int[13];

    @OriginalMember(owner = "client!jga", name = "y", descriptor = "Lpd;")
    public static class267 field10371 = new class267();

    @OriginalMember(owner = "client!jga", name = "B", descriptor = "Z")
    public static boolean field10374 = false;

    @OriginalMember(owner = "client!jga", name = "v", descriptor = "I")
    public static int field10368;

    @OriginalMember(owner = "client!jga", name = "w", descriptor = "I")
    public static int field10369;

    @OriginalMember(owner = "client!jga", name = "z", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)V")
    public static void method4159(int arg0) {
        field10371 = null;
        field10367 = null;
        field10366 = null;
        if (arg0 != 1) {
            method4159(-99);
        }
        field10373 = null;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IBI)Z")
    public static final boolean method4160(int arg0, byte arg1, int arg2) {
        field10368++;
        if (arg1 != -17) {
            method4160(41, (byte) 36, -52);
        }
        return class581.method3382(arg0, arg2, (byte) 19) | (arg2 & 0x70000) != 0 || class222.method1542((byte) -127, arg0, arg2);
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "([B)V")
    public class745(byte[] arg0) {
        this.field10370 = arg0;
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V")
    public static final void method4161(int arg0) {
        class205.method1471(class638.field8979, (long) class673.field9441, 0);
        field10369++;
        if (class251.field3546 != -1) {
            class48.method310(class251.field3546, -55);
        }
        for (int var1 = 0; var1 < class351.field5115; var1++) {
            if (class397.field5653[var1]) {
                class89.field1151[var1] = true;
            }
            class73.field987[var1] = class397.field5653[var1];
            class397.field5653[var1] = false;
        }
        class433.field6163 = class673.field9441;
        if (class251.field3546 != -1) {
            class351.field5115 = 0;
            client.method2053((byte) 116);
        }
        class638.field8979.method463();
        class9.method74(class638.field8979, -6);
        int var2 = class600.method3472(-13);
        if (var2 == -1) {
            var2 = class303.field4540;
        }
        if (var2 == -1) {
            var2 = class733.field10240;
        }
        class759.method4189(var2, true);
        class55.field755 = 0;
        if (arg0 > -44) {
            method4160(88, (byte) 48, 83);
        }
    }
}
