import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 {

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Lec;")
    public class32 field3507 = new class32();

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Lv;")
    public static class146 field3494 = class159.method1226((byte) -37, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "Lv;")
    public static class146 field3495 = class159.method1226((byte) -37, " <col=ffffff>");

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lv;")
    private static class146 field3503 = class159.method1226((byte) -37, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lv;")
    public static class146 field3502 = class159.method1226((byte) -37, "<col=ff7000>");

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lv;")
    public static class146 field3505 = class159.method1226((byte) -37, "");

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lv;")
    public static class146 field3511 = class159.method1226((byte) -37, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lv;")
    public static class146 field3501 = field3503;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "Lv;")
    public static class146 field3516 = class159.method1226((byte) -37, " )2> ");

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lec;")
    private class32 field3515;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method1135(byte arg0) {
        int var1 = class29.field597.method262(94, 8);
        if (var1 < class126.field2925) {
            for (int var2 = var1; var2 < class126.field2925; var2++) {
                class105.field2528[class124.field2887++] = class136.field3080[var2];
            }
        }
        field3496++;
        if (var1 > class126.field2925) {
            throw new RuntimeException("gppov1");
        }
        class126.field2925 = 0;
        int var3 = 0;
        if (arg0 < 67) {
            field3502 = null;
        }
        while (var3 < var1) {
            int var4 = class136.field3080[var3];
            class67 var5 = class125.field2902[var4];
            int var6 = class29.field597.method262(35, 1);
            if (var6 == 0) {
                class136.field3080[class126.field2925++] = var4;
                var5.field754 = class94.field2229;
            } else {
                int var7 = class29.field597.method262(-116, 2);
                if (var7 == 0) {
                    class136.field3080[class126.field2925++] = var4;
                    var5.field754 = class94.field2229;
                    class72.field1685[class58.field1294++] = var4;
                } else if (var7 == 1) {
                    class136.field3080[class126.field2925++] = var4;
                    var5.field754 = class94.field2229;
                    int var8 = class29.field597.method262(-108, 3);
                    var5.method239(var8, false, 5591);
                    int var9 = class29.field597.method262(-127, 1);
                    if (var9 == 1) {
                        class72.field1685[class58.field1294++] = var4;
                    }
                } else if (var7 == 2) {
                    class136.field3080[class126.field2925++] = var4;
                    var5.field754 = class94.field2229;
                    int var10 = class29.field597.method262(-124, 3);
                    var5.method239(var10, true, 5591);
                    int var11 = class29.field597.method262(6, 3);
                    var5.method239(var11, true, 5591);
                    int var12 = class29.field597.method262(66, 1);
                    if (var12 == 1) {
                        class72.field1685[class58.field1294++] = var4;
                    }
                } else if (var7 == 3) {
                    class105.field2528[class124.field2887++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lec;Z)V")
    public final void method1136(class32 arg0, boolean arg1) {
        field3510++;
        if (arg1) {
            field3495 = null;
        }
        if (arg0.field674 != null) {
            arg0.method217(-1264);
        }
        arg0.field674 = this.field3507.field674;
        arg0.field664 = this.field3507;
        arg0.field674.field664 = arg0;
        arg0.field664.field674 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILec;)V")
    public final void method1137(int arg0, class32 arg1) {
        if (arg1.field674 != null) {
            arg1.method217(-1264);
        }
        arg1.field674 = this.field3507;
        arg1.field664 = this.field3507.field664;
        field3504++;
        arg1.field674.field664 = arg1;
        arg1.field664.field674 = arg1;
        if (arg0 != 2) {
            field3501 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Lec;")
    public final class32 method1138(int arg0) {
        if (arg0 != 25852) {
            field3505 = null;
        }
        field3509++;
        class32 var2 = this.field3507.field664;
        if (this.field3507 == var2) {
            this.field3515 = null;
            return null;
        } else {
            this.field3515 = var2.field664;
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
    public static final void method1139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 106 / ((arg1 + 58) / 62);
        field3517++;
        for (int var6 = 0; var6 < class92.field2203; var6++) {
            if (arg0 < class49.field1131[var6] + class159.field3647[var6] && arg0 + arg3 > class49.field1131[var6] && arg4 < class151.field3479[var6] + class35.field812[var6] && class151.field3479[var6] < arg4 + arg2) {
                class157.field3627[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static final void method1140(boolean arg0) {
        class94 var1 = (class94) class51.field1159.method337(-110);
        if (!arg0) {
            return;
        }
        while (var1 != null) {
            int var2 = var1.field2225;
            if (class54.method365(29657, var2)) {
                boolean var3 = true;
                class26[] var4 = class34.field736[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field510;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field679;
                    class26 var7 = class64.method466(-1922515024, var6);
                    if (var7 != null) {
                        class75.method567((byte) 122, var7);
                    }
                }
            }
            var1 = (class94) class51.field1159.method333(0);
        }
        field3506++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lec;")
    public final class32 method1141(int arg0) {
        field3497++;
        if (arg0 != 2) {
            this.field3507 = null;
        }
        class32 var2 = this.field3507.field664;
        if (this.field3507 == var2) {
            return null;
        } else {
            var2.method217(arg0 ^ 0xFFFFFB12);
            return var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Lec;")
    public final class32 method1142(int arg0) {
        field3513++;
        class32 var2 = this.field3515;
        if (this.field3507 == var2) {
            this.field3515 = null;
            return null;
        }
        if (arg0 != 1) {
            field3494 = null;
        }
        this.field3515 = var2.field664;
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Lec;")
    public final class32 method1143(int arg0) {
        class32 var2 = this.field3507.field674;
        field3512++;
        if (this.field3507 == var2) {
            return null;
        }
        var2.method217(-1264);
        if (arg0 != -2271) {
            field3502 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    public static final void method1144(int arg0, int arg1) {
        if (arg0 == -1 && !class22.field375) {
            class100.method831(20096);
        } else if (arg0 != -1 && class141.field3222 != arg0 && class38.field852 != 0 && !class22.field375) {
            class33.method222(0, 2, false, arg0, class60.field1377, class38.field852, true);
        }
        if (arg1 <= 105) {
            method1144(-9, 62);
        }
        field3499++;
        class141.field3222 = arg0;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public final void method1145(byte arg0) {
        if (arg0 != -72) {
            return;
        }
        field3514++;
        while (true) {
            class32 var2 = this.field3507.field664;
            if (this.field3507 == var2) {
                return;
            }
            var2.method217(arg0 ^ 0x4A8);
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)Lec;")
    public final class32 method1146(int arg0) {
        field3498++;
        class32 var2 = this.field3507.field674;
        if (this.field3507 == var2) {
            this.field3515 = null;
            return null;
        } else {
            this.field3515 = var2.field674;
            return arg0 <= 15 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lec;Lec;B)V")
    public final void method1147(class32 arg0, class32 arg1, byte arg2) {
        field3500++;
        if (arg2 >= -40) {
            return;
        }
        if (arg1.field674 != null) {
            arg1.method217(-1264);
        }
        arg1.field664 = arg0;
        arg1.field674 = arg0.field674;
        arg1.field674.field664 = arg1;
        arg1.field664.field674 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public static void method1148(boolean arg0) {
        field3502 = null;
        field3516 = null;
        field3501 = null;
        field3503 = null;
        field3505 = null;
        if (!arg0) {
            field3511 = null;
        }
        field3494 = null;
        field3495 = null;
        field3511 = null;
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)Lec;")
    public final class32 method1149(int arg0) {
        int var2 = -28 / ((-arg0 - 4) / 58);
        class32 var3 = this.field3515;
        field3508++;
        if (this.field3507 == var3) {
            this.field3515 = null;
            return null;
        } else {
            this.field3515 = var3.field674;
            return var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
    public class152() {
        this.field3507.field664 = this.field3507;
        this.field3507.field674 = this.field3507;
    }
}
