import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class85 {

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1473 = 0;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "Lub;")
    public static class227 field1475 = class257.method1749("Musik)2Engine vorbereitet)3", 17263);

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1481 = 0;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1477;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Lfh;")
    public class180 field1474;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
    public static void method510(boolean arg0) {
        field1475 = null;
        if (arg0) {
            field1475 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I[BIB[IIIIII)V")
    public static final void method511(int arg0, byte[] arg1, int arg2, byte arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1478++;
        if (arg3 < 92) {
            return;
        }
        int var10 = -(arg7 >> 2);
        int var11 = -(arg7 & 0x3);
        for (int var12 = -arg2; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg5++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg6;
                }
                if (arg1[arg5++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg6;
                }
                if (arg1[arg5++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg6;
                }
                if (arg1[arg5++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg6;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg1[arg5++] == 0) {
                    arg9++;
                } else {
                    arg4[arg9++] = arg6;
                }
            }
            arg5 += arg8;
            arg9 += arg0;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static final void method512(int arg0) {
        if (arg0 != -12166) {
            method516((byte) -78);
        }
        field1472++;
        while (class32.field512.method665(class179.field3073, 7) >= 11) {
            int var1 = class32.field512.method660(11, true);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class27.field446[var1] == null) {
                class27.field446[var1] = new class225();
                var2 = true;
                if (class42.field684[var1] != null) {
                    class27.field446[var1].method1419((byte) 17, class42.field684[var1]);
                }
            }
            class15.field278[class146.field2512++] = var1;
            class225 var3 = class27.field446[var1];
            var3.field73 = class253.field4393;
            int var4 = class32.field512.method660(5, true);
            if (var4 > 15) {
                var4 -= 32;
            }
            int var5 = class32.field512.method660(1, true);
            int var6 = class32.field512.method660(5, true);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class133.field2308[class32.field512.method660(3, true)];
            if (var2) {
                var3.field94 = var3.field106 = var7;
            }
            int var8 = class32.field512.method660(1, true);
            if (var8 == 1) {
                class131.field2293[class147.field2572++] = var1;
            }
            var3.method18(class216.field3639.field49[0] + var4, class216.field3639.field78[0] + var6, var5 == 1, 65);
        }
        class32.field512.method662(-103);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)V")
    public static final void method513(byte arg0, int arg1) {
        if (class140.field2419 == 0) {
            class235.field4078.method1703(16, arg1);
        } else {
            class72.field1257 = arg1;
        }
        int var2 = 59 / ((arg0 + 21) / 54);
        field1482++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lih;")
    public static final class69 method514(Throwable arg0, String arg1) {
        class69 var2;
        if (arg0 instanceof class69) {
            var2 = (class69) arg0;
            var2.field1220 = var2.field1220 + ' ' + arg1;
        } else {
            var2 = new class69(arg0, arg1);
        }
        field1477++;
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
    public static final void method515(int arg0) {
        class11 var1 = class134.field2341;
        synchronized (class134.field2341) {
            class73.field1278++;
            class60.field1119 = class99.field1737;
            if (class251.field4352 >= 0) {
                while (class251.field4352 != class156.field2682) {
                    int var2 = class32.field529[class156.field2682];
                    class156.field2682 = class156.field2682 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class213.field3595[var2] = true;
                    } else {
                        class213.field3595[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class213.field3595[var3] = false;
                }
                class251.field4352 = class156.field2682;
            }
            class99.field1737 = class31.field501;
        }
        int var4 = 51 / ((arg0 - 45) / 39);
        field1476++;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)V")
    public static final void method516(byte arg0) {
        if (arg0 < 92) {
            method515(118);
        }
        class197.field3375.method1728(true);
        field1479++;
        class171.field2866.method1728(true);
    }
}
