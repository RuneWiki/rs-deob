import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class237 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3739 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field3745 = 0;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method1568(int arg0) {
        if (arg0 != 14538) {
            field3742 = -62;
        }
        field3739 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "([BI)V")
    public static final void method1569(byte[] arg0, int arg1) {
        field3740++;
        class136 var2 = new class136(arg0);
        var2.field2231 = arg0.length - 2;
        class132.field2195 = var2.method996(arg1 ^ 0xFFFF3FF0);
        class92.field1452 = new byte[class132.field2195][];
        class193.field3155 = new int[class132.field2195];
        class111.field1711 = new boolean[class132.field2195];
        class197.field3224 = new int[class132.field2195];
        class66.field1082 = new byte[class132.field2195][];
        class19.field268 = new int[class132.field2195];
        class4.field56 = new int[class132.field2195];
        var2.field2231 = arg0.length - (class132.field2195 * 8) - 7;
        class287.field4592 = var2.method996(65280);
        class20.field315 = var2.method996(65280);
        int var3 = (var2.method1012(arg1 + 16148) & 0xFF) + 1;
        for (int var4 = 0; var4 < class132.field2195; var4++) {
            class193.field3155[var4] = var2.method996(65280);
        }
        for (int var5 = 0; var5 < class132.field2195; var5++) {
            class197.field3224[var5] = var2.method996(65280);
        }
        if (arg1 != -16144) {
            method1569((byte[]) null, -34);
        }
        for (int var6 = 0; var6 < class132.field2195; var6++) {
            class4.field56[var6] = var2.method996(65280);
        }
        for (int var7 = 0; var7 < class132.field2195; var7++) {
            class19.field268[var7] = var2.method996(65280);
        }
        var2.field2231 = arg0.length + 3 - (var3 * 3) - (class132.field2195 * 8) - 7;
        class244.field3857 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class244.field3857[var8] = var2.method1009(121);
            if (class244.field3857[var8] == 0) {
                class244.field3857[var8] = 1;
            }
        }
        var2.field2231 = 0;
        for (int var9 = 0; var9 < class132.field2195; var9++) {
            int var10 = class4.field56[var9];
            int var11 = class19.field268[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class66.field1082[var9] = var14;
            boolean var15 = false;
            class92.field1452[var9] = var13;
            int var16 = var2.method1012(4);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method981(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method981(false);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label101: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var10) {
                                break label101;
                            }
                            for (int var22 = 0; var22 < var11; var22++) {
                                byte var23 = var13[var10 * var22 + var21] = var2.method981(false);
                                var15 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var11; var24++) {
                        var14[var10 * var24 + var20] = var2.method981(false);
                    }
                    var20++;
                }
            }
            class111.field1711[var9] = var15;
        }
    }
}
