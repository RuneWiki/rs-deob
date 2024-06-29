import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class215 extends class200 {

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "Lkl;")
    public class263 field3728;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "Loa;")
    public static class99 field3729 = class221.method1463(2844, "huffman");

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)V")
    public static void method1439(byte arg0) {
        field3729 = null;
        int var1 = 52 / ((arg0 + 61) / 43);
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lkl;)V")
    public class215(class263 arg0) {
        this.field3728 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BIII)V")
    public static final void method1440(byte arg0, int arg1, int arg2, int arg3) {
        field3730++;
        class107 var4 = class127.method842((byte) -48, arg1, arg2);
        if (var4 != null && var4.field1811 != null) {
            class260 var5 = new class260();
            var5.field4553 = var4;
            var5.field4543 = var4.field1811;
            class56.method385(200000, var5);
        }
        class239.field4132 = arg1;
        if (arg0 > 54) {
            class33.field592 = arg3;
            class54.field896 = true;
            class103.field1750 = arg2;
            class238.method1555(var4, 10555);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIILuk;JLuk;Luk;)V")
    public static final void method1441(int arg0, int arg1, int arg2, int arg3, class98 arg4, long arg5, class98 arg6, class98 arg7) {
        class163 var9 = new class163();
        var9.field2875 = arg4;
        var9.field2873 = arg1 * 128 + 64;
        var9.field2868 = arg2 * 128 + 64;
        var9.field2867 = arg3;
        var9.field2872 = arg5;
        var9.field2863 = arg6;
        var9.field2862 = arg7;
        int var10 = 0;
        class216 var11 = class128.field2236[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3748; var12++) {
                class77 var13 = var11.field3743[var12];
                if ((var13.field1372 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1367.method226();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field2874 = -var10;
        if (class128.field2236[arg0][arg1][arg2] == null) {
            class128.field2236[arg0][arg1][arg2] = new class216(arg0, arg1, arg2);
        }
        class128.field2236[arg0][arg1][arg2].field3756 = var9;
    }
}
