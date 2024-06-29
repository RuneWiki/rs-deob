import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class248 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "I")
    public static int field3759 = 100;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Z")
    public static boolean field3765 = false;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3762 = 1;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3766;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "[[[Ldk;")
    public static class225[][][] field3764;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "([BLp;I)V", line = 6)
    public final void method1782(byte[] arg0, class107 arg1, int arg2) {
        field3760++;
        if (arg1.field1388[arg1.field1400] != 31 || arg1.field1388[arg1.field1400 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3766 == null) {
            this.field3766 = new Inflater(true);
        }
        if (arg2 != 19160) {
            method1784((String) null, 29, (String) null);
        }
        try {
            this.field3766.setInput(arg1.field1388, arg1.field1400 + 10, arg1.field1388.length + -8 + -arg1.field1400 + -10);
            this.field3766.inflate(arg0);
        } catch (Exception var5) {
            this.field3766.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3766.reset();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 36)
    public static final String method1783(long arg0, int arg1) {
        field3763++;
        if ((long) arg1 >= arg0 || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class15.field210[(int) (var7 - arg0 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 80)
    public static final boolean method1784(String arg0, int arg1, String arg2) {
        int var3 = arg2.length();
        field3761++;
        if (arg1 != 1) {
            return false;
        }
        int var4 = arg0.length();
        if (var4 > var3) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg2.charAt(var5);
            char var7 = arg0.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 120)
    public static void method1785(byte arg0) {
        field3764 = (class225[][][]) null;
        if (arg0 != -19) {
            method1784((String) null, 74, (String) null);
        }
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 129)
    public class248() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(III)V", line = 140)
    private class248(int arg0, int arg1, int arg2) {
    }
}
