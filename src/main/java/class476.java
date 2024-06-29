import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class476 {

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "[I")
    public static int[] field7290;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "[I")
    public static int[] field7298;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "[I")
    public static int[] field7291;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "[Ljava/lang/String;")
    public static String[] field7293;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "[I")
    public static int[] field7297;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "[I")
    public static int[] field7296;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "[I")
    public static int[] field7292;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "B")
    public byte field7270;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "B")
    public byte field7272;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "B")
    public byte field7273;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "B")
    public byte field7274;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "B")
    public byte field7279;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "B")
    public byte field7282;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "B")
    public byte field7284;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public int field7275;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public int field7288;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "S")
    public short field7281;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "Z")
    public boolean field7268;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
    public boolean field7269;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Z")
    public boolean field7276;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Z")
    public boolean field7277;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Z")
    public boolean field7278;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Z")
    public boolean field7280;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Z")
    public boolean field7283;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Z")
    public boolean field7286;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "Z")
    public boolean field7289;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "Z")
    public boolean field7295;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    public static int[] field7271;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "[Lgi;")
    public static class437[] field7287;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "[[I")
    public static int[][] field7285;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static void method2956(byte arg0) {
        field7297 = null;
        field7298 = null;
        field7285 = null;
        field7291 = null;
        if (arg0 != -120) {
            field7298 = null;
        }
        field7292 = null;
        field7290 = null;
        field7296 = null;
        field7287 = null;
        field7293 = null;
        field7271 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(B)V")
    public static final void method2957(byte arg0) {
        class104.method707(84, class141.field1911.field6095);
        field7299++;
        int var1 = (class453.field7018 >> 3) + (class163.field2367 >> 10);
        int var2 = (class98.field1404 >> 10) + (class126.field1718 >> 3);
        class201.field3057 = class358.field5565.field6419 = 0;
        class358.field5565.method2317(8, 1584974182, 8);
        byte var3 = 18;
        class122.field1666 = new int[var3];
        class529.field7782 = new int[var3];
        class77.field1154 = new byte[var3][];
        class411.field6236 = new int[var3];
        class187.field2729 = new byte[var3][];
        class402.field6047 = new byte[var3][];
        class100.field1431 = new int[var3];
        class84.field1228 = new int[var3][4];
        class94.field1365 = new byte[var3][];
        class346.field5392 = new int[var3];
        if (arg0 >= -34) {
            field7290 = null;
        }
        class140.field1906 = new byte[var3][];
        class321.field4987 = new int[var3];
        int var4 = 0;
        for (int var5 = (var1 - (class135.field1839 >> 4)) / 8; var5 <= (((class135.field1839 >> 4) + var1) / 8); var5++) {
            for (int var8 = (var2 - (class197.field3038 >> 4)) / 8; var8 <= (((class197.field3038 >> 4) + var2) / 8); var8++) {
                int var9 = (var5 << 8) + var8;
                class529.field7782[var4] = var9;
                class122.field1666[var4] = class128.field1730.method1014(true, "m" + var5 + "_" + var8);
                class346.field5392[var4] = class128.field1730.method1014(true, "l" + var5 + "_" + var8);
                class100.field1431[var4] = class128.field1730.method1014(true, "n" + var5 + "_" + var8);
                class411.field6236[var4] = class128.field1730.method1014(true, "um" + var5 + "_" + var8);
                class321.field4987[var4] = class128.field1730.method1014(true, "ul" + var5 + "_" + var8);
                if (class100.field1431[var4] == -1) {
                    class122.field1666[var4] = -1;
                    class346.field5392[var4] = -1;
                    class411.field6236[var4] = -1;
                    class321.field4987[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class100.field1431.length; var6++) {
            class100.field1431[var6] = -1;
            class122.field1666[var6] = -1;
            class346.field5392[var6] = -1;
            class411.field6236[var6] = -1;
            class321.field4987[var6] = -1;
        }
        byte var7;
        if (class148.field1994 == 1 || class148.field1994 == 2) {
            var7 = 3;
        } else {
            var7 = 7;
        }
        class387.method2485(false, var7, 124, var2, var1);
    }

    static {
        new class213("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field7294 = 50;
        field7290 = new int[field7294];
        field7298 = new int[field7294];
        field7291 = new int[field7294];
        field7293 = new String[field7294];
        field7297 = new int[field7294];
        field7296 = new int[field7294];
        field7292 = new int[field7294];
    }
}
