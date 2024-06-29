import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class162 {

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "Lcn;")
    private class356 field2422 = new class356();

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
    private int field2427;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    private int field2428;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "Lmn;")
    private class247 field2420;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field2430 = -1;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Lr;")
    public static class121 field2439 = null;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BJ)V", line = 3)
    private final void method1060(byte arg0, long arg1) {
        field2425++;
        if (arg0 != -62) {
            field2439 = null;
        }
        class202 var4 = (class202) this.field2420.method1492(arg1, 6340);
        this.method1074((byte) -123, var4);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I", line = 16)
    public final int method1061(int arg0) {
        field2419++;
        int var2 = 0;
        if (arg0 != -5) {
            field2435 = 117;
        }
        for (class202 var3 = (class202) this.field2422.method2130(false); var3 != null; var3 = (class202) this.field2422.method2131(true)) {
            if (!var3.method1041((byte) -108)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)V", line = 44)
    public static final void method1062(byte arg0, int arg1) {
        field2432++;
        if (class433.field6358 == arg1) {
            return;
        }
        class527.field7799 = class422.field6182 = class206.field2882[arg1];
        class357.method2139((byte) -128);
        class18.field237 = new int[4][class527.field7799 >> 3][class422.field6182 >> 3];
        class351.field5160 = new int[class527.field7799][class422.field6182];
        class300.field4132 = new int[class527.field7799][class422.field6182];
        for (int var2 = 0; var2 < 4; var2++) {
            class82.field1229[var2] = class217.method1347(class527.field7799, 5761, class422.field6182);
        }
        class475.field6931 = new byte[4][class527.field7799][class422.field6182];
        class197.method1238(4, false, class527.field7799, class422.field6182);
        class437.method2573(class527.field7799 >> 3, 2, class269.field3721, class422.field6182 >> 3);
        int var3 = -77 % ((arg0 - 32) / 52);
        class433.field6358 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 74)
    public final Object method1063(int arg0) {
        field2433++;
        class202 var2 = (class202) this.field2420.method1493((byte) 94);
        int var3 = -52 % ((arg0 - 19) / 54);
        while (var2 != null) {
            Object var4 = var2.method1039(0);
            if (var4 != null) {
                return var4;
            }
            class202 var5 = var2;
            var2 = (class202) this.field2420.method1493((byte) 74);
            var5.method1565(0);
            var5.method36(0);
            this.field2427 += var2.field2843;
        }
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)I", line = 104)
    public final int method1064(int arg0) {
        field2438++;
        return arg0 < 42 ? 6 : this.field2428;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(BI)V", line = 115)
    public final void method1065(byte arg0, int arg1) {
        field2436++;
        if (arg0 != -95 || class308.field4196 == null) {
            return;
        }
        for (class202 var3 = (class202) this.field2422.method2130(false); var3 != null; var3 = (class202) this.field2422.method2131(true)) {
            if (var3.method1041((byte) -110)) {
                if (var3.method1039(arg0 + 95) == null) {
                    var3.method1565(0);
                    var3.method36(0);
                    this.field2427++;
                }
            } else if ((++var3.field115) > ((long) arg1)) {
                class202 var4 = class308.field4196.method1380(var3, 17);
                this.field2420.method1487(-88, var3.field3615, var4);
                class193.method1206(60, var4, var3);
                var3.method1565(0);
                var3.method36(0);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 165)
    public final void method1066(int arg0) {
        for (class202 var2 = (class202) this.field2422.method2130(false); var2 != null; var2 = (class202) this.field2422.method2131(true)) {
            if (var2.method1041((byte) -110)) {
                var2.method1565(0);
                var2.method36(0);
                this.field2427 += var2.field2843;
            }
        }
        if (arg0 != 4080) {
            field2439 = null;
        }
        field2424++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JLjava/lang/Object;II)V", line = 193)
    private final void method1067(long arg0, Object arg1, int arg2, int arg3) {
        field2437++;
        if (this.field2428 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method1060((byte) -62, arg0);
        this.field2427 -= arg3;
        while (this.field2427 < 0) {
            class202 var7 = (class202) this.field2422.method2128(arg2 + 1339);
            this.method1074((byte) -113, var7);
        }
        class156 var6 = new class156(arg1, arg3);
        this.field2420.method1487(arg2 ^ 0xFFFFFFCC, arg0, var6);
        this.field2422.method2127((byte) -100, var6);
        var6.field115 = arg2;
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(I)V", line = 377)
    public class162(int arg0) {
        this.field2427 = arg0;
        this.field2428 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2420 = new class247(var2);
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 231)
    public final void method1068(int arg0) {
        this.field2422.method2135(-121);
        field2418++;
        this.field2420.method1490(true);
        this.field2427 = this.field2428;
        if (arg0 != 0) {
            this.field2422 = null;
        }
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "(I)I", line = 245)
    public final int method1069(int arg0) {
        field2434++;
        return arg0 > -53 ? 113 : this.field2427;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lmf;B)V", line = 259)
    public static final void method1070(class289 arg0, byte arg1) {
        arg0.field4005 = null;
        field2421++;
        int var2 = arg0.field4009.length;
        for (int var3 = 0; var3 < var2; var3++) {
            arg0.field4009[var3].field5644 = false;
        }
        int var4 = -115 / ((-arg1 - 44) / 45);
        class410[] var5 = class281.field3858;
        synchronized (class281.field3858) {
            if (var2 < class281.field3858.length && class487.field7131[var2] < 200) {
                class281.field3858[var2].method2454(-9946, arg0);
                int var10002 = class487.field7131[var2]++;
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 287)
    public final Object method1071(byte arg0) {
        field2431++;
        class202 var2 = (class202) this.field2420.method1494(0);
        while (var2 != null) {
            Object var3 = var2.method1039(0);
            if (var3 != null) {
                return var3;
            }
            class202 var4 = var2;
            var2 = (class202) this.field2420.method1493((byte) 102);
            var4.method1565(0);
            var4.method36(0);
            this.field2427 += var2.field2843;
        }
        if (arg0 != 68) {
            this.field2428 = 37;
        }
        return null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JLjava/lang/Object;Z)V", line = 322)
    public final void method1072(long arg0, Object arg1, boolean arg2) {
        field2423++;
        if (arg2) {
            this.field2420 = null;
        }
        this.method1067(arg0, arg1, 0, 1);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(JZ)Ljava/lang/Object;", line = 335)
    public final Object method1073(long arg0, boolean arg1) {
        field2426++;
        class202 var4 = (class202) this.field2420.method1492(arg0, 6340);
        if (var4 == null) {
            return null;
        } else if (arg1) {
            return null;
        } else {
            Object var5 = var4.method1039(0);
            if (var5 == null) {
                var4.method1565(0);
                var4.method36(0);
                this.field2427 += var4.field2843;
                return null;
            }
            if (var4.method1041((byte) -119)) {
                class156 var6 = new class156(var5, var4.field2843);
                this.field2420.method1487(-51, var4.field3615, var6);
                this.field2422.method2127((byte) -113, var6);
                var6.field115 = 0L;
                var4.method1565(0);
                var4.method36(0);
            } else {
                this.field2422.method2127((byte) -125, var4);
                var4.field115 = 0L;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BLce;)V", line = 397)
    private final void method1074(byte arg0, class202 arg1) {
        if (arg0 > -68) {
            this.method1071((byte) -115);
        }
        field2429++;
        if (arg1 != null) {
            arg1.method1565(0);
            arg1.method36(0);
            this.field2427 += arg1.field2843;
        }
    }
}
