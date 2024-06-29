import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class203 {

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public int field3491 = -1;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lsc;")
    public static class181 field3500 = class149.method967(255, "unzap");

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Lsc;")
    public static class181 field3501 = class149.method967(255, "p12_full");

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lsc;")
    private static class181 field3494 = class149.method967(255, "cyan:");

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lsc;")
    public static class181 field3486 = field3494;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Lsc;")
    public static class181 field3502 = field3494;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lvb;")
    public static class247 field3485 = new class247();

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Lka;")
    public static class134 field3507 = null;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field3506 = 0;

    @OriginalMember(owner = "client!ki", name = "B", descriptor = "Lsc;")
    public static class181 field3509 = class149.method967(255, "leuchten2:");

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public int field3484;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field3488;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public int field3499;

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public int field3503;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!ki", name = "A", descriptor = "[I")
    public static int[] field3508;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static void method1359(boolean arg0) {
        field3500 = null;
        field3494 = null;
        if (!arg0) {
            field3500 = null;
        }
        field3502 = null;
        field3509 = null;
        field3486 = null;
        field3508 = null;
        field3507 = null;
        field3501 = null;
        field3485 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public static final void method1360(int arg0, int arg1, int arg2) {
        int var3 = arg0--;
        if (var3 > 25) {
            var3 = 25;
        }
        field3493++;
        if (arg2 < 115) {
            return;
        }
        int var4 = class94.field1510[arg0];
        int var5 = class26.field456[arg0];
        if (arg1 == 0) {
            class157.field2674++;
            class141.field2275.method541(42, -119);
            class141.field2275.method1538(var3 + var3 + 3, (byte) 58);
        }
        if (arg1 == 1) {
            class71.field1140++;
            class141.field2275.method541(163, -116);
            class141.field2275.method1538(var3 + var3 + 17, (byte) -83);
        }
        if (arg1 == 2) {
            class193.field3386++;
            class141.field2275.method541(75, 55);
            class141.field2275.method1538(var3 + var3 + 3, (byte) -73);
        }
        class141.field2275.method1538(class68.field1095[82] ? 1 : 0, (byte) -82);
        class210.field3612 = class94.field1510[0];
        class146.field2400 = class26.field456[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg0--;
            class141.field2275.method1525(class94.field1510[arg0] - var4, 25);
            class141.field2275.method1545(class26.field456[arg0] - var5, (byte) -60);
        }
        class141.field2275.method1537(1, class253.field4420 + var4);
        class141.field2275.method1559(class222.field3844 + var5, 0);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V")
    public static final void method1361(int arg0, long arg1) {
        field3490++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class149.field2483 < 100 || class232.field4062 == 1) || class149.field2483 >= 200) {
            class202.method1357(class125.field2053, 0, (byte) -105, class241.field4187);
            return;
        }
        class181 var3 = class19.method184(-26890, arg1).method1223((byte) -57);
        for (int var4 = 0; var4 < class149.field2483; var4++) {
            if (class182.field3213[var4] == arg1) {
                class202.method1357(class175.method1164(new class181[] { var3, class88.field1397 }, (byte) 125), 0, (byte) -106, class241.field4187);
                return;
            }
        }
        if (arg0 <= 110) {
            field3498 = -69;
        }
        for (int var5 = 0; var5 < class221.field3815; var5++) {
            if (class256.field4483[var5] == arg1) {
                class202.method1357(class175.method1164(new class181[] { class218.field3742, var3, class144.field2346 }, (byte) 126), 0, (byte) -115, class241.field4187);
                return;
            }
        }
        if (var3.method1202(class258.field4507.field1883, -4557)) {
            class202.method1357(class128.field2122, 0, (byte) -114, class241.field4187);
            return;
        }
        class5.field100[class149.field2483] = var3;
        class131.field2163++;
        class182.field3213[class149.field2483] = arg1;
        class140.field2272[class149.field2483] = 0;
        class175.field2947[class149.field2483] = class241.field4187;
        class190.field3352[class149.field2483] = 0;
        class248.field4331[class149.field2483] = false;
        class7.field122 = class247.field4318;
        class149.field2483++;
        class141.field2275.method541(140, 84);
        class141.field2275.method1511(false, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static final void method1362(int arg0) {
        field3487++;
        class247.field4311.method1790(0);
        class97.field1568.method1790(0);
        class146.field2390.method1790(0);
        if (arg0 <= 58) {
            field3504 = 41;
        }
    }
}
