import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class228 implements class431 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public int field3269;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public int field3272;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public int field3273;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public int field3274;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "Z")
    public boolean field3276;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method1563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class367 var7 = new class367();
        var7.field5642 = arg1 >> class386.field5882;
        var7.field5652 = arg2 >> class386.field5882;
        var7.field5640 = arg3 >> class386.field5882;
        var7.field5646 = arg4 >> class386.field5882;
        var7.field5649 = arg0;
        var7.field5657 = arg1;
        var7.field5644 = arg2;
        var7.field5648 = arg3;
        var7.field5650 = arg4;
        var7.field5638 = arg5;
        var7.field5653 = arg6;
        class313.field4787[class399.field6089++] = var7;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)Z", line = 23)
    public static final boolean method1564(int arg0, int arg1) {
        int var2 = -98 / ((47 - arg0) / 44);
        field3270++;
        return arg1 == 2 || arg1 == 3;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)J", line = 33)
    public final long method1565(int arg0) {
        field3277++;
        long[] var2 = class94.field1364;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field3272 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field3271 >> 8)) & 0xFFL)];
        long var9 = var2[(int) ((var7 ^ (long) this.field3271) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field3269 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field3269 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field3269 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field3269) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field3274 ^ var17) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field3267 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field3267 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field3267 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field3267) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field3273 ^ var27) & 0xFFL)];
        long var31 = var2[(int) (((long) (this.field3276 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
        if (arg0 <= 39) {
            this.field3272 = 55;
        }
        return var31;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIII)V", line = 63)
    public static final void method1566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class202.field2843 != null) {
            class202.field2843[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class518.field7684 != null) {
            class518.field7684[arg0][arg1] = (byte) (arg3 >> 3);
        }
        if (class482.field7024 != null) {
            class482.field7024[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILdt;)Z", line = 77)
    public final boolean method1567(int arg0, class431 arg1) {
        field3275++;
        if (!(arg1 instanceof class228)) {
            return false;
        }
        class228 var3 = (class228) arg1;
        if (this.field3272 != var3.field3272) {
            return false;
        }
        if (arg0 != 23620) {
            this.method1567(-3, null);
        }
        if (this.field3271 != var3.field3271) {
            return false;
        } else if (this.field3269 != var3.field3269) {
            return false;
        } else if (this.field3274 != var3.field3274) {
            return false;
        } else if (this.field3267 != var3.field3267) {
            return false;
        } else if (this.field3273 == var3.field3273) {
            return this.field3276 == var3.field3276;
        } else {
            return false;
        }
    }
}
