import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class192 implements class547 {

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "I")
    public int field2394;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public int field2393;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "Lct;")
    public class414 field2388;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "Lrc;")
    public class29 field2391;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "Lrga;")
    public static class280 field2387 = new class280(15, -1);

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "Lq;")
    public static class491 field2395;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ILdr;IIIIZ)V", line = 13)
    public static final void method1159(int arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2390++;
        if (class265.field3368 >= 50 || arg1 == null || arg1.field4973 == null || arg5 >= arg1.field4973.length || arg1.field4973[arg5] == null) {
            return;
        }
        int var7 = arg1.field4973[arg5][0];
        if (arg4 <= 58) {
            field2387 = null;
        }
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xEA) >> 5;
        if (arg1.field4973[arg5].length > 1) {
            int var10 = (int) (Math.random() * (double) arg1.field4973[arg5].length);
            if (var10 > 0) {
                var8 = arg1.field4973[arg5][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg6) {
                if (arg1.field4984) {
                    class602.method3306(var8, var9, 0, false, 255, false);
                    return;
                }
                class160.method925(255, var8, var9, 0, 29830);
            }
        } else if (class301.field3698.field6644 != 0) {
            int var12 = arg2 - 256 >> 9;
            int var13 = arg3 - 256 >> 9;
            class572.field7993[class265.field3368++] = new class377((byte) (arg1.field4984 ? 2 : 1), var8, var9, 0, 255, (arg0 << 24) + (var12 << 16) + (var13 << 8) + var11);
        }
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V", line = 75)
    public static void method1160(int arg0) {
        field2387 = null;
        if (arg0 < 110) {
            field2395 = null;
        }
        field2395 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)Lwea;", line = 87)
    public class259 method235(int arg0) {
        if (arg0 < 38) {
            field2395 = null;
        }
        field2392++;
        return class349.field4462;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "()V", line = 101)
    public static final void method1161() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class455.field5825.length; var1++) {
                if (class455.field5825[var1].method1472()) {
                    class67.field907[var1] = class455.field5825[var1].method1474();
                } else {
                    synchronized (class455.field5825[var1]) {
                        class455.field5825[var1].notify();
                    }
                    var0 = false;
                }
            }
            if (var0) {
                class455.field5825[class455.field5825.length - 1].method1471();
                class691.method3884(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class455.field5825.length - 1; var4++) {
                        if (!class455.field5825[var4].method1472()) {
                            synchronized (class455.field5825[var4]) {
                                class455.field5825[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class455.field5825.length - 2; var6++) {
                            class455.field5825[var6].method1471();
                        }
                        class691.method3884(2);
                        while (!class455.field5825[0].method1472()) {
                            synchronized (class455.field5825[0]) {
                                class455.field5825[0].notify();
                            }
                            try {
                                class419.method2233(-28448, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class455.field5825[0].method1471();
                        return;
                    }
                    try {
                        class419.method2233(-28448, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class419.method2233(-28448, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(ILct;Lrc;II)V", line = 197)
    public class192(int arg0, class414 arg1, class29 arg2, int arg3, int arg4) {
        this.field2389 = arg0;
        this.field2394 = arg3;
        this.field2393 = arg4;
        this.field2388 = arg1;
        this.field2391 = arg2;
    }
}
