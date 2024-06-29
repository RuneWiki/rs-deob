import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class414 implements class75 {

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5841 = null;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field5845 = 0;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "[I")
    public static int[] field5849 = null;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public int field5836;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public int field5839;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public int field5843;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!gs", name = "o", descriptor = "I")
    public int field5850;

    @OriginalMember(owner = "client!gs", name = "p", descriptor = "I")
    public static int field5851;

    @OriginalMember(owner = "client!gs", name = "q", descriptor = "I")
    public int field5852;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "Z")
    public boolean field5840;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)J")
    public final long method556(int arg0) {
        field5844++;
        long[] var2 = class364.field5171;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field5836) & 0xFFL)] ^ var3 >>> 8;
        int var7 = 118 / ((-arg0 - 5) / 34);
        long var8 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field5852 >> 8)) & 0xFFL)];
        long var10 = var2[(int) (((long) this.field5852 ^ var8) & 0xFFL)] ^ var8 >>> 8;
        long var12 = var10 >>> 8 ^ var2[(int) ((var10 ^ (long) (this.field5843 >> 24)) & 0xFFL)];
        long var14 = var2[(int) ((var12 ^ (long) (this.field5843 >> 16)) & 0xFFL)] ^ var12 >>> 8;
        long var16 = var2[(int) ((var14 ^ (long) (this.field5843 >> 8)) & 0xFFL)] ^ var14 >>> 8;
        long var18 = var2[(int) ((var16 ^ (long) this.field5843) & 0xFFL)] ^ var16 >>> 8;
        long var20 = var18 >>> 8 ^ var2[(int) ((var18 ^ (long) this.field5838) & 0xFFL)];
        long var22 = var20 >>> 8 ^ var2[(int) ((var20 ^ (long) (this.field5850 >> 24)) & 0xFFL)];
        long var24 = var2[(int) (((long) (this.field5850 >> 16) ^ var22) & 0xFFL)] ^ var22 >>> 8;
        long var26 = var24 >>> 8 ^ var2[(int) ((var24 ^ (long) (this.field5850 >> 8)) & 0xFFL)];
        long var28 = var2[(int) ((var26 ^ (long) this.field5850) & 0xFFL)] ^ var26 >>> 8;
        long var30 = var28 >>> 8 ^ var2[(int) (((long) this.field5839 ^ var28) & 0xFFL)];
        return var2[(int) ((var30 ^ (long) (this.field5840 ? 1 : 0)) & 0xFFL)] ^ var30 >>> 8;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Z")
    public static final boolean method2453(int arg0, int arg1, int arg2) {
        if (arg1 <= 99) {
            method2453(-124, -124, -62);
        }
        field5837++;
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lqq;I)Z")
    public final boolean method555(class75 arg0, int arg1) {
        field5851++;
        if (!(arg0 instanceof class414)) {
            return false;
        }
        if (arg1 > -65) {
            this.field5850 = -19;
        }
        class414 var3 = (class414) arg0;
        if (this.field5836 != var3.field5836) {
            return false;
        } else if (this.field5852 != var3.field5852) {
            return false;
        } else if (this.field5843 != var3.field5843) {
            return false;
        } else if (this.field5838 != var3.field5838) {
            return false;
        } else if (this.field5850 != var3.field5850) {
            return false;
        } else if (this.field5839 == var3.field5839) {
            return this.field5840 == var3.field5840;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(FIIFBFIFIFLhm;)[B")
    public static final byte[] method2454(float arg0, int arg1, int arg2, float arg3, byte arg4, float arg5, int arg6, float arg7, int arg8, float arg9, class229 arg10) {
        field5846++;
        if (arg4 != 17) {
            method2455((byte) 100);
        }
        byte[] var11 = new byte[arg1 * arg2 * arg6];
        class89.method617(arg3, arg5, arg6, arg0, 0, arg8, arg10, 0, arg7, var11, arg2, arg1, arg9);
        return var11;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V")
    public static void method2455(byte arg0) {
        int var1 = 76 / ((-arg0 - 47) / 59);
        field5841 = null;
        field5849 = null;
    }
}
