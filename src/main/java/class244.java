import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class244 extends class214 {

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "I")
    private final int field4344;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    private final int field4339;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    private final int field4340;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    private final int field4342;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    private final int field4338;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    private final int field4354;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "I")
    private final int field4355;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    private final int field4348;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "Lqj;")
    private static class196 field4343 = class80.method502("Please remove ", -48);

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "J")
    public static long field4351 = 0L;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Lqj;")
    public static class196 field4337 = field4343;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "Lqj;")
    public static class196 field4352 = field4343;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field4353 = 0;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "Lqj;")
    public static class196 field4346 = class80.method502(":trade:", -48);

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)V")
    public static final void method1666(boolean arg0, int arg1) {
        ++field4345;
        if (class50.field595 != null) {
            try {
                class56 var2 = new class56(4);
                var2.method329((byte) 30, !arg0 ? 3 : 2);
                var2.method344(0, 30848);
                class50.field595.method484(var2.field693, 4, 0, 3);
                if (arg1 != 1517387372) {
                    method1667((byte) -73);
                }
            } catch (IOException var4) {
                try {
                    class50.field595.method481(true);
                } catch (Exception var3) {
                }
                ++class165.field2686;
                class50.field595 = null;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V")
    public final void method392(int arg0, int arg1, int arg2) {
        ++field4349;
        if (arg2 != -954688305) {
            field4351 = 55L;
        }
        int var4 = this.field4355 * arg0 >> 12;
        int var5 = this.field4338 * arg1 >> 12;
        int var6 = this.field4348 * arg0 >> 12;
        int var7 = this.field4342 * arg1 >> 12;
        int var8 = this.field4354 * arg0 >> 12;
        int var9 = this.field4344 * arg1 >> 12;
        int var10 = this.field4340 * arg0 >> 12;
        int var11 = this.field4339 * arg1 >> 12;
        class130.method793(var6, var5, var11, var7, var4, var8, var10, super.field3827, var9, 10067);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public static void method1667(byte arg0) {
        field4343 = null;
        field4346 = null;
        field4337 = null;
        field4352 = null;
        int var1 = 112 / ((-27 - arg0) / 38);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V")
    public final void method388(int arg0, int arg1, int arg2) {
        ++field4347;
        if (arg0 < 35) {
            method1667((byte) 84);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BII)V")
    public final void method390(byte arg0, int arg1, int arg2) {
        ++field4341;
        int var4 = 50 / ((48 - arg0) / 52);
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public static final void method1668(byte arg0) {
        ++field4336;
        class20.method109();
        if (arg0 != -116) {
            field4352 = null;
        }
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class188.field3298[var1].method965((byte) -113);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field4344 = arg5;
        this.field4339 = arg7;
        this.field4340 = arg6;
        this.field4342 = arg3;
        this.field4338 = arg1;
        this.field4354 = arg2;
        this.field4355 = arg0;
        this.field4348 = arg4;
    }
}
