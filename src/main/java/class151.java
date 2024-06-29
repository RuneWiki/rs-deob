import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class151 extends class256 {

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    private final int field2350;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    private final int field2343;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    private final int field2352;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    private final int field2349;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    private final int field2338;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    private final int field2346;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    private final int field2353;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    private final int field2341;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field2348 = 0;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Luf;")
    public static class168 field2339 = class148.method1019(-1720, "<col=40ff00>");

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "[Z")
    public static boolean[] field2351;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "[[B")
    public static byte[][] field2336;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIII)V", line = 5)
    public static final void method1036(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 895969644) {
            field2337++;
            class168 var4 = class134.method938((byte) -126, new class168[] { class238.field3829, class169.method1228(arg2, 0), class118.field1841, class169.method1228(arg3 >> 6, 0), class118.field1841, class169.method1228(arg0 >> 6, 0), class118.field1841, class169.method1228(arg3 & 0x3F, 0), class118.field1841, class169.method1228(arg0 & 0x3F, 0) });
            var4.method1198((byte) 123);
            class142.method976(-26913, var4);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lq;Lq;I)V", line = 38)
    public static final void method1037(class209 arg0, class209 arg1, int arg2) {
        field2347++;
        if (arg1.field3452 != null) {
            arg1.method1464((byte) 84);
        }
        arg1.field3453 = arg0.field3453;
        arg1.field3452 = arg0;
        arg1.field3452.field3453 = arg1;
        arg1.field3453.field3452 = arg1;
        if (arg2 != 1133047462) {
            method1037((class209) null, (class209) null, 22);
        }
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(BII)V", line = 65)
    public final void method904(byte arg0, int arg1, int arg2) {
        if (arg0 == 117) {
            field2342++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 78)
    public static void method1038(int arg0) {
        field2351 = null;
        if (arg0 != -84318132) {
            method1037((class209) null, (class209) null, -111);
        }
        field2339 = null;
        field2336 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI)V", line = 90)
    public final void method905(int arg0, byte arg1, int arg2) {
        if (arg1 < 10) {
            field2348 = 54;
        }
        field2340++;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 115)
    public class151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2350 = arg0;
        this.field2343 = arg7;
        this.field2352 = arg3;
        this.field2349 = arg1;
        this.field2338 = arg2;
        this.field2346 = arg4;
        this.field2353 = arg5;
        this.field2341 = arg6;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)V", line = 133)
    public final void method903(int arg0, int arg1, int arg2) {
        field2344++;
        int var4 = this.field2350 * arg0 >> 12;
        if (arg2 > -28) {
            this.method905(-30, (byte) -89, -15);
        }
        int var5 = this.field2352 * arg1 >> 12;
        int var6 = this.field2349 * arg1 >> 12;
        int var7 = this.field2346 * arg0 >> 12;
        int var8 = this.field2338 * arg0 >> 12;
        int var9 = this.field2353 * arg1 >> 12;
        int var10 = this.field2341 * arg0 >> 12;
        int var11 = this.field2343 * arg1 >> 12;
        class193.method1359(var8, var7, var10, 1, var6, this.field4356, var11, var9, var4, var5);
    }
}
