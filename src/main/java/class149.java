import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class149 extends class275 {

    @OriginalMember(owner = "client!qb", name = "C", descriptor = "[I")
    private int[] field2115 = new int[this.field4049];

    @OriginalMember(owner = "client!qb", name = "q", descriptor = "Lgk;")
    public static class331 field2103 = new class331("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!qb", name = "B", descriptor = "I")
    public static int field2114 = -1;

    @OriginalMember(owner = "client!qb", name = "A", descriptor = "Lbg;")
    public static class324 field2113 = new class324(41, 7);

    @OriginalMember(owner = "client!qb", name = "p", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!qb", name = "r", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
    private int field2105;

    @OriginalMember(owner = "client!qb", name = "t", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!qb", name = "u", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
    private int field2109;

    @OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!qb", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field2112;

    @OriginalMember(owner = "client!qb", name = "x", descriptor = "[B")
    private byte[] field2110;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public final void method1074(byte arg0) {
        ++field2106;
        if (arg0 > -55) {
            this.method1076(-101, 57, true);
        }
        this.field2109 = Math.abs(this.field2109);
        if (~this.field2109 <= -4097) {
            this.field2109 = 4095;
        }
        this.method1075((byte) -81, (byte) (this.field2109 >> 4), this.field2105++);
        this.field2109 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BBI)V")
    public void method1075(byte arg0, byte arg1, int arg2) {
        ++field2102;
        if (arg0 != -81) {
            this.method1078(99);
        }
        this.field2110[this.field2105++] = (byte) (127 + class345.method2089(127, arg1 >> 1));
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIZ)V")
    public final void method1076(int arg0, int arg1, boolean arg2) {
        ++field2108;
        if (!arg2) {
            this.field2110 = null;
        }
        this.field2109 += this.field2115[arg0] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)I")
    public static final int method1077(int arg0) {
        ++field2107;
        if (arg0 != -29249) {
            return -40;
        } else {
            if (class134.field1943 == null) {
                if (!class500.field7415 && class291.field4175 > 0) {
                    if (class223.field3272 && class229.field3360.method796(-118, 81) && ~class291.field4175 < -3) {
                        return ((class97) class498.field7394.field1918.field3269.field3269).field1306;
                    }
                    return ((class97) class498.field7394.field1918.field3269).field1306;
                }
                int var1 = class104.field1460.method1268((byte) 58);
                int var2 = class104.field1460.method1280(3045);
                int var3 = class389.field5748;
                int var4 = class429.field6318;
                int var5 = class22.field244;
                if (~var1 < ~var3 && var3 + var5 > var1) {
                    int var6 = -1;
                    for (int var7 = 0; ~var7 > ~class291.field4175; ++var7) {
                        if (class473.field6974) {
                            int var11 = var4 + 33 - -((class291.field4175 - 1 + -var7) * 16);
                            if (~(var11 + -13) > ~var2 && var11 + 3 >= var2) {
                                var6 = var7;
                            }
                        } else {
                            int var12 = (class291.field4175 + -1 - var7) * 16 + 31 + var4;
                            if (~var2 < ~(var12 - 13) && ~var2 >= ~(var12 - -3)) {
                                var6 = var7;
                            }
                        }
                    }
                    if (~var6 != 0) {
                        int var8 = 0;
                        class150 var9 = new class150(class498.field7394);
                        for (class97 var10 = (class97) var9.method1081(true); var10 != null; var10 = (class97) var9.method1082((byte) 56)) {
                            if (var8++ == var6) {
                                return var10.field1306;
                            }
                        }
                    }
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public final void method1078(int arg0) {
        this.field2109 = 0;
        if (arg0 >= -54) {
            this.field2110 = null;
        }
        ++field2111;
        this.field2105 = 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method1079(int arg0, float[] arg1, int arg2) {
        ++field2104;
        float[] var3 = new float[arg0];
        class201.method1411(arg1, arg2, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIF)V")
    public class149(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field4049 < ~var7; ++var7) {
            this.field2115[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
    public static void method1080(int arg0) {
        field2103 = null;
        if (arg0 == -9160) {
            field2113 = null;
            field2112 = null;
        }
    }
}
