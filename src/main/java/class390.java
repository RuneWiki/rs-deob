import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class390 {

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public int field5793;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    private int field5789;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "Lfe;")
    public static class384 field5787 = new class384(16);

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "Z")
    public static boolean field5791 = false;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "I")
    public static int field5790;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII)Loi;", line = 3)
    public static final class49 method2349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -96) {
            method2351(-39, 23, -78, (byte) -121);
        }
        field5792++;
        long var7 = (long) arg4 * 986053L ^ (long) arg3 * 67481L ^ (long) arg0 * 97549L ^ (long) arg6 * 475427L ^ (long) arg5 * 32147369L ^ (long) arg2 * 76724863L;
        class49 var9 = (class49) class410.field6007.method40(0, var7);
        if (var9 == null) {
            class49 var10 = class298.field4343.method829(arg3, arg0, arg6, arg4, arg5, arg2);
            class410.field6007.method36(-20960, var10, var7);
            return var10;
        } else {
            return var9;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(IIIIIII)I", line = 24)
    public static final int method2350(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5786++;
        int var7 = arg3 & 0x3;
        if ((arg6 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 7 - (arg0 + arg1 - 1);
        } else if (arg5 == -1) {
            return 1 + 7 - arg2 - arg4;
        } else {
            return -57;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIB)V", line = 55)
    public static final void method2351(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        field5785++;
        int var6 = arg0 << 3;
        class473.field6841 = var5;
        if (class306.field4454 == 2) {
            class21.field284 = var4;
            class317.field4653 = var5;
            class236.field3317 = var6;
        }
        class506.field7722 = var4;
        class493.method2965((byte) 124);
        class477.field6873 = true;
        if (arg3 > -100) {
            field5787 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V", line = 84)
    public static final void method2352(int arg0, int arg1) {
        class188.field2680 = arg0;
        field5790++;
        class5 var2 = class381.field5675;
        synchronized (class381.field5675) {
            class381.field5675.method38((byte) -50);
            if (arg1 < 0) {
                method2354((byte) -85);
            }
        }
    }

    @OriginalMember(owner = "client!iu", name = "toString", descriptor = "()Ljava/lang/String;", line = 101)
    public final String toString() {
        field5788++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)I", line = 112)
    public final int method2353(int arg0) {
        if (arg0 != -2) {
            field5791 = true;
        }
        field5794++;
        return this.field5789;
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(II)V", line = 127)
    public class390(int arg0, int arg1) {
        this.field5793 = arg1;
        this.field5789 = arg0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V", line = 136)
    public static void method2354(byte arg0) {
        field5787 = null;
        if (arg0 > -14) {
            field5787 = null;
        }
    }
}
