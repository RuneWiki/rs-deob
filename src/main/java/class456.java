import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class456 implements class611 {

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "[I")
    public static int[] field6573 = new int[32];

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public int field6574;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field6575;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public int field6576;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field6577;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public int field6581;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field6583;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public int field6584;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Z")
    public boolean field6582;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2668(int arg0) {
        class621.field8991 = true;
        if (arg0 != 255) {
            method2668(-4);
        }
        field6578++;
    }

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V", line = 19)
    public static void method2669(int arg0) {
        if (arg0 != 255) {
            field6573 = null;
        }
        field6573 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)J", line = 31)
    public final long method2670(byte arg0) {
        field6579++;
        long[] var2 = class187.field2528;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field6574) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field6577 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field6577 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field6581 >> 24)) & 0xFFL)];
        if (arg0 > -81) {
            return 127L;
        }
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field6581 >> 16) ^ var11) & 0xFFL)];
        long var15 = var2[(int) ((var13 ^ (long) (this.field6581 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field6581) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field6576) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field6584 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field6584 >> 16) ^ var21) & 0xFFL)];
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field6584 >> 8)) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field6584 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field6583) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field6582 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lpe;B)Z", line = 60)
    public final boolean method2671(class611 arg0, byte arg1) {
        field6575++;
        if (!(arg0 instanceof class456)) {
            return false;
        }
        class456 var3 = (class456) arg0;
        if (this.field6574 != var3.field6574) {
            return false;
        } else if (arg1 <= 38) {
            return true;
        } else if (this.field6577 != var3.field6577) {
            return false;
        } else if (this.field6581 != var3.field6581) {
            return false;
        } else if (this.field6576 != var3.field6576) {
            return false;
        } else if (this.field6584 != var3.field6584) {
            return false;
        } else if (this.field6583 == var3.field6583) {
            return var3.field6582 == this.field6582;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLhh;)Z", line = 107)
    public static final boolean method2672(byte arg0, class168 arg1) {
        field6580++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2369) {
            return false;
        } else if (!arg1.method1173(class55.field836, 83)) {
            return false;
        } else if (class568.field8272.method2002((byte) -110, (long) arg1.field2343) != null) {
            return false;
        } else if (class59.field956.method2002((byte) -117, (long) arg1.field2380) == null) {
            if (arg0 > -120) {
                field6573 = null;
            }
            return true;
        } else {
            return false;
        }
    }
}
