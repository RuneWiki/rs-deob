import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class190 extends class62 {

    @OriginalMember(owner = "client!od", name = "w", descriptor = "Z")
    public static boolean field3260 = true;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "S")
    public static short field3261 = 256;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field3267 = 0;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "Z")
    public static volatile boolean field3268 = true;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field3264 = 0;

    @OriginalMember(owner = "client!od", name = "v", descriptor = "I")
    public int field3259;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!od", name = "G", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Ljl;")
    public static class101 field3263;

    // $FF: synthetic field
    @OriginalMember(owner = "client!od", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field3272;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "[[[B")
    public static byte[][][] field3265;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method1312(int arg0) {
        int var1 = 0;
        int var2 = 55 % ((72 - arg0) / 49);
        while (class255.field4524 > var1) {
            int var3 = class203.field3463[var1];
            class163 var4 = class55.field833[var3];
            int var5 = class213.field3680.method1268(255);
            if ((var5 & 0x80) != 0) {
                var4.field1832 = class213.field3680.method1253(-84);
                var4.field1776 = 100;
            }
            if ((var5 & 0x40) != 0) {
                var4.field1824 = class213.field3680.method1263(true);
                if (var4.field1824 == 65535) {
                    var4.field1824 = -1;
                }
            }
            if ((var5 & 0x20) != 0) {
                if (var4.field2691.method1858((byte) -39)) {
                    class61.method439(-1, var4);
                }
                var4.method1094(-84, class148.method1022(class213.field3680.method1286(8), (byte) -116));
                var4.method768(var4.field2691.field4839, 24025);
                var4.field1790 = var4.field2691.field4877;
                var4.field1787 = var4.field2691.field4878;
                var4.field1767 = var4.field2691.field4885;
                var4.field1782 = var4.field2691.field4869;
                var4.field1803 = var4.field2691.field4840;
                var4.field1770 = var4.field2691.field4834;
                var4.field1819 = var4.field2691.field4850;
                var4.field1827 = var4.field2691.field4868;
                if (var4.field2691.method1858((byte) -39)) {
                    class47.method314(0, (class133) null, var4.field1780[0], class237.field4140, var4.field1812[0], var4, true, (class188) null);
                }
            }
            if ((var5 & 0x1) != 0) {
                var4.field1814 = class213.field3680.method1263(true);
                int var6 = class213.field3680.method1277(65280);
                var4.field1821 = (var6 & 0xFFFF) + class72.field1146;
                var4.field1811 = var6 >> 16;
                var4.field1773 = 0;
                if (var4.field1821 > class72.field1146) {
                    var4.field1773 = -1;
                }
                var4.field1769 = 0;
                if (var4.field1814 == 65535) {
                    var4.field1814 = -1;
                }
                if (var4.field1814 != -1 && class72.field1146 == var4.field1821) {
                    int var7 = class79.method536(-37, var4.field1814).field3947;
                    if (var7 != -1) {
                        class2 var8 = class186.method1242(0, var7);
                        if (var8 != null && var8.field24 != null) {
                            class182.method1201(var4.field1799, var8, 255, var4.field1793, false, 0);
                        }
                    }
                }
            }
            if ((var5 & 0x8) != 0) {
                int var9 = class213.field3680.method1250(7);
                int var10 = class213.field3680.method1278(true);
                var4.method764(var9, class72.field1146, (byte) -87, var10);
            }
            if ((var5 & 0x2) != 0) {
                int var11 = class213.field3680.method1263(true);
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = class213.field3680.method1278(true);
                class241.method1651(var4, -114, var11, var12);
            }
            if ((var5 & 0x10) != 0) {
                int var13 = class213.field3680.method1268(255);
                int var14 = class213.field3680.method1255(false);
                var4.method764(var13, class72.field1146, (byte) -99, var14);
                var4.field1808 = class72.field1146 + 300;
                var4.field1807 = class213.field3680.method1268(255);
            }
            if ((var5 & 0x4) != 0) {
                var4.field1784 = class213.field3680.method1263(true);
                var4.field1805 = class213.field3680.method1244(false);
            }
            var1++;
        }
        field3271++;
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public static void method1313(byte arg0) {
        field3263 = null;
        field3265 = null;
        if (arg0 != -33) {
            method1312(57);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BLjl;II)[Lmd;")
    public static final class208[] method1314(byte arg0, class101 arg1, int arg2, int arg3) {
        field3266++;
        if (arg0 != -53) {
            field3261 = 101;
        }
        return class131.method941(arg3, arg1, arg2, -110) ? class92.method599(false) : null;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V")
    public static final void method1315(byte arg0) {
        field3269++;
        try {
            if (arg0 < 35) {
                field3261 = -7;
            }
            Method var1 = (field3272 == null ? (field3272 = method1316("java.lang.Runtime")) : field3272).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1316(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
