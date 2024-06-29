import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public abstract class class538 extends class50 {

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "Lmh;")
    public static class139 field7897 = new class139(7, 2);

    @OriginalMember(owner = "client!caa", name = "t", descriptor = "Z")
    public static boolean field7907 = false;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "B")
    public byte field7900;

    @OriginalMember(owner = "client!caa", name = "r", descriptor = "B")
    public byte field7905;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public int field7894;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public int field7895;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public int field7896;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field7899;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "I")
    public int field7901;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
    public int field7902;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "I")
    public static int field7903;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "I")
    public static int field7904;

    @OriginalMember(owner = "client!caa", name = "s", descriptor = "I")
    public int field7906;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "Z")
    public boolean field7898;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lr;I)Lhr;")
    public abstract class218 method272(class98 arg0, int arg1);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B[[BLcea;)V")
    public static final void method3102(byte arg0, byte[][] arg1, class94 arg2) {
        int var3 = 89 / ((arg0 - 13) / 39);
        field7899++;
        int var4 = class476.field6823.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var6 = arg1[var5];
            if (var6 != null) {
                int var7 = (class505.field7147[var5] >> 8) * 64 - class397.field6005;
                int var8 = (class505.field7147[var5] & 0xFF) * 64 - class403.field6049;
                class413.method2520(false);
                arg2.method586(var6, class332.field4821, var7, var8, 3, class629.field9104);
            }
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(Lr;I)V")
    public abstract void method259(class98 arg0, int arg1);

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)Z")
    public abstract boolean method1809(int arg0);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIZLr;)Z")
    public abstract boolean method261(int arg0, int arg1, boolean arg2, class98 arg3);

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(Z)I")
    public abstract int method271(boolean arg0);

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(Lr;I)Lifa;")
    public abstract class62 method268(class98 arg0, int arg1);

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "(I)Z")
    public abstract boolean method274(int arg0);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method3103(int arg0, String arg1) {
        field7903++;
        String var2 = class629.method3622(class583.method3343(-127, arg1), arg0 - 3);
        if (var2 == null) {
            var2 = "";
        }
        return arg0 == 7 ? var2 : null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I[Ltg;)I")
    public abstract int method1808(int arg0, class334[] arg1);

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(Z)Z")
    public abstract boolean method1807(boolean arg0);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILr;ILcaa;ZII)V")
    public abstract void method311(int arg0, class98 arg1, int arg2, class538 arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIB[Ltg;)I")
    public final int method3104(int arg0, int arg1, byte arg2, class334[] arg3) {
        field7904++;
        if (arg2 >= -34) {
            this.method271(false);
        }
        long var5 = class267.field3487[this.field7905][arg0][arg1];
        long var7 = 0L;
        int var9 = 0;
        while (var7 <= 48L) {
            int var10 = (int) (var5 >> (int) var7 & 0xFFFFL);
            if (var10 <= 0) {
                break;
            }
            var7 += 16L;
            arg3[var9++] = class324.field4707[var10 - 1].field6773;
        }
        for (int var11 = var9; var11 < 4; var11++) {
            arg3[var11] = null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "(I)I")
    public abstract int method258(int arg0);

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(Z)Z")
    public abstract boolean method309(boolean arg0);

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(B)V")
    public abstract void method315(byte arg0);

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "(I)V")
    public static void method3105(int arg0) {
        int var1 = 23 / ((-arg0 - 33) / 34);
        field7897 = null;
    }

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "(I)Z")
    public abstract boolean method270(int arg0);
}
