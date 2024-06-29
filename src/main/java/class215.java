import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class215 {

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Lbc;")
    private class201 field3633 = new class201(256);

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "Lbc;")
    private class201 field3635 = new class201(256);

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ln;")
    private class138 field3627;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Ln;")
    private class138 field3621;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "Z")
    public static boolean field3631 = false;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "Z")
    public static boolean field3630 = false;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "Lub;")
    public static class227 field3634 = class257.method1749("<col=00ff00>", 17263);

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "B")
    public static byte field3636;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static final void method1363(byte arg0) {
        class40.field666 = null;
        field3624++;
        class78.field1364 = null;
        if (arg0 < 10) {
            field3636 = 8;
        }
        class105.field1984 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[III)Lw;")
    private final class150 method1364(int arg0, int[] arg1, int arg2, int arg3) {
        field3632++;
        int var5 = arg3 ^ (arg0 >>> 12 | (arg0 & 0xC0000FFF) << 4);
        if (arg2 != 50) {
            field3634 = null;
        }
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class150 var9 = (class150) this.field3635.method1298(-105, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class244 var10 = (class244) this.field3633.method1298(-104, var7);
            if (var10 == null) {
                var10 = class244.method1626(this.field3621, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3633.method1300(var10, var7, -2875);
            }
            class150 var11 = var10.method1625(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method369(127);
                this.field3635.method1300(var11, var7, arg2 ^ 0xFFFFF4F7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I[II)Lw;")
    public final class150 method1365(int arg0, int[] arg1, int arg2) {
        if (arg2 != 0) {
            return null;
        }
        field3626++;
        if (this.field3627.method877(arg2 ^ 0xFFFFFFCF) == 1) {
            return this.method1369(0, arg0, arg1, 1672074352);
        } else if (this.field3627.method875(-2, arg0) == 1) {
            return this.method1369(arg0, 0, arg1, 1672074352);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I[II)Lw;")
    public final class150 method1366(int arg0, int[] arg1, int arg2) {
        field3625++;
        if (this.field3621.method877(arg0 ^ 0x4D) == 1) {
            return this.method1364(0, arg1, arg0 ^ 0xFFFFFFCC, arg2);
        } else if (arg0 == ~this.field3621.method875(arg0, arg2)) {
            return this.method1364(arg2, arg1, 50, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZLub;B)V")
    public static final void method1367(boolean arg0, class227 arg1, byte arg2) {
        field3629++;
        byte var3 = 4;
        int var4 = class177.field2977.method1258(arg1, 250);
        int var5 = var3 + 6;
        int var6 = var3 + 6;
        if (arg2 > -100) {
            field3631 = false;
        }
        int var7 = class177.field2977.method1255(arg1, 250) * 13;
        class111.method694(var5 - var3, -var3 + var6, var3 + var4 + var3, var3 - -var3 + var7, 0);
        class111.method705(var5 - var3, var6 - var3, var3 + var4 + var3, var7 - -var3 + var3, 16777215);
        class177.field2977.method1261(arg1, var5, var6, var4, var7, 16777215, -1, 1, 1, 0);
        class103.method630((byte) 120, var6 - var3, var3 + var7 - -var3, var3 + var3 + var4, var5 - var3);
        if (!arg0) {
            class115.method731(var5, var4, var6, 60, var7);
            return;
        }
        try {
            Graphics var8 = class172.field2875.getGraphics();
            class14.field263.method719(0, 0, var8, 3108);
        } catch (Exception var9) {
            class172.field2875.repaint();
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)Lwh;")
    public static final class163 method1368(boolean arg0) {
        field3623++;
        int var1 = class214.field3613[0] * class177.field2982[0];
        byte[] var2 = class26.field427[0];
        int[] var3 = new int[var1];
        if (!arg0) {
            field3631 = true;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class63.field1153[class76.method446(var2[var4], 255)];
        }
        class163 var5 = new class163(class161.field2727, class241.field4197, class58.field1068[0], class176.field2934[0], class177.field2982[0], class214.field3613[0], var3);
        class57.method350((byte) -104);
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(II[II)Lw;")
    private final class150 method1369(int arg0, int arg1, int[] arg2, int arg3) {
        field3628++;
        int var5 = (arg0 >>> 12 | arg0 << 4 & 0xFFF6) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6;
        class150 var9 = (class150) this.field3635.method1298(-105, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            if (arg3 != 1672074352) {
                this.field3635 = null;
            }
            class39 var10 = class39.method208(this.field3627, arg0, arg1);
            if (var10 == null) {
                return null;
            }
            class150 var11 = var10.method207();
            this.field3635.method1300(var11, var7, -2875);
            if (arg2 != null) {
                arg2[0] -= var11.field2616.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
    public static void method1370(byte arg0) {
        if (arg0 != 74) {
            method1363((byte) -86);
        }
        field3634 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1371(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class245.field4289 * arg0 + field3622 * arg3 >> 16;
        int var6 = class245.field4289 * arg3 - field3622 * arg0 >> 16;
        int var7 = class243.field4210 * arg1 + class141.field2439 * var6 >> 16;
        int var8 = class141.field2439 * arg1 - class243.field4210 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class243.field4210 * arg2 + class141.field2439 * var6 >> 16;
        int var12 = class141.field2439 * arg2 - class243.field4210 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class75.field1312 && var13 < class75.field1312) {
            return false;
        } else if (var9 > class225.field3838 && var13 > class225.field3838) {
            return false;
        } else if (var10 < class205.field3495 && var14 < class205.field3495) {
            return false;
        } else {
            return var10 <= class145.field2506 || var14 <= class145.field2506;
        }
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ln;Ln;)V")
    public class215(class138 arg0, class138 arg1) {
        this.field3627 = arg0;
        this.field3621 = arg1;
    }
}
