import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class553 {

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public int field7615 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    private int field7618 = -1;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field7620 = -1;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Z")
    public boolean field7619 = true;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field7623 = -1;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    private int field7628 = -1;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public int field7641 = -1;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "Z")
    public boolean field7644 = true;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field7612 = -1;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "I")
    public int field7621 = 0;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[Ljava/lang/String;")
    public String[] field7622 = new String[5];

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "I")
    private int field7643 = -1;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public int field7640 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public int field7629 = -1;

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "I")
    public int field7648 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    private int field7635 = -1;

    @OriginalMember(owner = "client!ii", name = "S", descriptor = "I")
    private int field7651 = -1;

    @OriginalMember(owner = "client!ii", name = "V", descriptor = "Z")
    public boolean field7654 = true;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Z")
    public boolean field7614 = false;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public int field7646 = -1;

    @OriginalMember(owner = "client!ii", name = "T", descriptor = "I")
    public int field7652 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "I")
    public int field7650 = -1;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field7608;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public int field7611;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public int field7613;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field7616;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    public int field7625;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public int field7626;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public int field7627;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    private int field7630;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    private int field7631;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    private int field7632;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    private int field7637;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "I")
    public static int field7645;

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public int field7647;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public int field7649;

    @OriginalMember(owner = "client!ii", name = "U", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!ii", name = "W", descriptor = "I")
    public static int field7655;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Leq;")
    private class213 field7633;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "Lon;")
    public class337 field7638;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "Ljava/lang/String;")
    public String field7610;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Ljava/lang/String;")
    public String field7642;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[B")
    public byte[] field7609;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "[I")
    public int[] field7617;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
    public int[] field7636;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public final void method3179(int arg0) {
        field7653++;
        if (arg0 != -25359) {
            this.field7623 = -106;
        }
        if (this.field7636 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field7636.length; var2 += 2) {
            if (this.field7648 > this.field7636[var2]) {
                this.field7648 = this.field7636[var2];
            } else if (this.field7636[var2] > this.field7640) {
                this.field7640 = this.field7636[var2];
            }
            if (this.field7636[var2 + 1] < this.field7652) {
                this.field7652 = this.field7636[var2 + 1];
            } else if (this.field7636[var2 + 1] > this.field7615) {
                this.field7615 = this.field7636[var2 + 1];
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ldd;I)Z")
    public final boolean method3180(class703 arg0, int arg1) {
        field7639++;
        int var3;
        if (this.field7651 == -1) {
            if (this.field7635 == -1) {
                return true;
            }
            var3 = arg0.method895(this.field7635, -65536);
        } else {
            var3 = arg0.method904(this.field7651, (byte) -16);
        }
        if (var3 < this.field7630 || this.field7637 < var3) {
            return false;
        }
        if (arg1 < 26) {
            this.field7631 = 11;
        }
        boolean var4 = false;
        int var5;
        if (this.field7628 == -1) {
            if (this.field7618 == -1) {
                return true;
            }
            var5 = arg0.method895(this.field7618, -65536);
        } else {
            var5 = arg0.method904(this.field7628, (byte) -16);
        }
        return this.field7632 <= var5 && this.field7631 >= var5;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ZLha;B)Lmi;")
    public final class496 method3181(boolean arg0, class59 arg1, byte arg2) {
        field7624++;
        int var4 = arg0 ? this.field7650 : this.field7623;
        if (arg2 != 127) {
            return null;
        }
        int var5 = var4 | arg1.field1158 << 29;
        class496 var6 = (class496) this.field7638.field4758.method992((long) var5, 64);
        if (var6 != null) {
            return var6;
        } else if (this.field7638.field4756.method874(false, var4)) {
            class267 var7 = class267.method1780(this.field7638.field4756, var4, 0);
            if (var7 != null) {
                var6 = arg1.method356(var7, true);
                this.field7638.field4758.method991(var6, (long) var5, (byte) -111);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lha;Z)Lmi;")
    public final class496 method3182(class59 arg0, boolean arg1) {
        field7608++;
        if (arg1) {
            this.method3182(null, true);
        }
        class496 var3 = (class496) this.field7638.field4758.method992((long) (this.field7643 | 0x20000 | arg0.field1158 << 29), -75);
        if (var3 != null) {
            return var3;
        }
        this.field7638.field4756.method874(arg1, this.field7643);
        class267 var4 = class267.method1780(this.field7638.field4756, this.field7643, 0);
        if (var4 != null) {
            var3 = arg0.method356(var4, true);
            this.field7638.field4758.method991(var3, (long) (arg0.field1158 << 29 | this.field7643 | 0x20000), (byte) -121);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
    public final String method3183(String arg0, int arg1, byte arg2) {
        field7634++;
        int var4 = -100 / ((63 - arg2) / 58);
        if (this.field7633 == null) {
            return arg0;
        } else {
            class568 var5 = (class568) this.field7633.method1465((long) arg1, -6008);
            return var5 == null ? arg0 : var5.field7814;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(ILcea;I)V")
    private final void method3184(int arg0, class215 arg1, int arg2) {
        field7616++;
        if (arg0 == 1) {
            this.field7623 = arg1.method1478(842397944);
        } else if (arg0 == 2) {
            this.field7650 = arg1.method1478(842397944);
        } else if (arg0 == 3) {
            this.field7642 = arg1.method1525((byte) 93);
        } else if (arg0 == 4) {
            this.field7625 = arg1.method1499(-1);
        } else if (arg0 == 5) {
            this.field7612 = arg1.method1499(-1);
        } else if (arg0 == 6) {
            this.field7621 = arg1.method1535(255);
        } else if (arg0 == 7) {
            int var4 = arg1.method1535(255);
            if ((var4 & 0x1) == 0) {
                this.field7619 = false;
            }
            if ((var4 & 0x2) == 2) {
                this.field7614 = true;
            }
        } else if (arg0 == 8) {
            this.field7644 = arg1.method1535(255) == 1;
        } else if (arg0 == 9) {
            this.field7635 = arg1.method1478(842397944);
            if (this.field7635 == 65535) {
                this.field7635 = -1;
            }
            this.field7651 = arg1.method1478(842397944);
            if (this.field7651 == 65535) {
                this.field7651 = -1;
            }
            this.field7630 = arg1.method1533((byte) -126);
            this.field7637 = arg1.method1533((byte) -126);
        } else if (arg0 >= 10 && arg0 <= 14) {
            this.field7622[arg0 - 10] = arg1.method1525((byte) -45);
        } else if (arg0 == 15) {
            int var5 = arg1.method1535(255);
            this.field7636 = new int[var5 * 2];
            for (int var6 = 0; var6 < var5 * 2; var6++) {
                this.field7636[var6] = arg1.method1520(13638);
            }
            this.field7627 = arg1.method1533((byte) -126);
            int var7 = arg1.method1535(255);
            this.field7617 = new int[var7];
            for (int var8 = 0; var8 < this.field7617.length; var8++) {
                this.field7617[var8] = arg1.method1533((byte) -126);
            }
            this.field7609 = new byte[var5];
            for (int var9 = 0; var9 < var5; var9++) {
                this.field7609[var9] = arg1.method1536(-107);
            }
        } else if (arg0 == 16) {
            this.field7654 = false;
        } else if (arg0 == 17) {
            this.field7610 = arg1.method1525((byte) 117);
        } else if (arg0 == 18) {
            this.field7643 = arg1.method1478(842397944);
        } else if (arg0 == 19) {
            this.field7641 = arg1.method1478(842397944);
        } else if (arg0 == 20) {
            this.field7618 = arg1.method1478(842397944);
            if (this.field7618 == 65535) {
                this.field7618 = -1;
            }
            this.field7628 = arg1.method1478(842397944);
            if (this.field7628 == 65535) {
                this.field7628 = -1;
            }
            this.field7632 = arg1.method1533((byte) -126);
            this.field7631 = arg1.method1533((byte) -126);
        } else if (arg0 == 21) {
            this.field7649 = arg1.method1533((byte) -126);
        } else if (arg0 == 22) {
            this.field7647 = arg1.method1533((byte) -126);
        } else if (arg0 == 23) {
            this.field7629 = arg1.method1535(255);
            this.field7620 = arg1.method1535(255);
            this.field7646 = arg1.method1535(255);
        } else if (arg0 == 24) {
            this.field7611 = arg1.method1520(13638);
            this.field7613 = arg1.method1520(13638);
        } else if (arg0 == 249) {
            int var10 = arg1.method1535(255);
            if (this.field7633 == null) {
                int var11 = class529.method3059(var10, (byte) 108);
                this.field7633 = new class213(var11);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                boolean var13 = arg1.method1535(255) == 1;
                int var14 = arg1.method1499(-1);
                class362 var15;
                if (var13) {
                    var15 = new class568(arg1.method1525((byte) -41));
                } else {
                    var15 = new class113(arg1.method1533((byte) -126));
                }
                this.field7633.method1468((byte) 60, (long) var14, var15);
            }
        }
        if (arg2 > -113) {
            this.method3182(null, true);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIZ)I")
    public final int method3185(int arg0, int arg1, boolean arg2) {
        field7645++;
        if (this.field7633 == null) {
            return arg0;
        } else if (arg2) {
            return -1;
        } else {
            class113 var4 = (class113) this.field7633.method1465((long) arg1, -6008);
            return var4 == null ? arg0 : var4.field1945;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lcea;I)V")
    public final void method3186(class215 arg0, int arg1) {
        if (arg1 < 81) {
            this.field7635 = 17;
        }
        field7655++;
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                return;
            }
            this.method3184(var3, arg0, -121);
        }
    }
}
