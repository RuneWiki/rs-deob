import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class55 extends class25 {

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "I")
    public int field916 = 0;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "I")
    public int field923 = -1;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Lcd;")
    public static class64 field919 = class44.method335((byte) 71, "(U1");

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "I")
    public static int field926 = 0;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lig;")
    public static class168 field924 = new class168(100);

    @OriginalMember(owner = "client!fb", name = "F", descriptor = "Lcd;")
    public static class64 field932 = class44.method335((byte) 71, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!fb", name = "H", descriptor = "Lcd;")
    public static class64 field934 = class44.method335((byte) 71, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!fb", name = "G", descriptor = "[I")
    public static int[] field933 = new int[1000];

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public int field921;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "I")
    public int field927;

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!fb", name = "C", descriptor = "I")
    public int field929;

    @OriginalMember(owner = "client!fb", name = "D", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!fb", name = "E", descriptor = "I")
    public int field931;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(I)V", line = 10)
    public static void method427(int arg0) {
        field934 = null;
        field933 = null;
        field924 = null;
        field919 = null;
        field932 = null;
        if (arg0 > -22) {
            field919 = (class64) null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZBLqm;Lqg;Lqm;)V", line = 62)
    public static final void method428(boolean arg0, byte arg1, class222 arg2, class231 arg3, class222 arg4) {
        if (arg1 != -27) {
            field919 = (class64) null;
        }
        class173.field2992 = arg2;
        class32.field540 = arg4;
        class164.field2887 = arg0;
        field915++;
        int var5 = class173.field2992.method1586(arg1 ^ 0xFFFFFFE5) - 1;
        class72.field1396 = var5 * 256 + class173.field2992.method1600(var5, (byte) -96);
        class32.field532 = arg3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IJ)V", line = 90)
    public static final void method429(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 <= 30) {
                method428(true, (byte) -120, (class222) null, (class231) null, (class222) null);
            }
        } catch (InterruptedException var4) {
        }
        field920++;
    }
}
