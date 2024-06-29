import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class260 {

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljava/lang/String;")
    public String field3815;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public int field3813;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "J")
    public long field3812;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public int field3811;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "Ljava/lang/String;")
    public String field3814;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
    public static int[] field3810 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;ZI)V", line = 8)
    public static final void method1715(String arg0, boolean arg1, String arg2, boolean arg3, int arg4) {
        field3809++;
        class116 var5 = class743.method4117(122);
        var5.field1575.method3005(255, class377.field5417.field4450);
        var5.field1575.method2986(0, 115);
        int var6 = var5.field1575.field6962;
        var5.field1575.method2986(646, -63);
        int[] var7 = class686.method3908(518, var5);
        int var8 = var5.field1575.field6962;
        var5.field1575.method3037(0, arg0);
        var5.field1575.method2986(class718.field9946, -38);
        var5.field1575.method3037(0, arg2);
        var5.field1575.method3031(class44.field467, 0);
        var5.field1575.method3005(255, class553.field7667);
        var5.field1575.method3005(255, class327.field4603.field10814);
        class581.method3408(-3802, var5.field1575);
        String var9 = class56.field663;
        var5.field1575.method3005(255, var9 == null ? 0 : 1);
        if (var9 != null) {
            var5.field1575.method3037(0, var9);
        }
        if (arg3) {
            method1716('L', (byte) 85);
        }
        var5.field1575.method3005(255, arg4);
        var5.field1575.method3005(255, arg1 ? 1 : 0);
        var5.field1575.field6962 += 7;
        var5.field1575.method2999(var8, var5.field1575.field6962, -30341, var7);
        var5.field1575.method3033(var5.field1575.field6962 - var6, (byte) 107);
        class443.method2655(0, var5);
        class785.field10773 = 1;
        class383.field5492 = -3;
        class218.field2995 = 0;
        class482.field6670 = 0;
        if (arg4 < 13) {
            class629.field8814 = true;
            class359.method2254(true);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(CB)Z", line = 58)
    public static final boolean method1716(char arg0, byte arg1) {
        if (arg1 < 28) {
            return true;
        }
        field3808++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 82)
    public static void method1717(int arg0) {
        if (arg0 != 12753) {
            method1716('|', (byte) -21);
        }
        field3810 = null;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 94)
    public class260(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field3815 = arg3;
        this.field3813 = arg2;
        this.field3812 = arg4;
        this.field3811 = arg0;
        this.field3814 = arg1;
    }
}
