import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dt")
public class class251 extends class299 {

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3848 = new String[] { method2137(method2136("I\u0014\u000e?\u001f")), method2137(method2136("I\u0014\u000e<\u001f")), method2137(method2136("I\u0014\u000e;\u001f")), method2137(method2136("I\u0014\u000e1\u001f")), method2137(method2136("I\u0014\u000e>\u001f")), method2137(method2136("I\u0014\u000e=\u001f")), method2137(method2136("I\u0014\u000e8\u001f")), method2137(method2136("I\u0014\u000e:\u001f")) };

    @OriginalMember(owner = "client!dt", name = "k", descriptor = "I")
    public static int field3843 = 0;

    @OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!dt", name = "m", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!dt", name = "i", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!dt", name = "h", descriptor = "[[[B")
    public static byte[][][] field3844;

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(ILes;)V", line = 5)
    public class251(int arg0, class404 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(II)I", line = 9)
    public final int method852(int arg0, int arg1) {
        try {
            if (arg0 != 1) {
                method2135((byte) 29);
            }
            ++field3841;
            return 1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3848[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(Les;)V", line = 21)
    public class251(class404 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZ)V", line = 26)
    public final void method846(int arg0, boolean arg1) {
        try {
            ++field3845;
            if (arg1) {
                this.method852(15, 121);
            }
            super.field4849 = arg0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3848[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(Z)I", line = 37)
    public final int method2132(boolean arg0) {
        try {
            ++field3847;
            if (!arg0) {
                this.method848(59);
            }
            return super.field4849;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3848[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(II)I", line = 48)
    public static int method2133(int arg0, int arg1) {
        try {
            return arg0 ^ arg1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3848[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V", line = 59)
    public final void method848(int arg0) {
        try {
            if (~super.field4849 > -2 || super.field4849 > 3) {
                super.field4849 = this.method847(0);
            }
            ++field3842;
            if (arg0 != -20456) {
                this.method848(64);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3848[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "c", descriptor = "(I)V", line = 72)
    public static void method2134(int arg0) {
        try {
            if (arg0 != 2) {
                field3844 = null;
            }
            field3844 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3848[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(B)V", line = 85)
    public static final void method2135(byte arg0) {
        try {
            class664.field9455 = null;
            class717.field10445 = null;
            class563.field8190 = false;
            class536.field7878 = null;
            class606.field8728 = null;
            class132.field1880 = null;
            if (arg0 > -8) {
                method2135((byte) -55);
            }
            ++field3840;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3848[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)I", line = 101)
    public final int method847(int arg0) {
        try {
            ++field3846;
            if (arg0 != 0) {
                return -19;
            } else {
                return super.field4850.method3250((byte) 87).method2097(true) ? 3 : 2;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3848[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2136(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 55);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2137(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 45;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
