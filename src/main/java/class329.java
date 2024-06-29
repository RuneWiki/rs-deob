import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class329 extends class499 {

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "J")
    public long field4488;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    public static int field4489 = 0;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "Lqa;")
    public static class162 field4490;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)Z", line = 5)
    public static final boolean method1829(byte arg0) {
        if (arg0 < 109) {
            return false;
        } else {
            field4494++;
            return class370.field5198 > 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lvq;Lvq;IZZ)I", line = 17)
    public static final int method1830(class320 arg0, class320 arg1, int arg2, boolean arg3, boolean arg4) {
        field4493++;
        if (arg2 == 1) {
            int var5 = arg1.field3239;
            int var6 = arg0.field3239;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg2 == 2) {
            return class498.method2936(class105.field1434, arg0.method1811((byte) 87).field891, arg1.method1811((byte) 108).field891, -5123);
        } else if (arg2 == 3) {
            if (arg1.field4431.equals("-")) {
                if (arg0.field4431.equals("-")) {
                    return 0;
                } else if (arg4) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field4431.equals("-")) {
                return arg4 ? 1 : -1;
            } else {
                return class498.method2936(class105.field1434, arg0.field4431, arg1.field4431, -5123);
            }
        } else if (arg2 == 4) {
            if (arg1.method1364(arg3)) {
                return arg0.method1364(false) ? 0 : 1;
            } else if (arg0.method1364(false)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2 != 5) {
            if (arg3) {
                field4489 = -100;
            }
            if (arg2 == 6) {
                if (arg1.method1363(!arg3)) {
                    return arg0.method1363(true) ? 0 : 1;
                } else if (arg0.method1363(!arg3)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 7) {
                if (arg1.method1365(false)) {
                    return arg0.method1365(false) ? 0 : 1;
                } else if (arg0.method1365(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg2 == 8) {
                int var7 = arg1.field4425;
                int var8 = arg0.field4425;
                if (arg4) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var7 == 1000) {
                        var7 = -1;
                    }
                } else {
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                    if (var7 == -1) {
                        var7 = 1000;
                    }
                }
                return var7 - var8;
            } else {
                return arg1.field4428 - arg0.field4428;
            }
        } else if (arg1.method1367(0)) {
            return arg0.method1367(0) ? 0 : 1;
        } else if (arg0.method1367(0)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "()V", line = 117)
    public class329() {
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lbt;)V", line = 122)
    public static final void method1831(class33 arg0) {
        for (int var1 = arg0.field463; var1 <= arg0.field456; var1++) {
            for (int var2 = arg0.field468; var2 <= arg0.field471; var2++) {
                class61 var3 = class385.field5410[arg0.field464][var1][var2];
                if (var3 != null) {
                    class302 var4 = var3.field819;
                    class302 var5 = null;
                    while (var4 != null) {
                        if (var4.field4136 == arg0) {
                            if (var5 == null) {
                                var3.field819 = var4.field4140;
                            } else {
                                var5.field4140 = var4.field4140;
                            }
                            var4.method1719((byte) 101);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4140;
                    }
                    var3.field828 = 0;
                    for (class302 var6 = var3.field819; var6 != null; var6 = var6.field4140) {
                        var3.field828 = (byte) (var3.field828 | var6.field4139);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z", line = 176)
    public static final boolean method1832(int arg0, int arg1, int arg2) {
        field4491++;
        if (arg0 != 1000) {
            field4490 = null;
        }
        return (arg1 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 187)
    public static void method1833(int arg0) {
        int var1 = 52 % ((40 - arg0) / 63);
        field4490 = null;
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(III)V", line = 197)
    public static final void method1834(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            method1833(-7);
        }
        field4492++;
        class483 var3 = class84.field1168[arg1][arg0];
        if (var3 != null) {
            class426.field6239 = var3.field7083;
            class511.field7503 = var3.field7091;
            class483.field7093 = var3.field7085;
        }
        class125.method820(14247);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(J)V", line = 216)
    public class329(long arg0) {
        this.field4488 = arg0;
    }
}
