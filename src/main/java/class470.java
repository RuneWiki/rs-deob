import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class470 {

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    private int field6629 = 0;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "[Lah;")
    public class238[] field6624;

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
    public int field6615;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "[I")
    public static int[] field6613 = new int[500];

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
    public static boolean field6623 = false;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "I")
    public static int field6626 = -1;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field6609;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field6610;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field6611;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field6612;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field6614;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field6616;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field6617;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field6618;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field6621;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "J")
    private long field6619;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "Lah;")
    private class238 field6620;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "Lah;")
    private class238 field6627;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(JB)Lah;")
    public final class238 method2761(long arg0, byte arg1) {
        this.field6619 = arg0;
        field6616++;
        if (arg1 != -112) {
            this.field6620 = null;
        }
        class238 var4 = this.field6624[(int) ((long) (this.field6615 - 1) & arg0)];
        for (this.field6620 = var4.field3575; this.field6620 != var4; this.field6620 = this.field6620.field3575) {
            if (this.field6620.field3568 == arg0) {
                class238 var5 = this.field6620;
                this.field6620 = this.field6620.field3575;
                return var5;
            }
        }
        this.field6620 = null;
        return null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)I")
    public final int method2762(int arg0) {
        field6618++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field6615; var3++) {
            class238 var4 = this.field6624[var3];
            class238 var5 = var4.field3575;
            while (var4 != var5) {
                var5 = var5.field3575;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)I")
    public static final int method2763(int arg0) {
        field6617++;
        class232 var1 = class143.field1895;
        synchronized (class143.field1895) {
            if (arg0 <= 37) {
                method2766(45, 30);
            }
            return class143.field1895.method1482((byte) -76);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "([Lah;B)I")
    public final int method2764(class238[] arg0, byte arg1) {
        field6625++;
        int var3 = 0;
        int var4 = 0;
        if (arg1 < 108) {
            return 109;
        }
        while (this.field6615 > var4) {
            class238 var5 = this.field6624[var4];
            for (class238 var6 = var5.field3575; var6 != var5; var6 = var6.field3575) {
                arg0[var3++] = var6;
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)Lah;")
    public final class238 method2765(int arg0) {
        field6621++;
        if (this.field6620 == null) {
            return null;
        }
        class238 var2 = this.field6624[(int) (this.field6619 & (long) (this.field6615 + arg0))];
        while (this.field6620 != var2) {
            if (this.field6620.field3568 == this.field6619) {
                class238 var3 = this.field6620;
                this.field6620 = this.field6620.field3575;
                return var3;
            }
            this.field6620 = this.field6620.field3575;
        }
        this.field6620 = null;
        return null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V")
    public static final void method2766(int arg0, int arg1) {
        field6628++;
        if (class200.field2922 == arg1) {
            return;
        }
        class58.field758 = class287.field4181 = class364.field5234[arg1];
        class141.field1878.method625(50, (int) ((double) class58.field758 * 34.46D));
        class156.field2324 = new int[class58.field758][class287.field4181];
        class311.field4395 = new int[4][class58.field758 >> 3][class287.field4181 >> 3];
        class247.field3658 = new int[class58.field758][class287.field4181];
        for (int var2 = 0; var2 < 4; var2++) {
            class422.field5918[var2] = class485.method2835(class287.field4181, true, class58.field758);
        }
        class177.field2545 = new byte[4][class58.field758][class287.field4181];
        class422.method2480(class287.field4181, class58.field758, 4, -109);
        class467.method2748(class141.field1878, class58.field758 >> 3, class287.field4181 >> 3, -6219);
        class200.field2922 = arg1;
        if (arg0 >= -96) {
            method2772((byte) -117);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IJLah;)V")
    public final void method2767(int arg0, long arg1, class238 arg2) {
        field6622++;
        if (arg2.field3576 != null) {
            arg2.method1510((byte) -13);
        }
        class238 var5 = this.field6624[(int) (arg1 & (long) (this.field6615 + arg0))];
        arg2.field3575 = var5;
        arg2.field3576 = var5.field3576;
        arg2.field3576.field3575 = arg2;
        arg2.field3568 = arg1;
        arg2.field3575.field3576 = arg2;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)Lah;")
    public final class238 method2768(byte arg0) {
        field6610++;
        if (this.field6629 > 0 && this.field6624[this.field6629 - 1] != this.field6627) {
            class238 var2 = this.field6627;
            this.field6627 = var2.field3575;
            return var2;
        }
        while (this.field6615 > this.field6629) {
            class238 var3 = this.field6624[this.field6629++].field3575;
            if (this.field6624[this.field6629 - 1] != var3) {
                this.field6627 = var3.field3575;
                return var3;
            }
        }
        return arg0 == -88 ? null : null;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)Lah;")
    public final class238 method2769(byte arg0) {
        int var2 = 59 % ((arg0 + 26) / 41);
        field6609++;
        this.field6629 = 0;
        return this.method2768((byte) -88);
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(I)I")
    public final int method2770(int arg0) {
        if (arg0 <= 72) {
            return 67;
        } else {
            field6611++;
            return this.field6615;
        }
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)V")
    public final void method2771(int arg0) {
        field6614++;
        if (arg0 != -5) {
            this.field6627 = null;
        }
        for (int var2 = 0; var2 < this.field6615; var2++) {
            class238 var3 = this.field6624[var2];
            while (true) {
                class238 var4 = var3.field3575;
                if (var3 == var4) {
                    break;
                }
                var4.method1510((byte) -13);
            }
        }
        this.field6627 = null;
        this.field6620 = null;
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(B)V")
    public static void method2772(byte arg0) {
        field6613 = null;
        if (arg0 <= 62) {
            field6626 = 24;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(I)V")
    public class470(int arg0) {
        this.field6624 = new class238[arg0];
        this.field6615 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class238 var3 = this.field6624[var2] = new class238();
            var3.field3576 = var3;
            var3.field3575 = var3;
        }
    }
}
