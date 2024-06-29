import jaggl.OpenGL;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class260 extends class252 {

    @OriginalMember(owner = "client!bq", name = "G", descriptor = "[F")
    private float[] field3965 = new float[4];

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "Lwq;")
    private class151 field3958;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "Lwq;")
    private class151 field3956;

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "Lwq;")
    private class151 field3955;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "Lwq;")
    private class151 field3960;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "Loi;")
    private class65 field3957;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "Z")
    private boolean field3951;

    @OriginalMember(owner = "client!bq", name = "H", descriptor = "[I")
    public static int[] field3966 = new int[2];

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!bq", name = "C", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!bq", name = "D", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!bq", name = "E", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!bq", name = "I", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "Z")
    private boolean field3950;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "Z")
    private boolean field3959;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "[[Z")
    public static boolean[][] field3949;

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "(ZI)V", line = 10)
    public final void method791(boolean arg0, int arg1) {
        ++field3954;
        if (arg1 != 1) {
            field3966 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "(ZI)Z", line = 20)
    public static final boolean method1713(boolean arg0, int arg1) {
        if (arg0) {
            method1715(111);
        }
        ++field3967;
        return ~arg1 == -2 || ~arg1 == -4 || arg1 == 5;
    }

    @OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(Lhp;Lpu;)V", line = 33)
    public class260(class296 arg0, class522 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field4435) {
            this.field3958 = class302.method1935((byte) 116, 34336, arg1.method3009("uw_ground_unlit", "gl", 0), arg0);
            this.field3956 = class302.method1935((byte) 116, 34336, arg1.method3009("uw_ground_lit", "gl", 0), arg0);
            this.field3955 = class302.method1935((byte) 116, 34336, arg1.method3009("uw_model_unlit", "gl", 0), arg0);
            this.field3960 = class302.method1935((byte) 116, 34336, arg1.method3009("uw_model_lit", "gl", 0), arg0);
            if (this.field3960 != null & this.field3955 != null & this.field3958 != null & this.field3956 != null) {
                this.field3957 = super.field3884.method2363(2, 0, false, new int[] { 0, -1 }, 1);
                this.field3957.method663((byte) -102, false, false);
                this.field3951 = true;
            } else {
                this.field3951 = false;
            }
        } else {
            this.field3951 = false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "(I)V", line = 63)
    public final void method1691(int arg0) {
        if (this.field3950) {
            int var2 = super.field3884.method115();
            int var3 = super.field3884.method110();
            float var4 = (float) var2 + -((float) (-var3 + var2) * 0.125F);
            float var5 = (float) var2 + -((float) (-var3 + var2) * 0.25F);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field3884.method2377(93), (float) super.field3884.method2335(false) / 255.0F);
            super.field3884.method2351(0, 1);
            super.field3884.method2321(super.field3884.method2317(68), arg0 + 24);
            super.field3884.method2351(0, 0);
        }
        if (arg0 == 0) {
            ++field3962;
        }
    }

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "(I)Z", line = 90)
    public final boolean method792(int arg0) {
        ++field3964;
        if (arg0 != 6439) {
            this.field3951 = false;
        }
        return this.field3951;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 101)
    public final void method1685(int arg0) {
        ++field3947;
        int var2 = super.field3884.method2347(1);
        class21 var3 = super.field3884.method2382(1);
        if (!this.field3959) {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field3958.field2179 : this.field3955.field2179);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field3956.field2179 : this.field3960.field2179);
        }
        OpenGL.glEnable(34336);
        this.field3950 = true;
        var3.method266(0.0F, -1.0F, (float) var2, 0.0F, 79, this.field3965);
        OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field3965[0], this.field3965[1], this.field3965[2], this.field3965[3]);
        this.method1691(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Z)V", line = 126)
    public final void method788(boolean arg0) {
        if (!arg0) {
            field3966 = null;
        }
        super.field3884.method2351(0, 1);
        ++field3952;
        super.field3884.method2337(false, (class301) null);
        super.field3884.method2339(class153.field2209, -32540, class153.field2209);
        super.field3884.method2324(0, class61.field1155, 1);
        super.field3884.method2324(2, class124.field1869, 1);
        super.field3884.method2360(0, class61.field1155, 1);
        super.field3884.method2351(0, 0);
        if (this.field3950) {
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
            this.field3950 = false;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;II)V", line = 156)
    public static final void method1714(Color arg0, String arg1, Color arg2, Color arg3, int arg4, int arg5) {
        try {
            Graphics var6 = class31.field486.getGraphics();
            if (class307.field4551 == null) {
                class307.field4551 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class255.field3920 == null) {
                    class255.field3920 = class31.field486.createImage(class487.field6930, class31.field494);
                }
                Graphics var7 = class255.field3920.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class487.field6930, class31.field494);
                int var8 = class487.field6930 / 2 - 152;
                int var9 = class31.field494 / 2 + -18;
                var7.setColor(arg3);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var8 - -2, var9 + 2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, arg5, 31);
                var7.fillRect(arg4 * 3 + (var8 - -2), var9 + 2, 300 - arg4 * 3, 30);
                var7.setFont(class307.field4551);
                var7.setColor(arg0);
                var7.drawString(arg1, (-(arg1.length() * 6) + 304) / 2 + var8, var9 - -22);
                if (class518.field7315 != null) {
                    var7.setFont(class307.field4551);
                    var7.setColor(arg0);
                    var7.drawString(class518.field7315, class487.field6930 / 2 - class518.field7315.length() * 6 / 2, class31.field494 / 2 + -26);
                }
                var6.drawImage(class255.field3920, 0, 0, (ImageObserver) null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class487.field6930, class31.field494);
                int var10 = class487.field6930 / 2 - 152;
                int var11 = class31.field494 / 2 + -18;
                var6.setColor(arg3);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + 2 - -(arg4 * 3), var11 + 2, 300 - arg4 * 3, 30);
                var6.setFont(class307.field4551);
                var6.setColor(arg0);
                if (class518.field7315 != null) {
                    var6.setFont(class307.field4551);
                    var6.setColor(arg0);
                    var6.drawString(class518.field7315, class487.field6930 / 2 - class518.field7315.length() * 6 / 2, class31.field494 / 2 + -26);
                }
                var6.drawString(arg1, var10 - -((304 + -(arg1.length() * 6)) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class31.field486.repaint();
        }
        ++field3961;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(III)V", line = 242)
    public final void method796(int arg0, int arg1, int arg2) {
        if (arg2 > -105) {
            this.field3959 = false;
        }
        ++field3948;
    }

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)V", line = 252)
    public static void method1715(int arg0) {
        field3949 = null;
        if (arg0 > -34) {
            method1713(false, -79);
        }
        field3966 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lbb;II)V", line = 264)
    public final void method790(class301 arg0, int arg1, int arg2) {
        super.field3884.method2337(false, arg0);
        ++field3953;
        super.field3884.method2308(arg2, arg1);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZI)V", line = 281)
    public final void method794(boolean arg0, int arg1) {
        if (arg1 == -1) {
            this.field3959 = arg0;
            ++field3963;
            super.field3884.method2351(0, 1);
            super.field3884.method2337(false, this.field3957);
            super.field3884.method2339(class203.field2875, -32540, class190.field2740);
            super.field3884.method2324(0, class124.field1869, 1);
            super.field3884.method1881(true, class61.field1155, 2, -4016, false);
            super.field3884.method2360(0, class319.field4696, arg1 + 2);
            super.field3884.method2351(0, 0);
            this.method1685(arg1 ^ -14200);
        }
    }
}
