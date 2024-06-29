import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class65 extends class24 implements class483 {

    @OriginalMember(owner = "client!qv", name = "K", descriptor = "[I")
    public static int[] field941 = new int[4];

    @OriginalMember(owner = "client!qv", name = "G", descriptor = "Z")
    public static boolean field937 = false;

    @OriginalMember(owner = "client!qv", name = "y", descriptor = "B")
    private byte field930;

    @OriginalMember(owner = "client!qv", name = "x", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!qv", name = "z", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!qv", name = "A", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!qv", name = "B", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!qv", name = "C", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!qv", name = "E", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!qv", name = "F", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!qv", name = "H", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!qv", name = "I", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!qv", name = "J", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!qv", name = "L", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!qv", name = "M", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!qv", name = "N", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!qv", name = "<init>", descriptor = "(Lad;Z)V", line = 5)
    public class65(class669 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)Z", line = 10)
    public final boolean method530(int arg0) {
        ++field942;
        return arg0 != -14770 ? true : super.method239(super.field338.field9521, -16296);
    }

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "(I)I", line = 26)
    public final int method240(int arg0) {
        if (arg0 != 18471) {
            this.field930 = -109;
        }
        ++field938;
        return super.method240(arg0);
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V", line = 38)
    public static void method531(int arg0) {
        if (arg0 == 2) {
            field941 = null;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ZB)Ljaclib/memory/Buffer;", line = 49)
    public final Buffer method532(boolean arg0, byte arg1) {
        ++field933;
        if (arg1 != 56) {
            this.field930 = 104;
        }
        return super.method237(super.field338.field9521, true, arg0);
    }

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)I", line = 60)
    public final int method533(int arg0) {
        if (arg0 != -26171) {
            this.field930 = 106;
        }
        ++field932;
        return this.field930;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILjaclib/memory/Source;IB)Z", line = 71)
    public final boolean method534(int arg0, Source arg1, int arg2, byte arg3) {
        this.field930 = (byte) arg0;
        ++field940;
        super.method236((byte) 114, arg2, arg1);
        if (arg3 >= -12) {
            method536(-6, -0.5796522F, -0.24923655F, -0.2814922F);
        }
        return true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z", line = 86)
    public final boolean method535(int arg0, int arg1, int arg2) {
        this.field930 = (byte) arg2;
        ++field939;
        super.method238(-22454, arg1);
        if (arg0 != 14036) {
            this.field930 = 77;
        }
        return true;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(IFFF)F", line = 101)
    public static final float method536(int arg0, float arg1, float arg2, float arg3) {
        if (arg0 <= 105) {
            return 1.4521903F;
        } else {
            ++field943;
            return (arg3 - arg2) * arg1 + arg2;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V", line = 113)
    public final void method231(byte arg0) {
        ++field929;
        super.method231(arg0);
    }

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "(I)V", line = 122)
    public static final void method537(int arg0) {
        ++field935;
        int[] var1 = new int[class430.field6132.field104];
        int var2 = 0;
        if (arg0 != -12515) {
            field941 = null;
        }
        for (int var3 = 0; var3 < class430.field6132.field104; ++var3) {
            class432 var5 = class430.field6132.method42(var3, false);
            if (~var5.field6184 <= -1 || var5.field6196 >= 0) {
                var1[var2++] = var3;
            }
        }
        class296.field4185 = new int[var2];
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            class296.field4185[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 158)
    public static final int method538(String arg0, int arg1) {
        ++field944;
        if (arg1 != -23686) {
            field941 = null;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; ++var4) {
            char var5 = arg0.charAt(var4);
            if (~var5 < -128) {
                if (var5 > 2047) {
                    var3 += 3;
                } else {
                    var3 += 2;
                }
            } else {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)Z", line = 201)
    public static final boolean method539(byte arg0, int arg1) {
        int var2 = -13 % ((arg0 - -71) / 55);
        ++field936;
        return ~arg1 == -1;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILwv;)[Ldm;", line = 212)
    public static final class680[] method540(int arg0, class705 arg1) {
        ++field931;
        if (!arg1.method3959(94)) {
            return new class680[0];
        } else {
            class614 var2 = arg1.method3967(24);
            while (var2.field8787 == 0) {
                class564.method3300((byte) 105, 10L);
            }
            if (~var2.field8787 == -3) {
                return new class680[0];
            } else {
                int[] var3 = (int[]) var2.field8785;
                class680[] var4 = new class680[var3.length >> 2];
                for (int var5 = 0; var5 < var4.length; ++var5) {
                    class680 var6 = new class680();
                    var4[var5] = var6;
                    var6.field9677 = var3[var5 << 2];
                    var6.field9674 = var3[(var5 << 2) + 1];
                    var6.field9682 = var3[(var5 << 2) + 2];
                    var6.field9678 = var3[(var5 << 2) + 3];
                }
                if (arg0 < 104) {
                    field941 = null;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "(B)V", line = 255)
    public static final void method541(byte arg0) {
        int var1 = 43 / ((31 - arg0) / 57);
        ++field934;
        class694.field9853 = class556.method3257(2048, 0.4F, 8, true, 8, 35, 4, (byte) 71);
    }
}
