import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class93 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Z")
    public boolean field1407 = false;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public int field1414 = -1;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Z")
    public boolean field1421 = false;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public int field1423 = 5;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public int field1422 = -1;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public int field1426 = 99;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public int field1401 = -1;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Z")
    public boolean field1420 = false;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public int field1405 = 2;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Z")
    public boolean field1417 = false;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public int field1432 = -1;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public int field1430 = -1;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1402 = "Starting 3d Library";

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[Ljava/lang/String;")
    public static String[] field1416 = new String[1000];

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lue;")
    public static class13 field1409;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "[I")
    public static int[] field1406;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "[I")
    private int[] field1411;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "[I")
    public int[] field1428;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "[I")
    public int[] field1429;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[Z")
    public boolean[] field1408;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[[I")
    public int[][] field1418;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "[[[I")
    public static int[][][] field1425;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 4)
    public final void method828(byte arg0) {
        field1403++;
        int var2 = -70 / ((arg0 + 6) / 44);
        if (this.field1422 == -1) {
            if (this.field1408 == null) {
                this.field1422 = 0;
            } else {
                this.field1422 = 2;
            }
        }
        if (this.field1432 != -1) {
            return;
        }
        if (this.field1408 == null) {
            this.field1432 = 0;
        } else {
            this.field1432 = 2;
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IBLug;)V", line = 50)
    private final void method829(int arg0, byte arg1, class25 arg2) {
        field1419++;
        if (arg1 != -33) {
            this.method829(4, (byte) -114, (class25) null);
        }
        if (arg0 == 1) {
            int var13 = arg2.method314((byte) 48);
            this.field1429 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1429[var14] = arg2.method314((byte) 56);
            }
            this.field1428 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1428[var15] = arg2.method314((byte) 112);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1428[var16] = (arg2.method314((byte) 74) << 16) + this.field1428[var16];
            }
        } else if (arg0 == 2) {
            this.field1430 = arg2.method314((byte) 97);
        } else if (arg0 == 3) {
            this.field1408 = new boolean[256];
            int var11 = arg2.method281(99);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field1408[arg2.method281(-128)] = true;
            }
        } else if (arg0 == 4) {
            this.field1407 = true;
        } else if (arg0 == 5) {
            this.field1423 = arg2.method281(-128);
        } else if (arg0 == 6) {
            this.field1401 = arg2.method314((byte) 93);
        } else if (arg0 == 7) {
            this.field1414 = arg2.method314((byte) 70);
        } else if (arg0 == 8) {
            this.field1426 = arg2.method281(-127);
        } else if (arg0 == 9) {
            this.field1422 = arg2.method281(-128);
        } else if (arg0 == 10) {
            this.field1432 = arg2.method281(-125);
        } else if (arg0 == 11) {
            this.field1405 = arg2.method281(74);
        } else if (arg0 == 12) {
            int var4 = arg2.method281(-127);
            this.field1411 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1411[var5] = arg2.method314((byte) 126);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                this.field1411[var6] = (arg2.method314((byte) 41) << 16) + this.field1411[var6];
            }
        } else if (arg0 == 13) {
            int var7 = arg2.method314((byte) 54);
            this.field1418 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg2.method281(96);
                if (var9 > 0) {
                    this.field1418[var8] = new int[var9];
                    this.field1418[var8][0] = arg2.method265(true);
                    for (int var10 = 1; var10 < var9; var10++) {
                        this.field1418[var8][var10] = arg2.method314((byte) 123);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field1421 = true;
        } else if (arg0 == 15) {
            this.field1420 = true;
        } else if (arg0 == 16) {
            this.field1417 = true;
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V", line = 210)
    public static void method830(byte arg0) {
        field1416 = null;
        field1402 = null;
        field1406 = null;
        if (arg0 != -73) {
            field1406 = (int[]) null;
        }
        field1425 = (int[][][]) null;
        field1409 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIILhm;I)Lhm;", line = 227)
    public final class52 method831(int arg0, int arg1, int arg2, class52 arg3, int arg4) {
        int var6 = this.field1429[arg0];
        int var7 = this.field1428[arg0];
        class162 var8 = class178.method1396(var7 >> 16, 0);
        if (arg2 >= -113) {
            this.method833(42, 61, 67, 91, (class52) null);
        }
        field1413++;
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method513(true, true, true);
        }
        class162 var10 = null;
        if ((this.field1420 || class170.field2683) && arg4 != -1 && arg4 < this.field1428.length) {
            int var11 = this.field1428[arg4];
            var10 = class178.method1396(var11 >> 16, 0);
            arg4 = var11 & 0xFFFF;
        }
        class52 var12;
        if (var10 == null) {
            var12 = arg3.method513(!var8.method1299(var9, 18329), !var8.method1298(var9, 32), !this.field1421);
        } else {
            var12 = arg3.method513(!var8.method1299(var9, 18329) & !var10.method1299(arg4, 18329), !var8.method1298(var9, 32) & !var10.method1298(arg4, 32), !this.field1421);
        }
        var12.method496(var8, var9, var10, arg4, arg1 - 1, var6, this.field1421);
        return var12;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lhm;IIIIB)Lhm;", line = 268)
    public final class52 method832(class52 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var7 = this.field1429[arg1];
        int var8 = this.field1428[arg1];
        if (arg5 < 34) {
            this.field1401 = -23;
        }
        class162 var9 = class178.method1396(var8 >> 16, 0);
        int var10 = var8 & 0xFFFF;
        field1431++;
        if (var9 == null) {
            return arg0.method516(true, true, true);
        }
        class162 var11 = null;
        if ((this.field1420 || class170.field2683) && arg4 != -1 && arg4 < this.field1428.length) {
            int var12 = this.field1428[arg4];
            var11 = class178.method1396(var12 >> 16, 0);
            arg4 = var12 & 0xFFFF;
        }
        int var13 = arg3 & 0x3;
        class52 var14;
        if (var11 == null) {
            var14 = arg0.method516(!var9.method1299(var10, 18329), !var9.method1298(var10, 32), !this.field1421);
        } else {
            var14 = arg0.method516(!var9.method1299(var10, 18329) & !var11.method1299(arg4, 18329), !var9.method1298(var10, 32) & !var11.method1298(arg4, 32), !this.field1421);
        }
        if (this.field1421 && class240.field3737) {
            if (var13 == 1) {
                ((class56) var14).method558();
            } else if (var13 == 2) {
                ((class56) var14).method552();
            } else if (var13 == 3) {
                ((class56) var14).method540();
            }
        } else if (var13 == 1) {
            var14.method507();
        } else if (var13 == 2) {
            var14.method493();
        } else if (var13 == 3) {
            var14.method501();
        }
        var14.method496(var9, var10, var11, arg4, arg2 - 1, var7, this.field1421);
        if (this.field1421 && class240.field3737) {
            if (var13 == 1) {
                ((class56) var14).method540();
            } else if (var13 == 2) {
                ((class56) var14).method552();
            } else if (var13 == 3) {
                ((class56) var14).method558();
            }
        } else if (var13 == 1) {
            var14.method501();
        } else if (var13 == 2) {
            var14.method493();
        } else if (var13 == 3) {
            var14.method507();
        }
        return var14;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIILhm;)Lhm;", line = 372)
    public final class52 method833(int arg0, int arg1, int arg2, int arg3, class52 arg4) {
        int var6 = this.field1429[arg0];
        field1412++;
        int var7 = this.field1428[arg0];
        class162 var8 = class178.method1396(var7 >> 16, 0);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg4.method516(true, true, true);
        }
        class162 var10 = null;
        int var11 = 0;
        if (arg1 != -3) {
            method830((byte) -62);
        }
        class162 var12 = null;
        int var13 = 0;
        class162 var14 = null;
        if ((this.field1420 || class170.field2683) && arg2 != -1 && arg2 < this.field1428.length) {
            int var15 = this.field1428[arg2];
            var14 = class178.method1396(var15 >> 16, 0);
            arg2 = var15 & 0xFFFF;
        }
        if (this.field1411 != null) {
            if (arg0 < this.field1411.length) {
                var11 = this.field1411[arg0];
                if (var11 != 65535) {
                    var10 = class178.method1396(var11 >> 16, 0);
                    var11 &= 0xFFFF;
                }
            }
            if ((this.field1420 || class170.field2683) && arg2 != -1 && this.field1411.length > arg2) {
                var13 = this.field1411[arg2];
                if (var13 != 65535) {
                    var12 = class178.method1396(var13 >> 16, 0);
                    var13 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1299(var9, 18329);
        boolean var17 = !var8.method1298(var9, 32);
        if (var10 != null) {
            var16 &= !var10.method1299(var11, 18329);
            var17 &= !var10.method1298(var11, 32);
        }
        if (var14 != null) {
            var16 &= !var14.method1299(arg2, 18329);
            var17 &= !var14.method1298(arg2, arg1 + 35);
        }
        if (var12 != null) {
            var16 &= !var12.method1299(var13, 18329);
            var17 &= !var12.method1298(var13, 32);
        }
        class52 var18 = arg4.method516(var16, var17, !this.field1421);
        var18.method496(var8, var9, var14, arg2, arg3 - 1, var6, this.field1421);
        if (var10 != null) {
            var18.method496(var10, var11, var12, var13, arg3 - 1, var6, this.field1421);
        }
        return var18;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLug;)V", line = 506)
    public final void method834(byte arg0, class25 arg1) {
        field1404++;
        while (true) {
            int var3 = arg1.method281(4);
            if (var3 == 0) {
                if (arg0 > -117) {
                    this.method833(-18, -118, -72, -92, (class52) null);
                }
                return;
            }
            this.method829(var3, (byte) -33, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILhm;BIII)Lhm;", line = 532)
    public final class52 method835(int arg0, class52 arg1, byte arg2, int arg3, int arg4, int arg5) {
        field1410++;
        int var7 = this.field1429[arg3];
        int var8 = this.field1428[arg3];
        class162 var9 = class178.method1396(var8 >> 16, 0);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method504(true, true, true);
        }
        int var11 = -65 % ((arg2 + 60) / 49);
        int var12 = arg5 & 0x3;
        class162 var13 = null;
        if ((this.field1420 || class170.field2683) && arg0 != -1 && arg0 < this.field1428.length) {
            int var14 = this.field1428[arg0];
            var13 = class178.method1396(var14 >> 16, 0);
            arg0 = var14 & 0xFFFF;
        }
        class52 var15;
        if (var13 == null) {
            var15 = arg1.method504(!var9.method1299(var10, 18329), !var9.method1298(var10, 32), !this.field1421);
        } else {
            var15 = arg1.method504(!var9.method1299(var10, 18329) & !var13.method1299(arg0, 18329), !var9.method1298(var10, 32) & !var13.method1298(arg0, 32), !this.field1421);
        }
        if (class240.field3737 && this.field1421) {
            if (var12 == 1) {
                ((class56) var15).method558();
            } else if (var12 == 2) {
                ((class56) var15).method552();
            } else if (var12 == 3) {
                ((class56) var15).method540();
            }
        } else if (var12 == 1) {
            var15.method507();
        } else if (var12 == 2) {
            var15.method493();
        } else if (var12 == 3) {
            var15.method501();
        }
        var15.method496(var9, var10, var13, arg0, arg4 - 1, var7, this.field1421);
        if (class240.field3737 && this.field1421) {
            if (var12 == 1) {
                ((class56) var15).method540();
            } else if (var12 == 2) {
                ((class56) var15).method552();
            } else if (var12 == 3) {
                ((class56) var15).method558();
            }
        } else if (var12 == 1) {
            var15.method501();
        } else if (var12 == 2) {
            var15.method493();
        } else if (var12 == 3) {
            var15.method507();
        }
        return var15;
    }
}
