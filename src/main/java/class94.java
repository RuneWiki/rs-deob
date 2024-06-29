import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class94 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "[Lgd;")
    private class112[] field1464;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[S")
    public static short[] field1468 = new short[500];

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "Lsb;")
    public static class124 field1471;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Lha;")
    public static class49 field1463;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BD)V")
    public static final void method706(byte arg0, double arg1) {
        if (class208.field3343 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class149.field2436[var3] = var4 <= 255 ? var4 : 255;
            }
            class208.field3343 = arg1;
        }
        field1467++;
        if (arg0 > -75) {
            field1471 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(I)V")
    public class94(int arg0) {
        this.field1464 = new class112[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class112 var3 = this.field1464[var2] = new class112();
            var3.field1733 = var3;
            var3.field1726 = var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method707(byte arg0) {
        if (arg0 >= -43) {
            field1471 = null;
        }
        field1468 = null;
        field1463 = null;
        field1471 = null;
    }
}
