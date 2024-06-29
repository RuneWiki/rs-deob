import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class774 extends class413 {

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "Lqw;")
    private class84 field10634 = new class84();

    @OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
    private int field10655 = 0;

    @OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
    private int field10657 = 256;

    @OriginalMember(owner = "client!wo", name = "I", descriptor = "I")
    private int field10654 = 256;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    private int field10650;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "I")
    public static int field10635;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field10636;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
    public static int field10637;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field10638;

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    public static int field10639;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field10640;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
    public static int field10641;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field10642;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public static int field10644;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public static int field10645;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "I")
    public static int field10646;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "I")
    public static int field10647;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field10648;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
    public static int field10649;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field10651;

    @OriginalMember(owner = "client!wo", name = "H", descriptor = "I")
    public static int field10653;

    @OriginalMember(owner = "client!wo", name = "K", descriptor = "I")
    private int field10656;

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "Lcga;")
    public static class507 field10652;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "Z")
    public static boolean field10643;

    @OriginalMember(owner = "client!wo", name = "M", descriptor = "Z")
    private boolean field10658;

    @OriginalMember(owner = "client!wo", name = "N", descriptor = "Z")
    private boolean field10659;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BID)Lnca;", line = 3)
    public final class784 method4251(byte arg0, int arg1, double arg2) {
        field10636++;
        int var5 = -111 / ((arg0 + 88) / 34);
        long var6 = (long) (arg1 | this.field10650 << 0);
        class784 var8 = (class784) class692.field9218.method76(81, var6);
        if (var8 == null) {
            var8 = new class784(new short[this.field10650][arg1], arg2);
        } else {
            var8.field10784 = arg2;
            class692.field9218.method78(var6, (byte) 117);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 26)
    public static final void method4252(int arg0) {
        if (class540.field7482 >= 0) {
            long var1 = class401.method2440(false);
            class540.field7482 = (int) ((long) class540.field7482 - (var1 - class744.field10059));
            if (class540.field7482 > 0) {
                int var3 = (class540.field7482 << 8) / class211.field2714;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class52.field630 = ((class24.field238 & 0xFF00FF) * var3 + ((class740.field10027.field1010 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class24.field238 & 0xFF00) * var3 + (class740.field10027.field1010 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class224.field2897 = ((class532.field7394 & 0xFF00FF) * var3 + ((class740.field10027.field995 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class532.field7394 & 0xFF00) * var3 + (class740.field10027.field995 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class512.field7129 = (class740.field10027.field1003 - class236.field3152) * var6 + class236.field3152;
                class692.field9217 = (class740.field10027.field999 - class227.field2936) * var6 + class227.field2936;
                class734.field9958 = (class740.field10027.field1012 - class599.field8170) * var6 + class599.field8170;
                class74.field1013 = (class740.field10027.field1008 - class285.field4090) * var6 + class285.field4090;
                class455.field6515 = class477.field6699 * var3 + (class740.field10027.field1004 * var4) >> 8;
                class388.field5622 = (class740.field10027.field1011 - class785.field10791) * var6 + class785.field10791;
                class454.field6506 = (class740.field10027.field994 - class670.field8989) * var6 + class670.field8989;
                if (class638.field8599 != class740.field10027.field1005) {
                    class789.field10841 = class593.field8098.method531(class638.field8599, class740.field10027.field1005, var6, class789.field10841);
                }
            } else {
                class512.field7129 = class740.field10027.field1003;
                class52.field630 = class740.field10027.field1010;
                class455.field6515 = class740.field10027.field1004;
                class388.field5622 = class740.field10027.field1011;
                class789.field10841 = class740.field10027.field1005;
                class692.field9217 = class740.field10027.field999;
                class540.field7482 = -1;
                class224.field2897 = class740.field10027.field995;
                class734.field9958 = class740.field10027.field1012;
                class454.field6506 = class740.field10027.field994;
                class74.field1013 = class740.field10027.field1008;
            }
            class744.field10059 = var1;
        }
        if (arg0 != -620657048) {
            method4252(-116);
        }
        field10646++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 83)
    public final synchronized void method17(int arg0) {
        field10641++;
        if (this.field10658) {
            return;
        }
        while (true) {
            class784 var2 = this.method4255(1);
            if (var2 == null) {
                if (this.field10659) {
                    this.method1102((byte) 116);
                    class692.field9218.method80(false);
                }
                return;
            }
            if ((var2.field10786[0].length - this.field10656) > arg0) {
                this.field10656 += arg0;
                return;
            }
            arg0 -= var2.field10786[0].length - this.field10656;
            this.method4254(-124);
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "()Lpp;", line = 125)
    public final class413 method15() {
        field10639++;
        return null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)D", line = 140)
    public final synchronized double method4253(byte arg0) {
        field10644++;
        if (arg0 != 87) {
            this.method4257(85);
        }
        if (this.field10655 < 1) {
            return -1.0D;
        } else {
            class784 var2 = (class784) this.field10634.method679((byte) -86);
            return var2 == null ? -1.0D : var2.field10784 - (double) ((float) var2.field10786[0].length / (float) class624.field8419);
        }
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)V", line = 159)
    private final synchronized void method4254(int arg0) {
        field10645++;
        int var2 = 49 % ((-arg0 - 47) / 35);
        class784 var3 = this.method4255(1);
        if (var3 != null) {
            var3.method1102((byte) 124);
            this.field10655--;
            this.field10656 = 0;
            class692.field9218.method79(var3, var3.method4303((byte) -62), false);
        }
    }

    @OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)Lnca;", line = 181)
    private final synchronized class784 method4255(int arg0) {
        if (arg0 == 1) {
            field10647++;
            return (class784) this.field10634.method679((byte) -86);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V", line = 192)
    public final synchronized void method4256(int arg0, boolean arg1) {
        field10648++;
        int var3 = 114 / ((arg0 + 36) / 54);
        this.field10658 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "g", descriptor = "(I)I", line = 202)
    public final synchronized int method4257(int arg0) {
        field10651++;
        if (arg0 != -620657048) {
            this.field10655 = 45;
        }
        return this.field10655;
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(B)V", line = 214)
    public static void method4258(byte arg0) {
        field10652 = null;
        if (arg0 != 85) {
            field10652 = null;
        }
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "()Lpp;", line = 225)
    public final class413 method13() {
        field10653++;
        return null;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(ZLnca;)V", line = 235)
    public final synchronized void method4259(boolean arg0, class784 arg1) {
        field10642++;
        while (this.field10655 >= 100) {
            this.field10634.method687((byte) -75);
            this.field10655--;
        }
        this.field10634.method689(arg1, 114);
        if (arg0) {
            this.field10657 = 42;
        }
        this.field10655++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)Lrfa;", line = 253)
    public static final class212 method4260(byte arg0, int arg1) {
        field10635++;
        class212 var2 = (class212) class517.field7193.method3109((byte) 106, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -67) {
            field10652 = null;
        }
        byte[] var3 = class598.field8139.method1188(0, arg0 - 17980, arg1);
        class212 var4 = new class212();
        if (var3 != null) {
            var4.method1376(new class254(var3), -19031);
        }
        var4.method1379((byte) 90);
        class517.field7193.method3108((long) arg1, 16337, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "()I", line = 282)
    public final int method24() {
        field10637++;
        return 1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V", line = 291)
    public final void method4261(int arg0, byte arg1) {
        field10640++;
        if (arg1 != -111) {
            this.field10650 = 82;
        }
        this.field10657 = arg0;
        this.field10654 = arg0;
    }

    @OriginalMember(owner = "client!wo", name = "h", descriptor = "(I)V", line = 303)
    public final synchronized void method4262(int arg0) {
        field10638++;
        if (arg0 != -16711936) {
            this.method4262(-58);
        }
        this.field10659 = true;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "([III)V", line = 314)
    public final synchronized void method18(int[] arg0, int arg1, int arg2) {
        field10649++;
        if (this.field10658) {
            return;
        }
        if (this.method4255(1) != null) {
            int var4 = arg1 + arg2;
            if (class177.field2341) {
                var4 <<= 0x1;
            }
            byte var5 = 0;
            byte var6 = 0;
            if (this.field10650 == 2) {
                var6 = 1;
            }
            while (arg1 < var4) {
                class784 var7 = this.method4255(1);
                if (var7 == null) {
                    return;
                }
                short[][] var8 = var7.field10786;
                while (arg1 < var4 && this.field10656 < var8[0].length) {
                    if (class177.field2341) {
                        arg0[arg1++] = var8[var5][this.field10656] * this.field10654;
                        arg0[arg1++] = var8[var6][this.field10656] * this.field10657;
                    } else {
                        int var10001 = arg1++;
                        arg0[var10001] += var8[var5][this.field10656] * this.field10654 + var8[var6][this.field10656] * this.field10657;
                    }
                    this.field10656++;
                }
                if (var8[0].length <= this.field10656) {
                    this.method4254(-114);
                }
            }
        } else if (this.field10659) {
            this.method1102((byte) 54);
            class692.field9218.method80(false);
        }
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(I)V", line = 399)
    public class774(int arg0) {
        this.field10650 = arg0;
    }
}
