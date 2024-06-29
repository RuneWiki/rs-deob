import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class177 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lmf;")
    public static class291 field2863 = new class291();

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Z")
    public static boolean field2869 = false;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "Los;")
    public static class309 field2867 = new class309("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field2865;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Li;")
    public class31 field2871;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Le;")
    public class374 field2866;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
    public static int[] field2870;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static final void method1213(int arg0) {
        field2865++;
        class371 var1 = null;
        if (arg0 != 1) {
            return;
        }
        try {
            class121 var2 = class497.field7305.method2878("2", true, 0);
            while (var2.field2119 == 0) {
                class50.method470(1L, -5);
            }
            if (var2.field2119 == 1) {
                var1 = (class371) var2.field2115;
                class289 var3 = new class289(class247.field3811 * 6 + 3);
                var3.method1814(1, true);
                var3.method1865(class247.field3811, 812856296);
                for (int var4 = 0; var4 < class81.field1675.length; var4++) {
                    if (class68.field1377[var4]) {
                        var3.method1865(var4, 812856296);
                        var3.method1862((byte) -115, class81.field1675[var4]);
                    }
                }
                var1.method2281(var3.field4408, 0, var3.field4399, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2276(-2771);
            }
        } catch (Exception var5) {
        }
        class404.field6098 = class423.method2578(-19698);
        class166.field2690 = false;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public static void method1214(byte arg0) {
        field2867 = null;
        field2863 = null;
        field2870 = null;
        if (arg0 != 16) {
            field2867 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)[Ls;")
    public static final class186[] method1215(int arg0) {
        if (arg0 < 0) {
            method1213(-38);
        }
        field2868++;
        return new class186[] { class347.field5162, class140.field2336, class249.field3841, class498.field7310, class507.field7393, class434.field6466, class268.field4060, class430.field6423, class14.field264, class79.field1580, class212.field3381, class421.field6341, class119.field2085, class479.field7064, class292.field4465, class368.field5394, class309.field4685, class259.field3959, class314.field4724, class239.field3712, class144.field2429, class381.field5567, class373.field5464, class94.field1857, class134.field2248, class187.field3004, class9.field132, class10.field141, class2.field51, class83.field1728, class393.field6006, class482.field7110, class315.field4752, class220.field3462, class429.field6413, class192.field3094, class522.field7578, class383.field5596, class470.field6982, class257.field3945, class50.field998, class204.field3266, class123.field2133, class1.field47, class442.field6568, class320.field4889, class192.field3108, class226.field3528, class378.field5539, class455.field6757, class441.field6556, class137.field2306, class481.field7105, class327.field4953, class331.field5032, class514.field7470, class120.field2113, class289.field4366, class320.field4896, class29.field479, class278.field4194, class106.field1971, class103.field1953, class166.field2687, class271.field4112, class460.field6850, class246.field3797, class276.field4174, class93.field1847, class139.field2327, class155.field2522, class88.field1793, class274.field4162, class47.field978, class129.field2195, class506.field7379, class334.field5055, class71.field1421, class320.field4897, class188.field3008, class96.field1882, class473.field7003, class35.field535, class485.field7137, class76.field1545, class484.field7130, class280.field4230, class252.field3872, class200.field3255, class496.field7283, class271.field4106, class171.field2772, class434.field6465, class383.field5602, class499.field7326, class356.field5235, class139.field2329, class156.field2564, class222.field3468, class513.field7454, class244.field3775, class450.field6694, class13.field248, class68.field1375, class19.field304, class210.field3360, class486.field7156, class517.field7504, class23.field337, class309.field4691, class281.field4237, class363.field5317, class166.field2686 };
    }
}
