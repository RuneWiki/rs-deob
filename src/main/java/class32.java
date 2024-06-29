import java.awt.Color;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class32 extends class313 {

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "J")
    public static long field395 = 0L;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field398 = -1;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field404 = 1;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field393 = new CRC32();

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "[Ljava/awt/Color;")
    public static Color[] field406 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public int field396;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public int field397;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public int field403;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "Ljava/lang/String;")
    public String field401;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)V")
    public static final void method214(byte arg0) {
        if (arg0 <= 60) {
            field404 = -60;
        }
        class58.field752 = new class37();
        field402++;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIILah;Le;II)V")
    public static final void method215(int arg0, int arg1, int arg2, class215 arg3, class312 arg4, int arg5, int arg6) {
        field392++;
        if (class397.field5935 < 100) {
            class19.method143(arg4, arg3, 1376367846);
        }
        arg4.method671(arg2, arg1, arg0 + arg2, arg1 + arg6);
        if (class397.field5935 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg2;
            int var9 = arg6 / 2 + arg1 - var7 - 18;
            arg4.method563(arg2, arg1, arg0, arg6, -16777216, 0);
            arg4.method647(var8 - 152, var9, 304, 34, class367.field5571[class140.field2176].getRGB(), 0);
            arg4.method563(var8 - 150, var9 + 2, class397.field5935 * 3, 30, field406[class140.field2176].getRGB(), 0);
            class11.field133.method2820(class211.field3381, -1, var7 + var9, false, var8, class97.field1300[class140.field2176].getRGB());
            return;
        }
        int var10 = class375.field5656 - ((int) ((float) arg0 / class400.field5957));
        int var11 = class144.field2270 + ((int) ((float) arg6 / class400.field5957));
        int var12 = (int) ((float) arg0 / class400.field5957) + class375.field5656;
        int var13 = class144.field2270 - ((int) ((float) arg6 / class400.field5957));
        class133.field2078 = (int) ((float) (arg0 * arg5) / class400.field5957);
        class373.field5638 = class144.field2270 - ((int) ((float) arg6 / class400.field5957));
        class171.field2684 = class375.field5656 - ((int) ((float) arg0 / class400.field5957));
        class291.field4650 = (int) ((float) (arg6 * 2) / class400.field5957);
        class400.method2525(class400.field5973 + var10, var11 - -class400.field5974, class400.field5973 + var12, var13 - -class400.field5974, arg2, arg1, arg0 + arg2, arg6 + 1 + arg1);
        class400.method2513(arg4);
        class37 var14 = class400.method2518(arg4);
        class205.method1453(arg4, 0, true, 0, var14);
        if (class433.field6401 > 0) {
            class291.field4646--;
            if (class291.field4646 == 0) {
                class433.field6401--;
                class291.field4646 = 20;
            }
        }
        if (!class323.field5044) {
            return;
        }
        int var15 = arg0 + arg2 - 5;
        int var16 = arg1 + arg6 - 8;
        class435.field6411.method2823("Fps:" + class208.field3333, -1, var16, var15, false, 16776960);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class435.field6411.method2823("Mem:" + var18 + "k", -1, var20, var15, false, var19);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V")
    public static void method216(byte arg0) {
        field406 = null;
        field393 = null;
        if (arg0 != -109) {
            field400 = 93;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)V")
    public static final void method217(byte arg0) {
        field405++;
        class51.field625.method335((byte) -73);
        if (arg0 != 49) {
            field395 = 3L;
        }
    }
}
