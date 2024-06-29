import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class636 extends class774 {

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field8085 = 0;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Luw;")
    public static class208 field8089 = new class208(50, 8);

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "F")
    public static float field8091;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public static int field8084;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    public static int field8086;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    public static int field8088;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    public static int field8090;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "[B")
    private byte[] field8087;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)[B")
    public final byte[] method3431(int arg0, int arg1, int arg2, int arg3) {
        field8086++;
        this.field8087 = new byte[arg0 * arg2 * 2 * arg3];
        int var5 = -64 % ((49 - arg1) / 46);
        this.method2291(arg2, arg0, false, arg3);
        return this.field8087;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZZ)V")
    public static final void method3432(boolean arg0, boolean arg1) {
        field8084++;
        if (class656.field8466.length() == 0) {
            return;
        }
        class789.method4318("--> " + class656.field8466, !arg1);
        class458.method2591(false, class656.field8466, arg0, (byte) 46);
        class749.field10220 = 0;
        if (!arg1) {
            method3434(-95);
        }
        class656.field8466 = "";
        class510.field6513 = 0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILwm;IIZI)V")
    public static final void method3433(int arg0, class30 arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field8090++;
        class50.method324(arg4, arg1, arg5, arg0, (long) arg3, -31, arg2);
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public static void method3434(int arg0) {
        if (arg0 == 0) {
            field8089 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class636() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIB)V")
    public final void method2964(byte arg0, int arg1, byte arg2) {
        field8088++;
        int var4 = 58 / ((28 - arg2) / 34);
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        int var6 = arg1 * 2;
        int var10001 = var6;
        int var7 = var6 + 1;
        this.field8087[var10001] = var5;
        this.field8087[var7] = var5;
    }
}
