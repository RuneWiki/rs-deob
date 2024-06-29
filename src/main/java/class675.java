import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class675 implements class23 {

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "Lmo;")
    public static class361 field9604 = new class361("LOCAL", 4);

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field9594;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public int field9595;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public int field9596;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field9598;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public int field9599;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field9600;

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "I")
    public int field9601;

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "I")
    public int field9602;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public int field9603;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Z")
    public boolean field9597;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 3)
    public static final void method3841(int arg0) {
        if (arg0 <= 106) {
            field9604 = null;
        }
        class253.field3318.method3063((byte) -23);
        field9606++;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIII)Lto;", line = 16)
    public static final class229 method3842(byte arg0, int arg1, int arg2, int arg3) {
        field9598++;
        class229 var4 = null;
        if (arg0 >= -91) {
            method3842((byte) -16, -92, -117, -36);
        }
        if (arg1 == 0) {
            var4 = class97.method550(class71.field841, false, class305.field4082);
            class375.field4970++;
        }
        if (arg1 == 1) {
            var4 = class97.method550(class71.field841, false, class52.field666);
            class113.field1435++;
        }
        var4.field2971.method959((byte) -32, class643.field8914.method2106((byte) -109, 82) ? 1 : 0);
        var4.field2971.method946((byte) -77, arg3 + class4.field23);
        var4.field2971.method921(arg2 + class125.field1745, 103);
        class502.field6926 = arg3;
        class508.field7011 = false;
        class387.field5165 = arg2;
        class326.method1896(-3379);
        return var4;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)J", line = 50)
    public final long method138(byte arg0) {
        field9605++;
        long[] var2 = class702.field9873;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field9602) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field9596 >> 8)) & 0xFFL)];
        long var9 = var2[(int) ((var7 ^ (long) this.field9596) & 0xFFL)] ^ var7 >>> 8;
        if (arg0 != 8) {
            return 45L;
        }
        long var11 = var2[(int) ((var9 ^ (long) (this.field9599 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field9599 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field9599 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field9599 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field9601 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field9595 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field9595 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field9595 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field9595) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field9603) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field9597 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BLdc;)Z", line = 84)
    public final boolean method137(byte arg0, class23 arg1) {
        field9600++;
        if (!(arg1 instanceof class675)) {
            return false;
        }
        class675 var3 = (class675) arg1;
        if (this.field9602 != var3.field9602) {
            return false;
        } else if (this.field9596 != var3.field9596) {
            return false;
        } else if (this.field9599 != var3.field9599) {
            return false;
        } else if (this.field9601 == var3.field9601) {
            if (arg0 != -33) {
                method3843(71);
            }
            if (this.field9595 != var3.field9595) {
                return false;
            } else if (this.field9603 == var3.field9603) {
                return this.field9597 == var3.field9597;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V", line = 125)
    public static void method3843(int arg0) {
        if (arg0 != -1289729144) {
            field9604 = null;
        }
        field9604 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZIIZ)Lga;", line = 140)
    public static final class332 method3844(boolean arg0, int arg1, int arg2, boolean arg3) {
        field9594++;
        if (!arg0) {
            method3843(-125);
        }
        class485 var4 = null;
        if (class495.field6817 != null) {
            var4 = new class485(arg1, class495.field6817, class688.field9718[arg1], 1000000);
        }
        class244.field3196[arg1] = class157.field2202.method1791(class576.field7858, var4, 0, arg1);
        class244.field3196[arg1].method3572(16383);
        return new class332(class244.field3196[arg1], arg3, arg2);
    }
}
