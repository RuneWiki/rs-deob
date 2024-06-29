import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class291 extends class320 {

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field4653 = 0;

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4655 = "Loading sprites - ";

    @OriginalMember(owner = "client!fo", name = "w", descriptor = "I")
    public static int field4664 = 0;

    @OriginalMember(owner = "client!fo", name = "y", descriptor = "Z")
    public static boolean field4666 = true;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public int field4658;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!fo", name = "x", descriptor = "I")
    public int field4665;

    @OriginalMember(owner = "client!fo", name = "z", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!fo", name = "A", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "[I")
    public int[] field4654;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "[I")
    public int[] field4656;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "[I")
    public int[] field4661;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "[Lnn;")
    public class45[] field4660;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "[Lnn;")
    public class45[] field4662;

    @OriginalMember(owner = "client!fo", name = "v", descriptor = "[[[B")
    public byte[][][] field4663;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V", line = 5)
    public static final void method1991(int arg0, int arg1, int arg2) {
        field4668++;
        if (class272.method1863(arg1 ^ 0x2807C326, arg0)) {
            class325.method2263(class109.field1852[arg0], true, arg2);
            if (arg1 != -28554) {
                field4653 = 68;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V", line = 50)
    public static void method1992(int arg0) {
        if (arg0 > -70) {
            method1991(-5, 25, -81);
        }
        field4655 = null;
    }
}
