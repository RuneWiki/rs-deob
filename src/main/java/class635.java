import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class635 {

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "Luaa;")
    private class395 field9231 = new class395(64);

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "Lgp;")
    private class561 field9224;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public int field9227;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "Lfd;")
    public static class143 field9225 = new class143();

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Lbv;")
    public static class567 field9230 = new class567("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "I")
    public static int field9232 = 0;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field9223;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field9229;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IB[Ljava/lang/Object;[JI)V", line = 8)
    public static final void method3667(int arg0, byte arg1, Object[] arg2, long[] arg3, int arg4) {
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg4; var11++) {
                if ((long) (var10 & var11) + var7 > arg3[var11]) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg4] = arg2[var6];
            arg2[var6] = var9;
            method3667(arg0, (byte) 107, arg2, arg3, var6 - 1);
            method3667(var6 + 1, (byte) -75, arg2, arg3, arg4);
        }
        field9223++;
        int var15 = -63 % ((arg1 - 32) / 36);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 67)
    public static void method3668(byte arg0) {
        field9225 = null;
        if (arg0 > -76) {
            method3671(true);
        }
        field9230 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILsa;)V", line = 78)
    public static final void method3669(int arg0, class542 arg1) {
        class88.field1594[arg0] = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IZ)Lad;", line = 83)
    public final class19 method3670(int arg0, boolean arg1) {
        field9229++;
        class395 var3 = this.field9231;
        class19 var4;
        synchronized (this.field9231) {
            var4 = (class19) this.field9231.method2407(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field9224;
        byte[] var6;
        synchronized (this.field9224) {
            var6 = this.field9224.method3175(arg0, (byte) -53, 19);
        }
        class19 var7 = new class19();
        if (var6 != null) {
            var7.method220(new class268(var6), (byte) 99);
        }
        class395 var8 = this.field9231;
        synchronized (this.field9231) {
            this.field9231.method2408(var7, (long) arg0, -108);
            if (!arg1) {
                method3667(-53, (byte) -33, null, null, 103);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 118)
    public static final void method3671(boolean arg0) {
        field9226++;
        class395 var1 = class557.field7878;
        synchronized (class557.field7878) {
            if (!arg0) {
                field9230 = null;
            }
            class557.field7878.method2404((byte) -80);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BLjava/lang/String;I)I", line = 140)
    public static final int method3672(int arg0, byte[] arg1, String arg2, int arg3) {
        field9228++;
        int var4 = arg2.length();
        int var5 = arg3;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg2.charAt(var6);
            if (var7 <= '\u007F') {
                arg1[var5++] = (byte) var7;
            } else if (var7 <= '߿') {
                arg1[var5++] = (byte) class188.method1258(var7 >> 6, 192);
                arg1[var5++] = (byte) class188.method1258(128, class424.method2540(var7, 63));
            } else {
                arg1[var5++] = (byte) class188.method1258(var7 >> 12, 224);
                arg1[var5++] = (byte) class188.method1258(class424.method2540(var7, 4056) >> 6, 128);
                arg1[var5++] = (byte) class188.method1258(128, class424.method2540(63, var7));
            }
        }
        if (arg0 > -58) {
            field9225 = null;
        }
        return var5 - arg3;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ljc;ILgp;)V", line = 188)
    public class635(class584 arg0, int arg1, class561 arg2) {
        this.field9224 = arg2;
        this.field9227 = this.field9224.method3164(19, true);
    }
}
