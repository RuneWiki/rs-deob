import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class766 extends class518 {

    @OriginalMember(owner = "client!iba", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field10948 = new String[] { method5539(method5538("\u00124)A\u001dS")), method5539(method5538("\u0000xfA!")), method5539(method5538("\u00124)A\u001fS")), method5539(method5538("\u0015#$\u0003")), method5539(method5538("\u00124)A\u001eS")), method5539(method5538("\u00124)A\u0018S")), method5539(method5538("\u00124)A`\u00128!\u001bbS")) };

    @OriginalMember(owner = "client!iba", name = "H", descriptor = "I")
    public static int field10941;

    @OriginalMember(owner = "client!iba", name = "I", descriptor = "I")
    private int field10942;

    @OriginalMember(owner = "client!iba", name = "E", descriptor = "I")
    private int field10943;

    @OriginalMember(owner = "client!iba", name = "C", descriptor = "I")
    private int field10944;

    @OriginalMember(owner = "client!iba", name = "D", descriptor = "I")
    public static int field10945;

    @OriginalMember(owner = "client!iba", name = "F", descriptor = "I")
    public static int field10946;

    @OriginalMember(owner = "client!iba", name = "G", descriptor = "I")
    public static int field10947;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "(I)V")
    public static final void method5536(int arg0) {
        try {
            if (class651.field9249.field2479 && ~class628.field8956.field11524 != 0) {
                class778.method5599(class628.field8956.field11524, 24611, class628.field8956.field11516);
            }
            ++field10947;
            if (arg0 == -280) {
                ;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10948[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)[[I")
    public final int[][] method349(int arg0, int arg1) {
        try {
            ++field10946;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class110.field1436; ++var7) {
                    var4[var7] = this.field10943;
                    var5[var7] = this.field10944;
                    var6[var7] = this.field10942;
                }
            }
            if (arg0 != 0) {
                this.method5537(-56, 55);
            }
            return var3;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10948[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "(II)V")
    private final void method5537(int arg0, int arg1) {
        try {
            this.field10943 = arg0 >> 12 & 4080;
            this.field10944 = (65280 & arg0) >> 4;
            this.field10942 = (255 & arg0) << 4;
            if (arg1 == 0) {
                ++field10941;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10948[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjc;I)V")
    public final void method17(int arg0, class711 arg1, int arg2) {
        try {
            ++field10945;
            if (~arg0 == -1) {
                this.method5537(arg1.method5085(true), 0);
            }
            if (arg2 != -3) {
                this.field10942 = -14;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10948[2] + arg0 + ',' + (arg1 != null ? field10948[1] : field10948[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "()V")
    public class766() {
        this(0);
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(I)V")
    private class766(int arg0) {
        super(0, false);
        try {
            this.method5537(arg0, 0);
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10948[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5538(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 92);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5539(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 123;
                    break;
                case 1:
                    var10005 = 86;
                    break;
                case 2:
                    var10005 = 72;
                    break;
                case 3:
                    var10005 = 111;
                    break;
                default:
                    var10005 = 92;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
