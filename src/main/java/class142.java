import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class142 implements Runnable {

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Lkb;")
    private class315 field2257 = new class315();

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Z")
    private boolean field2260 = false;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public int field2266 = 0;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Ljava/lang/Thread;")
    private Thread field2265;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lug;")
    public static class253 field2252;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[Lnn;")
    public static class187[] field2251;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILga;I)Loe;", line = 5)
    public final class82 method1055(int arg0, class180 arg1, int arg2) {
        class82 var4 = new class82();
        var4.field1118 = 1;
        field2258++;
        class315 var5 = this.field2257;
        synchronized (this.field2257) {
            for (class82 var6 = (class82) this.field2257.method2198(200); var6 != null; var6 = (class82) this.field2257.method2192((byte) -88)) {
                if (((long) arg0) == var6.field4294 && var6.field1123 == arg1 && var6.field1118 == 2) {
                    var4.field1122 = var6.field1122;
                    var4.field3055 = false;
                    return var4;
                }
            }
        }
        var4.field1122 = arg1.method1328(arg0, (byte) -103);
        var4.field3056 = true;
        var4.field3055 = false;
        return arg2 == -3 ? var4 : (class82) null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLoe;)V", line = 39)
    private final void method1056(byte arg0, class82 arg1) {
        field2259++;
        class315 var3 = this.field2257;
        synchronized (this.field2257) {
            this.field2257.method2197((byte) -105, arg1);
            this.field2266++;
            if (arg0 == 86) {
                this.field2257.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[BLga;B)Loe;", line = 55)
    public final class82 method1057(int arg0, byte[] arg1, class180 arg2, byte arg3) {
        field2264++;
        if (arg3 != -127) {
            this.field2265 = (Thread) null;
        }
        class82 var5 = new class82();
        var5.field1122 = arg1;
        var5.field1123 = arg2;
        var5.field4294 = (long) arg0;
        var5.field1118 = 2;
        var5.field3056 = false;
        this.method1056((byte) 86, var5);
        return var5;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V", line = 74)
    public static void method1058(int arg0) {
        field2252 = null;
        if (arg0 != 1) {
            field2252 = (class253) null;
        }
        field2251 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)Loa;", line = 86)
    public static final class318 method1059(int arg0, int arg1) {
        if (arg0 >= -19) {
            field2252 = (class253) null;
        }
        class318 var2 = (class318) class286.field4421.method1628(true, (long) arg1);
        field2256++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class60.field877.method1813(arg1 & 0x7FFF, 1, true);
        } else {
            var3 = class279.field4297.method1813(arg1, 1, true);
        }
        class318 var4 = new class318();
        if (var3 != null) {
            var4.method2234((byte) 97, new class6(var3));
        }
        if (arg1 >= 32768) {
            var4.method2227((byte) 71);
        }
        class286.field4421.method1627((byte) 97, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIZFIII)[I", line = 117)
    public static final int[] method1060(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5, int arg6, int arg7) {
        if (arg2 != 2) {
            method1059(-82, 46);
        }
        int[] var8 = new int[arg1];
        field2255++;
        class113 var9 = new class113();
        var9.field1576 = arg5;
        var9.field1563 = arg7;
        var9.field1562 = arg3;
        var9.field1584 = (int) (arg4 * 4096.0F);
        var9.field1564 = arg0;
        var9.field1588 = arg6;
        var9.method99((byte) 31);
        class121.method874(arg1, 1, true);
        var9.method804(var8, -123, 0);
        return var8;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BILga;)Loe;", line = 144)
    public final class82 method1061(byte arg0, int arg1, class180 arg2) {
        field2253++;
        class82 var4 = new class82();
        var4.field1118 = 3;
        var4.field4294 = (long) arg1;
        if (arg0 != -9) {
            this.field2266 = -50;
        }
        var4.field3056 = false;
        var4.field1123 = arg2;
        this.method1056((byte) 86, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wb", name = "run", descriptor = "()V", line = 166)
    public final void run() {
        while (!this.field2260) {
            class315 var1 = this.field2257;
            class82 var2;
            synchronized (this.field2257) {
                var2 = (class82) this.field2257.method2196((byte) -36);
                if (var2 == null) {
                    try {
                        this.field2257.wait();
                    } catch (InterruptedException var6) {
                    }
                    continue;
                }
                this.field2266--;
            }
            try {
                if (var2.field1118 == 2) {
                    var2.field1123.method1329((byte) -61, var2.field1122.length, (int) var2.field4294, var2.field1122);
                } else if (var2.field1118 == 3) {
                    var2.field1122 = var2.field1123.method1328((int) var2.field4294, (byte) -94);
                }
            } catch (Exception var7) {
                client.method949((String) null, var7, 24);
            }
            var2.field3055 = false;
        }
        field2262++;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 341)
    public class142() {
        class114 var1 = class42.field581.method1014(this, 6, 5);
        while (var1.field1595 == 0) {
            class272.method1918((byte) 22, 10L);
        }
        if (var1.field1595 == 2) {
            throw new RuntimeException();
        }
        this.field2265 = (Thread) var1.field1591;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 214)
    public final void method1062(byte arg0) {
        this.field2260 = true;
        class315 var2 = this.field2257;
        synchronized (this.field2257) {
            this.field2257.notifyAll();
        }
        try {
            this.field2265.join();
        } catch (InterruptedException var5) {
        }
        this.field2265 = null;
        field2261++;
        if (arg0 != 79) {
            method1063(-101, 11);
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V", line = 238)
    public static final void method1063(int arg0, int arg1) {
        class181.field2942.method1353(-1, arg0);
        class26.field385.method1353(-1, arg0);
        field2263++;
        int var2 = 28 / ((-arg1 - 13) / 59);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V", line = 251)
    public static final void method1064(int arg0) {
        int var1 = 40 % ((-arg0 - 7) / 59);
        field2254++;
        class111.field1544.method1941(128);
        int var2 = class111.field1544.method1950((byte) 114, 1);
        if (var2 == 0) {
            return;
        }
        int var3 = class111.field1544.method1950((byte) -32, 2);
        if (var3 == 0) {
            class36.field526[class277.field4285++] = 2047;
        } else if (var3 == 1) {
            int var12 = class111.field1544.method1950((byte) 111, 3);
            class146.field2310.method2095(1, -1, var12);
            int var13 = class111.field1544.method1950((byte) -38, 1);
            if (var13 == 1) {
                class36.field526[class277.field4285++] = 2047;
            }
        } else if (var3 == 2) {
            if (class111.field1544.method1950((byte) 117, 1) == 1) {
                int var8 = class111.field1544.method1950((byte) -70, 3);
                class146.field2310.method2095(2, -1, var8);
                int var9 = class111.field1544.method1950((byte) -10, 3);
                class146.field2310.method2095(2, -1, var9);
            } else {
                int var10 = class111.field1544.method1950((byte) -42, 3);
                class146.field2310.method2095(0, -1, var10);
            }
            int var11 = class111.field1544.method1950((byte) -95, 1);
            if (var11 == 1) {
                class36.field526[class277.field4285++] = 2047;
            }
        } else if (var3 == 3) {
            int var4 = class111.field1544.method1950((byte) 74, 7);
            int var5 = class111.field1544.method1950((byte) -102, 7);
            class154.field2392 = class111.field1544.method1950((byte) -103, 2);
            int var6 = class111.field1544.method1950((byte) 86, 1);
            if (var6 == 1) {
                class36.field526[class277.field4285++] = 2047;
            }
            int var7 = class111.field1544.method1950((byte) 110, 1);
            class146.field2310.method2339(var5, true, var7 == 1, var4);
        }
    }
}
