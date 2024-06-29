import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class308 extends class602 implements class361 {

    @OriginalMember(owner = "client!caa", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field4255 = new String[] { method2459(method2458("\u0003k`\u0007P\tdh]RH")), method2459(method2458("\u001b$/\u0007\u0011")), method2459(method2458("\u000e\u007fmE")), method2459(method2458("\u0003k`\u0007.H")), method2459(method2458("\u0003k`\u0007-H")) };

    @OriginalMember(owner = "client!caa", name = "A", descriptor = "F")
    public static float field4254 = 0.25F;

    @OriginalMember(owner = "client!caa", name = "B", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!caa", name = "D", descriptor = "Ljg;")
    public static class25 field4252;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V")
    public static void method2456(int arg0) {
        try {
            field4252 = null;
            if (arg0 != 34067) {
                field4252 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4255[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(Z)V")
    public static final void method2457(boolean arg0) {
        try {
            if (!arg0) {
                field4252 = null;
            }
            ++field4253;
            if (~class601.field8605 > -1) {
                class801.field11652 = -1;
                class573.field8301 = -1;
                class601.field8605 = 0;
            }
            if (class601.field8605 > class534.field7747) {
                class801.field11652 = -1;
                class573.field8301 = -1;
                class601.field8605 = class534.field7747;
            }
            if (class30.field383 < 0) {
                class801.field11652 = -1;
                class573.field8301 = -1;
                class30.field383 = 0;
            }
            if (class534.field7759 < class30.field383) {
                class801.field11652 = -1;
                class30.field383 = class534.field7759;
                class573.field8301 = -1;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4255[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "(Ldga;IZ[[I)V")
    public class308(class713 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class385.field5635, class496.field7281, arg1 * 6 * arg1, arg2);
        try {
            super.field8615.method2668(24, this);
            if (!arg2) {
                for (int var5 = 0; var5 < 6; ++var5) {
                    OpenGL.glTexImage2Di(34069 - -var5, 0, this.method4454(false), arg1, arg1, 0, class341.method2740((byte) 104, super.field8635), super.field8615.field10126, arg3[var5], 0);
                }
            } else {
                for (int var6 = 0; ~var6 > -7; ++var6) {
                    this.method4450((byte) -86, arg3[var6], 34069 - -var6, arg1, arg1);
                }
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field4255[0] + (arg0 != null ? field4255[1] : field4255[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field4255[1] : field4255[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2458(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 108);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!caa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2459(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 96;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 108;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
