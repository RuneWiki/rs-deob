import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public abstract class class232 {

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lwe;")
    public static class147 field4142 = new class147(32);

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "[I")
    public static int[] field4150 = new int[2];

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field4152 = 0;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "Le;")
    public static class191 field4148 = class54.method368("Verbindung mit Update)2Server)3)3)3", 2047);

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "[Lo;")
    public static class12[] field4147 = new class12[100];

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "[I")
    public static int[] field4153 = new int[100];

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field4138;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "[[I")
    public static int[][] field4151;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)Le;")
    public static final class191 method1640(int arg0, int arg1) {
        field4143++;
        if (~arg1 > arg0) {
            return class228.method1629(new class191[] { class227.field4081, class92.method563(arg0 ^ 0x186C0, arg1), class156.field2662 }, (byte) -4);
        } else if (arg1 < 10000000) {
            return class228.method1629(new class191[] { class206.field3669, class92.method563(-98, arg1 / 1000), class127.field2115, class156.field2662 }, (byte) -16);
        } else {
            return class228.method1629(new class191[] { class253.field4485, class92.method563(arg0 + 99918, arg1 / 1000000), class1.field6, class156.field2662 }, (byte) -54);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1641(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class101.field1617 = arg0;
        class67.field1168 = arg6;
        class267.field4719 = arg5;
        field4137++;
        class5.field48 = arg4;
        class17.field224 = arg1;
        if (arg3 && class267.field4719 >= 100) {
            class137.field2306 = class5.field48 * 128 + 64;
            class244.field4353 = class67.field1168 * 128 + 64;
            class229.field4116 = class222.method1546(class261.field4598, class137.field2306, class244.field4353, 247425607) - class17.field224;
        }
        if (arg2 != -14563) {
            method1640(-110, -3);
        }
        class243.field4345 = 2;
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V")
    public abstract void method404(int arg0, int arg1);

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "([Led;ZII)V")
    public static final void method1642(class262[] arg0, boolean arg1, int arg2, int arg3) {
        if (arg2 > arg3) {
            int var4 = arg2 + 1;
            int var5 = arg3 - 1;
            int var6 = (arg2 + arg3) / 2;
            class262 var7 = arg0[var6];
            arg0[var6] = arg0[arg3];
            arg0[arg3] = var7;
            while (var4 > var5) {
                boolean var8 = true;
                do {
                    var4--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class121.field1965[var9] == 2) {
                            var10 = arg0[var4].field4640;
                            var11 = var7.field4640;
                        } else if (class121.field1965[var9] == 1) {
                            var10 = arg0[var4].field4644;
                            if (var10 == -1 && class267.field4722[var9] == 1) {
                                var10 = 2001;
                            }
                            var11 = var7.field4644;
                            if (var11 == -1 && class267.field4722[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class121.field1965[var9] == 3) {
                            var10 = arg0[var4].field4642 ? 1 : 0;
                            var11 = var7.field4642 ? 1 : 0;
                        } else {
                            var11 = var7.field4645;
                            var10 = arg0[var4].field4645;
                        }
                        if (var10 != var11) {
                            if ((class267.field4722[var9] != 1 || var10 <= var11) && (class267.field4722[var9] != 0 || var11 <= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var5++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class121.field1965[var13] == 2) {
                            var14 = var7.field4640;
                            var15 = arg0[var5].field4640;
                        } else if (class121.field1965[var13] == 1) {
                            var14 = var7.field4644;
                            if (var14 == -1 && class267.field4722[var13] == 1) {
                                var14 = 2001;
                            }
                            var15 = arg0[var5].field4644;
                            if (var15 == -1 && class267.field4722[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class121.field1965[var13] == 3) {
                            var14 = var7.field4642 ? 1 : 0;
                            var15 = arg0[var5].field4642 ? 1 : 0;
                        } else {
                            var15 = arg0[var5].field4645;
                            var14 = var7.field4645;
                        }
                        if (var14 != var15) {
                            if ((class267.field4722[var13] != 1 || var14 <= var15) && (class267.field4722[var13] != 0 || var15 <= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var5 < var4) {
                    class262 var16 = arg0[var5];
                    arg0[var5] = arg0[var4];
                    arg0[var4] = var16;
                }
            }
            method1642(arg0, true, var4, arg3);
            method1642(arg0, true, arg2, var4 + 1);
        }
        if (!arg1) {
            field4142 = null;
        }
        field4141++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V")
    public static void method1643(boolean arg0) {
        field4142 = null;
        field4151 = null;
        if (!arg0) {
            field4148 = null;
        }
        field4153 = null;
        field4150 = null;
        field4148 = null;
        field4147 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)V")
    public abstract void method409(int arg0, int arg1, int arg2);
}
