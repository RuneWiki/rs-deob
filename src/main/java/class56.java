import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class56 extends class169 {

    @OriginalMember(owner = "client!qn", name = "H", descriptor = "Ldv;")
    public static class566 field999 = new class566(51, 2);

    @OriginalMember(owner = "client!qn", name = "T", descriptor = "I")
    public static int field1001 = 0;

    @OriginalMember(owner = "client!qn", name = "W", descriptor = "Lej;")
    public static class104 field1004 = new class104(" has logged in.", " loggt sich ein.", " s'est connecté.", " entrou no jogo.");

    @OriginalMember(owner = "client!qn", name = "X", descriptor = "I")
    public static int field1005 = -1;

    @OriginalMember(owner = "client!qn", name = "Z", descriptor = "I")
    public static int field1007 = 0;

    @OriginalMember(owner = "client!qn", name = "J", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!qn", name = "U", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!qn", name = "V", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!qn", name = "Y", descriptor = "Lha;")
    public static class52 field1006;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V")
    public static final void method512(boolean arg0) {
        ++field1000;
        class576.field7932 = class208.field2944.field6813 + class208.field2944.field6799 - -2;
        if (!arg0) {
            class607.field8742 = new String[500];
            class435.field6195 = class40.field798.field6799 - (-class40.field798.field6813 + -2);
            for (int var1 = 0; class607.field8742.length > var1; ++var1) {
                class607.field8742[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/lang/String;BIILjava/lang/String;Ljava/lang/String;)V")
    public static final void method513(String arg0, byte arg1, int arg2, int arg3, String arg4, String arg5) {
        int var6 = -44 % ((-79 - arg1) / 32);
        class395.method2365(arg3, arg4, -1, arg2, (String) null, arg5, -1, arg0);
        ++field1003;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "(Z)V")
    public static void method514(boolean arg0) {
        if (!arg0) {
            method512(false);
        }
        field999 = null;
        field1006 = null;
        field1004 = null;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field1002;
        if (arg1) {
            return null;
        } else {
            int[][] var3 = super.field6569.method828((byte) 127, arg0);
            if (super.field6569.field1934 && this.method1079((byte) 47)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg0 % super.field2449 * super.field2449;
                for (int var8 = 0; var8 < class312.field4207; ++var8) {
                    int var9 = super.field2447[var8 % super.field2439 + var7];
                    var6[var8] = class589.method3454(var9, 255) << 4;
                    var5[var8] = class589.method3454(var9, 65280) >> 4;
                    var4[var8] = class589.method3454(16711680, var9) >> 12;
                }
            }
            return var3;
        }
    }
}
