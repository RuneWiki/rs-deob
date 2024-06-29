import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class404 extends class445 {

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Ldn;")
    public static class329 field5538 = new class329("runescape", 0);

    @OriginalMember(owner = "client!of", name = "w", descriptor = "F")
    public float field5540;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "I")
    public int field5536;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public int field5539;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public int field5541;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public int field5542;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public int field5545;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "Lje;")
    public static class253 field5544;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
    public static final void method2442(int arg0, int arg1) {
        field5537++;
        if (class2.field38 == null || arg0 > class2.field38.length) {
            class2.field38 = new int[arg0];
        }
        if (arg1 != 0) {
            method2442(58, -37);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILr;ZI)V")
    public static final void method2443(int arg0, int arg1, int arg2, int arg3, class110 arg4, boolean arg5, int arg6) {
        field5543++;
        class410.field5618 = arg1;
        class409.field5607 = arg4;
        class4.field55 = arg6;
        class425.field5747 = arg2;
        if (arg3 > -66) {
            field5544 = null;
        }
        class165.field2285 = arg0;
        class148.field2106 = 1;
        class90.field1315 = arg5;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method2444(int arg0) {
        if (arg0 != 1) {
            method2443(-26, 70, -73, 104, (class110) null, true, -46);
        }
        field5538 = null;
        field5544 = null;
    }
}
