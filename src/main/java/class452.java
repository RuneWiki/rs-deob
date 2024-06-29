import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jea")
public class class452 {

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "B")
    private byte field6372;

    @OriginalMember(owner = "client!jea", name = "d", descriptor = "I")
    public int field6375;

    @OriginalMember(owner = "client!jea", name = "k", descriptor = "I")
    public int field6382;

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "I")
    public int field6373;

    @OriginalMember(owner = "client!jea", name = "l", descriptor = "I")
    public int field6383;

    @OriginalMember(owner = "client!jea", name = "h", descriptor = "I")
    public int field6379;

    @OriginalMember(owner = "client!jea", name = "c", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!jea", name = "f", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
    public static int field6381;

    @OriginalMember(owner = "client!jea", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field6380;

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)I", line = 5)
    public final int method2689(int arg0) {
        field6378++;
        if (arg0 == 21110) {
            return (this.field6372 & 0x8) == 8 ? 1 : 0;
        } else {
            return -38;
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(II)I", line = 18)
    public static final int method2690(int arg0, int arg1) {
        field6381++;
        return arg0 == 7 ? arg1 >>> 8 : -107;
    }

    @OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V", line = 31)
    public static void method2691(int arg0) {
        field6380 = null;
        if (arg0 != 1) {
            method2691(-15);
        }
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)I", line = 51)
    public final int method2692(byte arg0) {
        field6377++;
        int var2 = 4 / ((3 - arg0) / 43);
        return this.field6372 & 0x7;
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "()V", line = 60)
    public class452() {
    }

    @OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIBII)V", line = 63)
    public static final void method2693(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field6374++;
        int var5 = class68.field1278;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class480.field6702 = arg0;
            class451.field6369 = arg1;
            class212.field3010 = arg4;
            class68.field1278 = 2;
            class451.field6367 = arg3;
        } else if (var5 == 2) {
            if (class451.field6367 < arg3) {
                class451.field6367 = arg3;
            }
            if (arg1 < class451.field6369) {
                class451.field6369 = arg1;
            }
            if (arg4 < class212.field3010) {
                class212.field3010 = arg4;
            }
            if (arg0 > class480.field6702) {
                class480.field6702 = arg0;
            }
        } else if (arg2 != -74) {
            method2691(46);
        }
    }

    @OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lcea;)V", line = 121)
    public class452(class215 arg0) {
        this.field6372 = arg0.method1536(-113);
        this.field6375 = arg0.method1478(842397944);
        this.field6382 = arg0.method1533((byte) -126);
        this.field6373 = arg0.method1533((byte) -126);
        this.field6383 = arg0.method1533((byte) -126);
        this.field6379 = arg0.method1533((byte) -126);
    }
}
