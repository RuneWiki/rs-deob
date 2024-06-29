import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class22 {

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public int field543 = -1;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lqe;")
    public static class179 field539 = class206.method1380("Geben Sie Ihren Benutzernamen", (byte) -127);

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field548 = 0;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lqe;")
    public static class179 field546 = class206.method1380(" x ", (byte) 56);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Lqe;")
    public static class179 field540 = class206.method1380("null", (byte) -126);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lqe;")
    private static class179 field551 = class206.method1380("Error connecting to server)3", (byte) 102);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lqe;")
    public static class179 field537 = field551;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Lmh;")
    public class138 field549;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lcd;")
    public static class26 field541;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[I")
    public int[] field550;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "[Lqe;")
    public class179[] field545;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BLtd;)V")
    public static final void method151(byte arg0, class208 arg1) {
        field547++;
        if (arg0 != 124 || class70.field1405 != 1) {
            return;
        }
        short var2 = 280;
        if (var2 <= class68.field1361 && class68.field1361 <= var2 + 14 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(0, 111, 0);
            return;
        }
        if (class68.field1361 >= var2 + 15 && class68.field1361 <= var2 + 80 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(0, arg0 ^ 0xFFFFFFFB, 1);
            return;
        }
        short var3 = 390;
        if (var3 <= class68.field1361 && class68.field1361 <= var3 + 14 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(1, arg0 ^ 0xFFFFFFD0, 0);
            return;
        }
        if (var3 + 15 <= class68.field1361 && var3 + 80 >= class68.field1361 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(1, -114, 1);
            return;
        }
        short var4 = 500;
        if (var4 <= class68.field1361 && var4 + 14 >= class68.field1361 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(2, 99, 0);
            return;
        }
        if (var4 + 15 <= class68.field1361 && class68.field1361 <= var4 + 80 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(2, 100, 1);
            return;
        }
        short var5 = 610;
        if (class68.field1361 >= var5 && class68.field1361 <= var5 + 14 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(3, 104, 0);
            return;
        }
        if (class68.field1361 >= var5 + 15 && class68.field1361 <= var5 + 80 && class175.field3141 >= 4 && class175.field3141 <= 18) {
            class202.method1343(3, 124, 1);
            return;
        }
        if (class68.field1361 >= 700 && class175.field3141 >= 4 && class68.field1361 <= 758 && class175.field3141 <= 20) {
            class138.field2541 = false;
            class36.method232((byte) 101);
            return;
        }
        if (class219.field4056 == -1) {
            return;
        }
        class163 var6 = class13.field326[class219.field4056];
        if (var6.field2943 == class134.field2444) {
            byte[] var7 = class78.method502((byte) -108, new class179[] { var6.field2930, class125.field2314 }).method1158(29570);
            class222.field4090 = new String(var7, 0, var7.length);
            if (class240.field4411 != 0) {
                class240.field4411 = 0;
                class234.field4316 = 43594;
                class109.field2050 = 43594;
                class93.field1764 = 443;
            }
            class138.field2541 = false;
            class136.field2515 = var6.field2942;
            class36.method232((byte) 71);
            return;
        }
        class179 var8 = class78.method502((byte) -92, new class179[] { class197.field3652, var6.field2930, class160.field2911, class148.method949((byte) -14, class113.field2129), class129.field2358, class148.method949((byte) -14, class180.field3307 ? 1 : 0), class52.field1089, class148.method949((byte) -14, class59.field1258), class115.field2178, class148.method949((byte) -14, class180.field3329) });
        try {
            arg1.getAppletContext().showDocument(var8.method1167(false), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method152(int arg0) {
        field539 = null;
        int var1 = -126 / ((41 - arg0) / 61);
        field537 = null;
        field546 = null;
        field541 = null;
        field551 = null;
        field540 = null;
    }
}
