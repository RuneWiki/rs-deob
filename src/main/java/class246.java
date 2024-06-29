import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class246 extends class54 {

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "[I")
    public static int[] field4498 = new int[25];

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "[Lcb;")
    public static class25[] field4504 = new class25[4];

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public int field4502;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Lrb;")
    public static class187 field4499;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Ljava/awt/Image;")
    public static Image field4497;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "[I")
    public int[] field4490;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "[I")
    public int[] field4496;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "[I")
    public int[] field4501;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "[Lmb;")
    public class132[] field4493;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "[Lmb;")
    public class132[] field4500;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "[[[B")
    public byte[][][] field4492;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[BI)I")
    public static final int method1596(int arg0, byte[] arg1, int arg2) {
        field4495++;
        if (arg2 != 25) {
            method1596(-95, null, 71);
        }
        return class85.method580(0, arg0, (byte) 123, arg1);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)V")
    public static void method1597(int arg0) {
        field4504 = null;
        field4499 = null;
        int var1 = -31 / ((-arg0 - 58) / 33);
        field4497 = null;
        field4498 = null;
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(I)V")
    public static final void method1598(int arg0) {
        for (class50 var1 = (class50) class238.field4337.method1338(54); var1 != null; var1 = (class50) class238.field4337.method1332((byte) -89)) {
            if (var1.field1002 != null) {
                var1.method424((byte) 43);
            }
        }
        field4503++;
        if (arg0 != 25) {
            method1598(17);
        }
    }
}
