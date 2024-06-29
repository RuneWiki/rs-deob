import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class366 extends class276 {

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public int field5694 = -1;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "Z")
    public boolean field5697 = false;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "Lvv;")
    public static class313 field5689 = new class313(61, 6);

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public int field5690;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public int field5692;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public int field5695;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field5698;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static final void method2328(int arg0) {
        field5693++;
        int var1 = class496.field7243.length;
        int var2 = 0;
        if (arg0 != 9622) {
            method2329(40);
        }
        while (var2 < var1) {
            if (class496.field7243[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class39.field590; var4++) {
                    if (class455.field6798[var4] == class23.field328[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class455.field6798[class39.field590] = class23.field328[var2];
                    var3 = class39.field590++;
                }
                class23 var5 = new class23(class496.field7243[var2]);
                int var6 = 0;
                while (class496.field7243[var2].length > var5.field301 && var6 < 511 && class86.field1471 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method132(76);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class23.field328[var2] >> 8) * 64 + var10 - class16.field181;
                    int var13 = (class23.field328[var2] & 0xFF) * 64 + var11 - class455.field6794;
                    class510 var14 = class22.field239.method1085(var5.method132(25), 537461692);
                    class505 var15 = (class505) class147.field2396.method2516((long) var7, -1);
                    if (var15 == null && (var14.field7459 & 0x1) > 0 && class229.field3994 == var9 && var12 >= 0 && var14.field7416 + var12 < class217.field3775 && var13 >= 0 && class277.field4548 > var14.field7416 + var13) {
                        class265 var16 = new class265();
                        var16.field3130 = var7;
                        class505 var17 = new class505(var16);
                        class147.field2396.method2517(var17, (long) var7, (byte) 51);
                        class393.field6008[class353.field5506++] = var17;
                        class371.field5734[class86.field1471++] = var7;
                        var16.field3058 = class504.field7348;
                        var16.method1764(-1, var14);
                        var16.method1309(-13313, var16.field4430.field7416);
                        var16.field3135 = var16.field4430.field7411 << 3;
                        var16.method1305(arg0 ^ 0x1A69, true, (var16.field4430.field7423 + 4 & 0x45800007) << 11);
                        var16.method1767(var12, true, var13, -122, var16.method1143(0), var9);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)V")
    public static void method2329(int arg0) {
        field5698 = null;
        field5689 = null;
        if (arg0 != -13379) {
            method2330((byte) -125);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
    public static final void method2330(byte arg0) {
        field5696++;
        if (arg0 < -75 && class13.field151 != -1) {
            class386.method2424(class13.field151, -1, (byte) 126, -1, false);
            class13.field151 = -1;
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V")
    public class366(int arg0) {
        this.field5694 = arg0;
    }
}
