import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class329 {

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!wt", name = "e", descriptor = "[I")
    public int[] field4679;

    @OriginalMember(owner = "client!wt", name = "c", descriptor = "[I")
    public int[] field4677;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "Ljb;")
    public static class519 field4678 = new class519(27, 6);

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "Luq;")
    public static class172 field4681;

    @OriginalMember(owner = "client!wt", name = "h", descriptor = "Z")
    public static boolean field4682;

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "([Lfq;II)V", line = 4)
    public static final void method2133(class214[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class214 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field2806;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field2806 > (var7 & 0x1) + var6) {
                class214 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method2133(arg0, arg1, var4 - 1);
        method2133(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)I", line = 45)
    public static final int method2134(int arg0, int arg1) {
        field4676++;
        if (arg0 < 96) {
            return 0;
        } else if (arg1 < ~arg0) {
            return 2;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IB[Lofa;)V", line = 60)
    public static final void method2135(int arg0, byte arg1, class347[] arg2) {
        if (arg1 != 41) {
            field4682 = false;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class347 var4 = arg2[var3];
            if (var4 != null && var4.field4921 == arg0 && !client.method2034(var4)) {
                if (var4.field4884 == 0) {
                    method2135(var4.field5003, (byte) 41, arg2);
                    if (var4.field4928 != null) {
                        method2135(var4.field5003, (byte) 41, var4.field4928);
                    }
                    class73 var5 = (class73) class355.field5178.method1248(85, (long) var4.field5003);
                    if (var5 != null) {
                        class451.method2681(-8163, var5.field985);
                    }
                }
                if (var4.field4884 == 6 && var4.field4992 != -1) {
                    class317 var6 = class693.field9223.method2388(var4.field4992, arg1 - 41);
                    if (var6 != null) {
                        var4.field5022 += class643.field8659;
                        int var7 = var4.field4906;
                        while (var4.field5022 > var6.field4485[var4.field4906]) {
                            var4.field5022 -= var6.field4485[var4.field4906];
                            var4.field4906++;
                            if (var4.field4906 >= var6.field4493.length) {
                                var4.field4906 -= var6.field4484;
                                if (var4.field4906 < 0 || var6.field4493.length <= var4.field4906) {
                                    var4.field4906 = 0;
                                }
                            }
                            var4.field4984 = var4.field4906 + 1;
                            if (var4.field4984 >= var6.field4493.length) {
                                var4.field4984 -= var6.field4484;
                                if (var4.field4984 < 0 || var4.field4984 >= var6.field4493.length) {
                                    var4.field4984 = -1;
                                }
                            }
                            class151.method1062((byte) -108, var4);
                        }
                        if (var4.field4906 != var7) {
                            class159.method1101(var4.field4906, (byte) 88, var6);
                        }
                    }
                }
            }
        }
        field4675++;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V", line = 160)
    public static void method2136(int arg0) {
        field4681 = null;
        if (arg0 > -77) {
            method2133(null, 27, 121);
        }
        field4678 = null;
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(I)V", line = 172)
    public class329(int arg0) {
        this.field4680 = arg0;
        this.field4679 = new int[this.field4680];
        this.field4677 = new int[this.field4680];
    }
}
