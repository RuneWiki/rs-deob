import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class188 {

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public int field2940 = 16777215;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public int field2942 = 8;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2943;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Lvv;")
    public static class313 field2945;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public int field2935;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field2949;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "Lok;")
    public static class172 field2937;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Z")
    public boolean field2941;

    static {
        new class306("Ok", "Okay", "OK", "Ok");
        field2943 = new String[100];
        field2946 = 0;
        field2945 = new class313(40, 8);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lia;I)V", line = 5)
    public final void method1273(class23 arg0, int arg1) {
        if (arg1 != -1) {
            method1275(-46);
        }
        while (true) {
            int var3 = arg0.method126((byte) -114);
            if (var3 == 0) {
                field2944++;
                return;
            }
            this.method1274(101, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILia;)V", line = 33)
    private final void method1274(int arg0, int arg1, class23 arg2) {
        if (arg0 <= 78) {
            this.field2936 = -92;
        }
        if (arg1 == 1) {
            this.field2942 = arg2.method132(40);
        } else if (arg1 == 2) {
            this.field2941 = true;
        } else if (arg1 == 3) {
            this.field2935 = arg2.method170(492756037);
            this.field2939 = arg2.method170(492756037);
            this.field2950 = arg2.method170(492756037);
        } else if (arg1 == 4) {
            this.field2949 = arg2.method126((byte) -118);
        } else if (arg1 == 5) {
            this.field2936 = arg2.method132(89);
        } else if (arg1 == 6) {
            this.field2940 = arg2.method181(102);
        }
        field2947++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 80)
    public static void method1275(int arg0) {
        field2943 = null;
        field2937 = null;
        if (arg0 != 3) {
            method1275(61);
        }
        field2945 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[B[BII[[BI[I[I)I", line = 93)
    public static final int method1276(byte[][] arg0, byte[] arg1, int arg2, int arg3, byte[][] arg4, int arg5, int[] arg6, int[] arg7) {
        field2938++;
        int var8 = arg6[arg3];
        int var9 = var8 + arg7[arg3];
        int var10 = arg6[arg2];
        int var11 = var10 + arg7[arg2];
        int var12 = var8;
        if (arg5 != 8) {
            method1276(null, null, 63, -73, null, -64, null, null);
        }
        if (var8 < var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = arg1[arg3] & 0xFF;
        if ((arg1[arg2] & 0xFF) < var14) {
            var14 = arg1[arg2] & 0xFF;
        }
        byte[] var15 = arg4[arg3];
        byte[] var16 = arg0[arg2];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }
}
