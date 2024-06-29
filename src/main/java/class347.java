import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class347 extends class260 {

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    private int field5401 = -1;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "I")
    private int field5405 = -32768;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "Z")
    private boolean field5404 = false;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    private int field5403 = 0;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
    public boolean field5413 = false;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    private int field5412 = 0;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field5397;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    private int field5399;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public int field5388;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "I")
    public int field5395;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public int field5389;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public int field5410;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "Leg;")
    private class314 field5407;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "[I")
    public static int[] field5411 = new int[14];

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lcc;")
    public static class327 field5393 = new class327(100);

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field5398;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field5409;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Lne;")
    private class187 field5406;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "[I")
    public static int[] field5414;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 7)
    public static final void method2406(byte arg0) {
        class240.field3490.method1301(-2);
        field5394++;
        int var1 = class240.field3490.method1311(8, 7);
        if (var1 < class257.field3747) {
            for (int var2 = var1; var2 < class257.field3747; var2++) {
                class341.field5322[class296.field4301++] = class305.field4455[var2];
            }
        }
        if (var1 > class257.field3747) {
            throw new RuntimeException("gnpov1");
        }
        if (arg0 != 43) {
            field5411 = (int[]) null;
        }
        class257.field3747 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class305.field4455[var3];
            class169 var5 = class251.field3688[var4];
            int var6 = class240.field3490.method1311(1, 7);
            if (var6 == 0) {
                class305.field4455[class257.field3747++] = var4;
                var5.field4875 = class313.field4603;
            } else {
                int var7 = class240.field3490.method1311(2, 7);
                if (var7 == 0) {
                    class305.field4455[class257.field3747++] = var4;
                    var5.field4875 = class313.field4603;
                    class35.field430[class318.field4689++] = var4;
                } else if (var7 == 1) {
                    class305.field4455[class257.field3747++] = var4;
                    var5.field4875 = class313.field4603;
                    int var8 = class240.field3490.method1311(3, 7);
                    var5.method2296(var8, -24892, 1);
                    int var9 = class240.field3490.method1311(1, 7);
                    if (var9 == 1) {
                        class35.field430[class318.field4689++] = var4;
                    }
                } else if (var7 == 2) {
                    class305.field4455[class257.field3747++] = var4;
                    var5.field4875 = class313.field4603;
                    if (class240.field3490.method1311(1, 7) == 1) {
                        int var11 = class240.field3490.method1311(3, 7);
                        var5.method2296(var11, -24892, 2);
                        int var12 = class240.field3490.method1311(3, arg0 - 36);
                        var5.method2296(var12, -24892, 2);
                    } else {
                        int var10 = class240.field3490.method1311(3, 7);
                        var5.method2296(var10, arg0 - 24935, 0);
                    }
                    int var13 = class240.field3490.method1311(1, 7);
                    if (var13 == 1) {
                        class35.field430[class318.field4689++] = var4;
                    }
                } else if (var7 == 3) {
                    class341.field5322[class296.field4301++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILvg;)V", line = 122)
    private final void method2407(int arg0, class81 arg1) {
        field5400++;
        if (class47.field623) {
            class128 var4 = (class128) arg1;
            if ((this.field5406 == null || this.field5406.field2565) && (var4.field1746 != null || var4.field1712 != null)) {
                this.field5406 = new class187(class313.field4603, 1, 1);
            }
            if (this.field5406 != null) {
                this.field5406.method1369(var4.field1746, var4.field1712, false, var4.field1732, var4.field1710, var4.field1699);
            }
        } else {
            class332 var3 = (class332) arg1;
            if ((this.field5406 == null || this.field5406.field2565) && (var3.field4977 != null || var3.field4965 != null)) {
                this.field5406 = new class187(class313.field4603, 1, 1);
            }
            if (this.field5406 != null) {
                this.field5406.method1369(var3.field4977, var3.field4965, false, var3.field4973, var3.field4964, var3.field4953);
            }
        }
        if (arg0 != 1) {
            this.field5413 = false;
        }
        this.field5404 = true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)V", line = 166)
    public final void method2408(int arg0, byte arg1) {
        field5402++;
        if (this.field5413) {
            return;
        }
        this.field5403 += arg0;
        if (arg1 != -46) {
            return;
        }
        while (this.field5407.field4627[this.field5412] < this.field5403) {
            this.field5403 -= this.field5407.field4627[this.field5412];
            this.field5412++;
            if (this.field5412 >= this.field5407.field4631.length) {
                this.field5413 = true;
                break;
            }
        }
        if (!this.field5413) {
            class296.method2025(this.field5407, this.field5395, this.field5388, this.field5412, false, false);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 202)
    public static final void method2409(Throwable arg0, int arg1, String arg2) {
        field5409++;
        try {
            if (arg1 != 3924) {
                method2411(114, -60);
            }
            String var3 = "";
            if (arg0 != null) {
                var3 = class245.method1728(false, arg0);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class255.method1780(var3, arg1 ^ 0xF3D);
            String var4 = class291.method1999(var3, "%3a", ":", -125);
            String var5 = class291.method1999(var4, "%40", "@", -123);
            String var6 = class291.method1999(var5, "%26", "&", arg1 ^ 0xFFFFF0DA);
            String var7 = class291.method1999(var6, "%23", "#", -112);
            if (class330.field4831.field883 == null) {
                return;
            }
            class188 var8 = class330.field4831.method507(new URL(class330.field4831.field883.getCodeBase(), "clienterror.ws?c=" + class181.field2480 + "&u=" + class336.field5242 + "&v1=" + class69.field885 + "&v2=" + class69.field877 + "&e=" + var7), arg1 ^ 0xF3A);
            while (var8.field2608 == 0) {
                class177.method1299((byte) 64, 1L);
            }
            if (var8.field2608 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field2606;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Lvg;", line = 254)
    private final class81 method2410(int arg0) {
        field5396++;
        if (arg0 > -16) {
            method2409((Throwable) null, -41, (String) null);
        }
        class15 var2 = class234.method1664(-128, this.field5399);
        class81 var3;
        if (this.field5413) {
            var3 = var2.method114(-1, 0, -1, (byte) 14);
        } else {
            var3 = var2.method114(this.field5401, this.field5403, this.field5412, (byte) 14);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 278)
    public static final void method2411(int arg0, int arg1) {
        class287.field4120.method2264((byte) -102, arg0);
        field5391++;
        class62.field777.method2264((byte) 105, arg0);
        if (arg1 != 3) {
            field5414 = (int[]) null;
        }
        class348.field5428.method2264((byte) -99, arg0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)V", line = 293)
    public final void method573(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5408++;
        if (!this.field5404) {
            class81 var6 = this.method2410(-72);
            if (var6 == null) {
                return;
            }
            this.method2407(1, var6);
        }
        if (this.field5406 != null) {
            this.field5406.method1351(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIJILne;)V", line = 321)
    public final void method585(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class187 arg10) {
        field5392++;
        class81 var13 = this.method2410(-72);
        if (var13 != null) {
            this.method2407(1, var13);
            var13.method585(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field5406);
            this.field5405 = var13.method583();
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)Lco;", line = 343)
    public static final class294 method2412(int arg0, int arg1, int arg2) {
        class119 var3 = class345.field5367[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1563; var4++) {
            class294 var5 = var3.field1549[var4];
            if ((var5.field4289 >> 29 & 0x3L) == 2L && var5.field4283 == arg1 && var5.field4287 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIIII)V", line = 412)
    public class347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5397 = arg1;
        this.field5399 = arg0;
        this.field5388 = arg2;
        this.field5395 = arg3;
        this.field5389 = arg4;
        this.field5410 = arg5 + arg6;
        int var8 = class234.method1664(-128, this.field5399).field169;
        if (var8 == -1) {
            this.field5413 = true;
        } else {
            this.field5413 = false;
            this.field5407 = class207.method1516(var8, 118);
        }
        if (this.field5410 == arg6) {
            class296.method2025(this.field5407, this.field5395, this.field5388, this.field5412, false, false);
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V", line = 375)
    public static void method2413(int arg0) {
        if (arg0 >= -64) {
            field5393 = (class327) null;
        }
        field5414 = null;
        field5393 = null;
        field5411 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()I", line = 388)
    public final int method583() {
        field5390++;
        return this.field5405;
    }
}
