import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class69 extends class82 {

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "[I")
    public static int[] field1091 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "Ljava/lang/String;")
    public static String field1094 = "Continue";

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "Ljava/lang/String;")
    public static String field1097 = "Loaded defaults";

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "I")
    public int field1082;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "I")
    public int field1083;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public int field1087;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public int field1089;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public static void method458(int arg0) {
        field1091 = null;
        if (arg0 != 10) {
            field1094 = null;
        }
        field1094 = null;
        field1097 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lfl;I)V")
    public static final void method459(class248 arg0, int arg1) {
        field1090++;
        if (arg1 != -29967) {
            return;
        }
        while (true) {
            while (arg0.field3748 < arg0.field3723.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method1593((byte) 27) == 1) {
                    var2 = arg0.method1593((byte) 27);
                    var4 = arg0.method1593((byte) 27);
                    var3 = true;
                }
                int var5 = arg0.method1593((byte) 27);
                int var6 = arg0.method1593((byte) 27);
                int var7 = var5 * 64 - class119.field1798;
                int var8 = class99.field1564 + class79.field1274 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && class106.field1616 > var7 + 63 && var8 < class99.field1564) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var2 * 8 <= var11 && (var2 * 8 + 8) > var11 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method1604(4);
                                if (var13 != 0) {
                                    if (class239.field3600[var9][var10] == null) {
                                        class239.field3600[var9][var10] = new byte[4096];
                                    }
                                    class239.field3600[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1604(4);
                                    if (class97.field1532[var9][var10] == null) {
                                        class97.field1532[var9][var10] = new byte[4096];
                                    }
                                    class97.field1532[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1604(4);
                        if (var16 != 0) {
                            arg0.field3748++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V")
    public static final void method460(int arg0) {
        if (arg0 != 13) {
            field1091 = null;
        }
        class287.field4298.method1775(27147);
        field1092++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Z")
    public static final boolean method461(int arg0, int arg1) {
        field1081++;
        if (class267.field4018 == arg1) {
            return false;
        } else if (arg0 == 11448) {
            class229.field3461 = new int[4][13][13];
            class187.field2828 = new int[104][104];
            for (int var2 = 0; var2 < 4; var2++) {
                class202.field3052[var2] = new class31(104, 104);
            }
            class221.field3333 = new byte[4][104][104];
            class267.field4018 = arg1;
            class272.field4093 = new byte[4][104][104];
            class251.field3816 = new class159[4][104][104];
            return true;
        } else {
            return true;
        }
    }
}
