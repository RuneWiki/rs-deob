import java.awt.Frame;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class38 extends class212 {

    @OriginalMember(owner = "client!uja", name = "B", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!uja", name = "x", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!uja", name = "q", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!uja", name = "C", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!uja", name = "I", descriptor = "[Ljava/lang/String;")
    private static final String[] field448 = new String[] { method260(method259("pDY\u0006")), method260(method259("k[TDi6")), method260(method259("e\u001f\u001bDA")), method260(method259("k[TDs6")), method260(method259("k[TDt6")), method260(method259("k[TD\u007f6")), method260(method259("k[TDm6")), method260(method259("k[TDn6")), method260(method259("k[TDh6")), method260(method259("k[TD\u0000w_\\\u001e\u00026")), method260(method259("k[TDv6")), method260(method259("k[TDo6")), method260(method259("AEZ\u001a")), method260(method259("ASY\u000bRu")), method260(method259("r^R\rYz^@\u001e")) };

    @OriginalMember(owner = "client!uja", name = "H", descriptor = "Lwq;")
    public static class178 field446 = new class178(8);

    @OriginalMember(owner = "client!uja", name = "G", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!uja", name = "F", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!uja", name = "y", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!uja", name = "p", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!uja", name = "t", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client!uja", name = "u", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!uja", name = "v", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!uja", name = "D", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!uja", name = "r", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!uja", name = "w", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!uja", name = "s", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!uja", name = "A", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!uja", name = "E", descriptor = "Lfia;")
    public static class601 field447;

    @OriginalMember(owner = "client!uja", name = "z", descriptor = "[B")
    private byte[] field440;

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Lmca;Ljava/awt/Frame;I)V")
    public static final void method250(class33 arg0, Frame arg1, int arg2) {
        try {
            while (true) {
                class42 var3 = arg0.method229(arg1, (byte) 107);
                while (var3.field503 == 0) {
                    class151.method1269(false, 10L);
                }
                if (var3.field503 == 1) {
                    field435++;
                    if (arg2 > -3) {
                        return;
                    }
                    arg1.setVisible(false);
                    arg1.dispose();
                    return;
                }
                class151.method1269(false, 100L);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field448[1] + (arg0 == null ? field448[0] : field448[2]) + ',' + (arg1 == null ? field448[0] : field448[2]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(B[B)Lnf;")
    public static final class603 method251(byte arg0, byte[] arg1) {
        try {
            field439++;
            class603 var2 = new class603();
            class163 var3 = new class163(arg1);
            var3.field2201 = var3.field2209.length - 2;
            if (arg0 != -48) {
                method251((byte) -36, null);
            }
            int var4 = var3.method1445((byte) 124);
            int var5 = var3.field2209.length - var4 - 16 - 2;
            var3.field2201 = var5;
            int var6 = var3.method1453((byte) 117);
            var2.field8848 = var3.method1445((byte) 127);
            var2.field8838 = var3.method1445((byte) 112);
            var2.field8847 = var3.method1445((byte) 118);
            var2.field8839 = var3.method1445((byte) 110);
            var2.field8833 = var3.method1445((byte) 109);
            var2.field8846 = var3.method1445((byte) 113);
            int var7 = var3.method1455((byte) 62);
            if (var7 > 0) {
                var2.field8835 = new class112[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    int var9 = var3.method1445((byte) 106);
                    class112 var10 = new class112(class12.method83((byte) -1, var9));
                    var2.field8835[var8] = var10;
                    while (var9-- > 0) {
                        int var11 = var3.method1453((byte) 108);
                        int var12 = var3.method1453((byte) 122);
                        var10.method968((byte) -111, (long) var11, new class609(var12));
                    }
                }
            }
            var3.field2201 = 0;
            var2.field8836 = var3.method1401(0);
            var2.field8842 = new int[var6];
            int var13 = 0;
            while (var5 > var3.field2201) {
                int var14 = var3.method1445((byte) 105);
                if (var14 == 3) {
                    if (var2.field8834 == null) {
                        var2.field8834 = new String[var6];
                    }
                    var2.field8834[var13] = var3.method1423(98).intern();
                } else if (var14 == 54) {
                    if (var2.field8844 == null) {
                        var2.field8844 = new long[var6];
                    }
                    var2.field8844[var13] = var3.method1435(-126);
                } else {
                    if (var2.field8837 == null) {
                        var2.field8837 = new int[var6];
                    }
                    if (var14 >= 150 || var14 == 21 || var14 == 38 || var14 == 39) {
                        var2.field8837[var13] = var3.method1455((byte) 62);
                    } else {
                        var2.field8837[var13] = var3.method1453((byte) 108);
                    }
                }
                var2.field8842[var13++] = var14;
            }
            return var2;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field448[7] + arg0 + ',' + (arg1 == null ? field448[0] : field448[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Z)V")
    public final void method252(boolean arg0) {
        try {
            this.field442 = 0;
            field443++;
            this.field437 = 0;
            if (!arg0) {
                this.field442 = 94;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field448[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(Ljava/lang/String;Lmca;IILjava/lang/String;)Lvd;")
    public static final class42 method253(String arg0, class33 arg1, int arg2, int arg3, String arg4) {
        try {
            field431++;
            if (arg3 == 0) {
                return arg1.method219(arg0, arg2 ^ 0x17CD);
            } else if (arg2 == arg3) {
                try {
                    Object var5 = class600.method4460(arg4, 60, new Object[] { (new URL(class629.field9206.getCodeBase(), arg0)).toString() }, class629.field9206);
                    if (var5 == null) {
                        throw new RuntimeException();
                    }
                    class42 var6 = new class42();
                    var6.field503 = 1;
                    return var6;
                } catch (Throwable var13) {
                    class42 var7 = new class42();
                    var7.field503 = 2;
                    return var7;
                }
            } else if (arg3 == 2) {
                try {
                    class629.field9206.getAppletContext().showDocument(new URL(class629.field9206.getCodeBase(), arg0), field448[13]);
                    class42 var8 = new class42();
                    var8.field503 = 1;
                    return var8;
                } catch (Exception var14) {
                    class42 var9 = new class42();
                    var9.field503 = 2;
                    return var9;
                }
            } else if (arg3 == 3) {
                try {
                    class600.method4461(class629.field9206, field448[14], (byte) 117);
                } catch (Throwable var16) {
                }
                try {
                    class629.field9206.getAppletContext().showDocument(new URL(class629.field9206.getCodeBase(), arg0), field448[12]);
                    class42 var10 = new class42();
                    var10.field503 = 1;
                    return var10;
                } catch (Exception var15) {
                    class42 var11 = new class42();
                    var11.field503 = 2;
                    return var11;
                }
            } else {
                throw new IllegalArgumentException();
            }
        } catch (RuntimeException var17) {
            throw class759.method5498(var17, field448[11] + (arg0 == null ? field448[0] : field448[2]) + ',' + (arg1 == null ? field448[0] : field448[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field448[0] : field448[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field432 = (int) (arg6 * 4096.0F);
            this.field434 = (int) (arg7 * 4096.0F);
            this.field430 = this.field433 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field448[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(IBB)V")
    public void method254(int arg0, byte arg1, byte arg2) {
        try {
            if (arg2 != 14) {
                this.field432 = 6;
            }
            this.field440[arg0] = arg1;
            field441++;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field448[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "d", descriptor = "(B)V")
    public static void method255(byte arg0) {
        try {
            field447 = null;
            if (arg0 != 71) {
                field447 = null;
            }
            field446 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field448[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(III)V")
    public final void method256(int arg0, int arg1, int arg2) {
        try {
            if (arg2 == 0) {
                this.field445 = this.field432 - (arg1 < 0 ? -arg1 : arg1);
                this.field445 = this.field445 * this.field445 >> 12;
                this.field438 = 4096;
                this.field442 = this.field445;
            } else {
                this.field438 = this.field445 * this.field434 >> 12;
                this.field445 = this.field432 - (arg1 >= 0 ? arg1 : -arg1);
                if (this.field438 < 0) {
                    this.field438 = 0;
                } else if (this.field438 > 4096) {
                    this.field438 = 4096;
                }
                this.field445 = this.field445 * this.field445 >> 12;
                this.field445 = this.field445 * this.field438 >> 12;
                this.field442 += this.field445 * this.field430 >> 12;
                this.field430 = this.field433 * this.field430 >> 12;
            }
            field436++;
            if (arg0 != 980100556) {
                method251((byte) -69, null);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field448[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "b", descriptor = "(B)V")
    public final void method257(byte arg0) {
        try {
            this.field442 >>= 0x4;
            this.field430 = this.field433;
            field444++;
            if (this.field442 < 0) {
                this.field442 = 0;
            } else if (this.field442 > 255) {
                this.field442 = 255;
            }
            this.method254(this.field437++, (byte) this.field442, (byte) 14);
            this.field442 = 0;
            int var2 = 1 / ((arg0 - 10) / 46);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field448[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "a", descriptor = "(BI)I")
    public static final int method258(byte arg0, int arg1) {
        try {
            field429++;
            if (arg0 != 90) {
                field446 = null;
            }
            return arg1 >>> 8;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field448[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method259(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3C);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method260(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 49;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 60;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
