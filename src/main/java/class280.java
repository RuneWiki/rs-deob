import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class280 {

    @OriginalMember(owner = "client!rr", name = "k", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public int field4586;

    @OriginalMember(owner = "client!rr", name = "i", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "I")
    public static int field4590 = -50;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "[B")
    public static byte[] field4589 = new byte[32896];

    @OriginalMember(owner = "client!rr", name = "j", descriptor = "Lbu;")
    public static class407 field4594;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
    public static int field4592;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rr", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field4596;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1840(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field4589[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field4594 = new class407(16);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZLnv;ILjava/lang/String;)Lln;", line = 7)
    public static final class169 method1836(boolean arg0, class493 arg1, int arg2, String arg3) {
        field4587++;
        if (arg2 == 0) {
            return arg1.method2873((byte) -28, arg3);
        } else if (!arg0) {
            return null;
        } else if (arg2 == 1) {
            try {
                class456.method2733("openjs", new Object[] { (new URL(arg1.field7203.getCodeBase(), arg3)).toString() }, arg1.field7203, -31915);
                class169 var4 = new class169();
                var4.field2692 = 1;
                return var4;
            } catch (Throwable var10) {
                class169 var5 = new class169();
                var5.field2692 = 2;
                return var5;
            }
        } else if (arg2 == 2) {
            try {
                arg1.field7203.getAppletContext().showDocument(new URL(arg1.field7203.getCodeBase(), arg3), "_blank");
                class169 var6 = new class169();
                var6.field2692 = 1;
                return var6;
            } catch (Exception var11) {
                class169 var7 = new class169();
                var7.field2692 = 2;
                return var7;
            }
        } else if (arg2 == 3) {
            try {
                class456.method2735(-27001, "loggedout", arg1.field7203);
            } catch (Throwable var13) {
            }
            try {
                arg1.field7203.getAppletContext().showDocument(new URL(arg1.field7203.getCodeBase(), arg3), "_top");
                class169 var8 = new class169();
                var8.field2692 = 1;
                return var8;
            } catch (Exception var12) {
                class169 var9 = new class169();
                var9.field2692 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 83)
    public static final void method1837(int arg0) {
        for (class11 var1 = (class11) class316.field4967.method2538(-3); var1 != null; var1 = (class11) class316.field4967.method2535((byte) -77)) {
            if (class66.field977 == null) {
                var1.method1821((byte) 81);
            } else if (class504.field7348 >= var1.field118) {
                int var2 = class491.field7178[var1.field129];
                if (var2 == 0) {
                    class218 var9 = class134.method1018(var1.field119, var1.field114, var1.field128);
                    if (var9 instanceof class435) {
                        class483.method2835(var1.field119, var1.field114, var1.field128);
                        class435 var10 = (class435) var9;
                        if (var10.field6487 != null) {
                            class373.method2347(var1.field119, var1.field114, var1.field128, var10.field6487, null);
                        }
                    }
                } else if (var2 == 1) {
                    class192 var3 = class158.method1103(var1.field119, var1.field114, var1.field128);
                    if (var3 instanceof class37) {
                        class94.method661(var1.field119, var1.field114, var1.field128);
                        class37 var4 = (class37) var3;
                        if (var4.field550 != null) {
                            class235.method1617(var1.field119, var1.field114, var1.field128, var4.field550, null);
                        }
                    }
                } else if (var2 == 2) {
                    class290 var7 = class491.method2868(var1.field119, var1.field114, var1.field128, field4596 == null ? (field4596 = method1840("jg")) : field4596);
                    if (var7 instanceof class193) {
                        class335.method2117(var1.field119, var1.field114, var1.field128, field4596 == null ? (field4596 = method1840("jg")) : field4596);
                        class193 var8 = (class193) var7;
                        if (var8.field2996 != null) {
                            class177.method1198(var8.field2996, false);
                        }
                    }
                } else if (var2 == 3) {
                    class125 var5 = class373.method2346(var1.field119, var1.field114, var1.field128);
                    if (var5 instanceof class208) {
                        class208.method1359(var1.field119, var1.field114, var1.field128);
                        class208 var6 = (class208) var5;
                        if (var6.field3276 != null) {
                            class389.method2434(var1.field119, var1.field114, var1.field128, var6.field3276);
                        }
                    }
                }
                var1.method1821((byte) 99);
            } else if (class504.field7348 == var1.field115) {
                int var11 = class491.field7178[var1.field129];
                if (var11 == 0) {
                    class218 var12 = class134.method1018(var1.field119, var1.field114, var1.field128);
                    if (var12 instanceof class435) {
                        var1.method1821((byte) 116);
                    } else if (class76.method548(var1.field119, var1.field114, var1.field128) == null) {
                        class435 var13 = new class435(var1.field129, var1.field130, var1.field126, var1.field116, var1.field127, var12);
                        class373.method2347(var1.field119, var1.field114, var1.field128, var13, null);
                    } else {
                        var1.method1821((byte) 59);
                    }
                } else if (var11 == 1) {
                    class192 var14 = class158.method1103(var1.field119, var1.field114, var1.field128);
                    if (var14 instanceof class37) {
                        var1.method1821((byte) 31);
                    } else if (class271.method1807(var1.field119, var1.field114, var1.field128) == null) {
                        class37 var15 = new class37(var1.field129, var1.field130, var1.field126, var1.field116, var1.field127, var14);
                        class235.method1617(var1.field119, var1.field114, var1.field128, var15, null);
                    } else {
                        var1.method1821((byte) 95);
                    }
                } else if (var11 == 2) {
                    class290 var16 = class491.method2868(var1.field119, var1.field114, var1.field128, field4596 == null ? (field4596 = method1840("jg")) : field4596);
                    if (var16 instanceof class193) {
                        var1.method1821((byte) -87);
                    } else {
                        class335.method2117(var1.field119, var1.field114, var1.field128, field4596 == null ? (field4596 = method1840("jg")) : field4596);
                        class39 var17 = class61.field928.method791(var1.field123, true);
                        int var18;
                        int var19;
                        if (var1.field130 == 1 || var1.field130 == 3) {
                            var19 = var17.field611;
                            var18 = var17.field647;
                        } else {
                            var18 = var17.field611;
                            var19 = var17.field647;
                        }
                        class193 var20 = new class193(var1.field129, var1.field130, var1.field119, var1.field126, var1.field116, var1.field127, var1.field114, var1.field114 + var18 - 1, var1.field128, var1.field128 + var19 - 1, var16);
                        class177.method1198(var20, false);
                    }
                } else if (var11 == 3) {
                    class125 var21 = class373.method2346(var1.field119, var1.field114, var1.field128);
                    if (var21 instanceof class208) {
                        var1.method1821((byte) 95);
                    } else {
                        class208 var22 = new class208(var1.field126, var1.field116, var1.field127, var21);
                        class389.method2434(var1.field119, var1.field114, var1.field128, var22);
                    }
                }
            }
        }
        if (arg0 != 8275) {
            field4590 = 38;
        }
        field4591++;
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 290)
    public static void method1838(int arg0) {
        field4589 = null;
        field4594 = null;
        if (arg0 != 1970) {
            field4589 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILqs;I)Lko;", line = 302)
    public static final class227 method1839(int arg0, int arg1, class496 arg2, int arg3) {
        field4592++;
        byte[] var4 = arg2.method2926(arg1, -128, arg3);
        if (arg0 != 2) {
            method1837(-52);
        }
        return var4 == null ? null : new class227(var4);
    }

    @OriginalMember(owner = "client!rr", name = "toString", descriptor = "()Ljava/lang/String;", line = 347)
    public final String toString() {
        field4585++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(IIII)V", line = 358)
    public class280(int arg0, int arg1, int arg2, int arg3) {
        this.field4595 = arg3;
        this.field4588 = arg2;
        this.field4586 = arg0;
        this.field4593 = arg1;
    }
}
