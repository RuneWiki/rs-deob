import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class177 extends class271 {

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public int field2971 = 12800;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "Z")
    public boolean field2973 = true;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public int field2970 = -1;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public int field2981 = 0;

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
    public int field2988 = 12800;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public int field2976 = 0;

    @OriginalMember(owner = "client!ka", name = "W", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Lwa;")
    public class75 field2987;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Lwa;")
    public class75 field2974;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Lmc;")
    public class170 field2983;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field2975 = 0;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "Lwa;")
    public static class75 field2986 = class66.method560("Gegenstand f-Ur Mitglieder", false);

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field2985 = 0;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lwa;")
    public static class75 field2984 = class66.method560("::clientdrop", false);

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ka", name = "X", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "[I")
    public static int[] field2972;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "[Lcm;")
    public static class181[] field2979;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lwa;Lwa;IIIZ)V", line = 195)
    public class177(class75 arg0, class75 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field2990 = arg2;
        this.field2987 = arg1;
        this.field2980 = arg3;
        this.field2973 = arg5;
        this.field2974 = arg0;
        this.field2970 = arg4;
        this.field2983 = new class170();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 29)
    public static void method1303(byte arg0) {
        field2986 = null;
        field2984 = null;
        field2979 = null;
        if (arg0 != -106) {
            field2986 = (class75) null;
        }
        field2972 = null;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)Z", line = 46)
    public final boolean method1304(int arg0, int arg1, int arg2) {
        field2978++;
        if (this.field2988 > arg0 || arg0 > this.field2976 || this.field2971 > arg2 || arg2 > this.field2981) {
            return false;
        } else if (arg1 == 27833) {
            for (class304 var4 = (class304) this.field2983.method1250(true); var4 != null; var4 = (class304) this.field2983.method1256((byte) -125)) {
                if (var4.method2093(-119, arg2, arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lwa;B)Lka;", line = 92)
    public static final class177 method1305(class75 arg0, byte arg1) {
        field2982++;
        if (arg1 < 28) {
            field2975 = -94;
        }
        for (class177 var2 = (class177) class139.field2418.method1250(true); var2 != null; var2 = (class177) class139.field2418.method1256((byte) -123)) {
            if (var2.field2974.method660(arg0, -127)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIIB)V", line = 124)
    public static final void method1306(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2989++;
        if (arg4 != -106) {
            method1303((byte) -34);
        }
        for (int var5 = 0; var5 < class273.field4720; var5++) {
            if (class217.field3716[var5] + class120.field2024[var5] > arg2 && class217.field3716[var5] < arg2 + arg1 && arg0 < (class172.field2909[var5] + class157.field2698[var5]) && (arg0 + arg3) > class157.field2698[var5]) {
                class226.field3815[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V", line = 148)
    public final void method1307(int arg0) {
        this.field2988 = 12800;
        if (arg0 != 23742) {
            field2985 = -40;
        }
        this.field2976 = 0;
        this.field2981 = 0;
        this.field2971 = 12800;
        for (class304 var2 = (class304) this.field2983.method1250(true); var2 != null; var2 = (class304) this.field2983.method1256((byte) -127)) {
            if (this.field2981 < var2.field5205) {
                this.field2981 = var2.field5205;
            }
            if (var2.field5202 < this.field2988) {
                this.field2988 = var2.field5202;
            }
            if (this.field2976 < var2.field5196) {
                this.field2976 = var2.field5196;
            }
            if (this.field2971 > var2.field5206) {
                this.field2971 = var2.field5206;
            }
        }
        field2991++;
    }
}
