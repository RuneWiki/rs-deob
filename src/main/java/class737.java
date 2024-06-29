import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class737 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field9977 = 0;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field9976;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field9978;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field9979;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Ltb;")
    public static class686 field9980;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "Lpu;")
    public static class772 field9982;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field9981;

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
    public class737() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lmc;[BZ)V")
    public final void method4001(class234 arg0, byte[] arg1, boolean arg2) {
        field9979++;
        if (arg0.field3193[arg0.field3133] != 31 || arg0.field3193[arg0.field3133 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field9981 == null) {
            this.field9981 = new Inflater(true);
        }
        if (!arg2) {
            this.method4004(false, null);
        }
        try {
            this.field9981.setInput(arg0.field3193, arg0.field3133 + 10, arg0.field3193.length - (arg0.field3133 + 10 + 8));
            this.field9981.inflate(arg1);
        } catch (Exception var4) {
            this.field9981.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field9981.reset();
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method4002(byte arg0) {
        if (arg0 <= 95) {
            method4003(-118, -11L);
        }
        field9982 = null;
        field9980 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method4003(int arg0, long arg1) {
        field9976++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            int var6 = -105 / ((-arg0 - 53) / 46);
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                char var10 = class228.field3076[(int) (var8 - (arg1 * 37L))];
                if (var10 == '_') {
                    int var11 = var7.length() - 1;
                    var10 = ' ';
                    var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
                }
                var7.append(var10);
            }
            var7.reverse();
            var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
            return var7.toString();
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z[B)[B")
    public final byte[] method4004(boolean arg0, byte[] arg1) {
        field9978++;
        if (!arg0) {
            return null;
        }
        class234 var3 = new class234(arg1);
        var3.field3133 = arg1.length - 4;
        int var4 = var3.method1550(1);
        var3.field3133 = 0;
        byte[] var5 = new byte[var4];
        this.method4001(var3, var5, true);
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(III)V")
    private class737(int arg0, int arg1, int arg2) {
    }
}
