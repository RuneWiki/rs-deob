import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class166 {

    @OriginalMember(owner = "client!np", name = "i", descriptor = "Lgg;")
    private class114 field2127 = new class114(256);

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Lkha;")
    private class687 field2125;

    @OriginalMember(owner = "client!np", name = "e", descriptor = "[I")
    public static int[] field2123 = new int[8];

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 3)
    public static void method1028(int arg0) {
        if (arg0 != 2544) {
            field2123 = null;
        }
        field2123 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 13)
    public final void method1029(byte arg0) {
        class114 var2 = this.field2127;
        synchronized (this.field2127) {
            this.field2127.method776((byte) 113);
            int var3 = -64 % ((arg0 - 85) / 37);
        }
        field2126++;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[I[I)V", line = 30)
    public static final void method1030(int arg0, int[] arg1, int[] arg2) {
        field2122++;
        if (arg1 == null || arg2 == null) {
            class101.field1244 = null;
            class465.field6720 = null;
            class421.field5991 = null;
            return;
        }
        class421.field5991 = arg1;
        if (arg0 != 28548) {
            field2123 = null;
        }
        class101.field1244 = new int[arg1.length];
        class465.field6720 = new byte[arg1.length][][];
        for (int var3 = 0; var3 < class421.field5991.length; var3++) {
            class465.field6720[var3] = new byte[arg2[var3]][];
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V", line = 62)
    public final void method1031(int arg0) {
        field2119++;
        class114 var2 = this.field2127;
        synchronized (this.field2127) {
            this.field2127.method781((byte) 47);
            if (arg0 != 23722) {
                this.field2127 = null;
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V", line = 80)
    public final void method1032(int arg0, int arg1) {
        class114 var3 = this.field2127;
        synchronized (this.field2127) {
            this.field2127.method775(1, arg0);
        }
        field2120++;
        int var4 = -33 % ((arg1 - 9) / 34);
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Lrga;", line = 98)
    public final class65 method1033(int arg0, int arg1) {
        field2124++;
        class114 var3 = this.field2127;
        class65 var4;
        synchronized (this.field2127) {
            var4 = (class65) this.field2127.method778((long) arg0, -89);
        }
        if (var4 != null) {
            return var4;
        }
        class687 var5 = this.field2125;
        byte[] var6;
        synchronized (this.field2125) {
            var6 = this.field2125.method3810(arg1, -23360, arg0);
        }
        class65 var7 = new class65();
        if (var6 != null) {
            var7.method494(0, new class179(var6));
        }
        class114 var8 = this.field2127;
        synchronized (this.field2127) {
            this.field2127.method774((long) arg0, arg1 + 91, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Ldh;ILkha;)V", line = 128)
    public class166(class286 arg0, int arg1, class687 arg2) {
        this.field2125 = arg2;
        this.field2125.method3812(0, 26);
    }
}
