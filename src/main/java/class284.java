import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class284 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public int field4766 = 0;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "Z")
    public boolean field4772 = false;

    @OriginalMember(owner = "client!og", name = "r", descriptor = "I")
    public int field4778 = 0;

    @OriginalMember(owner = "client!og", name = "o", descriptor = "Lhi;")
    public static class82 field4775 = class95.method664((byte) -47, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!og", name = "k", descriptor = "I")
    public static int field4771 = 255;

    @OriginalMember(owner = "client!og", name = "s", descriptor = "Lhi;")
    public static class82 field4779 = class95.method664((byte) -52, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field4765;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!og", name = "m", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!og", name = "p", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!og", name = "q", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lum;")
    public static class222 field4764;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "Lej;")
    public class46 field4761;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "Ljf;")
    public static class86 field4763;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field4769;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V", line = 5)
    public static void method1970(int arg0) {
        field4775 = null;
        field4779 = null;
        if (arg0 != 0) {
            field4763 = (class86) null;
        }
        field4763 = null;
        field4764 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BII[S[Lhi;)V", line = 19)
    public static final void method1971(byte arg0, int arg1, int arg2, short[] arg3, class82[] arg4) {
        if (arg0 != -80) {
            return;
        }
        field4768++;
        if (arg1 <= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        class82 var6 = arg4[var5];
        arg4[var5] = arg4[arg1];
        int var7 = arg2;
        arg4[arg1] = var6;
        short var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        for (int var9 = arg2; var9 < arg1; var9++) {
            if (var6 == null || arg4[var9] != null && arg4[var9].method565(-11645, var6) < (var9 & 0x1)) {
                class82 var10 = arg4[var9];
                arg4[var9] = arg4[var7];
                arg4[var7] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var7];
                arg3[var7++] = var11;
            }
        }
        arg4[arg1] = arg4[var7];
        arg4[var7] = var6;
        arg3[arg1] = arg3[var7];
        arg3[var7] = var8;
        method1971((byte) -80, var7 - 1, arg2, arg3, arg4);
        method1971((byte) -80, arg1, var7 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)I", line = 77)
    public static final int method1972(byte arg0) {
        field4776++;
        if (class48.field795 != null) {
            return 3;
        }
        int var1 = -19 % ((arg0 + 63) / 62);
        if (class147.field2485 && class182.field3112) {
            return 2;
        } else if (class147.field2485 && !class182.field3112) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZ)Lkl;", line = 110)
    public static final class35 method1973(int arg0, boolean arg1) {
        field4762++;
        class35 var2 = (class35) class68.field1056.method2175((long) arg0, 3008);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class249.field4296.method1577(class50.method356(arg0, arg1), class277.method1928(arg0, -8015), -29569);
        class35 var4 = new class35();
        if (var3 != null) {
            var4.method268(-14464, new class153(var3));
        }
        var4.method272(8447);
        class68.field1056.method2169(var4, (long) arg0, (byte) 94);
        return var4;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)[Ljm;", line = 138)
    public static final class303[] method1974(byte arg0) {
        class303[] var1 = new class303[class212.field3714];
        if (arg0 != -70) {
            field4771 = -22;
        }
        field4773++;
        for (int var2 = 0; var2 < class212.field3714; var2++) {
            byte[] var3 = class260.field4453[var2];
            int var4 = class42.field747[var2] * class107.field1897[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class142.field2427[class277.method1935(var3[var6], 255)];
            }
            var1[var2] = new class303(class285.field4793, class28.field381, class86.field1536[var2], class20.field262[var2], class107.field1897[var2], class42.field747[var2], var5);
        }
        class3.method23(286013516);
        return var1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIILpa;)Lpa;", line = 181)
    public static final class155 method1975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class155 arg6) {
        field4765++;
        long var7 = (long) arg1;
        class155 var9 = (class155) class175.field3038.method2175(var7, 3008);
        if (var9 == null) {
            class174 var10 = class174.method1243(field4764, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1242(64, 768, -50, -10, -50);
            class175.field3038.method2169(var9, var7, (byte) 94);
        }
        if (arg3 != -50) {
            field4764 = (class222) null;
        }
        int var11 = arg6.method214();
        int var12 = arg6.method186();
        int var13 = arg6.method194();
        int var14 = arg6.method237();
        class155 var15 = var9.method196(true, true);
        if (arg0 != 0) {
            var15.method240(arg0);
        }
        if (class147.field2485) {
            class30 var18 = (class30) var15;
            if (arg5 != class21.method145(arg4 + var11, arg2 + var13, class297.field5058, (byte) 25) || class21.method145(arg4 + var12, arg2 + var14, class297.field5058, (byte) -96) != arg5) {
                for (int var19 = 0; var19 < var18.field407; var19++) {
                    var18.field422[var19] += class21.method145(var18.field427[var19] + arg4, var18.field418[var19] - -arg2, class297.field5058, (byte) 46) - arg5;
                }
                var18.field428.field4614 = false;
                var18.field419.field4772 = false;
            }
        } else {
            class318 var16 = (class318) var15;
            if (arg5 != class21.method145(arg4 + var11, arg2 + var13, class297.field5058, (byte) 43) || arg5 != class21.method145(arg4 + var12, arg2 + var14, class297.field5058, (byte) -114)) {
                for (int var17 = 0; var17 < var16.field5472; var17++) {
                    var16.field5474[var17] += class21.method145(var16.field5454[var17] + arg4, var16.field5452[var17] + arg2, class297.field5058, (byte) -104) - arg5;
                }
                var16.field5483 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IB)I", line = 276)
    public static final int method1976(int arg0, byte arg1) {
        if (arg1 != 29) {
            field4763 = (class86) null;
        }
        field4777++;
        return arg0 >>> 8;
    }
}
