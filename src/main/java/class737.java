import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class737 extends class429 {

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "J")
    public static long field10228 = 20000000L;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "Lin;")
    public static class380 field10221 = new class380(104, -2);

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "I")
    public static int field10234 = 100;

    @OriginalMember(owner = "client!oda", name = "n", descriptor = "I")
    public static int field10222;

    @OriginalMember(owner = "client!oda", name = "o", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!oda", name = "p", descriptor = "I")
    public static int field10224;

    @OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
    public static int field10226;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "[Lld;")
    public static class129[] field10229;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "[[Z")
    public static boolean[][] field10233;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(B)V", line = 5)
    public final void method47(byte arg0) {
        int var2 = -125 / ((-56 - arg0) / 48);
        ++field10227;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(FIFIF[BIIBIIFFLlt;)V", line = 14)
    public static final void method4066(float arg0, int arg1, float arg2, int arg3, float arg4, byte[] arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, float arg11, float arg12, class323 arg13) {
        ++field10230;
        int var14 = arg7 * arg10;
        float[] var15 = new float[var14];
        for (int var16 = 0; ~arg6 < ~var16; ++var16) {
            int var19 = arg9;
            arg13.method231(arg10, arg7, 0, 121, arg0 / (float) arg10, arg1, arg3, arg4 * 127.0F, var15, arg2 / (float) arg3, arg11 / (float) arg7);
            arg2 *= 2.0F;
            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                arg5[var19] = (byte) ((int) ((float) arg5[var19] + var15[var20]));
                ++var19;
            }
            arg4 *= arg12;
            arg11 *= 2.0F;
            arg0 *= 2.0F;
        }
        int var17 = arg9;
        for (int var18 = 0; ~var18 > ~var14; ++var18) {
            arg5[var17] = (byte) (arg5[var17] + 127);
            ++var17;
        }
        if (arg8 <= 63) {
            method4067(-128);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IZ)V", line = 66)
    public final void method43(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field10226;
        }
    }

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "(I)V", line = 78)
    public static void method4067(int arg0) {
        field10221 = null;
        field10233 = null;
        field10229 = null;
        if (arg0 < 2) {
            method4068(-19);
        }
    }

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "(I)V", line = 94)
    public static final void method4068(int arg0) {
        ++field10225;
        class647.method3663();
        for (int var1 = 0; var1 < 4; ++var1) {
            class605.field8591[var1].method2093(arg0 ^ 113);
        }
        class726.method4025(false);
        if (arg0 != 4) {
            field10234 = 37;
        }
        class727.method4035(-112);
        class55.method600(0);
        System.gc();
        class686.field9702.method91();
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)V", line = 117)
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg0 != 37) {
            field10221 = null;
        }
        ++field10224;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Lmj;)V", line = 127)
    public class737(class114 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Len;ZI)V", line = 131)
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        ++field10223;
        super.field5939.method988(1, arg0);
        if (!arg1) {
            super.field5939.method949(arg2, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(ZZ)V", line = 144)
    public final void method44(boolean arg0, boolean arg1) {
        ++field10231;
        if (arg1) {
            this.method44(true, false);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(B)Z", line = 159)
    public final boolean method48(byte arg0) {
        ++field10222;
        if (arg0 != -128) {
            field10233 = null;
        }
        return false;
    }
}
