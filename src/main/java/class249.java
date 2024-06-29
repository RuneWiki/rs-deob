import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class249 extends class59 {

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!fi", name = "A", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!fi", name = "D", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!fi", name = "F", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!fi", name = "G", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!fi", name = "H", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!fi", name = "L", descriptor = "Lol;")
    public static class220 field4048;

    @OriginalMember(owner = "client!fi", name = "E", descriptor = "Ljava/lang/String;")
    public String field4041;

    @OriginalMember(owner = "client!fi", name = "I", descriptor = "[C")
    public char[] field4045;

    @OriginalMember(owner = "client!fi", name = "J", descriptor = "[C")
    public char[] field4046;

    @OriginalMember(owner = "client!fi", name = "B", descriptor = "[I")
    public int[] field4039;

    @OriginalMember(owner = "client!fi", name = "K", descriptor = "[I")
    public int[] field4047;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
    public static void method1769(byte arg0) {
        field4048 = null;
        if (arg0 != -67) {
            field4048 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IC)I")
    public final int method1770(int arg0, char arg1) {
        field4035++;
        if (this.field4039 == null) {
            return -1;
        }
        if (arg0 > -28) {
            method1772(-120, (class231) null, -39, -21);
        }
        for (int var3 = 0; var3 < this.field4039.length; var3++) {
            if (this.field4046[var3] == arg1) {
                return this.field4039[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method1771(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg1;
        field4038++;
        int var10 = arg6 - arg0;
        int var11 = arg1 - arg0;
        int var12 = arg6 * arg6;
        int var13 = 0;
        int var14 = arg1 * arg1;
        int var15 = var11 * var11;
        int var16 = var15 << 1;
        int var17 = var14 << 1;
        int var18 = var12 << 1;
        int var19 = 76 % ((arg4 - 14) / 59);
        int var20 = var10 * var10;
        int var21 = var20 << 1;
        int var22 = arg1 << 1;
        int var23 = var11 << 1;
        int var24 = var14 - ((var22 - 1) * var18);
        int var25 = (1 - var22) * var12 + var17;
        int var26 = (1 - var23) * var20 + var16;
        int var27 = var15 - (var23 - 1) * var21;
        int var28 = var12 << 2;
        int var29 = var14 << 2;
        int var30 = var15 << 2;
        int var31 = var20 << 2;
        int var32 = var17 * 3;
        int var33 = (var22 - 3) * var18;
        int var34 = var16 * 3;
        int var35 = var29;
        int var36 = (var23 - 3) * var21;
        int var37 = var30;
        int var38 = (arg1 - 1) * var28;
        int var39 = (var11 - 1) * var31;
        int[] var40 = class78.field1180[arg2];
        class16.method97(-7, var40, arg7 - var10, arg3, arg7 - arg6);
        class16.method97(-7, var40, arg7 + var10, arg5, arg7 - var10);
        class16.method97(-7, var40, arg6 + arg7, arg3, arg7 + var10);
        while (var9 > 0) {
            if (var25 < 0) {
                while (var25 < 0) {
                    var24 += var35;
                    var8++;
                    var35 += var29;
                    var25 += var32;
                    var32 += var29;
                }
            }
            boolean var41 = var11 >= var9;
            if (var41) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var13++;
                        var26 += var34;
                        var27 += var37;
                        var37 += var30;
                        var34 += var30;
                    }
                }
                if (var27 < 0) {
                    var26 += var34;
                    var34 += var30;
                    var27 += var37;
                    var13++;
                    var37 += var30;
                }
                var27 += -var36;
                var26 += -var39;
                var39 -= var31;
                var36 -= var31;
            }
            var9--;
            int var42 = arg2 - var9;
            if (var24 < 0) {
                var8++;
                var25 += var32;
                var24 += var35;
                var32 += var29;
                var35 += var29;
            }
            int var43 = arg2 + var9;
            int var44 = arg7 + var8;
            var24 += -var33;
            var25 += -var38;
            int var45 = arg7 - var8;
            if (var41) {
                int var46 = arg7 + var13;
                int var47 = arg7 - var13;
                class16.method97(-7, class78.field1180[var42], var47, arg3, var45);
                class16.method97(-7, class78.field1180[var42], var46, arg5, var47);
                class16.method97(-7, class78.field1180[var42], var44, arg3, var46);
                class16.method97(-7, class78.field1180[var43], var47, arg3, var45);
                class16.method97(-7, class78.field1180[var43], var46, arg5, var47);
                class16.method97(-7, class78.field1180[var43], var44, arg3, var46);
            } else {
                class16.method97(-7, class78.field1180[var42], var44, arg3, var45);
                class16.method97(-7, class78.field1180[var43], var44, arg3, var45);
            }
            var33 -= var28;
            var38 -= var28;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILfe;II)V")
    public static final void method1772(int arg0, class231 arg1, int arg2, int arg3) {
        field4043++;
        if (class173.field2721 < 2 && class197.field3123 == 0 && !class63.field911) {
            return;
        }
        if (arg0 != 12445) {
            method1769((byte) 77);
        }
        String var4 = class192.method1347((byte) 123);
        if (arg1 == null) {
            int var5 = class306.field4885.method1493(var4, arg2 + 4, arg3 + 15, 16777215, 0, class126.field1809, class93.field1396);
            class277.method1912(class306.field4885.method1491(var4) + var5, arg0 + -43346, arg2 + 4, arg3, 15);
            return;
        }
        class213 var6 = arg1.method1626(class76.field1146, 2);
        if (var6 == null) {
            var6 = class306.field4885;
        }
        var6.method1484(var4, arg2, arg3, arg1.field3730, arg1.field3686, arg1.field3583, arg1.field3745, arg1.field3572, arg1.field3625, class126.field1809, class93.field1396, class10.field155);
        class277.method1912(class10.field155[2], -30901, class10.field155[0], class10.field155[1], class10.field155[3]);
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public final void method1773(int arg0) {
        if (this.field4039 != null) {
            for (int var2 = 0; var2 < this.field4039.length; var2++) {
                this.field4039[var2] = class243.method1723(this.field4039[var2], 32768);
            }
        }
        if (this.field4047 != null) {
            for (int var3 = 0; var3 < this.field4047.length; var3++) {
                this.field4047[var3] = class243.method1723(this.field4047[var3], 32768);
            }
        }
        field4037++;
        if (arg0 <= 36) {
            this.field4039 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lim;ZI)V")
    private final void method1774(class170 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1776((class170) null, -84);
        }
        field4044++;
        if (arg2 == 1) {
            this.field4041 = arg0.method1195(-1);
        } else if (arg2 == 2) {
            int var4 = arg0.method1218(-27);
            this.field4047 = new int[var4];
            this.field4045 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4047[var5] = arg0.method1186((byte) -96);
                byte var6 = arg0.method1215(128);
                this.field4045[var5] = var6 == 0 ? 0 : class226.method1595((byte) -39, var6);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg0.method1218(-69);
            this.field4039 = new int[var7];
            this.field4046 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4039[var8] = arg0.method1186((byte) -83);
                byte var9 = arg0.method1215(128);
                this.field4046[var8] = var9 == 0 ? 0 : class226.method1595((byte) 108, var9);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(CB)I")
    public final int method1775(char arg0, byte arg1) {
        if (arg1 <= 120) {
            method1772(119, (class231) null, 31, 61);
        }
        field4042++;
        if (this.field4047 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field4047.length; var3++) {
            if (this.field4045[var3] == arg0) {
                return this.field4047[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lim;I)V")
    public final void method1776(class170 arg0, int arg1) {
        if (arg1 != 3574) {
            method1769((byte) -92);
        }
        while (true) {
            int var3 = arg0.method1218(-26);
            if (var3 == 0) {
                field4036++;
                return;
            }
            this.method1774(arg0, false, var3);
        }
    }
}
