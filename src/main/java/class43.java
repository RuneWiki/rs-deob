import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class43 {

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
    private int[] field622;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Lsa;")
    public static class192 field624;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZ)I", line = 6)
    public final int method309(int arg0, boolean arg1) {
        if (!arg1) {
            this.method309(19, true);
        }
        field626++;
        int var3 = (this.field622.length >> 1) - 1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field622[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field622[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)Liv;", line = 38)
    public static final class87 method310(int arg0, int arg1) {
        if (arg0 < 96) {
            return null;
        }
        field625++;
        class87 var2 = (class87) class97.field1470.method3750((long) arg1, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class235.field3313.method2537(false, 1, arg1);
        class87 var4 = new class87();
        var4.field1307 = arg1;
        if (var3 != null) {
            var4.method698((byte) -96, new class335(var3));
        }
        var4.method701(0);
        if (var4.field1306 == 2 && class102.field1524.method2918((long) arg1, (byte) -127) == null) {
            class102.field1524.method2911((long) arg1, new class704(class314.field4316), (byte) -28);
            class32.field524[class314.field4316++] = var4;
        }
        class97.field1470.method3745(1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 74)
    public static void method311(int arg0) {
        if (arg0 != 1) {
            field624 = null;
        }
        field624 = null;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([I)V", line = 83)
    public class43(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field622 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field622[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field622[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field622[var5 + var5] = arg0[var4];
            this.field622[var5 + var5 + 1] = var4++;
        }
    }
}
