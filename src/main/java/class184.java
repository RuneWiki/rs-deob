import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class184 extends OutputStream {

    @OriginalMember(owner = "client!db", name = "a", descriptor = "Lwm;")
    public static class152 field2921 = class157.method1048("<col=ff7000>", 103);

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Lwm;")
    public static class152 field2927 = class157.method1048(" )2> <col=ff9040>", 99);

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field2930 = -2;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lah;")
    public static class205 field2928;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IILah;B)[Lbg;", line = 6)
    public static final class203[] method1225(int arg0, int arg1, class205 arg2, byte arg3) {
        field2923++;
        if (arg3 != 19) {
            field2930 = -126;
        }
        return class86.method566(arg0, arg2, arg1, 1) ? class150.method951((byte) -87) : null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([S[Lwm;I)V", line = 24)
    public static final void method1226(short[] arg0, class152[] arg1, int arg2) {
        class124.method790(1, 0, arg0, arg1, arg1.length - 1);
        field2925++;
        if (arg2 != -18653) {
            field2924 = 106;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIILoe;IIB)V", line = 41)
    public static final void method1227(int arg0, int arg1, int arg2, class127 arg3, int arg4, int arg5, byte arg6) {
        if (arg6 != -100) {
            method1226((short[]) null, (class152[]) null, -107);
        }
        field2926++;
        int var7 = arg0 * arg0 + arg4 * arg4;
        if (var7 > 360000) {
            return;
        }
        int var8 = Math.min(arg3.field1876 / 2, arg3.field1921 / 2);
        if (var7 <= var8 * var8) {
            class83.method538(arg2, class143.field2199[arg5], arg0, (byte) -88, arg3, arg1, arg4);
            return;
        }
        var8 -= 10;
        int var9 = class272.field4645 + class202.field3262 & 0x7FF;
        int var10 = class181.field2884[var9];
        int var11 = class181.field2886[var9];
        int var12 = var11 * 256 / (class130.field1980 + 256);
        int var13 = var10 * 256 / (class130.field1980 + 256);
        int var14 = arg0 * var12 - (arg4 * var13) >> 16;
        int var15 = arg0 * var13 + arg4 * var12 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) ((double) var8 * Math.sin(var16));
        int var19 = (int) ((double) var8 * Math.cos(var16));
        if (class217.field3516) {
            ((class68) class305.field5244[arg5]).method432(240, 240, (arg3.field1876 / 2 + arg2 + var18) * 16, (arg3.field1921 / 2 + (arg1 - var19)) * 16, (int) (var16 * 10430.378D), 4096);
        } else {
            ((class109) class305.field5244[arg5]).method512(arg3.field1876 / 2 + arg2 + var18 - 10, arg1 - -(arg3.field1921 / 2) + -var19 + -10, 20, 20, 15, 15, var16, 256);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 94)
    public static void method1228(byte arg0) {
        field2921 = null;
        field2927 = null;
        if (arg0 != 4) {
            field2928 = (class205) null;
        }
        field2928 = null;
    }

    @OriginalMember(owner = "client!db", name = "write", descriptor = "(I)V", line = 114)
    public final void write(int arg0) throws IOException {
        field2922++;
        throw new IOException();
    }
}
