import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class210 extends class79 {

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field3346 = 0;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Lck;")
    public static class119 field3348 = class298.method1987((byte) 100, "Hidden)2use");

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "I")
    public static int field3357 = -1;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public int field3349;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "Lwi;")
    public static class23 field3352;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "Lwi;")
    public class23 field3355;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "Lob;")
    public static class294 field3350;

    @OriginalMember(owner = "client!ol", name = "I", descriptor = "Lkl;")
    public class75 field3359;

    @OriginalMember(owner = "client!ol", name = "H", descriptor = "Ltl;")
    public static class96 field3358;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "[B")
    public byte[] field3354;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V", line = 16)
    public static final void method1316(int arg0, int arg1, int arg2) {
        field3351++;
        class264.method1733();
        if (class295.field4900 != null) {
            class295.field4900.detach();
        }
        if (class98.field1495 && class295.field4900 == null) {
            class295.field4900 = new browsercontrol(class93.field1442);
        }
        class182.field2880 = class153.method979(class220.field3533, 0, arg2, arg1, arg0, -16);
        if (class182.field2880 == null) {
            class135.method900(255);
            return;
        }
        class269.field4437 = arg0;
        class264.field4306 = arg0;
        if (class98.field1495) {
            arg1 -= 90;
            class174.field2789 = 90;
        } else {
            class174.field2789 = 0;
        }
        class146.field2349 = arg1;
        class27.field407 = arg0;
        class131.field2000 = arg1;
        class264.field4290 = arg1;
        class270.method1794(class220.field3533, 1);
        if (class119.field1822 != -1) {
            class25.method188((byte) -44, true);
        }
        if (class44.field660 != null) {
            class6.field149.method966(0, 94);
            class195.field3121++;
            class6.field149.method40(arg0, -103);
            class6.field149.method40(arg1, 72);
        }
        class291.method1929(2);
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 64)
    public static void method1317(int arg0) {
        if (arg0 != 90) {
            method1319();
        }
        field3358 = null;
        field3352 = null;
        field3348 = null;
        field3350 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IILck;)V", line = 89)
    public static final void method1318(int arg0, int arg1, class119 arg2) {
        class155.field2477++;
        field3353++;
        class6.field149.method966(0, arg0);
        class6.field149.method16(arg1, (byte) 99);
        class6.field149.method29(2069, arg2.method786((byte) 112));
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "()V", line = 114)
    public static final void method1319() {
        class262.field4258 = (class104[][][]) null;
        class37.field554 = (int[][]) null;
        class259.field4144 = (int[][][]) null;
        class25.field374 = (class145[][]) null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B[[I)V", line = 123)
    public static final void method1320(byte arg0, int[][] arg1) {
        class256.field4113 = arg1;
        if (arg0 < -96) {
            field3356++;
        }
    }
}
