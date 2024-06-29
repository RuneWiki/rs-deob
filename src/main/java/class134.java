import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class134 {

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "Lvt;")
    public static class344 field1638 = new class344("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public int field1637;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "[I")
    public static int[] field1639;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I[BII)I")
    public static final int method705(int arg0, byte[] arg1, int arg2, int arg3) {
        field1640++;
        int var4 = -1;
        int var5 = arg2;
        if (arg3 != -25491000) {
            field1635 = -67;
        }
        while (arg0 > var5) {
            var4 = class58.field779[(var4 ^ arg1[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public static final void method706(int arg0) {
        if (arg0 != 0) {
            field1638 = null;
        }
        field1643++;
        if (!class163.method887(arg0 ^ 0x2)) {
            return;
        }
        if (class14.field143 == null) {
            class126.method679(19454);
        }
        class126.field1564 = true;
        class529.field7397 = 0;
        try {
            class135.field1645 = class123.field1540.getToolkit().getSystemClipboard();
        } catch (Exception var1) {
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
    public static void method707(int arg0) {
        if (arg0 != -1) {
            field1639 = null;
        }
        field1639 = null;
        field1638 = null;
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)Z")
    public static final boolean method708(int arg0, int arg1) {
        if (arg0 >= -19) {
            field1639 = null;
        }
        field1641++;
        if (class71.field965[arg1]) {
            return true;
        } else if (class296.field3844.method2055((byte) -101, arg1)) {
            int var2 = class296.field3844.method2064(0, arg1);
            if (var2 == 0) {
                class71.field965[arg1] = true;
                return true;
            }
            if (class508.field7087[arg1] == null) {
                class508.field7087[arg1] = new class447[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class508.field7087[arg1][var3] == null) {
                    byte[] var4 = class296.field3844.method2054(true, arg1, var3);
                    if (var4 != null) {
                        class447 var5 = class508.field7087[arg1][var3] = new class447();
                        var5.field6229 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2604(16777215, new class551(var4));
                    }
                }
            }
            class71.field965[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
