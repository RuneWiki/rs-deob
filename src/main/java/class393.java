import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class393 {

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "Lbh;")
    private class538 field5469 = new class538(256);

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "Ld;")
    private class268 field5470;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "Lep;")
    private class371 field5468;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Lgca;")
    public static class209 field5473 = new class209(16);

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field5475 = -1;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "[I")
    public static int[] field5476 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
    public static int field5477 = 2;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIZI)I")
    public static final int method2391(int arg0, int arg1, boolean arg2, int arg3) {
        field5465++;
        class344 var4 = class70.method444(arg3, arg2, arg0 - 2147483647);
        if (var4 == null) {
            return -1;
        } else if (~arg1 <= arg0 && var4.field4392.length > arg1) {
            return var4.field4392[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
    public static void method2392(byte arg0) {
        if (arg0 != -69) {
            field5476 = null;
        }
        field5476 = null;
        field5473 = null;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)Z")
    public static final boolean method2393(int arg0, int arg1) {
        field5472++;
        if (class325.field4188[arg0]) {
            return true;
        } else if (!class602.field8614.method3337(-78, arg0)) {
            return false;
        } else if (arg1 == -1) {
            int var2 = class602.field8614.method3333(arg0, arg1 ^ 0xFFFFF28C);
            if (var2 == 0) {
                class325.field4188[arg0] = true;
                return true;
            }
            if (class491.field6599[arg0] == null) {
                class491.field6599[arg0] = new class712[var2];
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class491.field6599[arg0][var3] == null) {
                    byte[] var4 = class602.field8614.method3322(arg0, var3, (byte) 119);
                    if (var4 != null) {
                        class712 var5 = class491.field6599[arg0][var3] = new class712();
                        var5.field9998 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method4012(new class26(var4), 0);
                    }
                }
            }
            class325.field4188[arg0] = true;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public static final void method2394(int arg0) {
        class298.field3905 = 0;
        class575.field8126++;
        field5471++;
        class417.field5805 = 0;
        class683.method3902(0);
        if (arg0 != -15586) {
            return;
        }
        class634.method3687(arg0 + 31795);
        class319.method1851(arg0 ^ 0xFFFFC341);
        boolean var1 = false;
        for (int var2 = 0; var2 < class417.field5805; var2++) {
            int var5 = class52.field743[var2];
            class15 var6 = (class15) class403.field5587.method1381(true, (long) var5);
            class55 var7 = var6.field204;
            if (class484.field6549 && class99.method670(-65, var5)) {
                class638.method3711(arg0 ^ 0xF51B7D72);
            }
            if (class575.field8126 != var7.field8367) {
                if (var7.field771.method56(100)) {
                    class502.method3002(var7, false);
                }
                var7.method379(null, -123);
                var6.method3065(-17363);
                var1 = true;
            }
        }
        if (var1) {
            class287.field3776 = class403.field5587.method1388(false);
            class403.field5587.method1384(arg0 ^ 0xFFFFC31E, class312.field4003);
        }
        if (class542.field7582 != class150.field2065.field330) {
            throw new RuntimeException("gnp1 pos:" + class150.field2065.field330 + " psize:" + class542.field7582);
        }
        for (int var3 = 0; var3 < class676.field9533; var3++) {
            if (class403.field5587.method1381(true, (long) class731.field10231[var3]) == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class676.field9533);
            }
        }
        if ((class287.field3776 - class676.field9533) != 0) {
            throw new RuntimeException("gnp3 mis:" + (class287.field3776 - class676.field9533));
        }
        for (int var4 = 0; var4 < class287.field3776; var4++) {
            if (class575.field8126 != class312.field4003[var4].field204.field8367) {
                throw new RuntimeException("gnp4 uk:" + class312.field4003[var4].field204.field8344);
            }
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)Lfq;")
    public final class204 method2395(int arg0, int arg1) {
        field5466++;
        Object var3 = this.field5469.method3200((long) arg1, arg0 - 23536);
        if (var3 != null) {
            return (class204) var3;
        } else if (this.field5470.method86((byte) 117, arg1)) {
            class468 var4 = this.field5470.method91(arg1, arg0 - 26358);
            int var5 = var4.field6391 ? 64 : this.field5468.field4938;
            class204 var7;
            if (var4.field6379 && this.field5468.method569()) {
                float[] var6 = this.field5470.method92(var5, false, arg1, 0.7F, var5, (byte) 122);
                var7 = new class204(this.field5468, 3553, 34842, var5, var5, var4.field6397 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field6393 != 2 && class646.method3743(arg0 ^ 0xD93, var4.field6386)) {
                    var8 = this.field5470.method87(true, var5, 0.7F, var5, true, arg1);
                } else {
                    var8 = this.field5470.method89(0.7F, true, false, var5, arg1, var5);
                }
                var7 = new class204(this.field5468, 3553, 6408, var5, var5, var4.field6397 != 0, var8, 0, 0, false);
            }
            var7.method1364(var4.field6387, var4.field6380, 10242);
            if (arg0 != 3553) {
                this.method2397(-122);
            }
            this.field5469.method3199((byte) 78, var7, (long) arg1);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lep;Ld;)V")
    public class393(class371 arg0, class268 arg1) {
        this.field5470 = arg1;
        this.field5468 = arg0;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public final void method2396(int arg0) {
        this.field5469.method3210(false);
        int var2 = 75 % ((arg0 - 22) / 43);
        field5474++;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
    public final void method2397(int arg0) {
        field5467++;
        if (arg0 != 9672) {
            field5476 = null;
        }
        this.field5469.method3204((byte) 119, 5);
    }
}
