import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class83 extends class81 {

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lpj;")
    public class237 field1556;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lw;")
    public static class141 field1552 = null;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Z")
    public static boolean field1557 = false;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "Lgj;")
    public static class225 field1558;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[[B")
    public static byte[][] field1555;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "[[Z")
    public static boolean[][] field1553;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZB)V")
    public static final void method640(boolean arg0, byte arg1) {
        field1559++;
        byte[][] var2 = field1555;
        int var3 = class163.field2903.length;
        if (arg1 <= 25) {
            method640(false, (byte) -98);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class224.field3855[var4] >> 8) * 64 - class235.field4087;
                int var7 = (class224.field3855[var4] & 0xFF) * 64 - class27.field494;
                class96.method718((byte) -52);
                class220.method1466(var7, arg0, var6, -65, var5, class146.field2613);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static void method641(int arg0) {
        field1553 = null;
        field1555 = null;
        if (arg0 != 2000) {
            field1554 = -117;
        }
        field1552 = null;
        field1558 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Leb;IIII)V")
    public static final void method642(class231 arg0, int arg1, int arg2, int arg3, int arg4) {
        field1560++;
        if (class271.field4664 >= 400) {
            return;
        }
        if (arg0.field3991 != null) {
            arg0 = arg0.method1530(-1);
        }
        if (arg0 == null || !arg0.field3974) {
            return;
        }
        class237 var5 = arg0.field3992;
        if (arg0.field3957 != 0) {
            var5 = class238.method1626(new class237[] { var5, class135.method941(arg0.field3957, class229.field3911.field4660, -6), class81.field1522, class17.field291, class14.method130(arg0.field3957, (byte) 117), class129.field2257 }, -60);
        }
        if (~class70.field1376 == arg3) {
            class275.field4834++;
            class55.method489(arg4, class37.field831, (short) 26, class238.method1626(new class237[] { class28.field544, class68.field1331, var5 }, -31), (long) arg2, arg1, (byte) -121);
        } else if (!class15.field244) {
            class257.field4420++;
            class237[] var6 = arg0.field3984;
            if (class220.field3793) {
                var6 = class259.method1747(1328872140, var6);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class184.field3222 != 0 || !var6[var7].method1580(class179.field3149, (byte) 27))) {
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 18;
                        }
                        class108.field1927++;
                        if (var7 == 1) {
                            var8 = 14;
                        }
                        if (var7 == 2) {
                            var8 = 21;
                        }
                        if (var7 == 3) {
                            var8 = 6;
                        }
                        if (var7 == 4) {
                            var8 = 47;
                        }
                        class55.method489(arg4, var6[var7], var8, class238.method1626(new class237[] { class51.field1077, var5 }, -102), (long) arg2, arg1, (byte) -88);
                    }
                }
            }
            if (class184.field3222 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method1580(class179.field3149, (byte) 27)) {
                        short var10 = 0;
                        short var11 = 0;
                        if (arg0.field3957 > class229.field3911.field4660) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = 18;
                        }
                        class221.field3809++;
                        if (var9 == 1) {
                            var11 = 14;
                        }
                        if (var9 == 2) {
                            var11 = 21;
                        }
                        if (var9 == 3) {
                            var11 = 6;
                        }
                        if (var9 == 4) {
                            var11 = 47;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class55.method489(arg4, var6[var9], var11, class238.method1626(new class237[] { class51.field1077, var5 }, arg3 ^ 0x52), (long) arg2, arg1, (byte) -112);
                    }
                }
            }
            class55.method489(arg4, class172.field2992, (short) 1006, class238.method1626(new class237[] { class51.field1077, var5 }, -40), (long) arg2, arg1, (byte) -74);
            return;
        } else if ((class149.field2644 & 0x2) == 2) {
            class55.method489(arg4, class203.field3481, (short) 28, class238.method1626(new class237[] { class181.field3177, class68.field1331, var5 }, -56), (long) arg2, arg1, (byte) -98);
            class118.field2069++;
            return;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class83() {
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lpj;I)V")
    public class83(class237 arg0, int arg1) {
        this.field1556 = arg0;
    }
}
