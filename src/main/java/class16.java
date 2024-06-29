import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ia")
public class class16 extends class8 {

    @OriginalMember(owner = "mapview!ia", name = "s", descriptor = "[J")
    private long[] field163 = new long[10];

    @OriginalMember(owner = "mapview!ia", name = "p", descriptor = "I")
    private int field160 = 256;

    @OriginalMember(owner = "mapview!ia", name = "r", descriptor = "I")
    private int field162 = 1;

    @OriginalMember(owner = "mapview!ia", name = "y", descriptor = "I")
    private int field169 = 0;

    @OriginalMember(owner = "mapview!ia", name = "o", descriptor = "J")
    private long field159 = class14.method78(0);

    @OriginalMember(owner = "mapview!ia", name = "t", descriptor = "Lv;")
    public static class40 field164 = class24.method170("Guide", (byte) -107);

    @OriginalMember(owner = "mapview!ia", name = "x", descriptor = "Lv;")
    public static class40 field168 = class24.method170("Rare Trees", (byte) 117);

    @OriginalMember(owner = "mapview!ia", name = "u", descriptor = "Lv;")
    public static class40 field165 = class24.method170("75(U", (byte) -122);

    @OriginalMember(owner = "mapview!ia", name = "v", descriptor = "Lv;")
    public static class40 field166 = class24.method170("floorcol)3dat", (byte) 73);

    @OriginalMember(owner = "mapview!ia", name = "q", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "mapview!ia", name = "w", descriptor = "[I")
    public static int[] field167;

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;", line = 4)
    public static final Object method84(boolean arg0, byte[] arg1, byte arg2) {
        if (arg2 != 12) {
            method87(null, (byte) 16);
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class29.field421) {
            try {
                class24 var3 = (class24) Class.forName("f").getDeclaredConstructor().newInstance();
                var3.method174(arg1, (byte) 120);
                return var3;
            } catch (Throwable var5) {
                class29.field421 = true;
            }
        }
        return arg0 ? class11.method68(true, arg1) : arg1;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(III)I", line = 82)
    public final int method59(int arg0, int arg1, int arg2) {
        int var4 = this.field162;
        int var5 = this.field160;
        this.field162 = 1;
        this.field160 = 300;
        this.field159 = class14.method78(0);
        if (this.field163[this.field161] == 0L) {
            this.field160 = var5;
            this.field162 = var4;
        } else if (this.field163[this.field161] < this.field159) {
            this.field160 = (int) ((long) (arg1 * 2560) / (this.field159 - this.field163[this.field161]));
        }
        if (this.field160 < 25) {
            this.field160 = 25;
        }
        if (this.field160 > 256) {
            this.field160 = 256;
            this.field162 = (int) ((long) arg1 - (this.field159 - this.field163[this.field161]) / 10L);
        }
        if (arg1 < this.field162) {
            this.field162 = arg1;
        }
        this.field163[this.field161] = this.field159;
        this.field161 = (this.field161 + 1) % 10;
        if (this.field162 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field163[var6] != 0L) {
                    this.field163[var6] -= -((long) this.field162);
                }
            }
        }
        int var7 = 0;
        int var8 = 49 / ((arg0 - 71) / 39);
        if (arg2 > this.field162) {
            this.field162 = arg2;
        }
        class37.method226(303, (long) this.field162);
        while (this.field169 < 256) {
            var7++;
            this.field169 += this.field160;
        }
        this.field169 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!ia", name = "b", descriptor = "(I)V", line = 151)
    public static void method85(int arg0) {
        if (arg0 != 1) {
            field164 = null;
        }
        field167 = null;
        field165 = null;
        field164 = null;
        field166 = null;
        field168 = null;
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "(II[Lv;I)V", line = 165)
    public static final void method86(int arg0, int arg1, class40[] arg2, int arg3) {
        if (arg3 < 12) {
            field164 = null;
        }
        if (arg0 == 1) {
            arg2[0].method246(-24312);
        } else {
            class19.method115(arg0, arg1, arg2, -17476).method246(-24312);
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "<init>", descriptor = "()V", line = 181)
    public class16() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field163[var1] = this.field159;
        }
    }

    @OriginalMember(owner = "mapview!ia", name = "a", descriptor = "([BB)Lea;", line = 225)
    public static final class10 method87(byte[] arg0, byte arg1) {
        if (arg0 == null) {
            return null;
        } else {
            int var2 = -6 / ((arg1 - 63) / 42);
            class10 var3 = new class10(arg0, class35.field465, class15.field152, class11.field116, class41.field532, field167, class8.field99);
            class18.method104(0);
            return var3;
        }
    }
}
