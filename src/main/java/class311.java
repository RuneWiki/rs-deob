import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class311 extends class34 {

    @OriginalMember(owner = "client!hb", name = "V", descriptor = "Lwc;")
    public class30 field5367;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "Lke;")
    public static class256 field5355 = class316.method2202("Benutzeroberfl-=che geladen)3", 27626);

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Lke;")
    public static class256 field5361 = class316.method2202("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 27626);

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    public static int field5358 = 0;

    @OriginalMember(owner = "client!hb", name = "R", descriptor = "Lke;")
    public static class256 field5363 = class316.method2202("l", 27626);

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "I")
    public static int field5357 = 0;

    @OriginalMember(owner = "client!hb", name = "T", descriptor = "I")
    public static int field5365 = 0;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "Lke;")
    private static class256 field5359 = class316.method2202("Loading world list data", 27626);

    @OriginalMember(owner = "client!hb", name = "U", descriptor = "Lke;")
    public static class256 field5366 = field5359;

    @OriginalMember(owner = "client!hb", name = "W", descriptor = "Lke;")
    public static class256 field5368 = class316.method2202("leuchten3:", 27626);

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field5360;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
    public static int field5364;

    @OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
    public static int field5369;

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)I", line = 17)
    public static final int method2152(byte arg0) {
        field5364++;
        if (class279.field4863 == 0) {
            return 0;
        } else if (arg0 <= 67) {
            return -27;
        } else {
            return class72.field1316[class279.field4863].method90();
        }
    }

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "(I)V", line = 32)
    public static final void method2153(int arg0) {
        if (class129.field2261 != null) {
            class167 var1 = class129.field2261;
            synchronized (class129.field2261) {
                class129.field2261 = null;
            }
        }
        if (arg0 >= -7) {
            field5368 = (class256) null;
        }
        field5356++;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)I", line = 55)
    public static final int method2154(int arg0, int arg1) {
        int var2 = 0;
        field5353++;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg0 >= ~arg1) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[Ljava/lang/Object;II[J)V", line = 102)
    public static final void method2155(int arg0, Object[] arg1, int arg2, int arg3, long[] arg4) {
        if (arg0 != 2) {
            field5361 = (class256) null;
        }
        if (arg2 > arg3) {
            int var5 = (arg3 + arg2) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var9;
            for (int var10 = arg3; var10 < arg2; var10++) {
                if ((long) (var10 & 0x1) + var7 > arg4[var10]) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var13 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var13;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var9;
            method2155(2, arg1, var6 - 1, arg3, arg4);
            method2155(2, arg1, arg2, var6 + 1, arg4);
        }
        field5362++;
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)V", line = 169)
    public static void method2156(boolean arg0) {
        field5368 = null;
        field5361 = null;
        field5366 = null;
        if (!arg0) {
            field5363 = null;
            field5355 = null;
            field5359 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V", line = 184)
    public static final void method2157(byte arg0) {
        class215.field3834.method2084(-98);
        int var1 = -82 % ((arg0 + 1) / 41);
        class36.field642.method2084(115);
        field5369++;
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(III)Z", line = 196)
    public static final boolean method2158(int arg0, int arg1, int arg2) {
        class273 var3 = class271.method1871(122, arg0);
        if (arg2 == 11) {
            arg2 = 10;
        }
        field5354++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        if (arg1 != 4) {
            method2154(24, -68);
        }
        return var3.method1880(arg1 - 117, arg2);
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lwc;)V", line = 220)
    public class311(class30 arg0) {
        this.field5367 = arg0;
    }
}
