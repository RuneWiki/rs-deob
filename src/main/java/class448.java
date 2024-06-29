import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class448 extends class337 {

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    private int field6557;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "Lob;")
    public static class521 field6556 = new class521(19, 8);

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field6562 = 0;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[F")
    public static float[] field6561 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "Lmf;")
    public static class291 field6563;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BILhp;)V", line = 3)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        int var4 = -93 / ((82 - arg0) / 40);
        if (~arg1 == -1) {
            this.field6557 = (arg2.method1515((byte) 123) << 12) / 255;
        }
        ++field6564;
    }

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "(I)Lqj;", line = 29)
    public static final class355 method2743(int arg0) {
        ++field6559;
        try {
            return arg0 != 29627 ? null : (class355) Class.forName("be").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I", line = 46)
    public final int[] method179(int arg0, byte arg1) {
        ++field6560;
        int[] var3 = super.field5007.method512(arg0, arg1 + 11);
        if (super.field5007.field687) {
            class414.method2602(var3, 0, class402.field5977, this.field6557);
        }
        if (arg1 != -11) {
            field6561 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lug;)V", line = 68)
    public static final void method2744(class396 arg0) {
        if (class316.field4756 < 65535) {
            class470 var1 = arg0.field5918;
            class503.field7256[class316.field4756] = arg0;
            class455.field6629[class316.field4756] = false;
            ++class316.field4756;
            int var2 = arg0.field5920;
            if (arg0.field5913) {
                var2 = 0;
            }
            int var3 = arg0.field5920;
            if (arg0.field5911) {
                var3 = class213.field3467 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2833((byte) 94) - var1.method2838((byte) -107) + class5.field63 >> class163.field2415;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2833((byte) 77) + var1.method2838((byte) -125) - class5.field63 >> class163.field2415;
                if (var7 >= class385.field5799) {
                    var7 = class385.field5799 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field5927[var5++];
                    int var10 = (var1.method2835(-30143) - var1.method2838((byte) -105) + class5.field63 >> class163.field2415) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class497.field7147) {
                        var11 = class497.field7147 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class329.field4942[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class329.field4942[var4][var12][var8] = var13 | (long) class316.field4756;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class329.field4942[var4][var12][var8] = var13 | (long) class316.field4756 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class329.field4942[var4][var12][var8] = var13 | (long) class316.field4756 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class329.field4942[var4][var12][var8] = var13 | (long) class316.field4756 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 160)
    public class448() {
        this(4096);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V", line = 196)
    public class448(int arg0) {
        super(0, true);
        this.field6557 = 4096;
        this.field6557 = arg0;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 169)
    public static void method2745(boolean arg0) {
        field6563 = null;
        if (!arg0) {
            method2745(false);
        }
        field6561 = null;
        field6556 = null;
    }
}
