import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class457 extends class153 {

    @OriginalMember(owner = "client!ts", name = "r", descriptor = "Ljava/net/Socket;")
    private Socket field6441;

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "Leq;")
    private class178 field6435;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Lvp;")
    private class160 field6427;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "Lej;")
    public static class104 field6434 = new class104("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "Laba;")
    public static class150 field6436 = new class150();

    @OriginalMember(owner = "client!ts", name = "s", descriptor = "Z")
    public static boolean field6442 = false;

    @OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
    public static int field6445 = 328;

    @OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
    public static int field6446 = 0;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field6429;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!ts", name = "o", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!ts", name = "p", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!ts", name = "t", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!ts", name = "u", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!ts", name = "q", descriptor = "[Lha;")
    public static class52[] field6440;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)V")
    public final void method1004(int arg0) {
        try {
            this.field6441.close();
            if (arg0 != 34065) {
                method2677(22);
            }
        } catch (IOException var2) {
        }
        field6443++;
        this.field6435.method1130(arg0 - 65449);
        this.field6427.method1027((byte) -15);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIZII)V")
    public static final void method2673(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class300.method1908(arg3, (byte) -78);
        field6431++;
        int var7 = 0;
        int var8 = arg3 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class182.field2580[arg0];
        int var16 = arg5 - var8;
        int var17 = arg5 + var8;
        class266.method1742(26844, var15, var16, arg2, arg5 - arg3);
        if (!arg4) {
            field6440 = null;
        }
        class266.method1742(26844, var15, var17, arg6, var16);
        class266.method1742(26844, var15, arg3 + arg5, arg2, var17);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class397.field5668[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class182.field2580[arg0 + var9];
                    int[] var19 = class182.field2580[arg0 - var9];
                    int var20 = class397.field5668[var9];
                    int var21 = arg5 + var7;
                    int var22 = arg5 - var7;
                    int var23 = arg5 + var20;
                    int var24 = arg5 - var20;
                    class266.method1742(26844, var18, var24, arg2, var22);
                    class266.method1742(26844, var18, var23, arg6, var24);
                    class266.method1742(26844, var18, var21, arg2, var23);
                    class266.method1742(26844, var19, var24, arg2, var22);
                    class266.method1742(26844, var19, var23, arg6, var24);
                    class266.method1742(26844, var19, var21, arg2, var23);
                } else {
                    int[] var25 = class182.field2580[arg0 + var9];
                    int[] var26 = class182.field2580[arg0 - var9];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class266.method1742(26844, var25, var27, arg2, var28);
                    class266.method1742(26844, var26, var27, arg2, var28);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class182.field2580[arg0 + var7];
            int[] var30 = class182.field2580[arg0 - var7];
            int var31 = arg5 + var9;
            int var32 = arg5 - var9;
            if (var7 < var8) {
                int var33 = var7 > var11 ? class397.field5668[var7] : var11;
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class266.method1742(26844, var29, var35, arg2, var32);
                class266.method1742(26844, var29, var34, arg6, var35);
                class266.method1742(26844, var29, var31, arg2, var34);
                class266.method1742(26844, var30, var35, arg2, var32);
                class266.method1742(26844, var30, var34, arg6, var35);
                class266.method1742(26844, var30, var31, arg2, var34);
            } else {
                class266.method1742(26844, var29, var31, arg2, var32);
                class266.method1742(26844, var30, var31, arg2, var32);
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V")
    public static final void method2674(int arg0) {
        field6433++;
        int var1 = class559.field7738;
        int[] var2 = class358.field4825;
        for (int var3 = arg0; var3 < var1; var3++) {
            class188 var9 = class349.field4696[var2[var3]];
            if (var9 != null && var9.field574 > 0) {
                var9.field574--;
                if (var9.field574 == 0) {
                    var9.field608 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class480.field6764; var4++) {
            long var5 = (long) class586.field8386[var4];
            class576 var7 = (class576) class278.field3837.method1242(0, var5);
            if (var7 != null) {
                class109 var8 = var7.field7929;
                if (var8.field574 > 0) {
                    var8.field574--;
                    if (var8.field574 == 0) {
                        var8.field608 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIII)V")
    public static final void method2675(int arg0, int arg1, int arg2, int arg3) {
        field6430++;
        class314 var4 = class483.method2819(11, arg0, 21303);
        if (arg1 <= -24) {
            var4.method1959(19793);
            var4.field4230 = arg3;
            var4.field4227 = arg2;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    public static final int method2676(int arg0, int arg1) {
        field6444++;
        if (arg0 != -1) {
            method2676(-115, -20);
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BII)V")
    public final void method998(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 != 34066) {
            this.field6427 = null;
        }
        this.field6427.method1026(arg3, arg2, arg1, -12393);
        field6432++;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public final void method1001(int arg0) {
        field6429++;
        if (arg0 == 34065) {
            this.field6435.method1127((byte) 102);
            this.field6427.method1028(arg0 ^ 0x8510);
        }
    }

    @OriginalMember(owner = "client!ts", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method1004(34065);
        field6437++;
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
    public static void method2677(int arg0) {
        if (arg0 != 0) {
            field6436 = null;
        }
        field6440 = null;
        field6434 = null;
        field6436 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([BIII)I")
    public final int method1002(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 != -26195) {
            method2677(-127);
        }
        field6428++;
        return this.field6435.method1128(arg3, arg0, arg2, false);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ljava/net/Socket;I)V")
    public class457(Socket arg0, int arg1) throws IOException {
        this.field6441 = arg0;
        this.field6441.setSoTimeout(30000);
        this.field6441.setTcpNoDelay(true);
        this.field6435 = new class178(this.field6441.getInputStream(), arg1);
        this.field6427 = new class160(this.field6441.getOutputStream(), arg1);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(BI)Z")
    public final boolean method1000(byte arg0, int arg1) throws IOException {
        field6438++;
        int var3 = 100 % ((32 - arg0) / 57);
        return this.field6435.method1129(0, arg1);
    }
}
