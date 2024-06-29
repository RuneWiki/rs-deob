import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class502 {

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public int field7251 = 127;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public int field7255 = 8;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public int field7263 = 0;

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    public int field7250 = 64;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public int field7254 = 1190717;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public int field7264 = -1;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "Z")
    public boolean field7261 = true;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public int field7268 = -1;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "Z")
    public boolean field7265 = true;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Z")
    public boolean field7266 = false;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public int field7269 = 512;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7271 = new String[] { method3786(method3785("v\u0007},")), method3786(method3785("y\u0002?\u0003m")), method3786(method3785("c\\?n8")), method3786(method3785("y\u0002?\u0001m")), method3786(method3785("y\u0002?\u0002m")), method3786(method3785("y\u0002?\u0004m")) };

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "[I")
    public static int[] field7249 = new int[13];

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lcn;")
    public static class541 field7260 = null;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "[Z")
    public static boolean[] field7253 = new boolean[100];

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "[I")
    public static int[] field7258 = new int[5];

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public int field7267;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "Lqga;")
    public class196 field7259;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field7252;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)V", line = 7)
    public static void method3781(int arg0) {
        try {
            field7249 = null;
            if (arg0 == 3061) {
                field7258 = null;
                field7253 = null;
                field7252 = null;
                field7260 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7271[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lib;II)V", line = 21)
    private final void method3782(class163 arg0, int arg1, int arg2) {
        try {
            field7262++;
            if (arg2 != 12805) {
                field7249 = null;
            }
            if (arg1 == 1) {
                this.field7263 = class113.method1002(-22, arg0.method1436((byte) 123));
            } else if (arg1 == 2) {
                this.field7268 = arg0.method1455((byte) 62);
            } else if (arg1 == 3) {
                this.field7268 = arg0.method1445((byte) 109);
                if (this.field7268 == 65535) {
                    this.field7268 = -1;
                    return;
                }
            } else if (arg1 == 5) {
                this.field7265 = false;
            } else if (arg1 == 7) {
                this.field7264 = class113.method1002(arg2 ^ 0xFFFFCDD1, arg0.method1436((byte) 61));
                return;
            } else if (arg1 == 8) {
                this.field7259.field2630 = this.field7267;
                return;
            } else if (arg1 == 9) {
                this.field7269 = arg0.method1445((byte) 109) << 2;
                return;
            } else if (arg1 == 10) {
                this.field7261 = false;
                return;
            } else if (arg1 == 11) {
                this.field7255 = arg0.method1455((byte) 62);
                return;
            } else if (arg1 == 12) {
                this.field7266 = true;
                return;
            } else if (arg1 == 13) {
                this.field7254 = arg0.method1436((byte) 108);
                return;
            } else {
                if (arg1 == 14) {
                    this.field7250 = arg0.method1455((byte) 62) << 2;
                } else if (arg1 == 16) {
                    this.field7251 = arg0.method1455((byte) 62);
                    return;
                }
                return;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7271[5] + (arg0 == null ? field7271[0] : field7271[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(B)V", line = 95)
    public final void method3783(byte arg0) {
        try {
            field7256++;
            if (arg0 != 81) {
                this.field7266 = false;
            }
            this.field7255 = this.field7267 | this.field7255 << 8;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7271[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lib;Z)V", line = 139)
    public final void method3784(class163 arg0, boolean arg1) {
        try {
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    if (!arg1) {
                        return;
                    }
                    field7270++;
                    return;
                }
                this.method3782(arg0, var3, 12805);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7271[1] + (arg0 == null ? field7271[0] : field7271[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3785(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x45);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3786(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 64;
                    break;
                default:
                    var10005 = 69;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
