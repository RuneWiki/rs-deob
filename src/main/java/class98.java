import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class98 extends class177 {

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "Lma;")
    public class5 field1287 = new class5();

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Ldf;")
    public class178 field1295 = new class178();

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "Lll;")
    private class159 field1290;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lma;")
    public static class5 field1286 = new class5();

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field1289 = 0;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Z")
    public static boolean field1291 = false;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Ljava/lang/String;")
    public static String field1294 = "glow3:";

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "([III)V", line = 7)
    public final void method179(int[] arg0, int arg1, int arg2) {
        this.field1295.method179(arg0, arg1, arg2);
        field1293++;
        for (class292 var4 = (class292) this.field1287.method22((byte) 124); var4 != null; var4 = (class292) this.field1287.method26((byte) -128)) {
            if (!this.field1290.method1176(var4, 128)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field4523 >= var5) {
                        this.method688(arg0, var5 + var6, (byte) 102, var4, var5, var6);
                        var4.field4523 -= var5;
                        break;
                    }
                    this.method688(arg0, var5 + var6, (byte) 102, var4, var4.field4523, var6);
                    var6 += var4.field4523;
                    var5 -= var4.field4523;
                } while (!this.field1290.method1155(var6, var5, var4, 60, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "()Ltb;", line = 49)
    public final class177 method187() {
        field1284++;
        class292 var1 = (class292) this.field1287.method22((byte) 122);
        if (var1 == null) {
            return null;
        } else if (var1.field4517 == null) {
            return this.method178();
        } else {
            return var1.field4517;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZILrg;)V", line = 67)
    private final void method686(boolean arg0, int arg1, class292 arg2) {
        field1283++;
        if ((this.field1290.field2460[arg2.field4510] & 0x4) != 0 && arg2.field4521 < 0) {
            int var4 = this.field1290.field2502[arg2.field4510] / class318.field5024;
            int var5 = (var4 + 1048575 - arg2.field4526) / var4;
            arg2.field4526 = arg1 * var4 + arg2.field4526 & 0xFFFFF;
            if (arg1 >= var5) {
                if (this.field1290.field2518[arg2.field4510] == 0) {
                    arg2.field4517 = class17.method159(arg2.field4534, arg2.field4517.method177(), arg2.field4517.method182(), arg2.field4517.method165());
                } else {
                    arg2.field4517 = class17.method159(arg2.field4534, arg2.field4517.method177(), 0, arg2.field4517.method165());
                    this.field1290.method1162((byte) 109, arg2, arg2.field4529.field3274[arg2.field4531] < 0);
                }
                if (arg2.field4529.field3274[arg2.field4531] < 0) {
                    arg2.field4517.method185(-1);
                }
                arg1 = arg2.field4526 / var4;
            }
        }
        if (arg0) {
            field1286 = (class5) null;
        }
        arg2.field4517.method157(arg1);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "()Ltb;", line = 106)
    public final class177 method178() {
        field1288++;
        class292 var1;
        do {
            var1 = (class292) this.field1287.method26((byte) -126);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4517 == null);
        return var1.field4517;
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "()I", line = 126)
    public final int method153() {
        field1292++;
        return 0;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 138)
    public final void method157(int arg0) {
        field1282++;
        this.field1295.method157(arg0);
        for (class292 var2 = (class292) this.field1287.method22((byte) 122); var2 != null; var2 = (class292) this.field1287.method26((byte) -117)) {
            if (!this.field1290.method1176(var2, 128)) {
                int var3 = arg0;
                do {
                    if (var2.field4523 >= var3) {
                        this.method686(false, var3, var2);
                        var2.field4523 -= var3;
                        break;
                    }
                    this.method686(false, var2.field4523, var2);
                    var3 -= var2.field4523;
                } while (!this.field1290.method1155(0, var3, var2, 60, (int[]) null));
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)V", line = 170)
    public static void method687(byte arg0) {
        field1286 = null;
        int var1 = 110 / ((arg0 - 45) / 54);
        field1294 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([IIBLrg;II)V", line = 182)
    private final void method688(int[] arg0, int arg1, byte arg2, class292 arg3, int arg4, int arg5) {
        if ((this.field1290.field2460[arg3.field4510] & 0x4) != 0 && arg3.field4521 < 0) {
            int var7 = this.field1290.field2502[arg3.field4510] / class318.field5024;
            while (true) {
                int var8 = (var7 + 1048575 - arg3.field4526) / var7;
                if (arg4 < var8) {
                    arg3.field4526 += arg4 * var7;
                    break;
                }
                arg4 -= var8;
                arg3.field4517.method179(arg0, arg5, var8);
                arg3.field4526 += var7 * var8 - 1048576;
                int var9 = class318.field5024 / 100;
                class17 var10 = arg3.field4517;
                arg5 += var8;
                int var11 = 262144 / var7;
                if (var11 < var9) {
                    var9 = var11;
                }
                if (this.field1290.field2518[arg3.field4510] == 0) {
                    arg3.field4517 = class17.method159(arg3.field4534, var10.method177(), var10.method182(), var10.method165());
                } else {
                    arg3.field4517 = class17.method159(arg3.field4534, var10.method177(), 0, var10.method165());
                    this.field1290.method1162((byte) 109, arg3, arg3.field4529.field3274[arg3.field4531] < 0);
                    arg3.field4517.method161(var9, var10.method182());
                }
                if (arg3.field4529.field3274[arg3.field4531] < 0) {
                    arg3.field4517.method185(-1);
                }
                var10.method194(var9);
                var10.method179(arg0, arg5, arg1 - arg5);
                if (var10.method162()) {
                    this.field1295.method1314(var10);
                }
            }
        }
        arg3.field4517.method179(arg0, arg5, arg4);
        if (arg2 != 102) {
            this.method688((int[]) null, -56, (byte) 119, (class292) null, 80, -44);
        }
        field1285++;
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(Lll;)V", line = 268)
    public class98(class159 arg0) {
        this.field1290 = arg0;
    }
}
