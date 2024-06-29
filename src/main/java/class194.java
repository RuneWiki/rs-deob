import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public abstract class class194 implements class192 {

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "Z")
    private boolean field3061 = false;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    private int field3062;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Z")
    private boolean field3059;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lbl;")
    public class442 field3065;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lls;")
    public static class88 field3056;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)V")
    private final void method1204(boolean arg0, int arg1) {
        field3070++;
        this.field3065.field6702 -= arg1;
        this.field3065.field6702 += this.method1206(-90);
        if (!arg0) {
            this.field3062 = 8;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)Z")
    public final boolean method1205(byte arg0) {
        field3055++;
        if (arg0 != 80) {
            return true;
        } else if (this.field3065.field6802) {
            int var2 = this.method1206(-97);
            this.field3065.method2586(this, false);
            OpenGL.glGenerateMipmapEXT(this.field3066);
            this.field3059 = true;
            this.method1209((byte) 125);
            this.method1204(true, var2);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
    private final int method1206(int arg0) {
        field3057++;
        int var2 = 59 / ((23 - arg0) / 54);
        int var3 = this.field3065.method2583(this.field3067, 68) * this.field3062;
        return this.field3059 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIZ)V")
    public static final void method1207(byte arg0, int arg1, boolean arg2) {
        if (arg0 != -108) {
            return;
        }
        field3068++;
        class146 var3 = class478.method2889(arg1, (byte) 27, arg2);
        if (var3 != null) {
            var3.method1121(false);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZ)V")
    public final void method1208(boolean arg0, boolean arg1) {
        field3063++;
        if (arg1) {
            this.method1204(false, -109);
        }
        if (arg0 != this.field3061) {
            this.field3061 = arg0;
            this.method1209((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    private final void method1209(byte arg0) {
        if (arg0 < 80) {
            return;
        }
        this.field3065.method2586(this, false);
        field3060++;
        if (this.field3061) {
            OpenGL.glTexParameteri(this.field3066, 10241, this.field3059 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field3066, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field3066, 10241, this.field3059 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field3066, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Z")
    public static final boolean method1210(byte arg0, int arg1) {
        field3054++;
        class471 var2 = class96.method714(arg1, 0);
        if (var2 == null) {
            return false;
        } else if (class260.field3942 == 3) {
            String var3 = "";
            if (class77.field1378 != class230.field3507) {
                var3 = ":" + (var2.field7208 + 7000);
            }
            String var4 = "";
            if (class138.field2274 != null) {
                var4 = "/p=" + class138.field2274;
            }
            String var5 = "http://" + var2.field7204 + var3 + "/l=" + class406.field5898 + "/a=" + class90.field1620 + var4 + "/j" + (class112.field1907 ? "1" : "0") + ",o" + (class264.field3986 ? "1" : "0") + ",a2";
            try {
                int var6 = 121 % ((-arg0 - 22) / 40);
                class6.field75.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        } else {
            class376.field5480 = var2.field7204;
            class167.field2593 = var2.field7208;
            if (class77.field1378 != class230.field3507) {
                class291.field4435 = class167.field2593 + 40000;
                class121.field2010 = class167.field2593 + 50000;
                class220.field3399 = class291.field4435;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3064++;
        this.method1214(-123);
        super.finalize();
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)I")
    public final int method1211(int arg0) {
        if (arg0 > -91) {
            method1212(102);
        }
        field3069++;
        return this.field3071;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
    public static void method1212(int arg0) {
        field3056 = null;
        if (arg0 != 10241) {
            method1212(-105);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZB)V")
    public final void method1213(boolean arg0, byte arg1) {
        if (arg0 != this.field3059) {
            int var3 = this.method1206(119);
            this.field3059 = true;
            this.method1209((byte) 118);
            this.method1204(true, var3);
        }
        if (arg1 < 90) {
            this.field3067 = -5;
        }
        field3058++;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
    public final void method1214(int arg0) {
        field3053++;
        int var2 = 84 % ((14 - arg0) / 57);
        if (this.field3071 > 0) {
            this.field3065.method2589((byte) 100, this.method1206(94), this.field3071);
            this.field3071 = 0;
        }
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lbl;IIIZ)V")
    public class194(class442 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3062 = arg3;
        this.field3066 = arg1;
        this.field3067 = arg2;
        this.field3059 = arg4;
        this.field3065 = arg0;
        OpenGL.glGenTextures(1, class261.field3956, 0);
        this.field3071 = class261.field3956[0];
        this.method1204(true, 0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public abstract void method1111(byte arg0);
}
