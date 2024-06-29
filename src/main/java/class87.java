import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class87 {

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "Lr;")
    public static class66 field1706 = class93.method641(43, "Mem:");

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lr;")
    public static class66 field1702 = class93.method641(43, " weitere Optionen");

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1707 = 0;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1701 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[[S")
    public static short[][] field1705;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public static void method615(boolean arg0) {
        field1706 = null;
        field1705 = null;
        if (arg0) {
            field1702 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(JI)Lr;")
    public static final class66 method616(long arg0, int arg1) {
        field1700++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if ((arg0 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var3--;
                var6[var3] = class64.field1274[(int) (var8 - (arg0 * 37L))];
            }
            class66 var7 = new class66();
            var7.field1283 = var6;
            var7.field1308 = var6.length;
            if (arg1 != -1) {
                field1701 = -3;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method617(byte arg0) {
        field1703++;
        if (class150.field2702 != -1) {
            class155.method1053(class150.field2702, -1);
        }
        for (int var1 = 0; var1 < field1701; var1++) {
            if (class255.field4485[var1]) {
                class142.field2607[var1] = true;
            }
            class36.field540[var1] = class255.field4485[var1];
            class255.field4485[var1] = false;
        }
        class14.field182 = -1;
        class163.field2926 = class75.field1501;
        class125.field2368 = -1;
        if (arg0 != 46) {
            method617((byte) -24);
        }
        class214.field3672 = null;
        if (class150.field2702 != -1) {
            field1701 = 0;
            class102.method703(0, 0, class12.field143, 0, class150.field2702, -1, 0, class19.field257, (byte) -112);
        }
        class235.method1535();
        class193.field3347 = 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lcj;II)Z")
    public static final boolean method618(class28 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            field1707 = -32;
        }
        field1704++;
        byte[] var3 = arg0.method156(0, arg2);
        if (var3 == null) {
            return false;
        } else {
            class144.method991(14432, var3);
            return true;
        }
    }
}
