import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 implements Runnable {

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "[Lle;")
    public volatile class81[] field231 = new class81[2];

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
    public volatile boolean field226 = false;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Z")
    public volatile boolean field236 = false;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "[[I")
    public static int[][] field228 = new int[104][104];

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Loa;")
    public static class98 field233 = class38.method349(255, "Hier wechseln");

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Loa;")
    public static class98 field230 = class38.method349(255, "Versteckt");

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Loa;")
    public static class98 field234 = class38.method349(255, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[Lbd;")
    public static class12[] field242 = new class12[4];

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Loa;")
    public static class98 field235 = class38.method349(255, "::");

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "Loa;")
    private static class98 field239 = class38.method349(255, "New User");

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
    public static int[] field227 = new int[500];

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
    public static int field243 = 0;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Loa;")
    public static class98 field232 = field239;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Loa;")
    public static class98 field241 = class38.method349(255, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "[Ltd;")
    public static class132[] field244;

    @OriginalMember(owner = "client!bc", name = "run", descriptor = "()V")
    public final void run() {
        field245++;
        this.field236 = true;
        try {
            while (!this.field226) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class81 var2 = this.field231[var1];
                    if (var2 != null) {
                        var2.method653(5000);
                    }
                }
                class82.method691(10L, (byte) -92);
                class137.method1108(13170, false);
            }
        } catch (Exception var4) {
            class75.method617(58, null, var4);
        }
        this.field236 = false;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method121(int arg0) {
        class126.field2792.method714(-57);
        class137.field3348.method830(0, arg0);
        class66.method534();
        field237++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Luc;")
    public static final class137 method122(int arg0, int arg1) {
        field240++;
        class137 var2 = (class137) class32.field751.method730((byte) 35, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class26.field639.method1058(9, 48, arg0);
        class137 var4 = new class137();
        var4.field3336 = arg0;
        if (var3 != null) {
            var4.method1111(new class8(var3), true);
        }
        var4.method1115(1766);
        if (arg1 <= 92) {
            method122(-105, 120);
        }
        class32.field751.method732(-1, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static void method123(int arg0) {
        field233 = null;
        if (arg0 != -28427) {
            return;
        }
        field234 = null;
        field239 = null;
        field230 = null;
        field228 = null;
        field235 = null;
        field227 = null;
        field242 = null;
        field244 = null;
        field241 = null;
        field232 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lhf;IBII)V")
    public static final void method124(class55 arg0, int arg1, byte arg2, int arg3, int arg4) {
        field225++;
        if (class73.field1536 == arg0 || class80.field1780 >= 400) {
            return;
        }
        class98 var5;
        if (arg0.field1209 == 0) {
            var5 = class102.method840(new class98[] { arg0.field1212, class15.method153(5, arg0.field1204, class73.field1536.field1204), class75.field1652, class18.field383, class132.method1074(arg0.field1204, (byte) 41), class96.field2211 }, arg2 ^ 0x48);
        } else {
            var5 = class102.method840(new class98[] { arg0.field1212, class75.field1652, class64.field1371, class132.method1074(arg0.field1209, (byte) -96), class96.field2211 }, 10);
        }
        if (class119.field2669 == 1) {
            class112.field2501++;
            class118.method935(arg4, class71.field1448, 13, arg2 - 23126, arg3, class102.method840(new class98[] { class102.field2354, class76.field1666, var5 }, 10), arg1);
        } else if (!class113.field2555) {
            for (int var6 = 4; var6 >= 0; var6--) {
                if (class129.field2931[var6] != null) {
                    class51.field1129++;
                    short var8 = 0;
                    if (class129.field2931[var6].method782(arg2 - 67, class123.field2753)) {
                        if (arg0.field1204 > class73.field1536.field1204) {
                            var8 = 2000;
                        }
                        if (class73.field1536.field1231 != 0 && arg0.field1231 != 0) {
                            if (class73.field1536.field1231 == arg0.field1231) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class140.field3422[var6]) {
                        var8 = 2000;
                    }
                    int var9 = 0;
                    if (var6 == 0) {
                        var9 = var8 + 50;
                    }
                    if (var6 == 1) {
                        var9 = var8 + 2;
                    }
                    if (var6 == 2) {
                        var9 = var8 + 37;
                    }
                    if (var6 == 3) {
                        var9 = var8 + 43;
                    }
                    if (var6 == 4) {
                        var9 = var8 + 21;
                    }
                    class118.method935(arg4, class129.field2931[var6], var9, -23060, arg3, class102.method840(new class98[] { class146.field3549, var5 }, 10), arg1);
                }
            }
        } else if ((class77.field1696 & 0x8) == 8) {
            class118.method935(arg4, class91.field2111, 15, arg2 - 23126, arg3, class102.method840(new class98[] { class149.field3674, class76.field1666, var5 }, 10), arg1);
            class138.field3374++;
        }
        for (int var7 = 0; var7 < class80.field1780; var7++) {
            if (field227[var7] == 56) {
                class32.field781[var7] = class102.method840(new class98[] { class94.field2150, class64.field1376, class146.field3549, var5 }, 10);
                break;
            }
        }
        if (arg2 != 66) {
            field234 = null;
        }
    }
}
