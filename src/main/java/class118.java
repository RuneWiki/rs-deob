import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class118 {

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "Lqr;")
    private class65 field1895 = new class65(64);

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "Lwu;")
    private class376 field1899;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Lkaa;")
    public static class47 field1894 = new class47(49, 6);

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "[I")
    public static int[] field1902 = new int[14];

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1903 = 0;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IB)V", line = 3)
    public final void method961(int arg0, byte arg1) {
        field1897++;
        if (arg1 > -70) {
            this.method962(-40, 61);
        }
        class65 var3 = this.field1895;
        synchronized (this.field1895) {
            this.field1895.method553(arg0, -15782);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)Len;", line = 16)
    public final class323 method962(int arg0, int arg1) {
        field1901++;
        if (arg0 <= 59) {
            field1903 = -17;
        }
        class65 var3 = this.field1895;
        class323 var4;
        synchronized (this.field1895) {
            var4 = (class323) this.field1895.method552(4, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class376 var5 = this.field1899;
        byte[] var6;
        synchronized (this.field1899) {
            var6 = this.field1899.method2218((byte) 125, 31, arg1);
        }
        class323 var7 = new class323();
        if (var6 != null) {
            var7.method1955(new class677(var6), true);
        }
        class65 var8 = this.field1895;
        synchronized (this.field1895) {
            this.field1895.method556((byte) 0, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)V", line = 51)
    public final void method963(byte arg0) {
        class65 var2 = this.field1895;
        synchronized (this.field1895) {
            this.field1895.method561((byte) -78);
            int var3 = -24 % ((34 - arg0) / 48);
        }
        field1896++;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V", line = 65)
    public static void method964(int arg0) {
        field1902 = null;
        field1894 = null;
        if (arg0 < 24) {
            method966(123, true);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V", line = 78)
    public final void method965(byte arg0) {
        int var2 = -104 / ((arg0 + 21) / 47);
        class65 var3 = this.field1895;
        synchronized (this.field1895) {
            this.field1895.method558(0);
        }
        field1900++;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(Lms;ILwu;)V", line = 112)
    public class118(class763 arg0, int arg1, class376 arg2) {
        this.field1899 = arg2;
        this.field1899.method2195(31, 0);
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IZ)V", line = 127)
    public static final void method966(int arg0, boolean arg1) {
        field1898++;
        if (class709.field9835 == arg0) {
            return;
        }
        class719.field10004 = class107.field1453 = class582.field7630[arg0];
        class1.method2((byte) -118);
        class689.field9589 = new int[class719.field10004][class107.field1453];
        class447.field6131 = new int[4][class719.field10004 >> 3][class107.field1453 >> 3];
        class562.field7369 = new int[class719.field10004][class107.field1453];
        for (int var2 = 0; var2 < 4; var2++) {
            class456.field6226[var2] = class84.method647(class719.field10004, class107.field1453, 0);
        }
        class77.field943 = new byte[4][class719.field10004][class107.field1453];
        class628.method3463(class719.field10004, class107.field1453, 4, (byte) 50);
        if (!arg1) {
            field1903 = -4;
        }
        class507.method2849(class107.field1453 >> 3, class341.field4807, 5, class719.field10004 >> 3);
        class709.field9835 = arg0;
    }
}
