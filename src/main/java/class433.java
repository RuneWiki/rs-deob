import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class433 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Ljea;")
    private class416 field6585 = new class416();

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field6579;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field6588;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public static int field6590;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Ljea;")
    private class416 field6592;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 7)
    public final void method2749(int arg0) {
        if (arg0 != -19473) {
            this.field6592 = null;
        }
        while (true) {
            class416 var2 = this.field6585.field6367;
            if (this.field6585 == var2) {
                field6580++;
                this.field6592 = null;
                return;
            }
            var2.method2648((byte) -25);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 29)
    public final int method2750(byte arg0) {
        field6587++;
        if (arg0 >= -103) {
            this.field6585 = null;
        }
        int var2 = 0;
        for (class416 var3 = this.field6585.field6367; var3 != this.field6585; var3 = var3.field6367) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)Z", line = 55)
    public final boolean method2751(boolean arg0) {
        if (!arg0) {
            this.method2749(100);
        }
        field6579++;
        return this.field6585.field6367 == this.field6585;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Ljea;", line = 70)
    public final class416 method2752(byte arg0) {
        field6584++;
        class416 var2 = this.field6585.field6366;
        if (this.field6585 == var2) {
            this.field6592 = null;
            return null;
        }
        this.field6592 = var2.field6366;
        if (arg0 != -125) {
            this.field6592 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)Z", line = 92)
    public static final boolean method2753(int arg0) {
        if (arg0 > -119) {
            return false;
        } else {
            field6586++;
            return class682.field9564 >= 1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Ljea;", line = 107)
    public final class416 method2754(byte arg0) {
        field6582++;
        int var2 = -68 / ((50 - arg0) / 58);
        class416 var3 = this.field6585.field6367;
        if (this.field6585 == var3) {
            this.field6592 = null;
            return null;
        } else {
            this.field6592 = var3.field6367;
            return var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(B)V", line = 129)
    public static final void method2755(byte arg0) {
        field6590++;
        class426.method2699((byte) -74, class17.field282.field4856);
        int var1 = (class675.field9521 >> 12) + (class612.field8702 >> 3);
        int var2 = (class626.field8855 >> 3) + (class412.field6318 >> 12);
        class423.field6439 = class567.field8141.field9695 = 0;
        class567.field8141.method2110(8, 512, 8);
        byte var3 = 18;
        class307.field4835 = new byte[var3][];
        class622.field8789 = new byte[var3][];
        class663.field9225 = new int[var3];
        class116.field1809 = new int[var3][4];
        int var4 = 118 / ((-arg0 - 35) / 55);
        class500.field7342 = new byte[var3][];
        class476.field7058 = new int[var3];
        class366.field5747 = new int[var3];
        class81.field1007 = new int[var3];
        class137.field2330 = new int[var3];
        class310.field4871 = new int[var3];
        class160.field2735 = new byte[var3][];
        class665.field9423 = new byte[var3][];
        int var5 = 0;
        for (int var6 = (var1 - (class275.field4426 >> 4)) / 8; var6 <= (((class275.field4426 >> 4) + var1) / 8); var6++) {
            for (int var9 = (var2 - (class417.field6374 >> 4)) / 8; var9 <= (((class417.field6374 >> 4) + var2) / 8); var9++) {
                int var10 = (var6 << 8) + var9;
                class476.field7058[var5] = var10;
                class663.field9225[var5] = class247.field3943.method928(false, "m" + var6 + "_" + var9);
                class81.field1007[var5] = class247.field3943.method928(false, "l" + var6 + "_" + var9);
                class366.field5747[var5] = class247.field3943.method928(false, "n" + var6 + "_" + var9);
                class137.field2330[var5] = class247.field3943.method928(false, "um" + var6 + "_" + var9);
                class310.field4871[var5] = class247.field3943.method928(false, "ul" + var6 + "_" + var9);
                if (class366.field5747[var5] == -1) {
                    class663.field9225[var5] = -1;
                    class81.field1007[var5] = -1;
                    class137.field2330[var5] = -1;
                    class310.field4871[var5] = -1;
                }
                var5++;
            }
        }
        for (int var7 = var5; var7 < class366.field5747.length; var7++) {
            class366.field5747[var7] = -1;
            class663.field9225[var7] = -1;
            class81.field1007[var7] = -1;
            class137.field2330[var7] = -1;
            class310.field4871[var7] = -1;
        }
        byte var8;
        if (class682.field9564 == 3) {
            var8 = 4;
        } else {
            var8 = 8;
        }
        class234.method1696(false, 9085, var2, var8, var1);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILri;)I", line = 214)
    public static final int method2756(int arg0, class97 arg1) {
        field6581++;
        int var2 = 0;
        if (arg1.method942(0, class341.field5530)) {
            var2++;
        }
        if (arg1.method942(0, class81.field1003)) {
            var2++;
        }
        if (arg1.method942(0, class375.field5857)) {
            var2++;
        }
        if (arg1.method942(0, class200.field3268)) {
            var2++;
        }
        if (arg0 > -24) {
            method2756(64, null);
        }
        if (arg1.method942(0, class341.field5522)) {
            var2++;
        }
        if (arg1.method942(0, class475.field7034)) {
            var2++;
        }
        if (arg1.method942(0, class425.field6465)) {
            var2++;
        }
        if (arg1.method942(0, class690.field9674)) {
            var2++;
        }
        if (arg1.method942(0, class157.field2685)) {
            var2++;
        }
        if (arg1.method942(0, class200.field3250)) {
            var2++;
        }
        if (arg1.method942(0, class263.field4307)) {
            var2++;
        }
        if (arg1.method942(0, class606.field8622)) {
            var2++;
        }
        if (arg1.method942(0, class247.field3947)) {
            var2++;
        }
        if (arg1.method942(0, class404.field6237)) {
            var2++;
        }
        if (arg1.method942(0, class73.field924)) {
            var2++;
        }
        if (arg1.method942(0, class294.field4618)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljea;I)V", line = 283)
    public final void method2757(class416 arg0, int arg1) {
        if (arg0.field6366 != null) {
            arg0.method2648((byte) -25);
        }
        field6583++;
        arg0.field6367 = this.field6585;
        if (arg1 == -1) {
            arg0.field6366 = this.field6585.field6366;
            arg0.field6366.field6367 = arg0;
            arg0.field6367.field6366 = arg0;
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V", line = 344)
    public class433() {
        this.field6585.field6367 = this.field6585;
        this.field6585.field6366 = this.field6585;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)Ljea;", line = 305)
    public final class416 method2758(int arg0) {
        field6588++;
        class416 var2 = this.field6585.field6367;
        if (this.field6585 == var2) {
            return null;
        } else {
            int var3 = 60 / ((22 - arg0) / 49);
            var2.method2648((byte) -25);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)Ljea;", line = 323)
    public final class416 method2759(int arg0) {
        field6591++;
        if (arg0 != 1486415172) {
            this.field6592 = null;
        }
        class416 var2 = this.field6592;
        if (this.field6585 == var2) {
            this.field6592 = null;
            return null;
        } else {
            this.field6592 = var2.field6367;
            return var2;
        }
    }
}
