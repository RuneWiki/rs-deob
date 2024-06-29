import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public abstract class class70 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1102 = new String[200];

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Z")
    public static boolean field1104 = true;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "[J")
    public static long[] field1111 = new long[32];

    @OriginalMember(owner = "client!om", name = "e", descriptor = "[S")
    public static short[] field1106 = new short[] { 51, 16, 49, 11, 43, 12, 50, 20 };

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1113 = 0;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method537(boolean arg0) {
        if (class122.field1950 != -1) {
            class316.method2176((byte) -71, class122.field1950);
        }
        field1110++;
        int var1 = 0;
        if (arg0) {
            method538(-29, 38, -72, -115, 4);
        }
        while (var1 < class319.field4983) {
            if (class30.field502[var1]) {
                class301.field4734[var1] = true;
            }
            class39.field694[var1] = class30.field502[var1];
            class30.field502[var1] = false;
            var1++;
        }
        class213.field3405 = -1;
        class33.field549 = class205.field3252;
        class107.field1789 = null;
        if (class265.field4126) {
            class121.field1939 = true;
        }
        class77.field1181 = -1;
        if (class122.field1950 != -1) {
            class319.field4983 = 0;
            class183.method1377(65);
        }
        if (class265.field4126) {
            class262.method1864();
        } else {
            class182.method1368();
        }
        class122.field1952 = 0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIIII)Z", line = 54)
    public static final boolean method538(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class249.field3849 * arg3 + class10.field170 * arg0 >> 16;
        int var6 = class10.field170 * arg3 - class249.field3849 * arg0 >> 16;
        int var7 = class204.field3230 * var6 + class20.field371 * arg1 >> 16;
        int var8 = class204.field3230 * arg1 - class20.field371 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class204.field3230 * var6 + class20.field371 * arg2 >> 16;
        int var12 = class204.field3230 * arg2 - class20.field371 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class328.field5079 && var13 < class328.field5079) {
            return false;
        } else if (var9 > class190.field3029 && var13 > class190.field3029) {
            return false;
        } else if (var10 < class96.field1577 && var14 < class96.field1577) {
            return false;
        } else {
            return var10 <= class116.field1891 || var14 <= class116.field1891;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 102)
    public static void method539(int arg0) {
        if (arg0 != 32) {
            method541(2, -3, (Component) null, -14);
        }
        field1111 = null;
        field1102 = null;
        field1106 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(III)J", line = 116)
    public static final long method540(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        return var3 == null || var3.field4236 == null ? 0L : var3.field4236.field3008;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILjava/awt/Component;I)Log;", line = 126)
    public static final class206 method541(int arg0, int arg1, Component arg2, int arg3) {
        field1103++;
        if (arg0 != -1) {
            field1104 = true;
        }
        try {
            Class var4 = Class.forName("df");
            class206 var5 = (class206) var4.getDeclaredConstructor().newInstance();
            var5.method1215(arg3, arg2, arg1, 31980);
            return var5;
        } catch (Throwable var8) {
            class180 var7 = new class180();
            var7.method1215(arg3, arg2, arg1, 31980);
            return var7;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lob;I)V", line = 158)
    public static final void method543(class292 arg0, int arg1) {
        field1112++;
        int var2 = arg0.field4477;
        if (var2 == 324) {
            if (class310.field4882 == -1) {
                class310.field4882 = arg0.field4599;
                class73.field1130 = arg0.field4462;
            }
            if (class320.field5001.field3807) {
                arg0.field4599 = class310.field4882;
            } else {
                arg0.field4599 = class73.field1130;
            }
        } else if (var2 == 325) {
            if (class310.field4882 == -1) {
                class310.field4882 = arg0.field4599;
                class73.field1130 = arg0.field4462;
            }
            if (class320.field5001.field3807) {
                arg0.field4599 = class73.field1130;
            } else {
                arg0.field4599 = class310.field4882;
            }
        } else if (var2 == 327) {
            arg0.field4509 = 150;
            arg0.field4511 = (int) (Math.sin((double) class205.field3252 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field4513 = -1;
            arg0.field4500 = 5;
        } else {
            if (arg1 != 7290) {
                method538(-118, 89, 51, 20, 111);
            }
            if (var2 == 328) {
                if (class19.field356.field494 == null) {
                    arg0.field4513 = 0;
                } else {
                    arg0.field4509 = 150;
                    arg0.field4511 = (int) (Math.sin((double) class205.field3252 / 40.0D) * 256.0D) & 0x7FF;
                    arg0.field4500 = 5;
                    arg0.field4513 = ((int) class36.method281(89, class19.field356.field494) << 11) + 2047;
                    arg0.field4565 = 0;
                    arg0.field4471 = class19.field356.field1453;
                    arg0.field4479 = class19.field356.field1438;
                    arg0.field4484 = class19.field356.field1430;
                }
            }
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BI)I", line = 246)
    public static final int method545(byte arg0, int arg1) {
        field1105++;
        if (arg1 < 0) {
            return 0;
        }
        class62 var2 = (class62) class42.field748.method833(false, (long) arg1);
        if (var2 == null) {
            return class278.method1988(arg0 - 161, arg1).field2259;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field961.length; var4++) {
            if (var2.field961[var4] == -1) {
                var3++;
            }
        }
        int var5 = var3 + (class278.method1988(-120, arg1).field2259 - var2.field961.length);
        if (arg0 != 53) {
            field1107 = -62;
        }
        return var5;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)[B")
    public abstract byte[] method542(byte arg0);

    @OriginalMember(owner = "client!om", name = "a", descriptor = "([BI)V")
    public abstract void method544(byte[] arg0, int arg1);
}
