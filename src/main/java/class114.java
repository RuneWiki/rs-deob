import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class114 {

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field1376 = -1;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "[F")
    public static float[] field1375 = new float[4];

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    public static int field1379 = -1;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "[[Z")
    public static boolean[][] field1374;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Lwm;B)V", line = 11)
    public static final void method798(class564 arg0, byte arg1) {
        field1377++;
        if (arg0.field7988 == null && arg0.field7963 == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < arg0.field7988.length; var3++) {
            int var5 = -1;
            if (arg0.field7988 != null) {
                var5 = arg0.field7988[var3];
            }
            if (var5 != -1) {
                var2 = false;
                boolean var6 = false;
                boolean var7 = false;
                int var10;
                int var11;
                if ((var5 & 0xC0000000) == -1073741824) {
                    int var14 = var5 & 0xFFFFFFF;
                    int var15 = var14 >> 14;
                    int var16 = var14 & 0x3FFF;
                    var10 = arg0.field1264 - ((var15 - class228.field3063) * 512) - 256;
                    var11 = arg0.field1250 - ((var16 - class3.field30) * 512) - 256;
                } else if ((var5 & 0x8000) == 0) {
                    class740 var12 = (class740) class373.field5230.method1180((byte) 26, (long) var5);
                    if (var12 == null) {
                        arg0.method3254(var3, true, -1);
                        continue;
                    }
                    class468 var13 = var12.field10289;
                    var11 = arg0.field1250 - var13.field1250;
                    var10 = arg0.field1264 - var13.field1264;
                } else {
                    int var8 = var5 & 0x7FFF;
                    class280 var9 = class309.field4311[var8];
                    if (var9 == null) {
                        arg0.method3254(var3, true, -1);
                        continue;
                    }
                    var10 = arg0.field1264 - var9.field1264;
                    var11 = arg0.field1250 - var9.field1250;
                }
                if (var10 != 0 || var11 != 0) {
                    arg0.method3254(var3, true, (int) (Math.atan2((double) var10, (double) var11) * 2607.5945876176133D) & 0x3FFF);
                }
            } else if (!arg0.method3254(var3, true, -1)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field7963 = null;
            arg0.field7988 = null;
        }
        int var4 = 68 % ((-arg1 - 88) / 34);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZ)I", line = 114)
    public static final int method799(int arg0, boolean arg1) {
        field1373++;
        if (class24.field340 == null) {
            return 0;
        } else if (arg1 || class415.field5857 == null) {
            int var2 = 0;
            if (arg0 > -27) {
                return 121;
            }
            for (int var3 = 0; var3 < class24.field340.length; var3++) {
                int var4 = class24.field340[var3];
                if (class288.field4076.method2088(var4, 119)) {
                    var2++;
                }
                if (class735.field10238.method2088(var4, 97)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return class24.field340.length * 2;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Z)V", line = 157)
    public static void method800(boolean arg0) {
        field1375 = null;
        if (arg0) {
            method799(-99, true);
        }
        field1374 = null;
    }
}
