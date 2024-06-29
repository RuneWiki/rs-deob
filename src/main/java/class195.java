import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public abstract class class195 implements class18 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
    private boolean field2955 = false;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Z")
    private boolean field2966;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Lwh;")
    public class148 field2967;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    private int field2950;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Lada;")
    public static class164 field2969 = new class164();

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Lpga;")
    public static class536 field2970;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V", line = 6)
    public final void method1351(int arg0) {
        if (this.field2958 > 0) {
            this.field2967.method1044((byte) 127, this.field2958, this.method1359((byte) -114));
            this.field2958 = 0;
        }
        if (arg0 < 69) {
            method1352((byte) 53);
        }
        field2951++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Ljava/lang/String;", line = 22)
    public static final String method1352(byte arg0) {
        field2961++;
        if (class483.field6967 || class456.field6722 == null) {
            return "";
        } else if ((class456.field6722.field4969 == null || class456.field6722.field4969.length() == 0) && class456.field6722.field4964 != null && class456.field6722.field4964.length() > 0) {
            return class456.field6722.field4964;
        } else {
            if (arg0 != 86) {
                method1352((byte) 127);
            }
            return class456.field6722.field4969;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 44)
    private final void method1353(int arg0) {
        field2965++;
        this.field2967.method1088(this, -27749);
        if (arg0 != 10241) {
            this.method1351(10);
        }
        if (this.field2955) {
            OpenGL.glTexParameteri(this.field2957, 10241, this.field2966 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field2957, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field2957, 10241, this.field2966 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field2957, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V", line = 66)
    protected final void finalize() throws Throwable {
        this.method1351(122);
        field2963++;
        super.finalize();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI)V", line = 76)
    public final void method1354(boolean arg0, int arg1) {
        if (this.field2966 != arg0) {
            int var3 = this.method1359((byte) -127);
            this.field2966 = true;
            this.method1353(10241);
            this.method1360(var3, (byte) -106);
        }
        field2948++;
        if (arg1 != 15771) {
            field2969 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)Z", line = 99)
    public static final boolean method1355(byte arg0) {
        if (arg0 != 108) {
            method1357(-98, -6L);
        }
        field2962++;
        if (class590.field8364) {
            try {
                class121.method877(class466.field6830, "showVideoAd", -22421);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V", line = 120)
    public static final void method1356(byte arg0) {
        field2968++;
        int var1 = 0;
        if (class63.field916 != null) {
            var1 = class63.field916.field10160.method4217(17503);
        }
        if (var1 == 2) {
            int var4 = class153.field2475 <= 800 ? class153.field2475 : 800;
            class501.field7123 = var4;
            int var5 = class455.field6702 > 600 ? 600 : class455.field6702;
            class238.field3466 = (class153.field2475 - var4) / 2;
            class510.field7263 = var5;
            class37.field381 = 0;
        } else if (var1 == 1) {
            int var2 = class153.field2475 > 1024 ? 1024 : class153.field2475;
            class238.field3466 = (class153.field2475 - var2) / 2;
            int var3 = class455.field6702 > 768 ? 768 : class455.field6702;
            class501.field7123 = var2;
            class510.field7263 = var3;
            class37.field381 = 0;
        } else {
            class510.field7263 = class455.field6702;
            class501.field7123 = class153.field2475;
            class37.field381 = 0;
            class238.field3466 = 0;
        }
        int var6 = 114 / ((42 - arg0) / 44);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 167)
    public static final String method1357(int arg0, long arg1) {
        field2960++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            if (arg0 != 95) {
                return null;
            }
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class313.field4435[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)Z", line = 206)
    public final boolean method1358(byte arg0) {
        field2949++;
        int var2 = -86 / ((65 - arg0) / 33);
        if (!this.field2967.field2205) {
            return false;
        }
        int var3 = this.method1359((byte) -110);
        this.field2967.method1088(this, -27749);
        OpenGL.glGenerateMipmapEXT(this.field2957);
        this.field2966 = true;
        this.method1353(10241);
        this.method1360(var3, (byte) -93);
        return true;
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(B)I", line = 229)
    private final int method1359(byte arg0) {
        if (arg0 > -101) {
            this.method1361((byte) 47);
        }
        field2952++;
        int var2 = this.field2967.method1101(116, this.field2956) * this.field2950;
        return this.field2966 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V", line = 244)
    private final void method1360(int arg0, byte arg1) {
        if (arg1 >= -82) {
            method1355((byte) 58);
        }
        this.field2967.field2182 -= arg0;
        field2954++;
        this.field2967.field2182 += this.method1359((byte) -122);
    }

    @OriginalMember(owner = "client!me", name = "f", descriptor = "(B)I", line = 258)
    public final int method1361(byte arg0) {
        if (arg0 <= 5) {
            this.field2958 = 70;
        }
        field2964++;
        return this.field2958;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(ZI)V", line = 273)
    public final void method1362(boolean arg0, int arg1) {
        field2959++;
        if (arg0 != this.field2955) {
            this.field2955 = arg0;
            this.method1353(10241);
        }
        if (arg1 != 1287) {
            this.method1359((byte) 23);
        }
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(B)V", line = 290)
    public static void method1363(byte arg0) {
        field2970 = null;
        if (arg0 != 115) {
            field2970 = null;
        }
        field2969 = null;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lwh;IIIZ)V", line = 314)
    public class195(class148 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field2957 = arg1;
        this.field2966 = arg4;
        this.field2956 = arg2;
        this.field2967 = arg0;
        this.field2950 = arg3;
        OpenGL.glGenTextures(1, class526.field7500, 0);
        this.field2958 = class526.field7500[0];
        this.method1360(0, (byte) -110);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public abstract void method106(int arg0);
}
