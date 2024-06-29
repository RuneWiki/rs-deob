import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class75 {

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "S")
    public static short field1085 = 32767;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "[[I")
    public static int[][] field1087 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field1081;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "I")
    public int field1086;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Luf;")
    public class177 field1084;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "Llc;")
    public static class86 field1076;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[I")
    public int[] field1080;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III[I[I)V")
    public static final void method543(int arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field1082++;
        if (arg1 != 0 || arg2 >= arg0) {
            return;
        }
        int var5 = arg2;
        int var6 = (arg0 + arg2) / 2;
        int var7 = arg4[var6];
        arg4[var6] = arg4[arg0];
        arg4[arg0] = var7;
        int var8 = arg3[var6];
        arg3[var6] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg2; var9 < arg0; var9++) {
            if ((var9 & 0x1) + var7 < arg4[var9]) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var5];
                arg4[var5] = var10;
                int var11 = arg3[var9];
                arg3[var9] = arg3[var5];
                arg3[var5++] = var11;
            }
        }
        arg4[arg0] = arg4[var5];
        arg4[var5] = var7;
        arg3[arg0] = arg3[var5];
        arg3[var5] = var8;
        method543(var5 - 1, 0, arg2, arg3, arg4);
        method543(arg0, 0, var5 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLqi;I)I")
    public static final int method544(byte arg0, class131 arg1, int arg2) {
        int var3 = -81 % (arg0 / 62);
        field1074++;
        if (!client.method1168(arg1).method532(arg2, (byte) -29) && arg1.field2141 == null) {
            return -1;
        } else if (arg1.field2143 == null || arg1.field2143.length <= arg2) {
            return -1;
        } else {
            return arg1.field2143[arg2];
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method545(byte arg0) {
        field1076 = null;
        field1087 = null;
        if (arg0 != -40) {
            field1087 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static final void method546(byte arg0) {
        class121.field1773 = 0;
        field1078++;
        class88.field1307 = 0;
        class209.method1528(-1625);
        class178.method1332(false);
        if (arg0 != -100) {
            return;
        }
        class61.method435(arg0 + 6430);
        for (int var1 = 0; var1 < class88.field1307; var1++) {
            int var3 = class115.field1668[var1];
            if (class264.field4290 != class169.field2730[var3].field1977) {
                if (class169.field2730[var3].field205.method1763((byte) -54)) {
                    class131.method941(class169.field2730[var3], (byte) -92);
                }
                class169.field2730[var3].method122(-3662, (class245) null);
                class169.field2730[var3] = null;
            }
        }
        if (class221.field3534 != class50.field732.field2511) {
            throw new RuntimeException("gnp1 pos:" + class50.field732.field2511 + " psize:" + class221.field3534);
        }
        for (int var2 = 0; var2 < class21.field235; var2++) {
            if (class169.field2730[class39.field556[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class21.field235);
            }
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method547(int arg0, int arg1) {
        field1083++;
        if (class184.method1364(arg1, (byte) 87)) {
            class190.method1414(arg0, class113.field1631[arg1], arg0 ^ 0xFFFFFF9B);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public static final int method548(String arg0, boolean arg1) {
        field1077++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class20.field222; var2++) {
            if (arg0.equalsIgnoreCase(class104.field1508[var2])) {
                return var2;
            }
        }
        if (!arg1) {
            method545((byte) -98);
        }
        return -1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)I")
    public static final int method549(int arg0, byte arg1) {
        if (arg1 < 79) {
            method547(-101, 112);
        }
        field1079++;
        class82 var2 = class131.method945(arg0, 102);
        int var3 = var2.field1181;
        int var4 = var2.field1185;
        int var5 = var2.field1188;
        int var6 = class115.field1657[var4 - var3];
        return class243.field3904[var5] >> var3 & var6;
    }
}
