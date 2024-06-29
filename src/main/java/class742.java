import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class742 extends class392 {

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[[Z")
    public static boolean[][] field10330 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "J")
    public static long field10332 = 0L;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field10327;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field10329;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field10331;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Lwr;")
    private class459 field10328;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZI)I", line = 4)
    public final int method4151(int arg0, boolean arg1, int arg2) {
        field10331++;
        if (this.field10328 == null) {
            return arg2;
        }
        class629 var4 = (class629) this.field10328.method2552((long) arg0, -1);
        if (!arg1) {
            this.method4152(62, (byte) 80, null);
        }
        return var4 == null ? arg2 : var4.field8775;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;", line = 38)
    public final String method4152(int arg0, byte arg1, String arg2) {
        field10326++;
        if (this.field10328 == null) {
            return arg2;
        }
        if (arg1 != -19) {
            method4153((byte) 49);
        }
        class273 var4 = (class273) this.field10328.method2552((long) arg0, arg1 ^ 0x12);
        return var4 == null ? arg2 : var4.field3594;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V", line = 60)
    public static void method4153(byte arg0) {
        field10330 = null;
        if (arg0 > -67) {
            field10332 = 71L;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILji;)V", line = 70)
    public final void method4154(int arg0, class611 arg1) {
        if (arg0 != 0) {
            field10330 = null;
        }
        while (true) {
            int var3 = arg1.method3428((byte) -98);
            if (var3 == 0) {
                field10327++;
                return;
            }
            this.method4155(var3, true, arg1);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZLji;)V", line = 94)
    private final void method4155(int arg0, boolean arg1, class611 arg2) {
        if (arg0 == 249) {
            int var4 = arg2.method3428((byte) -128);
            if (this.field10328 == null) {
                int var5 = class128.method814(423660257, var4);
                this.field10328 = new class459(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method3428((byte) 41) == 1;
                int var8 = arg2.method3385(-124);
                class55 var9;
                if (var7) {
                    var9 = new class273(arg2.method3403((byte) 84));
                } else {
                    var9 = new class629(arg2.method3418(-2));
                }
                this.field10328.method2558(var9, (long) var8, -1);
            }
        }
        if (arg1) {
            field10329++;
        }
    }
}
