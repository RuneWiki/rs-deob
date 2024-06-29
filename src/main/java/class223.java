import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class class223 extends class702 {

    @OriginalMember(owner = "client!ika", name = "m", descriptor = "I")
    private int field3232;

    @OriginalMember(owner = "client!ika", name = "u", descriptor = "I")
    private int field3239;

    @OriginalMember(owner = "client!ika", name = "p", descriptor = "I")
    private int field3237;

    @OriginalMember(owner = "client!ika", name = "r", descriptor = "I")
    private int field3236;

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3241 = new String[] { method1870(method1869("\u0016arZlW")), method1870(method1869("\u0016arZfW")), method1870(method1869("\u0016arZmW")), method1870(method1869("\u0016arZ\u0012\u0016dz\u0000\u0010W")), method1870(method1869("\u0016arZoW")) };

    @OriginalMember(owner = "client!ika", name = "s", descriptor = "I")
    public static int field3234 = -1;

    @OriginalMember(owner = "client!ika", name = "x", descriptor = "I")
    private int field3228;

    @OriginalMember(owner = "client!ika", name = "w", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!ika", name = "n", descriptor = "I")
    private int field3230;

    @OriginalMember(owner = "client!ika", name = "q", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!ika", name = "v", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ika", name = "t", descriptor = "I")
    private int field3235;

    @OriginalMember(owner = "client!ika", name = "l", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!ika", name = "y", descriptor = "I")
    private int field3240;

    @OriginalMember(owner = "client!ika", name = "o", descriptor = "[B")
    private byte[] field3227;

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(BII)V", line = 8)
    public void method1868(byte arg0, int arg1, int arg2) {
        try {
            this.field3227[arg2] = arg0;
            if (arg1 <= 4) {
                this.method662((byte) 35);
            }
            field3238++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3241[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(III)V", line = 22)
    public final void method660(int arg0, int arg1, int arg2) {
        try {
            if (arg0 == 0) {
                this.field3240 = this.field3239 - (arg2 < 0 ? -arg2 : arg2);
                this.field3240 = this.field3240 * this.field3240 >> 12;
                this.field3230 = 4096;
                this.field3235 = this.field3240;
            } else {
                this.field3230 = this.field3240 * this.field3232 >> 12;
                if (this.field3230 < 0) {
                    this.field3230 = 0;
                } else if (this.field3230 > 4096) {
                    this.field3230 = 4096;
                }
                this.field3240 = this.field3239 - (arg2 >= 0 ? arg2 : -arg2);
                this.field3240 = this.field3240 * this.field3240 >> 12;
                this.field3240 = this.field3240 * this.field3230 >> 12;
                this.field3235 += this.field3240 * this.field3236 >> 12;
                this.field3236 = this.field3237 * this.field3236 >> 12;
            }
            field3229++;
            if (arg1 != -22460) {
                this.field3235 = -48;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3241[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)V", line = 58)
    public final void method662(byte arg0) {
        try {
            if (arg0 != 47) {
                this.field3235 = -69;
            }
            field3231++;
            this.field3236 = this.field3237;
            this.field3235 >>= 0x4;
            if (this.field3235 < 0) {
                this.field3235 = 0;
            } else if (this.field3235 > 255) {
                this.field3235 = 255;
            }
            this.method1868((byte) this.field3235, 58, this.field3228++);
            this.field3235 = 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3241[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(IIIIIFFF)V", line = 86)
    public class223(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field3232 = (int) (arg7 * 4096.0F);
            this.field3239 = (int) (arg6 * 4096.0F);
            this.field3236 = this.field3237 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field3241[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)V", line = 102)
    public final void method664(int arg0) {
        try {
            field3233++;
            this.field3235 = 0;
            if (arg0 == -9803) {
                this.field3228 = 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field3241[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1869(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ika", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1870(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 116;
                    break;
                default:
                    var10005 = 46;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
