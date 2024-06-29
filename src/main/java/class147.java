import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class147 {

    @OriginalMember(owner = "client!nt", name = "g", descriptor = "Ljp;")
    private class236 field2079 = new class236(128);

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "Ljp;")
    public class236 field2084 = new class236(64);

    @OriginalMember(owner = "client!nt", name = "i", descriptor = "Lpc;")
    public class473 field2081;

    @OriginalMember(owner = "client!nt", name = "e", descriptor = "Lpc;")
    private class473 field2077;

    @OriginalMember(owner = "client!nt", name = "j", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2082 = new CRC32();

    @OriginalMember(owner = "client!nt", name = "k", descriptor = "[[[I")
    public static int[][][] field2083 = new int[2][][];

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!nt", name = "d", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!nt", name = "h", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V", line = 3)
    public static void method1008(int arg0) {
        field2082 = null;
        if (arg0 == 64) {
            field2083 = null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIZ)V", line = 19)
    public final void method1009(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field2079 = null;
        }
        this.field2079 = new class236(arg0);
        field2076++;
        this.field2084 = new class236(arg1);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V", line = 33)
    public static final void method1010(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 30756) {
            field2083 = null;
        }
        field2080++;
        class149 var4 = class259.field3425[arg0][arg2];
        class39.method292(arg3 - 59404, arg1, var4 == null ? class200.field2779 : var4);
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IB)V", line = 49)
    public final void method1011(int arg0, byte arg1) {
        field2086++;
        class236 var3 = this.field2079;
        synchronized (this.field2079) {
            this.field2079.method1461(-5, arg0);
        }
        class236 var4 = this.field2084;
        synchronized (this.field2084) {
            if (arg1 != 114) {
                field2085 = 55;
            }
            this.field2084.method1461(-5, arg0);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Z)V", line = 65)
    public final void method1012(boolean arg0) {
        field2074++;
        class236 var2 = this.field2079;
        synchronized (this.field2079) {
            this.field2079.method1459(19088);
        }
        class236 var3 = this.field2084;
        synchronized (this.field2084) {
            this.field2084.method1459(19088);
            if (!arg0) {
                this.field2079 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(I)V", line = 83)
    public final void method1013(int arg0) {
        if (arg0 < 14) {
            this.method1009(-118, -126, true);
        }
        class236 var2 = this.field2079;
        synchronized (this.field2079) {
            this.field2079.method1458((byte) 103);
        }
        field2075++;
        class236 var3 = this.field2084;
        synchronized (this.field2084) {
            this.field2084.method1458((byte) 73);
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Lfh;", line = 99)
    public final class460 method1014(int arg0, int arg1) {
        field2073++;
        class236 var3 = this.field2079;
        class460 var4;
        synchronized (this.field2079) {
            var4 = (class460) this.field2079.method1456((long) arg0, 123);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2077.method2708(36, arg0, (byte) 54);
        class460 var6 = new class460();
        var6.field6344 = this;
        var6.field6339 = arg0;
        if (var5 != null) {
            var6.method2613(new class379(var5), -104);
        }
        if (arg1 != -22947) {
            this.method1014(-86, -111);
        }
        var6.method2620(2);
        class236 var7 = this.field2079;
        synchronized (this.field2079) {
            this.field2079.method1462(var6, (long) arg0, -95);
            return var6;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lrb;ILpc;Lpc;)V", line = 149)
    public class147(class234 arg0, int arg1, class473 arg2, class473 arg3) {
        this.field2081 = arg3;
        this.field2077 = arg2;
        this.field2077.method2710(36, (byte) -100);
    }
}
