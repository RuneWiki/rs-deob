import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class164 extends class28 {

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public int field2955 = -1;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "[I")
    private int[] field2954 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Z")
    public boolean field2956 = false;

    @OriginalMember(owner = "client!pa", name = "O", descriptor = "Lqe;")
    public static class179 field2971 = class206.method1380("Zu viele Verbindungen von Ihrer Adresse)3", (byte) -126);

    @OriginalMember(owner = "client!pa", name = "L", descriptor = "Lqe;")
    public static class179 field2968 = class206.method1380(" )2> <col=00ffff>", (byte) 32);

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field2964 = 1;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Lqe;")
    private static class179 field2961 = class206.method1380("M", (byte) 21);

    @OriginalMember(owner = "client!pa", name = "Q", descriptor = "Lqe;")
    public static class179 field2973 = field2961;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "Lqe;")
    public static class179 field2965 = field2961;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!pa", name = "K", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!pa", name = "P", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!pa", name = "R", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!pa", name = "T", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!pa", name = "M", descriptor = "[I")
    private int[] field2969;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "[S")
    private short[] field2957;

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "[S")
    private short[] field2966;

    @OriginalMember(owner = "client!pa", name = "N", descriptor = "[S")
    private short[] field2970;

    @OriginalMember(owner = "client!pa", name = "S", descriptor = "[S")
    private short[] field2975;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static void method1049(int arg0) {
        field2971 = null;
        if (arg0 == -16503) {
            field2973 = null;
            field2961 = null;
            field2968 = null;
            field2965 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Lv;")
    public final class224 method1050(int arg0) {
        class224[] var2 = new class224[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2954[var4] != -1) {
                var2[var3++] = class224.method1458(class28.field616, this.field2954[var4], 0);
            }
        }
        int var5 = 91 % ((arg0 + 41) / 51);
        field2960++;
        class224 var6 = new class224(var2, var3);
        if (this.field2975 != null) {
            for (int var7 = 0; var7 < this.field2975.length; var7++) {
                var6.method1456(this.field2975[var7], this.field2970[var7]);
            }
        }
        if (this.field2966 != null) {
            for (int var8 = 0; var8 < this.field2966.length; var8++) {
                var6.method1468(this.field2966[var8], this.field2957[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
    public static final void method1051(byte arg0, int arg1) {
        field2976++;
        if (!class152.method976(true, arg1)) {
            return;
        }
        class6[] var2 = class199.field3710[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class6 var4 = var2[var3];
            if (var4 != null) {
                var4.field195 = 0;
                var4.field139 = 0;
            }
        }
        if (arg0 != 111) {
            field2971 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(B)Z")
    public final boolean method1052(byte arg0) {
        boolean var2 = true;
        field2962++;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field2954[var3] != -1 && !class28.field616.method360(this.field2954[var3], (byte) -42, 0)) {
                var2 = false;
            }
        }
        if (arg0 == 119) {
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public static final void method1053(int arg0) {
        int var1 = 111 / ((arg0 - 5) / 48);
        field2959++;
        class180.field3307 = false;
        class195.field3624 = false;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLra;I)V")
    private final void method1054(byte arg0, class185 arg1, int arg2) {
        if (arg2 == 1) {
            this.field2955 = arg1.method1243(3);
        } else if (arg2 == 2) {
            int var4 = arg1.method1243(3);
            this.field2969 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2969[var5] = arg1.method1252(2);
            }
        } else if (arg2 == 3) {
            this.field2956 = true;
        } else if (arg2 == 40) {
            int var8 = arg1.method1243(3);
            this.field2975 = new short[var8];
            this.field2970 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2975[var9] = (short) arg1.method1252(class171.method1087(arg0, -14));
                this.field2970[var9] = (short) arg1.method1252(2);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method1243(3);
            this.field2957 = new short[var6];
            this.field2966 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2966[var7] = (short) arg1.method1252(2);
                this.field2957[var7] = (short) arg1.method1252(class171.method1087(arg0, -14));
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field2954[arg2 - 60] = arg1.method1252(2);
        }
        field2963++;
        if (arg0 != -16) {
            method1051((byte) -110, -8);
        }
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(B)Z")
    public final boolean method1055(byte arg0) {
        field2958++;
        if (this.field2969 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field2969.length; var3++) {
            if (!class28.field616.method360(this.field2969[var3], (byte) -42, 0)) {
                var2 = false;
            }
        }
        if (arg0 >= -97) {
            this.field2975 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)Lv;")
    public final class224 method1056(int arg0) {
        field2967++;
        if (this.field2969 == null) {
            return null;
        }
        class224[] var2 = new class224[this.field2969.length];
        for (int var3 = 0; var3 < this.field2969.length; var3++) {
            var2[var3] = class224.method1458(class28.field616, this.field2969[var3], 0);
        }
        class224 var4;
        if (~var2.length == arg0) {
            var4 = var2[0];
        } else {
            var4 = new class224(var2, var2.length);
        }
        if (this.field2975 != null) {
            for (int var5 = 0; var5 < this.field2975.length; var5++) {
                var4.method1456(this.field2975[var5], this.field2970[var5]);
            }
        }
        if (this.field2966 != null) {
            for (int var6 = 0; var6 < this.field2966.length; var6++) {
                var4.method1468(this.field2966[var6], this.field2957[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLra;)V")
    public final void method1057(byte arg0, class185 arg1) {
        field2974++;
        if (arg0 != -60) {
            field2965 = null;
        }
        while (true) {
            int var3 = arg1.method1243(3);
            if (var3 == 0) {
                return;
            }
            this.method1054((byte) -16, arg1, var3);
        }
    }
}
