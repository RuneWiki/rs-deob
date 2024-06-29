import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class34 extends class115 {

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    private int field495 = -1;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[S")
    public static short[] field494 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ec", name = "L", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!ec", name = "M", descriptor = "I")
    public int field487;

    @OriginalMember(owner = "client!ec", name = "N", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ec", name = "O", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ec", name = "P", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ec", name = "Q", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "client!ec", name = "R", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "[I")
    public int[] field485;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)[[I")
    public int[][] method235(int arg0, int arg1) {
        if (arg0 > -33) {
            this.field491 = 66;
        }
        ++field490;
        int[][] var3 = super.field1716.method6(arg1, (byte) -109);
        if (super.field1716.field23 && this.method240(true)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = this.field491 * (~class192.field2753 == ~this.field487 ? arg1 : this.field487 * arg1 / class192.field2753);
            if (~class77.field1178 == ~this.field491) {
                for (int var8 = 0; ~class77.field1178 < ~var8; ++var8) {
                    int var9 = this.field485[var7++];
                    var6[var8] = class184.method1188(var9, 255) << 4;
                    var4[var8] = class184.method1188(4080, var9 >> 4);
                    var5[var8] = class184.method1188(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class77.field1178; ++var10) {
                    int var11 = this.field491 * var10 / class77.field1178;
                    int var12 = this.field485[var7 + var11];
                    var6[var10] = class184.method1188(4080, var12 << 4);
                    var4[var10] = class184.method1188(var12 >> 4, 4080);
                    var5[var10] = class184.method1188(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(II)Ljb;")
    public static final class25 method236(int arg0, int arg1) {
        ++field493;
        class25 var2 = (class25) class187.field2659.method1501((long) arg0, (byte) -112);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class236.field3557.method1538(arg0, 0, (byte) 101);
            if (var3 == null) {
                return null;
            } else {
                class25 var4 = new class25();
                class114 var5 = new class114(var3);
                var5.field1673 = var5.field1629.length + -2;
                int var6 = var5.method756(-29901);
                int var7 = -var6 + -12 + var5.field1629.length - 2;
                var5.field1673 = var7;
                int var8 = var5.method759((byte) 112);
                var4.field326 = var5.method756(-29901);
                int var9 = 51 % ((27 - arg1) / 48);
                var4.field329 = var5.method756(-29901);
                var4.field333 = var5.method756(-29901);
                var4.field337 = var5.method756(-29901);
                int var10 = var5.method760(false);
                if (~var10 < -1) {
                    var4.field343 = new class190[var10];
                    for (int var11 = 0; ~var11 > ~var10; ++var11) {
                        int var12 = var5.method756(-29901);
                        class190 var13 = new class190(class5.method58(var12, (byte) -88));
                        var4.field343[var11] = var13;
                        while (~(var12--) < -1) {
                            int var14 = var5.method759((byte) 98);
                            int var15 = var5.method759((byte) 110);
                            var13.method1215(new class64(var15), -97, (long) var14);
                        }
                    }
                }
                var5.field1673 = 0;
                var4.field344 = var5.method745(false);
                var4.field325 = new int[var8];
                var4.field330 = new String[var8];
                var4.field328 = new int[var8];
                int var16 = 0;
                while (var5.field1673 < var7) {
                    int var17 = var5.method756(-29901);
                    if (var17 == 3) {
                        var4.field330[var16] = var5.method753(-128).intern();
                    } else if (var17 < 100 && ~var17 != -22 && var17 != 38 && var17 != 39) {
                        var4.field328[var16] = var5.method759((byte) 119);
                    } else {
                        var4.field328[var16] = var5.method760(false);
                    }
                    var4.field325[var16++] = var17;
                }
                class187.field2659.method1499((long) arg0, -118, var4);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public static void method237(int arg0) {
        int var1 = -104 % ((arg0 - 27) / 45);
        field494 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 != -1) {
            this.method168(-99, (class114) null, 0);
        }
        if (arg2 == 0) {
            this.field495 = arg1.method756(-29901);
        }
        ++field486;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)V")
    public static final void method238(int arg0, int arg1, boolean arg2) {
        ++field497;
        if (arg2) {
            method237(-98);
        }
        class270 var3 = class190.method1213(25702, arg0, 12);
        var3.method1808((byte) 62);
        var3.field4226 = arg1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public final void method239(byte arg0) {
        ++field489;
        super.method239(arg0);
        this.field485 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)Z")
    public final boolean method240(boolean arg0) {
        ++field488;
        if (this.field485 != null) {
            return true;
        } else if (!arg0) {
            return true;
        } else if (~this.field495 <= -1) {
            class244 var2 = ~class245.field3665 > -1 ? class256.method1717((byte) 127, this.field495, class264.field3977) : class82.method546((byte) -20, class245.field3665, class264.field3977, this.field495);
            var2.method1594();
            this.field487 = var2.field1084;
            this.field485 = var2.field3663;
            this.field491 = var2.field1075;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)I")
    public final int method241(int arg0) {
        int var2 = -76 % ((arg0 - -70) / 48);
        ++field496;
        return this.field495;
    }
}
