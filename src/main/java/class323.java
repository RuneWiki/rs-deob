import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public abstract class class323 {

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Ltj;")
    public static class108 field4704;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "Ltj;")
    public static class108 field4706;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IZ)V")
    public static final void method2136(int arg0, boolean arg1) {
        field4708++;
        if (!arg1) {
            class276 var2 = class264.method1816((byte) -121, arg0, 3);
            var2.method1870((byte) 126);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method2137(int arg0) {
        if (arg0 == 3) {
            field4704 = null;
            field4706 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILok;)Lok;")
    public abstract class138 method457(int arg0, class138 arg1);

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)V")
    public static final void method2138(int arg0, int arg1, int arg2) {
        if ((class176.field2468 < class176.field2471)) {
            class176.field2468 = (float) ((double) class176.field2468 / 30.0D + (double) class176.field2468);
            if (class176.field2468 > class176.field2471) {
                class176.field2468 = class176.field2471;
            }
            class177.method1267((byte) 73);
            class176.field2466 = (int) class176.field2468 >> 1;
            class176.field2464 = class425.method2661(class176.field2466, (byte) 38);
        } else if (class176.field2468 > class176.field2471) {
            class176.field2468 = (float) ((double) class176.field2468 - (double) class176.field2468 / 30.0D);
            if (class176.field2471 > class176.field2468) {
                class176.field2468 = class176.field2471;
            }
            class177.method1267((byte) 55);
            class176.field2466 = (int) class176.field2468 >> 1;
            class176.field2464 = class425.method2661(class176.field2466, (byte) -120);
        }
        if (arg1 != 8) {
            field4712 = 87;
        }
        field4703++;
        if (class209.field2986 != -1 && class139.field2125 != -1) {
            int var3 = class209.field2986 - class170.field2407;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class139.field2125 - class175.field2459;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class170.field2407 += var3;
            if (var3 == 0 && var4 == 0) {
                class139.field2125 = -1;
                class209.field2986 = -1;
            }
            class175.field2459 += var4;
            class177.method1267((byte) 77);
        }
        if (class166.field2377 > 0) {
            class385.field5445--;
            if (class385.field5445 == 0) {
                class166.field2377--;
                class385.field5445 = 100;
            }
        } else {
            class252.field3743 = -1;
            class334.field4849 = -1;
        }
        if (!class33.field421 || class301.field4388 == null) {
            return;
        }
        for (class249 var5 = (class249) class301.field4388.method2752(-120); var5 != null; var5 = (class249) class301.field4388.method2754(-1)) {
            class297 var6 = class379.method2417(3144, var5.field3711.field2794);
            if (class73.field948 == 0 && var5.method1734(101, arg0, arg2)) {
                if (var6.field4294 != null) {
                    if (var6.field4294[4] != null) {
                        class252.method1755((long) var5.field3711.field2794, var6.field4317, 1009, -1, (byte) -92, var6.field4294[4], var6.field4287, 0);
                    }
                    if (var6.field4294[3] != null) {
                        class252.method1755((long) var5.field3711.field2794, var6.field4317, 1012, -1, (byte) -89, var6.field4294[3], var6.field4287, 0);
                    }
                    if (var6.field4294[2] != null) {
                        class252.method1755((long) var5.field3711.field2794, var6.field4317, 1006, -1, (byte) 107, var6.field4294[2], var6.field4287, 0);
                    }
                    if (var6.field4294[1] != null) {
                        class252.method1755((long) var5.field3711.field2794, var6.field4317, 1010, -1, (byte) -95, var6.field4294[1], var6.field4287, 0);
                    }
                    if (var6.field4294[0] != null) {
                        class252.method1755((long) var5.field3711.field2794, var6.field4317, 1003, -1, (byte) 42, var6.field4294[0], var6.field4287, 0);
                    }
                }
                if (!var5.field3711.field2790) {
                    var5.field3711.field2790 = true;
                    class424.method2653(15, var5.field3711.field2794, var6.field4287);
                }
                if (var5.field3711.field2790) {
                    class424.method2653(17, var5.field3711.field2794, var6.field4287);
                }
            } else if (var5.field3711.field2790) {
                var5.field3711.field2790 = false;
                class424.method2653(16, var5.field3711.field2794, var6.field4287);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public static final void method2139(int arg0) {
        field4709++;
        if (arg0 != 17) {
            method2140(29);
        }
        class198.field2833.method98(0);
        class293.field4238.method98(0);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public static final void method2140(int arg0) {
        if (arg0 <= 105) {
            field4707 = -73;
        }
        for (class382 var1 = (class382) class228.field3392.method2752(-53); var1 != null; var1 = (class382) class228.field3392.method2754(-1)) {
            if (class31.method172(var1.field5420, (byte) 100)) {
                class405.method2539((byte) 90, var1);
            }
        }
        field4710++;
        if (class381.field5412 == 1) {
            class359.field5185 = false;
            class198.method1404(class291.field4227, class352.field5116, class129.field1832, class264.field3882, false);
            return;
        }
        class198.method1404(class291.field4227, class352.field5116, class129.field1832, class264.field3882, false);
        int var2 = class70.field934.method1309((byte) 125, class190.field2725.method2284((byte) -32, class309.field4497));
        for (class382 var3 = (class382) class228.field3392.method2752(-100); var3 != null; var3 = (class382) class228.field3392.method2754(-1)) {
            int var4 = class447.method2790(var3, (byte) 122);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class291.field4227 = (class19.field253 ? 26 : 22) + class381.field5412 * 16;
        class264.field3882 = var2 + 8;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLlf;)Lcd;")
    public static final class171 method2141(boolean arg0, class130 arg1) {
        field4711++;
        return arg0 ? new class171(arg1.method844(698527688), arg1.method844(698527688), arg1.method844(698527688), arg1.method844(698527688), arg1.method839((byte) -92), arg1.method839((byte) -92), arg1.method837(arg0)) : null;
    }

    static {
        new class349((String) null, "geschickt werden.", (String) null, (String) null);
        field4707 = -1;
    }
}
