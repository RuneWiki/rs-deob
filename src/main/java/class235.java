import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public abstract class class235 {

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
    public static int field4087 = -1;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "Lsc;")
    private static class181 field4088 = class149.method967(255, " ");

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "Z")
    public static boolean field4090 = false;

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "Lsc;")
    public static class181 field4089 = field4088;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field4093 = 0;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Lsc;")
    public static class181 field4094 = class149.method967(255, "overlay");

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "[Z")
    public static boolean[] field4092 = new boolean[100];

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
    public static void method1611(byte arg0) {
        if (arg0 != 78) {
            method1614(92);
        }
        field4089 = null;
        field4088 = null;
        field4094 = null;
        field4092 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I[B)V")
    public abstract void method992(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
    public static final void method1612(boolean arg0) {
        if (!arg0) {
            method1613(11, -1, -67, 84, (class208) null, -16L, (class208) null, (class208) null);
        }
        class115.field1871.method1798(-94);
        field4086++;
        class194.field3391.method1798(-29);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIILaf;JLaf;Laf;)V")
    public static final void method1613(int arg0, int arg1, int arg2, int arg3, class208 arg4, long arg5, class208 arg6, class208 arg7) {
        class74 var9 = new class74();
        var9.field1184 = arg4;
        var9.field1190 = arg1 * 128 + 64;
        var9.field1173 = arg2 * 128 + 64;
        var9.field1196 = arg3;
        var9.field1195 = arg5;
        var9.field1175 = arg6;
        var9.field1178 = arg7;
        int var10 = 0;
        class220 var11 = class221.field3820[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3806; var12++) {
                class100 var13 = var11.field3797[var12];
                if ((var13.field1677 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1681.method190();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1185 = -var10;
        if (class221.field3820[arg0][arg1][arg2] == null) {
            class221.field3820[arg0][arg1][arg2] = new class220(arg0, arg1, arg2);
        }
        class221.field3820[arg0][arg1][arg2].field3803 = var9;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)[B")
    public abstract byte[] method991(int arg0);

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)I")
    public static final int method1614(int arg0) {
        if (arg0 != 128) {
            method1612(true);
        }
        field4091++;
        return 2;
    }
}
