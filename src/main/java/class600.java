import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class600 extends class502 {

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public static int field8387;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(ILeka;)V", line = 4)
    public class600(int arg0, class492 arg1) {
        super(arg1);
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(II)V", line = 9)
    public final void method52(int arg0, int arg1) {
        if (arg1 != 0) {
            method3405(false, true, (String) null);
        }
        super.field6865 = arg0;
        ++field8389;
    }

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "(B)I", line = 20)
    public final int method3404(byte arg0) {
        ++field8388;
        if (arg0 <= 49) {
            field8390 = 53;
        }
        return super.field6865;
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Leka;)V", line = 37)
    public class600(class492 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)I", line = 40)
    public final int method57(int arg0, int arg1) {
        ++field8391;
        if (arg1 != 0) {
            this.method57(-63, -103);
        }
        return 1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ZZLjava/lang/String;)V", line = 51)
    public static final void method3405(boolean arg0, boolean arg1, String arg2) {
        ++field8392;
        if (arg2 != null) {
            if (class766.field10564 >= 100) {
                class629.method3535(class641.field8857.method3566((byte) -101, class464.field6309), 4, -2309);
            } else {
                String var3 = class177.method1336(arg2, (byte) 75);
                if (var3 != null) {
                    for (int var4 = 0; ~class766.field10564 < ~var4; ++var4) {
                        String var9 = class177.method1336(class174.field2766[var4], (byte) 75);
                        if (var9 != null && var9.equals(var3)) {
                            class629.method3535(arg2 + class641.field8858.method3566((byte) -94, class464.field6309), 4, -2309);
                            return;
                        }
                        if (class707.field9726[var4] != null) {
                            String var10 = class177.method1336(class707.field9726[var4], (byte) 75);
                            if (var10 != null && var10.equals(var3)) {
                                class629.method3535(arg2 + class641.field8858.method3566((byte) -64, class464.field6309), 4, -2309);
                                return;
                            }
                        }
                    }
                    for (int var5 = 0; class749.field10345 > var5; ++var5) {
                        String var7 = class177.method1336(class463.field6303[var5], (byte) 75);
                        if (var7 != null && var7.equals(var3)) {
                            class629.method3535(class641.field8863.method3566((byte) -69, class464.field6309) + arg2 + class641.field8864.method3566((byte) 96, class464.field6309), 4, -2309);
                            return;
                        }
                        if (class392.field5378[var5] != null) {
                            String var8 = class177.method1336(class392.field5378[var5], (byte) 75);
                            if (var8 != null && var8.equals(var3)) {
                                class629.method3535(class641.field8863.method3566((byte) 116, class464.field6309) + arg2 + class641.field8864.method3566((byte) -83, class464.field6309), 4, -2309);
                                return;
                            }
                        }
                    }
                    if (class177.method1336(class235.field3379.field10641, (byte) 75).equals(var3)) {
                        class629.method3535(class641.field8860.method3566((byte) -78, class464.field6309), 4, -2309);
                    } else {
                        ++class417.field5696;
                        class537 var6 = class476.method2729(class138.field2361, (byte) -46, class551.field7498);
                        var6.field7295.method754(1 + class703.method3926(120, arg2), 44);
                        var6.field7295.method783((byte) 24, arg2);
                        var6.field7295.method754(!arg0 ? 0 : 1, 91);
                        if (!arg1) {
                            field8390 = -58;
                        }
                        class173.method1314(false, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lmo;III)Lfp;", line = 150)
    public static final class344 method3406(class780 arg0, int arg1, int arg2, int arg3) {
        ++field8387;
        int var4 = arg1 << 10 | arg0.field10743;
        class344 var5 = (class344) class580.field8216.method1077((long) var4 << 16, (byte) 108);
        if (var5 != null) {
            return var5;
        } else {
            byte[] var6 = class687.field9554.method3742(5, class687.field9554.method3734((byte) -101, var4));
            if (var6 != null) {
                if (var6.length <= 1) {
                    return null;
                } else {
                    class344 var7;
                    try {
                        var7 = class347.method2142(var6, (byte) -104);
                    } catch (Exception var19) {
                        throw new RuntimeException(var19.getMessage() + " S: " + var4);
                    }
                    var7.field4623 = arg0;
                    class580.field8216.method1079(var7, (long) var4 << 16, (byte) 115);
                    return var7;
                }
            } else {
                int var9 = arg0.field10743 | arg2 + 65536 << 10;
                class344 var10 = (class344) class580.field8216.method1077((long) var9 << 16, (byte) 109);
                if (var10 != null) {
                    return var10;
                } else if (arg3 != 3075) {
                    return null;
                } else {
                    byte[] var11 = class687.field9554.method3742(5, class687.field9554.method3734((byte) -89, var9));
                    if (var11 != null) {
                        if (var11.length <= 1) {
                            return null;
                        } else {
                            class344 var12;
                            try {
                                var12 = class347.method2142(var11, (byte) -104);
                            } catch (Exception var20) {
                                throw new RuntimeException(var20.getMessage() + " S: " + var9);
                            }
                            var12.field4623 = arg0;
                            class580.field8216.method1079(var12, (long) var9 << 16, (byte) 85);
                            return var12;
                        }
                    } else {
                        int var14 = 67107840 | arg0.field10743;
                        class344 var15 = (class344) class580.field8216.method1077((long) var14 << 16, (byte) 123);
                        if (var15 != null) {
                            return var15;
                        } else {
                            byte[] var16 = class687.field9554.method3742(5, class687.field9554.method3734((byte) -97, var14));
                            if (var16 != null) {
                                if (var16.length <= 1) {
                                    return null;
                                } else {
                                    class344 var17;
                                    try {
                                        var17 = class347.method2142(var16, (byte) -104);
                                    } catch (Exception var21) {
                                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                                    }
                                    var17.field4623 = arg0;
                                    class580.field8216.method1079(var17, (long) var14 << 16, (byte) 67);
                                    return var17;
                                }
                            } else {
                                return null;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)I", line = 232)
    public final int method55(int arg0) {
        if (arg0 != -2) {
            field8390 = 70;
        }
        ++field8394;
        return 1;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V", line = 244)
    public final void method58(boolean arg0) {
        if (arg0) {
            if (~super.field6865 != -2 && super.field6865 != 0) {
                super.field6865 = this.method55(-2);
            }
            ++field8393;
        }
    }
}
