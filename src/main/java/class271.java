import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class271 {

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    private int field4786 = 0;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    private int field4790 = -1;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "Lng;")
    private class76 field4778 = new class76();

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "Z")
    public boolean field4791 = false;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    private int field4775;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    private int field4781;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[[[I")
    private int[][][] field4776;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[La;")
    private class48[] field4783;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "Loa;")
    public static class99 field4779 = class221.method1463(2844, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "Loa;")
    public static class99 field4785 = class221.method1463(2844, "<br>");

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "Loa;")
    public static class99 field4787 = class221.method1463(2844, " x ");

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "Ltg;")
    public static class182 field4788;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
    public static final int method1793(int arg0, int arg1) {
        if (arg1 > -79) {
            field4787 = null;
        }
        field4780++;
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(I)V")
    public final void method1794(int arg0) {
        for (int var2 = 0; var2 < this.field4781; var2++) {
            this.field4776[var2][0] = null;
            this.field4776[var2][1] = null;
            this.field4776[var2][2] = null;
            this.field4776[var2] = null;
        }
        this.field4783 = null;
        this.field4776 = null;
        field4774++;
        this.field4778.method534(1);
        this.field4778 = null;
        int var3 = -81 % ((arg0 - 26) / 46);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IILoa;Loa;ILoa;)V")
    public static final void method1795(int arg0, int arg1, class99 arg2, class99 arg3, int arg4, class99 arg5) {
        field4789++;
        for (int var6 = 99; var6 > 0; var6--) {
            class249.field4291[var6] = class249.field4291[var6 - 1];
            class158.field2822[var6] = class158.field2822[var6 - 1];
            class83.field1454[var6] = class83.field1454[var6 - 1];
            class239.field4121[var6] = class239.field4121[var6 - 1];
            class290.field5073[var6] = class290.field5073[var6 - 1];
        }
        class158.field2822[0] = arg5;
        class249.field4291[0] = arg4;
        class290.field5073[0] = arg0;
        class261.field4621 = class28.field514;
        int var7 = -118 / ((arg1 + 9) / 45);
        class83.field1454[0] = arg3;
        class239.field4121[0] = arg2;
        class168.field3000++;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)V")
    public static final void method1796(int arg0, int arg1, int arg2, int arg3) {
        class216 var4 = class128.field2236[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class62 var5 = var4.field3758;
        if (var5 != null) {
            var5.field1027 = var5.field1027 * arg3 / 16;
            var5.field1033 = var5.field1033 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method1797(int arg0, byte arg1) {
        if (arg1 != -124) {
            method1793(-99, -79);
        }
        field4784++;
        if (this.field4781 == this.field4775) {
            this.field4791 = this.field4783[arg0] == null;
            this.field4783[arg0] = class9.field72;
            return this.field4776[arg0];
        } else if (this.field4781 == 1) {
            this.field4791 = this.field4790 != arg0;
            this.field4790 = arg0;
            return this.field4776[0];
        } else {
            class48 var3 = this.field4783[arg0];
            if (var3 == null) {
                this.field4791 = true;
                if (this.field4786 >= this.field4781) {
                    class48 var4 = (class48) this.field4778.method531((byte) 117);
                    var3 = new class48(arg0, var4.field800);
                    this.field4783[var4.field803] = null;
                    var4.method828((byte) -112);
                } else {
                    var3 = new class48(arg0, this.field4786);
                    this.field4786++;
                }
                this.field4783[arg0] = var3;
            } else {
                this.field4791 = false;
            }
            this.field4778.method527(var3, 10);
            return this.field4776[var3.field800];
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static final void method1798(byte arg0) {
        field4782++;
        if (class236.field4073 == 0) {
            return;
        }
        try {
            if ((++class98.field1643) > 2000) {
                if (class133.field2322 != null) {
                    class133.field2322.method54((byte) 124);
                    class133.field2322 = null;
                }
                if (class234.field4031 >= 1) {
                    class236.field4073 = 0;
                    class118.field2099 = -5;
                    return;
                }
                class236.field4073 = 1;
                class98.field1643 = 0;
                if (class7.field63 == class165.field2898) {
                    class7.field63 = class28.field528;
                } else {
                    class7.field63 = class165.field2898;
                }
                class234.field4031++;
            }
            if (class236.field4073 == 1) {
                class115.field2038 = class24.field368.method586(class196.field3420, 54, class7.field63);
                class236.field4073 = 2;
            }
            if (class236.field4073 == 2) {
                if (class115.field2038.field4844 == 2) {
                    throw new IOException();
                }
                if (class115.field2038.field4844 != 1) {
                    return;
                }
                class133.field2322 = new class7((Socket) class115.field2038.field4843, class24.field368);
                class115.field2038 = null;
                class133.field2322.method55(class131.field2277.field4619, (byte) -113, 0, class131.field2277.field4587);
                if (class226.field3917 != null) {
                    class226.field3917.method1367(0);
                }
                if (class125.field2204 != null) {
                    class125.field2204.method1367(0);
                }
                int var1 = class133.field2322.method57(-57);
                if (class226.field3917 != null) {
                    class226.field3917.method1367(0);
                }
                if (class125.field2204 != null) {
                    class125.field2204.method1367(0);
                }
                if (var1 != 21) {
                    class118.field2099 = var1;
                    class236.field4073 = 0;
                    class133.field2322.method54((byte) 21);
                    class133.field2322 = null;
                    return;
                }
                class236.field4073 = 3;
            }
            if (arg0 <= 85) {
                method1796(122, 99, 70, 87);
            }
            if (class236.field4073 == 3) {
                if (class133.field2322.method62(-1) < 1) {
                    return;
                }
                class80.field1412 = new class99[class133.field2322.method57(-81)];
                class236.field4073 = 4;
            }
            if (class236.field4073 == 4 && class133.field2322.method62(-1) >= class80.field1412.length * 8) {
                class129.field2252.field4587 = 0;
                class133.field2322.method61(-82, class129.field2252.field4619, 0, class80.field1412.length * 8);
                for (int var2 = 0; var2 < class80.field1412.length; var2++) {
                    class80.field1412[var2] = class156.method1069(-112, class129.field2252.method1695((byte) 58));
                }
                class236.field4073 = 0;
                class118.field2099 = 21;
                class133.field2322.method54((byte) 125);
                class133.field2322 = null;
            }
        } catch (IOException var3) {
            if (class133.field2322 != null) {
                class133.field2322.method54((byte) -97);
                class133.field2322 = null;
            }
            if (class234.field4031 >= 1) {
                class118.field2099 = -4;
                class236.field4073 = 0;
            } else {
                class236.field4073 = 1;
                class98.field1643 = 0;
                class234.field4031++;
                if (class7.field63 == class165.field2898) {
                    class7.field63 = class28.field528;
                } else {
                    class7.field63 = class165.field2898;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method1799(byte arg0) {
        field4773++;
        if (arg0 != 28) {
            return null;
        } else if (this.field4781 == this.field4775) {
            for (int var2 = 0; var2 < this.field4781; var2++) {
                this.field4783[var2] = class9.field72;
            }
            return this.field4776;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(II)V")
    public static final void method1800(int arg0, int arg1) {
        int var2 = 120 / ((arg1 - 12) / 36);
        field4777++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class171.method1154(121);
        } else if (arg0 == 2) {
            class281.method1848((byte) -66);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4787 = null;
        field4785 = null;
        if (arg0 != -17217) {
            method1793(-91, -33);
        }
        field4779 = null;
        field4788 = null;
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(III)V")
    public class271(int arg0, int arg1, int arg2) {
        this.field4775 = arg1;
        this.field4781 = arg0;
        this.field4776 = new int[this.field4781][3][arg2];
        this.field4783 = new class48[this.field4775];
    }
}
