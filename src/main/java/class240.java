import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class240 {

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[S")
    public static short[] field3842 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public static int field3845 = 5063219;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Z")
    public static boolean field3852 = false;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public int field3832;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public int field3834;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field3835;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public int field3836;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field3837;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field3838;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field3840;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field3841;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public int field3843;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field3853;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public int field3855;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "[[[I")
    public static int[][][] field3846;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method1582(byte arg0) {
        field3846 = null;
        if (arg0 == 100) {
            field3842 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
    public static final void method1583(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class66.field944[var1] = false;
        }
        class124.field2075 = 0;
        class248.field3984 = -1;
        class34.field420 = 0;
        class92.field1316 = 1;
        field3847++;
        class61.field837 = -1;
        if (arg0 <= 115) {
            method1582((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 5) {
            method1583((byte) -45);
        }
        field3844++;
        if (arg1 - arg5 >= class58.field817 && (arg1 + arg5) <= class121.field2042 && class156.field2507 <= (arg4 - arg5) && client.field3617 >= (arg4 + arg5)) {
            class248.method1642(arg4, arg5, arg0, arg6, arg1, arg2, arg3 + 87);
        } else {
            class259.method1699(arg1, -9, arg0, arg2, arg6, arg5, arg4);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static final void method1585(int arg0) {
        field3848++;
        class260.field4132.method1834(0);
        if (arg0 != -1) {
            field3852 = false;
        }
    }
}
