import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class289 implements class272 {

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public static int field3695 = 0;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "[I")
    public static int[] field3692 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public static int field3694 = 100;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public int field3684;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public int field3687;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "I")
    public int field3690;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public int field3691;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "Z")
    public boolean field3688;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public static void method1703(int arg0) {
        field3692 = null;
        if (arg0 != 6) {
            method1703(43);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ILhf;)Z")
    public final boolean method1611(int arg0, class272 arg1) {
        field3686++;
        if (!(arg1 instanceof class289)) {
            return false;
        }
        if (arg0 >= -2) {
            this.method1612((byte) 31);
        }
        class289 var3 = (class289) arg1;
        if (this.field3687 != var3.field3687) {
            return false;
        } else if (this.field3684 != var3.field3684) {
            return false;
        } else if (this.field3690 != var3.field3690) {
            return false;
        } else if (this.field3693 != var3.field3693) {
            return false;
        } else if (this.field3691 != var3.field3691) {
            return false;
        } else if (this.field3683 == var3.field3683) {
            return var3.field3688 == this.field3688;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)J")
    public final long method1612(byte arg0) {
        field3689++;
        long[] var2 = class329.field4158;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field3687 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field3684 >> 8)) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field3684 ^ var7) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field3690 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field3690 >> 16)) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field3690 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field3690) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field3693) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field3691 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field3691 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        if (arg0 == 66) {
            long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field3691 >> 8) ^ var23) & 0xFFL)];
            long var27 = var2[(int) (((long) this.field3691 ^ var25) & 0xFFL)] ^ var25 >>> 8;
            long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field3683 ^ var27) & 0xFFL)];
            return var29 >>> 8 ^ var2[(int) (((long) (this.field3688 ? 1 : 0) ^ var29) & 0xFFL)];
        } else {
            return 119L;
        }
    }

    static {
        new class335("Adventurer", "Abenteurer", "Aventurier", "Aventureiro");
    }
}
