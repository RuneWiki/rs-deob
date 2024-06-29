import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class59 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Li;")
    public static class88 field1106 = class208.method1425(105, "compass");

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Li;")
    private static class88 field1108 = class208.method1425(105, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[Z")
    public static boolean[] field1120 = new boolean[200];

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Li;")
    public static class88 field1117 = field1108;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Li;")
    public static class88 field1119 = class208.method1425(105, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Li;")
    public static class88 field1118 = class208.method1425(105, "zap");

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Li;")
    public static class88 field1113 = class208.method1425(105, "");

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "D")
    public static double field1110;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Lnb;")
    public static class144 field1114;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1112;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class59() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)Z")
    public static final boolean method423(int arg0, int arg1) {
        int var2 = -23 / ((arg1 - 37) / 39);
        field1116++;
        return (arg0 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lea;Z[B)V")
    public final void method424(class46 arg0, boolean arg1, byte[] arg2) {
        field1109++;
        if (arg0.field842[arg0.field831] != 31 || arg0.field842[arg0.field831 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1112 == null) {
            this.field1112 = new Inflater(true);
        }
        try {
            this.field1112.setInput(arg0.field842, arg0.field831 + 10, arg0.field842.length - arg0.field831 - 18);
            this.field1112.inflate(arg2);
        } catch (Exception var4) {
            this.field1112.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg1) {
            method423(3, 37);
        }
        this.field1112.reset();
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method425(byte arg0) {
        field1106 = null;
        field1120 = null;
        field1117 = null;
        field1118 = null;
        field1113 = null;
        field1119 = null;
        if (arg0 > -111) {
            method427(38, 61);
        }
        field1108 = null;
        field1114 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)V")
    public static final void method426(int arg0, int arg1, int arg2) {
        long var3 = (long) ((arg0 << 16) + arg2);
        field1115++;
        class97 var5 = (class97) class205.field3909.method1051(-1, var3);
        if (var5 != null) {
            class138.field2561.method1390(var5, (byte) 43);
            if (arg1 < 114) {
                field1113 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)Lwh;")
    public static final class247 method427(int arg0, int arg1) {
        field1107++;
        class247 var2 = (class247) class33.field555.method666((long) arg0, arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class18.field300.method941((byte) 56, 0, arg0);
        if (var3 == null) {
            return null;
        }
        class247 var4 = new class247();
        class46 var5 = new class46(var3);
        var5.field831 = var5.field842.length - 2;
        int var6 = var5.method301(31);
        int var7 = var5.field842.length - var6 - 2 - 12;
        var5.field831 = var7;
        int var8 = var5.method323((byte) -34);
        var4.field4528 = var5.method301(arg1 + 16);
        var4.field4519 = var5.method301(arg1 ^ 0x34);
        var4.field4522 = var5.method301(arg1 ^ 0x33);
        var4.field4520 = var5.method301(24);
        int var9 = var5.method347(arg1 + 26119);
        if (var9 > 0) {
            var4.field4516 = new class154[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method301(119);
                class154 var12 = new class154(class184.method1298(true, var11));
                var4.field4516[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method323((byte) -107);
                    int var14 = var5.method323((byte) -62);
                    var12.method1054((long) var13, new class192(var14), ~arg1);
                }
            }
        }
        int var15 = 0;
        var5.field831 = 0;
        var4.field4532 = var5.method353(arg1 ^ 0x39);
        var4.field4524 = new class88[var8];
        var4.field4521 = new int[var8];
        var4.field4523 = new int[var8];
        while (var7 > var5.field831) {
            int var16 = var5.method301(70);
            if (var16 == 3) {
                var4.field4524[var15] = var5.method298(-128);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field4523[var15] = var5.method347(26119);
            } else {
                var4.field4523[var15] = var5.method323((byte) -128);
            }
            var4.field4521[var15++] = var16;
        }
        class33.field555.method664((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(III)V")
    private class59(int arg0, int arg1, int arg2) {
    }
}
