import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class309 {

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "[Lai;")
    public static class91[] field5002 = new class91[14];

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field5003 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field4999;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB[II)V")
    public static final void method2096(int arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        field4999++;
        arg4--;
        while (arg4 < var5) {
            int var7 = arg4 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            int var13 = var12 + 1;
            arg3[var13] = arg0;
            arg4 = var13 + 1;
            arg3[arg4] = arg0;
        }
        if (arg2 == -117) {
            while (arg4 < var6) {
                arg4++;
                arg3[arg4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2097(String arg0, int arg1) {
        if (arg1 != 4643) {
            return;
        }
        field5001++;
        if (class117.field1796 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class164.method1155(false);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class74.method536("mem=" + var4 + "k", (String) null, (byte) -94, 0);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class164.method1155(false);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class74.method536("Memory before cleanup=" + var7 + "k", (String) null, (byte) -54, 0);
                class85.method605(-106);
                class164.method1155(false);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class74.method536("Memory after cleanup=" + var9 + "k", (String) null, (byte) -127, 0);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class74.method536("Number of player models in cache:" + class83.method597(38), (String) null, (byte) -91, 0);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class240.method1631((byte) -67);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class102.field1624.method721(-15975);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class102.field1624.method711((byte) -38);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class44.field659.method478(5000);
                class18.field322.method411(22716);
                class102.field1624.method725((byte) -92);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class97.field1528 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class143.method983(25, 16590);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class118.field1837 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class118.field1837 = false;
            }
            if (arg0.startsWith("::setba")) {
                class265.field4313 = class122.method841(5262, arg0.substring(8));
                class302.method2065(class44.field659, (byte) 93);
                class295.field4817 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class181.method1281(class122.method841(5262, arg0.substring(15)));
                class302.method2065(class44.field659, (byte) 93);
                class295.field4817 = false;
            }
            if (arg0.startsWith("::fps ") && class41.field625 != 0) {
                class104.method745(class122.method841(5262, arg0.substring(6)), (byte) 117);
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class306.field4975 = class122.method841(5262, arg0.substring(12).trim());
                class74.method536("rect_debug=" + class306.field4975, (String) null, (byte) -85, 0);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class61.field881 = true;
            }
            arg0.startsWith("::hdr");
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class271.field4369) {
                    class271.field4369 = false;
                    class74.method536("Forced tweening disabled.", (String) null, (byte) -51, 0);
                } else {
                    class271.field4369 = true;
                    class74.method536("Forced tweening ENABLED!", (String) null, (byte) -61, 0);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class122.field1929) {
                    System.out.println("Shift-click disabled.");
                    class122.field1929 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class122.field1929 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class74.method536("x:" + (class217.field3408.field994 >> 7) + " z:" + (class217.field3408.field929 >> 7) + " groundh:" + class166.field2746[class214.field3389][class217.field3408.field994 >> 7][class217.field3408.field929 >> 7], (String) null, (byte) -59, 0);
            }
            if (arg0.equalsIgnoreCase("::getheight")) {
                class74.method536("Height: " + class166.field2746[class214.field3389][class217.field3408.field994 >> 7][class217.field3408.field929 >> 7], (String) null, (byte) -75, 0);
            }
        }
        class311.field5027.method2081(false, 186);
        class206.field3310++;
        class311.field5027.method1865(arg0.length() - 1, 101);
        class311.field5027.method1859((byte) 58, arg0.substring(2));
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)Ljh;")
    public static final class307 method2098(int arg0) {
        field5000++;
        try {
            return new class39();
        } catch (Throwable var2) {
            try {
                return (class307) Class.forName("je").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                if (arg0 != 1995949479) {
                    field5002 = null;
                }
                return new class305();
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
    public static void method2099(int arg0) {
        field5002 = null;
        int var1 = 4 % ((arg0 + 28) / 48);
    }
}
