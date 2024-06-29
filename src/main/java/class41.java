import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class41 extends class60 implements class209 {

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "I")
    private int field842;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "Lqv;")
    public static class316 field844 = new class316(91, 6);

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field851 = 1;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "Z")
    public static boolean field852 = false;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Lth;")
    public static class431 field848;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I", line = 5)
    public final int method408(byte arg0) {
        ++field845;
        if (arg0 != -62) {
            field851 = 106;
        }
        return this.field842;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)V", line = 17)
    public static void method409(byte arg0) {
        field844 = null;
        field848 = null;
        if (arg0 != 42) {
            field844 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lbt;I[BI)V", line = 29)
    public class41(class33 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field842 = arg1;
    }

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "(B)V", line = 38)
    public static final void method410(byte arg0) {
        int var1 = -113 % ((arg0 - 9) / 50);
        class336.field4966.method2477(-129);
        ++field849;
        int var2 = class336.field4966.method2487(8, -19);
        if (~var2 > ~class477.field6952) {
            for (int var3 = var2; var3 < class477.field6952; ++var3) {
                class202.field3122[class132.field2064++] = class483.field7012[var3];
            }
        }
        if (~var2 < ~class477.field6952) {
            throw new RuntimeException("gnpov1");
        } else {
            class477.field6952 = 0;
            for (int var4 = 0; var4 < var2; ++var4) {
                int var5 = class483.field7012[var4];
                class279 var6 = ((class193) class390.field5539.method2284(true, (long) var5)).field2805;
                int var7 = class336.field4966.method2487(1, -37);
                if (~var7 == -1) {
                    class483.field7012[class477.field6952++] = var5;
                    var6.field237 = class24.field349;
                } else {
                    int var8 = class336.field4966.method2487(2, -47);
                    if (var8 == 0) {
                        class483.field7012[class477.field6952++] = var5;
                        var6.field237 = class24.field349;
                        class56.field1009[class162.field2458++] = var5;
                    } else if (~var8 == -2) {
                        class483.field7012[class477.field6952++] = var5;
                        var6.field237 = class24.field349;
                        int var9 = class336.field4966.method2487(3, -1);
                        var6.method1800(1, var9, (byte) 47);
                        int var10 = class336.field4966.method2487(1, -99);
                        if (~var10 == -2) {
                            class56.field1009[class162.field2458++] = var5;
                        }
                    } else if (var8 == 2) {
                        class483.field7012[class477.field6952++] = var5;
                        var6.field237 = class24.field349;
                        if (~class336.field4966.method2487(1, -37) == -2) {
                            int var11 = class336.field4966.method2487(3, -19);
                            var6.method1800(2, var11, (byte) 47);
                            int var12 = class336.field4966.method2487(3, -68);
                            var6.method1800(2, var12, (byte) 47);
                        } else {
                            int var13 = class336.field4966.method2487(3, -31);
                            var6.method1800(0, var13, (byte) 47);
                        }
                        int var14 = class336.field4966.method2487(1, -36);
                        if (~var14 == -2) {
                            class56.field1009[class162.field2458++] = var5;
                        }
                    } else if (~var8 == -4) {
                        class202.field3122[class132.field2064++] = var5;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(III)Lue;", line = 151)
    public static final class159 method411(int arg0, int arg1, int arg2) {
        ++field843;
        class159 var3 = new class159();
        var3.field2440 = -1;
        var3.field2441 = arg2 + 1 + 5;
        var3.field2437 = -1;
        var3.field2438 = arg1 + 6;
        int var4 = 125 / ((3 - arg0) / 61);
        var3.field2427 = new int[var3.field2438][var3.field2441];
        var3.method1129((byte) -43);
        return var3;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "([BIII)V", line = 170)
    public final void method412(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method510(arg0, arg3);
        ++field846;
        this.field842 = arg1;
        if (arg2 != 23432) {
            field852 = true;
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(B)I", line = 182)
    public final int method413(byte arg0) {
        ++field847;
        int var2 = 126 / ((-55 - arg0) / 49);
        return 0;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)J", line = 192)
    public final long method414(byte arg0) {
        if (arg0 < 46) {
            method409((byte) 13);
        }
        ++field850;
        return super.field1080.method2641();
    }
}
