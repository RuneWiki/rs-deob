import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class108 {

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
    private int field1542 = 1;

    @OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
    private int field1555 = 0;

    @OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
    private int field1559 = 1;

    @OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
    private int field1552 = 0;

    @OriginalMember(owner = "client!kba", name = "q", descriptor = "Lfh;")
    private class653 field1556 = new class653();

    @OriginalMember(owner = "client!kba", name = "B", descriptor = "I")
    private int field1567 = 0;

    @OriginalMember(owner = "client!kba", name = "D", descriptor = "Z")
    private boolean field1568 = false;

    @OriginalMember(owner = "client!kba", name = "F", descriptor = "[Lbq;")
    private class293[] field1570 = new class293[2];

    @OriginalMember(owner = "client!kba", name = "z", descriptor = "Z")
    private boolean field1565 = true;

    @OriginalMember(owner = "client!kba", name = "x", descriptor = "Z")
    private boolean field1563 = true;

    @OriginalMember(owner = "client!kba", name = "E", descriptor = "Z")
    private boolean field1569 = true;

    @OriginalMember(owner = "client!kba", name = "A", descriptor = "I")
    private int field1566 = -1;

    @OriginalMember(owner = "client!kba", name = "w", descriptor = "Z")
    private boolean field1562 = true;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "Lbi;")
    private class483 field1549;

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "Lmj;")
    private class656 field1551;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "Lmj;")
    private class656 field1540;

    @OriginalMember(owner = "client!kba", name = "n", descriptor = "Lmj;")
    private class656 field1553;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "Loea;")
    public static class599 field1545 = new class599();

    @OriginalMember(owner = "client!kba", name = "v", descriptor = "I")
    public static int field1561 = -1;

    @OriginalMember(owner = "client!kba", name = "G", descriptor = "[I")
    public static int[] field1571 = new int[1];

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!kba", name = "o", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!kba", name = "r", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!kba", name = "u", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!kba", name = "y", descriptor = "Lbq;")
    private class293 field1564;

    @OriginalMember(owner = "client!kba", name = "H", descriptor = "Lmt;")
    private class400 field1572;

    @OriginalMember(owner = "client!kba", name = "I", descriptor = "Lmt;")
    private class400 field1573;

    @OriginalMember(owner = "client!kba", name = "s", descriptor = "Z")
    private boolean field1558;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
    public final void method862(int arg0) {
        field1546++;
        this.field1564 = null;
        this.field1572 = null;
        this.field1540 = this.field1553 = this.field1551 = null;
        this.field1570 = null;
        this.field1573 = null;
        if (!this.field1556.method3667((byte) -45)) {
            for (class168 var2 = this.field1556.method3672(arg0 ^ 0xFFFFFFFE); var2 != this.field1556.field9083; var2 = var2.field2336) {
                ((class243) var2).method186(-12047);
            }
        }
        this.field1559 = this.field1542 = arg0;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILrga;)Z")
    public final boolean method863(int arg0, class243 arg1) {
        if (arg0 != -25479) {
            return true;
        }
        field1560++;
        if (this.field1540 != null) {
            if (arg1.method184(-85) || arg1.method182(85)) {
                this.field1556.method3671(arg1, false);
                this.method866(-37);
                if (this.method871(109)) {
                    if (this.field1559 != -1 && this.field1542 != -1) {
                        arg1.method189(this.field1542, arg0 + 25479, this.field1559);
                    }
                    arg1.field3147 = true;
                    return true;
                }
            }
            this.method870(arg1, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
    public static void method864(int arg0) {
        field1545 = null;
        if (arg0 == -3) {
            field1571 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIBII)Z")
    public final boolean method865(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1557++;
        if (this.field1540 == null || this.field1556.method3667((byte) -45)) {
            return false;
        }
        if (this.field1559 != arg0 || this.field1542 != arg3) {
            this.field1559 = arg0;
            this.field1542 = arg3;
            for (class168 var6 = this.field1556.method3672(-1); var6 != this.field1556.field9083; var6 = var6.field2336) {
                ((class243) var6).method189(this.field1542, 0, this.field1559);
            }
            this.field1562 = true;
            this.field1565 = true;
            this.field1563 = true;
        }
        if (!this.method871(54)) {
            if (arg2 < 63) {
                this.field1556 = null;
            }
            return false;
        }
        this.field1552 = arg1;
        this.field1555 = arg4;
        this.field1558 = true;
        this.field1549.method2815((byte) 55, this.field1540);
        this.field1540.method3693(0, 0);
        this.field1549.method2838(93, this.field1542 + this.field1555 - this.field1549.field6671, -this.field1552);
        return true;
    }

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
    private final void method866(int arg0) {
        field1541++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class243 var5 = (class243) this.field1556.method3672(-1); var5 != null; var5 = (class243) this.field1556.method3662(-1)) {
            int var9 = var5.method187((byte) 13);
            var4 += var5.method1516((byte) 121);
            if (var9 > var3) {
                var3 = var9;
            }
            var2 |= var5.method1518((byte) -61);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field1566 != var6) {
            this.field1565 = true;
            this.field1566 = var6;
        }
        int var7 = this.field1567 > 2 ? 2 : this.field1567;
        if (arg0 >= -12) {
            this.field1572 = null;
        }
        int var8 = var4 > 2 ? 2 : var4;
        this.field1567 = var4;
        if (this.field1568 != var2) {
            this.field1568 = var2;
            this.field1562 = true;
        }
        if (var7 != var8) {
            this.field1563 = this.field1565 = true;
        }
    }

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
    public final void method867(int arg0) {
        field1554++;
        if (!this.field1558) {
            return;
        }
        if (this.field1553 != null) {
            this.field1549.method2828(this.field1553, -8);
            int var2 = 16384;
            this.field1549.method2849(1, this.field1551);
            this.field1553.method3685(0, (byte) 17);
            this.field1551.method3693(arg0, 0);
            if (this.field1568) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field1559, this.field1542, 0, 0, this.field1559, this.field1542, var2, 9728);
            this.field1549.method2836(arg0 ^ 0x1207, this.field1553);
            this.field1549.method2833(this.field1551, -23569);
        }
        this.field1549.method2804((byte) 23);
        this.field1549.method2844(124, arg0);
        this.field1549.method2800(1, 127);
        this.field1549.method446();
        int var3 = 0;
        int var4 = 1;
        class243 var6;
        for (class243 var5 = (class243) this.field1556.method3672(-1); var5 != null; var5 = var6) {
            var6 = (class243) this.field1556.method3662(-1);
            int var7 = var5.method1516((byte) -111);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method183(arg0 ^ 0x1E, this.field1564, var8, this.field1570[var3]);
                if (var6 == null && var7 - 1 == var8) {
                    this.field1549.method2851(90, this.field1551);
                    this.field1549.method2838(arg0 ^ 0x79, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1542);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1552, this.field1555);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1552, this.field1555 + this.field1542);
                    OpenGL.glTexCoord2f((float) this.field1559, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1559 + this.field1552, this.field1555 - -this.field1542);
                    OpenGL.glTexCoord2f((float) this.field1559, (float) this.field1542);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1559 + this.field1552, this.field1555);
                    OpenGL.glEnd();
                } else {
                    this.field1551.method3693(0, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field1542);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field1542);
                    OpenGL.glTexCoord2f((float) this.field1559, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field1559, this.field1542);
                    OpenGL.glTexCoord2f((float) this.field1559, (float) this.field1542);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field1559, 0);
                    OpenGL.glEnd();
                }
                var4 = var4 + 1 & 0x1;
                var3 = var3 + 1 & 0x1;
                var5.method188(var8, (byte) 121);
            }
        }
        this.field1558 = false;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIIIZ)V")
    public static final void method868(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1548++;
        if (arg0 >= -68) {
            field1545 = null;
        }
        if (class748.field10451.field10399.method1924((byte) -63) == 0) {
            class67.method621(64, false);
        } else {
            class365.field4708 = class748.field10451.field10399.method1924((byte) 56);
            class415.method2331(true, 0, -4);
        }
        class249.field3206 = arg4;
        class454.field6067 = arg3;
        class444.field5889 = arg2;
        class73.method651(arg1);
    }

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)Z")
    public final boolean method869(int arg0) {
        field1543++;
        if (arg0 != 1) {
            this.field1559 = 51;
        }
        return this.field1540 != null;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lrga;I)V")
    public final void method870(class243 arg0, int arg1) {
        arg0.field3147 = false;
        field1544++;
        arg0.method186(-12047);
        arg0.method1175(-2);
        if (arg1 != 0) {
            field1571 = null;
        }
        this.method866(-127);
    }

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "(I)Z")
    private final boolean method871(int arg0) {
        if (arg0 < 29) {
            this.field1569 = true;
        }
        if (this.field1562) {
            if (this.field1573 != null) {
                this.field1573.method2237(101);
                this.field1573 = null;
            }
            if (this.field1564 != null) {
                this.field1564.method3895(95);
                this.field1564 = null;
            }
            if (this.field1553 != null) {
                this.field1573 = new class400(this.field1549, 6402, this.field1559, this.field1542, this.field1549.field6769);
            }
            if (this.field1568) {
                this.field1564 = new class293(this.field1549, 34037, 6402, this.field1559, this.field1542);
            } else if (this.field1573 == null) {
                this.field1573 = new class400(this.field1549, 6402, this.field1559, this.field1542);
            }
            this.field1562 = false;
            this.field1569 = true;
            this.field1563 = true;
        }
        field1550++;
        if (this.field1565) {
            if (this.field1572 != null) {
                this.field1572.method2237(111);
                this.field1572 = null;
            }
            if (this.field1570[0] != null) {
                this.field1570[0].method3895(78);
                this.field1570[0] = null;
            }
            if (this.field1570[1] != null) {
                this.field1570[1].method3895(114);
                this.field1570[1] = null;
            }
            if (this.field1553 != null) {
                this.field1572 = new class400(this.field1549, this.field1566, this.field1559, this.field1542, this.field1549.field6769);
            }
            this.field1570[0] = new class293(this.field1549, 34037, this.field1566, this.field1559, this.field1542);
            this.field1570[1] = this.field1567 <= 1 ? null : new class293(this.field1549, 34037, this.field1566, this.field1559, this.field1542);
            this.field1569 = true;
            this.field1563 = true;
            this.field1565 = false;
        }
        if (this.field1563) {
            if (this.field1553 == null) {
                this.field1549.method2815((byte) 24, this.field1551);
                this.field1551.method3688(124, 0);
                this.field1551.method3688(-127, 1);
                this.field1551.method3688(124, 8);
                this.field1551.method3700(-116, 0, this.field1570[0]);
                if (this.field1567 > 1) {
                    this.field1551.method3700(-121, 1, this.field1570[1]);
                }
                if (this.field1568) {
                    this.field1551.method3700(-52, 8, this.field1564);
                } else {
                    this.field1551.method3695(1, 8, this.field1573);
                }
                this.field1549.method2851(121, this.field1551);
            } else {
                this.field1549.method2815((byte) 74, this.field1551);
                this.field1551.method3688(-120, 0);
                this.field1551.method3688(-47, 1);
                this.field1551.method3688(82, 8);
                this.field1551.method3700(84, 0, this.field1570[0]);
                if (this.field1567 > 1) {
                    this.field1551.method3700(-101, 1, this.field1570[1]);
                }
                if (this.field1568) {
                    this.field1551.method3700(-105, 8, this.field1564);
                }
                this.field1549.method2851(-122, this.field1551);
                this.field1549.method2815((byte) 75, this.field1553);
                this.field1553.method3688(-126, 0);
                this.field1553.method3688(-125, 8);
                this.field1553.method3695(1, 0, this.field1572);
                this.field1553.method3695(1, 8, this.field1573);
                this.field1549.method2851(-119, this.field1553);
            }
            this.field1569 = true;
            this.field1563 = false;
        }
        if (this.field1569) {
            this.field1549.method2815((byte) 114, this.field1540);
            this.field1569 = !this.field1540.method3702(-24937);
            this.field1549.method2851(-127, this.field1540);
        }
        return !this.field1569;
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(IZIII)V")
    public static final void method872(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1547++;
        if (arg4 > arg3) {
            for (int var5 = arg3; var5 < arg4; var5++) {
                class432.field5765[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg4; var6 < arg3; var6++) {
                class432.field5765[var6][arg0] = arg2;
            }
        }
        if (!arg1) {
            field1545 = null;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lbi;)V")
    public class108(class483 arg0) {
        this.field1549 = arg0;
        if (this.field1549.field6861 && this.field1549.field6880) {
            this.field1540 = this.field1551 = new class656(this.field1549);
            if (this.field1549.field6769 > 1 && this.field1549.field6910 && this.field1549.field6908) {
                this.field1540 = this.field1553 = new class656(this.field1549);
                return;
            }
        }
    }
}
