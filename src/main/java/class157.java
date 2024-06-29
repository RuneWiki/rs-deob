import java.util.Calendar;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class157 extends class96 {

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2420 = "yellow:";

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2416 = Calendar.getInstance();

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "[S")
    public static short[] field2424 = new short[256];

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2425 = new CRC32();

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "Ljava/lang/String;")
    public String field2422;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "Ljava/lang/String;")
    public String field2423;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "[[[B")
    public static byte[][][] field2427;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(I)V")
    public static final void method1058(int arg0) {
        ++field2419;
        class67.field931.method1430(-1);
        if (arg0 < 20) {
            field2426 = -107;
        }
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)Lgf;")
    public final class124 method1059(byte arg0) {
        if (arg0 >= -83) {
            field2427 = null;
        }
        ++field2418;
        return class172.field2706[super.field1478];
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1060(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class13 var7 = new class13();
        var7.field166 = arg1 / 128;
        var7.field162 = arg2 / 128;
        var7.field167 = arg3 / 128;
        var7.field154 = arg4 / 128;
        var7.field174 = arg0;
        var7.field160 = arg1;
        var7.field161 = arg2;
        var7.field171 = arg3;
        var7.field156 = arg4;
        var7.field164 = arg5;
        var7.field170 = arg6;
        class17.field199[class270.field4299++] = var7;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)V")
    public static void method1061(byte arg0) {
        field2416 = null;
        field2420 = null;
        field2427 = null;
        field2424 = null;
        int var1 = 61 / (arg0 / 45);
        field2425 = null;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)Lgj;")
    public static final class234 method1062(int arg0, int arg1) {
        ++field2417;
        class234 var2 = (class234) class269.field4292.method765((long) arg1, 0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class198.field3085.method807((byte) 121, arg1, arg0);
            class234 var4 = new class234();
            if (var3 != null) {
                var4.method1588(new class25(var3), -50);
            }
            class269.field4292.method763(84, var4, (long) arg1);
            return var4;
        }
    }
}
