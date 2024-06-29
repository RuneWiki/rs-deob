import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class357 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "J")
    private long field5224;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    private int field5228;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lrda;")
    public static class692 field5223 = new class692("RC", 1);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field5231 = 0;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field5237 = 0;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "Ljw;")
    public static class581 field5232 = new class581(51, 6);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field5234;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lqn;")
    public static class70 field5236;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2244(int arg0) {
        field5230++;
        if (!class42.field647) {
            return;
        }
        if (arg0 != 8775) {
            field5231 = 29;
        }
        while (true) {
            while (class356.field5221 < class791.field10877.length) {
                class513 var1 = class791.field10877[class356.field5221];
                if (var1 != null && var1.field7032 == -1) {
                    if (class290.field4251 == null) {
                        class290.field4251 = class414.field5944.method2530(var1.field7035, true);
                    }
                    int var2 = class290.field4251.field3102;
                    if (var2 == -1) {
                        return;
                    }
                    class356.field5221++;
                    class290.field4251 = null;
                    var1.field7032 = var2;
                } else {
                    class356.field5221++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)Lgq;", line = 45)
    public final class542 method2245(int arg0, int arg1) {
        field5227++;
        if (arg1 != -4814) {
            this.field5224 = 20L;
        }
        return class542.method3088((byte) -30, this.method2249(arg0, false));
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method2246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= -124) {
            return;
        }
        if (class174.field2335 <= arg1 && arg5 <= class751.field10402 && class523.field7178 <= arg2 && class495.field6845 >= arg3) {
            class193.method1330(arg1, 0, arg5, arg2, arg0, arg3);
        } else {
            class738.method4086(arg3, arg2, (byte) -22, arg5, arg1, arg0);
        }
        field5233++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 77)
    public static void method2247(byte arg0) {
        int var1 = 113 % ((arg0 - 25) / 55);
        field5232 = null;
        field5223 = null;
        field5236 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lgq;B)V", line = 93)
    private final void method2248(class542 arg0, byte arg1) {
        this.field5224 |= (arg0.field7357 << class542.field7368 * this.field5228++);
        field5235++;
        if (arg1 <= 48) {
            this.method2250((byte) -107);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)I", line = 107)
    private final int method2249(int arg0, boolean arg1) {
        field5226++;
        return arg1 ? -108 : (int) (this.field5224 >> class542.field7368 * arg0) & 0xF;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lgq;)V", line = 118)
    public class357(class542 arg0) {
        this.field5224 = arg0.field7357;
        this.field5228 = 1;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)I", line = 127)
    public final int method2250(byte arg0) {
        field5234++;
        return arg0 == 121 ? this.field5228 : 6;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([Lgq;)V", line = 137)
    public class357(class542[] arg0) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.method2248(arg0[var2], (byte) 113);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)I", line = 156)
    public static final int method2251(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 12835) {
            return -63;
        }
        field5229++;
        if (class37.field579 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg0 - class375.field5447;
        int var7 = arg2 - class375.field5434;
        for (class57 var8 = (class57) class375.field5423.method2551((byte) -108); var8 != null; var8 = (class57) class375.field5423.method2542(arg3 - 12952)) {
            if (var8.field793 == arg1) {
                int var9 = var8.field803;
                int var10 = var8.field794;
                int var11 = var9 + class375.field5447 << 14 | var10 + class375.field5434;
                int var12 = (var6 - var9) * (var6 - var9) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var12 < var5) {
                    var5 = var12;
                    var4 = var11;
                }
            }
        }
        return var4;
    }
}
