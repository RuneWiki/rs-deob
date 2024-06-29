import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class452 extends class129 {

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "Lcda;")
    private class182 field6629;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "Lbga;")
    private class375 field6622;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "Z")
    private boolean field6621;

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6631 = new String[] { method3469(method3468("\r~BM.")), method3469(method3468("\u0013>\u001a\n!\u0019>\u0001\u0006=\u0002\u000f\u0001\u0002#\u00065\b<$\u0017$\t\u0011\f\u0010")), method3469(method3468("\u001b5\rMo\u001f>\u0005\u0017m^")), method3469(method3468("\u0011<")), method3469(method3468("\u0013>\u001a\n!\u0019>\u0001\u0006=\u0002\u000f\u0001\u0002#\u00065\b<$\u0017$\t\u0011\f\u0000")), method3469(method3468("\u0018%\u0000\u000f")), method3469(method3468("\u001b5\rM\u0012^")), method3469(method3468("\u00053\r\u000f6")), method3469(method3468("\u0014\"\t\u00028!1\u0018\u0006!96\n\u00106\u0002")), method3469(method3468("\u001b5\rM\u0015^")), method3469(method3468("\u0014\"\t\u00028!1\u0018\u0006!25\u001c\u0017;")), method3469(method3468("\u00029\u0001\u0006")), method3469(method3468("\u001b5\rM\u0010^")), method3469(method3468("\u001b5\rM\u001b^")), method3469(method3468("\u001b5\rM\u0019^")), method3469(method3468("\u0013>\u001a.2\u0006\u0003\r\u000e#\u001a5\u001e")), method3469(method3468("\u0005%\u0002 <\u001a?\u0019\u0011")), method3469(method3468("\u0018?\u001e\u000e2\u001a\u0003\r\u000e#\u001a5\u001e")), method3469(method3468("\u001b5\rM\u001a^")), method3469(method3468("\u0005%\u0002&+\u0006?\u0002\u0006=\u0002")), method3469(method3468("\u0005%\u0002':\u0004")), method3469(method3468("\u001b5\rM\u0014^")), method3469(method3468("\u001b5\rM\u0017^")) };

    @OriginalMember(owner = "client!mea", name = "y", descriptor = "I")
    public static int field6619;

    @OriginalMember(owner = "client!mea", name = "x", descriptor = "I")
    public static int field6620;

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "Ljq;")
    public static class537 field6628;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "Z")
    private boolean field6625;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ILib;)Lkc;", line = 5)
    public static final class145 method3466(int arg0, class163 arg1) {
        try {
            ++field6630;
            int var2 = arg1.method1445((byte) 111);
            class613 var3 = class325.method2758(-79)[arg1.method1455((byte) 62)];
            class288 var4 = class349.method2869((byte) -73)[arg1.method1455((byte) 62)];
            int var5 = arg1.method1442(65280);
            int var6 = 57 % ((arg0 - 92) / 34);
            int var7 = arg1.method1442(65280);
            return new class145(var2, var3, var4, var5, var7);
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field6631[6] + arg0 + ',' + (arg1 != null ? field6631[0] : field6631[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V", line = 26)
    public final void method783(int arg0) {
        try {
            ++field6626;
            if (arg0 != 1) {
                method3467(123);
            }
            if (this.field6625) {
                super.field1509.method2453(1, 13);
                super.field1509.method2467(12, (class479) null);
                super.field1509.method2453(0, 13);
                super.field1509.method2467(12, (class479) null);
                OpenGL.glUseProgramObjectARB(0L);
                this.field6625 = false;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6631[21] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIB)V", line = 48)
    public final void method786(int arg0, int arg1, byte arg2) {
        try {
            int var4 = 86 / ((arg2 - 21) / 56);
            if (this.field6625) {
                int var5 = 1 << (arg1 & 3);
                float var6 = (float) (1 << (arg1 >> 3 & 7)) / 32.0F;
                int var7 = arg0 & 65535;
                float var8 = (float) ((228892 & arg0) >> 16) / 8.0F;
                long var9 = this.field6622.field5714;
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field6631[11]), (float) (super.field1509.field4603 * var5 % 40000) / 40000.0F);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field6631[7]), var6);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field6631[10]), (float) var7);
                OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var9, field6631[8]), var8);
            }
            ++field6623;
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field6631[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IILrca;)V", line = 75)
    public final void method788(int arg0, int arg1, class479 arg2) {
        try {
            ++field6619;
            if (arg1 <= -3) {
                if (!this.field6625) {
                    super.field1509.method2467(12, arg2);
                    super.field1509.method2433(-16075, arg0);
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field6631[22] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field6631[0] : field6631[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "(I)V", line = 92)
    public static void method3467(int arg0) {
        try {
            field6628 = null;
            if (arg0 != 65535) {
                field6628 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6631[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Lrda;Lla;Lcda;)V", line = 103)
    public class452(class690 arg0, class476 arg1, class182 arg2) {
        super(arg0);
        try {
            this.field6629 = arg2;
            if (arg1 != null && arg0.field10109 && arg0.field10111) {
                class143 var4 = class172.method1528(-31, arg1.method3640((byte) -27, field6631[4], field6631[3]), arg0, 35633);
                class143 var5 = class172.method1528(106, arg1.method3640((byte) -111, field6631[1], field6631[3]), arg0, 35632);
                this.field6622 = class223.method1932(new class143[] { var4, var5 }, true, arg0);
                this.field6621 = this.field6622 != null && this.field6629.method1593(115);
            } else {
                this.field6621 = false;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6631[2] + (arg0 != null ? field6631[0] : field6631[5]) + ',' + (arg1 != null ? field6631[0] : field6631[5]) + ',' + (arg2 != null ? field6631[0] : field6631[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZB)V", line = 124)
    public final void method784(boolean arg0, byte arg1) {
        try {
            ++field6627;
            if (arg1 != -34) {
                this.field6622 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6631[13] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)Z", line = 141)
    public final boolean method790(boolean arg0) {
        try {
            ++field6624;
            if (arg0) {
                this.field6622 = null;
            }
            return this.field6621;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6631[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(ZI)V", line = 153)
    public final void method781(boolean arg0, int arg1) {
        try {
            ++field6620;
            if (arg1 == 1) {
                class380 var3 = super.field1509.method2465(true);
                if (this.field6621 && var3 != null) {
                    super.field1509.method2453(1, 13);
                    super.field1509.method2467(12, var3);
                    super.field1509.method2453(0, 13);
                    super.field1509.method2467(12, this.field6629.field2523);
                    long var4 = this.field6622.field5714;
                    OpenGL.glUseProgramObjectARB(var4);
                    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field6631[17]), 0);
                    OpenGL.glUniform1iARB(OpenGL.glGetUniformLocationARB(var4, field6631[15]), 1);
                    OpenGL.glUniform3fARB(OpenGL.glGetUniformLocationARB(var4, field6631[20]), -super.field1509.field4577[0], -super.field1509.field4577[1], -super.field1509.field4577[2]);
                    OpenGL.glUniform4fARB(OpenGL.glGetUniformLocationARB(var4, field6631[16]), super.field1509.field4555, super.field1509.field4627, super.field1509.field4633, 1.0F);
                    OpenGL.glUniform1fARB(OpenGL.glGetUniformLocationARB(var4, field6631[19]), 928.0F * Math.abs(super.field1509.field4577[1]) + 96.0F);
                    this.field6625 = true;
                }
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field6631[18] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3468(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 83);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3469(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 118;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
