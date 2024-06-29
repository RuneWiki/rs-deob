import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class297 {

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Loe;")
    public static class127 field4507 = new class127(24, 3);

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field4509 = 0;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "[Lnp;")
    public static class325[] field4510 = new class325[6];

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "F")
    public static float field4511;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Lhs;")
    public class205 field4505;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Luf;")
    public class297 field4500;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 4)
    public static void method1798(byte arg0) {
        if (arg0 <= 119) {
            field4509 = -96;
        }
        field4510 = null;
        field4507 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(CB)C", line = 23)
    public static final char method1799(char arg0, byte arg1) {
        field4503++;
        if (arg1 >= -30) {
            field4509 = 25;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 426)
    public static final void method1800(int arg0) {
        field4501++;
        class21.field269 = 0;
        boolean var1 = class491.field7457.method232((byte) 120) == 1;
        int var2 = class491.field7457.method247((byte) 0);
        int var3 = class491.field7457.method272(20);
        int var4 = class491.field7457.method257((byte) 118);
        class384.method2299(var4, (byte) 101);
        int var5 = (class60.field1014 - class491.field7457.field585) / 16;
        class312.field4699 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class312.field4699[var6][var10] = class491.field7457.method255((byte) 96);
            }
        }
        class461.field7092 = new byte[var5][];
        class469.field7187 = new int[var5];
        class423.field6058 = new int[var5];
        class358.field5314 = null;
        class105.field1852 = new int[var5];
        class38.field512 = new int[var5];
        class251.field3838 = new byte[var5][];
        class167.field2591 = null;
        class61.field1032 = new int[var5];
        class216.field3335 = new byte[var5][];
        class311.field4685 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var2 - (class150.field2422 >> 4)) / 8; var8 <= ((class150.field2422 >> 4) + var2) / 8; var8++) {
            for (int var9 = (var3 - (class21.field272 >> 4)) / 8; var9 <= (((class21.field272 >> 4) + var3) / 8); var9++) {
                class61.field1032[var7] = (var8 << 8) + var9;
                class469.field7187[var7] = class73.field1310.method2720("m" + var8 + "_" + var9, 1);
                class105.field1852[var7] = class73.field1310.method2720("l" + var8 + "_" + var9, 1);
                class423.field6058[var7] = class73.field1310.method2720("um" + var8 + "_" + var9, 1);
                class38.field512[var7] = class73.field1310.method2720("ul" + var8 + "_" + var9, 1);
                var7++;
            }
        }
        if (arg0 != -5540) {
            method1799('_', (byte) -102);
        }
        class121.method842(var1, var3, (byte) -121, false, var2);
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V", line = 501)
    public final void method1801(int arg0) {
        field4502++;
        if (class199.field3153 >= 500 || arg0 != -29240) {
            return;
        }
        this.field4506 = 0;
        this.field4500 = class105.field1851;
        this.field4505 = null;
        class105.field1851 = this;
        class199.field3153++;
    }
}
