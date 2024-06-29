import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class168 extends class100 {

    @OriginalMember(owner = "client!cj", name = "u", descriptor = "Ljava/lang/Object;")
    private Object field2122;

    @OriginalMember(owner = "client!cj", name = "v", descriptor = "Ljq;")
    public static class447 field2123 = null;

    @OriginalMember(owner = "client!cj", name = "y", descriptor = "[Lna;")
    public static class320[] field2126 = new class320[14];

    @OriginalMember(owner = "client!cj", name = "w", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!cj", name = "x", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!cj", name = "z", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!cj", name = "A", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!cj", name = "B", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!cj", name = "C", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!cj", name = "D", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!cj", name = "t", descriptor = "Z")
    public static boolean field2121;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ln;IIIIILqa;)V")
    public static final void method999(class473 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class167 arg6) {
        field2127++;
        if (class345.field4777 < 100) {
            class153.method833(arg6, 85, arg0);
        }
        arg6.method977(arg2, arg3, arg2 + arg4, arg3 + arg5);
        if (class345.field4777 < 100) {
            byte var7 = 20;
            int var8 = arg4 / 2 + arg2;
            arg6.method997(arg2, arg3, arg4, arg5, -16777216, 0);
            int var9 = arg3 + (arg5 / 2) - var7 - 18;
            arg6.method995(var8 - 152, var9, 304, 34, class415.field5707[class189.field2445].getRGB(), 0);
            arg6.method997(var8 - 150, var9 + 2, class345.field4777 * 3, 30, class410.field5626[class189.field2445].getRGB(), 0);
            class95.field1282.method1618(class640.field9296[class189.field2445].getRGB(), -1, var7 + var9, (byte) -123, var8, class567.field7929.method2157(class245.field3103, 4074));
            return;
        }
        int var10 = class80.field1091 - ((int) ((float) arg4 / class614.field8831));
        int var11 = (int) ((float) arg5 / class614.field8831) + class2.field20;
        int var12 = (int) ((float) arg4 / class614.field8831) + class80.field1091;
        int var13 = class2.field20 - ((int) ((float) arg5 / class614.field8831));
        class183.field2338 = class2.field20 - ((int) ((float) arg5 / class614.field8831));
        if (arg1 != 30082) {
            return;
        }
        class86.field1162 = class80.field1091 - ((int) ((float) arg4 / class614.field8831));
        class280.field3671 = (int) ((float) (arg5 * 2) / class614.field8831);
        class248.field3120 = (int) ((float) (arg4 * 2) / class614.field8831);
        class614.method3511(var10 + class614.field8850, class614.field8848 + var11, class614.field8850 + var12, class614.field8848 + var13, arg2, arg3, arg2 + arg4, arg3 + 1 + arg5);
        class614.method3509(arg6);
        class568 var14 = class614.method3518(arg6);
        class553.method3106(arg6, arg1 - 30209, var14, 0, 0);
        if (class592.field8548 > 0) {
            class535.field7468--;
            if (class535.field7468 == 0) {
                class592.field8548--;
                class535.field7468 = 20;
            }
        }
        if (!class248.field3119) {
            return;
        }
        int var15 = arg2 + arg4 - 5;
        int var16 = arg3 - (8 - arg5);
        class522.field7281.method1623(16776960, 169, var16, -1, var15, "Fps:" + class10.field92);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class522.field7281.method1623(var19, 169, var20, -1, var15, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lmaa;Ljava/lang/Object;I)V")
    public class168(class42 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field2122 = arg1;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)Z")
    public final boolean method448(int arg0) {
        field2125++;
        int var2 = -55 % ((arg0 + 59) / 62);
        return false;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static final void method1000(byte arg0) {
        if (arg0 != -27) {
            method1004(11, 100);
        }
        if (class80.field1091 < 0) {
            class124.field1543 = -1;
            class217.field2771 = -1;
            class80.field1091 = 0;
        }
        field2129++;
        if (class80.field1091 > class614.field8856) {
            class217.field2771 = -1;
            class124.field1543 = -1;
            class80.field1091 = class614.field8856;
        }
        if (class2.field20 < 0) {
            class124.field1543 = -1;
            class2.field20 = 0;
            class217.field2771 = -1;
        }
        if (class614.field8851 < class2.field20) {
            class217.field2771 = -1;
            class124.field1543 = -1;
            class2.field20 = class614.field8851;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)Z")
    public static final boolean method1001(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1004(94, -122);
        }
        field2131++;
        return (arg2 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V")
    public static final void method1002(int arg0, int arg1) {
        field2128++;
        class209.field2713 = 1000000000L / (long) arg1;
        if (arg0 != 20) {
            method1003(-62);
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V")
    public static void method1003(int arg0) {
        field2126 = null;
        if (arg0 != 19791) {
            method1003(-13);
        }
        field2123 = null;
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(II)Z")
    public static final boolean method1004(int arg0, int arg1) {
        field2124++;
        if (arg1 != -12) {
            method1002(-102, 42);
        }
        return arg0 == 9 || arg0 == 10 || arg0 == 11;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method449(boolean arg0) {
        if (!arg0) {
            method1000((byte) 59);
        }
        field2130++;
        return this.field2122;
    }

    static {
        new class344("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }
}
