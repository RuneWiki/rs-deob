import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class416 extends class333 {

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public int field5581;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "I")
    public int field5576;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "[[I")
    public int[][] field5573;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "[I")
    public int[] field5583;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "[I")
    public int[] field5575;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "[Z")
    public boolean[] field5580;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "[I")
    public static int[] field5579 = new int[2];

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field5574 = 4;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "Lko;")
    public static class259 field5582;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2340(int arg0, String[] arg1) {
        field5572++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
    public static final void method2341(int arg0, String arg1, String arg2, String arg3, int arg4, int arg5, String arg6) {
        class322.method1825(arg6, arg3, null, -1, arg2, arg5, arg4, arg1, 110);
        if (arg0 != 0) {
            method2340(19, null);
        }
        field5578++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V")
    public static final void method2342(byte arg0) {
        class338.field4252.method2554(118);
        field5584++;
        class246.method1448(arg0 ^ 0xFFFFECAB);
        class617.field8702 = 0;
        class626.field8849.field1218 = 0;
        class152.field1677 = null;
        class336.field4227 = null;
        class338.field4255 = null;
        class311.field3842 = 0;
        class83.method437(0);
        class471.field6759 = 0;
        class288.field3603 = 0;
        if (arg0 != -72) {
            method2342((byte) 108);
        }
        class563.field8045 = null;
        class145.field1611 = null;
        class699.field9804 = 0;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I[B)V")
    public class416(int arg0, byte[] arg1) {
        this.field5581 = arg0;
        class115 var3 = new class115(arg1);
        this.field5576 = var3.method620((byte) -21);
        this.field5573 = new int[this.field5576][];
        this.field5583 = new int[this.field5576];
        this.field5575 = new int[this.field5576];
        this.field5580 = new boolean[this.field5576];
        for (int var4 = 0; var4 < this.field5576; var4++) {
            this.field5575[var4] = var3.method620((byte) -127);
            if (this.field5575[var4] == 6) {
                this.field5575[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field5576; var5++) {
            this.field5580[var5] = var3.method620((byte) -128) == 1;
        }
        for (int var6 = 0; var6 < this.field5576; var6++) {
            this.field5583[var6] = var3.method643((byte) -77);
        }
        for (int var7 = 0; var7 < this.field5576; var7++) {
            this.field5573[var7] = new int[var3.method620((byte) -126)];
        }
        for (int var8 = 0; var8 < this.field5576; var8++) {
            for (int var9 = 0; var9 < this.field5573[var8].length; var9++) {
                this.field5573[var8][var9] = var3.method620((byte) 18);
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method2343(int arg0) {
        if (arg0 == 0) {
            field5582 = null;
            field5579 = null;
        }
    }
}
