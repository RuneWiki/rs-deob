import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class193 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "I")
    public static int field2870 = 127;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "[I")
    public static int[] field2873 = new int[1024];

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field2875 = -1;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "Lrc;")
    public static class108 field2869 = new class108(32, -1);

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field2877 = 1;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IJ)V", line = 6)
    public static final void method1344(int arg0, long arg1) {
        field2871++;
        int var3 = class318.field4496;
        if (class279.field4006 != var3) {
            int var4 = var3 - class279.field4006;
            int var5 = (int) ((long) var4 * arg1 / 320L);
            if (var4 <= 0) {
                if (var5 == 0) {
                    var5 = -1;
                } else if (var4 > var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = 1;
            } else if (var5 > var4) {
                var5 = var4;
            }
            class279.field4006 += var5;
        }
        int var6 = class285.field4075;
        int var7 = 29 % ((-arg0 - 18) / 33);
        if (class108.field1520 != var6) {
            int var8 = var6 - class108.field1520;
            int var9 = (int) ((long) var8 * arg1 / 320L);
            if (var8 <= 0) {
                if (var9 == 0) {
                    var9 = -1;
                } else if (var8 > var9) {
                    var9 = var8;
                }
            } else if (var9 == 0) {
                var9 = 1;
            } else if (var8 < var9) {
                var9 = var8;
            }
            class108.field1520 += var9;
        }
        if (!class165.field2399) {
            class91.field1281 += (float) arg1 * class95.field1340 / 40.0F * 8.0F;
            class421.field5826 += (float) arg1 * class301.field4259 / 40.0F * 8.0F;
        }
        class141.method1020(-101);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I", line = 90)
    public static final int method1345(int arg0, int arg1) {
        return class218.field3157 == null ? 0 : (class218.field3157[arg0][arg1] & 0xFF) << 3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lkk;B)V", line = 96)
    public static final void method1346(class161 arg0, byte arg1) {
        field2874++;
        if (arg1 < 9) {
            method1349(-54, -85, -47);
        }
        if (arg0.field2262.length - arg0.field2298 < 1) {
            return;
        }
        int var2 = arg0.method1172((byte) -107);
        if (var2 < 0 || var2 > 1 || (arg0.field2262.length - arg0.field2298) < 2) {
            return;
        }
        int var3 = arg0.method1134(-16848);
        if ((var3 * 6) != (arg0.field2262.length - arg0.field2298)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg0.field2262.length <= arg0.field2298) {
                            return;
                        }
                        var4 = arg0.method1134(-16848);
                        var5 = arg0.method1168(255);
                    } while (class339.field4689.length <= var4);
                } while (!class394.field5443[var4]);
            } while (class98.field1395.method1425(19, var4).field4743 == '1' && (var5 < -1 || var5 > 1));
            class339.field4689[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 140)
    public static void method1347(int arg0) {
        if (arg0 == 3) {
            field2869 = null;
            field2873 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLjava/awt/Canvas;)Lmd;", line = 154)
    public static final class165 method1348(byte arg0, Canvas arg1) {
        field2872++;
        try {
            Class var2 = Class.forName("jk");
            class165 var3 = (class165) var2.getDeclaredConstructor().newInstance();
            if (arg0 >= -74) {
                return null;
            } else {
                var3.method962(-70, arg1);
                return var3;
            }
        } catch (Throwable var5) {
            class128 var4 = new class128();
            var4.method962(-71, arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)B", line = 177)
    public static final byte method1349(int arg0, int arg1, int arg2) {
        field2876++;
        if (arg0 == 9) {
            return (byte) ((arg1 & arg2) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
