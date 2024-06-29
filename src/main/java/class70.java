import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class70 {

    @OriginalMember(owner = "client!mba", name = "h", descriptor = "Lau;")
    private class692 field1089 = new class692(64);

    @OriginalMember(owner = "client!mba", name = "e", descriptor = "Lmv;")
    private class295 field1086;

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "Z")
    public static boolean field1083 = false;

    @OriginalMember(owner = "client!mba", name = "g", descriptor = "[[I")
    public static int[][] field1088 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!mba", name = "k", descriptor = "[I")
    public static int[] field1092 = new int[4];

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "F")
    public static float field1082;

    @OriginalMember(owner = "client!mba", name = "c", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!mba", name = "f", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!mba", name = "i", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!mba", name = "j", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)V", line = 3)
    public final void method405(byte arg0) {
        if (arg0 != -119) {
            return;
        }
        field1090++;
        class692 var2 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)V", line = 17)
    public static void method406(boolean arg0) {
        field1092 = null;
        if (!arg0) {
            field1092 = null;
        }
        field1088 = null;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "([BIIIII)Z", line = 31)
    public static final boolean method407(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1093++;
        boolean var6 = true;
        class540 var7 = new class540(arg0);
        if (arg1 != 250423814) {
            method407(null, -101, 42, -37, -126, -124);
        }
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method3174((byte) 43);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method3109(arg1 ^ 0xF112D5F8);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method3115(29871) >> 2;
                    int var17 = arg5 + var15;
                    int var18 = arg4 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < (arg2 - 1) && var18 < arg3 - 1) {
                        class289 var19 = class60.field965.method2596(0, var8);
                        if (var16 != 22 || class335.field4872.field9480 || var19.field4250 != 0 || var19.field4273 == 1 || var19.field4198) {
                            if (!var19.method1780(-4)) {
                                class65.field1040++;
                                var6 = false;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method3109(arg1 - 250423816);
                if (var12 == 0) {
                    break;
                }
                var7.method3115(29871);
            }
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(IZ)Lco;", line = 113)
    public final class589 method408(int arg0, boolean arg1) {
        field1091++;
        class692 var3 = this.field1089;
        class589 var4;
        synchronized (this.field1089) {
            var4 = (class589) this.field1089.method3901((long) arg0, -49);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field1086;
        byte[] var6;
        synchronized (this.field1086) {
            var6 = this.field1086.method1844(32, 31330, arg0);
        }
        if (arg1) {
            return null;
        }
        class589 var7 = new class589();
        if (var6 != null) {
            var7.method3358(new class540(var6), (byte) 114);
        }
        class692 var8 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)V", line = 146)
    public final void method409(boolean arg0) {
        if (!arg0) {
            method406(false);
        }
        field1087++;
        class692 var2 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V", line = 169)
    public final void method410(int arg0, int arg1) {
        field1084++;
        class692 var3 = this.field1089;
        synchronized (this.field1089) {
            this.field1089.method3900(arg1, 0);
        }
        if (arg0 < 62) {
            field1088 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 208)
    public class70(class373 arg0, int arg1, class295 arg2) {
        this.field1086 = arg2;
        this.field1086.method1845(32, true);
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Lmk;BLmk;)V", line = 192)
    public static final void method411(class321 arg0, byte arg1, class321 arg2) {
        field1085++;
        if (arg0.field4673 != null) {
            arg0.method1989((byte) 36);
        }
        arg0.field4674 = arg2.field4674;
        arg0.field4673 = arg2;
        arg0.field4673.field4674 = arg0;
        if (arg1 == 67) {
            arg0.field4674.field4673 = arg0;
        }
    }
}
