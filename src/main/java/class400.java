import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class400 implements class407 {

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Z")
    public static boolean field5697 = false;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public int field5694;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public int field5695;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public int field5696;

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public int field5698;

    @OriginalMember(owner = "client!wr", name = "g", descriptor = "I")
    public int field5700;

    @OriginalMember(owner = "client!wr", name = "h", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!wr", name = "i", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!wr", name = "j", descriptor = "I")
    public static int field5703;

    @OriginalMember(owner = "client!wr", name = "k", descriptor = "I")
    public int field5704;

    @OriginalMember(owner = "client!wr", name = "l", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Z")
    public boolean field5699;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ILvl;)Z")
    public final boolean method2390(int arg0, class407 arg1) {
        field5705++;
        if (!(arg1 instanceof class400)) {
            return false;
        }
        class400 var3 = (class400) arg1;
        if (this.field5695 != var3.field5695) {
            return false;
        }
        if (arg0 != -8486) {
            this.method2391(false);
        }
        if (this.field5694 != var3.field5694) {
            return false;
        } else if (this.field5696 != var3.field5696) {
            return false;
        } else if (this.field5704 != var3.field5704) {
            return false;
        } else if (this.field5700 != var3.field5700) {
            return false;
        } else if (this.field5698 == var3.field5698) {
            return this.field5699 == var3.field5699;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)J")
    public final long method2391(boolean arg0) {
        field5701++;
        long[] var2 = class274.field3906;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field5695) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field5694 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field5694) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field5696 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field5696 >> 16) ^ var11) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field5696 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field5696 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field5704 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field5700 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field5700 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field5700 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        if (arg0) {
            this.field5696 = 7;
        }
        long var27 = var2[(int) (((long) this.field5700 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field5698 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field5699 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIBLjava/awt/Component;Lkd;)Lgq;")
    public static final class453 method2392(int arg0, int arg1, byte arg2, Component arg3, class355 arg4) {
        if (arg2 < 36) {
            return null;
        }
        field5703++;
        if (class345.field4936 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class453 var5 = (class453) Class.forName("uq").getDeclaredConstructor().newInstance();
                var5.field6423 = arg1;
                var5.field6400 = new int[(class137.field1664 ? 2 : 1) * 256];
                var5.method1562(arg3);
                var5.field6424 = (arg1 & 0xFFFFFC00) + 1024;
                if (var5.field6424 > 16384) {
                    var5.field6424 = 16384;
                }
                var5.method1563(var5.field6424);
                if (class288.field4309 > 0 && class233.field3242 == null) {
                    class233.field3242 = new class108();
                    class233.field3242.field1306 = arg4;
                    arg4.method2157(class288.field4309, true, class233.field3242);
                }
                if (class233.field3242 != null) {
                    if (class233.field3242.field1304[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class233.field3242.field1304[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class333 var6 = new class333(arg4, arg0);
                    var6.field6400 = new int[(class137.field1664 ? 2 : 1) * 256];
                    var6.field6423 = arg1;
                    var6.method1562(arg3);
                    var6.field6424 = 16384;
                    var6.method1563(var6.field6424);
                    if (class288.field4309 > 0 && class233.field3242 == null) {
                        class233.field3242 = new class108();
                        class233.field3242.field1306 = arg4;
                        arg4.method2157(class288.field4309, true, class233.field3242);
                    }
                    if (class233.field3242 != null) {
                        if (class233.field3242.field1304[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class233.field3242.field1304[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class453();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(I)I")
    public static final int method2393(int arg0) {
        field5702++;
        if (arg0 > -37) {
            method2392(-37, 36, (byte) -103, (Component) null, (class355) null);
        }
        class210 var1 = class189.field2588;
        synchronized (class189.field2588) {
            return class189.field2588.method1167(-112);
        }
    }
}
