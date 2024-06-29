import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class198 extends class23 {

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "[I")
    private final int[] field3304 = new int[this.field419];

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lok;")
    public static class146 field3294 = null;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field3297 = 0;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
    public static int field3306 = 0;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Lok;")
    private static class146 field3296 = class235.method1724(-12908, "Loaded sprites");

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Lok;")
    public static class146 field3291 = field3296;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Lok;")
    private static class146 field3292 = class235.method1724(-12908, "Close");

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "Lok;")
    public static class146 field3305 = field3292;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    private int field3295;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!bg", name = "C", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[B")
    private byte[] field3298;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V", line = 5)
    public final void method161(byte arg0) {
        int var2 = 49 % ((arg0 - 57) / 50);
        this.field3295 = 0;
        field3299++;
        this.field3303 = 0;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BS)Z", line = 15)
    public static final boolean method1523(byte arg0, short arg1) {
        if (arg0 != 1) {
            method1523((byte) 68, (short) -13);
        }
        field3302++;
        if (arg1 == 15 || arg1 == 36 || arg1 == 35 || arg1 == 17 || arg1 == 4 || arg1 == 48 || arg1 == 14 || arg1 == 21) {
            return true;
        } else if (arg1 == 30 || arg1 == 57 || arg1 == 1003 || arg1 == 1006) {
            return true;
        } else if (arg1 == 60 || arg1 == 44 || arg1 == 46 || arg1 == 31 || arg1 == 16) {
            return true;
        } else {
            return arg1 == 49 || arg1 == 32 || arg1 == 41 || arg1 == 47 || arg1 == 40 || arg1 == 11;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V", line = 45)
    public static void method1524(int arg0) {
        field3305 = null;
        field3291 = null;
        field3292 = null;
        field3296 = null;
        field3294 = null;
        if (arg0 != 44) {
            method1525((class47) null, 29);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lwe;I)V", line = 62)
    public static final void method1525(class47 arg0, int arg1) {
        field3300++;
        byte[] var2 = new byte[arg1];
        if (class92.field1456 != null) {
            try {
                class92.field1456.method477(11955, 0L);
                class92.field1456.method478(arg1 - 24, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg0.method372(24, var2, (byte) -117, 0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIB)V", line = 106)
    public final void method162(int arg0, int arg1, byte arg2) {
        field3308++;
        this.field3303 += this.field3304[arg1] * arg0 >> 12;
        if (arg2 != -113) {
            method1525((class47) null, 103);
        }
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIIIF)V", line = 117)
    public class198(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field419; var7++) {
            this.field3304[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IB)V", line = 155)
    public void method1526(int arg0, byte arg1) {
        field3301++;
        this.field3298[this.field3295++] = (byte) (class82.method582(arg1 >> 1, 127) + 127);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V", line = 168)
    public final void method166(int arg0) {
        this.field3303 = Math.abs(this.field3303);
        if (this.field3303 >= 4096) {
            this.field3303 = 4095;
        }
        this.method1526(this.field3295++, (byte) (this.field3303 >> 4));
        this.field3303 = 0;
        field3307++;
        if (arg0 != -32204) {
            field3292 = (class146) null;
        }
    }
}
