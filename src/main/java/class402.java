import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class402 {

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public int field5539 = 0;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public int field5551 = 0;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Laq;")
    private class494 field5537 = new class494(64);

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "Lfba;")
    private class627 field5553 = null;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "Lgga;")
    private class513 field5544;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Lgga;")
    private class513 field5538;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5541 = 1;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field5550 = -1;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field5546 = 2;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field5552 = new String[8];

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "Lvn;")
    public static class213 field5547;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "Les;")
    public static class273 field5548;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2387(byte arg0) {
        field5543++;
        class521.field7311.method2881((byte) -26);
        int var1 = -103 % ((arg0 - 37) / 53);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BLjava/lang/String;)V", line = 15)
    public static final void method2388(byte arg0, String arg1) {
        field5549++;
        class437.method2608("", arg1, 0, "", (byte) 120, "", 0);
        int var2 = 92 % ((arg0 + 65) / 34);
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(ILgga;Lgga;Lfba;)V", line = 146)
    public class402(int arg0, class513 arg1, class513 arg2, class627 arg3) {
        this.field5553 = arg3;
        this.field5544 = arg1;
        this.field5538 = arg2;
        if (this.field5544 != null) {
            this.field5539 = this.field5544.method3007(-1, 1);
        }
        if (this.field5538 != null) {
            this.field5551 = this.field5538.method3007(-1, 1);
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V", line = 38)
    public static void method2389(byte arg0) {
        field5548 = null;
        if (arg0 < -95) {
            field5552 = null;
            field5547 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lhk;[IJZ)Ljava/lang/String;", line = 50)
    public final String method2390(class153 arg0, int[] arg1, long arg2, boolean arg3) {
        field5545++;
        if (!arg3) {
            return null;
        }
        if (this.field5553 != null) {
            String var6 = this.field5553.method3102(false, arg1, arg0, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)Z", line = 71)
    public static final boolean method2391(int arg0, int arg1) {
        if (arg0 != -2) {
            method2387((byte) 43);
        }
        field5540++;
        return arg1 == 1 || arg1 == 3 || arg1 == 5;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)Liaa;", line = 101)
    public final class118 method2392(int arg0, int arg1) {
        field5542++;
        class118 var3 = (class118) this.field5537.method2882((long) arg0, (byte) -112);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field5544.method3019(1, arg0, 71);
        } else {
            var4 = this.field5538.method3019(1, arg0 & 0x7FFF, 103);
        }
        class118 var5 = new class118();
        var5.field2016 = this;
        if (arg1 != 32767) {
            return null;
        }
        if (var4 != null) {
            var5.method1039((byte) 81, new class431(var4));
        }
        if (arg0 >= 32768) {
            var5.method1043((byte) -17);
        }
        this.field5537.method2890(-7307, (long) arg0, var5);
        return var5;
    }
}
