import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public abstract class class233 {

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "F")
    public static float field3119;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)Z")
    public abstract boolean method1472(int arg0, int arg1);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Ljv;")
    public abstract class57 method1473(int arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1474(String arg0, int arg1) {
        System.exit(1);
        field3118++;
        if (arg1 >= -76) {
            field3119 = 1.2154108F;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)Z")
    public static final boolean method1475(int arg0, int arg1) {
        int var2 = 2 % ((-arg0 - 35) / 36);
        field3121++;
        return arg1 == 0 || arg1 == 1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[BI)[B")
    public static final byte[] method1476(int arg0, byte[] arg1, int arg2) {
        field3116++;
        int var3 = 27 % ((54 - arg2) / 44);
        byte[] var4 = new byte[arg0];
        class438.method2687(arg1, 0, var4, 0, arg0);
        return var4;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
    public abstract void method1477(byte arg0);

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lza;I)V")
    public static final void method1478(class287 arg0, int arg1) {
        arg0.method1182(0, 0, class372.field5051, 350);
        field3117++;
        arg0.method1153(0, 0, class372.field5051, 350, class99.field1362 << 24 | 0x332277, 1);
        if (arg1 != -2) {
            method1475(104, -98);
        }
        int var2 = 350 / class421.field6105;
        if (class277.field3678 > 0) {
            int var3 = 346 - class421.field6105 - 4;
            int var4 = var2 * var3 / (class277.field3678 + var2 - 1);
            int var5 = 4;
            if (class277.field3678 > 1) {
                var5 += (class277.field3678 - class4.field15 - 1) * (var3 - var4) / (class277.field3678 - 1);
            }
            arg0.method1153(class372.field5051 - 16, var5, 12, var4, class99.field1362 << 24 | 0x332277, 2);
            for (int var6 = class4.field15; var6 < class4.field15 + var2 && var6 < class277.field3678; var6++) {
                String[] var7 = class436.method2679((byte) 54, '\b', class176.field2278[var6]);
                int var8 = (class372.field5051 - 16 - 8) / var7.length;
                for (int var9 = 0; var9 < var7.length; var9++) {
                    int var10 = var8 * var9 + 8;
                    arg0.method1182(var10, 0, var8 + var10 - 8, 350);
                    class225.field3028.method1878(-16777216, 350 - class293.field3883.field2369 - class380.field5508 - ((var6 - class4.field15) * class421.field6105) - 2, var7[var9], -1, var10, (byte) -5);
                }
            }
        }
        arg0.method1182(0, 0, class372.field5051, 350);
        arg0.method1718(0, class372.field5051, 350 - class380.field5508, -1, false);
        class79.field976.method1878(-16777216, 350 - class121.field1570.field2369 - 1, "--> " + class470.field6980, -1, 10, (byte) -5);
        int var11 = -1;
        if ((class532.field7836 % 30) > 15) {
            var11 = 16777215;
        }
        arg0.method1720(12, class121.field1570.method1066(-127, "--> " + class470.field6980.substring(0, class330.field4386)) + 10, -26028, var11, 350 - class121.field1570.field2369 - 11);
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V")
    public abstract void method1479(int arg0);
}
