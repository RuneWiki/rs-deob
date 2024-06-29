import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!WRRBQEHV")
public class Pix8 extends Draw2D {

    @OriginalMember(owner = "client!WRRBQEHV", name = "w", descriptor = "I")
    private int field1541 = 3;

    @OriginalMember(owner = "client!WRRBQEHV", name = "x", descriptor = "Z")
    private boolean field1542 = true;

    @OriginalMember(owner = "client!WRRBQEHV", name = "z", descriptor = "I")
    private int field1544 = -235;

    @OriginalMember(owner = "client!WRRBQEHV", name = "A", descriptor = "B")
    private byte field1545 = 5;

    @OriginalMember(owner = "client!WRRBQEHV", name = "B", descriptor = "I")
    private int field1546 = -3539;

    @OriginalMember(owner = "client!WRRBQEHV", name = "C", descriptor = "Z")
    private boolean field1547 = true;

    @OriginalMember(owner = "client!WRRBQEHV", name = "J", descriptor = "I")
    public int field1554;

    @OriginalMember(owner = "client!WRRBQEHV", name = "K", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!WRRBQEHV", name = "E", descriptor = "[I")
    public int[] field1549;

    @OriginalMember(owner = "client!WRRBQEHV", name = "H", descriptor = "I")
    public int field1552;

    @OriginalMember(owner = "client!WRRBQEHV", name = "I", descriptor = "I")
    public int field1553;

    @OriginalMember(owner = "client!WRRBQEHV", name = "F", descriptor = "I")
    public int field1550;

    @OriginalMember(owner = "client!WRRBQEHV", name = "G", descriptor = "I")
    public int field1551;

    @OriginalMember(owner = "client!WRRBQEHV", name = "D", descriptor = "[B")
    public byte[] field1548;

    @OriginalMember(owner = "client!WRRBQEHV", name = "y", descriptor = "I")
    private int field1543;

    @OriginalMember(owner = "client!WRRBQEHV", name = "<init>", descriptor = "(LATJMVOZR;Ljava/lang/String;I)V")
    public Pix8(Jagfile arg0, String arg1, int arg2) {
        Packet var4 = new Packet(true, arg0.method2(arg1 + ".dat", null));
        Packet var5 = new Packet(true, arg0.method2("index.dat", null));
        var5.pos = var4.g2();
        this.field1554 = var5.g2();
        this.field1555 = var5.g2();
        int var6 = var5.g1();
        this.field1549 = new int[var6];
        for (int var7 = 0; var7 < var6 - 1; var7++) {
            this.field1549[var7 + 1] = var5.g3();
        }
        for (int var8 = 0; var8 < arg2; var8++) {
            var5.pos += 2;
            var4.pos += var5.g2() * var5.g2();
            var5.pos++;
        }
        this.field1552 = var5.g1();
        this.field1553 = var5.g1();
        this.field1550 = var5.g2();
        this.field1551 = var5.g2();
        int var9 = var5.g1();
        int var10 = this.field1551 * this.field1550;
        this.field1548 = new byte[var10];
        if (var9 == 0) {
            for (int var11 = 0; var11 < var10; var11++) {
                this.field1548[var11] = var4.g1b();
            }
        } else {
            if (var9 == 1) {
                for (int var12 = 0; var12 < this.field1550; var12++) {
                    for (int var13 = 0; var13 < this.field1551; var13++) {
                        this.field1548[this.field1550 * var13 + var12] = var4.g1b();
                    }
                }
            }
            if (Linkable.field1772) {
            }
        }
    }

    @OriginalMember(owner = "client!WRRBQEHV", name = "b", descriptor = "(I)V")
    public void method487(int arg0) {
        this.field1554 /= 2;
        this.field1555 /= 2;
        byte[] var2 = new byte[this.field1555 * this.field1554];
        int var3 = 0;
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < this.field1551; var4++) {
            for (int var5 = 0; var5 < this.field1550; var5++) {
                var2[(this.field1552 + var5 >> 1) + (this.field1553 + var4 >> 1) * this.field1554] = this.field1548[var3++];
            }
        }
        this.field1548 = var2;
        this.field1550 = this.field1554;
        this.field1551 = this.field1555;
        this.field1552 = 0;
        this.field1553 = 0;
    }

    @OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(Z)V")
    public void method488(boolean arg0) {
        if (this.field1554 == this.field1550 && this.field1555 == this.field1551) {
            return;
        }
        byte[] var2 = new byte[this.field1555 * this.field1554];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1551; var4++) {
            for (int var5 = 0; var5 < this.field1550; var5++) {
                var2[(this.field1553 + var4) * this.field1554 + this.field1552 + var5] = this.field1548[var3++];
            }
        }
        this.field1548 = var2;
        this.field1550 = this.field1554;
        if (arg0) {
            this.field1551 = this.field1555;
            this.field1552 = 0;
            this.field1553 = 0;
        }
    }

