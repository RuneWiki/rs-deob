import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public abstract class class201 {

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "Z")
    public static boolean field2787 = false;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "[[I")
    public static int[][] field2789 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field2792 = 0;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "Ltq;")
    public static class426 field2788 = new class426(2, 18);

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "[I")
    public static int[] field2794 = new int[100];

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 4)
    public static void method1240(byte arg0) {
        field2794 = null;
        field2788 = null;
        field2789 = null;
        if (arg0 != 65) {
            field2787 = false;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V", line = 26)
    public static final void method1241(int arg0) {
        class7.field117 = null;
        class383.field5697 = null;
        class106.field1421 = null;
        class150.field1943 = null;
        class458.field6676 = null;
        if (arg0 <= 81) {
            return;
        }
        class122.field1593 = null;
        class17.field244 = null;
        class347.field5011 = null;
        class149.field1929 = null;
        field2791++;
        class190.field2703 = null;
        class69.field1018 = null;
        class168.field2220 = null;
        class480.field6934 = null;
        class276.field3952 = null;
        class181.field2587 = null;
        class77.field1090 = null;
        class95.field1282 = null;
        class485.field7021 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZII)I", line = 62)
    public static final int method1242(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method1241(29);
        }
        field2790++;
        return arg1 == 1 || arg1 == 3 ? class296.field4318[arg2 & 0x3] : class138.field1800[arg2 & 0x3];
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V", line = 76)
    public static final void method1243(byte arg0, int arg1) {
        int var2 = 28 % ((-arg0 - 46) / 61);
        field2786++;
        class338 var3 = class380.method2294((byte) 121, arg1, 5);
        var3.method2048(123);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public abstract void method237(byte arg0);

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)I")
    public abstract int method238(int arg0, int arg1);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)J")
    public abstract long method236(int arg0);
}
