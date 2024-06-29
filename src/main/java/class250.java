import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class250 extends class266 {

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "[J")
    public static long[] field4131 = new long[256];

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Lma;")
    private static class5 field4133 = class12.method119(" has logged out)3", (byte) 89);

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "Lma;")
    public static class5 field4130 = class12.method119("(U(Y", (byte) 73);

    @OriginalMember(owner = "client!tl", name = "M", descriptor = "Lma;")
    public static class5 field4139 = field4133;

    @OriginalMember(owner = "client!tl", name = "S", descriptor = "Lma;")
    public static class5 field4145;

    @OriginalMember(owner = "client!tl", name = "R", descriptor = "Lma;")
    public static class5 field4144;

    @OriginalMember(owner = "client!tl", name = "U", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!tl", name = "V", descriptor = "Lma;")
    public static class5 field4148;

    @OriginalMember(owner = "client!tl", name = "T", descriptor = "Ljava/util/Random;")
    public static Random field4146;

    @OriginalMember(owner = "client!tl", name = "X", descriptor = "[I")
    public static int[] field4150;

    @OriginalMember(owner = "client!tl", name = "W", descriptor = "[I")
    public static int[] field4149;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!tl", name = "O", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!tl", name = "P", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!tl", name = "Q", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "Lma;")
    public class5 field4135;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "([Lla;[Lla;[Lfi;Lni;[Lla;I[Lla;)V", line = 5)
    public static final void method1742(class178[] arg0, class178[] arg1, class222[] arg2, class202 arg3, class178[] arg4, int arg5, class178[] arg6) {
        class103.field1535 = arg2;
        class190.field2965 = arg6;
        class35.field552 = arg3;
        class204.field3271 = arg1;
        class76.field1184 = arg4;
        field4140++;
        class93.field1418 = arg0;
        class280.field4746.method1474((byte) 111);
        int var7 = class35.field552.method1346((byte) 82, class202.field3220);
        int[] var8 = class35.field552.method1325((byte) -125, var7);
        if (arg5 != 25) {
            method1744(36);
        }
        for (int var9 = 0; var9 < var8.length; var9++) {
            class280.field4746.method1485(arg5 ^ 0xFFFFDE95, class9.method101(new class221(class35.field552.method1342(40, var7, var8[var9])), arg5 - 148));
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(II)V", line = 45)
    public static final void method1743(int arg0, int arg1) {
        field4138++;
        class99.field1478.method517(false, arg0);
        if (arg1 != 0) {
            method1743(-40, 1);
        }
        class166.field2528.method517(false, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "(I)V", line = 67)
    public static void method1744(int arg0) {
        field4130 = null;
        field4144 = null;
        field4148 = null;
        field4149 = null;
        field4133 = null;
        field4145 = null;
        field4146 = null;
        field4131 = null;
        int var1 = 30 % ((arg0 - 65) / 42);
        field4139 = null;
        field4150 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4131[var0] = var1;
        }
        field4145 = class12.method119("", (byte) 60);
        field4144 = field4145;
        field4147 = 0;
        field4148 = field4145;
        field4146 = new Random();
        field4150 = new int[] { 0, -1, 0, 1 };
        field4149 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    }

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)I", line = 97)
    public final int method1745(int arg0) {
        if (arg0 == 1346221920) {
            field4142++;
            return (int) (this.field5004 >>> 32 & 0xFFL);
        } else {
            return 32;
        }
    }

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)I", line = 108)
    public final int method1746(int arg0) {
        if (arg0 >= -4) {
            field4130 = (class5) null;
        }
        field4141++;
        return (int) this.field5004;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)J", line = 121)
    public final long method1747(byte arg0) {
        field4134++;
        return arg0 <= 11 ? -119L : this.field4541 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "(I)V", line = 136)
    public final void method1748(int arg0) {
        this.field4541 = Long.MIN_VALUE & this.field4541 | class212.method1404((byte) -102) + 500L;
        field4143++;
        class260.field4430.method786(this, arg0);
    }

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "(I)V", line = 148)
    public final void method1749(int arg0) {
        this.field4541 |= Long.MIN_VALUE;
        if (arg0 >= -19) {
            this.method1745(3);
        }
        if (this.method1747((byte) 66) == 0L) {
            class65.field1019.method786(this, 0);
        }
        field4132++;
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V", line = 161)
    public class250(int arg0, int arg1) {
        this.field5004 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(ZII)V", line = 173)
    public static final void method1750(boolean arg0, int arg1, int arg2) {
        field4136++;
        int var3 = arg2--;
        int var4 = class111.field1649[arg2];
        if (var3 > 25) {
            var3 = 25;
        }
        int var5 = class65.field1021[arg2];
        if (arg1 == 0) {
            class283.field4798++;
            class147.field2127.method1389((byte) 126, 8);
            class147.field2127.method1542(-68, var3 + var3 + 3);
        }
        if (arg1 == 1) {
            class147.field2127.method1389((byte) 97, 84);
            class196.field3105++;
            class147.field2127.method1542(-106, var3 + var3 + 3 + 14);
        }
        if (arg1 == 2) {
            class101.field1510++;
            class147.field2127.method1389((byte) -50, 121);
            class147.field2127.method1542(-105, var3 + var3 + 3);
        }
        class147.field2127.method1535(128, class234.field3872[82] ? 1 : 0);
        class10.field153 = class65.field1021[0];
        class213.field3383 = class111.field1649[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class147.field2127.method1542(-125, class111.field1649[arg2] - var4);
            class147.field2127.method1512(class65.field1021[arg2] - var5, true);
        }
        class147.field2127.method1539(class74.field1158 + var5, false);
        class147.field2127.method1539(class193.field3017 + var4, arg0);
    }
}
