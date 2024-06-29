import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class251 extends class95 {

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Lsf;")
    public static class108 field4378 = class140.method973(255, "<col=00ff80>");

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "I")
    public static int field4384 = 0;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "I")
    private int field4382;

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "Lsf;")
    public class108 field4379;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "[[B")
    public static byte[][] field4376;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V", line = 9)
    public static void method1771(byte arg0) {
        field4376 = (byte[][]) null;
        if (arg0 >= -44) {
            field4376 = (byte[][]) ((byte[][]) null);
        }
        field4378 = null;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)Z", line = 26)
    public final boolean method1772(boolean arg0) {
        field4377++;
        if (arg0) {
            return this.field4382 == 115;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILrm;)V", line = 50)
    public final void method1773(int arg0, class249 arg1) {
        if (arg0 != -31266) {
            field4376 = (byte[][]) ((byte[][]) null);
        }
        field4381++;
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                return;
            }
            this.method1776(arg1, 7477, var3);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)Z", line = 76)
    public static final boolean method1774(int arg0) {
        field4375++;
        if (arg0 != 903) {
            method1774(-125);
        }
        return class231.field4051 ? true : class183.field3367;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lrm;I)V", line = 92)
    public static final void method1775(class249 arg0, int arg1) {
        field4383++;
        if (arg1 != 63) {
            return;
        }
        while (true) {
            while (arg0.field4314 < arg0.field4338.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method1731(true) == 1) {
                    var2 = true;
                    var4 = arg0.method1731(true);
                    var3 = arg0.method1731(true);
                }
                int var5 = arg0.method1731(true);
                int var6 = arg0.method1731(true);
                int var7 = class152.field2757 + class83.field1288 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class144.field2546;
                if (var8 >= 0 && (var7 - 63) >= 0 && class74.field1113 > (var8 + 63) && class152.field2757 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && var4 * 8 + 8 > var11 && var3 * 8 <= var12 && (var3 * 8 + 8) > var12) {
                                byte var13 = arg0.method1721((byte) 33);
                                if (var13 != 0) {
                                    if (class190.field3449[var9][var10] == null) {
                                        class190.field3449[var9][var10] = new byte[4096];
                                    }
                                    class190.field3449[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method1721((byte) 80);
                                    if (class304.field5273[var9][var10] == null) {
                                        class304.field5273[var9][var10] = new byte[4096];
                                    }
                                    class304.field5273[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method1721((byte) 57);
                        if (var16 != 0) {
                            arg0.field4314++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lrm;II)V", line = 197)
    private final void method1776(class249 arg0, int arg1, int arg2) {
        if (arg1 != 7477) {
            field4378 = (class108) null;
        }
        if (arg2 == 1) {
            this.field4382 = arg0.method1731(true);
        } else if (arg2 == 2) {
            this.field4385 = arg0.method1738(-1756395344);
        } else if (arg2 == 5) {
            this.field4379 = arg0.method1740(true);
        }
        field4380++;
    }
}
