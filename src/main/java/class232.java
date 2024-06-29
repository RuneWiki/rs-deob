import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class232 {

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3619 = "wave2:";

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "B")
    public byte field3613;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "B")
    public byte field3620;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "B")
    public byte field3623;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "B")
    public byte field3625;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "Lrn;")
    public static class18 field3621;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "S")
    public short field3622;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "Z")
    public boolean field3612;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
    public boolean field3614;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Z")
    public boolean field3617;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Z")
    public boolean field3618;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "Z")
    public boolean field3626;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 15)
    public static void method1736(int arg0) {
        field3619 = null;
        field3621 = null;
        if (arg0 != 5) {
            field3624 = 11;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIBI)V", line = 40)
    public static final void method1737(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3616++;
        if (class240.field3737) {
            class213.method1595(arg0, arg2, arg0 + arg1, arg2 + arg4);
            class213.method1593(arg0, arg2, arg1, arg4, 0);
        } else {
            class60.method598(arg0, arg2, arg0 + arg1, arg2 - -arg4);
            class60.method611(arg0, arg2, arg1, arg4, 0);
        }
        if (class294.field4577 < 100) {
            return;
        }
        float var5 = (float) class351.field5593 / (float) class351.field5596;
        int var6 = arg1;
        int var7 = arg4;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg4 / var5);
        }
        int var8 = (arg4 - var7) / 2 + arg2;
        if (class76.field1118 == null || class76.field1118.field3366 != arg1 || class76.field1118.field3367 != arg4) {
            class361 var9 = new class361(arg1, arg4);
            class60.method595(var9.field5720, arg1, arg4);
            if (class351.field5602.field889 != -1) {
                class60.method611(0, 0, arg1, arg4, class351.field5602.field889);
            }
            class351.method2472(0, 0, class351.field5596, class351.field5593, 0, 0, var6, var7);
            class351.method2480();
            if (class240.field3737) {
                class76.field1118 = new class2(var9);
            } else {
                class76.field1118 = var9;
            }
            if (class240.field3737) {
                class60.field928 = null;
            } else {
                class42.field665.method2190(1);
            }
        }
        int var10 = (arg1 - var6) / 2 + arg0;
        class76.field1118.method9(var10, var8);
        int var11 = var10 + (class305.field4747 * var6 / class351.field5596);
        int var12 = class199.field3096 * var6 / class351.field5596;
        int var13 = var8 + (class36.field547 * var7 / class351.field5593);
        int var14 = class207.field3192 * var7 / class351.field5593;
        int var15 = 16711680;
        if (class165.field2629 == 1) {
            var15 = 16777215;
        }
        if (class240.field3737) {
            class213.method1594(var11, var13, var12, var14, var15, 128);
            class213.method1599(var11, var13, var12, var14, var15);
        } else {
            class60.method601(var11, var13, var12, var14, var15, 128);
            class60.method604(var11, var13, var12, var14, var15);
        }
        if (arg3 < 9) {
            field3621 = (class18) null;
        }
        if (class300.field4664 <= 0) {
            return;
        }
        int var16;
        if (class332.field5098 > 50) {
            var16 = 500 - (class332.field5098 * 5);
        } else {
            var16 = class332.field5098 * 5;
        }
        for (class22 var17 = (class22) class351.field5599.method442((byte) -65); var17 != null; var17 = (class22) class351.field5599.method448(0)) {
            class181 var18 = class334.method2351(var17.field349, (byte) 112);
            if (class78.method719(8, var18)) {
                if (class310.field4800 == var17.field349) {
                    int var19 = var10 + (var17.field339 * var6 / class351.field5596);
                    int var20 = var8 + (var17.field348 * var7 / class351.field5593);
                    if (class240.field3737) {
                        class213.method1594(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    } else {
                        class60.method601(var19 - 2, var20 + -2, 4, 4, 16776960, var16);
                    }
                } else if (class155.field2503 != -1 && class155.field2503 == var18.field2857) {
                    int var21 = var17.field339 * var6 / class351.field5596 + var10;
                    int var22 = var17.field348 * var7 / class351.field5593 + var8;
                    if (class240.field3737) {
                        class213.method1594(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    } else {
                        class60.method601(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZII)I", line = 177)
    public static final int method1738(boolean arg0, int arg1, int arg2) {
        field3615++;
        if (!arg0) {
            method1737(-76, -120, -6, (byte) -68, -35);
        }
        class133 var3 = (class133) class81.field1169.method370((byte) -120, (long) arg2);
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field2227.length > arg1) {
            return var3.field2227[arg1];
        } else {
            return 0;
        }
    }
}
