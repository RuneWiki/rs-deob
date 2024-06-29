import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class316 extends class418 {

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public int field4629 = 0;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    public int field4619 = -1;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "Ljava/lang/String;")
    public static String field4623 = "Take";

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field4620;

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    public int field4621;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "I")
    public int field4622;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public int field4625;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "I")
    public static int field4626;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public int field4627;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "I")
    public int field4628;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "I")
    public int field4630;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V", line = 11)
    public static void method2072(int arg0) {
        field4623 = null;
        if (arg0 < 41) {
            method2072(-102);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZLtj;)V", line = 30)
    public static final void method2073(boolean arg0, class298 arg1) {
        if (!arg0) {
            return;
        }
        if (class165.field2244) {
            class232.method1503(-3, arg1);
        } else {
            class421.method2652(arg1, -65);
        }
        field4626++;
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)I", line = 55)
    public static final int method2074(int arg0) {
        field4620++;
        if (arg0 != 3) {
            field4634 = -94;
        }
        if (class165.field2244 || class402.field5874 <= 0) {
            int var1 = class277.field4060;
            int var2 = class217.field3032;
            int var3 = class184.field2469;
            int var4 = class341.field5066;
            int var5 = class389.field5694;
            if (var1 > var3 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class402.field5874; var7++) {
                    if (class167.field2266) {
                        int var12 = (class402.field5874 - var7 - 1) * 16 + var4 + 33;
                        if (var2 > var12 - 13 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class402.field5874 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > (var11 - 13) && var2 <= (var11 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class348 var9 = new class348(class186.field2547);
                    for (class138 var10 = (class138) var9.method2306(-101); var10 != null; var10 = (class138) var9.method2305(arg0 - 129)) {
                        if (var8++ == var6) {
                            return var10.field1779;
                        }
                    }
                }
            }
            return -1;
        } else if (class396.field5779 && class277.field4063[81] && class402.field5874 > 2) {
            return ((class138) class186.field2547.field3397.field6090.field6090).field1779;
        } else {
            return ((class138) class186.field2547.field3397.field6090).field1779;
        }
    }
}
