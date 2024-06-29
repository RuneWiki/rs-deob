import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class322 extends class326 {

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    private int field4286 = -1;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "Lh;")
    public static class434 field4290 = new class434(65, 5);

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "[I")
    public static int[] field4293;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public int field4283;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "[I")
    public int[] field4287;

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class322() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III[B)I")
    public static final int method1785(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field4282;
        int var4 = -1;
        if (arg2 != -806) {
            method1790((byte) 114, (String) null);
        }
        for (int var5 = arg1; ~arg0 < ~var5; ++var5) {
            var4 = class15.field209[(arg3[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILbt;I)V")
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field4288;
        if (arg2 > -3) {
            this.field4283 = -83;
        }
        if (~arg0 == -1) {
            this.field4286 = arg1.method215((byte) 95);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLjava/lang/String;)J")
    public static final long method1786(boolean arg0, String arg1) {
        ++field4291;
        int var2 = arg1.length();
        long var3 = 0L;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            var3 = (var3 << 5) - (var3 + -((long) arg1.charAt(var5)));
        }
        if (!arg0) {
            field4290 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)Z")
    public final boolean method1787(int arg0) {
        ++field4289;
        if (this.field4287 != null) {
            return true;
        } else {
            if (arg0 != 9395) {
                this.method1788(30);
            }
            if (this.field4286 >= 0) {
                class325 var2 = ~class40.field578 <= -1 ? class325.method1817(class462.field6255, class40.field578, this.field4286) : class325.method1811(class462.field6255, this.field4286);
                var2.method1816();
                this.field4287 = var2.method1820();
                this.field4294 = var2.field4333;
                this.field4283 = var2.field4331;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method117(int arg0) {
        super.method117(arg0);
        ++field4280;
        this.field4287 = null;
        if (arg0 != 3) {
            field4292 = -63;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)I")
    public final int method1788(int arg0) {
        ++field4284;
        if (arg0 != -1) {
            field4293 = null;
        }
        return this.field4286;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(Z)V")
    public static void method1789(boolean arg0) {
        field4293 = null;
        field4290 = null;
        if (arg0) {
            field4290 = null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)[[I")
    public int[][] method48(int arg0, byte arg1) {
        if (arg1 > -52) {
            this.field4286 = 21;
        }
        ++field4285;
        int[][] var3 = super.field4343.method2356(arg0, 115);
        if (super.field4343.field5336 && this.method1787(9395)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field4283 * (~class27.field359 == ~this.field4294 ? arg0 : this.field4294 * arg0 / class27.field359);
            if (~class181.field2495 == ~this.field4283) {
                for (int var8 = 0; var8 < class181.field2495; ++var8) {
                    int var9 = this.field4287[var7++];
                    var6[var8] = class99.method612(var9, 255) << 4;
                    var5[var8] = class99.method612(4080, var9 >> 4);
                    var4[var8] = class99.method612(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class181.field2495; ++var10) {
                    int var11 = this.field4283 * var10 / class181.field2495;
                    int var12 = this.field4287[var7 - -var11];
                    var6[var10] = class99.method612(255, var12) << 4;
                    var5[var10] = class99.method612(4080, var12 >> 4);
                    var4[var10] = class99.method612(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1790(byte arg0, String arg1) {
        ++field4281;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (~var6 <= -66 && ~var6 >= -91) {
                var2 += (long) (var6 + 1 + -65);
            } else if (var6 >= 'a' && ~var6 >= -123) {
                var2 += (long) (-96 - -var6);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (long) (var6 + -48 + 27);
            }
            if (~var2 <= -177917621779460414L) {
                break;
            }
        }
        if (arg0 <= 110) {
            method1789(false);
        }
        while (var2 % 37L == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    static {
        new class206((String) null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", (String) null, (String) null);
        field4293 = new int[25];
    }
}
