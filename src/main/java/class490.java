import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class490 extends class644 {

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public int field6961 = -1;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public int field6954 = 12800;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "I")
    public int field6966 = 0;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Z")
    public boolean field6967 = true;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public int field6969 = 0;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public int field6970 = -1;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public int field6971 = 12800;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public int field6955;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public int field6965;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "Ljava/lang/String;")
    public String field6958;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Ljava/lang/String;")
    public String field6968;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lfh;")
    public class653 field6960;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field6957;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field6959;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field6962;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field6963;

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    public static int field6964;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B[III)Z", line = 4)
    public final boolean method2892(byte arg0, int[] arg1, int arg2, int arg3) {
        field6963++;
        if (arg0 <= 69) {
            this.method2897(73);
        }
        for (class372 var5 = (class372) this.field6960.method3672(-1); var5 != null; var5 = (class372) this.field6960.method3662(-1)) {
            if (var5.method2138(arg2, arg3, 31838)) {
                var5.method2142(arg3, arg1, -101, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)Z", line = 34)
    public final boolean method2893(int arg0, int arg1, int arg2) {
        field6956++;
        if (arg0 != -5942) {
            this.field6966 = -117;
        }
        for (class372 var4 = (class372) this.field6960.method3672(arg0 ^ 0x1735); var4 != null; var4 = (class372) this.field6960.method3662(-1)) {
            if (var4.method2139(arg2, 0, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 61)
    public static final void method2894(int arg0) {
        class194.field2660.method69(0);
        field6959++;
        for (int var1 = 0; var1 < 32; var1++) {
            class353.field4543[var1] = 0L;
        }
        if (arg0 <= -41) {
            for (int var2 = 0; var2 < 32; var2++) {
                class275.field3453[var2] = 0L;
            }
            class143.field2026 = 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([IBIII)Z", line = 89)
    public final boolean method2895(int[] arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6962++;
        class372 var6 = (class372) this.field6960.method3672(-1);
        if (arg1 != -46) {
            return false;
        }
        while (var6 != null) {
            if (var6.method2141(false, arg3, arg4, arg2)) {
                var6.method2140(arg0, (byte) 123, arg3, arg4);
                return true;
            }
            var6 = (class372) this.field6960.method3662(-1);
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 212)
    public class490(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6955 = arg3;
        this.field6970 = arg6;
        this.field6965 = arg0;
        this.field6961 = arg4;
        this.field6958 = arg2;
        this.field6968 = arg1;
        this.field6967 = arg5;
        if (this.field6970 == 255) {
            this.field6970 = 0;
        }
        this.field6960 = new class653();
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIIB)Z", line = 131)
    public final boolean method2896(int[] arg0, int arg1, int arg2, byte arg3) {
        field6964++;
        for (class372 var5 = (class372) this.field6960.method3672(arg3 - 93); var5 != null; var5 = (class372) this.field6960.method3662(-1)) {
            if (var5.method2139(arg1, 0, arg2)) {
                var5.method2140(arg0, (byte) 58, arg1, arg2);
                return true;
            }
        }
        if (arg3 != 92) {
            this.field6958 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V", line = 165)
    public final void method2897(int arg0) {
        this.field6969 = 0;
        this.field6971 = 12800;
        this.field6966 = 0;
        this.field6954 = 12800;
        field6957++;
        for (class372 var2 = (class372) this.field6960.method3672(-1); var2 != null; var2 = (class372) this.field6960.method3662(-1)) {
            if (this.field6966 < var2.field4769) {
                this.field6966 = var2.field4769;
            }
            if (this.field6969 < var2.field4782) {
                this.field6969 = var2.field4782;
            }
            if (var2.field4778 < this.field6954) {
                this.field6954 = var2.field4778;
            }
            if (var2.field4770 < this.field6971) {
                this.field6971 = var2.field4770;
            }
        }
        int var3 = -88 % ((-arg0 - 30) / 49);
    }
}
