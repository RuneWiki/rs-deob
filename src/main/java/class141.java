import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class141 extends class143 {

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field2280 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2284 = "Please wait...";

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field2287 = 0;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "[I")
    public static int[] field2288 = new int[200];

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2281 = "Loading config - ";

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field2290 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static void method975(byte arg0) {
        if (arg0 != -81) {
            method978(-71, -65);
        }
        field2288 = null;
        field2281 = null;
        field2284 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)I")
    public static final int method976(int arg0, int arg1) {
        field2285++;
        if (arg0 != -456230998) {
            method977(-28, 46, (class36) null, 87, 44);
        }
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILf;II)V")
    public static final void method977(int arg0, int arg1, class36 arg2, int arg3, int arg4) {
        if (arg1 != -16) {
            method976(46, -25);
        }
        if (class260.field4133 < 3) {
            ((class37) class219.field3578).method317(arg3, arg0, arg2.field642, arg2.field676, class219.field3578.field3873 / 2, class219.field3578.field3864 / 2, class122.field1985, 256, arg2.field681, arg2.field553);
        } else {
            class2.method19(arg3, arg0, 0, arg2.field681, arg2.field553);
        }
        class223.field3698[arg4] = true;
        field2289++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method978(int arg0, int arg1) {
        if (arg0 >= -86) {
            method977(32, -93, (class36) null, -106, -119);
        }
        field2286++;
        return class113.field1893[arg1].length() > 0 ? class7.field88[arg1] + class154.field2487 + class113.field1893[arg1] : class7.field88[arg1];
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method979(long arg0, byte arg1) {
        field2283++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            int var4 = 32 / ((arg1 - 35) / 59);
            for (long var5 = arg0; var5 != 0L; var5 /= 37L) {
                var3++;
            }
            StringBuffer var7 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var7.append(class7.field91[(int) (var8 - (arg0 * 37L))]);
            }
            return var7.reverse().toString();
        }
    }
}
