import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class409 extends class145 {

    @OriginalMember(owner = "client!ht", name = "Db", descriptor = "I")
    public static int field6135 = 0;

    @OriginalMember(owner = "client!ht", name = "Eb", descriptor = "[I")
    public static int[] field6136 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ht", name = "Bb", descriptor = "I")
    public static int field6133 = 0;

    @OriginalMember(owner = "client!ht", name = "Fb", descriptor = "[I")
    public static int[] field6137 = new int[8];

    @OriginalMember(owner = "client!ht", name = "Ab", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!ht", name = "Cb", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!ht", name = "Gb", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IF)V")
    public final void method2487(int arg0, float arg1) {
        ++field6134;
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field2270[super.field2289++] = (byte) var3;
        super.field2270[super.field2289++] = (byte) (var3 >> 8);
        super.field2270[super.field2289++] = (byte) (var3 >> 16);
        if (arg0 != 986946216) {
            this.method2489(0.0812441F, 32);
        }
        super.field2270[super.field2289++] = (byte) (var3 >> 24);
    }

    @OriginalMember(owner = "client!ht", name = "q", descriptor = "(I)V")
    public static void method2488(int arg0) {
        field6136 = null;
        field6137 = null;
        if (arg0 > -94) {
            field6133 = 24;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(I)V")
    public class409(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(FI)V")
    public final void method2489(float arg0, int arg1) {
        ++field6132;
        if (arg1 != 24204) {
            field6136 = null;
        }
        int var3 = NativeStream.floatToRawIntBits(arg0);
        super.field2270[super.field2289++] = (byte) (var3 >> 24);
        super.field2270[super.field2289++] = (byte) (var3 >> 16);
        super.field2270[super.field2289++] = (byte) (var3 >> 8);
        super.field2270[super.field2289++] = (byte) var3;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lqf;IIIII)V")
    public static final void method2490(class478 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field7132 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; ++var6) {
            label56: for (int var7 = arg3; var7 <= arg5; ++var7) {
                long var8 = class217.field3128[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 65535L);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class459 var13 = class448.field6723[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field7132; ++var14) {
                            if (arg0.field7128[var14] == var13.field6877) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field7128[arg0.field7132++] = var13.field6877;
                        if (arg0.field7132 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field7132; var15 < 4; ++var15) {
            arg0.field7128[var15] = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(IZ)V")
    public static final void method2491(int arg0, boolean arg1) {
        ++field6138;
        class307.field4691 = -1;
        class158.field2464 = arg0;
        if (arg1) {
            field6137 = null;
        }
        class307.field4691 = -1;
        class216.method1443(true);
    }
}
