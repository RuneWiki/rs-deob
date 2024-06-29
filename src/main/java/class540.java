import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class540 {

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Lkda;")
    public static class353 field7555 = new class353();

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Lnea;")
    public static class664 field7558 = new class664(23, 8);

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field7556;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field7557;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "Lpu;")
    public static class522 field7559;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)V")
    public static final void method3069(int arg0, byte arg1) {
        if (class262.field3977 == null) {
            class262.field3977 = new byte[4][class199.field2812][class232.field3611];
        }
        field7554++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class199.field2812; var3++) {
                for (int var4 = 0; var4 < class232.field3611; var4++) {
                    class262.field3977[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 4) {
            method3069(12, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static void method3070(int arg0) {
        field7558 = null;
        field7559 = null;
        field7555 = null;
        if (arg0 <= 13) {
            method3069(-94, (byte) 73);
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public static final void method3071(int arg0) {
        if (arg0 < 118) {
            field7558 = null;
        }
        if (class32.field501 >= 0) {
            long var1 = class490.method2840(true);
            class32.field501 = (int) ((long) class32.field501 - (var1 - class580.field8174));
            if (class32.field501 <= 0) {
                class421.field6140 = class368.field5271.field3850;
                class73.field1298 = class368.field5271.field3844;
                class32.field501 = -1;
                class487.field6927 = class368.field5271.field3851;
                class207.field2908 = class368.field5271.field3842;
                class139.field2041 = class368.field5271.field3849;
                class637.field9005 = class368.field5271.field3846;
                class267.field4033 = class368.field5271.field3848;
                class572.field8049 = class368.field5271.field3853;
                class393.field5823 = class368.field5271.field3852;
                class356.field5110 = class368.field5271.field3855;
            } else {
                int var3 = (class32.field501 << 8) / class107.field1646;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class139.field2041 = ((class415.field6021 & 0xFF00) * var3 + (class368.field5271.field3849 & 0xFF00) * var4 & 0xFF0000) + ((class415.field6021 & 0xFF00FF) * var3 + (class368.field5271.field3849 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class356.field5110 = (class368.field5271.field3855 - class647.field9088) * var6 + class647.field9088;
                class572.field8049 = (class368.field5271.field3853 - class420.field6111) * var6 + class420.field6111;
                class393.field5823 = (class368.field5271.field3852 - class430.field6298) * var6 + class430.field6298;
                class421.field6140 = class517.field7293 * var3 + class368.field5271.field3850 * var4 >> 8;
                class73.field1298 = (class368.field5271.field3844 - class599.field8476) * var6 + class599.field8476;
                class637.field9005 = ((class227.field3185 & 0xFF00FF) * var3 + (class368.field5271.field3846 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class227.field3185 & 0xFF00) * var3 + ((class368.field5271.field3846 & 0xFF00) * var4) & 0xFF0000) >>> 8;
                class487.field6927 = (class368.field5271.field3851 - class590.field8271) * var6 + class590.field8271;
                class267.field4033 = (class368.field5271.field3848 - class44.field703) * var6 + class44.field703;
                if (class152.field2201 != class368.field5271.field3842) {
                    class207.field2908 = class512.field7202.method190(class152.field2201, class368.field5271.field3842, var6, class207.field2908);
                }
            }
            class580.field8174 = var1;
        }
        field7556++;
    }
}
