import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class232 extends class622 {

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3249 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ltq;Ljava/lang/String;II)Loc;", line = 3)
    public static final class175 method1490(class545 arg0, String arg1, int arg2, int arg3) {
        field3250++;
        if (arg3 == 0) {
            return arg0.method3167(22846, arg1);
        } else if (arg3 == 1) {
            try {
                class314.method2066(class635.field9135, new Object[] { (new URL(class635.field9135.getCodeBase(), arg1)).toString() }, "openjs", 21747);
                class175 var4 = new class175();
                var4.field2138 = 1;
                return var4;
            } catch (Throwable var10) {
                class175 var5 = new class175();
                var5.field2138 = 2;
                return var5;
            }
        } else if (arg3 == 2) {
            try {
                class635.field9135.getAppletContext().showDocument(new URL(class635.field9135.getCodeBase(), arg1), "_blank");
                class175 var6 = new class175();
                var6.field2138 = 1;
                return var6;
            } catch (Exception var11) {
                class175 var7 = new class175();
                var7.field2138 = 2;
                return var7;
            }
        } else if (arg3 == 3) {
            try {
                class314.method2067(-24319, "loggedout", class635.field9135);
            } catch (Throwable var13) {
            }
            try {
                class635.field9135.getAppletContext().showDocument(new URL(class635.field9135.getCodeBase(), arg1), "_top");
                class175 var8 = new class175();
                var8.field2138 = 1;
                return var8;
            } catch (Exception var12) {
                class175 var9 = new class175();
                var9.field2138 = 2;
                return var9;
            }
        } else if (arg2 == 2) {
            throw new IllegalArgumentException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/net/Socket;I)Lrd;", line = 80)
    public static final class285 method1492(int arg0, Socket arg1, int arg2) throws IOException {
        if (arg2 != 65535) {
            method1495(-65, -40);
        }
        field3247++;
        return new class450(arg1, arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)Z", line = 91)
    public static final boolean method1493(int arg0, int arg1) {
        if (arg1 != -1) {
            method1490(null, null, -41, -99);
        }
        field3251++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lpt;IIIII)V", line = 103)
    public static final void method1494(class460 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field6869 = 0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (arg0.field6871[var6] != null) {
                arg0.field6869++;
            }
        }
        label50: for (int var7 = 0; var7 < arg0.field6869; var7++) {
            long var8 = class207.field2784[arg1][arg2][arg3];
            while (var8 != 0L) {
                class49 var14 = class48.field512[(int) ((var8 & 0xFFFFL) - 1L)];
                var8 >>>= 0x10;
                if (arg0.field6871[var7] == var14.field522) {
                    continue label50;
                }
            }
            long var10 = class207.field2784[arg1][arg4][arg5];
            while (var10 != 0L) {
                class49 var13 = class48.field512[(int) ((var10 & 0xFFFFL) - 1L)];
                var10 >>>= 0x10;
                if (arg0.field6871[var7] == var13.field522) {
                    continue label50;
                }
            }
            for (int var12 = var7; var12 < arg0.field6869 - 1; var12++) {
                arg0.field6871[var12] = arg0.field6871[var12 + 1];
            }
            arg0.field6869--;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)V", line = 166)
    public static final void method1495(int arg0, int arg1) {
        if (arg1 == 65535) {
            class34.field390 = arg0;
            field3248++;
            class507.field7381.method1810(false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lwn;")
    public abstract class627 method1491(int arg0);
}
