import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class115 {

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public int field1733 = -1;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "J")
    public static long field1734 = 0L;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "Lum;")
    public static class362 field1735;

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Lmo;")
    public class526 field1738;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[I")
    public int[] field1736;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[Lf;")
    public static class529[] field1730;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field1731;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V", line = 4)
    public static void method765(byte arg0) {
        field1730 = null;
        if (arg0 >= -38) {
            field1735 = null;
        }
        field1735 = null;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BII)Z", line = 16)
    public static final boolean method766(byte arg0, int arg1, int arg2) {
        field1732++;
        if (arg0 == -66) {
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I", line = 29)
    public static final int method767(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field1730 = null;
        }
        field1729++;
        return arg1 == 4 || arg1 == 5 ? class125.field1887[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)I", line = 52)
    public static final int method768(byte arg0, int arg1) {
        if (arg0 != 57) {
            method767(65, 25, 12);
        }
        field1739++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 67)
    public static final void method769(String arg0, int arg1) {
        field1728++;
        if (arg0 == null) {
            return;
        }
        if (!(class315.field4496 < 100 || class31.field341) || class315.field4496 >= 200) {
            class61.method359(class454.field6723.method2838(false, class143.field2137), (byte) -60);
            return;
        }
        String var2 = class14.method93(arg0, 3841);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg1; var3 < class315.field4496; var3++) {
            String var7 = class14.method93(class474.field6980[var3], 3841);
            if (var7 != null && var7.equals(var2)) {
                class61.method359(arg0 + class203.field2930.method2838(false, class143.field2137), (byte) 1);
                return;
            }
            if (class287.field4106[var3] != null) {
                String var8 = class14.method93(class287.field4106[var3], 3841);
                if (var8 != null && var8.equals(var2)) {
                    class61.method359(arg0 + class203.field2930.method2838(false, class143.field2137), (byte) -57);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class61.field927; var4++) {
            String var5 = class14.method93(class3.field41[var4], 3841);
            if (var5 != null && var5.equals(var2)) {
                class61.method359(class111.field1598.method2838(false, class143.field2137) + arg0 + class277.field4001.method2838(false, class143.field2137), (byte) 89);
                return;
            }
            if (class231.field3446[var4] != null) {
                String var6 = class14.method93(class231.field3446[var4], 3841);
                if (var6 != null && var6.equals(var2)) {
                    class61.method359(class111.field1598.method2838(false, class143.field2137) + arg0 + class277.field4001.method2838(false, class143.field2137), (byte) 100);
                    return;
                }
            }
        }
        if (class14.method93(class500.field7365.field3548, 3841).equals(var2)) {
            class61.method359(class404.field6100.method2838(false, class143.field2137), (byte) -94);
        } else {
            class291.method1861((byte) -104, class159.field2356);
            class517.field7534++;
            class356.field5471.method1410(class456.method2739((byte) 123, arg0), -27645);
            class356.field5471.method1418(true, arg0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BZLjava/lang/String;)V", line = 163)
    public static final void method770(byte arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field1737++;
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class169.field2507.field6947 : class169.field2507.field6937);
        int var8 = -78 % ((arg0 + 36) / 39);
        for (int var9 = var6; var9 < var7; var9++) {
            class80 var12 = class169.field2507.method2821((byte) 59, var9);
            if (var12.field1198 && var12.method472(-23421).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class461.field6847 = null;
                    class102.field1471 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var13 = new short[var4.length * 2];
                    for (int var14 = 0; var14 < var5; var14++) {
                        var13[var14] = var4[var14];
                    }
                    var4 = var13;
                }
                var4[var5++] = (short) var9;
            }
        }
        class279.field4022 = 0;
        class102.field1471 = var5;
        class461.field6847 = var4;
        String[] var10 = new String[class102.field1471];
        for (int var11 = 0; var11 < class102.field1471; var11++) {
            var10[var11] = class169.field2507.method2821((byte) 53, var4[var11]).method472(-23421);
        }
        class438.method2631(var10, (byte) -128, class461.field6847);
    }
}
