import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class22 extends class209 {

    @OriginalMember(owner = "client!fo", name = "n", descriptor = "Z")
    private boolean field313 = false;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "Lcn;")
    private class21 field315;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!fo", name = "k", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!fo", name = "l", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!fo", name = "m", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Lm;")
    public static class105 field308;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lea;IZ)V")
    public final void method44(class148 arg0, int arg1, boolean arg2) {
        super.field2710.method1884(arg0, -2);
        ++field311;
        if (!arg2) {
            this.method44((class148) null, -127, false);
        }
        super.field2710.method1909(-89, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZB)V")
    public final void method47(boolean arg0, byte arg1) {
        ++field314;
        if (arg1 < 88) {
            method126((File) null, false);
        }
        class415 var3 = super.field2710.method1929((byte) -43);
        if (this.field315 != null && var3 != null && arg0) {
            this.field315.method118('\u0000', 0);
            super.field2710.method1966(3000, 1);
            super.field2710.method1884(var3, -2);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field2710.field4307.method2417(127), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field2710.method1966(3000, 0);
            this.field313 = true;
        } else {
            super.field2710.method1947(34162, 34168, 0, 770);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Ljava/lang/String;")
    public static final String method124(int arg0, int arg1) {
        if (arg1 != 8448) {
            field308 = null;
        }
        ++field316;
        return (255 & arg0 >> 24) + "." + ((arg0 & 16744058) >> 16) + "." + ((65527 & arg0) >> 8) + "." + (arg0 & 255);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
    public final void method45(int arg0, int arg1, int arg2) {
        if (arg2 < -75) {
            ++field312;
        }
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
    public final void method43(int arg0) {
        if (arg0 != -1) {
            this.field315 = null;
        }
        ++field317;
        if (this.field313) {
            this.field315.method118('\u0001', 0);
            super.field2710.method1966(3000, 1);
            super.field2710.method1884((class148) null, -2);
            super.field2710.method1966(3000, 0);
        } else {
            super.field2710.method1947(34162, 5890, 0, 770);
        }
        super.field2710.method1887(-87, 8448, 8448);
        this.field313 = false;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(ZB)V")
    public final void method48(boolean arg0, byte arg1) {
        ++field307;
        super.field2710.method1887(83, 8448, 7681);
        if (arg1 < 122) {
            method127(false);
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Luq;)V")
    public class22(class313 arg0) {
        super(arg0);
        if (arg0.field4245) {
            this.field315 = new class21(arg0, 2);
            this.field315.method120((byte) 62, 0);
            super.field2710.method1966(3000, 1);
            super.field2710.method1887(-68, 34165, 7681);
            super.field2710.method1933(-97, 770, 2, 34168);
            super.field2710.method1947(34162, 34167, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field2710.method1966(3000, 0);
            this.field315.method123(4864);
            this.field315.method120((byte) -124, 1);
            super.field2710.method1966(3000, 1);
            super.field2710.method1887(-90, 8448, 8448);
            super.field2710.method1933(-103, 770, 2, 34166);
            super.field2710.method1947(34162, 5890, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field2710.method1966(3000, 0);
            this.field315.method123(4864);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method125(int arg0, String arg1) {
        ++field318;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (~var2 > ~var3 && class38.method223(2, arg1.charAt(var2))) {
                ++var2;
            }
            while (~var3 < ~var2 && class38.method223(2, arg1.charAt(var3 + -1))) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && ~var4 >= -13) {
                if (arg0 <= 21) {
                    field308 = null;
                }
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; ~var3 < ~var6; ++var6) {
                    char var7 = arg1.charAt(var6);
                    if (class98.method544(true, var7)) {
                        char var8 = class92.method506(255, var7);
                        if (~var8 != -1) {
                            var5.append(var8);
                        }
                    }
                }
                if (~var5.length() == -1) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)Z")
    public final boolean method42(boolean arg0) {
        if (!arg0) {
            this.method48(true, (byte) -9);
        }
        ++field310;
        return true;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Ljava/io/File;Z)[B")
    public static final byte[] method126(File arg0, boolean arg1) {
        ++field309;
        if (!arg1) {
            field308 = null;
        }
        return class224.method1428(arg0, (int) arg0.length(), -26007);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)V")
    public static void method127(boolean arg0) {
        field308 = null;
        if (arg0) {
            field308 = null;
        }
    }
}
