import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class186 extends OutputStream {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lue;")
    public static class222 field2821 = new class222(8);

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2826 = "wave:";

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2823 = "Discard";

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lnh;")
    public static class305 field2822;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "Lnh;")
    public static class305 field2830;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        field2829++;
        class90.field1304.method944(87);
        class297.field4729.method944(89);
        if (arg0 == 4) {
            class290.field4625.method944(arg0 - 116);
            class160.field2237.method944(-116);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIZII)V")
    public static final void method1180(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class167.field2396++;
        field2820++;
        if (class250.field3905 != null && (class250.field3905.field4081 - (class250.field3905.method1683(-94) - 1) * 64 >> 7) == class141.field1939 && class250.field3905.field4140 - (class250.field3905.method1683(-120) - 1) * 64 >> 7 == class274.field4354) {
            class176.field2485 = false;
            class141.field1939 = 0;
        }
        class241.method1585(0);
        if (!arg3) {
            class171.method1088(-124);
        }
        class34.method233(-14287);
        class220.field3396 = arg5;
        class220.field3400 = arg4;
        if (class12.field203 == 1) {
            int var8 = (int) class160.field2239;
            if (var8 < (class161.field2251 / 256)) {
                var8 = class161.field2251 / 256;
            }
            int var9 = (int) class123.field1743 + class302.field4805 & 0x7FF;
            if (class72.field1040[4] && (class307.field4937[4] + 128) > var8) {
                var8 = class307.field4937[4] + 128;
            }
            class105.method669(-17815, arg1, class58.method360(class250.field3905.field4140, class250.field3905.field4081, false, class166.field2364) - 50, class250.field3906, var8, class21.field341, (var8 * 3) + 600, var9);
        } else if (class12.field203 == 4) {
            int var6 = (int) class160.field2239;
            if ((class161.field2251 / 256) > var6) {
                var6 = class161.field2251 / 256;
            }
            if (class72.field1040[4] && var6 < (class307.field4937[4] + 128)) {
                var6 = class307.field4937[4] + 128;
            }
            int var7 = (int) class123.field1743 & 0x7FF;
            class105.method669(-17815, arg1, class58.method360(class50.field711, class249.field3894, false, class166.field2364) - 50, class250.field3906, var6, class21.field341, (var6 * 3) + 600, var7);
        } else if (class12.field203 == 5) {
            class225.method1488(arg0 - 246, arg1);
        }
        int var10 = class178.field2603;
        int var11 = class27.field423;
        int var12 = class188.field2848;
        int var13 = class246.field3870;
        int var14 = class277.field4407;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class72.field1040[var15]) {
                int var22 = (int) ((double) (class89.field1288[var15] * 2 + 1) * Math.random() + Math.sin((double) class115.field1652[var15] / 100.0D * (double) class310.field4994[var15]) * (double) class307.field4937[var15] - (double) class89.field1288[var15]);
                if (var15 == 2) {
                    class188.field2848 += var22;
                }
                if (var15 == 0) {
                    class178.field2603 += var22;
                }
                if (var15 == 1) {
                    class27.field423 += var22;
                }
                if (var15 == 3) {
                    class246.field3870 = class246.field3870 + var22 & 0x7FF;
                }
                if (var15 == 4) {
                    class277.field4407 += var22;
                    if (class277.field4407 < 128) {
                        class277.field4407 = 128;
                    }
                    if (class277.field4407 > 383) {
                        class277.field4407 = 383;
                    }
                }
            }
        }
        class25.method159((byte) 85);
        class266.method1747(arg4, arg5, arg4 + arg2, arg5 - -arg1);
        class118.method765();
        if (class227.field3551 >= 0) {
            class214 var16 = class16.method112(class241.field3786, (byte) 120, class223.field3470, class106.field1516, class227.field3551);
            var16.method1344(class48.field688, arg4, arg5, arg2, arg1, class277.field4407, class246.field3870, 0);
        } else {
            class266.method1730(arg4, arg5, arg2, arg1, 0);
        }
        if (class171.field2447 || class302.field4804 < arg4 || (arg2 + arg4) <= class302.field4804 || arg5 > class179.field2717 || class179.field2717 >= arg1 + arg5) {
            class37.field573 = 0;
            class229.field3599 = true;
            class235.field3668 = false;
        } else {
            class235.field3668 = true;
            class37.field573 = 0;
            class229.field3599 = true;
            int var17 = class272.field4346;
            int var18 = class226.field3539;
            class159.field2214 = (var18 - var17) * (class302.field4804 - arg4) / arg2 + var17;
            int var19 = class160.field2241;
            int var20 = class128.field1783;
            class225.field3513 = (class179.field2717 - arg5) * (var20 - var19) / arg1 + var19;
        }
        class8.method45(arg0 ^ 0xEF7);
        byte var21 = class11.method69((byte) -70) == 2 ? (byte) class167.field2396 : 1;
        class83.method542(class178.field2603, class27.field423, class188.field2848, class277.field4407, class246.field3870, class51.field724, class5.field48, class72.field1037, class31.field465, class136.field1863, class42.field625, class166.field2364 + 1, var21, class250.field3905.field4081 >> 7, class250.field3905.field4140 >> 7);
        class8.method45(4087);
        class65.method401();
        class297.method1988(-5, 256, arg4, arg5, arg2, 256, arg1);
        class90.method588(arg5, 256, arg4, (byte) 120, arg2, arg1, arg0);
        ((class88) class118.field1696).method568((byte) -4, class208.field3094);
        class3.method15(arg4, arg2, (byte) 118, arg5, arg1);
        class188.field2848 = var12;
        class27.field423 = var11;
        class178.field2603 = var10;
        class277.field4407 = var14;
        class246.field3870 = var13;
        if (class294.field4684 && class104.field1498.method1109(arg0 ^ 0xFFFF8B20) == 0) {
            class294.field4684 = false;
        }
        if (class294.field4684) {
            class266.method1730(arg4, arg5, arg2, arg1, 0);
            class188.method1188(false, (byte) -14, class294.field4694);
        }
        if (!arg3 && !class294.field4684 && !class171.field2447 && class302.field4804 >= arg4 && (arg4 + arg2) > class302.field4804 && class179.field2717 >= arg5 && class179.field2717 < (arg1 + arg5)) {
            class37.method254(arg5, arg4, -1635010554, class179.field2717, arg2, class302.field4804, arg1);
        }
    }

    @OriginalMember(owner = "client!bb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2828++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILnh;BLnh;)Lgh;")
    public static final class33 method1181(int arg0, int arg1, class305 arg2, byte arg3, class305 arg4) {
        field2824++;
        if (class131.method832(arg0, arg1, 52, arg4)) {
            if (arg3 != 94) {
                field2830 = null;
            }
            return class69.method463((byte) 101, arg2.method2050(arg3 + 21, arg1, arg0));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field2830 = null;
        field2823 = null;
        if (arg0 >= 50) {
            field2821 = null;
            field2826 = null;
            field2822 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1183(char arg0, boolean arg1) {
        field2827++;
        if (arg1) {
            field2821 = null;
        }
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class311.method2106(arg0, -98)) {
            return true;
        } else {
            char[] var2 = class114.field1639;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
            }
            int var4 = 0;
            char[] var5 = class282.field4475;
            while (var5.length > var4) {
                char var6 = var5[var4];
                if (arg0 == var6) {
                    return true;
                }
                var4++;
            }
            return false;
        }
    }
}
