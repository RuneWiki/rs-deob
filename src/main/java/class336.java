import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class336 implements class171 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lqr;")
    private class69 field5475 = new class69(128);

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    public int[] field5478;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    private int[] field5481;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5484 = new String[] { method2836(method2835("8k\u001dr\u001a")), method2836(method2835("8k\u001dv\u001a")), method2836(method2835("8k\u001d\b[8gG\n\u001a")), method2836(method2835("8k\u001dw\u001a")), method2836(method2835("8k\u001ds\u001a")), method2836(method2835("8k\u001dq\u001a")), method2836(method2835("8k\u001d~\u001a")), method2836(method2835("8k\u001dp\u001a")), method2836(method2835("8k\u001d}\u001a")), method2836(method2835("8k\u001du\u001a")) };

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lat;")
    public static class398 field5471 = new class398();

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lvn;")
    public static class330 field5482 = new class330(91, 8);

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field5473;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Ljca;")
    public static class715 field5483;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)I", line = 3)
    public final int method1583(int arg0, byte arg1) {
        try {
            field5470++;
            class759 var3 = class581.field8375.method726(arg0, ~arg1);
            int var4 = var3.field11155;
            if (arg1 == -51) {
                int var5 = var3.field11153;
                int var6 = var3.field11152;
                int var7 = class28.field290[var6 - var5];
                return var7 & this.field5478[var4] >> var5;
            } else {
                return -94;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5484[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IB)I", line = 26)
    public final int method1584(int arg0, byte arg1) {
        try {
            field5479++;
            if (arg1 <= 4) {
                field5482 = null;
            }
            return this.field5478[arg0];
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field5484[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)V", line = 39)
    public final void method2827(int arg0, int arg1, int arg2) {
        try {
            field5472++;
            class759 var4 = class581.field8375.method726(arg2, arg0 + 13121);
            int var5 = var4.field11155;
            int var6 = var4.field11153;
            int var7 = var4.field11152;
            int var8 = class28.field290[var7 - var6];
            if (arg0 != -13071) {
                method2834(78);
            }
            if (arg1 < 0 || var8 < arg1) {
                arg1 = 0;
            }
            int var9 = var8 << var6;
            this.method2833(105, ~var9 & this.field5481[var5] | arg1 << var6 & var9, var5);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5484[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIB)V", line = 67)
    public final void method2828(int arg0, int arg1, byte arg2) {
        try {
            field5473++;
            class759 var4 = class581.field8375.method726(arg1, 50);
            int var5 = var4.field11155;
            int var6 = var4.field11153;
            int var7 = var4.field11152;
            int var8 = class28.field290[var7 - var6];
            if (arg0 < 0 || arg0 > var8) {
                arg0 = 0;
            }
            int var9 = 41 % ((arg2 + 46) / 39);
            int var10 = var8 << var6;
            this.method2831(var5, ~var10 & this.field5478[var5] | var10 & arg0 << var6, (byte) 119);
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field5484[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)Llv;", line = 94)
    public static final class471 method2829(int arg0, int arg1, int arg2) {
        class290 var3 = class85.field1280[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class471 var4 = var3.field4679;
            var3.field4679 = null;
            class292.method2484(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 116)
    public final void method2830(int arg0) {
        try {
            field5474++;
            int var2 = 0;
            if (arg0 != 91) {
                field5483 = null;
            }
            while (var2 < class531.field7801.field3711) {
                class651 var3 = class531.field7801.method2074(var2, arg0 + 11560);
                if (var3 != null && var3.field9332 == 0) {
                    this.field5481[var2] = 0;
                    this.field5478[var2] = 0;
                }
                var2++;
            }
            this.field5475 = new class69(128);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field5484[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIB)V", line = 144)
    public final void method2831(int arg0, int arg1, byte arg2) {
        try {
            field5477++;
            this.field5478[arg0] = arg1;
            class378 var4 = (class378) this.field5475.method737((byte) -39, (long) arg0);
            if (var4 == null) {
                class378 var5 = new class378(class712.method5167(-2334) + 500L);
                this.field5475.method738(var5, (long) arg0, -12002);
            } else {
                var4.field6109 = class712.method5167(-2334) + 500L;
            }
            int var6 = -75 % ((arg2 - 15) / 54);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5484[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)I", line = 170)
    public final int method2832(int arg0, boolean arg1) {
        try {
            field5480++;
            long var3 = class712.method5167(arg0 - 2333);
            if (arg0 != -1) {
                this.method2831(28, -51, (byte) 24);
            }
            for (class378 var5 = arg1 ? (class378) this.field5475.method735(arg0 + 1) : (class378) this.field5475.method734((byte) -50); var5 != null; var5 = (class378) this.field5475.method734((byte) -50)) {
                if (var3 > (var5.field6109 & 0x3FFFFFFFFFFFFFFFL)) {
                    if ((var5.field6109 & 0x4000000000000000L) != 0L) {
                        int var6 = (int) var5.field8252;
                        this.field5478[var6] = this.field5481[var6];
                        var5.method4173(-1);
                        return var6;
                    }
                    var5.method4173(-1);
                }
            }
            return -1;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field5484[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 255)
    public class336() {
        try {
            this.field5478 = new int[class531.field7801.field3711];
            this.field5481 = new int[class531.field7801.field3711];
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5484[2] + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V", line = 212)
    public final void method2833(int arg0, int arg1, int arg2) {
        try {
            field5476++;
            this.field5481[arg2] = arg1;
            if (arg0 < 22) {
                this.field5481 = null;
            }
            class378 var4 = (class378) this.field5475.method737((byte) -39, (long) arg2);
            if (var4 == null) {
                class378 var5 = new class378(4611686018427387905L);
                this.field5475.method738(var5, (long) arg2, -12002);
            } else if (var4.field6109 != 4611686018427387905L) {
                var4.field6109 = class712.method5167(-2334) + 500L | 0x4000000000000000L;
                return;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field5484[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 243)
    public static void method2834(int arg0) {
        try {
            field5483 = null;
            field5482 = null;
            if (arg0 != -11435) {
                method2829(57, -123, 76);
            }
            field5471 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5484[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2835(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x32);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2836(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 86;
                    break;
                case 1:
                    var10005 = 14;
                    break;
                case 2:
                    var10005 = 51;
                    break;
                case 3:
                    var10005 = 52;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
