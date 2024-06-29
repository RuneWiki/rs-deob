import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class296 {

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    private int field4140 = 0;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    private int field4152 = -1;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "Laq;")
    private class90 field4153 = new class90();

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "Z")
    public boolean field4154 = false;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "I")
    private int field4136;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    private int field4147;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "[Lp;")
    private class120[] field4142;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "[[[I")
    private int[][][] field4137;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field4151 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
    public static int[] field4148;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "[[I")
    public static int[][] field4138;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
    public static final void method1928(int arg0) {
        field4135++;
        if (arg0 != 20172) {
            method1931((byte) 82);
        }
        class35.field544.method900(arg0 - 20172);
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method1929(int arg0) {
        field4145++;
        for (int var2 = 0; var2 < this.field4136; var2++) {
            this.field4137[var2][0] = null;
            this.field4137[var2][1] = null;
            this.field4137[var2][2] = null;
            this.field4137[var2] = null;
        }
        if (arg0 < 119) {
            method1935(-7, (byte) 89, -78);
        }
        this.field4142 = null;
        this.field4137 = null;
        this.field4153.method644(false);
        this.field4153 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1930(int arg0, byte arg1) {
        if (arg1 < 83) {
            this.field4153 = null;
        }
        field4143++;
        if (this.field4147 == this.field4136) {
            this.field4154 = this.field4142[arg0] == null;
            this.field4142[arg0] = class54.field753;
            return this.field4137[arg0];
        } else if (this.field4136 == 1) {
            this.field4154 = this.field4152 != arg0;
            this.field4152 = arg0;
            return this.field4137[0];
        } else {
            class120 var3 = this.field4142[arg0];
            if (var3 == null) {
                this.field4154 = true;
                if (this.field4140 >= this.field4136) {
                    class120 var4 = (class120) this.field4153.method634((byte) 40);
                    var3 = new class120(arg0, var4.field1687);
                    this.field4142[var4.field1688] = null;
                    var4.method2467((byte) 77);
                } else {
                    var3 = new class120(arg0, this.field4140);
                    this.field4140++;
                }
                this.field4142[arg0] = var3;
            } else {
                this.field4154 = false;
            }
            this.field4153.method639(var3, true);
            return this.field4137[var3.field1687];
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V")
    public static void method1931(byte arg0) {
        field4138 = null;
        field4148 = null;
        if (arg0 >= -111) {
            method1933((byte) -56, -68, 38);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)[[[I")
    public final int[][][] method1932(int arg0) {
        field4144++;
        if (this.field4147 != this.field4136) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4136; var2++) {
            this.field4142[var2] = class54.field753;
        }
        if (arg0 >= -81) {
            this.field4154 = true;
        }
        return this.field4137;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)V")
    public static final void method1933(byte arg0, int arg1, int arg2) {
        field4149++;
        int var3 = class95.field1313.method2156(class80.field1143.method2763(arg0 ^ 0x70, class210.field2935), 60);
        for (class87 var4 = (class87) class121.field1699.method646(48); var4 != null; var4 = (class87) class121.field1699.method641(false)) {
            int var8 = class249.method1672(-1889368032, var4);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class90.field1260 * 16 + 21;
        int var6 = arg2 - (var3 / 2);
        if (class47.field661 < (var3 + var6)) {
            var6 = class47.field661 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (arg0 != -8) {
            method1933((byte) -84, -39, -15);
        }
        if (class214.field2993 < arg1 + var5) {
            var7 = class214.field2993 - var5;
        }
        class18.field330 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class432.field6101 = (class173.field2367 ? 26 : 22) + class90.field1260 * 16;
        class151.field2135 = var3;
        class271.field3762 = true;
        class211.field2952 = var7;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1934(int arg0, String arg1) {
        field4146++;
        if (arg1.equals("")) {
            return;
        }
        class46.field648.method1178(63, 200);
        class278.field3899++;
        class46.field648.method173(class273.method1782((byte) 25, arg1), 255);
        if (arg0 == -49) {
            class46.field648.method160(arg1, false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBI)I")
    public static final int method1935(int arg0, byte arg1, int arg2) {
        field4150++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (arg1 >= -85) {
                field4148 = null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(CI)Z")
    public static final boolean method1936(char arg0, int arg1) {
        field4141++;
        if (arg1 != -127) {
            field4151 = 89;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1937(byte arg0, Throwable arg1) throws IOException {
        field4139++;
        String var3;
        if (arg1 instanceof class135) {
            class135 var2 = (class135) arg1;
            arg1 = var2.field1968;
            var3 = var2.field1969 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        int var7 = 96 % ((arg0 + 16) / 57);
        BufferedReader var8 = new BufferedReader(new StringReader(var6));
        String var9 = var8.readLine();
        while (true) {
            String var10 = var8.readLine();
            if (var10 == null) {
                return var3 + "| " + var9;
            }
            int var11 = var10.indexOf(40);
            int var12 = var10.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var10;
            } else {
                var13 = var10.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var10.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var10.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(III)V")
    public class296(int arg0, int arg1, int arg2) {
        this.field4136 = arg0;
        this.field4147 = arg1;
        this.field4142 = new class120[this.field4147];
        this.field4137 = new int[this.field4136][3][arg2];
    }
}
