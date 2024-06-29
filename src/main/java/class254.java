import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class254 extends class32 {

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public int field4546 = 12800;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "I")
    public int field4548 = -1;

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public int field4550 = -1;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "Z")
    public boolean field4547 = true;

    @OriginalMember(owner = "client!ta", name = "R", descriptor = "I")
    public int field4556 = 12800;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public int field4551 = 0;

    @OriginalMember(owner = "client!ta", name = "Q", descriptor = "I")
    public int field4555 = 0;

    @OriginalMember(owner = "client!ta", name = "O", descriptor = "I")
    public int field4553;

    @OriginalMember(owner = "client!ta", name = "T", descriptor = "Lqk;")
    public class207 field4558;

    @OriginalMember(owner = "client!ta", name = "S", descriptor = "Lqk;")
    public class207 field4557;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "Ldd;")
    public class132 field4549;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field4543 = 0;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!ta", name = "N", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!ta", name = "P", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!ta", name = "U", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!ta", name = "W", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!ta", name = "X", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!ta", name = "V", descriptor = "Lmd;")
    public static class220 field4560;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V")
    public static final void method1766(byte arg0) {
        if (arg0 == -114) {
            field4545++;
            class160.field2830.method1390((byte) 110);
            class191.field3373.method1390((byte) 116);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Z")
    public final boolean method1767(int arg0, int arg1, int arg2) {
        field4554++;
        if (arg0 < this.field4546 || arg0 > this.field4551 || this.field4556 > arg1 || this.field4555 < arg1) {
            return false;
        }
        if (arg2 != -1) {
            this.method1767(34, 36, -76);
        }
        for (class282 var4 = (class282) this.field4549.method922((byte) 116); var4 != null; var4 = (class282) this.field4549.method928(107)) {
            if (var4.method1915(arg0, arg2 + 501, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)V")
    public final void method1768(int arg0) {
        this.field4546 = 12800;
        this.field4556 = 12800;
        this.field4555 = 0;
        this.field4551 = 0;
        field4562++;
        if (arg0 >= -123) {
            return;
        }
        for (class282 var2 = (class282) this.field4549.method922((byte) 117); var2 != null; var2 = (class282) this.field4549.method928(97)) {
            if (this.field4551 < var2.field4947) {
                this.field4551 = var2.field4947;
            }
            if (var2.field4950 > this.field4555) {
                this.field4555 = var2.field4950;
            }
            if (this.field4556 > var2.field4946) {
                this.field4556 = var2.field4946;
            }
            if (var2.field4955 < this.field4546) {
                this.field4546 = var2.field4955;
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILwc;)V")
    public static final void method1769(int arg0, class229 arg1) {
        if (arg0 != 255) {
            return;
        }
        field4552++;
        class104 var2 = null;
        try {
            class96 var3 = arg1.method1633("runescape", (byte) -117);
            while (var3.field1696 == 0) {
                class153.method1098((byte) 76, 1L);
            }
            if (var3.field1696 == 1) {
                var2 = (class104) var3.field1699;
                class149 var4 = class209.method1477(arg0 - 255);
                var2.method753((byte) 98, 0, var4.field2568, var4.field2593);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method751((byte) 36);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BZ)V")
    public static final void method1770(byte arg0, boolean arg1) {
        class133.field2316 = new int[104];
        class282.field4961 = new int[104];
        class131.field2268 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class217.field3850 = new int[104];
        class255.field4563 = new byte[var2][104][104];
        class32.field647 = 99;
        class163.field2875 = new byte[var2][104][104];
        class92.field1632 = new byte[var2][104][104];
        class192.field3384 = new int[var2][105][105];
        int var3 = -120 / ((-arg0 - 3) / 42);
        class278.field4881 = new int[104];
        class43.field855 = new byte[var2][105][105];
        class266.field4719 = new byte[var2][104][104];
        field4559++;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public static void method1771(int arg0) {
        field4560 = null;
        if (arg0 != 15295) {
            field4560 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lqk;Lqk;IIIZI)V")
    public class254(class207 arg0, class207 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field4553 = arg2;
        this.field4558 = arg1;
        this.field4548 = arg4;
        this.field4547 = arg5;
        this.field4557 = arg0;
        this.field4550 = arg6;
        if (this.field4550 == 255) {
            this.field4550 = 0;
        }
        this.field4544 = arg3;
        this.field4549 = new class132();
    }
}
