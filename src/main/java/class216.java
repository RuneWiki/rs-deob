import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class216 extends class146 implements class46 {

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field3005;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Ltl;")
    public static class91 field2998 = new class91(new byte[5000]);

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "[[I")
    public static int[][] field3007 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "[Lf;")
    public static class191[] field3001;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[BII)V", line = 9)
    public final void method345(int arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = -72 / ((-13 - arg0) / 55);
        ++field3002;
        this.method969(false, arg1, arg2);
        this.field3005 = arg3;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lbv;ILjaggl/memory/NativeBuffer;IZ)V", line = 22)
    public class216(class282 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3005 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I", line = 30)
    public final int method346(int arg0) {
        ++field2996;
        int var2 = -112 / ((76 - arg0) / 39);
        return this.field3005;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V", line = 40)
    public static void method1468(byte arg0) {
        field2998 = null;
        field3001 = null;
        if (arg0 != 38) {
            method1468((byte) -25);
        }
        field3007 = null;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lbv;I[BIZ)V", line = 52)
    public class216(class282 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field3005 = arg1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)J", line = 60)
    public final long method347(byte arg0) {
        ++field2999;
        return arg0 != -93 ? 28L : 0L;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V", line = 73)
    public final void method971(boolean arg0) {
        if (arg0) {
            this.method348(false);
        }
        ++field3004;
        super.field2098.method1849(true, this);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)I", line = 84)
    public final int method348(boolean arg0) {
        if (!arg0) {
            this.method346(-97);
        }
        ++field3006;
        return super.field2096;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjb;B)I", line = 95)
    public static final int method1469(int arg0, class499 arg1, byte arg2) {
        ++field3003;
        if (!client.method450(arg1).method2398(arg0, -27896) && arg1.field7381 == null) {
            return -1;
        } else {
            if (arg2 != 25) {
                method1469(123, (class499) null, (byte) -51);
            }
            return arg1.field7341 != null && ~arg0 > ~arg1.field7341.length ? arg1.field7341[arg0] : -1;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZLhu;ZLjava/lang/String;)V", line = 110)
    public static final void method1470(boolean arg0, boolean arg1, class469 arg2, boolean arg3, String arg4) {
        ++field3000;
        if (!arg0) {
            method1469(122, (class499) null, (byte) -18);
        }
        if (!arg1) {
            class138.method916(true, 3, arg2, arg4);
        } else {
            if (class469.field6843.startsWith("win") && ~class469.field6854 != -4) {
                String var5 = null;
                if (arg2.field6861 != null) {
                    var5 = arg2.field6861.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class125 var6 = class138.method916(arg0, 0, arg2, arg4);
                    class477.field6937 = arg2;
                    class508.field7556 = var6;
                    class295.field4370 = arg4;
                    return;
                }
            }
            if (class469.field6843.startsWith("mac")) {
                String var7 = null;
                if (arg2.field6861 != null) {
                    var7 = arg2.field6861.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class138.method916(true, 1, arg2, arg4);
                    return;
                }
            }
            class138.method916(arg0, 2, arg2, arg4);
        }
    }
}
