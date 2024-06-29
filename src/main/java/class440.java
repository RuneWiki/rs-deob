import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class440 extends class523 {

    @OriginalMember(owner = "client!aga", name = "H", descriptor = "Ljj;")
    public static class398 field6060 = new class398(68, 2);

    @OriginalMember(owner = "client!aga", name = "K", descriptor = "Lnn;")
    public static class446 field6063 = new class446(9, 17);

    @OriginalMember(owner = "client!aga", name = "M", descriptor = "F")
    public static float field6065;

    @OriginalMember(owner = "client!aga", name = "E", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!aga", name = "G", descriptor = "I")
    public static int field6059;

    @OriginalMember(owner = "client!aga", name = "I", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!aga", name = "J", descriptor = "Ldga;")
    public static class138 field6062;

    @OriginalMember(owner = "client!aga", name = "L", descriptor = "Lpq;")
    public static class159 field6064;

    @OriginalMember(owner = "client!aga", name = "F", descriptor = "[B")
    private byte[] field6058;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "(B)V")
    public static void method2524(byte arg0) {
        int var1 = 108 / ((-arg0 - 14) / 32);
        field6064 = null;
        field6063 = null;
        field6062 = null;
        field6060 = null;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ILba;III)Lvg;")
    public static final class162 method2525(int arg0, class629 arg1, int arg2, int arg3, int arg4) {
        field6057++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == 255) {
            return new class162(arg2, arg3, arg4, arg1.method683(), arg1.method641(), arg1.method662(), arg1.method686(), arg1.method660(), arg1.method679(), arg1.method690());
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIB)[B")
    public final byte[] method2526(int arg0, int arg1, int arg2, byte arg3) {
        this.field6058 = new byte[arg0 * arg1 * arg2 * 2];
        field6059++;
        if (arg3 == 66) {
            this.method3645(arg0, arg2, arg1, -23747);
            return this.field6058;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(BII)V")
    public final void method861(byte arg0, int arg1, int arg2) {
        if (arg2 != 768203713) {
            method2525(0, null, -82, 40, 86);
        }
        field6061++;
        int var4 = arg1 * 2;
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field6058[var10001] = var5;
        this.field6058[var6] = var5;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "()V")
    public class440() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