    @OriginalMember(owner = "client!WRRBQEHV", name = "c", descriptor = "(I)V")
    public void method489(int arg0) {
        byte[] var2 = new byte[this.field1551 * this.field1550];
        int var3 = 0;
        for (int var4 = 0; var4 < this.field1551; var4++) {
            for (int var5 = this.field1550 - 1; var5 >= 0; var5--) {
                var2[var3++] = this.field1548[this.field1550 * var4 + var5];
            }
        }
        this.field1548 = var2;
        if (arg0 == 0) {
            this.field1552 = this.field1554 - this.field1550 - this.field1552;
        }
    }

    @OriginalMember(owner = "client!WRRBQEHV", name = "b", descriptor = "(B)V")
    public void method490(byte arg0) {
        byte[] var2 = new byte[this.field1551 * this.field1550];
        int var3 = 0;
        if (arg0 != 7) {
            this.field1547 = !this.field1547;
        }
        for (int var4 = this.field1551 - 1; var4 >= 0; var4--) {
            for (int var5 = 0; var5 < this.field1550; var5++) {
                var2[var3++] = this.field1548[this.field1550 * var4 + var5];
            }
        }
        this.field1548 = var2;
        this.field1553 = this.field1555 - this.field1551 - this.field1553;
    }

    @OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(IIII)V")
    public void method491(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field1549.length; var5++) {
            int var6 = this.field1549[var5] >> 16 & 0xFF;
            int var7 = arg2 + var6;
            if (var7 < 0) {
                var7 = 0;
            } else if (var7 > 255) {
                var7 = 255;
            }
            int var8 = this.field1549[var5] >> 8 & 0xFF;
            int var9 = arg1 + var8;
            if (var9 < 0) {
                var9 = 0;
            } else if (var9 > 255) {
                var9 = 255;
            }
            int var10 = this.field1549[var5] & 0xFF;
            int var11 = arg0 + var10;
            if (var11 < 0) {
                var11 = 0;
            } else if (var11 > 255) {
                var11 = 255;
            }
            this.field1549[var5] = (var7 << 16) + (var9 << 8) + var11;
        }
        if (this.field1544 == arg3) {
            ;
        }
    }

    @OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(III)V")
    public void method492(int arg0, int arg1, int arg2) {
        int var4 = this.field1552 + arg1;
        int var5 = this.field1553 + arg0;
        while (arg2 >= 0) {
            for (int var15 = 1; var15 > 0; var15++) {
            }
        }
        int var6 = Draw2D.field1095 * var5 + var4;
        int var7 = 0;
        int var8 = this.field1551;
        int var9 = this.field1550;
        int var10 = Draw2D.field1095 - var9;
        int var11 = 0;
        if (var5 < Draw2D.field1097) {
            int var12 = Draw2D.field1097 - var5;
            var8 -= var12;
            var5 = Draw2D.field1097;
            var7 += var9 * var12;
            var6 += Draw2D.field1095 * var12;
        }
        if (var5 + var8 > Draw2D.field1098) {
            var8 -= var5 + var8 - Draw2D.field1098;
        }
        if (var4 < Draw2D.field1099) {
            int var13 = Draw2D.field1099 - var4;
            var9 -= var13;
            var4 = Draw2D.field1099;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > Draw2D.field1100) {
            int var14 = var4 + var9 - Draw2D.field1100;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            this.method493(var7, Draw2D.field1094, this.field1548, var11, this.field1549, var8, var9, var6, false, var10);
        }
    }

    @OriginalMember(owner = "client!WRRBQEHV", name = "a", descriptor = "(I[I[BI[IIIIZI)V")
    private void method493(int arg0, int[] arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        int var11 = -(arg6 >> 2);
        int var12 = -(arg6 & 0x3);
        if (arg8) {
            this.field1543 = 264;
        }
        for (int var13 = -arg5; var13 < 0; var13++) {
            for (int var14 = var11; var14 < 0; var14++) {
                byte var17 = arg2[arg0++];
                if (var17 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var17 & 0xFF];
                }
                byte var18 = arg2[arg0++];
                if (var18 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var18 & 0xFF];
                }
                byte var19 = arg2[arg0++];
                if (var19 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var19 & 0xFF];
                }
                byte var20 = arg2[arg0++];
                if (var20 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var20 & 0xFF];
                }
            }
            for (int var15 = var12; var15 < 0; var15++) {
                byte var16 = arg2[arg0++];
                if (var16 == 0) {
                    arg7++;
                } else {
                    arg1[arg7++] = arg4[var16 & 0xFF];
                }
            }
            arg7 += arg9;
            arg0 += arg3;
        }
    }
}
