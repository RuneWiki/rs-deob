import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class198 extends class211 {

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "[J")
    private long[] field3320 = new long[10];

    @OriginalMember(owner = "client!hh", name = "E", descriptor = "I")
    private int field3330 = 256;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    private int field3322 = 0;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    private int field3313 = 1;

    @OriginalMember(owner = "client!hh", name = "B", descriptor = "J")
    private long field3327 = class78.method669(2047);

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lwa;")
    public static class75 field3315 = class66.method560("Benutzen", false);

    @OriginalMember(owner = "client!hh", name = "x", descriptor = "Lwa;")
    public static class75 field3323 = class66.method560("ul", false);

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "[I")
    public static int[] field3316 = new int[2];

    @OriginalMember(owner = "client!hh", name = "A", descriptor = "Lwa;")
    public static class75 field3326 = class66.method560("Benutzeroberfl-=che geladen)3", false);

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "[I")
    public static int[] field3319 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "[Lha;")
    public static class287[] field3311 = new class287[50];

    @OriginalMember(owner = "client!hh", name = "D", descriptor = "Lwa;")
    public static class75 field3329 = class66.method560("Lade Sprites )2 ", false);

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Lwa;")
    public static class75 field3317 = class66.method560("Verbindung mit Update)2Server)3)3)3", false);

    @OriginalMember(owner = "client!hh", name = "C", descriptor = "Lwa;")
    private static class75 field3328 = class66.method560("Free world", false);

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "Lwa;")
    public static class75 field3318 = field3328;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    private int field3314;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!hh", name = "z", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!hh", name = "F", descriptor = "Lcb;")
    public static class267 field3331;

    @OriginalMember(owner = "client!hh", name = "y", descriptor = "[[[B")
    public static byte[][][] field3324;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V", line = 22)
    public static void method1472(int arg0) {
        if (arg0 != 0) {
            method1472(-57);
        }
        field3331 = null;
        field3317 = null;
        field3324 = (byte[][][]) null;
        field3316 = null;
        field3328 = null;
        field3329 = null;
        field3311 = null;
        field3318 = null;
        field3315 = null;
        field3326 = null;
        field3323 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 50)
    public final void method1231(int arg0) {
        field3321++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3320[var2] = 0L;
        }
        if (arg0 != -26981) {
            field3331 = (class267) null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V", line = 191)
    public class198() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field3320[var1] = this.field3327;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILre;)Lre;", line = 77)
    public static final class262 method1473(int arg0, class262 arg1) {
        field3325++;
        if (arg0 != 19329) {
            method1473(-39, (class262) null);
        }
        class262 var2 = client.method1738(arg1);
        if (var2 == null) {
            var2 = arg1.field4510;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)I", line = 108)
    public final int method1230(int arg0, int arg1, int arg2) {
        field3312++;
        int var4 = this.field3330;
        this.field3330 = 300;
        int var5 = this.field3313;
        this.field3313 = 1;
        this.field3327 = class78.method669(2047);
        if (this.field3320[this.field3314] == 0L) {
            this.field3330 = var4;
            this.field3313 = var5;
        } else if (this.field3327 > this.field3320[this.field3314]) {
            this.field3330 = (int) ((long) (arg2 * 2560) / (this.field3327 - this.field3320[this.field3314]));
        }
        if (this.field3330 < 25) {
            this.field3330 = 25;
        }
        if (this.field3330 > 256) {
            this.field3330 = 256;
            this.field3313 = (int) ((long) arg2 - ((this.field3327 - this.field3320[this.field3314]) / 10L));
        }
        if (this.field3313 > arg2) {
            this.field3313 = arg2;
        }
        this.field3320[this.field3314] = this.field3327;
        this.field3314 = (this.field3314 + 1) % 10;
        if (this.field3313 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3320[var6] != 0L) {
                    this.field3320[var6] -= -((long) this.field3313);
                }
            }
        }
        if (arg1 > this.field3313) {
            this.field3313 = arg1;
        }
        class235.method1708(103, (long) this.field3313);
        int var7 = 127 / ((57 - arg0) / 40);
        int var8 = 0;
        while (this.field3322 < 256) {
            this.field3322 += this.field3330;
            var8++;
        }
        this.field3322 &= 0xFF;
        return var8;
    }
}
