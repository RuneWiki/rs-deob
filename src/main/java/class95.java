import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class95 extends class199 {

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "Z")
    public static boolean field1242 = false;

    @OriginalMember(owner = "client!fa", name = "cb", descriptor = "[I")
    public static int[] field1243 = new int[500];

    @OriginalMember(owner = "client!fa", name = "db", descriptor = "I")
    public static int field1244 = -1;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "Lll;")
    public static class54 field1233 = new class54();

    @OriginalMember(owner = "client!fa", name = "eb", descriptor = "I")
    public static int field1245 = 0;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "I")
    public static int field1241;

    @OriginalMember(owner = "client!fa", name = "fb", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIII)V", line = 10)
    public static final void method687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 != 0) {
            field1233 = (class54) null;
        }
        int var7 = arg5 + arg6;
        field1236++;
        int var8 = arg3 - arg5;
        int var9 = arg2 + arg5;
        for (int var10 = arg6; var10 < var7; var10++) {
            class96.method697((byte) 115, class331.field4902[var10], arg1, arg2, arg4);
        }
        for (int var11 = arg3; var11 > var8; var11--) {
            class96.method697((byte) 115, class331.field4902[var11], arg1, arg2, arg4);
        }
        int var12 = arg4 - arg5;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class331.field4902[var13];
            class96.method697((byte) 115, var14, arg1, arg2, var9);
            class96.method697((byte) 115, var14, arg1, var12, arg4);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 55)
    public static final int method688(String arg0, int arg1) {
        field1234++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class45.field559; var2++) {
            if (arg0.equalsIgnoreCase(class65.field814[var2])) {
                return var2;
            }
        }
        int var3 = -88 / ((-arg1 - 21) / 42);
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 80)
    public class95() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)[I", line = 84)
    public final int[] method190(int arg0, int arg1) {
        if (arg0 != -1735) {
            return (int[]) null;
        }
        field1239++;
        int[] var3 = this.field2802.method2502(arg1, -96);
        if (this.field2802.field5637) {
            class87.method630(var3, 0, field1235, class274.field3919[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IZLgb;ZLgb;IZ)I", line = 106)
    public static final int method689(int arg0, boolean arg1, class196 arg2, boolean arg3, class196 arg4, int arg5, boolean arg6) {
        field1237++;
        if (!arg6) {
            field1245 = 93;
        }
        int var7 = class172.method1270(-17691, arg2, arg0, arg4, arg1);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class172.method1270(-17691, arg2, arg5, arg4, arg3);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "(B)V", line = 141)
    public static final void method690(byte arg0) {
        class104.field1351.method2262(false);
        if (arg0 != 59) {
            method691(false);
        }
        class231.field3307.method2262(false);
        field1240++;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 158)
    public static void method691(boolean arg0) {
        field1243 = null;
        field1233 = null;
        if (arg0) {
            method690((byte) -11);
        }
    }
}
