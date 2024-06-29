import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class202 extends class695 {

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "Lia;")
    private class27 field2633;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "Lbl;")
    private class350 field2629;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "Lne;")
    private class176 field2625;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Lme;")
    public static class668 field2628 = new class668(8);

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "[Ljba;")
    public static class138[] field2638 = new class138[0];

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field2639 = 0;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "[I")
    public static int[] field2636;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)V", line = 8)
    public static void method1316(int arg0) {
        field2628 = null;
        field2636 = null;
        field2638 = null;
        if (arg0 != 0) {
            field2636 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)Lcg;", line = 20)
    public static final class11 method1317(int arg0) {
        ++field2635;
        if (class322.field4178 == 0) {
            return new class11();
        } else {
            if (arg0 != -18665) {
                field2639 = 112;
            }
            return class274.field3604[--class322.field4178];
        }
    }

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V", line = 36)
    public static final void method1318(int arg0) {
        ++field2634;
        class218 var1 = null;
        try {
            class548 var2 = class688.field9413.method1045("2", (byte) -48, true);
            while (~var2.field7108 == -1) {
                class122.method905(1L, arg0 ^ -30337);
            }
            if (~var2.field7108 == -2) {
                var1 = (class218) var2.field7113;
                byte[] var3 = new byte[(int) var1.method1391(arg0 ^ 28302)];
                int var5;
                for (int var4 = 0; ~var4 > ~var3.length; var4 += var5) {
                    var5 = var1.method1390(0, var3.length + -var4, var3, var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class513.method2768(arg0 ^ 28289, new class418(var3));
            }
            if (arg0 != 28288) {
                field2638 = null;
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1397(true);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IZ)V", line = 86)
    public final void method495(int arg0, boolean arg1) {
        super.field9493.method3105(class600.field8091, true, class510.field6687);
        ++field2631;
        if (arg0 != 1) {
            field2639 = 57;
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lia;Lpe;Lbl;)V", line = 97)
    public class202(class27 arg0, class615 arg1, class350 arg2) {
        super(arg0);
        this.field2633 = arg0;
        this.field2629 = arg2;
        if (this.field2629.method2010(-17) && this.field2633.field428) {
            this.field2625 = class165.method1154(34336, arg1.method3355(0, "transparent_water", "gl"), 34379, this.field2633);
        } else {
            this.field2625 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z", line = 113)
    public final boolean method494(boolean arg0) {
        ++field2627;
        if (!arg0) {
            this.method488((class391) null, false, 126);
        }
        return this.field2625 != null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V", line = 124)
    public final void method498(boolean arg0, byte arg1) {
        if (arg1 >= -82) {
            this.field2633 = null;
        }
        ++field2626;
        OpenGL.glBindProgramARB(34336, this.field2625.field2195);
        OpenGL.glEnable(34336);
        super.field9493.method3115(0, 0, class243.field3260);
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)V", line = 137)
    public final void method491(int arg0) {
        super.field9493.method3115(0, 0, class61.field833);
        ++field2632;
        if (arg0 > 38) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(III)V", line = 155)
    public final void method489(int arg0, int arg1, int arg2) {
        if (arg2 <= 69) {
            this.field2629 = null;
        }
        if (!this.field2629.field4482) {
            int var4 = super.field9493.field7708 % 4000 * 16 / 4000;
            super.field9493.method3091(true, this.field2629.field4483[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field9493.field7708 % 4000) / 4000.0F;
            super.field9493.method3091(true, this.field2629.field4478);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
        ++field2637;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(IFIIIIIZI)[[I", line = 184)
    public static final int[][] method1319(int arg0, float arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        ++field2630;
        int[][] var9 = new int[arg0][arg3];
        int var10 = -5 % ((-42 - arg4) / 57);
        class240 var11 = new class240();
        var11.field3231 = arg7;
        var11.field3224 = arg8;
        var11.field3229 = (int) (arg1 * 4096.0F);
        var11.field3236 = arg2;
        var11.field3237 = arg5;
        var11.method618((byte) 63);
        class44.method418(arg0, arg3, -1);
        for (int var12 = 0; ~arg0 < ~var12; ++var12) {
            var11.method1515(var9[var12], (byte) 47, var12);
        }
        return var9;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lnm;ZI)V", line = 225)
    public final void method488(class391 arg0, boolean arg1, int arg2) {
        ++field2624;
        if (arg1) {
            method1316(-106);
        }
    }
}
