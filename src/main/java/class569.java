import jaggl.OpenGL;
import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class569 {

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public int field8100 = 512;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "Z")
    public boolean field8095 = true;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public int field8093 = 0;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "Z")
    public boolean field8102 = false;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public int field8094 = 64;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "I")
    public int field8103 = 8;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public int field8098 = 1190717;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public int field8105 = -1;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "Z")
    public boolean field8106 = true;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public int field8099 = -1;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public int field8107 = 127;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field8092 = 0;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field8104 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field8091;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public int field8096;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "I")
    public static int field8101;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Lum;")
    public static class521 field8108;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Ldl;")
    public class62 field8097;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 5)
    public final void method3321(int arg0) {
        if (arg0 == -1) {
            field8110++;
            this.field8103 = this.field8103 << 8 | this.field8096;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILud;)V", line = 18)
    private final void method3322(int arg0, int arg1, class35 arg2) {
        if (arg1 == 1) {
            this.field8093 = class419.method2561((byte) 119, arg2.method239(arg0 ^ 0xFFFFFFBF));
        } else if (arg1 == 2) {
            this.field8099 = arg2.method273(255);
        } else if (arg1 == 3) {
            this.field8099 = arg2.method253(-13900);
            if (this.field8099 == 65535) {
                this.field8099 = -1;
            }
        } else if (arg1 == 5) {
            this.field8106 = false;
        } else if (arg1 == 7) {
            this.field8105 = class419.method2561((byte) -93, arg2.method239(-118));
        } else if (arg1 == 8) {
            this.field8097.field1137 = this.field8096;
        } else if (arg1 == 9) {
            this.field8100 = arg2.method253(arg0 ^ 0xFFFFC9BF) << 2;
        } else if (arg1 == 10) {
            this.field8095 = false;
        } else if (arg1 == 11) {
            this.field8103 = arg2.method273(arg0 ^ 0xF4);
        } else if (arg1 == 12) {
            this.field8102 = true;
        } else if (arg1 == 13) {
            this.field8098 = arg2.method239(-74);
        } else if (arg1 == 14) {
            this.field8094 = arg2.method273(255) << 2;
        } else if (arg1 == 16) {
            this.field8107 = arg2.method273(arg0 ^ 0xF4);
        }
        field8091++;
        if (arg0 != 11) {
            this.field8099 = 35;
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 88)
    public static void method3323(int arg0) {
        if (arg0 != 0) {
            field8104 = 43;
        }
        field8108 = null;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILud;)V", line = 107)
    public final void method3324(int arg0, class35 arg1) {
        if (arg0 > -84) {
            this.field8098 = 112;
        }
        while (true) {
            int var3 = arg1.method273(255);
            if (var3 == 0) {
                field8101++;
                return;
            }
            this.method3322(11, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([BIBLeea;)Ltea;", line = 138)
    public static final class237 method3325(byte[] arg0, int arg1, byte arg2, class132 arg3) {
        field8111++;
        if (arg0 == null) {
            return null;
        } else if (arg2 == 56) {
            int var4 = OpenGL.glGenProgramARB();
            OpenGL.glBindProgramARB(arg1, var4);
            OpenGL.glProgramRawARB(arg1, 34933, arg0);
            OpenGL.glGetIntegerv(34379, class425.field5948, 0);
            if (class425.field5948[0] == -1) {
                OpenGL.glBindProgramARB(arg1, 0);
                return new class237(arg3, arg1, var4);
            } else {
                OpenGL.glBindProgramARB(arg1, 0);
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 167)
    public static final void method3326(String arg0, byte arg1) {
        if (class748.field10459 == null) {
            class351.method2204(65536);
        }
        field8109++;
        class173.field2506.setTime(new Date(class742.method4128(arg1 + 43)));
        int var2 = class173.field2506.get(11);
        int var3 = class173.field2506.get(12);
        if (arg1 != -42) {
            method3326(null, (byte) -39);
        }
        int var4 = class173.field2506.get(13);
        String var5 = Integer.toString(var2 / 10) + var2 % 10 + ":" + var3 / 10 + var3 % 10 + ":" + var4 / 10 + var4 % 10;
        String[] var6 = class327.method2091('\n', 26911, arg0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            for (int var8 = class405.field5649; var8 > 0; var8--) {
                class748.field10459[var8] = class748.field10459[var8 - 1];
            }
            class748.field10459[0] = var5 + ": " + var6[var7];
            if (class555.field7767 != null) {
                try {
                    class555.field7767.write(class644.method3670((byte) 126, class748.field10459[0] + "\n"));
                } catch (IOException var9) {
                }
            }
            if (class405.field5649 < class748.field10459.length - 1) {
                if (class58.field1077 > 0) {
                    class58.field1077++;
                }
                class405.field5649++;
            }
        }
    }
}
