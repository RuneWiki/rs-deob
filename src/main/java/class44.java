import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class44 extends class41 {

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public int field1072 = -1;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public int field1083 = 0;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field1056 = 0;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lu;")
    public static class135 field1067 = class87.method676((byte) -59, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field1074 = -1;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "Lu;")
    private static class135 field1077 = class87.method676((byte) -60, "skill)2");

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "I")
    public static int field1069 = 0;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "Z")
    public static boolean field1080 = false;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "Lu;")
    private static class135 field1075 = class87.method676((byte) -115, "Error loading your profile)3");

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lu;")
    public static class135 field1076 = field1075;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "Lu;")
    public static class135 field1081 = field1077;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "Z")
    public static boolean field1082 = false;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field1079 = 0;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public int field1057;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public int field1058;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    public int field1073;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "[[[B")
    public static byte[][][] field1055;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V")
    public static void method342(int arg0) {
        field1077 = null;
        int var1 = -65 / ((arg0 + 29) / 34);
        field1055 = null;
        field1081 = null;
        field1075 = null;
        field1076 = null;
        field1067 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V")
    public static final void method343(byte arg0) {
        field1066++;
        class79.field1879.method54((byte) 92);
        if (arg0 != 15) {
            field1081 = null;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class143.field3496[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            client.field510[var2] = 0L;
        }
        class116.field2772 = 0;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)V")
    public static final void method344(int arg0, int arg1) {
        field1061++;
        if (!class93.method760(0, arg0)) {
            return;
        }
        class146[] var2 = class105.field2528[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class146 var4 = var2[var3];
            if (var4 != null) {
                var4.field3563 = 0;
                var4.field3614 = 0;
            }
        }
        if (arg1 != -10744) {
            field1067 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZ)Lcd;")
    public static final class19 method345(int arg0, boolean arg1) {
        field1065++;
        class19 var2 = (class19) class85.field2015.method239(9325, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class119.field2869.method324(0, arg0, 13);
        class19 var4 = new class19();
        var4.field439 = arg0;
        if (var3 != null) {
            var4.method142(88, new class59(var3));
        }
        class85.field2015.method241(var4, 0, (long) arg0);
        return arg1 ? var4 : null;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(II)I")
    public static int method346(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLg;Lg;)I")
    public static final int method347(boolean arg0, class43 arg1, class43 arg2) {
        field1059++;
        int var3 = 0;
        if (arg2.method338(-114, class57.field1390, class83.field1962)) {
            var3++;
        }
        if (arg0) {
            field1055 = null;
        }
        if (arg1.method338(50, class57.field1390, class9.field214)) {
            var3++;
        }
        if (arg1.method338(116, class57.field1390, class82.field1924)) {
            var3++;
        }
        if (arg1.method338(31, class57.field1390, class135.field3243)) {
            var3++;
        }
        if (arg1.method338(-120, class57.field1390, class119.field2851)) {
            var3++;
        }
        if (arg1.method338(48, class57.field1390, class85.field2044)) {
            var3++;
        }
        arg1.method338(61, class57.field1390, class138.field3347);
        arg1.method338(-107, class57.field1390, class46.field1108);
        arg1.method338(-116, class57.field1390, class109.field2636);
        arg1.method338(-119, class57.field1390, class29.field706);
        arg1.method338(105, class57.field1390, class125.field2982);
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V")
    public static final void method348(byte arg0) {
        if (arg0 != 49) {
            return;
        }
        while (class23.field581.method931(class21.field499, true) >= 27) {
            int var1 = class23.field581.method934((byte) 104, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class96.field2340[var1] == null) {
                var2 = true;
                class96.field2340[var1] = new class111();
            }
            class111 var3 = class96.field2340[var1];
            class47.field1124[class34.field790++] = var1;
            var3.field184 = class126.field2998;
            int var4 = class23.field581.method934((byte) 113, 1);
            int var5 = class139.field3390[class23.field581.method934((byte) 123, 3)];
            if (var2) {
                var3.field230 = var5;
            }
            var3.field2697 = class10.method55((byte) 124, class23.field581.method934((byte) 115, 13));
            int var6 = class23.field581.method934((byte) 123, 1);
            if (var6 == 1) {
                class97.field2358[class126.field3009++] = var1;
            }
            int var7 = class23.field581.method934((byte) 115, 5);
            int var8 = class23.field581.method934((byte) 124, 5);
            var3.field203 = var3.field2697.field1281;
            var3.field232 = var3.field2697.field1334;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field185 = var3.field2697.field1303;
            var3.field216 = var3.field2697.field1292;
            var3.field198 = var3.field2697.field1312;
            var3.field191 = var3.field2697.field1313;
            if (var7 > 15) {
                var7 -= 32;
            }
            var3.field217 = var3.field2697.field1283;
            if (var3.field216 == 0) {
                var3.field230 = 0;
            }
            var3.field196 = var3.field2697.field1285;
            var3.field210 = var3.field2697.field1319;
            var3.method51(var4 == 1, 75, class116.field2789.field192[0] + var8, class116.field2789.field162[0] + var7);
        }
        field1068++;
        class23.field581.method933((byte) 106);
    }
}
