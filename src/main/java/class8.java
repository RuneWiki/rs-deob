import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class8 {

    @OriginalMember(owner = "client!to", name = "d", descriptor = "Ljava/lang/String;")
    public static String field93 = null;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "[Ljq;")
    public static class353[] field97 = new class353[4];

    @OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
    public static int[] field92 = new int[2048];

    @OriginalMember(owner = "client!to", name = "a", descriptor = "I")
    public static int field90 = 0;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!to", name = "m", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "Lbk;")
    public class254 field99;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Lfs;")
    public static class387 field94;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)V", line = 8)
    public static final void method52(boolean arg0, int arg1) {
        field102++;
        for (class307 var2 = (class307) class134.field1942.method1018(arg1 ^ 0xFFFF852B); var2 != null; var2 = (class307) class134.field1942.method1022((byte) -112)) {
            if (var2.field4367 != null) {
                class273.field4030.method1242(var2.field4367);
                var2.field4367 = null;
            }
            if (var2.field4348 != null) {
                class273.field4030.method1242(var2.field4348);
                var2.field4348 = null;
            }
            var2.method1525((byte) -51);
        }
        if (arg1 != -31393) {
            field96 = 65;
        }
        if (!arg0) {
            return;
        }
        for (class307 var3 = (class307) class250.field3680.method1018(arg1 ^ 0xFFFF8577); var3 != null; var3 = (class307) class250.field3680.method1022((byte) -112)) {
            if (var3.field4367 != null) {
                class273.field4030.method1242(var3.field4367);
                var3.field4367 = null;
            }
            var3.method1525((byte) 69);
        }
        for (class307 var4 = (class307) class453.field6669.method880((byte) -23); var4 != null; var4 = (class307) class453.field6669.method879((byte) -20)) {
            if (var4.field4367 != null) {
                class273.field4030.method1242(var4.field4367);
                var4.field4367 = null;
            }
            var4.method1525((byte) 110);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Lfd;I[IZII)Lps;", line = 76)
    public static final class63 method53(class365 arg0, int arg1, int[] arg2, boolean arg3, int arg4, int arg5) {
        if (arg5 != -1) {
            method56(-53, (byte) -94, 86, null, null);
        }
        field95++;
        if (!arg0.field5436 && (!class305.method1900(200, arg4) || !class305.method1900(arg5 + 201, arg1))) {
            return arg0.field5408 ? new class63(arg0, 34037, arg4, arg1, arg3, arg2) : new class63(arg0, arg4, arg1, class118.method934(arg4, 269173057), class118.method934(arg1, 269173057), arg2);
        } else {
            return new class63(arg0, 3553, arg4, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBII)I", line = 97)
    public static final int method54(int arg0, byte arg1, int arg2, int arg3) {
        field91++;
        if (class228.field3318 < 100) {
            return -2;
        }
        int var4 = -2;
        int var5 = 90 % ((73 - arg1) / 46);
        int var6 = Integer.MAX_VALUE;
        int var7 = arg0 - class399.field5926;
        int var8 = arg2 - class399.field5910;
        for (class111 var9 = (class111) class399.field5903.method1018(122); var9 != null; var9 = (class111) class399.field5903.method1022((byte) -112)) {
            if (var9.field1567 == arg3) {
                int var10 = var9.field1566;
                int var11 = var9.field1560;
                int var12 = class399.field5926 + var10 << 14 | class399.field5910 + var11;
                int var13 = (var8 - var11) * (var8 - var11) + (var7 - var10) * (var7 - var10);
                if (var4 < 0 || var6 > var13) {
                    var4 = var12;
                    var6 = var13;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(III[B)[B", line = 156)
    public static final byte[] method55(int arg0, int arg1, int arg2, byte[] arg3) {
        field98++;
        byte[] var4 = new byte[arg2];
        class201.method1412(arg3, arg1, var4, arg0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IBI[I[J)V", line = 173)
    public static final void method56(int arg0, byte arg1, int arg2, int[] arg3, long[] arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg2; var11++) {
                if (((long) (var10 & var11) + var7) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var9;
            method56(arg0, (byte) 38, var6 - 1, arg3, arg4);
            method56(var6 + 1, (byte) 38, arg2, arg3, arg4);
        }
        field101++;
        if (arg1 != 38) {
            method57(-42);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V", line = 230)
    public static void method57(int arg0) {
        field97 = null;
        field94 = null;
        if (arg0 != 1) {
            field93 = null;
        }
        field93 = null;
        field92 = null;
    }
}
