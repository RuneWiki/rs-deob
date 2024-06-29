import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class87 {

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field1159 = -1;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public int field1161 = -1;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Z")
    public static boolean field1157 = false;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1160 = 0;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lxa;")
    public static class511 field1156;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[I")
    public int[] field1155;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[Lxa;")
    public static class511[] field1153;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILfd;)V", line = 3)
    private final void method653(int arg0, int arg1, class418 arg2) {
        if (arg0 == 1) {
            this.field1159 = arg2.method2393(-30727);
        } else if (arg0 == 2) {
            this.field1155 = new int[arg2.method2396(123)];
            for (int var4 = 0; var4 < this.field1155.length; var4++) {
                this.field1155[var4] = arg2.method2393(-30727);
            }
        } else if (arg0 == 3) {
            this.field1161 = arg2.method2396(105);
        }
        int var5 = -85 % ((arg1 - 55) / 60);
        field1158++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lfd;I)V", line = 36)
    public final void method654(class418 arg0, int arg1) {
        field1154++;
        while (true) {
            int var3 = arg0.method2396(101);
            if (var3 == 0) {
                int var4 = 37 % ((28 - arg1) / 48);
                return;
            }
            this.method653(var3, -111, arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 60)
    public static final void method655(int arg0) {
        class287.field3710.method3656((byte) 0);
        field1152++;
        class152.field1941.method3656((byte) 0);
        class202.field2628.method3656((byte) 0);
        if (arg0 < 46) {
            field1157 = false;
        }
        class559.field7285.method3656((byte) 0);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 74)
    public static void method656(int arg0) {
        if (arg0 != -1) {
            method657(99, -88, true, -121);
        }
        field1156 = null;
        field1153 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIZI)I", line = 105)
    public static final int method657(int arg0, int arg1, boolean arg2, int arg3) {
        field1162++;
        class263 var4 = class265.method1643(false, arg2, arg0);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= ~arg1 && var4.field3523.length > arg1) {
            return var4.field3523[arg1];
        } else {
            return -1;
        }
    }
}
