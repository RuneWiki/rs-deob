import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class213 extends class665 {

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public int field3109 = -1;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public int field3111 = 12800;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Z")
    public boolean field3114 = true;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field3112 = -1;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public int field3121 = 0;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public int field3125 = 0;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public int field3108 = 12800;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field3110;

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "Ljava/lang/String;")
    public String field3119;

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public int field3123;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "Ljava/lang/String;")
    public String field3126;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "Lsu;")
    public class192 field3118;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "Lfc;")
    public static class235 field3107 = new class235(37, -2);

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Llaa;")
    public static class106 field3120 = new class106(15, 0, 1, 0);

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)V", line = 3)
    public static void method1392(boolean arg0) {
        field3120 = null;
        if (!arg0) {
            field3107 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[IIB)Z", line = 16)
    public final boolean method1393(int arg0, int[] arg1, int arg2, byte arg3) {
        field3117++;
        for (class125 var5 = (class125) this.field3118.method1270((byte) -25); var5 != null; var5 = (class125) this.field3118.method1282(arg3 ^ 0x6B)) {
            if (var5.method889(arg0, (byte) -85, arg2)) {
                var5.method891(arg0, arg1, 1, arg2);
                return true;
            }
        }
        if (arg3 != 107) {
            field3107 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)Z", line = 46)
    public final boolean method1394(int arg0, int arg1, int arg2) {
        field3124++;
        class125 var4 = (class125) this.field3118.method1270((byte) -25);
        if (arg0 <= 110) {
            return false;
        }
        while (var4 != null) {
            if (var4.method889(arg2, (byte) -103, arg1)) {
                return true;
            }
            var4 = (class125) this.field3118.method1282(0);
        }
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 68)
    public final void method1395(byte arg0) {
        this.field3108 = 12800;
        this.field3125 = 0;
        this.field3111 = 12800;
        field3122++;
        this.field3121 = 0;
        for (class125 var2 = (class125) this.field3118.method1270((byte) -25); var2 != null; var2 = (class125) this.field3118.method1282(0)) {
            if (this.field3111 > var2.field1731) {
                this.field3111 = var2.field1731;
            }
            if (this.field3108 > var2.field1730) {
                this.field3108 = var2.field1730;
            }
            if (this.field3125 < var2.field1734) {
                this.field3125 = var2.field1734;
            }
            if (var2.field1737 > this.field3121) {
                this.field3121 = var2.field1737;
            }
        }
        if (arg0 != 4) {
            this.field3108 = 62;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI[II)Z", line = 107)
    public final boolean method1396(int arg0, byte arg1, int arg2, int[] arg3, int arg4) {
        field3113++;
        if (arg1 <= 53) {
            return false;
        }
        for (class125 var6 = (class125) this.field3118.method1270((byte) -25); var6 != null; var6 = (class125) this.field3118.method1282(0)) {
            if (var6.method888((byte) -113, arg0, arg4, arg2)) {
                var6.method891(arg0, arg3, 1, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II[II)Z", line = 143)
    public final boolean method1397(int arg0, int arg1, int[] arg2, int arg3) {
        field3115++;
        if (arg3 != 0) {
            field3120 = null;
        }
        for (class125 var5 = (class125) this.field3118.method1270((byte) -25); var5 != null; var5 = (class125) this.field3118.method1282(0)) {
            if (var5.method893(104, arg1, arg0)) {
                var5.method892(arg0, 0, arg1, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 222)
    public class213(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field3112 = arg4;
        this.field3110 = arg0;
        this.field3109 = arg6;
        this.field3119 = arg2;
        this.field3114 = arg5;
        this.field3123 = arg3;
        this.field3126 = arg1;
        if (this.field3109 == 255) {
            this.field3109 = 0;
        }
        this.field3118 = new class192();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 180)
    public static final void method1398(int arg0) {
        field3127++;
        if (arg0 >= -1) {
            return;
        }
        int var1 = (int) ((double) class86.field1185 * 34.46D);
        int var2 = var1 << 2;
        if (class630.field8790.method407()) {
            var2 += 512;
        }
        class630.field8790.method428(200, var2);
    }
}
