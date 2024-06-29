import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class232 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lmd;")
    private class212 field3943 = new class212();

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "Lug;")
    private class57 field3951 = new class57();

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    private int field3950;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    private int field3948;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Lui;")
    private class236 field3949;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "[S")
    public static short[] field3945 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "[Lgd;")
    public static class65[] field3936;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JI)V")
    public final void method1494(long arg0, int arg1) {
        class212 var4 = (class212) this.field3949.method1527(arg0, (byte) -63);
        if (var4 != null) {
            var4.method1234(17216);
            var4.method1369(-124);
            this.field3950++;
        }
        if (arg1 == 21529) {
            field3947++;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)Llf;")
    public final class190 method1495(byte arg0) {
        if (arg0 != -111) {
            field3936 = null;
        }
        field3941++;
        return this.field3949.method1536(115);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)Llf;")
    public final class190 method1496(boolean arg0) {
        field3937++;
        if (arg0) {
            this.field3949 = null;
        }
        return this.field3949.method1534(-21389);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public final void method1497(byte arg0) {
        field3938++;
        this.field3951.method393((byte) -119);
        this.field3949.method1530(-1);
        this.field3943 = new class212();
        if (arg0 > 21) {
            this.field3950 = this.field3948;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JB)V")
    public static final void method1498(long arg0, byte arg1) {
        field3940++;
        if (arg0 == 0L) {
            return;
        }
        if (class103.field1662 >= 100 && class101.field1610 != 1 || class103.field1662 >= 200) {
            class229.method1475(class222.field3816, class92.field1445, -1, 0);
            return;
        }
        class168 var3 = class80.method532(arg0, (byte) 70).method1116(0);
        for (int var4 = 0; var4 < class103.field1662; var4++) {
            if (class56.field768[var4] == arg0) {
                class229.method1475(class222.field3816, class50.method347(2, new class168[] { var3, class175.field3074 }), -1, 0);
                return;
            }
        }
        int var5 = -28 % ((19 - arg1) / 48);
        for (int var6 = 0; var6 < class173.field3024; var6++) {
            if (class150.field2626[var6] == arg0) {
                class229.method1475(class222.field3816, class50.method347(2, new class168[] { class253.field4371, var3, class62.field854 }), -1, 0);
                return;
            }
        }
        if (var3.method1111(76, class7.field85.field2000)) {
            class229.method1475(class222.field3816, class97.field1525, -1, 0);
            return;
        }
        class32.field382[class103.field1662] = var3;
        class56.field768[class103.field1662] = arg0;
        class34.field425++;
        class138.field2439[class103.field1662] = 0;
        class30.field365[class103.field1662] = class222.field3816;
        class84.field1289[class103.field1662] = 0;
        class116.field1893[class103.field1662] = false;
        class103.field1662++;
        class103.field1667 = class205.field3566;
        class87.field1348.method672(240, 238);
        class87.field1348.method739(arg0, -23147);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IJ)Lmd;")
    public final class212 method1499(int arg0, long arg1) {
        field3944++;
        if (arg0 != 0) {
            this.field3951 = null;
        }
        class212 var4 = (class212) this.field3949.method1527(arg1, (byte) -109);
        if (var4 != null) {
            this.field3951.method400((byte) -128, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method1500(int arg0) {
        if (arg0 != 0) {
            field3945 = null;
        }
        field3945 = null;
        field3936 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB[II)V")
    public static final void method1501(int arg0, int arg1, byte arg2, int[] arg3, int arg4) {
        if (arg2 != -108) {
            field3935 = -46;
        }
        field3942++;
        arg1--;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg3[var6] = arg0;
            int var7 = var6 + 1;
            arg3[var7] = arg0;
            int var8 = var7 + 1;
            arg3[var8] = arg0;
            int var9 = var8 + 1;
            arg3[var9] = arg0;
            int var10 = var9 + 1;
            arg3[var10] = arg0;
            int var11 = var10 + 1;
            arg3[var11] = arg0;
            int var12 = var11 + 1;
            arg3[var12] = arg0;
            arg1 = var12 + 1;
            arg3[arg1] = arg0;
        }
        while (var13 > arg1) {
            arg1++;
            arg3[arg1] = arg0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLmd;J)V")
    public final void method1502(byte arg0, class212 arg1, long arg2) {
        field3939++;
        if (this.field3950 == 0) {
            class212 var5 = this.field3951.method396((byte) -97);
            var5.method1234(17216);
            var5.method1369(-126);
            if (this.field3943 == var5) {
                class212 var6 = this.field3951.method396((byte) -116);
                var6.method1234(17216);
                var6.method1369(-123);
            }
        } else {
            this.field3950--;
        }
        if (arg0 != -18) {
            field3945 = null;
        }
        this.field3949.method1533(arg2, 100, arg1);
        this.field3951.method400((byte) -29, arg1);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)[Luj;")
    public static final class158[] method1503(boolean arg0) {
        class158[] var1 = new class158[class85.field1331];
        int var2 = 0;
        if (arg0) {
            method1503(false);
        }
        while (var2 < class85.field1331) {
            var1[var2] = new class217(class243.field4225, class150.field2597, class33.field415[var2], class54.field746[var2], class85.field1332[var2], class69.field978[var2], class7.field84[var2], class92.field1457);
            var2++;
        }
        field3946++;
        class246.method1613(0);
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(I)V")
    public class232(int arg0) {
        this.field3950 = arg0;
        this.field3948 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3949 = new class236(var2);
    }
}
