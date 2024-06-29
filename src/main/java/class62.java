import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class62 implements Runnable {

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
    public boolean field1325 = true;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field1319 = new Object();

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[I")
    public int[] field1333 = new int[500];

    @OriginalMember(owner = "client!j", name = "s", descriptor = "[I")
    public int[] field1335 = new int[500];

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public int field1334 = 0;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public static int field1320 = -1;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Loa;")
    public static class98 field1329 = class38.method349(255, "Welt");

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Loa;")
    public static class98 field1332 = class38.method349(255, "::fpson");

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Loa;")
    public static class98 field1330 = class38.method349(255, "blinken3:");

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "Lrb;")
    public static class118 field1317;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lmd;")
    public static class87 field1328;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[I")
    public static int[] field1318;

    @OriginalMember(owner = "client!j", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1325) {
            Object var1 = this.field1319;
            synchronized (this.field1319) {
                if (this.field1334 < 500) {
                    this.field1335[this.field1334] = class42.field990;
                    this.field1333[this.field1334] = class123.field2749;
                    this.field1334++;
                }
            }
            class82.method691(50L, (byte) -122);
        }
        field1331++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Loa;ILtb;Loa;)Lgb;")
    public static final class45 method501(class98 arg0, int arg1, class130 arg2, class98 arg3) {
        int var4 = arg2.method1060((byte) -109, arg3);
        field1321++;
        if (arg1 != 836) {
            field1330 = null;
        }
        int var5 = arg2.method1048(arg0, var4, (byte) -78);
        return class90.method735(arg2, (byte) 97, var5, var4);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public static void method502(byte arg0) {
        if (arg0 != -47) {
            return;
        }
        field1329 = null;
        field1330 = null;
        field1328 = null;
        field1332 = null;
        field1318 = null;
        field1317 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BJ)V")
    public static final void method503(byte arg0, long arg1) {
        field1327++;
        if (arg1 == 0L) {
            return;
        }
        if (class49.field1112 >= 100 && class56.field1256 != 1 || class49.field1112 >= 200) {
            class90.method736(0, class120.field2703, true, class145.field3503);
            return;
        }
        class98 var3 = class19.method183(-30, arg1).method785(10);
        if (arg0 != -74) {
            method506(null, 74, -29, 76);
        }
        for (int var4 = 0; var4 < class49.field1112; var4++) {
            if (class4.field67[var4] == arg1) {
                class90.method736(0, class102.method840(new class98[] { var3, client.field501 }, 10), true, class145.field3503);
                return;
            }
        }
        for (int var5 = 0; var5 < class77.field1697; var5++) {
            if (class102.field2345[var5] == arg1) {
                class90.method736(0, class102.method840(new class98[] { class131.field3083, var3, class88.field2035 }, arg0 ^ 0xFFFFFFBC), true, class145.field3503);
                return;
            }
        }
        if (var3.method801((byte) -55, class73.field1536.field1212)) {
            return;
        }
        class65.field1386++;
        class134.field3287[class49.field1112] = var3;
        class4.field67[class49.field1112] = arg1;
        class105.field2404[class49.field1112] = 0;
        class73.field1521[class49.field1112] = 0;
        class137.field3332 = true;
        class6.field99 = class119.field2680 + 1;
        class49.field1112++;
        class132.field3116.method177(6624, 127);
        class132.field3116.method92(true, arg1);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)V")
    public static final void method504(int arg0, int arg1) {
        field1324++;
        if (!client.method202(arg1, -642990672)) {
            return;
        }
        class132[] var2 = class36.field901[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class132 var4 = var2[var3];
            if (var4 != null) {
                var4.field3132 = 0;
                var4.field3110 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(B)V")
    public static final void method505(byte arg0) {
        field1322++;
        class84.method704(80);
        class150.method1206((byte) 21);
        class114.method920(false);
        class115.method925((byte) 64);
        class134.method1087(0);
        class123.method971(-8594);
        class65.method525(-76);
        class97.method772(1);
        class140.method1126(-98);
        class42.method361(0);
        class137.method1117((byte) -124);
        class98.method811(28944);
        ((class32) class66.field1408).method311(0);
        class81.field1836.method734(-224779128);
        class132.field3172.method1051((byte) 120);
        class127.field2845.method1051((byte) 119);
        class14.field298.method1051((byte) 126);
        class15.field310.method1051((byte) 127);
        class3.field41.method1051((byte) 127);
        class121.field2714.method1051((byte) -119);
        class24.field589.method1051((byte) 122);
        class135.field3290.method1051((byte) -6);
        class57.field1270.method1051((byte) -58);
        int var1 = -128 % ((-arg0 - 76) / 45);
        class132.field3170.method1051((byte) -15);
        class3.field29.method1051((byte) 120);
        class123.field2748.method1051((byte) -125);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lid;III)V")
    public static final void method506(class60 arg0, int arg1, int arg2, int arg3) {
        field1326++;
        if (arg3 != -7765) {
            return;
        }
        int var4 = arg1 * arg1 + arg2 * arg2;
        if (var4 <= 4225 || var4 >= 90000) {
            class27.method279(arg1, arg2, arg0, -65);
            return;
        }
        int var5 = class25.field611 + class21.field462 & 0x7FF;
        int var6 = class66.field1417[var5];
        int var7 = var6 * 256 / (class76.field1662 + 256);
        int var8 = class66.field1419[var5];
        int var9 = var8 * 256 / (class76.field1662 + 256);
        int var10 = arg1 * var9 + arg2 * var7 >> 16;
        int var11 = arg1 * var7 - arg2 * var9 >> 16;
        double var12 = Math.atan2((double) var10, (double) var11);
        int var14 = (int) (Math.sin(var12) * 63.0D);
        int var15 = (int) (Math.cos(var12) * 57.0D);
        class145.field3504.method491(var14 + 94 + 4 - 10, -var15 + -20 + 83, 20, 20, 15, 15, var12, 256);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII[Loa;)Loa;")
    public static final class98 method507(boolean arg0, int arg1, int arg2, class98[] arg3) {
        field1323++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg2; var5++) {
            if (arg3[arg1 + var5] == null) {
                arg3[arg1 + var5] = class31.field735;
            }
            var4 += arg3[arg1 + var5].field2277;
        }
        byte[] var6 = new byte[var4];
        if (!arg0) {
            method506(null, 20, -57, -9);
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class98 var10 = arg3[arg1 + var8];
            class9.method108(var10.field2255, 0, var6, var7, var10.field2277);
            var7 += var10.field2277;
        }
        class98 var9 = new class98();
        var9.field2255 = var6;
        var9.field2277 = var4;
        return var9;
    }
}
