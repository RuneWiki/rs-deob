import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class63 extends class82 {

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "J")
    public long field987;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field992 = 0;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "Z")
    public static boolean field996 = true;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "[I")
    public static int[] field994 = new int[50];

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "[[[Lnd;")
    public static class270[][][] field997;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)I")
    public static final int method423(byte arg0) {
        field991++;
        if (arg0 != 64) {
            method423((byte) 12);
        }
        return ((class196.field2988 == 0 ? 0 : 1) << 22) + ((class100.field1574 == 0 ? 0 : 1) << 20) + ((class107.field1657 ? 1 : 0) << 19) + (class127.field1911 << 17) + ((class297.field4692 ? 1 : 0) << 13) + ((class84.field1338 ? 1 : 0) << 10) + ((class189.field2896 ? 1 : 0) << 9) + ((class32.field464 ? 1 : 0) << 8) + ((class102.field1602 ? 1 : 0) << 7) + (class7.field107 & 0x7) - (-((class58.field914 ? 1 : 0) << 3) + (-((field996 ? 1 : 0) << 4) + -((class213.field3188 ? 1 : 0) << 5) - (((class140.field2047 ? 1 : 0) << 6) - -(class166.field2550 & 0x3 << 11) - -((class145.field2115 ? 1 : 0) << 15))) - (((class256.field3906 ? 1 : 0) << 16) - -((class284.field4248 == 0 ? 0 : 1) << 21) + (class245.method1540() << 23)));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lpf;I)V")
    public static final void method424(class294 arg0, int arg1) {
        field995++;
        class112.field1728 = arg0;
        if (arg1 < 16) {
            method426(false, 80, -127, -17);
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
    public static void method425(int arg0) {
        field994 = null;
        field997 = null;
        if (arg0 != 0) {
            field986 = 35;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZIII)I")
    public static final int method426(boolean arg0, int arg1, int arg2, int arg3) {
        field989++;
        class75 var4 = (class75) class166.field2549.method1666((long) arg1, (byte) 96);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg3 <= 44) {
            method427(-19);
        }
        for (int var6 = 0; var6 < var4.field1214.length; var6++) {
            if (var4.field1214[var6] >= 0 && var4.field1214[var6] < class62.field977) {
                class43 var7 = class160.method999(var4.field1214[var6], 0);
                if (var7.field634 != null) {
                    class251 var8 = (class251) var7.field634.method1666((long) arg2, (byte) -112);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field1218[var6] * var8.field3822;
                        } else {
                            var5 += var8.field3822;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class63() {
    }

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "(I)I")
    public static final int method427(int arg0) {
        field990++;
        if (arg0 != 1) {
            field992 = 17;
        }
        return class219.field3302;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)I")
    public static int method428(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(J)V")
    public class63(long arg0) {
        this.field987 = arg0;
    }
}
