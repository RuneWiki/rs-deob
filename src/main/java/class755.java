import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class755 extends class430 {

    @OriginalMember(owner = "client!rw", name = "A", descriptor = "[I")
    private int[] field10510 = new int[this.field6131];

    @OriginalMember(owner = "client!rw", name = "u", descriptor = "Z")
    public static boolean field10504 = false;

    @OriginalMember(owner = "client!rw", name = "q", descriptor = "Ljda;")
    public static class224 field10500 = new class224();

    @OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
    public static int field10501;

    @OriginalMember(owner = "client!rw", name = "s", descriptor = "I")
    public static int field10502;

    @OriginalMember(owner = "client!rw", name = "t", descriptor = "I")
    private int field10503;

    @OriginalMember(owner = "client!rw", name = "v", descriptor = "I")
    public static int field10505;

    @OriginalMember(owner = "client!rw", name = "x", descriptor = "I")
    public static int field10507;

    @OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!rw", name = "B", descriptor = "I")
    public static int field10511;

    @OriginalMember(owner = "client!rw", name = "C", descriptor = "I")
    private int field10512;

    @OriginalMember(owner = "client!rw", name = "w", descriptor = "[B")
    private byte[] field10506;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method4197(byte[] arg0, boolean arg1) {
        ++field10505;
        class675 var2 = new class675(arg0);
        int var3 = var2.method3750((byte) 35);
        if (arg1) {
            field10504 = true;
        }
        int var4 = var2.method3703(107);
        if (var4 >= 0 && (class135.field1970 == 0 || ~class135.field1970 <= ~var4)) {
            if (var3 == 0) {
                byte[] var8 = new byte[var4];
                var2.method3723(var8, 4, var4, 0);
                return var8;
            } else {
                int var5 = var2.method3703(127);
                if (var5 >= 0 && (~class135.field1970 == -1 || ~class135.field1970 <= ~var5)) {
                    byte[] var6 = new byte[var5];
                    if (~var3 == -2) {
                        class247.method1577(var6, var5, arg0, var4, 9);
                    } else {
                        class97 var7 = class107.field1305;
                        synchronized (class107.field1305) {
                            class107.field1305.method711(false, var6, var2);
                        }
                    }
                    return var6;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)V")
    public final void method129(int arg0, int arg1, int arg2) {
        this.field10503 += this.field10510[arg0] * arg1 >> 12;
        ++field10502;
        if (arg2 != -101) {
            field10500 = null;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ZBI)V")
    public void method131(boolean arg0, byte arg1, int arg2) {
        ++field10508;
        this.field10506[this.field10512++] = (byte) (127 + class286.method1877(127, arg1 >> 1));
        if (arg0) {
            method4197((byte[]) null, false);
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(I)V")
    public final void method128(int arg0) {
        this.field10512 = 0;
        if (arg0 == 3) {
            this.field10503 = 0;
            ++field10509;
        }
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(B)V")
    public final void method125(byte arg0) {
        ++field10501;
        this.field10503 = Math.abs(this.field10503);
        if (~this.field10503 <= -4097) {
            this.field10503 = 4095;
        }
        this.method131(false, (byte) (this.field10503 >> 4), this.field10512++);
        this.field10503 = 0;
        if (arg0 != 58) {
            this.method125((byte) -7);
        }
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(IIIIIF)V")
    public class755(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field6131; ++var7) {
            this.field10510[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "(I)V")
    public static final void method4198(int arg0) {
        ++field10511;
        int var1 = class578.field8168;
        int[] var2 = class240.field3201;
        for (int var3 = arg0; var3 < var1; ++var3) {
            class280 var4 = class309.field4311[var2[var3]];
            if (var4 != null) {
                class68.method563(arg0 ^ -18081, var4, var4.method1835((byte) 127));
            }
        }
    }

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "(Z)V")
    public static void method4199(boolean arg0) {
        if (!arg0) {
            field10500 = null;
        }
        field10500 = null;
    }

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "(III)Z")
    public static final boolean method4200(int arg0, int arg1, int arg2) {
        ++field10507;
        if (arg0 != 33) {
            return true;
        } else {
            return (33 & arg1) != 0;
        }
    }
}
