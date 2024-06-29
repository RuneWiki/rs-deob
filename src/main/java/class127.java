import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class127 {

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    private int field2447 = 0;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    private int field2448 = 128;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    private int field2459 = 0;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    private int field2443 = 0;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Z")
    public boolean field2451 = false;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "I")
    public int field2466 = -1;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    private int field2465 = 128;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "D")
    public static double field2442 = -1.0D;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Ljd;")
    public static class86 field2454 = class122.method868("scrollen:", true);

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field2453 = 0;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Ljd;")
    public static class86 field2458 = class122.method868(" ", true);

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field2446 = 0;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "[I")
    public static int[] field2439 = new int[100];

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public int field2456;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    private int field2464;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "[S")
    private short[] field2440;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[S")
    private short[] field2450;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "[S")
    private short[] field2457;

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "[S")
    private short[] field2467;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
    public static final void method892(int arg0, int arg1) {
        field2463++;
        if (arg0 == 10776) {
            class161 var2 = class204.method1456(true, 6, arg1);
            var2.method1173(true);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILqk;)V")
    public final void method893(int arg0, class200 arg1) {
        while (true) {
            int var3 = arg1.method1408((byte) -101);
            if (var3 == 0) {
                field2444++;
                if (arg0 != -30) {
                    this.field2456 = 11;
                    return;
                }
                return;
            }
            this.method897(arg1, (byte) 40, var3);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public static final void method894(byte arg0) {
        if (arg0 != 20) {
            return;
        }
        class213.field3857 = null;
        field2449++;
        class24.field592 = null;
        class268.field4718 = null;
        class1.field6 = null;
        class191.field3393 = null;
        class138.field2628 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILbj;ZI)[Lei;")
    public static final class167[] method895(int arg0, class151 arg1, boolean arg2, int arg3) {
        field2455++;
        if (arg2) {
            method895(-82, (class151) null, false, -34);
        }
        return class163.method1181(arg1, arg3, 10475, arg0) ? class80.method565(0) : null;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(II)Ljd;")
    public static final class86 method896(int arg0, int arg1) {
        field2441++;
        if (arg0 == 12307) {
            return class188.field3332[arg1].method612((byte) 55) > 0 ? class109.method783(2, new class86[] { class46.field1022[arg1], class181.field3256, class188.field3332[arg1] }) : class46.field1022[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lqk;BI)V")
    private final void method897(class200 arg0, byte arg1, int arg2) {
        field2452++;
        if (arg1 != 40) {
            this.method899(122, 97);
        }
        if (arg2 == 1) {
            this.field2464 = arg0.method1410(arg1 ^ 0xFFFFFF98);
        } else if (arg2 == 2) {
            this.field2466 = arg0.method1410(arg1 ^ 0xFFFFFFEE);
        } else if (arg2 == 4) {
            this.field2465 = arg0.method1410(arg1 ^ 0xFFFFFFA1);
        } else if (arg2 == 5) {
            this.field2448 = arg0.method1410(arg1 ^ 0xFFFFFFBA);
        } else if (arg2 == 6) {
            this.field2447 = arg0.method1410(-98);
        } else if (arg2 == 7) {
            this.field2443 = arg0.method1408((byte) -58);
        } else if (arg2 == 8) {
            this.field2459 = arg0.method1408((byte) -112);
        } else if (arg2 == 9) {
            this.field2451 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1408((byte) -113);
            this.field2440 = new short[var6];
            this.field2450 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2440[var7] = (short) arg0.method1410(-63);
                this.field2450[var7] = (short) arg0.method1410(-60);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method1408((byte) -93);
            this.field2467 = new short[var4];
            this.field2457 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2467[var5] = (short) arg0.method1410(-68);
                this.field2457[var5] = (short) arg0.method1410(arg1 - 146);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method898(int arg0) {
        field2458 = null;
        field2439 = null;
        if (arg0 == 7687) {
            field2454 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(II)Lie;")
    public final class32 method899(int arg0, int arg1) {
        field2445++;
        class32 var3 = (class32) class272.field4773.method701((byte) -124, (long) this.field2456);
        if (var3 == null) {
            class192 var4 = class192.method1339(class186.field3305, this.field2464, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field2440 != null) {
                for (int var5 = 0; var5 < this.field2440.length; var5++) {
                    var4.method1318(this.field2440[var5], this.field2450[var5]);
                }
            }
            if (this.field2467 != null) {
                for (int var6 = 0; var6 < this.field2467.length; var6++) {
                    var4.method1342(this.field2467[var6], this.field2457[var6]);
                }
            }
            var3 = var4.method1316(this.field2443 + 64, this.field2459 + 850, -30, -50, -30);
            class272.field4773.method696((long) this.field2456, var3, (byte) -96);
        }
        class32 var7;
        if (this.field2466 == -1 || arg1 == -1) {
            var7 = var3.method219(true, true);
        } else {
            var7 = class133.method952(this.field2466, 127).method871((byte) -117, var3, arg1);
        }
        if (this.field2465 != 128 || this.field2448 != 128) {
            var7.method225(this.field2465, this.field2448, this.field2465);
        }
        int var8 = -109 % ((-arg0 - 12) / 32);
        if (this.field2447 != 0) {
            if (this.field2447 == 90) {
                var7.method220();
            }
            if (this.field2447 == 180) {
                var7.method221();
            }
            if (this.field2447 == 270) {
                var7.method232();
            }
        }
        return var7;
    }
}
