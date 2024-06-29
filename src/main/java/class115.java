import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class115 {

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lpo;")
    private class476 field1892 = new class476();

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lhca;")
    public static class179 field1889 = new class179("WIP", 2);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "Lpo;")
    private class476 field1897;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lgp;")
    public static class561 field1890;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method942(boolean arg0) {
        field1883++;
        class412.method2497(class311.field4557, 80);
        class55.field790++;
        if (class640.field9283 && class604.field8590) {
            if (!arg0) {
                field1893 = -85;
            }
            int var1 = class619.field8735.method1614((byte) -46);
            int var2 = class619.field8735.method1607((byte) -78);
            int var3 = var1 - class641.field9292;
            int var4 = var2 - class216.field3271;
            if (class560.field7943 > var3) {
                var3 = class560.field7943;
            }
            if (var4 < class409.field6068) {
                var4 = class409.field6068;
            }
            if (class560.field7943 + class179.field2601.field7678 < var3 - -class311.field4557.field7678) {
                var3 = class560.field7943 + class179.field2601.field7678 - class311.field4557.field7678;
            }
            if (var4 + class311.field4557.field7776 > class409.field6068 - -class179.field2601.field7776) {
                var4 = class409.field6068 + class179.field2601.field7776 - class311.field4557.field7776;
            }
            int var5 = class179.field2601.field7676 + var3 - class560.field7943;
            int var6 = var4 + class179.field2601.field7643 - class409.field6068;
            if (class619.field8735.method2009(-1)) {
                if (class55.field790 > class311.field4557.field7723) {
                    int var7 = var3 - class473.field6780;
                    int var8 = var4 - class512.field7084;
                    if (class311.field4557.field7747 < var7 || -class311.field4557.field7747 > var7 || var8 > class311.field4557.field7747 || (-class311.field4557.field7747) > var8) {
                        class412.field6107 = true;
                    }
                }
                if (class311.field4557.field7728 != null && class412.field6107) {
                    class526 var9 = new class526();
                    var9.field7326 = var6;
                    var9.field7315 = class311.field4557;
                    var9.field7314 = class311.field4557.field7728;
                    var9.field7323 = var5;
                    class30.method277(var9);
                    return;
                }
            } else {
                if (class412.field6107) {
                    class294.method1853(49);
                    if (class311.field4557.field7769 != null) {
                        class526 var10 = new class526();
                        var10.field7320 = class558.field7915;
                        var10.field7315 = class311.field4557;
                        var10.field7326 = var6;
                        var10.field7323 = var5;
                        var10.field7314 = class311.field4557.field7769;
                        class30.method277(var10);
                    }
                    if (class558.field7915 != null && client.method3513(class311.field4557) != null) {
                        class74.method711(false, class558.field7915, class311.field4557);
                    }
                } else if ((class54.field776 == 1 || class55.method454((byte) -127)) && class480.field6825 > 2) {
                    class565.method3217(2, class641.field9292 + class473.field6780, class512.field7084 + class216.field3271);
                } else if (class249.method1580(4)) {
                    class565.method3217(2, class641.field9292 + class473.field6780, class512.field7084 + class216.field3271);
                }
                class311.field4557 = null;
            }
        } else if (class55.field790 > 1) {
            class311.field4557 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method943(byte arg0) {
        field1889 = null;
        field1890 = null;
        if (arg0 < 92) {
            field1889 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lpo;")
    public final class476 method944(int arg0) {
        field1894++;
        class476 var2 = this.field1892.field6806;
        if (this.field1892 == var2) {
            this.field1897 = null;
            return null;
        } else {
            int var3 = 62 % ((-arg0 - 81) / 42);
            this.field1897 = var2.field6806;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)Z")
    public final boolean method945(byte arg0) {
        field1896++;
        int var2 = 13 / ((arg0 + 37) / 56);
        return this.field1892.field6806 == this.field1892;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
    public static final void method946(int arg0) {
        class498.field6975 = null;
        class273.field3996 = null;
        class409.field6077 = null;
        class125.field2031 = null;
        class402.field6012 = null;
        field1884++;
        class501.field7032 = null;
        class449.field6543 = null;
        class61.field851 = null;
        class471.field6769 = null;
        class243.field3521 = null;
        class225.field3360 = null;
        if (arg0 != -31688) {
            method943((byte) 11);
        }
        class172.field2496 = null;
        class202.field2849 = null;
        class380.field5593 = null;
        class561.field8025 = null;
        class384.field5708 = null;
        class25.field351 = null;
        class128.field2091 = null;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(B)Lpo;")
    public final class476 method947(byte arg0) {
        int var2 = -22 % ((69 - arg0) / 47);
        field1891++;
        class476 var3 = this.field1897;
        if (this.field1892 == var3) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var3.field6806;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)Lpo;")
    public final class476 method948(boolean arg0) {
        field1887++;
        if (!arg0) {
            return null;
        }
        class476 var2 = this.field1892.field6804;
        if (this.field1892 == var2) {
            this.field1897 = null;
            return null;
        } else {
            this.field1897 = var2.field6804;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(Z)I")
    public final int method949(boolean arg0) {
        field1885++;
        int var2 = 0;
        if (arg0) {
            this.method952((byte) -106, null);
        }
        class476 var3 = this.field1892.field6806;
        while (this.field1892 != var3) {
            var3 = var3.field6806;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Lpo;")
    public final class476 method950(int arg0) {
        field1882++;
        int var2 = -95 % ((arg0 + 28) / 34);
        class476 var3 = this.field1892.field6806;
        if (this.field1892 == var3) {
            return null;
        } else {
            var3.method2753(0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V")
    public final void method951(int arg0) {
        if (arg0 != -8790) {
            this.method945((byte) 55);
        }
        field1888++;
        while (true) {
            class476 var2 = this.field1892.field6806;
            if (this.field1892 == var2) {
                this.field1897 = null;
                return;
            }
            var2.method2753(0);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLpo;)V")
    public final void method952(byte arg0, class476 arg1) {
        field1886++;
        if (arg1.field6804 != null) {
            arg1.method2753(0);
        }
        arg1.field6806 = this.field1892;
        arg1.field6804 = this.field1892.field6804;
        if (arg0 >= 6) {
            arg1.field6804.field6806 = arg1;
            arg1.field6806.field6804 = arg1;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class115() {
        this.field1892.field6804 = this.field1892;
        this.field1892.field6806 = this.field1892;
    }
}
