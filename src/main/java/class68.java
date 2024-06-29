import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class68 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lhi;")
    public static class323 field852;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lnk;I)V", line = 4)
    public static final void method423(class16 arg0, int arg1) {
        class251.field3976 = arg0;
        if (arg1 != 0) {
            field852 = (class323) null;
        }
        field851++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)J", line = 18)
    public static final long method424(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        return var3 == null || var3.field2994 == null ? 0L : var3.field2994.field627;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V", line = 28)
    public static final void method425(boolean arg0) {
        if (class147.field2352 != null) {
            class147.field2352.method1527(125);
            class147.field2352 = null;
        }
        class145.method1073((byte) -88);
        field853++;
        class160.method1160();
        for (int var1 = 0; var1 < 4; var1++) {
            class247.field3914[var1].method1851(15850);
        }
        class151.method1104(-1, false);
        System.gc();
        class125.method855(arg0, 2);
        class278.field4370 = -1;
        class327.field5234 = false;
        class304.method2145(true, (byte) 8);
        class16.field160 = 0;
        class322.field4999 = 0;
        class344.field5466 = 0;
        class84.field1099 = 0;
        class307.field4775 = false;
        for (int var2 = 0; var2 < class106.field1471.length; var2++) {
            class106.field1471[var2] = null;
        }
        class302.field4704 = 0;
        class296.field4667 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class105.field1443[var3] = null;
            class125.field1772[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class251.field3974[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class345.field5472[var5][var6][var7] = null;
                }
            }
        }
        class123.method790(false);
        class227.field3429 = 0;
        class207.method1450(38);
        class88.method561(true, 8);
        try {
            class198.method1380((byte) 127, "loggedout", class156.field2451.field254);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 121)
    public static final String method426(String arg0, int arg1, String arg2, String arg3) {
        field850++;
        int var4 = arg3.indexOf(arg0);
        if (arg1 != -3809) {
            return (String) null;
        }
        while (var4 != -1) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(var4 + arg0.length());
            var4 = arg3.indexOf(arg0, var4 + arg2.length());
        }
        return arg3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 144)
    public static void method427(byte arg0) {
        field852 = null;
        if (arg0 < 13) {
            method425(true);
        }
    }
}
