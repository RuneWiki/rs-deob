import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class157 extends class113 {

    @OriginalMember(owner = "client!re", name = "F", descriptor = "Z")
    public boolean field3129 = false;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "I")
    public int field3143 = -1;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "[I")
    private int[] field3156 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Lcd;")
    public static class23 field3138 = class54.method414("runes", -1);

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public static volatile int field3137 = 0;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lcd;")
    public static class23 field3134 = class54.method414("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", -1);

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
    public static boolean field3141 = false;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "Lcd;")
    public static class23 field3148 = class54.method414(": ", -1);

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public static int field3145 = 0;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "Lcd;")
    private static class23 field3155 = class54.method414("Please try using a different world)3", -1);

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lcd;")
    public static class23 field3139 = field3155;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lcd;")
    public static class23 field3149 = class54.method414("VOLL", -1);

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Lcd;")
    public static class23 field3150 = field3155;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "Lcd;")
    public static class23 field3144 = field3155;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "Lcd;")
    public static class23 field3147 = field3155;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "Lcd;")
    public static class23 field3158 = field3155;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "Lcd;")
    private static class23 field3152 = class54.method414("You are standing in a members)2only area)3", -1);

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lcd;")
    public static class23 field3146 = field3152;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "Lcd;")
    public static class23 field3127 = field3155;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "Lmd;")
    public static class111 field3131;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "[I")
    private int[] field3154;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "[S")
    private short[] field3135;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "[S")
    private short[] field3136;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "[S")
    private short[] field3151;

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "[S")
    private short[] field3157;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILva;I)V")
    private final void method961(int arg0, class189 arg1, int arg2) {
        field3128++;
        if (arg0 < 88) {
            method965((byte) -8, -7);
        }
        if (arg2 == 1) {
            this.field3143 = arg1.method1202(-73);
        } else if (arg2 == 2) {
            int var8 = arg1.method1202(119);
            this.field3154 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3154[var9] = arg1.method1197(-1);
            }
        } else if (arg2 == 3) {
            this.field3129 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1202(107);
            this.field3151 = new short[var6];
            this.field3157 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3151[var7] = (short) arg1.method1197(-1);
                this.field3157[var7] = (short) arg1.method1197(-1);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1202(109);
            this.field3136 = new short[var4];
            this.field3135 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3136[var5] = (short) arg1.method1197(-1);
                this.field3135[var5] = (short) arg1.method1197(-1);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3156[arg2 - 60] = arg1.method1197(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)Lv;")
    public final class188 method962(byte arg0) {
        if (arg0 <= 120) {
            return null;
        }
        field3142++;
        if (this.field3154 == null) {
            return null;
        }
        class188[] var2 = new class188[this.field3154.length];
        for (int var3 = 0; var3 < this.field3154.length; var3++) {
            var2[var3] = class188.method1158(class114.field2393, this.field3154[var3], 0);
        }
        class188 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class188(var2, var2.length);
        }
        if (this.field3151 != null) {
            for (int var5 = 0; var5 < this.field3151.length; var5++) {
                var4.method1173(this.field3151[var5], this.field3157[var5]);
            }
        }
        if (this.field3136 != null) {
            for (int var6 = 0; var6 < this.field3136.length; var6++) {
                var4.method1174(this.field3136[var6], this.field3135[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)Z")
    public final boolean method963(int arg0) {
        field3126++;
        if (this.field3154 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3154.length; var3++) {
            if (!class114.field2393.method639(this.field3154[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lva;I)V")
    public final void method964(class189 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1202(127);
            if (var3 == 0) {
                field3153++;
                if (arg1 != -18413) {
                    this.method967(false);
                    return;
                }
                return;
            }
            this.method961(104, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(BI)V")
    public static final void method965(byte arg0, int arg1) {
        field3130++;
        if (arg0 != 93) {
            return;
        }
        for (class56 var2 = (class56) class205.field4032.method264(arg0 + 28); var2 != null; var2 = (class56) class205.field4032.method259(-9)) {
            if ((var2.field3317 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method1018(15789);
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(BI)Z")
    public static final boolean method966(byte arg0, int arg1) {
        field3132++;
        if (arg0 <= 29) {
            field3134 = null;
        }
        if (arg1 < 0) {
            return false;
        }
        int var2 = class103.field2201[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1006;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(Z)Lv;")
    public final class188 method967(boolean arg0) {
        field3140++;
        if (!arg0) {
            return null;
        }
        int var2 = 0;
        class188[] var3 = new class188[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3156[var4] != -1) {
                var3[var2++] = class188.method1158(class114.field2393, this.field3156[var4], 0);
            }
        }
        class188 var5 = new class188(var3, var2);
        if (this.field3151 != null) {
            for (int var6 = 0; var6 < this.field3151.length; var6++) {
                var5.method1173(this.field3151[var6], this.field3157[var6]);
            }
        }
        if (this.field3136 != null) {
            for (int var7 = 0; var7 < this.field3136.length; var7++) {
                var5.method1174(this.field3136[var7], this.field3135[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public static void method968(byte arg0) {
        field3147 = null;
        if (arg0 != 14) {
            method968((byte) 29);
        }
        field3158 = null;
        field3127 = null;
        field3152 = null;
        field3139 = null;
        field3150 = null;
        field3138 = null;
        field3131 = null;
        field3148 = null;
        field3155 = null;
        field3134 = null;
        field3149 = null;
        field3144 = null;
        field3146 = null;
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)Z")
    public final boolean method969(int arg0) {
        field3133++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field3156[var3] != -1 && !class114.field2393.method639(this.field3156[var3], 0, 0)) {
                var2 = false;
            }
        }
        return var2;
    }
}
