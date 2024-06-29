import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class522 extends class208 {

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lmh;")
    private class537 field7328;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lkh;")
    private class15 field7326;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "[I")
    public static int[] field7327;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
    public final int method2970(byte arg0) {
        if (arg0 <= 8) {
            field7327 = null;
        }
        field7324++;
        return this.field7326.field117;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lkh;")
    public final class15 method1201(byte arg0) {
        field7329++;
        return arg0 == 51 ? this.field7326 : null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static void method2971(boolean arg0) {
        if (arg0) {
            method2973(true, null);
        }
        field7327 = null;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lmh;I)V")
    public class522(class537 arg0, int arg1) {
        this.field7328 = arg0;
        this.field7326 = new class15(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(FBLkh;Lkh;)Z")
    public final boolean method2972(float arg0, byte arg1, class15 arg2, class15 arg3) {
        field7325++;
        boolean var5 = true;
        class88 var6 = this.field7328.field7836;
        this.field7328.method1183(class60.field585);
        this.field7328.method1182();
        this.field7328.method3079((byte) 79);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field7326.field117, this.field7326.field117);
        this.field7328.method3103((byte) -55, false);
        this.field7328.method3106(true, false);
        this.field7328.method3074((byte) -127, false);
        this.field7328.method3101(false, 8);
        this.field7328.method3071(60, -2);
        this.field7328.method3078(33984, 1);
        if (arg1 != 65) {
            return false;
        }
        this.field7328.method3129(8705, arg0, 0.0F, 0.0F, 0.0F);
        this.field7328.method3099(34165, 34165, arg1 - 57);
        this.field7328.method3083((byte) 78, arg2);
        this.field7328.method3078(33984, 0);
        this.field7328.method3063(1, (byte) -107);
        this.field7328.method3083((byte) 123, arg3);
        this.field7328.method3096(var6, arg1 - 192);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method527((byte) -123, 0, var8, this.field7326);
            var6.method519((byte) -62, 0);
            if (!var6.method522(arg1 ^ 0xFFFFFF99)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method512(0, (byte) -125);
        this.field7328.method3109((byte) -108, var6);
        this.field7328.method3078(33984, 1);
        this.field7328.method3083((byte) 73, null);
        this.field7328.method3099(8448, 8448, 8);
        this.field7328.method3078(arg1 ^ 0x8481, 0);
        this.field7328.method3083((byte) 93, null);
        OpenGL.glPopAttrib();
        this.field7328.method1107(class60.field585[0], class60.field585[1], class60.field585[2], class60.field585[3]);
        if (var5 && !this.field7328.field7814) {
            this.field7326.method1349(9987);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method2973(boolean arg0, String arg1) {
        if (arg0) {
            field7327 = null;
        }
        field7331++;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) - (var3 - ((long) arg1.charAt(var5)));
        }
        return var3;
    }

    static {
        new class180("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field7327 = new int[14];
    }
}
