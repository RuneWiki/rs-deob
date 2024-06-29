import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class425 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5982;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field5985;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "Lga;")
    public static class420 field5983;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILjava/util/Random;)I", line = 7)
    public static final int method2530(int arg0, int arg1, Random arg2) {
        field5986++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class315.method2071(-126, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = -45 / ((6 - arg0) / 44);
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var4 <= var5);
            return class468.method2759(arg1, var5, 0);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 38)
    public static void method2531(int arg0) {
        field5983 = null;
        if (arg0 != 453851608) {
            field5983 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lkv;IIIII)Lbo;", line = 57)
    public static final class759 method2532(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 25787) {
            return null;
        }
        field5985++;
        if (!arg0.field4218 && (!class315.method2071(arg1 - 25915, arg5) || !class315.method2071(-128, arg2))) {
            return arg0.field4291 ? new class759(arg0, 34037, arg4, arg3, arg5, arg2, true) : new class759(arg0, arg4, arg3, arg5, arg2, class89.method631((byte) 113, arg5), class89.method631((byte) -83, arg2), true);
        } else {
            return new class759(arg0, 3553, arg4, arg3, arg5, arg2, true);
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I", line = 77)
    public static final int method2533(int arg0) {
        field5984++;
        if (class469.field6699 == null) {
            return 0;
        } else {
            if (arg0 != -2) {
                field5983 = null;
            }
            return class469.field6699.length * 2;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lha;B)V", line = 92)
    public static final void method2534(class66 arg0, byte arg1) {
        field5982++;
        int var2 = 0;
        int var3 = 0;
        if (class607.field8578) {
            var2 = class17.method143(arg1 ^ 0x69);
            var3 = class638.method3629(19728);
        }
        int var4 = class505.field7233 + var2;
        int var5 = class761.field10487 + var3;
        int var6 = class611.field8627;
        int var7 = class407.field5748 - 3;
        byte var8 = 20;
        class676.method3827(var8, class761.field10487 + var3, (byte) -119, class407.field5748, class674.field9575.method3825((byte) -10, class526.field7494), arg0, class611.field8627, class505.field7233 + var2);
        int var9 = class694.field9812.method3201((byte) 26) + var2;
        if (arg1 != -23) {
            field5983 = null;
        }
        int var10 = class694.field9812.method3197((byte) -125) + var3;
        if (class102.field1282) {
            int var11 = 0;
            for (class4 var12 = (class4) class174.field2456.method2480(381); var12 != null; var12 = (class4) class174.field2456.method2476((byte) 18)) {
                int var16 = var5 + var8 - (-var11 * 16 - 13);
                var11++;
                if ((class505.field7233 + var2) < var9 && var9 < (class505.field7233 + var2 + class611.field8627) && var16 - 13 < var10 && var16 + 4 > var10 && (var12.field49 > 1 || ((class312) var12.field46.field5842.field3126).field4641)) {
                    arg0.method474(class505.field7233 + var2, var16 + -12, class611.field8627, 16, class324.field4858 | 255 - class580.field8207 << 24, 1);
                }
            }
            if (class569.field8059 != null) {
                class676.method3827(var8, class149.field1906, (byte) -52, class204.field2992, class569.field8059.field48, arg0, class126.field1652, class209.field3041);
                int var13 = 0;
                for (class312 var14 = (class312) class569.field8059.field46.method2480(381); var14 != null; var14 = (class312) class569.field8059.field46.method2476((byte) 18)) {
                    int var15 = var13 * 16 + class149.field1906 + var8 + 13;
                    if (class209.field3041 < var9 && var9 < (class209.field3041 + class126.field1652) && (var15 - 13) < var10 && (var15 + 4) > var10 && var14.field4641) {
                        arg0.method474(class209.field3041, var15 - 12, class126.field1652, 16, class324.field4858 | 255 - class580.field8207 << 24, 1);
                    }
                    var13++;
                }
                class542.method3123(arg0, class149.field1906, class204.field2992, var8, class209.field3041, true, class126.field1652);
            }
        } else {
            int var17 = 0;
            for (class312 var18 = (class312) class551.field7826.method2508((byte) -93); var18 != null; var18 = (class312) class551.field7826.method2505((byte) -55)) {
                int var28 = (class543.field7608 - var17 - 1) * 16 + var5 + var8 + 13;
                if (var9 > (class505.field7233 + var2) && var9 < (class505.field7233 + var2 + class611.field8627) && var10 > (var28 - 13) && (var28 + 4) > var10 && var18.field4641) {
                    arg0.method474(class505.field7233 + var2, var28 + -12, class611.field8627, 16, 255 - class580.field8207 << 24 | class324.field4858, 1);
                }
                var17++;
            }
        }
        class542.method3123(arg0, class761.field10487 + var3, class407.field5748, var8, class505.field7233 + var2, true, class611.field8627);
        if (class102.field1282) {
            int var22 = 0;
            for (class4 var23 = (class4) class174.field2456.method2480(381); var23 != null; var23 = (class4) class174.field2456.method2476((byte) 18)) {
                int var27 = var22 * 16 + class761.field10487 + var3 - (-var8 + -13);
                var22++;
                if (var23.field49 == 1) {
                    class270.method1760(-644747552, arg0, (class312) var23.field46.field5842.field3126, class505.field7233 + var2, var10, class407.field5748, var27, class229.field3331 | 0xFF000000, class611.field8627, class761.field10487 + var3, class3.field44 | 0xFF000000, var9);
                } else {
                    class359.method2255(class761.field10487 + var3, var9, class407.field5748, class611.field8627, var27, var10, arg0, 3, class505.field7233 + var2, class3.field44 | 0xFF000000, var23, class229.field3331 | 0xFF000000);
                }
            }
            if (class569.field8059 != null) {
                int var24 = 0;
                for (class312 var25 = (class312) class569.field8059.field46.method2480(381); var25 != null; var25 = (class312) class569.field8059.field46.method2476((byte) 18)) {
                    int var26 = class149.field1906 + var8 + (var24 * 16) + 13;
                    var24++;
                    class270.method1760(-644747552, arg0, var25, class209.field3041, var10, class204.field2992, var26, class229.field3331 | 0xFF000000, class126.field1652, class149.field1906, class3.field44 | 0xFF000000, var9);
                }
                class601.method3478(107, class204.field2992, class209.field3041, class149.field1906, class126.field1652);
            }
        } else {
            int var19 = 0;
            for (class312 var20 = (class312) class551.field7826.method2508((byte) 121); var20 != null; var20 = (class312) class551.field7826.method2505((byte) -55)) {
                int var21 = (class543.field7608 - var19 - 1) * 16 + (var5 + var8 + 13);
                var19++;
                class270.method1760(-644747552, arg0, var20, var4, var10, var7, var21, class229.field3331 | 0xFF000000, var6, var5, class3.field44 | 0xFF000000, var9);
            }
        }
        class601.method3478(arg1 + 118, class407.field5748, class505.field7233 + var2, class761.field10487 + var3, class611.field8627);
    }
}
