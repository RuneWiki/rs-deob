import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class234 {

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "Lof;")
    private class620 field2793 = new class620(128);

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Loh;")
    private class404 field2794;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1386(String arg0, boolean arg1) {
        field2796++;
        if (!class568.field8075 || (class12.field96 & 0x18) == 0) {
            return;
        }
        boolean var2 = arg1;
        int var3 = class585.field8256;
        int[] var4 = class399.field5459;
        for (int var5 = 0; var5 < var3; var5++) {
            class183 var6 = class75.field792[var4[var5]];
            if (var6.field2157 != null && var6.field2157.equalsIgnoreCase(arg0) && (class90.field937 == var6 && (class12.field96 & 0x10) != 0 || var6 != null && (class12.field96 & 0x8) != 0)) {
                class168.field1865++;
                class249 var7 = class289.method1715(class463.field6619, 120, class41.field470);
                var7.field3016.method1441(class283.field3449, -128);
                var7.field3016.method1470((byte) -122, class620.field8886);
                var7.field3016.method1470((byte) -122, var4[var5]);
                var7.field3016.method1433(18, 0);
                var7.field3016.method1470((byte) -122, class421.field6093);
                class510.method3017(var7, 60);
                class647.method3689(true, 0, -2, var6.field7193[0], var6.method1128(-1), var6.method1128(-1), 0, var6.field7187[0], (byte) -80);
                var2 = true;
                break;
            }
        }
        if (!var2) {
            class490.method2948((byte) -55, class486.field6925.method2936(class489.field6978, 93) + arg0, 4);
        }
        if (class568.field8075) {
            class251.method1503((byte) 103);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBIII)Z")
    public static final boolean method1387(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -56) {
            method1386(null, false);
        }
        field2797++;
        if (!class114.field1198 || !class396.field5425) {
            return false;
        } else if (class542.field7803 < 100) {
            return false;
        } else if (class240.method1414(30633, arg2, arg3, arg0)) {
            int var5 = arg2 << class748.field10430;
            int var6 = arg3 << class748.field10430;
            if (class316.method1885(arg4, class559.field7987, var6, var5, arg1 ^ 0xFFFFFF87, class504.field7120[arg0].method1671(arg3, arg2, (byte) -70), class559.field7987)) {
                class223.field2557++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)Lsp;")
    public final class633 method1388(int arg0, int arg1) {
        field2795++;
        class620 var3 = this.field2793;
        class633 var4;
        synchronized (this.field2793) {
            var4 = (class633) this.field2793.method3538((long) arg0, 0);
        }
        if (arg1 != 1) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field2794.method2481(class446.method2765(arg0, -1961668664), class434.method2714(arg1 + 110, arg0), (byte) 117);
            class633 var6 = new class633();
            if (var5 != null) {
                var6.method3636(new class244(var5), (byte) -73);
            }
            class620 var7 = this.field2793;
            synchronized (this.field2793) {
                this.field2793.method3537(-75, (long) arg0, var6);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V")
    public static final void method1389(boolean arg0) {
        field2791++;
        class614.field8787 = 0;
        int var1 = class248.field3008.method1439((byte) 106);
        int var2 = class248.field3008.method1474((byte) -114);
        int var3 = class248.field3008.method1425((byte) 18);
        boolean var4 = class248.field3008.method1450(-122) == 1;
        class522.method3067((byte) 88);
        class180.method1117((byte) -95, var3);
        int var5 = (class741.field10364 - class248.field3008.field2903) / 16;
        class64.field655 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class64.field655[var6][var10] = class248.field3008.method1438(100);
            }
        }
        class24.field232 = null;
        class232.field2708 = new byte[var5][];
        class553.field7925 = null;
        class676.field9572 = new byte[var5][];
        class111.field1173 = new int[var5];
        class331.field4299 = new int[var5];
        class630.field9059 = new byte[var5][];
        class74.field773 = new int[var5];
        class602.field8566 = new byte[var5][];
        class322.field4113 = new int[var5];
        class323.field4123 = new int[var5];
        int var7 = 0;
        for (int var8 = (var1 - (class489.field6976 >> 4)) / 8; var8 <= (var1 + (class489.field6976 >> 4)) / 8; var8++) {
            for (int var9 = (var2 - (class153.field1677 >> 4)) / 8; var9 <= (((class153.field1677 >> 4) + var2) / 8); var9++) {
                class74.field773[var7] = (var8 << 8) + var9;
                class331.field4299[var7] = class154.field1692.method2474(75, "m" + var8 + "_" + var9);
                class322.field4113[var7] = class154.field1692.method2474(56, "l" + var8 + "_" + var9);
                class323.field4123[var7] = class154.field1692.method2474(44, "um" + var8 + "_" + var9);
                class111.field1173[var7] = class154.field1692.method2474(-125, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class313.method1863(var2, var1, var4, arg0, 11);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static final void method1390(boolean arg0) {
        field2792++;
        class654.field9334.method3924(!arg0, class654.field9334.field9870, 1);
        class654.field9334.method3924(true, class654.field9334.field9858, 1);
        class654.field9334.method3924(true, class654.field9334.field9833, 2);
        class654.field9334.method3924(true, class654.field9334.field9834, 2);
        class654.field9334.method3924(true, class654.field9334.field9855, 1);
        class654.field9334.method3924(true, class654.field9334.field9845, 1);
        class654.field9334.method3924(true, class654.field9334.field9878, 1);
        class654.field9334.method3924(true, class654.field9334.field9847, 1);
        class654.field9334.method3924(true, class654.field9334.field9869, 1);
        class654.field9334.method3924(true, class654.field9334.field9836, 1);
        class654.field9334.method3924(true, class654.field9334.field9856, 1);
        class654.field9334.method3924(true, class654.field9334.field9844, 1);
        class654.field9334.method3924(true, class654.field9334.field9837, 0);
        class654.field9334.method3924(!arg0, class654.field9334.field9848, 1);
        class654.field9334.method3924(true, class654.field9334.field9866, 0);
        if (arg0) {
            method1386(null, true);
        }
        class654.field9334.method3924(true, class654.field9334.field9852, 0);
        class654.field9334.method3924(true, class654.field9334.field9851, 1);
        class654.field9334.method3924(true, class654.field9334.field9863, 0);
        class654.field9334.method3924(true, class654.field9334.field9826, 0);
        class444.method2756(10441);
        class654.field9334.method3924(true, class654.field9334.field9849, 1);
        class654.field9334.method3924(true, class654.field9334.field9875, 3);
        class598.method3406((byte) 124);
        class341.method2026(9349);
        class698.field9825 = true;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lnb;ILoh;)V")
    public class234(class301 arg0, int arg1, class404 arg2) {
        this.field2794 = arg2;
        if (this.field2794 != null) {
            int var4 = this.field2794.method2478((byte) -109) - 1;
            this.field2794.method2482(0, var4);
        }
    }
}
