import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class67 extends class184 {

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[I")
    public static int[] field960 = new int[13];

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field959;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "Ltj;")
    public static class197 field955;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "[I")
    public int[] field956;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "[I")
    public int[] field958;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "[I")
    public int[] field966;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "[Ltj;")
    public class197[] field954;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[Ltj;")
    public class197[] field962;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "[[[B")
    public byte[][][] field965;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method593(int arg0) {
        class276.field3915.method3100((byte) 12);
        field963++;
        class257.field3690.method177(-1);
        class582.field8291.method76((byte) 30);
        if (arg0 != 16) {
            return;
        }
        class239.field3470.method390((byte) -101);
        class74.field1032.method3329((byte) 12);
        class336.field4876.method2082(-3179);
        class742.field10404.method2665(0);
        class499.field7100.method167((byte) 27);
        class665.field9346.method3009((byte) -122);
        class538.field7691.method1323(-1);
        class95.field1354.method2826(64);
        class581.field8249.method4119(34);
        class637.field8949.method862(true);
        class28.field273.method2437(-102);
        class153.field2479.method1657((byte) -104);
        class684.field9464.method1747((byte) 90);
        class288.field4108.method2998((byte) 26);
        class196.field2977.method697(false);
        class123.field1667.method1569(true);
        class209.field3066.method3483(7);
        class280.field3967.method628(-128);
        class724.method4087((byte) -97);
        class196.method1366(53);
        class182.method1287((byte) -115);
        class237.method1570((byte) 113);
        class251.method1654((byte) -128);
        class108.field1500.method800(115);
        class335.field4831.method800(arg0 + 62);
        class592.field8412.method800(arg0 + 67);
        class27.field266.method800(126);
        class709.field9992.method800(79);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 48)
    public static void method594(byte arg0) {
        field955 = null;
        field960 = null;
        if (arg0 > -16) {
            field955 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 64)
    public static final void method595(int arg0) {
        field961++;
        if (class87.field1249 == -1) {
            return;
        }
        int var1 = class632.field8840.method2697(4212);
        int var2 = class632.field8840.method2698(0);
        class467 var3 = (class467) class264.field3741.method1195(arg0 ^ arg0);
        if (var3 != null) {
            var1 = var3.method1794((byte) 116);
            var2 = var3.method1793((byte) 112);
        }
        int var4 = 0;
        int var5 = 0;
        if (class419.field6265) {
            var4 = class210.method1422(true);
            var5 = class407.method2589((byte) -45);
        }
        class644.method3691(var1 + var4, class510.field7263 + var5, var4 + class501.field7123, arg0 ^ 0xFFFFA0D2, var5, var5, class87.field1249, var2, var4, var4, var1, var2 + var5);
        if (class55.field769 != null) {
            class27.method139(true, var1 + var4, var2 + var5);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)Z", line = 109)
    public static final boolean method596(byte arg0, int arg1) {
        if (arg0 == -91) {
            field964++;
            return arg1 == 6 || arg1 == 4 || arg1 == 22 || arg1 == 2 || arg1 == 11 || arg1 == 46 || arg1 == 16;
        } else {
            return true;
        }
    }
}
