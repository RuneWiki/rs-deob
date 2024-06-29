import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class83 extends class554 {

    @OriginalMember(owner = "client!ns", name = "x", descriptor = "Lph;")
    private class442 field1131;

    @OriginalMember(owner = "client!ns", name = "s", descriptor = "Lpv;")
    private class64 field1126;

    @OriginalMember(owner = "client!ns", name = "r", descriptor = "Lob;")
    private class385 field1125;

    @OriginalMember(owner = "client!ns", name = "q", descriptor = "Lim;")
    public static class353 field1124 = new class353(72, 12);

    @OriginalMember(owner = "client!ns", name = "A", descriptor = "I")
    public static int field1134 = 0;

    @OriginalMember(owner = "client!ns", name = "B", descriptor = "[F")
    public static float[] field1135 = new float[4];

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ns", name = "n", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ns", name = "o", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ns", name = "p", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ns", name = "t", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!ns", name = "u", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ns", name = "v", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ns", name = "w", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!ns", name = "y", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ns", name = "z", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        if (!arg0) {
            this.method467(-97);
        }
        ++field1128;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V")
    public static void method465(int arg0) {
        if (arg0 <= 33) {
            method469((byte) -99, -61, -5);
        }
        field1135 = null;
        field1124 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field1125.field5364);
        ++field1133;
        OpenGL.glEnable(34336);
        if (arg0 != 61) {
            method469((byte) -33, 32, -16);
        }
        super.field7743.method3300(true, 0, class17.field173);
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        ++field1132;
        if (arg0 != 4096) {
            field1134 = 121;
        }
        return this.field1125 != null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZII)Z")
    public static final boolean method468(boolean arg0, int arg1, int arg2) {
        ++field1123;
        if (!arg0) {
            field1134 = 22;
        }
        return ~(arg1 & 544) == -545 | (arg1 & 24) != 0;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "(Lph;Lkr;Lpv;)V")
    public class83(class442 arg0, class329 arg1, class64 arg2) {
        super(arg0);
        this.field1131 = arg0;
        this.field1126 = arg2;
        if (this.field1126.method370((byte) -25) && this.field1131.field6103) {
            this.field1125 = class225.method1431(this.field1131, (byte) 114, arg1.method2045("transparent_water", (byte) -22, "gl"), 34336);
        } else {
            this.field1125 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(BII)I")
    public static final int method469(byte arg0, int arg1, int arg2) {
        ++field1122;
        if (arg2 > arg1) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        if (arg0 != 41) {
            field1135 = null;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        super.field7743.method3300(true, 0, class93.field1233);
        if (arg0 == 4096) {
            ++field1120;
            OpenGL.glBindProgramARB(34336, 0);
            OpenGL.glDisable(34820);
            OpenGL.glDisable(34336);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        super.field7743.method3316(class509.field7093, -93, class505.field7041);
        ++field1127;
        if (arg1 < 74) {
            this.method470(107);
        }
    }

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)V")
    public static final void method472(int arg0) {
        ++field1121;
        int var1 = class627.field9135.length;
        for (int var2 = 0; var1 > var2; ++var2) {
            if (class627.field9135[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class522.field7278; ++var5) {
                    if (~class508.field7080[var5] == ~class258.field3206[var2]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class508.field7080[class522.field7278] = class258.field3206[var2];
                    var4 = class522.field7278++;
                }
                class551 var6 = new class551(class627.field9135[var2]);
                int var7 = 0;
                while (~class627.field9135[var2].length < ~var6.field7707 && ~var7 > -512 && ~class551.field7652 > -1024) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method3090(-88);
                    int var10 = var9 >> 14;
                    int var11 = 63 & var9 >> 7;
                    int var12 = var9 & 63;
                    int var13 = (class258.field3206[var2] >> 8) * 64 + -class525.field7310 + var11;
                    int var14 = (class258.field3206[var2] & 255) * 64 - class58.field786 - -var12;
                    class626 var15 = class579.field8053.method3623(var6.method3090(-80), (byte) 80);
                    class480 var16 = (class480) class131.field1619.method3476((long) var8, (byte) 28);
                    if (var16 == null && ~(1 & var15.field9051) < -1 && class475.field6698 == var10 && var13 >= 0 && class139.field1760 > var13 - -var15.field9094 && var14 >= 0 && var14 - -var15.field9094 < class369.field5135) {
                        class585 var17 = new class585();
                        var17.field366 = var8;
                        class480 var18 = new class480(var17);
                        class131.field1619.method3475(-110, var18, (long) var8);
                        class179.field2310[class604.field8710++] = var18;
                        class286.field3739[class551.field7652++] = var8;
                        var17.field372 = class7.field61;
                        var17.method3374(-117, var15);
                        var17.method137(var17.field8478.field9094, 111);
                        var17.field334 = var17.field8478.field9080 << 3;
                        var17.method131(true, var17.field8478.field9123 + 4 << 11 & 15640, true);
                        var17.method3380(var13, var14, 0, true, var17.method104((byte) -92), var10);
                    }
                }
            }
        }
        int var3 = -11 % ((-32 - arg0) / 48);
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field1125 = null;
        }
        ++field1130;
        if (this.field1126.field869) {
            float var4 = (float) (super.field7743.field8378 % 4000) / 4000.0F;
            super.field7743.method3344(29639, this.field1126.field867);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field7743.field8378 % 4000 * 16 / 4000;
            super.field7743.method3344(29639, this.field1126.field864[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(B)I")
    public static final int method474(byte arg0) {
        ++field1129;
        if (arg0 > -21) {
            method468(false, -51, 25);
        }
        return class21.field306;
    }
}
