import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class45 extends class120 {

    @OriginalMember(owner = "client!rm", name = "ab", descriptor = "Z")
    private boolean field710 = true;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    private int field705 = 4096;

    @OriginalMember(owner = "client!rm", name = "db", descriptor = "[Lfm;")
    public static class94[] field713 = new class94[27];

    @OriginalMember(owner = "client!rm", name = "eb", descriptor = "Lok;")
    public static class41 field714 = class137.method956("hint_mapmarkers", 45);

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!rm", name = "Y", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!rm", name = "cb", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!rm", name = "Z", descriptor = "J")
    public static long field709;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "Lmh;")
    public static class65 field706;

    @OriginalMember(owner = "client!rm", name = "bb", descriptor = "Lmh;")
    public static class65 field711;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Llb;II)V", line = 9)
    public final void method30(class112 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.field710 = false;
        }
        if (arg2 == 0) {
            this.field705 = arg0.method759((byte) -120);
        } else if (arg2 == 1) {
            this.field710 = arg0.method792(2) == 1;
        }
        field703++;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(II)V", line = 44)
    public static final void method328(int arg0, int arg1) {
        class151.field2344.method138(arg1, 0);
        field708++;
        if (arg0 != -2) {
            method328(91, 50);
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 87)
    public class45() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(IZ)I", line = 91)
    public static final int method329(int arg0, boolean arg1) {
        field712++;
        if (!arg1) {
            method328(60, 10);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(IZ)[[I", line = 107)
    public final int[][] method168(int arg0, boolean arg1) {
        field704++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[] var4 = this.method854(0, arg0 - 1 & class27.field410, -24059);
            int[] var5 = this.method854(0, arg0, -24059);
            int[] var6 = this.method854(0, class27.field410 & arg0 + 1, -24059);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class307.field5160; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field705;
                int var12 = (var5[class51.field776 & var10 + 1] - var5[class51.field776 & var10 - 1]) * this.field705;
                int var13 = var12 >> 12;
                int var14 = var13 * var13 >> 12;
                int var15 = var11 >> 12;
                int var16 = var15 * var15 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var16 + var14 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = 16777216 / var17;
                    var19 = var12 / var17;
                    var18 = var11 / var17;
                }
                if (this.field710) {
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var18;
                var9[var10] = var20;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "(B)V", line = 182)
    public static void method330(byte arg0) {
        field713 = null;
        field711 = null;
        field714 = null;
        field706 = null;
        if (arg0 != 72) {
            method330((byte) 97);
        }
    }
}
