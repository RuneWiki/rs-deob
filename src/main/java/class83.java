import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class83 extends class425 {

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lub;")
    public static class15 field1056 = new class15(2);

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lpm;")
    public static class349 field1058 = new class349("K", "T", "K", "K");

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Lpm;")
    public static class349 field1062 = new class349("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Lpm;")
    public static class349 field1065 = new class349("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "Ltj;")
    public static class108 field1064;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method482(int arg0) {
        field1057++;
        if (arg0 < 109) {
            this.method487((byte) -120);
        }
        return (this.field1055 & 0x78851C) >> 22 != 0;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)Z", line = 20)
    public final boolean method483(byte arg0) {
        field1060++;
        if (arg0 != 82) {
            field1062 = null;
        }
        return (this.field1055 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)Z", line = 37)
    public final boolean method484(byte arg0) {
        field1052++;
        if (arg0 < 12) {
            field1065 = null;
        }
        return ((this.field1055 & 0x32F2D1) >> 21) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z", line = 48)
    public final boolean method485(int arg0, int arg1) {
        int var3 = 5 / ((arg0 + 49) / 49);
        field1059++;
        return (this.field1055 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZZII[Lbr;)V", line = 58)
    public static final void method486(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, class223[] arg5) {
        field1061++;
        for (int var6 = 0; var6 < arg5.length; var6++) {
            class223 var7 = arg5[var6];
            if (var7 != null && var7.field3212 == arg3) {
                class409.method2584(arg0, arg4, 4, arg2, var7);
                class269.method1833((byte) 88, arg0, var7, arg4);
                if (var7.field3186 - var7.field3250 < var7.field3341) {
                    var7.field3341 = var7.field3186 - var7.field3250;
                }
                if ((var7.field3289 - var7.field3282) < var7.field3240) {
                    var7.field3240 = var7.field3289 - var7.field3282;
                }
                if (var7.field3341 < 0) {
                    var7.field3341 = 0;
                }
                if (var7.field3240 < 0) {
                    var7.field3240 = 0;
                }
                if (var7.field3208 == 0) {
                    class380.method2420(var7, arg2, 0);
                }
            }
        }
        if (arg1) {
            field1058 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(B)I", line = 108)
    public final int method487(byte arg0) {
        field1063++;
        if (arg0 != -64) {
            field1064 = null;
        }
        return (this.field1055 & 0x1DD676) >> 18;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)I", line = 121)
    public final int method488(int arg0) {
        field1054++;
        return arg0 == 2 ? class58.method381(121, this.field1055) : -95;
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(B)V", line = 132)
    public static void method489(byte arg0) {
        field1056 = null;
        field1064 = null;
        field1062 = null;
        int var1 = 82 / ((arg0 + 54) / 59);
        field1058 = null;
        field1065 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIBII)I", line = 149)
    public static final int method490(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 12) {
            return -67;
        }
        field1051++;
        int var5 = arg1 & 0xF;
        int var6 = var5 >= 8 ? arg3 : arg4;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg4 : arg0) : arg3;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V", line = 166)
    public class83(int arg0, int arg1) {
        this.field1055 = arg0;
        this.field1053 = arg1;
    }
}
