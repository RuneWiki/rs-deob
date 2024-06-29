import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class250 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "Z")
    public boolean field4319 = true;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public int field4324;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public int field4333;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
    public int field4332;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public int field4318;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public int field4327;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public int field4322;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "[J")
    public static long[] field4317 = new long[200];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Luc;")
    public static class11 field4316 = new class11(32);

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "[I")
    public static int[] field4331 = new int[50];

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lmb;")
    public static class96 field4328 = class243.method1708("Sprites geladen)3", (byte) 94);

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "Lmb;")
    public static class96 field4334 = class243.method1708("0", (byte) 123);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lpi;")
    public static class182 field4329;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lmb;")
    public static class96 field4321;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "[Lrf;")
    public static class30[] field4323;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method1745(byte arg0) {
        class24.field405.method83(0);
        if (arg0 >= -36) {
            field4323 = null;
        }
        field4325++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static void method1746(byte arg0) {
        field4328 = null;
        field4316 = null;
        field4323 = null;
        field4331 = null;
        field4321 = null;
        if (arg0 >= -109) {
            field4328 = null;
        }
        field4329 = null;
        field4334 = null;
        field4317 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIBII)V")
    public static final void method1747(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var9 = arg1 + 1;
        class36.method283(arg4, class229.field3939[arg1], arg2, (byte) -120, arg5);
        int var8 = arg0 - 1;
        class36.method283(arg4, class229.field3939[arg0], arg2, (byte) -62, arg5);
        field4320++;
        if (arg3 <= 117) {
            method1747(114, 75, 17, (byte) -6, 58, 33);
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class229.field3939[var6];
            var7[arg4] = var7[arg2] = arg5;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4324 = arg2;
        this.field4333 = arg0;
        this.field4332 = arg1;
        this.field4318 = arg5;
        this.field4319 = arg6;
        this.field4327 = arg4;
        this.field4322 = arg3;
    }
}
