import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class65 extends class200 {

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    public static int field1087 = 0;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "Loa;")
    public static class99 field1090 = class221.method1463(2844, "0");

    @OriginalMember(owner = "client!e", name = "Y", descriptor = "I")
    public static int field1102 = 0;

    @OriginalMember(owner = "client!e", name = "X", descriptor = "Z")
    public static boolean field1101 = false;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1086 = new CRC32();

    @OriginalMember(owner = "client!e", name = "ab", descriptor = "Z")
    public static boolean field1104 = false;

    @OriginalMember(owner = "client!e", name = "cb", descriptor = "Loa;")
    private static class99 field1106 = class221.method1463(2844, " has logged in)3");

    @OriginalMember(owner = "client!e", name = "db", descriptor = "I")
    public static int field1107 = -2;

    @OriginalMember(owner = "client!e", name = "eb", descriptor = "I")
    public static int field1108 = -1;

    @OriginalMember(owner = "client!e", name = "bb", descriptor = "Loa;")
    public static class99 field1105 = field1106;

    @OriginalMember(owner = "client!e", name = "fb", descriptor = "Loa;")
    public static class99 field1109 = class221.method1463(2844, "; Max)2Age=");

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    public int field1085;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    public int field1092;

    @OriginalMember(owner = "client!e", name = "P", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!e", name = "Q", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!e", name = "R", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!e", name = "S", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!e", name = "T", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!e", name = "U", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!e", name = "V", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!e", name = "W", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!e", name = "Z", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "Loa;")
    public class99 field1091;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILoa;BI)V")
    public static final void method424(int arg0, int arg1, class99 arg2, byte arg3, int arg4) {
        ++field1099;
        class107 var5 = class127.method842((byte) -48, arg4, arg0);
        if (var5 != null) {
            if (var5.field1875 != null) {
                class260 var6 = new class260();
                var6.field4543 = var5.field1875;
                var6.field4553 = var5;
                var6.field4539 = arg2;
                var6.field4538 = arg1;
                class56.method385(200000, var6);
            }
            boolean var7 = true;
            if (~var5.field1937 < -1) {
                var7 = class57.method387(var5, (byte) 102);
            }
            if (var7) {
                if (class288.method1935(arg1 - 1, 1, client.method1066(var5))) {
                    if (arg1 == 1) {
                        class131.field2277.method966((byte) 49, 198);
                        class131.field2277.method1701(arg0, 4994);
                        class131.field2277.method1745(arg4, (byte) 5);
                        ++class179.field3109;
                    }
                    if (arg1 == 2) {
                        ++class240.field4143;
                        class131.field2277.method966((byte) 49, 248);
                        class131.field2277.method1701(arg0, 4994);
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                    if (arg3 != -45) {
                        field1105 = null;
                    }
                    if (arg1 == 3) {
                        class131.field2277.method966((byte) 49, 247);
                        class131.field2277.method1701(arg0, 4994);
                        ++class144.field2534;
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                    if (arg1 == 4) {
                        ++class187.field3304;
                        class131.field2277.method966((byte) 49, 90);
                        class131.field2277.method1701(arg0, arg3 ^ -5039);
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                    if (~arg1 == -6) {
                        class131.field2277.method966((byte) 49, 200);
                        class131.field2277.method1701(arg0, arg3 + 5039);
                        class131.field2277.method1745(arg4, (byte) 5);
                        ++class92.field1555;
                    }
                    if (arg1 == 6) {
                        class131.field2277.method966((byte) 49, 137);
                        ++class52.field862;
                        class131.field2277.method1701(arg0, arg3 + 5039);
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                    if (~arg1 == -8) {
                        ++class260.field4546;
                        class131.field2277.method966((byte) 49, 47);
                        class131.field2277.method1701(arg0, 4994);
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                    if (arg1 == 8) {
                        ++class192.field3379;
                        class131.field2277.method966((byte) 49, 166);
                        class131.field2277.method1701(arg0, arg3 ^ -5039);
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                    if (arg1 == 9) {
                        class131.field2277.method966((byte) 49, 157);
                        ++class143.field2530;
                        class131.field2277.method1701(arg0, 4994);
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                    if (arg1 == 10) {
                        ++class262.field4632;
                        class131.field2277.method966((byte) 49, 88);
                        class131.field2277.method1701(arg0, arg3 ^ -5039);
                        class131.field2277.method1745(arg4, (byte) 5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1109 = null;
        field1105 = null;
        field1090 = null;
        if (arg0 < 55) {
            field1106 = null;
        }
        field1086 = null;
        field1106 = null;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V")
    public final void method426(byte arg0) {
        ++field1088;
        int var2 = 84 % ((arg0 - 31) / 52);
        super.field3476 = class231.method1513(60) - -500L | super.field3476 & Long.MIN_VALUE;
        class149.field2623.method1323(-27664, this);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
    public static final void method427() {
        class151.field2659 = 0;
        label191: for (int var0 = 0; var0 < class60.field1003; ++var0) {
            class57 var1 = class94.field1592[var0];
            if (class167.field2982 != null) {
                for (int var2 = 0; var2 < class167.field2982.length; ++var2) {
                    if (class167.field2982[var2] != -1000000 && (var1.field950 <= class167.field2982[var2] || var1.field951 <= class167.field2982[var2]) && (var1.field933 <= class221.field3842[var2] || var1.field945 <= class221.field3842[var2]) && (var1.field933 >= class127.field2208[var2] || var1.field945 >= class127.field2208[var2]) && (var1.field946 <= class230.field3977[var2] || var1.field949 <= class230.field3977[var2]) && (var1.field946 >= class80.field1421[var2] || var1.field949 >= class80.field1421[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field936 == 1) {
                int var3 = var1.field944 - class62.field1031 + class24.field366;
                if (var3 >= 0 && var3 <= class24.field366 + class24.field366) {
                    int var4 = var1.field942 - class135.field2355 + class24.field366;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field938 - class135.field2355 + class24.field366;
                    if (var5 > class24.field366 + class24.field366) {
                        var5 = class24.field366 + class24.field366;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class196.field3414[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class260.field4540 - var1.field933;
                        if (var7 > 32) {
                            var1.field937 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field937 = 2;
                            var7 = -var7;
                        }
                        var1.field962 = (var1.field946 - class163.field2869 << 8) / var7;
                        var1.field958 = (var1.field949 - class163.field2869 << 8) / var7;
                        var1.field940 = (var1.field950 - class240.field4154 << 8) / var7;
                        var1.field934 = (var1.field951 - class240.field4154 << 8) / var7;
                        class255.field4405[class151.field2659++] = var1;
                    }
                }
            } else if (var1.field936 == 2) {
                int var8 = var1.field942 - class135.field2355 + class24.field366;
                if (var8 >= 0 && var8 <= class24.field366 + class24.field366) {
                    int var9 = var1.field944 - class62.field1031 + class24.field366;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field953 - class62.field1031 + class24.field366;
                    if (var10 > class24.field366 + class24.field366) {
                        var10 = class24.field366 + class24.field366;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class196.field3414[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class163.field2869 - var1.field946;
                        if (var12 > 32) {
                            var1.field937 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field937 = 4;
                            var12 = -var12;
                        }
                        var1.field957 = (var1.field933 - class260.field4540 << 8) / var12;
                        var1.field956 = (var1.field945 - class260.field4540 << 8) / var12;
                        var1.field940 = (var1.field950 - class240.field4154 << 8) / var12;
                        var1.field934 = (var1.field951 - class240.field4154 << 8) / var12;
                        class255.field4405[class151.field2659++] = var1;
                    }
                }
            } else if (var1.field936 == 4) {
                int var13 = var1.field950 - class240.field4154;
                if (var13 > 128) {
                    int var14 = var1.field942 - class135.field2355 + class24.field366;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field938 - class135.field2355 + class24.field366;
                    if (var15 > class24.field366 + class24.field366) {
                        var15 = class24.field366 + class24.field366;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field944 - class62.field1031 + class24.field366;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field953 - class62.field1031 + class24.field366;
                        if (var17 > class24.field366 + class24.field366) {
                            var17 = class24.field366 + class24.field366;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class196.field3414[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field937 = 5;
                            var1.field957 = (var1.field933 - class260.field4540 << 8) / var13;
                            var1.field956 = (var1.field945 - class260.field4540 << 8) / var13;
                            var1.field962 = (var1.field946 - class163.field2869 << 8) / var13;
                            var1.field958 = (var1.field949 - class163.field2869 << 8) / var13;
                            class255.field4405[class151.field2659++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V")
    public class65(int arg0, int arg1) {
        super.field2187 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ltg;ZLtg;)V")
    public static final void method428(class182 arg0, boolean arg1, class182 arg2) {
        class187.field3305 = arg2;
        ++field1093;
        class242.field4177 = arg0;
        if (arg1) {
            method424(-52, -62, (class99) null, (byte) 78, 85);
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)I")
    public final int method429(int arg0) {
        if (arg0 != -638760416) {
            method424(-54, 28, (class99) null, (byte) -83, -54);
        }
        ++field1098;
        return (int) (255L & super.field2187 >>> 32);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method430(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1103;
        int var8 = 2047 & -arg6 + 2048;
        int var9 = 2047 & -arg5 + 2048;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg1;
        if (~var8 != -1) {
            int var13 = class134.field2339[var8];
            int var14 = class134.field2344[var8];
            var11 = -arg1 * var13 >> 16;
            var12 = arg1 * var14 >> 16;
        }
        if (var9 != 0) {
            int var15 = class134.field2339[var9];
            var10 = var12 * var15 >> 16;
            int var16 = class134.field2344[var9];
            var12 = var12 * var16 >> 16;
        }
        class2.field13 = -var10 + arg2;
        class173.field3061 = arg5;
        class24.field367 = -var11 + arg3;
        int var17 = 67 % ((-92 - arg7) / 32);
        class267.field4709 = arg6;
        class221.field3850 = arg0 - var12;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BI)Loa;")
    public static final class99 method431(byte arg0, int arg1) {
        ++field1095;
        if (arg0 != 29) {
            field1090 = null;
        }
        if (arg1 < 100000) {
            return class198.method1332(93, new class99[] { class13.field118, class198.method1333(-87, arg1), class123.field2154 });
        } else {
            return arg1 < 10000000 ? class198.method1332(104, new class99[] { class239.field4125, class198.method1333(arg0 + -147, arg1 / 1000), class187.field3314, class123.field2154 }) : class198.method1332(75, new class99[] { class174.field3076, class198.method1333(arg0 ^ -110, arg1 / 1000000), class244.field4211, class123.field2154 });
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(Z)I")
    public final int method432(boolean arg0) {
        if (arg0) {
            method427();
        }
        ++field1097;
        return (int) super.field2187;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public final void method433(int arg0) {
        ++field1089;
        super.field3476 |= Long.MIN_VALUE;
        if (this.method435((byte) -33) == 0L) {
            class23.field305.method1323(-27664, this);
        }
        if (arg0 != 32) {
            field1101 = true;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IILtg;)Z")
    public static final boolean method434(int arg0, int arg1, class182 arg2) {
        if (arg0 > -44) {
            field1106 = null;
        }
        ++field1100;
        byte[] var3 = arg2.method1220(arg1, (byte) -99);
        if (var3 == null) {
            return false;
        } else {
            class47.method339(var3, (byte) -12);
            return true;
        }
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(B)J")
    public final long method435(byte arg0) {
        if (arg0 > -31) {
            return 68L;
        } else {
            ++field1096;
            return Long.MAX_VALUE & super.field3476;
        }
    }
}
