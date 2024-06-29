import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class271 extends class86 {

    @OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
    private int field4187 = 1;

    @OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
    private int field4188 = 0;

    @OriginalMember(owner = "client!tj", name = "U", descriptor = "I")
    private int field4193 = 0;

    @OriginalMember(owner = "client!tj", name = "S", descriptor = "[[B")
    public static byte[][] field4191 = new byte[1000][];

    @OriginalMember(owner = "client!tj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4190 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!tj", name = "V", descriptor = "I")
    public static int field4194 = 0;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
    public static int field4183;

    @OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!tj", name = "N", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!tj", name = "Q", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!tj", name = "T", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!tj", name = "W", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lrn;")
    public static class18 field4184;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V", line = 6)
    public static void method1985(int arg0) {
        if (arg0 == 17188) {
            field4191 = (byte[][]) null;
            field4190 = null;
            field4184 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)V", line = 19)
    public static final void method1986(int arg0) {
        field4189++;
        class4.field47.method656(arg0);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V", line = 29)
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4186++;
        class133 var5 = (class133) class81.field1169.method370((byte) -120, (long) arg2);
        if (var5 == null) {
            var5 = new class133();
            class81.field1169.method375(var5, (long) arg2, 83);
        }
        if (arg1 != -8775) {
            return;
        }
        if (var5.field2231.length <= arg4) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field2231.length; var8++) {
                var6[var8] = var5.field2231[var8];
                var7[var8] = var5.field2227[var8];
            }
            for (int var9 = var5.field2231.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2231 = var6;
            var5.field2227 = var7;
        }
        var5.field2231[arg4] = arg0;
        var5.field2227[arg4] = arg3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V", line = 82)
    public static final void method1988(int arg0, int arg1, int arg2, int arg3) {
        field4192++;
        String var4 = "::tele " + arg0 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg1 & arg2);
        System.out.println(var4);
        class296.method2133(var4, (byte) -92);
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "()V", line = 98)
    public class271() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)[I", line = 109)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 <= 7) {
            this.method476(46);
        }
        int[] var3 = this.field1225.method1914(arg0, -95);
        if (this.field1225.field3995) {
            int var4 = class135.field2257[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class93.field1424; var6++) {
                int var7 = class347.field5515[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field4188 == 0) {
                    var9 = (var7 - var4) * this.field4187;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field4187 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field4193 == 0) {
                    var12 = class193.field3042[(var12 & 0xFF5) >> 4] + 4096 >> 1;
                } else if (this.field4193 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        field4183++;
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZLug;)V", line = 177)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field4195++;
        if (arg1) {
            method1985(-67);
        }
        if (arg0 == 0) {
            this.field4188 = arg2.method281(-124);
        } else if (arg0 == 1) {
            this.field4193 = arg2.method281(101);
        } else if (arg0 == 3) {
            this.field4187 = arg2.method281(-124);
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V", line = 220)
    public final void method476(int arg0) {
        if (arg0 != 0) {
            field4191 = (byte[][]) ((byte[][]) null);
        }
        field4185++;
        class164.method1307((byte) 0);
    }
}
