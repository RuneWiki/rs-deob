import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class231 extends class739 {

    @OriginalMember(owner = "client!aia", name = "E", descriptor = "I")
    private int field3030 = 204;

    @OriginalMember(owner = "client!aia", name = "H", descriptor = "I")
    private int field3033 = 1;

    @OriginalMember(owner = "client!aia", name = "K", descriptor = "I")
    private int field3036 = 1;

    @OriginalMember(owner = "client!aia", name = "G", descriptor = "Lhm;")
    public static class223 field3032 = new class223(9, 2);

    @OriginalMember(owner = "client!aia", name = "F", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!aia", name = "J", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!aia", name = "M", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!aia", name = "N", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!aia", name = "L", descriptor = "J")
    public static long field3037;

    @OriginalMember(owner = "client!aia", name = "I", descriptor = "Lcv;")
    public static class570 field3034;

    @OriginalMember(owner = "client!aia", name = "d", descriptor = "(Z)V", line = 3)
    public static void method1463(boolean arg0) {
        if (arg0) {
            field3032 = null;
            field3034 = null;
        }
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(II)[I", line = 15)
    public final int[] method215(int arg0, int arg1) {
        ++field3038;
        if (arg0 != -23347) {
            return null;
        } else {
            int[] var3 = super.field10311.method2116(arg1, (byte) 115);
            if (super.field10311.field4728) {
                for (int var4 = 0; ~class29.field523 < ~var4; ++var4) {
                    int var5 = class634.field8751[var4];
                    int var6 = class287.field3604[arg1];
                    int var7 = this.field3033 * var5 >> 12;
                    int var8 = this.field3036 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field3033) * this.field3033;
                    int var10 = var6 % (4096 / this.field3036) * this.field3036;
                    if (this.field3030 > var10) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (~var7 < -4) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~this.field3030 < ~var9) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var9 < this.field3030) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!aia", name = "<init>", descriptor = "()V", line = 113)
    public class231() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lwaa;B)Z", line = 102)
    public static final boolean method1464(class705 arg0, byte arg1) {
        ++field3031;
        int var2 = 20 / (-arg1 / 37);
        return class571.field8031 == arg0 || class10.field130 == arg0 || class762.field10627 == arg0 || class141.field2002 == arg0;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Lsl;II)V", line = 117)
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field3030 = arg0.method2566(-2);
                }
            } else {
                this.field3036 = arg0.method2600((byte) -128);
            }
        } else {
            this.field3033 = arg0.method2600((byte) -128);
        }
        if (arg2 != -3) {
            method1463(false);
        }
        ++field3035;
    }

    @OriginalMember(owner = "client!aia", name = "a", descriptor = "(Ljava/io/File;I[BI)V", line = 170)
    public static final void method1465(File arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        ++field3039;
        if (arg1 != -4052) {
            method1463(true);
        }
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
        try {
            var4.readFully(arg2, 0, arg3);
        } catch (EOFException var5) {
        }
        var4.close();
    }
}
