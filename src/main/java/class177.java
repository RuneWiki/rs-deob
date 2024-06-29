import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class177 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2942 = "Loaded config";

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2945 = "Loading title screen - ";

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lgi;")
    public static class164 field2940;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ljava/lang/String;")
    public String field2946;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1247(int arg0, long arg1) {
        field2941++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (arg0 != -16702) {
                field2942 = null;
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(client.field2679[(int) (var7 - (arg1 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lfj;I)Lhc;")
    public static final class250 method1248(class274 arg0, int arg1) {
        field2947++;
        if (arg1 != 0) {
            method1250(-108);
        }
        return new class250(arg0.method1847(-404), arg0.method1847(-404), arg0.method1847(arg1 ^ 0xFFFFFE6C), arg0.method1847(arg1 ^ 0xFFFFFE6C), arg0.method1812(true), arg0.method1812(true), arg0.method1849(255));
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method1249(byte arg0) {
        field2940 = null;
        field2945 = null;
        if (arg0 <= 65) {
            method1251(13, (byte) 24);
        }
        field2942 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static final void method1250(int arg0) {
        if (arg0 >= -116) {
            method1249((byte) -93);
        }
        class63.field1010.method1876((byte) 122);
        field2944++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)Lmf;")
    public static final class11 method1251(int arg0, byte arg1) {
        field2943++;
        class11 var2 = (class11) class117.field1803.method61(86, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class74.field1190.method1156(11, arg0, (byte) -16);
        class11 var4 = new class11();
        if (arg1 >= -32) {
            method1247(93, 12L);
        }
        if (var3 != null) {
            var4.method90(1515094893, new class274(var3));
        }
        class117.field1803.method59(var4, (long) arg0, 5);
        return var4;
    }
}
