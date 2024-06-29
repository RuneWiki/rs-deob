import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class64 extends class19 {

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Z")
    public boolean field1324 = false;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public int field1334 = -1;

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "[I")
    private int[] field1340 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!h", name = "M", descriptor = "Lsd;")
    public static class166 field1322 = class135.method935("<col=ff0000>", 0);

    @OriginalMember(owner = "client!h", name = "L", descriptor = "Lsd;")
    public static class166 field1321 = class135.method935("Lade Titelbild )2 ", 0);

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field1327 = 0;

    @OriginalMember(owner = "client!h", name = "S", descriptor = "Lvd;")
    public static class193 field1328 = null;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "Lsd;")
    private static class166 field1335 = class135.method935("go back to the main RuneScape webpage", 0);

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "Lsd;")
    public static class166 field1341 = field1335;

    @OriginalMember(owner = "client!h", name = "kb", descriptor = "I")
    public static int field1346 = -1;

    @OriginalMember(owner = "client!h", name = "hb", descriptor = "I")
    public static int field1343 = 1;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!h", name = "ib", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!h", name = "jb", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!h", name = "lb", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "Lcb;")
    public static class22 field1337;

    @OriginalMember(owner = "client!h", name = "P", descriptor = "[I")
    private int[] field1325;

    @OriginalMember(owner = "client!h", name = "N", descriptor = "[S")
    private short[] field1323;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "[S")
    private short[] field1329;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "[S")
    private short[] field1332;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "[S")
    private short[] field1339;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static final void method533(boolean arg0) {
        field1333++;
        if (class156.field2979 != null) {
            return;
        }
        if (!arg0) {
            method541(25);
        }
        if (class18.field298 != null) {
            return;
        }
        int var1 = class2.field18;
        if (class192.field3654) {
            if (var1 != 1) {
                int var6 = class41.field734;
                int var7 = class5.field110;
                if (var6 < class128.field2510 - 10 || var6 > class128.field2510 + class146.field2873 + 10 || class154.field2967 - 10 > var7 || var7 > class154.field2967 + class59.field1226 + 10) {
                    class192.field3654 = false;
                    class27.method201((byte) -123, class59.field1226, class128.field2510, class154.field2967, class146.field2873);
                }
            }
            if (var1 != 1) {
                return;
            }
            int var8 = class128.field2510;
            int var9 = class154.field2967;
            int var10 = class146.field2873;
            int var11 = class69.field1409;
            int var12 = class57.field1174;
            int var13 = -1;
            for (int var14 = 0; var14 < class160.field3064; var14++) {
                int var15 = (class160.field3064 - var14 - 1) * 15 + var9 + 31;
                if (var8 < var11 && var11 < var8 + var10 && var12 > var15 - 13 && var12 < var15 + 3) {
                    var13 = var14;
                }
            }
            if (var13 != -1) {
                class84.method677(var13, 2);
            }
            class192.field3654 = false;
            class27.method201((byte) -124, class59.field1226, class128.field2510, class154.field2967, class146.field2873);
            return;
        }
        if (var1 == 1 && class160.field3064 > 0) {
            int var2 = class200.field3970[class160.field3064 - 1];
            if (var2 == 2 || var2 == 29 || var2 == 35 || var2 == 22 || var2 == 48 || var2 == 51 || var2 == 46 || var2 == 33 || var2 == 45 || var2 == 16 || var2 == 32 || var2 == 1002) {
                int var3 = class56.field1092[class160.field3064 - 1];
                int var4 = class16.field262[class160.field3064 - 1];
                class193 var5 = class90.method701(-31355, var3);
                if (class6.method40(-28168, class140.method955(-111, var5)) || class19.method121(-79, class140.method955(-115, var5))) {
                    class125.field2457 = false;
                    class134.field2597 = 0;
                    if (class156.field2979 != null) {
                        class68.method550(class156.field2979, 15);
                    }
                    class156.field2979 = class90.method701(-31355, var3);
                    class34.field650 = class69.field1409;
                    class37.field673 = class57.field1174;
                    class89.field1752 = var4;
                    class68.method550(class156.field2979, 15);
                    return;
                }
            }
        }
        if (var1 == 1 && (class140.field2733 == 1 && class160.field3064 > 2 || class176.method1200((byte) -36, class160.field3064 - 1))) {
            var1 = 2;
        }
        if (var1 == 1 && class160.field3064 > 0) {
            class84.method677(class160.field3064 - 1, 2);
        }
        if (var1 == 2 && class160.field3064 > 0) {
            class199.method1309((byte) 73);
            return;
        }
    }

    @OriginalMember(owner = "client!h", name = "i", descriptor = "(I)V")
    public static final void method534(int arg0) {
        class104.field2028.method71(arg0 ^ 0x1F1);
        field1342++;
        class115.field2227.method71(500);
        class88.field1731.method71(500);
        if (arg0 != 5) {
            method536(null, 113, 16, 35, -95, 34);
        }
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(I)Z")
    public final boolean method535(int arg0) {
        field1330++;
        if (this.field1325 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1325.length; var3++) {
            if (!class85.field1698.method354(0, this.field1325[var3], -110)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lre;IIIII)V")
    public static final void method536(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1344++;
        int var6 = 5 / ((arg2 - 69) / 49);
        int var7 = arg1 * arg1 + arg3 * arg3;
        if (var7 <= 4225 || var7 >= 90000) {
            class4.method24(arg1, arg0, (byte) 14, arg4, arg3, arg5);
            return;
        }
        int var8 = client.field515 + class132.field2590 & 0x7FF;
        int var9 = class40.field717[var8];
        int var10 = var9 * 256 / (class193.field3731 + 256);
        int var11 = class40.field719[var8];
        int var12 = var11 * 256 / (class193.field3731 + 256);
        int var13 = arg3 * var10 + arg1 * var12 >> 16;
        int var14 = arg3 * var12 - arg1 * var10 >> 16;
        double var15 = Math.atan2((double) var13, (double) var14);
        int var17 = (int) (Math.sin(var15) * 63.0D);
        int var18 = (int) (Math.cos(var15) * 57.0D);
        class122.field2393.method1063(arg5 + var17 + 94 + 4 - 10, -var18 + arg4 - -63, 20, 20, 15, 15, var15, 256);
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "(I)Z")
    public final boolean method537(int arg0) {
        field1338++;
        boolean var2 = true;
        for (int var3 = arg0; var3 < 5; var3++) {
            if (this.field1340[var3] != -1 && !class85.field1698.method354(0, this.field1340[var3], -65)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BILff;)V")
    private final void method538(byte arg0, int arg1, class53 arg2) {
        if (arg1 == 1) {
            this.field1334 = arg2.method400(255);
        } else if (arg1 == 2) {
            int var4 = arg2.method400(255);
            this.field1325 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1325[var5] = arg2.method405(2);
            }
        } else if (arg1 == 3) {
            this.field1324 = true;
        } else if (arg1 == 40) {
            int var8 = arg2.method400(255);
            this.field1323 = new short[var8];
            this.field1332 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1323[var9] = (short) arg2.method405(2);
                this.field1332[var9] = (short) arg2.method405(2);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method400(255);
            this.field1329 = new short[var6];
            this.field1339 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1329[var7] = (short) arg2.method405(2);
                this.field1339[var7] = (short) arg2.method405(2);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field1340[arg1 - 60] = arg2.method405(2);
        }
        if (arg0 <= 11) {
            this.method537(-109);
        }
        field1326++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)Llb;")
    public final class101 method539(byte arg0) {
        field1331++;
        if (this.field1325 == null) {
            return null;
        }
        class101[] var2 = new class101[this.field1325.length];
        if (arg0 != 37) {
            field1321 = null;
        }
        for (int var3 = 0; var3 < this.field1325.length; var3++) {
            var2[var3] = class101.method768(class85.field1698, this.field1325[var3], 0);
        }
        class101 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class101(var2, var2.length);
        }
        if (this.field1323 != null) {
            for (int var5 = 0; var5 < this.field1323.length; var5++) {
                var4.method749(this.field1323[var5], this.field1332[var5]);
            }
        }
        if (this.field1329 != null) {
            for (int var6 = 0; var6 < this.field1329.length; var6++) {
                var4.method762(this.field1329[var6], this.field1339[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Lff;I)V")
    public final void method540(class53 arg0, int arg1) {
        field1347++;
        if (arg1 < 24) {
            field1327 = -115;
        }
        while (true) {
            int var3 = arg0.method400(255);
            if (var3 == 0) {
                return;
            }
            this.method538((byte) 83, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(I)V")
    public static void method541(int arg0) {
        field1328 = null;
        field1335 = null;
        field1322 = null;
        field1321 = null;
        field1341 = null;
        if (arg0 != -1) {
            method533(false);
        }
        field1337 = null;
    }

    @OriginalMember(owner = "client!h", name = "m", descriptor = "(I)Llb;")
    public final class101 method542(int arg0) {
        if (arg0 != 20499) {
            return null;
        }
        field1345++;
        class101[] var2 = new class101[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1340[var4] != -1) {
                var2[var3++] = class101.method768(class85.field1698, this.field1340[var4], 0);
            }
        }
        class101 var5 = new class101(var2, var3);
        if (this.field1323 != null) {
            for (int var6 = 0; var6 < this.field1323.length; var6++) {
                var5.method749(this.field1323[var6], this.field1332[var6]);
            }
        }
        if (this.field1329 != null) {
            for (int var7 = 0; var7 < this.field1329.length; var7++) {
                var5.method762(this.field1329[var7], this.field1339[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILih;ILff;)V")
    public static final void method543(int arg0, class80 arg1, int arg2, class53 arg3) {
        class178 var4 = new class178();
        var4.field3361 = arg3.method400(255);
        field1336++;
        var4.field3368 = arg3.method419(-4);
        var4.field3367 = new int[var4.field3361];
        var4.field3362 = new byte[var4.field3361][][];
        var4.field3369 = new class65[var4.field3361];
        var4.field3363 = new int[var4.field3361];
        var4.field3366 = new class65[var4.field3361];
        var4.field3358 = new int[var4.field3361];
        if (arg2 != 9207) {
            return;
        }
        for (int var5 = 0; var5 < var4.field3361; var5++) {
            try {
                int var6 = arg3.method400(arg2 - 8952);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg3.method436((byte) -92).method1124(67));
                    String var18 = new String(arg3.method436((byte) -70).method1124(57));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg3.method419(-4);
                    }
                    var4.field3367[var5] = var6;
                    var4.field3358[var5] = var19;
                    var4.field3369[var5] = arg1.method654(class81.method662(0, var17), var18, class178.method1209(arg2, -9141));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg3.method436((byte) -63).method1124(arg2 ^ 0x23B8));
                    String var8 = new String(arg3.method436((byte) 99).method1124(arg2 - 9131));
                    int var9 = arg3.method400(255);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg3.method436((byte) -51).method1124(91));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg3.method419(-4);
                            var12[var13] = new byte[var14];
                            arg3.method420(-1552680924, var12[var13], 0, var14);
                        }
                    }
                    var4.field3367[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class81.method662(0, var10[var16]);
                    }
                    var4.field3366[var5] = arg1.method659(var8, var15, class81.method662(0, var7), (byte) -116);
                    var4.field3362[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field3363[var5] = -1;
            } catch (SecurityException var21) {
                var4.field3363[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field3363[var5] = -3;
            } catch (Exception var23) {
                var4.field3363[var5] = -4;
            } catch (Throwable var24) {
                var4.field3363[var5] = -5;
            }
        }
        class170.field3274.method1112(-1250931468, var4);
    }
}
