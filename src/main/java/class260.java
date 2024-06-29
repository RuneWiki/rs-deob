import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class260 {

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
    private int field3076 = 32;

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Z")
    private boolean field3084 = false;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "J")
    private long field3096 = class349.method2069(true);

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    private int field3103 = 0;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "J")
    private long field3106 = 0L;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "[Loia;")
    private class97[] field3101 = new class97[8];

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    private int field3104 = 0;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "[Loia;")
    private class97[] field3107 = new class97[8];

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "J")
    private long field3100 = 0L;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    private int field3105 = 0;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    private int field3099 = 0;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "Z")
    private boolean field3108 = true;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "Lbja;")
    public static class34 field3089 = new class34(1, 2, 2, 0);

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3097;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    private int field3102;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "Loia;")
    private class97 field3078;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field3075;

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "[I")
    public int[] field3083;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()V", line = 5)
    public static final void method1552() {
        for (int var0 = 0; var0 < class747.field10373.length; var0++) {
            class747.field10373[var0].method2128();
        }
        class747.field10373 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V", line = 17)
    public static void method1553(byte arg0) {
        field3075 = null;
        field3089 = null;
        int var1 = 1 / ((arg0 + 16) / 37);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZLoia;)V", line = 29)
    public final synchronized void method1554(boolean arg0, class97 arg1) {
        if (arg0) {
            this.field3108 = true;
        }
        field3086++;
        this.field3078 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([BIII)Ljava/lang/String;", line = 40)
    public static final String method1555(byte[] arg0, int arg1, int arg2, int arg3) {
        field3091++;
        char[] var4 = new char[arg3];
        int var5 = 0;
        if (arg2 != 2000) {
            return null;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class88.field1183[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V", line = 79)
    public final synchronized void method1556(int arg0) {
        field3090++;
        if (this.field3084) {
            return;
        }
        long var2 = class349.method2069(true);
        try {
            if (this.field3096 + 6000L < var2) {
                this.field3096 = var2 - 6000L;
            }
            while ((this.field3096 + 5000L) < var2) {
                this.method1565(256, 42);
                this.field3096 += (256000 / class478.field6632);
                var2 = class349.method2069(true);
            }
        } catch (Exception var7) {
            this.field3096 = var2;
        }
        if (this.field3083 == null) {
            return;
        }
        try {
            if (this.field3100 != 0L) {
                if (this.field3100 > var2) {
                    return;
                }
                this.method1359(this.field3109);
                this.field3108 = true;
                this.field3100 = 0L;
            }
            if (arg0 != 16128) {
                this.field3104 = -1;
            }
            int var4 = this.method1362();
            if (this.field3104 - var4 > this.field3103) {
                this.field3103 = this.field3104 - var4;
            }
            int var5 = this.field3098 + this.field3102;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3109 < (var5 + 256)) {
                this.field3109 += 1024;
                if (this.field3109 > 16384) {
                    this.field3109 = 16384;
                }
                this.method1364();
                this.method1359(this.field3109);
                var4 = 0;
                if (this.field3109 < (var5 + 256)) {
                    var5 = this.field3109 - 256;
                    this.field3102 = var5 - this.field3098;
                }
                this.field3108 = true;
            }
            while (var5 > var4) {
                this.method1561(this.field3083, 256);
                this.method1365();
                var4 += 256;
            }
            if (var2 > this.field3106) {
                if (this.field3108) {
                    this.field3108 = false;
                } else if (this.field3103 == 0 && this.field3105 == 0) {
                    this.method1364();
                    this.field3100 = var2 + 2000L;
                    return;
                } else {
                    this.field3102 = Math.min(this.field3105, this.field3103);
                    this.field3105 = this.field3103;
                }
                this.field3103 = 0;
                this.field3106 = var2 + 2000L;
            }
            this.field3104 = var4;
        } catch (Exception var6) {
            this.method1364();
            this.field3100 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "()I", line = 200)
    public int method1362() throws Exception {
        field3092++;
        return this.field3109;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "()V", line = 212)
    public void method1364() {
        field3082++;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 220)
    public final synchronized void method1557(int arg0) {
        this.field3108 = true;
        field3077++;
        try {
            this.method1363();
            int var2 = 19 % ((arg0 - 27) / 47);
        } catch (Exception var3) {
            this.method1364();
            this.field3100 = class349.method2069(true) + 2000L;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 239)
    public final synchronized void method1558(int arg0) {
        field3094++;
        if (arg0 != -6923) {
            return;
        }
        if (class615.field8269 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class615.field8269.field59[var3] == this) {
                    class615.field8269.field59[var3] = null;
                }
                if (class615.field8269.field59[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class615.field8269.field54 = true;
                while (class615.field8269.field58) {
                    class594.method3405(50L, 16711680);
                }
                class615.field8269 = null;
            }
        }
        this.method1364();
        this.field3083 = null;
        this.field3084 = true;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lha;IBILkq;I)V", line = 288)
    public static final void method1559(class66 arg0, int arg1, byte arg2, int arg3, class620 arg4, int arg5) {
        for (int var6 = 7; var6 >= 0; var6--) {
            for (int var7 = 127; var7 >= 0; var7--) {
                class322.method1922(false, (byte) 99, true);
                int var8 = var6 & 0x7 << 7 | arg5 << 10 & 0xFC00 | var7 & 0x7F;
                int var9 = class437.field5749[var8];
                class738.method4150(true, false, 0);
                arg0.method645((arg4.field8506 * var7 >> 7) + arg3, arg1 - -((-var6 + 7) * arg4.field8416 >> 3), (arg4.field8506 >> 7) + 1, (arg4.field8416 >> 3) + 1, var9, 0);
            }
        }
        if (arg2 <= 25) {
            field3075 = null;
        }
        field3081++;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 321)
    public void method1359(int arg0) throws Exception {
        field3085++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Z)V", line = 330)
    public static final void method1560(boolean arg0) {
        field3095++;
        if (!arg0) {
            field3075 = null;
        }
        if (class288.field3466 != null) {
            class288.field3466 = null;
            class181.method1214(2740, class711.field9978, class743.field10352, class656.field9045, class189.field2275);
        }
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "()V", line = 352)
    public void method1365() throws Exception {
        field3097++;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "()V", line = 361)
    public void method1363() throws Exception {
        field3079++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "([II)V", line = 374)
    private final void method1561(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class270.field3189) {
            var3 = arg1 << 1;
        }
        class211.method1328(arg0, 0, var3);
        this.field3099 -= arg1;
        if (this.field3078 != null && this.field3099 <= 0) {
            this.field3099 += class478.field6632 >> 4;
            class3.method98(this.field3078, (byte) 37);
            this.method1563(this.field3078, this.field3078.method748(), 23307);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class97 var10 = null;
                        class97 var11 = this.field3101[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class598 var12 = var11.field1285;
                                if (var12 == null || var12.field8104 <= var8) {
                                    var11.field1287 = true;
                                    int var13 = var11.method752();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field8104 += var13;
                                    }
                                    if (var4 >= this.field3076) {
                                        break label107;
                                    }
                                    class97 var14 = var11.method745();
                                    if (var14 != null) {
                                        int var15 = var11.field1284;
                                        while (var14 != null) {
                                            this.method1563(var14, var15 * var14.method748() >> 8, 23307);
                                            var14 = var11.method763();
                                        }
                                    }
                                    class97 var16 = var11.field1286;
                                    var11.field1286 = null;
                                    if (var10 == null) {
                                        this.field3101[var7] = var16;
                                    } else {
                                        var10.field1286 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3107[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1286;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class97 var18 = this.field3101[var17];
                this.field3101[var17] = this.field3107[var17] = null;
                while (var18 != null) {
                    class97 var19 = var18.field1286;
                    var18.field1286 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3099 < 0) {
            this.field3099 = 0;
        }
        if (this.field3078 != null) {
            this.field3078.method760(arg0, 0, arg1);
        }
        this.field3096 = class349.method2069(true);
    }

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "()V", line = 534)
    public static final void method1562() {
        for (int var0 = class790.field10877; var0 < class368.field4569; var0++) {
            for (int var1 = 0; var1 < class307.field3799; var1++) {
                for (int var2 = 0; var2 < class250.field2938; var2++) {
                    class727 var3 = class107.field1351[var0][var1][var2];
                    if (var3 != null) {
                        class621 var4 = var3.field10173;
                        class621 var5 = var3.field10187;
                        if (var4 != null && var4.method531(false)) {
                            class534.method3177(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method531(false)) {
                                class534.method3177(var5, var0, var1, var2, 1, 1);
                                var5.method524(var4, class6.field80, 0, 0, false, 0, -17);
                                var5.method530(false);
                            }
                            var4.method530(false);
                        }
                        for (class10 var6 = var3.field10174; var6 != null; var6 = var6.field186) {
                            class712 var8 = var6.field187;
                            if (var8 != null && var8.method531(false)) {
                                class534.method3177(var8, var0, var1, var2, var8.field9991 + 1 - var8.field9994, var8.field9990 - var8.field9997 + 1);
                                var8.method530(false);
                            }
                        }
                        class328 var7 = var3.field10177;
                        if (var7 != null && var7.method531(false)) {
                            class87.method801(var7, var0, var1, var2);
                            var7.method530(false);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 609)
    public void method1361(Component arg0) throws Exception {
        field3080++;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Loia;II)V", line = 617)
    private final void method1563(class97 arg0, int arg1, int arg2) {
        if (arg2 != 23307) {
            this.field3098 = 103;
        }
        field3088++;
        int var4 = arg1 >> 5;
        class97 var5 = this.field3107[var4];
        if (var5 == null) {
            this.field3101[var4] = arg0;
        } else {
            var5.field1286 = arg0;
        }
        this.field3107[var4] = arg0;
        arg0.field1284 = arg1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)V", line = 645)
    public static final void method1564(int arg0, int arg1) {
        if (arg0 >= -49) {
            method1552();
        }
        field3093++;
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        class538.field7580 = arg1;
        class345.field4326 = new class766[class384.field4906[class538.field7580] + 1];
        class413.field5388 = 0;
        class537.field7551 = 0;
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(II)V", line = 673)
    private final void method1565(int arg0, int arg1) {
        this.field3099 -= arg0;
        field3087++;
        if (this.field3099 < 0) {
            this.field3099 = 0;
        }
        if (arg1 <= 17) {
            this.method1565(46, -11);
        }
        if (this.field3078 != null) {
            this.field3078.method751(arg0);
        }
    }
}
