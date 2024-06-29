import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class397 {

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Z")
    public static boolean field5497 = false;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field5498 = -1;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field5501 = -1;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field5502 = new String[100];

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field5494;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field5495;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lij;")
    public static class316 field5496;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)Ljava/lang/String;", line = 13)
    public static final String method2459(int arg0) {
        field5495++;
        String var1 = "www";
        if (class314.field4259 != arg0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class101.field1400 != null) {
            var2 = "/p=" + class101.field1400;
        }
        return class133.field1986 == 1 ? "http://" + var1 + ".stellardawn.com/l=" + class445.field6241 + "/a=" + class47.field606 + var2 + "/" : "http://" + var1 + ".runescape.com/l=" + class445.field6241 + "/a=" + class47.field606 + var2 + "/";
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V", line = 43)
    public static void method2460(int arg0) {
        field5496 = null;
        if (arg0 != -32769) {
            field5497 = false;
        }
        field5502 = null;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Z", line = 58)
    public static final boolean method2461(int arg0) {
        if (arg0 > -23) {
            method2459(100);
        }
        field5500++;
        return class22.field284 == 0 ? class86.field1206 : true;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V", line = 73)
    public static final void method2462(boolean arg0) {
        field5499++;
        class348.field4690.method1168(125);
        for (class429 var1 = (class429) class451.field6491.method1173(0); var1 != null; var1 = (class429) class451.field6491.method1165(!arg0)) {
            if (var1.field5977 < 1000) {
                var1.method1884(false);
                class348.field4690.method1162(125, var1);
            }
        }
        class348.field4690.method1161(class451.field6491, -30515);
        if (class31.field431 != null || class200.field2879 > 0) {
            return;
        }
        int var2 = -1;
        if (class446.field6255 != null) {
            var2 = class446.field6255.method124(-1);
        }
        if (class317.field4324) {
            if (var2 == -1) {
                int var3 = class116.field1759.method34(true);
                int var4 = class116.field1759.method30((byte) 115);
                if (var3 < class75.field1073 - 10 || (class4.field32 + class75.field1073 + 10) < var3 || (class49.field631 - 10) > var4 || var4 > class124.field1873 + class49.field631 + 10) {
                    class317.field4324 = false;
                    class349.method2110(class75.field1073, class124.field1873, class4.field32, -11514, class49.field631);
                }
            }
            if (var2 == 0) {
                int var5 = class75.field1073;
                int var6 = class49.field631;
                int var7 = class4.field32;
                int var8 = class446.field6255.method121((byte) -84);
                int var9 = class446.field6255.method126(arg0);
                int var10 = -1;
                for (int var11 = 0; var11 < class149.field2171; var11++) {
                    if (class53.field678) {
                        int var16 = (class149.field2171 - var11 - 1) * 16 + (var6 + 33);
                        if (var5 < var8 && var8 < var5 + var7 && (var16 - 13) < var9 && var16 + 4 > var9) {
                            var10 = var11;
                        }
                    } else {
                        int var15 = (class149.field2171 - var11 - 1) * 16 + (var6 + 31);
                        if (var8 > var5 && var8 < var5 + var7 && var15 - 13 < var9 && var9 < (var15 + 3)) {
                            var10 = var11;
                        }
                    }
                }
                if (var10 != -1) {
                    int var12 = 0;
                    class416 var13 = new class416(class451.field6491);
                    for (class429 var14 = (class429) var13.method2572(106); var14 != null; var14 = (class429) var13.method2573(-127)) {
                        if (var10 == var12) {
                            class276.method1744(0, var14);
                        }
                        var12++;
                    }
                }
                class317.field4324 = false;
                class349.method2110(class75.field1073, class124.field1873, class4.field32, -11514, class49.field631);
            }
        } else {
            if (class19.field261 >= 0) {
                var2 = class19.field261;
            }
            class19.field261 = -1;
            if (var2 == 0 && (class127.field1899 == 1 && class149.field2171 > 2 || class115.method860((byte) -120))) {
                var2 = 2;
            }
            if (var2 == 2 && class149.field2171 > 0) {
                if (class446.field6255 == null) {
                    class42.method361(false, class219.field3081, class332.field4480);
                } else {
                    class42.method361(arg0, class446.field6255.method126(false), class446.field6255.method121((byte) 75));
                }
            }
            if (var2 == 0 && class149.field2171 > 0) {
                class169.method1207(-52);
            }
        }
        if (arg0) {
            method2462(false);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Ltm;", line = 234)
    public static final class189 method2463(int arg0, int arg1) {
        field5494++;
        class189 var2 = (class189) class171.field2433.method515(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 0) {
            field5501 = 12;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class106.field1482.method1926(0, arg0 & 0x7FFF, 0);
        } else {
            var3 = class323.field4391.method1926(arg1, arg0, 0);
        }
        class189 var4 = new class189();
        if (var3 != null) {
            var4.method1312(~arg1, new class366(var3));
        }
        if (arg0 >= 32768) {
            var4.method1314((byte) 21);
        }
        class171.field2433.method519((long) arg0, true, var4);
        return var4;
    }
}
