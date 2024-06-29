import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class269 {

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field4268;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public int field4265;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public int field4266;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "Lba;")
    public class172 field4269;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4258 = 0;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field4262 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "[Lff;")
    public static class19[] field4264;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1821(int arg0) {
        field4264 = null;
        if (arg0 != 1) {
            method1823('\u001a', (byte) -2, (String) null);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIII)V")
    public static final void method1822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4259++;
        if (arg3 != 0) {
            method1821(35);
        }
        if (arg4 > class278.field4410 || arg1 < class112.field1727) {
            return;
        }
        boolean var6;
        if (arg0 < class184.field2914) {
            arg0 = class184.field2914;
            var6 = false;
        } else if (class2.field42 < arg0) {
            var6 = false;
            arg0 = class2.field42;
        } else {
            var6 = true;
        }
        boolean var7;
        if (class184.field2914 > arg5) {
            arg5 = class184.field2914;
            var7 = false;
        } else if (class2.field42 < arg5) {
            var7 = false;
            arg5 = class2.field42;
        } else {
            var7 = true;
        }
        if (arg4 >= class112.field1727) {
            class173.method1240((byte) -87, arg5, class55.field872[arg4++], arg2, arg0);
        } else {
            arg4 = class112.field1727;
        }
        if (arg1 <= class278.field4410) {
            class173.method1240((byte) -50, arg5, class55.field872[arg1--], arg2, arg0);
        } else {
            arg1 = class278.field4410;
        }
        if (var6 && var7) {
            for (int var8 = arg4; var8 <= arg1; var8++) {
                int[] var9 = class55.field872[var8];
                var9[arg0] = var9[arg5] = arg2;
            }
        } else if (var6) {
            for (int var11 = arg4; var11 <= arg1; var11++) {
                class55.field872[var11][arg0] = arg2;
            }
        } else if (var7) {
            for (int var10 = arg4; var10 <= arg1; var10++) {
                class55.field872[var10][arg5] = arg2;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1823(char arg0, byte arg1, String arg2) {
        field4263++;
        int var3 = class304.method2039(arg2, 0, arg0);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        int var7 = 114 % ((35 - arg1) / 40);
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var5; arg2.charAt(var9) != arg0; var9++) {
            }
            var4[var6++] = arg2.substring(var5, var9);
            var5 = var9 + 1;
        }
        var4[var3] = arg2.substring(var5);
        return var4;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1824(String arg0, byte arg1) {
        field4260++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class40.field677; var2++) {
            if (arg0.equalsIgnoreCase(class226.field3627[var2])) {
                return true;
            }
        }
        if (arg1 != -14) {
            field4261 = -71;
        }
        return false;
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(IIII)V")
    public class269(int arg0, int arg1, int arg2, int arg3) {
        class172 var5 = class143.method1040(arg0, 5154);
        this.field4268 = arg1;
        this.field4265 = arg3;
        this.field4266 = arg2;
        if (var5.field2608 == -1) {
            this.field4269 = var5;
        } else {
            this.field4269 = class143.method1040(var5.field2608, 5154);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lba;III)V")
    public class269(class172 arg0, int arg1, int arg2, int arg3) {
        this.field4269 = arg0;
        this.field4266 = arg2;
        this.field4265 = arg3;
        this.field4268 = arg1;
    }
}
