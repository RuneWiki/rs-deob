import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class187 extends class171 {

    @OriginalMember(owner = "client!uk", name = "F", descriptor = "Lsg;")
    public class169 field3341;

    @OriginalMember(owner = "client!uk", name = "C", descriptor = "Z")
    public static boolean field3339 = false;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "Lha;")
    private static class46 field3344 = class271.method1828("yellow:", -46);

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "Lha;")
    public static class46 field3346 = field3344;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "Lha;")
    public static class46 field3348 = field3344;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!uk", name = "E", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!uk", name = "G", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!uk", name = "H", descriptor = "Lfa;")
    public static class211 field3343;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(B)V")
    public static void method1358(byte arg0) {
        int var1 = 46 / ((arg0 + 29) / 62);
        field3346 = null;
        field3344 = null;
        field3343 = null;
        field3348 = null;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZI)V")
    public static final void method1359(boolean arg0, int arg1) {
        field3338++;
        if (arg1 != 26953) {
            field3344 = null;
        }
        byte[][] var2 = class119.field2231;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class267.method1789(118);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class189.field3380[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x7) >> 1;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class92.field1717.length; var13++) {
                                if (class92.field1717[var13] == var12 && var2[var13] != null) {
                                    class61.method416(var5 * 8, var2[var13], arg0, var9, (var10 & 0x7) * 8, class183.field3282, var8, var6 * 8, var4, (var11 & 0x7) * 8, (byte) -117);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BJ)V")
    public static final void method1360(byte arg0, long arg1) {
        field3340++;
        int var3 = 58 % ((-arg0 - 17) / 59);
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class240.method1650((byte) 81, arg1 - 1L);
            class240.method1650((byte) 89, 1L);
        } else {
            class240.method1650((byte) 66, arg1);
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lsg;)V")
    public class187(class169 arg0) {
        this.field3341 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1361(int arg0, int arg1, int arg2, int arg3) {
        if (class273.method1843(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class128.method993(var4 + 1, class119.field2228[arg0][arg1][arg2] + arg3, var5 + 1) && class128.method993(var4 + 128 - 1, class119.field2228[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class128.method993(var4 + 128 - 1, class119.field2228[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class128.method993(var4 + 1, class119.field2228[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lha;I)V")
    public static final void method1362(class46 arg0, int arg1) {
        field3347++;
        if (class245.field4355 >= 2) {
            if (arg0.method315((byte) -38, class150.field2685)) {
                class53.method381(arg1 + 83);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class155.method1136(73, (class46) null, 0, class109.method855(0, new class46[] { class180.field3216, class115.method932(false, var4), class17.field254 }));
            }
            if (arg0.method315((byte) -38, class183.field3280)) {
                class68.method495(-32486);
            }
            if (arg0.method315((byte) -38, class90.field1700)) {
                class205.field3677.method1236(4);
            }
            if (arg0.method315((byte) -38, class254.field4450)) {
                class205.field3677.method1233((byte) 126);
            }
            if (arg0.method315((byte) -38, class100.field1839)) {
                class8.field130.method46((byte) 92);
                class71.field1214.method851((byte) 75);
                class205.field3677.method1240(arg1 + 5);
            }
            if (arg0.method315((byte) -38, class69.field1198)) {
                class183.field3278 = true;
            }
            if (arg0.method315((byte) -38, class97.field1811)) {
                class83.method661(25, 0);
            }
            if (arg0.method315((byte) -38, class221.field3888)) {
                class4.field74 = true;
            }
            if (arg0.method315((byte) -38, class263.field4571)) {
                class4.field74 = false;
            }
            if (arg0.method315((byte) -38, class254.field4449)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class183.field3282[var5].field2718[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method304(113, class85.field1625) && class216.field3821 != 0) {
                class264.method1780((byte) -80, arg0.method339(6, -92).method330(arg1 ^ 0x5B));
            }
            if (arg0.method315((byte) -38, class17.field256) && class216.field3821 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method304(113, class57.field955)) {
                class158.field2812 = arg0.method339(12, arg1 ^ 0x5D).method303(0).method330(30);
                class155.method1136(arg1 ^ 0x5F, (class46) null, 0, class109.method855(0, new class46[] { class198.field3558, class115.method932(false, class158.field2812) }));
            }
            if (arg0.method315((byte) -38, class218.field3846)) {
                class40.field701 = true;
            }
        }
        class244.field4340++;
        class58.field967.method285((byte) -90, 236);
        class58.field967.method570(arg0.method314(64) - 1, 15619);
        class58.field967.method584(arg0.method339(arg1, -125), arg1 ^ 0x4B91);
    }
}
