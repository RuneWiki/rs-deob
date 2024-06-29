import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class157 extends class12 {

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "[I")
    private int[] field3112 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "Z")
    public boolean field3111 = false;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public int field3106 = -1;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "[I")
    public static int[] field3110 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "Z")
    public static boolean field3105 = false;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "Lkb;")
    private static class93 field3116 = class76.method390("go back to the main RuneScape webpage", 0);

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "Lkb;")
    private static class93 field3119 = class76.method390("Sorry invited players only)3", 0);

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "Lkb;")
    public static class93 field3108 = field3116;

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Lkb;")
    public static class93 field3129 = class76.method390("und Ihr Passwort ein)3", 0);

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "Lkb;")
    public static class93 field3124 = field3119;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public static int field3114;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Lug;")
    public static class188 field3113;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "Leh;")
    public static class47 field3130;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "[S")
    private short[] field3107;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "[S")
    private short[] field3118;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "[S")
    private short[] field3120;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "[S")
    private short[] field3125;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)Loe;")
    public final class132 method1022(int arg0) {
        field3123++;
        if (this.field3127 == null) {
            return null;
        }
        class132[] var2 = new class132[this.field3127.length];
        int var3 = 0;
        if (arg0 > -127) {
            return null;
        }
        while (this.field3127.length > var3) {
            var2[var3] = class132.method780(class65.field1095, this.field3127[var3], 0);
            var3++;
        }
        class132 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class132(var2, var2.length);
        }
        if (this.field3125 != null) {
            for (int var5 = 0; var5 < this.field3125.length; var5++) {
                var4.method790(this.field3125[var5], this.field3118[var5]);
            }
        }
        if (this.field3107 != null) {
            for (int var6 = 0; var6 < this.field3107.length; var6++) {
                var4.method769(this.field3107[var6], this.field3120[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)Z")
    public final boolean method1023(boolean arg0) {
        boolean var2 = arg0;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3112[var3] != -1 && !class65.field1095.method455(0, this.field3112[var3], -19312)) {
                var2 = false;
            }
        }
        field3128++;
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lkb;ZI)V")
    public static final void method1024(class93 arg0, boolean arg1, int arg2) {
        field3121++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class26.field410.method1003(arg0, arg2);
        int var7 = class26.field410.method1020(arg0, 250) * 13;
        class118.method651(var5 - var3, -var3 + var4, var6 + var3 + var3, var7 - -var3 + var3, 0);
        class118.method669(var5 - var3, -var3 + var4, var3 + var6 + var3, var7 - (-var3 - var3), 16777215);
        class26.field410.method1011(arg0, var5, var4, var6, var7, 16777215, -1, 1, 1, 0);
        class77.method392(var5 - var3, -var3 + var4, var3 + var7 + var3, var6 - -var3 + var3, arg2 - 250);
        if (!arg1) {
            class143.method896(var4, var6, var5, 0, var7);
            return;
        }
        try {
            Graphics var8 = class115.field2147.getGraphics();
            field3113.method89(0, (byte) -16, var8, 0);
        } catch (Exception var9) {
            class115.field2147.repaint();
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(B)Z")
    public final boolean method1025(byte arg0) {
        field3102++;
        if (this.field3127 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 0;
        int var4 = -53 % ((arg0 + 8) / 39);
        while (this.field3127.length > var3) {
            if (!class65.field1095.method455(0, this.field3127[var3], -19312)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(JI)V")
    public static final void method1026(long arg0, int arg1) {
        field3122++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class62.field991; var3++) {
            if (class151.field2910[var3] == arg0) {
                class203.field3925++;
                class62.field991--;
                for (int var4 = var3; var4 < class62.field991; var4++) {
                    class179.field3549[var4] = class179.field3549[var4 + 1];
                    class114.field2119[var4] = class114.field2119[var4 + 1];
                    class151.field2910[var4] = class151.field2910[var4 + 1];
                    class205.field3973[var4] = class205.field3973[var4 + 1];
                }
                class16.field287 = class203.field3928;
                class151.field2908.method47(208, 8);
                class151.field2908.method1064(arg0, -1);
                break;
            }
        }
        int var5 = -10 / ((arg1 + 19) / 49);
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)Loe;")
    public final class132 method1027(byte arg0) {
        field3126++;
        int var2 = -102 / ((57 - arg0) / 33);
        class132[] var3 = new class132[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field3112[var5] != -1) {
                var3[var4++] = class132.method780(class65.field1095, this.field3112[var5], 0);
            }
        }
        class132 var6 = new class132(var3, var4);
        if (this.field3125 != null) {
            for (int var7 = 0; var7 < this.field3125.length; var7++) {
                var6.method790(this.field3125[var7], this.field3118[var7]);
            }
        }
        if (this.field3107 != null) {
            for (int var8 = 0; var8 < this.field3107.length; var8++) {
                var6.method769(this.field3107[var8], this.field3120[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILrd;)V")
    public final void method1028(int arg0, class158 arg1) {
        field3115++;
        if (arg0 != 0) {
            field3113 = null;
        }
        while (true) {
            int var3 = arg1.method1054(128);
            if (var3 == 0) {
                return;
            }
            this.method1029(arg0 + 40, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILrd;I)V")
    private final void method1029(int arg0, class158 arg1, int arg2) {
        field3104++;
        if (arg2 == 1) {
            this.field3106 = arg1.method1054(128);
        } else if (arg2 == 2) {
            int var8 = arg1.method1054(arg0 ^ 0xA8);
            this.field3127 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3127[var9] = arg1.method1071(28101);
            }
        } else if (arg2 == 3) {
            this.field3111 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1054(128);
            this.field3125 = new short[var6];
            this.field3118 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3125[var7] = (short) arg1.method1071(arg0 + 28061);
                this.field3118[var7] = (short) arg1.method1071(arg0 + 28061);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1054(arg0 ^ 0xA8);
            this.field3120 = new short[var4];
            this.field3107 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3107[var5] = (short) arg1.method1071(arg0 + 28061);
                this.field3120[var5] = (short) arg1.method1071(28101);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3112[arg2 - 60] = arg1.method1071(28101);
        }
        if (arg0 != 40) {
            field3129 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method1030(Component arg0, byte arg1) {
        if (arg1 != -79) {
            method1030(null, (byte) -123);
        }
        field3117++;
        arg0.removeMouseListener(class177.field3509);
        arg0.removeMouseMotionListener(class177.field3509);
        arg0.removeFocusListener(class177.field3509);
        class65.field1104 = 0;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V")
    public static void method1031(boolean arg0) {
        field3108 = null;
        field3110 = null;
        field3113 = null;
        field3129 = null;
        field3119 = null;
        if (!arg0) {
            field3108 = null;
        }
        field3124 = null;
        field3116 = null;
        field3130 = null;
    }
}
