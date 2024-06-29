import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class564 {

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Lfa;")
    public class524 field8050;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field8053;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "F")
    public static float field8059;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field8052;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field8055;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field8056;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field8057;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field8058;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field8060;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field8061;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field8062;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field8063;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field8065;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "Ldba;")
    public static class240 field8064;

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 13)
    protected void finalize() {
        this.method3203(5);
        field8054++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 29)
    public static void method3196(int arg0) {
        field8064 = null;
        if (arg0 != 4122) {
            method3198(55);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILf;)V", line = 43)
    public final void method3197(int arg0, class534 arg1) {
        if (arg0 == -1427211255) {
            this.method990(arg1, true);
            field8061++;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)[Lpa;", line = 57)
    public static final class648[] method3198(int arg0) {
        if (arg0 == 25624) {
            field8065++;
            return new class648[] { class369.field5051, class329.field4023, class655.field9207 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILfa;Ljava/awt/Canvas;ILtf;)Lr;", line = 70)
    public static final synchronized class564 method3199(int arg0, int arg1, class524 arg2, Canvas arg3, int arg4, class701 arg5) {
        field8051++;
        if (arg0 == 0) {
            return class628.method3531(arg2, 1, arg3);
        } else if (arg0 == 2) {
            return class559.method3174(arg2, 1, arg3);
        } else if (arg0 == 1) {
            return class531.method2979(arg1, arg2, arg3, 14997);
        } else if (arg0 == 5) {
            return class303.method1755(arg5, arg2, arg1, arg3, (byte) 118);
        } else if (arg0 == 3) {
            return class111.method594(arg5, arg3, arg1, arg2, 28147);
        } else {
            int var6 = 66 / ((arg4 - 51) / 59);
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BIIIII)I", line = 106)
    public static final int method3200(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 61) {
            return -73;
        }
        field8062++;
        if (class156.field1743 == null) {
            return 0;
        }
        if (arg2 < 3) {
            int var6 = arg4 >> 9;
            int var7 = arg1 >> 9;
            if (arg5 < 0 || arg3 < 0 || arg5 > (class142.field1574 - 1) || arg3 > class140.field1550 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class142.field1574 - 1) || class140.field1550 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class16.field131[1][arg4 >> 9][arg1 >> 9] & 0x2) != 0;
            if ((arg4 & 0x1FF) == 0) {
                boolean var9 = (class16.field131[1][var6 - 1][arg1 >> 9] & 0x2) != 0;
                boolean var10 = (class16.field131[1][var6][arg1 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class16.field131[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if ((arg1 & 0x1FF) == 0) {
                boolean var11 = (class16.field131[1][arg4 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class16.field131[1][arg4 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class16.field131[1][arg5][arg3] & 0x2) != 0;
                }
            }
            if (var8) {
                arg2++;
            }
        }
        return class156.field1743[arg2].method1610(arg4, 120, arg1);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V", line = 167)
    public final void method3201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method999(arg5, arg4, arg1, arg3, arg0, 1);
        if (arg2 != 6195) {
            this.field8050 = null;
        }
        field8056++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 184)
    public final void method3202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8052++;
        this.method1030(arg3, arg1, arg4, arg2, arg0);
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V", line = 201)
    public final void method3203(int arg0) {
        if (arg0 != 5) {
            this.field8053 = 122;
        }
        field8057++;
        class551.field7879[this.field8053] = false;
        this.method1029();
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(BIIIII)V", line = 216)
    public final void method3204(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method957(arg4, arg2, arg1, arg5, arg3, 1);
        field8058++;
        if (arg0 != -55) {
            this.method999(75, -108, 26, -65, 68, -52);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V", line = 268)
    public final void method3205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1009(arg0, arg4, arg1, arg3, 1);
        field8055++;
        if (arg2 != -3027) {
            this.method3205(-101, 35, -23, 127, -72);
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V", line = 300)
    public class564(class524 arg0) {
        this.field8050 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class551.field7879[var3]) {
                var2 = var3;
                class551.field7879[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field8053 = var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIII)V", line = 333)
    public final void method3206(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1022(arg2, arg3, arg5, arg0, arg4, 1);
        field8063++;
        if (arg1 < 73) {
            this.method1002(-65);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIZ)V", line = 345)
    public final void method3207(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field8060++;
        if (arg4) {
            this.method1030(-44, -13, 112, 71, -24);
        }
        this.method1007(arg0, arg1, arg2, arg3, 1);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method976(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method971();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Leq;")
    public abstract class670 method1010(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method969();

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method1002(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lqw;I)V")
    public abstract void method1048(class332 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public abstract void method1029();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
    public abstract boolean method1052();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public abstract void method1011();

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method937(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class534 method951(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
    public abstract boolean method1044();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1046(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method977();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method992(class490 arg0);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method1006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
    public abstract void method1045();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
    public abstract void method1000();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class274 method1001(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method991(int arg0);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()I")
    public abstract int method953();

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method970(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public abstract void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
    public abstract boolean method965();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Llj;Llj;FLlj;)Llj;")
    public abstract class60 method959(class60 arg0, class60 arg1, float arg2, class60 arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class598 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method936(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method981();

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()Z")
    public abstract boolean method1038();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method1015(boolean arg0);

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()V")
    public abstract void method979() throws class20;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method952();

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method1047();

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method955(boolean arg0);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()Z")
    public abstract boolean method1008();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class534 method1025(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
    public abstract boolean method960();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method1004(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method973(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lho;[Lqo;Z)Lla;")
    public abstract class413 method998(class463 arg0, class550[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class534 method1017(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method1050();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lqw;)V")
    public abstract void method1033(class332 arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method1009(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()Lq;")
    public abstract class490 method950();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lqo;Z)Lf;")
    public abstract class534 method1041(class550 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method963(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method958(Rectangle[] arg0, int arg1) throws class20;

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method1039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method990(class534 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()Laj;")
    public abstract class286 method1037();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
    public abstract void method999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method956(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
    public abstract boolean method972();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method975(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
    public abstract boolean method1005();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method996(int[] arg0);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method944(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method949(float arg0);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()Lq;")
    public abstract class490 method983();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method1022(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method988(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method948(int arg0);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public abstract void method978(int arg0);

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method1031(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Leq;)V")
    public abstract void method1020(int arg0, class670[] arg1);

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method1019(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method1016(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method968(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Llj;)V")
    public abstract void method947(class60 arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method1018(int arg0);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
    public abstract boolean method946();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method1043(class385 arg0);

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method1021();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lef;IIII)Lda;")
    public abstract class473 method1051(class581 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()V")
    public abstract void method967();

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method941(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method954(boolean arg0);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()Lq;")
    public abstract class490 method1035();

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method938();

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method982(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)Le;")
    public abstract class385 method1012(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class598 method940(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
    public abstract void method1049();

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method966();

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method997(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "(I)V")
    public abstract void method942(int arg0);

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method1032(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
    public abstract boolean method939();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method1030(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
    public abstract boolean method1042();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)Llj;")
    public abstract class60 method961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method1036(int arg0, class598 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method1027(int arg0);

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method1007(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
    public abstract void method974();

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method994();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method993(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
    public abstract boolean method1053();
}
