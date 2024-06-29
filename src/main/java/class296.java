import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class296 {

    @OriginalMember(owner = "client!st", name = "g", descriptor = "Lts;")
    private class371 field4211 = new class371();

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field4212 = 0;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field4217 = 0;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "Lts;")
    private class371 field4218;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IILjava/lang/String;Lji;)Lrm;")
    public static final class281 method1872(int arg0, int arg1, String arg2, class432 arg3) {
        field4207++;
        if (arg0 != 10294) {
            method1872(-119, 126, null, null);
        }
        if (arg1 == 0) {
            return arg3.method2597(arg2, arg0 - 10230);
        } else if (arg1 == 1) {
            try {
                class501.method2994(-14557, new Object[] { (new URL(arg3.field6462.getCodeBase(), arg2)).toString() }, arg3.field6462, "openjs");
                class281 var4 = new class281();
                var4.field4032 = 1;
                return var4;
            } catch (Throwable var10) {
                class281 var5 = new class281();
                var5.field4032 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg3.field6462.getAppletContext().showDocument(new URL(arg3.field6462.getCodeBase(), arg2), "_blank");
                class281 var6 = new class281();
                var6.field4032 = 1;
                return var6;
            } catch (Exception var11) {
                class281 var7 = new class281();
                var7.field4032 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class501.method2995("loggedout", (byte) 89, arg3.field6462);
            } catch (Throwable var13) {
            }
            try {
                arg3.field6462.getAppletContext().showDocument(new URL(arg3.field6462.getCodeBase(), arg2), "_top");
                class281 var8 = new class281();
                var8.field4032 = 1;
                return var8;
            } catch (Exception var12) {
                class281 var9 = new class281();
                var9.field4032 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)Lts;")
    public final class371 method1873(byte arg0) {
        field4209++;
        class371 var2 = this.field4211.field5665;
        int var3 = 120 % ((-arg0 - 79) / 41);
        if (this.field4211 == var2) {
            this.field4218 = null;
            return null;
        } else {
            this.field4218 = var2.field5665;
            return var2;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(Z)Lts;")
    public final class371 method1874(boolean arg0) {
        field4219++;
        if (arg0) {
            return null;
        }
        class371 var2 = this.field4211.field5663;
        if (this.field4211 == var2) {
            this.field4218 = null;
            return null;
        } else {
            this.field4218 = var2.field5663;
            return var2;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)Lts;")
    public final class371 method1875(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        field4206++;
        class371 var2 = this.field4211.field5665;
        if (this.field4211 == var2) {
            return null;
        } else {
            var2.method2289((byte) -55);
            return var2;
        }
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)I")
    public final int method1876(int arg0) {
        field4208++;
        if (arg0 != -12569) {
            field4216 = -43;
        }
        int var2 = 0;
        for (class371 var3 = this.field4211.field5665; var3 != this.field4211; var3 = var3.field5665) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!st", name = "c", descriptor = "(I)Z")
    public final boolean method1877(int arg0) {
        field4210++;
        if (arg0 != -26266) {
            this.method1876(-19);
        }
        return this.field4211.field5665 == this.field4211;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILts;)V")
    public final void method1878(int arg0, class371 arg1) {
        if (arg1.field5663 != null) {
            arg1.method2289((byte) -55);
        }
        field4213++;
        arg1.field5663 = this.field4211.field5663;
        arg1.field5665 = this.field4211;
        arg1.field5663.field5665 = arg1;
        if (arg0 != 2) {
            this.method1874(true);
        }
        arg1.field5665.field5663 = arg1;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)I")
    public static final int method1879(int arg0, int arg1, int arg2) {
        field4214++;
        int var3 = class404.method2430(arg2 + 45365, 4, arg1 + 91923, -1) + ((class404.method2430(arg2 + 10294, 2, arg1 + 37821, -1) - 128 >> 1) - -(class404.method2430(arg2, 1, arg1, -1) - 128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        int var5 = -92 / ((arg0 + 61) / 62);
        return var4;
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(I)Lts;")
    public final class371 method1880(int arg0) {
        if (arg0 != -61) {
            return null;
        }
        field4205++;
        class371 var2 = this.field4218;
        if (this.field4211 == var2) {
            this.field4218 = null;
            return null;
        } else {
            this.field4218 = var2.field5665;
            return var2;
        }
    }

    @OriginalMember(owner = "client!st", name = "e", descriptor = "(I)V")
    public final void method1881(int arg0) {
        while (true) {
            class371 var2 = this.field4211.field5665;
            if (this.field4211 == var2) {
                if (arg0 != 2) {
                    field4216 = -78;
                }
                field4215++;
                this.field4218 = null;
                return;
            }
            var2.method2289((byte) -55);
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V")
    public class296() {
        this.field4211.field5663 = this.field4211;
        this.field4211.field5665 = this.field4211;
    }
}
