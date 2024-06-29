import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class52 {

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "[S")
    public static short[] field649 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field646 = 0;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "[Lqj;")
    public static class196[] field650 = new class196[500];

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "Lqj;")
    public static class196 field651 = class80.method502("Freie Welt", -48);

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "[I")
    public static int[] field654 = new int[200];

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lqj;")
    public static class196 field644 = class80.method502("<col=00ff00>", -48);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lbk;")
    public static class136 field648;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "Lnb;")
    public static class95 field647;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field643;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "[Lsc;")
    public static class212[] field652;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBIII)V")
    public static final void method274(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class25.method147(arg0, 7, arg2 - arg3, class95.field1380[arg4], arg2 + arg3);
        field645++;
        int var5 = arg3;
        int var6 = 0;
        int var7 = -arg3;
        int var8 = -59 % ((arg1 + 59) / 51);
        int var9 = -1;
        while (var6 < var5) {
            var6++;
            var9 += 2;
            var7 += var9;
            if (var7 >= 0) {
                var5--;
                var7 -= var5 << 1;
                int[] var10 = class95.field1380[arg4 + var5];
                int[] var11 = class95.field1380[arg4 - var5];
                int var12 = arg2 + var6;
                int var13 = arg2 - var6;
                class25.method147(arg0, 7, var13, var10, var12);
                class25.method147(arg0, 7, var13, var11, var12);
            }
            int var14 = arg2 + var5;
            int[] var15 = class95.field1380[arg4 + var6];
            int var16 = arg2 - var5;
            int[] var17 = class95.field1380[arg4 - var6];
            class25.method147(arg0, 7, var16, var15, var14);
            class25.method147(arg0, 7, var16, var17, var14);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)Lwi;")
    public static final class233 method275(boolean arg0) {
        field655++;
        int var1 = class77.field1126[0] * class31.field392[0];
        byte[] var2 = class203.field3645[0];
        class233 var5;
        if (class94.field1375[0]) {
            byte[] var6 = class30.field385[0];
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class1.method6(class84.field1237[class65.method409(var2[var8], 255)], class65.method409(255, var6[var8]) << 24);
            }
            var5 = new class207(class149.field2391, class92.field1347, class234.field4169[0], class240.field4261[0], class77.field1126[0], class31.field392[0], var7);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class84.field1237[class65.method409(255, var2[var4])];
            }
            var5 = new class233(class149.field2391, class92.field1347, class234.field4169[0], class240.field4261[0], class77.field1126[0], class31.field392[0], var3);
        }
        class168.method1099(arg0);
        return var5;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static void method276(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field647 = null;
        field649 = null;
        field652 = null;
        field650 = null;
        field643 = null;
        field651 = null;
        field644 = null;
        field654 = null;
        field648 = null;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static final void method277(int arg0) {
        while (true) {
            if (class229.field4077.method1175(8, class76.field1096) >= 27) {
                int var1 = class229.field4077.method1170(15, (byte) 88);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class153.field2482[var1] == null) {
                        var2 = true;
                        class153.field2482[var1] = new class164();
                    }
                    class164 var3 = class153.field2482[var1];
                    class188.field3295[class63.field863++] = var1;
                    var3.field2055 = class171.field2879;
                    int var4 = class219.field3936[class229.field4077.method1170(3, (byte) 124)];
                    if (var2) {
                        var3.field2077 = var3.field2096 = var4;
                    }
                    int var5 = class229.field4077.method1170(5, (byte) -84);
                    var3.field2648 = class126.method777((byte) -50, class229.field4077.method1170(14, (byte) 113));
                    int var6 = class229.field4077.method1170(1, (byte) 92);
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    int var7 = class229.field4077.method1170(5, (byte) 121);
                    int var8 = class229.field4077.method1170(1, (byte) -121);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var8 == 1) {
                        class104.field1507[class148.field2336++] = var1;
                    }
                    var3.field2097 = var3.field2648.field1583;
                    var3.field2049 = var3.field2648.field1599;
                    var3.field2052 = var3.field2648.field1637;
                    var3.field2082 = var3.field2648.field1611;
                    var3.field2074 = var3.field2648.field1594;
                    var3.field2107 = var3.field2648.field1606;
                    var3.field2108 = var3.field2648.field1618;
                    var3.field2062 = var3.field2648.field1579;
                    if (var3.field2062 == 0) {
                        var3.field2096 = 0;
                    }
                    var3.field2091 = var3.field2648.field1627;
                    var3.method859(var6 == 1, (byte) 110, class102.field1477.field2102[0] + var7, class102.field1477.field2046[0] - -var5);
                    if (var3.field2648.method676((byte) 124)) {
                        class82.method512(null, -127, var3.field2046[0], 0, null, var3, var3.field2102[0], class27.field335);
                    }
                    continue;
                }
            }
            class229.field4077.method1172((byte) -20);
            int var9 = 76 % ((12 - arg0) / 42);
            field642++;
            return;
        }
    }
}
