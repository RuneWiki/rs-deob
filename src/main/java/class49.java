import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class49 extends class27 {

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    private int field733 = 4096;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Z")
    private boolean field734 = true;

    @OriginalMember(owner = "client!r", name = "N", descriptor = "Ljava/lang/String;")
    public static String field730 = "level: ";

    @OriginalMember(owner = "client!r", name = "L", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!r", name = "M", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!r", name = "K", descriptor = "Lbo;")
    public static class16 field727;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)V", line = 5)
    public static void method415(byte arg0) {
        if (arg0 != -31) {
            field728 = -80;
        }
        field727 = null;
        field730 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[[I", line = 20)
    public final int[][] method19(int arg0, int arg1) {
        field731++;
        if (arg0 != -28941) {
            this.method19(-101, 5);
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[] var4 = this.method164(arg1 - 1 & class214.field3080, 90, 0);
            int[] var5 = this.method164(arg1, 115, 0);
            int[] var6 = this.method164(class214.field3080 & arg1 + 1, 15, 0);
            int[] var7 = var3[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            for (int var10 = 0; var10 < class209.field3053; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field733;
                int var12 = (var5[class150.field2180 & var10 + 1] - var5[var10 - 1 & class150.field2180]) * this.field733;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var18 = var11 / var17;
                    var19 = var12 / var17;
                    var20 = 16777216 / var17;
                }
                if (this.field734) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var9[var10] = var19;
                var8[var10] = var18;
                var7[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZIIIIIZ)V", line = 102)
    public static final void method416(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        if (!arg10) {
            field730 = (String) null;
        }
        field732++;
        if (class1.field55.method1700(-111) == 2) {
            class289.method2086(arg7, (byte) -3, arg2, arg9, arg4, arg6, arg5, arg8, arg3, arg1, arg0);
        } else if (class1.field55.method1700(-127) <= 2) {
            class15.method92(arg0, (byte) -115, arg6, arg8, arg3, arg9, arg4, arg1, arg2, arg5, arg7);
        } else {
            class181.method1257(arg0, arg3, arg7, arg5, arg2, arg1, arg9, arg4, arg8, arg6, class1.field55.method1700(-103), 8);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILsb;I)V", line = 130)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg2 == 0) {
            this.field733 = arg1.method1317((byte) 78);
        } else if (arg2 == 1) {
            this.field734 = arg1.method1319(255) == 1;
        }
        if (arg0 != -5836) {
            method417((byte) 18);
        }
        field735++;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 162)
    public class49() {
        super(1, false);
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(B)V", line = 166)
    public static final void method417(byte arg0) {
        field729++;
        class356.field5456.method458((byte) -87);
        if (arg0 < 30) {
            field728 = -33;
        }
        class116.field1649.method458((byte) 127);
    }
}
