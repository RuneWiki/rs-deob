import jagex3.jagmisc.jagmisc;
import java.net.InetAddress;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class306 implements Runnable {

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Lrh;")
    private class59 field4110 = new class59();

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Ljava/lang/Thread;")
    private Thread field4115 = new Thread(this);

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4106 = 0;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4114 = null;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Lcb;")
    public static class318 field4104 = new class318(50, 6);

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "J")
    public static volatile long field4117 = 0L;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
    public final void method1834(byte arg0) {
        if (arg0 > -73) {
            return;
        }
        field4112++;
        if (this.field4115 == null) {
            return;
        }
        this.method1839(new class28(), false);
        try {
            this.field4115.join();
        } catch (InterruptedException var2) {
        }
        this.field4115 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II[FIIIIFIIF)V")
    public static final void method1835(int arg0, int arg1, float[] arg2, int arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9, float arg10) {
        int var11 = arg0 - arg6;
        field4108++;
        int var12 = arg3 - arg8;
        int var13 = arg4 - arg1;
        float var14 = arg2[2] * (float) var12 + arg2[0] * (float) var13 + arg2[1] * (float) var11;
        float var15 = arg2[5] * (float) var12 + arg2[3] * (float) var13 + arg2[4] * (float) var11;
        float var16 = arg2[8] * (float) var12 + arg2[7] * (float) var11 + arg2[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var17 = arg7 * var17;
        }
        float var18 = var15 + arg10 + 0.5F;
        if (arg9 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg9 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg9 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class676.field9578 = var17;
        class61.field845 = var18;
        if (arg5 != -4) {
            field4114 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)S")
    public static final short method1836(int arg0, int arg1) {
        field4116++;
        int var2 = arg1 >> 10 & 0x3F;
        int var3 = (arg1 & 0x384) >> 3;
        int var4 = arg1 & arg0;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)I")
    public static final int method1837(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        field4109++;
        if (arg0 >= -112) {
            field4106 = 117;
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)Lek;")
    public static final class540 method1838(int arg0, byte arg1) {
        field4107++;
        if (arg1 >= -42) {
            return null;
        }
        if (arg0 == 0) {
            if ((double) class561.field7651 == 3.0D) {
                return class227.field2972;
            }
            if ((double) class561.field7651 == 4.0D) {
                return class436.field6033;
            }
            if ((double) class561.field7651 == 6.0D) {
                return class426.field5925;
            }
            if ((double) class561.field7651 >= 8.0D) {
                return class654.field9262;
            }
        } else if (arg0 == 1) {
            if ((double) class561.field7651 == 3.0D) {
                return class426.field5925;
            }
            if ((double) class561.field7651 == 4.0D) {
                return class654.field9262;
            }
            if ((double) class561.field7651 == 6.0D) {
                return class2.field16;
            }
            if ((double) class561.field7651 >= 8.0D) {
                return class643.field9113;
            }
        } else if (arg0 == 2) {
            if ((double) class561.field7651 == 3.0D) {
                return class2.field16;
            }
            if ((double) class561.field7651 == 4.0D) {
                return class643.field9113;
            }
            if ((double) class561.field7651 == 6.0D) {
                return class282.field3781;
            }
            if ((double) class561.field7651 >= 8.0D) {
                return class85.field1050;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uj", name = "run", descriptor = "()V")
    public final void run() {
        field4113++;
        while (true) {
            class59 var1 = this.field4110;
            class98 var3;
            synchronized (this.field4110) {
                class28 var2;
                for (var2 = this.field4110.method368(52); var2 == null; var2 = this.field4110.method368(47)) {
                    try {
                        this.field4110.wait();
                    } catch (InterruptedException var8) {
                    }
                }
                if (!(var2 instanceof class98)) {
                    return;
                }
                var3 = (class98) var2;
            }
            int var5;
            try {
                byte[] var4 = InetAddress.getByName(var3.field1202).getAddress();
                var5 = jagmisc.ping(var4[0], var4[1], var4[2], var4[3], 1000L);
            } catch (Throwable var9) {
                var5 = 1000;
            }
            var3.field1204 = var5;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lsf;Z)V")
    private final void method1839(class28 arg0, boolean arg1) {
        class59 var3 = this.field4110;
        synchronized (this.field4110) {
            this.field4110.method378(arg0, 31316);
            this.field4110.notify();
        }
        if (!arg1) {
            field4105++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;B)Ldi;")
    public final class98 method1840(String arg0, byte arg1) {
        field4111++;
        if (this.field4115 == null) {
            throw new IllegalStateException("");
        } else if (arg0 == null) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 >= -106) {
                this.method1839(null, false);
            }
            class98 var3 = new class98(arg0);
            this.method1839(var3, false);
            return var3;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public static void method1841(int arg0) {
        int var1 = -79 % ((-arg0 - 24) / 58);
        field4104 = null;
        field4114 = null;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "()V")
    public class306() {
        this.field4115.setDaemon(true);
        this.field4115.start();
    }
}
