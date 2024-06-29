import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class674 {

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field9774 = 0;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public int field9781 = 0;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lwq;")
    private class178 field9777 = new class178(64);

    @OriginalMember(owner = "client!og", name = "j", descriptor = "Ljaa;")
    private class641 field9783 = null;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lla;")
    private class476 field9773;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "Lla;")
    private class476 field9778;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9784 = new String[] { method4958(method4957("#>k?\b")), method4958(method4957("#>k8\b")), method4958(method4957("\",)\u0011")), method4958(method4957("7wkS]")), method4958(method4957("#>kAI\"01C\b")), method4958(method4957("#>k<\b")), method4958(method4957("#>k>\b")) };

    @OriginalMember(owner = "client!og", name = "c", descriptor = "[I")
    public static int[] field9779 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field9780;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILdv;J[I)Ljava/lang/String;")
    public final String method4952(int arg0, class685 arg1, long arg2, int[] arg3) {
        try {
            field9776++;
            if (this.field9783 != null) {
                String var6 = this.field9783.method4652(arg2, (byte) -127, arg3, arg1);
                if (var6 != null) {
                    return var6;
                }
            }
            int var7 = -68 % ((65 - arg0) / 49);
            return Long.toString(arg2);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field9784[1] + arg0 + ',' + (arg1 == null ? field9784[2] : field9784[3]) + ',' + arg2 + ',' + (arg3 == null ? field9784[2] : field9784[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ldf;IIIII)V")
    public static final void method4953(class420 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class501.field7246 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class132.field1543) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class216.field3296 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class96 var14 = class734.field10683[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class555.field8261[var11].method2407(var13, var12, -109) + class555.field8261[var11].method2407(var13, var12 + 1, -114) + class555.field8261[var11].method2407(var13 + 1, var12, 62) + class555.field8261[var11].method2407(var13 + 1, var12 + 1, -104)) / 4 - (class555.field8261[arg1].method2407(arg3, arg2, -103) + class555.field8261[arg1].method2407(arg3, arg2 + 1, 34) + class555.field8261[arg1].method2407(arg3 + 1, arg2, -106) + class555.field8261[arg1].method2407(arg3 + 1, arg2 + 1, 40)) / 4;
                                    class261 var16 = var14.field1082;
                                    class261 var17 = var14.field1079;
                                    if (var16 != null && var16.method625((byte) 94)) {
                                        arg0.method627(var16, (var13 - arg3) * class358.field5488 + (1 - arg5) * class578.field8582, var6, (var12 - arg2) * class358.field5488 + (1 - arg4) * class578.field8582, var15, 0, class606.field8877);
                                    }
                                    if (var17 != null && var17.method625((byte) 94)) {
                                        arg0.method627(var17, (var13 - arg3) * class358.field5488 + (1 - arg5) * class578.field8582, var6, (var12 - arg2) * class358.field5488 + (1 - arg4) * class578.field8582, var15, 0, class606.field8877);
                                    }
                                    for (class681 var18 = var14.field1085; var18 != null; var18 = var18.field9865) {
                                        class343 var19 = var18.field9867;
                                        if (var19 != null && var19.method625((byte) 94) && (var19.field5330 == var12 || var7 == var12) && (var19.field5329 == var13 || var9 == var13)) {
                                            int var20 = var19.field5335 + 1 - var19.field5330;
                                            int var21 = var19.field5325 + 1 - var19.field5329;
                                            arg0.method627(var19, (var19.field5329 - arg3) * class358.field5488 + (var21 - arg5) * class578.field8582, var6, (var19.field5330 - arg2) * class358.field5488 + (var20 - arg4) * class578.field8582, var15, 0, class606.field8877);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II)Lbe;")
    public final class41 method4954(int arg0, int arg1) {
        try {
            field9780++;
            class41 var3 = (class41) this.field9777.method1558((byte) 96, (long) arg0);
            if (var3 != null) {
                return var3;
            }
            byte[] var4;
            if (arg0 >= 32768) {
                var4 = this.field9778.method3632(1, arg0 & 0x7FFF, 79);
            } else {
                var4 = this.field9773.method3632(1, arg0, -23);
            }
            class41 var5 = new class41();
            var5.field483 = this;
            if (var4 != null) {
                var5.method285(new class163(var4), false);
            }
            if (arg0 >= 32768) {
                var5.method282((byte) 111);
            }
            if (arg1 < 74) {
                return null;
            } else {
                this.field9777.method1556((long) arg0, var5, 1);
                return var5;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field9784[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static final void method4955(byte arg0) {
        try {
            if (arg0 < 48) {
                method4956((byte) -81);
            }
            field9775++;
            class396.field5928.method1559(0);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9784[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method4956(byte arg0) {
        try {
            if (arg0 == 108) {
                field9779 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field9784[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(ILla;Lla;Ljaa;)V")
    public class674(int arg0, class476 arg1, class476 arg2, class641 arg3) {
        try {
            this.field9773 = arg1;
            this.field9778 = arg2;
            this.field9783 = arg3;
            if (this.field9773 != null) {
                this.field9774 = this.field9773.method3646(1, (byte) -17);
            }
            if (this.field9778 != null) {
                this.field9781 = this.field9778.method3646(1, (byte) -46);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field9784[4] + arg0 + ',' + (arg1 == null ? field9784[2] : field9784[3]) + ',' + (arg2 == null ? field9784[2] : field9784[3]) + ',' + (arg3 == null ? field9784[2] : field9784[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!og", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4957(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!og", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4958(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 89;
                    break;
                case 2:
                    var10005 = 69;
                    break;
                case 3:
                    var10005 = 125;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
