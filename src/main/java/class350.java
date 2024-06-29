import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class350 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    private int[] field5445;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5444 = "";

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field5446;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)I")
    public final int method2222(byte arg0, int arg1) {
        field5443++;
        if (arg0 > -83) {
            method2223((byte) -112);
        }
        int var3 = (this.field5445.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field5445[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5445[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([I)V")
    public class350(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length + (arg0.length >> 1)); var2 <<= 0x1) {
        }
        this.field5445 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5445[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field5445[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field5445[var5 + var5] = arg0[var4];
            this.field5445[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    public static void method2223(byte arg0) {
        field5444 = null;
        if (arg0 != -125) {
            method2223((byte) 45);
        }
    }
}
