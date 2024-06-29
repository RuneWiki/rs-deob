import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class81 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lmha;")
    public static class701 field1103 = new class701(6, 0, 4, 2);

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "[[S")
    private static short[][] field1105 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "[I")
    public static int[] field1109 = new int[8];

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[[S")
    private static short[][] field1104 = new short[][] { { 6798, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 8741, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 25238, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4626, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 }, { 4550, 12, 78, 8384, 14511, 9162, 5056, 939, 5025, 4760, 9108, 7719, 14241, 22443, 30247, -29781, -25675, -21568, -17472, -12373, -8256, -3545 } };

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[[S")
    private static short[][] field1108 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[[[S")
    public static short[][][] field1106 = new short[][][] { field1104, field1108, field1105 };

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 3)
    public static void method483(byte arg0) {
        field1103 = null;
        field1108 = null;
        field1106 = null;
        field1105 = null;
        field1104 = null;
        if (arg0 != -67) {
            method483((byte) 123);
        }
        field1109 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I", line = 26)
    public static final int method484(byte arg0) {
        field1110++;
        if (class498.field6980 == 0) {
            class83.field1128.method494(new class33("jaclib"), (byte) -25);
            if (class83.field1128.method492(11858).method126(23022) != 100) {
                return 1;
            }
            if (!((class33) class83.field1128.method492(11858)).method237(9)) {
                class306.field3966.method3960((byte) -35);
            }
            class498.field6980 = 1;
        }
        if (class498.field6980 == 1) {
            class538.field7533 = class83.method491(-110);
            class83.field1125.method494(new class433(class602.field8615), (byte) -49);
            class83.field1133.method494(new class33("jaggl"), (byte) -118);
            class83.field1134.method494(new class33("jagdx"), (byte) -106);
            class83.field1135.method494(new class33("jagmisc"), (byte) -58);
            class83.field1136.method494(new class33("sw3d"), (byte) -83);
            class83.field1137.method494(new class33("hw3d"), (byte) -118);
            class83.field1138.method494(new class33("jagtheora"), (byte) -44);
            class83.field1139.method494(new class433(class387.field5400), (byte) -110);
            class83.field1140.method494(new class433(class604.field8637), (byte) -108);
            class83.field1141.method494(new class433(class437.field5994), (byte) -74);
            class83.field1142.method494(new class433(class331.field4253), (byte) -102);
            class83.field1143.method494(new class433(class574.field8111), (byte) -35);
            class83.field1144.method494(new class433(class506.field7072), (byte) -53);
            class83.field1145.method494(new class433(class743.field10355), (byte) -65);
            class83.field1146.method494(new class433(class216.field3065), (byte) -92);
            class83.field1147.method494(new class433(class579.field8272), (byte) -21);
            class83.field1148.method494(new class433(class399.field5524), (byte) -126);
            class83.field1149.method494(new class433(class132.field1785), (byte) -123);
            class83.field1150.method494(new class433(class610.field8678), (byte) -62);
            class83.field1151.method494(new class433(class262.field3579), (byte) -27);
            class83.field1152.method494(new class433(class430.field5923), (byte) -78);
            class83.field1153.method494(new class526(class245.field3413, "huffman"), (byte) -124);
            class83.field1154.method494(new class433(class335.field4305), (byte) -79);
            class83.field1155.method494(new class433(class300.field3919), (byte) -125);
            class83.field1156.method494(new class433(class448.field6168), (byte) -53);
            class83.field1157.method494(new class23(class378.field5267, "details"), (byte) -73);
            for (int var1 = 0; var1 < class538.field7533.length; var1++) {
                if (class538.field7533[var1].method492(11858) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class83[] var3 = class538.field7533;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class83 var5 = var3[var4];
                int var6 = var5.method493(0);
                int var7 = var5.method492(11858).method126(23022);
                var2 += var6 * var7 / 100;
            }
            class583.field8292 = var2;
            class498.field6980 = 2;
        }
        if (class538.field7533 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        int var11 = -61 % ((arg0 + 30) / 33);
        class83[] var12 = class538.field7533;
        for (int var13 = 0; var13 < var12.length; var13++) {
            class83 var17 = var12[var13];
            int var18 = var17.method493(0);
            int var19 = var17.method492(11858).method126(23022);
            var9 += var18 * var19 / 100;
            var8 += var18;
            if (var19 < 100) {
                var10 = false;
            }
        }
        if (var10) {
            if (!((class33) class83.field1135.method492(11858)).method237(49)) {
                class306.field3966.method3969((byte) 108);
            }
            if (!((class33) class83.field1138.method492(11858)).method237(-127)) {
                class340.field4355 = class306.field3966.method3962(19111);
            }
            class538.field7533 = null;
        }
        int var14 = var8 - class583.field8292;
        int var15 = var9 - class583.field8292;
        int var16 = var14 > 0 ? var15 * 100 / var14 : 100;
        if (!var10 && var16 > 99) {
            var16 = 99;
        }
        return var16;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lam;[IBI)V", line = 171)
    public static final void method485(class55 arg0, int[] arg1, byte arg2, int arg3) {
        if (arg0.field8348 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field8348.length; var5++) {
                if (arg0.field8348[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field8317 != -1) {
                class103 var6 = class274.field3684.method1881((byte) -80, arg0.field8317);
                int var7 = var6.field1476;
                if (var7 == 1) {
                    arg0.field8323 = 0;
                    arg0.field8407 = 1;
                    arg0.field8357 = 0;
                    arg0.field8391 = arg3;
                    arg0.field8328 = 0;
                    if (!arg0.field8312) {
                        class694.method3941(arg0.field8357, var6, arg0, true);
                    }
                }
                if (var7 == 2) {
                    arg0.field8328 = 0;
                }
            }
        }
        field1107++;
        boolean var8 = true;
        if (arg2 >= -48) {
            return;
        }
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg0.field8348 == null || arg0.field8348[var9] == -1 || class274.field3684.method1881((byte) -80, arg1[var9]).field1490 >= class274.field3684.method1881((byte) -80, arg0.field8348[var9]).field1490) {
                arg0.field8416 = arg0.field8419;
                arg0.field8348 = arg1;
                arg0.field8391 = arg3;
            }
        }
        if (var8) {
            arg0.field8416 = arg0.field8419;
            arg0.field8348 = arg1;
            arg0.field8391 = arg3;
        }
    }
}
