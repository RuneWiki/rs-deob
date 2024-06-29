import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class429 {

    @OriginalMember(owner = "client!us", name = "m", descriptor = "Llf;")
    private class250 field4;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "Liv;")
    private class107 field5;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)Liv;")
    public final class107 method1(int arg0) {
        field3++;
        if (arg0 != 25155) {
            this.method3(null, 18, null, -0.4967389F);
        }
        return this.field5;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)I")
    public final int method2(boolean arg0) {
        if (arg0) {
            return 109;
        } else {
            field1++;
            return this.field5.field1502;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Liv;ILiv;F)Z")
    public final boolean method3(class107 arg0, int arg1, class107 arg2, float arg3) {
        field8++;
        boolean var5 = true;
        class82 var6 = this.field4.field3628;
        this.field4.method467(class613.field8293);
        this.field4.method526();
        this.field4.method1575((byte) -100);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field5.field1502, this.field5.field1502);
        this.field4.method1570((byte) 64, false);
        this.field4.method1639(false, -8);
        this.field4.method1593((byte) 29, false);
        this.field4.method1572(false, false);
        this.field4.method1580((byte) -52, -2);
        if (arg1 > -7) {
            this.method2(true);
        }
        this.field4.method1631(1, 86);
        this.field4.method1627(21315, 0.0F, 0.0F, arg3, 0.0F);
        this.field4.method1630(34165, 34165, 115);
        this.field4.method1595((byte) 86, arg0);
        this.field4.method1631(0, 54);
        this.field4.method1601(25456, 1);
        this.field4.method1595((byte) 85, arg2);
        this.field4.method1594(var6, (byte) -123);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method658(this.field5, (byte) -78, 0, var8);
            var6.method669(true, 0);
            if (!var6.method670(true)) {
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
        var6.method661((byte) 12, 0);
        this.field4.method1567(var6, -115);
        this.field4.method1631(1, -69);
        this.field4.method1595((byte) 75, null);
        this.field4.method1630(8448, 8448, 101);
        this.field4.method1631(0, -107);
        this.field4.method1595((byte) 78, null);
        OpenGL.glPopAttrib();
        this.field4.method453(class613.field8293[0], class613.field8293[1], class613.field8293[2], class613.field8293[3]);
        if (var5 && !this.field4.field3647) {
            this.field5.method1343(0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I[B)V")
    public static final void method4(int arg0, byte[] arg1) {
        field7++;
        class254 var2 = new class254(arg1);
        boolean var3 = false;
        while (true) {
            while (true) {
                int var4 = var2.method1731((byte) 64);
                if (var4 == 0) {
                    if (!var3) {
                        if (class365.field5267 == null) {
                            class7.field49 = 4;
                            class148.field1992 = new int[4];
                            class365.field5267 = new int[4];
                        }
                        for (int var5 = 0; var5 < class365.field5267.length; var5++) {
                            class365.field5267[var5] = 0;
                            class148.field1992[var5] = var5 * 20;
                        }
                    }
                    if (arg0 > -8) {
                        field2 = 25;
                        return;
                    }
                    return;
                }
                if (var4 == 1) {
                    if (class365.field5267 == null) {
                        class365.field5267 = new int[4];
                        class7.field49 = 4;
                        class148.field1992 = new int[4];
                    }
                    for (int var6 = 0; var6 < class365.field5267.length; var6++) {
                        class365.field5267[var6] = var2.method1695(423951304);
                        class148.field1992[var6] = var2.method1695(423951304);
                    }
                    var3 = true;
                } else if (var4 == 2) {
                    class171.field2237 = var2.method1728((byte) 40);
                } else if (var4 == 3) {
                    class7.field49 = var2.method1731((byte) 64);
                    class148.field1992 = new int[class7.field49];
                    class365.field5267 = new int[class7.field49];
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)Z")
    public static final boolean method5(int arg0) {
        if (arg0 != -9112) {
            method5(23);
        }
        field6++;
        return class269.field3929 > 0;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Llf;I)V")
    public class1(class250 arg0, int arg1) {
        this.field4 = arg0;
        this.field5 = new class107(arg0, 6408, arg1);
    }
}
