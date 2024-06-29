import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class34 extends class87 {

    @OriginalMember(owner = "client!fc", name = "gb", descriptor = "I")
    public static int field765 = -1;

    @OriginalMember(owner = "client!fc", name = "mb", descriptor = "Lec;")
    public static class28 field771 = class28.method210(-46, "@whi@");

    @OriginalMember(owner = "client!fc", name = "ib", descriptor = "I")
    public static int field767 = 0;

    @OriginalMember(owner = "client!fc", name = "nb", descriptor = "Lec;")
    public static class28 field772 = class28.method210(-46, " million @whi@(X");

    @OriginalMember(owner = "client!fc", name = "pb", descriptor = "Lec;")
    public static class28 field774 = class28.method210(-46, "runes");

    @OriginalMember(owner = "client!fc", name = "ub", descriptor = "I")
    public static volatile int field779 = 0;

    @OriginalMember(owner = "client!fc", name = "db", descriptor = "Lec;")
    public static class28 field762 = class28.method210(-46, "redstone2");

    @OriginalMember(owner = "client!fc", name = "tb", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!fc", name = "wb", descriptor = "I")
    public static int field781 = 0;

    @OriginalMember(owner = "client!fc", name = "eb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!fc", name = "fb", descriptor = "I")
    public int field764;

    @OriginalMember(owner = "client!fc", name = "hb", descriptor = "I")
    public int field766;

    @OriginalMember(owner = "client!fc", name = "lb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!fc", name = "ob", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!fc", name = "rb", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!fc", name = "sb", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!fc", name = "jb", descriptor = "Lce;")
    public static class18 field768;

    @OriginalMember(owner = "client!fc", name = "vb", descriptor = "Ldd;")
    public static class23 field780;

    @OriginalMember(owner = "client!fc", name = "kb", descriptor = "[I")
    public static int[] field769;

    @OriginalMember(owner = "client!fc", name = "qb", descriptor = "[Lwc;")
    public static class128[] field775;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lvb;III)[Lwc;")
    public static final class128[] method287(class122 arg0, int arg1, int arg2, int arg3) {
        field773++;
        if (class47.method381((byte) -44, arg0, arg2, arg3)) {
            int var4 = 74 % ((arg1 + 28) / 45);
            return class45.method361(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[BI)Z")
    public static final boolean method288(int arg0, int arg1, byte[] arg2, int arg3) {
        field777++;
        if (arg1 != 0) {
            method289(-12);
        }
        class119 var4 = new class119(arg2);
        boolean var5 = true;
        int var6 = -1;
        label71: while (true) {
            int var7 = var4.method899(-4);
            if (var7 == 0) {
                return var5;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class45 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method899(arg1 ^ 0xFFFFFFFC);
                                        if (var17 == 0) {
                                            continue label71;
                                        }
                                        var4.method879((byte) 45);
                                    }
                                    int var10 = var4.method899(arg1 ^ 0xFFFFFFFC);
                                    if (var10 == 0) {
                                        continue label71;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var4.method879((byte) 45) >> 2;
                                    var13 = arg3 + var11;
                                    int var14 = var8 >> 6 & 0x3F;
                                    var15 = var14 + arg0;
                                } while (var15 <= 0);
                            } while (var13 <= 0);
                        } while (var15 >= 103);
                    } while (var13 >= 103);
                    var16 = class72.method566(var6, arg1 ^ 0x78);
                } while (var12 == 22 && class72.field1591 && var16.field977 == 0 && !var16.field960);
                if (!var16.method352(arg1 ^ 0xFFFFFF80)) {
                    var5 = false;
                    class88.field1958++;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static final void method289(int arg0) {
        field763++;
        class94.field2071.method659(1000);
        class74.field1643.method659(1000);
        class83.field1882.method659(arg0 ^ 0xFFFFFC17);
        class105.field2213.method659(1000);
        if (arg0 != -1) {
            field765 = 75;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)Lfb;")
    public final class33 method290(int arg0) {
        field776++;
        int var2 = 43 % ((-arg0 - 70) / 55);
        return class129.method992(this.field764, -78).method990((byte) 25, true, this.field766);
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
    public static void method291(byte arg0) {
        int var1 = 87 / ((-arg0 - 28) / 53);
        field769 = null;
        field772 = null;
        field771 = null;
        field762 = null;
        field768 = null;
        field774 = null;
        field780 = null;
        field775 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lvb;Lec;ILec;)Lwc;")
    public static final class128 method292(class122 arg0, class28 arg1, int arg2, class28 arg3) {
        field770++;
        int var4 = arg0.method942(arg1, arg2 ^ 0x1);
        int var5 = arg0.method930((byte) 103, var4, arg3);
        if (arg2 != 0) {
            method289(96);
        }
        return class45.method351((byte) 63, var5, var4, arg0);
    }
}
