import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class412 extends class490 {

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
    private int field5384 = -1;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field5381 = 503;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "B")
    private byte field5385;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field5379;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    private int field5383;

    @OriginalMember(owner = "client!lp", name = "p", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!lp", name = "q", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "Ljava/lang/String;")
    private String field5382;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)Z", line = 8)
    public static final boolean method2456(byte arg0, int arg1) {
        field5379++;
        int var2 = -106 / ((arg0 + 52) / 48);
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Les;I)V", line = 21)
    public final void method2457(class403 arg0, int arg1) {
        if (arg1 < 118) {
            method2456((byte) -60, -116);
        }
        this.field5384 = arg0.method2390((byte) 110);
        field5386++;
        this.field5385 = arg0.method2392(114);
        this.field5383 = arg0.method2390((byte) 24);
        arg0.method2361(94);
        this.field5382 = arg0.method2384(-6435);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLha;)V", line = 38)
    public static final void method2458(byte arg0, class66 arg1) {
        field5387++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -115) {
            field5381 = -121;
        }
        if (class769.field10572) {
            var2 = class793.method4373((byte) 53);
            var3 = class719.method4070((byte) 103);
        }
        int var4 = class705.field9916 + var2;
        int var5 = class676.field9279 + var3;
        int var6 = class119.field1505;
        int var7 = class553.field7697 - 3;
        byte var8 = 20;
        class15.method200(class553.field7697, arg0 - 3178, var8, class705.field9916 + var2, class676.field9279 + var3, class119.field1505, class637.field8699.method3584(class770.field10592, true), arg1);
        int var9 = class738.field10291.method109(122) + var2;
        int var10 = class738.field10291.method117(true) + var3;
        if (class304.field3626) {
            int var14 = 0;
            for (class581 var15 = (class581) class365.field4542.method1003((byte) 53); var15 != null; var15 = (class581) class365.field4542.method1004(true)) {
                int var28 = var5 + var8 + (var14 * 16) + 13;
                var14++;
                if ((class705.field9916 + var2) < var9 && var9 < class119.field1505 + var2 + class705.field9916 && var10 > (var28 - 13) && (var28 + 4) > var10 && (var15.field7927 > 1 || ((class75) var15.field7925.field1703.field1903).field1023)) {
                    arg1.method645(class705.field9916 + var2, var28 + -12, class119.field1505, 16, class757.field10489 | 255 - class43.field595 << 24, 1);
                }
            }
            if (class288.field3466 != null) {
                class15.method200(class711.field9978, -3293, var8, class743.field10352, class656.field9045, class189.field2275, class288.field3466.field7922, arg1);
                int var16 = 0;
                for (class75 var17 = (class75) class288.field3466.field7925.method1003((byte) 53); var17 != null; var17 = (class75) class288.field3466.field7925.method1004(true)) {
                    int var18 = var16 * 16 + class656.field9045 + var8 + 13;
                    var16++;
                    if (class743.field10352 < var9 && var9 < (class743.field10352 + class189.field2275) && var10 > (var18 - 13) && var18 + 4 > var10 && var17.field1023) {
                        arg1.method645(class743.field10352, var18 - 12, class189.field2275, 16, 255 - class43.field595 << 24 | class757.field10489, 1);
                    }
                }
                class180.method1212(class743.field10352, arg1, class189.field2275, var8, -115, class711.field9978, class656.field9045);
            }
        } else {
            int var11 = 0;
            for (class75 var12 = (class75) class5.field52.method2725(37); var12 != null; var12 = (class75) class5.field52.method2726(-119)) {
                int var13 = var5 + var8 - (-((-var11 + -1 + class245.field2894) * 16) + -13);
                if ((class705.field9916 + var2) < var9 && var9 < (class705.field9916 + var2 + class119.field1505) && var10 > (var13 - 13) && var10 < var13 + 4 && var12.field1023) {
                    arg1.method645(class705.field9916 + var2, var13 - 12, class119.field1505, 16, 255 - class43.field595 << 24 | class757.field10489, 1);
                }
                var11++;
            }
        }
        class180.method1212(class705.field9916 + var2, arg1, class119.field1505, var8, arg0 ^ 0xF, class553.field7697, class676.field9279 + var3);
        if (class304.field3626) {
            int var19 = 0;
            for (class581 var20 = (class581) class365.field4542.method1003((byte) 53); var20 != null; var20 = (class581) class365.field4542.method1004(true)) {
                int var24 = var19 * 16 + (class676.field9279 + var3) + var8 + 13;
                if (var20.field7927 == 1) {
                    class521.method3130(var9, class676.field9279 + var3, var10, arg1, class219.field2575 | 0xFF000000, class553.field7697, (class75) var20.field7925.field1703.field1903, class119.field1505, (byte) -115, var24, class705.field9916 + var2, class137.field1723 | 0xFF000000);
                } else {
                    class186.method1240(arg1, class119.field1505, var24, class676.field9279 + var3, var9, class137.field1723 | 0xFF000000, var20, var10, -13, class705.field9916 + var2, class553.field7697, class219.field2575 | 0xFF000000);
                }
                var19++;
            }
            if (class288.field3466 != null) {
                int var21 = 0;
                for (class75 var22 = (class75) class288.field3466.field7925.method1003((byte) 53); var22 != null; var22 = (class75) class288.field3466.field7925.method1004(true)) {
                    int var23 = var21 * 16 + class656.field9045 + var8 + 13;
                    class521.method3130(var9, class656.field9045, var10, arg1, class219.field2575 | 0xFF000000, class711.field9978, var22, class189.field2275, (byte) -125, var23, class743.field10352, class137.field1723 | 0xFF000000);
                    var21++;
                }
                class377.method2210(false, class743.field10352, class189.field2275, class656.field9045, class711.field9978);
            }
        } else {
            int var25 = 0;
            for (class75 var26 = (class75) class5.field52.method2725(37); var26 != null; var26 = (class75) class5.field52.method2726(-126)) {
                int var27 = (class245.field2894 - (var25 + 1)) * 16 + var5 + var8 + 13;
                class521.method3130(var9, var5, var10, arg1, class219.field2575 | 0xFF000000, var7, var26, var6, (byte) -106, var27, var4, class137.field1723 | 0xFF000000);
                var25++;
            }
        }
        class377.method2210(false, class705.field9916 + var2, class119.field1505, class676.field9279 + var3, class553.field7697);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lwt;I)V", line = 214)
    public final void method2459(class330 arg0, int arg1) {
        field5380++;
        if (arg1 == 0) {
            class216 var3 = arg0.field4076[this.field5384];
            var3.field2543 = this.field5383;
            var3.field2544 = this.field5382;
            var3.field2539 = this.field5385;
        }
    }
}
