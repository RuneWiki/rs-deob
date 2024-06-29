import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class211 extends class81 {

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lna;")
    public static class26 field3274 = class69.method505("blinken1:", (byte) -127);

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "[Len;")
    public static class41[] field3275 = new class41[28];

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Lna;")
    public static class26 field3273 = null;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Lec;", line = 16)
    public static final class39 method1412(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field879; var4++) {
            class39 var5 = var3.field877[var4];
            if ((var5.field656 >> 29 & 0x3L) == 2L && var5.field637 == arg1 && var5.field630 == arg2) {
                class170.method1174(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 40)
    public static void method1413(byte arg0) {
        field3273 = null;
        field3274 = null;
        if (arg0 != -83) {
            method1413((byte) -9);
        }
        field3275 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lwa;Z)V", line = 55)
    public static final void method1414(class82 arg0, boolean arg1) {
        if (arg1) {
            field3275 = (class41[]) null;
        }
        field3276++;
        while (true) {
            while (arg0.field1301 < arg0.field1280.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg0.method642((byte) -94) == 1) {
                    var3 = true;
                    var2 = arg0.method642((byte) -40);
                    var4 = arg0.method642((byte) -102);
                }
                int var5 = arg0.method642((byte) -104);
                int var6 = arg0.method642((byte) -71);
                int var7 = -(var6 * 64) - (1 - class9.field111 - class317.field5436);
                int var8 = var5 * 64 - class135.field2057;
                if (var8 >= 0 && var7 - 63 >= 0 && (var8 + 63) < class38.field623 && var7 < class317.field5436) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= (var2 * 8) && var11 < var2 * 8 + 8 && var12 >= var4 * 8 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg0.method599(false);
                                if (var13 != 0) {
                                    if (class236.field3770[var9][var10] == null) {
                                        class236.field3770[var9][var10] = new byte[4096];
                                    }
                                    class236.field3770[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method599(false);
                                    if (class35.field578[var9][var10] == null) {
                                        class35.field578[var9][var10] = new byte[4096];
                                    }
                                    class35.field578[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method599(arg1);
                        if (var16 != 0) {
                            arg0.field1301++;
                        }
                    }
                }
            }
            return;
        }
    }
}
