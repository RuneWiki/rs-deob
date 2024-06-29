import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class118 extends class550 {

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public int field1521;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public int field1515;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
    public int field1518;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "Ljj;")
    public static class398 field1520 = new class398(59, 3);

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "Z")
    public static boolean field1523 = false;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(ILdw;)I")
    public static final int method723(int arg0, class676 arg1) {
        field1522++;
        class195 var2 = arg1.field9594;
        int var3 = -54 / ((59 - arg0) / 55);
        if (var2.field2557 != null) {
            var2 = var2.method1242(class327.field4771, (byte) -32);
            if (var2 == null) {
                return -1;
            }
        }
        int var4 = var2.field2581;
        class334 var5 = arg1.method242(5832);
        if (arg1.field456) {
            var4 = var2.field2528;
        } else if (arg1.field454 == var5.field4880 || arg1.field454 == var5.field4915 || arg1.field454 == var5.field4914 || arg1.field454 == var5.field4888) {
            var4 = var2.field2534;
        } else if (arg1.field454 == var5.field4920 || arg1.field454 == var5.field4871 || arg1.field454 == var5.field4875 || arg1.field454 == var5.field4912) {
            var4 = var2.field2567;
        }
        return var4;
    }

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "(B)V")
    public static void method724(byte arg0) {
        field1520 = null;
        int var1 = 127 / ((40 - arg0) / 55);
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)Ljv;")
    public final class606 method472(byte arg0) {
        field1524++;
        return arg0 == -110 ? class428.field5943 : null;
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(Lrn;Lhv;IIIIIIIIIII)V")
    public class118(class380 arg0, class97 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field1517 = arg11;
        this.field1521 = arg7;
        this.field1516 = arg8;
        this.field1515 = arg10;
        this.field1514 = arg9;
        this.field1518 = arg12;
    }
}
