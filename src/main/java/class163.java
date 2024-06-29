import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class163 extends class324 {

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public int field2001;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public int field1993;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Z")
    public boolean field2000;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public int field2002;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public int field2003;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public int field2005;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "[Z")
    public static boolean[] field1994 = new boolean[200];

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Z")
    public static boolean field2004 = false;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "[I")
    public static int[] field2006 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method945(boolean arg0, String arg1, int arg2) {
        if (!arg0) {
            field1994 = null;
        }
        class117.method726("", -1, 0, arg1, "", arg2, "");
        field1997++;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(Z)V")
    public static final void method946(boolean arg0) {
        field1995++;
        class657.method3753(arg0, -39);
        if (class26.field270 >= 0 && class26.field270 != 0) {
            class418.method2644(class26.field270, (byte) 80);
            class26.field270 = -1;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZI)V")
    public static final void method947(boolean arg0, int arg1) {
        field1996++;
        class95.field1124.method1811((byte) 111, arg1);
        class460.field6862.method1811((byte) -38, arg1);
        class257.field3660.method1811((byte) -98, arg1);
        if (arg0) {
            class30.field347.method1811((byte) 123, arg1);
            class655.field9433.method1811((byte) 119, arg1);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static final void method948(int arg0) {
        class414.field6281 = null;
        if (arg0 != 6543) {
            return;
        }
        field1999++;
        class266.method1751(class298.field4407, 0, class518.field7542, 0, class581.field8366, -1, 0, 0, -6102);
        if (class414.field6281 != null) {
            class390.method2513(class273.field3821.field8576, 1, class477.field7039, -1412584499, 0, 0, class581.field8366, class298.field4407, class547.field7836, class414.field6281);
            class414.field6281 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method949(byte arg0) {
        field2006 = null;
        if (arg0 != 98) {
            method946(false);
        }
        field1994 = null;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZII)I")
    public static final int method950(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            return -46;
        }
        int var4 = arg3 & 0x3;
        field1998++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIIZ)V")
    public class163(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2001 = arg3;
        this.field1993 = arg1;
        this.field2000 = arg5;
        this.field2002 = arg0;
        this.field2003 = arg2;
        this.field2005 = arg4;
    }
}
