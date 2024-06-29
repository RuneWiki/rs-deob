import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public abstract class class118 {

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
    public int field1360 = -1;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "I")
    public static int field1356 = 100;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "[I")
    public static int[] field1359 = new int[14];

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
    public static int field1368;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "Lla;")
    public static class266 field1354;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "[S")
    public static short[] field1355;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IZ)V", line = 10)
    public static final void method691(int arg0, boolean arg1) {
        field1352++;
        byte[][] var2;
        if (arg1) {
            var2 = class431.field5881;
        } else {
            var2 = class208.field2537;
        }
        int var3 = class126.field1411.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class358.field4867[var4] >> 8) * 64 - class278.field3608;
                int var7 = (class358.field4867[var4] & 0xFF) * 64 - class129.field1432;
                class94.method589(-121);
                class200.method1234(var5, var7, var6, class267.field3454, arg1, (byte) 123, class156.field1815);
            }
        }
        if (arg0 != -5959) {
            field1356 = 66;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/lang/String;IIBLak;ILfa;ILem;ILaq;I)V", line = 55)
    public static final void method698(String arg0, int arg1, int arg2, byte arg3, class31 arg4, int arg5, class347 arg6, int arg7, class423 arg8, int arg9, class453 arg10, int arg11) {
        field1365++;
        int var12;
        if (class320.field4294 == 4) {
            var12 = (int) class434.field5929 & 0x3FFF;
        } else {
            var12 = (int) class434.field5929 + class231.field3043 & 0x3FFF;
        }
        int var13 = Math.max(arg10.field6377 / 2, arg10.field6432 / 2) + 10;
        int var14 = -125 % ((arg3 + 2) / 59);
        int var15 = arg1 * arg1 + arg11 * arg11;
        if (var13 * var13 < var15) {
            return;
        }
        int var16 = class363.field4927[var12];
        int var17 = class363.field4917[var12];
        if (class320.field4294 != 4) {
            var16 = var16 * 256 / (class280.field3627 + 256);
            var17 = var17 * 256 / (class280.field3627 + 256);
        }
        int var18 = arg1 * var17 + arg11 * var16 >> 15;
        int var19 = arg11 * var17 - arg1 * var16 >> 15;
        int var20 = arg6.method2209(0, arg0, 100, (class436[]) null);
        int var21 = arg6.method2208(0, (byte) -125, 100, (class436[]) null, arg0);
        int var22 = var18 - var20 / 2;
        if (-arg10.field6377 <= var22 && arg10.field6377 >= var22 && var19 >= (-arg10.field6432) && var19 <= arg10.field6432) {
            arg4.method200(1, 23897, (int[]) null, 50, arg5 + (arg10.field6432 / 2) - arg9 - (var19 - -var21), 0, 0, (class436[]) null, var20, 0, arg0, arg5, var22 - (-(arg10.field6377 / 2) - arg2), arg2, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLgd;ILjava/awt/Canvas;Lnh;I)Luo;", line = 104)
    public static final synchronized class118 method700(byte arg0, class172 arg1, int arg2, Canvas arg3, class441 arg4, int arg5) {
        if (arg0 <= 43) {
            field1356 = 28;
        }
        field1369++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class127.field1418[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class118 var9;
        if (arg2 == 0) {
            var9 = class22.method133(arg3, var6, (byte) -87, arg1);
        } else if (arg2 == 1) {
            var9 = class280.method1753(arg5, arg3, arg4, arg1, var6, (byte) 36);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class127.field1418[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIII)V", line = 150)
    public final void method705(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1367++;
        this.method709(arg3, arg2, arg1, arg4, 1);
        if (arg0 < 46) {
            this.field1360 = -23;
        }
    }

    @OriginalMember(owner = "client!uo", name = "finalize", descriptor = "()V", line = 169)
    protected final void finalize() {
        this.method745(2);
        field1364++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[IB)V", line = 184)
    public static final void method716(int arg0, int[] arg1, byte arg2) {
        if (arg2 != 74) {
            return;
        }
        for (int var3 = 31; var3 > 0; var3--) {
            int var4 = var3 * 36;
            for (int var5 = 35; var5 > 0; var5--) {
                if (arg1[var5 + var4] == 0 && arg1[var4 + var5 - 37] != 0) {
                    arg1[var4 + var5] = arg0;
                }
            }
        }
        field1362++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIBI)V", line = 238)
    public final void method731(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 >= 61) {
            this.method748(arg0, arg1, arg2, arg5, arg3, 1);
            field1351++;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII)V", line = 250)
    public final void method733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 2) {
            field1354 = null;
        }
        field1357++;
        this.method741(arg1, arg4, arg5, arg0, arg3, 1);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(JZIII)Ljava/lang/String;", line = 261)
    public static final String method734(long arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1366++;
        char var6 = ',';
        if (arg3 != 10) {
            method698((String) null, -80, 107, (byte) 103, (class31) null, 82, (class347) null, -47, (class423) null, -93, (class453) null, -103);
        }
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            var8 = true;
            arg0 = -arg0;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg0 * 10));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg1) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIIIII)V", line = 345)
    public final void method739(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method789(arg2, arg4, arg3, arg5, arg1, 1);
        field1358++;
        int var7 = 35 / ((-arg0 - 65) / 59);
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V", line = 364)
    public final void method745(int arg0) {
        field1353++;
        class127.field1418[this.field1360] = false;
        if (arg0 != 2) {
            this.field1360 = -44;
        }
        this.method730();
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIII)V", line = 385)
    public final void method753(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1363++;
        this.method719(arg2, arg1, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIII)V", line = 394)
    public final void method754(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method696(arg4, arg3, arg0, arg1, 1);
        if (arg2 > -121) {
            this.method708();
        }
        field1368++;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IILpo;I)V", line = 441)
    public static final void method780(int arg0, int arg1, class342 arg2, int arg3) {
        field1370++;
        class284.field3715[arg1][arg0] = arg2;
        if (arg3 != 0) {
            method700((byte) -100, (class172) null, 30, (Canvas) null, (class441) null, -79);
        }
    }

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "(I)V", line = 453)
    public static void method782(int arg0) {
        field1355 = null;
        field1359 = null;
        if (arg0 <= -27) {
            field1354 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V")
    public abstract void method686(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lts;Lts;FLts;)Lts;")
    public abstract class33 method687(class33 arg0, class33 arg1, float arg2, class33 arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(F)V")
    public abstract void method688(float arg0);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "()Z")
    public abstract boolean method689();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
    public abstract void method690(boolean arg0);

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "()Z")
    public abstract boolean method692();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method693(Canvas arg0);

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "()V")
    public abstract void method694();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public abstract void method695(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIII)V")
    public abstract void method696(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Liq;Z)Lc;")
    public abstract class436 method697(class132 arg0, boolean arg1);

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "()I")
    public abstract int method699();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lhf;IIII)Lge;")
    public abstract class386 method701(class402 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIILem;II)V")
    public abstract void method702(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class423 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([IIIII)Lc;")
    public abstract class436 method703(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILem;II)V")
    public abstract void method704(int arg0, class423 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(I)V")
    public abstract void method706(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)I")
    public abstract int method707(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "()Z")
    public abstract boolean method708();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIII)V")
    public abstract void method709(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "()V")
    public abstract void method710();

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "()Z")
    public abstract boolean method711();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(III)V")
    public abstract void method712(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method713(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "()Z")
    public abstract boolean method714();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[[I[[IIII)Lip;")
    public abstract class279 method715(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lts;)V")
    public abstract void method717(class33 arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(III[I)V")
    public abstract void method718(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIII)V")
    public abstract void method719(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lge;Lsk;Lwr;[Lfi;I)V")
    public abstract void method720(class386[] arg0, class291 arg1, class450 arg2, class34[] arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)I")
    public abstract int method721(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([I)V")
    public abstract void method722(int[] arg0);

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "()Z")
    public abstract boolean method723();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lac;)V")
    public abstract void method724(class197 arg0);

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "()V")
    public abstract void method725();

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "()Z")
    public abstract boolean method726();

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "()V")
    public abstract void method727();

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(I)V")
    public abstract void method728(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lge;Lsk;Lwr;Lfi;I)V")
    public abstract void method729(class386 arg0, class291 arg1, class450 arg2, class34 arg3, int arg4);

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "()V")
    public abstract void method730();

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "()V")
    public abstract void method732();

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "()V")
    public abstract void method735();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method737(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lsk;)V")
    public abstract void method738(class291 arg0);

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "()Z")
    public abstract boolean method740();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIIIII)V")
    public abstract void method741(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "()Lwr;")
    public abstract class450 method742();

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
    public abstract void method743(int arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method744(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "([Lge;Lwr;[Lfi;I)V")
    public abstract void method746(class386[] arg0, class450 arg1, class34[] arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lfa;[Liq;Z)Lak;")
    public abstract class31 method747(class347 arg0, class132[] arg1, boolean arg2);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIIIII)V")
    public abstract void method748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lwr;)V")
    public abstract void method749(class450 arg0);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(II)V")
    public abstract void method750(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "()I")
    public abstract int method751();

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(II)V")
    public abstract void method752(int arg0, int arg1);

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
    public abstract void method755(boolean arg0);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method756(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "()V")
    public abstract void method757();

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)Lac;")
    public abstract class197 method758(int arg0);

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
    public abstract void method759(int arg0);

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "()F")
    public abstract float method760();

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "()Z")
    public abstract boolean method761();

    @OriginalMember(owner = "client!uo", name = "y", descriptor = "()Z")
    public abstract boolean method762();

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIIIII)Lts;")
    public abstract class33 method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "z", descriptor = "()F")
    public abstract float method764();

    @OriginalMember(owner = "client!uo", name = "A", descriptor = "()V")
    public abstract void method765();

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(IIII)V")
    public abstract void method766(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIZ)Lc;")
    public abstract class436 method767(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(IIII)V")
    public abstract void method768(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "B", descriptor = "()Lwr;")
    public abstract class450 method769();

    @OriginalMember(owner = "client!uo", name = "C", descriptor = "()Z")
    public abstract boolean method770();

    @OriginalMember(owner = "client!uo", name = "D", descriptor = "()I")
    public abstract int method771();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(FF)V")
    public abstract void method773(float arg0, float arg1);

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(IIII)V")
    public abstract void method774(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "E", descriptor = "()I")
    public abstract int method775();

    @OriginalMember(owner = "client!uo", name = "F", descriptor = "()V")
    public abstract void method776();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(FFF)V")
    public abstract void method777(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "()I")
    public abstract int method778();

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "()Z")
    public abstract boolean method779();

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "()Z")
    public abstract boolean method781();

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "()Z")
    public abstract boolean method783();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[Lsi;)V")
    public abstract void method784(int arg0, class92[] arg1);

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "()Z")
    public abstract boolean method785();

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II[I[I)Lem;")
    public abstract class423 method786(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "(Z)V")
    public abstract void method787(boolean arg0);

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "()I")
    public abstract int method788();

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIIIII)V")
    public abstract void method789(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(IIII)V")
    public abstract void method790(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(IIIIII)Z")
    public abstract boolean method791(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
