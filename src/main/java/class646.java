import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class646 implements class408 {

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "I")
    public static int field8887 = 0;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
    public int field8883;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public int field8884;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field8890;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
    public int field8891;

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "I")
    public int field8893;

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
    public int field8894;

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "I")
    public int field8895;

    @OriginalMember(owner = "client!nia", name = "n", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!nia", name = "o", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "Lin;")
    public static class91 field8886;

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "Z")
    public boolean field8892;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "[I")
    public static int[] field8885;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "[Lup;")
    public static class277[] field8889;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)V", line = 7)
    public static void method3669(int arg0) {
        if (arg0 != 1) {
            field8889 = null;
        }
        field8886 = null;
        field8885 = null;
        field8889 = null;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(III)Z", line = 27)
    public static final boolean method3670(int arg0, int arg1, int arg2) {
        field8897++;
        if (arg2 >= -3) {
            field8886 = null;
        }
        return class567.method3280((byte) -35, arg1, arg0) & (class497.method2931(arg0, arg1, 72) | (arg0 & 0x2000) != 0 | class338.method2137(arg1, (byte) 114, arg0));
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)J", line = 38)
    public final long method2534(byte arg0) {
        field8890++;
        long[] var2 = class438.field6253;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field8893) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field8894 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field8894) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field8891 >> 24)) & 0xFFL)];
        long var13 = var2[(int) (((long) (this.field8891 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field8891 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field8891) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field8895 ^ var17) & 0xFFL)];
        long var21 = var2[(int) ((var19 ^ (long) (this.field8884 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field8884 >> 16)) & 0xFFL)];
        if (arg0 < 46) {
            return -94L;
        } else {
            long var25 = var2[(int) ((var23 ^ (long) (this.field8884 >> 8)) & 0xFFL)] ^ var23 >>> 8;
            long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field8884 ^ var25) & 0xFFL)];
            long var29 = var2[(int) ((var27 ^ (long) this.field8883) & 0xFFL)] ^ var27 >>> 8;
            return var29 >>> 8 ^ var2[(int) (((long) (this.field8892 ? 1 : 0) ^ var29) & 0xFFL)];
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)V", line = 78)
    public static final void method3671(int arg0, int arg1) {
        field8888++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class667.field9109 = arg0;
        class322.field4446 = new class385[class338.field4761[class667.field9109] + 1];
        class533.field7337 = 0;
        if (arg1 >= -118) {
            method3671(-43, -71);
        }
        class347.field4864 = 0;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ILwe;)Z", line = 96)
    public final boolean method2535(int arg0, class408 arg1) {
        field8896++;
        if (!(arg1 instanceof class646)) {
            return false;
        }
        class646 var3 = (class646) arg1;
        if (this.field8893 != var3.field8893) {
            return false;
        } else if (arg0 <= 50) {
            return true;
        } else if (this.field8894 != var3.field8894) {
            return false;
        } else if (this.field8891 != var3.field8891) {
            return false;
        } else if (this.field8895 != var3.field8895) {
            return false;
        } else if (this.field8884 != var3.field8884) {
            return false;
        } else if (this.field8883 == var3.field8883) {
            return var3.field8892 == this.field8892;
        } else {
            return false;
        }
    }
}
