import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class194 {

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2929 = "Unable to find ";

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "I")
    public static int field2934 = 127;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "[Lcj;")
    public static class125[] field2930 = new class125[50];

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
    public static int field2937 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2938 = "Choose Option";

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V")
    public static void method1306(int arg0) {
        field2929 = null;
        if (arg0 == 8031) {
            field2930 = null;
            field2938 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)I")
    public static final int method1307(int arg0) {
        field2932++;
        if (arg0 != 2222) {
            field2930 = null;
        }
        return ((field2934 == 0 ? 0 : 1) << 22) + ((class25.field431 ? 1 : 0) << 19) + ((class109.field1628 ? 1 : 0) << 15) + ((class54.field879 ? 1 : 0) << 13) + ((class233.field3602 & 0x3) << 11) + ((class134.field1967 ? 1 : 0) << 10) + ((class126.field1856 ? 1 : 0) << 7) + (class176.field2585 & 0x7) + ((class14.field207 ? 1 : 0) << 3) + ((class244.field3785 ? 1 : 0) << 4) + ((class127.field1867 ? 1 : 0) << 5) + ((class249.field3869 ? 1 : 0) << 6) + ((class10.field145 ? 1 : 0) << 8) + ((class17.field312 ? 1 : 0) << 9) + ((class241.field3755 ? 1 : 0) << 16) + (class249.field3862 << 17) + ((class112.field1719 == 0 ? 0 : 1) << 20) + ((class188.field2789 == 0 ? 0 : 1) << 21) + (class31.method212() << 23);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)J")
    public static final long method1308(int arg0) {
        if (arg0 != 1) {
            method1307(-25);
        }
        field2931++;
        return class213.field3275.method551((byte) 114);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([IJII)Ljava/lang/String;")
    public static final String method1309(int[] arg0, long arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            field2929 = null;
        }
        field2935++;
        if (class102.field1497 != null) {
            String var5 = class102.field1497.method1561(arg1, arg3, true, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method1310(String arg0, byte arg1, boolean arg2) {
        short[] var3 = new short[16];
        String var4 = arg0.toLowerCase();
        field2936++;
        int var5 = 0;
        if (arg1 >= -45) {
            field2930 = null;
        }
        for (int var6 = 0; var6 < class152.field2218; var6++) {
            class15 var9 = class140.method951((byte) -94, var6);
            if ((!arg2 || var9.field259) && var9.field271 == -1 && var9.field270 == -1 && var9.field234 == 0 && var9.field265.toLowerCase().indexOf(var4) != -1) {
                if (var5 >= 250) {
                    class181.field2637 = -1;
                    class91.field1383 = null;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class91.field1383 = var3;
        class97.field1432 = 0;
        class181.field2637 = var5;
        String[] var7 = new String[class181.field2637];
        for (int var8 = 0; var8 < class181.field2637; var8++) {
            var7[var8] = class140.method951((byte) -94, var3[var8]).field265;
        }
        class176.method1167(class91.field1383, var7, true);
    }
}
