import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class4 {

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "[S")
    public short[] field68;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "[S")
    public short[] field69;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "[B")
    public byte[] field75;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "[I")
    public int[] field72;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "[Leg;")
    public class37[] field67;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "Leg;")
    private static class37 field63 = class174.method1167("Loading)3)3)3", 120);

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "Leg;")
    public static class37 field65 = field63;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Li;")
    public static class19 field71 = new class19();

    @OriginalMember(owner = "client!ff", name = "p", descriptor = "Leg;")
    public static class37 field78 = class174.method1167(" est d-Bj-9 dans votre liste d(Wamis)3", -59);

    @OriginalMember(owner = "client!ff", name = "r", descriptor = "J")
    public static long field80 = 0L;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "J")
    public static volatile long field81 = 0L;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "[[S")
    public static short[][] field82 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!ff", name = "o", descriptor = "Leg;")
    public static class37 field77 = null;

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ff", name = "q", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II)I")
    public static int method24(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
    public static void method25(int arg0) {
        field63 = null;
        field71 = null;
        field82 = null;
        field65 = null;
        if (arg0 != 1031) {
            field82 = null;
        }
        field77 = null;
        field78 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[II[I)V")
    public static final void method26(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field70++;
        if (arg0 != -1) {
            method25(22);
        }
        if (arg1 <= arg3) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg3;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (((var9 & 0x1) + var7) < arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6++] = var11;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var8;
        method26(-1, var6 - 1, arg2, arg3, arg4);
        method26(arg0, arg1, arg2, var6 + 1, arg4);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method27(byte arg0, Component arg1) {
        field66++;
        arg1.addMouseListener(class233.field4017);
        if (arg0 > -53) {
            method27((byte) 18, (Component) null);
        }
        arg1.addMouseMotionListener(class233.field4017);
        arg1.addFocusListener(class233.field4017);
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Z")
    public final boolean method28(int arg0, int arg1) {
        field64++;
        if (arg0 == -4676) {
            return (this.field75[arg1] & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)Z")
    public final boolean method29(byte arg0, int arg1) {
        if (arg0 != -33) {
            this.field72 = null;
        }
        field73++;
        return (this.field75[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(BI)I")
    public final int method30(byte arg0, int arg1) {
        field79++;
        int var3 = 26 / ((arg0 + 26) / 60);
        return this.field75[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(BI)[B")
    public static final byte[] method31(byte arg0, int arg1) {
        field76++;
        class160 var2 = (class160) class41.field657.method344((byte) 14, (long) arg1);
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class46.method304(var3, var7, -7486);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class160(var4);
            class41.field657.method341((byte) 16, var2, (long) arg1);
        }
        if (arg0 != 86) {
            method25(25);
        }
        return var2.field2665;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(I)V")
    public class4(int arg0) {
        this.field74 = arg0;
        this.field68 = new short[this.field74];
        this.field69 = new short[this.field74];
        this.field75 = new byte[this.field74];
        this.field72 = new int[this.field74];
        this.field67 = new class37[this.field74];
    }
}
