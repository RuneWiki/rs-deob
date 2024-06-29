import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class201 extends class29 {

    @OriginalMember(owner = "client!ob", name = "G", descriptor = "Lgf;")
    public class251 field3326;

    @OriginalMember(owner = "client!ob", name = "F", descriptor = "Lph;")
    public static class229 field3325 = class266.method1858("niveau ", 0);

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Lph;")
    public static class229 field3321 = class266.method1858("(R", 0);

    @OriginalMember(owner = "client!ob", name = "I", descriptor = "Lph;")
    public static class229 field3327 = class266.method1858("Ladevorgang )2 bitte warten Sie)3", 0);

    @OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
    public static int field3328 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lsi;")
    public static class66 field3323;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)V", line = 4)
    public static final void method1408(int arg0) {
        field3320++;
        for (int var1 = 0; var1 < class189.field3063; var1++) {
            int var10002 = class153.field2484[var1]--;
            if (class153.field2484[var1] >= -10) {
                class197 var3 = class275.field4597[var1];
                if (var3 == null) {
                    var3 = class197.method1388(class105.field1780, class262.field4376[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class153.field2484[var1] += var3.method1386();
                    class275.field4597[var1] = var3;
                }
                if (class153.field2484[var1] < 0) {
                    int var4;
                    if (class165.field2700[var1] == 0) {
                        var4 = class265.field4462;
                    } else {
                        int var5 = (class165.field2700[var1] & 0xFF) * 128;
                        int var6 = class165.field2700[var1] >> 16 & 0xFF;
                        int var7 = class165.field2700[var1] >> 8 & 0xFF;
                        int var8 = var6 * 128 + (64 - class230.field3820.field5147);
                        int var9 = var7 * 128 + 64 - class230.field3820.field5168;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var8 - (128 - var9);
                        if (var10 > var5) {
                            class153.field2484[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class184.field2996 / var5;
                    }
                    if (var4 > 0) {
                        class182 var11 = var3.method1385().method1292(class249.field4145);
                        class144 var12 = class144.method1053(var11, 100, var4);
                        var12.method1050(class219.field3597[var1] - 1);
                        class239.field3949.method2152(var12);
                    }
                    class153.field2484[var1] = -100;
                }
            } else {
                class189.field3063--;
                for (int var2 = var1; var2 < class189.field3063; var2++) {
                    class262.field4376[var2] = class262.field4376[var2 + 1];
                    class275.field4597[var2] = class275.field4597[var2 + 1];
                    class219.field3597[var2] = class219.field3597[var2 + 1];
                    class153.field2484[var2] = class153.field2484[var2 + 1];
                    class165.field2700[var2] = class165.field2700[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -17225) {
            method1408(79);
        }
        if (class300.field4870 && !class249.method1747(0)) {
            if (class234.field3860 != 0 && class187.field3048 != -1) {
                class301.method2024(1, class187.field3048, false, class219.field3599, 0, class234.field3860);
            }
            class300.field4870 = false;
        } else if (class234.field3860 != 0 && class187.field3048 != -1 && !class249.method1747(0)) {
            class121.field2033.method37(36, 202);
            class121.field2033.method1168(class187.field3048, (byte) -62);
            class103.field1765++;
            class187.field3048 = -1;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)I", line = 134)
    public static final int method1409(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field3324++;
        if (arg1 == var4) {
            return arg3;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)I", line = 153)
    public static int method1410(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)Z", line = 164)
    public static final boolean method1411(int arg0, int arg1) {
        field3322++;
        if (arg0 != 13782) {
            return true;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else {
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)V", line = 200)
    public static void method1412(int arg0) {
        field3327 = null;
        field3323 = null;
        field3321 = null;
        if (arg0 == 255) {
            field3325 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lgf;)V", line = 215)
    public class201(class251 arg0) {
        this.field3326 = arg0;
    }
}
