import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class399 extends class115 {

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public int field5961;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public int field5948;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "[I")
    public static int[] field5955 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public static int field5950;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "I")
    public static int field5951;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "I")
    public static int field5954;

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)I", line = 3)
    public final int method2399(byte arg0) {
        field5953++;
        if (arg0 > -118) {
            this.field5948 = 3;
        }
        return (this.field5948 & 0x1C2144) >> 18;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZII)V", line = 14)
    public static final void method2400(boolean arg0, int arg1, int arg2) {
        field5958++;
        class517 var3 = new class517(16);
        class449 var4 = (class449) class491.field7318.method3061(-16817);
        if (!arg0) {
            field5955 = null;
        }
        while (var4 != null) {
            var4.method876((byte) -96);
            int var5 = (int) (var4.field1739 >> 28);
            int var6 = (int) (var4.field1739 >> 14 & 0x3FFFL) - arg2;
            int var7 = (int) (var4.field1739 & 0x3FFFL) - arg1;
            if (var7 >= 0 && var6 >= 0 && var7 < class50.field640 && class448.field6611 > var6) {
                var3.method3055(0, (long) (var5 << 28 | var6 << 14 | var7), var4);
            }
            var4 = (class449) class491.field7318.method3066((byte) 124);
        }
        class491.field7318 = var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Z", line = 48)
    public final boolean method2401(int arg0) {
        field5949++;
        if (arg0 == 15966) {
            return (this.field5948 >> 21 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I", line = 61)
    public final int method2402(int arg0) {
        if (arg0 != 20992) {
            this.method2407((byte) 67, 6);
        }
        field5959++;
        return class41.method325((byte) 24, this.field5948);
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z", line = 72)
    public final boolean method2403(byte arg0) {
        if (arg0 >= -27) {
            this.method2408(false);
        }
        field5960++;
        return (this.field5948 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V", line = 85)
    public static void method2404(byte arg0) {
        int var1 = 125 % ((arg0 - 37) / 48);
        field5955 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([SII)[S", line = 94)
    public static final short[] method2405(short[] arg0, int arg1, int arg2) {
        field5954++;
        short[] var3 = new short[arg2];
        if (arg1 != 1791) {
            field5955 = null;
        }
        class442.method2592(arg0, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZ)I", line = 108)
    public static final int method2406(int arg0, boolean arg1) {
        field5951++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        }
        if (!arg1) {
            method2409((byte) -85, -82);
        }
        if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)Z", line = 144)
    public final boolean method2407(byte arg0, int arg1) {
        if (arg0 > -121) {
            field5955 = null;
        }
        field5952++;
        return (this.field5948 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z", line = 159)
    public final boolean method2408(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field5950++;
            return (this.field5948 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)V", line = 174)
    public static final void method2409(byte arg0, int arg1) {
        if (arg0 != 2) {
            method2406(-34, true);
        }
        field5947++;
        class520.field7639.method2294(arg1, true);
        class334.field5170.method2294(arg1, true);
        class510.field7491.method2294(arg1, true);
        class179.field2643.method2294(arg1, true);
        class81.field1152.method2294(arg1, true);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V", line = 193)
    public class399(int arg0, int arg1) {
        this.field5961 = arg1;
        this.field5948 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)V", line = 202)
    public static final void method2410(int arg0) {
        if (arg0 > -106) {
            return;
        }
        field5957++;
        class400.field5966.method1826(30273);
        int var1 = class400.field5966.method1823(8, 13255);
        if (var1 < class519.field7609) {
            for (int var2 = var1; var2 < class519.field7609; var2++) {
                class282.field4261[class17.field280++] = class327.field5114[var2];
            }
        }
        if (var1 > class519.field7609) {
            throw new RuntimeException("gnpov1");
        }
        class519.field7609 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class327.field5114[var3];
            class351 var5 = class88.field1375[var4];
            int var6 = class400.field5966.method1823(1, 13255);
            if (var6 == 0) {
                class327.field5114[class519.field7609++] = var4;
                var5.field6038 = class86.field1350;
            } else {
                int var7 = class400.field5966.method1823(2, 13255);
                if (var7 == 0) {
                    class327.field5114[class519.field7609++] = var4;
                    var5.field6038 = class86.field1350;
                    class40.field532[class58.field797++] = var4;
                } else if (var7 == 1) {
                    class327.field5114[class519.field7609++] = var4;
                    var5.field6038 = class86.field1350;
                    int var8 = class400.field5966.method1823(3, 13255);
                    var5.method2125(0, var8, 1);
                    int var9 = class400.field5966.method1823(1, 13255);
                    if (var9 == 1) {
                        class40.field532[class58.field797++] = var4;
                    }
                } else if (var7 == 2) {
                    class327.field5114[class519.field7609++] = var4;
                    var5.field6038 = class86.field1350;
                    if (class400.field5966.method1823(1, 13255) == 1) {
                        int var11 = class400.field5966.method1823(3, 13255);
                        var5.method2125(0, var11, 2);
                        int var12 = class400.field5966.method1823(3, 13255);
                        var5.method2125(0, var12, 2);
                    } else {
                        int var10 = class400.field5966.method1823(3, 13255);
                        var5.method2125(0, var10, 0);
                    }
                    int var13 = class400.field5966.method1823(1, 13255);
                    if (var13 == 1) {
                        class40.field532[class58.field797++] = var4;
                    }
                } else if (var7 == 3) {
                    class282.field4261[class17.field280++] = var4;
                }
            }
        }
    }
}
