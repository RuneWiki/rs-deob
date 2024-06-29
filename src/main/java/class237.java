import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class237 extends class650 {

    @OriginalMember(owner = "client!to", name = "x", descriptor = "Llea;")
    private class573 field3434;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "Loh;")
    private class653 field3424;

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Lin;")
    public static class380 field3425 = new class380(122, -2);

    @OriginalMember(owner = "client!to", name = "u", descriptor = "[I")
    public static int[] field3431 = new int[1];

    @OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
    public static int[] field3427 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!to", name = "z", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field3433;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(B)V", line = 4)
    public static void method1599(byte arg0) {
        field3425 = null;
        field3431 = null;
        field3427 = null;
        if (arg0 != -60) {
            method1601(false, 123, -92);
        }
        field3433 = null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Loh;Loh;IF)Z", line = 18)
    public final boolean method1600(class653 arg0, class653 arg1, int arg2, float arg3) {
        field3428++;
        boolean var5 = true;
        class727 var6 = this.field3434.field8244;
        this.field3434.method422(class160.field2476);
        this.field3434.method512();
        this.field3434.method3340((byte) 10);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3424.field9240, this.field3424.field9240);
        this.field3434.method3326((byte) -84, false);
        this.field3434.method3385(false, -8);
        this.field3434.method3387(false, 125);
        this.field3434.method3377(-32, false);
        this.field3434.method3364(0, -2);
        this.field3434.method3321(1, -19587);
        this.field3434.method3361(0.0F, 0.0F, arg3, (byte) -36, 0.0F);
        this.field3434.method3359(34165, 34165, true);
        this.field3434.method3384(arg1, (byte) 127);
        this.field3434.method3321(0, -19587);
        this.field3434.method3375(1, (byte) 102);
        this.field3434.method3384(arg0, (byte) 54);
        this.field3434.method3307(var6, arg2 ^ 0x78BC);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method4040(this.field3424, 16, 0, var8);
            var6.method4031(arg2 ^ 0x6, 0);
            if (!var6.method4032(0)) {
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
        var6.method4036(1, 0);
        this.field3434.method3372((byte) -94, var6);
        this.field3434.method3321(arg2, -19587);
        this.field3434.method3384(null, (byte) 115);
        this.field3434.method3359(8448, 8448, true);
        this.field3434.method3321(0, -19587);
        this.field3434.method3384(null, (byte) 118);
        OpenGL.glPopAttrib();
        this.field3434.method488(class160.field2476[0], class160.field2476[1], class160.field2476[2], class160.field2476[3]);
        if (var5 && !this.field3434.field8212) {
            this.field3424.method2274(false);
        }
        return var5;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZII)Z", line = 215)
    public static final boolean method1601(boolean arg0, int arg1, int arg2) {
        field3430++;
        if (arg0) {
            return (arg1 & 0x40000) != 0 | class350.method2125((byte) 17, arg2, arg1) || class484.method2854(arg2, -20, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)V", line = 234)
    public static final void method1602(int arg0) {
        field3435++;
        if (arg0 != -1717750587) {
            field3427 = null;
        }
        if (class613.field8700 == null) {
            class775 var1 = new class775();
            byte[] var2 = var1.method4273(16, 128, 128, (byte) 43);
            class613.field8700 = class381.method2301(var2, false, false);
        }
        if (class69.field1119 == null) {
            class528 var3 = new class528();
            byte[] var4 = var3.method3089(128, (byte) -100, 16, 128);
            class69.field1119 = class381.method2301(var4, false, false);
        }
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Llea;I)V", line = 269)
    public class237(class573 arg0, int arg1) {
        this.field3434 = arg0;
        this.field3424 = new class653(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I", line = 279)
    public final int method1603(boolean arg0) {
        if (arg0) {
            field3433 = null;
        }
        field3436++;
        return this.field3424.field9240;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V", line = 290)
    public static final void method1604(byte arg0) {
        if (class247.field3547 == null) {
            class247.field3547 = class346.method2114(-17407);
            class40.field464 = class247.field3547[0];
            class477.field6521 = class337.method2062(false);
        }
        field3429++;
        int var1 = 89 / ((arg0 + 70) / 41);
        if (class138.field2289 == null) {
            class355.method2145(0);
        }
        class346 var2 = class40.field464;
        int var3 = class158.method1218(8);
        if (class40.field464 == var2) {
            class94.field1349 = class40.field464.field4908.method3281(class423.field5892, -1);
            if (class40.field464.field4901) {
                class578.field8330 = (class40.field464.field4902 - class40.field464.field4903) * var3 / 100 + class40.field464.field4903;
            }
            if (class40.field464.field4900) {
                class94.field1349 = class94.field1349 + class578.field8330 + "%";
            }
        } else if (class40.field464 == class346.field4928) {
            class138.field2289 = null;
            class75.method690(true, 3);
        } else {
            class94.field1349 = var2.field4899.method3281(class423.field5892, -1);
            class578.field8330 = var2.field4902;
            if (class40.field464.field4900) {
                class94.field1349 = class94.field1349 + var2.field4902 + "%";
            }
            if (class40.field464.field4901 || var2.field4901) {
                class477.field6521 = class337.method2062(false);
            }
        }
        if (class138.field2289 == null) {
            return;
        }
        class138.field2289.method2702(class94.field1349, (byte) -53, class578.field8330, class477.field6521, class40.field464);
        if (class223.field3276 == null) {
            return;
        }
        for (int var4 = class341.field4854 + 1; var4 < class223.field3276.length; var4++) {
            if (class223.field3276[var4].method733(false) >= 100 && var4 - 1 == class341.field4854 && class141.field2306 >= 1 && class138.field2289.method2704(0)) {
                try {
                    class223.field3276[var4].method738(23978);
                } catch (Exception var5) {
                    class223.field3276 = null;
                    return;
                }
                class138.field2289.method2710(class223.field3276[var4], 2048);
                class341.field4854++;
                if (class341.field4854 >= class223.field3276.length - 1 && class223.field3276.length > 1) {
                    class341.field4854 = class514.field7083.method2590((byte) 72) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)Loh;", line = 387)
    public final class653 method677(int arg0) {
        field3432++;
        return arg0 == 0 ? this.field3424 : null;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIB)I", line = 401)
    public static final int method1605(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > 0) {
            return -103;
        }
        field3426++;
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        return (arg0 >> 5 << 7) + (((arg2 >> 2 & 0x3F) << 10) + (arg1 >> 1));
    }
}
