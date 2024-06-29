import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public abstract class class469 implements class377 {

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "Z")
    private boolean field6858 = false;

    @OriginalMember(owner = "client!ica", name = "k", descriptor = "Lml;")
    public class194 field6859;

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "I")
    public int field6861;

    @OriginalMember(owner = "client!ica", name = "j", descriptor = "I")
    public int field6870;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "Z")
    private boolean field6871;

    @OriginalMember(owner = "client!ica", name = "g", descriptor = "I")
    private int field6860;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public int field6867;

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6874 = new String[] { method3607(method3606("\u001d\u000f(\u0015X\\")), method3607(method3606("\u001d\u000f(\u0015Y\\")), method3607(method3606("\u000fBg\u0015f")), method3607(method3606("\u001d\u000f(\u0015'\u001d\u0002 O%\\")), method3607(method3606("\u001a\u0019%W")), method3607(method3606("\u001d\u000f(\u0015_\\")), method3607(method3606("\u001d\u000f(\u0015\\\\")), method3607(method3606("\u001d\u000f(\u0015}\u001d\u0002(Wr\u000e\ta")), method3607(method3606("\u001d\u000f(\u0015]\\")), method3607(method3606("\u001d\u000f(\u0015^\\")), method3607(method3606("\u001d\u000f(\u0015R\\")), method3607(method3606("\u001d\u000f(\u0015S\\")) };

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field6857;

    @OriginalMember(owner = "client!ica", name = "e", descriptor = "I")
    public static int field6862;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!ica", name = "f", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!ica", name = "h", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!ica", name = "i", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!ica", name = "d", descriptor = "(I)V")
    public final void method3598(int arg0) {
        try {
            field6865++;
            if (this.field6867 > arg0) {
                this.field6859.method1626(-70, this.method3599((byte) -28), this.field6867);
                this.field6867 = 0;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6874[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I")
    private final int method3599(byte arg0) {
        try {
            field6866++;
            if (arg0 != -28) {
                this.field6871 = true;
            }
            int var2 = this.field6859.method1661((byte) -68, this.field6870) * this.field6860;
            return this.field6871 ? var2 * 4 / 3 : var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6874[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IZ)V")
    public final void method3600(int arg0, boolean arg1) {
        try {
            if (this.field6858 != arg1) {
                this.field6858 = arg1;
                this.method3605(-126);
            }
            field6869++;
            int var3 = -117 % ((30 - arg0) / 55);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6874[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)Z")
    public final boolean method3601(int arg0) {
        try {
            if (arg0 != -1) {
                this.field6871 = true;
            }
            field6872++;
            if (!this.field6859.field2806) {
                return false;
            }
            int var2 = this.method3599((byte) -28);
            this.field6859.method1618((byte) 84, this);
            OpenGL.glGenerateMipmapEXT(this.field6861);
            this.field6871 = true;
            this.method3605(-126);
            this.method3604(10240, var2);
            return true;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6874[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(B)I")
    public final int method3602(byte arg0) {
        try {
            if (arg0 != -28) {
                this.field6867 = 106;
            }
            field6857++;
            return this.field6867;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6874[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            field6862++;
            this.method3598(0);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field6874[7] + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(IZ)V")
    public final void method3603(int arg0, boolean arg1) {
        try {
            field6873++;
            if (arg0 != 13486) {
                this.field6860 = 27;
            }
            if (this.field6871 != arg1) {
                int var3 = this.method3599((byte) -28);
                this.field6871 = true;
                this.method3605(-126);
                this.method3604(10240, var3);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field6874[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(II)V")
    private final void method3604(int arg0, int arg1) {
        try {
            this.field6859.field2775 -= arg1;
            field6863++;
            this.field6859.field2775 += this.method3599((byte) -28);
            if (arg0 != 10240) {
                this.method3604(-74, 115);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field6874[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)V")
    private final void method3605(int arg0) {
        try {
            if (arg0 > -124) {
                this.method3599((byte) 111);
            }
            this.field6859.method1618((byte) -95, this);
            field6868++;
            if (this.field6858) {
                OpenGL.glTexParameteri(this.field6861, 10241, this.field6871 ? 9987 : 9729);
                OpenGL.glTexParameteri(this.field6861, 10240, 9729);
            } else {
                OpenGL.glTexParameteri(this.field6861, 10241, this.field6871 ? 9984 : 9728);
                OpenGL.glTexParameteri(this.field6861, 10240, 9728);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field6874[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lml;IIIZ)V")
    public class469(class194 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            this.field6859 = arg0;
            this.field6861 = arg1;
            this.field6870 = arg2;
            this.field6871 = arg4;
            this.field6860 = arg3;
            OpenGL.glGenTextures(1, class584.field8428, 0);
            this.field6867 = class584.field8428[0];
            this.method3604(10240, 0);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field6874[3] + (arg0 == null ? field6874[4] : field6874[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)V")
    public abstract void method992(int arg0);

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3606(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ica", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3607(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 116;
                    break;
                case 1:
                    var10005 = 108;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 27;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
