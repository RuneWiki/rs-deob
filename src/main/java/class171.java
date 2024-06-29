import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class171 extends class232 {

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field2944 = 0;

    @OriginalMember(owner = "client!ga", name = "Z", descriptor = "[[S")
    public static short[][] field2953 = new short[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10339, 10574, 10425, 10398, 10345, 7512, 8507, 7378, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 13753, 13737, 13719, 13883, 13863, 13974, 19643, 18601, 16532, 23993, 25121, 24980, 26944, 26921, 24854, 27191, 27171, 26130, 26941, 28696, 30100, 12477, 10407, 10388, 10685, 10665, 10646, 6711, 6693, 6674, 6965, 7073, 7056, 2361, 4387, 3346, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 24, 44, 64, 84, 104, 304, 678, 698, 550, 934, 954, 6448, 6946, 6966, 2352, 2726, 2746, 10544, 10918, 10938, 10304, 10550, 10570, 14640, 15014, 15034, 19760, 20134, 20154, -29392, -29018, -28998, 31024, 31270, 31290, -24272, -23898, -23878, -19152, -18778, -18758, -14032, -13658, -13638, -6864, -6490, -6470, 516, 536, 6788, 6808, 11012, 11032, 14980, 15000, 21124, 21144, -28924, -28904, -22012, -21992, -12924, -12904 } };

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "Lhi;")
    public static class82 field2963 = class95.method664((byte) -95, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Lam;")
    public static class277 field2945 = new class277();

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ga", name = "ab", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "Ljava/awt/Font;")
    public static Font field2950;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "[I")
    public static int[] field2965;

    @OriginalMember(owner = "client!ga", name = "bb", descriptor = "[Lbd;")
    private class28[] field2955;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "[Lwh;")
    public static class60[] field2952;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "[[Luk;")
    public static class108[][] field2949;

    @OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V", line = 15)
    public static final void method1207(int arg0) {
        field2961++;
        if (class309.field5277 > 0) {
            class222.method1571(0);
            return;
        }
        class324.field5571 = class66.field1036;
        class66.field1036 = null;
        if (arg0 < -69) {
            class292.method2014(28, 40);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 37)
    public static final Class method1208(String arg0, int arg1) throws ClassNotFoundException {
        field2959++;
        int var2 = -52 / ((-arg1 - 37) / 33);
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)[I", line = 76)
    public final int[] method80(int arg0, byte arg1) {
        field2958++;
        int[] var3 = this.field4008.method131((byte) -88, arg0);
        if (this.field4008.field256) {
            this.method1212(this.field4008.method134(127), 6062);
        }
        int var4 = 119 / ((-arg1 - 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "j", descriptor = "(I)Ljf;", line = 99)
    public static final class86 method1209(int arg0) {
        field2951++;
        int var1 = class42.field747[0] * class107.field1897[arg0];
        byte[] var2 = class260.field4453[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class142.field2427[class277.method1935(255, var2[var4])];
        }
        class86 var5;
        if (class147.field2485) {
            var5 = new class210(class285.field4793, class28.field381, class86.field1536[0], class20.field262[0], class107.field1897[0], class42.field747[0], var3);
        } else {
            var5 = new class303(class285.field4793, class28.field381, class86.field1536[0], class20.field262[0], class107.field1897[0], class42.field747[0], var3);
        }
        class3.method23(286013516);
        return var5;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[[I", line = 136)
    public final int[][] method146(int arg0, byte arg1) {
        if (arg1 != -82) {
            field2953 = (short[][]) ((short[][]) null);
        }
        field2960++;
        int[][] var3 = this.field3996.method136(0, arg0);
        if (this.field3996.field278) {
            int var4 = class54.field858;
            int var5 = class133.field2294;
            int[][][] var6 = this.field3996.method142((byte) -63);
            int[][] var7 = new int[var5][var4];
            this.method1212(var7, 6062);
            for (int var8 = 0; var8 < class133.field2294; var8++) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class54.field858; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class277.method1935(4080, var15 << 4);
                    var13[var14] = class277.method1935(var15 >> 4, 4080);
                    var11[var14] = class277.method1935(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V", line = 205)
    public static void method1210(boolean arg0) {
        field2950 = null;
        field2952 = null;
        field2953 = (short[][]) null;
        if (!arg0) {
            field2953 = (short[][]) ((short[][]) null);
        }
        field2949 = (class108[][]) null;
        field2963 = null;
        field2945 = null;
        field2965 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IBLbc;)V", line = 221)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        field2947++;
        if (arg1 != -19) {
            field2965 = (int[]) null;
        }
        if (arg0 == 0) {
            this.field2955 = new class28[arg2.method1082(-54)];
            for (int var4 = 0; var4 < this.field2955.length; var4++) {
                int var5 = arg2.method1082(-120);
                if (var5 == 0) {
                    this.field2955[var4] = class111.method771(arg2, 23388);
                } else if (var5 == 1) {
                    this.field2955[var4] = class73.method457(arg2, (byte) -84);
                } else if (var5 == 2) {
                    this.field2955[var4] = class105.method726(arg2, arg1 - 100);
                } else if (var5 == 3) {
                    this.field2955[var4] = class321.method2225((byte) -79, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field3990 = arg2.method1082(arg1 - 23) == 1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V", line = 294)
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIZ)V", line = 298)
    public static final void method1211(int arg0, int arg1, boolean arg2) {
        if (arg0 == 4 && !class126.field2220) {
            arg1 = 2;
            arg0 = 2;
        }
        if (arg2) {
            method1211(52, -28, false);
        }
        field2962++;
        if (class211.field3704 != arg0) {
            if (class193.field3276) {
                return;
            }
            if (class211.field3704 != 0) {
                class112.field2018[class211.field3704].method65();
            }
            if (arg0 != 0) {
                class115 var3 = class112.field2018[arg0];
                var3.method64();
                var3.method66(arg1);
            }
            class211.field3704 = arg0;
            class290.field4877 = arg1;
        } else if (arg0 != 0 && class290.field4877 != arg1) {
            class112.field2018[arg0].method66(arg1);
            class290.field4877 = arg1;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "([[II)V", line = 345)
    private final void method1212(int[][] arg0, int arg1) {
        field2957++;
        int var3 = class54.field858;
        int var4 = class133.field2294;
        class20.method135(arg0, 1);
        if (arg1 != 6062) {
            field2965 = (int[]) null;
        }
        class260.method1854(class209.field3684, 0, 0, class65.field1024, 9874);
        if (this.field2955 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field2955.length; var5++) {
            class28 var6 = this.field2955[var5];
            int var7 = var6.field370;
            int var8 = var6.field373;
            if (var8 >= 0) {
                if (var7 < 0) {
                    var6.method24(var4, var3, arg1 - 6062);
                } else {
                    var6.method22(var4, var3, arg1 ^ 0x178E);
                }
            } else if (var7 >= 0) {
                var6.method26(var4, var3, arg1 - 6062);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Ljava/awt/Color;IZILhi;)V", line = 393)
    public static final void method1213(Color arg0, int arg1, boolean arg2, int arg3, class82 arg4) {
        field2948++;
        try {
            Graphics var5 = class122.field2134.getGraphics();
            if (field2950 == null) {
                field2950 = new Font("Helvetica", 1, 13);
                class90.field1630 = class122.field2134.getFontMetrics(field2950);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class260.field4462, class180.field3078);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class199.field3413 == null) {
                    class199.field3413 = class122.field2134.createImage(304, 34);
                }
                Graphics var6 = class199.field3413.getGraphics();
                int var7 = 28 % ((-arg1 - 31) / 55);
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var6.setFont(field2950);
                var6.setColor(Color.white);
                arg4.method562(22, 0, var6, (304 - arg4.method569(class90.field1630, (byte) -108)) / 2);
                var5.drawImage(class199.field3413, class260.field4462 / 2 - 152, class180.field3078 / 2 + -18, (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = class180.field3078 / 2 - 18;
                int var10 = class260.field4462 / 2 - 152;
                var5.setColor(arg0);
                var5.drawRect(var10, var9, 303, 33);
                var5.fillRect(var10 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var10 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var10 + 2, var9 + 2, 300 - (arg3 * 3), 30);
                var5.setFont(field2950);
                var5.setColor(Color.white);
                arg4.method562(var9 + 22, 0, var5, var10 + (304 - arg4.method569(class90.field1630, (byte) -127)) / 2);
            }
            if (class305.field5179 != null) {
                var5.setFont(field2950);
                var5.setColor(Color.white);
                class305.field5179.method562(class180.field3078 / 2 - 26, 0, var5, class260.field4462 / 2 - (class305.field5179.method569(class90.field1630, (byte) -120) / 2));
            }
        } catch (Exception var13) {
            class122.field2134.repaint();
        }
    }
}
