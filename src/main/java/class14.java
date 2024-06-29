import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class14 extends class152 {

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public int field222 = 0;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "Lhh;")
    public static class163 field215 = class137.method1065(":tradereq:", 17);

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "Lme;")
    public static class156 field214 = null;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILpg;)V")
    public final void method92(int arg0, class81 arg1) {
        while (true) {
            int var3 = arg1.method622(true);
            if (var3 == 0) {
                field217++;
                if (arg0 != 19121) {
                    this.method92(29, (class81) null);
                    return;
                }
                return;
            }
            this.method93(arg1, (byte) 111, var3);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lpg;BI)V")
    private final void method93(class81 arg0, byte arg1, int arg2) {
        if (arg1 <= 58) {
            method94(-92);
        }
        field218++;
        if (arg2 == 2) {
            this.field222 = arg0.method658(112);
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V")
    public static void method94(int arg0) {
        field215 = null;
        if (arg0 != 0) {
            method95((byte) -7);
        }
        field214 = null;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Z")
    public static final boolean method95(byte arg0) {
        field220++;
        try {
            return arg0 == 3 ? class240.method1661(arg0 ^ 0x71) : true;
        } catch (IOException var4) {
            class62.method426((byte) -84);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class92.field1744 + "," + class113.field2125 + "," + class38.field635 + " - " + class125.field2415 + "," + (class235.field4203.field3614[0] + class62.field1035) + "," + (class235.field4203.field3629[0] + class257.field4500) + " - ";
            for (int var3 = 0; class125.field2415 > var3 && var3 < 50; var3++) {
                var2 = var2 + class33.field502.field1562[var3] + ",";
            }
            class107.method865(-124, var5, var2);
            class183.method1356(true);
            return true;
        }
    }
}
