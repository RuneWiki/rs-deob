import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class521 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Ldv;")
    public class688 field7702 = new class688();

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7705 = new String[] { method3904(method3903("W\u001bV\u0007h")), method3904(method3903("W\u001bV})S\u0010\f\u007fh")), method3904(method3903("W\u001bV\u0004h")), method3904(method3903("FWVo=")), method3904(method3903("W\u001bV\u0005h")), method3904(method3903("S\f\u0014-")), method3904(method3903("W\u001bV\u0000h")), method3904(method3903("W\u001bV\u0002h")), method3904(method3903("W\u001bV\u0003h")), method3904(method3903("W\u001bV\u0006h")) };

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lhl;")
    public static class556 field7695 = new class556(16, 5);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field7701;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Ldv;")
    private class688 field7704;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Ljava/lang/Object;")
    public static Object field7698;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 4)
    public final void method3896(int arg0) {
        try {
            if (arg0 != 10) {
                this.field7704 = null;
            }
            field7696++;
            while (true) {
                class688 var2 = this.field7702.field9939;
                if (this.field7702 == var2) {
                    this.field7704 = null;
                    return;
                }
                var2.method5006(0);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7705[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)Ldv;", line = 26)
    public final class688 method3897(boolean arg0) {
        try {
            field7701++;
            class688 var2 = this.field7704;
            if (arg0) {
                field7695 = null;
            }
            if (this.field7702 == var2) {
                this.field7704 = null;
                return null;
            } else {
                this.field7704 = var2.field9939;
                return var2;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7705[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLdv;)V", line = 48)
    public final void method3898(boolean arg0, class688 arg1) {
        try {
            if (arg1.field9938 != null) {
                arg1.method5006(0);
            }
            field7703++;
            arg1.field9939 = this.field7702;
            if (arg0) {
                this.field7704 = null;
            }
            arg1.field9938 = this.field7702.field9938;
            arg1.field9938.field9939 = arg1;
            arg1.field9939.field9938 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7705[6] + arg0 + ',' + (arg1 == null ? field7705[5] : field7705[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I", line = 67)
    public final int method3899(byte arg0) {
        try {
            field7699++;
            int var2 = -57 / ((29 - arg0) / 63);
            int var3 = 0;
            class688 var4 = this.field7702.field9939;
            while (this.field7702 != var4) {
                var4 = var4.field9939;
                var3++;
            }
            return var3;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7705[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V", line = 89)
    public static void method3900(boolean arg0) {
        try {
            field7698 = null;
            field7695 = null;
            if (arg0) {
                field7698 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7705[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZLtga;II)Ljava/awt/Frame;", line = 100)
    public static final Frame method3901(int arg0, int arg1, boolean arg2, class61 arg3, int arg4, int arg5) {
        try {
            field7697++;
            if (!arg3.method633(0)) {
                return null;
            }
            if (arg1 == 0) {
                class609[] var6 = class624.method4553(arg3, -256);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var8 < var6.length; var8++) {
                    if (arg0 == var6[var8].field8774 && var6[var8].field8767 == arg4 && (arg5 == 0 || var6[var8].field8772 == arg5) && (!var7 || var6[var8].field8769 > arg1)) {
                        var7 = true;
                        arg1 = var6[var8].field8769;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            if (!arg2) {
                field7698 = null;
            }
            class218 var9 = arg3.method646(arg1, arg5, -107, arg0, arg4);
            while (var9.field3402 == 0) {
                class524.method3918(-4, 10L);
            }
            Frame var10 = (Frame) var9.field3407;
            if (var10 == null) {
                return null;
            } else if (var9.field3402 == 2) {
                class233.method2029(100, var10, arg3);
                return null;
            } else {
                return var10;
            }
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field7705[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7705[5] : field7705[3]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Ldv;", line = 183)
    public final class688 method3902(byte arg0) {
        try {
            field7700++;
            class688 var2 = this.field7702.field9939;
            if (this.field7702 == var2) {
                this.field7704 = null;
                return null;
            } else {
                this.field7704 = var2.field9939;
                return arg0 == -10 ? var2 : null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7705[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 210)
    public class521() {
        try {
            this.field7702.field9938 = this.field7702;
            this.field7702.field9939 = this.field7702;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7705[1] + ')');
        }
    }

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3903(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x40);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3904(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 120;
                    break;
                case 3:
                    var10005 = 65;
                    break;
                default:
                    var10005 = 64;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
