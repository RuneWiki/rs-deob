import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class72 extends class182 {

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    public static int field1324;

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)V", line = 4)
    public static final void method546(int arg0) {
        if (arg0 <= 100) {
            method546(-105);
        }
        field1326++;
        class223.field3687.method895(128);
        class289.field4699.method895(128);
        class27.field679.method895(128);
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 18)
    public class72() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method122(int arg0, int arg1) {
        field1324++;
        int[][] var3 = this.field3152.method1953(arg0, 99);
        if (this.field3152.field4493) {
            int[][] var4 = this.method1291(arg0, (byte) 39, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            int[] var8 = var3[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class26.field672; var11++) {
                var9[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var7[var11];
                var8[var11] = 4096 - var6[var11];
            }
        }
        return arg1 == 4944 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V", line = 72)
    public static final void method547(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < -101) {
            for (int var6 = arg1; var6 <= arg3; var6++) {
                class344.method2417(class232.field3799[var6], arg5, arg2, arg4, (byte) -121);
            }
            field1318++;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IC)Z", line = 93)
    public static final boolean method548(int arg0, char arg1) {
        field1322++;
        if (arg0 == 90) {
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)V", line = 104)
    public static final void method549(int arg0) {
        field1317++;
        class91.field1615 = null;
        class251.method1773(class88.field1566, class287.field4696, 0, -1, arg0 ^ -28631, 0, 0, class133.field2287, 0);
        if (arg0 == 2 && class91.field1615 != null) {
            class258.method1809(0, class140.field2374, class306.field4981, 0, class91.field1615, -1412584499, class287.field4696, class16.field476.field3094, class133.field2287, arg0 - 3);
            class91.field1615 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)[I", line = 124)
    public final int[] method125(int arg0, int arg1) {
        int[] var3 = this.field3166.method775(arg1, 125);
        if (this.field3166.field1903) {
            int[] var4 = this.method1292(arg1, 0, arg0 - 115);
            for (int var5 = 0; var5 < class26.field672; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        if (arg0 == 2) {
            field1325++;
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)V", line = 157)
    public static final void method550(int arg0, int arg1) {
        class280.field4577 = new int[arg0];
        class144.field2421 = new int[arg0];
        class359.field5725 = new int[arg0];
        class56.field1111 = new int[arg0];
        class235.field3849 = new int[arg0];
        if (arg1 != -49) {
            method549(111);
        }
        field1320++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Loe;IB)V", line = 174)
    public final void method126(class146 arg0, int arg1, byte arg2) {
        field1321++;
        if (arg1 == 0) {
            this.field3154 = arg0.method1005((byte) 122) == 1;
        }
        if (arg2 != 60) {
            method550(-107, 85);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(JI)V", line = 190)
    public static final void method551(long arg0, int arg1) {
        field1319++;
        if (arg1 != -49) {
            return;
        }
        if (!class151.field2559) {
            class87.field1523 += (float) arg0 * class335.field5335 / 40.0F;
            class354.field5652 += (float) arg0 * class336.field5344 / 40.0F;
        }
        int var3 = class127.field2225 + class96.field1750.field199;
        int var4 = class312.field5075 + class96.field1750.field213;
        if ((class33.field724 - var3) < -500 || class33.field724 - var3 > 500 || class244.field4052 - var4 < -500 || (class244.field4052 - var4) > 500) {
            class33.field724 = var3;
            class244.field4052 = var4;
        }
        if (class33.field724 != var3) {
            int var5 = var3 - class33.field724;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var5 > var6) {
                var6 = var5;
            }
            class33.field724 += var6;
        }
        if (class244.field4052 != var4) {
            int var7 = var4 - class244.field4052;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var7 > var8) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var7 < var8) {
                var8 = var7;
            }
            class244.field4052 += var8;
        }
        class212.method1460(true);
    }
}
