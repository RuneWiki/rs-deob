import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class215 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ljo;")
    private class211 field3323 = new class211();

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
    public static int[] field3322 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Ljava/util/Random;")
    public static Random field3321 = new Random();

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "[I")
    public static int[] field3331 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "[B")
    public static byte[] field3334 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "Ljo;")
    private class211 field3332;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Llp;")
    public static class256 field3333;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I", line = 7)
    public final int method1316(byte arg0) {
        field3324++;
        int var2 = 0;
        if (arg0 != 91) {
            this.method1318((byte) 33);
        }
        class211 var3 = this.field3323.field3285;
        while (this.field3323 != var3) {
            var3 = var3.field3285;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 30)
    public final void method1317(int arg0) {
        while (true) {
            class211 var2 = this.field3323.field3285;
            if (this.field3323 == var2) {
                if (arg0 != 3) {
                    return;
                }
                field3319++;
                this.field3332 = null;
                return;
            }
            var2.method1297((byte) -124);
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Ljo;", line = 53)
    public final class211 method1318(byte arg0) {
        field3317++;
        if (arg0 < 76) {
            return null;
        }
        class211 var2 = this.field3323.field3285;
        if (this.field3323 == var2) {
            return null;
        } else {
            var2.method1297((byte) -123);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)Ljo;", line = 70)
    public final class211 method1319(int arg0) {
        field3327++;
        class211 var2 = this.field3323.field3285;
        if (this.field3323 == var2) {
            this.field3332 = null;
            return null;
        } else {
            this.field3332 = var2.field3285;
            int var3 = -41 % ((arg0 + 45) / 51);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)Ljo;", line = 94)
    public final class211 method1320(byte arg0) {
        if (arg0 > -57) {
            this.method1317(10);
        }
        field3326++;
        class211 var2 = this.field3332;
        if (this.field3323 == var2) {
            this.field3332 = null;
            return null;
        } else {
            this.field3332 = var2.field3285;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLjo;)V", line = 114)
    public final void method1321(byte arg0, class211 arg1) {
        field3330++;
        if (arg1.field3280 != null) {
            arg1.method1297((byte) -124);
        }
        arg1.field3280 = this.field3323.field3280;
        if (arg0 == 0) {
            arg1.field3285 = this.field3323;
            arg1.field3280.field3285 = arg1;
            arg1.field3285.field3280 = arg1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "([SB)[S", line = 132)
    public static final short[] method1322(short[] arg0, byte arg1) {
        field3325++;
        if (arg1 != 96) {
            field3333 = null;
        }
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class356.method2181(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V", line = 152)
    public static void method1323(int arg0) {
        field3322 = null;
        if (arg0 < -116) {
            field3333 = null;
            field3331 = null;
            field3321 = null;
            field3334 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(B)Z", line = 173)
    public final boolean method1324(byte arg0) {
        if (arg0 < 30) {
            method1323(66);
        }
        field3329++;
        return this.field3323.field3285 == this.field3323;
    }

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)Ljo;", line = 184)
    public final class211 method1325(int arg0) {
        field3320++;
        class211 var2 = this.field3323.field3280;
        if (arg0 != 29209) {
            method1327(-14, (byte) 100, 19);
        }
        if (this.field3323 == var2) {
            this.field3332 = null;
            return null;
        } else {
            this.field3332 = var2.field3280;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 268)
    public class215() {
        this.field3323.field3280 = this.field3323;
        this.field3323.field3285 = this.field3323;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)V", line = 211)
    public static final void method1326(int arg0, int arg1, int arg2, int arg3) {
        field3328++;
        if (arg3 == 0) {
            class400.method2379((byte) -75, class238.field3595);
            class368.field5402++;
        }
        if (arg1 == arg3) {
            class108.field1878++;
            class400.method2379((byte) -75, class123.field2030);
        }
        class230.field3508.method263(arg2 + class320.field4827, (byte) -53);
        class230.field3508.method221(-1, class308.field4662.method1650(82, 27365) ? 1 : 0);
        class230.field3508.method246((byte) -61, class381.field5550 + arg0);
        class402.field5846 = arg0;
        class312.field4695 = arg2;
        class395.field5764 = false;
        class228.method1375((byte) -49);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IBI)Z", line = 239)
    public static final boolean method1327(int arg0, byte arg1, int arg2) {
        if (arg1 <= 95) {
            method1323(127);
        }
        field3318++;
        return class208.method1277(arg0, 24719, arg2) | (arg2 & 0x70000) != 0 || class178.method1118((byte) -75, arg2, arg0);
    }
}
