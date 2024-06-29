import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class461 extends class173 {

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "[[S")
    public short[][] field6008;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "D")
    public double field6006;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
    public static boolean field6003 = false;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "Luw;")
    public static class208 field6002 = new class208(2, -2);

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)J")
    public final long method2596(int arg0) {
        field6004++;
        return arg0 == -15493 ? (long) (this.field6008[0].length | this.field6008.length << 0) : -14L;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(II)Z")
    public static final boolean method2597(int arg0, int arg1) {
        if (arg1 != 12) {
            field6002 = null;
        }
        field6007++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lfda;I)V")
    public static final void method2598(class381 arg0, int arg1) {
        field6009++;
        if (arg0.field4661 == null && arg0.field4753 == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg1 != 1073741823) {
            field6002 = null;
        }
        while (arg0.field4661.length > var3) {
            int var4 = -1;
            if (arg0.field4661 != null) {
                var4 = arg0.field4661[var3];
            }
            if (var4 != -1) {
                label61: {
                    var2 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    int var9;
                    int var10;
                    if ((var4 & 0xC0000000) == -1073741824) {
                        int var13 = var4 & 0xFFFFFFF;
                        int var14 = var13 >> 14;
                        var10 = arg0.field2896 - ((var14 - class714.field9407) * 512 + 256);
                        int var15 = var13 & 0x3FFF;
                        var9 = arg0.field2900 - (-class240.field3293 + var15) * 512 - 256;
                    } else if ((var4 & 0x8000) == 0) {
                        class232 var11 = (class232) class444.field5811.method2616((long) var4, (byte) 31);
                        if (var11 == null) {
                            arg0.method2175(var3, 69, -1);
                            break label61;
                        }
                        class727 var12 = var11.field3125;
                        var9 = arg0.field2900 - var12.field2900;
                        var10 = arg0.field2896 - var12.field2896;
                    } else {
                        int var7 = var4 & 0x7FFF;
                        class33 var8 = class263.field3508[var7];
                        if (var8 == null) {
                            arg0.method2175(var3, 79, -1);
                            break label61;
                        }
                        var9 = arg0.field2900 - var8.field2900;
                        var10 = arg0.field2896 - var8.field2896;
                    }
                    if (var10 != 0 || var9 != 0) {
                        arg0.method2175(var3, 126, (int) (Math.atan2((double) var10, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            } else if (!arg0.method2175(var3, arg1 ^ 0x3FFFFFAB, -1)) {
                var2 = false;
            }
            var3++;
        }
        if (var2) {
            arg0.field4661 = null;
            arg0.field4753 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
    public static void method2599(int arg0) {
        field6002 = null;
        if (arg0 != 0) {
            method2599(-80);
        }
    }

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "(I)V")
    public static final void method2600(int arg0) {
        field6005++;
        if (class783.field10719) {
            return;
        }
        class436.field5733 += (-24.0F - class436.field5733) / 2.0F;
        class783.field10719 = true;
        class650.field8286 = true;
        if (arg0 != 16383) {
            field6003 = false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "([[SD)V")
    public class461(short[][] arg0, double arg1) {
        this.field6008 = arg0;
        this.field6006 = arg1;
    }
}
