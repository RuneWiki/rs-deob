import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class137 extends class159 {

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Lcd;")
    private class23 field1951;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "Lhq;")
    private class367 field1944;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Luu;")
    public static class237 field1945;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "[[[Lve;")
    public static class262[][][] field1948;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lwu;II)V", line = 4)
    public final void method368(class559 arg0, int arg1, int arg2) {
        super.field2221.method3681(arg0, 0);
        if (arg1 != 26264) {
            method909(84, -37, (String) null);
        }
        ++field1949;
        super.field2221.method3720(-26014, arg2);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 16)
    public final void method369(byte arg0) {
        if (arg0 >= -59) {
            method909(-62, -104, (String) null);
        }
        this.field1944.method2315(true, '\u0001');
        ++field1952;
        super.field2221.method3738((byte) -63, 1);
        super.field2221.method3681((class559) null, 0);
        super.field2221.method3738((byte) -63, 0);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 31)
    public static void method908(int arg0) {
        field1945 = null;
        if (arg0 != 0) {
            field1948 = null;
        }
        field1948 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZII)V", line = 42)
    public final void method367(boolean arg0, int arg1, int arg2) {
        ++field1953;
        float var4 = (float) ((arg1 & 3) + 1) * -5.0E-4F;
        float var5 = (float) (((27 & arg1) >> 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (!arg0) {
            method908(93);
        }
        super.field2221.method3738((byte) -63, 1);
        boolean var7 = (arg1 & 128) != 0;
        if (!var7) {
            class571.field7885[3] = 0.0F;
            class571.field7885[2] = var6;
            class571.field7885[0] = 0.0F;
            class571.field7885[1] = 0.0F;
        } else {
            class571.field7885[1] = 0.0F;
            class571.field7885[0] = var6;
            class571.field7885[2] = 0.0F;
            class571.field7885[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class571.field7885, 0);
        class571.field7885[1] = var6;
        class571.field7885[2] = 0.0F;
        class571.field7885[3] = (float) super.field2221.field9008 * var4 % 1.0F;
        class571.field7885[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class571.field7885, 0);
        if (this.field1951.field284) {
            class571.field7885[1] = 0.0F;
            class571.field7885[0] = 0.0F;
            class571.field7885[2] = 0.0F;
            class571.field7885[3] = (float) super.field2221.field9008 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class571.field7885, 0);
        } else {
            int var8 = (int) ((float) super.field2221.field9008 * var5 * 16.0F);
            super.field2221.method3681(this.field1951.field279[var8 % 16], 0);
        }
        super.field2221.method3738((byte) -63, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZ)V", line = 98)
    public final void method370(byte arg0, boolean arg1) {
        if (arg0 < 88) {
            method909(-34, 31, (String) null);
        }
        ++field1955;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILjava/lang/String;)Z", line = 117)
    public static final boolean method909(int arg0, int arg1, String arg2) {
        ++field1954;
        if (class159.field2227.field1936) {
            class416.field5882 = new class467();
            class416.field5882.field6485 = arg2;
            class416.field5882.field6484 = arg1;
            if (class341.field4815 != class172.field2390) {
                class416.field5882.field6489 = class416.field5882.field6484 + 40000;
                class416.field5882.field6483 = 50000 - -class416.field5882.field6484;
            }
            for (int var3 = 0; ~class462.field6425.length < ~var3; ++var3) {
                if (~class462.field6425[var3].field5222 == ~arg1) {
                    class497.field6953 = class462.field6425[var3].field6044;
                }
            }
            return true;
        } else {
            String var4 = "";
            if (class341.field4815 != class172.field2390) {
                var4 = ":" + (arg1 - -7000);
            }
            String var5 = "";
            if (class237.field3514 != null) {
                var5 = "/p=" + class237.field3514;
            }
            String var6 = "http://" + arg2 + var4 + "/l=" + class120.field1576 + "/a=" + class593.field8043 + var5 + "/j" + (class258.field3740 ? "1" : "0") + ",o" + (class199.field2663 ? "1" : "0") + ",a2";
            if (arg0 != -7000) {
                field1948 = null;
            }
            try {
                class516.field7210.getAppletContext().showDocument(new URL(var6), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZB)V", line = 172)
    public final void method373(boolean arg0, byte arg1) {
        ++field1947;
        if (arg1 <= -109) {
            this.field1944.method2315(true, '\u0000');
            if (this.field1951.field284) {
                super.field2221.method3738((byte) -63, 1);
                super.field2221.method3681(this.field1951.field281, 0);
                super.field2221.method3738((byte) -63, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)Z", line = 191)
    public final boolean method372(boolean arg0) {
        if (!arg0) {
            method909(-86, 54, (String) null);
        }
        ++field1946;
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V", line = 203)
    public static final void method910(int arg0, int arg1) {
        ++field1950;
        class746.method4152(arg0 ^ -63);
        int var2 = class131.field1846.method525(true, arg1).field8739;
        if (~var2 != arg0) {
            int var3 = class124.field1712.field8648[arg1];
            if (~var2 == -6) {
                class559.field7775 = var3;
            }
            if (var2 == 6) {
                class77.field1124 = var3;
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ldw;Lcd;)V", line = 225)
    public class137(class664 arg0, class23 arg1) {
        super(arg0);
        this.field1951 = arg1;
        this.field1944 = new class367(arg0, 2);
        this.field1944.method2311(true, 0);
        super.field2221.method3738((byte) -63, 1);
        if (this.field1951.field284) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field2221.method3738((byte) -63, 0);
        this.field1944.method2314((byte) -101);
        this.field1944.method2311(true, 1);
        super.field2221.method3738((byte) -63, 1);
        if (this.field1951.field284) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field2221.method3738((byte) -63, 0);
        this.field1944.method2314((byte) -98);
    }
}
