import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class188 extends class322 {

    @OriginalMember(owner = "client!me", name = "R", descriptor = "Z")
    public static volatile boolean field2994 = true;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field2993 = new String[1000];

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public static int field2999 = 0;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "B")
    public byte field2991;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "I")
    public int field2998;

    @OriginalMember(owner = "client!me", name = "Y", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "Lsd;")
    public static class27 field3000;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "Lhb;")
    public class35 field2988;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)[B", line = 8)
    public final byte[] method54(byte arg0) {
        field2997++;
        if (this.field5004 || this.field2988.field455 < (this.field2988.field437.length - this.field2991)) {
            throw new RuntimeException();
        }
        if (arg0 != 33) {
            method1360(126, (class211) null);
        }
        return this.field2988.field437;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(III)V", line = 27)
    public static final void method1354(int arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            field3001++;
            class147 var3 = class92.method731(-29125, arg2, 5);
            var3.method1095(arg1 + 103);
            var3.field2240 = arg0;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lni;IIIIIIZ)V", line = 41)
    public static final void method1355(class24 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field274.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field274[var9] - class163.field2430;
            int var11 = arg0.field262[var9] - class6.field57;
            int var12 = arg0.field272[var9] - class35.field444;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field260 != null) {
                class24.field255[var9] = var13;
                class24.field271[var9] = var16;
                class24.field273[var9] = var17;
            }
            class24.field264[var9] = (var13 << 9) / var17 + class56.field834;
            class24.field257[var9] = (var16 << 9) / var17 + class56.field828;
        }
        class56.field841 = 0;
        int var19 = arg0.field266.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field266[var20];
            int var22 = arg0.field270[var20];
            int var23 = arg0.field268[var20];
            int var24 = class24.field264[var21];
            int var25 = class24.field264[var22];
            int var26 = class24.field264[var23];
            int var27 = class24.field257[var21];
            int var28 = class24.field257[var22];
            int var29 = class24.field257[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class244.field3682 && class22.method149(class63.field952 + class56.field834, class91.field1318 + class56.field828, var27, var28, var29, var24, var25, var26)) {
                    class207.field3265 = arg5;
                    class160.field2385 = arg6;
                }
                if (!class36.field534 && !arg7) {
                    class56.field833 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class56.field825 || var25 > class56.field825 || var26 > class56.field825) {
                        class56.field833 = true;
                    }
                    if (arg0.field260 == null || arg0.field260[var20] == -1) {
                        if (arg0.field275[var20] != 12345678) {
                            class56.method499(var27, var28, var29, var24, var25, var26, arg0.field275[var20], arg0.field269[var20], arg0.field261[var20]);
                        }
                    } else if (!class101.field1512) {
                        int var30 = class56.field829.method1744(-65536, arg0.field260[var20]);
                        class56.method499(var27, var28, var29, var24, var25, var26, class253.method1760(var30, arg0.field275[var20]), class253.method1760(var30, arg0.field269[var20]), class253.method1760(var30, arg0.field261[var20]));
                    } else if (arg0.field259) {
                        class56.method493(var27, var28, var29, var24, var25, var26, arg0.field275[var20], arg0.field269[var20], arg0.field261[var20], class24.field255[0], class24.field255[1], class24.field255[3], class24.field271[0], class24.field271[1], class24.field271[3], class24.field273[0], class24.field273[1], class24.field273[3], arg0.field260[var20]);
                    } else {
                        class56.method493(var27, var28, var29, var24, var25, var26, arg0.field275[var20], arg0.field269[var20], arg0.field261[var20], class24.field255[var21], class24.field255[var22], class24.field255[var23], class24.field271[var21], class24.field271[var22], class24.field271[var23], class24.field273[var21], class24.field273[var22], class24.field273[var23], arg0.field260[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 154)
    public static final void method1356(int arg0) {
        field2990++;
        Container var1;
        if (class63.field951 != null) {
            var1 = class63.field951;
        } else if (class184.field2857 == null) {
            var1 = class301.field4715.field285;
        } else {
            var1 = class184.field2857;
        }
        class99.field1461 = var1.getSize().width;
        class255.field3814 = var1.getSize().height;
        if (class184.field2857 == var1) {
            Insets var2 = class184.field2857.getInsets();
            class255.field3814 -= var2.top + var2.bottom;
            class99.field1461 -= var2.left + var2.right;
        }
        if (class76.method613((byte) 126) >= 2) {
            class210.field3314 = class255.field3814;
            class125.field1972 = class99.field1461;
            class298.field4673 = 0;
            class207.field3267 = 0;
        } else {
            class125.field1972 = 765;
            class207.field3267 = 0;
            class210.field3314 = 503;
            class298.field4673 = (class99.field1461 - 765) / 2;
        }
        if (class36.field534) {
            class36.method317(class125.field1972, class210.field3314);
        }
        class171.field2548.setSize(class125.field1972, class210.field3314);
        if (class184.field2857 == var1) {
            Insets var3 = class184.field2857.getInsets();
            class171.field2548.setLocation(class298.field4673 + var3.left, class207.field3267 + var3.top);
        } else {
            class171.field2548.setLocation(class298.field4673, class207.field3267);
        }
        if (arg0 <= -108) {
            if (class319.field4972 != -1) {
                class324.method2227(true, true);
            }
            class130.method991(-96);
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V", line = 222)
    public static void method1357(int arg0) {
        field3000 = null;
        if (arg0 == 2) {
            field2993 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 235)
    public static final String method1358(int arg0, long arg1) {
        field2987++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            if (arg0 != 95) {
                field2993 = (String[]) null;
            }
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class80.field1120[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)I", line = 286)
    public final int method56(int arg0) {
        field2989++;
        if (arg0 == 100) {
            return this.field2988 == null ? 0 : this.field2988.field455 * 100 / (this.field2988.field437.length - this.field2991);
        } else {
            return -4;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BLwj;Lwj;)V", line = 305)
    public static final void method1359(byte arg0, class217 arg1, class217 arg2) {
        if (arg2.field3424 != null) {
            arg2.method1554((byte) -77);
        }
        field2992++;
        arg2.field3424 = arg1.field3424;
        arg2.field3419 = arg1;
        arg2.field3424.field3419 = arg2;
        if (arg0 <= -24) {
            arg2.field3419.field3424 = arg2;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILlb;)I", line = 331)
    public static final int method1360(int arg0, class211 arg1) {
        field2996++;
        int var2 = arg0;
        if (arg1.method1531(96, class150.field2274)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1531(78, class250.field3748)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)V", line = 350)
    public static final void method1361(int arg0, int arg1) {
        if (arg1 < 121) {
            field2999 = -102;
        }
        field2995++;
        class147 var2 = class92.method731(-29125, arg0, 12);
        var2.method1099(-103);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(IIII)V", line = 367)
    public static final void method1362(int arg0, int arg1, int arg2, int arg3) {
        class99 var4 = class250.field3746[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class290 var5 = var4.field1474;
        if (var5 != null) {
            var5.field4556 = var5.field4556 * arg3 / 16;
            var5.field4552 = var5.field4552 * arg3 / 16;
        }
    }
}
