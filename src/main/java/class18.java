import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class18 extends class82 {

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field216 = 0;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "[Lvb;")
    public static class61[] field220 = new class61[32768];

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field215 = 0;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public int field214;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "[Lsb;")
    public static class230[] field223;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V")
    public static void method124(boolean arg0) {
        field220 = null;
        if (arg0) {
            method127((byte) 79);
        }
        field223 = null;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)[Lpj;")
    public static final class255[] method125(int arg0) {
        class255[] var1 = new class255[class215.field3224];
        field224++;
        for (int var2 = 0; var2 < class215.field3224; var2++) {
            var1[var2] = new class179(class162.field2494, class256.field3915, class10.field139[var2], class273.field4104[var2], class220.field3315[var2], class82.field1312[var2], class10.field129[var2], class183.field2775);
        }
        if (arg0 == -10882) {
            class82.method537(0);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
    public static final void method126(int arg0) {
        if (arg0 != 32360) {
            method127((byte) -22);
        }
        field221++;
        for (int var1 = 0; var1 < class161.field2473; var1++) {
            int var10002 = class174.field2653[var1]--;
            if (class174.field2653[var1] >= -10) {
                class280 var3 = class289.field4568[var1];
                if (var3 == null) {
                    var3 = class280.method1850(class254.field3861, class89.field1408[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class174.field2653[var1] += var3.method1849();
                    class289.field4568[var1] = var3;
                }
                if (class174.field2653[var1] < 0) {
                    int var10;
                    if (class63.field994[var1] == 0) {
                        var10 = class160.field2458[var1] * class100.field1574 >> 8;
                    } else {
                        int var4 = (class63.field994[var1] & 0xFF) * 128;
                        int var5 = class63.field994[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class165.field2537.field2251;
                        int var7 = (class63.field994[var1] & 0xFFA7) >> 8;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var8 = var7 * 128 + 64 - class165.field2537.field2234;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 - (128 - var8);
                        if (var9 > var4) {
                            class174.field2653[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = class160.field2458[var1] * class196.field2988 * (var4 - var9) / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class260 var11 = var3.method1851().method1745(class214.field3206);
                        class257 var12 = class257.method1721(var11, 100, var10);
                        var12.method1711(class167.field2561[var1] - 1);
                        class213.field3187.method373(var12);
                    }
                    class174.field2653[var1] = -100;
                }
            } else {
                class161.field2473--;
                for (int var2 = var1; var2 < class161.field2473; var2++) {
                    class89.field1408[var2] = class89.field1408[var2 + 1];
                    class289.field4568[var2] = class289.field4568[var2 + 1];
                    class167.field2561[var2] = class167.field2561[var2 + 1];
                    class174.field2653[var2] = class174.field2653[var2 + 1];
                    class63.field994[var2] = class63.field994[var2 + 1];
                    class160.field2458[var2] = class160.field2458[var2 + 1];
                }
                var1--;
            }
        }
        if (class254.field3869 && !class293.method1941(-30235)) {
            if (class284.field4248 != 0 && class150.field2168 != -1) {
                class146.method888(0, false, class143.field2090, class150.field2168, 0, class284.field4248);
            }
            class254.field3869 = false;
        } else if (class284.field4248 != 0 && class150.field2168 != -1 && !class293.method1941(-30235)) {
            class196.field2979.method1106(33, false);
            class196.field2979.method1577((byte) 114, class150.field2168);
            class150.field2168 = -1;
            class288.field4319++;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)Lgd;")
    public static final class76 method127(byte arg0) {
        field217++;
        if (arg0 != -114) {
            method125(114);
        }
        try {
            return (class76) Class.forName("ff").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIBLqa;III)V")
    public static final void method128(int arg0, int arg1, byte arg2, class153 arg3, int arg4, int arg5, int arg6) {
        if (arg2 != 113) {
            method127((byte) -92);
        }
        field219++;
        class236.method1495(arg1, arg6, arg3.field2234, arg5, arg4, 2521, arg3.field2251, arg0);
    }
}
