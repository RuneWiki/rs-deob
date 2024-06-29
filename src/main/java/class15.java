import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class15 extends class176 {

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lgg;")
    public static class63 field369 = class116.method911(43, ")3runescape)3com");

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "[S")
    public static short[] field361 = new short[] { 39, 58, 42, 26, 43, 10, 12, 29 };

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "Lgg;")
    public static class63 field372 = class116.method911(43, "Standort");

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "[I")
    public static int[] field373 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public int field357;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public int field358;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public int field360;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public int field362;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public int field363;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "I")
    public int field364;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public int field365;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Ldg;")
    public class37 field355;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Lee;")
    public class44 field356;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "Lee;")
    public class44 field367;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "Ljc;")
    public static class85 field370;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "[I")
    public int[] field368;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public final void method168(byte arg0) {
        int var2 = this.field362;
        class37 var3 = this.field355.method357(arg0 - 18233);
        field359++;
        if (var3 == null) {
            this.field362 = -1;
            this.field363 = 0;
            this.field357 = 0;
            this.field374 = 0;
            this.field368 = null;
        } else {
            this.field368 = var3.field870;
            this.field363 = var3.field890;
            this.field362 = var3.field865;
            this.field374 = var3.field894;
            this.field357 = var3.field901 * 128;
        }
        if (arg0 == 26 && (this.field362 != var2 && this.field367 != null)) {
            class124.field2737.method869(this.field367);
            this.field367 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method169(int arg0) {
        field373 = null;
        field369 = null;
        field361 = null;
        if (arg0 != 0) {
            method169(-24);
        }
        field372 = null;
        field370 = null;
    }
}
