import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public abstract class class376 {

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "I")
    private int field6096;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "I")
    private int field6100;

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "Lvf;")
    public class159 field6102;

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "Z")
    private boolean field6099;

    @OriginalMember(owner = "client!bga", name = "f", descriptor = "I")
    public int field6097;

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6104 = new String[] { method3099(method3098("tB|Z")), method3099(method3098("a\u0019>\u0018x")), method3099(method3098("xPq\u0018L2")), method3099(method3098("xPq\u00189sYyB;2")), method3099(method3098("xPq\u0018csYqZl`R8")), method3099(method3098("xPq\u0018M2")), method3099(method3098("xPq\u0018N2")), method3099(method3098("xPq\u0018I2")), method3099(method3098("xPq\u0018O2")) };

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "Ljj;")
    public static class126 field6098 = new class126();

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "I")
    public static int field6093;

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!bga", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.field6102.method1493(this.field6097, -96, this.field6096);
            field6093++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6104[4] + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([BLtia;IB)Lwja;")
    public static final class279 method3093(byte[] arg0, class278 arg1, int arg2, byte arg3) {
        try {
            field6094++;
            if (arg3 >= -83) {
                method3094((byte) 4);
            }
            if (arg0 == null) {
                return null;
            }
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg2, var4);
            OpenGL.glProgramRawARB(arg2, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class274.field4399, 0);
            if (class274.field4399[0] == -1) {
                OpenGL.glBindProgramARB(arg2, 0);
                return new class279(arg1, arg2, var4);
            } else {
                OpenGL.glBindProgramARB(arg2, 0);
                return null;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6104[6] + (arg0 == null ? field6104[0] : field6104[1]) + ',' + (arg1 == null ? field6104[0] : field6104[1]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)V")
    public static void method3094(byte arg0) {
        try {
            int var1 = 99 % ((arg0 - 33) / 42);
            field6098 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6104[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(B)V")
    public static final void method3095(byte arg0) {
        try {
            field6095++;
            int var1 = 0;
            if (class623.field8996 != null) {
                var1 = class623.field8996.field6383.method1248(true);
            }
            if (var1 == 2) {
                int var4 = class413.field6568 > 800 ? 800 : class413.field6568;
                class687.field9928 = (class413.field6568 - var4) / 2;
                class64.field881 = var4;
                int var5 = class464.field7131 > 600 ? 600 : class464.field7131;
                class333.field5444 = var5;
                class250.field3835 = 0;
            } else if (var1 == 1) {
                int var2 = class413.field6568 <= 1024 ? class413.field6568 : 1024;
                class64.field881 = var2;
                class687.field9928 = (class413.field6568 - var2) / 2;
                int var3 = class464.field7131 <= 768 ? class464.field7131 : 768;
                class333.field5444 = var3;
                class250.field3835 = 0;
            } else {
                class250.field3835 = 0;
                class687.field9928 = 0;
                class333.field5444 = class464.field7131;
                class64.field881 = class413.field6568;
            }
            if (arg0 < 51) {
                method3094((byte) 102);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6104[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3096(int arg0, String arg1) {
        try {
            field6101++;
            if (arg0 > -108) {
                field6098 = null;
            }
            String var2 = class242.method2084(class660.method4797(arg1, false), 31473);
            if (var2 == null) {
                var2 = "";
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6104[8] + arg0 + ',' + (arg1 == null ? field6104[0] : field6104[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "([BII)V")
    public final void method3097(byte[] arg0, int arg1, int arg2) {
        try {
            if (arg2 == 35040) {
                field6103++;
                this.method622(arg2 ^ 0xFFFF1F81);
                if (arg1 <= this.field6096) {
                    OpenGL.glBufferSubDataARBub(this.field6100, 0, arg1, arg0, 0);
                } else {
                    OpenGL.glBufferDataARBub(this.field6100, arg1, arg0, 0, this.field6099 ? 35040 : 35044);
                    this.field6102.field2408 += arg1 - this.field6096;
                    this.field6096 = arg1;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6104[2] + (arg0 == null ? field6104[0] : field6104[1]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V")
    public abstract void method622(int arg0);

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lvf;I[BIZ)V")
    public class376(class159 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        try {
            this.field6096 = arg3;
            this.field6100 = arg1;
            this.field6102 = arg0;
            this.field6099 = arg4;
            OpenGL.glGenBuffersARB(1, class482.field7327, 0);
            this.field6097 = class482.field7327[0];
            this.method622(-26783);
            OpenGL.glBufferDataARBub(arg1, this.field6096, arg2, 0, this.field6099 ? 35040 : 35044);
            this.field6102.field2408 += this.field6096;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6104[3] + (arg0 == null ? field6104[0] : field6104[1]) + ',' + arg1 + ',' + (arg2 == null ? field6104[0] : field6104[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lvf;ILjaclib/memory/Buffer;IZ)V")
    public class376(class159 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        try {
            this.field6099 = arg4;
            this.field6096 = arg3;
            this.field6100 = arg1;
            this.field6102 = arg0;
            OpenGL.glGenBuffersARB(1, class482.field7327, 0);
            this.field6097 = class482.field7327[0];
            this.method622(-26783);
            OpenGL.glBufferDataARBa(arg1, this.field6096, arg2.getAddress(), this.field6099 ? 35040 : 35044);
            this.field6102.field2408 += this.field6096;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6104[3] + (arg0 == null ? field6104[0] : field6104[1]) + ',' + arg1 + ',' + (arg2 == null ? field6104[0] : field6104[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3098(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3099(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 5;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
