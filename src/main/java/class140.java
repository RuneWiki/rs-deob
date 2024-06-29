import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class140 extends class36 {

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "[B")
    public byte[] field1729;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Lea;")
    public static class474 field1728 = new class474("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "Lig;")
    public static class206 field1731 = new class206(14, 12);

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "Lea;")
    public static class474 field1732 = new class474("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static final void method841(int arg0) {
        field1726++;
        class251.field3570 = 0;
        int var1 = class46.field498.method1195((byte) -126);
        int var2 = class46.field498.method1177(255);
        int var3 = class46.field498.method1220(126);
        if (arg0 != 1903119524) {
            method841(-124);
        }
        boolean var4 = class46.field498.method1209(arg0 - 1903144262) == 1;
        class100.method620(0);
        class37.method201((byte) -122, var2);
        int var5 = (class32.field372 - class46.field498.field2610) / 16;
        class514.field7496 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class514.field7496[var6][var10] = class46.field498.method1178(class92.method583(arg0, -2094340980));
            }
        }
        class371.field5682 = null;
        class475.field7018 = new int[var5];
        class621.field8995 = new int[var5];
        class162.field1979 = null;
        class170.field2090 = new int[var5];
        class577.field8333 = new int[var5];
        class348.field4971 = new byte[var5][];
        class11.field99 = new int[var5];
        class290.field4014 = new byte[var5][];
        class639.field9186 = new byte[var5][];
        class451.field6731 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var3 - (class90.field1032 >> 4)) / 8; var8 <= (((class90.field1032 >> 4) + var3) / 8); var8++) {
            for (int var9 = (var1 - (class30.field349 >> 4)) / 8; var9 <= ((class30.field349 >> 4) + var1) / 8; var9++) {
                class170.field2090[var7] = (var8 << 8) + var9;
                class475.field7018[var7] = class647.field9367.method1283((byte) -55, "m" + var8 + "_" + var9);
                class621.field8995[var7] = class647.field9367.method1283((byte) -88, "l" + var8 + "_" + var9);
                class577.field8333[var7] = class647.field9367.method1283((byte) -36, "um" + var8 + "_" + var9);
                class11.field99[var7] = class647.field9367.method1283((byte) -98, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class258.method1722(var1, var3, 10, 108, var4);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)I")
    public static final int method842(int arg0, int arg1, int arg2) {
        field1727++;
        if (arg1 == 4 || arg1 == 5) {
            return class121.field1505[arg2 & 0x3];
        } else if (arg0 < 116) {
            return 99;
        } else {
            return 256;
        }
    }

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "(I)V")
    public static void method843(int arg0) {
        field1732 = null;
        field1728 = null;
        field1731 = null;
        if (arg0 != 116657156) {
            field1728 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "([B)V")
    public class140(byte[] arg0) {
        this.field1729 = arg0;
    }
}
