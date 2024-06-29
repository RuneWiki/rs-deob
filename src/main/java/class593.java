import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class593 extends class49 {

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "[[S")
    public short[][] field8349;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "D")
    public double field8346;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public static int field8344 = 1;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "Ljn;")
    public static class134 field8342 = new class134(99, 6);

    @OriginalMember(owner = "client!bu", name = "E", descriptor = "I")
    public static int field8350 = -1;

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)J", line = 7)
    public final long method3461(int arg0) {
        field8345++;
        if (arg0 != -3402) {
            field8350 = -110;
        }
        return (long) (this.field8349.length << 0 | this.field8349[0].length);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I[BIIIII)Z", line = 20)
    public static final boolean method3462(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8347++;
        int var7 = arg2 % arg5;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg5 - var7;
        }
        int var9 = -((arg5 + arg6 - 1) / arg5);
        int var10 = -((arg2 + arg5 - 1) / arg5);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg1[arg4] == 0) {
                    return true;
                }
                arg4 += arg5;
            }
            int var14 = arg4 - var8;
            if (arg1[var14 - 1] == 0) {
                return true;
            }
            arg4 = arg0 + var14;
        }
        int var12 = -76 / ((arg3 - 44) / 37);
        return false;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V", line = 68)
    public static final void method3463(byte arg0) {
        field8343++;
        class523 var1 = null;
        if (arg0 != -72) {
            return;
        }
        try {
            class344 var2 = class129.field1674.method4243((byte) -121, true, "2");
            while (var2.field4970 == 0) {
                class730.method4066((byte) -45, 1L);
            }
            if (var2.field4970 == 1) {
                var1 = (class523) var2.field4975;
                byte[] var3 = new byte[(int) var1.method3114((byte) -4)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method3115(var4, (byte) 101, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class533.method3159(new class511(var3), (byte) 88);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method3121((byte) 127);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "(I)V", line = 118)
    public static final void method3464(int arg0) {
        if (arg0 == 0) {
            if (class749.field10337 == 2) {
                class449.field6282[0].method2627(class393.field5594[0]);
                class449.field6282[1].method2627(class393.field5594[1]);
            } else if (class749.field10337 == 3) {
                class449.field6282[0].method2627(class393.field5594[0]);
                class449.field6282[1].method2627(class393.field5594[1]);
                class449.field6282[2].method2627(class393.field5594[2]);
            } else {
                class449.field6282[0].method2627(class393.field5594[0]);
                class449.field6282[1].method2627(class393.field5594[1]);
                class449.field6282[2].method2627(class393.field5594[2]);
                class449.field6282[3].method2627(class393.field5594[3]);
            }
        } else if (arg0 == 1) {
            if (class749.field10337 == 2) {
                class449.field6282[0].method2627(class393.field5594[2]);
            } else if (class749.field10337 == 3) {
                class449.field6282[0].method2627(class393.field5594[3]);
                class449.field6282[1].method2627(class393.field5594[4]);
            } else {
                class449.field6282[0].method2627(class393.field5594[4]);
                class449.field6282[1].method2627(class393.field5594[5]);
                class449.field6282[2].method2627(class393.field5594[6]);
            }
        } else if (arg0 == 2) {
            if (class749.field10337 == 2) {
                class449.field6282[0].method2627(class393.field5594[3]);
                return;
            }
            if (class749.field10337 == 3) {
                class449.field6282[0].method2627(class393.field5594[5]);
                return;
            }
            class449.field6282[0].method2627(class393.field5594[7]);
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IB)Z", line = 188)
    public static final boolean method3465(int arg0, byte arg1) {
        field8348++;
        if (arg1 >= -108) {
            return true;
        } else if (arg0 == 44 || arg0 == 50 || arg0 == 60 || arg0 == 5 || arg0 == 1001) {
            return true;
        } else {
            return arg0 == 12 || arg0 == 1003;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Z)V", line = 217)
    public static void method3466(boolean arg0) {
        field8342 = null;
        if (!arg0) {
            method3463((byte) -21);
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "([[SD)V", line = 226)
    public class593(short[][] arg0, double arg1) {
        this.field8349 = arg0;
        this.field8346 = arg1;
    }
}
