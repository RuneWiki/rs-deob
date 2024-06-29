import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class29 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Z")
    public static boolean field432 = false;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lr;")
    public static class66 field439 = class93.method641(43, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field428;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field438;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field441;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field442;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lsg;")
    public static class247 field427;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lcj;")
    public static class28 field435;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[[S")
    public static short[][] field433;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I")
    public static final int method161(int arg0, byte arg1) {
        int var2 = -12 / ((-arg1 - 52) / 55);
        int var3 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var3 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var3 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var3 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var3 += 2;
        }
        field437++;
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var3++;
        }
        return var3 + arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)V")
    public abstract void method162(int arg0, int arg1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)V")
    public abstract void method163(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static final void method164(int arg0) {
        field434++;
        class59.method389();
        if (arg0 == 297) {
            for (int var1 = 0; var1 < 4; var1++) {
                class193.field3346[var1].method1110(false);
            }
            System.gc();
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method165(int arg0) {
        field439 = null;
        if (arg0 != -1) {
            field439 = null;
        }
        field433 = null;
        field435 = null;
        field427 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
    public static final void method166(int arg0, long arg1) {
        field436++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 >= -125) {
            field435 = null;
        }
        for (int var3 = 0; var3 < class124.field2338; var3++) {
            if (class247.field4306[var3] == arg1) {
                class70.field1412++;
                class124.field2338--;
                for (int var4 = var3; var4 < class124.field2338; var4++) {
                    class247.field4306[var4] = class247.field4306[var4 + 1];
                    class17.field245[var4] = class17.field245[var4 + 1];
                }
                class252.field4434 = class15.field199;
                class28.field412.method578(72, 2);
                class28.field412.method1651(true, arg1);
                return;
            }
        }
    }
}
