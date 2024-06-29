import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class97 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "[I")
    private int[] field1481;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Lck;")
    public static class119 field1480 = class298.method1987((byte) 65, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field1482 = 0;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "Ldl;")
    public static class271 field1483 = null;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lck;")
    public static class119 field1485 = class298.method1987((byte) 53, "Hierhin gehen");

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "Lml;")
    public static class134 field1486;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([I)V", line = 26)
    public class97(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1481 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1481[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field1481[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field1481[var5 + var5] = arg0[var4];
            this.field1481[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 65)
    public static void method653(int arg0) {
        field1486 = null;
        field1480 = null;
        field1485 = null;
        field1483 = null;
        if (arg0 >= -52) {
            method653(51);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)I", line = 80)
    public final int method654(byte arg0, int arg1) {
        if (arg0 < 122) {
            this.field1481 = (int[]) null;
        }
        field1484++;
        int var3 = (this.field1481.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field1481[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1481[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }
}
