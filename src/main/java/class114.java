import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class114 extends class20 {

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field1791;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field1788;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[I")
    public static int[] field1790 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1787 = "white:";

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 4)
    public static void method891(byte arg0) {
        field1787 = null;
        if (arg0 > -13) {
            field1787 = (String) null;
        }
        field1790 = null;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Ljava/lang/String;", line = 21)
    public static final String method892(int arg0) {
        field1794++;
        String var1 = "www";
        String var2 = "";
        if (class287.field4426 != null) {
            var2 = "/p=" + class287.field4426;
        }
        if (class20.field222 != arg0) {
            var1 = "www-wtqa";
        }
        return "http://" + var1 + ".runescape.com/l=" + class98.field1452 + "/a=" + class317.field4923 + var2 + "/";
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI)V", line = 45)
    public final void method143(int arg0, byte arg1, int arg2) {
        field1796++;
        int var4 = this.field1795 * arg2 >> 12;
        int var5 = this.field1788 * arg2 >> 12;
        int var6 = this.field1786 * arg0 >> 12;
        int var7 = this.field1791 * arg0 >> 12;
        if (arg1 >= -52) {
            method893((byte) -74, (String) null);
        }
        class132.method999(var6, var4, var5, this.field221, var7, 126);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLjava/lang/String;)I", line = 64)
    public static final int method893(byte arg0, String arg1) {
        if (arg0 < 92) {
            return -91;
        }
        field1789++;
        if (class213.field3390 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class213.field3390.field112; var2++) {
            if (class162.method1159(62, class13.method104(" ", class213.field3390.field119[var2], -8622, "<br>"), arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V", line = 99)
    public final void method139(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method144((byte) 98, 93, -66);
        }
        field1792++;
        int var4 = this.field1795 * arg1 >> 12;
        int var5 = this.field1788 * arg1 >> 12;
        int var6 = this.field1791 * arg0 >> 12;
        int var7 = this.field1786 * arg0 >> 12;
        class89.method725(this.field224, this.field219, (byte) 11, var5, var6, var7, var4);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BII)V", line = 120)
    public final void method144(byte arg0, int arg1, int arg2) {
        field1793++;
        int var4 = this.field1795 * arg2 >> 12;
        if (arg0 >= 116) {
            int var5 = this.field1788 * arg2 >> 12;
            int var6 = this.field1786 * arg1 >> 12;
            int var7 = this.field1791 * arg1 >> 12;
            class31.method220(var4, this.field219, var6, 26, this.field221, this.field224, var5, var7);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIIIII)V", line = 139)
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1791 = arg1;
        this.field1788 = arg2;
        this.field1795 = arg0;
        this.field1786 = arg3;
    }
}
