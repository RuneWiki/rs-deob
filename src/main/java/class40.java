import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class40 extends class212 {

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "[I")
    private int[] field468;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field477 = new String[] { method275(method274("F^9\f~")), method275(method274("_\u00189v+")), method275(method274("S\u0005{N")), method275(method274("_\u00189h+")), method275(method274("_\u00189m+")), method275(method274("_\u00189p+")), method275(method274("_\u00189s+")), method275(method274("_\u00189t+")), method275(method274("_\u00189w+")), method275(method274("_\u00189j+")), method275(method274("_\u00189q+")), method275(method274("_\u00189\u001ejS\u0019c\u001c+")), method275(method274("_\u00189f+")) };

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Z")
    public static boolean field469 = false;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field473 = 0;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Lca;")
    public static class321 field475 = null;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    private int field467;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field471;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "[B")
    private byte[] field476;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method267(byte arg0, String arg1) {
        try {
            ++field474;
            if (arg0 >= -7) {
                method271((byte) -113, (Canvas) null);
            }
            int var2 = arg1.length();
            long var3 = 0L;
            for (int var5 = 0; var5 < var2; ++var5) {
                var3 = -var3 + ((var3 << 5) - -((long) arg1.charAt(var5)));
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field477[6] + arg0 + ',' + (arg1 != null ? field477[0] : field477[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILot;)Lot;")
    public static final class616 method268(int arg0, class616 arg1) {
        try {
            if (arg0 != 4096) {
                method271((byte) -2, (Canvas) null);
            }
            ++field471;
            class616 var2 = arg1 != null ? new class616(arg1) : new class616();
            var2.method4560(true, 9, 128);
            return var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field477[1] + arg0 + ',' + (arg1 != null ? field477[0] : field477[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
    public final void method252(boolean arg0) {
        try {
            ++field464;
            this.field470 = 0;
            if (!arg0) {
                field469 = false;
            }
            this.field467 = 0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field477[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Z")
    public static final boolean method269(int arg0, int arg1) {
        try {
            if (arg1 <= 56) {
                method269(-112, -13);
            }
            ++field472;
            return (arg0 & -arg0) == arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field477[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIB)V")
    public void method270(int arg0, int arg1, byte arg2) {
        try {
            this.field476[this.field467++] = (byte) (127 + class291.method2359(127, arg2 >> 1));
            ++field465;
            if (arg1 != 4096) {
                this.method252(false);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field477[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public final void method257(byte arg0) {
        try {
            int var2 = -65 % ((10 - arg0) / 46);
            this.field470 = Math.abs(this.field470);
            ++field461;
            if (this.field470 >= 4096) {
                this.field470 = 4095;
            }
            this.method270(this.field467++, 4096, (byte) (this.field470 >> 4));
            this.field470 = 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field477[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public static final void method271(byte arg0, Canvas arg1) {
        try {
            ++field466;
            if (arg0 <= -23) {
                Dimension var2 = arg1.getSize();
                class428.method3288(true, var2.height, var2.width);
                if (~class166.field2283 != -2) {
                    class301.field4720.method589(arg1, class757.field10994, class3.field31);
                } else {
                    class301.field4720.method589(arg1, class57.field613, class69.field742);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field477[8] + arg0 + ',' + (arg1 != null ? field477[0] : field477[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIF)V")
    public class40(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        try {
            this.field468 = new int[super.field3253];
            for (int var7 = 0; super.field3253 > var7; ++var7) {
                this.field468[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field477[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
    public final void method256(int arg0, int arg1, int arg2) {
        try {
            ++field462;
            if (arg0 != 980100556) {
                this.field467 = -65;
            }
            this.field470 += this.field468[arg2] * arg1 >> 12;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field477[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V")
    public static final void method272(int arg0) {
        try {
            client.field5015 = class475.field6895.field8571 + 2 + class475.field6895.field8574;
            class725.field10472 = new String[500];
            class667.field9702 = class64.field664.field8574 - -class64.field664.field8571 + 2;
            ++field463;
            for (int var1 = arg0; class725.field10472.length > var1; ++var1) {
                class725.field10472[var1] = "";
            }
            class437.method3350(arg0 + 100, class309.field4848.method2616(false, class167.field2300));
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field477[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)V")
    public static void method273(boolean arg0) {
        try {
            if (!arg0) {
                method267((byte) 127, (String) null);
            }
            field475 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field477[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method274(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method275(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 112;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 34;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
