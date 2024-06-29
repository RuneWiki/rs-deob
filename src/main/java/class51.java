import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class51 {

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "[I")
    public int[] field593 = new int[3];

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "[Lnm;")
    public class405[] field597 = new class405[8];

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "[I")
    public int[] field592 = new int[100];

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "[Lpc;")
    public class577[] field598 = new class577[100];

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "Lh;")
    public static class572 field599 = new class572("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "Lada;")
    public static class144 field600 = new class144(49, 8);

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field601 = 0;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public int field594;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Ljava/lang/Object;")
    public Object field596;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public static final void method307(int arg0) {
        class18.method118(-28206, class56.field668.field6859);
        field595++;
        int var1 = (class473.field6687 >> 3) + (class125.field1760 >> 10);
        class89.field1339 = class541.field8119.field8501 = 0;
        int var2 = (class214.field3161 >> 10) + (class38.field463 >> 3);
        class541.field8119.method2231(8, 8, (byte) 62);
        byte var3 = 18;
        class406.field5551 = new byte[var3][];
        class490.field6977 = new byte[var3][];
        class555.field8270 = new int[var3][4];
        class365.field5036 = new int[var3];
        class92.field1374 = new int[var3];
        class618.field9132 = new byte[var3][];
        class25.field247 = new int[var3];
        class2.field12 = new byte[var3][];
        class8.field81 = new int[var3];
        class58.field741 = new byte[var3][];
        class340.field4706 = new int[var3];
        class451.field6353 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class146.field2125 >> 4)) / 8; var5 <= ((class146.field2125 >> 4) + var1) / 8; var5++) {
            for (int var8 = (var2 - (class410.field5609 >> 4)) / 8; var8 <= (((class410.field5609 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class340.field4706[var4] = var9;
                class451.field6353[var4] = class282.field3952.method1967(-1, "m" + var5 + "_" + var8);
                class365.field5036[var4] = class282.field3952.method1967(-1, "l" + var5 + "_" + var8);
                class25.field247[var4] = class282.field3952.method1967(-1, "n" + var5 + "_" + var8);
                class8.field81[var4] = class282.field3952.method1967(-1, "um" + var5 + "_" + var8);
                class92.field1374[var4] = class282.field3952.method1967(-1, "ul" + var5 + "_" + var8);
                if (class25.field247[var4] == -1) {
                    class451.field6353[var4] = -1;
                    class365.field5036[var4] = -1;
                    class8.field81[var4] = -1;
                    class92.field1374[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class25.field247.length; var6++) {
            class25.field247[var6] = -1;
            class451.field6353[var6] = -1;
            class365.field5036[var6] = -1;
            class8.field81[var6] = -1;
            class92.field1374[var6] = -1;
        }
        byte var7;
        if (class472.field6670 == 1 || class472.field6670 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class221.method1427(var2, 8, var7, var1, false);
        if (arg0 <= 78) {
            field601 = 34;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)V")
    public static void method308(byte arg0) {
        field599 = null;
        field600 = null;
        if (arg0 != 124) {
            field600 = null;
        }
    }
}
