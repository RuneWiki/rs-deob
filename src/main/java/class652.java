import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class652 {

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljt;")
    public static class104 field9306 = new class104("", 11);

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "[[I")
    public static int[][] field9308 = new int[128][128];

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "Lkda;")
    public static class388 field9309 = new class388();

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "Z")
    public static boolean field9312 = false;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "I")
    public static int field9304;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field9307;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field9310;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method3698(int arg0, String arg1) {
        field9305++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < class293.field3610; var2++) {
            if (arg1.equalsIgnoreCase(class522.field7422[var2])) {
                return true;
            }
            if (arg1.equalsIgnoreCase(class166.field1853[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method3699(long arg0, int arg1) {
        field9307++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == (long) arg1) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg0;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class489.field6979[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)J")
    public static final synchronized long method3700(int arg0) {
        field9310++;
        long var1 = System.currentTimeMillis();
        if (var1 < class717.field10061) {
            class320.field4085 += class717.field10061 - var1;
        }
        class717.field10061 = var1;
        if (arg0 != -1) {
            field9309 = null;
        }
        return class320.field4085 + var1;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I[Ljava/lang/String;BI[S)V")
    public static final void method3701(int arg0, String[] arg1, byte arg2, int arg3, short[] arg4) {
        field9304++;
        if (arg0 > arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var8;
            for (int var9 = arg3; var9 < arg0; var9++) {
                if (var7 == null || arg1[var9] != null && (var9 & 0x1) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg0] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg0] = arg4[var6];
            arg4[var6] = var8;
            method3701(var6 - 1, arg1, (byte) 90, arg3, arg4);
            method3701(arg0, arg1, (byte) 86, var6 + 1, arg4);
        }
        if (arg2 < 60) {
            field9309 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZII)Llba;")
    public static final class547 method3702(boolean arg0, int arg1, int arg2) {
        field9311++;
        if (arg1 != -9477) {
            return null;
        }
        class454[] var3 = class62.field640;
        synchronized (class62.field640) {
            class547 var4;
            if (arg2 >= class62.field640.length || class62.field640[arg2].method2789((byte) 92)) {
                var4 = new class547();
                var4.field7870 = new class569[arg2];
                for (int var5 = 0; var5 < arg2; var5++) {
                    var4.field7870[var5] = new class569();
                }
            } else {
                var4 = (class547) class62.field640[arg2].method2788(0);
                var4.method2401((byte) -57);
                int var10002 = class501.field7045[arg2]--;
            }
            var4.field7867 = arg0;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method3703(byte arg0) {
        field9309 = null;
        field9306 = null;
        field9308 = null;
        if (arg0 < 0) {
            method3700(15);
        }
    }
}
