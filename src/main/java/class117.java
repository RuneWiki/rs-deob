import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class117 extends class496 {

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field1528 = -1;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "I")
    public static int field1529 = -1;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field1532 = -1;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field1534;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field1538;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "[I")
    public int[] field1530;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "[I")
    public int[] field1537;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "[I")
    public int[] field1539;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "[Lbca;")
    public class286[] field1527;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[Lbca;")
    public class286[] field1536;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "[[[B")
    public byte[][][] field1533;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lps;Z)V", line = 9)
    public static final void method725(class428 arg0, boolean arg1) {
        field1535++;
        if (arg1) {
            method725(null, true);
        }
        byte[] var2 = new byte[24];
        if (class550.field8201 != null) {
            try {
                class550.field8201.method1619(0L, (byte) 65);
                class550.field8201.method1618((byte) 117, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method2612(23958, 24, var2, 0);
    }
}
