import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class79 extends class193 {

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lok;")
    public static class41 field1158 = class137.method956("leuchten1:", 45);

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "Llj;")
    public static class25 field1163 = null;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lok;")
    public static class41 field1157 = class137.method956("http:)4)4", 45);

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "Lok;")
    public static class41 field1170 = class137.method956(": ", 45);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lok;")
    public class41 field1160;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lok;")
    public class41 field1162;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lok;ZZ)V", line = 9)
    public static final void method564(class41 arg0, boolean arg1, boolean arg2) {
        field1165++;
        class41 var3 = arg0.method294(1);
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = (arg1 ? class308.field5185 : class73.field1081) + var6;
        for (int var8 = var6; var8 < var7; var8++) {
            class174 var9 = class195.method1397((byte) -85, var8);
            if (var9.field2832 && var9.method1250((byte) 44).method294(1).method305(-83, var3) != -1) {
                if (var5 >= 50) {
                    class195.field3147 = -1;
                    class206.field3337 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var8;
            }
        }
        class195.field3147 = var5;
        class30.field440 = 0;
        class206.field3337 = var4;
        if (arg2) {
            return;
        }
        class41[] var12 = new class41[class195.field3147];
        for (int var13 = 0; var13 < class195.field3147; var13++) {
            var12[var13] = class195.method1397((byte) -66, var4[var13]).method1250((byte) 93);
        }
        class240.method1720(var12, class206.field3337, 0);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JLok;BSILok;I)V", line = 80)
    public static final void method565(long arg0, class41 arg1, byte arg2, short arg3, int arg4, class41 arg5, int arg6) {
        field1164++;
        if (class251.field3993) {
            return;
        }
        if (class98.field1432 < 500) {
            class306.field5129[class98.field1432] = arg5;
            class203.field3286[class98.field1432] = arg1;
            class296.field4780[class98.field1432] = arg3;
            class300.field4872[class98.field1432] = arg0;
            class123.field1818[class98.field1432] = arg4;
            class118.field1727[class98.field1432] = arg6;
            class98.field1432++;
        }
        if (arg2 < 44) {
            method566((class65) null, true, -127, -28);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lmh;ZII)[Ltb;", line = 106)
    public static final class199[] method566(class65 arg0, boolean arg1, int arg2, int arg3) {
        field1156++;
        if (class10.method40(arg3, true, arg2, arg0)) {
            if (arg1) {
                method568(114, -105, -62);
            }
            return class32.method222(25);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)Lbc;", line = 121)
    public static final class302 method567(int arg0, int arg1, int arg2) {
        field1169++;
        class302 var3 = class165.method1157(false, arg1);
        if (arg2 == -1) {
            return var3;
        } else {
            if (arg0 >= -117) {
                method568(96, -21, -128);
            }
            return var3 == null || var3.field4988 == null || arg2 >= var3.field4988.length ? null : var3.field4988[arg2];
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)V", line = 141)
    public static final void method568(int arg0, int arg1, int arg2) {
        field1159++;
        class85 var3 = class14.method63(17511, arg2);
        int var4 = var3.field1244;
        if (arg1 != 28984) {
            field1158 = (class41) null;
        }
        int var5 = var3.field1227;
        int var6 = var3.field1237;
        int var7 = class306.field5120[var6 - var4];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var4;
        class314.method2175(arg1 ^ 0x713C, ~var8 & class268.field4291[var5] | arg0 << var4 & var8, var5);
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 173)
    public static void method569(int arg0) {
        field1158 = null;
        field1163 = null;
        field1170 = null;
        field1157 = null;
        if (arg0 != 0) {
            method567(-94, -7, -61);
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)Lna;", line = 192)
    public final class156 method570(int arg0) {
        if (arg0 == 0) {
            field1166++;
            return class310.field5224[this.field3120];
        } else {
            return (class156) null;
        }
    }
}
