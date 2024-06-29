import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class53 extends class206 {

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[Lil;")
    public class53[] field876;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "Z")
    public boolean field880;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "Lwa;")
    public static class75 field870 = class66.method560("::rect_debug", false);

    @OriginalMember(owner = "client!il", name = "K", descriptor = "Lwa;")
    public static class75 field885 = class66.method560(")1j", false);

    @OriginalMember(owner = "client!il", name = "J", descriptor = "Lwa;")
    public static class75 field884 = class66.method560("Lade Konfiguration )2 ", false);

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "Lhd;")
    public class113 field882;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "Lol;")
    public class219 field878;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "[[[I")
    public static int[][][] field879;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 5)
    public static void method384(byte arg0) {
        field879 = (int[][][]) null;
        field870 = null;
        if (arg0 >= -44) {
            method389(119, 75, -111, 5);
        }
        field885 = null;
        field884 = null;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)V", line = 22)
    public final void method385(int arg0, int arg1, int arg2) {
        field874++;
        int var4 = this.field886 == 255 ? arg2 : this.field886;
        if (this.field880) {
            this.field878 = new class219(var4, arg2, arg0);
        } else {
            this.field882 = new class113(var4, arg2, arg0);
        }
        if (arg1 <= 102) {
            field885 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)[[I", line = 47)
    public int[][] method66(int arg0, int arg1) {
        field866++;
        int var3 = 44 % ((76 - arg1) / 42);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([J[Ljava/lang/Object;III)V", line = 58)
    public static final void method386(long[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 3) {
            return;
        }
        if (arg4 < arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            for (int var10 = arg4; var10 < arg3; var10++) {
                if (((long) (var10 & 0x1) + var7) > arg0[var10]) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var9;
            method386(arg0, arg1, 3, var6 - 1, arg4);
            method386(arg0, arg1, 3, arg3, var6 + 1);
        }
        field881++;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)[I", line = 116)
    public int[] method59(int arg0, int arg1) {
        field868++;
        if (arg0 != -15196) {
            method384((byte) -24);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 132)
    public void method305(int arg0) {
        if (arg0 != 3) {
            this.method387(59);
        }
        if (this.field880) {
            this.field878.method1599(arg0 - 50);
            this.field878 = null;
        } else {
            this.field882.method875(0);
            this.field882 = null;
        }
        field867++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILja;Z)V", line = 158)
    public void method54(int arg0, class60 arg1, boolean arg2) {
        field865++;
        if (!arg2) {
            this.field882 = (class113) null;
        }
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)I", line = 172)
    public int method387(int arg0) {
        field869++;
        if (arg0 != -1) {
            method389(68, 56, 34, 73);
        }
        return -1;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(III)[[I", line = 187)
    public final int[][] method388(int arg0, int arg1, int arg2) {
        field864++;
        if (arg0 < 92) {
            this.field882 = (class113) null;
        }
        if (!this.field876[arg1].field880) {
            return this.field876[arg1].method66(arg2, 120);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field876[arg1].method59(-15196, arg2);
        var4[0] = var5;
        var4[2] = var5;
        var4[1] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIII)V", line = 220)
    public static final void method389(int arg0, int arg1, int arg2, int arg3) {
        field883++;
        class262 var4 = class161.method1208(arg2, arg3, (byte) 87);
        if (var4 != null && var4.field4464 != null) {
            class24 var5 = new class24();
            var5.field301 = var4;
            var5.field302 = var4.field4464;
            class204.method1515(var5, (byte) 9);
        }
        class29.field405 = arg2;
        class206.field3482 = arg3;
        class123.field2056 = arg0;
        class161.field2738 = true;
        int var6 = -120 / ((arg1 + 55) / 33);
        class291.method2027(var4, 14580);
    }

    @OriginalMember(owner = "client!il", name = "f", descriptor = "(I)I", line = 250)
    public int method304(int arg0) {
        if (arg0 != -19606) {
            field875 = -42;
        }
        field872++;
        return -1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lcb;I)V", line = 265)
    public static final void method390(class267 arg0, int arg1) {
        class221.field3765 = arg0;
        if (arg1 != -9814) {
            field870 = (class75) null;
        }
        field873++;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(III)[I", line = 283)
    public final int[] method391(int arg0, int arg1, int arg2) {
        field871++;
        if (arg1 != 0) {
            this.method388(-85, -45, -20);
        }
        return this.field876[arg0].field880 ? this.field876[arg0].method59(arg1 ^ 0xFFFFC4A4, arg2) : this.field876[arg0].method66(arg2, -88)[0];
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 306)
    public void method56(byte arg0) {
        field877++;
        if (arg0 != -79) {
            field879 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(IZ)V", line = 322)
    public class53(int arg0, boolean arg1) {
        this.field876 = new class53[arg0];
        this.field880 = arg1;
    }
}
