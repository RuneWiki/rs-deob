import java.io.IOException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class78 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[I")
    public static int[] field1353 = new int[500];

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lli;")
    private static class185 field1356 = class245.method1649("purple:", 125);

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Lli;")
    public static class185 field1357 = class245.method1649("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 2);

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Lli;")
    public static class185 field1361 = field1356;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lli;")
    public static class185 field1354 = field1356;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1365 = 0;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public static int field1366 = 0;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1355;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILjd;[B)V")
    public final void method505(int arg0, class118 arg1, byte[] arg2) {
        field1364++;
        if (arg1.field2115[arg1.field2155] != 31 || arg1.field2115[arg1.field2155 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1355 == null) {
            this.field1355 = new Inflater(true);
        }
        try {
            this.field1355.setInput(arg1.field2115, arg1.field2155 + 10, -arg1.field2155 + -8 - (10 - arg1.field2115.length));
            this.field1355.inflate(arg2);
        } catch (Exception var4) {
            this.field1355.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        if (arg0 == 255) {
            this.field1355.reset();
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static final void method506(int arg0) {
        while (true) {
            if (class142.field2669.method587(class217.field3976, (byte) -118) >= 27) {
                int var1 = class142.field2669.method581(15, 7);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class87.field1712[var1] == null) {
                        var2 = true;
                        class87.field1712[var1] = new class71();
                    }
                    class71 var3 = class87.field1712[var1];
                    class97.field1811[class108.field1943++] = var1;
                    var3.field2710 = class211.field3851;
                    if (var3.field1236 != null && var3.field1236.method533(false)) {
                        class151.method1075((byte) -108, var3);
                    }
                    int var4 = class142.field2669.method581(5, 7);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class142.field2669.method581(5, 7);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var6 = class174.field3193[class142.field2669.method581(3, 7)];
                    if (var2) {
                        var3.field2683 = var3.field2695 = var6;
                    }
                    var3.method467(class269.method1828(2, class142.field2669.method581(14, 7)), 35);
                    int var7 = class142.field2669.method581(1, 7);
                    if (var7 == 1) {
                        class80.field1404[class148.field2789++] = var1;
                    }
                    int var8 = class142.field2669.method581(1, arg0 + 24161);
                    var3.method1015(var3.field1236.field1452, 10672);
                    var3.field2705 = var3.field1236.field1421;
                    var3.field2666 = var3.field1236.field1473;
                    if (var3.field2705 == 0) {
                        var3.field2695 = 0;
                    }
                    var3.field2716 = var3.field1236.field1437;
                    var3.field2693 = var3.field1236.field1468;
                    var3.field2700 = var3.field1236.field1467;
                    var3.field2648 = var3.field1236.field1406;
                    var3.field2699 = var3.field1236.field1440;
                    var3.field2719 = var3.field1236.field1424;
                    var3.method1018(var8 == 1, var3.method1014(-1), class241.field4310.field2720[0] + var5, class241.field4310.field2651[0] - -var4, -12477);
                    if (var3.field1236.method533(false)) {
                        class117.method816(0, class265.field4703, var3, var3.field2651[0], (class188) null, 20807, (class135) null, var3.field2720[0]);
                    }
                    continue;
                }
            }
            class142.field2669.method583(-10);
            field1363++;
            if (arg0 != -24154) {
                field1357 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILli;)I")
    public static final int method507(int arg0, class185 arg1) {
        field1359++;
        if (arg0 != 255) {
            field1354 = null;
        }
        return arg1.method1311((byte) 49) + 1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZLuc;)V")
    public static final void method508(boolean arg0, class160 arg1) {
        field1362++;
        class215.field3951 = 3;
        class49.method308(true, true);
        class1.field30 = true;
        class178.field3262 = true;
        class14.field237 = true;
        class207.field3809 = 0;
        class193.field3568 = 255;
        class225.field4116 = true;
        class152.field2884 = true;
        class280.field4965 = 127;
        class95 var2 = null;
        class155.field2937 = 0;
        class97.field1821 = 0;
        class32.field533 = true;
        class236.field4222 = 0;
        class84.field1666 = 2;
        class250.field4461 = 127;
        class140.field2634 = true;
        class163.field3055 = true;
        class217.field3979 = true;
        class194.field3578 = true;
        class7.field160 = arg0;
        if (class94.field1794 >= 96) {
            class16.method119(2);
        } else {
            class16.method119(0);
        }
        class216.field3962 = 0;
        class56.field965 = 0;
        class138.field2574 = false;
        class73.field1277 = true;
        class128.field2296 = 0;
        class240.field4296 = false;
        class72.field1264 = false;
        try {
            class29 var3 = arg1.method1155("runescape", (byte) -126);
            while (var3.field487 == 0) {
                class212.method1488(1L, -101);
            }
            if (var3.field487 == 1) {
                var2 = (class95) var3.field486;
                byte[] var4 = new byte[(int) var2.method614(-44)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method615(var4.length - var5, (byte) -92, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class273.method1873(new class118(var4), (byte) -109);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method617((byte) -110);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class78() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static void method509(int arg0) {
        field1361 = null;
        field1353 = null;
        if (arg0 != 1) {
            field1360 = -60;
        }
        field1354 = null;
        field1356 = null;
        field1357 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(III)V")
    private class78(int arg0, int arg1, int arg2) {
    }
}
