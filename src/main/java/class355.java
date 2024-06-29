import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class355 {

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Ljv;")
    private class55 field5414 = new class55(64);

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Ljv;")
    public class55 field5425 = new class55(30);

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "Lbu;")
    private class17 field5420;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lbu;")
    public class17 field5415;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Lcm;")
    public static class510 field5421 = new class510();

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "[Z")
    public static boolean[] field5424 = new boolean[100];

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field5416;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public int field5427;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static final void method2245(int arg0) {
        class409.field6135 = 0;
        field5418++;
        for (int var1 = 0; var1 < 2048; var1++) {
            class445.field6640[var1] = null;
            class515.field7582[var1] = 1;
            class167.field2601[var1] = null;
        }
        int var2 = 126 / ((-arg0 - 63) / 57);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public final void method2246(byte arg0) {
        if (arg0 != -39) {
            field5421 = null;
        }
        class55 var2 = this.field5414;
        synchronized (this.field5414) {
            this.field5414.method484(37);
        }
        field5416++;
        class55 var3 = this.field5425;
        synchronized (this.field5425) {
            this.field5425.method484(-77);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
    public final void method2247(byte arg0) {
        field5422++;
        int var2 = 78 % ((-arg0 - 30) / 38);
        class55 var3 = this.field5414;
        synchronized (this.field5414) {
            this.field5414.method488(-3);
        }
        class55 var4 = this.field5425;
        synchronized (this.field5425) {
            this.field5425.method488(-3);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(B)V")
    public static void method2248(byte arg0) {
        if (arg0 < -95) {
            field5421 = null;
            field5424 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II)Laq;")
    public final class110 method2249(int arg0, int arg1) {
        field5412++;
        class55 var3 = this.field5414;
        class110 var4;
        synchronized (this.field5414) {
            var4 = (class110) this.field5414.method494(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5420.method114(class381.method2373(22683, arg0), class402.method2464((byte) 106, arg0), 123);
        class110 var6 = new class110();
        if (arg1 != -12502) {
            return null;
        }
        var6.field1868 = this;
        var6.field1844 = arg0;
        if (var5 != null) {
            var6.method826(-4550, new class145(var5));
        }
        class55 var7 = this.field5414;
        synchronized (this.field5414) {
            this.field5414.method485((long) arg0, (byte) -125, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V")
    public final void method2250(byte arg0, int arg1) {
        field5426++;
        if (arg0 <= 83) {
            this.method2246((byte) 86);
        }
        this.field5427 = arg1;
        class55 var3 = this.field5425;
        synchronized (this.field5425) {
            this.field5425.method488(-3);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(II)V")
    public final void method2251(int arg0, int arg1) {
        class55 var3 = this.field5414;
        synchronized (this.field5414) {
            this.field5414.method493(false, arg0);
        }
        field5413++;
        if (arg1 != 30) {
            method2248((byte) -13);
        }
        class55 var4 = this.field5425;
        synchronized (this.field5425) {
            this.field5425.method493(false, arg0);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)Z")
    public static final boolean method2252(int arg0, int arg1) {
        field5417++;
        if (class373.field5662[arg0]) {
            return true;
        } else if (class390.field5913.method124(19928, arg0)) {
            int var2 = class390.field5913.method119(29630, arg0);
            if (var2 == 0) {
                class373.field5662[arg0] = true;
                return true;
            }
            if (class22.field438[arg0] == null) {
                class22.field438[arg0] = new class350[var2];
            }
            if (arg1 > -4) {
                field5424 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class22.field438[arg0][var3] == null) {
                    byte[] var4 = class390.field5913.method114(var3, arg0, 11);
                    if (var4 != null) {
                        class350 var5 = class22.field438[arg0][var3] = new class350();
                        var5.field5322 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2227(new class145(var4), 0);
                    }
                }
            }
            class373.field5662[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public static final void method2253(int arg0) {
        class497.field7340.method488(-3);
        field5419++;
        if (arg0 > -19) {
            method2252(76, 75);
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Loq;ILbu;Lbu;)V")
    public class355(class239 arg0, int arg1, class17 arg2, class17 arg3) {
        this.field5420 = arg2;
        this.field5415 = arg3;
        int var5 = this.field5420.method138(false) - 1;
        this.field5420.method119(29630, var5);
    }
}
