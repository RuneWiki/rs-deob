import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class222 extends class259 {

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "Lhi;")
    public static class323 field3358 = null;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "I")
    public static int field3360 = 0;

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field3357 = new String[500];

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3353;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "Ljava/lang/String;")
    public String field3369;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "Z")
    public static boolean field3355;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "[C")
    public char[] field3356;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "[C")
    public char[] field3368;

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "[I")
    public int[] field3361;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "[I")
    public int[] field3367;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Llf;B)V", line = 11)
    public final void method1549(class143 arg0, byte arg1) {
        field3372++;
        if (arg1 <= 22) {
            field3358 = (class323) null;
        }
        while (true) {
            int var3 = arg0.method1043(true);
            if (var3 == 0) {
                return;
            }
            this.method1557(var3, arg0, -3);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(JB)V", line = 39)
    public static final void method1550(long arg0, byte arg1) {
        class328.field5282.field2295 = 0;
        if (arg1 > -31) {
            return;
        }
        field3365++;
        class328.field5282.method1055(21, 126);
        class328.field5282.method1039(arg0, (byte) 88);
        class212.field3217 = 0;
        class285.field4527 = -3;
        class148.field2354 = 1;
        class172.field2609 = 0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)V", line = 62)
    public static void method1551(boolean arg0) {
        field3357 = null;
        if (!arg0) {
            field3353 = (FontMetrics) null;
        }
        field3358 = null;
        field3353 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(CI)I", line = 74)
    public final int method1552(char arg0, int arg1) {
        if (arg1 != -1) {
            return -115;
        }
        field3354++;
        if (this.field3367 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3367.length; var3++) {
            if (this.field3356[var3] == arg0) {
                return this.field3367[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 99)
    public static final void method1553(int arg0, Object[] arg1, long[] arg2) {
        class142.method993(arg1, 0, arg0 - 14017, arg2, arg2.length - 1);
        field3370++;
        if (arg0 != 0) {
            method1554(-113, -22);
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(II)Ljava/lang/String;", line = 124)
    public static final String method1554(int arg0, int arg1) {
        field3364++;
        int var2 = -45 % ((-arg0 - 62) / 38);
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFEB31) >> 16) + "." + (arg1 >> 8 & 0xFF) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V", line = 137)
    public final void method1555(byte arg0) {
        field3371++;
        if (this.field3367 != null) {
            for (int var2 = 0; var2 < this.field3367.length; var2++) {
                this.field3367[var2] = class77.method492(this.field3367[var2], 32768);
            }
        }
        if (arg0 != 17) {
            field3358 = (class323) null;
        }
        if (this.field3361 != null) {
            for (int var3 = 0; var3 < this.field3361.length; var3++) {
                this.field3361[var3] = class77.method492(this.field3361[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(CB)I", line = 167)
    public final int method1556(char arg0, byte arg1) {
        field3366++;
        if (arg1 != 46) {
            field3359 = 66;
        }
        if (this.field3361 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3361.length; var3++) {
            if (this.field3368[var3] == arg0) {
                return this.field3361[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILlf;I)V", line = 197)
    private final void method1557(int arg0, class143 arg1, int arg2) {
        field3363++;
        if (arg2 != -3) {
            return;
        }
        if (arg0 == 1) {
            this.field3369 = arg1.method1040((byte) -128);
        } else if (arg0 == 2) {
            int var4 = arg1.method1043(true);
            this.field3361 = new int[var4];
            this.field3368 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3361[var5] = arg1.method1051(1);
                byte var6 = arg1.method1028(79030408);
                this.field3368[var5] = var6 == 0 ? 0 : class308.method2172(true, var6);
            }
        } else if (arg0 == 3) {
            int var7 = arg1.method1043(true);
            this.field3367 = new int[var7];
            this.field3356 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3367[var8] = arg1.method1051(1);
                byte var9 = arg1.method1028(79030408);
                this.field3356[var8] = var9 == 0 ? 0 : class308.method2172(true, var9);
            }
        } else if (arg0 == 4) {
        }
    }
}
