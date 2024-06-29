import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class526 extends class366 {

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    private int field6976;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    private int field6969;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    private int field6970;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    private int field6980;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    private int field6975;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "Lrv;")
    private class111 field6978;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    private int field6974;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "J")
    public static long field6972 = 0L;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "[F")
    public static float[] field6977 = new float[4];

    @OriginalMember(owner = "client!um", name = "t", descriptor = "Lhda;")
    public static class752 field6979 = new class752(53, -2);

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Lnc;")
    public static class23 field6973;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "Lnp;")
    private class493 field6971;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Lnp;", line = 4)
    public final class493 method2165(byte arg0) {
        field6981++;
        if (this.field6971 == null) {
            class152 var2 = this.field6978.field717;
            class445.field6118[4] = this.field6976;
            class445.field6118[3] = this.field6975;
            class445.field6118[1] = this.field6969;
            class445.field6118[5] = this.field6980;
            class445.field6118[2] = this.field6970;
            class445.field6118[0] = this.field6974;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method85(class445.field6118[var5], -32345)) {
                    return null;
                }
                class758 var7 = var2.method91(class445.field6118[var5], (byte) 125);
                int var8 = var7.field10548 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field10535 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class96.field1177[var6] = var2.method86(-126, var4, 1.0F, false, class445.field6118[var6], var4);
            }
            this.field6971 = this.field6978.method832((byte) -125, var3, class96.field1177, var4);
        }
        if (arg0 >= -66) {
            method2905(-56);
        }
        return this.field6971;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 77)
    public static void method2905(int arg0) {
        if (arg0 != 4) {
            field6979 = null;
        }
        field6973 = null;
        field6979 = null;
        field6977 = null;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lrv;IIIIII)V", line = 97)
    public class526(class111 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6976 = arg5;
        this.field6969 = arg2;
        this.field6970 = arg3;
        this.field6980 = arg6;
        this.field6975 = arg4;
        this.field6978 = arg0;
        this.field6974 = arg1;
    }
}
