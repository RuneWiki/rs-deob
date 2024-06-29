import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class140 {

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    private int field2413 = 0;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public int field2410;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[Lei;")
    public class62[] field2403;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Leg;")
    public static class37 field2404 = class174.method1167("sch-Utteln:", -67);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lid;")
    public static class226 field2402 = new class226();

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "[I")
    public static int[] field2414 = new int[128];

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Leg;")
    public static class37 field2415 = class174.method1167(" )2>", -76);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "J")
    private long field2399;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lei;")
    private class62 field2409;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lei;")
    private class62 field2412;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lei;")
    public final class62 method984(int arg0) {
        field2408++;
        if (this.field2409 == null) {
            return null;
        }
        class62 var2 = this.field2403[(int) (this.field2399 & (long) (this.field2410 - arg0))];
        while (this.field2409 != var2) {
            if (this.field2409.field1027 == this.field2399) {
                class62 var3 = this.field2409;
                this.field2409 = this.field2409.field1013;
                return var3;
            }
            this.field2409 = this.field2409.field1013;
        }
        this.field2409 = null;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public final void method985(int arg0) {
        field2401++;
        for (int var2 = arg0; var2 < this.field2410; var2++) {
            class62 var3 = this.field2403[var2];
            while (true) {
                class62 var4 = var3.field1013;
                if (var3 == var4) {
                    break;
                }
                var4.method441(16773377);
            }
        }
        this.field2412 = null;
        this.field2409 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lei;JI)V")
    public final void method986(class62 arg0, long arg1, int arg2) {
        if (arg0.field1026 != null) {
            arg0.method441(16773377);
        }
        field2400++;
        class62 var5 = this.field2403[(int) (arg1 & (long) (this.field2410 + arg2))];
        arg0.field1013 = var5;
        arg0.field1027 = arg1;
        arg0.field1026 = var5.field1026;
        arg0.field1026.field1013 = arg0;
        arg0.field1013.field1026 = arg0;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)I")
    public final int method987(byte arg0) {
        field2397++;
        int var2 = 0;
        if (arg0 < 106) {
            return -10;
        }
        for (int var3 = 0; var3 < this.field2410; var3++) {
            class62 var4 = this.field2403[var3];
            class62 var5 = var4.field1013;
            while (var4 != var5) {
                var5 = var5.field1013;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Lei;")
    public final class62 method988(int arg0) {
        field2398++;
        if (this.field2413 > 0 && this.field2403[this.field2413 - 1] != this.field2412) {
            class62 var2 = this.field2412;
            this.field2412 = var2.field1013;
            return var2;
        }
        while (this.field2410 > this.field2413) {
            class62 var3 = this.field2403[this.field2413++].field1013;
            if (this.field2403[this.field2413 - 1] != var3) {
                this.field2412 = var3.field1013;
                return var3;
            }
        }
        if (arg0 != 4586) {
            this.field2399 = -23L;
        }
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
    public static final void method989(byte arg0) {
        int var1 = 98 % ((-arg0 - 47) / 39);
        class244.field4381.method1403(45);
        field2405++;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    public static void method990(int arg0) {
        field2404 = null;
        field2402 = null;
        field2415 = null;
        if (arg0 >= -56) {
            method989((byte) -104);
        }
        field2414 = null;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)I")
    public final int method991(int arg0) {
        if (arg0 == -1) {
            field2411++;
            return this.field2410;
        } else {
            return 7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BJ)Lei;")
    public final class62 method992(byte arg0, long arg1) {
        field2407++;
        this.field2399 = arg1;
        class62 var4 = this.field2403[(int) (arg1 & (long) (this.field2410 - 1))];
        if (arg0 != 125) {
            this.field2413 = -86;
        }
        for (this.field2409 = var4.field1013; this.field2409 != var4; this.field2409 = this.field2409.field1013) {
            if (this.field2409.field1027 == arg1) {
                class62 var5 = this.field2409;
                this.field2409 = this.field2409.field1013;
                return var5;
            }
        }
        this.field2409 = null;
        return null;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)Lei;")
    public final class62 method993(int arg0) {
        this.field2413 = 0;
        field2406++;
        return arg0 == -15322 ? this.method988(arg0 + 19908) : null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(I)V")
    public class140(int arg0) {
        this.field2410 = arg0;
        this.field2403 = new class62[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class62 var3 = this.field2403[var2] = new class62();
            var3.field1013 = var3;
            var3.field1026 = var3;
        }
    }
}
