import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class219 {

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "Lcr;")
    public static class189 field2901 = new class189(4);

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "Lcr;")
    public static class189 field2902 = new class189(8);

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "[Lfd;")
    public static class194[] field2903 = new class194[8];

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "S")
    public static short field2904 = 320;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 8)
    public static void method1280(byte arg0) {
        field2901 = null;
        field2903 = null;
        int var1 = -68 / ((arg0 - 55) / 44);
        field2902 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILck;)V", line = 24)
    public static final void method1281(int arg0, class351 arg1) {
        class12.field205[arg0] = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lur;Lur;IZIZI)I", line = 28)
    public static final int method1282(class92 arg0, class92 arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        field2896++;
        int var7 = class207.method1222(arg1, arg0, arg5, arg6, (byte) 88);
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class207.method1222(arg1, arg0, arg3, arg4, (byte) 117);
            if (arg2 == 29995) {
                return arg3 ? -var8 : var8;
            } else {
                return 13;
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lfh;BLlm;)V", line = 61)
    public static final void method1283(class210 arg0, byte arg1, class347 arg2) {
        class89.field1253 = arg0;
        if (arg1 > -5) {
            field2903 = null;
        }
        class213.field2854 = arg2;
        field2899++;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(II)V", line = 73)
    public static final void method1284(int arg0, int arg1) {
        class167.field2249 = arg0;
        field2898++;
        class189 var2 = class143.field1939;
        synchronized (class143.field1939) {
            class143.field1939.method1141(256);
        }
        class189 var3 = class211.field2822;
        synchronized (class211.field2822) {
            class211.field2822.method1141(arg1 + 248);
            if (arg1 != 8) {
                method1280((byte) 77);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILjava/lang/String;)V", line = 95)
    public static final void method1285(int arg0, String arg1) {
        field2897++;
        System.out.println("Bad " + arg1 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        int var2 = -66 / ((-arg0 - 14) / 58);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)J")
    public abstract long method370(int arg0);

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)I")
    public abstract int method369(int arg0, int arg1);

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public abstract void method371(int arg0);
}
