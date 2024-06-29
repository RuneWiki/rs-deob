import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class246 extends class687 {

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public int field3519 = 0;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "[Ljava/lang/String;")
    private static final String[] field3520 = new String[] { method2011(method2010("\u0007\fPc\t")), method2011(method2010("\u0007\fPe\t")), method2011(method2010("\u0019\u0014\u0012L")), method2011(method2010("\fOP\u000e\\")), method2011(method2010("\u0007\fPb\t")), method2011(method2010("\u0007\fPa\t")), method2011(method2010("\u0007\fPd\t")) };

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "[I")
    public static int[] field3516 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "Lle;")
    public static class135 field3517 = new class135(0, -1);

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2005(boolean arg0) {
        try {
            if (!arg0) {
                field3517 = null;
                field3516 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3520[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BILjc;)V", line = 19)
    private final void method2006(byte arg0, int arg1, class711 arg2) {
        try {
            field3513++;
            int var4 = -84 % ((-arg0 - 41) / 53);
            if (arg1 == 2) {
                this.field3519 = arg2.method5116((byte) -127);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field3520[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3520[2] : field3520[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 41)
    public static final void method2007(byte arg0) {
        try {
            field3514++;
            class572.field8287.method5446(26393);
            class341.field4966.method5607(-128);
            class341.field4966.field11103 = null;
            class341.field4966.field11106 = 0;
            class341.field4966.field11111 = null;
            class341.field4966.field11099.field9945 = 0;
            class179.field2331 = 0;
            class341.field4966.field11113 = null;
            class492.method3796(73);
            class611.field8751 = null;
            if (arg0 != 71) {
                method2005(true);
            }
            class343.field4995 = null;
            class219.field3189 = null;
            class502.field7330 = 0;
            class322.field4393 = 0;
            class210.field3062 = 0;
            class625.field8931 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3520[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(BLjc;)V", line = 73)
    public final void method2008(byte arg0, class711 arg1) {
        try {
            field3518++;
            if (arg0 != -104) {
                this.method2008((byte) 19, null);
            }
            while (true) {
                int var3 = arg1.method5128(0);
                if (var3 == 0) {
                    return;
                }
                this.method2006((byte) -111, var3, arg1);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3520[6] + arg0 + ',' + (arg1 == null ? field3520[2] : field3520[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(III)V", line = 95)
    public static final void method2009(int arg0, int arg1, int arg2) {
        try {
            class608.field8720 = arg1;
            class63.field971 = arg0;
            field3515++;
            if (arg2 >= -5) {
                field3517 = null;
            }
            if (class101.field1360 == 0) {
                class5.field63 = class63.field971 + (class452.field6624 * 2);
                class576.field8332 = class712.field10013 * 2 + class608.field8720;
            } else if (class101.field1360 == 1) {
                class559.field8137 = class63.field971 / class389.field5670 - (-class755.field10800 - 2);
                class419.field6030 = class608.field8720 / class567.field8258 + class237.field3428 + 2;
                class5.field63 = class559.field8137 * class389.field5670;
                class576.field8332 = class567.field8258 * class419.field6030;
                class452.field6624 = class5.field63 - class63.field971 >> 1;
                class712.field10013 = class576.field8332 - class608.field8720 >> 1;
            } else if (class101.field1360 == 2) {
                class576.field8332 = class608.field8720;
                class5.field63 = class63.field971;
                return;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3520[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2010(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x21);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2011(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 126;
                    break;
                case 3:
                    var10005 = 32;
                    break;
                default:
                    var10005 = 33;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
