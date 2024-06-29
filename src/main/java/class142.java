import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class142 implements class288 {

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field2344 = 0;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public int field2338;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public int field2341;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "Z")
    public boolean field2334;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)J")
    public final long method1048(byte arg0) {
        field2336++;
        long[] var2 = class397.field6075;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field2346 ^ var3) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field2338 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        if (arg0 != -2) {
            return 77L;
        }
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field2338 ^ var7) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field2341 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field2341 >> 16)) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field2341 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field2341) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field2340) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field2343 >> 24) ^ var19) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field2343 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field2343 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field2343) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field2339 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field2334 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIZBI)V")
    public static final void method1049(int arg0, int arg1, boolean arg2, byte arg3, int arg4) {
        field2337++;
        class309.field4905 = 0L;
        int var5 = class287.method1865((byte) -46);
        if (arg1 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (!class305.field4873.method833()) {
            arg2 = true;
        }
        if (arg3 > -86) {
            field2345 = -122;
        }
        class374.method2362(arg2, arg1, arg0, 2, var5, arg4);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILmb;)Z")
    public final boolean method1050(int arg0, class288 arg1) {
        field2335++;
        if (!(arg1 instanceof class142)) {
            return false;
        }
        class142 var3 = (class142) arg1;
        if (this.field2346 != var3.field2346) {
            return false;
        } else if (this.field2338 != var3.field2338) {
            return false;
        } else if (this.field2341 != var3.field2341) {
            return false;
        } else if (this.field2340 != var3.field2340) {
            return false;
        } else if (this.field2343 != var3.field2343) {
            return false;
        } else if (this.field2339 == var3.field2339) {
            if (arg0 != -11064) {
                this.field2340 = 107;
            }
            return this.field2334 == var3.field2334;
        } else {
            return false;
        }
    }
}
