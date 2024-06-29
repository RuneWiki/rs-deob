import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class218 {

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public int field3030 = -1;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public int field3033 = 64;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
    public boolean field3032 = false;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public int field3036 = 64;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field3038 = 2;

    @OriginalMember(owner = "client!bb", name = "n", descriptor = "Z")
    public boolean field3043 = false;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public int field3041 = 1;

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Ldi;")
    public static class83 field3035 = new class83(76, -1);

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lwj;")
    public static class270 field3042 = new class270(24, -1);

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "[Ltp;")
    public static class371[] field3046 = new class371[8];

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3047 = "";

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lsi;IB)V")
    public final void method1350(class391 arg0, int arg1, byte arg2) {
        field3044++;
        if (arg2 < 110) {
            return;
        }
        while (true) {
            int var4 = arg0.method2348(-2);
            if (var4 == 0) {
                return;
            }
            this.method1357(arg1, var4, arg0, 105);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZII)V")
    public static final void method1351(int arg0, boolean arg1, int arg2, int arg3) {
        field3040++;
        if (arg1) {
            class373 var4 = class267.field3695[arg3][arg0];
            class339.method2013(var4 == null ? class421.field6170 : var4, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IJ)V")
    public static final void method1352(int arg0, long arg1) {
        if (arg0 != -12630) {
            field3047 = null;
        }
        field3037++;
        int var3 = class405.field5940;
        int var4 = class177.field2621;
        if (class240.field3370 != var3) {
            int var5 = var3 - class240.field3370;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class240.field3370 += var6;
        }
        if (class121.field1818 != var4) {
            int var7 = var4 - class121.field1818;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class121.field1818 += var8;
        }
        if (!class20.field269.field7654) {
            class252.field3498 += (float) arg1 * class187.field2712 / 40.0F * 8.0F;
            class498.field7255 += (float) arg1 * class78.field1128 / 40.0F * 8.0F;
        }
        class314.method1816(10299);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/awt/Frame;Ldr;B)V")
    public static final void method1353(Frame arg0, class504 arg1, byte arg2) {
        field3045++;
        if (arg2 != -61) {
            return;
        }
        while (true) {
            class56 var3 = arg1.method2951(arg0, 28944);
            while (var3.field667 == 0) {
                class157.method1046(-128, 10L);
            }
            if (var3.field667 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                return;
            }
            class157.method1046(-128, 100L);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static final void method1354(boolean arg0) {
        class448.method2651(25, (byte) 112);
        field3039++;
        class98.method720(arg0);
        System.gc();
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method1355(byte arg0) {
        field3042 = null;
        field3046 = null;
        field3047 = null;
        field3035 = null;
        if (arg0 != 96) {
            field3035 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(FI)F")
    public static final float method1356(float arg0, int arg1) {
        int var2 = 82 / ((-arg1 - 69) / 56);
        field3034++;
        return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILsi;I)V")
    private final void method1357(int arg0, int arg1, class391 arg2, int arg3) {
        int var5 = -76 % ((3 - arg3) / 36);
        field3031++;
        if (arg1 == 1) {
            this.field3030 = arg2.method2353((byte) 87);
            if (this.field3030 == 65535) {
                this.field3030 = -1;
            }
        } else if (arg1 == 2) {
            this.field3036 = arg2.method2353((byte) 66) + 1;
            this.field3033 = arg2.method2353((byte) 67) + 1;
        } else if (arg1 == 3) {
            arg2.method2337(-1);
        } else if (arg1 == 4) {
            this.field3038 = arg2.method2348(-2);
        } else if (arg1 == 5) {
            this.field3041 = arg2.method2348(-2);
            return;
        } else if (arg1 == 6) {
            this.field3043 = true;
            return;
        } else if (arg1 == 7) {
            this.field3032 = true;
            return;
        }
    }
}
