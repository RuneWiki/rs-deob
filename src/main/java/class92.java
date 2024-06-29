import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class92 extends class623 {

    @OriginalMember(owner = "client!dba", name = "v", descriptor = "I")
    public int field946 = -1;

    @OriginalMember(owner = "client!dba", name = "F", descriptor = "I")
    public int field956 = -1;

    @OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
    public int field953 = 12800;

    @OriginalMember(owner = "client!dba", name = "O", descriptor = "I")
    public int field963 = 0;

    @OriginalMember(owner = "client!dba", name = "z", descriptor = "I")
    public int field950 = 0;

    @OriginalMember(owner = "client!dba", name = "M", descriptor = "I")
    public int field961 = 12800;

    @OriginalMember(owner = "client!dba", name = "Q", descriptor = "Z")
    public boolean field965 = true;

    @OriginalMember(owner = "client!dba", name = "P", descriptor = "Ljava/lang/String;")
    public String field964;

    @OriginalMember(owner = "client!dba", name = "N", descriptor = "Ljava/lang/String;")
    public String field962;

    @OriginalMember(owner = "client!dba", name = "y", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!dba", name = "G", descriptor = "I")
    public int field957;

    @OriginalMember(owner = "client!dba", name = "A", descriptor = "Lbq;")
    public class289 field951;

    @OriginalMember(owner = "client!dba", name = "x", descriptor = "Lso;")
    public static class468 field948 = new class468(8, 8);

    @OriginalMember(owner = "client!dba", name = "H", descriptor = "I")
    public static int field958 = 0;

    @OriginalMember(owner = "client!dba", name = "K", descriptor = "D")
    public static double field960;

    @OriginalMember(owner = "client!dba", name = "w", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!dba", name = "B", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!dba", name = "D", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!dba", name = "E", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!dba", name = "R", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!dba", name = "S", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!dba", name = "I", descriptor = "Lrj;")
    public static class593 field959;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I[IIZ)Z")
    public final boolean method620(int arg0, int[] arg1, int arg2, boolean arg3) {
        field955++;
        if (!arg3) {
            field948 = null;
        }
        for (class566 var5 = (class566) this.field951.method1719(65280); var5 != null; var5 = (class566) this.field951.method1723(-20665)) {
            if (var5.method3291((byte) -30, arg0, arg2)) {
                var5.method3290(arg2, arg1, arg0, 2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(B)V")
    public final void method621(byte arg0) {
        this.field963 = 0;
        if (arg0 != -46) {
            method625((byte) -67);
        }
        this.field953 = 12800;
        this.field950 = 0;
        this.field961 = 12800;
        field947++;
        for (class566 var2 = (class566) this.field951.method1719(65280); var2 != null; var2 = (class566) this.field951.method1723(-20665)) {
            if (var2.field8056 < this.field953) {
                this.field953 = var2.field8056;
            }
            if (this.field963 < var2.field8051) {
                this.field963 = var2.field8051;
            }
            if (this.field961 > var2.field8043) {
                this.field961 = var2.field8043;
            }
            if (var2.field8054 > this.field950) {
                this.field950 = var2.field8054;
            }
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB)Z")
    public final boolean method622(int arg0, int arg1, byte arg2) {
        field952++;
        class566 var4 = (class566) this.field951.method1719(65280);
        if (arg2 != 38) {
            return false;
        }
        while (var4 != null) {
            if (var4.method3293(arg0, (byte) 15, arg1)) {
                return true;
            }
            var4 = (class566) this.field951.method1723(-20665);
        }
        return false;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIB[I)Z")
    public final boolean method623(int arg0, int arg1, byte arg2, int[] arg3) {
        field954++;
        class566 var5 = (class566) this.field951.method1719(65280);
        if (arg2 != -66) {
            this.method622(-90, 8, (byte) 22);
        }
        while (var5 != null) {
            if (var5.method3293(arg0, (byte) -79, arg1)) {
                var5.method3292(arg1, 2, arg0, arg3);
                return true;
            }
            var5 = (class566) this.field951.method1723(-20665);
        }
        return false;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method624(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field967++;
        if (arg1 != 8) {
            this.field957 = 109;
        }
        for (class566 var6 = (class566) this.field951.method1719(65280); var6 != null; var6 = (class566) this.field951.method1723(-20665)) {
            if (var6.method3294((byte) -110, arg3, arg0, arg2)) {
                var6.method3292(arg2, 2, arg3, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "(B)V")
    public static void method625(byte arg0) {
        field948 = null;
        int var1 = -22 % ((-arg0 - 4) / 44);
        field959 = null;
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class92(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field964 = arg2;
        this.field965 = arg5;
        this.field962 = arg1;
        this.field949 = arg3;
        this.field946 = arg6;
        this.field956 = arg4;
        this.field957 = arg0;
        if (this.field946 == 255) {
            this.field946 = 0;
        }
        this.field951 = new class289();
    }
}
