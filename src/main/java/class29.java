import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 extends class191 {

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "Loh;")
    public static class263 field727 = class253.method1681(-124, "0(U");

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field728 = 0;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field729 = 0;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field738 = 3353893;

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "I")
    public int field734;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!fb", name = "bb", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!fb", name = "eb", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "J")
    public static long field733;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "Lnk;")
    public static class125 field732;

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lnf;")
    public static class155 field731;

    @OriginalMember(owner = "client!fb", name = "db", descriptor = "Lkb;")
    public class51 field741;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "Z")
    public static boolean field730;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "[B")
    public byte[] field737;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIII)V")
    public static final void method190(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 3) {
            method192((byte) 99);
        }
        if (~arg3 < ~arg4) {
            class191.method1255(arg4, arg0, arg3, 105, class38.field870[arg1]);
        } else {
            class191.method1255(arg3, arg0, arg4, arg2 ^ 103, class38.field870[arg1]);
        }
        ++field740;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
    public static final int method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 3;
        ++field742;
        if ((arg3 & 1) == 1) {
            int var8 = arg1;
            arg1 = arg6;
            arg6 = var8;
        }
        if (~var7 == arg0) {
            return arg5;
        } else if (var7 == 1) {
            return arg4;
        } else {
            return var7 == 2 ? -arg1 - -1 + -arg5 + 7 : 7 - arg4 + 1 + -arg6;
        }
    }

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "(B)V")
    public static void method192(byte arg0) {
        field732 = null;
        field727 = null;
        if (arg0 <= -74) {
            field731 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)I")
    public final int method180(byte arg0) {
        ++field735;
        if (arg0 != -109) {
            return 55;
        } else {
            return super.field3427 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)[B")
    public final byte[] method179(int arg0) {
        ++field739;
        if (super.field3427) {
            throw new RuntimeException();
        } else {
            if (arg0 != 1) {
                this.method179(-92);
            }
            return this.field737;
        }
    }
}
