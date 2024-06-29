import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class433 {

    @OriginalMember(owner = "client!vaa", name = "i", descriptor = "Llga;")
    private class663 field6038 = new class663(64);

    @OriginalMember(owner = "client!vaa", name = "j", descriptor = "Lsea;")
    private class648 field6039;

    @OriginalMember(owner = "client!vaa", name = "e", descriptor = "I")
    public static int field6034 = 0;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "I")
    public static int field6031;

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!vaa", name = "f", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!vaa", name = "g", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!vaa", name = "h", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!vaa", name = "d", descriptor = "Lnk;")
    public static class668 field6033;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V")
    public static final void method2481(int arg0) {
        field6032++;
        if (arg0 != -1) {
            method2486(false);
        }
        class660.field9184.method2594(true);
        int var1 = class660.field9184.method2592((byte) -121, 8);
        if (var1 < class698.field9912) {
            for (int var2 = var1; var2 < class698.field9912; var2++) {
                class475.field6544[class470.field6489++] = class636.field8790[var2];
            }
        }
        if (var1 > class698.field9912) {
            throw new RuntimeException("gnpov1");
        }
        class698.field9912 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class636.field8790[var3];
            class61 var5 = ((class393) class299.field4071.method970((byte) 89, (long) var4)).field5552;
            int var6 = class660.field9184.method2592((byte) 56, 1);
            if (var6 == 0) {
                class636.field8790[class698.field9912++] = var4;
                var5.field1716 = class186.field2697;
            } else {
                int var7 = class660.field9184.method2592((byte) -121, 2);
                if (var7 == 0) {
                    class636.field8790[class698.field9912++] = var4;
                    var5.field1716 = class186.field2697;
                    class85.field1255[class562.field7587++] = var4;
                } else if (var7 == 1) {
                    class636.field8790[class698.field9912++] = var4;
                    var5.field1716 = class186.field2697;
                    int var8 = class660.field9184.method2592((byte) -113, 3);
                    var5.method501(1, var8, false);
                    int var9 = class660.field9184.method2592((byte) 112, 1);
                    if (var9 == 1) {
                        class85.field1255[class562.field7587++] = var4;
                    }
                } else if (var7 == 2) {
                    class636.field8790[class698.field9912++] = var4;
                    var5.field1716 = class186.field2697;
                    if (class660.field9184.method2592((byte) 108, 1) == 1) {
                        int var10 = class660.field9184.method2592((byte) 29, 3);
                        var5.method501(2, var10, false);
                        int var11 = class660.field9184.method2592((byte) 68, 3);
                        var5.method501(2, var11, false);
                    } else {
                        int var12 = class660.field9184.method2592((byte) -106, 3);
                        var5.method501(0, var12, false);
                    }
                    int var13 = class660.field9184.method2592((byte) 30, 1);
                    if (var13 == 1) {
                        class85.field1255[class562.field7587++] = var4;
                    }
                } else if (var7 == 3) {
                    class475.field6544[class470.field6489++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)Lgea;")
    public final class67 method2482(int arg0, int arg1) {
        field6037++;
        class663 var3 = this.field6038;
        class67 var4;
        synchronized (this.field6038) {
            var4 = (class67) this.field6038.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field6039;
        byte[] var6;
        synchronized (this.field6039) {
            var6 = this.field6039.method3654(-15615, 32, arg0);
        }
        if (arg1 < 98) {
            field6033 = null;
        }
        class67 var7 = new class67();
        if (var6 != null) {
            var7.method567(false, new class501(var6));
        }
        class663 var8 = this.field6038;
        synchronized (this.field6038) {
            this.field6038.method3748((long) arg0, var7, 12537);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)V")
    public final void method2483(boolean arg0) {
        class663 var2 = this.field6038;
        synchronized (this.field6038) {
            this.field6038.method3749(7648);
        }
        if (!arg0) {
            field6033 = null;
        }
        field6035++;
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(II)V")
    public final void method2484(int arg0, int arg1) {
        field6031++;
        class663 var3 = this.field6038;
        synchronized (this.field6038) {
            if (arg0 != 3) {
                this.field6039 = null;
            }
            this.field6038.method3754(arg1, true);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(B)V")
    public static void method2485(byte arg0) {
        field6033 = null;
        if (arg0 != 14) {
            method2485((byte) 112);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(Z)V")
    public static final void method2486(boolean arg0) {
        if (!arg0) {
            return;
        }
        field6030++;
        if (!class80.field1206) {
            return;
        }
        while (true) {
            while (class362.field4777.length > class474.field6529) {
                class228 var1 = class362.field4777[class474.field6529];
                if (var1 != null && var1.field3172 == -1) {
                    if (class209.field2949 == null) {
                        class209.field2949 = class531.field7185.method2901(var1.field3167, 15328);
                    }
                    int var2 = class209.field2949.field2204;
                    if (var2 == -1) {
                        return;
                    }
                    class209.field2949 = null;
                    class474.field6529++;
                    var1.field3172 = var2;
                } else {
                    class474.field6529++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
    public final void method2487(byte arg0) {
        class663 var2 = this.field6038;
        synchronized (this.field6038) {
            this.field6038.method3755(19713);
        }
        int var3 = -62 % ((arg0 + 39) / 58);
        field6036++;
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lci;ILsea;)V")
    public class433(class414 arg0, int arg1, class648 arg2) {
        this.field6039 = arg2;
        this.field6039.method3653(32, true);
    }
}
