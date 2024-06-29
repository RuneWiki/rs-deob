import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public abstract class class75 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "I")
    public volatile int field1063 = 0;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public volatile int field1069 = 0;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "[B")
    public byte[] field1072 = new byte[5000];

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "[Ljava/lang/Object;")
    public Object[] field1076 = new Object[5000];

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public int field1075 = 0;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    public int field1080 = 0;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "[F")
    public float[] field1070 = new float[5000];

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field1064 = 0;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field1066 = -1;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "[[B")
    public static byte[][] field1073 = new byte[250][];

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "I")
    public static volatile int field1077 = 0;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "[I")
    public static int[] field1074 = new int[25];

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "[Lic;")
    public static class227[] field1078;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lwm;I)V", line = 6)
    public static final void method553(class298 arg0, int arg1) {
        field1082++;
        int var2 = arg0.field4345 - class28.field418;
        int var3 = arg0.field4306 * 128 + (arg0.method168(-117) * 64);
        int var4 = arg0.field4284 * 128 + (arg0.method168(arg1 - 124) * 64);
        arg0.field4358 = arg1;
        arg0.field740 += (var3 - arg0.field740) / var2;
        arg0.field734 += (var4 - arg0.field734) / var2;
        if (arg0.field4295 == 0) {
            arg0.method2041(22036, 8192);
        }
        if (arg0.field4295 == 1) {
            arg0.method2041(22036, 12288);
        }
        if (arg0.field4295 == 2) {
            arg0.method2041(22036, 0);
        }
        if (arg0.field4295 == 3) {
            arg0.method2041(22036, 4096);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIIII)V", line = 60)
    public static final void method555(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1079++;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = arg1;
        int var9 = class304.method2068(class87.field1227, arg3 + arg0, -122, class299.field4382);
        int var10 = class304.method2068(class87.field1227, arg3 - arg0, -118, class299.field4382);
        class207.method1221((byte) -126, var10, var9, class384.field5560[arg4], arg2);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class379.field5521 <= var12 && class125.field1751 >= var11) {
                    int var13 = class304.method2068(class87.field1227, arg3 + var5, arg1 + -91, class299.field4382);
                    int var14 = class304.method2068(class87.field1227, arg3 - var5, -102, class299.field4382);
                    if (var12 <= class125.field1751) {
                        class207.method1221((byte) -122, var14, var13, class384.field5560[var12], arg2);
                    }
                    if (var11 >= class379.field5521) {
                        class207.method1221((byte) -123, var14, var13, class384.field5560[var11], arg2);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class379.field5521 <= var16 && class125.field1751 >= var15) {
                int var17 = class304.method2068(class87.field1227, arg3 + var6, -111, class299.field4382);
                int var18 = class304.method2068(class87.field1227, arg3 - var6, -117, class299.field4382);
                if (class125.field1751 >= var16) {
                    class207.method1221((byte) -127, var18, var17, class384.field5560[var16], arg2);
                }
                if (var15 >= class379.field5521) {
                    class207.method1221((byte) -128, var18, var17, class384.field5560[var15], arg2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)V", line = 162)
    public static void method561(byte arg0) {
        if (arg0 != -104) {
            method563(99);
        }
        field1073 = null;
        field1074 = null;
        field1078 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)Z", line = 187)
    public static final boolean method563(int arg0) {
        field1067++;
        try {
            return arg0 == 0 ? class48.method345(-13597) : true;
        } catch (IOException var4) {
            class27.method193(114);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class145.field1988 + "," + class26.field378 + "," + class100.field1411 + " - " + class300.field4398 + "," + (class7.field138 + class227.field2988.field4360[0]) + "," + (class227.field2988.field4362[0] + class200.field2660) + " - ";
            for (int var3 = 0; var3 < class300.field4398 && var3 < 50; var3++) {
                var2 = var2 + class156.field2120.field3040[var3] + ",";
            }
            class248.method1494(var2, 78, var5);
            class91.method637(arg0 ^ 0xFFFFFF89);
            return true;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BI)V")
    public abstract void method552(byte arg0, int arg1);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lgk;Z)V")
    public abstract void method554(class254 arg0, boolean arg1);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    public abstract void method556(byte arg0);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(FIZILck;)V")
    public abstract void method557(float arg0, int arg1, boolean arg2, int arg3, class351 arg4);

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)V")
    public abstract void method558(byte arg0);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZLgk;)V")
    public abstract void method559(boolean arg0, class254 arg1);

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lgk;B)V")
    public abstract void method560(class254 arg0, byte arg1);

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(BI)V")
    public abstract void method562(byte arg0, int arg1);
}
