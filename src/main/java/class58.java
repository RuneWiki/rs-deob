import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public abstract class class58 extends class55 {

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public int field1207 = 1000;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "Lo;")
    public static class84 field1192 = class15.method124(":duelreq:", 255);

    @OriginalMember(owner = "client!jd", name = "O", descriptor = "I")
    public static int field1191 = 2301979;

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1193 = 0;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Lo;")
    public static class84 field1202 = class15.method124("(X100(U(Y", 255);

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1206;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "[Lfc;")
    public static class34[] field1195;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "[Lqb;")
    public static class96[] field1199;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V", line = 3)
    public static final void method468(int arg0) {
        if (arg0 != -1) {
            field1195 = null;
        }
        field1201++;
        if (class85.field1929 != null) {
            class61 var1 = class85.field1929;
            synchronized (class85.field1929) {
                class85.field1929 = null;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V", line = 20)
    public static void method469(int arg0) {
        if (arg0 != -16711936) {
            method470(null, 42, 32, -105);
        }
        field1195 = null;
        field1202 = null;
        field1192 = null;
        field1199 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BIII)Z", line = 41)
    public static final boolean method470(byte[] arg0, int arg1, int arg2, int arg3) {
        field1205++;
        if (arg2 != 0) {
            field1192 = null;
        }
        boolean var4 = true;
        int var5 = -1;
        class27 var6 = new class27(arg0);
        label71: while (true) {
            int var7 = var6.method221(true);
            if (var7 == 0) {
                return var4;
            }
            int var8 = 0;
            var5 += var7;
            boolean var9 = false;
            while (true) {
                int var14;
                class49 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var6.method221(true);
                                        if (var17 == 0) {
                                            continue label71;
                                        }
                                        var6.method231(255);
                                    }
                                    int var10 = var6.method221(true);
                                    if (var10 == 0) {
                                        continue label71;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    int var12 = var8 >> 6 & 0x3F;
                                    var13 = arg1 + var12;
                                    var14 = var6.method231(255) >> 2;
                                    var15 = var11 + arg3;
                                } while (var13 <= 0);
                            } while (var15 <= 0);
                        } while (var13 >= 103);
                    } while (var15 >= 103);
                    var16 = class110.method856((byte) -125, var5);
                } while (var14 == 22 && class1.field23 && var16.field1059 == 0 && !var16.field1013);
                if (!var16.method422((byte) 76)) {
                    class79.field1675++;
                    var4 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(B)Lne;", line = 126)
    public class83 method471(byte arg0) {
        if (arg0 != 3) {
            field1202 = null;
        }
        field1198++;
        return null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIII)I", line = 148)
    public static final int method472(int arg0, int arg1, int arg2, int arg3) {
        field1196++;
        if (arg2 <= 94) {
            return -113;
        } else {
            int var4 = 256 - arg1;
            return ((arg0 & 0xFF00FF) * var4 + (arg3 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg0 & 0xFF00) * var4 + ((arg3 & 0xFF00) * arg1) & 0xFF0000) >> 8;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IILad;IBZI)V", line = 165)
    public static final void method473(int arg0, int arg1, class5 arg2, int arg3, byte arg4, boolean arg5, int arg6) {
        long var7 = (long) ((arg6 << 16) + arg0);
        field1203++;
        class48 var9 = (class48) class112.field2423.method66(127, var7);
        if (var9 != null) {
            return;
        }
        class48 var10 = (class48) class89.field2019.method66(127, var7);
        if (arg1 <= 62) {
            method473(-128, -106, null, -7, (byte) -110, false, -3);
        }
        if (var10 != null) {
            return;
        }
        class48 var11 = (class48) class126.field2783.method66(123, var7);
        if (var11 == null) {
            if (!arg5) {
                class48 var12 = (class48) class42.field852.method66(120, var7);
                if (var12 != null) {
                    return;
                }
            }
            class48 var13 = new class48();
            var13.field1004 = arg2;
            var13.field1005 = arg3;
            var13.field1002 = arg4;
            if (arg5) {
                class112.field2423.method71(122, var13, var7);
                class3.field33++;
            } else {
                class86.field1959.method672(var13, (byte) 98);
                class126.field2783.method71(121, var13, var7);
                class51.field1091++;
            }
        } else if (arg5) {
            var11.method461(107);
            class112.field2423.method71(121, var11, var7);
            class3.field33++;
            class51.field1091--;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)V", line = 258)
    public void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1194++;
        class83 var10 = this.method471((byte) 3);
        if (var10 != null) {
            this.field1207 = var10.field1207;
            var10.method474(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lo;Lo;B)V", line = 276)
    public static final void method475(class84 arg0, class84 arg1, byte arg2) {
        field1197++;
        class105.field2226 = arg0;
        class105.field2212 = arg1;
        if (arg2 <= 52) {
            field1204 = 27;
        }
    }
}
