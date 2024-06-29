import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class469 {

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "Lde;")
    private class534 field6282 = new class534(256);

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "Lnd;")
    private class547 field6288;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6287 = new String[100];

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "[I")
    public static int[] field6281 = new int[2];

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Len;")
    public static class322 field6283 = new class322();

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)V", line = 8)
    public final void method2664(boolean arg0) {
        field6292++;
        class534 var2 = this.field6282;
        synchronized (this.field6282) {
            this.field6282.method3064(!arg0);
        }
        if (!arg0) {
            method2667((byte) -98);
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)Lhq;", line = 25)
    public final class161 method2665(int arg0, int arg1) {
        if (arg1 != -1026) {
            method2670(-8, 26);
        }
        field6286++;
        class534 var3 = this.field6282;
        class161 var4;
        synchronized (this.field6282) {
            var4 = (class161) this.field6282.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field6288;
        byte[] var6;
        synchronized (this.field6288) {
            var6 = this.field6288.method3153(arg0, arg1 + 1026, 26);
        }
        class161 var7 = new class161();
        if (var6 != null) {
            var7.method1130(arg1 + 1026, new class461(var6));
        }
        class534 var8 = this.field6282;
        synchronized (this.field6282) {
            this.field6282.method3077((byte) -62, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Lrl;I)I", line = 56)
    public static final int method2666(class724 arg0, int arg1) {
        field6284++;
        int var2 = arg0.field10088;
        class738 var3 = arg0.method94((byte) -123);
        if (arg0.field215 == -1 || arg0.field239) {
            var2 = arg0.field10095;
        } else if (arg0.field215 == var3.field10285 || arg0.field215 == var3.field10286 || arg0.field215 == var3.field10268 || arg0.field215 == var3.field10267) {
            var2 = arg0.field10069;
        } else if (arg0.field215 == var3.field10276 || arg0.field215 == var3.field10259 || arg0.field215 == var3.field10251 || arg0.field215 == var3.field10279) {
            var2 = arg0.field10093;
        }
        if (arg1 != -28557) {
            field6293 = 14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 90)
    public static void method2667(byte arg0) {
        field6287 = null;
        if (arg0 < 59) {
            method2666(null, 84);
        }
        field6283 = null;
        field6281 = null;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IB)V", line = 103)
    public final void method2668(int arg0, byte arg1) {
        int var3 = -53 % ((60 - arg1) / 58);
        field6290++;
        class534 var4 = this.field6282;
        synchronized (this.field6282) {
            this.field6282.method3070(arg0, 126);
        }
    }

    @OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lal;ILnd;)V", line = 137)
    public class469(class102 arg0, int arg1, class547 arg2) {
        this.field6288 = arg2;
        this.field6288.method3178((byte) 85, 26);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V", line = 125)
    public final void method2669(int arg0) {
        class534 var2 = this.field6282;
        synchronized (this.field6282) {
            this.field6282.method3065(true);
            if (arg0 != -1) {
                field6287 = null;
            }
        }
        field6289++;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(II)I", line = 155)
    public static final int method2670(int arg0, int arg1) {
        if (arg1 != 127) {
            method2667((byte) 124);
        }
        field6291++;
        return arg0 & 0x7F;
    }
}
