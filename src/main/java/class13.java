import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 {

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Lgd;")
    public static class206 field180 = new class206("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field182 = 0;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field184 = 205;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljava/lang/String;")
    public String field177;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 6)
    public static void method81(byte arg0) {
        field180 = null;
        int var1 = 90 % ((arg0 - 23) / 54);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIZIILr;)V", line = 15)
    public static final void method82(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class110 arg6) {
        class90.field1315 = arg3;
        class409.field5607 = arg6;
        class4.field55 = arg2;
        class410.field5618 = arg1;
        class165.field2285 = arg5;
        field179++;
        class148.field2106 = 1;
        class425.field5747 = class491.field6866.method1781(-106) / arg4;
        if (arg0 == -2 && class425.field5747 < 1) {
            class425.field5747 = 1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILbt;)V", line = 40)
    public static final void method83(int arg0, class32 arg1) {
        field175++;
        if (arg0 < ~(arg1.field472.length - arg1.field456)) {
            return;
        }
        int var2 = arg1.method201((byte) -119);
        if (var2 < 0 || var2 > 1 || (arg1.field472.length - arg1.field456) < 2) {
            return;
        }
        int var3 = arg1.method215((byte) 114);
        if (var3 * 6 != arg1.field472.length - arg1.field456) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field456 >= arg1.field472.length) {
                            return;
                        }
                        var4 = arg1.method215((byte) 100);
                        var5 = arg1.method222(1024);
                    } while (class311.field4102.length <= var4);
                } while (!class387.field5359[var4]);
            } while (class100.field1462.method1416(true, var4).field5075 == '1' && (var5 < -1 || var5 > 1));
            class311.field4102[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lr;Lr;Lr;Lod;I)Z", line = 79)
    public static final boolean method84(class110 arg0, class110 arg1, class110 arg2, class321 arg3, int arg4) {
        class491.field6866 = arg3;
        class40.field577 = arg2;
        if (arg4 >= -117) {
            field180 = null;
        }
        field183++;
        class390.field5403 = arg0;
        class462.field6261 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 99)
    public static final void method85(int arg0, int arg1) {
        field181++;
        class338.field4547.method496(arg1, arg0 + 408);
        if (arg0 != -485) {
            field182 = 87;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)[Lvr;", line = 111)
    public static final class80[] method86(byte arg0) {
        field172++;
        if (arg0 >= -39) {
            method82(-112, 124, 22, false, 92, 9, (class110) null);
        }
        return new class80[] { class419.field5688, class419.field5690, class419.field5691, class419.field5692, class419.field5693, class419.field5694, class419.field5695, class419.field5696, class419.field5697, class419.field5698 };
    }
}
