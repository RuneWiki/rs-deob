import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class343 implements class258 {

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Lad;")
    private class268 field4587 = new class268(128);

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "[I")
    private int[] field4593 = new int[class458.field6219.field2891];

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "[I")
    public int[] field4585 = new int[class458.field6219.field2891];

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field4588 = -1;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field4589 = 0;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "[I")
    public static int[] field4599 = new int[4096];

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "Lmc;")
    public static class78 field4591 = new class78(24, -1);

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "Ldn;")
    public static class329 field4601 = null;

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
    public static boolean field4602 = true;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "I")
    public static int field4600 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(III)V")
    public final void method1942(int arg0, int arg1, int arg2) {
        field4584++;
        class288 var4 = class302.field4021.method1226(arg0, -76);
        int var5 = var4.field3882;
        int var6 = var4.field3875;
        int var7 = var4.field3876;
        int var8 = class14.field188[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        if (arg1 == 0) {
            int var9 = var8 << var6;
            this.method1943(false, var5, this.field4585[var5] & ~var9 | var9 & arg2 << var6);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZII)V")
    public final void method1943(boolean arg0, int arg1, int arg2) {
        field4598++;
        this.field4585[arg1] = arg2;
        class171 var4 = (class171) this.field4587.method1528((long) arg1, 113);
        if (arg0) {
            return;
        }
        if (var4 == null) {
            class171 var5 = new class171(class440.method2583(25267) + 500L);
            this.field4587.method1525((byte) 19, var5, (long) arg1);
        } else {
            var4.field2348 = class440.method2583(25267) + 500L;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)V")
    public final void method1944(byte arg0) {
        for (int var2 = 0; var2 < class458.field6219.field2891; var2++) {
            class153 var3 = class458.field6219.method1221(var2, (byte) 99);
            if (var3 != null && var3.field2151 == 0) {
                this.field4593[var2] = 0;
                this.field4585[var2] = 0;
            }
        }
        field4595++;
        this.field4587 = new class268(128);
        if (arg0 != 9) {
            field4591 = null;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V")
    public static void method1945(byte arg0) {
        field4599 = null;
        field4601 = null;
        field4591 = null;
        if (arg0 > -66) {
            method1945((byte) 22);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)I")
    public final int method1455(byte arg0, int arg1) {
        field4592++;
        class288 var3 = class302.field4021.method1226(arg1, -97);
        int var4 = var3.field3882;
        if (arg0 != -35) {
            this.field4593 = null;
        }
        int var5 = var3.field3875;
        int var6 = var3.field3876;
        int var7 = class14.field188[var6 - var5];
        return this.field4585[var4] >> var5 & var7;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZ)I")
    public final int method1946(int arg0, boolean arg1) {
        if (arg0 <= 113) {
            return 8;
        }
        field4596++;
        long var3 = class440.method2583(25267);
        for (class171 var5 = arg1 ? (class171) this.field4587.method1518((byte) -63) : (class171) this.field4587.method1517(-30942); var5 != null; var5 = (class171) this.field4587.method1517(-30942)) {
            if (var3 > (var5.field2348 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field2348 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6047;
                    this.field4585[var6] = this.field4593[var6];
                    var5.method2614((byte) -115);
                    return var6;
                }
                var5.method2614((byte) -71);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZZBII)V")
    public static final void method1947(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field4597++;
        class214.method1211(34, arg1, arg3, 0, arg4, class159.field2195.length - 1, arg0);
        class142.field2054 = 0;
        int var5 = -41 % ((-arg2 - 38) / 50);
        class483.field6660 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    public final int method1454(int arg0, int arg1) {
        field4586++;
        if (arg0 != 1633) {
            this.method1948(-76, (byte) 123, 54);
        }
        return this.field4585[arg1];
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IBI)V")
    public final void method1948(int arg0, byte arg1, int arg2) {
        if (arg1 > -26) {
            this.method1946(20, true);
        }
        this.field4593[arg2] = arg0;
        field4594++;
        class171 var4 = (class171) this.field4587.method1528((long) arg2, 117);
        if (var4 == null) {
            class171 var5 = new class171(4611686018427387905L);
            this.field4587.method1525((byte) 19, var5, (long) arg2);
        } else if (var4.field2348 != 4611686018427387905L) {
            var4.field2348 = class440.method2583(25267) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(III)V")
    public final void method1949(int arg0, int arg1, int arg2) {
        field4590++;
        class288 var4 = class302.field4021.method1226(arg0, -84);
        int var5 = var4.field3882;
        int var6 = var4.field3875;
        int var7 = var4.field3876;
        if (arg1 != 25963) {
            return;
        }
        int var8 = class14.field188[var7 - var6];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method1948(this.field4593[var5] & ~var9 | arg2 << var6 & var9, (byte) -71, var5);
    }
}
