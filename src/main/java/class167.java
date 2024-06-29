import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class167 extends class123 {

    @OriginalMember(owner = "client!ei", name = "cb", descriptor = "I")
    private int field2947 = 3216;

    @OriginalMember(owner = "client!ei", name = "kb", descriptor = "I")
    private int field2955 = 3216;

    @OriginalMember(owner = "client!ei", name = "fb", descriptor = "I")
    private int field2950 = 4096;

    @OriginalMember(owner = "client!ei", name = "mb", descriptor = "[I")
    private int[] field2957 = new int[3];

    @OriginalMember(owner = "client!ei", name = "ab", descriptor = "Leb;")
    public static class230 field2945 = class68.method589(0, "::rect_debug");

    @OriginalMember(owner = "client!ei", name = "ib", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!ei", name = "lb", descriptor = "[I")
    public static int[] field2956 = new int[32768];

    @OriginalMember(owner = "client!ei", name = "X", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!ei", name = "Y", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ei", name = "Z", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!ei", name = "bb", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ei", name = "db", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ei", name = "eb", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ei", name = "gb", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ei", name = "hb", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ei", name = "jb", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ei", name = "nb", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        int var3 = -112 % ((-24 - arg1) / 57);
        ++field2954;
        int[] var4 = super.field2160.method1323((byte) 120, arg0);
        if (super.field2160.field3243) {
            int var5 = class194.field3493 * this.field2950 >> 12;
            int[] var6 = this.method965(0, arg0 + -1 & class79.field1431, (byte) 94);
            int[] var7 = this.method965(0, arg0, (byte) 14);
            int[] var8 = this.method965(0, class79.field1431 & arg0 + 1, (byte) 55);
            for (int var9 = 0; class140.field2505 > var9; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[class217.field3743 & var9 + -1] - var7[class217.field3743 & var9 - -1]) * var5 >> 12;
                int var12 = var10 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                int var13 = var11 >> 4;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (var13 > 255) {
                    var13 = 255;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var14 = 255 & class142.field2548[((var12 + 1) * var12 >> 1) + var13];
                int var15 = var14 * 4096 >> 8;
                int var16 = this.field2957[2] * var15 >> 12;
                int var17 = var11 * var14 >> 8;
                int var18 = this.field2957[0] * var17 >> 12;
                int var19 = var10 * var14 >> 8;
                int var20 = this.field2957[1] * var19 >> 12;
                var4[var9] = var18 + var20 + var16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public static void method1234(int arg0) {
        if (arg0 <= -73) {
            field2945 = null;
            field2956 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static final void method1235(boolean arg0) {
        ++field2952;
        if (class173.field3059 != null) {
            class178 var1 = class173.field3059;
            synchronized (class173.field3059) {
                class173.field3059 = null;
            }
        }
        if (arg0) {
            method1236((class230) null, (byte) 94, (class230) null, (class230) null, 85, 3);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field2949;
        if (arg2 == 1876195788) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (arg0 == 2) {
                        this.field2947 = arg1.method161(4);
                    }
                } else {
                    this.field2955 = arg1.method161(arg2 ^ 1876195784);
                }
            } else {
                this.field2950 = arg1.method161(arg2 + -1876195784);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Leb;BLeb;Leb;II)V")
    public static final void method1236(class230 arg0, byte arg1, class230 arg2, class230 arg3, int arg4, int arg5) {
        ++field2946;
        if (arg1 < 25) {
            field2956 = null;
        }
        for (int var6 = 99; var6 > 0; --var6) {
            class106.field1926[var6] = class106.field1926[var6 + -1];
            class39.field723[var6] = class39.field723[var6 + -1];
            class160.field2868[var6] = class160.field2868[var6 - 1];
            class204.field3608[var6] = class204.field3608[var6 + -1];
            class40.field727[var6] = class40.field727[var6 + -1];
        }
        class106.field1926[0] = arg5;
        ++class248.field4395;
        class270.field4773 = class54.field935;
        class39.field723[0] = arg2;
        class40.field727[0] = arg4;
        class160.field2868[0] = arg0;
        class204.field3608[0] = arg3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILjava/awt/Color;ZLeb;B)V")
    public static final void method1237(int arg0, Color arg1, boolean arg2, class230 arg3, byte arg4) {
        try {
            Graphics var5 = class14.field307.getGraphics();
            if (class41.field740 == null) {
                class41.field740 = new Font("Helvetica", 1, 13);
                class233.field4046 = class14.field307.getFontMetrics(class41.field740);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class180.field3155, class135.field2434);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class156.field2791 == null) {
                    class156.field2791 = class14.field307.createImage(304, 34);
                }
                Graphics var6 = class156.field2791.getGraphics();
                var6.setColor(arg1);
                if (arg4 != 15) {
                    field2953 = 40;
                }
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, -(arg0 * 3) + 300, 30);
                var6.setFont(class41.field740);
                var6.setColor(Color.white);
                arg3.method1611(124, 22, var6, (-arg3.method1626(122, class233.field4046) + 304) / 2);
                var5.drawImage(class156.field2791, class180.field3155 / 2 + -152, class135.field2434 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class180.field3155 / 2 + -152;
                int var8 = class135.field2434 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(var7 - -(arg0 * 3) + 2, var8 - -2, -(arg0 * 3) + 300, 30);
                var5.setFont(class41.field740);
                var5.setColor(Color.white);
                arg3.method1611(arg4 + 105, var8 + 22, var5, var7 + (-arg3.method1626(122, class233.field4046) + 304) / 2);
            }
            if (class15.field356 != null) {
                var5.setFont(class41.field740);
                var5.setColor(Color.white);
                class15.field356.method1611(arg4 + 112, class135.field2434 / 2 - 26, var5, class180.field3155 / 2 + -(class15.field356.method1626(122, class233.field4046) / 2));
            }
        } catch (Exception var10) {
            class14.field307.repaint();
        }
        ++field2948;
    }

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)V")
    private final void method1238(int arg0) {
        double var2 = Math.cos((double) ((float) this.field2947 / 4096.0F));
        ++field2958;
        this.field2957[0] = (int) (Math.sin((double) ((float) this.field2955 / 4096.0F)) * var2 * 4096.0D);
        if (arg0 < -64) {
            this.field2957[1] = (int) (4096.0D * Math.cos((double) ((float) this.field2955 / 4096.0F)) * var2);
            this.field2957[2] = (int) (Math.sin((double) ((float) this.field2947 / 4096.0F)) * 4096.0D);
            int var4 = this.field2957[2] * this.field2957[2] >> 12;
            int var5 = this.field2957[1] * this.field2957[1] >> 12;
            int var6 = this.field2957[0] * this.field2957[0] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var5 + var6 >> 12)));
            if (var7 != 0) {
                this.field2957[1] = (this.field2957[1] << 12) / var7;
                this.field2957[0] = (this.field2957[0] << 12) / var7;
                this.field2957[2] = (this.field2957[2] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "()V")
    public class167() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        this.method1238(arg0 + -125);
        if (arg0 != 0) {
            this.method1238(88);
        }
        ++field2944;
    }
}
