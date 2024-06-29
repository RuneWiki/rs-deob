import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class298 {

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public int field4492 = -1;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "[I")
    public static int[] field4500 = new int[250];

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field4506 = 0;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4505 = null;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static volatile int field4499 = 0;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lvn;")
    public static class431 field4504;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "()I")
    public abstract int method466();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIII)V")
    public abstract void method460(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public abstract void method499(boolean arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lke;)V")
    public abstract void method441(class295 arg0);

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "()I")
    public abstract int method500();

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "()I")
    public abstract int method470();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(FFF)V")
    public abstract void method491(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "()Z")
    public abstract boolean method469();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILsf;II)V")
    public abstract void method515(int arg0, class421 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method431(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII)Z")
    public abstract boolean method432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIIIII)Lke;")
    public abstract class295 method516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "()Z")
    public abstract boolean method497();

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIII)[I")
    public abstract int[] method490(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([BII[Lao;ZILtj;)V")
    public static final void method2013(byte[] arg0, int arg1, int arg2, class280[] arg3, boolean arg4, int arg5, class298 arg6) {
        field4502++;
        class341 var7 = new class341(arg0);
        int var8 = -1;
        while (true) {
            int var9 = var7.method2236(-31885);
            if (var9 == 0) {
                if (arg2 != 1) {
                    field4500 = null;
                    return;
                }
                return;
            }
            var8 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var7.method2223(-1);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var7.method2233((byte) 104);
                int var16 = var15 >> 2;
                int var17 = var15 & 0x3;
                int var18 = arg1 + var13;
                int var19 = var12 + arg5;
                if (var18 > 0 && var19 > 0 && var18 < class351.field5217 - 1 && (class143.field1815 - 1) > var19) {
                    class280 var20 = null;
                    if (!arg4) {
                        int var21 = var14;
                        if ((class406.field5912[1][var18][var19] & 0x2) == 2) {
                            var21 = var14 - 1;
                        }
                        if (var21 >= 0) {
                            var20 = arg3[var21];
                        }
                    }
                    class143.method989(var14, (byte) 57, var14, var16, var18, arg6, arg4, -1, var19, var17, var8, true, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
    public abstract void method483(int arg0, int arg1);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(IIIIII)V")
    public final void method2014(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4503++;
        this.method511(arg3, arg0, arg4, arg5, arg2, 1);
        if (arg1 != 0) {
            method2022((class185) null, -99);
        }
    }

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "()Z")
    public abstract boolean method496();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lai;)V")
    public abstract void method509(class305 arg0);

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "()F")
    public abstract float method458();

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(IIIIII)V")
    public abstract void method493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIZI)V")
    public final void method2015(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4498++;
        this.method443(arg0, arg1, arg2, arg4, 1);
        if (arg3) {
            field4506 = 11;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II[I[I)Lsf;")
    public abstract class421 method504(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public abstract void method520(int arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lvn;[Lok;Z)Los;")
    public abstract class129 method446(class431 arg0, class10[] arg1, boolean arg2);

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(IIIIII)V")
    public abstract void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
    public abstract void method494(int arg0);

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "()Z")
    public abstract boolean method521();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIZ)Ll;")
    public abstract class315 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(IIIIII)V")
    public abstract void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "()V")
    public abstract void method449();

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "()V")
    public abstract void method472();

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "()V")
    public abstract void method506();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIII)V")
    public final void method2016(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4497++;
        this.method510(arg1, arg4, arg2, arg0, 1);
        if (arg3 <= 33) {
            field4506 = -22;
        }
    }

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "()V")
    public abstract void method522();

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
    public abstract void method489(int arg0, int arg1);

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "()Lug;")
    public abstract class118 method519();

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "()V")
    public abstract void method455();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Lqb;Lai;Lug;[Laj;I)V")
    public abstract void method464(class257[] arg0, class305 arg1, class118 arg2, class137[] arg3, int arg4);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I[Ldn;)V")
    public abstract void method505(int arg0, class16[] arg1);

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "()Lug;")
    public abstract class118 method429();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(FF)V")
    public abstract void method481(float arg0, float arg1);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method439(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "()Z")
    public abstract boolean method524();

    @OriginalMember(owner = "client!tj", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field4495++;
        this.method2019(0);
    }

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "()Z")
    public abstract boolean method479();

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "()Z")
    public abstract boolean method517();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method482(Canvas arg0);

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "()Z")
    public abstract boolean method503();

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
    public abstract void method486(int arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(F)V")
    public abstract void method473(float arg0);

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "()Z")
    public abstract boolean method501();

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(IIIII)V")
    public abstract void method440(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "()V")
    public abstract void method476();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lqb;Lai;Lug;Laj;I)V")
    public abstract void method453(class257 arg0, class305 arg1, class118 arg2, class137 arg3, int arg4);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lok;Z)Ll;")
    public abstract class315 method463(class10 arg0, boolean arg1);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public abstract void method525(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "()Z")
    public abstract boolean method507();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IBIII)V")
    public final void method2017(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.method440(arg3, arg4, arg0, arg2, 1);
        if (arg1 != -3) {
            field4506 = -20;
        }
        field4507++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([Lqb;Lug;[Laj;I)V")
    public abstract void method480(class257[] arg0, class118 arg1, class137[] arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([IIIII)Ll;")
    public abstract class315 method514(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III[I)V")
    public abstract void method518(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "()V")
    public abstract void method456();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)I")
    public abstract int method465(int arg0, int arg1);

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "()Z")
    public abstract boolean method485();

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(IIII)V")
    public abstract void method462(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "()Z")
    public abstract boolean method424();

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
    public static void method2018(boolean arg0) {
        field4504 = null;
        field4505 = null;
        if (!arg0) {
            field4500 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(IIII)V")
    public abstract void method477(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II[[I[[IIII)Lda;")
    public abstract class193 method448(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "()Z")
    public abstract boolean method498();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lke;Lke;FLke;)Lke;")
    public abstract class295 method467(class295 arg0, class295 arg1, float arg2, class295 arg3);

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "()I")
    public abstract int method457();

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "()V")
    public abstract void method447();

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "()F")
    public abstract float method428();

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
    public abstract void method492(int arg0);

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
    public final void method2019(int arg0) {
        if (arg0 != 0) {
            this.method525(-34, -110, 27);
        }
        field4496++;
        class85.field1168[this.field4492] = false;
        this.method455();
    }

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "()Z")
    public abstract boolean method442();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIILsf;II)V")
    public abstract void method526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class421 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(I)Ldc;")
    public abstract class247 method452(int arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method488(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lug;)V")
    public abstract void method478(class118 arg0);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(Z)V")
    public abstract void method502(boolean arg0);

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
    public abstract void method527(int arg0);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(IIIII)V")
    public abstract void method443(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "()V")
    public abstract void method471();

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(IIIII)V")
    public abstract void method510(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2020(String arg0, int arg1) {
        field4493++;
        if (arg0 == null) {
            return;
        }
        if (!(class391.field5714 < 100 || class326.field4828) || class391.field5714 >= 200) {
            class295.method1996(class305.field4558, (byte) -62);
            return;
        }
        String var2 = class350.method2310(arg0, (byte) 78);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class391.field5714; var3++) {
            String var7 = class350.method2310(class30.field488[var3], (byte) 109);
            if (var7 != null && var7.equals(var2)) {
                class295.method1996(arg0 + class108.field1419, (byte) -62);
                return;
            }
            if (class96.field1302[var3] != null) {
                String var8 = class350.method2310(class96.field1302[var3], (byte) 112);
                if (var8 != null && var8.equals(var2)) {
                    class295.method1996(arg0 + class108.field1419, (byte) -62);
                    return;
                }
            }
        }
        int var4 = 0;
        if (arg1 != -2717) {
            return;
        }
        while (class184.field2479 > var4) {
            String var5 = class350.method2310(class373.field5504[var4], (byte) 112);
            if (var5 != null && var5.equals(var2)) {
                class295.method1996(class95.field1298 + arg0 + class366.field5401, (byte) -62);
                return;
            }
            if (class335.field4962[var4] != null) {
                String var6 = class350.method2310(class335.field4962[var4], (byte) 89);
                if (var6 != null && var6.equals(var2)) {
                    class295.method1996(class95.field1298 + arg0 + class366.field5401, (byte) -62);
                    return;
                }
            }
            var4++;
        }
        if (class350.method2310(class383.field5609.field4650, (byte) 85).equals(var2)) {
            class295.method1996(class68.field991, (byte) -62);
        } else {
            class116.field1503++;
            class140.field1797.method1833(-20379, 152);
            class140.field1797.method2204(class9.method61((byte) -117, arg0), 8);
            class140.field1797.method2214(arg0, -102);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ldc;)V")
    public abstract void method461(class247 arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BIIIII)V")
    public final void method2021(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method493(arg3, arg4, arg1, arg2, arg5, 1);
        if (arg0 <= -12) {
            field4501++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ld;IIII)Lqb;")
    public abstract class257 method468(class9 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "()I")
    public abstract int method451();

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([I)V")
    public abstract void method474(int[] arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lir;I)V")
    public static final void method2022(class185 arg0, int arg1) {
        field4494++;
        if (arg1 != 1024) {
            method2020((String) null, -78);
        }
        class325.field4816 = 0;
        class430.field6249 = 0;
        class309.field4576 = new class8();
        class452.field6563 = new class196[1024];
        class186.method1244(arg0, 256);
        class227.method1476(arg0, arg1 ^ 0x404);
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(IIII)V")
    public abstract void method438(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)I")
    public abstract int method436(int arg0, int arg1);

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "()I")
    public abstract int method495();

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(IIIIII)V")
    public final void method2023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method435(arg1, arg2, arg4, arg0, arg5, 1);
        if (arg3 == -11682) {
            field4508++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "()V")
    public abstract void method454();

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(Z)V")
    public abstract void method433(boolean arg0);

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "()Z")
    public abstract boolean method434();

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(III)V")
    public abstract void method450(int arg0, int arg1, int arg2);
}
