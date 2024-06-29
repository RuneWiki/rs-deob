import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class185 extends class117 {

    @OriginalMember(owner = "client!sm", name = "D", descriptor = "Lco;")
    public class76 field2761;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "[I")
    public static int[] field2760 = new int[4096];

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public static int field2759;

    static {
        new class180("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IJ)V", line = 5)
    public static final void method1285(int arg0, long arg1) {
        field2758++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class254.method1620(arg1 - 1L, (byte) 85);
            class254.method1620(1L, (byte) 116);
        } else {
            class254.method1620(arg1, (byte) 97);
        }
        if (arg0 < 106) {
            method1285(-6, -104L);
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(B)V", line = 29)
    public static void method1286(byte arg0) {
        field2760 = null;
        if (arg0 <= 10) {
            field2760 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lco;)V", line = 40)
    public class185(class76 arg0) {
        this.field2761 = arg0;
    }

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "(I)V", line = 56)
    public static final void method1287(int arg0) {
        field2759++;
        int var1 = 0;
        if (class397.field5830.method59((byte) 114, class399.field5865)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class397.field5830.field144) {
            var1 |= 0x40;
        }
        class388.method2440(-65, var1);
        class246.field3567.method614(true, var1);
        class8.field111.method3074(var1, 2);
        class500.field7358.method1608(-1, var1);
        class450.field6582.method1479(var1, arg0 ^ 0x1F);
        class387.method2431(var1, 3);
        class251.method1602(var1, 4);
        class92.method747(var1, (byte) 96);
        class421.method2581(88, var1);
        if (class17.field266 == 10) {
            class138.method1022(28, 1);
        } else if (class17.field266 == 30) {
            class138.method1022(25, 1);
        }
        if (arg0 != 1) {
            method1287(74);
        }
    }
}
