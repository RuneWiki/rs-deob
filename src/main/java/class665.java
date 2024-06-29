import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pea")
public class class665 extends class539 {

    @OriginalMember(owner = "client!pea", name = "n", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!pea", name = "q", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!pea", name = "r", descriptor = "I")
    public static int field9373;

    @OriginalMember(owner = "client!pea", name = "s", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!pea", name = "p", descriptor = "J")
    public long field9371;

    @OriginalMember(owner = "client!pea", name = "m", descriptor = "Lpea;")
    public class665 field9368;

    @OriginalMember(owner = "client!pea", name = "o", descriptor = "Lpea;")
    public class665 field9370;

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(Z)V")
    public static final void method3689(boolean arg0) {
        field9369++;
        class161.field2465 = 0;
        int var1 = class602.field8356.method756((byte) 101);
        int var2 = class602.field8356.method726((byte) 122);
        boolean var3 = class602.field8356.method718(-79) == 1;
        int var4 = class602.field8356.method747(89);
        class264.method1609(-23221);
        class66.method539((byte) 114, var2);
        int var5 = (class532.field7250 - class602.field8356.field1301) / 16;
        class283.field3935 = new int[var5][4];
        if (arg0) {
            return;
        }
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class283.field3935[var6][var10] = class602.field8356.method714(arg0);
            }
        }
        class180.field2663 = new int[var5];
        class590.field8213 = new byte[var5][];
        class313.field4658 = new byte[var5][];
        class234.field3367 = new int[var5];
        class105.field1407 = null;
        class298.field4458 = null;
        class377.field5331 = new byte[var5][];
        class417.field5874 = new byte[var5][];
        class684.field9628 = new int[var5];
        class72.field1001 = new int[var5];
        class73.field1019 = new int[var5];
        int var7 = 0;
        for (int var8 = (var4 - (class86.field1185 >> 4)) / 8; var8 <= (var4 + (class86.field1185 >> 4)) / 8; var8++) {
            for (int var9 = (var1 - (class526.field7212 >> 4)) / 8; var9 <= (((class526.field7212 >> 4) + var1) / 8); var9++) {
                class234.field3367[var7] = (var8 << 8) + var9;
                class684.field9628[var7] = class11.field211.method920(2, "m" + var8 + "_" + var9);
                class73.field1019[var7] = class11.field211.method920(2, "l" + var8 + "_" + var9);
                class180.field2663[var7] = class11.field211.method920(2, "um" + var8 + "_" + var9);
                class72.field1001[var7] = class11.field211.method920(2, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class469.method2672(var1, var3, 1, var4, 11);
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(BII)V")
    public static final void method3690(byte arg0, int arg1, int arg2) {
        if (arg0 != 29) {
            method3689(true);
        }
        field9374++;
        class679 var3 = class669.method3708(12, arg1, 1403048928);
        var3.method3748(true);
        var3.field9574 = arg2;
    }

    @OriginalMember(owner = "client!pea", name = "a", descriptor = "(B)V")
    public final void method3691(byte arg0) {
        if (arg0 != -119) {
            return;
        }
        field9373++;
        if (this.field9370 != null) {
            this.field9370.field9368 = this.field9368;
            this.field9368.field9370 = this.field9370;
            this.field9368 = null;
            this.field9370 = null;
        }
    }

    @OriginalMember(owner = "client!pea", name = "b", descriptor = "(I)Z")
    public final boolean method3692(int arg0) {
        field9372++;
        if (arg0 != -26210) {
            this.method3691((byte) -121);
        }
        return this.field9370 != null;
    }
}
