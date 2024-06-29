import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class262 {

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "B")
    private byte field4244;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "I")
    public int field4242;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public int field4234;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public int field4241;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "[[I")
    public static int[][] field4232 = new int[104][104];

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field4225 = -1;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field4231 = 0;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field4233 = 0;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4238 = "Attack";

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "[J")
    public static long[] field4245 = new long[100];

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "Lef;")
    public static class214 field4229;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "[I")
    public static int[] field4226;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "[I")
    public static int[] field4243;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)I")
    public final int method1795(int arg0) {
        field4223++;
        if (arg0 != 3) {
            method1798((byte) 7);
        }
        return (this.field4244 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V")
    public static final void method1796(int arg0, int arg1) {
        field4236++;
        if (arg0 != 12164) {
            field4245 = null;
        }
        class287 var2 = class261.method1786(arg1, false, 3);
        var2.method1912((byte) 85);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)Lgk;")
    public static final class157 method1797(byte arg0) {
        field4237++;
        if (class216.field3526.length > class136.field1990) {
            return class216.field3526[class136.field1990++];
        } else {
            int var1 = -7 / ((79 - arg0) / 36);
            return null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(B)V")
    public static final void method1798(byte arg0) {
        field4240++;
        if (!class286.field4542) {
            client.field2330[0] = class191.field3019;
            class96.field1491[0] = class290.field4581;
            class2.field21[0] = 1005;
            class19.field225[0] = "";
            class245.field3920 = 1;
            if (class52.field715 != 0) {
                class236.field3780 = class178.field2781;
                class106.field1634 = class134.field1947;
            } else if (class173.field2720 == 0) {
                class236.field3780 = class141.field2074;
                class106.field1634 = class31.field416;
            } else {
                class236.field3780 = class145.field2140;
                class106.field1634 = class59.field836;
            }
        }
        if (class242.field3880 != -1) {
            class66.method452(class242.field3880, -121);
        }
        for (int var1 = 0; var1 < class146.field2154; var1++) {
            if (class110.field1675[var1]) {
                class80.field1162[var1] = true;
            }
            class236.field3788[var1] = class110.field1675[var1];
            class110.field1675[var1] = false;
        }
        field4225 = -1;
        class73.field1037 = -1;
        class57.field811 = class111.field1684;
        class194.field3056 = null;
        class264.field4264 = null;
        if (class242.field3880 != -1) {
            class146.field2154 = 0;
            class287.method1913((byte) -47);
        }
        class127.method875();
        if (arg0 != -43) {
            method1799(-3);
        }
        class124.method840(1);
        if (class286.field4542) {
            if (class264.field4247) {
                class154.method1024(0);
            } else {
                class66.method449(true);
            }
        } else if (class264.field4264 != null) {
            class261.method1792(class31.field421, 14471, class102.field1593, class264.field4264);
        } else if (class73.field1037 != -1) {
            class261.method1792(class73.field1037, 14471, field4225, (class214) null);
        }
        int var2 = class286.field4542 ? -1 : class26.method228(-28243);
        if (var2 == -1) {
            var2 = class147.field2162;
        }
        class257.method1765(var2, 2048);
        if (class73.field1041 == 1) {
            class73.field1041 = 2;
        }
        if (class130.field1909 == 1) {
            class130.field1909 = 2;
        }
        if (class4.field56 == 3) {
            for (int var3 = 0; var3 < class146.field2154; var3++) {
                if (class236.field3788[var3]) {
                    class127.method860(class149.field2229[var3], class272.field4336[var3], class283.field4485[var3], class155.field2306[var3], 16711935, 128);
                } else if (class80.field1162[var3]) {
                    class127.method860(class149.field2229[var3], class272.field4336[var3], class283.field4485[var3], class155.field2306[var3], 16711680, 128);
                }
            }
        }
        class7.method46(class276.field4398, class80.field1166, class149.field2227.field1273, false, class149.field2227.field1226);
        class80.field1166 = 0;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V")
    public static void method1799(int arg0) {
        field4232 = null;
        if (arg0 < 57) {
            return;
        }
        field4243 = null;
        field4245 = null;
        field4229 = null;
        field4226 = null;
        field4238 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(II)Lck;")
    public static final class218 method1800(int arg0, int arg1) {
        if (arg1 > -41) {
            method1803((byte) 69, (class25) null);
        }
        field4227++;
        class218 var2 = (class218) class116.field1720.method1428((long) arg0, (byte) -103);
        if (var2 != null) {
            return var2;
        }
        class218 var3 = class155.method1028(class207.field3223, 255, arg0, false, class239.field3824);
        if (var3 != null) {
            class116.field1720.method1424((long) arg0, var3, -2003648287);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(II)V")
    public static final void method1801(int arg0, int arg1) {
        class105.field1620.method1425(arg0, -124);
        field4230++;
        if (arg1 == 12890) {
            class28.field384.method1425(arg0, -124);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)I")
    public final int method1802(boolean arg0) {
        field4235++;
        if (arg0) {
            method1798((byte) 19);
        }
        return this.field4244 & 0x7;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(BLlj;)Lug;")
    public static final class199 method1803(byte arg0, class25 arg1) {
        if (arg0 != 59) {
            method1801(-101, 100);
        }
        field4228++;
        class199 var2 = new class199();
        var2.field3116 = arg1.method190(-3);
        var2.field3119 = class64.method443(-90, var2.field3116);
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V")
    public class262() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Llj;)V")
    public class262(class25 arg0) {
        this.field4244 = arg0.method188(-100);
        this.field4242 = arg0.method190(-3);
        this.field4234 = arg0.method214((byte) 44);
        this.field4224 = arg0.method214((byte) 44);
        this.field4239 = arg0.method214((byte) 44);
        this.field4241 = arg0.method214((byte) 44);
    }
}
