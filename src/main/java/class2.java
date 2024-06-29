import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class2 extends class608 {

    @OriginalMember(owner = "client!is", name = "o", descriptor = "B")
    public byte field6 = 5;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "Lbda;")
    public static class401 field13 = new class401("WTQA", 2);

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    public int field16;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "I")
    public int field7;

    @OriginalMember(owner = "client!is", name = "q", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "Lvda;")
    public static class311 field18;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "Ljr;")
    public static class441 field19;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "Z")
    public boolean field10;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ZC)Z")
    public static final boolean method3(boolean arg0, char arg1) {
        if (!arg0) {
            field19 = null;
        }
        field11++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(Z)V")
    public static final void method4(boolean arg0) {
        field12++;
        class124.method669(2, 22050, -115, class501.field6954.field7845);
        class641.field9317 = new class333();
        class641.field9317.method2092(128, -128, 9);
        class288.field3759 = class486.method2742(class141.field1806, 22050, 0, -1, class31.field488);
        class288.field3759.method332((byte) -112, class641.field9317);
        class645.method3714(class592.field8546, arg0, class641.field9317, class35.field547, class546.field7612);
        class226.field2891 = class486.method2742(class141.field1806, 2048, 1, -1, class31.field488);
        class92.field1224 = new class47();
        class226.field2891.method332((byte) -108, class92.field1224);
        class90.field1220 = new class440(22050, class10.field98);
        class103.field1359 = class251.field3143.method2053((byte) 40, "scape main");
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(B)V")
    public static final void method5(byte arg0) {
        field8++;
        if (class630.field9188 == 6) {
            class493.method2772(false, arg0 + 18677);
            return;
        }
        if (arg0 != 70) {
            field20 = 93;
        }
        class367.field5125 = class96.field1294;
        class96.field1294 = null;
        class597.method3438((byte) 124, 12);
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(B)V")
    public static void method6(byte arg0) {
        if (arg0 != -48) {
            method4(true);
        }
        field19 = null;
        field13 = null;
        field18 = null;
    }
}
