import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class38 extends class181 {

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    private final int field787;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    private final int field786;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    private final int field781;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    private final int field789;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "[I")
    public static int[] field785 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Loc;B)[Loc;")
    public static final class151[] method282(class151[] arg0, byte arg1) {
        ++field791;
        class151[] var2 = new class151[5];
        for (int var3 = 0; ~var3 > -6; ++var3) {
            var2[var3] = class126.method761(new class151[] { class137.method874(var3, false), class176.field3193 }, 10260);
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = class126.method761(new class151[] { var2[var3], arg0[var3] }, 10260);
            }
        }
        if (arg1 != 34) {
            field785 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method283(boolean arg0) {
        if (!arg0) {
            method284(-76);
        }
        field785 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)V")
    public final void method47(byte arg0, int arg1, int arg2) {
        if (arg0 == -101) {
            ++field790;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIII)V")
    public class38(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field787 = arg2;
        this.field786 = arg3;
        this.field781 = arg0;
        this.field789 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static final void method284(int arg0) {
        ++field780;
        if (arg0 != -1) {
            method285(true, (class151) null, (Color) null, (byte) -98, 47);
        }
        for (int var1 = 0; ~var1 > ~class111.field1956; ++var1) {
            int var2 = class218.field3800[var1];
            class203 var3 = class122.field2190[var2];
            int var4 = class1.field34.method1475(255);
            if ((var4 & 2) != 0) {
                var3.field4033 = class1.field34.method1443((byte) -117);
                var3.field4026 = 100;
            }
            if (~(var4 & 128) != -1) {
                var3.field4016 = class1.field34.method1441(0);
                int var5 = class1.field34.method1442(false);
                var3.field3977 = 0;
                var3.field4008 = var5 >> 16;
                var3.field4039 = (var5 & 65535) + class200.field3541;
                var3.field4030 = 0;
                if (~var3.field4016 == -65536) {
                    var3.field4016 = -1;
                }
                if (~class200.field3541 > ~var3.field4039) {
                    var3.field4030 = -1;
                }
            }
            if ((64 & var4) != 0) {
                int var6 = class1.field34.method1459(255);
                int var7 = class1.field34.method1459(255);
                var3.method1429(class200.field3541, var6, var7, (byte) 3);
                var3.field4041 = class200.field3541 + 300;
                var3.field3986 = class1.field34.method1459(255);
            }
            if (~(8 & var4) != -1) {
                int var8 = class1.field34.method1486((byte) -65);
                if (~var8 == -65536) {
                    var8 = -1;
                }
                int var9 = class1.field34.method1475(255);
                if (var3.field3991 == var8 && ~var8 != 0) {
                    class115 var10 = class197.method1233(-101, var8);
                    int var11 = var10.field2047;
                    if (~var11 == -2) {
                        var3.field4042 = 0;
                        var3.field4004 = var9;
                        var3.field4022 = 0;
                        var3.field4020 = 0;
                        class19.method169(var10, var3.field4029, var3.field3976, false, var3.field4020, -24879);
                    }
                    if (~var11 == -3) {
                        var3.field4042 = 0;
                    }
                } else if (~var8 == 0 || ~var3.field3991 == 0 || class197.method1233(-102, var8).field2061 >= class197.method1233(64, var3.field3991).field2061) {
                    var3.field4020 = 0;
                    var3.field4001 = var3.field3999;
                    var3.field4022 = 0;
                    var3.field4004 = var9;
                    var3.field4042 = 0;
                    var3.field3991 = var8;
                    if (var3.field3991 != -1) {
                        class19.method169(class197.method1233(107, var3.field3991), var3.field4029, var3.field3976, false, var3.field4020, -24879);
                    }
                }
            }
            if (~(1 & var4) != -1) {
                var3.field3608 = class131.method814(true, class1.field34.method1486((byte) -65));
                var3.field4025 = var3.field3608.field1293;
                var3.field4002 = var3.field3608.field1328;
                var3.field3984 = var3.field3608.field1325;
                var3.field3971 = var3.field3608.field1301;
                var3.field4021 = var3.field3608.field1286;
                var3.field4007 = var3.field3608.field1317;
                var3.field3983 = var3.field3608.field1309;
                var3.field3973 = var3.field3608.field1311;
                var3.field4036 = var3.field3608.field1313;
            }
            if (~(var4 & 4) != -1) {
                int var12 = class1.field34.method1475(255);
                int var13 = class1.field34.method1459(255);
                var3.method1429(class200.field3541, var12, var13, (byte) 3);
            }
            if ((32 & var4) != 0) {
                var3.field4018 = class1.field34.method1452(-14498);
                var3.field3990 = class1.field34.method1441(0);
            }
            if (~(16 & var4) != -1) {
                var3.field3969 = class1.field34.method1486((byte) -65);
                if (~var3.field3969 == -65536) {
                    var3.field3969 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(BII)V")
    public final void method48(byte arg0, int arg1, int arg2) {
        ++field784;
        int var4 = this.field781 * arg2 >> 12;
        int var5 = this.field787 * arg2 >> 12;
        int var6 = this.field789 * arg1 >> 12;
        int var7 = this.field786 * arg1 >> 12;
        class58.method390(super.field3279, -204342964, var5, var4, var7, var6);
        if (arg0 != 125) {
            method285(false, (class151) null, (Color) null, (byte) -56, -12);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    public final void method50(int arg0, int arg1, int arg2) {
        ++field788;
        if (arg1 != 0) {
            this.method47((byte) 50, -90, -4);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLoc;Ljava/awt/Color;BI)V")
    public static final void method285(boolean arg0, class151 arg1, Color arg2, byte arg3, int arg4) {
        try {
            Graphics var5 = class39.field798.getGraphics();
            if (class54.field1099 == null) {
                class54.field1099 = new Font("Helvetica", 1, 13);
                class11.field210 = class39.field798.getFontMetrics(class54.field1099);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class202.field3602, class36.field751);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class160.field2893 == null) {
                    class160.field2893 = class39.field798.createImage(304, 34);
                }
                Graphics var6 = class160.field2893.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                if (arg3 > -1) {
                    field785 = null;
                }
                var6.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
                var6.setFont(class54.field1099);
                var6.setColor(Color.white);
                arg1.method956(var6, 0, (-arg1.method982(class11.field210, (byte) 119) + 304) / 2, 22);
                var5.drawImage(class160.field2893, class202.field3602 / 2 + -152, class36.field751 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class202.field3602 / 2 + -152;
                int var8 = class36.field751 / 2 + -18;
                var5.setColor(arg2);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 - -1, var8 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + 2 + var7, var8 + 2, -(arg4 * 3) + 300, 30);
                var5.setFont(class54.field1099);
                var5.setColor(Color.white);
                arg1.method956(var5, 0, (304 + -arg1.method982(class11.field210, (byte) 122)) / 2 + var7, var8 + 22);
            }
        } catch (Exception var10) {
            class39.field798.repaint();
        }
        ++field792;
    }
}
