import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class485 implements class172 {

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Ljo;")
    public static class351 field6878 = new class351(14, 8);

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "[Ldu;")
    public static class373[] field6881 = new class373[37];

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "Ljo;")
    public static class351 field6882 = new class351(25, -1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field6869;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field6870;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public int field6871;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field6872;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public int field6875;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public int field6876;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public int field6877;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Z")
    public boolean field6879;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "[Lqda;")
    public static class112[] field6880;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)J", line = 7)
    public final long method1302(byte arg0) {
        field6874++;
        long[] var2 = class77.field1030;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field6876) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field6877 >> 8) ^ var5) & 0xFFL)];
        if (arg0 != 87) {
            field6880 = null;
        }
        long var9 = var2[(int) (((long) this.field6877 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field6869 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field6869 >> 16) ^ var11) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field6869 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field6869) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field6875) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field6870 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field6870 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field6870 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field6870) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field6871 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) (((long) (this.field6879 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V", line = 37)
    public static void method2834(byte arg0) {
        field6881 = null;
        field6882 = null;
        if (arg0 <= 121) {
            method2834((byte) -36);
        }
        field6878 = null;
        field6880 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILpha;)Z", line = 50)
    public final boolean method1303(int arg0, class172 arg1) {
        field6873++;
        if (!(arg1 instanceof class485)) {
            return false;
        }
        int var3 = -28 % ((36 - arg0) / 43);
        class485 var4 = (class485) arg1;
        if (this.field6876 != var4.field6876) {
            return false;
        } else if (this.field6877 != var4.field6877) {
            return false;
        } else if (this.field6869 != var4.field6869) {
            return false;
        } else if (this.field6875 != var4.field6875) {
            return false;
        } else if (this.field6870 != var4.field6870) {
            return false;
        } else if (this.field6871 == var4.field6871) {
            return this.field6879 == var4.field6879;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I[FFIIIFF[FIIIII)V", line = 97)
    public static final void method2835(int arg0, float[] arg1, float arg2, int arg3, int arg4, int arg5, float arg6, float arg7, float[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int var14 = arg11 - arg0;
        field6872++;
        int var15 = arg10 - arg4;
        int var16 = arg9 - arg12;
        float var17 = arg8[2] * (float) var14 + arg8[1] * (float) var15 + arg8[0] * (float) var16;
        float var18 = arg8[5] * (float) var14 + arg8[4] * (float) var15 + arg8[3] * (float) var16;
        float var19 = arg8[8] * (float) var14 + arg8[7] * (float) var15 + arg8[6] * (float) var16;
        float var20;
        float var21;
        if (arg5 == 0) {
            var20 = arg2 + 0.5F - var19;
            var21 = arg7 + var17 + 0.5F;
        } else if (arg5 == 1) {
            var20 = arg2 + var19 + 0.5F;
            var21 = arg7 + var17 + 0.5F;
        } else if (arg5 == 2) {
            var21 = arg7 + 0.5F - var17;
            var20 = arg6 + 0.5F - var18;
        } else if (arg5 == 3) {
            var21 = arg7 + var17 + 0.5F;
            var20 = arg6 + 0.5F - var18;
        } else if (arg5 == 4) {
            var21 = arg2 + var19 + 0.5F;
            var20 = arg6 + 0.5F - var18;
        } else {
            var20 = arg6 + 0.5F - var18;
            var21 = arg2 + 0.5F - var19;
        }
        if (arg3 == 1) {
            float var22 = var21;
            var21 = -var20;
            var20 = var22;
        } else if (arg3 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg3 == 3) {
            float var23 = var21;
            var21 = var20;
            var20 = -var23;
        }
        arg1[0] = var21;
        arg1[1] = var20;
        if (arg13 < 42) {
            field6882 = null;
        }
    }
}
