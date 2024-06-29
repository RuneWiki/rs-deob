import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class25 {

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "[I")
    public static int[] field189 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "[I")
    public static int[] field192 = new int[32];

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "[Ls;")
    public static class281[] field188;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILjn;Ljn;)V")
    public static final void method98(int arg0, int arg1, int arg2, class719 arg3, class719 arg4) {
        class624 var5 = class76.method565(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field8728 = arg3;
        var5.field8737 = arg4;
        int var6 = field188 == class143.field1850 ? 1 : 0;
        if (!arg3.method123(-124)) {
            arg3.field2179 = class707.field9896[var6];
            class707.field9896[var6] = arg3;
        } else if (arg3.method126(6540)) {
            arg3.field2179 = class43.field467[var6];
            class43.field467[var6] = arg3;
        } else {
            arg3.field2179 = class732.field10200[var6];
            class732.field10200[var6] = arg3;
            class315.field4252 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method123(-126)) {
            if (arg4.method126(6540)) {
                arg4.field2179 = class43.field467[var6];
                class43.field467[var6] = arg4;
                return;
            }
            arg4.field2179 = class732.field10200[var6];
            class732.field10200[var6] = arg4;
            class315.field4252 = true;
            return;
        }
        arg4.field2179 = class707.field9896[var6];
        class707.field9896[var6] = arg4;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V")
    public static final void method99(byte arg0) {
        if (arg0 != 102) {
            return;
        }
        field191++;
        class13 var1 = null;
        try {
            class107 var2 = class287.field3823.method4143("2", true, 21516);
            while (var2.field1419 == 0) {
                class267.method1599(0, 1L);
            }
            if (var2.field1419 == 1) {
                var1 = (class13) var2.field1418;
                byte[] var3 = new byte[(int) var1.method49((byte) -60)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method50(var3.length - var4, (byte) -26, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class173.method996(arg0 ^ 0x270C, new class611(var3));
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method51(true);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
    public static void method100(int arg0) {
        field192 = null;
        field188 = null;
        field189 = null;
        if (arg0 != -17344) {
            method100(-125);
        }
    }
}
