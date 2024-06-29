import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class323 {

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public int field4160 = -1;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
    public int field4164;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "I")
    public int field4165;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "I")
    public int field4166;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "Lbu;")
    public static class19 field4167;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "Lub;")
    public static class20 field4162;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ZII)Z")
    public static final boolean method1893(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field4161++;
            return (arg2 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)V")
    public static void method1894(int arg0) {
        field4167 = null;
        field4162 = null;
        if (arg0 != 0) {
            method1893(false, 32, 81);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V")
    public static final void method1895(byte arg0) {
        field4158++;
        if (class386.field4930 != null) {
            if (class676.field9448) {
                class151.method1063(-9732);
            }
            class386.field4924.method3603(-14913);
            class253.method1546();
            class126.method947((byte) 95);
            class532.method3057(-18788);
            class264.method1581(-104);
            class335.method1929((byte) -115);
            if (class1.field4 != null) {
                class1.field4.method2339(23143);
            }
            class658.method3707(true);
            class660.method3714(0);
            class210.method1349(-1);
            class641.method3606((byte) 118);
            class67.method621(64, false);
            for (int var1 = 0; var1 < 2048; var1++) {
                class724 var5 = class5.field49[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field267.length; var6++) {
                        var5.field267[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class54.field752; var2++) {
                class733 var3 = class638.field8801[var2].field8280;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field267.length; var4++) {
                        var3.field267[var4] = null;
                    }
                }
            }
            class651.field9066 = null;
            class14.field271 = null;
            class386.field4930.method478((byte) 109);
            class386.field4930 = null;
        }
        if (arg0 >= -38) {
            method1893(false, 78, 12);
        }
    }
}
