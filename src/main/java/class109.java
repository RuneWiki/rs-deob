import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class109 extends class98 {

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "Lmb;")
    public static class96 field2011 = class243.method1708("Loaded titlescreen)3", (byte) 94);

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lmb;")
    public static class96 field2018 = class243.method1708("<img=1>", (byte) 95);

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Lmb;")
    public static class96 field2022 = class243.method1708("<col=ffb000>", (byte) 117);

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "Z")
    public static boolean field2014 = true;

    @OriginalMember(owner = "client!ca", name = "P", descriptor = "Lmb;")
    public static class96 field2024 = class243.method1708("Ladevorgang )2 bitte warten Sie)3", (byte) 123);

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ca", name = "O", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ca", name = "Q", descriptor = "Ldf;")
    private class146 field2025;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "[I")
    public static int[] field2016;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILrg;)V")
    public final void method834(int arg0, class239 arg1) {
        while (true) {
            int var3 = arg1.method1651(4139);
            if (var3 == 0) {
                field2021++;
                if (arg0 != -1) {
                    method840(47);
                    return;
                }
                return;
            }
            this.method839(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
    public static final void method835(int arg0, byte arg1) {
        class248.field4297 = 50;
        if (arg1 == 89) {
            field2020++;
            class175.field3051 = arg0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)I")
    public final int method836(int arg0, int arg1, int arg2) {
        field2023++;
        if (this.field2025 == null) {
            return arg2;
        }
        if (arg1 != 0) {
            field2016 = null;
        }
        class46 var4 = (class46) this.field2025.method1081(arg1, (long) arg0);
        return var4 == null ? arg2 : var4.field795;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZI)V")
    public static final void method837(boolean arg0, int arg1) {
        field2010++;
        class130.field2353 = arg0;
        class2.field18 = !class106.method786(122);
        if (arg1 != 14459) {
            field2019 = 13;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lmb;II)Lmb;")
    public final class96 method838(class96 arg0, int arg1, int arg2) {
        field2015++;
        if (this.field2025 == null) {
            return arg0;
        }
        class192 var4 = (class192) this.field2025.method1081(0, (long) arg1);
        if (arg2 != 20090) {
            this.method839((class239) null, 8, false);
        }
        return var4 == null ? arg0 : var4.field3315;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lrg;IZ)V")
    private final void method839(class239 arg0, int arg1, boolean arg2) {
        field2017++;
        if (arg2) {
            this.field2025 = null;
        }
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method1651(4139);
        if (this.field2025 == null) {
            int var5 = class82.method578(0, var4);
            this.field2025 = new class146(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method1651(4139) == 1;
            int var8 = arg0.method1660(-335289648);
            class249 var9;
            if (var7) {
                var9 = new class192(arg0.method1634(-61));
            } else {
                var9 = new class46(arg0.method1617((byte) -43));
            }
            this.field2025.method1085(-1, var9, (long) var8);
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public static void method840(int arg0) {
        field2011 = null;
        int var1 = 96 % ((6 - arg0) / 62);
        field2018 = null;
        field2016 = null;
        field2024 = null;
        field2022 = null;
    }
}
