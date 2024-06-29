import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class111 extends class90 {

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "[Lmh;")
    public class121[] field2344 = new class121[5];

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public int field2351 = 0;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "[I")
    public int[] field2358 = new int[5];

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "I")
    public int field2353;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public int field2355;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!lg", name = "w", descriptor = "[Lue;")
    public static class189[] field2337 = new class189[256];

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "Lrf;")
    public static class163 field2336 = class53.method392(-119, "::rect_debug");

    @OriginalMember(owner = "client!lg", name = "x", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!lg", name = "y", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!lg", name = "O", descriptor = "I")
    public int field2354;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "Lld;")
    public class108 field2350;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "Llg;")
    public class111 field2360;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "Ln;")
    public class122 field2346;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "Lvb;")
    public class195 field2352;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Lee;")
    public class46 field2361;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Lhc;")
    public class72 field2345;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "Lah;")
    public class9 field2357;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "Z")
    public boolean field2341;

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "Z")
    public boolean field2347;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "Z")
    public boolean field2356;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V")
    public static void method771(int arg0) {
        field2337 = null;
        field2336 = null;
        if (arg0 != 5) {
            field2337 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(III)V")
    public class111(int arg0, int arg1, int arg2) {
        this.field2340 = arg1;
        this.field2355 = this.field2353 = arg0;
        this.field2348 = arg2;
    }
}
