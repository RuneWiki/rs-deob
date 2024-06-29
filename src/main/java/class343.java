import java.io.DataInputStream;
import java.math.BigInteger;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class343 extends class77 {

    @OriginalMember(owner = "client!od", name = "w", descriptor = "[Lvk;")
    public static class209[] field5298 = new class209[14];

    @OriginalMember(owner = "client!od", name = "K", descriptor = "[Lqm;")
    public static class228[] field5312 = new class228[2048];

    @OriginalMember(owner = "client!od", name = "G", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5308 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field5315 = 0;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "C")
    private char field5313;

    @OriginalMember(owner = "client!od", name = "y", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!od", name = "A", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!od", name = "B", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!od", name = "C", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!od", name = "D", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!od", name = "E", descriptor = "I")
    public static int field5306;

    @OriginalMember(owner = "client!od", name = "F", descriptor = "I")
    public int field5307;

    @OriginalMember(owner = "client!od", name = "H", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!od", name = "I", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!od", name = "J", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "Lph;")
    public static class361 field5316;

    @OriginalMember(owner = "client!od", name = "z", descriptor = "Ljava/lang/String;")
    public String field5301;

    @OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
    public static int[] field5299;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)Lmf;", line = 6)
    public static final class214 method2393(byte arg0, int arg1) {
        field5300++;
        class214 var2 = (class214) class239.field3558.method461((byte) 120, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -27) {
            field5308 = (BigInteger) null;
        }
        byte[] var3 = class356.field5462.method2520(class12.method69(arg0 + 15073, arg1), class96.method761(arg1, (byte) -39), (byte) -25);
        class214 var4 = new class214();
        var4.field3121 = arg1;
        if (var3 != null) {
            var4.method1548(new class190(var3), (byte) -29);
        }
        var4.method1538(-120);
        class239.field3558.method460(var4, -26089, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)Z", line = 43)
    public final boolean method2394(boolean arg0) {
        field5310++;
        if (arg0) {
            return this.field5313 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V", line = 57)
    public static final void method2395(int arg0) {
        field5314++;
        if (arg0 != -2) {
            field5299 = (int[]) null;
        }
        class121.field1697.method458((byte) 88);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILvn;Z)V", line = 68)
    public static final void method2396(int arg0, class98 arg1, boolean arg2) {
        if (arg0 > -30) {
            field5308 = (BigInteger) null;
        }
        field5304++;
        int var3 = (int) arg1.field1656;
        int var4 = arg1.field1393;
        arg1.method876(8);
        if (arg2) {
            class96.method760((byte) -69, var4);
        }
        class243.method1787(279311792, var4);
        class359 var5 = class231.method1719(var3, 98);
        if (var5 != null) {
            class83.method676(var5, (byte) 121);
        }
        int var6 = class264.field4043;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class109.method840(class216.field3186[var7], (byte) -27)) {
                class329.method2280(-80, var7);
            }
        }
        if (class264.field4043 == 1) {
            class15.field246 = false;
            class230.method1716(class131.field1899, class173.field2499, class172.field2482, 2, class134.field1957);
        } else {
            class230.method1716(class131.field1899, class173.field2499, class172.field2482, 2, class134.field1957);
            int var8 = class126.field1846.method203(class173.field2493);
            for (int var9 = 0; var9 < class264.field4043; var9++) {
                int var10 = class126.field1846.method203(class181.method1252(var9, -21419));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class134.field1957 = class264.field4043 * 15 + (class304.field4564 ? 26 : 22);
            class172.field2482 = var8 + 8;
        }
        if (class257.field3850 != -1) {
            class31.method217(82, 1, class257.field3850);
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(B)V", line = 145)
    public static void method2397(byte arg0) {
        field5316 = null;
        if (arg0 == -77) {
            field5299 = null;
            field5298 = null;
            field5312 = null;
            field5308 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILsb;I)V", line = 160)
    private final void method2398(int arg0, class190 arg1, int arg2) {
        field5309++;
        if (arg0 == 1) {
            this.field5313 = class7.method45((byte) -88, arg1.method1322(9813));
        } else if (arg0 == 2) {
            this.field5307 = arg1.method1371(-4);
        } else if (arg0 == 5) {
            this.field5301 = arg1.method1329((byte) 59);
        }
        if (arg2 < 39) {
            this.field5313 = (char) 65483;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(BILqf;II)V", line = 196)
    public static final void method2399(byte arg0, int arg1, class359 arg2, int arg3, int arg4) {
        if (class141.field2031) {
            class205.method1503(arg1, arg4, arg2.field5506 + arg1, arg2.field5560 + arg4);
        }
        if (arg0 != -99) {
            field5299 = (int[]) null;
        }
        if (class352.field5426 < 3) {
            if (class141.field2031) {
                ((class325) class56.field813).method2251(arg1, arg4, arg2.field5506, arg2.field5560, class56.field813.field2536 / 2, class56.field813.field2553 / 2, (int) class36.field535, 256, (class325) arg2.method2493(118, false));
            } else {
                ((class118) class56.field813).method639(arg1, arg4, arg2.field5506, arg2.field5560, class56.field813.field2536 / 2, class56.field813.field2553 / 2, (int) class36.field535, 256, arg2.field5570, arg2.field5591);
            }
        } else if (class141.field2031) {
            class177 var5 = arg2.method2493(127, false);
            if (var5 != null) {
                var5.method642(arg1, arg4);
            }
        } else {
            class44.method324(arg1, arg4, 0, arg2.field5570, arg2.field5591);
        }
        field5303++;
        class186.field2674[arg3] = true;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILsb;)V", line = 235)
    public final void method2400(int arg0, class190 arg1) {
        field5306++;
        while (true) {
            int var3 = arg1.method1319(arg0 ^ 0xFFFFFF00);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field5301 = (String) null;
                }
                return;
            }
            this.method2398(var3, arg1, 54);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ILph;)V", line = 255)
    public static final void method2401(int arg0, class361 arg1) {
        class173.field2506 = class331.method2329(-118, class292.field4428, arg1);
        field5311++;
        class349.field5395 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) (class231.field3497[var2] >> 16 & 0xFF);
            int var4 = class231.field3497[var2 + 1] >> 16 & 0xFF;
            int var5 = class231.field3497[var2 + 1] >> 8 & 0xFF;
            int var6 = class231.field3497[var2 + 1] & 0xFF;
            float var7 = ((float) var4 - var3) / 64.0F;
            float var8 = (float) ((class231.field3497[var2] & 0xFF00) >> 8);
            float var9 = ((float) var5 - var8) / 64.0F;
            float var10 = (float) (class231.field3497[var2] & 0xFF);
            float var11 = ((float) var6 - var10) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class349.field5395[var2 * 64 + var12] = class81.method666((int) var10, class81.method666((int) var8 << 8, (int) var3 << 16));
                var10 += var11;
                var3 += var7;
                var8 += var9;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class349.field5395[var13] = class231.field3497[3];
        }
        class214.field3124 = new int[32768];
        class111.field1618 = new int[32768];
        class59.method470(28, (class234) null);
        class267.field4071 = new int[32768];
        if (arg0 != 3) {
            method2399((byte) 37, -4, (class359) null, 7, -103);
        }
        class194.field2822 = new int[32768];
        class257.field3846 = new class118(128, 254);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V", line = 328)
    public static final void method2402(String arg0, Throwable arg1, int arg2) {
        field5302++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class353.method2461(5, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class109.method838(var3, 35);
            String var4 = class103.method792(arg2 + 4, "%3a", ":", var3);
            String var5 = class103.method792(2, "%40", "@", var4);
            String var6 = class103.method792(2, "%26", "&", var5);
            String var7 = class103.method792(arg2 + 4, "%23", "#", var6);
            if (class144.field2087.field878 == null) {
                return;
            }
            class210 var8 = class144.field2087.method492(113, new URL(class144.field2087.field878.getCodeBase(), "clienterror.ws?c=" + class12.field187 + "&u=" + class260.field3881 + "&v1=" + class61.field882 + "&v2=" + class61.field879 + "&e=" + var7));
            while (var8.field3056 == 0) {
                class184.method1283(1L, 10);
            }
            if (~var8.field3056 == arg2) {
                DataInputStream var9 = (DataInputStream) var8.field3058;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }
}
