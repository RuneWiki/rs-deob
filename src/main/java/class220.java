import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class220 extends class11 {

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Z")
    private boolean field3008 = false;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Lub;")
    private class19 field3006;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "Z")
    public static boolean field3004 = false;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "J")
    public static long field3007 = 0L;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field3015 = 0;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)V")
    public final void method64(boolean arg0, boolean arg1) {
        if (!arg0) {
            method1435(-92, (String) null);
        }
        super.field95.method2320(7681, 8448, 0);
        ++field3012;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method1435(int arg0, String arg1) {
        ++field3005;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; ~var2 < ~var4; ++var4) {
            char var8 = arg1.charAt(var4);
            if (~var8 == -61 || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        if (arg0 != 828) {
            return null;
        } else {
            for (int var6 = 0; ~var2 < ~var6; ++var6) {
                char var7 = arg1.charAt(var6);
                if (var7 == '<') {
                    var5.append("<lt>");
                } else if (var7 != '>') {
                    var5.append(var7);
                } else {
                    var5.append("<gt>");
                }
            }
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIB)V")
    public final void method62(int arg0, int arg1, byte arg2) {
        ++field3009;
        if (arg2 < 124) {
            this.field3008 = true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lad;)V")
    public class220(class362 arg0) {
        super(arg0);
        if (arg0.field5391) {
            this.field3006 = new class19(arg0, 2);
            this.field3006.method121((byte) -18, 0);
            super.field95.method2269((byte) 100, 1);
            super.field95.method2320(7681, 34165, 0);
            super.field95.method2291(34168, 2, 770, (byte) -35);
            super.field95.method2333(770, 34167, 0, (byte) 91);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field95.method2269((byte) -113, 0);
            this.field3006.method124(7);
            this.field3006.method121((byte) -18, 1);
            super.field95.method2269((byte) -110, 1);
            super.field95.method2320(8448, 8448, 0);
            super.field95.method2291(34166, 2, 770, (byte) -35);
            super.field95.method2333(770, 5890, 0, (byte) 92);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field95.method2269((byte) 93, 0);
            this.field3006.method124(7);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)V")
    public final void method67(int arg0, boolean arg1) {
        ++field3014;
        if (arg0 > 115) {
            class158 var3 = super.field95.method2336(11011);
            if (this.field3006 != null && var3 != null && arg1) {
                this.field3006.method122('\u0000', (byte) 66);
                super.field95.method2269((byte) 112, 1);
                super.field95.method2295(-124, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field95.field5430.method2009(0), 0);
                OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
                OpenGL.glMatrixMode(5888);
                super.field95.method2269((byte) 127, 0);
                this.field3008 = true;
            } else {
                super.field95.method2333(770, 34168, 0, (byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILpm;)V")
    public final void method65(int arg0, int arg1, class507 arg2) {
        super.field95.method2295(arg1 + -79, arg2);
        ++field3011;
        super.field95.method2288(arg0, 7681);
        if (arg1 != -1) {
            this.method63(-98);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public final void method63(int arg0) {
        ++field3013;
        if (this.field3008) {
            this.field3006.method122('\u0001', (byte) 99);
            super.field95.method2269((byte) -4, 1);
            super.field95.method2295(-103, (class507) null);
            super.field95.method2269((byte) -112, 0);
        } else {
            super.field95.method2333(770, 5890, 0, (byte) 77);
        }
        super.field95.method2320(8448, 8448, 0);
        this.field3008 = false;
        int var2 = -1 % ((arg0 - -61) / 40);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        ++field3010;
        if (arg0 != 95) {
            this.method63(77);
        }
        return true;
    }
}
