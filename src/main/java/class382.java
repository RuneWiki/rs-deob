import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class382 implements class103 {

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field5593 = 0;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "J")
    public static long field5596 = 0L;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "[I")
    public static int[] field5604 = new int[256];

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5605;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public int field5592;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public int field5595;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public int field5598;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public int field5599;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public int field5600;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public int field5602;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field5603;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Z")
    public boolean field5597;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5604[var0] = var1;
        }
        field5605 = "purple:";
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(II)Z", line = 7)
    public static final boolean method2486(int arg0, int arg1) {
        if (arg0 == -1759919544) {
            field5601++;
            return (arg1 & -arg1) == arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lbc;I)Z", line = 20)
    public final boolean method781(class103 arg0, int arg1) {
        field5594++;
        if (!(arg0 instanceof class382)) {
            return false;
        }
        class382 var3 = (class382) arg0;
        if (this.field5599 != var3.field5599) {
            return false;
        } else if (this.field5602 != var3.field5602) {
            return false;
        } else if (this.field5595 != var3.field5595) {
            return false;
        } else if (this.field5598 != var3.field5598) {
            return false;
        } else if (this.field5600 != var3.field5600) {
            return false;
        } else if (this.field5592 != var3.field5592) {
            return false;
        } else if (this.field5597 == var3.field5597) {
            return arg1 == -30499;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)J", line = 65)
    public final long method782(byte arg0) {
        field5603++;
        long[] var2 = class420.field6106;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field5599 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field5602 >> 8)) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field5602 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field5595 >> 24)) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field5595 >> 16) ^ var11) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field5595 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field5595) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field5598 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field5600 >> 24) ^ var19) & 0xFFL)];
        int var23 = 42 / ((14 - arg0) / 51);
        long var24 = var21 >>> 8 ^ var2[(int) (((long) (this.field5600 >> 16) ^ var21) & 0xFFL)];
        long var26 = var2[(int) (((long) (this.field5600 >> 8) ^ var24) & 0xFFL)] ^ var24 >>> 8;
        long var28 = var2[(int) (((long) this.field5600 ^ var26) & 0xFFL)] ^ var26 >>> 8;
        long var30 = var28 >>> 8 ^ var2[(int) ((var28 ^ (long) this.field5592) & 0xFFL)];
        return var30 >>> 8 ^ var2[(int) (((long) (this.field5597 ? 1 : 0) ^ var30) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(B)V", line = 99)
    public static void method2487(byte arg0) {
        if (arg0 >= -29) {
            method2487((byte) -52);
        }
        field5605 = null;
        field5604 = null;
    }
}
