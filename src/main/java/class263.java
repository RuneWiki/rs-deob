import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class263 extends class171 {

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
    public static int field4568 = 0;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "Lha;")
    public static class46 field4572 = class271.method1828("Mem:", -46);

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "Lha;")
    public static class46 field4575 = class271.method1828("Eingabeprozedur geladen)3", -46);

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "Lha;")
    public static class46 field4580 = class271.method1828("<col=ff0000>", -46);

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "Lha;")
    public static class46 field4571 = class271.method1828("::fpsoff", -46);

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "I")
    public int field4570;

    @OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
    public int field4574;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public int field4581;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!hh", name = "G", descriptor = "Lpi;")
    public static class181 field4573;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V")
    public abstract void method129(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)V")
    public abstract void method118(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    public static void method1773(byte arg0) {
        if (arg0 != 34) {
            method1773((byte) -97);
        }
        field4580 = null;
        field4571 = null;
        field4572 = null;
        field4575 = null;
        field4573 = null;
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)I")
    public static final int method1774(int arg0, int arg1, int arg2) {
        if (arg2 != 7422) {
            field4582 = 28;
        }
        int var3 = arg0 >>> 31;
        field4569++;
        return (arg0 + var3) / arg1 - var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method109(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public abstract void method127(int arg0, int arg1);

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
    public abstract void method119(int arg0, int arg1);

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)V")
    public static final void method1775(int arg0, int arg1) {
        class231.field4012.method81((byte) 30, arg1);
        class89.field1692.method81((byte) 30, arg1);
        field4576++;
        class2.field19.method81((byte) 30, arg1);
        if (arg0 != 15) {
            method1773((byte) -123);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIIII)V")
    public final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4583++;
        int var6 = this.field4574 << 3;
        int var7 = this.field4570 << 3;
        int var8 = (arg3 << 4) + (var6 & 0xF);
        int var9 = (arg0 << 4) + (var7 & 0xF);
        if (arg4 == 547267812) {
            this.method109(var6, var7, var8, var9, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V")
    public abstract void method115(int arg0, int arg1, int arg2, int arg3);
}
