import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class23 extends class83 {

    @OriginalMember(owner = "client!fk", name = "N", descriptor = "I")
    private int field213 = 0;

    @OriginalMember(owner = "client!fk", name = "U", descriptor = "I")
    private int field220 = 0;

    @OriginalMember(owner = "client!fk", name = "Y", descriptor = "I")
    private int field224 = 1;

    @OriginalMember(owner = "client!fk", name = "K", descriptor = "Z")
    public static boolean field211 = true;

    @OriginalMember(owner = "client!fk", name = "V", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "Ljava/lang/String;")
    public static String field215 = "wave:";

    @OriginalMember(owner = "client!fk", name = "L", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!fk", name = "O", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!fk", name = "W", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!fk", name = "X", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)V", line = 9)
    public final void method120(boolean arg0) {
        ++field223;
        if (arg0) {
            field221 = 14;
        }
        class58.method316((byte) -16);
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(Z)V", line = 21)
    public static void method121(boolean arg0) {
        if (arg0) {
            field215 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(III)I", line = 37)
    public static final int method122(int arg0, int arg1, int arg2) {
        ++field219;
        class367 var3 = (class367) class106.field1305.method308((long) arg2, (byte) -100);
        if (arg0 >= -18) {
            field211 = false;
        }
        if (var3 == null) {
            return -1;
        } else {
            return ~arg1 <= -1 && arg1 < var3.field5141.length ? var3.field5141[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IBLtq;)V", line = 60)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        ++field216;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field224 = arg2.method1350(31351);
                }
            } else {
                this.field220 = arg2.method1350(31351);
            }
        } else {
            this.field213 = arg2.method1350(31351);
        }
        int var5 = 98 / ((-27 - arg1) / 50);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(II)I", line = 101)
    public static final int method123(int arg0, int arg1) {
        ++field218;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        if (arg0 != 11362) {
            method124(-117);
        }
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return arg1 & ~var7;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(II)[I", line = 125)
    public final int[] method37(int arg0, int arg1) {
        ++field212;
        if (arg0 != 2) {
            method123(-62, 84);
        }
        int[] var3 = super.field916.method1813(arg1, (byte) -121);
        if (super.field916.field4174) {
            int var4 = class225.field3036[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class420.field6139; ++var6) {
                int var7 = class402.field5863[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field213 == 0) {
                    var9 = (-var4 + var7) * this.field224;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field224 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & -4096);
                if (~this.field220 != -1) {
                    if (~this.field220 == -3) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class327.field4353[(var12 & 4094) >> 4] - -4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V", line = 194)
    public class23() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V", line = 204)
    public static final void method124(int arg0) {
        if (arg0 >= 0) {
            field222 = 84;
        }
        ++field214;
        int var1 = 0;
        for (int var2 = 0; class315.field4214 > var2; ++var2) {
            for (int var3 = 0; class340.field4549 > var3; ++var3) {
                if (class198.method1058(true, var3, true, var1, class176.field2209, var2)) {
                    ++var1;
                }
                if (~var1 <= -513) {
                    return;
                }
            }
        }
    }
}
