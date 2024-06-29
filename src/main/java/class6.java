import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 {

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "Lfc;")
    private static class39 field187 = class90.method774("Press (Wrecover a locked account(W on front page)3", -82);

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field192 = -1;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Z")
    public static boolean field194 = false;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static volatile int field197 = -1;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lfc;")
    public static class39 field189 = field187;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lfc;")
    public static class39 field190 = class90.method774(":", -123);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "Lfc;")
    public static class39 field196 = class90.method774("Untersuchen", -128);

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "Lfc;")
    public static class39 field198 = class90.method774("backbase2", -127);

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lfc;")
    private static class39 field200 = class90.method774("Enter name of player to add to list", -116);

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lfc;")
    public static class39 field202 = field200;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 31)
    public static final void method86(int arg0, int arg1) {
        if (arg1 < 37) {
            method91(-123, 56, 52);
        }
        if (class101.field2547 == 0) {
            class103.field2582.method187((byte) -123, arg0);
        } else {
            class150.field3711 = arg0;
        }
        field193++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 76)
    public static void method87(byte arg0) {
        field189 = null;
        field190 = null;
        field202 = null;
        field187 = null;
        field196 = null;
        field198 = null;
        field200 = null;
        if (arg0 >= -121) {
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BI)V", line = 115)
    public static final void method88(byte[] arg0, int arg1) {
        field188++;
        class25 var2 = new class25(arg0);
        var2.field710 = arg0.length - 2;
        class70.field1650 = var2.method301(-4853);
        class101.field2515 = new int[class70.field1650];
        class15.field395 = new byte[class70.field1650][];
        class131.field3287 = new int[class70.field1650];
        class72.field1686 = new int[class70.field1650];
        class115.field3026 = new int[class70.field1650];
        var2.field710 = arg0.length - class70.field1650 * 8 - 7;
        class44.field1189 = var2.method301(-4853);
        class1.field3 = var2.method301(-4853);
        int var3 = (var2.method322((byte) -50) & 0xFF) + 1;
        for (int var4 = 0; var4 < class70.field1650; var4++) {
            class131.field3287[var4] = var2.method301(-4853);
        }
        for (int var5 = 0; var5 < class70.field1650; var5++) {
            class72.field1686[var5] = var2.method301(-4853);
        }
        for (int var6 = 0; var6 < class70.field1650; var6++) {
            class101.field2515[var6] = var2.method301(-4853);
        }
        if (arg1 <= 60) {
            field194 = false;
        }
        for (int var7 = 0; var7 < class70.field1650; var7++) {
            class115.field3026[var7] = var2.method301(-4853);
        }
        var2.field710 = arg0.length + 3 - class70.field1650 * 8 - var3 * 3 - 7;
        class1.field27 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class1.field27[var8] = var2.method310(true);
            if (class1.field27[var8] == 0) {
                class1.field27[var8] = 1;
            }
        }
        var2.field710 = 0;
        for (int var9 = 0; var9 < class70.field1650; var9++) {
            int var10 = class101.field2515[var9];
            int var11 = class115.field3026[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class15.field395[var9] = var13;
            int var14 = var2.method322((byte) -50);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method293(-127);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method293(-112);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 254)
    public static final void method89(byte arg0) {
        field191++;
        if (arg0 != 118) {
            return;
        }
        if (class74.field1705 && class94.field2207 != class24.field661) {
            class28.method353(class24.field661, class68.field1618, arg0 - 27, class28.field817, class94.field2197.field2913[0], class94.field2197.field2926[0]);
        } else if (class24.field661 != class139.field3519) {
            class139.field3519 = class24.field661;
            class150.method1198(class24.field661, (byte) 6);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V", line = 317)
    public static final void method90(byte arg0) {
        class116.field3065.method691(-77);
        field199++;
        class78.field1781.method1155(0, 0);
        class40.method490();
        int var1 = 17 / ((47 - arg0) / 63);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z", line = 350)
    public static final boolean method91(int arg0, int arg1, int arg2) {
        field195++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        if (arg0 != 10) {
            method90((byte) -100);
        }
        class35 var3 = class90.method776(arg1, -125);
        return var3.method411(115, arg2);
    }
}
