import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class195 {

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3919 = 0;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lgg;")
    public static class63 field3920 = class116.method911(43, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "B")
    public static byte field3923;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static final void method1274(byte arg0) {
        int[] var1 = new int[class161.field3319];
        field3922++;
        int var2 = 0;
        int var3 = 0;
        if (arg0 < 59) {
            field3923 = 104;
        }
        while (var3 < class161.field3319) {
            class93 var5 = class59.method554(var3, 13319);
            if (var5.field2219 >= 0 || var5.field2193 >= 0) {
                var1[var2++] = var3;
            }
            var3++;
        }
        class187.field3781 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class187.field3781[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BILgf;II)V")
    public static final void method1275(byte arg0, int arg1, class62 arg2, int arg3, int arg4) {
        field3918++;
        if (arg0 > -51) {
            method1274((byte) -27);
        }
        if (class3.field72 == arg2 || class166.field3404 >= 400) {
            return;
        }
        class63 var5;
        if (arg2.field1561 == 0) {
            var5 = class89.method772((byte) 47, new class63[] { arg2.field1552, class139.method1003(arg2.field1569, class3.field72.field1569, 10), class150.field3152, class130.field2845, class175.method1162((byte) -126, arg2.field1569), class138.field2962 });
        } else {
            var5 = class89.method772((byte) 46, new class63[] { arg2.field1552, class150.field3152, class85.field2042, class175.method1162((byte) -126, arg2.field1561), class138.field2962 });
        }
        if (class184.field3729 == 1) {
            class78.method698((short) 17, arg4, class28.field669, -26415, arg1, (long) arg3, class89.method772((byte) 116, new class63[] { class62.field1554, class81.field1955, var5 }));
            class132.field2872++;
        } else if (!class181.field3680) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class167.field3456[var6] != null) {
                    class4.field116++;
                    boolean var7 = false;
                    short var8 = 0;
                    if (class167.field3456[var6].method601(13117, class22.field520)) {
                        if (arg2.field1569 > class3.field72.field1569) {
                            var8 = 2000;
                        }
                        if (class3.field72.field1555 != 0 && arg2.field1555 != 0) {
                            if (class3.field72.field1555 == arg2.field1555) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class23.field542[var6]) {
                        var8 = 2000;
                    }
                    short var9 = class15.field361[var6];
                    short var10 = (short) (var8 + var9);
                    class78.method698(var10, arg4, class167.field3456[var6], -26415, arg1, (long) arg3, class89.method772((byte) 95, new class63[] { class83.field1964, var5 }));
                }
            }
        } else if ((class167.field3452 & 0x8) == 8) {
            class78.method698((short) 22, arg4, class106.field2420, -26415, arg1, (long) arg3, class89.method772((byte) 40, new class63[] { class24.field547, class81.field1955, var5 }));
            field3917++;
        }
        for (int var11 = 0; var11 < class166.field3404; var11++) {
            if (class196.field3924[var11] == 19) {
                class84.field2003[var11] = class89.method772((byte) 112, new class63[] { class83.field1964, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)[B")
    public static final synchronized byte[] method1276(int arg0, boolean arg1) {
        field3921++;
        if (arg0 == 100 && class48.field1168 > 0) {
            byte[] var2 = class190.field3863[--class48.field1168];
            class190.field3863[class48.field1168] = null;
            return var2;
        } else if (arg0 == 5000 && class33.field800 > 0) {
            byte[] var3 = class177.field3634[--class33.field800];
            class177.field3634[class33.field800] = null;
            return var3;
        } else if (arg0 == 30000 && class62.field1567 > 0) {
            byte[] var4 = class187.field3780[--class62.field1567];
            class187.field3780[class62.field1567] = null;
            return var4;
        } else if (arg1) {
            return null;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public static void method1277(boolean arg0) {
        field3920 = null;
        if (arg0) {
            field3923 = 62;
        }
    }
}
