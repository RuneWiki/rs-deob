import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class520 {

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[J")
    public static long[] field7645;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public int field7639;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    public int field7640;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field7641;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public int field7642;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field7643;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "Lqt;")
    public static class449 field7647;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Liv;B)V")
    public static final void method3089(class65 arg0, byte arg1) {
        field7643++;
        int var2 = arg0.method593((byte) 56);
        class316.field4504 = new class232[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class316.field4504[var3] = new class232();
            class316.field4504[var3].field3419 = arg0.method593((byte) 103);
            class316.field4504[var3].field3409 = arg0.method584(arg1 ^ 0xFFFFFF8F);
        }
        class53.field581 = arg0.method593((byte) 97);
        class425.field6283 = arg0.method593((byte) 126);
        class75.field1021 = arg0.method593((byte) 109);
        class291.field4182 = new class166[class425.field6283 + 1 - class53.field581];
        for (int var4 = 0; var4 < class75.field1021; var4++) {
            int var5 = arg0.method593((byte) 116);
            class166 var6 = class291.field4182[var5] = new class166();
            var6.field2012 = arg0.method577(255);
            var6.field2009 = arg0.method616((byte) 97);
            var6.field2350 = class53.field581 + var5;
            var6.field2351 = arg0.method584(arg1 ^ 0x18);
            var6.field2354 = arg0.method584(37);
        }
        class352.field4883 = arg0.method616((byte) 87);
        if (arg1 == 13) {
            class194.field2830 = true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static final void method3090(byte arg0) {
        field7646++;
        class229.field3360.method797(arg0 - 143);
        class104.field1460.method1281(true);
        if (class364.field5094 != null) {
            class364.field5094.method760(class148.field2081, 0);
        }
        class164.field2319.method197((byte) -83);
        class148.field2081.setBackground(Color.black);
        class164.field2325 = -1;
        class229.field3360 = class509.method3034((byte) 47, class148.field2081);
        class104.field1460 = class471.method2848(-53, true, class148.field2081);
        if (class364.field5094 != null) {
            class364.field5094.method756((byte) 98, class148.field2081);
        }
        if (arg0 != 56) {
            method3090((byte) -121);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static void method3091(byte arg0) {
        field7645 = null;
        field7647 = null;
        if (arg0 > -84) {
            field7647 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BIC)I")
    public static final int method3092(byte arg0, int arg1, char arg2) {
        field7641++;
        int var3 = arg2 << 4;
        if (arg0 != -78) {
            method3089(null, (byte) -95);
        }
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3093(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class251 var7 = (class251) class24.field272.method2955(62); var7 != null; var7 = (class251) class24.field272.method2952((byte) -119)) {
            if (class263.field3867 >= var7.field3695) {
                var7.method2322(1024);
            } else {
                class339.method2062(arg1, (var7.field3694 << 7) + 64, (var7.field3703 << 7) + 64, var7.field3701, var7.field3704 * 2, arg0 >> 1, (byte) 41, arg5 >> 1, arg3);
                class466.field6840.method1956(arg6 + class522.field7676[0], var7.field3705 | 0xFF000000, 0, arg4 + class522.field7676[1], 0, var7.field3692);
            }
        }
        if (arg2 < 15) {
            method3090((byte) -97);
        }
        field7644++;
    }

    static {
        new class331("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field7645 = new long[32];
    }
}
