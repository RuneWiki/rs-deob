import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class143 extends class513 {

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "Lwo;")
    public static class690 field1783 = new class690(2, -2);

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public int field1778;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public int field1785;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public int field1787;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public int field1790;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Ln;")
    public class17 field1777;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Ln;")
    public class17 field1789;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Lcaa;")
    public static class275 field1780;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Ljava/lang/String;")
    public String field1782;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "Z")
    public boolean field1781;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field1786;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method934(int arg0) {
        field1780 = null;
        field1783 = null;
        if (arg0 >= -10) {
            method935(81, null);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILun;)Llea;")
    public static final class567 method935(int arg0, class389 arg1) {
        field1776++;
        class514 var2 = class249.method1525(arg1, -1);
        int var3 = arg1.method2260(-103);
        int var4 = arg1.method2260(-35);
        int var5 = arg1.method2260(-45);
        int var6 = arg1.method2260(arg0 ^ 0x56);
        if (arg0 != -2) {
            method934(-114);
        }
        int var7 = arg1.method2260(-47);
        int var8 = arg1.method2260(-50);
        return new class567(var2.field7533, var2.field7535, var2.field7530, var2.field7532, var2.field7540, var2.field7528, var2.field7529, var2.field7537, var2.field7538, var3, var4, var5, var6, var7, var8);
    }
}
