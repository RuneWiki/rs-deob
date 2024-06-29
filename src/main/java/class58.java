import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class58 {

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "Z")
    public static boolean field824 = false;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[I")
    public static int[] field818 = new int[500];

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "[I")
    public static int[] field822 = new int[4096];

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "[[S")
    public static short[][] field823;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZLns;Lns;)V", line = 4)
    public static final void method455(boolean arg0, class627 arg1, class627 arg2) {
        field820++;
        if (arg1.field8742 != null) {
            arg1.method3426((byte) -11);
        }
        if (arg0) {
            field823 = null;
        }
        arg1.field8744 = arg2;
        arg1.field8742 = arg2.field8742;
        arg1.field8742.field8744 = arg1;
        arg1.field8744.field8742 = arg1;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILgaa;)Ljava/lang/String;", line = 22)
    public static final String method456(int arg0, class460 arg1) {
        field819++;
        if (client.method715(arg1).method291(68) == 0) {
            return null;
        } else if (arg0 != 5) {
            return null;
        } else if (arg1.field6542 == null || arg1.field6542.trim().length() == 0) {
            return class491.field6959 ? "Hidden-use" : null;
        } else {
            return arg1.field6542;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V", line = 53)
    public static final void method457(boolean arg0, int arg1) {
        field825++;
        if (arg0) {
            class548 var2 = class696.method3872(arg1, 8, -1633381944);
            var2.method3127((byte) 120);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIILvl;)V", line = 67)
    public static final void method458(int arg0, int arg1, int arg2, class337 arg3) {
        class73 var4 = class663.method3590(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field966 = arg3;
        int var5 = class517.field7282 == class109.field1341 ? 1 : 0;
        if (arg3.method265((byte) -70)) {
            if (arg3.method256((byte) -47)) {
                arg3.field5793 = class466.field6722[var5];
                class466.field6722[var5] = arg3;
                return;
            }
            arg3.field5793 = class684.field9445[var5];
            class684.field9445[var5] = arg3;
            class571.field7967 = true;
            return;
        }
        arg3.field5793 = class293.field3797[var5];
        class293.field3797[var5] = arg3;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 100)
    public static final void method459(byte arg0) {
        field817++;
        int var1 = -45 / ((arg0 - 53) / 33);
        class223.field2944.method346(class223.field2944.field637, 1, false);
        class223.field2944.method346(class223.field2944.field619, 1, false);
        class223.field2944.method346(class223.field2944.field596, 2, false);
        class223.field2944.method346(class223.field2944.field588, 2, false);
        class223.field2944.method346(class223.field2944.field610, 1, false);
        class223.field2944.method346(class223.field2944.field591, 1, false);
        class223.field2944.method346(class223.field2944.field620, 1, false);
        class223.field2944.method346(class223.field2944.field622, 1, false);
        class223.field2944.method346(class223.field2944.field611, 1, false);
        class223.field2944.method346(class223.field2944.field621, 1, false);
        class223.field2944.method346(class223.field2944.field628, 2, false);
        class223.field2944.method346(class223.field2944.field602, 1, false);
        class223.field2944.method346(class223.field2944.field604, 2, false);
        class223.field2944.method346(class223.field2944.field585, 1, false);
        class223.field2944.method346(class223.field2944.field618, 0, false);
        class223.field2944.method346(class223.field2944.field631, 0, false);
        class223.field2944.method346(class223.field2944.field615, 2, false);
        class223.field2944.method346(class223.field2944.field612, 0, false);
        class223.field2944.method346(class223.field2944.field594, 0, false);
        class87.method613(-18535);
        class223.field2944.method346(class223.field2944.field626, 0, false);
        class223.field2944.method346(class223.field2944.field609, 4, false);
        class681.method3687((byte) 78);
        class37.method328((byte) -45);
        class315.field4051 = true;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V", line = 143)
    public static void method460(boolean arg0) {
        field822 = null;
        if (!arg0) {
            method461(-75, null);
        }
        field818 = null;
        field823 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILdfa;)I", line = 161)
    public static final int method461(int arg0, class757 arg1) {
        field821++;
        int var2 = arg1.method4206(2, arg0 ^ 0x65);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method4206(5, -103);
        } else if (var2 == 2) {
            var3 = arg1.method4206(8, 114);
        } else {
            var3 = arg1.method4206(11, arg0 ^ 0xFFFFFFB9);
        }
        if (arg0 != 8) {
            field818 = null;
        }
        return var3;
    }
}
