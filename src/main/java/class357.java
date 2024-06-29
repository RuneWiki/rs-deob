import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class357 {

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "I")
    public int field4986 = 0;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public int field4982 = 0;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "Ljn;")
    private class117 field4992 = new class117(64);

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "Llca;")
    private class93 field4994 = null;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "Lvo;")
    private class345 field4983;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "Lvo;")
    private class345 field4990;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "I")
    public static int field4987 = 0;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "Ljda;")
    public static class77 field4985 = new class77("", 13);

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "I")
    public static int field4988;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)V", line = 6)
    public static final void method2153(byte arg0) {
        field4989++;
        if (arg0 >= -12) {
            method2155(-11);
        }
        int var1 = 0;
        if (class525.field7713 != null) {
            var1 = class525.field7713.method3482(0, class76.field1182);
        }
        if (var1 == 2) {
            int var2 = class521.field7686 > 800 ? 800 : class521.field7686;
            int var3 = class122.field1985 > 600 ? 600 : class122.field1985;
            class240.field3525 = (class521.field7686 - var2) / 2;
            class465.field6689 = var2;
            class119.field1910 = 0;
            class597.field8633 = var3;
        } else if (var1 == 1) {
            int var4 = class521.field7686 > 1024 ? 1024 : class521.field7686;
            int var5 = class122.field1985 <= 768 ? class122.field1985 : 768;
            class465.field6689 = var4;
            class240.field3525 = (class521.field7686 - var4) / 2;
            class597.field8633 = var5;
            class119.field1910 = 0;
        } else {
            class240.field3525 = 0;
            class597.field8633 = class122.field1985;
            class119.field1910 = 0;
            class465.field6689 = class521.field7686;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/util/Random;II)I", line = 56)
    public static final int method2154(Random arg0, int arg1, int arg2) {
        field4984++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class452.method2633(arg1, (byte) 127)) {
            return (int) ((long) arg1 * ((long) arg0.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = arg2 - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var3 <= var4);
            return class657.method3706((byte) 109, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V", line = 84)
    public static void method2155(int arg0) {
        field4985 = null;
        if (arg0 < 122) {
            method2153((byte) 47);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(J[IZLdc;)Ljava/lang/String;", line = 94)
    public final String method2156(long arg0, int[] arg1, boolean arg2, class303 arg3) {
        if (!arg2) {
            this.method2157(-6, (byte) -71);
        }
        field4988++;
        if (this.field4994 != null) {
            String var6 = this.field4994.method693(arg1, arg3, arg0, false);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(ILvo;Lvo;Llca;)V", line = 192)
    public class357(int arg0, class345 arg1, class345 arg2, class93 arg3) {
        this.field4983 = arg2;
        this.field4994 = arg3;
        this.field4990 = arg1;
        if (this.field4990 != null) {
            this.field4986 = this.field4990.method2098(0, 1);
        }
        if (this.field4983 != null) {
            this.field4982 = this.field4983.method2098(0, 1);
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IB)Ldn;", line = 132)
    public final class546 method2157(int arg0, byte arg1) {
        field4993++;
        class546 var3 = (class546) this.field4992.method941((long) arg0, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field4983.method2081(-126, arg0 & 0x7FFF, 1);
        } else {
            var4 = this.field4990.method2081(-127, arg0, 1);
        }
        class546 var5 = new class546();
        var5.field8020 = this;
        if (var4 != null) {
            var5.method3203(new class465(var4), -1);
        }
        if (arg1 >= -29) {
            field4987 = -11;
        }
        if (arg0 >= 32768) {
            var5.method3202((byte) -22);
        }
        this.field4992.method949((long) arg0, true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(III)I", line = 165)
    public static final int method2158(int arg0, int arg1, int arg2) {
        field4991++;
        int var3 = arg0 + (arg2 * 57);
        if (arg1 >= -66) {
            return 31;
        } else {
            int var4 = var3 ^ var3 << 13;
            int var5 = Integer.MAX_VALUE & (var4 * var4 * 15731 + 789221) * var4 + 1376312589;
            return var5 >> 19 & 0xFF;
        }
    }
}
