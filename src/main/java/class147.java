import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class147 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public int field2185 = 0;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "[I")
    public static int[] field2188 = new int[32];

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "Z")
    public static boolean field2191 = false;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "Z")
    public static boolean field2187 = false;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static void method999(int arg0) {
        if (arg0 == 64) {
            field2188 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lim;BI)V")
    private final void method1000(class170 arg0, byte arg1, int arg2) {
        field2190++;
        if (arg2 == 5) {
            this.field2185 = arg0.method1186((byte) -125);
        }
        if (arg1 < 60) {
            method999(21);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLim;)V")
    public final void method1001(byte arg0, class170 arg1) {
        field2186++;
        while (true) {
            int var3 = arg1.method1218(-78);
            if (var3 == 0) {
                if (arg0 == 3) {
                    return;
                } else {
                    this.method1000((class170) null, (byte) -99, 43);
                    return;
                }
            }
            this.method1000(arg1, (byte) 105, var3);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZB)V")
    public static final void method1002(boolean arg0, byte arg1) {
        field2192++;
        byte[][] var2 = class129.field1840;
        byte var3 = 4;
        int var4 = var2.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var2[var5];
            int var13 = class250.field4072[var5] >> 8;
            int var14 = class250.field4072[var5] & 0xFF;
            int var15 = var13 * 64 - class113.field1653;
            int var16 = var14 * 64 - class5.field77;
            if (var12 != null) {
                class31.method163(-11565);
                var11 = class300.method2019(class312.field4997, var16, var15, arg0, 0, class5.field77, var12, class113.field1653);
            }
            if (!arg0 && class97.field1464 / 8 == var13 && class22.field288 / 8 == var14) {
                if (var11 == null) {
                    class277.field4537 = -1;
                } else {
                    class277.field4537 = var11[0];
                    class84.field1300 = var11[3];
                    class23.field296 = var11[2];
                    class237.field3807 = var11[4];
                    class64.field927 = var11[1];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class250.field4072[var6] & 0xFF) * 64 - class5.field77;
            int var8 = (class250.field4072[var6] >> 8) * 64 - class113.field1653;
            byte[] var9 = var2[var6];
            if (var9 == null && class22.field288 < 800) {
                class31.method163(arg1 ^ 0xFFFFD2A9);
                for (int var10 = 0; var10 < var3; var10++) {
                    class9.method51(64, false, var7, var8, var10, 64);
                }
            }
        }
        if (arg1 != 122) {
            field2187 = true;
        }
    }
}
