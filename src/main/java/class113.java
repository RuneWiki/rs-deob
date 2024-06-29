import jaclib.memory.Stream;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class113 extends class572 {

    @OriginalMember(owner = "client!gm", name = "Cb", descriptor = "J")
    public static long field1419 = 20000000L;

    @OriginalMember(owner = "client!gm", name = "Eb", descriptor = "Lns;")
    public static class375 field1421 = new class375();

    @OriginalMember(owner = "client!gm", name = "zb", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!gm", name = "Ab", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!gm", name = "Bb", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!gm", name = "Db", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!gm", name = "Fb", descriptor = "Lkk;")
    public static class179 field1422;

    @OriginalMember(owner = "client!gm", name = "Gb", descriptor = "Lpf;")
    public static class545 field1423;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/awt/Component;B)Luda;")
    public static final class420 method780(Component arg0, byte arg1) {
        ++field1418;
        if (arg1 != 11) {
            method781(112, 15, -7, 121, 108);
        }
        return new class269(arg0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIII)V")
    public static final void method781(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1416;
        int var5 = 0;
        int var6 = arg0;
        int var7 = -arg0;
        int var8 = -1;
        class390.method2223(arg4 - arg0, arg2, class30.field364[arg3], (byte) -113, arg0 + arg4);
        if (arg1 <= 27) {
            field1421 = null;
        }
        while (~var6 < ~var5) {
            var8 += 2;
            ++var5;
            var7 += var8;
            if (var7 >= 0) {
                --var6;
                var7 -= var6 << 1;
                int[] var9 = class30.field364[arg3 + var6];
                int[] var10 = class30.field364[-var6 + arg3];
                int var11 = arg4 - -var5;
                int var12 = arg4 - var5;
                class390.method2223(var12, arg2, var9, (byte) -95, var11);
                class390.method2223(var12, arg2, var10, (byte) -126, var11);
            }
            int var13 = arg4 - -var6;
            int var14 = -var6 + arg4;
            int[] var15 = class30.field364[arg3 + var5];
            int[] var16 = class30.field364[-var5 + arg3];
            class390.method2223(var14, arg2, var15, (byte) -107, var13);
            class390.method2223(var14, arg2, var16, (byte) -114, var13);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(I)V")
    public class113(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(IF)V")
    public final void method782(int arg0, float arg1) {
        ++field1420;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field7318[super.field7313++] = (byte) var3;
        super.field7318[super.field7313++] = (byte) (var3 >> 8);
        if (arg0 == 367967696) {
            super.field7318[super.field7313++] = (byte) (var3 >> 16);
            super.field7318[super.field7313++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "(I)V")
    public static void method783(int arg0) {
        field1422 = null;
        field1423 = null;
        field1421 = null;
        if (arg0 > -81) {
            method783(-123);
        }
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(IF)V")
    public final void method784(int arg0, float arg1) {
        ++field1417;
        if (arg0 != -1585528400) {
            method781(43, 56, 36, -104, 37);
        }
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field7318[super.field7313++] = (byte) (var3 >> 24);
        super.field7318[super.field7313++] = (byte) (var3 >> 16);
        super.field7318[super.field7313++] = (byte) (var3 >> 8);
        super.field7318[super.field7313++] = (byte) var3;
    }
}
