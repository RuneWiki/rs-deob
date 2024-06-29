import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class39 extends class95 {

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "I")
    private int field885 = -32768;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    private int field904 = 0;

    @OriginalMember(owner = "client!ok", name = "I", descriptor = "Z")
    public boolean field899 = false;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "I")
    private int field886 = 0;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    public int field911;

    @OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!ok", name = "w", descriptor = "I")
    private int field887;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public int field901;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "Ljb;")
    private class256 field896;

    @OriginalMember(owner = "client!ok", name = "E", descriptor = "Lpj;")
    public static class237 field895 = class33.method353(")3", 109);

    @OriginalMember(owner = "client!ok", name = "x", descriptor = "Lpj;")
    public static class237 field888 = class33.method353("cookieprefix", 67);

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "Lpj;")
    public static class237 field905 = class33.method353("3D)2Softwarebibliothek gestartet)3", 31);

    @OriginalMember(owner = "client!ok", name = "C", descriptor = "Lpj;")
    public static class237 field893 = class33.method353("blinken3:", 52);

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "[[I")
    public static int[][] field907 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "Z")
    public static boolean field897 = false;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "Lpj;")
    public static class237 field902 = class33.method353("p12_full", 50);

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!ok", name = "z", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ok", name = "A", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ok", name = "B", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!ok", name = "D", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "Lfa;")
    public static class239 field908;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "Z")
    public static boolean field882;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILpj;Lpj;Lpj;I)V")
    public static final void method399(int arg0, class237 arg1, class237 arg2, class237 arg3, int arg4) {
        int var5 = -25 % ((arg4 + 48) / 38);
        class220.method1467(arg3, arg2, 1, -1, arg1, arg0);
        field884++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIII)V")
    public static final void method400(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field881++;
        int var7 = class91.method689(arg3, class13.field215, class34.field727, (byte) -120);
        int var8 = class91.method689(arg4, class13.field215, class34.field727, (byte) 100);
        int var9 = class91.method689(arg2, class89.field1637, class94.field1676, (byte) -88);
        int var10 = class91.method689(arg6, class89.field1637, class94.field1676, (byte) -127);
        int var11 = -68 / ((-arg5 - 14) / 63);
        int var12 = class91.method689(arg3 + arg1, class13.field215, class34.field727, (byte) -119);
        int var13 = class91.method689(arg4 - arg1, class13.field215, class34.field727, (byte) -96);
        for (int var14 = var7; var14 < var12; var14++) {
            class199.method1361(arg0, var10, class62.field1241[var14], var9, 73);
        }
        for (int var15 = var8; var15 > var13; var15--) {
            class199.method1361(arg0, var10, class62.field1241[var15], var9, 78);
        }
        int var16 = class91.method689(arg2 + arg1, class89.field1637, class94.field1676, (byte) -89);
        int var17 = class91.method689(arg6 - arg1, class89.field1637, class94.field1676, (byte) -128);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class62.field1241[var18];
            class199.method1361(arg0, var16, var19, var9, 125);
            class199.method1361(arg0, var10, var19, var17, 79);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lpj;I)I")
    public static final int method401(class237 arg0, int arg1) {
        field892++;
        if (class77.field1449 == null || arg0.method1588(false) == 0) {
            return -1;
        } else if (arg1 == 13431) {
            for (int var2 = 0; var2 < class77.field1449.field1000; var2++) {
                if (class77.field1449.field1002[var2].method1592(class262.field4482, (byte) 66, class238.field4169).method1618(arg0, (byte) -92)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 76;
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V")
    public static final void method402(int arg0) {
        field912++;
        for (class249 var1 = (class249) class156.field2757.method673(false); var1 != null; var1 = (class249) class156.field2757.method680(91)) {
            if (var1.field4323) {
                var1.method1702(122);
            }
        }
        for (class249 var2 = (class249) class82.field1536.method673(false); var2 != null; var2 = (class249) class82.field1536.method680(arg0 + 27461)) {
            if (var2.field4323) {
                var2.method1702(arg0 ^ 0xFFFF94AA);
            }
        }
        if (arg0 != -27437) {
            method399(-42, (class237) null, (class237) null, (class237) null, 3);
        }
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()I")
    public final int method176() {
        field910++;
        return this.field885;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V")
    public static void method403(int arg0) {
        field908 = null;
        field907 = null;
        field893 = null;
        field888 = null;
        field902 = null;
        field895 = null;
        field905 = null;
        if (arg0 <= 96) {
            field893 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(DI)V")
    public static final void method404(double arg0, int arg1) {
        if (arg1 != 12) {
            method400(104, -120, 102, 21, -107, 16, 5);
        }
        if (class185.field3232 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class17.field297[var3] = var4 > 255 ? 255 : var4;
            }
            class185.field3232 = arg0;
        }
        field890++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V")
    public final void method405(int arg0, int arg1) {
        field898++;
        if (arg1 != 10) {
            this.field899 = true;
        }
        if (this.field899) {
            return;
        }
        this.field886 += arg0;
        while (this.field886 > this.field896.field4383[this.field904]) {
            this.field886 -= this.field896.field4383[this.field904];
            this.field904++;
            if (this.field896.field4416.length <= this.field904) {
                this.field899 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field883++;
        class201 var11 = this.method407(true);
        if (var11 != null) {
            var11.method183(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field885 = var11.method176();
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)Lnf;")
    public static final class155 method406(int arg0) {
        if (arg0 != 255) {
            method401((class237) null, -120);
        }
        class154 var1 = new class154(class52.field1094, class43.field944, class252.field4341[0], class226.field3868[0], class174.field3060[0], class175.field3063[0], class127.field2221[0], class139.field2398);
        class190.method1291((byte) 103);
        field891++;
        return var1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Lqk;")
    private final class201 method407(boolean arg0) {
        field903++;
        if (!arg0) {
            method402(76);
        }
        class49 var2 = class190.method1288(this.field887, (byte) 108);
        class201 var3;
        if (this.field899) {
            var3 = var2.method453((byte) 66, -1);
        } else {
            var3 = var2.method453((byte) 66, this.field904);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIII)V")
    public class39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field911 = arg4;
        this.field889 = arg2;
        this.field887 = arg0;
        this.field900 = arg1;
        this.field906 = arg5 + arg6;
        this.field901 = arg3;
        int var8 = class190.method1288(this.field887, (byte) 100).field1054;
        if (var8 == -1) {
            this.field899 = true;
        } else {
            this.field899 = false;
            this.field896 = class256.method1732(var8, true);
        }
    }
}
