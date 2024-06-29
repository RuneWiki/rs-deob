import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class127 extends class53 {

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "[I")
    private int[] field2199 = new int[3];

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    private int field2205 = 3216;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    private int field2213 = 3216;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    private int field2214 = 4096;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field2198 = 0;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    public static int field2200 = 0;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "Lwa;")
    public static class75 field2207 = class66.method560("leuchten1:", false);

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "[I")
    public static int[] field2206 = new int[25];

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "F")
    public static float field2210;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "Lcb;")
    public static class267 field2212;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILja;Z)V", line = 6)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (!arg2) {
            this.field2199 = (int[]) null;
        }
        if (arg0 == 0) {
            this.field2214 = arg1.method485((byte) -2);
        } else if (arg0 == 1) {
            this.field2213 = arg1.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field2205 = arg1.method485((byte) -2);
        }
        field2204++;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 52)
    public final void method56(byte arg0) {
        this.method1013((byte) 63);
        if (arg0 == -79) {
            field2208++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(B)V", line = 63)
    private final void method1013(byte arg0) {
        field2201++;
        double var2 = Math.cos((double) ((float) this.field2205 / 4096.0F));
        this.field2199[0] = (int) (Math.sin((double) ((float) this.field2213 / 4096.0F)) * var2 * 4096.0D);
        this.field2199[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field2213 / 4096.0F)));
        if (arg0 != 63) {
            return;
        }
        this.field2199[2] = (int) (Math.sin((double) ((float) this.field2205 / 4096.0F)) * 4096.0D);
        int var4 = this.field2199[0] * this.field2199[0] >> 12;
        int var5 = this.field2199[1] * this.field2199[1] >> 12;
        int var6 = this.field2199[2] * this.field2199[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var6 + var5 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2199[2] = (this.field2199[2] << 12) / var7;
            this.field2199[1] = (this.field2199[1] << 12) / var7;
            this.field2199[0] = (this.field2199[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)[I", line = 110)
    public final int[] method59(int arg0, int arg1) {
        field2211++;
        if (arg0 != -15196) {
            return (int[]) null;
        }
        int[] var3 = this.field878.method1603(arg1, (byte) 119);
        if (this.field878.field3749) {
            int var4 = class305.field5217 * this.field2214 >> 12;
            int[] var5 = this.method391(0, 0, arg1 - 1 & class3.field31);
            int[] var6 = this.method391(0, 0, arg1);
            int[] var7 = this.method391(0, 0, class3.field31 & arg1 + 1);
            for (int var8 = 0; var8 < class269.field4644; var8++) {
                int var9 = (var6[var8 - 1 & class157.field2697] - var6[var8 + 1 & class157.field2697]) * var4 >> 12;
                int var10 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class145.field2498[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = this.field2199[0] * var14 >> 12;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field2199[2] * var16 >> 12;
                int var18 = var10 * var13 >> 8;
                int var19 = this.field2199[1] * var18 >> 12;
                var3[var8] = var17 + var19 + var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 211)
    public class127() {
        super(1, true);
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(I)V", line = 216)
    public static final void method1014(int arg0) {
        field2202++;
        class212.field3610 = class125.method960(2048, 8, -400, 4, 8, 35, 0.4F, true);
        if (arg0 != 3283) {
            field2200 = 28;
        }
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(I)V", line = 231)
    public static final void method1015(int arg0) {
        int var1 = class98.field1620;
        field2209++;
        if (arg0 >= -97) {
            method1015(114);
        }
        int var2 = class111.field1896;
        int var3 = class275.field4739 - (class188.field3141 + var1);
        int var4 = class113.field1924 - class244.field4111 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            int var5 = 0;
            int var6 = 0;
            Container var7;
            if (class299.field5117 != null) {
                var7 = class299.field5117;
            } else if (class211.field3601 == null) {
                var7 = class210.field3585.field2072;
            } else {
                var7 = class211.field3601;
            }
            if (class211.field3601 == var7) {
                Insets var8 = class211.field3601.getInsets();
                var6 = var8.top;
                var5 = var8.left;
            }
            Graphics var9 = var7.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var5, var6, var1, class113.field1924);
            }
            if (var2 > 0) {
                var9.fillRect(var5, var6, class275.field4739, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var5 + class275.field4739 - var3, var6, var3, class113.field1924);
            }
            if (var4 > 0) {
                var9.fillRect(var5, var6 + class113.field1924 - var4, class275.field4739, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "(B)V", line = 300)
    public static void method1016(byte arg0) {
        field2206 = null;
        field2207 = null;
        field2212 = null;
        if (arg0 != 28) {
            field2198 = -67;
        }
    }
}
