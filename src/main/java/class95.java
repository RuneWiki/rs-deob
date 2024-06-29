import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class95 {

    @OriginalMember(owner = "client!gm", name = "j", descriptor = "Loa;")
    private class157 field1346 = new class157();

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "Loa;")
    private class157 field1357 = new class157();

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "Loa;")
    private class157 field1358 = new class157();

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "Loa;")
    private class157 field1359 = new class157();

    @OriginalMember(owner = "client!gm", name = "A", descriptor = "Lre;")
    private class446 field1363 = new class446(4);

    @OriginalMember(owner = "client!gm", name = "D", descriptor = "B")
    private byte field1366 = 0;

    @OriginalMember(owner = "client!gm", name = "F", descriptor = "I")
    public volatile int field1368 = 0;

    @OriginalMember(owner = "client!gm", name = "C", descriptor = "I")
    public volatile int field1365 = 0;

    @OriginalMember(owner = "client!gm", name = "E", descriptor = "Lre;")
    private class446 field1367 = new class446(8);

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    public static int field1342 = 0;

    @OriginalMember(owner = "client!gm", name = "m", descriptor = "Z")
    public static boolean field1349 = false;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field1354 = new String[200];

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "[Lun;")
    public static class110[] field1355 = new class110[14];

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!gm", name = "i", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!gm", name = "k", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!gm", name = "l", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!gm", name = "n", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!gm", name = "B", descriptor = "I")
    private int field1364;

    @OriginalMember(owner = "client!gm", name = "y", descriptor = "J")
    private long field1361;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "Lkc;")
    private class147 field1360;

    @OriginalMember(owner = "client!gm", name = "z", descriptor = "Lfc;")
    public static class239 field1362;

    @OriginalMember(owner = "client!gm", name = "G", descriptor = "Lml;")
    private class24 field1369;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "Lnd;")
    public static class484 field1337;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)I")
    private final int method732(byte arg0) {
        field1352++;
        if (arg0 <= 49) {
            this.method737(121);
        }
        return this.field1358.method1072((byte) 87) + this.field1359.method1072((byte) 87);
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(B)Z")
    public final boolean method733(byte arg0) {
        if (this.field1360 != null) {
            long var2 = class435.method2539(-10659);
            int var4 = (int) (var2 - this.field1361);
            this.field1361 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1364 += var4;
            if (this.field1364 > 30000) {
                try {
                    this.field1360.method998((byte) -13);
                } catch (Exception var28) {
                }
                this.field1360 = null;
            }
        }
        field1345++;
        if (this.field1360 == null) {
            return this.method738(true) == 0 && this.method732((byte) 91) == 0;
        }
        try {
            this.field1360.method999(1);
            for (class24 var5 = (class24) this.field1346.method1070((byte) -80); var5 != null; var5 = (class24) this.field1346.method1073(124)) {
                this.field1363.field6315 = 0;
                this.field1363.method2619((byte) -4, 1);
                this.field1363.method2591(-277028920, (int) var5.field1255);
                this.field1360.method1000(30000, 0, 4, this.field1363.field6316);
                this.field1357.method1075((byte) -42, var5);
            }
            for (class24 var6 = (class24) this.field1358.method1070((byte) -48); var6 != null; var6 = (class24) this.field1358.method1073(-5)) {
                this.field1363.field6315 = 0;
                this.field1363.method2619((byte) 88, 0);
                this.field1363.method2591(-277028920, (int) var6.field1255);
                this.field1360.method1000(30000, 0, 4, this.field1363.field6316);
                this.field1359.method1075((byte) -67, var6);
            }
            int var7 = -33 % ((11 - arg0) / 33);
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field1360.method1005(5000);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field1364 = 0;
                byte var10 = 0;
                if (this.field1369 == null) {
                    var10 = 8;
                } else if (this.field1369.field316 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field1369.field319.field6316.length - this.field1369.field317;
                    int var12 = 512 - this.field1369.field316;
                    if (var11 - this.field1369.field319.field6315 < var12) {
                        var12 = var11 - this.field1369.field319.field6315;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field1360.method996(var12, this.field1369.field319.field6316, true, this.field1369.field319.field6315);
                    if (this.field1366 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field1369.field319.field6316[this.field1369.field319.field6315 + var13] = (byte) class76.method648(this.field1369.field319.field6316[this.field1369.field319.field6315 + var13], this.field1366);
                        }
                    }
                    this.field1369.field319.field6315 += var12;
                    this.field1369.field316 += var12;
                    if (this.field1369.field319.field6315 == var11) {
                        this.field1369.method701(-70);
                        this.field1369.field5386 = false;
                        this.field1369 = null;
                    } else if (this.field1369.field316 == 512) {
                        this.field1369.field316 = 0;
                    }
                } else {
                    int var14 = var10 - this.field1367.field6315;
                    if (var14 > var9) {
                        var14 = var9;
                    }
                    this.field1360.method996(var14, this.field1367.field6316, true, this.field1367.field6315);
                    if (this.field1366 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field1367.field6316[this.field1367.field6315 + var15] = (byte) class76.method648(this.field1367.field6316[this.field1367.field6315 + var15], this.field1366);
                        }
                    }
                    this.field1367.field6315 += var14;
                    if (this.field1367.field6315 >= var10) {
                        if (this.field1369 == null) {
                            this.field1367.field6315 = 0;
                            int var16 = this.field1367.method2628(49152);
                            int var17 = this.field1367.method2631(2530);
                            int var18 = this.field1367.method2628(49152);
                            int var19 = this.field1367.method2604(-111);
                            int var20 = var18 & 0x7F;
                            boolean var21 = (var18 & 0x80) != 0;
                            long var22 = (long) ((var16 << 16) + var17);
                            Object var24 = null;
                            class24 var25;
                            if (var21) {
                                for (var25 = (class24) this.field1359.method1070((byte) -99); var25 != null && var25.field1255 != var22; var25 = (class24) this.field1359.method1073(-11)) {
                                }
                            } else {
                                for (var25 = (class24) this.field1357.method1070((byte) -104); var25 != null && var25.field1255 != var22; var25 = (class24) this.field1357.method1073(117)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field1369 = var25;
                            int var26 = var20 == 0 ? 5 : 9;
                            this.field1369.field319 = new class446(this.field1369.field317 + var19 + var26);
                            this.field1369.field319.method2619((byte) -127, var20);
                            this.field1369.field319.method2596((byte) 125, var19);
                            this.field1369.field316 = 8;
                            this.field1367.field6315 = 0;
                        } else if (this.field1369.field316 != 0) {
                            throw new IOException();
                        } else if (this.field1367.field6316[0] == -1) {
                            this.field1369.field316 = 1;
                            this.field1367.field6315 = 0;
                        } else {
                            this.field1369 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var29) {
            try {
                this.field1360.method998((byte) -13);
            } catch (Exception var27) {
            }
            this.field1368++;
            this.field1365 = -2;
            this.field1360 = null;
            return this.method738(true) == 0 && this.method732((byte) 83) == 0;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method734(int arg0) {
        field1351++;
        try {
            this.field1360.method998((byte) -13);
        } catch (Exception var3) {
        }
        this.field1366 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1368++;
        this.field1360 = null;
        int var2 = -18 % ((arg0 - 5) / 41);
        this.field1365 = -1;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V")
    public final void method735(int arg0) {
        field1339++;
        if (this.field1360 != null) {
            this.field1360.method998((byte) -13);
        }
        int var2 = 68 / ((65 - arg0) / 39);
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(B)Z")
    public final boolean method736(byte arg0) {
        if (arg0 == -26) {
            field1350++;
            return this.method732((byte) 92) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)Z")
    public final boolean method737(int arg0) {
        if (arg0 == 4) {
            field1356++;
            return this.method738(true) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Z)I")
    public final int method738(boolean arg0) {
        field1344++;
        return arg0 ? this.field1346.method1072((byte) 87) + this.field1357.method1072((byte) 87) : 57;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        field1353++;
        if (this.field1360 == null) {
            return;
        }
        try {
            this.field1363.field6315 = 0;
            if (arg1 != -2) {
                this.field1368 = 98;
            }
            this.field1363.method2619((byte) -125, arg0 ? 2 : 3);
            this.field1363.method2591(arg1 ^ 0x10832036, 0);
            this.field1360.method1000(30000, 0, 4, this.field1363.field6316);
        } catch (IOException var4) {
            try {
                this.field1360.method998((byte) -13);
            } catch (Exception var3) {
            }
            this.field1365 = -2;
            this.field1368++;
            this.field1360 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(I)V")
    private final void method740(int arg0) {
        field1348++;
        if (this.field1360 == null) {
            return;
        }
        try {
            this.field1363.field6315 = 0;
            this.field1363.method2619((byte) -123, 6);
            this.field1363.method2591(-277028920, 3);
            if (arg0 > 68) {
                this.field1360.method1000(30000, 0, 4, this.field1363.field6316);
            }
        } catch (IOException var3) {
            try {
                this.field1360.method998((byte) -13);
            } catch (Exception var2) {
            }
            this.field1365 = -2;
            this.field1368++;
            this.field1360 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "(B)V")
    public final void method741(byte arg0) {
        field1343++;
        if (this.field1360 == null) {
            return;
        }
        try {
            this.field1363.field6315 = 0;
            this.field1363.method2619((byte) -120, 7);
            this.field1363.method2591(-277028920, 0);
            this.field1360.method1000(30000, 0, 4, this.field1363.field6316);
        } catch (IOException var4) {
            try {
                this.field1360.method998((byte) -13);
            } catch (Exception var3) {
            }
            this.field1368++;
            this.field1360 = null;
            this.field1365 = -2;
        }
        int var2 = -65 / ((arg0 - 49) / 61);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ZBIIZ)Lml;")
    public final class24 method742(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field1347++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class24 var8 = new class24();
        var8.field5387 = arg0;
        var8.field1255 = var6;
        var8.field317 = arg1;
        if (arg0) {
            if (this.method738(true) >= 20) {
                throw new RuntimeException();
            }
            this.field1346.method1075((byte) -104, var8);
        } else if (this.method732((byte) 77) < 20) {
            this.field1358.method1075((byte) -104, var8);
        } else {
            throw new RuntimeException();
        }
        if (!arg4) {
            this.field1365 = -103;
        }
        return var8;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IZLkc;)V")
    public final void method743(int arg0, boolean arg1, class147 arg2) {
        if (this.field1360 != null) {
            try {
                this.field1360.method998((byte) -13);
            } catch (Exception var8) {
            }
            this.field1360 = null;
        }
        field1338++;
        this.field1360 = arg2;
        this.method740(116);
        if (arg0 <= 40) {
            this.method738(false);
        }
        this.method739(arg1, -2);
        this.field1367.field6315 = 0;
        this.field1369 = null;
        while (true) {
            class24 var4 = (class24) this.field1357.method1069((byte) 89);
            if (var4 == null) {
                while (true) {
                    class24 var5 = (class24) this.field1359.method1069((byte) 89);
                    if (var5 == null) {
                        if (this.field1366 != 0) {
                            try {
                                this.field1363.field6315 = 0;
                                this.field1363.method2619((byte) -11, 4);
                                this.field1363.method2619((byte) 69, this.field1366);
                                this.field1363.method2592(0, (byte) -125);
                                this.field1360.method1000(30000, 0, 4, this.field1363.field6316);
                            } catch (IOException var7) {
                                try {
                                    this.field1360.method998((byte) -13);
                                } catch (Exception var6) {
                                }
                                this.field1368++;
                                this.field1365 = -2;
                                this.field1360 = null;
                            }
                        }
                        this.field1364 = 0;
                        this.field1361 = class435.method2539(-10659);
                        return;
                    }
                    this.field1358.method1075((byte) -122, var5);
                }
            }
            this.field1346.method1075((byte) -120, var4);
        }
    }

    @OriginalMember(owner = "client!gm", name = "e", descriptor = "(B)V")
    public static void method744(byte arg0) {
        field1337 = null;
        field1355 = null;
        field1362 = null;
        int var1 = 95 / ((arg0 + 34) / 41);
        field1354 = null;
    }

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "(B)V")
    public final void method745(byte arg0) {
        if (this.field1360 != null) {
            this.field1360.method1004((byte) -100);
        }
        field1340++;
        if (arg0 < 29) {
            this.method743(125, false, (class147) null);
        }
    }
}
