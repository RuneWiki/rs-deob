import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class281 extends class135 {

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "B")
    public byte field4497 = 5;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field4507 = 0;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "Lpn;")
    public static class444 field4508 = class106.method802(127);

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Z")
    public static boolean field4511 = false;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "I")
    public int field4495;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public int field4505;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "[[[I")
    public static int[][][] field4509;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
    public static final void method1915(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field3878 != null) {
            var3.field3878 = null;
        }
        if (var3.field3889 != null) {
            var3.field3889 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    public static final int method1916(int arg0, int arg1) {
        if (arg0 != 255) {
            method1921(-26, 117, (byte) -18);
        }
        field4498++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lmo;Lmo;I)V")
    public static final void method1917(class447 arg0, class447 arg1, int arg2) {
        field4500++;
        class199.field3201 = arg0;
        class45.field568 = arg1;
        class45.field568.method2758(arg2, arg2 ^ 0x38E5);
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    public static final void method1918(int arg0) {
        field4502++;
        if (!class117.method852(true) && class81.field1007 != class266.field4286) {
            class414.method2589(false, (byte) -119, class266.field4286, class418.field6195, false, class261.field4201.field1906[0], class261.field4201.field1916[0], class222.field3698);
            return;
        }
        class128.method950(class284.field4547, (byte) -89);
        if (class39.field492 != class266.field4286) {
            class111.method825((byte) -128);
        }
        if (arg0 < 37) {
            field4508 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIZI)V")
    public static final void method1919(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4501++;
        if (class178.method1225(68, arg2)) {
            class426.method2638(class203.field3266[arg2], arg4, arg1, arg3, arg0, -91);
        }
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
    public static void method1920(int arg0) {
        field4509 = null;
        if (arg0 != 255) {
            method1916(-116, -120);
        }
        field4508 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIB)Lln;")
    public static final class211 method1921(int arg0, int arg1, byte arg2) {
        field4499++;
        class211 var3 = (class211) class180.field2937.method1770(-880, (long) arg0 << 32 | (long) arg1);
        if (arg2 > -91) {
            field4508 = null;
        }
        if (var3 == null) {
            var3 = new class211(arg0, arg1);
            class180.field2937.method1766(var3.field2539, var3, -108);
        }
        return var3;
    }
}
