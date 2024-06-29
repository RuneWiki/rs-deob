import java.awt.Font;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class25 extends class167 {

    @OriginalMember(owner = "client!wc", name = "S", descriptor = "[I")
    public static int[] field362 = new int[2];

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field360 = 0;

    @OriginalMember(owner = "client!wc", name = "Z", descriptor = "Le;")
    public static class191 field369 = class54.method368("Ablegen", 2047);

    @OriginalMember(owner = "client!wc", name = "T", descriptor = "J")
    public static volatile long field363 = 0L;

    @OriginalMember(owner = "client!wc", name = "V", descriptor = "Le;")
    public static class191 field365 = class54.method368("<col=c0ff00>", 2047);

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client!wc", name = "cb", descriptor = "I")
    public int field372;

    @OriginalMember(owner = "client!wc", name = "R", descriptor = "Le;")
    public class191 field361;

    @OriginalMember(owner = "client!wc", name = "W", descriptor = "Ljava/awt/Font;")
    public static Font field366;

    @OriginalMember(owner = "client!wc", name = "U", descriptor = "[Lwa;")
    public static class226[] field364;

    @OriginalMember(owner = "client!wc", name = "Y", descriptor = "[Lwa;")
    public static class226[] field368;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lng;Lng;Lng;ILng;)V")
    public static final void method178(class121 arg0, class121 arg1, class121 arg2, int arg3, class121 arg4) {
        class90.field1471 = arg1;
        class271.field4778 = arg2;
        class197.field3513 = arg0;
        field359++;
        class193.field3487 = arg4;
        class242.field4325 = new class33[class197.field3513.method798(-126)][];
        if (arg3 != 17732) {
            method180(-50);
        }
        class148.field2531 = new boolean[class197.field3513.method798(-112)];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[[I)V")
    public static final void method179(int arg0, int[][] arg1) {
        field357++;
        if (arg0 == 10743) {
            class232.field4151 = arg1;
        }
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)V")
    public static void method180(int arg0) {
        field366 = null;
        field365 = null;
        field368 = null;
        field369 = null;
        field362 = null;
        field364 = null;
        int var1 = 61 / ((arg0 + 11) / 33);
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
    public static final void method181(int arg0) {
        field355++;
        if (arg0 >= -79) {
            field363 = -122L;
        }
        if (!class188.method1298(10) && class261.field4598 != class252.field4461) {
            class71.method471(class79.field1339, class261.field4598, class175.field2946.field3014[0], false, (byte) 76, class14.field165, class175.field2946.field2953[0]);
        } else if (class261.field4598 != class242.field4303) {
            class242.field4303 = class261.field4598;
            class223.method1550(class261.field4598, false);
            class61.method413(-12379);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
    public static final void method182(Throwable arg0, String arg1, boolean arg2) {
        field358++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class242.method1696(false, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class83.field1392.field4379 != null) {
                class80 var8 = class83.field1392.method1714(new URL(class83.field1392.field4379.getCodeBase(), "clienterror.ws?c=" + class143.field2373 + "&u=" + class199.field3564 + "&v1=" + class247.field4378 + "&v2=" + class247.field4370 + "&e=" + var7), 104);
                while (var8.field1356 == 0) {
                    class18.method142(true, 1L);
                }
                if (var8.field1356 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field1360;
                    var9.read();
                    var9.close();
                }
                if (!arg2) {
                    field363 = 59L;
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILji;Z)V")
    private final void method183(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            field369 = null;
        }
        field370++;
        if (arg0 == 1) {
            this.field371 = arg1.method1580(-128);
        } else if (arg0 == 2) {
            this.field372 = arg1.method1562(21705);
        } else if (arg0 == 5) {
            this.field361 = arg1.method1596((byte) 45);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lbe;III)V")
    public static final void method184(class16 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class217.field3821) {
            class199 var4 = class201.field3608[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field3556 != null && var4.field3556.field4562.method120()) {
                arg0.method128(var4.field3556.field4562, 128, 0, 0, true);
            }
        }
        if (arg3 < class217.field3821) {
            class199 var5 = class201.field3608[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field3556 != null && var5.field3556.field4562.method120()) {
                arg0.method128(var5.field3556.field4562, 0, 0, 128, true);
            }
        }
        if (arg2 < class217.field3821 && arg3 < class85.field1406) {
            class199 var6 = class201.field3608[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field3556 != null && var6.field3556.field4562.method120()) {
                arg0.method128(var6.field3556.field4562, 128, 0, 128, true);
            }
        }
        if (arg2 < class217.field3821 && arg3 > 0) {
            class199 var7 = class201.field3608[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field3556 != null && var7.field3556.field4562.method120()) {
                arg0.method128(var7.field3556.field4562, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILji;)V")
    public final void method185(int arg0, class225 arg1) {
        while (true) {
            int var3 = arg1.method1580(-36);
            if (var3 == 0) {
                field356++;
                if (arg0 <= 7) {
                    this.method183(-87, (class225) null, true);
                    return;
                }
                return;
            }
            this.method183(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        field367++;
        if (arg0 < 22) {
            method181(7);
        }
        return this.field371 == 115;
    }
}
