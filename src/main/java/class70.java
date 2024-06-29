import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class70 {

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "[Z")
    public boolean[] field1156 = new boolean[256];

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "[I")
    public int[] field1152 = new int[256];

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "[B")
    public byte[] field1160 = new byte[4096];

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public int field1153 = 0;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "[Z")
    public boolean[] field1169 = new boolean[16];

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "[B")
    public byte[] field1173 = new byte[18002];

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "[B")
    public byte[] field1171 = new byte[256];

    @OriginalMember(owner = "client!ql", name = "C", descriptor = "[[I")
    public int[][] field1180 = new int[6][258];

    @OriginalMember(owner = "client!ql", name = "B", descriptor = "[[B")
    public byte[][] field1179 = new byte[6][258];

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "[[I")
    public int[][] field1155 = new int[6][258];

    @OriginalMember(owner = "client!ql", name = "q", descriptor = "[I")
    public int[] field1168 = new int[6];

    @OriginalMember(owner = "client!ql", name = "I", descriptor = "[I")
    public int[] field1186 = new int[16];

    @OriginalMember(owner = "client!ql", name = "M", descriptor = "[[I")
    public int[][] field1190 = new int[6][258];

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "[I")
    public int[] field1172 = new int[257];

    @OriginalMember(owner = "client!ql", name = "J", descriptor = "I")
    public int field1187 = 0;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "[B")
    public byte[] field1154 = new byte[18002];

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "[I")
    public static int[] field1157 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "Loa;")
    public static class101 field1163 = new class101(128);

    @OriginalMember(owner = "client!ql", name = "H", descriptor = "I")
    public static int field1185 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "B")
    public byte field1158;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public int field1161;

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public int field1162;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "I")
    public int field1164;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "I")
    public int field1165;

    @OriginalMember(owner = "client!ql", name = "p", descriptor = "I")
    public int field1167;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public int field1178;

    @OriginalMember(owner = "client!ql", name = "F", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
    public int field1184;

    @OriginalMember(owner = "client!ql", name = "K", descriptor = "I")
    public int field1188;

    @OriginalMember(owner = "client!ql", name = "L", descriptor = "I")
    public int field1189;

    @OriginalMember(owner = "client!ql", name = "N", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!ql", name = "o", descriptor = "[B")
    public byte[] field1166;

    @OriginalMember(owner = "client!ql", name = "D", descriptor = "[B")
    public byte[] field1181;

    @OriginalMember(owner = "client!ql", name = "E", descriptor = "[[B")
    public static byte[][] field1182;

    @OriginalMember(owner = "client!ql", name = "O", descriptor = "[[B")
    public static byte[][] field1192;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static final void method481(int arg0) {
        class156.field2439.method1255(arg0 ^ 0xFF8B);
        field1177++;
        if (arg0 != -65536) {
            field1182 = null;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static final void method482(byte arg0) {
        int var1 = 0;
        if (arg0 != -123) {
            method485(-12, -77);
        }
        while (class69.field1145 > var1) {
            int var2 = class40.field584[var1];
            class131 var3 = class12.field127[var2];
            int var4 = class131.field2053.method1133((byte) 53);
            if ((var4 & 0x40) != 0) {
                var4 += class131.field2053.method1133((byte) 53) << 8;
            }
            if ((var4 & 0x10) != 0) {
                int var5 = class131.field2053.method1145(-50);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class131.field2053.method1127((byte) 120);
                class182.method1316(113, var3, var5, var6);
            }
            if ((var4 & 0x20) != 0) {
                int var7 = class131.field2053.method1143(65280);
                if (var7 == 65535) {
                    var7 = -1;
                }
                boolean var8 = true;
                int var9 = class131.field2053.method1151((byte) 95);
                if (var7 != -1 && var3.field669 != -1 && class22.method121(class137.method958(var7, (byte) -96).field908, true).field4898 < class22.method121(class137.method958(var3.field669, (byte) 71).field908, true).field4898) {
                    var8 = false;
                }
                if (var8) {
                    var3.field640 = 1;
                    var3.field698 = var9 >> 16;
                    var3.field627 = 0;
                    var3.field669 = var7;
                    var3.field660 = 0;
                    var3.field623 = (var9 & 0xFFFF) + class29.field360;
                    if (class29.field360 < var3.field623) {
                        var3.field627 = -1;
                    }
                    if (var3.field669 != -1 && class29.field360 == var3.field623) {
                        int var10 = class137.method958(var3.field669, (byte) -120).field908;
                        if (var10 != -1) {
                            class307 var11 = class22.method121(var10, true);
                            if (var11 != null && var11.field4895 != null) {
                                class274.method1838(var3.field710, false, var11, 0, (byte) -117, var3.field637);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field2056.method1706((byte) 121)) {
                    class298.method1971((byte) 35, var3);
                }
                var3.method927(true, class234.method1586(class131.field2053.method1142(-18970), true));
                var3.method280((byte) -121, var3.field2056.field4048);
                var3.field664 = var3.field2056.field4084;
                var3.field626 = var3.field2056.field4083;
                if (var3.field2056.method1706((byte) 116)) {
                    class267.method1797((byte) -80, 0, var3, class56.field941, var3.field704[0], var3.field709[0], (class299) null, (class158) null, 0);
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field634 = class131.field2053.method1142(-18970);
                var3.field648 = class131.field2053.method1145(-117);
            }
            if ((var4 & 0x2) != 0) {
                var3.field684 = class131.field2053.method1152(-73);
                var3.field631 = 100;
            }
            if ((var4 & 0x4) != 0) {
                var3.field690 = class131.field2053.method1142(-18970);
                if (var3.field690 == 65535) {
                    var3.field690 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                int var12 = class131.field2053.method1126((byte) 111);
                int[] var13 = new int[var12];
                int[] var14 = new int[var12];
                int[] var15 = new int[var12];
                for (int var16 = 0; var16 < var12; var16++) {
                    int var17 = class131.field2053.method1142(arg0 - 18847);
                    if (var17 == 65535) {
                        var17 = -1;
                    }
                    var14[var16] = var17;
                    var15[var16] = class131.field2053.method1126((byte) 104);
                    var13[var16] = class131.field2053.method1142(-18970);
                }
                class228.method1543(var15, var3, 0, var13, var14);
            }
            if ((var4 & 0x8) != 0) {
                int var18 = class131.field2053.method1133((byte) 53);
                int var19 = class131.field2053.method1133((byte) 53);
                var3.method281(var18, (byte) 92, class29.field360, var19);
                var3.field668 = class29.field360 + 300;
                var3.field643 = class131.field2053.method1168(65280);
            }
            if ((var4 & 0x80) != 0) {
                int var20 = class131.field2053.method1168(65280);
                int var21 = class131.field2053.method1168(65280);
                var3.method281(var20, (byte) 103, class29.field360, var21);
            }
            var1++;
        }
        field1183++;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
    public static void method483(int arg0) {
        field1157 = null;
        field1192 = null;
        field1163 = null;
        field1182 = null;
        if (arg0 != 64) {
            field1185 = 35;
        }
    }

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "(I)V")
    public static final void method484(int arg0) {
        class270.field4350++;
        field1175++;
        class314.field5061.method828(arg0 ^ 0xB0, arg0);
        class314.field5061.method1120(class128.field2018, true);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)I")
    public static final int method485(int arg0, int arg1) {
        if (arg1 >= -118) {
            return 10;
        }
        int var2 = (arg0 & 0xD3) >> 6;
        field1191++;
        int var3 = arg0 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }
}
