import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class35 {

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Z")
    public static boolean field514 = false;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field509 = 0;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "F")
    public static float field518;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Lth;")
    public static class57 field513;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/lang/Thread;")
    public static Thread field511;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field507;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILjava/lang/String;)V", line = 7)
    public static final void method237(int arg0, int arg1, String arg2) {
        class112.field1837++;
        class36.field520.method2228(127, 16547);
        if (arg0 != 0) {
            field513 = (class57) null;
        }
        field515++;
        class36.field520.method1712(class163.method1261(arg0 ^ 0x1, arg2) + 1, -115);
        class36.field520.method1767(false, arg1);
        class36.field520.method1709(arg2, (byte) 95);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 22)
    public static final void method238(byte arg0) {
        field510++;
        class118.field1998.method2327(arg0 - 57);
        class101.field1657.method2327(1);
        if (arg0 != 58) {
            method240(-28, -56);
        }
        class362.field5740.method2327(1);
        class230.field3831.method2327(1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 37)
    public static void method239(int arg0) {
        if (arg0 != 11450) {
            method238((byte) -60);
        }
        field507 = null;
        field513 = null;
        field511 = null;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)V", line = 54)
    public static final void method240(int arg0, int arg1) {
        class39.field574.method2334(4, arg1);
        if (arg0 != 7) {
            field513 = (class57) null;
        }
        field517++;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", line = 66)
    public static final void method241(int arg0, int arg1, String arg2, int arg3, String arg4, String arg5) {
        field516++;
        if (arg0 != 1) {
            method241(-77, 95, (String) null, -84, (String) null, (String) null);
        }
        class291.method2104(arg4, -89, arg2, (String) null, arg5, arg3, -1, arg1);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)Z", line = 78)
    public static final boolean method242(int arg0, int arg1, int arg2, int arg3) {
        if (class273.method2044(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class326.method2295(var4 + 1, class101.field1656[arg0][arg1][arg2] + arg3, var5 + 1) && class326.method2295(var4 + 128 - 1, class101.field1656[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class326.method2295(var4 + 128 - 1, class101.field1656[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class326.method2295(var4 + 1, class101.field1656[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
