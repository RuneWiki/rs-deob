import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class218 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Ltc;")
    public static class234 field3459;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3468;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "[S")
    public static short[] field3461;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[[B")
    public static byte[][] field3458;

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 5)
    public class218() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 14)
    public static void method1450(int arg0) {
        field3461 = null;
        field3458 = (byte[][]) null;
        if (arg0 != -63) {
            field3459 = (class234) null;
        }
        field3459 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/lang/String;)I", line = 26)
    public static final int method1451(byte arg0, String arg1) {
        if (arg0 != -95) {
            return -112;
        }
        field3465++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class274.field4197; var2++) {
            if (arg1.equalsIgnoreCase(class296.field4509[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILbm;)V", line = 54)
    public static final void method1452(int arg0, class307 arg1) {
        if (arg0 > 88) {
            field3463++;
            class326.field4989 = arg1;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZBLkl;)V", line = 74)
    public static final void method1453(boolean arg0, byte arg1, class68 arg2) {
        field3462++;
        int var3 = arg2.field1388 == 0 ? arg2.field1416 : arg2.field1388;
        int var4 = arg2.field1401 == 0 ? arg2.field1414 : arg2.field1401;
        if (arg1 >= -66) {
            return;
        }
        class77.method570(var4, arg0, var3, class138.field2300[arg2.field1284 >> 16], arg2.field1284, 0);
        if (arg2.field1372 != null) {
            class77.method570(var4, arg0, var3, arg2.field1372, arg2.field1284, 0);
        }
        class222 var5 = (class222) class185.field3013.method303((long) arg2.field1284, (byte) 106);
        if (var5 != null) {
            class122.method791(var3, var5.field3514, -99, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BILag;)V", line = 101)
    public final void method1454(byte[] arg0, int arg1, class202 arg2) {
        field3466++;
        if (arg2.field3273[arg2.field3249] != 31 || arg2.field3273[arg2.field3249 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3468 == null) {
            this.field3468 = new Inflater(true);
        }
        try {
            this.field3468.setInput(arg2.field3273, arg2.field3249 + 10, -arg2.field3249 + -10 + arg2.field3273.length + -8);
            this.field3468.inflate(arg0);
            if (arg1 != -1) {
                method1453(false, (byte) 72, (class68) null);
            }
        } catch (Exception var5) {
            this.field3468.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3468.reset();
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 132)
    public static final String method1455(int arg0, String arg1) {
        field3460++;
        int var2 = -93 / ((arg0 - 45) / 33);
        int var3 = arg1.length();
        byte var4 = 2;
        char[] var5 = new char[var3];
        for (int var6 = 0; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (var4 == 0) {
                var7 = Character.toLowerCase(var7);
            } else if (var4 == 2 || Character.isUpperCase(var7)) {
                var7 = class74.method563(true, var7);
            }
            if (Character.isLetter(var7)) {
                var4 = 0;
            } else if (var7 == '.' || var7 == '?' || var7 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var7)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var5[var6] = var7;
        }
        return new String(var5);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V", line = 183)
    public static final void method1456(boolean arg0, int arg1) {
        field3467++;
        class2 var2 = class212.method1433(arg1, 5, -13802);
        if (!arg0) {
            var2.method16((byte) -54);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLag;)V", line = 197)
    public static final void method1457(byte arg0, class202 arg1) {
        int var2 = class29.field548 >> 2 << 10;
        field3464++;
        int var3 = class162.field2617 >> 1;
        if (arg0 != 126) {
            method1457((byte) 30, (class202) null);
        }
        byte[][] var4 = new byte[class163.field2629][class9.field199];
        while (arg1.field3249 < arg1.field3273.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method1317((byte) -122) == 1) {
                var5 = true;
                var7 = arg1.method1317((byte) -113);
                var6 = arg1.method1317((byte) -100);
            }
            int var8 = arg1.method1317((byte) -100);
            int var9 = arg1.method1317((byte) -73);
            int var10 = var8 * 64 - class38.field734;
            int var11 = class17.field322 + class9.field199 - (var9 * 64) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class163.field2629 > var10 + 63 && class9.field199 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var12 >= (var7 * 8) && var7 * 8 + 8 > var12 && var14 >= var6 * 8 && var6 * 8 + 8 > var14) {
                            var13[var11 - var14] = arg1.method1333(-128);
                        }
                    }
                }
            } else if (var5) {
                arg1.field3249 += 64;
            } else {
                arg1.field3249 += 4096;
            }
        }
        int var15 = class9.field199;
        int[] var16 = new int[var15];
        int[] var17 = new int[var15];
        int[] var18 = new int[var15];
        int var19 = class163.field2629;
        int[] var20 = new int[var15];
        int[] var21 = new int[var15];
        for (int var22 = -5; var22 < var19; var22++) {
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var19 > var24) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class177 var26 = class179.method1127(false, var25 - 1);
                        var20[var23] += var26.field2845;
                        var21[var23] += var26.field2859;
                        var16[var23] += var26.field2867;
                        var17[var23] += var26.field2858;
                        var10002 = var18[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class177 var29 = class179.method1127(false, var28 - 1);
                        var20[var23] -= var29.field2845;
                        var21[var23] -= var29.field2859;
                        var16[var23] -= var29.field2867;
                        var17[var23] -= var29.field2858;
                        var10002 = var18[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class336.field5155[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 + 5;
                    if (var15 > var37) {
                        var33 += var16[var37];
                        var32 += var21[var37];
                        var30 += var20[var37];
                        var35 += var18[var37];
                        var34 += var17[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var35 -= var18[var38];
                        var30 -= var20[var38];
                        var32 -= var21[var38];
                        var34 -= var17[var38];
                        var33 -= var16[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class209.method1419(-1, var32 / var35, var30 * 256 / var34, var33 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class61.method475(var22, 63) + class61.method475(var36 << 6, 4032)] = class284.field4387[class187.method1194(1904560007, var42, 96)];
                        } else if (var39 != null) {
                            var39[(class61.method475(63, var36) << 6) + class61.method475(63, var22)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(III)V", line = 424)
    private class218(int arg0, int arg1, int arg2) {
    }
}
