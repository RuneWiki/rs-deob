import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class341 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public int field5066 = -1;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public int field5072 = -1;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Lqfa;")
    public static class85 field5068 = new class85(42, 5);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Laj;")
    public static class287 field5071 = new class287(4);

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field5070;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "[I")
    public int[] field5065;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lqh;I)V")
    public final void method2189(class61 arg0, int arg1) {
        if (arg1 != -1) {
            this.field5066 = 115;
        }
        field5069++;
        while (true) {
            int var3 = arg0.method732(-559537960);
            if (var3 == 0) {
                return;
            }
            this.method2192(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[Lcu;")
    public static final class202[] method2190(byte arg0) {
        int var1 = 106 % ((arg0 + 29) / 45);
        field5073++;
        if (class155.field2619 == null) {
            class202[] var2 = class223.method1534(1769, class604.field8775);
            class202[] var3 = new class202[var2.length];
            int var4 = 0;
            int var5 = class527.field7429.method2822((byte) 89, class90.field1654);
            label70: for (int var6 = 0; var6 < var2.length; var6++) {
                class202 var10 = var2[var6];
                if ((var10.field3119 <= 0 || var10.field3119 >= 24) && var10.field3116 >= 800 && var10.field3112 >= 600 && (var5 != 2 || var10.field3116 <= 800 && var10.field3112 <= 600) && (var5 != 1 || var10.field3116 <= 1024 && var10.field3112 <= 768)) {
                    for (int var11 = 0; var11 < var4; var11++) {
                        class202 var12 = var3[var11];
                        if (var10.field3116 == var12.field3116 && var10.field3112 == var12.field3112) {
                            if (var12.field3119 < var10.field3119) {
                                var3[var11] = var10;
                            }
                            continue label70;
                        }
                    }
                    var3[var4] = var10;
                    var4++;
                }
            }
            class155.field2619 = new class202[var4];
            class692.method3875(var3, 0, class155.field2619, 0, var4);
            int[] var7 = new int[class155.field2619.length];
            for (int var8 = 0; var8 < class155.field2619.length; var8++) {
                class202 var9 = class155.field2619[var8];
                var7[var8] = var9.field3116 * var9.field3112;
            }
            class614.method3525(var7, -12759, class155.field2619);
        }
        return class155.field2619;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lr;Ljava/lang/String;ZLla;Ldaa;B)V")
    public static final void method2191(class167 arg0, String arg1, boolean arg2, class421 arg3, class11 arg4, byte arg5) {
        if (arg5 > -79) {
            field5068 = null;
        }
        field5070++;
        boolean var6 = !class336.field5025 || class368.method2324(false);
        if (!var6) {
            return;
        }
        if (class336.field5025 && var6) {
            class11 var7 = class406.field5860;
            class421 var8 = arg0.method160(var7, class519.field7364, true);
            int var9 = var7.method285(arg1, null, 20034, 250);
            int var10 = var7.method290(arg1, 250, var7.field568, (byte) 116, null);
            int var11 = class512.field7233.field4174;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var9;
            int var14 = var12 * 2 + var10;
            if (class57.field1328 > var13) {
                var13 = class57.field1328;
            }
            if (class156.field2666 > var14) {
                var14 = class156.field2666;
            }
            int var15 = class318.field4687.method2056(127, var13, class575.field8355) + class122.field2223;
            int var16 = class198.field3075.method3156(class693.field9762, 4416, var14) + class335.field5013;
            arg0.method170(class338.field5043, false).method1788(class496.field7072.field4174 + var15, var16 - -class496.field7072.field4171, var13 - (class496.field7072.field4174 * 2), -(class496.field7072.field4171 * 2) + var14, 1, 0, 0);
            arg0.method170(class496.field7072, true).method3914(var15, var16);
            class496.field7072.method1849();
            arg0.method170(class496.field7072, true).method3914(var13 + var15 - var11, var16);
            class496.field7072.method1853();
            arg0.method170(class496.field7072, true).method3914(var13 + var15 - var11, -var11 + var14 + var16);
            class496.field7072.method1849();
            arg0.method170(class496.field7072, true).method3914(var15, var14 + var16 - var11);
            class496.field7072.method1853();
            arg0.method170(class512.field7233, true).method3918(var15, class496.field7072.field4171 + var16, var11, var14 - class496.field7072.field4171 * 2);
            class512.field7233.method1851();
            arg0.method170(class512.field7233, true).method3918(var15 + class496.field7072.field4174, var16, var13 - (class496.field7072.field4174 * 2), var11);
            class512.field7233.method1851();
            arg0.method170(class512.field7233, true).method3918(var15 + var13 - var11, class496.field7072.field4171 + var16, var11, var14 - class496.field7072.field4171 * 2);
            class512.field7233.method1851();
            arg0.method170(class512.field7233, true).method3918(class496.field7072.field4174 + var15, -var11 + var14 + var16, var13 - (class496.field7072.field4174 * 2), var11);
            class512.field7233.method1851();
            var8.method2554(-1, var12 + var16, null, 1, 96, class297.field4448 | 0xFF000000, var14 - (var12 * 2), arg1, null, null, 0, var13 - (var12 * 2), 0, var12 + var15, 1, 0);
            class521.method3066(var14, var15, (byte) 61, var13, var16);
        } else {
            int var17 = arg4.method285(arg1, null, 20034, 250);
            int var18 = arg4.method294(250, arg1, null, 107) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg0.method4(var20 - var19, var21 - var19, var17 + var19 + var19, var18 - -var19 + var19, -16777216, 0);
            arg0.method108(var20 - var19, -var19 + var21, var17 + var19 + var19, var19 + var19 + var18, -1, 0);
            arg3.method2554(-1, var21, null, 1, 73, -1, var18, arg1, null, null, 0, var17, 0, var20, 1, 0);
            class521.method3066(var18 + var19 + var19, -var19 + var20, (byte) 96, var17 + var19 + var19, -var19 + var21);
        }
        if (arg2) {
            try {
                arg0.method63();
            } catch (class105 var22) {
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lqh;II)V")
    private final void method2192(class61 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5072 = arg0.method723((byte) -25);
        } else if (arg2 == 2) {
            this.field5065 = new int[arg0.method732(-559537960)];
            for (int var4 = 0; var4 < this.field5065.length; var4++) {
                this.field5065[var4] = arg0.method723((byte) -25);
            }
        } else if (arg2 == 3) {
            this.field5066 = arg0.method732(-559537960);
        }
        if (arg1 == 0) {
            field5067++;
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public static void method2193(byte arg0) {
        if (arg0 != -84) {
            method2190((byte) 65);
        }
        field5071 = null;
        field5068 = null;
    }
}
