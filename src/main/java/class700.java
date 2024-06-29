import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class700 implements class90 {

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Lcl;")
    private class240 field9898;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[Z")
    public static boolean[] field9895 = new boolean[200];

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field9890 = 0;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "Z")
    public static boolean field9892 = true;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "[I")
    public static int[] field9893 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field9891;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field9894;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field9899;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public static void method3900(boolean arg0) {
        field9893 = null;
        if (!arg0) {
            field9892 = true;
        }
        field9895 = null;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public final void method420(byte arg0) {
        if (arg0 != 67) {
            this.field9898 = null;
        }
        field9891++;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)I")
    public static final int method3901(int arg0, int arg1, int arg2) {
        field9899++;
        int var3 = 0;
        int var4 = 72 % ((-arg1 - 87) / 32);
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg0--;
            arg2 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)Z")
    public final boolean method419(byte arg0) {
        if (arg0 <= 56) {
            field9892 = true;
        }
        field9894++;
        return true;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BZ)V")
    public final void method421(byte arg0, boolean arg1) {
        if (arg1) {
            class282.field4228.method114(0, 0, class487.field6930, class31.field494, this.field9898.field3749, 0);
        }
        field9896++;
        int var3 = -21 % ((arg0 - 7) / 56);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLvq;)I")
    public static final int method3902(byte arg0, class425 arg1) {
        field9897++;
        int var2 = -79 % ((44 - arg0) / 50);
        if (arg1.field6195 == 0) {
            return 0;
        }
        if (arg1.field6171 != -1) {
            class425 var3 = null;
            if (arg1.field6171 < 32768) {
                class16 var4 = (class16) class189.field2723.method1405((long) arg1.field6171, (byte) -33);
                if (var4 != null) {
                    var3 = var4.field174;
                }
            } else if (arg1.field6171 >= 32768) {
                var3 = class141.field2087[arg1.field6171 - 32768];
            }
            if (var3 != null) {
                int var5 = arg1.field3024 - var3.field3024;
                int var6 = arg1.field3029 - var3.field3029;
                if (var5 != 0 || var6 != 0) {
                    arg1.method2552(-64, (int) (Math.atan2((double) var5, (double) var6) * 2607.5945876176133D) & 0x3FFF);
                }
            }
        }
        if ((arg1 instanceof class491)) {
            class491 var10 = (class491) arg1;
            if (var10.field6962 != -1 && (var10.field6269 == 0 || var10.field6264 > 0)) {
                var10.method2552(-41, var10.field6962);
                var10.field6962 = -1;
            }
        } else if (arg1 instanceof class577) {
            class577 var7 = (class577) arg1;
            if (var7.field8116 != -1 && (var7.field6269 == 0 || var7.field6264 > 0)) {
                int var8 = var7.field3024 - ((var7.field8116 - class109.field1672 - class109.field1672) * 256);
                int var9 = var7.field3029 - ((var7.field8126 - class203.field2874 - class203.field2874) * 256);
                if (var8 != 0 || var9 != 0) {
                    var7.method2552(-63, (int) (Math.atan2((double) var8, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                }
                var7.field8116 = -1;
            }
        }
        return arg1.method2559((byte) 35);
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lcl;)V")
    public class700(class240 arg0) {
        this.field9898 = arg0;
    }
}
