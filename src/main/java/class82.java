import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public abstract class class82 extends class544 {

    @OriginalMember(owner = "client!al", name = "n", descriptor = "[Lal;")
    public class82[] field980;

    @OriginalMember(owner = "client!al", name = "G", descriptor = "Z")
    public boolean field999;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public static int field981 = 0;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "Lmf;")
    public static class354 field991 = new class354();

    @OriginalMember(owner = "client!al", name = "H", descriptor = "Lvj;")
    public static class373 field1000 = new class373(79, 12);

    @OriginalMember(owner = "client!al", name = "K", descriptor = "I")
    public static int field1003 = -1;

    @OriginalMember(owner = "client!al", name = "I", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "I")
    public int field987;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!al", name = "A", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!al", name = "B", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!al", name = "D", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!al", name = "E", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!al", name = "F", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "Lpba;")
    public class276 field990;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "Ltda;")
    public class543 field992;

    @OriginalMember(owner = "client!al", name = "C", descriptor = "[Lha;")
    public static class52[] field995;

    @OriginalMember(owner = "client!al", name = "J", descriptor = "[[I")
    public static int[][] field1002;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 3)
    public int method480(int arg0) {
        field985++;
        if (arg0 != 1) {
            this.method489(false, -56, -95);
        }
        return -1;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(II)[[I", line = 14)
    public int[][] method481(int arg0, int arg1) {
        if (arg0 != 1000) {
            this.method201(41, 65);
        }
        field998++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/awt/Canvas;I)Lfk;", line = 34)
    public static final class558 method482(Canvas arg0, int arg1) {
        field986++;
        try {
            if (arg1 < 126) {
                field995 = null;
            }
            Class var2 = Class.forName("wp");
            class558 var3 = (class558) var2.getDeclaredConstructor().newInstance();
            var3.method229(true, arg0);
            return var3;
        } catch (Throwable var5) {
            class43 var4 = new class43();
            var4.method229(true, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lqa;IILm;III[[[B[I[I[I[I[IIBIIZ)V", line = 58)
    public static final void method483(class206 arg0, int arg1, int arg2, class163 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class638.field9190 = arg0;
        class22.field150 = arg1;
        class617.field8932 = arg3;
        class562.field8273 = class638.field9190.method1122() > 0;
        class144.field1735 = arg4 >> class362.field4756;
        class222.field2728 = arg6 >> class362.field4756;
        class103.field1263 = arg4;
        class76.field894 = arg6;
        class170.field2071 = arg5;
        class391.field5184 = class144.field1735 - class244.field3140;
        if (class391.field5184 < 0) {
            class191.field2304 = -class391.field5184;
            class391.field5184 = 0;
        } else {
            class191.field2304 = 0;
        }
        class325.field4157 = class222.field2728 - class244.field3140;
        if (class325.field4157 < 0) {
            class110.field1356 = -class325.field4157;
            class325.field4157 = 0;
        } else {
            class110.field1356 = 0;
        }
        class341.field4393 = class244.field3140 + class144.field1735;
        if (class341.field4393 > class238.field2985) {
            class341.field4393 = class238.field2985;
        }
        class163.field1995 = class244.field3140 + class222.field2728;
        if (class163.field1995 > class548.field8061) {
            class163.field1995 = class548.field8061;
        }
        for (int var18 = 0; var18 < class244.field3140 + class244.field3140 + 2; var18++) {
            for (int var23 = 0; var23 < class244.field3140 + class244.field3140 + 2; var23++) {
                int var24 = class144.field1735 + var18 - class244.field3140;
                int var25 = class222.field2728 + var23 - class244.field3140;
                if (var24 >= 0 && var25 >= 0 && var24 < class238.field2985 && var25 < class548.field8061) {
                    int var26 = var24 << class362.field4756;
                    int var27 = var25 << class362.field4756;
                    int var28 = class90.field1114[class90.field1114.length - 1].method855(var24, var25) - (0x3E8 << class362.field4756 - 7);
                    int var29 = class370.field4884 == null ? class90.field1114[0].method855(var24, var25) + class79.field929 : class370.field4884[0].method855(var24, var25) + class79.field929;
                    class78.field918[var18][var23] = class638.field9190.method1102(var26, var28, var27, var26, var29, var27);
                } else {
                    class78.field918[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class244.field3140 + class244.field3140 + 1; var19++) {
            for (int var22 = 0; var22 < class244.field3140 + class244.field3140 + 1; var22++) {
                class201.field2419[var19][var22] = class78.field918[var19][var22] || class78.field918[var19 + 1][var22] || class78.field918[var19][var22 + 1] || class78.field918[var19 + 1][var22 + 1];
            }
        }
        class595.field8634 = arg8;
        class473.field6635 = arg9;
        class556.field8166 = arg10;
        class459.field6332 = arg11;
        class32.field251 = arg12;
        class336.method1894();
        class54.method306(class638.field9190, 28550);
        for (class318 var20 = (class318) class504.field6989.method1987(true); var20 != null; var20 = (class318) class504.field6989.method1994(6408)) {
            var20.method610((byte) -111);
            class37.method206(true, var20);
        }
        if (class562.field8273) {
            for (int var21 = 0; var21 < class460.field6344; var21++) {
                class602.field8699[var21].method1848(arg17, false, arg1);
            }
        }
        if (arg2 > 1) {
            class638.field9190.method275(0);
            if (class367.field4820 == null || class367.field4820 instanceof class588) {
                class367.field4820 = new class386();
            }
        } else if (class367.field4820 == null || class367.field4820 instanceof class386) {
            class367.field4820 = new class588();
        }
        class367.field4820.method1324(arg2, false);
        class367.field4820.method1323((byte) 127);
        if (class292.field3786 != null) {
            class546.method3200(true);
            class367.field4820.method1333(18936, 22);
            class544.method3185(arg2, null, 0, (byte) 0, arg15, arg16);
            class367.field4820.method1323((byte) 108);
            class367.field4820.method1333(18936, 23);
            class546.method3200(false);
        }
        class544.method3185(arg2, arg7, arg13, arg14, arg15, arg16);
        class367.field4820.method1323((byte) 120);
        class367.field4820.method1329(5000);
        class367.field4820.method1323((byte) 107);
        if (arg2 > 1) {
            class638.field9190.method278(0);
        }
        class638.field9190.method1193(0, null);
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(II)[I", line = 213)
    public int[] method201(int arg0, int arg1) {
        if (arg1 != 12218) {
            this.field990 = null;
        }
        field988++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(III)B", line = 227)
    public static final byte method484(int arg0, int arg1, int arg2) {
        int var3 = -55 / ((23 - arg2) / 51);
        field997++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 244)
    public void method485(int arg0) {
        field979++;
        if (this.field999) {
            this.field990.method1570((byte) -76);
            this.field990 = null;
        } else {
            this.field992.method3182((byte) 113);
            this.field992 = null;
        }
        if (arg0 >= -63) {
            this.method201(108, 106);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;", line = 272)
    public static final String method486(int arg0, int arg1, int arg2, String[] arg3) {
        field993++;
        if (arg0 == 0) {
            return "";
        } else if (~arg0 == arg2) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 341)
    public void method438(int arg0) {
        if (arg0 != -2) {
            this.method481(-12, -77);
        }
        field982++;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(III)V", line = 351)
    public void method487(int arg0, int arg1, int arg2) {
        field989++;
        int var4 = this.field987 == 255 ? arg1 : this.field987;
        if (arg2 < 94) {
            return;
        }
        if (this.field999) {
            this.field990 = new class276(var4, arg1, arg0);
        } else {
            this.field992 = new class543(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(III)[[I", line = 378)
    public final int[][] method488(int arg0, int arg1, int arg2) {
        if (arg2 != 1) {
            return null;
        }
        field983++;
        if (this.field980[arg0].field999) {
            int[] var4 = this.field980[arg0].method201(arg1, arg2 ^ 0x2FBB);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field980[arg0].method481(arg2 ^ 0x3E9, arg1);
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IILos;)V", line = 414)
    public void method198(int arg0, int arg1, class374 arg2) {
        int var4 = 114 / ((-arg1 - 69) / 42);
        field984++;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(ZII)[I", line = 423)
    public final int[] method489(boolean arg0, int arg1, int arg2) {
        field994++;
        if (arg0) {
            return null;
        } else if (this.field980[arg1].field999) {
            return this.field980[arg1].method201(arg2, 12218);
        } else {
            return this.field980[arg1].method481(1000, arg2)[0];
        }
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 444)
    public static void method490(int arg0) {
        field1000 = null;
        field1002 = null;
        field991 = null;
        if (arg0 > -36) {
            field991 = null;
        }
        field995 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ldn;B)I", line = 458)
    public static final int method491(class438 arg0, byte arg1) {
        field1001++;
        int var2 = 0;
        if (arg1 != -61) {
            return -102;
        }
        if (arg0.method2566(111, class325.field4147)) {
            var2++;
        }
        if (arg0.method2566(121, class249.field3177)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IZ)V", line = 484)
    public class82(int arg0, boolean arg1) {
        this.field980 = new class82[arg0];
        this.field999 = arg1;
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "(I)I", line = 505)
    public int method492(int arg0) {
        if (arg0 == -1) {
            field996++;
            return -1;
        } else {
            return -5;
        }
    }
}
