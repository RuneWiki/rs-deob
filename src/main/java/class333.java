import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class333 extends class436 {

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    private int field4501 = 1;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    private int field4504 = 204;

    @OriginalMember(owner = "client!ug", name = "W", descriptor = "I")
    private int field4516 = 1;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "[I")
    public static int[] field4503 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "[I")
    public static int[] field4502 = new int[50];

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "[I")
    public static int[] field4506 = new int[2];

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ug", name = "U", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ug", name = "V", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "Ljava/awt/Image;")
    public static Image field4510;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "[S")
    public static short[] field4512;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "[[Lrg;")
    public static class383[][] field4511;

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class333() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;I)V")
    public static final void method2068(int arg0, boolean arg1, Color arg2, Color arg3, String arg4, Color arg5, int arg6) {
        try {
            Graphics var7 = class41.field617.getGraphics();
            if (class15.field188 == null) {
                class15.field188 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class194.field2696, class243.field3359);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (field4510 == null) {
                    field4510 = class41.field617.createImage(304, 34);
                }
                Graphics var8 = field4510.getGraphics();
                var8.setColor(arg5);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + arg6, 30);
                var8.setFont(class15.field188);
                var8.setColor(arg3);
                var8.drawString(arg4, (304 - arg4.length() * 6) / 2, 22);
                var7.drawImage(field4510, class194.field2696 / 2 + -152, class243.field3359 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class194.field2696 / 2 + -152;
                int var10 = class243.field3359 / 2 + -18;
                var7.setColor(arg5);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 - -1, var10 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + var9 + 2, var10 - -2, -(arg0 * 3) + 300, 30);
                var7.setFont(class15.field188);
                var7.setColor(arg3);
                var7.drawString(arg4, (-(arg4.length() * 6) + 304) / 2 + var9, var10 + 22);
            }
            if (class109.field1610 != null) {
                var7.setFont(class15.field188);
                var7.setColor(arg3);
                var7.drawString(class109.field1610, class194.field2696 / 2 - class109.field1610.length() * 6 / 2, class243.field3359 / 2 + -26);
            }
        } catch (Exception var12) {
            class41.field617.repaint();
        }
        ++field4515;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(II)V")
    public static final void method2069(int arg0, int arg1) {
        class77.method557((byte) -93);
        ++field4507;
        class439.method2761(16383);
        if (arg0 == -2) {
            int var2 = class285.method1845((byte) 117, arg1).field6004;
            if (~var2 != -1) {
                int var3 = class447.field6439[arg1];
                if (var2 == 5) {
                    class202.field2757 = var3;
                }
                if (var2 == 9) {
                    class209.field2819 = var3;
                }
                if (var2 == 6) {
                    class8.field129 = var3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V")
    public static final void method2070(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4514;
        class399 var5 = class269.method1655(arg2, arg3, -53);
        var5.method2583((byte) 71);
        var5.field5829 = arg0;
        var5.field5842 = arg1;
        var5.field5837 = arg4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        ++field4509;
        int[] var3 = super.field6258.method2688((byte) -68, arg0);
        if (super.field6258.field6138) {
            for (int var4 = 0; ~var4 > ~class43.field653; ++var4) {
                int var5 = class249.field3455[var4];
                int var6 = class32.field499[arg0];
                int var7 = this.field4501 * var5 >> 12;
                int var8 = this.field4516 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4501) * this.field4501;
                int var10 = var6 % (4096 / this.field4516) * this.field4516;
                if (var10 < this.field4504) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field4504 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field4504 > var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 18338) {
            method2069(-7, 53);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILeb;)V")
    public final void method18(int arg0, int arg1, class371 arg2) {
        if (arg0 != 34) {
            this.method18(-24, 114, (class371) null);
        }
        ++field4513;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4504 = arg2.method2403((byte) 63);
                }
            } else {
                this.field4516 = arg2.method2429(0);
            }
        } else {
            this.field4501 = arg2.method2429(0);
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public static void method2071(int arg0) {
        field4511 = null;
        field4502 = null;
        if (arg0 > -84) {
            method2072(43);
        }
        field4503 = null;
        field4506 = null;
        field4512 = null;
        field4510 = null;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
    public static final void method2072(int arg0) {
        ++field4508;
        class176.field2485.method1249(1);
        int var1 = 29 / ((arg0 - 48) / 57);
        class248.field3438.method1249(1);
    }
}
