import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class17 {

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "[J")
    public static long[] field230 = new long[256];

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[[B")
    public static byte[][] field231;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "[I")
    public static int[] field234;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "Ljg;")
    public static class315 field235;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "[[I")
    public static int[][] field233;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ljava/awt/Component;III)Loe;", line = 15)
    public static final class136 method115(Component arg0, int arg1, int arg2, int arg3) {
        field228++;
        try {
            Class var4 = Class.forName("tj");
            class136 var5 = (class136) var4.getDeclaredConstructor().newInstance();
            var5.method905(arg3, arg0, 1, arg2);
            if (arg1 != -1) {
                field235 = (class315) null;
            }
            return var5;
        } catch (Throwable var8) {
            class220 var7 = new class220();
            var7.method905(arg3, arg0, arg1 ^ 0xFFFFFFFE, arg2);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)V", line = 40)
    public static void method117(byte arg0) {
        field230 = null;
        field235 = null;
        field233 = (int[][]) null;
        field231 = (byte[][]) null;
        field234 = null;
        if (arg0 != 86) {
            field230 = (long[]) null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)I", line = 54)
    public static final int method118(int arg0, boolean arg1) {
        field229++;
        if (arg1) {
            field236 = -82;
        }
        if (class236.field3463 != null) {
            class236.field3463.method1096((byte) 65);
            class236.field3463 = null;
        }
        class270.field4252++;
        if (class270.field4252 > 4) {
            class41.field489 = 0;
            class270.field4252 = 0;
            return arg0;
        }
        if (class298.field4647 == class230.field3364) {
            class230.field3364 = class320.field4911;
        } else {
            class230.field3364 = class298.field4647;
        }
        class41.field489 = 0;
        return -1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field230[var0] = var1;
        }
        field231 = new byte[1000][];
        field232 = -1;
        field234 = new int[100];
        field236 = 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
    public abstract void method113(byte arg0);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)I")
    public abstract int method114(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)J")
    public abstract long method116(int arg0);
}
