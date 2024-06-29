import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class351 {

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
    private int field4729 = 0;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    private int field4743 = 0;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    private int field4733 = 1;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    private int field4745 = 1;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "Lwl;")
    private class280 field4744 = new class280();

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
    private int field4747 = -1;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    private int field4749 = 0;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "Z")
    private boolean field4752 = true;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "Z")
    private boolean field4751 = true;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "Z")
    private boolean field4753 = false;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "[Lwr;")
    private class316[] field4754 = new class316[2];

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "Z")
    private boolean field4750 = true;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "Z")
    private boolean field4757 = true;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "Lbo;")
    private class511 field4739;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Lqh;")
    private class48 field4727;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lqh;")
    private class48 field4735;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Lqh;")
    private class48 field4726;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!mq", name = "g", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!mq", name = "h", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "Lwr;")
    private class316 field4755;

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Lcj;")
    private class488 field4748;

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "Lcj;")
    private class488 field4756;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mq", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field4758;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
    private boolean field4725;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2050(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 48) {
            method2050(63, 35, 106, 35);
        }
        field4730++;
        class338 var4 = (class338) class234.method1453(arg2, arg0, arg1);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class473.method2711(var4, (byte) -127);
        }
        class338 var6 = (class338) class504.method2874(arg2, arg0, arg1, field4758 == null ? (field4758 = method2061("np")) : field4758);
        if (var6 != null) {
            var5 &= class473.method2711(var6, (byte) -22);
        }
        class338 var7 = (class338) class466.method2648(arg2, arg0, arg1);
        if (var7 != null) {
            var5 &= class473.method2711(var7, (byte) -112);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public final void method2051(int arg0) {
        this.field4735 = this.field4726 = this.field4727 = null;
        this.field4754 = null;
        this.field4748 = null;
        this.field4755 = null;
        if (arg0 != -23245) {
            this.field4748 = null;
        }
        field4737++;
        this.field4756 = null;
        if (!this.field4744.method1664((byte) -107)) {
            for (class42 var2 = this.field4744.method1672((byte) -113); var2 != this.field4744.field3684; var2 = var2.field619) {
                ((class343) var2).method651(-5254);
            }
        }
        this.field4733 = this.field4745 = 1;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILpi;)V")
    public final void method2052(int arg0, class343 arg1) {
        if (arg0 != 12259) {
            this.field4727 = null;
        }
        field4738++;
        arg1.field4535 = false;
        arg1.method651(-5254);
        arg1.method300(false);
        this.method2056(1);
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)Z")
    public final boolean method2053(int arg0) {
        if (arg0 != 8167) {
            this.field4739 = null;
        }
        field4732++;
        return this.field4735 != null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
    public static final void method2054(int arg0, int arg1) {
        class350.field4721 = arg0;
        if (arg1 != -1) {
            method2054(-78, 0);
        }
        field4734++;
        class236 var2 = class496.field6882;
        synchronized (class496.field6882) {
            class496.field6882.method1458((byte) -94);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public static final void method2055(boolean arg0) {
        class390.field5283 = new String[500];
        if (arg0) {
            method2054(72, 40);
        }
        class8.field209 = client.field2732.field5803 + client.field2732.field5800 + 2;
        field4746++;
        class321.field4208 = class173.field2525.field5803 + class173.field2525.field5800 + 2;
        for (int var1 = 0; var1 < class390.field5283.length; var1++) {
            class390.field5283[var1] = "";
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
    private final void method2056(int arg0) {
        field4736++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class343 var5 = (class343) this.field4744.method1672((byte) -92); var5 != null; var5 = (class343) this.field4744.method1668(arg0 ^ 0xFFFFFFFE)) {
            int var9 = var5.method643(true);
            if (var9 > var3) {
                var3 = var9;
            }
            var4 += var5.method1990(arg0 ^ 0xFFFFBEDF);
            var2 |= var5.method1992(119);
        }
        if (arg0 != 1) {
            this.method2056(-33);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field4747 != var6) {
            this.field4752 = true;
            this.field4747 = var6;
        }
        int var7 = this.field4749 <= 2 ? this.field4749 : 2;
        int var8 = var4 <= 2 ? var4 : 2;
        if (var7 != var8) {
            this.field4751 = this.field4752 = true;
        }
        if (this.field4753 != var2) {
            this.field4753 = var2;
            this.field4757 = true;
        }
        this.field4749 = var4;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(ILpi;)Z")
    public final boolean method2057(int arg0, class343 arg1) {
        field4731++;
        if (this.field4735 != null) {
            if (arg1.method645(-29012) || arg1.method649((byte) -125)) {
                this.field4744.method1666((byte) 102, arg1);
                this.method2056(arg0 + 2);
                if (this.method2058(0)) {
                    if (this.field4733 != -1 && this.field4745 != -1) {
                        arg1.method647(this.field4745, (byte) 100, this.field4733);
                    }
                    arg1.field4535 = true;
                    return true;
                }
            }
            this.method2052(12259, arg1);
        }
        if (arg0 != -1) {
            method2054(-32, 11);
        }
        return false;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Z")
    private final boolean method2058(int arg0) {
        if (this.field4757) {
            if (this.field4756 != null) {
                this.field4756.method2804(94);
                this.field4756 = null;
            }
            if (this.field4755 != null) {
                this.field4755.method2861(false);
                this.field4755 = null;
            }
            if (this.field4726 != null) {
                this.field4756 = new class488(this.field4739, 6402, this.field4733, this.field4745, this.field4739.field7390);
            }
            if (this.field4753) {
                this.field4755 = new class316(this.field4739, 34037, 6402, this.field4733, this.field4745);
            } else if (this.field4756 == null) {
                this.field4756 = new class488(this.field4739, 6402, this.field4733, this.field4745);
            }
            this.field4751 = true;
            this.field4757 = false;
            this.field4750 = true;
        }
        field4724++;
        if (arg0 != 0) {
            method2054(-29, 76);
        }
        if (this.field4752) {
            if (this.field4748 != null) {
                this.field4748.method2804(81);
                this.field4748 = null;
            }
            if (this.field4754[0] != null) {
                this.field4754[0].method2861(false);
                this.field4754[0] = null;
            }
            if (this.field4754[1] != null) {
                this.field4754[1].method2861(false);
                this.field4754[1] = null;
            }
            if (this.field4726 != null) {
                this.field4748 = new class488(this.field4739, this.field4747, this.field4733, this.field4745, this.field4739.field7390);
            }
            this.field4754[0] = new class316(this.field4739, 34037, this.field4747, this.field4733, this.field4745);
            this.field4754[1] = this.field4749 > 1 ? new class316(this.field4739, 34037, this.field4747, this.field4733, this.field4745) : null;
            this.field4752 = false;
            this.field4750 = true;
            this.field4751 = true;
        }
        if (this.field4751) {
            if (this.field4726 == null) {
                this.field4739.method2938(this.field4727, 10);
                this.field4727.method362(7553, 0);
                this.field4727.method362(arg0 + 7553, 1);
                this.field4727.method362(arg0 + 7553, 8);
                this.field4727.method363(true, 0, this.field4754[0]);
                if (this.field4749 > 1) {
                    this.field4727.method363(true, 1, this.field4754[1]);
                }
                if (this.field4753) {
                    this.field4727.method363(true, 8, this.field4755);
                } else {
                    this.field4727.method350((byte) -40, this.field4756, 8);
                }
                this.field4739.method2942(2, this.field4727);
            } else {
                this.field4739.method2938(this.field4727, arg0 ^ 0xA);
                this.field4727.method362(arg0 ^ 0x1D81, 0);
                this.field4727.method362(7553, 1);
                this.field4727.method362(7553, 8);
                this.field4727.method363(true, 0, this.field4754[0]);
                if (this.field4749 > 1) {
                    this.field4727.method363(true, 1, this.field4754[1]);
                }
                if (this.field4753) {
                    this.field4727.method363(true, 8, this.field4755);
                }
                this.field4739.method2942(arg0 + 2, this.field4727);
                this.field4739.method2938(this.field4726, 10);
                this.field4726.method362(arg0 + 7553, 0);
                this.field4726.method362(arg0 ^ 0x1D81, 8);
                this.field4726.method350((byte) -15, this.field4748, 0);
                this.field4726.method350((byte) 122, this.field4756, 8);
                this.field4739.method2942(2, this.field4726);
            }
            this.field4750 = true;
            this.field4751 = false;
        }
        if (this.field4750) {
            this.field4739.method2938(this.field4735, 10);
            this.field4750 = !this.field4735.method366((byte) 23);
            this.field4739.method2942(2, this.field4735);
        }
        return !this.field4750;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public final void method2059(byte arg0) {
        field4742++;
        if (!this.field4725) {
            return;
        }
        if (this.field4726 != null) {
            int var2 = 16384;
            this.field4739.method2988(arg0 ^ 0x7, this.field4726);
            this.field4739.method2991(this.field4727, false);
            this.field4726.method348(0, (byte) 94);
            this.field4727.method349(0, -104);
            if (this.field4753) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field4733, this.field4745, 0, 0, this.field4733, this.field4745, var2, 9728);
            this.field4739.method2983(this.field4726, (byte) 69);
            this.field4739.method3010((byte) -65, this.field4727);
        }
        this.field4739.method2937(true);
        this.field4739.method2978(0, (byte) -59);
        this.field4739.method2976((byte) 40, 1);
        this.field4739.method539();
        int var3 = 0;
        int var4 = 1;
        if (arg0 != 5) {
            this.field4725 = false;
        }
        class343 var6;
        for (class343 var5 = (class343) this.field4744.method1672((byte) -116); var5 != null; var5 = var6) {
            var6 = (class343) this.field4744.method1668(arg0 ^ 0xFFFFFFFA);
            int var7 = var5.method1990(-16674);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method646(var8, this.field4755, this.field4754[var3], 56);
                if (var6 == null && var7 - 1 == var8) {
                    this.field4739.method2942(arg0 ^ 0x7, this.field4727);
                    this.field4739.method3011(0, 0, arg0 - 9024);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4745);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4729, this.field4743);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4729, this.field4745 + this.field4743);
                    OpenGL.glTexCoord2f((float) this.field4733, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4733 + this.field4729, this.field4745 + this.field4743);
                    OpenGL.glTexCoord2f((float) this.field4733, (float) this.field4745);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4733 + this.field4729, this.field4743);
                    OpenGL.glEnd();
                } else {
                    this.field4727.method349(var4, arg0 - 106);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field4745);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field4745);
                    OpenGL.glTexCoord2f((float) this.field4733, (float) this.field4745);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field4733, this.field4745);
                    OpenGL.glTexCoord2f((float) this.field4733, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field4733, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var5.method648(var8, -31244);
                var3 = var3 + 1 & 0x1;
            }
        }
        this.field4725 = false;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)Z")
    public final boolean method2060(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= 41) {
            return false;
        }
        field4728++;
        if (this.field4735 == null || this.field4744.method1664((byte) -49)) {
            return false;
        }
        if (this.field4733 != arg4 || this.field4745 != arg2) {
            this.field4745 = arg2;
            this.field4733 = arg4;
            for (class42 var6 = this.field4744.method1672((byte) -94); var6 != this.field4744.field3684; var6 = var6.field619) {
                ((class343) var6).method647(this.field4745, (byte) 101, this.field4733);
            }
            this.field4752 = true;
            this.field4757 = true;
            this.field4751 = true;
        }
        if (!this.method2058(0)) {
            return false;
        }
        this.field4743 = arg3;
        this.field4725 = true;
        this.field4729 = arg1;
        this.field4739.method2938(this.field4735, 10);
        this.field4735.method349(0, -102);
        this.field4739.method3011(this.field4745 - this.field4735.method361((byte) 118) - this.field4743, -this.field4729, -9019);
        return true;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lbo;)V")
    public class351(class511 arg0) {
        this.field4739 = arg0;
        if (this.field4739.field7510 && this.field4739.field7460) {
            this.field4735 = this.field4727 = new class48(this.field4739);
            if (this.field4739.field7390 > 1 && this.field4739.field7513 && this.field4739.field7446) {
                this.field4735 = this.field4726 = new class48(this.field4739);
                return;
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2061(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
