import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class344 extends class259 {

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "Ljava/lang/String;")
    private String field5446 = "null";

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    public static int field5460 = 100;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "Lvh;")
    public static class62 field5462 = new class62(32);

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "[I")
    public static int[] field5464 = new int[25];

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "[[B")
    public static byte[][] field5468 = new byte[1000][];

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "C")
    public char field5455;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "C")
    public char field5458;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field5443;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    private int field5445;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field5450;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "I")
    public static int field5453;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field5466;

    @OriginalMember(owner = "client!ak", name = "M", descriptor = "Lqb;")
    public class117 field5454;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "Lqb;")
    private class117 field5461;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "Lnk;")
    public static class16 field5444;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "Lnk;")
    public static class16 field5465;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "Lnk;")
    public static class16 field5467;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "Lfg;")
    public static class240 field5463;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lfk;", line = 4)
    public static final class54 method2380(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class54 var4 = var3.field2994;
            var3.field2994 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILlf;)V", line = 18)
    public final void method2381(int arg0, class143 arg1) {
        int var3 = 67 % ((arg0) / 62);
        while (true) {
            int var4 = arg1.method1043(true);
            if (var4 == 0) {
                field5451++;
                return;
            }
            this.method2390(6, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(B)V", line = 43)
    private final void method2382(byte arg0) {
        field5459++;
        this.field5461 = new class117(this.field5454.method759((byte) -105));
        if (arg0 > -33) {
            field5466 = 64;
        }
        for (class305 var2 = (class305) this.field5454.method761(124); var2 != null; var2 = (class305) this.field5454.method757(-1)) {
            class305 var3 = new class305((int) var2.field2834);
            this.field5461.method764(24369, var3, (long) var2.field4748);
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(II)Ljava/lang/String;", line = 65)
    public final String method2383(int arg0, int arg1) {
        field5441++;
        if (this.field5454 == null) {
            return this.field5446;
        }
        if (arg1 != 4) {
            this.method2384(64, (byte) 92);
        }
        class23 var3 = (class23) this.field5454.method770((long) arg0, -112);
        return var3 == null ? this.field5446 : var3.field274;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)I", line = 91)
    public final int method2384(int arg0, byte arg1) {
        field5442++;
        if (this.field5454 == null) {
            return this.field5445;
        }
        class305 var3 = (class305) this.field5454.method770((long) arg0, -63);
        if (arg1 != 29) {
            method2386(-39);
        }
        return var3 == null ? this.field5445 : var3.field4748;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(B)V", line = 111)
    private final void method2385(byte arg0) {
        this.field5461 = new class117(this.field5454.method759((byte) -105));
        field5448++;
        if (arg0 == 111) {
            for (class23 var2 = (class23) this.field5454.method761(60); var2 != null; var2 = (class23) this.field5454.method757(-1)) {
                class311 var3 = new class311(var2.field274, (int) var2.field2834);
                this.field5461.method764(24369, var3, class313.method2206(arg0 ^ 0xFFFFFF90, var2.field274));
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V", line = 135)
    public static final void method2386(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class302.field4702[var1] = true;
        }
        field5443++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V", line = 147)
    public static void method2387(boolean arg0) {
        field5468 = (byte[][]) null;
        if (arg0) {
            method2380(-40, 79, 113);
        }
        field5467 = null;
        field5465 = null;
        field5444 = null;
        field5464 = null;
        field5463 = null;
        field5462 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 170)
    public final boolean method2388(String arg0, byte arg1) {
        if (arg1 != 15) {
            field5464 = (int[]) null;
        }
        field5456++;
        if (this.field5454 == null) {
            return false;
        }
        if (this.field5461 == null) {
            this.method2385((byte) 111);
        }
        for (class311 var3 = (class311) this.field5461.method770(class313.method2206(-1, arg0), -99); var3 != null; var3 = (class311) this.field5461.method758(arg1 - 130)) {
            if (var3.field4882.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IB)Z", line = 209)
    public final boolean method2389(int arg0, byte arg1) {
        field5449++;
        if (this.field5454 == null) {
            return false;
        }
        if (arg1 >= -45) {
            this.field5458 = '\u0005';
        }
        if (this.field5461 == null) {
            this.method2382((byte) -43);
        }
        class305 var3 = (class305) this.field5461.method770((long) arg0, -91);
        return var3 != null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILlf;)V", line = 240)
    private final void method2390(int arg0, int arg1, class143 arg2) {
        if (arg1 == 1) {
            this.field5458 = class308.method2172(true, arg2.method1028(79030408));
        } else if (arg1 == 2) {
            this.field5455 = class308.method2172(true, arg2.method1028(79030408));
        } else if (arg1 == 3) {
            this.field5446 = arg2.method1040((byte) -127);
        } else if (arg1 == 4) {
            this.field5445 = arg2.method1057(-122);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg2.method1051(1);
            this.field5454 = new class117(class226.method1571(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method1057(arg0 - 132);
                class188 var7;
                if (arg1 == 5) {
                    var7 = new class23(arg2.method1040((byte) -127));
                } else {
                    var7 = new class305(arg2.method1057(arg0 - 108));
                }
                this.field5454.method764(24369, var7, (long) var6);
            }
        }
        field5457++;
        if (arg0 != 6) {
            field5444 = (class16) null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(B)V", line = 295)
    public static final void method2391(byte arg0) {
        while (true) {
            if (class282.field4499.method308(class191.field2869, 64) >= 11) {
                int var1 = class282.field4499.method307(11, true);
                if (var1 != 2047) {
                    boolean var3 = false;
                    if (class105.field1443[var1] == null) {
                        class105.field1443[var1] = new class67();
                        var3 = true;
                        if (class125.field1772[var1] != null) {
                            class105.field1443[var1].method411(class125.field1772[var1], (byte) -127);
                        }
                    }
                    class80.field1067[class302.field4704++] = var1;
                    class67 var4 = class105.field1443[var1];
                    var4.field3772 = class102.field1381;
                    int var5 = class282.field4499.method307(1, true);
                    if (var5 == 1) {
                        class127.field1864[class218.field3280++] = var1;
                    }
                    int var6 = class282.field4499.method307(5, true);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class282.field4499.method307(5, true);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class282.field4499.method307(1, true);
                    int var9 = class28.field331[class282.field4499.method307(3, true)];
                    if (var3) {
                        var4.field3806 = var4.field3760 = var9;
                    }
                    var4.method407(class11.field113.field3747[0] + var6, class11.field113.field3786[0] + var7, var8 == 1, 0);
                    continue;
                }
            }
            class282.field4499.method303(43);
            field5453++;
            int var2 = 79 % ((arg0 - 37) / 41);
            return;
        }
    }
}
