import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class145 implements Runnable {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
    public boolean field2559 = true;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field2564 = new Object();

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
    public int[] field2567 = new int[500];

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[I")
    public int[] field2568 = new int[500];

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public int field2571 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lcd;")
    public static class64 field2560 = null;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "[B")
    public static byte[] field2558 = new byte[32896];

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Lcd;")
    public static class64 field2566;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "[[B")
    public static byte[][] field2572;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lqm;")
    public static class222 field2570;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "[Lqd;")
    public static class40[] field2565;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2558[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field2566 = class44.method335((byte) 71, "");
        field2572 = new byte[50][];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkh;ILte;I)V", line = 25)
    public static final void method1032(class13 arg0, int arg1, class282 arg2, int arg3) {
        field2563++;
        class253 var4 = new class253();
        if (arg1 != -30970) {
            return;
        }
        var4.field4420 = arg0.method152((byte) -117);
        var4.field4403 = arg0.method105((byte) 70);
        var4.field4419 = new class22[var4.field4420];
        var4.field4404 = new byte[var4.field4420][][];
        var4.field4414 = new int[var4.field4420];
        var4.field4408 = new class22[var4.field4420];
        var4.field4402 = new int[var4.field4420];
        var4.field4406 = new int[var4.field4420];
        for (int var5 = 0; var5 < var4.field4420; var5++) {
            try {
                int var6 = arg0.method152((byte) -72);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method104((byte) -125).method536(0));
                    String var8 = new String(arg0.method104((byte) 16).method536(0));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method105((byte) 91);
                    }
                    var4.field4406[var5] = var6;
                    var4.field4402[var5] = var9;
                    var4.field4419[var5] = arg2.method1965(class53.method400(var7, class74.method597(arg1, 30859)), var8, (byte) -50);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method104((byte) -28).method536(arg1 + 30970));
                    String var11 = new String(arg0.method104((byte) 102).method536(0));
                    int var12 = arg0.method152((byte) -91);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method104((byte) 126).method536(arg1 + 30970));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method105((byte) 38);
                            var15[var16] = new byte[var17];
                            arg0.method148(var15[var16], -2, 0, var17);
                        }
                    }
                    var4.field4406[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class53.method400(var13[var19], class74.method597(arg1, 30864));
                    }
                    var4.field4408[var5] = arg2.method1949(var18, class74.method597(arg1, -30970), var11, class53.method400(var10, -122));
                    var4.field4404[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4414[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4414[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4414[var5] = -3;
            } catch (Exception var28) {
                var4.field4414[var5] = -4;
            } catch (Throwable var29) {
                var4.field4414[var5] = -5;
            }
        }
        class244.field4233.method781(var4, 10751);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lqm;ILqm;)V", line = 139)
    public static final void method1033(class222 arg0, int arg1, class222 arg2) {
        field2561++;
        class180.field3091 = class125.method906(0, arg2, arg0, class312.field5281, -2);
        if (class123.field2216) {
            class111.field2066 = class139.method989(arg2, class312.field5281, -20950, 0, arg0);
        } else {
            class111.field2066 = (class231) class180.field3091;
        }
        class278.field4796 = class125.method906(0, arg2, arg0, class183.field3137, -2);
        class75.field1419 = class125.method906(arg1, arg2, arg0, class216.field3598, -2);
    }

    @OriginalMember(owner = "client!wb", name = "run", descriptor = "()V", line = 158)
    public final void run() {
        field2562++;
        while (this.field2559) {
            Object var1 = this.field2564;
            synchronized (this.field2564) {
                if (this.field2571 < 500) {
                    this.field2567[this.field2571] = class281.field4835;
                    this.field2568[this.field2571] = class188.field3213;
                    this.field2571++;
                }
            }
            class267.method1871(10, 50L);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 203)
    public static void method1034(byte arg0) {
        field2572 = (byte[][]) null;
        if (arg0 != -119) {
            method1035(64, 98, 94);
        }
        field2570 = null;
        field2565 = null;
        field2558 = null;
        field2560 = null;
        field2566 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)J", line = 218)
    public static final long method1035(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        return var3 == null || var3.field5079 == null ? 0L : var3.field5079.field3141;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIILsa;)V", line = 250)
    public static final void method1036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class103 arg6) {
        if (arg5 != -11927) {
            method1035(-87, 106, -18);
        }
        class99.method738((byte) 84, arg2, arg0, arg4, arg3, arg6.field1859, arg1, arg6.field1865);
        field2569++;
    }
}
