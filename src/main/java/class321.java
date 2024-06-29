import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class321 extends class739 {

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "I")
    private int field4365 = 2048;

    @OriginalMember(owner = "client!eo", name = "N", descriptor = "I")
    private int field4377 = 0;

    @OriginalMember(owner = "client!eo", name = "C", descriptor = "I")
    private int field4367 = 4096;

    @OriginalMember(owner = "client!eo", name = "z", descriptor = "I")
    private int field4364 = 12288;

    @OriginalMember(owner = "client!eo", name = "M", descriptor = "I")
    private int field4376 = 8192;

    @OriginalMember(owner = "client!eo", name = "R", descriptor = "I")
    private int field4381 = 0;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
    private int field4366 = 2048;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "Z")
    public static boolean field4368 = false;

    @OriginalMember(owner = "client!eo", name = "E", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!eo", name = "G", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!eo", name = "H", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!eo", name = "I", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!eo", name = "J", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!eo", name = "K", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!eo", name = "O", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!eo", name = "P", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!eo", name = "Q", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!eo", name = "S", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!eo", name = "F", descriptor = "Lhga;")
    public static class300 field4370;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZII)Z")
    private final boolean method1990(boolean arg0, int arg1, int arg2) {
        ++field4379;
        if (!arg0) {
            method1995(10);
        }
        int var4 = (arg1 + arg2) * this.field4364 >> 12;
        int var5 = class195.field2853[(1047109 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field4364;
        int var7 = (var6 << 12) / this.field4376;
        int var8 = this.field4367 * var7 >> 12;
        return var8 > -arg1 + arg2 && ~(-arg1 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(I)V")
    public static void method1991(int arg0) {
        field4370 = null;
        if (arg0 != 3) {
            field4370 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "(III)Z")
    private final boolean method1992(int arg0, int arg1, int arg2) {
        ++field4371;
        int var4 = (-arg2 + arg1) * this.field4364 >> 12;
        if (arg0 != 12907) {
            this.method1992(90, -52, 81);
        }
        int var5 = class195.field2853[(var4 * 255 & 1046976) >> 12];
        int var6 = (var5 << 12) / this.field4364;
        int var7 = (var6 << 12) / this.field4376;
        int var8 = this.field4367 * var7 >> 12;
        return arg1 + arg2 < var8 && arg1 + arg2 > -var8;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1993(String arg0, byte arg1) {
        ++field4378;
        if (arg1 <= 48) {
            method1993((String) null, (byte) -38);
        }
        return class208.method1484(10, arg0, true, (byte) -120);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ZI)[I")
    public final int[] method445(boolean arg0, int arg1) {
        ++field4369;
        int[] var3 = super.field10317.method1042(0, arg1);
        if (super.field10317.field2170) {
            int var4 = class19.field185[arg1] + -2048;
            for (int var5 = 0; var5 < class399.field5703; ++var5) {
                int var6 = class604.field8580[var5] + -2048;
                int var7 = this.field4365 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field4381 + var4;
                int var11 = ~var10 <= 2047 ? var10 : var10 - -4096;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field4377 + var6;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = this.field4366 + var4;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1992(12907, var12, var9) && !this.method1990(true, var15, var18) ? 0 : 4096;
            }
        }
        if (arg0) {
            this.method1992(0, 29, -66);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "()V")
    public class321() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Ljava/io/File;B)[B")
    public static final byte[] method1994(File arg0, byte arg1) {
        ++field4372;
        return arg1 < 99 ? null : class637.method3676(113, (int) arg0.length(), arg0);
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lsl;IB)V")
    public final void method112(class479 arg0, int arg1, byte arg2) {
        ++field4374;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 == -7) {
                                    this.field4376 = arg0.method2882(-1);
                                }
                            } else {
                                this.field4367 = arg0.method2882(arg2 ^ -2);
                            }
                        } else {
                            this.field4364 = arg0.method2882(-1);
                        }
                    } else {
                        this.field4366 = arg0.method2882(arg2 ^ -2);
                    }
                } else {
                    this.field4377 = arg0.method2882(arg2 + -2);
                }
            } else {
                this.field4381 = arg0.method2882(-1);
            }
        } else {
            this.field4365 = arg0.method2882(-1);
        }
        if (arg2 != 1) {
            this.method445(true, -94);
        }
    }

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "(I)V")
    public final void method628(int arg0) {
        class451.method2765(8);
        ++field4373;
        if (arg0 < 53) {
            method1993((String) null, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)Lai;")
    public static final class204 method1995(int arg0) {
        ++field4382;
        try {
            return new class419();
        } catch (Throwable var2) {
            try {
                if (arg0 != -2048) {
                    method1991(23);
                }
                return (class204) Class.forName("iba").newInstance();
            } catch (Throwable var1) {
                return new class251();
            }
        }
    }
}
