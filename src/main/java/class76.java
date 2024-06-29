import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class76 {

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "Lml;")
    public static class160 field1223 = new class160(64);

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Lce;")
    public static class126 field1236 = class206.method1445(-7923, "http:)4)4");

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1241 = 3353893;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "Lce;")
    public static class126 field1243 = class206.method1445(-7923, "hint_headicons");

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "S")
    public static short field1238 = 32767;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "[Lce;")
    public static class126[] field1245 = new class126[8];

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public int field1226;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public int field1227;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public int field1228;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public int field1229;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public int field1230;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public int field1232;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public int field1233;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field1234;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public int field1235;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public int field1240;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public int field1242;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public int field1244;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public int field1246;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIII)Z", line = 7)
    public static final boolean method548(int arg0, int arg1, int arg2, int arg3) {
        if (!class29.method138(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class264.field4396[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class39.field625) {
                    if (!class8.method43(var4, var6, var5)) {
                        return false;
                    }
                    if (!class8.method43(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class8.method43(var4, var7, var5)) {
                        return false;
                    }
                    if (!class8.method43(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class8.method43(var4, var8, var5)) {
                    return false;
                }
                if (!class8.method43(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class318.field5452) {
                    if (!class8.method43(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class8.method43(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class8.method43(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class8.method43(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class8.method43(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class8.method43(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class39.field625) {
                    if (!class8.method43(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class8.method43(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class8.method43(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class8.method43(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class8.method43(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class8.method43(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class318.field5452) {
                    if (!class8.method43(var4, var6, var5)) {
                        return false;
                    }
                    if (!class8.method43(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class8.method43(var4, var7, var5)) {
                        return false;
                    }
                    if (!class8.method43(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class8.method43(var4, var8, var5)) {
                    return false;
                }
                if (!class8.method43(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class8.method43(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class8.method43(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class8.method43(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class8.method43(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class8.method43(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIZ)V", line = 192)
    public static final void method549(int arg0, int arg1, int arg2, boolean arg3) {
        class126 var4 = class12.method69(new class126[] { class300.field4968, class195.method1386((byte) 20, arg2), class168.field3001, class195.method1386((byte) 20, arg0 >> 6), class168.field3001, class195.method1386((byte) 20, arg1 >> 6), class168.field3001, class195.method1386((byte) 20, arg0 & 0x3F), class168.field3001, class195.method1386((byte) 20, arg1 & 0x3F) }, (byte) 115);
        field1224++;
        var4.method837(2);
        if (!arg3) {
            field1243 = (class126) null;
        }
        class303.method2033(var4, (byte) -101);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)Lck;", line = 211)
    public static final class275 method550(int arg0, int arg1) {
        field1221++;
        class275 var2 = (class275) class170.field3026.method1173(-19839, (long) arg0);
        if (arg1 < 99) {
            return (class275) null;
        } else if (var2 == null) {
            byte[] var3 = class274.field4612.method2173(arg0, 0, (byte) -48);
            class275 var4 = new class275(var3);
            var4.method2131(class119.field2007, (int[]) null);
            class170.field3026.method1179(var4, (long) arg0, (byte) -72);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[Lbi;)V", line = 245)
    public static final void method551(int arg0, class201[] arg1) {
        class89.field1398[arg0] = arg1;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 249)
    public static void method552(boolean arg0) {
        field1223 = null;
        field1236 = null;
        field1245 = null;
        field1243 = null;
        if (!arg0) {
            field1223 = (class160) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIILja;Lja;IIJ)V", line = 262)
    public static final void method553(int arg0, int arg1, int arg2, int arg3, class114 arg4, class114 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class130 var10 = new class130();
        var10.field2230 = arg8;
        var10.field2228 = arg1 * 128 + 64;
        var10.field2240 = arg2 * 128 + 64;
        var10.field2233 = arg3;
        var10.field2234 = arg4;
        var10.field2239 = arg5;
        var10.field2238 = arg6;
        var10.field2236 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class297.field4940[var11][arg1][arg2] == null) {
                class297.field4940[var11][arg1][arg2] = new class5(var11, arg1, arg2);
            }
        }
        class297.field4940[arg0][arg1][arg2].field46 = var10;
    }
}
