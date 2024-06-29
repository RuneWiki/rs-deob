import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class23 extends class51 {

    @OriginalMember(owner = "client!da", name = "db", descriptor = "I")
    private int field543 = 0;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public int field534 = -1;

    @OriginalMember(owner = "client!da", name = "nb", descriptor = "I")
    private int field553 = 128;

    @OriginalMember(owner = "client!da", name = "ob", descriptor = "I")
    private int field554 = 0;

    @OriginalMember(owner = "client!da", name = "qb", descriptor = "I")
    private int field556 = 128;

    @OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
    private int field555 = 0;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "I")
    public static int field535 = -1;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "[I")
    public static int[] field546 = new int[500];

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "Lic;")
    public static class59 field544 = class59.method433(0, "hel");

    @OriginalMember(owner = "client!da", name = "X", descriptor = "[I")
    public static int[] field537 = new int[200];

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "Lic;")
    private static class59 field549 = class59.method433(0, "Could not complete login)3");

    @OriginalMember(owner = "client!da", name = "T", descriptor = "Lic;")
    public static class59 field533 = field549;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field550 = new CRC32();

    @OriginalMember(owner = "client!da", name = "vb", descriptor = "I")
    public static int field561 = 0;

    @OriginalMember(owner = "client!da", name = "xb", descriptor = "[[[Lm;")
    public static class83[][][] field563 = new class83[4][104][104];

    @OriginalMember(owner = "client!da", name = "wb", descriptor = "Lic;")
    public static class59 field562 = class59.method433(0, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!da", name = "sb", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!da", name = "ub", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!da", name = "yb", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "[Lce;")
    public static class20[] field547;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "[S")
    private short[] field536;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "[S")
    private short[] field548;

    @OriginalMember(owner = "client!da", name = "rb", descriptor = "[S")
    private short[] field557;

    @OriginalMember(owner = "client!da", name = "tb", descriptor = "[S")
    private short[] field559;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)V")
    public static final void method141(int arg0, byte arg1) {
        field540++;
        if (arg0 == -1 || !class131.field2944[arg0]) {
            return;
        }
        class16.field318.method200(118, arg0);
        if (class46.field1173[arg0] == null) {
            return;
        }
        boolean var2 = true;
        if (arg1 < 85) {
            field535 = 120;
        }
        for (int var3 = 0; var3 < class46.field1173[arg0].length; var3++) {
            if (class46.field1173[arg0][var3] != null) {
                if (class46.field1173[arg0][var3].field3612 == 2) {
                    var2 = false;
                } else {
                    class46.field1173[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class46.field1173[arg0] = null;
        }
        class131.field2944[arg0] = false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lnb;")
    public final class92 method142(int arg0, int arg1) {
        field538++;
        class92 var3 = (class92) class52.field1287.method675((long) this.field551, 26431);
        if (var3 == null) {
            class28 var4 = class28.method210(class16.field310, this.field545, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field536 != null) {
                for (int var5 = 0; var5 < this.field536.length; var5++) {
                    var4.method228(this.field536[var5], this.field548[var5]);
                }
            }
            if (this.field557 != null) {
                for (int var6 = 0; var6 < this.field557.length; var6++) {
                    var4.method223(this.field557[var6], this.field559[var6]);
                }
            }
            var3 = var4.method217(this.field555 + 64, this.field554 + 850, -30, -50, -30);
            class52.field1287.method672(-30464, var3, (long) this.field551);
        }
        if (arg0 != -30) {
            this.field548 = null;
        }
        class92 var7;
        if (this.field534 == -1 || arg1 == -1) {
            var7 = var3.method760(true);
        } else {
            var7 = class49.method381(this.field534, (byte) 122).method168(10, arg1, var3);
        }
        if (this.field556 != 128 || this.field553 != 128) {
            var7.method777(this.field556, this.field553, this.field556);
        }
        if (this.field543 != 0) {
            if (this.field543 == 90) {
                var7.method768();
            }
            if (this.field543 == 180) {
                var7.method768();
                var7.method768();
            }
            if (this.field543 == 270) {
                var7.method768();
                var7.method768();
                var7.method768();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lwd;II)V")
    private final void method143(class157 arg0, int arg1, int arg2) {
        if (~arg1 == arg2) {
            this.field545 = arg0.method1161((byte) 60);
        } else if (arg1 == 2) {
            this.field534 = arg0.method1161((byte) 60);
        } else if (arg1 == 4) {
            this.field556 = arg0.method1161((byte) 60);
        } else if (arg1 == 5) {
            this.field553 = arg0.method1161((byte) 60);
        } else if (arg1 == 6) {
            this.field543 = arg0.method1161((byte) 60);
        } else if (arg1 == 7) {
            this.field555 = arg0.method1194(false);
        } else if (arg1 == 8) {
            this.field554 = arg0.method1194(false);
        } else if (arg1 == 40) {
            int var6 = arg0.method1194(false);
            this.field536 = new short[var6];
            this.field548 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field536[var7] = (short) arg0.method1161((byte) 60);
                this.field548[var7] = (short) arg0.method1161((byte) 60);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method1194(false);
            this.field557 = new short[var4];
            this.field559 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field557[var5] = (short) arg0.method1161((byte) 60);
                this.field559[var5] = (short) arg0.method1161((byte) 60);
            }
        }
        field539++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lic;B)Z")
    public static final boolean method144(class59 arg0, byte arg1) {
        field541++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 != -53) {
            field546 = null;
        }
        for (int var2 = 0; var2 < class76.field1863; var2++) {
            if (arg0.method423(class87.field2201[var2], -61)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)I")
    public static final int method145(int arg0, int arg1, int arg2) {
        field542++;
        int var3 = -38 / ((arg2 + 59) / 57);
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(I)V")
    public static void method146(int arg0) {
        field544 = null;
        field563 = null;
        field547 = null;
        field533 = null;
        field537 = null;
        field550 = null;
        field546 = null;
        int var1 = -63 % ((25 - arg0) / 54);
        field562 = null;
        field549 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLwd;)V")
    public final void method147(byte arg0, class157 arg1) {
        if (arg0 > -123) {
            method144(null, (byte) -25);
        }
        field552++;
        while (true) {
            int var3 = arg1.method1194(false);
            if (var3 == 0) {
                return;
            }
            this.method143(arg1, var3, -2);
        }
    }
}
