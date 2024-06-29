import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class479 {

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "[[I")
    public static int[][] field6467 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!oja", name = "d", descriptor = "[[I")
    public static int[][] field6469 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!oja", name = "e", descriptor = "I")
    public static int field6470 = 0;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!oja", name = "c", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!oja", name = "f", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!oja", name = "g", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(IZ)V", line = 3)
    public static final void method2742(int arg0, boolean arg1) {
        field6472++;
        class240.field3416.method1874(class369.field5000.method539());
        if (arg0 != -1) {
            method2742(97, true);
        }
        int[] var2 = class369.field5000.method496();
        class600.field8390 = var2[2];
        class621.field8653 = var2[0];
        class169.field2715 = var2[3];
        class262.field3682 = var2[1];
        if (arg1) {
            class369.field5000.method521(class456.field6212, class691.field9595, class53.field766, class614.field8560);
            class546.method3069(class714.field9825, (byte) -45);
        } else {
            class369.field5000.method521(class264.field3719, class5.field107, class383.field5200, class389.field5346);
            class546.method3069(class27.field513, (byte) -32);
        }
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(I)V", line = 31)
    public static void method2743(int arg0) {
        if (arg0 != 1) {
            method2746(false, false);
        }
        field6469 = null;
        field6467 = null;
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(Luv;Z)V", line = 43)
    public static final void method2744(class385 arg0, boolean arg1) {
        field6466++;
        if (arg0.field5222 == null && arg0.field5243 == null) {
            return;
        }
        boolean var2 = true;
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < arg0.field5222.length; var3++) {
            int var4 = -1;
            if (arg0.field5222 != null) {
                var4 = arg0.field5222[var3];
            }
            if (var4 != -1) {
                var2 = false;
                boolean var5 = false;
                boolean var6 = false;
                int var9;
                int var10;
                if ((var4 & 0xC0000000) == -1073741824) {
                    int var13 = var4 & 0xFFFFFFF;
                    int var14 = var13 >> 14;
                    var10 = arg0.field7396 - (var14 - class217.field3198) * 512 - 256;
                    int var15 = var13 & 0x3FFF;
                    var9 = -((var15 - class400.field5510) * 512) - (256 - arg0.field7398);
                } else if ((var4 & 0x8000) == 0) {
                    class755 var7 = (class755) class664.field9216.method337((long) var4, 1);
                    if (var7 == null) {
                        arg0.method2335(var3, -1, (byte) -125);
                        continue;
                    }
                    class666 var8 = var7.field10414;
                    var9 = arg0.field7398 - var8.field7398;
                    var10 = arg0.field7396 - var8.field7396;
                } else {
                    int var11 = var4 & 0x7FFF;
                    class771 var12 = class527.field7150[var11];
                    if (var12 == null) {
                        arg0.method2335(var3, -1, (byte) -127);
                        continue;
                    }
                    var9 = arg0.field7398 - var12.field7398;
                    var10 = arg0.field7396 - var12.field7396;
                }
                if (var10 != 0 || var9 != 0) {
                    arg0.method2335(var3, (int) (Math.atan2((double) var10, (double) var9) * 2607.5945876176133D) & 0x3FFF, (byte) -124);
                }
            } else if (!arg0.method2335(var3, -1, (byte) -77)) {
                var2 = false;
            }
        }
        if (var2) {
            arg0.field5222 = null;
            arg0.field5243 = null;
        }
    }

    @OriginalMember(owner = "client!oja", name = "b", descriptor = "(I)V", line = 162)
    public static final void method2745(int arg0) {
        class43 var1 = class770.field10617;
        synchronized (class770.field10617) {
            class770.field10617.method273(-3);
            if (arg0 <= 83) {
                field6470 = 27;
            }
        }
        field6471++;
    }

    @OriginalMember(owner = "client!oja", name = "a", descriptor = "(ZZ)V", line = 175)
    public static final void method2746(boolean arg0, boolean arg1) {
        if (class193.field2948 != null) {
            class193.field2948.method917(123);
            class193.field2948 = null;
        }
        field6468++;
        class517.field7034 = 0;
        class338.method2113(-62);
        class278.method1786();
        for (int var2 = 0; var2 < 4; var2++) {
            class711.field9798[var2].method2189((byte) -87);
        }
        class656.method3689(false, -201);
        System.gc();
        class228.method1554(2, 2);
        class299.field4117 = arg0;
        class520.field7058 = -1;
        class279.method1787(true);
        class673.method3797(true, 6408);
        class400.field5510 = 0;
        class217.field3198 = 0;
        class666.field9269 = 0;
        class171.field2735 = 0;
        class215.field3195 = 0;
        class712.field9804 = 0;
        for (int var3 = 0; var3 < class13.field198.length; var3++) {
            class13.field198[var3] = null;
        }
        class353.method2160((byte) 113);
        for (int var4 = 0; var4 < 2048; var4++) {
            class527.field7150[var4] = null;
        }
        class610.field8520 = 0;
        class664.field9216.method338((byte) -110);
        class406.field5583 = 0;
        class214.field3181.method338((byte) -87);
        class113.method1026(-21651);
        class27.field510 = 0;
        class694.field9613.method147((byte) 53);
        class118.method1042(8);
        class613.method3469(-474);
        class707.field9714 = null;
        class554.field7831 = null;
        class601.field8410 = null;
        class189.field2905 = 0L;
        class402.field5525 = null;
        class55.field784 = null;
        if (arg1) {
            class139.method1142(2, 12);
            return;
        }
        class139.method1142(2, 3);
        try {
            class729.method4044(class286.field3936, 26693, "loggedout");
        } catch (Throwable var5) {
        }
    }
}
