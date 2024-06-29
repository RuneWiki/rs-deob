import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class170 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "S")
    public static short field2436 = 1;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[Ldi;")
    public static class99[] field2435 = new class99[29];

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field2437 = 7759444;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "[I")
    public static int[] field2444 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2443 = "slide:";

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static final void method1113(int arg0) {
        class196.field2798 = -1;
        class163.field2345 = 0;
        class230.field3314 = 0;
        class177.field2518 = false;
        class230.field3306 = 0;
        class112.field1496 = 0;
        class206.field2931 = 0;
        class6.field79 = -1;
        class94.field1259.field3021 = 0;
        class292.field4626 = 0;
        class294.field4651 = -1;
        class163.field2332.field3021 = 0;
        field2440++;
        class129.field1869 = arg0;
        for (int var1 = 0; var1 < class253.field3656.length; var1++) {
            if (class253.field3656[var1] != null) {
                class253.field3656[var1].field4575 = -1;
            }
        }
        for (int var2 = 0; var2 < class20.field244.length; var2++) {
            if (class20.field244[var2] != null) {
                class20.field244[var2].field4575 = -1;
            }
        }
        class288.method1933((byte) 92);
        class4.field61 = 1;
        class17.method105(30, (byte) -107);
        for (int var3 = 0; var3 < 100; var3++) {
            class129.field1862[var3] = true;
        }
        class48.method295(false);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method1114(String arg0, boolean arg1, int arg2) {
        field2441++;
        int var3 = 0;
        short[] var4 = new short[16];
        String var5 = arg0.toLowerCase();
        for (int var6 = 0; var6 < class95.field1270; var6++) {
            class229 var10 = class36.method224(var6, 43);
            if ((!arg1 || var10.field3282) && var10.field3284 == -1 && var10.field3239 == -1 && var10.field3225 == 0 && var10.field3235.toLowerCase().indexOf(var5) != -1) {
                if (var3 >= 250) {
                    class181.field2582 = null;
                    class210.field2954 = -1;
                    return;
                }
                if (var4.length <= var3) {
                    short[] var11 = new short[var4.length * 2];
                    for (int var12 = 0; var12 < var3; var12++) {
                        var11[var12] = var4[var12];
                    }
                    var4 = var11;
                }
                var4[var3++] = (short) var6;
            }
        }
        class209.field2943 = 0;
        class181.field2582 = var4;
        class210.field2954 = var3;
        String[] var7 = new String[class210.field2954];
        for (int var8 = 0; var8 < class210.field2954; var8++) {
            var7[var8] = class36.method224(var4[var8], 23).field3235;
        }
        class6.method37(class181.field2582, var7, -126);
        int var9 = -73 / ((-arg2 - 34) / 58);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1115(byte arg0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([BI)V")
    public abstract void method1116(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static void method1117(int arg0) {
        field2435 = null;
        if (arg0 >= -46) {
            method1113(48);
        }
        field2444 = null;
        field2443 = null;
    }
}
