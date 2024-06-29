import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class143 extends class75 {

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Ljava/lang/Object;")
    private Object field1935 = new Object();

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "[Lua;")
    private class171[] field1944 = new class171[0];

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    private int field1949 = 0;

    @OriginalMember(owner = "client!nl", name = "U", descriptor = "I")
    private int field1957 = 0;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "Lcr;")
    public static class189 field1939 = new class189(5);

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field1951 = null;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "[S")
    public static short[] field1950 = new short[256];

    @OriginalMember(owner = "client!nl", name = "T", descriptor = "S")
    public static short field1956 = 256;

    @OriginalMember(owner = "client!nl", name = "R", descriptor = "I")
    public static int field1954 = 1;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field1953 = 99;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!nl", name = "S", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lua;I)V", line = 4)
    public final void method906(class171 arg0, int arg1) {
        ++field1947;
        boolean var3 = false;
        try {
            if (arg1 != -24) {
                field1953 = 50;
            }
            boolean var4 = false;
            float var5 = 0.0F;
            Object var6 = this.field1935;
            byte var7;
            synchronized (this.field1935) {
                while (super.field1063 == 0) {
                    ++this.field1949;
                    this.field1935.wait();
                    --this.field1949;
                }
                var7 = super.field1072[super.field1080];
                if (~arg0.field2285 > -1) {
                    if (~var7 <= -1 && ~var7 >= -4) {
                        var3 = true;
                    }
                } else if (var7 < 0 || ~var7 < -4) {
                    var3 = true;
                }
                if (var3) {
                    arg0.field276 = super.field1076[super.field1080];
                    var5 = super.field1070[super.field1080];
                    super.field1076[super.field1080] = null;
                    ++super.field1080;
                    --super.field1063;
                    if (~super.field1080 <= -5001) {
                        super.field1080 = 0;
                    }
                }
            }
            if (!var3) {
                Thread.yield();
            } else if (~arg0.field2285 > -1) {
                if (var7 >= 0 && ~var7 >= -4) {
                    arg0.field2285 = var7;
                    class296.field4257.method1649(var7);
                }
            } else if (var7 == 21) {
                class166.method1022(arg0, (class254) arg0.field276);
            } else if (var7 == 20) {
                class254 var8 = (class254) arg0.field276;
                if (var8.field3510 != null) {
                    var8.field3510.method103(121, class296.field4257);
                }
                if (var8.field3512 != null) {
                    var8.field3512.method103(107, class296.field4257);
                }
                if (var8.field3519 != null) {
                    var8.field3519.method103(123, class296.field4257);
                }
                if (var8.field3502 != null) {
                    var8.field3502.method103(127, class296.field4257);
                }
                if (var8.field3527 != null) {
                    var8.field3527.method103(arg1 + 145, class296.field4257);
                }
                for (class328 var9 = var8.field3515; var9 != null; var9 = var9.field4783) {
                    var9.field4785.method103(105, class296.field4257);
                }
            } else if (var7 >= 30 && var7 <= 33) {
                class296.field4257.method1737(3000.0F, var5 * 1.5F);
                ((class351) arg0.field276).method741(class104.field1491, class428.field6302, class264.field3838, class211.field2799, var7 + -30 == 0);
            } else if (~var7 <= -41 && ~var7 >= -44) {
                class296.field4257.method1737(3000.0F, var5 * 1.5F);
                ((class351) arg0.field276).method741(class104.field1491, class428.field6302, class264.field3838, class5.field67, var7 + -40 == 0);
            } else if (~var7 != -23) {
                if (~var7 != -24) {
                    if (var7 != 24) {
                        if (var7 >= 10 && var7 <= 13) {
                            class296.field4257.method1727(arg0.field2285);
                            arg0.field2285 = -1;
                        }
                    } else {
                        class296.field4257.method1626(0, (class367[]) null);
                    }
                } else {
                    class296.field4257.method1749();
                }
            } else {
                class296.field4257.method1746(-1, 1583160, 40);
            }
        } catch (Exception var22) {
        } finally {
            Object var13 = null;
            if (var3) {
                Object var14 = this.field1935;
                synchronized (this.field1935) {
                    --super.field1069;
                    if (~super.field1069 == -1) {
                        this.field1935.notifyAll();
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)V", line = 176)
    private final void method907(int arg0, int arg1) {
        ++field1952;
        super.field1072[super.field1075] = (byte) (arg1 - -10);
        ++super.field1075;
        if (~super.field1075 <= -5001) {
            super.field1075 = 0;
        }
        ++super.field1069;
        ++super.field1063;
        if (arg0 == 13419) {
            if (this.field1949 > 0) {
                Object var3 = this.field1935;
                synchronized (this.field1935) {
                    this.field1935.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 201)
    public static final int method908(String arg0, byte arg1) {
        ++field1934;
        int var2 = -91 % ((arg1 - 13) / 58);
        if (arg0 == null) {
            return -1;
        } else {
            for (int var3 = 0; var3 < class167.field2254; ++var3) {
                if (arg0.equalsIgnoreCase(class272.field3943[var3])) {
                    return var3;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgk;Z)V", line = 228)
    public final void method554(class254 arg0, boolean arg1) {
        ++field1946;
        Object var3 = this.field1935;
        synchronized (this.field1935) {
            --super.field1080;
            if (~super.field1080 > -1) {
                super.field1080 = 4999;
            }
            super.field1072[super.field1080] = 21;
            if (arg1) {
                method908((String) null, (byte) -73);
            }
            super.field1076[super.field1080] = arg0;
            ++super.field1063;
            ++super.field1069;
            if (~this.field1949 < -1) {
                this.field1935.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V", line = 254)
    private final void method909(int arg0, int arg1) {
        super.field1072[super.field1075] = (byte) arg1;
        ++field1942;
        ++super.field1075;
        if (arg0 <= 87) {
            field1954 = 103;
        }
        ++super.field1063;
        ++super.field1069;
        if (super.field1075 >= 5000) {
            super.field1075 = 0;
        }
        if (~this.field1949 < -1) {
            Object var3 = this.field1935;
            synchronized (this.field1935) {
                this.field1935.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)V", line = 281)
    public final void method552(byte arg0, int arg1) {
        ++field1943;
        int var3 = 0;
        Object var4 = this.field1935;
        synchronized (this.field1935) {
            if (~this.field1957 == ~arg1) {
                for (int var5 = 0; var5 < this.field1957; ++var5) {
                    this.method909(115, var3++);
                }
            } else {
                for (int var6 = 0; ~var6 > ~this.field1957; ++var6) {
                    this.field1944[var6].method1061((byte) 97);
                }
                this.field1957 = arg1;
                this.field1944 = new class171[this.field1957];
                for (int var7 = 0; var7 < this.field1957; ++var7) {
                    this.field1944[var7] = new class171(this);
                    this.field1944[var7].method1059(0);
                    this.method909(119, var3++);
                }
                if (arg0 >= -98) {
                    method913((class298) null, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)Z", line = 329)
    public static final boolean method910(int arg0, int arg1, int arg2, int arg3) {
        if (!class202.method1200(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class12.field205[arg0].method742(arg1, arg2) - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class422.field6230) {
                        if (!class225.method1300(var4, var6, var5)) {
                            return false;
                        }
                        if (!class225.method1300(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class225.method1300(var4, var7, var5)) {
                            return false;
                        }
                        if (!class225.method1300(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class225.method1300(var4, var8, var5)) {
                        return false;
                    }
                    if (!class225.method1300(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class432.field6360) {
                        if (!class225.method1300(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class225.method1300(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class225.method1300(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class225.method1300(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class225.method1300(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class225.method1300(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class422.field6230) {
                        if (!class225.method1300(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class225.method1300(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class225.method1300(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class225.method1300(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class225.method1300(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class225.method1300(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class432.field6360) {
                        if (!class225.method1300(var4, var6, var5)) {
                            return false;
                        }
                        if (!class225.method1300(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class225.method1300(var4, var7, var5)) {
                            return false;
                        }
                        if (!class225.method1300(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class225.method1300(var4, var8, var5)) {
                        return false;
                    }
                    if (!class225.method1300(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class225.method1300(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class225.method1300(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class225.method1300(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class225.method1300(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class225.method1300(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(BI)V", line = 513)
    public final void method562(byte arg0, int arg1) {
        ++field1940;
        if (arg0 != -54) {
            this.method552((byte) -80, -105);
        }
        Object var3 = this.field1935;
        synchronized (this.field1935) {
            super.field1072[super.field1075] = (byte) arg1;
            ++super.field1075;
            ++super.field1063;
            ++super.field1069;
            if (~super.field1075 <= -5001) {
                super.field1075 = 0;
            }
            if (this.field1949 > 0) {
                this.field1935.notifyAll();
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lgk;B)V", line = 538)
    public final void method560(class254 arg0, byte arg1) {
        ++field1948;
        Object var3 = this.field1935;
        synchronized (this.field1935) {
            super.field1072[super.field1075] = 21;
            super.field1076[super.field1075] = arg0;
            ++super.field1075;
            if (arg1 == 48) {
                if (~super.field1075 <= -5001) {
                    super.field1075 = 0;
                }
                ++super.field1063;
                ++super.field1069;
                if (~this.field1949 < -1) {
                    this.field1935.notifyAll();
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 563)
    public final void method558(byte arg0) {
        ++field1933;
        try {
            Object var2 = this.field1935;
            synchronized (this.field1935) {
                while (~super.field1069 != -1) {
                    this.field1935.wait();
                }
            }
            if (arg0 >= -30) {
                field1939 = null;
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 591)
    public final void method556(byte arg0) {
        ++field1931;
        Object var2 = this.field1935;
        synchronized (this.field1935) {
            int var3 = 0;
            while (true) {
                if (~this.field1957 >= ~var3) {
                    break;
                }
                if (~this.field1944[var3].field2285 <= -1) {
                    this.method907(13419, this.field1944[var3].field2285);
                }
                ++var3;
            }
        }
        if (arg0 <= 7) {
            method912(-91);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V", line = 617)
    public static void method911(boolean arg0) {
        field1939 = null;
        field1950 = null;
        field1951 = null;
        if (arg0) {
            method908((String) null, (byte) -100);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 629)
    public static final void method912(int arg0) {
        class189 var1 = class93.field1340;
        synchronized (class93.field1340) {
            if (arg0 != 27294) {
                return;
            }
            class93.field1340.method1141(256);
        }
        ++field1941;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(FIZILck;)V", line = 642)
    public final void method557(float arg0, int arg1, boolean arg2, int arg3, class351 arg4) {
        Object var6 = this.field1935;
        synchronized (this.field1935) {
            super.field1072[super.field1075] = (byte) (arg2 ? arg1 + 40 : arg1 + 30);
            super.field1076[super.field1075] = arg4;
            super.field1070[super.field1075] = arg0;
            ++super.field1075;
            ++super.field1069;
            if (arg3 != 128) {
                return;
            }
            if (~super.field1075 <= -5001) {
                super.field1075 = 0;
            }
            ++super.field1063;
            if (~this.field1949 < -1) {
                this.field1935.notifyAll();
            }
        }
        ++field1932;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lwm;Z)V", line = 668)
    public static final void method913(class298 arg0, boolean arg1) {
        ++field1938;
        arg0.field4267 = arg1;
        if (~arg0.field4298 != 0) {
            class12 var2 = class33.method221((byte) 102, arg0.field4298);
            if (var2 != null && var2.field182 != null) {
                label299: {
                    ++arg0.field4294;
                    if (~var2.field182.length < ~arg0.field4346 && ~arg0.field4294 < ~var2.field176[arg0.field4346]) {
                        ++arg0.field4346;
                        arg0.field4294 = 1;
                        ++arg0.field4282;
                        class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4346, var2);
                    }
                    if (~arg0.field4346 <= ~var2.field182.length) {
                        arg0.field4346 = 0;
                        arg0.field4294 = 0;
                        if (arg0.field4285) {
                            arg0.field4298 = arg0.method2040(arg1).method2543(-909);
                            if (~arg0.field4298 == 0) {
                                arg0.field4285 = false;
                                break label299;
                            }
                            var2 = class33.method221((byte) 102, arg0.field4298);
                        }
                        class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4346, var2);
                    }
                    arg0.field4282 = arg0.field4346 + 1;
                    if (~var2.field182.length >= ~arg0.field4282) {
                        arg0.field4282 = 0;
                    }
                }
            } else {
                arg0.field4298 = -1;
                arg0.field4285 = false;
            }
        }
        if (~arg0.field4326 != 0 && class28.field418 >= arg0.field4348) {
            class300 var3 = class426.method2706((byte) 11, arg0.field4326);
            int var4 = var3.field4406;
            if (var4 == -1) {
                arg0.field4326 = -1;
            } else {
                label301: {
                    class12 var5 = class33.method221((byte) 102, var4);
                    if (var3.field4389) {
                        if (~var5.field179 != -4) {
                            if (~var5.field179 == -2 && arg0.field4365 > 0 && class28.field418 >= arg0.field4345 && arg0.field4322 < class28.field418) {
                                arg0.field4348 = class28.field418 - -1;
                                break label301;
                            }
                        } else if (~arg0.field4365 < -1 && ~arg0.field4345 >= ~class28.field418 && ~arg0.field4322 > ~class28.field418) {
                            arg0.field4326 = -1;
                            break label301;
                        }
                    }
                    if (var5 != null && var5.field182 != null) {
                        if (arg0.field4304 < 0) {
                            arg0.field4304 = 0;
                            class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, 0, var5);
                        }
                        ++arg0.field4273;
                        if (~var5.field182.length < ~arg0.field4304 && ~arg0.field4273 < ~var5.field176[arg0.field4304]) {
                            arg0.field4273 = 1;
                            ++arg0.field4304;
                            class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4304, var5);
                        }
                        if (var5.field182.length <= arg0.field4304) {
                            if (!var3.field4389) {
                                arg0.field4326 = -1;
                            } else {
                                arg0.field4304 -= var5.field177;
                                ++arg0.field4307;
                                if (arg0.field4307 >= var5.field195) {
                                    arg0.field4326 = -1;
                                } else if (~arg0.field4304 <= -1 && var5.field182.length > arg0.field4304) {
                                    class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4304, var5);
                                } else {
                                    arg0.field4326 = -1;
                                }
                            }
                        }
                        arg0.field4280 = arg0.field4304 + 1;
                        if (arg0.field4280 >= var5.field182.length) {
                            if (var3.field4389) {
                                arg0.field4280 -= var5.field177;
                                if (~var5.field195 < ~(arg0.field4307 + 1)) {
                                    if (arg0.field4280 < 0 || arg0.field4280 >= var5.field182.length) {
                                        arg0.field4280 = -1;
                                    }
                                } else {
                                    arg0.field4280 = -1;
                                }
                            } else {
                                arg0.field4280 = -1;
                            }
                        }
                    } else {
                        arg0.field4326 = -1;
                    }
                }
            }
        }
        if (~arg0.field4290 != 0 && arg0.field4332 <= 1) {
            class12 var6 = class33.method221((byte) 102, arg0.field4290);
            if (~var6.field179 == -4) {
                if (arg0.field4365 > 0 && ~arg0.field4345 >= ~class28.field418 && class28.field418 > arg0.field4322) {
                    arg0.field4290 = -1;
                }
            } else if (~var6.field179 == -2 && ~arg0.field4365 < -1 && ~class28.field418 <= ~arg0.field4345 && ~arg0.field4322 > ~class28.field418) {
                arg0.field4332 = 2;
            }
        }
        if (~arg0.field4290 != 0 && ~arg0.field4332 == -1) {
            class12 var7 = class33.method221((byte) 102, arg0.field4290);
            if (var7 != null && var7.field182 != null) {
                ++arg0.field4291;
                if (~var7.field182.length < ~arg0.field4300 && ~var7.field176[arg0.field4300] > ~arg0.field4291) {
                    arg0.field4291 = 1;
                    ++arg0.field4300;
                    class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4300, var7);
                }
                if (~arg0.field4300 <= ~var7.field182.length) {
                    ++arg0.field4270;
                    arg0.field4300 -= var7.field177;
                    if (~var7.field195 < ~arg0.field4270) {
                        if (arg0.field4300 >= 0 && ~var7.field182.length < ~arg0.field4300) {
                            class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, arg0.field4300, var7);
                        } else {
                            arg0.field4290 = -1;
                        }
                    } else {
                        arg0.field4290 = -1;
                    }
                }
                arg0.field4305 = arg0.field4300 - -1;
                if (~arg0.field4305 <= ~var7.field182.length) {
                    arg0.field4305 -= var7.field177;
                    if (~var7.field195 >= ~(arg0.field4270 + 1)) {
                        arg0.field4305 = -1;
                    } else if (~arg0.field4305 > -1 || arg0.field4305 >= var7.field182.length) {
                        arg0.field4305 = -1;
                    }
                }
                arg0.field4267 = var7.field202;
            } else {
                arg0.field4290 = -1;
            }
        }
        if (~arg0.field4332 < -1) {
            --arg0.field4332;
        }
        for (int var8 = 0; ~var8 > ~arg0.field4278.length; ++var8) {
            class316 var9 = arg0.field4278[var8];
            if (var9 != null) {
                if (~var9.field4622 < -1) {
                    --var9.field4622;
                } else {
                    class12 var10 = class33.method221((byte) 102, var9.field4621);
                    if (var10 != null && var10.field182 != null) {
                        ++var9.field4612;
                        if (var10.field182.length > var9.field4619 && ~var10.field176[var9.field4619] > ~var9.field4612) {
                            ++var9.field4619;
                            var9.field4612 = 1;
                            class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, var9.field4619, var10);
                        }
                        if (~var10.field182.length >= ~var9.field4619) {
                            ++var9.field4623;
                            var9.field4619 -= var10.field177;
                            if (~var9.field4623 > ~var10.field195) {
                                if (~var9.field4619 <= -1 && var10.field182.length > var9.field4619) {
                                    class298.method2049(arg0.field734, class227.field2988 == arg0, arg0.field740, 9757, var9.field4619, var10);
                                } else {
                                    arg0.field4278[var8] = null;
                                }
                            } else {
                                arg0.field4278[var8] = null;
                            }
                        }
                        var9.field4618 = var9.field4619 + 1;
                        if (var9.field4618 >= var10.field182.length) {
                            var9.field4618 -= var10.field177;
                            if (~(var9.field4623 - -1) <= ~var10.field195) {
                                var9.field4618 = -1;
                            } else if (var9.field4618 < 0 || var10.field182.length <= var9.field4618) {
                                var9.field4618 = -1;
                            }
                        }
                    } else {
                        arg0.field4278[var8] = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZIII)I", line = 988)
    public static final int method914(boolean arg0, int arg1, int arg2, int arg3) {
        ++field1945;
        class72 var4 = (class72) class8.field145.method384((long) arg1, true);
        if (var4 == null) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 86 / ((-61 - arg2) / 40);
            for (int var7 = 0; var4.field1038.length > var7; ++var7) {
                if (~var4.field1038[var7] <= -1 && var4.field1038[var7] < class16.field220) {
                    class83 var8 = class9.method74(var4.field1038[var7], (byte) 65);
                    int var9 = var8.method600(class98.method666(arg3, false).field1380, arg3, -25103);
                    if (!arg0) {
                        var5 += var9;
                    } else {
                        var5 += var4.field1040[var7] * var9;
                    }
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLgk;)V", line = 1032)
    public final void method559(boolean arg0, class254 arg1) {
        Object var3 = this.field1935;
        synchronized (this.field1935) {
            super.field1072[super.field1075] = 20;
            super.field1076[super.field1075] = arg1;
            ++super.field1075;
            ++super.field1063;
            if (!arg0) {
                method911(true);
            }
            if (~super.field1075 <= -5001) {
                super.field1075 = 0;
            }
            ++super.field1069;
            if (~this.field1949 < -1) {
                this.field1935.notifyAll();
            }
        }
        ++field1936;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lwd;IIIII)Ljava/awt/Frame;", line = 1056)
    public static final Frame method915(class36 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1955;
        if (!arg0.method265(18)) {
            return null;
        } else {
            if (~arg1 == -1) {
                class309[] var6 = class278.method1921(arg0, (byte) 113);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (var6[var8].field4549 == arg3 && ~var6[var8].field4554 == ~arg2 && (arg5 == 0 || ~var6[var8].field4555 == ~arg5) && (!var7 || ~var6[var8].field4550 < ~arg1)) {
                        arg1 = var6[var8].field4550;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class429 var9 = arg0.method245(arg3, arg1, arg2, (byte) 55, arg5);
            while (var9.field6308 == 0) {
                class144.method918(10L, true);
            }
            if (arg4 != 10) {
                method915((class36) null, 8, -2, -82, -90, -68);
            }
            Frame var10 = (Frame) var9.field6309;
            if (var10 == null) {
                return null;
            } else if (~var9.field6308 == -3) {
                class265.method1820((byte) -128, var10, arg0);
                return null;
            } else {
                return var10;
            }
        }
    }
}
