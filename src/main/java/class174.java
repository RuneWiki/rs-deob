import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class174 implements class319 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "I")
    public static int field2579 = 0;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!cl", name = "n", descriptor = "S")
    public static short field2590;

    @OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!cl", name = "o", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public int field2582;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public int field2586;

    @OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "Z")
    public boolean field2581;

    static {
        new class466("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field2587 = 0;
        field2588 = 0;
        field2590 = 205;
        field2592 = 0;
        field2591 = 0;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1126(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        field2585++;
        int var3 = (var2 >>> 2 & 0x33333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg0 == -24425) {
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return -69;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)J", line = 50)
    public final long method1127(int arg0) {
        field2584++;
        long[] var2 = class272.field3753;
        long var3 = -1L;
        if (arg0 >= -26) {
            this.method1127(-85);
        }
        long var5 = var2[(int) ((var3 ^ (long) this.field2586) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field2580 >> 8) ^ var5) & 0xFFL)];
        long var9 = var2[(int) ((var7 ^ (long) this.field2580) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field2583 >> 24)) & 0xFFL)];
        long var13 = var2[(int) ((var11 ^ (long) (this.field2583 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field2583 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field2583 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field2577 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field2582 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) (((long) (this.field2582 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field2582 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field2582 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field2589 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field2581 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lsl;I)Z", line = 90)
    public final boolean method1128(class319 arg0, int arg1) {
        if (arg1 != 20963) {
            field2591 = 86;
        }
        field2578++;
        if (!(arg0 instanceof class174)) {
            return false;
        }
        class174 var3 = (class174) arg0;
        if (this.field2586 != var3.field2586) {
            return false;
        } else if (this.field2580 != var3.field2580) {
            return false;
        } else if (this.field2583 != var3.field2583) {
            return false;
        } else if (this.field2577 != var3.field2577) {
            return false;
        } else if (this.field2582 != var3.field2582) {
            return false;
        } else if (this.field2589 == var3.field2589) {
            return this.field2581 == var3.field2581;
        } else {
            return false;
        }
    }
}
