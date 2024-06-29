import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class18 {

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "Ld;")
    public class673 field237;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field243 = new String[] { method245(method244("in")), method245(method244("G\rl\u0015<")), method245(method244("RV.W")), method245(method244("TBlq\u000b\u0014")), method245(method244("TBlu\u000b\u0014")), method245(method244("TBls\u000b\u0014")), method245(method244("TBlr\u000b\u0014")), method245(method244("TBln\u000b\u0014")), method245(method244("TBl\u0007(RJ6\u0005i")), method245(method244("re\u0016r")), method245(method244("TBlp\u000b\u0014")), method245(method244("TBlt\u000b\u0014")), method245(method244("TBlj\u000b\u0014")), method245(method244("TBlk\u000b\u0014")), method245(method244("TBli\u000b\u0014")), method245(method244("TBl](RB.R;Y\u000b")), method245(method244("TBlw\u000b\u0014")), method245(method244("TBlh\u000b\u0014")), method245(method244("TBlv\u000b\u0014")), method245(method244("TBl|\u000b\u0014")), method245(method244("TBlo\u000b\u0014")) };

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "Lhh;")
    public static class250 field235 = new class250(1);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "[I")
    public static int[] field241 = new int[32];

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "[I")
    public static int[] field242;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V", line = 6)
    public final void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.method237(arg1, arg5, arg0, arg3, arg4, 1);
            int var7 = 40 % ((arg2 - 3) / 42);
            field236++;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field243[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 28)
    public final void method131(byte arg0) throws class142 {
        try {
            field234++;
            if (arg0 == 87) {
                this.method132(0, 0);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field243[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ld;Llga;IIBILjava/awt/Canvas;I)Lha;", line = 57)
    public static final synchronized class18 method144(class673 arg0, class47 arg1, int arg2, int arg3, byte arg4, int arg5, Canvas arg6, int arg7) {
        try {
            field238++;
            if (arg7 == 0) {
                return class72.method758(arg0, arg6, arg5, arg3, -29406);
            } else if (arg7 == 2) {
                return class727.method5296(arg6, arg5, (byte) -125, arg3, arg0);
            } else {
                if (arg4 <= 107) {
                    field235 = null;
                }
                if (arg7 == 1) {
                    return class500.method3833(arg6, arg0, arg2, false);
                } else if (arg7 == 5) {
                    return class297.method2387(arg2, arg1, -640, arg0, arg6);
                } else if (arg7 == 3) {
                    return class295.method2381(arg1, true, arg2, arg0, arg6);
                } else {
                    throw new IllegalArgumentException(field243[0]);
                }
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field243[3] + (arg0 == null ? field243[2] : field243[1]) + ',' + (arg1 == null ? field243[2] : field243[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field243[2] : field243[1]) + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 97)
    public final void method147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field225++;
            this.method143(arg1, arg2, arg0, arg4, arg3);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field243[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V", line = 110)
    public static void method152(int arg0) {
        try {
            field241 = null;
            if (arg0 <= 107) {
                field242 = null;
            }
            field235 = null;
            field242 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field243[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI)V", line = 135)
    public final void method161(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        try {
            this.method213(arg2, arg0, arg1, arg4, 1);
            field229++;
            if (!arg3) {
                this.field240 = -62;
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field243[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltb;I)V", line = 146)
    public final void method162(class392 arg0, int arg1) {
        try {
            field224++;
            if (arg1 != 1) {
                field241 = null;
            }
            this.method165(this.method134(arg0, this.method191(arg0.method1376(), arg0.method1377())));
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field243[19] + (arg0 == null ? field243[2] : field243[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 172)
    protected void finalize() {
        try {
            this.method177((byte) -87);
            field239++;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field243[15] + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 185)
    public final void method177(byte arg0) {
        try {
            class584.field8431[this.field240] = false;
            field233++;
            if (arg0 != -87) {
                field235 = null;
            }
            this.method167();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field243[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ[Ljava/awt/Rectangle;)V", line = 204)
    public final void method183(int arg0, boolean arg1, Rectangle[] arg2) throws class142 {
        try {
            this.method224(arg2, arg0, 0, 0);
            field226++;
            if (!arg1) {
                this.method174(-103, -97, -25, 71, 0.5374112365966349D);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field243[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field243[2] : field243[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(II)I", line = 220)
    public static final int method188(int arg0, int arg1) {
        try {
            field231++;
            if (arg0 != -10251) {
                field235 = null;
            }
            return arg1 & 0x3FF;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field243[20] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V", line = 235)
    public static final void method192(int arg0, int arg1) {
        try {
            field228++;
            if (arg0 != 1) {
                field241 = null;
            }
            class398.field5797 = 2;
            class341.field4966 = class60.field916;
            class139.field1812 = arg1;
            class157.method1317(true, class216.field3166, 0, "", class216.field3166.equals(""));
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field243[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V", line = 256)
    public final void method200(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.method124(arg2, arg0, arg1, arg4, arg3);
            field223++;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field243[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IIBI)Ltb;", line = 264)
    public final class392 method201(int arg0, int arg1, int[] arg2, int arg3, byte arg4, int arg5) {
        try {
            int var7 = -121 / ((85 - arg4) / 40);
            field230++;
            return this.method180(arg2, arg5, arg1, arg3, arg0, true);
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field243[6] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field243[2] : field243[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V", line = 337)
    public final void method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field227++;
            this.method212(arg5, arg1, arg4, arg0, arg2, 1);
            if (arg3 > -11) {
                this.method238();
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field243[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIIIII)V", line = 348)
    public final void method242(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            this.method219(arg4, arg1, arg2, arg5, arg3, 1);
            field232++;
            if (arg0 <= 20) {
                this.method138();
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field243[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 360)
    public class18(class673 arg0) {
        try {
            this.field237 = arg0;
            int var2 = -1;
            for (int var3 = 0; var3 < 8; var3++) {
                if (!class584.field8431[var3]) {
                    var2 = var3;
                    class584.field8431[var3] = true;
                    break;
                }
            }
            if (var2 == -1) {
                throw new IllegalStateException(field243[9]);
            }
            this.field240 = var2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field243[8] + (arg0 == null ? field243[2] : field243[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method119(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method120(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method122();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method123();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method124(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method125();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkia;)V")
    public abstract void method126(class788 arg0);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method127(float arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Lqa;")
    public abstract class104 method129();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method130(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
    public abstract void method132(int arg0, int arg1) throws class142;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method133();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbha;Lkb;)Ltha;")
    public abstract class296 method134(class545 arg0, class102 arg1);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method135();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Lqa;")
    public abstract class104 method136();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method137();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()V")
    public abstract void method138();

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method139();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method140();

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method141(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lta;")
    public abstract class330 method142(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method143(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcd;[Lcu;Z)Lda;")
    public abstract class216 method145(class161 arg0, class66[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method146(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method148(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method149(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method150(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method151(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method153(int arg0, class685 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsn;Lsn;FLsn;)Lsn;")
    public abstract class369 method155(class369 arg0, class369 arg1, float arg2, class369 arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method156(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method157();

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method158();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)Lsn;")
    public abstract class369 method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method160(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()V")
    public abstract void method163();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method164();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltha;)V")
    public abstract void method165(class296 arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method166();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method167();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method168(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method169();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method170(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method172();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method173(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method174(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method175(int arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method176(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(II)Lbha;")
    public abstract class545 method179(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Ltb;")
    public abstract class392 method180(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method181();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method184();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method185(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class685 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method186();

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method187();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lta;)V")
    public abstract void method189(int arg0, class330[] arg1);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lkb;")
    public abstract class102 method191(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkia;I)V")
    public abstract void method193(class788 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method194(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method195();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Ltb;")
    public abstract class392 method196(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lrha;IIII)Lka;")
    public abstract class761 method197(class60 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()I")
    public abstract int method198();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method199(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method202();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method203(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqa;)V")
    public abstract void method204(class104 arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method205(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class751 method206(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method207(class348 arg0);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method208(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method209(int arg0);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Lcba;")
    public abstract class254 method210();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method213(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)Lza;")
    public abstract class348 method214(int arg0);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method215();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method216();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method217();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method218(int arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
    public abstract void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method220(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "()Lqa;")
    public abstract class104 method221();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Ltb;")
    public abstract class392 method222(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method223(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method224(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class142;

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method225();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method226(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method227(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsn;)V")
    public abstract void method228(class369 arg0);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method229(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method230(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcu;Z)Ltb;")
    public abstract class392 method231(class66 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method232(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method233(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
    public abstract void method234();

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method235(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class685 method236(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method237(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
    public abstract void method238();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method239(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method240();

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method243(int arg0);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method244(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x41);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method245(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 66;
                    break;
                case 3:
                    var10005 = 59;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
