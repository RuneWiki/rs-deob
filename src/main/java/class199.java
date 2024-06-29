import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class199 extends class32 {

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Lij;")
    private static class50 field3283 = class78.method578(122, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "Lij;")
    public static class50 field3281 = field3283;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Lv;")
    public static class143 field3285;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "Lfg;")
    public static class71 field3282;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "[[I")
    public static int[][] field3284;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lda;Lda;Lda;B)V")
    public static final void method1330(class22 arg0, class22 arg1, class22 arg2, byte arg3) {
        class21.field444 = arg2;
        field3279++;
        class20.field420 = arg1;
        if (arg3 <= -95) {
            class85.field1639 = arg0;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)Lsh;")
    public static final class221 method1331(byte arg0, int arg1) {
        field3280++;
        class221 var2 = (class221) class75.field1428.method912((long) arg1, (byte) 52);
        if (arg0 > -62) {
            return null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg1 >= 32768) {
                var3 = class15.field339.method190((byte) -72, arg1 & 0x7FFF, 0);
            } else {
                var3 = class224.field3770.method190((byte) -89, arg1, 0);
            }
            class221 var4 = new class221();
            if (var3 != null) {
                var4.method1516(new class217(var3), 3);
            }
            if (arg1 >= 32768) {
                var4.method1513((byte) -128);
            }
            class75.field1428.method913(var4, 127, (long) arg1);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lda;I)V")
    public static final void method1332(class22 arg0, int arg1) {
        class217.field3644 = class260.method1755(arg0, 45, class91.field1721);
        class164.field2802 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class32.field643[var2] >> 16 & 0xFF);
            int var5 = (class32.field643[var2 + 1] & 0xFF0000) >> 16;
            float var6 = ((float) var5 - var4) / 64.0F;
            float var7 = (float) ((class32.field643[var2] & 0xFF00) >> 8);
            int var8 = class32.field643[var2 + 1] >> 8 & 0xFF;
            float var9 = ((float) var8 - var7) / 64.0F;
            float var10 = (float) (class32.field643[var2] & 0xFF);
            int var11 = class32.field643[var2 + 1] & 0xFF;
            float var12 = ((float) var11 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class164.field2802[var2 * 64 + var13] = class29.method261((int) var10, class29.method261((int) var4 << 16, (int) var7 << 8));
                var7 += var9;
                var4 += var6;
                var10 += var12;
            }
        }
        field3287++;
        for (int var3 = 192; var3 < 255; var3++) {
            class164.field2802[var3] = class32.field643[3];
        }
        class66.field1261 = new int[32768];
        class188.field3113 = new int[32768];
        class56.method440(arg1 + 16676, (class67) null);
        class125.field2199 = new int[32768];
        class239.field4110 = new int[32768];
        if (arg1 != -32769) {
            field3282 = null;
        }
        class26.field556 = new class169(128, 254);
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(Z)V")
    public static void method1333(boolean arg0) {
        field3285 = null;
        field3281 = null;
        field3282 = null;
        field3284 = null;
        field3283 = null;
        if (arg0) {
            method1333(true);
        }
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
    public class199() {
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILda;ZI)Ljd;")
    public static final class85 method1334(int arg0, class22 arg1, boolean arg2, int arg3) {
        field3288++;
        if (arg2) {
            field3284 = null;
        }
        return class79.method581((byte) -118, arg0, arg1, arg3) ? class83.method628(29012) : null;
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(I)V")
    public class199(int arg0) {
        this.field3286 = arg0;
    }
}
