import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class44 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1100 = 0;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public int field1118 = 0;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1097 = -1;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field1115 = 0;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "Z")
    public static boolean field1104 = false;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Lgd;")
    public static class40 field1101 = class14.method90(false, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field1114 = 0;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Lgd;")
    public static class40 field1110 = class14.method90(false, "*6n");

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public int field1107;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public int field1108;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public int field1120;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lrb;")
    public static class103 field1105;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Laa;")
    public class1 field1121;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lmb;")
    public static class73 field1096;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Lpb;")
    public static class91 field1111;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method301(int arg0) {
        class100.field2374.method561((byte) -74);
        int var1 = -86 % ((-arg0 - 43) / 44);
        field1117++;
        class14.field402.method497(0, 0);
        class31.field793 = class109.method835(class31.field793);
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 25)
    public static final void method302(int arg0) {
        field1116++;
        if (class48.field1231 < 2 && class137.field3344 == 0 && class110.field2682 == 0) {
            return;
        }
        class40 var1;
        if (class137.field3344 == 1 && class48.field1231 < 2) {
            var1 = client.method114(true, new class40[] { class93.field2130, class34.field867, class103.field2460, class53.field1359 });
        } else if (class110.field2682 == 1 && class48.field1231 < 2) {
            var1 = client.method114(true, new class40[] { class2.field39, class34.field867, class4.field76, class53.field1359 });
        } else {
            var1 = class131.field3178[class48.field1231 - 1];
        }
        if (arg0 == 0) {
            if (class48.field1231 > 2) {
                var1 = client.method114(true, new class40[] { var1, class69.field1666, class21.method121(23444, class48.field1231 - 2), class16.field417 });
            }
            class1.field17.method354(var1, 4, 15, 16777215, true, class10.field242 / 1000);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z", line = 57)
    public static final boolean method303(int arg0, int arg1, int arg2) {
        if (arg1 == 11) {
            arg1 = 10;
        }
        field1119++;
        class14 var3 = class114.method884(arg0, (byte) -56);
        if (arg2 >= ~arg1 && arg1 <= 8) {
            arg1 = 4;
        }
        return var3.method94(arg1, (byte) 63);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIII)I", line = 119)
    public static final int method304(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == -1938566128) {
            field1112++;
            int var5 = 65536 - class109.field2657[arg2 * 1024 / arg1] >> 1;
            return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
        } else {
            return 118;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Z", line = 136)
    public static final boolean method305(int arg0, int arg1) {
        field1099++;
        if (!class94.method638(arg1, 0)) {
            return false;
        }
        class30[] var2 = class129.field3093[arg1];
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.length; var4++) {
            class30 var5 = var2[var4];
            if (var5 != null && var5.field660 == 6) {
                if (var5.field749 != -1 || var5.field642 != -1) {
                    boolean var6 = class115.method889(var5, 92);
                    int var7;
                    if (var6) {
                        var7 = var5.field642;
                    } else {
                        var7 = var5.field749;
                    }
                    if (var7 != -1) {
                        class45 var8 = class22.method126((byte) 112, var7);
                        var5.field702 += class86.field1919;
                        label57: while (true) {
                            do {
                                do {
                                    if (var5.field702 <= var8.field1123[var5.field742]) {
                                        break label57;
                                    }
                                    var3 = true;
                                    var5.field702 -= var8.field1123[var5.field742];
                                    var5.field742++;
                                } while (var8.field1155.length > var5.field742);
                                var5.field742 -= var8.field1142;
                            } while (var5.field742 >= 0 && var8.field1155.length > var5.field742);
                            var5.field742 = 0;
                        }
                    }
                }
                if (var5.field663 != 0 && !var5.field644) {
                    var3 = true;
                    int var9 = var5.field663 >> 16;
                    int var10 = class86.field1919 * var9;
                    int var11 = var5.field663 << 16 >> 16;
                    var5.field658 = var5.field658 + var10 & 0x7FF;
                    int var12 = class86.field1919 * var11;
                    var5.field646 = var5.field646 + var12 & 0x7FF;
                }
            }
        }
        if (arg0 != -866143504) {
            method304(13, 118, 92, 8, 86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIII)V", line = 223)
    public static final void method306(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1102++;
        if (arg4 != -23185) {
            method303(-30, 18, 126);
        }
        if (class94.method638(arg8, arg4 ^ 0xFFFFA56F)) {
            class34.method214(true, arg5, arg7, -1, arg1, arg3, arg6, class129.field3093[arg8], 0, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V", line = 243)
    public static void method307(int arg0) {
        field1101 = null;
        if (arg0 <= -29) {
            field1110 = null;
            field1096 = null;
            field1111 = null;
            field1105 = null;
        }
    }
}
