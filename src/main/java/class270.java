import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class270 extends class224 {

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "I")
    private int field4539 = 4096;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    private int field4546 = 0;

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field4538 = 0;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "Luf;")
    public static class168 field4545 = class148.method1019(-1720, "welle2:");

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field4542 = 0;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "Luf;")
    private static class168 field4544 = class148.method1019(-1720, "red:");

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "Luf;")
    public static class168 field4541 = field4544;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "Luf;")
    public static class168 field4543 = field4544;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!uj", name = "db", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "Le;")
    public static class169 field4537;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZLj;)V", line = 4)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field4549++;
        if (arg0 == 0) {
            this.field4546 = arg2.method1069(42);
        } else if (arg0 == 1) {
            this.field4539 = arg2.method1069(38);
        }
        if (arg1) {
            field4538 = 127;
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V", line = 44)
    public static void method1871(int arg0) {
        field4543 = null;
        field4541 = null;
        field4544 = null;
        field4545 = null;
        if (arg0 != -6861) {
            method1871(-58);
        }
        field4537 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lj;I)V", line = 63)
    public static final void method1872(class153 arg0, int arg1) {
        int var2 = 80 % ((arg1 + 40) / 51);
        field4547++;
        while (true) {
            while (arg0.field2359.length > arg0.field2367) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg0.method1042((byte) -106) == 1) {
                    var3 = true;
                    var4 = arg0.method1042((byte) -49);
                    var5 = arg0.method1042((byte) 86);
                }
                int var6 = arg0.method1042((byte) -124);
                int var7 = arg0.method1042((byte) 93);
                int var8 = var6 * 64 - class40.field506;
                int var9 = class261.field4420 + class172.field2801 - var7 * 64 - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && class140.field2161 > var8 + 63 && class172.field2801 > var9) {
                    int var10 = var9 >> 6;
                    int var11 = var8 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || (var4 * 8) <= var12 && (var4 * 8 + 8) > var12 && var5 * 8 <= var13 && (var5 * 8 + 8) > var13) {
                                byte var14 = arg0.method1078(-6338);
                                if (var14 != 0) {
                                    if (class5.field66[var11][var10] == null) {
                                        class5.field66[var11][var10] = new byte[4096];
                                    }
                                    class5.field66[var11][var10][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg0.method1078(-6338);
                                    if (class209.field3459[var11][var10] == null) {
                                        class209.field3459[var11][var10] = new byte[4096];
                                    }
                                    class209.field3459[var11][var10][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg0.method1078(-6338);
                        if (var17 != 0) {
                            arg0.field2367++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IZ)Lad;", line = 164)
    public static final class5 method1873(int arg0, boolean arg1) {
        if (arg1) {
            return (class5) null;
        }
        field4548++;
        class5 var2 = (class5) class215.field3510.method1424((long) arg0, (byte) 115);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class18.field209.method1647(class54.method295((byte) 118, arg0), (byte) 121, class48.method260((byte) 28, arg0));
        class5 var4 = new class5();
        var4.field46 = arg0;
        if (var3 != null) {
            var4.method12(new class153(var3), arg1);
        }
        class215.field3510.method1430(var4, (long) arg0, 13487);
        return var4;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V", line = 198)
    public class270() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)[I", line = 206)
    public final int[] method18(byte arg0, int arg1) {
        field4540++;
        int[] var3 = this.field3613.method1866(1, arg1);
        int var4 = 2 / ((20 - arg0) / 51);
        if (this.field3613.field4531) {
            int[] var5 = this.method1537(arg1, 0, 0);
            for (int var6 = 0; var6 < class187.field2961; var6++) {
                int var7 = var5[var6];
                var3[var6] = this.field4546 <= var7 && this.field4539 >= var7 ? 4096 : 0;
            }
        }
        return var3;
    }
}
