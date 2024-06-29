import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class66 extends class124 {

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "[Lt;")
    public class125[] field1870;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "Lrd;")
    private static class117 field1876 = class95.method812(" seconds)3", (byte) 8);

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "Lrd;")
    public static class117 field1874 = class95.method812("und haben es deaktiviert)3 Klicken Sie auf der", (byte) 8);

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "Lrd;")
    public static class117 field1871 = field1876;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "I")
    public static int field1878 = 0;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "[I")
    public static int[] field1868;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lwa;B)Z")
    public static final boolean method656(class144 arg0, byte arg1) {
        if (arg1 >= -58) {
            return false;
        }
        field1869++;
        int var2 = arg0.field3467;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class21.field594++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 >= 101) {
                var2 -= 101;
            } else {
                var2--;
            }
            client.method238(0, class18.method193(new class117[] { class121.field2968, class72.field2025[var2] }, 39), 0, 53, 0, 17, class86.field2248);
            class128.field3054++;
            client.method238(0, class18.method193(new class117[] { class121.field2968, class72.field2025[var2] }, 85), 0, 111, 0, 24, class134.field3207);
            return true;
        } else if (var2 >= 401 && var2 <= 500) {
            client.method238(0, class18.method193(new class117[] { class121.field2968, arg0.field3417 }, 94), 0, -111, 0, 22, class86.field2248);
            class64.field1834++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILge;Lge;IZ)Ljd;")
    public static final class66 method657(int arg0, class47 arg1, class47 arg2, int arg3, boolean arg4) {
        field1872++;
        int[] var5 = arg2.method529(false, arg0);
        boolean var6 = true;
        for (int var7 = 0; var7 < var5.length; var7++) {
            byte[] var8 = arg2.method530(-76, var5[var7], arg0);
            if (var8 == null) {
                var6 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg4) {
                    var10 = arg1.method530(-128, var9, 0);
                } else {
                    var10 = arg1.method530(-29, 0, var9);
                }
                if (var10 == null) {
                    var6 = false;
                }
            }
        }
        if (arg3 >= -90) {
            field1875 = -13;
        }
        if (!var6) {
            return null;
        }
        try {
            return new class66(arg2, arg1, arg0, arg4);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public static void method658(int arg0) {
        field1874 = null;
        field1868 = null;
        if (arg0 == 1) {
            field1871 = null;
            field1876 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Lge;Lge;IZ)V")
    private class66(class47 arg0, class47 arg1, int arg2, boolean arg3) {
        class1 var5 = new class1();
        int var6 = arg0.method519((byte) -125, arg2);
        this.field1870 = new class125[var6];
        int[] var7 = arg0.method529(false, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method526((byte) 123, arg2, var7[var8]);
            class115 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class115 var12 = (class115) var5.method3(false); var12 != null; var12 = (class115) var5.method14(127)) {
                if (var12.field2811 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method530(-108, var11, 0);
                } else {
                    var13 = arg1.method530(-106, 0, var11);
                }
                var10 = new class115(var11, var13);
                var5.method10(var10, (byte) 92);
            }
            this.field1870[var7[var8]] = new class125(var9, var10);
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Z")
    public final boolean method659(int arg0, int arg1) {
        if (arg1 == 11388) {
            field1867++;
            return this.field1870[arg0].field3015;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)I")
    public static int method660(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILdc;)V")
    public static final void method661(int arg0, class25 arg1) {
        arg1.field704 = arg1.field726;
        field1877++;
        if (arg1.field737 == 0) {
            arg1.field698 = 0;
            return;
        }
        if (arg1.field703 != -1 && arg1.field712 == 0) {
            class46 var2 = class33.method387(arg1.field703, 7455);
            if (arg1.field694 > 0 && var2.field1314 == 0) {
                arg1.field698++;
                return;
            }
            if (arg1.field694 <= 0 && var2.field1297 == 0) {
                arg1.field698++;
                return;
            }
        }
        int var3 = arg1.field717;
        int var4 = arg1.field739[arg1.field737 - 1] * 128 + arg1.field689 * 64;
        int var5 = arg1.field708[arg1.field737 - 1] * 128 + arg1.field689 * 64;
        int var6 = arg1.field751;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var5 - var6 > 256 || var5 - var6 < -256) {
            arg1.field751 = var5;
            arg1.field717 = var4;
        } else if (arg0 == 2) {
            int var7 = arg1.field715;
            if (var3 >= var4) {
                if (var3 > var4) {
                    if (var5 > var6) {
                        arg1.field705 = 768;
                    } else if (var6 > var5) {
                        arg1.field705 = 256;
                    } else {
                        arg1.field705 = 512;
                    }
                } else if (var5 > var6) {
                    arg1.field705 = 1024;
                } else if (var5 < var6) {
                    arg1.field705 = 0;
                }
            } else if (var6 < var5) {
                arg1.field705 = 1280;
            } else if (var6 > var5) {
                arg1.field705 = 1792;
            } else {
                arg1.field705 = 1536;
            }
            int var8 = arg1.field705 - arg1.field697 & 0x7FF;
            if (var8 > 1024) {
                var8 -= 2048;
            }
            boolean var9 = true;
            int var10 = 4;
            if (var8 >= -256 && var8 <= 256) {
                var7 = arg1.field728;
            } else if (var8 >= 256 && var8 < 768) {
                var7 = arg1.field719;
            } else if (var8 >= -768 && var8 <= -256) {
                var7 = arg1.field685;
            }
            if (var7 == -1) {
                var7 = arg1.field728;
            }
            arg1.field704 = var7;
            if (arg1 instanceof class36) {
                var9 = ((class36) arg1).field1061.field413;
            }
            if (var9) {
                if (arg1.field705 != arg1.field697 && arg1.field696 == -1 && arg1.field718 != 0) {
                    var10 = 2;
                }
                if (arg1.field737 > 2) {
                    var10 = 6;
                }
                if (arg1.field737 > 3) {
                    var10 = 8;
                }
                if (arg1.field698 > 0 && arg1.field737 > 1) {
                    var10 = 8;
                    arg1.field698--;
                }
            } else {
                if (arg1.field737 > 1) {
                    var10 = 6;
                }
                if (arg1.field737 > 2) {
                    var10 = 8;
                }
                if (arg1.field698 > 0 && arg1.field737 > 1) {
                    arg1.field698--;
                    var10 = 8;
                }
            }
            if (arg1.field733[arg1.field737 - 1]) {
                var10 <<= 0x1;
            }
            if (var10 >= 8 && arg1.field728 == arg1.field704 && arg1.field756 != -1) {
                arg1.field704 = arg1.field756;
            }
            if (var3 < var4) {
                arg1.field717 += var10;
                if (var4 < arg1.field717) {
                    arg1.field717 = var4;
                }
            } else if (var3 > var4) {
                arg1.field717 -= var10;
                if (arg1.field717 < var4) {
                    arg1.field717 = var4;
                }
            }
            if (var6 < var5) {
                arg1.field751 += var10;
                if (arg1.field751 > var5) {
                    arg1.field751 = var5;
                }
            } else if (var6 > var5) {
                arg1.field751 -= var10;
                if (arg1.field751 < var5) {
                    arg1.field751 = var5;
                }
            }
            if (arg1.field717 == var4 && arg1.field751 == var5) {
                if (arg1.field694 > 0) {
                    arg1.field694--;
                }
                arg1.field737--;
            }
        }
    }
}
