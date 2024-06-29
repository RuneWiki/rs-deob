import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class269 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Z")
    public boolean field4502 = false;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    private int field4520 = 128;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    private int field4525 = 128;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    private int field4521 = 0;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    private int field4511 = 0;

    @OriginalMember(owner = "client!r", name = "E", descriptor = "I")
    private int field4527 = 0;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field4508 = -1;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "Lph;")
    public static class229 field4522 = class266.method1858("<col=c0ff00>", 0);

    @OriginalMember(owner = "client!r", name = "G", descriptor = "I")
    public static int field4529 = 50;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[Lph;")
    public static class229[] field4524 = new class229[field4529];

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    public static int[] field4499 = new int[field4529];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[I")
    public static int[] field4497 = new int[field4529];

    @OriginalMember(owner = "client!r", name = "e", descriptor = "[I")
    public static int[] field4501 = new int[field4529];

    @OriginalMember(owner = "client!r", name = "j", descriptor = "[I")
    public static int[] field4506 = new int[field4529];

    @OriginalMember(owner = "client!r", name = "I", descriptor = "[I")
    public static int[] field4531 = new int[field4529];

    @OriginalMember(owner = "client!r", name = "F", descriptor = "[I")
    public static int[] field4528 = new int[field4529];

    @OriginalMember(owner = "client!r", name = "t", descriptor = "J")
    public static long field4516 = 0L;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[I")
    public static int[] field4515 = new int[field4529];

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    private int field4519;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "[I")
    public static int[] field4504;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[S")
    private short[] field4505;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "[S")
    private short[] field4509;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[S")
    private short[] field4518;

    @OriginalMember(owner = "client!r", name = "H", descriptor = "[S")
    private short[] field4530;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1865(boolean arg0) {
        field4497 = null;
        field4528 = null;
        field4524 = null;
        field4506 = null;
        if (arg0) {
            method1871((class66) null, (class66) null, (class66) null, 121);
        }
        field4501 = null;
        field4499 = null;
        field4531 = null;
        field4515 = null;
        field4504 = null;
        field4522 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 41)
    public static final void method1866(int arg0) {
        field4517++;
        Container var1;
        if (class325.field5569 != null) {
            var1 = class325.field5569;
        } else if (class160.field2590 == null) {
            var1 = class249.field4143.field1561;
        } else {
            var1 = class160.field2590;
        }
        class15.field177 = var1.getSize().width;
        class53.field754 = var1.getSize().height;
        if (class160.field2590 == var1) {
            Insets var2 = class160.field2590.getInsets();
            class15.field177 -= var2.right + var2.left;
            class53.field754 -= var2.top + var2.bottom;
        }
        if (method1870(true) < 2) {
            class253.field4224 = (class15.field177 - 765) / 2;
            class266.field4484 = 503;
            class324.field5540 = 0;
            class273.field4567 = 765;
        } else {
            class266.field4484 = class53.field754;
            class273.field4567 = class15.field177;
            class253.field4224 = 0;
            class324.field5540 = 0;
        }
        if (class99.field1675) {
            class99.method737(class273.field4567, class266.field4484);
        }
        if (arg0 <= 86) {
            field4499 = (int[]) null;
        }
        class214.field3526.setSize(class273.field4567, class266.field4484);
        if (class160.field2590 == var1) {
            Insets var3 = class160.field2590.getInsets();
            class214.field3526.setLocation(class253.field4224 + var3.left, class324.field5540 + var3.top);
        } else {
            class214.field3526.setLocation(class253.field4224, class324.field5540);
        }
        if (class198.field3292 != -1) {
            class304.method2052(76, true);
        }
        class213.method1513((byte) -101);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 107)
    public static final void method1867(byte arg0) {
        class187.field3047++;
        field4510++;
        int var1 = 9 / ((-arg0 - 54) / 55);
        class121.field2033.method37(45, 51);
        class121.field2033.method1155(-1640531527, class332.field5660);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)Lv;", line = 134)
    public final class286 method1868(int arg0, byte arg1) {
        field4523++;
        int var3 = 40 % ((-arg1 - 46) / 55);
        class286 var4 = (class286) class70.field1112.method1413((long) this.field4500, true);
        if (var4 == null) {
            class28 var5 = class28.method214(class160.field2589, this.field4519, 0);
            if (var5 == null) {
                return null;
            }
            if (this.field4518 != null) {
                for (int var6 = 0; var6 < this.field4518.length; var6++) {
                    var5.method195(this.field4518[var6], this.field4530[var6]);
                }
            }
            if (this.field4509 != null) {
                for (int var7 = 0; var7 < this.field4509.length; var7++) {
                    var5.method203(this.field4509[var7], this.field4505[var7]);
                }
            }
            var4 = var5.method193(this.field4511 + 64, this.field4527 + 850, -30, -50, -30);
            class70.field1112.method1419((long) this.field4500, 5216, var4);
        }
        class286 var8;
        if (this.field4508 == -1 || arg0 == -1) {
            var8 = var4.method1727(true, true);
        } else {
            var8 = class53.method362((byte) -68, this.field4508).method2105(var4, arg0, 47);
        }
        if (this.field4525 != 128 || this.field4520 != 128) {
            var8.method1728(this.field4525, this.field4520, this.field4525);
        }
        if (this.field4521 != 0) {
            if (this.field4521 == 90) {
                var8.method1733();
            }
            if (this.field4521 == 180) {
                var8.method1730();
            }
            if (this.field4521 == 270) {
                var8.method1710();
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLph;)Z", line = 208)
    public static final boolean method1869(byte arg0, class229 arg1) {
        field4507++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class103.field1752; var2++) {
            if (arg1.method1630(10, class133.field2170[var2])) {
                return true;
            }
        }
        if (arg0 != 3) {
            method1869((byte) 65, (class229) null);
        }
        if (arg1.method1630(arg0 + 7, class230.field3820.field3463)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)I", line = 247)
    public static final int method1870(boolean arg0) {
        field4526++;
        if (class325.field5569 != null) {
            return 3;
        } else if (class99.field1675 && class319.field5389) {
            return 2;
        } else if (class99.field1675 && !class319.field5389) {
            return 1;
        } else {
            if (!arg0) {
                field4506 = (int[]) null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lsi;Lsi;Lsi;I)V", line = 278)
    public static final void method1871(class66 arg0, class66 arg1, class66 arg2, int arg3) {
        class7.field95 = arg0;
        field4503++;
        class116.field1956 = arg1;
        class219.field3602 = arg2;
        if (arg3 != 21826) {
            field4529 = 29;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBIIIIIII)V", line = 294)
    public static final void method1872(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4498++;
        if (arg1 >= -19) {
            method1867((byte) 64);
        }
        int var9 = arg5 - arg6;
        int var10 = (arg4 - arg2 << 16) / var9;
        int var11 = arg0 - arg7;
        int var12 = (arg8 - arg3 << 16) / var11;
        class304.method2056(var10, 0, var12, arg2, arg5, arg0, arg3, -5, arg6, 0, arg7);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IBLhb;)V", line = 327)
    private final void method1873(int arg0, byte arg1, class164 arg2) {
        field4514++;
        if (arg0 == 1) {
            this.field4519 = arg2.method1161(true);
        } else if (arg0 == 2) {
            this.field4508 = arg2.method1161(true);
        } else if (arg0 == 4) {
            this.field4525 = arg2.method1161(true);
        } else if (arg0 == 5) {
            this.field4520 = arg2.method1161(true);
        } else if (arg0 == 6) {
            this.field4521 = arg2.method1161(true);
        } else if (arg0 == 7) {
            this.field4511 = arg2.method1178(8);
        } else if (arg0 == 8) {
            this.field4527 = arg2.method1178(arg1 ^ 0xFFFFFFA2);
        } else if (arg0 == 9) {
            this.field4502 = true;
        } else if (arg0 == 40) {
            int var4 = arg2.method1178(arg1 ^ 0xFFFFFFA2);
            this.field4530 = new short[var4];
            this.field4518 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4518[var5] = (short) arg2.method1161(true);
                this.field4530[var5] = (short) arg2.method1161(true);
            }
        } else if (arg0 == 41) {
            int var6 = arg2.method1178(8);
            this.field4509 = new short[var6];
            this.field4505 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4509[var7] = (short) arg2.method1161(true);
                this.field4505[var7] = (short) arg2.method1161(true);
            }
        }
        if (arg1 != -86) {
            this.method1868(83, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BLhb;)V", line = 436)
    public final void method1874(byte arg0, class164 arg1) {
        while (true) {
            int var3 = arg1.method1178(8);
            if (var3 == 0) {
                field4512++;
                int var4 = -92 / ((-arg0 - 47) / 43);
                return;
            }
            this.method1873(var3, (byte) -86, arg1);
        }
    }
}
