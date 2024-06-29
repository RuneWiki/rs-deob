import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!RTDMFIDA")
public class class50 {

    @OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "I")
    private int field1352 = -836;

    @OriginalMember(owner = "client!RTDMFIDA", name = "f", descriptor = "I")
    public int field1357 = -1;

    @OriginalMember(owner = "client!RTDMFIDA", name = "h", descriptor = "[I")
    public int[] field1359 = new int[6];

    @OriginalMember(owner = "client!RTDMFIDA", name = "i", descriptor = "[I")
    public int[] field1360 = new int[6];

    @OriginalMember(owner = "client!RTDMFIDA", name = "j", descriptor = "I")
    public int field1361 = 128;

    @OriginalMember(owner = "client!RTDMFIDA", name = "k", descriptor = "I")
    public int field1362 = 128;

    @OriginalMember(owner = "client!RTDMFIDA", name = "o", descriptor = "LEQSIBNHW;")
    public static class10 field1366 = new class10(30, 451);

    @OriginalMember(owner = "client!RTDMFIDA", name = "b", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!RTDMFIDA", name = "d", descriptor = "I")
    public int field1355;

    @OriginalMember(owner = "client!RTDMFIDA", name = "e", descriptor = "I")
    public int field1356;

    @OriginalMember(owner = "client!RTDMFIDA", name = "l", descriptor = "I")
    public int field1363;

    @OriginalMember(owner = "client!RTDMFIDA", name = "m", descriptor = "I")
    public int field1364;

    @OriginalMember(owner = "client!RTDMFIDA", name = "n", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!RTDMFIDA", name = "g", descriptor = "LKMWMLVIH;")
    public class26 field1358;

    @OriginalMember(owner = "client!RTDMFIDA", name = "c", descriptor = "[LRTDMFIDA;")
    public static class50[] field1354;

    @OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "(LWEMOPWVJ;I)V")
    public static void method446(class62 arg0, int arg1) {
        class52 var2 = new class52(arg0.method559("spotanim.dat", null), true);
        field1353 = var2.method463();
        if (field1354 == null) {
            field1354 = new class50[field1353];
        }
        for (int var3 = 0; var3 < field1353; var3++) {
            if (field1354[var3] == null) {
                field1354[var3] = new class50();
            }
            field1354[var3].field1355 = var3;
            field1354[var3].method447(-13096, var2);
        }
        if (arg1 != 24414) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "(ILSVWJKJVI;)V")
    public void method447(int arg0, class52 arg1) {
        if (arg0 != -13096) {
            this.field1352 = 233;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method461();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1356 = arg1.method463();
                } else if (var3 == 2) {
                    this.field1357 = arg1.method463();
                    if (class26.field921 != null) {
                        this.field1358 = class26.field921[this.field1357];
                    }
                } else if (var3 == 4) {
                    this.field1361 = arg1.method463();
                } else if (var3 == 5) {
                    this.field1362 = arg1.method463();
                } else if (var3 == 6) {
                    this.field1363 = arg1.method463();
                } else if (var3 == 7) {
                    this.field1364 = arg1.method461();
                } else if (var3 == 8) {
                    this.field1365 = arg1.method461();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1359[var3 - 40] = arg1.method463();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1360[var3 - 50] = arg1.method463();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!RTDMFIDA", name = "a", descriptor = "()LIYSWJGDE;")
    public class19 method448() {
        class19 var1 = (class19) field1366.method175((long) this.field1355);
        if (var1 != null) {
            return var1;
        }
        class19 var2 = class19.method273(this.field1356);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1359[0] != 0) {
                var2.method287(this.field1359[var3], this.field1360[var3]);
            }
        }
        field1366.method176(825, (long) this.field1355, var2);
        return var2;
    }
}
