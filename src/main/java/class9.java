import java.awt.Component;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ah")
public class class9 {

    @OriginalMember(owner = "ah", name = "y", descriptor = "I")
    private int field144 = 32;

    @OriginalMember(owner = "ah", name = "r", descriptor = "J")
    private long field137 = class123.method880(false);

    @OriginalMember(owner = "ah", name = "B", descriptor = "[Lkc;")
    private class97[] field147 = new class97[8];

    @OriginalMember(owner = "ah", name = "F", descriptor = "Z")
    private boolean field150 = true;

    @OriginalMember(owner = "ah", name = "A", descriptor = "I")
    private int field146 = 0;

    @OriginalMember(owner = "ah", name = "E", descriptor = "J")
    private long field149 = 0L;

    @OriginalMember(owner = "ah", name = "C", descriptor = "I")
    private int field148 = 0;

    @OriginalMember(owner = "ah", name = "K", descriptor = "I")
    private int field155 = 0;

    @OriginalMember(owner = "ah", name = "L", descriptor = "[Lkc;")
    private class97[] field156 = new class97[8];

    @OriginalMember(owner = "ah", name = "I", descriptor = "I")
    private int field153 = 0;

    @OriginalMember(owner = "ah", name = "M", descriptor = "J")
    private long field157 = 0L;

    @OriginalMember(owner = "ah", name = "i", descriptor = "I")
    public static int field128 = 0;

    @OriginalMember(owner = "ah", name = "f", descriptor = "Llf;")
    public static class109 field125 = class35.method275("auf einer freien Welt zu spielen)3", 2);

