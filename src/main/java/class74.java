import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class74 {

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    private int field1122 = 0;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    private int field1117 = 0;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    private int field1126 = 128;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    private int field1123 = 128;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Z")
    public boolean field1130 = false;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public int field1135 = -1;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "Z")
    public boolean field1124 = false;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    private int field1133 = 0;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "[[[I")
    public static int[][][] field1131 = new int[2][][];

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field1118 = 0;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "Lok;")
    public static class160 field1136 = new class160(16);

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "[Lpf;")
    public static class92[] field1140 = new class92[2048];

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "F")
    public static float field1142;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "F")
    public static float field1143;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    private int field1128;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public int field1134;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Lpk;")
    public static class120 field1138;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Lwd;")
    public static class88 field1141;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[S")
    private short[] field1127;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "[S")
    private short[] field1129;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "[S")
    private short[] field1139;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "[S")
    private short[] field1144;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIBI)Lie;", line = 9)
    public final class94 method586(int arg0, int arg1, byte arg2, int arg3) {
        class94 var5 = (class94) class274.field4290.method2288((long) this.field1134, (byte) 88);
        field1132++;
        if (var5 == null) {
            class7 var6 = class7.method130(class218.field3393, this.field1128, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1139 != null) {
                for (int var7 = 0; var7 < this.field1139.length; var7++) {
                    var6.method128(this.field1139[var7], this.field1144[var7]);
                }
            }
            if (this.field1129 != null) {
                for (int var8 = 0; var8 < this.field1129.length; var8++) {
                    var6.method107(this.field1129[var8], this.field1127[var8]);
                }
            }
            var5 = var6.method121(this.field1117 + 64, this.field1133 + 850, -30, -50, -30);
            class274.field4290.method2281(0, (long) this.field1134, var5);
        }
        class94 var9;
        if (this.field1135 == -1 || arg0 == -1) {
            var9 = var5.method764(true, true, true);
        } else {
            var9 = class63.method503(this.field1135, (byte) 71).method339(arg3, arg0, arg1, (byte) 78, var5);
        }
        int var10 = -77 % ((-arg2 - 10) / 63);
        if (this.field1123 != 128 || this.field1126 != 128) {
            var9.method761(this.field1123, this.field1126, this.field1123);
        }
        if (this.field1122 != 0) {
            if (this.field1122 == 90) {
                var9.method748();
            }
            if (this.field1122 == 180) {
                var9.method749();
            }
            if (this.field1122 == 270) {
                var9.method747();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILaj;B)V", line = 84)
    private final void method587(int arg0, class1 arg1, byte arg2) {
        if (arg2 >= -118) {
            method590(47);
        }
        field1125++;
        if (arg0 == 1) {
            this.field1128 = arg1.method56(19612);
        } else if (arg0 == 2) {
            this.field1135 = arg1.method56(19612);
        } else if (arg0 == 4) {
            this.field1123 = arg1.method56(19612);
        } else if (arg0 == 5) {
            this.field1126 = arg1.method56(19612);
        } else if (arg0 == 6) {
            this.field1122 = arg1.method56(19612);
        } else if (arg0 == 7) {
            this.field1117 = arg1.method15((byte) 120);
        } else if (arg0 == 8) {
            this.field1133 = arg1.method15((byte) -49);
        } else if (arg0 == 9) {
            this.field1130 = true;
        } else if (arg0 == 10) {
            this.field1124 = true;
        } else if (arg0 == 40) {
            int var6 = arg1.method15((byte) -127);
            this.field1139 = new short[var6];
            this.field1144 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1139[var7] = (short) arg1.method56(19612);
                this.field1144[var7] = (short) arg1.method56(19612);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method15((byte) 121);
            this.field1129 = new short[var4];
            this.field1127 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1129[var5] = (short) arg1.method56(19612);
                this.field1127[var5] = (short) arg1.method56(19612);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 173)
    public static void method588(byte arg0) {
        field1141 = null;
        field1140 = null;
        field1138 = null;
        field1136 = null;
        field1131 = (int[][][]) null;
        int var1 = -25 % ((-arg0 - 46) / 54);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILaj;)V", line = 212)
    public final void method589(int arg0, class1 arg1) {
        if (arg0 != -1) {
            this.method589(-119, (class1) null);
        }
        field1121++;
        while (true) {
            int var3 = arg1.method15((byte) -94);
            if (var3 == 0) {
                return;
            }
            this.method587(var3, arg1, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 247)
    public static final void method590(int arg0) {
        field1120++;
        int var1 = 49 / ((-arg0 - 20) / 47);
        class66.method530((byte) -118, false);
        System.gc();
        class117.method921((byte) 117, 25);
    }
}
