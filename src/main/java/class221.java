import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class221 extends class314 {

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field3907 = 0;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "[Lge;")
    public static class152[] field3900 = new class152[6];

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "Z")
    public static boolean field3905 = true;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Z")
    public static boolean field3894 = false;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "Z")
    public static boolean field3901 = true;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field3896;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lok;")
    public static class149 field3893;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "Lok;")
    public static class149 field3902;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "[I")
    public int[] field3908;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "[I")
    public int[] field3911;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "[I")
    public int[] field3912;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "[Lia;")
    public class206[] field3895;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "[Lia;")
    public class206[] field3897;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "[[[B")
    public byte[][][] field3898;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Z", line = 8)
    public static final boolean method1617(byte arg0) {
        field3903++;
        if (class97.field1824) {
            return true;
        } else {
            if (arg0 != 29) {
                field3894 = false;
            }
            return class145.field2624;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1618(int arg0) {
        field3913++;
        if (arg0 >= 99) {
            class98.field1836 = class200.method1490(8, true, 0.4F, 2048, 4, 8, (byte) -105, 35);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Z", line = 39)
    public static final boolean method1619(int arg0, byte arg1) {
        field3910++;
        if (arg1 == -122) {
            return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)I", line = 59)
    public static final int method1620(int arg0, int arg1, int arg2) {
        field3904++;
        int var3 = arg2;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)V", line = 79)
    public static final void method1621(byte arg0) {
        field3909++;
        class52.method435();
        if (arg0 != 57) {
            method1622((byte) -48);
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class90.field1702[var1].method981(5);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)V", line = 127)
    public static void method1622(byte arg0) {
        field3893 = null;
        field3902 = null;
        field3900 = null;
        if (arg0 != 72) {
            field3900 = (class152[]) null;
        }
    }
}
