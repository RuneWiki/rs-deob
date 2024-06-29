import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class268 {

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public int field4507 = -1;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "Ljava/util/Random;")
    public static Random field4514 = new Random();

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "[I")
    public static int[] field4519 = new int[128];

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Z")
    public static boolean field4518 = true;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "Lwm;")
    public static class152 field4523 = class157.method1048("Verbindung zum Update)2Server hergestellt)3", 124);

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field4521 = 20;

    @OriginalMember(owner = "client!jh", name = "s", descriptor = "I")
    public static volatile int field4524 = 0;

    @OriginalMember(owner = "client!jh", name = "v", descriptor = "I")
    public static int field4527 = 0;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public int field4506;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public int field4508;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field4509;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public int field4510;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public int field4511;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field4513;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public int field4515;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public int field4517;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!jh", name = "t", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!jh", name = "u", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!jh", name = "w", descriptor = "Lsd;")
    public static class27 field4528;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "[I")
    public static int[] field4522;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1831(int arg0) {
        field4509++;
        if (!class70.field1016) {
            class273.field4688[0] = 1004;
            class83.field1156[0] = class321.field5607;
            if (class18.field251 != 0) {
                class195.field3134 = class94.field1349;
                class247.field4134 = class162.field2566;
            } else if (class61.field921 == 0) {
                class247.field4134 = class278.field4763;
                class195.field3134 = class254.field4397;
            } else {
                class247.field4134 = class193.field3066;
                class195.field3134 = class62.field944;
            }
            class123.field1734[0] = class57.field880;
            class55.field864[0] = class201.field3252;
            class160.field2556 = 1;
        }
        if (class253.field4387 != -1) {
            class206.method1391(1, class253.field4387);
        }
        for (int var1 = 0; var1 < class121.field1709; var1++) {
            if (class249.field4170[var1]) {
                class206.field3360[var1] = true;
            }
            class241.field3946[var1] = class249.field4170[var1];
            class249.field4170[var1] = false;
        }
        class142.field2194 = class142.field2187;
        class288.field4867 = -1;
        class208.field3394 = null;
        class279.field4767 = arg0;
        if (class217.field3516) {
            class243.field4027 = true;
        }
        class93.field1324 = null;
        if (class253.field4387 != -1) {
            class121.field1709 = 0;
            class152.method1001(true);
        }
        if (class217.field3516) {
            class13.method81();
        } else {
            class96.method629();
        }
        class306.method2131((byte) 120);
        if (class70.field1016) {
            if (class180.field2874) {
                class46.method319(false);
            } else {
                class152.method996(-107);
            }
        } else if (class93.field1324 != null) {
            class89.method588(19049, class93.field1324, class123.field1731, class136.field2084);
        } else if (class288.field4867 != -1) {
            class89.method588(arg0 + 19050, (class127) null, class288.field4867, class279.field4767);
        }
        int var2 = class70.field1016 ? -1 : class159.method1073(2);
        if (var2 == -1) {
            var2 = class92.field1283;
        }
        class299.method2097(-271, var2);
        if (class194.field3098 == 1) {
            class194.field3098 = 2;
        }
        if (class10.field131 == 1) {
            class10.field131 = 2;
        }
        if (class288.field4868 == 3) {
            for (int var3 = 0; var3 < class121.field1709; var3++) {
                if (class241.field3946[var3]) {
                    if (class217.field3516) {
                        class13.method74(class288.field4874[var3], class286.field4847[var3], class227.field3695[var3], class174.field2788[var3], 16711935, 128);
                    } else {
                        class96.method644(class288.field4874[var3], class286.field4847[var3], class227.field3695[var3], class174.field2788[var3], 16711935, 128);
                    }
                } else if (class206.field3360[var3]) {
                    if (class217.field3516) {
                        class13.method74(class288.field4874[var3], class286.field4847[var3], class227.field3695[var3], class174.field2788[var3], 16711680, 128);
                    } else {
                        class96.method644(class288.field4874[var3], class286.field4847[var3], class227.field3695[var3], class174.field2788[var3], 16711680, 128);
                    }
                }
            }
        }
        class215.method1444(1, class23.field400, class85.field1176.field4231, class85.field1176.field4162, class277.field4740);
        class277.field4740 = 0;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V", line = 153)
    public static void method1832(int arg0) {
        field4514 = null;
        field4523 = null;
        field4519 = null;
        if (arg0 == -26638) {
            field4522 = null;
            field4528 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIB)V", line = 205)
    public static final void method1833(int arg0, int arg1, byte arg2) {
        field4512++;
        class183 var3 = class205.field3353[class23.field400][arg0][arg1];
        if (var3 == null) {
            class11.method56(class23.field400, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class230 var5 = null;
        for (class230 var6 = (class230) var3.method1221((byte) 121); var6 != null; var6 = (class230) var3.method1223(113)) {
            class312 var7 = class189.method1253((byte) 86, var6.field3756.field2071);
            int var8 = var7.field5403;
            if (var7.field5375 == 1) {
                var8 = (var6.field3756.field2074 + 1) * var8;
            }
            if (var8 > var4) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class11.method56(class23.field400, arg0, arg1);
            return;
        }
        var3.method1213(var5, -4087);
        class135 var9 = null;
        class135 var10 = null;
        for (class230 var11 = (class230) var3.method1221((byte) 69); var11 != null; var11 = (class230) var3.method1223(97)) {
            class135 var12 = var11.field3756;
            if (var5.field3756.field2071 != var12.field2071) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field2071 != var12.field2071 && var10 == null) {
                    var10 = var12;
                }
            }
        }
        int var13 = -39 / ((54 - arg2) / 39);
        long var14 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class269.method1840(class23.field400, arg0, arg1, class154.method1031(104, arg0 * 128 + 64, class23.field400, arg1 * 128 + 64), var5.field3756, var14, var9, var10);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Laa;Z)V", line = 288)
    public static final void method1834(class9 arg0, boolean arg1) {
        field4516++;
        if (!arg1) {
            field4523 = (class152) null;
        }
        class97.field1384 = arg0;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLah;)V", line = 307)
    public static final void method1835(byte arg0, class205 arg1) {
        if (arg0 > 31) {
            field4520++;
            class275.field4702 = arg1;
        }
    }
}
