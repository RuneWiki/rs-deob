import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class101 extends class114 {

    @OriginalMember(owner = "client!oa", name = "N", descriptor = "I")
    public static int field1447 = 2;

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1451 = " from your friend list first.";

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1453 = "Continue";

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[Lvb;")
    private class139[] field1452;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V")
    public static final void method647(int arg0, int arg1) {
        ++field1448;
        class39 var2 = class149.method935(-91, arg1, 11);
        if (arg0 != -14537) {
            field1456 = 49;
        }
        var2.method268((byte) -19);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)[[I")
    public final int[][] method73(byte arg0, int arg1) {
        ++field1446;
        if (arg0 != -112) {
            field1456 = -3;
        }
        int[][] var3 = super.field1627.method104(arg1, (byte) 100);
        if (super.field1627.field280) {
            int var4 = class145.field2009;
            int var5 = class263.field4216;
            int[][][] var6 = super.field1627.method108(3560);
            int[][] var7 = new int[var5][var4];
            this.method649(15247, var7);
            for (int var8 = 0; ~class263.field4216 < ~var8; ++var8) {
                int[][] var9 = var6[var8];
                int[] var10 = var9[0];
                int[] var11 = var7[var8];
                int[] var12 = var9[1];
                int[] var13 = var9[2];
                for (int var14 = 0; ~class145.field2009 < ~var14; ++var14) {
                    int var15 = var11[var14];
                    var13[var14] = class32.method199(var15 << 4, 4080);
                    var12[var14] = class32.method199(var15 >> 4, 4080);
                    var10[var14] = class32.method199(var15, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field1455;
        if (arg1) {
            field1447 = 67;
        }
        int[] var3 = super.field1630.method302(arg0, -107);
        if (super.field1630.field710) {
            this.method649(15247, super.field1630.method306(0));
        }
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static void method648(byte arg0) {
        field1451 = null;
        int var1 = 18 % ((arg0 - -46) / 45);
        field1453 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (arg2 != 12953) {
            field1451 = null;
        }
        ++field1454;
        if (~arg1 == -1) {
            this.field1452 = new class139[arg0.method1374((byte) -60)];
            for (int var4 = 0; this.field1452.length > var4; ++var4) {
                int var5 = arg0.method1374((byte) -60);
                if (var5 != 0) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field1452[var4] = class91.method593(class207.method1290(arg2, 12952), arg0);
                            }
                        } else {
                            this.field1452[var4] = class174.method1099(14055, arg0);
                        }
                    } else {
                        this.field1452[var4] = class179.method1143((byte) 65, arg0);
                    }
                } else {
                    this.field1452[var4] = class268.method1758(arg0, (byte) -80);
                }
            }
        } else if (~arg1 == -2) {
            super.field1648 = arg0.method1374((byte) -60) == 1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[[I)V")
    private final void method649(int arg0, int[][] arg1) {
        int var3 = class145.field2009;
        ++field1449;
        if (arg0 == 15247) {
            int var4 = class263.field4216;
            class20.method136((byte) 0, arg1);
            class149.method940(class134.field1840, class309.field4977, 0, 0, 111);
            if (this.field1452 != null) {
                for (int var5 = 0; var5 < this.field1452.length; ++var5) {
                    class139 var6 = this.field1452[var5];
                    int var7 = var6.field1926;
                    int var8 = var6.field1928;
                    if (var8 >= 0) {
                        if (var7 >= 0) {
                            var6.method791(false, var3, var4);
                        } else {
                            var6.method786(true, var4, var3);
                        }
                    } else if (~var7 <= -1) {
                        var6.method790((byte) 94, var4, var3);
                    }
                }
            }
        }
    }
}
