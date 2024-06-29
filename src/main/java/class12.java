import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 {

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public int field185 = -1;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field184 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "Z")
    public static boolean field189 = true;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public int field183;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public int field192;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public int field193;

    @OriginalMember(owner = "client!daa", name = "l", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!daa", name = "m", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
    public static void method69(boolean arg0) {
        if (!arg0) {
            field184 = null;
        }
        field184 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method70(int arg0, String arg1) {
        field191++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class177.method1336(arg1, (byte) 75);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 < 108) {
            method70(3, null);
        }
        while (class766.field10564 > var3) {
            String var4 = class174.field2766[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class177.method1336(var4, (byte) 75);
            if (var5 != null && var5.equals(var2)) {
                class766.field10564--;
                for (int var6 = var3; var6 < class766.field10564; var6++) {
                    class174.field2766[var6] = class174.field2766[var6 + 1];
                    class603.field8439[var6] = class603.field8439[var6 + 1];
                    class707.field9726[var6] = class707.field9726[var6 + 1];
                    class343.field4618[var6] = class343.field4618[var6 + 1];
                    class766.field10567[var6] = class766.field10567[var6 + 1];
                }
                class80.field1117++;
                class720.field9894 = class62.field859;
                class537 var7 = class476.method2729(class411.field5624, (byte) -46, class551.field7498);
                var7.field7295.method754(class703.method3926(120, arg1), 71);
                var7.field7295.method783((byte) -102, arg1);
                class173.method1314(false, var7);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(B)V")
    public static final void method71(byte arg0) {
        field186++;
        int var1 = class262.field3679.method777((byte) 114);
        class215.field3195 = class262.field3679.method779((byte) 118);
        int var2 = class262.field3679.method793((byte) 89);
        int var3 = class262.field3679.method777((byte) -92);
        boolean var4 = class262.field3679.method793((byte) 6) == 1;
        class744.method4130((byte) 22);
        class535.method3035((byte) 126, var2);
        class262.field3679.method2079((byte) -42);
        int var5 = 0;
        if (arg0 > -21) {
            method71((byte) 9);
        }
        while (var5 < 4) {
            for (int var20 = 0; var20 < (class483.field6515 >> 3); var20++) {
                for (int var21 = 0; var21 < (class65.field926 >> 3); var21++) {
                    int var22 = class262.field3679.method2078(1, 15455);
                    if (var22 == 1) {
                        class220.field3229[var5][var20][var21] = class262.field3679.method2078(26, 15455);
                    } else {
                        class220.field3229[var5][var20][var21] = -1;
                    }
                }
            }
            var5++;
        }
        class262.field3679.method2081(false);
        int var6 = (class11.field179 - class262.field3679.field1442) / 16;
        class82.field1135 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class82.field1135[var7][var19] = class262.field3679.method773(3);
            }
        }
        class783.field10755 = new byte[var6][];
        class286.field3935 = new byte[var6][];
        class201.field3055 = new int[var6];
        class320.field4373 = new int[var6];
        class450.field6173 = new int[var6];
        class444.field6024 = new byte[var6][];
        class532.field7197 = null;
        class537.field7299 = new int[var6];
        class79.field1114 = new int[var6];
        class120.field2189 = null;
        class1.field15 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class483.field6515 >> 3); var10++) {
                for (int var11 = 0; var11 < (class65.field926 >> 3); var11++) {
                    int var12 = class220.field3229[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class201.field3055[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class201.field3055[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class79.field1114[var8] = class193.field2947.method3738(-1, "m" + var17 + "_" + var18);
                            class320.field4373[var8] = class193.field2947.method3738(-1, "l" + var17 + "_" + var18);
                            class450.field6173[var8] = class193.field2947.method3738(-1, "um" + var17 + "_" + var18);
                            class537.field7299[var8] = class193.field2947.method3738(-1, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class465.method2683(126, 11, var3, var4, var1);
    }
}
