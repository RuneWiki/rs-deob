import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class82 {

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lmo;")
    private class336 field1182 = new class336(16);

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Lnl;")
    private class435 field1178;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field1173 = 0;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lrl;")
    public static class439 field1180;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 5)
    public static void method695(int arg0) {
        if (arg0 > -97) {
            method698(-58, 13, 118, 91, (byte) -6);
        }
        field1180 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V", line = 16)
    public final void method696(byte arg0) {
        class336 var2 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method2109(-1);
            if (arg0 > -40) {
                method701(-67, 2, -102, -109);
            }
        }
        field1174++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)V", line = 32)
    public final void method697(int arg0, byte arg1) {
        class336 var3 = this.field1182;
        synchronized (this.field1182) {
            if (arg1 > -63) {
                this.field1178 = null;
            }
            this.field1182.method2120((byte) -108, arg0);
        }
        field1181++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIB)V", line = 46)
    public static final void method698(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1176++;
        class334 var5 = class352.method2172(arg0, 8, 16711935);
        var5.method2104(0);
        var5.field4636 = arg3;
        var5.field4635 = arg1;
        if (arg4 > 56) {
            var5.field4648 = arg2;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 70)
    public final void method699(int arg0) {
        class336 var2 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method2119(arg0 + 20452);
        }
        field1177++;
        if (arg0 != -20452) {
            field1173 = 62;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Lrh;", line = 86)
    private final class441 method700(int arg0, int arg1) {
        field1179++;
        class336 var3 = this.field1182;
        class441 var4;
        synchronized (this.field1182) {
            var4 = (class441) this.field1182.method2113(arg0 ^ 0x1D, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1178.method2633(arg0, arg1, -114);
        class441 var6 = new class441();
        if (var5 != null) {
            var6.method2684(new class161(var5), false);
        }
        class336 var7 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method2116((long) arg1, (byte) -84, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII)I", line = 110)
    public static final int method701(int arg0, int arg1, int arg2, int arg3) {
        field1183++;
        if (arg1 > 243) {
            arg2 >>= 0x4;
        } else if (arg1 > 217) {
            arg2 >>= 0x3;
        } else if (arg1 > 192) {
            arg2 >>= 0x2;
        } else if (arg1 > 179) {
            arg2 >>= 0x1;
        }
        if (arg0 != -19925) {
            field1173 = 66;
        }
        return ((arg3 >> 2 & 0x3F) << 10) + (arg2 >> 5 << 7) + (arg1 >> 1);
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIILhl;)Lci;", line = 141)
    public final class442 method702(int arg0, int arg1, int arg2, int arg3, int arg4, class219 arg5) {
        field1175++;
        if (arg4 != 0) {
            this.method697(-81, (byte) 76);
        }
        class251[] var7 = null;
        class441 var8 = this.method700(29, arg2);
        if (var8.field6269 != null) {
            var7 = new class251[var8.field6269.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class373 var10 = arg5.method1512(var8.field6269[var9], (byte) -73);
                var7[var9] = new class251(var10.field5129, var10.field5136, var10.field5130, var10.field5132, var10.field5131, var10.field5133, var10.field5126, var10.field5140);
            }
        }
        return new class442(var8.field6260, var7, var8.field6268, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 175)
    public class82(class280 arg0, int arg1, class435 arg2) {
        this.field1178 = arg2;
        this.field1178.method2638(1, 29);
    }
}
