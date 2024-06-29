import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class96 extends class243 {

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
    private int field1250 = 1;

    @OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
    private int field1252 = 1;

    @OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
    private int field1253 = 204;

    @OriginalMember(owner = "client!sd", name = "H", descriptor = "I")
    public static int field1248 = 0;

    @OriginalMember(owner = "client!sd", name = "K", descriptor = "I")
    public static int field1251 = 0;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!sd", name = "I", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method5(int arg0, int arg1) {
        ++field1247;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            this.field1250 = 57;
        }
        if (super.field3164.field9250) {
            for (int var4 = 0; ~var4 > ~class687.field9628; ++var4) {
                int var5 = class666.field9279[var4];
                int var6 = class685.field9613[arg1];
                int var7 = this.field1252 * var5 >> 12;
                int var8 = this.field1250 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1252) * this.field1252;
                int var10 = var6 % (4096 / this.field1250) * this.field1250;
                if (var10 < this.field1253) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field1253 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field1253) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)I", line = 89)
    public static final int method659(int arg0, int arg1) {
        ++field1246;
        if (arg1 != 127) {
            method661((byte) 59);
        }
        return arg0 & 127;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILjava/lang/String;Lfl;I)Ljt;", line = 104)
    public static final class107 method660(int arg0, String arg1, class739 arg2, int arg3) {
        ++field1244;
        if (~arg3 == -1) {
            return arg2.method4127(-14, arg1);
        } else if (arg3 == 1) {
            try {
                class679.method3852(26635, class144.field1868, "openjs", new Object[] { (new URL(class144.field1868.getCodeBase(), arg1)).toString() });
                class107 var4 = new class107();
                var4.field1419 = 1;
                return var4;
            } catch (Throwable var10) {
                class107 var5 = new class107();
                var5.field1419 = 2;
                return var5;
            }
        } else if (~arg3 == -3) {
            try {
                class144.field1868.getAppletContext().showDocument(new URL(class144.field1868.getCodeBase(), arg1), "_blank");
                class107 var6 = new class107();
                var6.field1419 = 1;
                return var6;
            } catch (Exception var11) {
                class107 var7 = new class107();
                var7.field1419 = 2;
                return var7;
            }
        } else {
            if (arg0 != -18871) {
                method659(103, -97);
            }
            if (arg3 == 3) {
                try {
                    class679.method3851("loggedout", class144.field1868, -26978);
                } catch (Throwable var13) {
                }
                try {
                    class144.field1868.getAppletContext().showDocument(new URL(class144.field1868.getCodeBase(), arg1), "_top");
                    class107 var8 = new class107();
                    var8.field1419 = 1;
                    return var8;
                } catch (Exception var12) {
                    class107 var9 = new class107();
                    var9.field1419 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILji;B)V", line = 185)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 >= -92) {
            this.field1250 = 113;
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field1253 = arg1.method3402((byte) 127);
                }
            } else {
                this.field1250 = arg1.method3428((byte) 8);
            }
        } else {
            this.field1252 = arg1.method3428((byte) 126);
        }
        ++field1245;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V", line = 263)
    public class96() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(B)V", line = 234)
    public static final void method661(byte arg0) {
        int var1 = 63 % ((37 - arg0) / 59);
        ++field1249;
        if (class595.field8291) {
            class218 var2 = class408.method2359((byte) 72, class631.field8779, class355.field4735);
            if (var2 != null && var2.field2799 != null) {
                class404 var3 = new class404();
                var3.field5714 = var2;
                var3.field5709 = var2.field2799;
                class498.method2775(var3);
            }
            class595.field8291 = false;
            class169.field2109 = -1;
            class553.field7817 = -1;
            if (var2 != null) {
                class277.method1652(1, var2);
            }
        }
    }
}
