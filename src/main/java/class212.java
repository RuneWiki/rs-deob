import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class212 {

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    private int field3536 = 0;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[Lvj;")
    private class107[] field3526;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[I")
    public static int[] field3517 = new int[5];

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3519 = 2;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "[[B")
    public static byte[][] field3521 = new byte[250][];

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "Z")
    public static boolean field3522 = true;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "Ldf;")
    public static class51 field3535 = class46.method233("_labels", 100);

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Llb;")
    public static class121 field3533 = new class121(new byte[5000]);

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "J")
    private long field3516;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "Lvj;")
    private class107 field3528;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "Lvj;")
    private class107 field3538;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lu;")
    public static class111 field3530;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lja;")
    public static class55 field3518;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)Lvj;")
    public final class107 method1446(boolean arg0) {
        field3529++;
        if (this.field3528 == null) {
            return null;
        }
        class107 var2 = this.field3526[(int) ((long) (this.field3534 - 1) & this.field3516)];
        if (arg0) {
            return null;
        }
        while (this.field3528 != var2) {
            if (this.field3528.field1760 == this.field3516) {
                class107 var3 = this.field3528;
                this.field3528 = this.field3528.field1770;
                return var3;
            }
            this.field3528 = this.field3528.field1770;
        }
        this.field3528 = null;
        return null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IJLvj;)V")
    public final void method1447(int arg0, long arg1, class107 arg2) {
        field3532++;
        if (arg2.field1758 != null) {
            arg2.method764((byte) -20);
        }
        int var5 = -46 / ((-arg0 - 39) / 48);
        class107 var6 = this.field3526[(int) (arg1 & (long) (this.field3534 - 1))];
        arg2.field1760 = arg1;
        arg2.field1770 = var6;
        arg2.field1758 = var6.field1758;
        arg2.field1758.field1770 = arg2;
        arg2.field1770.field1758 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public final void method1448(int arg0) {
        for (int var2 = arg0; var2 < this.field3534; var2++) {
            class107 var3 = this.field3526[var2];
            while (true) {
                class107 var4 = var3.field1770;
                if (var3 == var4) {
                    break;
                }
                var4.method764((byte) -59);
            }
        }
        field3525++;
        this.field3528 = null;
        this.field3538 = null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Lvj;")
    public final class107 method1449(int arg0) {
        field3527++;
        if (this.field3536 > 0 && this.field3526[this.field3536 - 1] != this.field3538) {
            class107 var2 = this.field3538;
            this.field3538 = var2.field1770;
            return var2;
        } else if (arg0 == -1) {
            while (this.field3534 > this.field3536) {
                class107 var3 = this.field3526[this.field3536++].field1770;
                if (this.field3526[this.field3536 - 1] != var3) {
                    this.field3538 = var3.field1770;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
    public final int method1450(byte arg0) {
        field3537++;
        if (arg0 != -16) {
            this.field3516 = 29L;
        }
        return this.field3534;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)Lvj;")
    public final class107 method1451(int arg0) {
        int var2 = 64 % ((11 - arg0) / 33);
        this.field3536 = 0;
        field3523++;
        return this.method1449(-1);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)V")
    public static void method1452(byte arg0) {
        int var1 = -11 % ((arg0 + 78) / 42);
        field3535 = null;
        field3518 = null;
        field3517 = null;
        field3530 = null;
        field3521 = null;
        field3533 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(JI)Lvj;")
    public final class107 method1453(long arg0, int arg1) {
        this.field3516 = arg0;
        field3531++;
        class107 var4 = this.field3526[(int) ((long) (this.field3534 - arg1) & arg0)];
        for (this.field3528 = var4.field1770; this.field3528 != var4; this.field3528 = this.field3528.field1770) {
            if (this.field3528.field1760 == arg0) {
                class107 var5 = this.field3528;
                this.field3528 = this.field3528.field1770;
                return var5;
            }
        }
        this.field3528 = null;
        return null;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static final void method1454(int arg0) {
        field3524++;
        if (arg0 != -1) {
            method1454(-31);
        }
        try {
            if (class52.field876 == 1) {
                int var1 = class162.field2656.method578(arg0 - 124);
                if (var1 > 0 && class162.field2656.method565(-6177080)) {
                    int var2 = var1 - class128.field2152;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class162.field2656.method596((byte) 122, var2);
                } else {
                    class162.field2656.method561(arg0 + 128);
                    class162.field2656.method570(1);
                    class69.field1110 = null;
                    class23.field343 = null;
                    if (class134.field2225 == null) {
                        class52.field876 = 0;
                    } else {
                        class52.field876 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class162.field2656.method561(111);
            class23.field343 = null;
            class52.field876 = 0;
            class134.field2225 = null;
            class69.field1110 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(I)V")
    public class212(int arg0) {
        this.field3526 = new class107[arg0];
        this.field3534 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class107 var3 = this.field3526[var2] = new class107();
            var3.field1758 = var3;
            var3.field1770 = var3;
        }
    }
}
