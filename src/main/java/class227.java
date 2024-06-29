import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public abstract class class227 extends class263 {

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "F")
    public float field2933;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public int field2931;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    private int field2932;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "I")
    public int field2936;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "I")
    private int field2927;

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "Lcga;")
    public static class449 field2922 = new class449(63, 4);

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "[[I")
    public static int[][] field2937 = new int[128][128];

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Ldr;")
    public static class675 field2935 = new class675(45, -1);

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Lxa;")
    public static class468 field2934;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)I")
    public final int method1367(int arg0) {
        int var2 = -18 % ((arg0 - 76) / 44);
        field2926++;
        return this.field2927;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)F")
    public final float method1368(int arg0) {
        field2921++;
        return arg0 == 128 ? this.field2933 : 0.79889834F;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
    public static void method1369(int arg0) {
        if (arg0 != 8) {
            field2939 = -43;
        }
        field2934 = null;
        field2922 = null;
        field2937 = null;
        field2935 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)I")
    public final int method1370(byte arg0) {
        field2924++;
        if (arg0 != -5) {
            field2937 = null;
        }
        return this.field2936;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([[BBLgo;)V")
    public static final void method1371(byte[][] arg0, byte arg1, class586 arg2) {
        field2923++;
        if (arg1 != -66) {
            field2935 = null;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        for (int var5 = 0; var5 < var4; var5++) {
            byte[] var10 = arg0[var5];
            if (var10 != null) {
                class572 var11 = new class572(var10);
                int var12 = class307.field3888[var5] >> 8;
                int var13 = class307.field3888[var5] & 0xFF;
                int var14 = var12 * 64 - field2938;
                int var15 = var13 * 64 - class522.field6612;
                class428.method2354(arg1 - 6265);
                arg2.method1115(field2938, var15, (byte) -115, class522.field6612, var14, var11, class634.field8601);
                arg2.method3254(var15, class309.field3898, 1775, var3, var14, var11);
                if (!arg2.field2240 && (class563.field7027 / 8) == var12 && (class677.field9229 / 8) == var13 && var3[0] != -1) {
                    class613.field8337 = class7.field77.method1040(var3[1], (byte) -91, class671.field9178, var3[2], var3[0], var3[3]);
                    class289.field3654 = var3[4];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class307.field3888[var6] >> 8) * 64 - field2938;
            int var8 = (class307.field3888[var6] & 0xFF) * 64 - class522.field6612;
            byte[] var9 = arg0[var6];
            if (var9 == null && class677.field9229 < 800) {
                class428.method2354(-6331);
                arg2.method1113(var7, var8, 64, -30728, 64);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)I")
    public final int method1372(int arg0) {
        if (arg0 <= 122) {
            return 70;
        } else {
            field2925++;
            return this.field2932;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(FZ)V")
    public abstract void method118(float arg0, boolean arg1);

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIII)V")
    public abstract void method116(byte arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)I")
    public final int method1373(byte arg0) {
        field2928++;
        int var2 = 16 / ((arg0 + 5) / 34);
        return this.field2931;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(B)I")
    public final int method1374(byte arg0) {
        field2930++;
        if (arg0 <= 21) {
            this.method116((byte) -122, -73, -60, -92);
        }
        return this.field2929;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIF)V")
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field2933 = arg5;
        this.field2931 = arg1;
        this.field2932 = arg4;
        this.field2929 = arg0;
        this.field2936 = arg2;
        this.field2927 = arg3;
    }
}
