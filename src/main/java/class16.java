import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class16 implements Runnable {

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lnf;")
    private class251 field184 = new class251();

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Z")
    private boolean field188 = false;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public int field190 = 0;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field187;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field179 = "Loaded input handler";

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Ljava/lang/String;")
    public static String field182 = "Loaded update list";

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field185 = 5063219;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Llm;")
    public static class210 field180;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Z")
    public static boolean field176;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Log;II)Lnc;", line = 5)
    public final class13 method99(class283 arg0, int arg1, int arg2) {
        if (arg2 != 22414) {
            method100(-26);
        }
        field186++;
        class13 var4 = new class13();
        var4.field145 = 3;
        var4.field144 = arg0;
        var4.field1135 = false;
        var4.field2955 = (long) arg1;
        this.method101(var4, -2004);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V", line = 23)
    public static void method100(int arg0) {
        field180 = null;
        field179 = null;
        field182 = null;
        if (arg0 != -30922) {
            field180 = (class210) null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lnc;I)V", line = 36)
    private final void method101(class13 arg0, int arg1) {
        field181++;
        class251 var3 = this.field184;
        synchronized (this.field184) {
            if (arg1 != -2004) {
                this.method102(54, (byte) 8, (class283) null, (byte[]) null);
            }
            this.field184.method1697(34, arg0);
            this.field190++;
            this.field184.notifyAll();
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBLog;[B)Lnc;", line = 53)
    public final class13 method102(int arg0, byte arg1, class283 arg2, byte[] arg3) {
        field175++;
        class13 var5 = new class13();
        var5.field2955 = (long) arg0;
        var5.field145 = 2;
        var5.field1135 = false;
        if (arg1 != -51) {
            this.method103(-114, 43, (class283) null);
        }
        var5.field143 = arg3;
        var5.field144 = arg2;
        this.method101(var5, -2004);
        return var5;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILog;)Lnc;", line = 73)
    public final class13 method103(int arg0, int arg1, class283 arg2) {
        field183++;
        class13 var4 = new class13();
        if (arg1 >= -120) {
            field178 = 54;
        }
        var4.field145 = 1;
        class251 var5 = this.field184;
        synchronized (this.field184) {
            class13 var6 = (class13) this.field184.method1696(101);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field2955 && var6.field144 == arg2 && var6.field145 == 2) {
                    var4.field143 = var6.field143;
                    var4.field1129 = false;
                    return var4;
                }
                var6 = (class13) this.field184.method1695(-12509);
            }
        }
        var4.field143 = arg2.method1972((byte) -43, arg0);
        var4.field1135 = true;
        var4.field1129 = false;
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILlm;)V", line = 107)
    public static final void method104(int arg0, class210 arg1) {
        class176.field2604 = arg1;
        field177++;
        if (arg0 != 27665) {
            method104(49, (class210) null);
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)Z", line = 117)
    public static final boolean method105(int arg0, int arg1, int arg2, int arg3) {
        if (!class310.method2143(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class294.field4502[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class44.field556) {
                    if (!class3.method7(var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method7(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method7(var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method7(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class3.method7(var4, var8, var5)) {
                    return false;
                }
                if (!class3.method7(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class316.field4773) {
                    if (!class3.method7(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class3.method7(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method7(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class3.method7(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class3.method7(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class3.method7(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class44.field556) {
                    if (!class3.method7(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class3.method7(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method7(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class3.method7(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class3.method7(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class3.method7(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class316.field4773) {
                    if (!class3.method7(var4, var6, var5)) {
                        return false;
                    }
                    if (!class3.method7(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class3.method7(var4, var7, var5)) {
                        return false;
                    }
                    if (!class3.method7(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class3.method7(var4, var8, var5)) {
                    return false;
                }
                if (!class3.method7(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class3.method7(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class3.method7(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class3.method7(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class3.method7(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class3.method7(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "run", descriptor = "()V", line = 308)
    public final void run() {
        field174++;
        while (!this.field188) {
            class251 var1 = this.field184;
            class13 var2;
            synchronized (this.field184) {
                var2 = (class13) this.field184.method1698((byte) 12);
                if (var2 == null) {
                    try {
                        this.field184.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field190--;
            }
            try {
                if (var2.field145 == 2) {
                    var2.field144.method1977(var2.field143.length, (byte) 120, (int) var2.field2955, var2.field143);
                } else if (var2.field145 == 3) {
                    var2.field143 = var2.field144.method1972((byte) -43, (int) var2.field2955);
                }
            } catch (Exception var6) {
                class19.method122(var6, (String) null, (byte) -107);
            }
            var2.field1129 = false;
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V", line = 356)
    public final void method106(int arg0) {
        this.field188 = true;
        class251 var2 = this.field184;
        synchronized (this.field184) {
            this.field184.notifyAll();
        }
        try {
            this.field187.join();
            if (arg0 != 128) {
                this.field184 = (class251) null;
            }
        } catch (InterruptedException var5) {
        }
        field189++;
        this.field187 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 393)
    public class16() {
        class227 var1 = class274.field4200.method1770((byte) 59, 5, this);
        while (var1.field3456 == 0) {
            class93.method662(-553, 10L);
        }
        if (var1.field3456 == 2) {
            throw new RuntimeException();
        }
        this.field187 = (Thread) var1.field3452;
    }
}
