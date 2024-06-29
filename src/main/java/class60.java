import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class60 extends class32 {

    @OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
    public int field1109 = 0;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "Lce;")
    public static class10 field1103 = null;

    @OriginalMember(owner = "client!sf", name = "H", descriptor = "Lij;")
    public static class50 field1113 = class78.method578(121, "huffman");

    @OriginalMember(owner = "client!sf", name = "K", descriptor = "[I")
    public static int[] field1116 = new int[2048];

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public int field1093;

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!sf", name = "A", descriptor = "I")
    public int field1106;

    @OriginalMember(owner = "client!sf", name = "B", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!sf", name = "C", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!sf", name = "G", descriptor = "I")
    public int field1112;

    @OriginalMember(owner = "client!sf", name = "I", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!sf", name = "z", descriptor = "Lgi;")
    public class187 field1105;

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Lda;")
    public static class22 field1101;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lkb;")
    public class23 field1102;

    @OriginalMember(owner = "client!sf", name = "E", descriptor = "Lkb;")
    public class23 field1110;

    @OriginalMember(owner = "client!sf", name = "L", descriptor = "Lsg;")
    public class243 field1117;

    @OriginalMember(owner = "client!sf", name = "J", descriptor = "Ltf;")
    public class53 field1115;

    @OriginalMember(owner = "client!sf", name = "F", descriptor = "Z")
    public boolean field1111;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "[I")
    public int[] field1091;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
    public static final void method465(int arg0, int arg1, int arg2) {
        class1.field6 = true;
        class258.field4491 = arg0;
        class54.field969 = arg1;
        class205.field3399 = arg2;
        class132.field2301 = -1;
        class100.field1837 = -1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public final void method466(boolean arg0) {
        int var2 = this.field1112;
        if (!arg0) {
            this.field1097 = -11;
        }
        if (this.field1117 != null) {
            class243 var3 = this.field1117.method1645(62);
            if (var3 == null) {
                this.field1104 = 0;
                this.field1108 = 0;
                this.field1112 = -1;
                this.field1091 = null;
                this.field1106 = 0;
            } else {
                this.field1112 = var3.field4209;
                this.field1106 = var3.field4210 * 128;
                this.field1091 = var3.field4184;
                this.field1104 = var3.field4230;
                this.field1108 = var3.field4201;
            }
        } else if (this.field1115 != null) {
            int var4 = class40.method310(-1, this.field1115);
            if (var2 != var4) {
                class62 var5 = this.field1115.field959;
                this.field1112 = var4;
                if (var5.field1160 != null) {
                    var5 = var5.method486((byte) -95);
                }
                if (var5 == null) {
                    this.field1106 = 0;
                } else {
                    this.field1106 = var5.field1156 * 128;
                }
            }
        } else if (this.field1105 != null) {
            this.field1112 = class63.method495((byte) -110, this.field1105);
            this.field1106 = this.field1105.field3062 * 128;
        }
        if (this.field1112 != var2 && this.field1102 != null) {
            class174.field2907.method80(this.field1102);
            this.field1102 = null;
        }
        field1107++;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method467(byte arg0) {
        field1103 = null;
        field1101 = null;
        field1113 = null;
        if (arg0 == 31) {
            field1116 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBILsg;I)V")
    public static final void method468(int arg0, byte arg1, int arg2, class243 arg3, int arg4) {
        field1114++;
        for (class60 var5 = (class60) class183.field3011.method689(1001); var5 != null; var5 = (class60) class183.field3011.method688(-39)) {
            if (var5.field1098 == arg0 && arg4 * 128 == var5.field1100 && (arg2 * 128) == var5.field1099 && var5.field1117.field4200 == arg3.field4200) {
                if (var5.field1102 != null) {
                    class174.field2907.method80(var5.field1102);
                    var5.field1102 = null;
                }
                if (var5.field1110 != null) {
                    class174.field2907.method80(var5.field1110);
                    var5.field1110 = null;
                }
                var5.method267(107);
                return;
            }
        }
        int var6 = 51 % ((-arg1 - 64) / 55);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZII)V")
    public static final void method469(boolean arg0, int arg1, int arg2) {
        field1096++;
        short var3 = 256;
        if (class10.field208 > 0) {
            class197.method1329(class10.field208, -45);
            class10.field208 = 0;
        }
        int var4 = 0;
        int var5 = class158.field2724 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class206.field3424[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class158.field2729[var5++ + arg1];
                int var12 = class239.field4110[var4++];
                if (var12 == 0) {
                    class26.field556.field2836[var6++] = var11;
                } else {
                    int var13 = 256 - (var12 + 18);
                    int var14 = var12 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class164.field2802[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class26.field556.field2836[var6++] = class51.method413(-16711936, class51.method413(16711935, var11) * var13 + var14 * class51.method413(var15, 16711935)) + class51.method413(var13 * class51.method413(var11, 65280) + class51.method413(65280, var15) * var14, 16711680) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class26.field556.field2836[var6++] = class158.field2729[var5++ + arg1];
            }
            var5 += class158.field2724 - 128;
        }
        class26.field556.method671(arg1, arg2);
        if (arg0) {
            field1103 = null;
        }
    }
}
