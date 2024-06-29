import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class264 extends class209 {

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lj;")
    public class269 field4490 = new class269();

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "Lhh;")
    public class198 field4497 = new class198();

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Lub;")
    private class20 field4491;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Lbe;")
    public static class283 field4492 = class153.method941(126, "Speicher wird zugewiesen)3");

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[I")
    public static int[] field4499 = new int[2];

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4487;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "([III)V", line = 7)
    public final void method161(int[] arg0, int arg1, int arg2) {
        this.field4497.method161(arg0, arg1, arg2);
        field4494++;
        for (class27 var4 = (class27) this.field4490.method1812((byte) -109); var4 != null; var4 = (class27) this.field4490.method1813((byte) 103)) {
            if (!this.field4491.method131(var4, (byte) 19)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field404) {
                        this.method1789(var5, -124, var5 + var6, arg0, var6, var4);
                        var4.field404 -= var6;
                        break;
                    }
                    this.method1789(var5, -122, var5 + var6, arg0, var4.field404, var4);
                    var5 += var4.field404;
                    var6 -= var4.field404;
                } while (!this.field4491.method156(arg0, var5, var6, 128, var4));
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "()Lrb;", line = 46)
    public final class209 method158() {
        field4486++;
        class27 var1 = (class27) this.field4490.method1812((byte) -9);
        if (var1 == null) {
            return null;
        } else if (var1.field426 == null) {
            return this.method147();
        } else {
            return var1.field426;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)Z", line = 66)
    public static final boolean method1786(byte arg0, int arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        if (arg0 != -88) {
            method1787(-63);
        }
        class281 var3 = class254.method1722(0, arg1);
        field4488++;
        return var3.method1892((byte) 121, arg2);
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V", line = 87)
    public static void method1787(int arg0) {
        field4487 = null;
        field4492 = null;
        if (arg0 != -26872) {
            field4492 = (class283) null;
        }
        field4499 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjb;I)V", line = 103)
    private final void method1788(byte arg0, class27 arg1, int arg2) {
        if ((this.field4491.field263[arg1.field408] & 0x4) != 0 && arg1.field417 < 0) {
            int var4 = this.field4491.field287[arg1.field408] / class205.field3493;
            int var5 = (var4 + 1048575 - arg1.field429) / var4;
            arg1.field429 = arg1.field429 + (arg2 * var4) & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field4491.field296[arg1.field408] == 0) {
                    arg1.field426 = class51.method320(arg1.field422, arg1.field426.method302(), arg1.field426.method330(), arg1.field426.method319());
                } else {
                    arg1.field426 = class51.method320(arg1.field422, arg1.field426.method302(), 0, arg1.field426.method319());
                    this.field4491.method143(arg0 ^ 0x53, arg1.field421.field2235[arg1.field406] < 0, arg1);
                }
                if (arg1.field421.field2235[arg1.field406] < 0) {
                    arg1.field426.method309(-1);
                }
                arg2 = arg1.field429 / var4;
            }
        }
        if (arg0 != -84) {
            method1787(-86);
        }
        field4485++;
        arg1.field426.method148(arg2);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[IILjb;)V", line = 142)
    private final void method1789(int arg0, int arg1, int arg2, int[] arg3, int arg4, class27 arg5) {
        if ((this.field4491.field263[arg5.field408] & 0x4) != 0 && arg5.field417 < 0) {
            int var7 = this.field4491.field287[arg5.field408] / class205.field3493;
            while (true) {
                int var8 = (var7 + 1048575 - arg5.field429) / var7;
                if (arg4 < var8) {
                    arg5.field429 += arg4 * var7;
                    break;
                }
                arg5.field426.method161(arg3, arg0, var8);
                arg4 -= var8;
                arg0 += var8;
                int var9 = class205.field3493 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class51 var11 = arg5.field426;
                arg5.field429 += var7 * var8 - 1048576;
                if (this.field4491.field296[arg5.field408] == 0) {
                    arg5.field426 = class51.method320(arg5.field422, var11.method302(), var11.method330(), var11.method319());
                } else {
                    arg5.field426 = class51.method320(arg5.field422, var11.method302(), 0, var11.method319());
                    this.field4491.method143(-1, arg5.field421.field2235[arg5.field406] < 0, arg5);
                    arg5.field426.method294(var9, var11.method330());
                }
                if (arg5.field421.field2235[arg5.field406] < 0) {
                    arg5.field426.method309(-1);
                }
                var11.method326(var9);
                var11.method161(arg3, arg0, arg2 - arg0);
                if (var11.method331()) {
                    this.field4497.method1274(var11);
                }
            }
        }
        field4496++;
        if (arg1 >= -120) {
            this.method1789(75, 47, 12, (int[]) null, 79, (class27) null);
        }
        arg5.field426.method161(arg3, arg0, arg4);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I", line = 202)
    public final int method140() {
        field4493++;
        return 0;
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V", line = 211)
    public final void method148(int arg0) {
        this.field4497.method148(arg0);
        field4495++;
        for (class27 var2 = (class27) this.field4490.method1812((byte) 8); var2 != null; var2 = (class27) this.field4490.method1813((byte) 61)) {
            if (!this.field4491.method131(var2, (byte) 19)) {
                int var3 = arg0;
                do {
                    if (var2.field404 >= var3) {
                        this.method1788((byte) -84, var2, var3);
                        var2.field404 -= var3;
                        break;
                    }
                    this.method1788((byte) -84, var2, var2.field404);
                    var3 -= var2.field404;
                } while (!this.field4491.method156((int[]) null, 0, var3, 128, var2));
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()Lrb;", line = 244)
    public final class209 method147() {
        field4498++;
        class27 var1;
        do {
            var1 = (class27) this.field4490.method1813((byte) 55);
            if (var1 == null) {
                return null;
            }
        } while (var1.field426 == null);
        return var1.field426;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 267)
    public static final void method1790(int arg0, int arg1) {
        class169.field2843 = new int[arg1];
        field4499 = new int[arg1];
        class34.field517 = new int[arg1];
        field4489++;
        class130.field2206 = new int[arg1];
        int var2 = -46 / ((arg0 + 18) / 62);
        class2.field24 = new int[arg1];
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lub;)V", line = 297)
    public class264(class20 arg0) {
        this.field4491 = arg0;
    }
}
