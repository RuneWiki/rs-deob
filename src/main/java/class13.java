import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "Ljd;")
    public static class85 field197 = class221.method1499("overlay2", (byte) -69);

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Lve;")
    public static class184 field200 = new class184(200);

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljb;")
    public static class255 field202;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Lge;")
    public static class68 field196;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method103(int arg0) {
        try {
            if (class39.field615 == null) {
                class39.field615 = new class94(class107.field1882, class172.method1150(new class85[] { class221.method1502((byte) -13), class129.field2259 }, 0).method631(-120));
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class39.field615 = null;
        }
        if (arg0 == 8) {
            field199++;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "([BB)V")
    public static final void method104(byte[] arg0, byte arg1) {
        field198++;
        class247 var2 = new class247(arg0);
        var2.field4224 = arg0.length - 2;
        class95.field1741 = var2.method1694((byte) -100);
        class246.field4200 = new int[class95.field1741];
        class30.field443 = new int[class95.field1741];
        class178.field3060 = new byte[class95.field1741][];
        class121.field2134 = new int[class95.field1741];
        class37.field577 = new boolean[class95.field1741];
        class122.field2139 = new byte[class95.field1741][];
        class244.field4165 = new int[class95.field1741];
        var2.field4224 = arg0.length - class95.field1741 * 8 - 7;
        class251.field4331 = var2.method1694((byte) -100);
        class229.field3961 = var2.method1694((byte) -100);
        int var3 = (var2.method1711((byte) -67) & 0xFF) + 1;
        for (int var4 = 0; var4 < class95.field1741; var4++) {
            class246.field4200[var4] = var2.method1694((byte) -100);
        }
        for (int var5 = 0; var5 < class95.field1741; var5++) {
            class121.field2134[var5] = var2.method1694((byte) -100);
        }
        for (int var6 = 0; var6 < class95.field1741; var6++) {
            class30.field443[var6] = var2.method1694((byte) -100);
        }
        for (int var7 = 0; var7 < class95.field1741; var7++) {
            class244.field4165[var7] = var2.method1694((byte) -100);
        }
        var2.field4224 = arg0.length + 3 - class95.field1741 * 8 - (var3 * 3) - 7;
        class2.field20 = new int[var3];
        int var8 = 1;
        if (arg1 <= 2) {
            field197 = null;
        }
        while (var3 > var8) {
            class2.field20[var8] = var2.method1691(19388);
            if (class2.field20[var8] == 0) {
                class2.field20[var8] = 1;
            }
            var8++;
        }
        var2.field4224 = 0;
        for (int var9 = 0; var9 < class95.field1741; var9++) {
            int var10 = class244.field4165[var9];
            int var11 = class30.field443[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class178.field3060[var9] = var15;
            class122.field2139[var9] = var13;
            int var16 = var2.method1711((byte) -67);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var15[var17] = var2.method1690(true);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method1690(true);
                        var14 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label99: while (true) {
                    if (var20 >= var11) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var11 <= var21) {
                                break label99;
                            }
                            for (int var22 = 0; var22 < var10; var22++) {
                                byte var23 = var13[var21 + (var11 * var22)] = var2.method1690(true);
                                var14 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var10; var24++) {
                        var15[var11 * var24 + var20] = var2.method1690(true);
                    }
                    var20++;
                }
            }
            class37.field577[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method105(int arg0) {
        if (arg0 == 3) {
            field197 = null;
            field202 = null;
            field196 = null;
            field200 = null;
        }
    }
}
