import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class100 implements Runnable {

    @OriginalMember(owner = "client!is", name = "q", descriptor = "Lvt;")
    private class687 field1338 = new class351();

    @OriginalMember(owner = "client!is", name = "x", descriptor = "Lvt;")
    private class687 field1345 = null;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "Z")
    public static boolean field1336 = false;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "Z")
    public static boolean field1337 = false;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field1328;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field1335;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!is", name = "B", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "J")
    private long field1348;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "J")
    private long field1350;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "Luf;")
    private class466 field1346;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Ldn;")
    public static class548 field1323;

    @OriginalMember(owner = "client!is", name = "D", descriptor = "Ljava/lang/String;")
    private String field1351;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "Z")
    private boolean field1340;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "Z")
    private volatile boolean field1344;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)Ljava/lang/String;", line = 6)
    public final String method750(int arg0) {
        int var2 = -41 % ((arg0 - 44) / 61);
        field1328++;
        return this.field1351;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)I", line = 16)
    public final int method751(byte arg0) {
        field1332++;
        if (this.field1346 == null) {
            return 0;
        }
        int var2 = this.field1346.method2595(arg0 ^ 0xFFFFFFA7);
        if (this.field1346.field6081 && this.field1346.field6078 > this.field1349) {
            return this.field1349 + 1;
        } else if (var2 >= 0 && var2 < (class94.field1239.length - 1)) {
            if (arg0 != -76) {
                this.method763((byte) 13);
            }
            return this.field1346.field6076 == this.field1349 ? this.field1346.field6078 : this.field1346.field6076;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V", line = 44)
    public static void method752(byte arg0) {
        field1323 = null;
        if (arg0 != -100) {
            field1326 = 105;
        }
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(B)I", line = 56)
    public final int method753(byte arg0) {
        field1333++;
        int var2 = 40 / ((arg0 - 43) / 42);
        return this.field1349;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(III)V", line = 68)
    public static final void method754(int arg0, int arg1, int arg2) {
        class693.field9478 = arg2 - class706.field9860;
        field1343++;
        if (arg1 <= 93) {
            method752((byte) -26);
        }
        class82.field1112 = arg0 - class706.field9866;
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(B)I", line = 81)
    public final int method755(byte arg0) {
        if (arg0 == 107) {
            field1329++;
            return this.field1347;
        } else {
            return 120;
        }
    }

    @OriginalMember(owner = "client!is", name = "e", descriptor = "(B)Z", line = 98)
    public final synchronized boolean method756(byte arg0) {
        if (arg0 < 66) {
            return true;
        } else {
            field1334++;
            return this.field1338.method548(false, this.field1350);
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lvt;B)V", line = 112)
    public final synchronized void method757(class687 arg0, byte arg1) {
        field1330++;
        this.field1345 = this.field1338;
        this.field1338 = arg0;
        this.field1350 = class584.method3191(1);
        int var3 = -95 % ((41 - arg1) / 57);
    }

    @OriginalMember(owner = "client!is", name = "f", descriptor = "(B)V", line = 125)
    public final synchronized void method758(byte arg0) {
        this.field1340 = true;
        if (arg0 >= -98) {
            this.method764(-97L, -126, null, -123, null);
        }
        field1339++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IC)C", line = 137)
    public static final char method759(int arg0, char arg1) {
        field1324++;
        if (arg0 <= 75) {
            return ')';
        } else if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else if (arg1 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg1 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lcg;I)V", line = 171)
    public static final void method760(class11 arg0, int arg1) {
        field1327++;
        class384.field4912.method2087(arg0, -127);
        arg0.field120 = arg0.field114.field5367;
        arg0.field114.field5367 = 0;
        int var2 = 1 % ((-arg1 - 51) / 45);
        class211.field2722 += arg0.field120;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)Luf;", line = 187)
    public final class466 method761(int arg0) {
        if (arg0 <= 18) {
            this.run();
        }
        field1331++;
        return this.field1346;
    }

    @OriginalMember(owner = "client!is", name = "g", descriptor = "(B)J", line = 198)
    public final long method762(byte arg0) {
        field1325++;
        int var2 = -111 / ((arg0 - 41) / 46);
        return this.field1348;
    }

    @OriginalMember(owner = "client!is", name = "h", descriptor = "(B)V", line = 210)
    public final void method763(byte arg0) {
        field1341++;
        this.field1344 = true;
        if (arg0 < 108) {
            this.field1347 = 30;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(JILjava/lang/String;ILuf;)V", line = 221)
    public final synchronized void method764(long arg0, int arg1, String arg2, int arg3, class466 arg4) {
        if (arg1 >= -106) {
            return;
        }
        this.field1351 = arg2;
        this.field1349 = arg3;
        this.field1346 = arg4;
        this.field1348 = arg0;
        field1342++;
    }

    @OriginalMember(owner = "client!is", name = "i", descriptor = "(B)V", line = 235)
    public static final void method765(byte arg0) {
        if (arg0 != 93) {
            method754(103, 118, 87);
        }
        field1322++;
        if (class259.field3490 != -1) {
            class183.method1225(class259.field3490, false, 0, -1, -1);
            class259.field3490 = -1;
        }
    }

    @OriginalMember(owner = "client!is", name = "run", descriptor = "()V", line = 251)
    public final void run() {
        while (!this.field1344) {
            long var1 = class584.method3191(1);
            synchronized (this) {
                try {
                    if (this.field1338 instanceof class351) {
                        this.field1338.method550(this.field1340, 1277);
                    } else {
                        this.field1347++;
                        long var4 = class584.method3191(1);
                        if (class520.field6799 == null || this.field1345 == null || this.field1345.method545(-17121) == 0 || this.field1350 < var4 - ((long) this.field1345.method545(-17121))) {
                            if (this.field1345 != null) {
                                this.field1340 = true;
                                this.field1345.method549(25742);
                                this.field1345 = null;
                            }
                            if (this.field1340) {
                                class337.method1933((byte) 109);
                                if (class520.field6799 != null) {
                                    class520.field6799.method162(0);
                                }
                            }
                            this.field1338.method550(this.field1340 || class520.field6799 != null && class520.field6799.method379(), 1277);
                        } else {
                            int var6 = (int) ((var4 - this.field1350) * 255L / (long) this.field1345.method545(-17121));
                            int var7 = 255 - var6;
                            int var8 = var7 << 24 | 0xFFFFFF;
                            class337.method1933((byte) 57);
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class520.field6799.method162(0);
                            class511 var10 = class520.field6799.method364(class519.field6796, class461.field6047, true);
                            class520.field6799.method397(var10, 3);
                            this.field1345.method550(true, 1277);
                            class520.field6799.method173();
                            var10.method606(0, 0, 0, var8, 1);
                            class520.field6799.method397(var10, 3);
                            class520.field6799.method162(0);
                            this.field1338.method550(true, 1277);
                            class520.field6799.method173();
                            var10.method606(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class520.field6799 != null && !(this.field1338 instanceof class351)) {
                                class520.field6799.method216();
                            }
                        } catch (class381 var17) {
                            class698.method3809(var17.getMessage() + " (Recovered) " + class381.field4890.method711((byte) -16), (byte) 125, var17);
                            class11.method58(0, -118);
                        }
                    }
                    this.field1340 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class584.method3191(1);
            int var14 = (int) (var1 + 20L - var12);
            if (var14 > 0) {
                class122.method905((long) var14, -6145);
            }
        }
        field1335++;
    }
}
