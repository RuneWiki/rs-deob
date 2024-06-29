import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class190 {

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    private int field2703 = 0;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[Lwg;")
    public class254[] field2698;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field2688 = 0;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Lqd;")
    public static class37 field2691 = new class37(5);

    @OriginalMember(owner = "client!h", name = "x", descriptor = "I")
    public static int field2708 = 0;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!h", name = "j", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "J")
    private long field2701;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lve;")
    public static class233 field2705;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lbh;")
    public static class239 field2707;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "Lwg;")
    private class254 field2693;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "Lwg;")
    private class254 field2702;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)Lug;")
    public static final class270 method1213(int arg0, int arg1, int arg2) {
        if (arg0 != 25702) {
            field2691 = null;
        }
        field2695++;
        class270 var3 = (class270) class31.field445.method1218((long) arg1 | (long) arg2 << 32, 107);
        if (var3 == null) {
            var3 = new class270(arg2, arg1);
            class31.field445.method1215(var3, -89, var3.field3851);
        }
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static final void method1214(byte arg0) {
        if (arg0 != 121) {
            method1214((byte) -45);
        }
        field2706++;
        try {
            if (class184.field2620 == 1) {
                int var1 = class138.field1995.method426((byte) 74);
                if (var1 > 0 && class138.field1995.method429(arg0 ^ 0x79)) {
                    int var2 = var1 - class113.field1614;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class138.field1995.method411((byte) -94, var2);
                } else {
                    class138.field1995.method421((byte) 27);
                    class138.field1995.method415(2);
                    class225.field3377 = null;
                    class94.field1436 = null;
                    if (class154.field2255 == null) {
                        class184.field2620 = 0;
                    } else {
                        class184.field2620 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class138.field1995.method421((byte) 68);
            class154.field2255 = null;
            class225.field3377 = null;
            class94.field1436 = null;
            class184.field2620 = 0;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lwg;IJ)V")
    public final void method1215(class254 arg0, int arg1, long arg2) {
        field2692++;
        if (arg0.field3860 != null) {
            arg0.method1706(-93);
        }
        class254 var5 = this.field2698[(int) ((long) (this.field2687 - 1) & arg2)];
        arg0.field3860 = var5.field3860;
        arg0.field3859 = var5;
        if (arg1 > -87) {
            field2704 = 43;
        }
        arg0.field3860.field3859 = arg0;
        arg0.field3859.field3860 = arg0;
        arg0.field3851 = arg2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)I")
    public final int method1216(int arg0) {
        if (arg0 < 6) {
            return -50;
        } else {
            field2700++;
            return this.field2687;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
    public final int method1217(int arg0) {
        if (arg0 > -31) {
            this.field2698 = null;
        }
        field2697++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2687; var3++) {
            class254 var4 = this.field2698[var3];
            class254 var5 = var4.field3859;
            while (var4 != var5) {
                var5 = var5.field3859;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(JI)Lwg;")
    public final class254 method1218(long arg0, int arg1) {
        this.field2701 = arg0;
        field2685++;
        class254 var4 = this.field2698[(int) ((long) (this.field2687 - 1) & arg0)];
        for (this.field2693 = var4.field3859; this.field2693 != var4; this.field2693 = this.field2693.field3859) {
            if (this.field2693.field3851 == arg0) {
                class254 var6 = this.field2693;
                this.field2693 = this.field2693.field3859;
                return var6;
            }
        }
        this.field2693 = null;
        int var5 = 78 % ((55 - arg1) / 47);
        return null;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Lwg;")
    public final class254 method1219(int arg0) {
        if (arg0 == 1) {
            this.field2703 = 0;
            field2694++;
            return this.method1223(77);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V")
    public static final void method1220(byte arg0, int arg1) {
        field2699++;
        class57 var2 = class158.field2300;
        synchronized (class158.field2300) {
            if (arg0 != 67) {
                method1221(false);
            }
            class273.field4345 = arg1;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method1221(boolean arg0) {
        field2691 = null;
        if (arg0) {
            field2707 = null;
        }
        field2705 = null;
        field2707 = null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)V")
    public final void method1222(int arg0) {
        for (int var2 = arg0; var2 < this.field2687; var2++) {
            class254 var3 = this.field2698[var2];
            while (true) {
                class254 var4 = var3.field3859;
                if (var3 == var4) {
                    break;
                }
                var4.method1706(arg0 ^ 0xFFFFFF92);
            }
        }
        this.field2693 = null;
        this.field2702 = null;
        field2689++;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)Lwg;")
    public final class254 method1223(int arg0) {
        field2690++;
        if (this.field2703 > 0 && this.field2698[this.field2703 - 1] != this.field2702) {
            class254 var2 = this.field2702;
            this.field2702 = var2.field3859;
            return var2;
        }
        if (arg0 <= 63) {
            this.field2693 = null;
        }
        while (this.field2703 < this.field2687) {
            class254 var3 = this.field2698[this.field2703++].field3859;
            if (this.field2698[this.field2703 - 1] != var3) {
                this.field2702 = var3.field3859;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)Lwg;")
    public final class254 method1224(int arg0) {
        field2696++;
        if (this.field2693 == null) {
            return null;
        }
        class254 var2 = this.field2698[(int) ((long) (this.field2687 - 1) & this.field2701)];
        while (this.field2693 != var2) {
            if (this.field2693.field3851 == this.field2701) {
                class254 var3 = this.field2693;
                this.field2693 = this.field2693.field3859;
                return var3;
            }
            this.field2693 = this.field2693.field3859;
        }
        this.field2693 = null;
        return arg0 < 90 ? null : null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(I)V")
    public class190(int arg0) {
        this.field2687 = arg0;
        this.field2698 = new class254[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class254 var3 = this.field2698[var2] = new class254();
            var3.field3860 = var3;
            var3.field3859 = var3;
        }
    }
}