    @OriginalMember(owner = "ah", name = "j", descriptor = "[I")
    public static int[] field129 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "ah", name = "w", descriptor = "I")
    public static int field142 = -1;

    @OriginalMember(owner = "ah", name = "a", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "ah", name = "b", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "ah", name = "c", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "ah", name = "e", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "ah", name = "h", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "ah", name = "k", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "ah", name = "l", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "ah", name = "m", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "ah", name = "n", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "ah", name = "p", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "ah", name = "s", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "ah", name = "t", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "ah", name = "u", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "ah", name = "v", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "ah", name = "x", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "ah", name = "z", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "ah", name = "G", descriptor = "I")
    public int field151;

    @OriginalMember(owner = "ah", name = "H", descriptor = "I")
    private int field152;

    @OriginalMember(owner = "ah", name = "J", descriptor = "I")
    public int field154;

    @OriginalMember(owner = "ah", name = "g", descriptor = "Lbg;")
    public static class18 field126;

    @OriginalMember(owner = "ah", name = "o", descriptor = "Lkc;")
    private class97 field134;

    @OriginalMember(owner = "ah", name = "q", descriptor = "[I")
    public int[] field136;

    @OriginalMember(owner = "ah", name = "d", descriptor = "[[[B")
    public static byte[][][] field123;

    @OriginalMember(owner = "ah", name = "a", descriptor = "(I)V")
    public final void method40(int arg0) {
        this.field150 = true;
        field122++;
        if (arg0 != 8) {
            method48((byte) 38, null);
        }
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "()I")
    public int method41() throws Exception {
        field131++;
        return this.field154;
    }

    @OriginalMember(owner = "ah", name = "b", descriptor = "(I)V")
    public void method42(int arg0) throws Exception {
        field120++;
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method43(String arg0, int arg1, Throwable arg2) {
        if (arg1 >= -34) {
            return;
        }
        field121++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class209.method1364((byte) -113, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class102.field2023.field2001 != null) {
                class32 var8 = class102.field2023.method699(new URL(class102.field2023.field2001.getCodeBase(), "clienterror.ws?c=" + class5.field73 + "&u=" + class203.field3998 + "&v1=" + class99.field1995 + "&v2=" + class99.field2000 + "&e=" + var7), -896798992);
                while (var8.field746 == 0) {
                    class54.method354(1L, -65);
                }
                if (var8.field746 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field748;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "(B)V")
    public final synchronized void method44(byte arg0) {
        this.field150 = true;
        try {
            this.method53();
        } catch (Exception var3) {
            this.method46();
            this.field157 = class123.method880(false) + 2000L;
        }
        int var2 = -72 / ((arg0 - 79) / 36);
        field143++;
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "(BLkc;I)V")
    private final void method45(byte arg0, class97 arg1, int arg2) {
        field141++;
        if (arg0 > -19) {
            return;
        }
        int var4 = arg2 >> 5;
        class97 var5 = this.field156[var4];
        if (var5 == null) {
            this.field147[var4] = arg1;
        } else {
            var5.field1962 = arg1;
        }
        this.field156[var4] = arg1;
        arg1.field1964 = arg2;
    }

    @OriginalMember(owner = "ah", name = "b", descriptor = "()V")
    public void method46() {
        field140++;
    }

    @OriginalMember(owner = "ah", name = "c", descriptor = "(I)V")
    public final synchronized void method47(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field145++;
        if (this.field136 == null) {
            return;
        }
        long var2 = class123.method880(false);
        try {
            if (this.field157 != 0L) {
                if (this.field157 > var2) {
                    return;
                }
                this.method42(this.field154);
                this.field150 = true;
                this.field157 = 0L;
            }
            int var4 = this.method41();
            if (this.field153 - var4 > this.field148) {
                this.field148 = this.field153 - var4;
            }
            int var5 = this.field152 + this.field151;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field154) {
                this.field154 += 1024;
                var4 = 0;
                if (this.field154 > 16384) {
                    this.field154 = 16384;
                }
                this.method46();
                this.method42(this.field154);
                if (var5 + 256 > this.field154) {
                    var5 = this.field154 - 256;
                    this.field152 = var5 - this.field151;
                }
                this.field150 = true;
            }
            while (var4 < var5) {
                this.method55(this.field136, 256);
                this.method51();
                var4 += 256;
            }
            if (this.field149 < var2) {
                if (this.field150) {
                    this.field150 = false;
                } else if (this.field148 == 0 && this.field155 == 0) {
                    this.method46();
                    this.field157 = var2 + 2000L;
                    return;
                } else {
                    this.field152 = Math.min(this.field155, this.field148);
                    this.field155 = this.field148;
                }
                this.field149 = var2 + 2000L;
                this.field148 = 0;
            }
            this.field153 = var4;
        } catch (Exception var7) {
            this.method46();
            this.field157 = var2 + 2000L;
        }
        try {
            if (this.field137 + 500000L < var2) {
                var2 = this.field137;
            }
            while (var2 > this.field137 + 5000L) {
                this.method52(256, (byte) 110);
                this.field137 += 256000 / class23.field519;
            }
        } catch (Exception var6) {
            this.field137 = var2;
        }
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "(B[[I)V")
    public static final void method48(byte arg0, int[][] arg1) {
        if (arg0 <= 14) {
            field125 = null;
        }
        field132++;
    }

    @OriginalMember(owner = "ah", name = "d", descriptor = "(I)V")
    public static void method49(int arg0) {
        field129 = null;
        if (arg0 != 16128) {
            method43(null, -17, null);
        }
        field126 = null;
        field123 = null;
        field125 = null;
    }

    @OriginalMember(owner = "ah", name = "e", descriptor = "(I)V")
    public final synchronized void method50(int arg0) {
        field130++;
        if (class200.field3955 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class200.field3955.field1346[var3] == this) {
                    class200.field3955.field1346[var3] = null;
                }
                if (class200.field3955.field1346[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class200.field3955.field1337 = true;
                while (class200.field3955.field1334) {
                    class54.method354(50L, 69);
                }
                class200.field3955 = null;
            }
        }
        if (arg0 == 2) {
            this.method46();
            this.field136 = null;
        }
    }

    @OriginalMember(owner = "ah", name = "c", descriptor = "()V")
    public void method51() throws Exception {
        field133++;
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "(IB)V")
    private final void method52(int arg0, byte arg1) {
        field138++;
        this.field146 -= arg0;
        if (this.field146 < 0) {
            this.field146 = 0;
        }
        if (this.field134 != null) {
            this.field134.method622(arg0);
        }
        int var3 = -99 / ((-arg1 - 39) / 39);
    }

    @OriginalMember(owner = "ah", name = "d", descriptor = "()V")
    public void method53() throws Exception {
        field135++;
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method54(Component arg0) throws Exception {
        field127++;
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "([II)V")
    private final void method55(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class169.field3133) {
            var3 = arg1 << 1;
        }
        class122.method876(arg0, 0, var3);
        this.field146 -= arg1;
        if (this.field134 != null && this.field146 <= 0) {
            this.field146 += class23.field519 >> 4;
            class90.method663(this.field134, true);
            this.method45((byte) -46, this.field134, this.field134.method623());
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
                        class97 var11 = this.field147[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class25 var12 = var11.field1963;
                                if (var12 == null || var12.field548 <= var8) {
                                    var11.field1961 = true;
                                    int var13 = var11.method650();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field548 += var13;
                                    }
                                    if (var4 >= this.field144) {
                                        break label107;
                                    }
                                    class97 var14 = var11.method613();
                                    if (var14 != null) {
                                        int var15 = var11.field1964;
                                        while (var14 != null) {
                                            this.method45((byte) -112, var14, var15 * var14.method623() >> 8);
                                            var14 = var11.method630();
                                        }
                                    }
                                    class97 var16 = var11.field1962;
                                    var11.field1962 = null;
                                    if (var10 == null) {
                                        this.field147[var7] = var16;
                                    } else {
                                        var10.field1962 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field156[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field1962;
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
                class97 var18 = this.field147[var17];
                this.field147[var17] = this.field156[var17] = null;
                while (var18 != null) {
                    class97 var19 = var18.field1962;
                    var18.field1962 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field146 < 0) {
            this.field146 = 0;
        }
        if (this.field134 != null) {
            this.field134.method620(arg0, 0, arg1);
        }
        this.field137 = class123.method880(false);
    }

    @OriginalMember(owner = "ah", name = "a", descriptor = "(ILkc;)V")
    public final synchronized void method56(int arg0, class97 arg1) {
        this.field134 = arg1;
        if (arg0 != -28922) {
            this.field137 = -60L;
        }
        field124++;
    }

    @OriginalMember(owner = "ah", name = "f", descriptor = "(I)V")
    public static final void method57(int arg0) {
        field139++;
        int var1 = -99 / ((-arg0 - 81) / 41);
        for (class60 var2 = (class60) class113.field2236.method338((byte) 111); var2 != null; var2 = (class60) class113.field2236.method335(1)) {
            int var3 = var2.field1174;
            if (class185.method1253(false, var3)) {
                boolean var4 = true;
                class200[] var5 = class169.field3146[var3];
                for (int var6 = 0; var6 < var5.length; var6++) {
                    if (var5[var6] != null) {
                        var4 = var5[var6].field3946;
                        break;
                    }
                }
                if (!var4) {
                    int var7 = (int) var2.field1381;
                    class200 var8 = class158.method1078(var7, (byte) 127);
                    if (var8 != null) {
                        class115.method851(var8, -23101);
                    }
                }
            }
        }
    }
}
