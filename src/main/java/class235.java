import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class235 extends class29 {

    @OriginalMember(owner = "client!ue", name = "A", descriptor = "I")
    public int field3865 = 12800;

    @OriginalMember(owner = "client!ue", name = "D", descriptor = "I")
    public int field3868 = 0;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public int field3872 = 0;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "Z")
    public boolean field3876 = true;

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "I")
    public int field3869 = 12800;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "I")
    public int field3878 = -1;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Lph;")
    public class229 field3874;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public int field3867;

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "I")
    public int field3881;

    @OriginalMember(owner = "client!ue", name = "F", descriptor = "Lph;")
    public class229 field3870;

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Lo;")
    public class227 field3879;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "Lvm;")
    public static class202 field3882 = new class202(64);

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "F")
    public static float field3875;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "I")
    public static int field3866;

    @OriginalMember(owner = "client!ue", name = "I", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!ue", name = "M", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "[I")
    public static int[] field3871;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V", line = 4)
    public final void method1663(boolean arg0) {
        this.field3868 = 0;
        this.field3869 = 12800;
        this.field3865 = 12800;
        field3877++;
        this.field3872 = 0;
        for (class74 var2 = (class74) this.field3879.method1580((byte) -39); var2 != null; var2 = (class74) this.field3879.method1579((byte) 28)) {
            if (this.field3869 > var2.field1255) {
                this.field3869 = var2.field1255;
            }
            if (var2.field1253 > this.field3872) {
                this.field3872 = var2.field1253;
            }
            if (this.field3865 > var2.field1244) {
                this.field3865 = var2.field1244;
            }
            if (var2.field1248 > this.field3868) {
                this.field3868 = var2.field1248;
            }
        }
        if (arg0) {
            method1665(false);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)Z", line = 39)
    public final boolean method1664(byte arg0, int arg1, int arg2) {
        field3873++;
        if (this.field3865 > arg1 || arg1 > this.field3872 || arg2 < this.field3869 || arg2 > this.field3868) {
            return false;
        }
        for (class74 var4 = (class74) this.field3879.method1580((byte) -39); var4 != null; var4 = (class74) this.field3879.method1579((byte) 28)) {
            if (var4.method570((byte) 72, arg1, arg2)) {
                return true;
            }
        }
        if (arg0 == -50) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lph;Lph;IIIZ)V", line = 149)
    public class235(class229 arg0, class229 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3874 = arg0;
        this.field3867 = arg3;
        this.field3881 = arg2;
        this.field3878 = arg4;
        this.field3870 = arg1;
        this.field3876 = arg5;
        this.field3879 = new class227();
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(Z)V", line = 101)
    public static void method1665(boolean arg0) {
        field3882 = null;
        if (arg0) {
            field3875 = 1.197639F;
        }
        field3871 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(BII)V", line = 114)
    public static final void method1666(byte arg0, int arg1, int arg2) {
        field3880++;
        class281 var3 = class135.method957(0, arg2, 6);
        var3.method1932(0);
        int var4 = 1 / ((5 - arg0) / 34);
        var3.field4660 = arg1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Lne;", line = 139)
    public static final class88 method1667(int arg0, int arg1, int arg2) {
        class72 var3 = class225.field3705[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1214;
    }
}
