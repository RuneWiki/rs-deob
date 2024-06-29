import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class374 extends class143 {

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    private int field5182;

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "Leda;")
    public static class116 field5186 = new class116(71, 3);

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "Leda;")
    public static class116 field5190 = new class116(76, 10);

    @OriginalMember(owner = "client!hea", name = "L", descriptor = "S")
    public static short field5193 = 256;

    @OriginalMember(owner = "client!hea", name = "B", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!hea", name = "J", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!hea", name = "M", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!hea", name = "N", descriptor = "Llba;")
    public static class198 field5195;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "[Lge;")
    public class15[] field5192;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "[[B")
    private byte[][] field5188;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIZ)Z", line = 5)
    public static final boolean method2232(int arg0, int arg1, boolean arg2) {
        field5191++;
        if (arg2) {
            return (arg1 & 0x22) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "(B)V", line = 17)
    public static final void method2233(byte arg0) {
        field5194++;
        for (class133 var1 = (class133) class557.field8142.method3905(-113); var1 != null; var1 = (class133) class557.field8142.method3899(arg0 + 93)) {
            class489 var2 = var1.field2152;
            if (var2.field7004 < class148.field2508) {
                var1.method2549((byte) 117);
                var2.method2861(false);
            } else if (var2.field6989 <= class148.field2508) {
                if (var2.field7008 > 0) {
                    class6 var3 = (class6) class314.field4359.method2818(-22803, (long) (var2.field7008 - 1));
                    if (var3 != null) {
                        class88 var4 = var3.field49;
                        if (var4.field3155 >= 0 && var4.field3155 < class430.field6136 * 512 && var4.field3154 >= 0 && class580.field8504 * 512 > var4.field3154) {
                            var2.method2860(class148.field2508, (byte) 122, var4.field3154, var4.field3155, class603.method3433(var4.field3154, var2.field3158, var4.field3155, arg0 ^ 0x2E) - var2.field6999);
                        }
                    }
                }
                if (var2.field7008 < 0) {
                    int var5 = -var2.field7008 - 1;
                    class270 var6;
                    if (class609.field8749 == var5) {
                        var6 = class103.field1708;
                    } else {
                        var6 = class76.field1186[var5];
                    }
                    if (var6 != null && var6.field3155 >= 0 && class430.field6136 * 512 > var6.field3155 && var6.field3154 >= 0 && var6.field3154 < (class580.field8504 * 512)) {
                        var2.method2860(class148.field2508, (byte) 85, var6.field3154, var6.field3155, class603.method3433(var6.field3154, var2.field3158, var6.field3155, arg0 + 48) - var2.field6999);
                    }
                }
                var2.method2857((byte) 113, class193.field2993);
                class333.method1985(var2, true);
            }
        }
        if (arg0 != -93) {
            method2236((byte) -11);
        }
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(IB)Z", line = 81)
    public final boolean method2234(int arg0, byte arg1) {
        if (arg1 != 61) {
            this.field5192 = null;
        }
        field5187++;
        return this.field5192[arg0].field235;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(II)Z", line = 93)
    public final boolean method2235(int arg0, int arg1) {
        field5185++;
        if (arg0 != -29895) {
            this.field5182 = -96;
        }
        return this.field5192[arg1].field248;
    }

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "(B)V", line = 105)
    public static final void method2236(byte arg0) {
        field5183++;
        if (class407.field5837) {
            return;
        }
        int var1 = 73 / ((59 - arg0) / 54);
        if (class525.field7713.field5977) {
            class636.field9031 = ((int) class636.field9031 - 17 & 0xFFFFFFF0);
        } else {
            class609.field8756 += (-12.0F - class609.field8756) / 2.0F;
        }
        class407.field5837 = true;
        class406.field5822 = true;
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 131)
    public static void method2237(int arg0) {
        field5195 = null;
        field5190 = null;
        if (arg0 != 0) {
            method2233((byte) -7);
        }
        field5186 = null;
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(II)Z", line = 144)
    public final boolean method2238(int arg0, int arg1) {
        if (arg0 != 1) {
            field5195 = null;
        }
        field5189++;
        return this.field5192[arg1].field234;
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(I)V", line = 169)
    public class374(int arg0) {
        this.field5182 = arg0;
    }

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "(I)Z", line = 178)
    public final boolean method2239(int arg0) {
        field5184++;
        if (this.field5192 != null) {
            return true;
        }
        if (this.field5188 == null) {
            class345 var2 = class319.field4402;
            synchronized (class319.field4402) {
                if (!class319.field4402.method2101((byte) -59, this.field5182)) {
                    return false;
                }
                int[] var4 = class319.field4402.method2093(this.field5182, false);
                this.field5188 = new byte[var4.length][];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    this.field5188[var5] = class319.field4402.method2081(46, var4[var5], this.field5182);
                }
            }
        }
        boolean var6 = true;
        for (int var7 = 0; var7 < this.field5188.length; var7++) {
            byte[] var8 = this.field5188[var7];
            class465 var9 = new class465(var8);
            var9.field6710 = 1;
            int var10 = var9.method2755((byte) -110);
            class345 var11 = class689.field9781;
            synchronized (class689.field9781) {
                var6 &= class689.field9781.method2077(arg0 + 7962, var10);
            }
        }
        if (!var6) {
            return false;
        }
        class692 var12 = new class692();
        if (arg0 != -7962) {
            field5190 = null;
        }
        class345 var13 = class319.field4402;
        int[] var15;
        synchronized (class319.field4402) {
            int var14 = class319.field4402.method2098(0, this.field5182);
            this.field5192 = new class15[var14];
            var15 = class319.field4402.method2093(this.field5182, false);
        }
        for (int var16 = 0; var16 < var15.length; var16++) {
            byte[] var17 = this.field5188[var16];
            class465 var18 = new class465(var17);
            var18.field6710 = 1;
            int var19 = var18.method2755((byte) -91);
            class21 var20 = null;
            for (class21 var21 = (class21) var12.method3905(arg0 + 7854); var21 != null; var21 = (class21) var12.method3899(0)) {
                if (var21.field288 == var19) {
                    var20 = var21;
                    break;
                }
            }
            if (var20 == null) {
                class345 var22 = class689.field9781;
                synchronized (class689.field9781) {
                    var20 = new class21(var19, class689.field9781.method2086(1024, var19));
                }
                var12.method3904(var20, 0);
            }
            this.field5192[var15[var16]] = new class15(var17, var20);
        }
        this.field5188 = null;
        return true;
    }
}
