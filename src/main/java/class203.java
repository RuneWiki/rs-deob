import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class203 {

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "I")
    public static int field3430 = -2;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "F")
    public static float field3432;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IBI)V")
    public static final void method1500(int arg0, byte arg1, int arg2) {
        field3429++;
        if (arg1 >= -78) {
            field3430 = 120;
        }
        if (class519.field7498 == class322.field4757) {
            if (!class490.method2973(arg0, 1, -30526, false, 1, 0, -2, arg2, 0)) {
                class490.method2973(arg0, 1, -30526, false, 1, 0, -3, arg2, 0);
            }
        } else if (!class490.method2973(arg0, 1, -30526, false, 1, 0, -3, arg2, 0)) {
            class490.method2973(arg0, 1, -30526, false, 1, 0, -2, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public static final void method1501(byte arg0) {
        if (arg0 > -124) {
            method1501((byte) -117);
        }
        field3428++;
        class157.field2437 = class624.field8742.method1988(111);
        int var1 = class624.field8742.method1989((byte) -123);
        int var2 = class624.field8742.method1924(5970);
        int var3 = class624.field8742.method1938(-1);
        boolean var4 = class624.field8742.method1924(5970) == 1;
        class125.method969(0);
        class357.method2281(4251, var2);
        class624.field8742.method3908(true);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class191.field3229 >> 3; var20++) {
                for (int var21 = 0; var21 < (class314.field4720 >> 3); var21++) {
                    int var22 = class624.field8742.method3905(-4, 1);
                    if (var22 == 1) {
                        class36.field365[var5][var20][var21] = class624.field8742.method3905(-4, 26);
                    } else {
                        class36.field365[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class624.field8742.method3909((byte) -97);
        int var6 = (class495.field7166 - class624.field8742.field4534) / 16;
        class184.field3099 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class184.field3099[var7][var19] = class624.field8742.method1934(-2);
            }
        }
        class339.field4966 = new int[var6];
        class693.field9833 = new byte[var6][];
        class730.field10245 = new byte[var6][];
        class666.field9464 = new int[var6];
        class404.field5987 = new byte[var6][];
        class387.field5799 = new int[var6];
        class298.field4520 = null;
        class304.field4635 = new int[var6];
        class205.field3445 = new int[var6];
        class339.field4964 = new byte[var6][];
        class63.field991 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class191.field3229 >> 3); var10++) {
                for (int var11 = 0; var11 < (class314.field4720 >> 3); var11++) {
                    int var12 = class36.field365[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFE94D) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class205.field3445[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class205.field3445[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class387.field5799[var8] = class193.field3342.method2629("m" + var17 + "_" + var18, 10912);
                            class339.field4966[var8] = class193.field3342.method2629("l" + var17 + "_" + var18, 10912);
                            class304.field4635[var8] = class193.field3342.method2629("um" + var17 + "_" + var18, 10912);
                            class666.field9464[var8] = class193.field3342.method2629("ul" + var17 + "_" + var18, 10912);
                            var8++;
                        }
                    }
                }
            }
        }
        class635.method3599(var4, 11, var1, var3, -1);
    }
}
