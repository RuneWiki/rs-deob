import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class142 {

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field2190 = 0;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[Luf;")
    public static class168[] field2192 = new class168[200];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Z")
    public static boolean field2188 = true;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "Luf;")
    public static class168 field2191 = class148.method1019(-1720, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "Z")
    public static boolean field2189 = false;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field2197 = 0;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "F")
    public static float field2187;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "F")
    public static float field2198;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V", line = 15)
    public static void method975(boolean arg0) {
        field2192 = null;
        field2191 = null;
        if (!arg0) {
            method977(-125, true, 100);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILuf;)V", line = 26)
    public static final void method976(int arg0, class168 arg1) {
        field2194++;
        if (class280.field4694 >= 2) {
            if (arg1.method1194(class24.field286, -26023)) {
                class196.method1380(-1);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class266.method1850(0, class134.method938((byte) -124, new class168[] { class214.field3496, class169.method1228(var4, 0), class135.field2108 }), (class168) null, 83);
            }
            if (arg1.method1194(class105.field1628, -26023)) {
                System.out.println("oncard_geometry:" + class7.field86);
                System.out.println("oncard_2d:" + class7.field90);
                System.out.println("oncard_texture:" + class7.field89);
            }
            if (arg1.method1194(class268.field4529, -26023)) {
                class279.method1929(-59);
            }
            if (arg1.method1194(class65.field871, -26023)) {
                class109.method810(25, 8858);
            }
            if (arg1.method1194(class91.field1402, arg0 + 890)) {
                class294.field4982 = true;
            }
            if (arg1.method1194(class269.field4534, arg0 ^ 0xC86)) {
                class294.field4982 = false;
            }
            if (arg1.method1194(class247.field4233, arg0 ^ 0xC86)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class140.field2176[var5].field4317[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg1.method1199(-37, class99.field1563) && class217.field3542 != 0) {
                class99.method740((byte) -62, arg1.method1193((byte) -86, 6).method1200((byte) 127));
            }
            if (arg1.method1194(class40.field511, -26023) && class217.field3542 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1199(-107, class60.field782)) {
                class254.field4348 = arg1.method1193((byte) -86, 12).method1195(false).method1200((byte) 126);
                class266.method1850(0, class134.method938((byte) -123, new class168[] { class105.field1618, class169.method1228(class254.field4348, 0) }), (class168) null, -57);
            }
            if (arg1.method1194(class101.field1574, -26023)) {
                class245.field4165 = true;
            }
            if (arg1.method1170(class38.field478, (byte) 118)) {
                if (class8.field98 == null) {
                    class174.method1260(arg0 + 26913, 768, 1024);
                } else {
                    class78.method463(-1);
                }
            }
        }
        if (arg0 != -26913) {
            field2187 = 0.14126378F;
        }
        class249.field4262.method726(182, 2138389379);
        class249.field4262.method1095(arg1.method1167(false) - 1, -100);
        class287.field4844++;
        class249.field4262.method1073((byte) 93, arg1.method1193((byte) -86, 2));
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZI)I", line = 152)
    public static final int method977(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field2197 = -58;
        }
        field2195++;
        int var3 = arg0 >>> 31;
        return (arg0 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)V", line = 171)
    public static final void method978(boolean arg0) {
        class261.field4427.method1431((byte) 122);
        class39.field485.method1431((byte) 117);
        field2193++;
        class64.field856.method1431((byte) 121);
        if (!arg0) {
            field2190 = 34;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)Luf;", line = 188)
    public static final class168 method979(int arg0, boolean arg1) {
        if (!arg1) {
            field2192 = (class168[]) null;
        }
        field2196++;
        return class274.field4606[arg0].method1167(!arg1) > 0 ? class134.method938((byte) -125, new class168[] { class224.field3625[arg0], class272.field4576, class274.field4606[arg0] }) : class224.field3625[arg0];
    }
}
