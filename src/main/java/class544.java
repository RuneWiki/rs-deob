import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class544 {

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "Lcp;")
    private class271 field7544 = new class271();

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "Ljava/lang/String;")
    public String field7549;

    @OriginalMember(owner = "client!gda", name = "l", descriptor = "F")
    public static float field7551;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "I")
    public static int field7540;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "I")
    public static int field7541;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "I")
    public static int field7542;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "I")
    public static int field7545;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field7546;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field7547;

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!gda", name = "m", descriptor = "I")
    private volatile int field7552;

    @OriginalMember(owner = "client!gda", name = "n", descriptor = "Lrh;")
    private class718 field7553;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ILnfa;)V")
    public final void method3146(int arg0, class745 arg1) {
        field7546++;
        arg1.field10351 = false;
        class271 var3 = this.field7544;
        synchronized (this.field7544) {
            this.field7544.method1734(arg1, arg0);
            this.field7552++;
        }
        if (this.field7553 != null) {
            class718 var4 = this.field7553;
            synchronized (this.field7553) {
                this.field7553.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(ZLnfa;)V")
    public final void method3147(boolean arg0, class745 arg1) {
        arg1.field10351 = arg0;
        field7541++;
        class271 var3 = this.field7544;
        synchronized (this.field7544) {
            this.field7544.method1734(arg1, 0);
            this.field7552++;
        }
        if (this.field7553 != null) {
            class718 var4 = this.field7553;
            synchronized (this.field7553) {
                this.field7553.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lca;I)V")
    public final void method3148(class139 arg0, int arg1) {
        class271 var3 = this.field7544;
        synchronized (this.field7544) {
            this.field7544.method1734(arg0, arg1 - 4);
            this.field7552++;
        }
        if (arg1 != 4) {
            this.field7553 = null;
        }
        field7542++;
        if (this.field7553 != null) {
            class718 var4 = this.field7553;
            synchronized (this.field7553) {
                this.field7553.notify();
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lrh;I)V")
    public final void method3149(class718 arg0, int arg1) {
        if (arg1 < -37) {
            this.field7553 = arg0;
            field7540++;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I[B)V")
    public static final void method3150(int arg0, byte[] arg1) {
        field7547++;
        class431 var2 = new class431(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method2557(14929);
                if (var3 == 0) {
                    if (arg0 != 19800) {
                        field7551 = 0.17691752F;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class724.field10096 = new int[6];
                    var4[0] = var2.method2565((byte) -126);
                    var4[1] = var2.method2565((byte) -112);
                    var4[2] = var2.method2565((byte) -120);
                    var4[3] = var2.method2565((byte) -86);
                    var4[4] = var2.method2565((byte) -85);
                    var4[5] = var2.method2565((byte) -110);
                } else if (var3 == 4) {
                    int var5 = var2.method2557(arg0 - 4871);
                    class399.field5504 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class399.field5504[var6] = var2.method2565((byte) -111);
                        if (class399.field5504[var6] == 65535) {
                            class399.field5504[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method2557(14929);
                    class112.field1624 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class112.field1624[var8] = var2.method2565((byte) -112);
                        if (class112.field1624[var8] == 65535) {
                            class112.field1624[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(BCLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method3151(byte arg0, char arg1, String arg2) {
        field7548++;
        int var3 = class120.method1057(0, arg2, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 81 % ((16 - arg0) / 40);
        int var7 = 0;
        for (int var8 = 0; var8 < var3; var8++) {
            int var9;
            for (var9 = var7; arg2.charAt(var9) != arg1; var9++) {
            }
            var4[var5++] = arg2.substring(var7, var9);
            var7 = var9 + 1;
        }
        var4[var3] = arg2.substring(var7);
        return var4;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 > -82) {
            method3152(-86, -107, -104, 22, -26, -13, 52, -64);
        }
        field7543++;
        if (arg0 == arg4) {
            class739.method4070(arg0, false, arg3, arg5, arg1, arg2, arg6);
        } else if (arg1 - arg0 >= class742.field10301 && (arg0 + arg1) <= class435.field6058 && arg5 - arg4 >= class515.field7102 && (arg4 + arg5) <= class698.field9801) {
            class573.method3309(arg2, arg3, arg5, arg6, arg1, arg0, -123, arg4);
        } else {
            class245.method1628(arg4, arg1, arg5, arg0, (byte) 119, arg3, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)Ljda;")
    public final class91 method3153(int arg0) {
        if (arg0 != -1) {
            return null;
        }
        field7545++;
        Object var2 = null;
        class271 var3 = this.field7544;
        synchronized (this.field7544) {
            class91 var4 = this.field7544.method1730((byte) 90);
            var4.method781(arg0 + 5556);
            this.field7552--;
            return var4;
        }
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)Z")
    public final boolean method3154(boolean arg0) {
        if (!arg0) {
            this.field7549 = null;
        }
        field7550++;
        return this.field7552 == 0;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class544(String arg0) {
        this.field7549 = arg0;
    }
}
