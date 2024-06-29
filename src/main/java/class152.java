import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class152 extends class64 {

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    private int field3035 = 4;

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field3033 = 1638;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    private int field3029 = 4;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "Z")
    private boolean field3044 = true;

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "[I")
    private int[] field3043 = new int[512];

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    private int field3041 = 4;

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "I")
    private int field3039 = 0;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "Lcd;")
    public static class23 field3028 = class54.method414("Bitte versuchen Sie)1", -1);

    @OriginalMember(owner = "client!r", name = "T", descriptor = "Lcd;")
    public static class23 field3032 = class54.method414("Schlie-8en", -1);

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!r", name = "hb", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "[I")
    private int[] field3030;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "[I")
    private int[] field3034;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V")
    public final void method44(byte arg0) {
        ++field3037;
        if (arg0 != -22) {
            this.method35(49, 87);
        }
        this.method943((byte) 92);
        this.method940(arg0 ^ -22);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        ++field3038;
        if (arg1 != -9421) {
            method941((byte) -32);
        }
        int[] var3 = super.field1513.method1033(-89, arg0);
        if (super.field1513.field3368) {
            int var4 = this.field3035 << 12;
            int var5 = this.field3041 << 12;
            int var6 = class95.field1995[arg0] * this.field3041;
            for (int var7 = 0; class168.field3367 > var7; ++var7) {
                int var8 = 0;
                int var9 = class174.field3475[var7] * this.field3035;
                for (int var10 = 0; ~var10 > ~this.field3029; ++var10) {
                    int var11 = this.field3034[var10];
                    int var12 = this.field3030[var10];
                    int var13 = this.method942(var9 * var11 >> 12, (byte) 125, var6 * var11 >> 12, var4 * var11 >> 12, var5 * var11 >> 12);
                    var8 += var12 * var13 >> 12;
                }
                if (this.field3044) {
                    var8 = 2048 - -(var8 >> 1);
                }
                var3[var7] = var8;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    private final void method940(int arg0) {
        ++field3046;
        if (~this.field3033 < -1) {
            this.field3034 = new int[this.field3029];
            this.field3030 = new int[this.field3029];
            for (int var2 = 0; ~var2 > ~this.field3029; ++var2) {
                this.field3030[var2] = (int) (Math.pow((double) (this.field3033 / 4096), (double) var2) * 4096.0D);
                this.field3034[var2] = (int) (Math.pow(2.0D, (double) var2) * 4096.0D);
            }
        } else if (this.field3030 != null && this.field3030.length == this.field3029) {
            this.field3034 = new int[this.field3029];
            for (int var3 = 0; ~var3 > ~this.field3029; ++var3) {
                this.field3034[var3] = (int) (Math.pow(2.0D, (double) var3) * 4096.0D);
            }
        }
        if (arg0 != 0) {
            this.method35(-51, 74);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)V")
    public static void method941(byte arg0) {
        field3028 = null;
        if (arg0 == -16) {
            field3032 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIII)I")
    private final int method942(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3036;
        int var6 = arg0 & -4096;
        int var7 = arg0 - var6;
        int var8 = var6 >> 12;
        int var9 = var8 + 1;
        int var10 = var8 & 255;
        int var11 = arg2 & -4096;
        int var12 = arg2 - var11;
        int var13 = arg3 & -4096;
        int var14 = var11 >> 12;
        int var15 = var14 + 1;
        int var16 = var14 & 255;
        if (~(var13 >> 12) >= ~var9) {
            var9 = 0;
        }
        int var17 = var9 & 255;
        int var18 = -4096 & arg4;
        int var19 = this.field3043[this.field3043[var16] + var10] % 4;
        if (arg1 <= 105) {
            this.method37((byte) -91, 83, (class189) null);
        }
        if (var18 >> 12 <= var15) {
            var15 = 0;
        }
        int var20 = this.field3043[this.field3043[var16] + var17] % 4;
        int var21 = var15 & 255;
        int var22 = this.field3043[this.field3043[var21] + var10] % 4;
        int var23 = this.field3043[var17 - -this.field3043[var21]] % 4;
        int var24 = class176.method1105(var12, 100, class174.field3474[var19], var7);
        int var25 = class176.method1105(var12, 100, class174.field3474[var20], var7 + -4096);
        int var26 = class176.method1105(var12 - 4096, 100, class174.field3474[var22], var7);
        int var27 = class176.method1105(var12 - 4096, 100, class174.field3474[var23], var7 + -4096);
        int var28 = class73.method521(var7, 0);
        int var29 = class73.method521(var12, 0);
        int var30 = class82.method554(4096, var25, var28, var24);
        int var31 = class82.method554(4096, var27, var28, var26);
        return class82.method554(4096, var31, var29, var30);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(B)V")
    private final void method943(byte arg0) {
        ++field3042;
        Random var2 = new Random((long) this.field3039);
        for (int var3 = 0; var3 < 255; ++var3) {
            this.field3043[var3] = -1;
        }
        if (arg0 < 38) {
            this.method37((byte) 104, 37, (class189) null);
        }
        for (int var4 = 0; var4 < 255; ++var4) {
            int var5;
            do {
                var5 = class155.method952(var2, 255, -67);
            } while (this.field3043[var5] != -1);
            this.field3043[var5 - -255] = this.field3043[var5] = var4;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BILva;)V")
    public final void method37(byte arg0, int arg1, class189 arg2) {
        int var4 = 75 / ((arg0 - 7) / 43);
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3041 = arg2.method1202(102);
                                }
                            } else {
                                this.field3035 = arg2.method1202(-13);
                            }
                        } else {
                            this.field3039 = arg2.method1202(-74);
                        }
                    } else {
                        this.field3035 = this.field3041 = arg2.method1202(-97);
                    }
                } else {
                    this.field3033 = arg2.method1196(false);
                    if (~this.field3033 > -1) {
                        this.field3030 = new int[this.field3029];
                        for (int var6 = 0; ~var6 > ~this.field3029; ++var6) {
                            this.field3030[var6] = arg2.method1196(false);
                        }
                    }
                }
            } else {
                this.field3029 = arg2.method1202(-60);
            }
        } else {
            this.field3044 = arg2.method1202(107) == 1;
        }
        ++field3045;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public static final void method944(boolean arg0) {
        if (arg0) {
            ++field3031;
            while (~class81.field1769.method627(class199.field3900, 79) <= -28) {
                int var1 = class81.field1769.method626(16789, 15);
                if (var1 == 32767) {
                    break;
                }
                boolean var2 = false;
                if (class91.field1944[var1] == null) {
                    class91.field1944[var1] = new class182();
                    var2 = true;
                }
                class182 var3 = class91.field1944[var1];
                class8.field161[class67.field1583++] = var1;
                var3.field266 = class15.field339;
                var3.field3595 = class117.method741((byte) -4, class81.field1769.method626(16789, 14));
                int var4 = class81.field1769.method626(16789, 5);
                int var5 = class81.field1769.method626(16789, 5);
                if (~var5 < -16) {
                    var5 -= 32;
                }
                int var6 = class25.field550[class81.field1769.method626(16789, 3)];
                if (var2) {
                    var3.field227 = var3.field264 = var6;
                }
                int var7 = class81.field1769.method626(16789, 1);
                if (var4 > 15) {
                    var4 -= 32;
                }
                int var8 = class81.field1769.method626(16789, 1);
                if (var8 == 1) {
                    class160.field3202[class108.field2307++] = var1;
                }
                var3.field226 = var3.field3595.field46;
                var3.field268 = var3.field3595.field77;
                var3.field262 = var3.field3595.field60;
                var3.field271 = var3.field3595.field72;
                var3.field231 = var3.field3595.field69;
                var3.field216 = var3.field3595.field65;
                var3.field251 = var3.field3595.field62;
                if (~var3.field271 == -1) {
                    var3.field264 = 0;
                }
                var3.field253 = var3.field3595.field64;
                var3.field229 = var3.field3595.field61;
                var3.method70(class134.field2790.field219[0] + var5, (byte) 123, var7 == 1, class134.field2790.field230[0] - -var4);
            }
            class81.field1769.method630(-114);
        }
    }
}
