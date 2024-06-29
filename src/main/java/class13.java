import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public class class13 implements class589 {

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "Z")
    public static boolean field196 = false;

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "[Ldaa;")
    public static class12[] field198 = new class12[8];

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!dka", name = "d", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!dka", name = "g", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!dka", name = "e", descriptor = "Lcq;")
    public static class494 field200;

    @OriginalMember(owner = "client!dka", name = "f", descriptor = "Lhn;")
    public static class752 field201;

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(I)V", line = 8)
    public static final void method72(int arg0) {
        field202++;
        if (class359.field4911 == -1) {
            return;
        }
        int var1 = class420.field5727.method1326((byte) 112);
        int var2 = class420.field5727.method1319((byte) 126);
        class556 var3 = (class556) class373.field5070.method3589((byte) -127);
        if (var3 != null) {
            var1 = var3.method2731(125);
            var2 = var3.method2734(false);
        }
        int var4 = 0;
        int var5 = arg0;
        if (class618.field8597) {
            var4 = class146.method1175(-29909);
            var5 = class605.method3435((byte) -98);
        }
        class628.method3530(var4, var1 + var4, class359.field4911, var2 + var5, var2, class732.field10098 + var4, var4, var1, var5, var5, (byte) -49, class108.field1697 + var5);
        if (class488.field6583 != null) {
            class582.method3345(var2 + var5, false, var1 + var4);
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(IB)V", line = 51)
    public static final void method73(int arg0, byte arg1) {
        class428.field5845 = -1;
        field199++;
        class299.field4116 = 100;
        class769.field10607 = arg0;
        class439.field5965 = 3;
        if (arg1 < 104) {
            method72(112);
        }
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(B)V", line = 65)
    public static void method74(byte arg0) {
        field198 = null;
        if (arg0 < 106) {
            method74((byte) 91);
        }
        field201 = null;
        field200 = null;
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(JZ[ILwg;)Ljava/lang/String;", line = 79)
    public final String method75(long arg0, boolean arg1, int[] arg2, class450 arg3) {
        field197++;
        if (class320.field4374 == arg3) {
            class84 var6 = class415.field5687.method2058(arg2[0], 51);
            return var6.method677((int) arg0, -6);
        } else if (class235.field3372 == arg3 || class594.field8345 == arg3) {
            class730 var7 = class143.field2427.method1410((byte) 86, (int) arg0);
            return var7.field10079;
        } else if (class711.field9786 == arg3 || class339.field4578 == arg3 || class665.field9235 == arg3) {
            return class415.field5687.method2058(arg2[0], 75).method677((int) arg0, -6);
        } else {
            if (!arg1) {
                field200 = null;
            }
            return null;
        }
    }
}
