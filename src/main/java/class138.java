import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class138 implements Runnable {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Z")
    public boolean field3224 = true;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field3226 = new Object();

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "[I")
    public int[] field3236 = new int[500];

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
    public int[] field3240 = new int[500];

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public int field3238 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lwd;")
    public static class150 field3222 = class2.method9(true, "Regelversto-8 melden");

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Lwd;")
    private static class150 field3232 = class2.method9(true, "yellow:");

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field3231 = 0;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lwd;")
    public static class150 field3228 = field3232;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3235 = -1;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Lwd;")
    private static class150 field3239 = class2.method9(true, "Classic");

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field3241 = 1;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lwd;")
    public static class150 field3229 = field3232;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Lwd;")
    public static class150 field3225 = field3239;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Li;")
    public static class56 field3223 = new class56(64);

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "Lwd;")
    public static class150 field3244 = class2.method9(true, "@yel@");

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lwd;")
    public static class150 field3245 = class2.method9(true, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field3243 = -1;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lpb;IILce;)V")
    public static final void method1019(class106 arg0, int arg1, int arg2, class20 arg3) {
        field3227++;
        class91 var4 = new class91();
        var4.field2118 = arg3;
        var4.field2122 = 1;
        var4.field2228 = arg2;
        int var5 = -92 % ((-arg1 - 30) / 34);
        var4.field2133 = arg0;
        class103 var6 = class73.field1821;
        synchronized (class73.field1821) {
            class73.field1821.method711(var4, 0);
        }
        class47.method356((byte) 96);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZLse;)V")
    public static final void method1020(boolean arg0, class127 arg1) {
        field3234++;
        arg1.field2955 = arg0;
        if (arg1.field2976 != -1) {
            class49 var2 = class111.method785(arg1.field2976, 22969);
            if (var2 == null || var2.field1308 == null) {
                arg1.field2976 = -1;
            } else {
                arg1.field2961++;
                if (var2.field1308.length > arg1.field2974 && var2.field1298[arg1.field2974] < arg1.field2961) {
                    arg1.field2961 = 1;
                    arg1.field2974++;
                    class22.method185(arg1.field2974, arg1.field3000, var2, arg1.field2939, (byte) -87);
                }
                if (arg1.field2974 >= var2.field1308.length) {
                    arg1.field2974 = 0;
                    arg1.field2961 = 0;
                    class22.method185(arg1.field2974, arg1.field3000, var2, arg1.field2939, (byte) -122);
                }
            }
        }
        if (arg1.field2991 != -1 && arg1.field3010 <= class11.field280) {
            if (arg1.field3002 < 0) {
                arg1.field3002 = 0;
            }
            int var3 = class128.method971(false, arg1.field2991).field2409;
            if (var3 == -1) {
                arg1.field2991 = -1;
            } else {
                class49 var4 = class111.method785(var3, 22969);
                if (var4 == null || var4.field1308 == null) {
                    arg1.field2991 = -1;
                } else {
                    arg1.field2966++;
                    if (var4.field1308.length > arg1.field3002 && var4.field1298[arg1.field3002] < arg1.field2966) {
                        arg1.field2966 = 1;
                        arg1.field3002++;
                        class22.method185(arg1.field3002, arg1.field3000, var4, arg1.field2939, (byte) -83);
                    }
                    if (var4.field1308.length <= arg1.field3002 && (arg1.field3002 < 0 || arg1.field3002 >= var4.field1308.length)) {
                        arg1.field2991 = -1;
                    }
                }
            }
        }
        if (arg1.field3005 != -1 && arg1.field2979 <= 1) {
            class49 var5 = class111.method785(arg1.field3005, 22969);
            if (var5.field1297 == 1 && arg1.field2995 > 0 && arg1.field2996 <= class11.field280 && arg1.field3014 < class11.field280) {
                arg1.field2979 = 1;
                return;
            }
        }
        if (arg1.field3005 != -1 && arg1.field2979 == 0) {
            class49 var6 = class111.method785(arg1.field3005, 22969);
            if (var6 == null || var6.field1308 == null) {
                arg1.field3005 = -1;
            } else {
                arg1.field2985++;
                if (var6.field1308.length > arg1.field2960 && arg1.field2985 > var6.field1298[arg1.field2960]) {
                    arg1.field2960++;
                    arg1.field2985 = 1;
                    class22.method185(arg1.field2960, arg1.field3000, var6, arg1.field2939, (byte) -125);
                }
                if (var6.field1308.length <= arg1.field2960) {
                    arg1.field2960 -= var6.field1306;
                    arg1.field2990++;
                    if (arg1.field2990 >= var6.field1305) {
                        arg1.field3005 = -1;
                    } else if (arg1.field2960 >= 0 && var6.field1308.length > arg1.field2960) {
                        class22.method185(arg1.field2960, arg1.field3000, var6, arg1.field2939, (byte) -117);
                    } else {
                        arg1.field3005 = -1;
                    }
                }
                arg1.field2955 = var6.field1314;
            }
        }
        if (arg1.field2979 > 0) {
            arg1.field2979--;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BLwb;B)V")
    public static final void method1021(byte[] arg0, class148 arg1, byte arg2) {
        field3242++;
        if (arg1.field3592[arg1.field3601] != 31 || arg1.field3592[arg1.field3601 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (arg2 >= -62) {
            field3228 = null;
        }
        Inflater var3 = new Inflater(true);
        var3.setInput(arg1.field3592, arg1.field3601 + 10, -arg1.field3601 + -10 + arg1.field3592.length - 8);
        try {
            var3.inflate(arg0);
        } catch (DataFormatException var4) {
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method1022(byte arg0) {
        field3228 = null;
        field3229 = null;
        if (arg0 < 117) {
            return;
        }
        field3222 = null;
        field3239 = null;
        field3223 = null;
        field3225 = null;
        field3244 = null;
        field3232 = null;
        field3245 = null;
    }

    @OriginalMember(owner = "client!ud", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field3224) {
            Object var1 = this.field3226;
            synchronized (this.field3226) {
                if (this.field3238 < 500) {
                    this.field3236[this.field3238] = class111.field2557;
                    this.field3240[this.field3238] = class113.field2602;
                    this.field3238++;
                }
            }
            class72.method548(-80, 50L);
        }
        field3233++;
    }
}
