import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class150 extends class146 {

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lre;")
    public static class266 field2461 = new class266();

    @OriginalMember(owner = "client!j", name = "B", descriptor = "Z")
    public static boolean field2463 = true;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "[C")
    public static char[] field2465 = new char[128];

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field2462 = 0;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "[I")
    public static int[] field2464 = new int[4096];

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field2453;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public int field2459;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[I")
    public int[] field2450;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "[I")
    public int[] field2454;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "[I")
    public int[] field2460;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "[I")
    public static int[] field2466;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[Luc;")
    public class115[] field2451;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "[Luc;")
    public class115[] field2455;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[[[B")
    public byte[][][] field2452;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIII)V")
    public static final void method1095(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2458++;
        if (arg2 != 27349) {
            return;
        }
        class23 var5 = class91.method694(arg4, 10, -76);
        var5.method190(0);
        var5.field346 = arg1;
        var5.field349 = arg0;
        var5.field361 = arg3;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2465 = null;
        field2464 = null;
        field2466 = null;
        field2461 = null;
        if (arg0 != 0) {
            field2465 = null;
        }
    }
}
