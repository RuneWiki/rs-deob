import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class237 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
    public static int[] field3915 = new int[100];

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3921 = "Attack";

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3916 = 7759444;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "J")
    public long field3923;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lgl;")
    public class237 field3914;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lgl;")
    public class237 field3922;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILeh;Lrh;Leh;)V")
    public static final void method1672(int arg0, class137 arg1, class100 arg2, class137 arg3) {
        if (arg0 != 1) {
            field3915 = null;
        }
        class96.field1284 = arg1;
        class32.field428 = arg3;
        field3924++;
        class262.field4238 = arg2;
        if (class96.field1284 != null) {
            class137.field2209 = class96.field1284.method926(arg0 ^ 0x6912, 1);
        }
        if (class32.field428 != null) {
            class292.field4639 = class32.field428.method926(26899, 1);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public final void method1673(int arg0) {
        field3925++;
        if (this.field3922 == null) {
            return;
        }
        if (arg0 != 14510) {
            field3916 = 98;
        }
        this.field3922.field3914 = this.field3914;
        this.field3914.field3922 = this.field3922;
        this.field3914 = null;
        this.field3922 = null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z")
    public final boolean method1674(int arg0) {
        field3926++;
        if (this.field3922 == null) {
            return false;
        } else {
            if (arg0 >= -14) {
                field3915 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method1675(byte arg0) {
        field3915 = null;
        if (arg0 == -55) {
            field3921 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(II)I")
    public static final int method1676(int arg0, int arg1) {
        field3919++;
        if (class28.field400 != null) {
            class28.field400.method1210(arg1 ^ 0xFFFFA002);
            class28.field400 = null;
        }
        class202.field3197++;
        if (arg1 != 24573) {
            field3915 = null;
        }
        if (class202.field3197 > 4) {
            class202.field3197 = 0;
            class252.field4110 = 0;
            return arg0;
        }
        if (class70.field873 == class183.field2906) {
            class70.field873 = class23.field303;
        } else {
            class70.field873 = class183.field2906;
        }
        class252.field4110 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public static final void method1677(int arg0) {
        int var1 = class280.field4439.method692(class2.field11);
        for (int var2 = 0; var2 < class34.field437; var2++) {
            int var6 = class280.field4439.method692(class132.method895(var2, 0));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        field3917++;
        if (arg0 >= -46) {
            return;
        }
        int var3 = class34.field437 * 15 + 21;
        int var4 = class273.field4369;
        int var5 = class98.field1297 - (var1 / 2);
        if (var3 + var4 > class292.field4640) {
            var4 = class292.field4640 - var3;
        }
        if (class283.field4517 < var5 + var1) {
            var5 = class283.field4517 - var1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (class129.field2069 != 1) {
            if (class98.field1297 != class107.field1449 || class273.field4369 != class214.field3435) {
                class200.field3168 = class214.field3435;
                class95.field1207 = class107.field1449;
                class129.field2069 = 1;
                return;
            }
            class190.field3074 = var4;
            class103.field1392 = var1;
            class129.field2069 = 0;
            class73.field916 = var5;
            class262.field4250 = true;
            class67.field850 = class34.field437 * 15 + (class164.field2607 ? 26 : 22);
        } else if (class98.field1297 == class95.field1207 && class273.field4369 == class200.field3168) {
            class73.field916 = var5;
            class190.field3074 = var4;
            class67.field850 = (class164.field2607 ? 26 : 22) + class34.field437 * 15;
            class262.field4250 = true;
            class129.field2069 = 0;
            class103.field1392 = var1;
            return;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZI[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1678(boolean arg0, int arg1, String[] arg2, int arg3) {
        field3920++;
        if (arg3 == 0) {
            return "";
        } else if (arg3 == 1) {
            String var4 = arg2[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            int var7 = arg1;
            if (!arg0) {
                field3915 = null;
            }
            while (var7 < var5) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
                var7++;
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }
}
