import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class198 {

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lce;")
    private class115 field3361;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "Lmc;")
    private class46 field3364;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "Lgf;")
    private class104 field3367;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field3362 = 0;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Z")
    public static boolean field3366 = true;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Leg;")
    public static class37 field3375 = class174.method1167("Librairie 3D d-Bmarr-Be", 103);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lva;")
    private class187 field3374;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "Lpe;")
    public static class237 field3376;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "[I")
    public static int[] field3372;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "[Lkb;")
    private class270[] field3368;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljl;ILjl;)V")
    public static final void method1372(class101 arg0, int arg1, class101 arg2) {
        class92.field1431 = class172.method1155(0, arg2, arg0, class169.field2824, 0);
        field3370++;
        int var3 = 40 % ((arg1 - 32) / 49);
        class271.field4755 = (class136) class92.field1431;
        class109.field1810 = class172.method1155(0, arg2, arg0, class226.field3876, 0);
        class180.field3002 = class172.method1155(0, arg2, arg0, class1.field1, 0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IILbj;Lbj;)Lkb;")
    public final class270 method1373(int arg0, int arg1, class87 arg2, class87 arg3) {
        field3365++;
        return arg1 >= -75 ? null : this.method1376(true, arg3, arg2, true, arg0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)Lwc;")
    public static final class27 method1374(int arg0, int arg1, int arg2) {
        class111 var3 = class286.field5048[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1880; var4++) {
            class27 var5 = var3.field1858[var4];
            if ((var5.field381 >> 29 & 0x3L) == 2L && var5.field402 == arg1 && var5.field397 == arg2) {
                class173.method1160(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public final void method1375(byte arg0) {
        if (arg0 != 115) {
            return;
        }
        field3373++;
        if (this.field3368 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field3368.length; var2++) {
            if (this.field3368[var2] != null) {
                this.field3368[var2].method1813(true);
            }
        }
        for (int var3 = 0; var3 < this.field3368.length; var3++) {
            if (this.field3368[var3] != null) {
                this.field3368[var3].method1806((byte) -98);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZLbj;Lbj;ZI)Lkb;")
    private final class270 method1376(boolean arg0, class87 arg1, class87 arg2, boolean arg3, int arg4) {
        field3377++;
        if (this.field3374 == null) {
            throw new RuntimeException();
        }
        this.field3374.field3169 = arg4 * 8 + 5;
        if (!arg0) {
            return null;
        } else if (this.field3374.field3169 >= this.field3374.field3175.length) {
            throw new RuntimeException();
        } else if (this.field3368[arg4] == null) {
            int var6 = this.field3374.method1290((byte) 90);
            int var7 = this.field3374.method1290((byte) 90);
            class270 var8 = new class270(arg4, arg1, arg2, this.field3361, this.field3364, var6, var7, arg3);
            this.field3368[arg4] = var8;
            return var8;
        } else {
            return this.field3368[arg4];
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)Lji;")
    public static final class238 method1377(byte arg0) {
        field3369++;
        try {
            if (arg0 != 121) {
                method1377((byte) -125);
            }
            return (class238) Class.forName("qj").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1378(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field3371++;
        if (arg0 >= class178.field2972 && class217.field3741 >= arg5 && arg3 >= class286.field5050 && arg2 <= class96.field1507) {
            class290.method1943(111, arg2, arg0, arg1, arg5, arg3);
        } else {
            class246.method1692(arg5, false, arg0, arg2, arg3, arg1);
        }
        if (!arg4) {
            field3372 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method1379(int arg0) {
        field3375 = null;
        if (arg0 != 255) {
            field3375 = null;
        }
        field3376 = null;
        field3372 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIB)V")
    public static final void method1380(int arg0, int arg1, int arg2, byte arg3) {
        field3379++;
        class274 var4 = class166.method1116(9, arg0, true);
        var4.method1835(-32);
        int var5 = -91 % ((arg3 + 38) / 63);
        var4.field4802 = arg2;
        var4.field4824 = arg1;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lce;Lmc;)V")
    public class198(class115 arg0, class46 arg1) {
        this.field3361 = arg0;
        this.field3364 = arg1;
        if (!this.field3361.method827((byte) 80)) {
            this.field3367 = this.field3361.method823(206873392, (byte) 0, 255, 255, true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)Z")
    public final boolean method1381(int arg0) {
        field3363++;
        if (this.field3374 != null) {
            return true;
        }
        if (this.field3367 == null) {
            if (this.field3361.method827((byte) -82)) {
                return false;
            }
            this.field3367 = this.field3361.method823(206873392, (byte) 0, 255, 255, true);
        }
        if (this.field3367.field1500) {
            return false;
        } else if (arg0 < 87) {
            return true;
        } else {
            this.field3374 = new class187(this.field3367.method618(-31029));
            this.field3368 = new class270[(this.field3374.field3175.length - 5) / 8];
            return true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    public static final void method1382(byte arg0) {
        field3378++;
        class160.field2674++;
        if (arg0 > -104) {
            method1382((byte) -18);
        }
    }
}
