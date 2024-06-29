import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class128 extends class67 {

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "Led;")
    public static class43 field2555 = class191.method1219("Bitte laden Sie die Seite neu)3", false);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field2560 = 0;

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "I")
    public static int field2552 = 0;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "Led;")
    public static class43 field2568 = class191.method1219("(Y<)4col>", false);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "Ltd;")
    public static class176 field2565 = new class176(50);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "I")
    public int field2557;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public int field2559;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "Llc;")
    public static class103 field2558;

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "Lig;")
    public static class80 field2553;

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    public int[] field2566;

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "[I")
    public int[] field2570;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[I")
    public int[] field2571;

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "[Lpe;")
    public class141[] field2554;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "[Lpe;")
    public class141[] field2569;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "[[[B")
    public byte[][][] field2551;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method823(int arg0, boolean arg1, Object arg2) {
        field2556++;
        if (arg2 == null) {
            return null;
        } else if (arg0 >= -2) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class78.method480(var3, true) : var3;
        } else if (arg2 instanceof class170) {
            class170 var4 = (class170) arg2;
            return var4.method986(64);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public static final void method824(int arg0) {
        class17.field278 = 0;
        field2563++;
        class115.field2241 = 0;
        class150.method930(0);
        class164.method1022((byte) -109);
        class51.method310(true);
        for (int var1 = 0; var1 < class17.field278; var1++) {
            int var3 = class47.field947[var1];
            if (client.field559 != class172.field3433[var3].field2343) {
                class172.field3433[var3].field1539 = null;
                class172.field3433[var3] = null;
            }
        }
        if (class114.field2215 != class38.field723.field1727) {
            throw new RuntimeException("gnp1 pos:" + class38.field723.field1727 + " psize:" + class114.field2215);
        }
        for (int var2 = arg0; var2 < class95.field1864; var2++) {
            if (class172.field3433[class158.field3202[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class95.field1864);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public static void method825(int arg0) {
        field2558 = null;
        field2568 = null;
        field2553 = null;
        field2555 = null;
        if (arg0 < 45) {
            field2560 = 111;
        }
        field2565 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLjava/awt/Component;II)Lqb;")
    public static final class147 method826(byte arg0, Component arg1, int arg2, int arg3) {
        field2567++;
        try {
            Class var4 = Class.forName("ef");
            class147 var5 = (class147) var4.getDeclaredConstructor().newInstance();
            if (arg0 <= 123) {
                field2568 = null;
            }
            var5.method279(arg2, 0, arg1, arg3);
            return var5;
        } catch (Throwable var7) {
            class182 var6 = new class182();
            var6.method279(arg2, 0, arg1, arg3);
            return var6;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjg;IIIIII)V")
    public static final void method827(int arg0, class89 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= 0 && arg6 < 104 && arg0 >= 0 && arg0 < 104) {
            class15.field232[arg7][arg6][arg0] = 0;
            while (true) {
                int var8 = arg1.method538((byte) -125);
                if (var8 == 0) {
                    if (arg7 == 0) {
                        class158.field3203[0][arg6][arg0] = -class78.method479((byte) -125, arg0 + arg4 + 556238, arg5 + arg6 + 932731) * 8;
                    } else {
                        class158.field3203[arg7][arg6][arg0] = class158.field3203[arg7 - 1][arg6][arg0] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg1.method538((byte) -91);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg7 == 0) {
                        class158.field3203[0][arg6][arg0] = -var9 * 8;
                    } else {
                        class158.field3203[arg7][arg6][arg0] = class158.field3203[arg7 - 1][arg6][arg0] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class82.field1615[arg7][arg6][arg0] = arg1.method577((byte) 30);
                    class201.field3955[arg7][arg6][arg0] = (byte) ((var8 - 2) / 4);
                    class39.field749[arg7][arg6][arg0] = (byte) class7.method38(3, arg3 + var8 - 2);
                } else if (var8 <= 81) {
                    class15.field232[arg7][arg6][arg0] = (byte) (var8 - 49);
                } else {
                    class172.field3435[arg7][arg6][arg0] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg1.method538((byte) 112);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg1.method538((byte) -45);
                    break;
                }
                if (var10 <= 49) {
                    arg1.method538((byte) -92);
                }
            }
        }
        field2561++;
        if (arg2 != 1) {
            method825(-70);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZLtg;)V")
    public static final void method828(boolean arg0, class179 arg1) {
        short var2 = 256;
        field2564++;
        int var3 = 0;
        if (arg0) {
            method827(-66, null, -91, 92, 71, -42, -74, 56);
        }
        while (var3 < class83.field1639.length) {
            class83.field1639[var3] = 0;
            var3++;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * 128.0D * Math.random());
            class83.field1639[var16] = (int) (Math.random() * 256.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class174.field3465[var15] = (class83.field1639[var15 - 1] + class83.field1639[var15 - 128] + class83.field1639[var15 - -1] + class83.field1639[var15 + 128]) / 4;
                }
            }
            int[] var13 = class83.field1639;
            class83.field1639 = class174.field3465;
            class174.field3465 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field3576; var7++) {
            for (int var8 = 0; var8 < arg1.field3574; var8++) {
                if (arg1.field3577[var6++] != 0) {
                    int var9 = var8 + arg1.field3573 + 16;
                    int var10 = arg1.field3575 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class83.field1639[var11] = 0;
                }
            }
        }
    }
}
