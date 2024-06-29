import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class725 extends class224 {

    @OriginalMember(owner = "client!sha", name = "A", descriptor = "I")
    public int field10141 = -1;

    @OriginalMember(owner = "client!sha", name = "G", descriptor = "I")
    public int field10147 = -1;

    @OriginalMember(owner = "client!sha", name = "P", descriptor = "I")
    public int field10155 = 12800;

    @OriginalMember(owner = "client!sha", name = "M", descriptor = "Z")
    public boolean field10153 = true;

    @OriginalMember(owner = "client!sha", name = "N", descriptor = "I")
    public int field10154 = 0;

    @OriginalMember(owner = "client!sha", name = "I", descriptor = "I")
    public int field10149 = 0;

    @OriginalMember(owner = "client!sha", name = "R", descriptor = "I")
    public int field10157 = 12800;

    @OriginalMember(owner = "client!sha", name = "H", descriptor = "Ljava/lang/String;")
    public String field10148;

    @OriginalMember(owner = "client!sha", name = "z", descriptor = "I")
    public int field10140;

    @OriginalMember(owner = "client!sha", name = "C", descriptor = "I")
    public int field10143;

    @OriginalMember(owner = "client!sha", name = "J", descriptor = "Ljava/lang/String;")
    public String field10150;

    @OriginalMember(owner = "client!sha", name = "K", descriptor = "Lnt;")
    public class220 field10151;

    @OriginalMember(owner = "client!sha", name = "B", descriptor = "[Lva;")
    public static class494[] field10142 = new class494[16];

    @OriginalMember(owner = "client!sha", name = "E", descriptor = "Z")
    public static boolean field10145 = false;

    @OriginalMember(owner = "client!sha", name = "x", descriptor = "I")
    public static int field10138;

    @OriginalMember(owner = "client!sha", name = "y", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!sha", name = "D", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!sha", name = "F", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!sha", name = "L", descriptor = "I")
    public static int field10152;

    @OriginalMember(owner = "client!sha", name = "Q", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBI)Z")
    public final boolean method4032(int arg0, byte arg1, int arg2) {
        field10156++;
        for (class620 var4 = (class620) this.field10151.method1522(true); var4 != null; var4 = (class620) this.field10151.method1527((byte) 54)) {
            if (var4.method3585(127, arg2, arg0)) {
                return true;
            }
        }
        if (arg1 <= 1) {
            this.field10147 = -23;
        }
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(B[III)Z")
    public final boolean method4033(byte arg0, int[] arg1, int arg2, int arg3) {
        field10139++;
        if (arg0 != 53) {
            return false;
        }
        for (class620 var5 = (class620) this.field10151.method1522(true); var5 != null; var5 = (class620) this.field10151.method1527((byte) 121)) {
            if (var5.method3585(117, arg3, arg2)) {
                var5.method3584(arg3, arg2, (byte) -105, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method4034(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field10142 = null;
        }
        field10138++;
        return class500.method3004(106, arg0, arg1) & class264.method1782(58, arg1, arg0);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
    public static void method4035(int arg0) {
        field10142 = null;
        if (arg0 != -4743) {
            method4035(-24);
        }
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(II[II)Z")
    public final boolean method4036(int arg0, int arg1, int[] arg2, int arg3) {
        field10144++;
        for (class620 var5 = (class620) this.field10151.method1522(true); var5 != null; var5 = (class620) this.field10151.method1527((byte) 53)) {
            if (var5.method3582(21, arg0, arg3)) {
                var5.method3583(arg0, arg2, 81, arg3);
                return true;
            }
        }
        if (arg1 >= -95) {
            field10145 = true;
        }
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(III[II)Z")
    public final boolean method4037(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field10152++;
        class620 var6 = (class620) this.field10151.method1522(true);
        if (arg2 != 12800) {
            this.field10147 = 4;
        }
        while (var6 != null) {
            if (var6.method3586(-121, arg0, arg4, arg1)) {
                var6.method3584(arg4, arg0, (byte) -99, arg3);
                return true;
            }
            var6 = (class620) this.field10151.method1527((byte) 75);
        }
        return false;
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(B)V")
    public final void method4038(byte arg0) {
        this.field10149 = 0;
        this.field10155 = 12800;
        this.field10154 = 0;
        this.field10157 = 12800;
        field10146++;
        int var2 = 22 % ((arg0 - 23) / 54);
        for (class620 var3 = (class620) this.field10151.method1522(true); var3 != null; var3 = (class620) this.field10151.method1527((byte) 98)) {
            if (var3.field8944 < this.field10155) {
                this.field10155 = var3.field8944;
            }
            if (var3.field8955 < this.field10157) {
                this.field10157 = var3.field8955;
            }
            if (var3.field8948 > this.field10154) {
                this.field10154 = var3.field8948;
            }
            if (var3.field8941 > this.field10149) {
                this.field10149 = var3.field8941;
            }
        }
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class725(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field10148 = arg1;
        this.field10140 = arg3;
        this.field10147 = arg6;
        this.field10143 = arg0;
        this.field10150 = arg2;
        this.field10141 = arg4;
        this.field10153 = arg5;
        if (this.field10147 == 255) {
            this.field10147 = 0;
        }
        this.field10151 = new class220();
    }
}
