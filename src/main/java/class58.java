import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class58 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    private int field678 = 0;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    private int field681 = 0;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    private int field684 = 1;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
    private int field689 = 1;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lar;")
    private class479 field679 = new class479();

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "[Lml;")
    private class264[] field698 = new class264[2];

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "Z")
    private boolean field696 = true;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
    private int field697 = -1;

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Z")
    private boolean field702 = false;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
    private int field700 = 0;

    @OriginalMember(owner = "client!rf", name = "G", descriptor = "Z")
    private boolean field707 = true;

    @OriginalMember(owner = "client!rf", name = "H", descriptor = "Z")
    private boolean field708 = true;

    @OriginalMember(owner = "client!rf", name = "E", descriptor = "Z")
    private boolean field705 = true;

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "Lef;")
    private class338 field687;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Lje;")
    private class276 field685;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "Lje;")
    private class276 field693;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "Lje;")
    private class276 field683;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Z")
    public static boolean field691 = false;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "Lwj;")
    public static class270 field675 = new class270(39, 10);

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "Lwj;")
    public static class270 field694 = new class270(64, 14);

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "Lqp;")
    public static class466 field704 = new class466("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!rf", name = "I", descriptor = "Lqp;")
    public static class466 field709 = new class466("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!rf", name = "J", descriptor = "Lol;")
    public static class187 field710 = new class187("", 13);

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "J")
    public static long field712 = -1L;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field680;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!rf", name = "K", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Lml;")
    private class264 field701;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lsf;")
    private class362 field703;

    @OriginalMember(owner = "client!rf", name = "F", descriptor = "Lsf;")
    private class362 field706;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Z")
    private boolean field677;

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "[I")
    public static int[] field699;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method472(int arg0) {
        field690++;
        if (!this.field677) {
            return;
        }
        if (this.field683 != null) {
            int var2 = 16384;
            this.field687.method1952(false, this.field683);
            this.field687.method1983(this.field685, -126);
            this.field683.method1647(19433, 0);
            this.field685.method1635(false, 0);
            if (this.field702) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field684, this.field689, 0, 0, this.field684, this.field689, var2, 9728);
            this.field687.method1994(5890, this.field683);
            this.field687.method2001(116, this.field685);
        }
        this.field687.method1934(-3);
        this.field687.method1976(-105, 0);
        this.field687.method1974(1, 4609);
        this.field687.method260();
        int var3 = 0;
        int var4 = arg0;
        class126 var6;
        for (class126 var5 = (class126) this.field679.method2818((byte) 12); var5 != null; var5 = var6) {
            var6 = (class126) this.field679.method2820((byte) -58);
            int var7 = var5.method869((byte) -114);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method879(var8, this.field701, 0, this.field698[var3]);
                if (var6 == null && (var7 - 1) == var8) {
                    this.field687.method2009(this.field685, 0);
                    this.field687.method1984(0, 82, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field689);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field678, this.field681);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field678, this.field681 + this.field689);
                    OpenGL.glTexCoord2f((float) this.field684, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field678 + this.field684, this.field689 + this.field681);
                    OpenGL.glTexCoord2f((float) this.field684, (float) this.field689);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field678 + this.field684, this.field681);
                    OpenGL.glEnd();
                } else {
                    this.field685.method1635(false, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field689);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field689);
                    OpenGL.glTexCoord2f((float) this.field684, (float) this.field689);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field684, this.field689);
                    OpenGL.glTexCoord2f((float) this.field684, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field684, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method875(var8, false);
            }
        }
        this.field677 = false;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    private final void method473(byte arg0) {
        field686++;
        boolean var2 = false;
        if (arg0 != -9) {
            field711 = 53;
        }
        int var3 = 0;
        int var4 = 0;
        for (class126 var5 = (class126) this.field679.method2818((byte) 106); var5 != null; var5 = (class126) this.field679.method2820((byte) -58)) {
            int var9 = var5.method874((byte) 80);
            var4 += var5.method869((byte) -112);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method878(arg0 + 9);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field697 != var6) {
            this.field708 = true;
            this.field697 = var6;
        }
        int var7 = this.field700 > 2 ? 2 : this.field700;
        int var8 = var4 > 2 ? 2 : var4;
        this.field700 = var4;
        if (var7 != var8) {
            this.field705 = this.field708 = true;
        }
        if (var2 != this.field702) {
            this.field696 = true;
            this.field702 = var2;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lkk;I)V")
    public final void method474(class126 arg0, int arg1) {
        field692++;
        arg0.field1877 = false;
        arg0.method872(112);
        if (arg1 == 1) {
            arg0.method1565(0);
            this.method473((byte) -9);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBI)Z")
    public final boolean method475(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 <= 124) {
            this.method476(-39);
        }
        field676++;
        if (this.field693 == null || this.field679.method2807(112)) {
            return false;
        }
        if (this.field684 != arg2 || this.field689 != arg4) {
            this.field684 = arg2;
            this.field689 = arg4;
            for (class260 var6 = this.field679.method2818((byte) 4); var6 != this.field679.field6997; var6 = var6.field3612) {
                ((class126) var6).method876(this.field689, this.field684, 121);
            }
            this.field696 = true;
            this.field708 = true;
            this.field705 = true;
        }
        if (!this.method478((byte) -122)) {
            return false;
        }
        this.field677 = true;
        this.field678 = arg0;
        this.field681 = arg1;
        this.field687.method1939(this.field693, (byte) 119);
        this.field693.method1635(false, 0);
        this.field687.method1984(-this.field678, 81, this.field689 - this.field693.method1640(23756) - this.field681);
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z")
    public final boolean method476(int arg0) {
        field688++;
        if (arg0 != 0) {
            this.method472(49);
        }
        return this.field693 != null;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public final void method477(int arg0) {
        this.field693 = this.field683 = this.field685 = null;
        this.field698 = null;
        this.field703 = null;
        this.field706 = null;
        this.field701 = null;
        field682++;
        int var2 = 23 / ((arg0 + 25) / 37);
        if (!this.field679.method2807(109)) {
            for (class260 var3 = this.field679.method2818((byte) 107); var3 != this.field679.field6997; var3 = var3.field3612) {
                ((class126) var3).method872(27);
            }
        }
        this.field684 = this.field689 = 1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z")
    private final boolean method478(byte arg0) {
        field695++;
        if (this.field696) {
            if (this.field703 != null) {
                this.field703.method2184(2);
                this.field703 = null;
            }
            if (this.field701 != null) {
                this.field701.method341(-7733);
                this.field701 = null;
            }
            if (this.field683 != null) {
                this.field703 = new class362(this.field687, 6402, this.field684, this.field689, this.field687.field4737);
            }
            if (this.field702) {
                this.field701 = new class264(this.field687, 34037, 6402, this.field684, this.field689);
            } else if (this.field703 == null) {
                this.field703 = new class362(this.field687, 6402, this.field684, this.field689);
            }
            this.field696 = false;
            this.field705 = true;
            this.field707 = true;
        }
        if (this.field708) {
            if (this.field706 != null) {
                this.field706.method2184(2);
                this.field706 = null;
            }
            if (this.field698[0] != null) {
                this.field698[0].method341(-7733);
                this.field698[0] = null;
            }
            if (this.field698[1] != null) {
                this.field698[1].method341(-7733);
                this.field698[1] = null;
            }
            if (this.field683 != null) {
                this.field706 = new class362(this.field687, this.field697, this.field684, this.field689, this.field687.field4737);
            }
            this.field698[0] = new class264(this.field687, 34037, this.field697, this.field684, this.field689);
            this.field698[1] = this.field700 > 1 ? new class264(this.field687, 34037, this.field697, this.field684, this.field689) : null;
            this.field705 = true;
            this.field708 = false;
            this.field707 = true;
        }
        int var2 = 73 / ((30 - arg0) / 57);
        if (this.field705) {
            if (this.field683 == null) {
                this.field687.method1939(this.field685, (byte) 93);
                this.field685.method1637(76, 0);
                this.field685.method1637(70, 1);
                this.field685.method1637(91, 8);
                this.field685.method1649(0, (byte) 17, this.field698[0]);
                if (this.field700 > 1) {
                    this.field685.method1649(1, (byte) 17, this.field698[1]);
                }
                if (this.field702) {
                    this.field685.method1649(8, (byte) 17, this.field701);
                } else {
                    this.field685.method1636(8, 20374, this.field703);
                }
                this.field687.method2009(this.field685, 0);
            } else {
                this.field687.method1939(this.field685, (byte) 115);
                this.field685.method1637(95, 0);
                this.field685.method1637(26, 1);
                this.field685.method1637(44, 8);
                this.field685.method1649(0, (byte) 17, this.field698[0]);
                if (this.field700 > 1) {
                    this.field685.method1649(1, (byte) 17, this.field698[1]);
                }
                if (this.field702) {
                    this.field685.method1649(8, (byte) 17, this.field701);
                }
                this.field687.method2009(this.field685, 0);
                this.field687.method1939(this.field683, (byte) 122);
                this.field683.method1637(28, 0);
                this.field683.method1637(124, 8);
                this.field683.method1636(0, 20374, this.field706);
                this.field683.method1636(8, 20374, this.field703);
                this.field687.method2009(this.field683, 0);
            }
            this.field707 = true;
            this.field705 = false;
        }
        if (this.field707) {
            this.field687.method1939(this.field693, (byte) 120);
            this.field707 = !this.field693.method1631(36053);
            this.field687.method2009(this.field693, 0);
        }
        return !this.field707;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lkk;Z)Z")
    public final boolean method479(class126 arg0, boolean arg1) {
        field680++;
        if (arg1) {
            this.method472(-22);
        }
        if (this.field693 != null) {
            if (arg0.method873(127) || arg0.method867((byte) 81)) {
                this.field679.method2809(arg0, 2);
                this.method473((byte) -9);
                if (this.method478((byte) -91)) {
                    if (this.field684 != -1 && this.field689 != -1) {
                        arg0.method876(this.field689, this.field684, 61);
                    }
                    arg0.field1877 = true;
                    return true;
                }
            }
            this.method474(arg0, 1);
        }
        return false;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    public static void method480(int arg0) {
        field709 = null;
        if (arg0 != 0) {
            field711 = -117;
        }
        field710 = null;
        field704 = null;
        field694 = null;
        field699 = null;
        field675 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lef;)V")
    public class58(class338 arg0) {
        this.field687 = arg0;
        if (this.field687.field4798 && this.field687.field4842) {
            this.field693 = this.field685 = new class276(this.field687);
            if (this.field687.field4737 > 1 && this.field687.field4775 && this.field687.field4830) {
                this.field693 = this.field683 = new class276(this.field687);
                return;
            }
        }
    }
}
