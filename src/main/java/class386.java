import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public abstract class class386 implements class697 {

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "Z")
    private boolean field6006 = false;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "Ler;")
    public class92 field6003;

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
    public int field5990;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "Z")
    private boolean field5996;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    private int field5997;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
    public int field5988;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "I")
    public int field5993;

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "[I")
    public static int[] field5992 = new int[128];

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "Lcf;")
    public static class561 field5995;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "Lri;")
    public static class97 field6000;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(ZI)V")
    public final void method2507(boolean arg0, int arg1) {
        if (this.field5996 != arg0) {
            int var3 = this.method2517(false);
            this.field5996 = true;
            this.method2511(-12839);
            this.method2512(var3, 90);
        }
        if (arg1 != 9987) {
            this.field5990 = -38;
        }
        field6001++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)Z")
    public final boolean method2508(byte arg0) {
        field5991++;
        if (!this.field6003.field1472) {
            if (arg0 != -10) {
                this.method2508((byte) -75);
            }
            return false;
        }
        int var2 = this.method2517(false);
        this.field6003.method856(false, this);
        OpenGL.glGenerateMipmapEXT(this.field5990);
        this.field5996 = true;
        this.method2511(-12839);
        this.method2512(var2, 90);
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(ZI)V")
    public final void method2509(boolean arg0, int arg1) {
        if (this.field6006 != arg0) {
            this.field6006 = arg0;
            this.method2511(-12839);
        }
        if (arg1 > -45) {
            method2514((byte) -105, null);
        }
        field6004++;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)V")
    public static void method2510(int arg0) {
        field5995 = null;
        field6000 = null;
        field5992 = null;
        if (arg0 != 0) {
            field6000 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)V")
    private final void method2511(int arg0) {
        this.field6003.method856(false, this);
        field5987++;
        if (arg0 != -12839) {
            this.method2511(-70);
        }
        if (this.field6006) {
            OpenGL.glTexParameteri(this.field5990, 10241, this.field5996 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field5990, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field5990, 10241, this.field5996 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field5990, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(II)V")
    private final void method2512(int arg0, int arg1) {
        field6005++;
        this.field6003.field1346 -= arg0;
        if (arg1 == 90) {
            this.field6003.field1346 += this.method2517(false);
        }
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)V")
    public final void method2513(int arg0) {
        if (arg0 != -4) {
            this.field5990 = 89;
        }
        field6002++;
        if (this.field5993 > 0) {
            this.field6003.method849(this.method2517(false), 120, this.field5993);
            this.field5993 = 0;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(BLri;)V")
    public static final void method2514(byte arg0, class97 arg1) {
        class599.field8541 = 0;
        field5989++;
        if (arg0 < 113) {
            return;
        }
        class275.field4417 = 0;
        class364.field5737 = new class433();
        class582.field8278 = new class77[1024];
        class210.field3507 = new class536[class664.field9247[class165.field2779] + 1];
        class411.field6317 = 0;
        class582.field8279 = 0;
        class238.method1712(arg1, 97);
        class396.method2557(arg1, true);
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
    public static final void method2515(int arg0, int arg1) {
        class252 var2 = class454.field6818[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class252 var4 = class454.field6818[var3][arg0][arg1] = class454.field6818[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class531 var5 = var4.field4026; var5 != null; var5 = var5.field7736) {
                    class459 var6 = var5.field7739;
                    if (var6.field6865 == arg0 && var6.field6869 == arg1) {
                        var6.field9695--;
                    }
                }
                if (var4.field4025 != null) {
                    var4.field4025.field9695--;
                }
                if (var4.field4029 != null) {
                    var4.field4029.field9695--;
                }
                if (var4.field4019 != null) {
                    var4.field4019.field9695--;
                }
                if (var4.field4028 != null) {
                    var4.field4028.field9695--;
                }
                if (var4.field4023 != null) {
                    var4.field4023.field9695--;
                }
            }
        }
        if (class454.field6818[0][arg0][arg1] == null) {
            class454.field6818[0][arg0][arg1] = new class252(0);
            class454.field6818[0][arg0][arg1].field4035 = 1;
        }
        class454.field6818[0][arg0][arg1].field4030 = var2;
        class454.field6818[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ep", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method2513(-4);
        field5994++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)I")
    public final int method2516(byte arg0) {
        if (arg0 <= 113) {
            field5992 = null;
        }
        field5999++;
        return this.field5993;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)I")
    private final int method2517(boolean arg0) {
        if (arg0) {
            this.field6006 = true;
        }
        field5998++;
        int var2 = this.field6003.method886(46, this.field5988) * this.field5997;
        return this.field5996 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ler;IIIZ)V")
    public class386(class92 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field6003 = arg0;
        this.field5990 = arg1;
        this.field5996 = arg4;
        this.field5997 = arg3;
        this.field5988 = arg2;
        OpenGL.glGenTextures(1, class42.field589, 0);
        this.field5993 = class42.field589[0];
        this.method2512(0, 90);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public abstract void method667(int arg0);

    static {
        for (int var0 = 0; var0 < field5992.length; var0++) {
            field5992[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field5992[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field5992[var2] = var2 - 71;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field5992[var3] = var3 + 4;
        }
        field5992[45] = field5992[47] = 63;
        field5992[42] = field5992[43] = 62;
        field5995 = new class561();
    }
}
