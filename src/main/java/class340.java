import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class340 {

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Ll;")
    public static class66 field5226 = new class66(64);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5231 = "wave2:";

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5232 = "Please remove ";

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Ldf;")
    public static class177 field5229 = new class177(64);

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "Lua;")
    public static class323 field5234;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 9)
    public static void method2388(int arg0) {
        field5232 = null;
        field5231 = null;
        if (arg0 != 1) {
            field5229 = (class177) null;
        }
        field5226 = null;
        field5234 = null;
        field5229 = null;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 26)
    public static final void method2389(int arg0) {
        while (true) {
            class311 var1 = (class311) class166.field2638.method2242((byte) -115);
            if (var1 == null) {
                field5230++;
                if (arg0 > -17) {
                    field5234 = (class323) null;
                }
                return;
            }
            class91 var3;
            if (var1.field4815 < 0) {
                int var2 = -var1.field4815 - 1;
                if (class118.field1813 == var2) {
                    var3 = class173.field2746;
                } else {
                    var3 = class177.field2795[var2];
                }
            } else {
                int var4 = var1.field4815 - 1;
                var3 = class110.field1683[var4];
            }
            if (var3 != null) {
                class212 var5 = class43.method437(69, var1.field4836);
                if (class119.field1826 < 3) {
                }
                int var6;
                int var7;
                if (var1.field4809 == 1 || var1.field4809 == 3) {
                    var7 = var5.field3250;
                    var6 = var5.field3306;
                } else {
                    var6 = var5.field3250;
                    var7 = var5.field3306;
                }
                int var8 = var1.field4814 + (var7 >> 1);
                int var9 = (var6 >> 1) + var1.field4833;
                int var10 = (var7 + 1 >> 1) + var1.field4814;
                int[][] var11 = class277.field4290[class119.field1826];
                int var12 = (var6 + 1 >> 1) + var1.field4833;
                int var13 = var11[var10][var9] + var11[var10][var12] + var11[var8][var9] + var11[var8][var12] >> 2;
                class64 var14 = null;
                int var15 = class113.field1742[var1.field4829];
                if (var15 == 0) {
                    class202 var19 = class327.method2320(class119.field1826, var1.field4814, var1.field4833);
                    if (var19 != null) {
                        var14 = var19.field3121;
                    }
                } else if (var15 == 1) {
                    class280 var18 = class294.method2123(class119.field1826, var1.field4814, var1.field4833);
                    if (var18 != null) {
                        var14 = var18.field4319;
                    }
                } else if (var15 == 2) {
                    class297 var17 = class203.method1520(class119.field1826, var1.field4814, var1.field4833);
                    if (var17 != null) {
                        var14 = var17.field4605;
                    }
                } else if (var15 == 3) {
                    class44 var16 = class315.method2226(class119.field1826, var1.field4814, var1.field4833);
                    if (var16 != null) {
                        var14 = var16.field714;
                    }
                }
                if (var14 != null) {
                    class338.method2374(var1.field4814, 15, var15, var1.field4831 + 1, class119.field1826, var1.field4813 + 1, 0, 0, -1, var1.field4833);
                    var3.field1388 = var1.field4831 + class360.field5718;
                    var3.field1322 = var14;
                    int var20 = var1.field4835;
                    var3.field1337 = var13;
                    var3.field1370 = var1.field4813 + class360.field5718;
                    var3.field1376 = var1.field4814 * 128 + (var7 * 64);
                    int var21 = var1.field4828;
                    var3.field1378 = var1.field4833 * 128 + var6 * 64;
                    int var22 = var1.field4819;
                    if (var21 < var20) {
                        int var23 = var20;
                        var20 = var21;
                        var21 = var23;
                    }
                    var3.field1313 = var1.field4814 + var20;
                    var3.field1318 = var1.field4814 + var21;
                    int var24 = var1.field4817;
                    if (var24 > var22) {
                        int var25 = var24;
                        var24 = var22;
                        var22 = var25;
                    }
                    var3.field1311 = var1.field4833 + var22;
                    var3.field1365 = var1.field4833 + var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILrn;I)Lho;", line = 193)
    public static final class215 method2390(int arg0, int arg1, class18 arg2, int arg3) {
        if (arg1 != -25931) {
            method2389(68);
        }
        field5228++;
        return class282.method2056(arg3, 0, arg2, arg0) ? class63.method628(-1) : null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)I", line = 214)
    public static final int method2391(int arg0, byte arg1) {
        field5227++;
        if (arg1 >= -109) {
            method2392(79, (char) 65532);
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IC)C", line = 226)
    public static final char method2392(int arg0, char arg1) {
        field5233++;
        int var2 = -35 % ((-arg0 - 41) / 40);
        return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()V", line = 242)
    public static final void method2393() {
        GL var0 = class240.field3771;
        var0.glDisableClientState(32886);
        class240.method1801(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class240.method1791();
        for (int var1 = 0; var1 < class181.field2866[0].length; var1++) {
            class125 var2 = class181.field2866[0][var1];
            if (var2.field2086 >= 0 && class231.method1730(-107, class107.field1619.method755(false, var2.field2086))) {
                var0.glColor4fv(class43.method441(true, var2.field2073), 0);
                float var3 = 201.5F - (var2.field2076 ? 1.0F : 0.5F);
                var2.method1084(class170.field2689, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class240.method1812();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class240.method1803();
    }
}
