import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class531 {

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "[I")
    public static int[] field7479 = new int[120];

    @OriginalMember(owner = "client!jt", name = "k", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "I")
    public int field7477;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "I")
    public static int field7478;

    @OriginalMember(owner = "client!jt", name = "j", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!jt", name = "l", descriptor = "I")
    public static int field7482;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field7479[var1] = var0 / 4;
        }
        field7481 = 1;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILfa;Ljava/awt/Canvas;I)Lr;", line = 4)
    public static final class564 method2979(int arg0, class524 arg1, Canvas arg2, int arg3) {
        field7478++;
        return arg3 == 14997 ? new class422(arg2, arg1, arg0) : null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)V", line = 15)
    public static final void method2980(int arg0, int arg1) {
        field7476++;
        if (class236.field2937 == arg0) {
            return;
        }
        class142.field1574 = class140.field1550 = class397.field5359[arg0];
        class554.method3144((byte) -124);
        class80.field830 = new int[class142.field1574][class140.field1550];
        class333.field4180 = new int[class142.field1574][class140.field1550];
        class687.field9668 = new int[4][class142.field1574 >> 3][class140.field1550 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class282.field3534[var2] = class467.method2691(class142.field1574, (byte) 19, class140.field1550);
        }
        class125.field1420 = new byte[4][class142.field1574][class140.field1550];
        class551.method3126(class142.field1574, arg1 + 12, class140.field1550, arg1);
        class498.method2874(3, class140.field1550 >> 3, class142.field1574 >> 3, class701.field9813);
        class236.field2937 = arg0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lnp;I)V", line = 43)
    public final void method2981(class115 arg0, int arg1) {
        field7473++;
        if (arg1 != 0) {
            this.field7471 = -28;
        }
        while (true) {
            int var3 = arg0.method620((byte) -16);
            if (var3 == 0) {
                return;
            }
            this.method2985(arg0, var3, (byte) 101);
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 66)
    public static final String method2982(byte arg0, String arg1) {
        field7475++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        int var6 = 0;
        if (arg0 != 113) {
            field7479 = null;
        }
        while (var2 > var6) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
            var6++;
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 118)
    public static void method2983(int arg0) {
        field7479 = null;
        if (arg0 != 120) {
            field7479 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "([I[IIILmj;I)Lpp;", line = 133)
    public static final class507 method2984(int[] arg0, int[] arg1, int arg2, int arg3, class344 arg4, int arg5) {
        if (arg5 != 0) {
            method2983(43);
        }
        field7480++;
        if (!arg4.method1334(1, class179.field2008, class274.field3431)) {
            int[] var10 = new int[arg2 * arg3];
            for (int var11 = 0; var11 < arg3; var11++) {
                int var12 = arg2 * var11 + arg1[var11];
                for (int var13 = 0; var13 < arg0[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class507(arg4, arg2, arg3, var10);
        }
        byte[] var6 = new byte[arg2 * arg3];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg2 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class507(arg4, arg2, arg3, var6);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lnp;IB)V", line = 191)
    private final void method2985(class115 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field7477 = arg0.method643((byte) -77);
            this.field7471 = arg0.method620((byte) 47);
            this.field7474 = arg0.method620((byte) -127);
        }
        field7472++;
        if (arg2 != 101) {
            field7479 = null;
        }
    }
}
