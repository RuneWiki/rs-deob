import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public abstract class class702 {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lhda;")
    public static class752 field9748 = new class752(84, 4);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field9749;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gn", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field9750;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3955(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 3)
    public static void method3950(byte arg0) {
        int var1 = 19 % ((arg0 - 41) / 47);
        field9748 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)V", line = 16)
    public static final void method3951(int arg0, boolean arg1) {
        field9749++;
        if (arg1) {
            if (class443.field6101 != -1) {
                class439.method2532(-19, class443.field6101);
            }
            for (class8 var2 = (class8) class350.field4925.method2144(true); var2 != null; var2 = (class8) class350.field4925.method2146(false)) {
                if (!var2.method3566((byte) 78)) {
                    var2 = (class8) class350.field4925.method2144(true);
                    if (var2 == null) {
                        break;
                    }
                }
                class710.method3990(false, false, true, var2);
            }
            class443.field6101 = -1;
            class350.field4925 = new class360(8);
            class709.method3987((byte) 44);
            class443.field6101 = class226.field3226;
            class411.method2400(false, -84);
            class312.method1915(-101);
            class182.method1251(class443.field6101);
        }
        class367.field5144 = false;
        class416.field5739 = "";
        class371.field5166 = "";
        class190.method1296(0);
        class737.field10192 = -1;
        int var3 = 12 / ((arg0 - 30) / 60);
        class401.method2361((byte) -108, class430.field5934);
        class472.field6475 = new class383();
        class472.field6475.field10322[0] = class719.field10004 / 2;
        class472.field6475.field3505 = class719.field10004 * 512 / 2;
        class472.field6475.field3502 = class107.field1453 * 512 / 2;
        class314.field4488 = 0;
        class694.field9662 = 0;
        class472.field6475.field10321[0] = class107.field1453 / 2;
        if (class278.field3898 == 2) {
            class314.field4488 = class324.field4605 << 9;
            class694.field9662 = class45.field583 << 9;
        } else {
            class514.method2872(2);
        }
        class320.method1940(1);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 80)
    public static final boolean method3952(int arg0, String arg1) {
        field9747++;
        int var2 = 96 / ((arg0 - 4) / 52);
        return class700.method3943(492219900, field9750 == null ? (field9750 = method3955("km")) : field9750, arg1);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B)[B", line = 92)
    public static final byte[] method3953(int arg0, byte[] arg1) {
        field9746++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 > -106) {
            method3954((byte) -24);
        }
        class335.method2020(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(B)V", line = 108)
    public static final void method3954(byte arg0) {
        class328.field4681 = 0;
        field9745++;
        int var1 = (class472.field6475.field3505 >> 9) + class503.field6752;
        int var2 = (class472.field6475.field3502 >> 9) + class334.field4757;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class328.field4681 = 1;
        }
        if (arg0 != 88) {
            method3953(53, null);
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class328.field4681 = 1;
        }
        if (class328.field4681 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class328.field4681 = 0;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Z")
    public abstract boolean method1436(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public abstract void method1439(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BII)V")
    public abstract void method1442(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V")
    public abstract void method1441(int arg0);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([BIII)I")
    public abstract int method1435(byte[] arg0, int arg1, int arg2, int arg3) throws IOException;
}
