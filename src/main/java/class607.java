import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class607 implements class132 {

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "Lfh;")
    public static class653 field8433 = new class653();

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field8426;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field8427;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public int field8428;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public int field8434;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "I")
    public static int field8436;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
    public int field8437;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public int field8438;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public int field8440;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
    public int field8441;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field8442;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Lcaa;")
    public static class306 field8439;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "Z")
    public boolean field8435;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
    public static int[] field8430;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILhh;)Z")
    public final boolean method982(int arg0, class132 arg1) {
        field8432++;
        if (!(arg1 instanceof class607)) {
            return false;
        }
        class607 var3 = (class607) arg1;
        if (arg0 != -13408) {
            return false;
        } else if (this.field8438 != var3.field8438) {
            return false;
        } else if (this.field8441 != var3.field8441) {
            return false;
        } else if (this.field8428 != var3.field8428) {
            return false;
        } else if (this.field8434 != var3.field8434) {
            return false;
        } else if (this.field8437 != var3.field8437) {
            return false;
        } else if (this.field8440 == var3.field8440) {
            return this.field8435 == var3.field8435;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZZLjava/lang/String;Lnd;)Lgea;")
    public static final class76 method3418(boolean arg0, boolean arg1, String arg2, class547 arg3) {
        field8436++;
        if (!arg1) {
            method3420((byte) -74, 58);
        }
        int var4 = arg3.method3161((byte) -78, arg2);
        if (var4 == -1) {
            return new class76(0);
        }
        int[] var5 = arg3.method3181((byte) -98, var4);
        class76 var6 = new class76(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field1068) {
                class461 var9 = new class461(arg3.method3153(var5[var8++], 0, var4));
                int var10 = var9.method2622(-539564808);
                int var11 = var9.method2566(-2);
                int var12 = var9.method2600((byte) -128);
                if (!arg0 && var12 == 1) {
                    var6.field1068--;
                } else {
                    var6.field1067[var7] = var10;
                    var6.field1069[var7] = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method3419(int arg0) {
        if (arg0 > -45) {
            field8429 = -89;
        }
        field8430 = null;
        field8439 = null;
        field8433 = null;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)J")
    public final long method983(byte arg0) {
        field8431++;
        long[] var2 = class18.field329;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field8438) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field8441 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        int var9 = -112 / ((-arg0 - 10) / 44);
        long var10 = var7 >>> 8 ^ var2[(int) (((long) this.field8441 ^ var7) & 0xFFL)];
        long var12 = var2[(int) ((var10 ^ (long) (this.field8428 >> 24)) & 0xFFL)] ^ var10 >>> 8;
        long var14 = var2[(int) (((long) (this.field8428 >> 16) ^ var12) & 0xFFL)] ^ var12 >>> 8;
        long var16 = var14 >>> 8 ^ var2[(int) (((long) (this.field8428 >> 8) ^ var14) & 0xFFL)];
        long var18 = var16 >>> 8 ^ var2[(int) ((var16 ^ (long) this.field8428) & 0xFFL)];
        long var20 = var2[(int) (((long) this.field8434 ^ var18) & 0xFFL)] ^ var18 >>> 8;
        long var22 = var2[(int) ((var20 ^ (long) (this.field8437 >> 24)) & 0xFFL)] ^ var20 >>> 8;
        long var24 = var22 >>> 8 ^ var2[(int) (((long) (this.field8437 >> 16) ^ var22) & 0xFFL)];
        long var26 = var2[(int) (((long) (this.field8437 >> 8) ^ var24) & 0xFFL)] ^ var24 >>> 8;
        long var28 = var26 >>> 8 ^ var2[(int) ((var26 ^ (long) this.field8437) & 0xFFL)];
        long var30 = var28 >>> 8 ^ var2[(int) ((var28 ^ (long) this.field8440) & 0xFFL)];
        return var30 >>> 8 ^ var2[(int) (((long) (this.field8435 ? 1 : 0) ^ var30) & 0xFFL)];
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BI)I")
    public static final int method3420(byte arg0, int arg1) {
        field8442++;
        int var2 = -33 % ((arg0 - 56) / 43);
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }
}
