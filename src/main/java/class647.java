import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class647 extends class314 {

    @OriginalMember(owner = "client!sea", name = "R", descriptor = "I")
    private int field9083 = -1;

    @OriginalMember(owner = "client!sea", name = "Q", descriptor = "F")
    public static float field9082;

    @OriginalMember(owner = "client!sea", name = "M", descriptor = "I")
    public static int field9078;

    @OriginalMember(owner = "client!sea", name = "N", descriptor = "I")
    public static int field9079;

    @OriginalMember(owner = "client!sea", name = "S", descriptor = "I")
    private int field9084;

    @OriginalMember(owner = "client!sea", name = "T", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!sea", name = "U", descriptor = "I")
    public static int field9086;

    @OriginalMember(owner = "client!sea", name = "V", descriptor = "I")
    public static int field9087;

    @OriginalMember(owner = "client!sea", name = "W", descriptor = "I")
    private int field9088;

    @OriginalMember(owner = "client!sea", name = "X", descriptor = "I")
    public static int field9089;

    @OriginalMember(owner = "client!sea", name = "O", descriptor = "[I")
    public static int[] field9080;

    @OriginalMember(owner = "client!sea", name = "P", descriptor = "[I")
    private int[] field9081;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "(I)V", line = 5)
    public static void method3740(int arg0) {
        if (arg0 >= -31) {
            method3740(27);
        }
        field9080 = null;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IB)[[I", line = 17)
    public final int[][] method4(int arg0, byte arg1) {
        ++field9079;
        int[][] var3 = super.field4931.method1345(arg0, 0);
        if (super.field4931.field2799) {
            int var4 = this.field9084 * (class246.field3926 == this.field9088 ? arg0 : this.field9088 * arg0 / class246.field3926);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class81.field1009 != this.field9084) {
                for (int var8 = 0; class81.field1009 > var8; ++var8) {
                    int var9 = this.field9084 * var8 / class81.field1009;
                    int var10 = this.field9081[var4 + var9];
                    var7[var8] = class453.method2846(var10 << 4, 4080);
                    var6[var8] = class453.method2846(var10, 65280) >> 4;
                    var5[var8] = class453.method2846(16711680, var10) >> 12;
                }
            } else {
                for (int var11 = 0; ~class81.field1009 < ~var11; ++var11) {
                    int var12 = this.field9081[var4++];
                    var7[var11] = class453.method2846(4080, var12 << 4);
                    var6[var11] = class453.method2846(var12 >> 4, 4080);
                    var5[var11] = class453.method2846(4080, var12 >> 12);
                }
            }
        }
        if (arg1 < 68) {
            this.field9083 = 110;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)I", line = 83)
    public final int method2144(int arg0) {
        if (arg0 >= -64) {
            this.field9088 = 100;
        }
        ++field9078;
        return this.field9083;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BLie;I)V", line = 97)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg0 < -1) {
            ++field9089;
            if (~arg2 == -1) {
                this.field9083 = arg1.method67(12021);
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Ljava/awt/Color;IILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;)V", line = 111)
    public static final void method3741(Color arg0, int arg1, int arg2, Color arg3, Color arg4, String arg5) {
        ++field9087;
        try {
            Graphics var6 = class271.field4377.getGraphics();
            if (class9.field157 == null) {
                class9.field157 = new Font("Helvetica", 1, 13);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class518.field7504 == null) {
                    class518.field7504 = class271.field4377.createImage(class56.field732, class259.field4147);
                }
                Graphics var7 = class518.field7504.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class56.field732, class259.field4147);
                int var8 = class56.field732 / 2 + -152;
                int var9 = class259.field4147 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var8 + 2, var9 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var8 + 2, var9 + 2, -(arg1 * 3) + 300, 30);
                var7.setFont(class9.field157);
                var7.setColor(arg4);
                var7.drawString(arg5, var8 + (-(arg5.length() * 6) + 304) / 2, var9 - -22);
                if (class673.field9487 != null) {
                    var7.setFont(class9.field157);
                    var7.setColor(arg4);
                    var7.drawString(class673.field9487, class56.field732 / 2 + -(6 * class673.field9487.length() / 2), class259.field4147 / 2 - 26);
                }
                var6.drawImage(class518.field7504, 0, 0, (ImageObserver) null);
                if (arg2 != 0) {
                    field9082 = -2.0206735F;
                }
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class56.field732, class259.field4147);
                int var10 = class56.field732 / 2 - 152;
                int var11 = class259.field4147 / 2 - 18;
                var6.setColor(arg3);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg0);
                var6.fillRect(var10 + 2, var11 - -2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2 + var10, var11 + 2, 300 - arg1 * 3, 30);
                var6.setFont(class9.field157);
                var6.setColor(arg4);
                if (class673.field9487 != null) {
                    var6.setFont(class9.field157);
                    var6.setColor(arg4);
                    var6.drawString(class673.field9487, class56.field732 / 2 - class673.field9487.length() * 6 / 2, class259.field4147 / 2 + -26);
                }
                var6.drawString(arg5, var10 + (304 - arg5.length() * 6) / 2, var11 + 22);
            }
        } catch (Exception var13) {
            class271.field4377.repaint();
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "()V", line = 201)
    public class647() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(III)V", line = 210)
    public final void method2142(int arg0, int arg1, int arg2) {
        ++field9086;
        if (arg1 < -47) {
            super.method2142(arg0, -53, arg2);
            if (~this.field9083 <= -1 && class211.field3517 != null) {
                int var4 = !class211.field3517.method1610(18904, this.field9083).field4137 ? 128 : 64;
                this.field9081 = class211.field3517.method1607(var4, this.field9083, -20490, false, var4, 1.0F);
                this.field9088 = var4;
                this.field9084 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V", line = 231)
    public final void method2141(int arg0) {
        super.method2141(arg0);
        if (arg0 != 128) {
            this.field9088 = -105;
        }
        ++field9085;
        this.field9081 = null;
    }
}
