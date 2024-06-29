import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class475 extends class384 implements class126 {

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    private int field6740;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "Lkk;")
    public static class188 field6744 = new class188(8);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field6742;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "Z")
    public static boolean field6745;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I", line = 3)
    public final int method850(int arg0) {
        int var2 = 62 / ((-70 - arg0) / 45);
        ++field6741;
        return this.field6740;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[B)V", line = 14)
    public final void method851(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != 506) {
            field6744 = null;
        }
        this.method2435(arg3, arg0);
        ++field6746;
        this.field6740 = arg2;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lnj;)V", line = 26)
    public static final void method2840(class244 arg0) {
        if (class101.field1208 < 65535) {
            class465 var1 = arg0.field3265;
            class290.field4085[class101.field1208] = arg0;
            class543.field7583[class101.field1208] = false;
            ++class101.field1208;
            int var2 = arg0.field3253;
            if (arg0.field3258) {
                var2 = 0;
            }
            int var3 = arg0.field3253;
            if (arg0.field3250) {
                var3 = class634.field8744 - 1;
            }
            for (int var4 = var2; var4 <= var3; ++var4) {
                int var5 = 0;
                int var6 = var1.method2773(true) - var1.method2777(-1) + class197.field2617 >> class660.field9038;
                if (var6 < 0) {
                    var5 -= var6;
                    var6 = 0;
                }
                int var7 = var1.method2773(true) + var1.method2777(-1) - class197.field2617 >> class660.field9038;
                if (var7 >= class365.field5171) {
                    var7 = class365.field5171 - 1;
                }
                for (int var8 = var6; var8 <= var7; ++var8) {
                    short var9 = arg0.field3252[var5++];
                    int var10 = (var1.method2772(false) - var1.method2777(-1) + class197.field2617 >> class660.field9038) + (var9 >>> 8);
                    int var11 = (var9 & 255) + var10 - 1;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var11 >= class492.field6939) {
                        var11 = class492.field6939 - 1;
                    }
                    for (int var12 = var10; var12 <= var11; ++var12) {
                        long var13 = class488.field6906[var4][var12][var8];
                        if ((var13 & 65535L) == 0L) {
                            class488.field6906[var4][var12][var8] = var13 | (long) class101.field1208;
                        } else if ((var13 & 4294901760L) == 0L) {
                            class488.field6906[var4][var12][var8] = var13 | (long) class101.field1208 << 16;
                        } else if ((var13 & 281470681743360L) == 0L) {
                            class488.field6906[var4][var12][var8] = var13 | (long) class101.field1208 << 32;
                        } else if ((var13 & -281474976710656L) == 0L) {
                            class488.field6906[var4][var12][var8] = var13 | (long) class101.field1208 << 48;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I", line = 118)
    public final int method852(int arg0) {
        int var2 = 22 / ((-32 - arg0) / 48);
        ++field6742;
        return 0;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)J", line = 131)
    public final long method853(byte arg0) {
        if (arg0 != 42) {
            field6745 = false;
        }
        ++field6747;
        return super.field5474.getAddress();
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Leea;I[BI)V", line = 147)
    public class475(class131 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6740 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IBILjb;)V", line = 155)
    public static final void method2841(int arg0, byte arg1, int arg2, class493 arg3) {
        ++field6743;
        if (arg1 > -25) {
            field6745 = false;
        }
        class486 var4 = arg3.method2944((byte) 125, class268.field3831);
        if (var4 != null) {
            class268.field3831.method469(arg2, arg0, arg3.field7095 + arg2, arg0 - -arg3.field7031);
            if (class454.field6418 < 3) {
                class510.field7297.method671((float) arg3.field7095 / 2.0F + (float) arg2, (float) arg3.field7031 / 2.0F + (float) arg0, 4096, 65532 & (int) (-class552.field7773) << 2, var4, arg2, arg0);
            } else {
                class268.field3831.method447(-16777216, var4, arg2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Leea;ILjaclib/memory/Buffer;)V", line = 180)
    public class475(class131 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field6740 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V", line = 188)
    public static void method2842(int arg0) {
        field6744 = null;
        if (arg0 != 0) {
            method2842(81);
        }
    }
}
