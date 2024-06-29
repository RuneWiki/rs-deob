import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class10 {

    @OriginalMember(owner = "mapview!a", name = "s", descriptor = "[B")
    public byte[] field4;

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "I")
    public int field1;

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "I")
    public static int field2 = 0;

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "Lia;")
    public static class15 field3 = class28.method196("Fur Trader", false);

    @OriginalMember(owner = "mapview!a", name = "t", descriptor = "Lia;")
    public static class15 field5 = class28.method196("(U", false);

    @OriginalMember(owner = "mapview!a", name = "u", descriptor = "[Lda;")
    public static class7[] field6;

    @OriginalMember(owner = "mapview!a", name = "d", descriptor = "(I)I", line = 10)
    public final int method1(int arg0) {
        this.field1 += 2;
        if (arg0 != -1119584920) {
            field2 = -116;
        }
        return ((this.field4[this.field1 - 2] & 0xFF) << 8) + (this.field4[this.field1 - 1] & 0xFF);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z)Lia;", line = 30)
    public final class15 method2(boolean arg0) {
        int var2 = this.field1;
        while (this.field4[this.field1++] != 0) {
        }
        if (arg0) {
            this.method3(null, -6, -88, 16);
        }
        return class17.method136(this.field4, this.field1 - var2 - 1, var2, 31818);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([IIII)V", line = 45)
    public final void method3(int[] arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field1;
        this.field1 = arg1;
        if (arg2 != 255) {
            this.method5(-36);
        }
        int var6 = (arg3 - arg1) / 8;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = -1640531527;
            int var9 = -957401312;
            int var10 = this.method7(18811);
            int var11 = this.method7(18811);
            int var12 = 32;
            while (var12-- > 0) {
                var11 -= var9 + arg0[var9 >>> 11 & 0x43E00003] ^ (var10 << 4 ^ var10 >>> 5) + var10;
                var9 -= var8;
                var10 -= arg0[var9 & 0x3] + var9 ^ (var11 << 4 ^ var11 >>> 5) + var11;
            }
            this.field1 -= 8;
            this.method4(var10, (byte) 69);
            this.method4(var11, (byte) 69);
        }
        this.field1 = var5;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(IB)V", line = 107)
    public final void method4(int arg0, byte arg1) {
        this.field4[this.field1++] = (byte) (arg0 >> 24);
        this.field4[this.field1++] = (byte) (arg0 >> 16);
        this.field4[this.field1++] = (byte) (arg0 >> 8);
        if (arg1 != 69) {
            this.method2(false);
        }
        this.field4[this.field1++] = (byte) arg0;
    }

    @OriginalMember(owner = "mapview!a", name = "e", descriptor = "(I)I", line = 135)
    public final int method5(int arg0) {
        if (arg0 != -2) {
            this.field1 = -41;
        }
        return this.field4[this.field1++] & 0xFF;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "([BIII)V", line = 156)
    public final void method6(byte[] arg0, int arg1, int arg2, int arg3) {
        for (int var5 = arg2; var5 < arg2 + arg3; var5++) {
            arg0[var5] = this.field4[this.field1++];
        }
        if (arg1 != 128) {
            field6 = null;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "(I)I", line = 171)
    public final int method7(int arg0) {
        this.field1 += 4;
        return arg0 == 18811 ? (this.field4[this.field1 - 1] & 0xFF) + (((this.field4[this.field1 - 4] & 0xFF) << 24) + ((this.field4[this.field1 - 3] & 0xFF) << 16) + ((this.field4[this.field1 + -2] & 0xFF) << 8)) : 122;
    }

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "(I)V", line = 188)
    public static void method8(int arg0) {
        field5 = null;
        if (arg0 < 61) {
            method8(-115);
        }
        field6 = null;
        field3 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "(I)V", line = 213)
    public class1(int arg0) {
        this.field4 = class29.method199(arg0, -1);
        this.field1 = 0;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)V", line = 250)
    public final void method9(int arg0, int arg1) {
        if (arg1 == -268435456) {
            this.field4[this.field1++] = (byte) arg0;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(B)I", line = 265)
    public final int method10(byte arg0) {
        this.field1 += 3;
        return arg0 == 50 ? ((this.field4[this.field1 - 2] & 0xFF) << 8) + (((this.field4[this.field1 - 3] & 0xFF) << 16) + (this.field4[this.field1 - 1] & 0xFF)) : 71;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(Z)B", line = 286)
    public final byte method11(boolean arg0) {
        if (!arg0) {
            this.method3(null, -112, 99, -99);
        }
        return this.field4[this.field1++];
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "([B)V", line = 308)
    public class1(byte[] arg0) {
        this.field4 = arg0;
        this.field1 = 0;
    }
}
