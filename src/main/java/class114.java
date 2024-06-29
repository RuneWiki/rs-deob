import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class114 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field1741 = -1;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field1738 = 0;

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "[Lfl;")
    public static class248[] field1749 = new class248[2048];

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "I")
    public static int field1746 = 0;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field1750 = 0;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 >= class248.field3765 && arg4 <= class163.field2505 && arg2 >= class243.field3635 && arg0 <= class118.field1782) {
            if (arg1 == 1) {
                class6.method33(arg3, (byte) -67, arg4, arg2, arg0, arg5);
            } else {
                class56.method382(arg4, arg0, arg2, arg1, arg3, arg6 ^ 0xFFFFE985, arg5);
            }
        } else if (arg1 == 1) {
            class217.method1387(arg5, arg3, arg2, arg0, arg4, arg6 + 5642);
        } else {
            class215.method1380(arg1, arg4, arg5, arg3, arg2, arg0, -91);
        }
        field1745++;
        if (arg6 != -5755) {
            method735((byte) -123);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIIIIJILs;)V")
    public abstract void method90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class245 arg10);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)I")
    public static final int method734(int arg0, int arg1) {
        if (arg1 < 74) {
            return -33;
        }
        int var2 = 0;
        field1748++;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "()I")
    public abstract int method81();

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method735(byte arg0) {
        field1749 = null;
        if (arg0 != 11) {
            field1744 = 72;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lsk;IIIZ)V")
    public void method736(class114 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1742++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)Lsk;")
    public class114 method737(int arg0, int arg1, int arg2) {
        field1747++;
        return this;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "()Z")
    public boolean method738() {
        field1740++;
        return false;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIII)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3, int arg4);
}
