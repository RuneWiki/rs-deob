import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class84 extends class107 {

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "J")
    public long field1413;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field1405 = 0;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static volatile int field1402 = 0;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "[Lma;")
    public static class178[] field1414 = new class178[4];

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "Ldf;")
    public static class51 field1415 = class46.method233("details", 100);

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "Ldf;")
    private static class51 field1416 = class46.method233("glow3:", 100);

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "Ldf;")
    public static class51 field1403 = field1416;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Ldf;")
    public static class51 field1407 = field1416;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "[Ldf;")
    public static class51[] field1417 = new class51[1000];

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public static int field1406;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "[I")
    public static int[] field1411;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
    public static final int method649(int arg0) {
        if (arg0 <= 39) {
            field1417 = null;
        }
        field1409++;
        return class196.field3288;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(B)[Ltg;")
    public static final class171[] method650(byte arg0) {
        field1408++;
        class171[] var1 = new class171[class190.field3183];
        int var2 = 0;
        if (arg0 <= 101) {
            field1407 = null;
        }
        while (class190.field3183 > var2) {
            byte[] var3 = class67.field1100[var2];
            int var4 = class221.field3837[var2] * class106.field1751[var2];
            if (class10.field107[var2]) {
                byte[] var5 = class231.field4032[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; var7 < var4; var7++) {
                    var6[var7] = class82.method642(class191.method1366(-16777216, var5[var7] << 24), class139.field2327[class191.method1366(255, var3[var7])]);
                }
                var1[var2] = new class152(class13.field194, class122.field2078, class96.field1591[var2], class125.field2123[var2], class221.field3837[var2], class106.field1751[var2], var6);
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class139.field2327[class191.method1366(var3[var9], 255)];
                }
                var1[var2] = new class254(class13.field194, class122.field2078, class96.field1591[var2], class125.field2123[var2], class221.field3837[var2], class106.field1751[var2], var8);
            }
            var2++;
        }
        class111.method804((byte) -14);
        return var1;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static void method651(int arg0) {
        field1411 = null;
        field1416 = null;
        field1415 = null;
        if (arg0 == -1) {
            field1407 = null;
            field1403 = null;
            field1414 = null;
            field1417 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I")
    public static final int method652(int arg0, int arg1, int arg2) {
        if (arg0 >= -76) {
            method650((byte) 35);
        }
        class136 var3 = (class136) class7.field77.method1453((long) arg2, 1);
        field1401++;
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && var3.field2258.length > arg1) {
            return var3.field2258[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BLrb;)V")
    public static final void method653(byte arg0, class247 arg1) {
        int var2 = arg1.field4278 - class179.field2960;
        field1410++;
        if (arg1.field4331 == 0) {
            arg1.field4294 = 1024;
        }
        int var3 = arg1.field4345 * 64 + arg1.field4317 * 128;
        if (arg1.field4331 == 1) {
            arg1.field4294 = 1536;
        }
        if (arg0 > -45) {
            field1414 = null;
        }
        if (arg1.field4331 == 2) {
            arg1.field4294 = 0;
        }
        arg1.field4296 = 0;
        arg1.field4319 += (var3 - arg1.field4319) / var2;
        if (arg1.field4331 == 3) {
            arg1.field4294 = 512;
        }
        int var4 = arg1.field4345 * 64 + arg1.field4286 * 128;
        arg1.field4348 += (var4 - arg1.field4348) / var2;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class84() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(J)V")
    public class84(long arg0) {
        this.field1413 = arg0;
    }
}
