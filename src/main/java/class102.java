import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class102 extends class295 {

    @OriginalMember(owner = "client!af", name = "L", descriptor = "Z")
    public boolean field1516 = true;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field1513 = 2;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "[Lqi;")
    public static class209[] field1515 = new class209[14];

    @OriginalMember(owner = "client!af", name = "F", descriptor = "S")
    public static short field1510 = 1;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!af", name = "D", descriptor = "Ljava/awt/Font;")
    public static Font field1508;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "[I")
    public int[] field1512;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "[I")
    private int[] field1518;

    @OriginalMember(owner = "client!af", name = "J", descriptor = "[Ljava/lang/String;")
    private String[] field1514;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "[[I")
    private int[][] field1523;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 7)
    public static void method870(int arg0) {
        field1515 = null;
        if (arg0 == 506) {
            field1508 = null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)I", line = 19)
    public final int method871(int arg0, int arg1) {
        field1517++;
        if (arg1 != 31272) {
            this.method875(43, 80, (class289) null);
        }
        return this.field1518 == null || arg0 < 0 || arg0 > this.field1518.length ? -1 : this.field1518[arg0];
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)Ljava/lang/String;", line = 35)
    public final String method872(boolean arg0) {
        field1511++;
        StringBuffer var2 = new StringBuffer(80);
        if (arg0) {
            this.method871(24, -17);
        }
        if (this.field1514 == null) {
            return "";
        }
        var2.append(this.field1514[0]);
        for (int var3 = 1; var3 < this.field1514.length; var3++) {
            var2.append("...");
            var2.append(this.field1514[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILap;)Ljava/lang/String;", line = 65)
    public final String method873(int arg0, class289 arg1) {
        if (arg0 <= 46) {
            return null;
        }
        field1506++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field1518 != null) {
            for (int var4 = 0; var4 < this.field1518.length; var4++) {
                var3.append(this.field1514[var4]);
                var3.append(class410.method2541(this.field1518[var4], this.field1523[var4], (byte) 61, arg1.method1826((byte) -102, class295.field3972[this.field1518[var4]])));
            }
        }
        var3.append(this.field1514[this.field1514.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZI)I", line = 93)
    public final int method874(int arg0, boolean arg1, int arg2) {
        field1519++;
        if (this.field1518 == null || arg0 < 0 || arg0 > this.field1518.length) {
            return -1;
        } else if (this.field1523[arg0] == null || arg2 < 0 || this.field1523[arg0].length < arg2) {
            return -1;
        } else if (arg1) {
            return -29;
        } else {
            return this.field1523[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IILap;)V", line = 126)
    private final void method875(int arg0, int arg1, class289 arg2) {
        if (arg1 <= 94) {
            this.method872(true);
        }
        field1521++;
        if (arg0 == 1) {
            this.field1514 = class156.method1192(0, '<', arg2.method1871(-1));
        } else if (arg0 == 2) {
            int var4 = arg2.method1861((byte) -72);
            this.field1512 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1512[var5] = arg2.method1853(97);
            }
        } else if (arg0 == 3) {
            int var6 = arg2.method1861((byte) -72);
            this.field1518 = new int[var6];
            this.field1523 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg2.method1853(-115);
                this.field1518[var7] = var8;
                this.field1523[var7] = new int[class132.field1884[var8]];
                for (int var9 = 0; var9 < class132.field1884[var8]; var9++) {
                    this.field1523[var7][var9] = arg2.method1853(114);
                }
            }
        } else if (arg0 == 4) {
            this.field1516 = false;
        }
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(B)V", line = 200)
    public final void method876(byte arg0) {
        if (arg0 > -5) {
            this.method879((byte) 118);
        }
        if (this.field1512 != null) {
            for (int var2 = 0; var2 < this.field1512.length; var2++) {
                this.field1512[var2] = class260.method1678(this.field1512[var2], 32768);
            }
        }
        field1509++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([ILap;I)V", line = 221)
    public final void method877(int[] arg0, class289 arg1, int arg2) {
        field1520++;
        if (arg2 != 8290) {
            this.field1512 = null;
        }
        if (this.field1518 == null) {
            return;
        }
        for (int var4 = 0; var4 < this.field1518.length; var4++) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = class338.field4589[this.method871(var4, 31272)];
            if (var5 > 0) {
                arg1.method1875(arg2 ^ 0x81D570A, var5, (long) arg0[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lap;B)V", line = 247)
    public final void method878(class289 arg0, byte arg1) {
        field1524++;
        while (true) {
            int var3 = arg0.method1861((byte) -72);
            if (var3 == 0) {
                int var4 = 118 % ((arg1 + 61) / 55);
                return;
            }
            this.method875(var3, 96, arg0);
        }
    }

    @OriginalMember(owner = "client!af", name = "f", descriptor = "(B)I", line = 274)
    public final int method879(byte arg0) {
        field1522++;
        if (arg0 == -16) {
            return this.field1518 == null ? 0 : this.field1518.length;
        } else {
            return 101;
        }
    }
}
