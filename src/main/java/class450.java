import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class450 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field6117 = -1;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "Lld;")
    public static class105 field6121 = new class105();

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lgd;")
    public static class206 field6123 = new class206("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "Lld;")
    public static class105 field6124 = new class105();

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field6114;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field6125;

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V", line = 6)
    public class450() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZII)V", line = 10)
    public static final void method2645(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 >= class221.field2942 && arg3 <= class205.field2784) {
            int var5 = class309.method1706(class425.field5751, arg0, 6798, class136.field1985);
            int var6 = class309.method1706(class425.field5751, arg4, 6798, class136.field1985);
            class313.method1715(arg3, arg1, var6, var5, 5);
        }
        if (arg2) {
            method2650((byte) -69, -32);
        }
        field6120++;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIZBI)V", line = 30)
    public static final void method2646(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field6122++;
        if (arg3 >= -7) {
            field6117 = -100;
        }
        if (class492.method2867(arg1, (byte) 78)) {
            class37.method276(arg2, arg0, -1, class146.field2099[arg1], false, arg4);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "([BILbt;)V", line = 45)
    public final void method2647(byte[] arg0, int arg1, class32 arg2) {
        field6119++;
        if (arg2.field472[arg2.field456] != 31 || arg2.field472[arg2.field456 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field6114 == null) {
            this.field6114 = new Inflater(true);
        }
        try {
            this.field6114.setInput(arg2.field472, arg2.field456 + 10, -arg2.field456 + -18 + arg2.field472.length);
            this.field6114.inflate(arg0);
        } catch (Exception var4) {
            this.field6114.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field6114.reset();
        if (arg1 <= 44) {
            method2651(83);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)Lgg;", line = 72)
    public static final class106 method2648(int arg0) {
        int var1 = -91 % ((arg0 + 11) / 62);
        field6118++;
        class106 var2 = (class106) class11.field140.method332(17948);
        if (var2 != null) {
            var2.method2614((byte) -122);
            var2.method2441((byte) -88);
            return var2;
        }
        class106 var3;
        do {
            var3 = (class106) class351.field4877.method332(17948);
            if (var3 == null) {
                return null;
            }
            if (var3.method655(true) > class440.method2583(25267)) {
                return null;
            }
            var3.method2614((byte) -91);
            var3.method2441((byte) -94);
        } while ((var3.field5532 & Long.MIN_VALUE) == 0L);
        return var3;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBI)V", line = 113)
    public static final void method2649(int arg0, int arg1, byte arg2, int arg3) {
        field6113++;
        if (arg2 >= -67) {
            method2652(6);
        }
        class106 var4 = class250.method1400(11, 92, arg3);
        var4.method658(0);
        var4.field1590 = arg1;
        var4.field1589 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V", line = 130)
    public static final void method2650(byte arg0, int arg1) {
        field6112++;
        if (arg0 >= -53) {
            method2646(48, -25, false, (byte) -4, -2);
        }
        class106 var2 = class250.method1400(16, 88, arg1);
        var2.method659(123);
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 144)
    public static final void method2651(int arg0) {
        field6116++;
        if (arg0 != -18461) {
            field6123 = null;
        }
        if (!class373.method2295(1323)) {
            return;
        }
        if (class471.field6495 == null) {
            class266.method1500((byte) -48);
        }
        class175.field2390 = new int[100];
        class38.field560 = 0;
        class138.field2010 = new int[100];
        class377.field5193 = new int[100];
        class377.field5196 = new int[100];
        class307.field4055 = true;
        for (int var1 = 0; var1 < 100; var1++) {
            class377.field5196[var1] = (int) ((double) class424.field5738 * Math.random()) << 4;
            class377.field5193[var1] = (int) (Math.random() * 350.0D) << 4;
            class138.field2010[var1] = (int) (Math.random() * 102.0D) + 51;
            class175.field2390[var1] = (int) (Math.random() * 48.0D) + 8;
        }
        try {
            class298.field3995 = class6.field81.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V", line = 187)
    public static void method2652(int arg0) {
        field6124 = null;
        field6125 = null;
        field6121 = null;
        if (arg0 == 102) {
            field6123 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(III)V", line = 202)
    private class450(int arg0, int arg1, int arg2) {
    }
}
