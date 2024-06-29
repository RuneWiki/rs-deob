import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class182 extends class205 {

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "I")
    private int field3374 = 0;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "I")
    private int field3373 = 1;

    @OriginalMember(owner = "client!rd", name = "fb", descriptor = "I")
    private int field3378 = 0;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "Lba;")
    public static class13 field3369 = null;

    @OriginalMember(owner = "client!rd", name = "eb", descriptor = "[I")
    public static int[] field3377 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "Lba;")
    public static class13 field3372 = null;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!rd", name = "db", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field3368;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 3) {
                    this.field3373 = arg0.method662((byte) -87);
                }
            } else {
                this.field3374 = arg0.method662((byte) -104);
            }
        } else {
            this.field3378 = arg0.method662((byte) -86);
        }
        int var5 = -14 % ((arg1 - -47) / 34);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        class121.method771((byte) 89);
        ++field3370;
        if (arg0) {
            field3377 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field3371;
        if (arg0 != 0) {
            this.field3374 = -58;
        }
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int var4 = class218.field4051[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class118.field2245; ++var6) {
                int var7 = class230.field4319[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (this.field3378 == 0) {
                    var9 = (-var4 + var7) * this.field3373;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field3373 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field3374 != -1) {
                    if (~this.field3374 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class25.field571[var12 >> 4 & 255] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V")
    public static void method1140(int arg0) {
        if (arg0 <= 29) {
            field3377 = null;
        }
        field3377 = null;
        field3369 = null;
        field3372 = null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1141(int arg0, byte[] arg1) {
        ++field3375;
        int var2 = arg1.length;
        if (arg0 < 25) {
            return null;
        } else {
            byte[] var3 = new byte[var2];
            class163.method1025(arg1, 0, var3, 0, var2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lvd;IBLjava/awt/Color;Z)V")
    public static final void method1142(class222 arg0, int arg1, byte arg2, Color arg3, boolean arg4) {
        try {
            if (arg2 <= 109) {
                method1141(-56, (byte[]) null);
            }
            Graphics var5 = class130.field2523.getGraphics();
            if (class69.field1301 == null) {
                class69.field1301 = new Font("Helvetica", 1, 13);
                class140.field2701 = class130.field2523.getFontMetrics(class69.field1301);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class70.field1315, class122.field2321);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class13.field302 == null) {
                    class13.field302 = class130.field2523.createImage(304, 34);
                }
                Graphics var6 = class13.field302.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, -(arg1 * 3) + 300, 30);
                var6.setFont(class69.field1301);
                var6.setColor(Color.white);
                arg0.method1433(812, (-arg0.method1410(class140.field2701, -24813) + 304) / 2, var6, 22);
                var5.drawImage(class13.field302, class70.field1315 / 2 - 152, class122.field2321 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class70.field1315 / 2 + -152;
                int var8 = class122.field2321 / 2 + -18;
                var5.setColor(arg3);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg1 * 3 + var7 + 2, var8 + 2, 300 - arg1 * 3, 30);
                var5.setFont(class69.field1301);
                var5.setColor(Color.white);
                arg0.method1433(812, var7 - -((-arg0.method1410(class140.field2701, -24813) + 304) / 2), var5, var8 + 22);
            }
        } catch (Exception var10) {
            class130.field2523.repaint();
        }
        ++field3376;
    }
}
