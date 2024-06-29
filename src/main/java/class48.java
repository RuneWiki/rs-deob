import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 implements Runnable {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lad;")
    public static class5 field1241 = class88.method674("@gr3@", 46);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1238 = 0;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lad;")
    public static class5 field1251 = class88.method674("", 109);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "[I")
    public static int[] field1252 = new int[5];

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lad;")
    public static class5 field1253 = class88.method674("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 30);

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[[I")
    public static int[][] field1255 = new int[104][104];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1240;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lfe;")
    public static class36 field1249;

    @OriginalMember(owner = "client!i", name = "run", descriptor = "()V", line = 4)
    public final void run() {
        field1250++;
        try {
            while (true) {
                class23 var1 = class101.field2460;
                class53 var2;
                synchronized (class101.field2460) {
                    var2 = (class53) class101.field2460.method180(0);
                }
                if (var2 == null) {
                    class121.method958(100L, (byte) 106);
                    Object var3 = class118.field2945;
                    synchronized (class118.field2945) {
                        if (class43.field1103 <= 1) {
                            class43.field1103 = 0;
                            class118.field2945.notifyAll();
                            return;
                        }
                        class43.field1103--;
                    }
                } else {
                    if (var2.field1323 == 0) {
                        var2.field1326.method817(var2.field1340, -126, (int) var2.field363, var2.field1340.length);
                        class23 var4 = class101.field2460;
                        synchronized (class101.field2460) {
                            var2.method114(-3789);
                        }
                    } else if (var2.field1323 == 1) {
                        var2.field1340 = var2.field1326.method821((byte) 109, (int) var2.field363);
                        class23 var5 = class101.field2460;
                        synchronized (class101.field2460) {
                            class121.field3002.method176(var2, -19597);
                        }
                    }
                    Object var6 = class118.field2945;
                    synchronized (class118.field2945) {
                        if (class43.field1103 <= 1) {
                            class43.field1103 = 0;
                            class118.field2945.notifyAll();
                            return;
                        }
                        class43.field1103 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class118.method932(var17, null, 1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 77)
    public static final void method416(int arg0) {
        class36.field907.method213(8);
        field1247++;
        int var1 = class36.field907.method207((byte) 80, 8);
        if (var1 < class33.field790) {
            for (int var2 = var1; var2 < class33.field790; var2++) {
                class1.field18[class33.field800++] = class25.field611[var2];
            }
        }
        if (class33.field790 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class33.field790 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class25.field611[var3];
            class61 var5 = class103.field2504[var4];
            int var6 = class36.field907.method207((byte) 80, 1);
            if (var6 == 0) {
                class25.field611[class33.field790++] = var4;
                var5.field113 = class69.field1636;
            } else {
                int var7 = class36.field907.method207((byte) 80, 2);
                if (var7 == 0) {
                    class25.field611[class33.field790++] = var4;
                    var5.field113 = class69.field1636;
                    class13.field380[class109.field2727++] = var4;
                } else if (var7 == 1) {
                    class25.field611[class33.field790++] = var4;
                    var5.field113 = class69.field1636;
                    int var8 = class36.field907.method207((byte) 80, 3);
                    var5.method22((byte) -126, false, var8);
                    int var9 = class36.field907.method207((byte) 80, 1);
                    if (var9 == 1) {
                        class13.field380[class109.field2727++] = var4;
                    }
                } else if (var7 == 2) {
                    class25.field611[class33.field790++] = var4;
                    var5.field113 = class69.field1636;
                    int var10 = class36.field907.method207((byte) 80, 3);
                    var5.method22((byte) -123, true, var10);
                    int var11 = class36.field907.method207((byte) 80, 3);
                    var5.method22((byte) -125, true, var11);
                    int var12 = class36.field907.method207((byte) 80, 1);
                    if (var12 == 1) {
                        class13.field380[class109.field2727++] = var4;
                    }
                } else if (var7 == 3) {
                    class1.field18[class33.field800++] = var4;
                }
            }
        }
        if (arg0 != 10162) {
            field1255 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V", line = 197)
    public static final void method417(int arg0) {
        class21.field551 = null;
        class112.field2796 = null;
        class60.field1491 = null;
        class56.field1397 = null;
        class77.field1815 = null;
        field1243++;
        class58.field1411 = null;
        client.field497 = null;
        if (arg0 != 3600) {
            method417(61);
        }
        class34.field861 = null;
        class105.field2638 = null;
        class116.field2885 = null;
        class105.field2546 = null;
        class40.field1035 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZIB[BI)V", line = 220)
    public static final void method418(boolean arg0, int arg1, byte arg2, byte[] arg3, int arg4) {
        field1246++;
        if (class8.field275 == null) {
            return;
        }
        if (class39.field972 >= 0) {
            arg4 -= 20;
            if (arg4 < 1) {
                arg4 = 1;
            }
            class9.field299 = arg4;
            if (class39.field972 == 0) {
                class100.field2427 = 0;
            } else {
                int var5 = method419(class39.field972, -31096);
                int var6 = var5 - class135.field3254;
                class100.field2427 = (var6 + arg4 + 3600 - 1) / arg4;
            }
            class47.field1228 = arg0;
            class100.field2429 = arg1;
            class63.field1525 = arg3;
        } else if (class9.field299 == 0) {
            class27.method226(1, arg0, arg3, arg1);
        } else {
            class47.field1228 = arg0;
            class100.field2429 = arg1;
            class63.field1525 = arg3;
        }
        if (arg2 != -12) {
            method422((byte) -15, null, -95, null);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I", line = 270)
    public static final int method419(int arg0, int arg1) {
        field1240++;
        return arg1 == -31096 ? (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D) : -7;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 283)
    public static void method420(int arg0) {
        field1253 = null;
        field1255 = null;
        field1241 = null;
        field1249 = null;
        field1252 = null;
        field1251 = null;
        if (arg0 != 1) {
            method419(-65, 91);
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(II)Ltd;", line = 298)
    public static final class118 method421(int arg0, int arg1) {
        field1242++;
        class118 var2 = (class118) class87.field2029.method98(-8, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 1) {
            field1238 = -10;
        }
        byte[] var3 = class6.field226.method857(30580, 9, arg0);
        class118 var4 = new class118();
        var4.field2935 = arg0;
        if (var3 != null) {
            var4.method934(new class39(var3), 86);
        }
        var4.method941((byte) 67);
        class87.field2029.method102((long) arg0, var4, 95);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLr;ILtb;)V", line = 330)
    public static final void method422(byte arg0, class102 arg1, int arg2, class116 arg3) {
        field1254++;
        class53 var4 = new class53();
        var4.field1326 = arg1;
        var4.field363 = arg2;
        if (arg0 != -56) {
            return;
        }
        var4.field1327 = arg3;
        var4.field1323 = 1;
        class23 var5 = class101.field2460;
        synchronized (class101.field2460) {
            class101.field2460.method176(var4, arg0 ^ 0x4CBB);
        }
        class56.method457((byte) -78);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(JI)V", line = 350)
    public static final void method423(long arg0, int arg1) {
        field1244++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class100.field2437; var3++) {
            if (class35.field892[var3] == arg0) {
                class103.field2520++;
                class43.field1086 = true;
                class100.field2437--;
                for (int var4 = var3; var4 < class100.field2437; var4++) {
                    class21.field543[var4] = class21.field543[var4 + 1];
                    class40.field1040[var4] = class40.field1040[var4 + 1];
                    class35.field892[var4] = class35.field892[var4 + 1];
                }
                class5.field163.method209(30, 10);
                class5.field163.method340(arg0, arg1 ^ 0xA8979E4);
                break;
            }
        }
        if (arg1 != -15820) {
            method422((byte) -61, null, 49, null);
        }
    }
}
