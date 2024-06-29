import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 {

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lqc;")
    private class114 field759 = new class114(256);

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Loc;")
    private class100 field749;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Loc;")
    private class100 field751;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Z")
    public static boolean field743 = false;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "Lfc;")
    public static class39 field757 = class90.method774("Der Server wird gerade aktualisiert)3", -94);

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field753 = 0;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lfc;")
    private static class39 field755 = class90.method774("Drop", -119);

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "J")
    public static volatile long field754 = 0L;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lfc;")
    public static class39 field748 = field755;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Lue;")
    public static class141 field750;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZIIILef;)V", line = 4)
    public static final void method333(int arg0, boolean arg1, int arg2, int arg3, int arg4, class35 arg5) {
        class24 var6 = new class24();
        var6.field660 = arg5.field932;
        var6.field655 = arg5.field939;
        int var7 = arg5.field912;
        var6.field666 = arg4 * 128;
        var6.field652 = arg3 * 128;
        var6.field643 = arg5.field911 * 128;
        var6.field664 = arg0;
        int var8 = arg5.field930;
        if (!arg1) {
            field755 = null;
        }
        var6.field657 = arg5.field949;
        var6.field645 = arg5.field936;
        field752++;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg5.field912;
            var7 = arg5.field930;
        }
        var6.field658 = (arg3 + var8) * 128;
        var6.field671 = (arg4 + var7) * 128;
        if (arg5.field970 != null) {
            var6.field672 = arg5;
            var6.method276(arg1);
        }
        class83.field1840.method19(var6, 7);
        if (var6.field645 != null) {
            var6.field646 = var6.field660 + (int) ((double) (var6.field657 - var6.field660) * Math.random());
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([III)Lpa;", line = 50)
    public final class105 method334(int[] arg0, int arg1, int arg2) {
        field760++;
        if (arg1 != -1685) {
            return null;
        } else if (this.field749.method837((byte) 125) == 1) {
            return this.method339(arg0, arg2, 0, (byte) -14);
        } else if (this.field749.method849((byte) 75, arg2) == 1) {
            return this.method339(arg0, 0, arg2, (byte) -37);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 80)
    public static final void method335(int arg0) {
        while (true) {
            if (class39.field1065.method392(class128.field3275, (byte) -97) >= 27) {
                int var1 = class39.field1065.method396(15, (byte) 123);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class118.field3092[var1] == null) {
                        var2 = true;
                        class118.field3092[var1] = new class121();
                    }
                    class121 var3 = class118.field3092[var1];
                    class121.field3176[class15.field416++] = var1;
                    var3.field2868 = class70.field1654;
                    int var4 = class5.field165[class39.field1065.method396(3, (byte) 107)];
                    if (var2) {
                        var3.field2900 = var4;
                    }
                    int var5 = class39.field1065.method396(1, (byte) 114);
                    int var6 = class39.field1065.method396(5, (byte) 125);
                    var3.field3163 = class153.method1222(0, class39.field1065.method396(13, (byte) 101));
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class39.field1065.method396(5, (byte) 124);
                    int var8 = class39.field1065.method396(1, (byte) 111);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    if (var8 == 1) {
                        class98.field2328[class68.field1626++] = var1;
                    }
                    var3.field2858 = var3.field3163.field2254;
                    var3.field2918 = var3.field3163.field2279;
                    var3.field2907 = var3.field3163.field2240;
                    var3.field2893 = var3.field3163.field2244;
                    var3.field2917 = var3.field3163.field2291;
                    var3.field2920 = var3.field3163.field2229;
                    var3.field2873 = var3.field3163.field2271;
                    if (var3.field2893 == 0) {
                        var3.field2900 = 0;
                    }
                    var3.field2896 = var3.field3163.field2231;
                    var3.field2861 = var3.field3163.field2286;
                    var3.method975(class94.field2197.field2913[0] + var7, var5 == 1, 9, class94.field2197.field2926[0] + var6);
                    continue;
                }
            }
            if (arg0 != 32) {
                field754 = -111L;
            }
            field756++;
            class39.field1065.method395((byte) 114);
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 157)
    public static final void method336(byte arg0) {
        field746++;
        int var1 = class39.field1065.method396(8, (byte) 106);
        if (class111.field2871 > var1) {
            for (int var2 = var1; var2 < class111.field2871; var2++) {
                class31.field871[class28.field801++] = class31.field862[var2];
            }
        }
        if (class111.field2871 < var1) {
            throw new RuntimeException("gppov1");
        }
        class111.field2871 = 0;
        int var3 = 77 % ((arg0 + 24) / 57);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class31.field862[var4];
            class142 var6 = class101.field2525[var5];
            int var7 = class39.field1065.method396(1, (byte) 103);
            if (var7 == 0) {
                class31.field862[class111.field2871++] = var5;
                var6.field2868 = class70.field1654;
            } else {
                int var8 = class39.field1065.method396(2, (byte) 108);
                if (var8 == 0) {
                    class31.field862[class111.field2871++] = var5;
                    var6.field2868 = class70.field1654;
                    class98.field2328[class68.field1626++] = var5;
                } else if (var8 == 1) {
                    class31.field862[class111.field2871++] = var5;
                    var6.field2868 = class70.field1654;
                    int var9 = class39.field1065.method396(3, (byte) 98);
                    var6.method973((byte) 111, false, var9);
                    int var10 = class39.field1065.method396(1, (byte) 105);
                    if (var10 == 1) {
                        class98.field2328[class68.field1626++] = var5;
                    }
                } else if (var8 == 2) {
                    class31.field862[class111.field2871++] = var5;
                    var6.field2868 = class70.field1654;
                    int var11 = class39.field1065.method396(3, (byte) 119);
                    var6.method973((byte) 106, true, var11);
                    int var12 = class39.field1065.method396(3, (byte) 111);
                    var6.method973((byte) 111, true, var12);
                    int var13 = class39.field1065.method396(1, (byte) 109);
                    if (var13 == 1) {
                        class98.field2328[class68.field1626++] = var5;
                    }
                } else if (var8 == 3) {
                    class31.field871[class28.field801++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 261)
    public static void method337(int arg0) {
        field755 = null;
        field757 = null;
        field750 = null;
        if (arg0 == 15) {
            field748 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[II)Lpa;", line = 281)
    private final class105 method338(int arg0, int arg1, int[] arg2, int arg3) {
        field744++;
        int var5 = (arg1 >>> 12 | (arg1 & 0x50000FFF) << 4) ^ arg0;
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class105 var9 = (class105) this.field759.method995(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg2 == null || arg2[0] > 0) {
            class21 var10 = class21.method227(this.field751, arg1, arg0);
            int var11 = 5 % ((-arg3 - 41) / 39);
            if (var10 == null) {
                return null;
            }
            class105 var12 = var10.method224();
            this.field759.method998(var12, var7, (byte) -118);
            if (arg2 != null) {
                arg2[0] -= var12.field2642.length;
            }
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([IIIB)Lpa;", line = 354)
    private final class105 method339(int[] arg0, int arg1, int arg2, byte arg3) {
        field745++;
        if (arg3 >= -8) {
            field748 = null;
        }
        int var5 = arg1 ^ (arg2 >>> 12 | (arg2 & 0xA0000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class105 var9 = (class105) this.field759.method995(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class85 var10 = class85.method726(this.field749, arg2, arg1);
            if (var10 == null) {
                return null;
            }
            class105 var11 = var10.method728();
            this.field759.method998(var11, var7, (byte) -118);
            if (arg0 != null) {
                arg0[0] -= var11.field2642.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[I)Lpa;", line = 395)
    public final class105 method340(int arg0, int arg1, int[] arg2) {
        field747++;
        if (this.field751.method837((byte) 127) == 1) {
            return this.method338(arg0, 0, arg2, arg1 ^ 0x8);
        } else if (this.field751.method849((byte) -94, arg0) == arg1) {
            return this.method338(0, arg0, arg2, -121);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Loc;Loc;)V", line = 415)
    public class26(class100 arg0, class100 arg1) {
        this.field749 = arg1;
        this.field751 = arg0;
    }
}
