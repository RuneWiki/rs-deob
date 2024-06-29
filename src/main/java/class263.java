import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class263 implements class470 {

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "Lkea;")
    private class213 field3996 = new class213(128);

    @OriginalMember(owner = "client!tr", name = "p", descriptor = "[I")
    public int[] field4002 = new int[class692.field9733.field7844];

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "[I")
    private int[] field3995 = new int[class692.field9733.field7844];

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "[Lmo;")
    public static class695[] field3987 = new class695[2048];

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Ltf;")
    public static class264 field3994 = new class264(10, 6);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V")
    public final void method1725(int arg0, int arg1, int arg2) {
        this.field4002[arg0] = arg2;
        field3998++;
        if (arg1 != 0) {
            return;
        }
        class99 var4 = (class99) this.field3996.method1405((long) arg0, (byte) -105);
        if (var4 == null) {
            class99 var5 = new class99(class490.method2840(true) + 500L);
            this.field3996.method1403((byte) -18, var5, (long) arg0);
        } else {
            var4.field1553 = class490.method2840(true) + 500L;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method1726(byte arg0) {
        field3994 = null;
        field3987 = null;
        if (arg0 != -29) {
            method1734(25);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)I")
    public final int method1727(int arg0, int arg1) {
        field3999++;
        class444 var3 = class31.field493.method581(7842, arg0);
        if (arg1 != 0) {
            method1730(-88);
        }
        int var4 = var3.field6467;
        int var5 = var3.field6465;
        int var6 = var3.field6470;
        int var7 = class522.field7363[var6 - var5];
        return var7 & this.field4002[var4] >> var5;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZZ)I")
    public final int method1728(boolean arg0, boolean arg1) {
        field3993++;
        long var3 = class490.method2840(!arg0);
        for (class99 var5 = arg1 ? (class99) this.field3996.method1407(-90) : (class99) this.field3996.method1413(true); var5 != null; var5 = (class99) this.field3996.method1413(true)) {
            if ((var5.field1553 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field1553 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field9386;
                    this.field4002[var6] = this.field3995[var6];
                    var5.method3678(-1);
                    return var6;
                }
                var5.method3678(-1);
            }
        }
        if (arg0) {
            method1726((byte) -28);
        }
        return -1;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZI)V")
    public final void method1729(int arg0, boolean arg1, int arg2) {
        field3991++;
        class444 var4 = class31.field493.method581(7842, arg2);
        int var5 = var4.field6467;
        if (arg1) {
            return;
        }
        int var6 = var4.field6465;
        int var7 = var4.field6470;
        int var8 = class522.field7363[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1725(var5, 0, arg0 << var6 & var9 | ~var9 & this.field4002[var5]);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static final void method1730(int arg0) {
        if (class574.field8072 != null) {
            class574.field8072.method2020((byte) -86);
        }
        if (arg0 != -1) {
            field3987 = null;
        }
        field3989++;
        if (class697.field9858 != null) {
            class697.field9858.method2020((byte) 71);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBI)V")
    public final void method1731(int arg0, byte arg1, int arg2) {
        int var4 = 74 % ((9 - arg1) / 51);
        field3988++;
        class444 var5 = class31.field493.method581(7842, arg2);
        int var6 = var5.field6467;
        int var7 = var5.field6465;
        int var8 = var5.field6470;
        int var9 = class522.field7363[var8 - var7];
        if (arg0 < 0 || var9 < arg0) {
            arg0 = 0;
        }
        int var10 = var9 << var7;
        this.method1735(-3538, var6, var10 & arg0 << var7 | this.field3995[var6] & ~var10);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public final void method1732(boolean arg0) {
        field4001++;
        for (int var2 = 0; var2 < class692.field9733.field7844; var2++) {
            class681 var3 = class692.field9733.method3137(16, var2);
            if (var3 != null && var3.field9612 == 0) {
                this.field3995[var2] = 0;
                this.field4002[var2] = 0;
            }
        }
        if (arg0) {
            field3987 = null;
        }
        this.field3996 = new class213(128);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)I")
    public final int method1733(boolean arg0, int arg1) {
        field3997++;
        if (!arg0) {
            method1726((byte) -17);
        }
        return this.field4002[arg1];
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
    public static final void method1734(int arg0) {
        class535.field7504 = new class308(8);
        field4000++;
        class136.field1997 = 0;
        class29 var1 = (class29) class448.field6482.method2417(false);
        if (arg0 >= -23) {
            method1734(54);
        }
        while (var1 != null) {
            var1.method330();
            var1 = (class29) class448.field6482.method2414(true);
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(III)V")
    public final void method1735(int arg0, int arg1, int arg2) {
        field3992++;
        this.field3995[arg1] = arg2;
        if (arg0 != -3538) {
            this.method1735(83, 17, -99);
        }
        class99 var4 = (class99) this.field3996.method1405((long) arg1, (byte) -128);
        if (var4 == null) {
            class99 var5 = new class99(4611686018427387905L);
            this.field3996.method1403((byte) -18, var5, (long) arg1);
        } else if (var4.field1553 != 4611686018427387905L) {
            var4.field1553 = class490.method2840(true) + 500L | 0x4000000000000000L;
        }
    }
}
