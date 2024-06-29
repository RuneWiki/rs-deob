import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class115 {

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[Lcc;")
    private class217[] field2029;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    private int field2025;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "J")
    private long field2018;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "Lcc;")
    private class217 field2022;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "[Lbc;")
    public static class100[] field2026;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "[Llc;")
    public static class143[] field2030;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(JLcc;I)V")
    public final void method695(long arg0, class217 arg1, int arg2) {
        field2021++;
        if (arg2 != 765) {
            return;
        }
        if (arg1.field3971 != null) {
            arg1.method1490(-28126);
        }
        class217 var5 = this.field2029[(int) ((long) (this.field2025 - 1) & arg0)];
        arg1.field3971 = var5.field3971;
        arg1.field3974 = var5;
        arg1.field3971.field3974 = arg1;
        arg1.field3967 = arg0;
        arg1.field3974.field3971 = arg1;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method696(int arg0) {
        if (arg0 <= 113) {
            field2023 = -36;
        }
        field2026 = null;
        field2030 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIIIIIZ)V")
    public static final void method697(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2017++;
        if (arg4 == 3) {
            method697(true, -1, arg2, 10905, class120.field2126, -1, true);
            return;
        }
        Container var7;
        if (class23.field384 != null) {
            var7 = class23.field384;
        } else if (class8.field155 == null) {
            var7 = class4.field62.field1469;
        } else {
            var7 = class8.field155;
        }
        class159.field2883 = var7.getSize().width;
        class217.field3979 = var7.getSize().height;
        if (class8.field155 == var7) {
            Insets var8 = class8.field155.getInsets();
            class159.field2883 -= var8.right + var8.left;
            class217.field3979 -= var8.top + var8.bottom;
        }
        if (arg4 >= 2) {
            class141.field2459 = 0;
            class10.field222 = class159.field2883;
            class269.field4820 = class217.field3979;
            class257.field4620 = 0;
        } else {
            class269.field4820 = 503;
            class257.field4620 = 0;
            class10.field222 = 765;
            class141.field2459 = (class159.field2883 - 765) / 2;
        }
        if (arg6) {
            class82.method470(class155.field2792, -2);
            class66.method387(-126, class155.field2792);
            if (class191.field3508 != null) {
                class191.field3508.method138(arg3 - 37121, class155.field2792);
            }
            class63.field1201.method719(62);
            class20.method141(class155.field2792, -126);
            class140.method838((byte) 73, class155.field2792);
            if (class191.field3508 != null) {
                class191.field3508.method139((byte) 99, class155.field2792);
            }
        } else {
            class155.field2792.setSize(class10.field222, class269.field4820);
            if (class8.field155 == var7) {
                Insets var9 = class8.field155.getInsets();
                class155.field2792.setLocation(class141.field2459 + var9.left, class257.field4620 + var9.top);
            } else {
                class155.field2792.setLocation(class141.field2459, class257.field4620);
            }
        }
        if (arg4 > 0) {
            method697(true, -1, arg2, 10905, 0, -1, true);
            return;
        }
        class209.field3832 = !class21.method149((byte) -57);
        if (class7.field138 != -1) {
            class136.method816(true, true);
        }
        if (class17.field298 != null && (class147.field2652 == 30 || class147.field2652 == 25)) {
            class239.method1601(false);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class69.field1323[var10] = true;
        }
        if (arg3 != 10905) {
            field2026 = null;
        }
        class105.field1851 = true;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(JB)Lcc;")
    public final class217 method698(long arg0, byte arg1) {
        field2028++;
        this.field2018 = arg0;
        class217 var4 = this.field2029[(int) ((long) (this.field2025 - 1) & arg0)];
        if (arg1 < 52) {
            field2026 = null;
        }
        for (this.field2022 = var4.field3974; this.field2022 != var4; this.field2022 = this.field2022.field3974) {
            if (this.field2022.field3967 == arg0) {
                class217 var5 = this.field2022;
                this.field2022 = this.field2022.field3974;
                return var5;
            }
        }
        this.field2022 = null;
        return null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
    public static final void method699(byte arg0) {
        int var1 = 116 % ((arg0 - 77) / 48);
        field2020++;
        for (int var2 = -1; var2 < class107.field1889; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class30.field467[var2];
            }
            class32 var7 = class6.field97[var6];
            if (var7 != null && var7.field4174 > 0) {
                var7.field4174--;
                if (var7.field4174 == 0) {
                    var7.field4117 = null;
                }
            }
        }
        for (int var3 = 0; var3 < class212.field3945; var3++) {
            int var4 = class56.field1093[var3];
            class187 var5 = class259.field4648[var4];
            if (var5 != null && var5.field4174 > 0) {
                var5.field4174--;
                if (var5.field4174 == 0) {
                    var5.field4117 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)Lcc;")
    public final class217 method700(boolean arg0) {
        if (arg0) {
            method699((byte) -65);
        }
        field2027++;
        if (this.field2022 == null) {
            return null;
        }
        class217 var2 = this.field2029[(int) ((long) (this.field2025 - 1) & this.field2018)];
        while (this.field2022 != var2) {
            if (this.field2022.field3967 == this.field2018) {
                class217 var3 = this.field2022;
                this.field2022 = this.field2022.field3974;
                return var3;
            }
            this.field2022 = this.field2022.field3974;
        }
        this.field2022 = null;
        return null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        this.field2029 = new class217[arg0];
        this.field2025 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field2029[var2] = new class217();
            var3.field3971 = var3;
            var3.field3974 = var3;
        }
    }
}
