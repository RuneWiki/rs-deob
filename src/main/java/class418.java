import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class418 extends class751 {

    @OriginalMember(owner = "client!df", name = "A", descriptor = "I")
    private int field5890 = 585;

    @OriginalMember(owner = "client!df", name = "B", descriptor = "Lke;")
    public static class622 field5891 = new class622(124, 8);

    @OriginalMember(owner = "client!df", name = "C", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!df", name = "E", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!df", name = "F", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!df", name = "G", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILrv;I)V", line = 3)
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = 81 % ((arg0 - 25) / 63);
        ++field5892;
        if (arg2 == 0) {
            this.field5890 = arg1.method898((byte) -94);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method365(int arg0, int arg1) {
        ++field5893;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (arg1 != 4095) {
            this.field5890 = -14;
        }
        if (super.field10405.field8923) {
            int var4 = class619.field8728[arg0];
            for (int var5 = 0; ~class673.field9452 < ~var5; ++var5) {
                int var6 = class179.field2708[var5];
                if (~this.field5890 > ~var6 && var6 < 4096 - this.field5890 && ~(-this.field5890 + 2048) > ~var4 && var4 < this.field5890 + 2048) {
                    int var7 = 2048 - var6;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field5890 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field5890) && var6 < this.field5890 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field5890;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field5890 + 2048);
                } else if (var4 >= this.field5890 && ~(-this.field5890 + 4096) <= ~var4) {
                    if (this.field5890 <= var6 && ~var6 >= ~(-this.field5890 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field5890 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field5890;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field5890 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IB[Lwq;)V", line = 109)
    public static final void method2498(int arg0, byte arg1, class176[] arg2) {
        for (int var3 = 0; arg2.length > var3; ++var3) {
            class176 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field2560 == 0) {
                    if (var4.field2543 != null) {
                        method2498(arg0, (byte) 111, var4.field2543);
                    }
                    class329 var5 = (class329) class251.field3547.method380((byte) -3, (long) var4.field2588);
                    if (var5 != null) {
                        class530.method3077(64, var5.field4912, arg0);
                    }
                }
                if (arg0 == 0 && var4.field2553 != null) {
                    class140 var6 = new class140();
                    var6.field1802 = var4;
                    var6.field1808 = var4.field2553;
                    class353.method2219(var6);
                }
                if (arg0 == 1 && var4.field2658 != null) {
                    if (var4.field2612 >= 0) {
                        class176 var7 = class518.method3014(var4.field2588, 90);
                        if (var7 == null || var7.field2543 == null || ~var7.field2543.length >= ~var4.field2612 || var7.field2543[var4.field2612] != var4) {
                            continue;
                        }
                    }
                    class140 var8 = new class140();
                    var8.field1802 = var4;
                    var8.field1808 = var4.field2658;
                    class353.method2219(var8);
                }
            }
        }
        if (arg1 < 90) {
            method2499(-68);
        }
        ++field5895;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V", line = 180)
    public static void method2499(int arg0) {
        field5891 = null;
        if (arg0 != 124) {
            method2500(-9L, 43);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(JI)Ljava/lang/String;", line = 190)
    public static final String method2500(long arg0, int arg1) {
        ++field5894;
        if (~arg0 < -1L && arg0 < 6582952005840035281L) {
            if (arg0 % 37L == 0L) {
                return null;
            } else {
                int var3 = 0;
                if (arg1 != -24831) {
                    return null;
                } else {
                    for (long var4 = arg0; ~var4 != -1L; var4 /= 37L) {
                        ++var3;
                    }
                    StringBuffer var6 = new StringBuffer(var3);
                    while (~arg0 != -1L) {
                        long var7 = arg0;
                        arg0 /= 37L;
                        char var9 = class642.field9045[(int) (-(arg0 * 37L) + var7)];
                        if (var9 == '_') {
                            int var10 = -1 + var6.length();
                            var9 = 160;
                            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                        }
                        var6.append(var9);
                    }
                    var6.reverse();
                    var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                    return var6.toString();
                }
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 251)
    public class418() {
        super(0, true);
    }
}
