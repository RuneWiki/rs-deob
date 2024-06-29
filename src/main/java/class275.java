import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class275 extends class404 {

    @OriginalMember(owner = "client!nn", name = "H", descriptor = "I")
    private int field4172 = 3072;

    @OriginalMember(owner = "client!nn", name = "I", descriptor = "I")
    private int field4173 = 1024;

    @OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
    private int field4176 = 2048;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "Z")
    public static boolean field4168 = false;

    @OriginalMember(owner = "client!nn", name = "K", descriptor = "[I")
    public static int[] field4175 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!nn", name = "E", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(ILha;I)V", line = 7)
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    super.field5873 = arg1.method257((byte) 108) == 1;
                }
            } else {
                this.field4172 = arg1.method254((byte) -92);
            }
        } else {
            this.field4173 = arg1.method254((byte) -34);
        }
        if (arg0 != 0) {
            this.method211(0);
        }
        ++field4174;
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V", line = 52)
    public final void method211(int arg0) {
        ++field4166;
        if (arg0 != -3) {
            method1672((byte) 102);
        }
        this.field4176 = -this.field4173 + this.field4172;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V", line = 63)
    public class275() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(II)[[I", line = 67)
    public final int[][] method89(int arg0, int arg1) {
        ++field4167;
        if (arg0 != -1) {
            field4169 = 51;
        }
        int[][] var3 = super.field5869.method2819(arg1, 1);
        if (super.field5869.field7156) {
            int[][] var4 = this.method2400(arg0 ^ 11871, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class431.field6348; ++var11) {
                var8[var11] = (var5[var11] * this.field4176 >> 12) + this.field4173;
                var9[var11] = this.field4173 - -(var6[var11] * this.field4176 >> 12);
                var10[var11] = this.field4173 - -(var7[var11] * this.field4176 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 114)
    public static final void method1672(byte arg0) {
        ++field4170;
        if (class74.field1320 != 0) {
            try {
                if (~(++class284.field4292) < -2001) {
                    if (class163.field2534 != null) {
                        class163.field2534.method1795((byte) 123);
                        class163.field2534 = null;
                    }
                    if (class390.field5712 >= 1) {
                        class407.field5909 = -5;
                        class74.field1320 = 0;
                        return;
                    }
                    if (class291.field4435 == class220.field3399) {
                        class220.field3399 = class121.field2010;
                    } else {
                        class220.field3399 = class291.field4435;
                    }
                    ++class390.field5712;
                    class74.field1320 = 1;
                    class284.field4292 = 0;
                }
                if (class74.field1320 == 1) {
                    class103.field1831 = class7.field86.method1583(class376.field5480, class220.field3399, (byte) 58);
                    class74.field1320 = 2;
                }
                if (class74.field1320 == 2) {
                    if (class103.field1831.field2802 == 2) {
                        throw new IOException();
                    }
                    if (class103.field1831.field2802 != 1) {
                        return;
                    }
                    class163.field2534 = new class295((Socket) class103.field1831.field2803, class7.field86);
                    class103.field1831 = null;
                    class163.field2534.method1787(class230.field3508.field536, 0, 4900, class230.field3508.field585);
                    class111.method797(0);
                    int var1 = class163.field2534.method1792(0);
                    class111.method797(0);
                    if (~var1 != -22) {
                        class74.field1320 = 0;
                        class407.field5909 = var1;
                        class163.field2534.method1795((byte) 125);
                        class163.field2534 = null;
                        return;
                    }
                    class74.field1320 = 3;
                }
                if (~class74.field1320 == -4) {
                    if (~class163.field2534.method1789(27683) > -2) {
                        return;
                    }
                    class10.field138 = new String[class163.field2534.method1792(0)];
                    class74.field1320 = 4;
                }
                if (~class74.field1320 == -5) {
                    if (class163.field2534.method1789(27683) < class10.field138.length * 8) {
                        return;
                    }
                    class491.field7457.field585 = 0;
                    class163.field2534.method1788(-13205, 0, class491.field7457.field536, class10.field138.length * 8);
                    for (int var2 = 0; class10.field138.length > var2; ++var2) {
                        class10.field138[var2] = class487.method2921(class491.field7457.method265((byte) 71), 52);
                    }
                    class407.field5909 = 21;
                    class74.field1320 = 0;
                    class163.field2534.method1795((byte) 123);
                    class163.field2534 = null;
                    return;
                }
            } catch (IOException var3) {
                if (class163.field2534 != null) {
                    class163.field2534.method1795((byte) 126);
                    class163.field2534 = null;
                }
                if (~class390.field5712 <= -2) {
                    class407.field5909 = -4;
                    class74.field1320 = 0;
                } else {
                    if (class291.field4435 != class220.field3399) {
                        class220.field3399 = class291.field4435;
                    } else {
                        class220.field3399 = class121.field2010;
                    }
                    class74.field1320 = 1;
                    class284.field4292 = 0;
                    ++class390.field5712;
                }
            }
            if (arg0 != 43) {
                method1672((byte) -126);
            }
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)[I", line = 255)
    public final int[] method90(int arg0, int arg1) {
        if (arg0 > -47) {
            return null;
        } else {
            ++field4171;
            int[] var3 = super.field5870.method372(arg1, (byte) -113);
            if (super.field5870.field810) {
                int[] var4 = this.method2394(0, (byte) 64, arg1);
                for (int var5 = 0; var5 < class431.field6348; ++var5) {
                    var3[var5] = (var4[var5] * this.field4176 >> 12) + this.field4173;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "(I)V", line = 296)
    public static void method1673(int arg0) {
        int var1 = -68 % ((-53 - arg0) / 51);
        field4175 = null;
    }
}
