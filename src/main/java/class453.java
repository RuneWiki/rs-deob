import java.awt.Container;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class453 implements Runnable {

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lrk;")
    private class201 field6279 = new class697();

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lrk;")
    private class201 field6281 = null;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "[I")
    public static int[] field6273 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "F")
    public static float field6271;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    private int field6285;

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    private int field6286;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "J")
    private long field6284;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "J")
    private long field6288;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "Lcia;")
    private class490 field6282;

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lha;")
    public static class548 field6283;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "Ljava/lang/String;")
    private String field6287;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
    private boolean field6267;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Z")
    private volatile boolean field6274;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static void method2767(int arg0) {
        field6283 = null;
        field6273 = null;
        if (arg0 != 0) {
            method2767(59);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lrk;I)V")
    public final synchronized void method2768(class201 arg0, int arg1) {
        if (arg1 != 255) {
            this.run();
        }
        this.field6281 = this.field6279;
        field6275++;
        this.field6279 = arg0;
        this.field6284 = class97.method664((byte) -50);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)I")
    public final int method2769(int arg0) {
        if (arg0 != 16777215) {
            this.field6287 = null;
        }
        field6278++;
        if (this.field6282 == null) {
            return 0;
        }
        int var2 = this.field6282.method2976((byte) 49);
        if (this.field6282.field6867 && this.field6282.field6864 > this.field6286) {
            return this.field6286 + 1;
        } else if (var2 >= 0 && (class383.field5501.length - 1) > var2) {
            return this.field6282.field6860 == this.field6286 ? this.field6282.field6864 : this.field6282.field6860;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)I")
    public final int method2770(byte arg0) {
        field6280++;
        return arg0 <= 42 ? 29 : this.field6285;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)Lcia;")
    public final class490 method2771(int arg0) {
        if (arg0 == -23515) {
            field6270++;
            return this.field6282;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(DI)V")
    public static final void method2772(double arg0, int arg1) {
        if (class483.field6740 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class11.field97[var3] = var4 > 255 ? 255 : var4;
            }
            class483.field6740 = arg0;
        }
        field6262++;
        if (arg1 < 50) {
            field6276 = 72;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)J")
    public final long method2773(int arg0) {
        if (arg0 == -1) {
            field6277++;
            return this.field6288;
        } else {
            return 14L;
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public final void method2774(int arg0) {
        field6272++;
        if (arg0 >= -117) {
            this.field6282 = null;
        }
        this.field6274 = true;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)Ljava/lang/String;")
    public final String method2775(int arg0) {
        if (arg0 != 0) {
            this.field6279 = null;
        }
        field6263++;
        return this.field6287;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)V")
    public final synchronized void method2776(int arg0) {
        if (arg0 != -27995) {
            this.method2778(-23, 73L, null, -12, null);
        }
        this.field6267 = true;
        field6264++;
    }

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)I")
    public final int method2777(int arg0) {
        field6265++;
        if (arg0 != 20) {
            method2772(-2.0417338249996617D, 98);
        }
        return this.field6286;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IJLjava/lang/String;ILcia;)V")
    public final synchronized void method2778(int arg0, long arg1, String arg2, int arg3, class490 arg4) {
        field6269++;
        this.field6286 = arg3;
        if (arg0 != 1) {
            this.method2771(118);
        }
        this.field6282 = arg4;
        this.field6288 = arg1;
        this.field6287 = arg2;
    }

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "(I)Z")
    public final synchronized boolean method2779(int arg0) {
        if (arg0 == 1) {
            field6268++;
            return this.field6279.method1222(this.field6284, arg0 ^ 0xFFFF88F8);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "run", descriptor = "()V")
    public final void run() {
        field6266++;
        while (!this.field6274) {
            long var1 = class97.method664((byte) -50);
            synchronized (this) {
                try {
                    this.field6285++;
                    if (this.field6279 instanceof class697) {
                        this.field6279.method1221(this.field6267, (byte) 27);
                    } else {
                        long var4 = class97.method664((byte) -50);
                        if (class129.field1802 == null || this.field6281 == null || this.field6281.method1223(false) == 0 || this.field6284 < (var4 - (long) this.field6281.method1223(false))) {
                            if (this.field6281 != null) {
                                this.field6267 = true;
                                this.field6281.method1225(13941);
                                this.field6281 = null;
                            }
                            if (this.field6267) {
                                class680.method3835((byte) -73);
                                if (class129.field1802 != null) {
                                    class129.field1802.method273(0);
                                }
                            }
                            this.field6279.method1221(this.field6267 || class129.field1802 != null && class129.field1802.method1430(), (byte) 27);
                        } else {
                            int var6 = (int) ((var4 - this.field6284) * 255L / (long) this.field6281.method1223(false));
                            int var7 = 255 - var6;
                            int var8 = var6 << 24 | 0xFFFFFF;
                            int var9 = var7 << 24 | 0xFFFFFF;
                            class680.method3835((byte) -73);
                            class129.field1802.method273(0);
                            class298 var10 = class129.field1802.method1471(class118.field1561, class553.field7716, true);
                            class129.field1802.method3246(0, var10);
                            this.field6281.method1221(true, (byte) 27);
                            class129.field1802.method302();
                            var10.method1013(0, 0, 0, var9, 1);
                            class129.field1802.method3246(0, var10);
                            class129.field1802.method273(0);
                            this.field6279.method1221(true, (byte) 27);
                            class129.field1802.method302();
                            var10.method1013(0, 0, 0, var8, 1);
                        }
                        try {
                            if (class129.field1802 != null && !(this.field6279 instanceof class697)) {
                                class129.field1802.method3253((byte) -3);
                            }
                        } catch (class692 var18) {
                            class31.method172(var18, var18.getMessage() + " (Recovered) " + class516.field7210.method2183(109), 0);
                            class393.method2459(0, true, 1);
                        }
                    }
                    Container var12;
                    if (class553.field7717 != null) {
                        var12 = class553.field7717;
                    } else if (class320.field4445 == null) {
                        var12 = class109.field1462;
                    } else {
                        var12 = class320.field4445;
                    }
                    var12.getSize();
                    var12.getSize();
                    if (class553.field7717 == var12) {
                        class553.field7717.getInsets();
                    }
                    this.field6267 = false;
                    if (class129.field1802 != null && !(this.field6279 instanceof class697) && this.field6282.method2976((byte) -84) < class490.field6888.method2976((byte) 83)) {
                        class569.method3341(29608);
                    }
                } catch (Exception var19) {
                    continue;
                }
            }
            long var13 = class97.method664((byte) -50);
            int var15 = (int) (var1 + 20L - var13);
            if (var15 > 0) {
                class688.method3874((long) var15, -7375);
            }
        }
    }
}
