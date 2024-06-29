import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class144 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lgv;")
    public class323 field1942 = new class323();

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1945 = null;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([SII)[S")
    public static final short[] method822(short[] arg0, int arg1, int arg2) {
        field1944++;
        short[] var3 = new short[arg1];
        class2.method11(arg0, 0, var3, 0, arg1);
        return arg2 == -5 ? var3 : null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z")
    public static final boolean method823(int arg0) {
        if (arg0 != -1924733010) {
            method826((byte) -128);
        }
        field1947++;
        return class177.field2497;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Lrr;")
    public static final class408 method824(int arg0, int arg1) {
        field1943++;
        class408[] var2 = class593.method3290(805404864);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class408 var5 = var2[var3];
            if (var5.field5366 == arg0) {
                return var5;
            }
        }
        int var4 = -65 % ((arg1 - 32) / 42);
        return null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILua;IJIILwv;I)V")
    public static final void method825(int arg0, int arg1, class596 arg2, int arg3, long arg4, int arg5, int arg6, class423 arg7, int arg8) {
        field1946++;
        int var10 = arg0 * arg0 + arg6 * arg6;
        if (arg4 < ((long) var10)) {
            return;
        }
        if (arg3 != 3491) {
            method824(-17, -66);
        }
        int var11 = Math.min(arg7.field5561 / 2, arg7.field5672 / 2);
        if (var11 * var11 >= var10) {
            class27.method160(arg1, arg6, arg7, arg2, (byte) 67, arg0, arg8, class436.field5813[arg5]);
            return;
        }
        var11 -= 10;
        int var12;
        if (class311.field4200 == 4) {
            var12 = (int) class565.field7707 & 0x3FFF;
        } else {
            var12 = (int) class565.field7707 + class478.field6651 & 0x3FFF;
        }
        int var13 = class240.field3176[var12];
        int var14 = class240.field3177[var12];
        if (class311.field4200 != 4) {
            var13 = var13 * 256 / (class424.field5716 + 256);
            var14 = var14 * 256 / (class424.field5716 + 256);
        }
        int var15 = arg0 * var14 + arg6 * var13 >> 14;
        int var16 = arg6 * var14 - (arg0 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) (Math.sin(var17) * (double) var11);
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class364.field4808[arg5].method2989((float) arg7.field5561 / 2.0F + (float) arg8 + (float) var19, (float) arg7.field5672 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method826(byte arg0) {
        field1945 = null;
        int var1 = 110 / ((-arg0 - 51) / 34);
    }
}
