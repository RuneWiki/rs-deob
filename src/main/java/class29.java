import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class29 extends class24 {

    @OriginalMember(owner = "client!ga", name = "q", descriptor = "Lkl;")
    public class64 field375 = new class64();

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "Lba;")
    public class51 field392 = new class51();

    @OriginalMember(owner = "client!ga", name = "t", descriptor = "Lgm;")
    private class229 field378;

    @OriginalMember(owner = "client!ga", name = "r", descriptor = "[I")
    public static int[] field376 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field379 = 1;

    @OriginalMember(owner = "client!ga", name = "p", descriptor = "Lcc;")
    public static class78 field374 = new class78();

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field387 = 0;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "I")
    public static int field385 = 0;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Ltl;")
    public static class59 field390 = class85.method639("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 9588);

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "[I")
    public static int[] field393 = new int[500];

    @OriginalMember(owner = "client!ga", name = "o", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!ga", name = "s", descriptor = "[I")
    public static int[] field377;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "()Lu;", line = 7)
    public final class24 method158() {
        field382++;
        class36 var1;
        do {
            var1 = (class36) this.field375.method533(24);
            if (var1 == null) {
                return null;
            }
        } while (var1.field544 == null);
        return var1.field544;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "()I", line = 27)
    public final int method159() {
        field386++;
        return 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILje;I[I)V", line = 43)
    private final void method181(int arg0, int arg1, int arg2, class36 arg3, int arg4, int[] arg5) {
        if (arg1 > -66) {
            this.method157((int[]) null, -27, -104);
        }
        if ((this.field378.field3715[arg3.field530] & 0x4) != 0 && arg3.field519 < 0) {
            int var7 = this.field378.field3708[arg3.field530] / class84.field1322;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field525) / var7;
                if (arg0 < var8) {
                    arg3.field525 += arg0 * var7;
                    break;
                }
                arg0 -= var8;
                arg3.field544.method157(arg5, arg4, var8);
                arg3.field525 += var7 * var8 - 1048576;
                int var9 = class84.field1322 / 100;
                arg4 += var8;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class115 var11 = arg3.field544;
                if (this.field378.field3729[arg3.field530] == 0) {
                    arg3.field544 = class115.method864(arg3.field538, var11.method832(), var11.method836(), var11.method858());
                } else {
                    arg3.field544 = class115.method864(arg3.field538, var11.method832(), 0, var11.method858());
                    this.field378.method1599(arg3.field522.field3382[arg3.field546] < 0, -1, arg3);
                    arg3.field544.method860(var9, var11.method836());
                }
                if (arg3.field522.field3382[arg3.field546] < 0) {
                    arg3.field544.method852(-1);
                }
                var11.method830(var9);
                var11.method157(arg5, arg4, arg2 - arg4);
                if (var11.method868()) {
                    this.field392.method365(var11);
                }
            }
        }
        arg3.field544.method157(arg5, arg4, arg0);
        field391++;
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V", line = 105)
    public final void method154(int arg0) {
        field381++;
        this.field392.method154(arg0);
        for (class36 var2 = (class36) this.field375.method536(2); var2 != null; var2 = (class36) this.field375.method533(24)) {
            if (!this.field378.method1576(var2, (byte) -104)) {
                int var3 = arg0;
                do {
                    if (var2.field524 >= var3) {
                        this.method184(1048575, var3, var2);
                        var2.field524 -= var3;
                        break;
                    }
                    this.method184(1048575, var2.field524, var2);
                    var3 -= var2.field524;
                } while (!this.field378.method1585(var2, var3, 0, (byte) -101, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZILqg;II)V", line = 143)
    public static final void method182(int arg0, boolean arg1, int arg2, class129 arg3, int arg4, int arg5) {
        field373++;
        if (class140.field2310 >= 50 || arg3.field2141 == null || arg3.field2141.length <= arg4 || arg3.field2141[arg4] == null) {
            return;
        }
        int var6 = arg3.field2141[arg4][0];
        int var7 = var6 >> 8;
        if (arg3.field2141[arg4].length > 1) {
            int var8 = (int) ((double) arg3.field2141[arg4].length * Math.random());
            if (var8 > 0) {
                var7 = arg3.field2141[arg4][var8];
            }
        }
        int var9 = var6 >> 4 & 0x7;
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg1) {
                class14.method97(0, var7, var9, -27648);
            }
        } else if (class191.field3198 != 0) {
            class216.field3530[class140.field2310] = var7;
            class219.field3568[class140.field2310] = var9;
            int var11 = (arg2 - 64) / 128;
            class232.field3817[class140.field2310] = 0;
            class239.field3992[class140.field2310] = null;
            if (arg0 != 1048575) {
                method185(true);
            }
            int var12 = (arg5 - 64) / 128;
            class34.field503[class140.field2310] = (var11 << 16) + (var12 << 8) + var10;
            class140.field2310++;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 208)
    public static void method183(byte arg0) {
        field374 = null;
        field390 = null;
        field377 = null;
        field393 = null;
        if (arg0 < 112) {
            method182(60, true, -59, (class129) null, -57, -91);
        }
        field376 = null;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "()Lu;", line = 229)
    public final class24 method156() {
        field380++;
        class36 var1 = (class36) this.field375.method536(2);
        if (var1 == null) {
            return null;
        } else if (var1.field544 == null) {
            return this.method158();
        } else {
            return var1.field544;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IILje;)V", line = 245)
    private final void method184(int arg0, int arg1, class36 arg2) {
        if (arg0 != 1048575) {
            return;
        }
        if ((this.field378.field3715[arg2.field530] & 0x4) != 0 && arg2.field519 < 0) {
            int var4 = this.field378.field3708[arg2.field530] / class84.field1322;
            int var5 = (var4 + 1048575 - arg2.field525) / var4;
            arg2.field525 = arg2.field525 + (arg1 * var4) & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field378.field3729[arg2.field530] == 0) {
                    arg2.field544 = class115.method864(arg2.field538, arg2.field544.method832(), arg2.field544.method836(), arg2.field544.method858());
                } else {
                    arg2.field544 = class115.method864(arg2.field538, arg2.field544.method832(), 0, arg2.field544.method858());
                    this.field378.method1599(arg2.field522.field3382[arg2.field546] < 0, -1, arg2);
                }
                if (arg2.field522.field3382[arg2.field546] < 0) {
                    arg2.field544.method852(-1);
                }
                arg1 = arg2.field525 / var4;
            }
        }
        field388++;
        arg2.field544.method154(arg1);
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 289)
    public static final void method185(boolean arg0) {
        if (!arg0) {
            method183((byte) 4);
        }
        if (class262.field4365 != null) {
            class213 var1 = class262.field4365;
            synchronized (class262.field4365) {
                class262.field4365 = null;
            }
        }
        field383++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "([III)V", line = 312)
    public final void method157(int[] arg0, int arg1, int arg2) {
        field389++;
        this.field392.method157(arg0, arg1, arg2);
        for (class36 var4 = (class36) this.field375.method536(2); var4 != null; var4 = (class36) this.field375.method533(24)) {
            if (!this.field378.method1576(var4, (byte) -113)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var5 <= var4.field524) {
                        this.method181(var5, -73, var5 + var6, var4, var6, arg0);
                        var4.field524 -= var5;
                        break;
                    }
                    this.method181(var4.field524, -68, var5 + var6, var4, var6, arg0);
                    var6 += var4.field524;
                    var5 -= var4.field524;
                } while (!this.field378.method1585(var4, var5, var6, (byte) -14, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lgm;)V", line = 371)
    public class29(class229 arg0) {
        this.field378 = arg0;
    }
}
