import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class284 {

    @OriginalMember(owner = "client!c", name = "y", descriptor = "I")
    private int field4365 = 0;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "[Lnh;")
    public class288[] field4351;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field4360 = 0;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[Lrj;")
    public static class274[] field4358 = new class274[14];

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Z")
    public static boolean field4342 = true;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field4356 = 0;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field4347 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!c", name = "w", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "J")
    private long field4341;

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Lmd;")
    public static class120 field4364;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "Lnh;")
    private class288 field4362;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "Lnh;")
    private class288 field4366;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)Lnh;")
    public final class288 method1887(byte arg0) {
        field4354++;
        if (this.field4362 == null) {
            return null;
        }
        class288 var2 = this.field4351[(int) (this.field4341 & (long) (this.field4357 - 1))];
        while (this.field4362 != var2) {
            if (this.field4362.field4489 == this.field4341) {
                class288 var3 = this.field4362;
                this.field4362 = this.field4362.field4487;
                return var3;
            }
            this.field4362 = this.field4362.field4487;
        }
        if (arg0 != 105) {
            field4342 = true;
        }
        this.field4362 = null;
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method1888(int arg0) {
        if (arg0 >= -72) {
            field4358 = null;
        }
        field4358 = null;
        field4364 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)Lnh;")
    public final class288 method1889(boolean arg0) {
        if (arg0) {
            return null;
        }
        field4363++;
        if (this.field4365 > 0 && this.field4351[this.field4365 - 1] != this.field4366) {
            class288 var2 = this.field4366;
            this.field4366 = var2.field4487;
            return var2;
        }
        while (this.field4357 > this.field4365) {
            class288 var3 = this.field4351[this.field4365++].field4487;
            if (this.field4351[this.field4365 - 1] != var3) {
                this.field4366 = var3.field4487;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(B)Lnh;")
    public final class288 method1890(byte arg0) {
        field4352++;
        this.field4365 = 0;
        return arg0 <= 76 ? null : this.method1889(false);
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)I")
    public final int method1891(byte arg0) {
        field4346++;
        int var2 = 58 / ((-arg0 - 13) / 60);
        return this.field4357;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(Z)I")
    public final int method1892(boolean arg0) {
        field4345++;
        int var2 = 0;
        int var3 = 0;
        if (arg0) {
            method1897(72);
        }
        while (this.field4357 > var3) {
            class288 var4 = this.field4351[var3];
            class288 var5 = var4.field4487;
            while (var4 != var5) {
                var5 = var5.field4487;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IB)V")
    public static final void method1893(int arg0, byte arg1) {
        field4353++;
        int var2 = 113 / ((60 - arg1) / 62);
        class66 var3 = class6.method34(8, true, arg0);
        var3.method410(116);
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILnh;J)V")
    public final void method1894(int arg0, class288 arg1, long arg2) {
        if (arg1.field4482 != null) {
            arg1.method1935(121);
        }
        field4361++;
        class288 var5 = this.field4351[(int) (arg2 & (long) (this.field4357 + arg0))];
        arg1.field4482 = var5.field4482;
        arg1.field4489 = arg2;
        arg1.field4487 = var5;
        arg1.field4482.field4487 = arg1;
        arg1.field4487.field4482 = arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(JI)Lnh;")
    public final class288 method1895(long arg0, int arg1) {
        this.field4341 = arg0;
        if (arg1 >= -107) {
            return null;
        }
        class288 var4 = this.field4351[(int) ((long) (this.field4357 - 1) & arg0)];
        field4343++;
        for (this.field4362 = var4.field4487; this.field4362 != var4; this.field4362 = this.field4362.field4487) {
            if (this.field4362.field4489 == arg0) {
                class288 var5 = this.field4362;
                this.field4362 = this.field4362.field4487;
                return var5;
            }
        }
        this.field4362 = null;
        return null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILbc;)V")
    public static final void method1896(int arg0, class282 arg1) {
        class2.field32 = arg1.method1844("p11_full", arg0 - 39);
        field4348++;
        class26.field316 = arg1.method1844("p12_full", 94);
        class166.field2385 = arg1.method1844("b12_full", 75);
        class60.field716 = arg1.method1844("mapfunction", -70);
        class96.field1281 = arg1.method1844("hitmarks", 109);
        class30.field366 = arg1.method1844("hitbar_default", -115);
        class72.field869 = arg1.method1844("headicons_pk", -114);
        class3.field36 = arg1.method1844("headicons_prayer", -89);
        class161.field2324 = arg1.method1844("hint_headicons", arg0 - 38);
        class277.field4213 = arg1.method1844("hint_mapmarkers", -79);
        class243.field3547 = arg1.method1844("mapflag", 81);
        class223.field3152 = arg1.method1844("cross", -95);
        class241.field3512 = arg1.method1844("mapdots", 112);
        class135.field1971 = arg1.method1844("scrollbar", 93);
        if (arg0 == 0) {
            class21.field254 = arg1.method1844("name_icons", arg0 ^ 0xFFFFFFA7);
            class97.field1299 = arg1.method1844("floorshadows", -67);
            class152.field2203 = arg1.method1844("compass", -94);
            class280.field4250 = arg1.method1844("hint_mapedge", arg0 + 83);
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)[Lpk;")
    public static final class43[] method1897(int arg0) {
        class43[] var1 = new class43[class133.field1921];
        field4355++;
        if (arg0 != 18467) {
            method1897(-66);
        }
        for (int var2 = 0; var2 < class133.field1921; var2++) {
            var1[var2] = new class43(class238.field3435, class118.field1660, class233.field3367[var2], class273.field4041[var2], class296.field4677[var2], class91.field1236[var2], class277.field4210[var2], class165.field2367);
        }
        class294.method1965(true);
        return var1;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public final void method1898(int arg0) {
        for (int var2 = 0; var2 < this.field4357; var2++) {
            class288 var3 = this.field4351[var2];
            while (true) {
                class288 var4 = var3.field4487;
                if (var3 == var4) {
                    break;
                }
                var4.method1935(109);
            }
        }
        this.field4366 = null;
        this.field4362 = null;
        field4349++;
        if (arg0 <= 55) {
            this.field4362 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(Z)V")
    public static final void method1899(boolean arg0) {
        field4344++;
        class71.field840.method67((byte) 96);
        if (!arg0) {
            class166.field2382.method67((byte) 121);
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(I)V")
    public class284(int arg0) {
        this.field4351 = new class288[arg0];
        this.field4357 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class288 var3 = this.field4351[var2] = new class288();
            var3.field4482 = var3;
            var3.field4487 = var3;
        }
    }
}
