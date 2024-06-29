import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class217 extends class120 {

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "Lok;")
    private static class41 field3479 = class137.method956("Loading )2 please wait)3", 45);

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "Lok;")
    public static class41 field3477 = field3479;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "Lak;")
    public static class20 field3480 = new class20(30);

    @OriginalMember(owner = "client!ph", name = "db", descriptor = "J")
    public static volatile long field3486 = 0L;

    @OriginalMember(owner = "client!ph", name = "eb", descriptor = "Lok;")
    private static class41 field3487 = class137.method956("Continue", 45);

    @OriginalMember(owner = "client!ph", name = "ab", descriptor = "Lok;")
    public static class41 field3483 = field3487;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ph", name = "bb", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ph", name = "Z", descriptor = "Lji;")
    public static class154 field3482;

    @OriginalMember(owner = "client!ph", name = "cb", descriptor = "Lvj;")
    public static class188 field3485;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I", line = 4)
    public static int method1563(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BII)I", line = 18)
    private final int method1564(byte arg0, int arg1, int arg2) {
        if (arg0 < 78) {
            return 51;
        } else {
            field3478++;
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 ^ var4 << 1;
            return 4096 - (((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)I", line = 33)
    public static final int method1565(int arg0, int arg1) {
        field3476++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        }
        if (arg1 >= -76) {
            method1565(34, -121);
        }
        if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I", line = 63)
    public final int[] method14(int arg0, int arg1) {
        field3481++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            return (int[]) null;
        }
        if (this.field1775.field1798) {
            int var4 = class16.field216[arg0];
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                var3[var5] = this.method1564((byte) 99, var4, class203.field3278[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V", line = 94)
    public static void method1566(byte arg0) {
        field3487 = null;
        field3477 = null;
        field3485 = null;
        if (arg0 == 60) {
            field3483 = null;
            field3479 = null;
            field3482 = null;
            field3480 = null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 123)
    public class217() {
        super(0, true);
    }
}
