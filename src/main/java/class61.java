import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class61 extends class117 {

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    private int field993 = 4096;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field992 = 0;

    @OriginalMember(owner = "client!si", name = "S", descriptor = "Ljava/lang/String;")
    public static String field1001 = "Connection lost.";

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field999 = new String[8];

    @OriginalMember(owner = "client!si", name = "L", descriptor = "Lag;")
    public static class211 field994 = null;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!si", name = "T", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!si", name = "U", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!si", name = "V", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!si", name = "P", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "(I)V")
    public static final void method414(int arg0) {
        ++field995;
        class198.field3184.method1255(-108);
        class104.field1665.method1255(-86);
        if (arg0 != -4096) {
            method417((byte) 19, 27);
        }
    }

    @OriginalMember(owner = "client!si", name = "k", descriptor = "(I)Lhg;")
    public static final class220 method415(int arg0) {
        ++field1004;
        if (arg0 != 9224) {
            return null;
        } else {
            class260 var1 = new class260(class255.field4128, class111.field1749, class273.field4380[0], class314.field5058[0], class246.field3916[0], class60.field976[0], class70.field1192[0], class243.field3870);
            class28.method156(arg0 ^ -20248);
            return var1;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method416(int arg0, String arg1) {
        if (arg0 < -87) {
            ++field996;
            System.out.println("Error: " + class19.method99(arg1, "%0a", "\n", (byte) -31));
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field993 = arg0.method1142(-18970);
        }
        ++field997;
        if (arg1 != 255) {
            field999 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field998;
        if (arg0 != 2) {
            field999 = null;
        }
        int[] var3 = super.field1883.method531(arg1, (byte) 122);
        if (super.field1883.field1313) {
            int[] var4 = this.method837(0, 0, arg1 + -1 & class293.field4689);
            int[] var5 = this.method837(0, 0, arg1);
            int[] var6 = this.method837(0, 0, arg1 + 1 & class293.field4689);
            for (int var7 = 0; var7 < class168.field2737; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field993;
                int var9 = (var5[class234.field3769 & var7 + 1] + -var5[class234.field3769 & var7 - 1]) * this.field993;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 - -4096) / 4096.0F)) * 4096.0D);
                int var15 = ~var14 == -1 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class61() {
        super(1, true);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V")
    public static final void method417(byte arg0, int arg1) {
        class175 var2 = class182.method1317(11, arg1, false);
        if (arg0 < 125) {
            method415(-59);
        }
        var2.method1278((byte) 107);
        ++field1002;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
    public static void method418(boolean arg0) {
        if (!arg0) {
            method417((byte) -37, 88);
        }
        field1001 = null;
        field994 = null;
        field999 = null;
    }
}
