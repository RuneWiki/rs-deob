import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class382 {

    @OriginalMember(owner = "client!laa", name = "j", descriptor = "Ljava/util/Random;")
    public static Random field5533 = new Random();

    @OriginalMember(owner = "client!laa", name = "l", descriptor = "Lhe;")
    public static class573 field5535 = new class573("WTQA", 2);

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public int field5524;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "I")
    public int field5525;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "I")
    public int field5526;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public int field5527;

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "I")
    public int field5528;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!laa", name = "k", descriptor = "I")
    public int field5534;

    @OriginalMember(owner = "client!laa", name = "n", descriptor = "I")
    public int field5537;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "[B")
    public byte[] field5530;

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "[B")
    public byte[] field5531;

    @OriginalMember(owner = "client!laa", name = "m", descriptor = "[J")
    public static long[] field5536;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public static void method2361(int arg0) {
        field5533 = null;
        field5536 = null;
        if (arg0 != 2) {
            method2363(-114, false, -42);
        }
        field5535 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Lip;B)V")
    public static final void method2362(class304 arg0, byte arg1) {
        field5532++;
        if (arg1 != 69) {
            field5536 = null;
        }
        if (class147.field2154) {
            return;
        }
        arg0.method2656((byte) 117);
        class456.field6499--;
        if (!arg0.field4157) {
            long var2 = arg0.field4153;
            class194 var4;
            for (var4 = (class194) class326.field4420.method4020(var2, (byte) -103); var4 != null && !var4.field2847.equals(arg0.field4158); var4 = (class194) class326.field4420.method4018((byte) 103)) {
            }
            if (var4 != null && var4.method1374(arg0, (byte) -18)) {
                class618.method3591(var4, (byte) -127);
                return;
            }
            return;
        }
        for (class194 var5 = (class194) class225.field3348.method3025(false); var5 != null; var5 = (class194) class225.field3348.method3026(true)) {
            if (var5.field2847.equals(arg0.field4158)) {
                boolean var6 = false;
                for (class304 var7 = (class304) var5.field2841.method3025(false); var7 != null; var7 = (class304) var5.field2841.method3026(true)) {
                    if (arg0 == var7) {
                        if (var5.method1374(arg0, (byte) -18)) {
                            class618.method3591(var5, (byte) -127);
                        }
                        var6 = true;
                        break;
                    }
                }
                if (var6) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IZI)V")
    public static final void method2363(int arg0, boolean arg1, int arg2) {
        class120.field1639 = arg2 - class664.field9498;
        if (arg1) {
            field5529++;
            class709.field9963 = arg0 - class664.field9502;
        }
    }
}
