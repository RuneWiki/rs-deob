import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class24 {

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Z")
    public boolean field377 = false;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Lrc;")
    public static class9 field376 = new class9(64);

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field379 = 2;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field378 = -2;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lrc;")
    public static class9 field382 = new class9(64);

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Ljava/lang/String;")
    public static String field383 = "shake:";

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public int field371;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lbl;")
    public static class137 field380;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[[[B")
    public static byte[][][] field384;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
    public static final boolean method166(int arg0, int arg1) {
        field369++;
        if (class146.field2491 == arg1) {
            return false;
        }
        class290.field4634 = new int[4][13][13];
        class50.field861 = new int[104][104];
        int var2 = 0;
        if (arg0 != -12414) {
            return false;
        }
        while (var2 < 4) {
            class99.field1699[var2] = new class189(104, 104);
            var2++;
        }
        class255.field4163 = new class60[4][104][104];
        class146.field2491 = arg1;
        class229.field3862 = new byte[4][104][104];
        class158.field2648 = new byte[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILeh;B)V")
    public final void method167(int arg0, class101 arg1, byte arg2) {
        field372++;
        while (true) {
            int var4 = arg1.method669((byte) 36);
            if (var4 == 0) {
                if (arg2 == -74) {
                    return;
                } else {
                    this.field375 = 61;
                    return;
                }
            }
            this.method168(arg0, (byte) 40, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBILeh;)V")
    private final void method168(int arg0, byte arg1, int arg2, class101 arg3) {
        if (arg2 == 1) {
            this.field375 = arg3.method677(false);
        } else if (arg2 == 2) {
            this.field371 = arg3.method658(arg1 + 22252);
        } else if (arg2 == 3) {
            this.field377 = true;
        } else if (arg2 == 4) {
            this.field375 = -1;
        }
        field370++;
        if (arg1 != 40) {
            this.field371 = -42;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method169(int arg0) {
        field380 = null;
        field383 = null;
        field376 = null;
        field382 = null;
        if (arg0 != 64) {
            method166(-33, 84);
        }
        field384 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BZI)Lfc;")
    public final class148 method170(byte arg0, boolean arg1, int arg2) {
        field381++;
        class148 var4 = (class148) class274.field4390.method57((long) ((arg1 ? 262144 : 0) | arg2 << 16 | this.field375), -112);
        if (var4 != null) {
            return var4;
        }
        class116.field2076.method727(this.field375, (byte) -123);
        class148 var5 = class207.method1387((byte) -70, class116.field2076, this.field375, 0);
        if (var5 != null) {
            var5.method1022(class209.field3544, class7.field91, class53.field931);
            var5.field1721 = var5.field1711;
            var5.field1712 = var5.field1709;
            if (arg1) {
                var5.method1026();
            }
            for (int var6 = 0; var6 < arg2; var6++) {
                var5.method1023();
            }
            class274.field4390.method62(0, var5, (long) (this.field375 | arg2 << 16 | (arg1 ? 262144 : 0)));
        }
        int var7 = 69 % ((37 - arg0) / 33);
        return var5;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
    public static final void method171(int arg0) {
        if (arg0 != 0) {
            method171(-126);
        }
        field374++;
        class241.field3966.method53(true);
    }
}
