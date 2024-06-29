import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class32 extends Canvas {

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field462;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "[I")
    public static int[] field459 = new int[200];

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Ljava/lang/String;")
    public static String field458 = "";

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ga", name = "h", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ga", name = "k", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ga", name = "l", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ga", name = "m", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 4)
    public static final void method226(int arg0) {
        while (class36.field535 >= 2048.0F) {
            class36.field535 -= 2048.0F;
        }
        while (class36.field535 < 0.0F) {
            class36.field535 += 2048.0F;
        }
        field466++;
        int var1 = class150.field2184 >> 7;
        if (class103.field1476 < 128.0F) {
            class103.field1476 = 128.0F;
        }
        int var2 = class112.field1623 >> 7;
        int var3 = -13 % ((arg0 + 43) / 53);
        int var4 = 0;
        if (class103.field1476 > 383.0F) {
            class103.field1476 = 383.0F;
        }
        int var5 = class71.method584(class321.field4835, class112.field1623, -93, class150.field2184);
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                for (int var7 = var1 - 4; var7 <= var1 + 4; var7++) {
                    int var8 = class321.field4835;
                    if (var8 < 3 && (class230.field3491[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = (class286.field4309[var8][var6][var7] & 0xFF) * 8 + var5 - class132.field1930[var8][var6][var7];
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (class291.field4409 < var10) {
            class291.field4409 += (var10 - class291.field4409) / 24;
        } else if (class291.field4409 > var10) {
            class291.field4409 += (var10 - class291.field4409) / 80;
        }
    }

    @OriginalMember(owner = "client!ga", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 82)
    public final void paint(Graphics arg0) {
        this.field462.paint(arg0);
        field460++;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)I", line = 91)
    public static final int method227(int arg0, int arg1) {
        if (arg1 == 98048) {
            field465++;
            return arg0 >>> 8;
        } else {
            return -109;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 106)
    public static final void method228(int arg0) {
        if (class28.field396 != null) {
            class28.field396.method523((byte) 83);
        }
        if (class119.field1675 != null) {
            class119.field1675.method523((byte) 83);
        }
        if (arg0 != 0) {
            field470 = 56;
        }
        field468++;
    }

    @OriginalMember(owner = "client!ga", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 124)
    public final void update(Graphics arg0) {
        field469++;
        this.field462.update(arg0);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)V", line = 138)
    public static final void method229(int arg0) {
        if (arg0 != 23633) {
            method228(36);
        }
        class172.field2478.method462(arg0 ^ 0x5C49);
        field461++;
        class209.field3048.method462(24);
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 150)
    public class32(Component arg0) {
        this.field462 = arg0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V", line = 164)
    public static final void method230(boolean arg0) {
        class83.field1194.method1913(122);
        field467++;
        int var1 = class83.field1194.method1911(1, 16811);
        if (!arg0) {
            field464 = 31;
        }
        if (var1 == 0) {
            return;
        }
        int var2 = class83.field1194.method1911(2, 16811);
        if (var2 == 0) {
            class5.field125[class95.field1336++] = 2047;
        } else if (var2 == 1) {
            int var3 = class83.field1194.method1911(3, 16811);
            class1.field55.method2342(1, var3, false);
            int var4 = class83.field1194.method1911(1, 16811);
            if (var4 == 1) {
                class5.field125[class95.field1336++] = 2047;
            }
        } else if (var2 == 2) {
            if (class83.field1194.method1911(1, 16811) == 1) {
                int var6 = class83.field1194.method1911(3, 16811);
                class1.field55.method2342(2, var6, false);
                int var7 = class83.field1194.method1911(3, 16811);
                class1.field55.method2342(2, var7, !arg0);
            } else {
                int var5 = class83.field1194.method1911(3, 16811);
                class1.field55.method2342(0, var5, !arg0);
            }
            int var8 = class83.field1194.method1911(1, 16811);
            if (var8 == 1) {
                class5.field125[class95.field1336++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class83.field1194.method1911(7, 16811);
            int var10 = class83.field1194.method1911(1, 16811);
            if (var10 == 1) {
                class5.field125[class95.field1336++] = 2047;
            }
            int var11 = class83.field1194.method1911(7, 16811);
            int var12 = class83.field1194.method1911(1, 16811);
            class321.field4835 = class83.field1194.method1911(2, 16811);
            class1.field55.method1701(6476, var9, var11, var12 == 1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[B)Lkc;", line = 253)
    public static final class29 method231(int arg0, byte[] arg1) {
        field463++;
        if (arg1 == null) {
            return null;
        } else if (arg0 == 1) {
            class29 var2;
            if (class141.field2031) {
                var2 = new class363(arg1, class199.field2896, class160.field2319, class59.field871, class225.field3397, class225.field3385);
            } else {
                var2 = new class42(arg1, class199.field2896, class160.field2319, class59.field871, class225.field3397, class225.field3385);
            }
            class321.method2235(-2182);
            return var2;
        } else {
            return (class29) null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 275)
    public static void method232(byte arg0) {
        field459 = null;
        field458 = null;
        if (arg0 <= 57) {
            field464 = 23;
        }
    }
}
