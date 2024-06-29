import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class179 extends class105 {

    @OriginalMember(owner = "client!th", name = "ab", descriptor = "I")
    private int field3424 = 4096;

    @OriginalMember(owner = "client!th", name = "bb", descriptor = "I")
    private int field3425 = 4096;

    @OriginalMember(owner = "client!th", name = "kb", descriptor = "I")
    private int field3434 = 4096;

    @OriginalMember(owner = "client!th", name = "db", descriptor = "Leh;")
    private static class47 field3427 = class195.method1282((byte) -4, "cyan:");

    @OriginalMember(owner = "client!th", name = "lb", descriptor = "Leh;")
    public static class47 field3435 = null;

    @OriginalMember(owner = "client!th", name = "Y", descriptor = "Leh;")
    public static class47 field3422 = class195.method1282((byte) -4, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!th", name = "cb", descriptor = "Z")
    public static boolean field3426 = false;

    @OriginalMember(owner = "client!th", name = "hb", descriptor = "Leh;")
    public static class47 field3431 = field3427;

    @OriginalMember(owner = "client!th", name = "gb", descriptor = "Leh;")
    public static class47 field3430 = class195.method1282((byte) -4, "Willkommen auf RuneScape");

    @OriginalMember(owner = "client!th", name = "mb", descriptor = "Leh;")
    public static class47 field3436 = field3427;

    @OriginalMember(owner = "client!th", name = "ib", descriptor = "I")
    public static int field3432 = -1;

    @OriginalMember(owner = "client!th", name = "ob", descriptor = "Leh;")
    public static class47 field3438 = class195.method1282((byte) -4, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!th", name = "Z", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!th", name = "eb", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!th", name = "fb", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!th", name = "jb", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!th", name = "nb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!th", name = "pb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!th", name = "qb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(Z)V")
    public static final void method1191(boolean arg0) {
        if (!arg0) {
            method1193((class47) null, (class47) null, -36, (class9) null);
        }
        try {
            if (class161.field3143 == null) {
                class161.field3143 = new class196(class142.field2782, class5.method24(new class47[] { class5.field91, class181.field3469, class143.field2809 }, (byte) 113).method384(127));
            } else {
                byte[] var1 = class161.field3143.method1286(0);
                if (var1 != null) {
                    class68 var2 = new class68(var1);
                    class96.field2044 = var2.method569(26496);
                    class69.field1520 = new class149[class96.field2044];
                    for (int var3 = 0; class96.field2044 > var3; ++var3) {
                        class149 var4 = class69.field1520[var3] = new class149();
                        int var5 = var2.method569(26496);
                        var4.field2916 = (var5 & 32768) != 0;
                        var4.field2917 = 32767 & var5;
                        var4.field2923 = var2.method575(125);
                        var4.field2929 = var2.method601(25640);
                        var4.field2919 = var3;
                        var4.field2925 = class196.method1288((byte) -4, var4.field2923);
                    }
                    class118.method921(class69.field1520.length + -1, class110.field2286, 0, class125.field2515, class69.field1520, true);
                    class125.field2512 = true;
                    class161.field3143 = null;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
            class161.field3143 = null;
        }
        ++field3423;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg2 != -256) {
            this.field3434 = 106;
        }
        ++field3428;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    this.field3425 = arg1.method569(26496);
                }
            } else {
                this.field3434 = arg1.method569(26496);
            }
        } else {
            this.field3424 = arg1.method569(arg2 + 26752);
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
    public static void method1192(byte arg0) {
        field3427 = null;
        field3431 = null;
        field3422 = null;
        if (arg0 <= 115) {
            method1192((byte) 12);
        }
        field3430 = null;
        field3436 = null;
        field3435 = null;
        field3438 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Leh;Leh;ILah;)Ldh;")
    public static final class38 method1193(class47 arg0, class47 arg1, int arg2, class9 arg3) {
        if (arg2 != 4096) {
            return null;
        } else {
            ++field3437;
            int var4 = arg3.method75(arg1, 31499);
            int var5 = arg3.method77(arg0, var4, true);
            return class198.method1300((byte) -94, var5, arg3, var4);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)Leh;")
    public static final class47 method1194(int arg0, int arg1) {
        if (arg0 < 90) {
            method1192((byte) -66);
        }
        ++field3439;
        return arg1 < 999999999 ? class167.method1133(arg1, (byte) -101) : class148.field2892;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class179() {
        super(1, false);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method15(int arg0, boolean arg1) {
        ++field3433;
        if (!arg1) {
            method1194(-77, -24);
        }
        int[][] var3 = super.field2186.method10(arg0, (byte) 51);
        if (super.field2186.field28) {
            int[][] var4 = this.method854(0, (byte) -121, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class149.field2928; ++var11) {
                int var12 = var9[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var12 == var14) {
                    var10[var11] = this.field3424 * var13 >> 12;
                    var7[var11] = this.field3434 * var12 >> 12;
                    var8[var11] = this.field3425 * var14 >> 12;
                } else {
                    var10[var11] = this.field3424;
                    var7[var11] = this.field3434;
                    var8[var11] = this.field3425;
                }
            }
        }
        return var3;
    }
}
