import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class45 extends class525 implements class370 {

    @OriginalMember(owner = "client!wba", name = "H", descriptor = "Lui;")
    private class194 field543;

    @OriginalMember(owner = "client!wba", name = "G", descriptor = "[S")
    public static short[] field542 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!wba", name = "I", descriptor = "Llb;")
    public static class465 field544;

    @OriginalMember(owner = "client!wba", name = "K", descriptor = "[J")
    public static long[] field546;

    @OriginalMember(owner = "client!wba", name = "J", descriptor = "[I")
    public static int[] field545;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!wba", name = "y", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!wba", name = "z", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!wba", name = "B", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!wba", name = "C", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!wba", name = "D", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!wba", name = "E", descriptor = "I")
    public static int field541;

    static {
        new class572("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field544 = new class465(64);
        field546 = new long[32];
        field545 = new int[] { 1, 2, 4, 8 };
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Z", line = 9)
    public final boolean method280(int arg0) {
        field537++;
        if (arg0 != 28596) {
            this.method281((byte) 22);
        }
        return super.method280(arg0);
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V", line = 28)
    public final void method281(byte arg0) {
        field538++;
        if (arg0 < 34) {
            this.method288(33);
        }
        super.method281((byte) 72);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IZ)Ljaclib/memory/Buffer;", line = 41)
    public final Buffer method282(int arg0, boolean arg1) {
        if (arg0 == -13803) {
            field540++;
            return super.method282(-13803, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)Lui;", line = 53)
    public final class194 method283(byte arg0) {
        field536++;
        if (arg0 > -69) {
            this.method283((byte) 107);
        }
        return this.field543;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IIB)I", line = 66)
    public static final int method284(int arg0, int arg1, byte arg2) {
        field534++;
        int var3 = -43 % ((arg2 + 7) / 57);
        int var4 = arg0 - 1 & arg1 >> 31;
        return ((arg1 >>> 31) + arg1) % arg0 + var4;
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(B)V", line = 80)
    public static void method285(byte arg0) {
        field542 = null;
        field546 = null;
        field544 = null;
        field545 = null;
        if (arg0 > -63) {
            field545 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "([BIII)[B", line = 95)
    public static final byte[] method286(byte[] arg0, int arg1, int arg2, int arg3) {
        field539++;
        byte[] var4;
        if (arg3 <= 0) {
            var4 = arg0;
        } else {
            var4 = new byte[arg2];
            for (int var5 = 0; var5 < arg2; var5++) {
                var4[var5] = arg0[arg3 + var5];
            }
        }
        class175 var6 = new class175();
        var6.method1224(0);
        var6.method1225(var4, 2, (long) (arg2 * 8));
        byte[] var7 = new byte[64];
        if (arg1 != -18340) {
            method285((byte) 21);
        }
        var6.method1226(-1, 0, var7);
        return var7;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(II)V", line = 134)
    public final void method287(int arg0, int arg1) {
        super.method287(-81, this.field543.field2870 * arg1);
        if (arg0 < -71) {
            field541++;
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lag;Lui;Z)V", line = 147)
    public class45(class587 arg0, class194 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field543 = arg1;
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)I", line = 155)
    public final int method288(int arg0) {
        field535++;
        if (arg0 != 247) {
            this.method281((byte) 0);
        }
        return super.method288(247);
    }
}
