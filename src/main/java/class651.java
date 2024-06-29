import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class651 implements class684 {

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "Lnia;")
    private class30 field9091;

    @OriginalMember(owner = "client!gja", name = "d", descriptor = "I")
    public int field9094;

    @OriginalMember(owner = "client!gja", name = "l", descriptor = "I")
    public int field9102;

    @OriginalMember(owner = "client!gja", name = "h", descriptor = "[I")
    public int[] field9098;

    @OriginalMember(owner = "client!gja", name = "f", descriptor = "Lbs;")
    private class167 field9096;

    @OriginalMember(owner = "client!gja", name = "i", descriptor = "[F")
    public float[] field9099;

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
    public static int field9092 = -1;

    @OriginalMember(owner = "client!gja", name = "c", descriptor = "I")
    public static int field9093;

    @OriginalMember(owner = "client!gja", name = "e", descriptor = "I")
    public static int field9095;

    @OriginalMember(owner = "client!gja", name = "g", descriptor = "I")
    public static int field9097;

    @OriginalMember(owner = "client!gja", name = "j", descriptor = "I")
    public static int field9100;

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "Lhka;")
    public static class76 field9101;

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(IIIIIIZZ)V", line = 4)
    public final void method2230(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class690.method3916(arg6 ? this.field9091.field245.field7471 : null, this.field9094, arg4, arg7 ? this.field9091.field286 : null, arg3, this.field9091.field245.field7465, arg0, arg5, arg2, arg7 ? this.field9099 : null, (byte) 120, this.field9098, arg1);
        field9095++;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BI)Z", line = 17)
    public static final boolean method3728(byte arg0, int arg1) {
        field9093++;
        int var2 = 47 / ((arg0 - 21) / 36);
        if (arg1 == 58 || arg1 == 4 || arg1 == 51 || arg1 == 13 || arg1 == 23) {
            return true;
        } else {
            return arg1 == 47 || arg1 == 1004;
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V", line = 33)
    public static void method3729(int arg0) {
        field9101 = null;
        if (arg0 != 1416222412) {
            method3730(-29, -27, 46, true, 14, -107);
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIIZII)V", line = 44)
    public static final void method3730(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field9097++;
        int var6 = arg4 - arg1;
        int var7 = arg0 - arg5;
        if (var6 == 0) {
            if (var7 != 0) {
                class779.method4294(arg5, (byte) 37, arg0, arg2, arg1);
            }
        } else if (var7 == 0) {
            class290.method1926(arg4, arg2, arg5, arg1, (byte) 1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg5 - (arg1 * var8 >> 12);
            if (arg3) {
                int var10;
                int var11;
                if (arg4 < class177.field2236) {
                    var10 = var9 + (class177.field2236 * var8 >> 12);
                    var11 = class177.field2236;
                } else if (arg4 > class627.field8783) {
                    var10 = (class627.field8783 * var8 >> 12) + var9;
                    var11 = class627.field8783;
                } else {
                    var10 = arg0;
                    var11 = arg4;
                }
                int var12;
                int var13;
                if (class177.field2236 > arg1) {
                    var12 = class177.field2236;
                    var13 = var9 + (class177.field2236 * var8 >> 12);
                } else if (class627.field8783 < arg1) {
                    var13 = (class627.field8783 * var8 >> 12) + var9;
                    var12 = class627.field8783;
                } else {
                    var12 = arg1;
                    var13 = arg5;
                }
                if (class727.field10060 > var13) {
                    var12 = (class727.field10060 - var9 << 12) / var8;
                    var13 = class727.field10060;
                } else if (var13 > class474.field6576) {
                    var12 = (class474.field6576 - var9 << 12) / var8;
                    var13 = class474.field6576;
                }
                if (class727.field10060 > var10) {
                    var10 = class727.field10060;
                    var11 = (class727.field10060 - var9 << 12) / var8;
                } else if (class474.field6576 < var10) {
                    var10 = class474.field6576;
                    var11 = (class474.field6576 - var9 << 12) / var8;
                }
                class734.method4076(26387, var10, var13, var12, var11, arg2);
            }
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IIIIIIZZ)V", line = 151)
    public final void method2232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        field9100++;
        class690.method3916(arg6 ? this.field9098 : null, this.field9091.field245.field7465, arg4, arg7 ? this.field9099 : null, arg3, this.field9094, arg0, arg5, arg2, arg7 ? this.field9091.field286 : null, (byte) 79, this.field9091.field245.field7471, arg1);
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lnia;Lho;Lbs;)V", line = 165)
    public class651(class30 arg0, class318 arg1, class167 arg2) {
        this.field9091 = arg0;
        if (arg1 instanceof class575) {
            class575 var4 = (class575) arg1;
            this.field9094 = var4.field1231;
            this.field9102 = var4.field1208;
            this.field9098 = var4.field8085;
        } else if ((arg1 instanceof class196)) {
            class196 var5 = (class196) arg1;
            this.field9094 = var5.field1231;
            this.field9098 = var5.field2774;
            this.field9102 = var5.field1208;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field9096 = arg2;
            if (this.field9096.field2131 != this.field9094 || this.field9096.field2128 != this.field9102) {
                throw new RuntimeException();
            }
            this.field9099 = this.field9096.field2127;
        }
    }
}
