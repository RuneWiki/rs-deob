import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class64 {

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "Lng;")
    private class226 field963 = new class226(64);

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "Lic;")
    private class491 field964;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "[I")
    public static int[] field967 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field973 = 0;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!iv", name = "k", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "Le;")
    public static class369 field972;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "Lql;")
    public static class515 field961;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)V")
    public final void method375(int arg0, int arg1) {
        int var3 = 62 / ((arg0 + 36) / 44);
        class226 var4 = this.field963;
        synchronized (this.field963) {
            this.field963.method1534(0, arg1);
        }
        field966++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != -27238) {
            method380((byte) -38);
        }
        field970++;
        if (class494.field7297 <= arg0 && arg0 <= class445.field6629 && class494.field7297 <= arg3 && arg3 <= class445.field6629 && arg7 >= class494.field7297 && class445.field6629 >= arg7 && arg6 >= class494.field7297 && arg6 <= class445.field6629 && class37.field393 <= arg9 && class509.field7436 >= arg9 && arg5 >= class37.field393 && class509.field7436 >= arg5 && class37.field393 <= arg8 && arg8 <= class509.field7436 && arg2 >= class37.field393 && class509.field7436 >= arg2) {
            class478.method2848(arg0, (byte) 83, arg2, arg4, arg7, arg5, arg9, arg3, arg6, arg8);
        } else {
            class62.method363(arg2, arg9, arg1 ^ 0xFFFF9599, arg4, arg3, arg5, arg0, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[BI)I")
    public static final int method377(int arg0, byte[] arg1, int arg2) {
        field969++;
        if (arg2 != -1) {
            method377(4, null, -24);
        }
        return class65.method383(0, arg1, 107, arg0);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public final void method378(int arg0) {
        field962++;
        class226 var2 = this.field963;
        synchronized (this.field963) {
            this.field963.method1539(-69);
            if (arg0 != 1) {
                method380((byte) 15);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public final void method379(boolean arg0) {
        if (arg0) {
            this.method378(87);
        }
        class226 var2 = this.field963;
        synchronized (this.field963) {
            this.field963.method1540(0);
        }
        field968++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public static void method380(byte arg0) {
        field961 = null;
        if (arg0 <= 1) {
            method380((byte) 74);
        }
        field972 = null;
        field967 = null;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)Lpm;")
    public final class411 method381(int arg0, int arg1) {
        field971++;
        class226 var3 = this.field963;
        class411 var4;
        synchronized (this.field963) {
            var4 = (class411) this.field963.method1536((long) arg1, arg0 ^ arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field964.method2945(31, arg1, true);
        class411 var6 = new class411();
        if (var5 != null) {
            var6.method2474(true, new class209(var5));
        }
        class226 var7 = this.field963;
        synchronized (this.field963) {
            this.field963.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lai;ILic;)V")
    public class64(class423 arg0, int arg1, class491 arg2) {
        this.field964 = arg2;
        this.field964.method2942(false, 31);
    }
}
