import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class503 {

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    private int field6999;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "[Las;")
    private class132[] field6997;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Lcba;")
    public static class471 field7003 = new class471(39, 8);

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!nw", name = "l", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "J")
    private long field7001;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "Las;")
    private class132 field7002;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "Lra;")
    public static class91 field6998;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "Z")
    public static boolean field6996;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)Las;")
    public final class132 method2909(int arg0) {
        field7000++;
        if (this.field7002 == null) {
            return null;
        }
        class132 var2 = this.field6997[(int) (this.field7001 & (long) (this.field6999 - 1))];
        while (this.field7002 != var2) {
            if (this.field7002.field2110 == this.field7001) {
                class132 var4 = this.field7002;
                this.field7002 = this.field7002.field2104;
                return var4;
            }
            this.field7002 = this.field7002.field2104;
        }
        this.field7002 = null;
        int var3 = -86 % ((56 - arg0) / 56);
        return null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BI)Z")
    public static final boolean method2910(byte arg0, int arg1) {
        field7006++;
        if (arg0 == -109) {
            return arg1 >= 4 && arg1 <= 8;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(JI)Las;")
    public final class132 method2911(long arg0, int arg1) {
        this.field7001 = arg0;
        field7007++;
        class132 var4 = this.field6997[(int) ((long) (this.field6999 + arg1) & arg0)];
        for (this.field7002 = var4.field2104; this.field7002 != var4; this.field7002 = this.field7002.field2104) {
            if (this.field7002.field2110 == arg0) {
                class132 var5 = this.field7002;
                this.field7002 = this.field7002.field2104;
                return var5;
            }
        }
        this.field7002 = null;
        return null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILas;J)V")
    public final void method2912(int arg0, class132 arg1, long arg2) {
        field7004++;
        if (arg1.field2108 != null) {
            arg1.method896(0);
        }
        if (arg0 >= -94) {
            field7003 = null;
        }
        class132 var5 = this.field6997[(int) (arg2 & (long) (this.field6999 - 1))];
        arg1.field2104 = var5;
        arg1.field2108 = var5.field2108;
        arg1.field2108.field2104 = arg1;
        arg1.field2104.field2108 = arg1;
        arg1.field2110 = arg2;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(I)V")
    public static void method2913(int arg0) {
        if (arg0 >= -21) {
            field7003 = null;
        }
        field6998 = null;
        field7003 = null;
    }

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "(BI)I")
    public static final int method2914(byte arg0, int arg1) {
        field7005++;
        int var2 = -104 / ((65 - arg0) / 42);
        return arg1 & 0x3FF;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(II)I")
    public static final int method2915(int arg0, int arg1) {
        return class473.field6662 == null ? 0 : class473.field6662[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(I)V")
    public class503(int arg0) {
        this.field6999 = arg0;
        this.field6997 = new class132[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class132 var3 = this.field6997[var2] = new class132();
            var3.field2104 = var3;
            var3.field2108 = var3;
        }
    }
}
