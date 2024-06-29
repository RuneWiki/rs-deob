import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class578 extends class43 {

    @OriginalMember(owner = "client!ht", name = "F", descriptor = "S")
    public short field8175;

    @OriginalMember(owner = "client!ht", name = "E", descriptor = "F")
    public static float field8174;

    @OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
    public static int field8168;

    @OriginalMember(owner = "client!ht", name = "z", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!ht", name = "A", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!ht", name = "B", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
    public static int field8172;

    @OriginalMember(owner = "client!ht", name = "D", descriptor = "I")
    public static int field8173;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)Z")
    public final boolean method391(int arg0) {
        ++field8171;
        if (arg0 != 0) {
            method3347((String) null, 68, 12);
        }
        return class675.method3817(super.field659, arg0 ^ 1, super.field648 >> class440.field6142, super.field644 >> class440.field6142);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ILha;)V")
    public static final void method3346(int arg0, class58 arg1) {
        ++field8172;
        int var2 = 0;
        int var3 = 0;
        if (class200.field2876) {
            var2 = class228.method1570((byte) 73);
            var3 = class252.method1712((byte) 37);
        }
        int var4 = class396.field5544 + var2;
        int var5 = class321.field4557 + var3;
        int var6 = class380.field5300;
        int var7 = class681.field9590 - 3;
        int var8 = arg0;
        class758.method4212(class380.field5300, -23286, class396.field5544 + var2, class681.field9590, arg0, class281.field3965.method1839((byte) 45, class744.field10426), arg1, class321.field4557 + var3);
        int var9 = class422.field5917.method1597(118) - -var2;
        int var10 = var3 + class422.field5917.method1592(true);
        if (!class653.field9200) {
            int var11 = 0;
            for (class66 var12 = (class66) class288.field4066.method1522(true); var12 != null; var12 = (class66) class288.field4066.method1527((byte) 78)) {
                int var13 = var8 - -((class409.field5682 + -1 + -var11) * 16) + var5 + 13;
                ++var11;
                if (~(class396.field5544 + var2) > ~var9 && ~var9 > ~(class380.field5300 + var2 + class396.field5544) && var13 + -13 < var10 && ~(var13 - -4) < ~var10 && var12.field1195) {
                    arg1.method630(class396.field5544 + var2, var13 + -12, class380.field5300, 16, -class187.field2697 + 255 << 24 | class30.field401, 1);
                }
            }
        } else {
            int var14 = 0;
            for (class241 var15 = (class241) class211.field3046.method1196(-121); var15 != null; var15 = (class241) class211.field3046.method1204(false)) {
                int var28 = var14 * 16 + var5 - -var8 + 13;
                if (class396.field5544 + var2 < var9 && ~var9 > ~(class396.field5544 + var2 + class380.field5300) && var28 + -13 < var10 && var28 - -4 > var10 && (var15.field3382 > 1 || ((class66) var15.field3388.field2357.field3201).field1195)) {
                    arg1.method630(class396.field5544 + var2, var28 + -12, class380.field5300, 16, -class187.field2697 + 255 << 24 | class30.field401, 1);
                }
                ++var14;
            }
            if (class316.field4485 != null) {
                class758.method4212(class167.field2468, -23286, class138.field2148, class610.field8829, var8, class316.field4485.field3386, arg1, class114.field1826);
                int var16 = 0;
                for (class66 var17 = (class66) class316.field4485.field3388.method1196(-126); var17 != null; var17 = (class66) class316.field4485.field3388.method1204(false)) {
                    int var18 = var16 * 16 + var8 + 13 + class114.field1826;
                    if (var9 > class138.field2148 && ~(class167.field2468 + class138.field2148) < ~var9 && var18 + -13 < var10 && ~var10 > ~(var18 - -4) && var17.field1195) {
                        arg1.method630(class138.field2148, var18 - 12, class167.field2468, 16, 255 - class187.field2697 << 24 | class30.field401, 1);
                    }
                    ++var16;
                }
                class375.method2355(arg1, class610.field8829, true, var8, class114.field1826, class167.field2468, class138.field2148);
            }
        }
        class375.method2355(arg1, class681.field9590, true, var8, class321.field4557 + var3, class380.field5300, class396.field5544 + var2);
        if (!class653.field9200) {
            int var19 = 0;
            for (class66 var20 = (class66) class288.field4066.method1522(true); var20 != null; var20 = (class66) class288.field4066.method1527((byte) 82)) {
                int var21 = 13 - -((class409.field5682 + -1 + -var19) * 16) + var5 + var8;
                class606.method3505(arg0 ^ 79, -16777216 | class288.field4062, var5, arg1, var7, var6, -16777216 | class92.field1615, var10, var20, var9, var4, var21);
                ++var19;
            }
        } else {
            int var22 = 0;
            for (class241 var23 = (class241) class211.field3046.method1196(-122); var23 != null; var23 = (class241) class211.field3046.method1204(false)) {
                int var27 = var22 * 16 + var3 + var8 + class321.field4557 + 13;
                if (var23.field3382 == 1) {
                    class606.method3505(115, -16777216 | class288.field4062, class321.field4557 - -var3, arg1, class681.field9590, class380.field5300, -16777216 | class92.field1615, var10, (class66) var23.field3388.field2357.field3201, var9, class396.field5544 - -var2, var27);
                } else {
                    class13.method71(class380.field5300, var27, class396.field5544 + var2, var9, arg1, var10, class321.field4557 - -var3, class681.field9590, var23, class92.field1615 | -16777216, -16777216 | class288.field4062, (byte) 99);
                }
                ++var22;
            }
            if (class316.field4485 != null) {
                int var24 = 0;
                for (class66 var25 = (class66) class316.field4485.field3388.method1196(-123); var25 != null; var25 = (class66) class316.field4485.field3388.method1204(false)) {
                    int var26 = var8 - -13 - -(var24 * 16) + class114.field1826;
                    class606.method3505(arg0 ^ -50, class288.field4062 | -16777216, class114.field1826, arg1, class610.field8829, class167.field2468, -16777216 | class92.field1615, var10, var25, var9, class138.field2148, var26);
                    ++var24;
                }
                class162.method1212(class610.field8829, class167.field2468, class114.field1826, class138.field2148, 0);
            }
        }
        class162.method1212(class681.field9590, class380.field5300, class321.field4557 - -var3, class396.field5544 + var2, 0);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([Lbh;I)I")
    public final int method407(class36[] arg0, int arg1) {
        ++field8169;
        int var3 = 44 / ((arg1 - -32) / 53);
        return this.method406(arg0, (byte) -128, super.field644 >> class440.field6142, super.field648 >> class440.field6142);
    }

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "(I)Z")
    public final boolean method403(int arg0) {
        if (arg0 != -28694) {
            method3347((String) null, -25, 87);
        }
        ++field8173;
        return class533.field7539[(super.field644 >> class440.field6142) + -class155.field2331 + class235.field3337][(super.field648 >> class440.field6142) + -class214.field3065 + class235.field3337];
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIII)V")
    public class578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field648 = arg2;
        super.field651 = arg1;
        super.field649 = (byte) arg3;
        this.field8175 = (short) arg5;
        super.field659 = (byte) arg4;
        super.field644 = arg0;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Ljava/lang/String;II)Z")
    public static final boolean method3347(String arg0, int arg1, int arg2) {
        ++field8168;
        if (class341.field4796.field5141) {
            class67.field1223 = new class593();
            class67.field1223.field8321 = arg0;
            class67.field1223.field8324 = arg2;
            if (class231.field3294 != class118.field1857) {
                class67.field1223.field8323 = class67.field1223.field8324 + 50000;
                class67.field1223.field8317 = class67.field1223.field8324 + 40000;
            }
            if (class261.field3819.length > arg2 && class261.field3819[arg2] != null) {
                class138.field2154 = class261.field3819[arg2].field9240;
            }
            return true;
        } else {
            String var3 = "";
            if (class231.field3294 != class118.field1857) {
                var3 = ":" + (arg2 + 7000);
            }
            String var4 = "";
            if (class611.field8844 != null) {
                var4 = "/p=" + class611.field8844;
            }
            int var5 = -96 / ((-30 - arg1) / 42);
            String var6 = "http://" + arg0 + var3 + "/l=" + class744.field10426 + "/a=" + class66.field1197 + var4 + "/j" + (!class255.field3698 ? "0" : "1") + ",o" + (!class561.field7961 ? "0" : "1") + ",a2";
            try {
                class345.field4858.getAppletContext().showDocument(new URL(var6), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }
}
