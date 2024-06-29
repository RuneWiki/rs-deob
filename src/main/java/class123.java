import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class123 extends class35 {

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field2122 = 0;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Lsl;")
    public static class39 field2125 = new class39(16);

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Z")
    public static volatile boolean field2130 = true;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2131 = "Loading textures - ";

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2127 = "yellow:";

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Ljava/lang/String;")
    public static String field2132 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "Lbm;")
    public static class307 field2128;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Z")
    public boolean field2126;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "[B")
    public static byte[] field2129;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(B)V", line = 5)
    public static void method796(byte arg0) {
        field2125 = null;
        field2128 = null;
        field2131 = null;
        field2132 = null;
        field2127 = null;
        field2129 = null;
        if (arg0 != 52) {
            field2129 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)Z", line = 22)
    public final boolean method797(int arg0) {
        field2121++;
        if (arg0 != -1) {
            field2130 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z", line = 33)
    public final boolean method798(int arg0) {
        field2124++;
        if (arg0 != 30890) {
            this.method797(119);
        }
        return this.field2126;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()I", line = 51)
    public int method90() {
        field2120++;
        return 0;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)Z", line = 62)
    public static final boolean method799(boolean arg0) {
        field2123++;
        if (arg0) {
            return true;
        } else if (class18.field327 == 0) {
            return class29.field561.method2220(-1901);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)I", line = 79)
    public final int method800(int arg0) {
        if (arg0 >= -103) {
            return -124;
        } else {
            field2119++;
            return 1;
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)Z", line = 90)
    public final boolean method801(int arg0) {
        if (arg0 != 16) {
            this.field2126 = false;
        }
        field2118++;
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V")
    public abstract void method88();

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V")
    public abstract void method87(int arg0);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V")
    public abstract void method91(int arg0, int arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public abstract void method92(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()Z")
    public abstract boolean method89();

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()Z")
    public abstract boolean method86();
}
