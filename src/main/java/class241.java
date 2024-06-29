import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class241 {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4064 = "Continue";

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4068 = 0;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4062;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field4067;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4065;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[Lfc;")
    public static class41[] field4063;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
    public static final void method1725(byte arg0, int arg1) {
        class286.field4737 = new int[arg1];
        int var2 = -33 % ((arg0 - 17) / 43);
        class28.field480 = new int[arg1];
        field4066++;
        class94.field1536 = new int[arg1];
        class149.field2462 = new int[arg1];
        class25.field454 = new int[arg1];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method1726(long arg0, int arg1) {
        field4060++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
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
            if (arg1 != 1901097514) {
                method1728((byte) 76);
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class132.field2187[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    var9 = ' ';
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([IB)[I")
    public static final int[] method1727(int[] arg0, byte arg1) {
        field4061++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 < 117) {
            method1731((String) null, -101, (String) null, (String) null);
        }
        int[] var2 = new int[arg0.length];
        class75.method532(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method1728(byte arg0) {
        field4063 = null;
        field4064 = null;
        if (arg0 >= -103) {
            field4064 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILab;[B)V")
    public final void method1729(int arg0, class249 arg1, byte[] arg2) {
        field4067++;
        if (arg1.field4182[arg1.field4160] != 31 || arg1.field4182[arg1.field4160 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4065 == null) {
            this.field4065 = new Inflater(true);
        }
        try {
            this.field4065.setInput(arg1.field4182, arg1.field4160 + 10, -arg1.field4160 + -18 + arg1.field4182.length);
            this.field4065.inflate(arg2);
        } catch (Exception var4) {
            this.field4065.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4065.reset();
        if (arg0 != -23857) {
            field4064 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)I")
    public static final int method1730(int arg0, byte arg1) {
        if (arg1 > -63) {
            field4064 = null;
        }
        field4069++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(III)V")
    private class241(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class241() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1731(String arg0, int arg1, String arg2, String arg3) {
        field4071++;
        int var4 = arg0.indexOf(arg2);
        if (arg1 > -99) {
            field4068 = 64;
        }
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg3 + arg0.substring(var4 + arg2.length());
            var4 = arg0.indexOf(arg2, var4 + arg3.length());
        }
        return arg0;
    }
}
