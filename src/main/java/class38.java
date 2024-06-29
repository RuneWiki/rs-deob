import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class38 {

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "Lga;")
    public class277 field425;

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
    public int field430;

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "Lsl;")
    public static class318 field436;

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "Lsl;")
    public static class318 field438;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "[Ll;")
    public static class16[] field437;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "()V")
    public abstract void method289();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
    public abstract void method290(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lvp;)V")
    public abstract void method291(int arg0, class124[] arg1);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "()V")
    public abstract void method292();

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
    public abstract void method293(float arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIII)V")
    public final void method294(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field428++;
        this.method310(arg3, arg1, arg2, arg4, 1);
        if (arg0 != 0) {
            this.method349(38, -80, -82, -122, true);
        }
    }

    @OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
    public abstract void method295(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lga;ILjava/awt/Canvas;IBLet;)Lya;")
    public static final synchronized class38 method296(class277 arg0, int arg1, Canvas arg2, int arg3, byte arg4, class419 arg5) {
        field432++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class487.field7159[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class38 var9;
        if (arg3 == 0) {
            var9 = class219.method1499(arg2, 23932, var6, arg0);
        } else if (arg3 == 1) {
            var9 = class517.method3073(var6, arg2, -3210, arg5, arg1, arg0);
        } else if (arg3 == 2) {
            var9 = class265.method1710((byte) 90, arg2, var6, arg5, arg0);
        } else {
            throw new IllegalArgumentException("UM");
        }
        int var10 = 42 % ((23 - arg4) / 32);
        class487.field7159[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "()Z")
    public abstract boolean method297();

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "()Z")
    public abstract boolean method298();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lu;)V")
    public abstract void method299(class53 arg0);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "()Z")
    public abstract boolean method300();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
    public abstract void method301(int arg0);

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "()V")
    public abstract void method302();

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "()Z")
    public abstract boolean method303();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method304(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
    public abstract void method305(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
    public abstract void method306(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method307(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lc;)V")
    public abstract void method308(class122 arg0);

    @OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
    public abstract int method309();

    @OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
    public abstract void method310(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
    public abstract boolean method311();

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "()Z")
    public abstract boolean method312();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljq;IIII)Lt;")
    public abstract class471 method314(class353 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
    public abstract void method315(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIII)V")
    public final void method316(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -124) {
            this.method380(5, 84, 47, 61);
        }
        this.method391(arg3, arg2, arg0, arg4, 1);
        field423++;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
    public abstract void method317(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "()Z")
    public abstract boolean method318();

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
    public abstract void method319(float arg0, float arg1);

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field431++;
        this.method333(true);
    }

    @OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
    public abstract int method320();

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "()Z")
    public abstract boolean method321();

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "()I")
    public abstract int method322();

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
    public abstract boolean method323();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lt;Lmc;Lc;Lmi;I)V")
    public abstract void method324(class471 arg0, class88 arg1, class122 arg2, class341 arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method325(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
    public abstract boolean method326();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
    public abstract int method327();

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
    public abstract void method328();

    @OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
    public abstract void method329(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Ll;")
    public abstract class16 method330(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public abstract void method331();

    @OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
    public abstract void method332(int[] arg0);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
    public final void method333(boolean arg0) {
        class487.field7159[this.field430] = false;
        field429++;
        this.method292();
        if (!arg0) {
            this.field430 = 58;
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)Ltb;")
    public abstract class274 method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)I")
    public abstract int method335(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
    public static final void method336(int arg0) {
        if (arg0 != 0) {
            field437 = null;
        }
        field427++;
        if (class388.field5744 <= 0) {
            class282.field4109 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class474.field6989.length; var2++) {
            if (class474.field6989[var2].startsWith("--> ")) {
                var1++;
                if (class388.field5744 == var1) {
                    class282.field4109 = class474.field6989[var2].substring(4);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V")
    public static void method337(int arg0) {
        field438 = null;
        field436 = null;
        if (arg0 < -126) {
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method338(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
    public abstract void method339();

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)V")
    public abstract void method340(int arg0);

    @OriginalMember(owner = "client!ya", name = "s", descriptor = "()Lc;")
    public abstract class122 method341();

    @OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
    public abstract int method342();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lgt;[Lbb;Z)Lla;")
    public abstract class314 method343(class316 arg0, class218[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lmc;)V")
    public abstract void method345(class88 arg0);

    @OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
    public abstract void method346(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "t", descriptor = "()V")
    public abstract void method347();

    @OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
    public abstract boolean method348();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Ll;")
    public abstract class16 method349(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "v", descriptor = "()V")
    public abstract void method350();

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
    public abstract int method351(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
    public abstract void method352(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
    public abstract void method353(int arg0);

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)Lu;")
    public abstract class53 method354(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lma;")
    public abstract class10 method355(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
    public abstract boolean method356();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILma;II)V")
    public abstract void method357(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILma;II)V")
    public abstract void method358(int arg0, class10 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ltb;)V")
    public abstract void method359(class274 arg0);

    @OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
    public abstract void method360(int arg0);

    @OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
    public abstract float method361();

    @OriginalMember(owner = "client!ya", name = "y", descriptor = "()Lc;")
    public abstract class122 method362();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method363(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "z", descriptor = "()Z")
    public abstract boolean method364();

    @OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
    public abstract boolean method365(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "A", descriptor = "()V")
    public static final void method366() {
        class299.field4291 = 0;
        label212: for (int var0 = 0; var0 < class209.field3030; var0++) {
            class413 var1 = class382.field5621[var0];
            if (class28.field341 != null) {
                for (int var2 = 0; var2 < class28.field341.length; var2++) {
                    if (class28.field341[var2] != -1000000 && (var1.field6136 <= class28.field341[var2] || var1.field6129 <= class28.field341[var2]) && (var1.field6122 <= class496.field7280[var2] || var1.field6139 <= class496.field7280[var2]) && (var1.field6122 >= class183.field2587[var2] || var1.field6139 >= class183.field2587[var2]) && (var1.field6126 <= class495.field7255[var2] || var1.field6123 <= class495.field7255[var2]) && (var1.field6126 >= class364.field5098[var2] || var1.field6123 >= class364.field5098[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field6127 == 1) {
                int var3 = var1.field6133 + class385.field5672 - class321.field4527;
                if (var3 >= 0 && var3 <= class385.field5672 + class385.field5672) {
                    int var4 = var1.field6121 + class385.field5672 - class209.field3040;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class385.field5672 + class385.field5672) {
                        continue;
                    }
                    int var5 = var1.field6124 + class385.field5672 - class209.field3040;
                    if (var5 > class385.field5672 + class385.field5672) {
                        var5 = class385.field5672 + class385.field5672;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class350.field4844[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class215.field3070 - var1.field6122;
                        if (var7 > class86.field1170) {
                            var1.field6134 = 1;
                        } else {
                            if (var7 >= -class86.field1170) {
                                continue;
                            }
                            var1.field6134 = 2;
                            var7 = -var7;
                        }
                        var1.field6119 = (var1.field6126 - class55.field585 << 8) / var7;
                        var1.field6137 = (var1.field6123 - class55.field585 << 8) / var7;
                        var1.field6135 = (var1.field6136 - class456.field6707 << 8) / var7;
                        var1.field6130 = (var1.field6129 - class456.field6707 << 8) / var7;
                        class244.field3585[class299.field4291++] = var1;
                    }
                }
            } else if (var1.field6127 == 2) {
                int var8 = var1.field6121 + class385.field5672 - class209.field3040;
                if (var8 >= 0 && var8 <= class385.field5672 + class385.field5672) {
                    int var9 = var1.field6133 + class385.field5672 - class321.field4527;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class385.field5672 + class385.field5672) {
                        continue;
                    }
                    int var10 = var1.field6131 + class385.field5672 - class321.field4527;
                    if (var10 > class385.field5672 + class385.field5672) {
                        var10 = class385.field5672 + class385.field5672;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class350.field4844[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class55.field585 - var1.field6126;
                        if (var12 > class86.field1170) {
                            var1.field6134 = 3;
                        } else {
                            if (var12 >= -class86.field1170) {
                                continue;
                            }
                            var1.field6134 = 4;
                            var12 = -var12;
                        }
                        var1.field6120 = (var1.field6122 - class215.field3070 << 8) / var12;
                        var1.field6125 = (var1.field6139 - class215.field3070 << 8) / var12;
                        var1.field6135 = (var1.field6136 - class456.field6707 << 8) / var12;
                        var1.field6130 = (var1.field6129 - class456.field6707 << 8) / var12;
                        class244.field3585[class299.field4291++] = var1;
                    }
                }
            } else if (var1.field6127 == 4) {
                int var13 = var1.field6136 - class456.field6707;
                if (var13 > class443.field6569) {
                    int var14 = var1.field6121 + class385.field5672 - class209.field3040;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class385.field5672 + class385.field5672) {
                        continue;
                    }
                    int var15 = var1.field6124 + class385.field5672 - class209.field3040;
                    if (var15 > class385.field5672 + class385.field5672) {
                        var15 = class385.field5672 + class385.field5672;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field6133 + class385.field5672 - class321.field4527;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class385.field5672 + class385.field5672) {
                        continue;
                    }
                    int var17 = var1.field6131 + class385.field5672 - class321.field4527;
                    if (var17 > class385.field5672 + class385.field5672) {
                        var17 = class385.field5672 + class385.field5672;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class350.field4844[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field6134 = 5;
                        var1.field6120 = (var1.field6122 - class215.field3070 << 8) / var13;
                        var1.field6125 = (var1.field6139 - class215.field3070 << 8) / var13;
                        var1.field6119 = (var1.field6126 - class55.field585 << 8) / var13;
                        var1.field6137 = (var1.field6123 - class55.field585 << 8) / var13;
                        class244.field3585[class299.field4291++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIBII)V")
    public final void method367(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.method386(arg0, arg2, arg1, arg5, arg4, 1);
        if (arg3 != 58) {
            field438 = null;
        }
        field422++;
    }

    @OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
    public abstract void method368(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
    public abstract void method369(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)V")
    public final void method370(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method397(arg0, arg5, arg4, arg2, arg1, 1);
        if (arg3 != 8) {
            field435 = 22;
        }
        field434++;
    }

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)V")
    public final void method371(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method379(arg2, arg0, arg4, arg3, arg1, 1);
        field426++;
        if (arg5 != 4) {
            field437 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
    public abstract void method372(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
    public abstract void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public abstract class142 method374(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ltb;Ltb;FLtb;)Ltb;")
    public abstract class274 method375(class274 arg0, class274 arg1, float arg2, class274 arg3);

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILga;)V")
    public class38(int arg0, class277 arg1) {
        this.field425 = arg1;
        this.field430 = arg0;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lmc;Lc;[Lmi;I)V")
    public abstract void method376(class471[] arg0, class88 arg1, class122 arg2, class341[] arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "()Z")
    public abstract boolean method377();

    @OriginalMember(owner = "client!ya", name = "C", descriptor = "()Z")
    public abstract boolean method378();

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)V")
    public abstract void method379(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
    public abstract void method380(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
    public abstract void method381(int arg0);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)V")
    public abstract void method382(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
    public abstract int method383();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(BIIII)V")
    public final void method384(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field421++;
        if (arg0 != 76) {
            this.method306(110, -37, -74, 11);
        }
        this.method329(arg3, arg1, arg2, arg4, 1);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIB)Z")
    public static final boolean method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        if (arg8 < 118) {
            return false;
        }
        field424++;
        if (arg7 + arg4 > arg6 && (arg2 + arg6) > arg7) {
            return (arg1 + arg3) > arg5 && (arg0 + arg5) > arg1;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
    public abstract void method386(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "(I)V")
    public abstract void method387(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lc;[Lmi;I)V")
    public abstract void method388(class471[] arg0, class122 arg1, class341[] arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lbb;Z)Ll;")
    public abstract class16 method389(class218 arg0, boolean arg1);

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(Z)V")
    public abstract void method390(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
    public abstract void method391(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lvp;")
    public abstract class124 method392(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
    public abstract int[] method393(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
    public abstract void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
    public abstract float method395();

    @OriginalMember(owner = "client!ya", name = "D", descriptor = "()V")
    public abstract void method396();

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "(IIIIII)V")
    public abstract void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    static {
        new class331("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
        field433 = -1;
        field436 = new class318(7, 7);
        new class331(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field438 = new class318(10, 7);
    }
}
