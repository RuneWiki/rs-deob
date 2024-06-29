import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class29 {

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    private int field350 = 0;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "[Lwj;")
    public class217[] field343;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public int field332;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field331 = "Allocated memory";

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "[Le;")
    public static class160[] field349 = new class160[14];

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "J")
    private long field339;

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "Lwj;")
    private class217 field344;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "Lwj;")
    private class217 field351;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "[I")
    public static int[] field340;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[F", line = 4)
    public static final float[] method197(int arg0, int arg1) {
        field341++;
        float var2 = class264.method1829() + class264.method1827();
        int var3 = class264.method1820();
        class329.field5087[arg0] = 1.0F;
        float var4 = (float) ((var3 & 0xFF21) >> 8) / 255.0F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 16 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class329.field5087[2] = (float) class142.method1078(arg1, 255) / 255.0F * var5 * var7 * var2;
        class329.field5087[0] = var2 * var7 * var6 * ((float) class142.method1078(255, arg1 >> 16) / 255.0F);
        class329.field5087[1] = var2 * var7 * (float) (class142.method1078(65311, arg1) >> 8) / 255.0F * var4;
        return class329.field5087;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)Lwj;", line = 30)
    public final class217 method198(int arg0) {
        field338++;
        if (this.field344 == null) {
            return null;
        }
        class217 var2 = this.field343[(int) ((long) (this.field332 - 1) & this.field339)];
        while (this.field344 != var2) {
            if (this.field344.field3418 == this.field339) {
                class217 var3 = this.field344;
                this.field344 = this.field344.field3419;
                return var3;
            }
            this.field344 = this.field344.field3419;
        }
        this.field344 = null;
        int var4 = 18 / ((-arg0 - 11) / 40);
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I[Lwj;)I", line = 61)
    public final int method199(int arg0, class217[] arg1) {
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field332; var4++) {
            class217 var5 = this.field343[var4];
            for (class217 var6 = var5.field3419; var6 != var5; var6 = var6.field3419) {
                arg1[var3++] = var6;
            }
        }
        field337++;
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lwj;", line = 98)
    public final class217 method200(int arg0) {
        field345++;
        this.field350 = arg0;
        return this.method202((byte) 84);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 107)
    public static final void method201(byte arg0) {
        if (class278.field4265 == 2) {
            if (class322.field5002 == class187.field2982 && class273.field4138 == class199.field3151) {
                class278.field4265 = 0;
                if (class11.field116 && class50.field768[81] && class6.field62 > 2) {
                    class183.method1324(true, class6.field62 - 2);
                } else {
                    class183.method1324(true, class6.field62 - 1);
                }
            }
        } else if (class97.field1446 == class322.field5002 && class38.field573 == class199.field3151) {
            class278.field4265 = 0;
            if (class11.field116 && class50.field768[81] && class6.field62 > 2) {
                class183.method1324(true, class6.field62 - 2);
            } else {
                class183.method1324(true, class6.field62 - 1);
            }
        } else {
            class273.field4138 = class38.field573;
            class278.field4265 = 2;
            class187.field2982 = class97.field1446;
        }
        if (arg0 >= -57) {
            field331 = (String) null;
        }
        field342++;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(B)Lwj;", line = 164)
    public final class217 method202(byte arg0) {
        field348++;
        int var2 = -27 % ((arg0 - 24) / 54);
        if (this.field350 > 0 && this.field343[this.field350 - 1] != this.field351) {
            class217 var3 = this.field351;
            this.field351 = var3.field3419;
            return var3;
        }
        class217 var4;
        do {
            if (this.field332 <= this.field350) {
                return null;
            }
            var4 = this.field343[this.field350++].field3419;
        } while (this.field343[this.field350 - 1] == var4);
        this.field351 = var4.field3419;
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IJ)Lwj;", line = 196)
    public final class217 method203(int arg0, long arg1) {
        this.field339 = arg1;
        if (arg0 != 1710) {
            this.field343 = (class217[]) null;
        }
        field334++;
        class217 var4 = this.field343[(int) (arg1 & (long) (this.field332 - 1))];
        for (this.field344 = var4.field3419; this.field344 != var4; this.field344 = this.field344.field3419) {
            if (this.field344.field3418 == arg1) {
                class217 var5 = this.field344;
                this.field344 = this.field344.field3419;
                return var5;
            }
        }
        this.field344 = null;
        return null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)V", line = 241)
    public static void method204(boolean arg0) {
        field331 = null;
        if (!arg0) {
            method197(66, -35);
        }
        field340 = null;
        field349 = null;
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)I", line = 257)
    public final int method205(int arg0) {
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field332; var3++) {
            class217 var4 = this.field343[var3];
            for (class217 var5 = var4.field3419; var5 != var4; var5 = var5.field3419) {
                var2++;
            }
        }
        field336++;
        return var2;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(I)V", line = 287)
    public class29(int arg0) {
        this.field343 = new class217[arg0];
        this.field332 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class217 var3 = this.field343[var2] = new class217();
            var3.field3424 = var3;
            var3.field3419 = var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)I", line = 309)
    public final int method206(int arg0) {
        field346++;
        return arg0 == 255 ? this.field332 : -120;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V", line = 321)
    public final void method207(int arg0) {
        if (arg0 != 1186224976) {
            return;
        }
        field333++;
        for (int var2 = 0; var2 < this.field332; var2++) {
            class217 var3 = this.field343[var2];
            while (true) {
                class217 var4 = var3.field3419;
                if (var3 == var4) {
                    break;
                }
                var4.method1554((byte) -107);
            }
        }
        this.field344 = null;
        this.field351 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lwj;JI)V", line = 356)
    public final void method208(class217 arg0, long arg1, int arg2) {
        if (arg0.field3424 != null) {
            arg0.method1554((byte) -80);
        }
        field352++;
        class217 var5 = this.field343[(int) ((long) (this.field332 - 1) & arg1)];
        if (arg2 != 0) {
            return;
        }
        arg0.field3419 = var5;
        arg0.field3424 = var5.field3424;
        arg0.field3418 = arg1;
        arg0.field3424.field3419 = arg0;
        arg0.field3419.field3424 = arg0;
    }
}
