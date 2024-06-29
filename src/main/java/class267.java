import java.awt.Font;
import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class267 extends OutputStream {

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Loa;")
    public static class276 field4633 = new class276(8);

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lda;")
    public static class275 field4636 = class255.method1672(103, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "Lda;")
    private static class275 field4637 = class255.method1672(109, "shake:");

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lda;")
    public static class275 field4638 = field4637;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lda;")
    public static class275 field4635 = field4637;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lne;")
    public static class137 field4639 = new class137(500);

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lda;")
    public static class275 field4643 = class255.method1672(112, "blinken3:");

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Lda;")
    public static class275 field4641 = class255.method1672(114, "<col=ff3000>");

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Z")
    public static boolean field4640 = false;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field4645 = 500;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lda;")
    public static class275 field4647 = class255.method1672(110, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field4634;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Ljava/awt/Font;")
    public static Font field4644;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static void method1753(byte arg0) {
        field4635 = null;
        field4647 = null;
        field4636 = null;
        field4639 = null;
        field4644 = null;
        field4633 = null;
        field4643 = null;
        field4638 = null;
        field4641 = null;
        if (arg0 != -17) {
            field4633 = null;
        }
        field4637 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static final int method1754(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!lc", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field4628++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)Z")
    public static final boolean method1755(int arg0, int arg1) {
        field4632++;
        if (class52.field867[arg1]) {
            return true;
        } else if (class96.field1638.method770((byte) 44, arg1)) {
            int var2 = class96.field1638.method779((byte) -99, arg1);
            if (var2 == 0) {
                class52.field867[arg1] = true;
                return true;
            }
            if (class173.field3005[arg1] == null) {
                class173.field3005[arg1] = new class229[var2];
            }
            for (int var3 = arg0; var3 < var2; var3++) {
                if (class173.field3005[arg1][var3] == null) {
                    byte[] var4 = class96.field1638.method775(arg1, var3, -24799);
                    if (var4 != null) {
                        class173.field3005[arg1][var3] = new class229();
                        class173.field3005[arg1][var3].field3879 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            class173.field3005[arg1][var3].method1480(105, new class85(var4));
                        } else {
                            class173.field3005[arg1][var3].method1478((byte) -128, new class85(var4));
                        }
                    }
                }
            }
            class52.field867[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIZZIZ)Lwb;")
    public static final class179 method1756(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6, boolean arg7) {
        field4631++;
        class245 var8 = class210.method1352(104, arg2);
        if (arg3 > 1 && var8.field4284 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field4323[var10] <= arg3 && var8.field4323[var10] != 0) {
                    var9 = var8.field4284[var10];
                }
            }
            if (var9 != -1) {
                var8 = class210.method1352(87, var9);
            }
        }
        class130 var11 = var8.method1608((byte) -21);
        if (var11 == null) {
            return null;
        }
        class259 var12 = null;
        if (var8.field4311 != -1) {
            var12 = (class259) method1756(0, 1, var8.field4297, 10, true, false, 71, true);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4329 != -1) {
            var12 = (class259) method1756(arg0, arg1, var8.field4265, arg3, true, false, 107, false);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class47.field786;
        int var14 = class47.field787;
        int var15 = class47.field790;
        int[] var16 = new int[4];
        class47.method296(var16);
        class259 var17 = new class259(36, 32);
        class47.method291(var17.field4527, 36, 32);
        class223.method1433();
        class223.method1432(16, 16);
        class223.field3770 = false;
        int var18 = var8.field4271;
        if (arg7) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg1 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class223.field3760[var8.field4304] * var18 >> 16;
        int var20 = class223.field3769[var8.field4304] * var18 >> 16;
        var11.method947(0, var8.field4274, var8.field4276, var8.field4304, var8.field4294, (var20 + var8.field4308) - (var11.method664() / 2), var8.field4308 + var19);
        if (arg1 >= 1) {
            var17.method1698(1);
            if (arg1 >= 2) {
                var17.method1698(16777215);
            }
            class47.method291(var17.field4527, 36, 32);
        }
        if (arg0 != 0) {
            var17.method1686(arg0);
        }
        if (var8.field4311 != -1) {
            var12.method728(0, 0);
        } else if (var8.field4329 != -1) {
            class47.method291(var12.field4527, 36, 32);
            var17.method728(0, 0);
            var17 = var12;
        }
        int var21 = 26 % ((arg6 + 39) / 62);
        if (arg5 && (var8.field4321 == 1 || arg3 != 1) && arg3 != -1) {
            class181.field3121.method121(class162.method1127(96, arg3), 0, 9, 16776960, 1);
        }
        class47.method291(var13, var15, var14);
        class47.method303(var16);
        class223.method1433();
        class223.field3770 = true;
        return var17;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIILma;)[Lrk;")
    public static final class20[] method1757(byte arg0, int arg1, int arg2, class105 arg3) {
        field4634++;
        if (arg0 != -107) {
            field4638 = null;
        }
        return class210.method1353(arg1, arg3, arg2, (byte) -71) ? class180.method1209(true) : null;
    }
}
