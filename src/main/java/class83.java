import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class83 extends class381 {

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1219 = -1;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1221 = 0;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lrk;Lrk;B)V", line = 6)
    public static final void method748(class427 arg0, class427 arg1, byte arg2) {
        class402.field5608 = arg1;
        class15.field149 = arg0;
        field1222++;
        class15.field149.method2626(34, 66);
        if (arg2 == 119) {
            ;
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)V", line = 41)
    public static final void method749(int arg0) {
        if (arg0 != -16) {
            field1219 = 60;
        }
        field1220++;
        if (class267.field3590) {
            return;
        }
        class267.field3590 = true;
        class287.field3847 = true;
        if (class100.field1443) {
            class47.field810 = (float) ((int) class47.field810 + 47 & 0xFFFFFFF0);
        } else {
            class150.field2292 += (12.0F - class150.field2292) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()V", line = 69)
    public static final void method750() {
        if (class95.field1380 != null) {
            for (int var0 = 0; var0 < class95.field1380.length; var0++) {
                for (int var1 = 0; var1 < class368.field5054; var1++) {
                    for (int var2 = 0; var2 < class16.field190; var2++) {
                        if (class95.field1380[var0][var1][var2] != null) {
                            class95.field1380[var0][var1][var2].method1529(26318);
                        }
                        class95.field1380[var0][var1][var2] = null;
                    }
                }
            }
        }
        class95.field1380 = null;
        class265.field3566 = null;
        if (class73.field1097 != null) {
            for (int var3 = 0; var3 < class73.field1097.length; var3++) {
                for (int var4 = 0; var4 < class368.field5054; var4++) {
                    for (int var5 = 0; var5 < class16.field190; var5++) {
                        if (class73.field1097[var3][var4][var5] != null) {
                            class73.field1097[var3][var4][var5].method1529(26318);
                        }
                        class73.field1097[var3][var4][var5] = null;
                    }
                }
            }
        }
        class73.field1097 = null;
        class244.field3367 = null;
        class118.field1653 = null;
        class91.field1351 = null;
        class223.field3091 = 0;
        if (class421.field5894 != null) {
            for (int var6 = 0; var6 < class223.field3091; var6++) {
                class421.field5894[var6] = null;
            }
        }
        if (class396.field5544 != null) {
            for (int var7 = 0; var7 < class275.field3692; var7++) {
                class396.field5544[var7] = null;
            }
            class275.field3692 = 0;
        }
        if (class30.field511 != null) {
            for (int var8 = 0; var8 < class339.field4631; var8++) {
                class30.field511[var8] = null;
            }
            for (int var9 = 0; var9 < class388.field5464; var9++) {
                for (int var10 = 0; var10 < class368.field5054; var10++) {
                    for (int var11 = 0; var11 < class16.field190; var11++) {
                        class39.field603[var9][var10][var11] = 0;
                    }
                }
            }
            class339.field4631 = 0;
        }
        class144.field2184 = null;
        class148.method1141((byte) 106);
        class440.field6321.method894(109);
        class277.field3731 = null;
        class122.field1712 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)I", line = 222)
    public static final int method751(boolean arg0, int arg1) {
        field1216++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 - 61440;
        int var4 = (arg1 * var3 >> 12) + 40960;
        if (arg0) {
            method748((class427) null, (class427) null, (byte) -104);
        }
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIII)V", line = 239)
    public static final void method752(int arg0, int arg1, int arg2, int arg3) {
        field1214++;
        if (arg1 != -1004) {
            field1221 = -117;
        }
        if (arg2 == 1001) {
            class18.method262(10, arg3, arg0);
        } else if (arg2 == 1012) {
            class18.method262(11, arg3, arg0);
        } else if (arg2 == 1003) {
            class18.method262(12, arg3, arg0);
        } else if (arg2 == 1007) {
            class18.method262(13, arg3, arg0);
        } else if (arg2 == 1005) {
            class18.method262(14, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lrk;BLrk;Z)V", line = 272)
    public static final void method753(class427 arg0, byte arg1, class427 arg2, boolean arg3) {
        class66.field989 = arg0;
        class28.field488 = arg2;
        field1215++;
        class367.field5045 = arg3;
        int var4 = class28.field488.method2649((byte) -4) - 1;
        if (arg1 == -38) {
            class128.field1824 = class28.field488.method2626(var4, 19) + var4 * 256;
            class155.field2356 = new String[] { null, null, class435.field6201, null, null };
            class213.field2958 = new String[] { null, null, null, null, class424.field5945 };
        }
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(B)V", line = 291)
    public static final void method754(byte arg0) {
        field1217++;
        if (arg0 != -103) {
            method748((class427) null, (class427) null, (byte) -76);
        }
        if (class446.field6419 != null) {
            class118 var1 = class446.field6419;
            synchronized (class446.field6419) {
                class446.field6419 = null;
            }
        }
    }
}
