import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class100 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "[[S")
    public static short[][] field1763 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "Lid;")
    public static class149 field1766 = class60.method382(" ", (byte) 61);

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Lid;")
    public static class149 field1770 = class60.method382(")3)3)3", (byte) 21);

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public int field1761;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public int field1767;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "J")
    public long field1765;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "Lug;")
    public class199 field1764;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method717(int arg0) {
        field1769++;
        if (arg0 <= 37) {
            method719(5);
        }
        for (class107 var1 = (class107) class166.field3083.method1140(0); var1 != null; var1 = (class107) class166.field3083.method1127(0)) {
            class39 var2 = var1.field1848;
            if (class277.field4948 != var2.field612 || var2.field586 < class118.field2022) {
                var1.method401((byte) -118);
            } else if (class118.field2022 >= var2.field611) {
                if (var2.field584 > 0) {
                    class20 var3 = class38.field572[var2.field584 - 1];
                    if (var3 != null && var3.field2347 >= 0 && var3.field2347 < 13312 && var3.field2340 >= 0 && var3.field2340 < 13312) {
                        var2.method231((byte) -85, var3.field2347, class287.method1968(var2.field612, var3.field2347, var3.field2340, (byte) -51) - var2.field610, var3.field2340, class118.field2022);
                    }
                }
                if (var2.field584 < 0) {
                    int var4 = -var2.field584 - 1;
                    class127 var5;
                    if (class258.field4514 == var4) {
                        var5 = class77.field1449;
                    } else {
                        var5 = class107.field1851[var4];
                    }
                    if (var5 != null && var5.field2347 >= 0 && var5.field2347 < 13312 && var5.field2340 >= 0 && var5.field2340 < 13312) {
                        var2.method231((byte) -117, var5.field2347, class287.method1968(var2.field612, var5.field2347, var5.field2340, (byte) 121) - var2.field610, var5.field2340, class118.field2022);
                    }
                }
                var2.method227((byte) 28, class149.field2683);
                class131.method927(class277.field4948, (int) var2.field605, (int) var2.field587, (int) var2.field602, 60, var2, var2.field580, -1L, false);
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Lrh;")
    public static final class46 method718(int arg0) {
        field1762++;
        byte[] var1 = class73.field1276[0];
        int var2 = class55.field991[0] * class283.field5005[0];
        if (arg0 != 255) {
            return null;
        }
        class46 var5;
        if (class106.field1834[0]) {
            int[] var6 = new int[var2];
            byte[] var7 = class69.field1199[0];
            for (int var8 = 0; var8 < var2; var8++) {
                var6[var8] = class40.method238(class108.field1865[class136.method953(var1[var8], 255)], class136.method953(var7[var8], 255) << 24);
            }
            var5 = new class274(class251.field4406, class286.field5082, class147.field2651[0], class18.field259[0], class283.field5005[0], class55.field991[0], var6);
        } else {
            int[] var3 = new int[var2];
            for (int var4 = 0; var4 < var2; var4++) {
                var3[var4] = class108.field1865[class136.method953(var1[var4], 255)];
            }
            var5 = new class46(class251.field4406, class286.field5082, class147.field2651[0], class18.field259[0], class283.field5005[0], class55.field991[0], var3);
        }
        class103.method731(false);
        return var5;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public static void method719(int arg0) {
        field1763 = null;
        if (arg0 != 11146) {
            field1763 = null;
        }
        field1766 = null;
        field1770 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method720(Throwable arg0, String arg1, int arg2) {
        field1768++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class38.method223((byte) 7, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class19.method106(var3, arg2 - 11069);
            String var4 = class159.method1145("%3a", ":", var3, arg2 - 93);
            String var5 = class159.method1145("%40", "@", var4, -104);
            String var6 = class159.method1145("%26", "&", var5, arg2 ^ 0xFFFFFF95);
            String var7 = class159.method1145("%23", "#", var6, arg2 ^ 0xFFFFFF95);
            if (class263.field4682.field436 == null) {
                return;
            }
            class187 var8 = class263.field4682.method165(102, new URL(class263.field4682.field436.getCodeBase(), "clienterror.ws?c=" + class10.field141 + "&u=" + class198.field3594 + "&v1=" + class29.field437 + "&v2=" + class29.field432 + "&e=" + var7));
            while (var8.field3358 == 0) {
                class151.method1074(-128, 1L);
            }
            if (var8.field3358 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3357;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        if (arg2 != 1) {
            field1763 = null;
        }
    }
}
