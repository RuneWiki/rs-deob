import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class232 extends class134 {

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "J")
    public long field3925;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field3932 = new String[5];

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "Z")
    public static boolean field3936 = false;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field3933 = 2;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public static int field3935 = 7759444;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIIII)V")
    public static final void method1666(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class236.field3980.field4160 = 0;
        class236.field3980.method1780(20, 116);
        class236.field3980.method1780(arg1, 93);
        class236.field3980.method1780(arg2, arg4 ^ 0x36CD);
        field3934++;
        class236.field3980.method1771(arg3, (byte) 30);
        class236.field3980.method1771(arg0, (byte) 30);
        class273.field4566 = 0;
        class10.field184 = -3;
        class70.field1165 = 1;
        if (arg4 != 13961) {
            field3928 = -98;
        }
        class299.field4879 = 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)V")
    public static final void method1667(int arg0, int arg1) {
        field3930++;
        int var2 = 127 / ((68 - arg0) / 46);
        class127.field2118.method98(1, arg1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([[II)V")
    public static final void method1668(int[][] arg0, int arg1) {
        class41.field630 = arg0;
        if (arg1 != 2) {
            field3928 = 74;
        }
        field3929++;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V")
    public class232() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(J)V")
    public class232(long arg0) {
        this.field3925 = arg0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILaj;)V")
    public static final void method1669(int arg0, class151 arg1) {
        class244.field4101 = arg1;
        if (arg0 <= 104) {
            method1668((int[][]) null, -14);
        }
        field3931++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZII)V")
    public static final void method1670(boolean arg0, int arg1, int arg2) {
        field3926++;
        class36 var3 = class136.method1013(6, arg1, (byte) -90);
        var3.method224(arg0);
        var3.field577 = arg2;
        if (arg0) {
            method1666(59, -67, -77, -46, 115);
        }
    }

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "(I)V")
    public static void method1671(int arg0) {
        field3932 = null;
        if (arg0 > -109) {
            method1667(64, -50);
        }
    }
}
