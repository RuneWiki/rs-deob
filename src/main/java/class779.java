import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class779 {

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Ltf;")
    private class524 field11089 = new class524();

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    private int field11097 = 0;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Ljc;")
    private class711 field11098 = new class711(1350);

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Leea;")
    public class476 field11099 = new class476(15000);

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Z")
    public boolean field11101 = false;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
    public boolean field11102 = true;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Lsb;")
    public class261 field11112 = null;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field11105 = 0;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public int field11107 = 0;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public int field11106 = 0;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field11114 = new String[] { method5610(method5609("{\u0018?^H")), method5610(method5609("{\u0018?_H")), method5610(method5609("{\u0018?]H")), method5610(method5609("oT?4\u001d")), method5610(method5609("z\u000f}v")), method5610(method5609("{\u0018?\\H")), method5610(method5609("{\u0018?YH")), method5610(method5609("{\u0018?[H")) };

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field11092 = 0;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "[I")
    public static int[] field11091 = new int[2];

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field11087;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field11090;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field11093;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field11094;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field11095;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public int field11104;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public int field11108;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public int field11109;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    private int field11110;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "Lsb;")
    public class261 field11103;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Lsb;")
    public class261 field11111;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lsb;")
    public class261 field11113;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lgo;")
    public class28 field11096;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lvn;")
    public class328 field11088;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Loja;")
    public class646 field11100;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lr;III[Z)V")
    public static final void method5602(class412 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class677.field9474 == class107.field1413) {
            return;
        }
        int var5 = class213.field3124[arg1].method5440((byte) 15, arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class751 var7 = class213.field3124[var6];
                if (var7 != null) {
                    var7.method2472(arg0, arg2, var5 - var7.method5440((byte) 15, arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public final void method5603(int arg0) throws IOException {
        try {
            if (arg0 != 0) {
                this.field11102 = false;
            }
            field11090++;
            if (this.field11096 != null && this.field11097 > 0) {
                this.field11098.field9945 = 0;
                while (true) {
                    class274 var2 = (class274) this.field11089.method3977((byte) -54);
                    if (var2 == null || var2.field3879 > (this.field11098.field9996.length - this.field11098.field9945)) {
                        this.field11096.method312(this.field11098.field9996, 55, 0, this.field11098.field9945);
                        this.field11110 += this.field11098.field9945;
                        this.field11107 = 0;
                        return;
                    }
                    this.field11098.method5086(0, var2.field3885.field9996, var2.field3879, -2);
                    this.field11097 -= var2.field3879;
                    var2.method4294(0);
                    var2.field3885.method5111(arg0 - 27486);
                    var2.method2246(0);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11114[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public final void method5604(int arg0) {
        try {
            if (arg0 != 1350) {
                this.method5608(null, -19);
            }
            if (this.field11096 != null) {
                this.field11096.method318((byte) -104);
                this.field11096 = null;
            }
            field11087++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11114[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public static void method5605(int arg0) {
        try {
            if (arg0 != 0) {
                field11092 = 28;
            }
            field11091 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field11114[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
    public final void method5606(int arg0) {
        try {
            field11093++;
            if (arg0 != 7732) {
                field11092 = 58;
            }
            if ((class694.field9700 % 50) == 0) {
                this.field11108 = this.field11110;
                this.field11104 = this.field11109;
                this.field11110 = 0;
                this.field11109 = 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field11114[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)V")
    public final void method5607(int arg0) {
        try {
            this.field11089.method3982(-120);
            field11095++;
            this.field11097 = 0;
            int var2 = 27 / ((30 - arg0) / 40);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11114[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ldm;I)V")
    public final void method5608(class274 arg0, int arg1) {
        try {
            this.field11089.method3984(arg0, 0);
            field11094++;
            arg0.field3879 = arg0.field3885.field9945;
            arg0.field3885.field9945 = 0;
            if (arg1 != 29867) {
                this.method5607(-70);
            }
            this.field11097 += arg0.field3879;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field11114[5] + (arg0 == null ? field11114[4] : field11114[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5609(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5610(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 20;
                    break;
                case 1:
                    var10005 = 122;
                    break;
                case 2:
                    var10005 = 17;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
