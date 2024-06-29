import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class217 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lrb;")
    private class255 field3740 = new class255();

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Leb;")
    public static class230 field3744 = class68.method589(0, "headicons_pk");

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[J")
    public static long[] field3750 = new long[32];

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field3751 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public static int field3753 = 0;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3741;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lrb;")
    private class255 field3745;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
    public static void method1492(byte arg0) {
        field3750 = null;
        if (arg0 != 6) {
            field3750 = null;
        }
        field3744 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static final void method1493(int arg0) {
        field3747++;
        if (class57.field1057 == 30) {
            class26.method260(-11, 25);
        }
        if (arg0 != 0) {
            method1500(17L, 25);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILrb;)V")
    public final void method1494(int arg0, class255 arg1) {
        int var3 = 101 % ((arg0 + 85) / 41);
        if (arg1.field4549 != null) {
            arg1.method1785(-107);
        }
        arg1.field4539 = this.field3740;
        arg1.field4549 = this.field3740.field4549;
        field3746++;
        arg1.field4549.field4539 = arg1;
        arg1.field4539.field4549 = arg1;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)Lrb;")
    public final class255 method1495(byte arg0) {
        field3752++;
        if (arg0 != 36) {
            return null;
        }
        class255 var2 = this.field3745;
        if (this.field3740 == var2) {
            this.field3745 = null;
            return null;
        } else {
            this.field3745 = var2.field4539;
            return var2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public final void method1496(byte arg0) {
        while (true) {
            class255 var2 = this.field3740.field4539;
            if (this.field3740 == var2) {
                field3741++;
                int var3 = -69 / ((27 - arg0) / 58);
                this.field3745 = null;
                return;
            }
            var2.method1785(-83);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)Lrb;")
    public final class255 method1497(boolean arg0) {
        class255 var2 = this.field3740.field4539;
        field3738++;
        if (this.field3740 == var2) {
            this.field3745 = null;
            return null;
        }
        this.field3745 = var2.field4539;
        if (!arg0) {
            this.method1499(80);
        }
        return var2;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)Lrb;")
    public final class255 method1498(int arg0) {
        if (arg0 != 0) {
            field3751 = 23;
        }
        field3742++;
        class255 var2 = this.field3740.field4539;
        if (this.field3740 == var2) {
            return null;
        } else {
            var2.method1785(-76);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)I")
    public final int method1499(int arg0) {
        if (arg0 != -101) {
            return -52;
        }
        field3739++;
        class255 var2 = this.field3740.field4539;
        int var3 = 0;
        while (this.field3740 != var2) {
            var2 = var2.field4539;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(JI)V")
    public static final void method1500(long arg0, int arg1) {
        field3749++;
        if (arg0 == 0L) {
            return;
        }
        if (class45.field796 >= 100) {
            class227.method1565(class89.field1580, (byte) 93, 0, class147.field2658);
            return;
        }
        class230 var3 = class113.method906(arg0, (byte) -124).method1623(-30947);
        for (int var4 = 0; var4 < class45.field796; var4++) {
            if (class145.field2607[var4] == arg0) {
                class227.method1565(class89.field1580, (byte) 48, 0, class173.method1267((byte) 59, new class230[] { var3, class99.field1841 }));
                return;
            }
        }
        int var5 = 0;
        if (arg1 <= 42) {
            method1493(123);
        }
        while (class273.field4805 > var5) {
            if (class140.field2508[var5] == arg0) {
                class227.method1565(class89.field1580, (byte) 86, 0, class173.method1267((byte) 59, new class230[] { class98.field1814, var3, class68.field1271 }));
                return;
            }
            var5++;
        }
        if (var3.method1585(class56.field1033.field4620, 73)) {
            class227.method1565(class89.field1580, (byte) 50, 0, class58.field1089);
            return;
        }
        class145.field2607[class45.field796] = arg0;
        class79.field1441++;
        class146.field2627[class45.field796++] = class113.method906(arg0, (byte) -109);
        class67.field1265 = class54.field935;
        class153.field2747.method978(37, 96);
        class153.field2747.method148(arg0, (byte) 124);
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class217() {
        this.field3740.field4549 = this.field3740;
        this.field3740.field4539 = this.field3740;
    }
}
