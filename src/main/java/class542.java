import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class542 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lmfa;")
    private class562 field7770;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field7775 = 1;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "Lkfa;")
    public static class549 field7774 = new class549(35, 7);

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field7771;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public static int field7776;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field7777;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "Lmu;")
    private class270 field7772;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)Lmu;", line = 11)
    public final class270 method3075(byte arg0) {
        field7773++;
        class270 var2 = this.field7772;
        if (this.field7770.field7992 == var2) {
            this.field7772 = null;
            return null;
        }
        if (arg0 >= -83) {
            this.method3077(null, -7);
        }
        this.field7772 = var2.field3394;
        return var2;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "()V", line = 31)
    public class542() {
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V", line = 34)
    public static void method3076(byte arg0) {
        if (arg0 >= -25) {
            field7774 = null;
        }
        field7774 = null;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lmfa;I)V", line = 45)
    public final void method3077(class562 arg0, int arg1) {
        if (arg1 != 120) {
            this.method3075((byte) -127);
        }
        field7771++;
        this.field7770 = arg0;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lmfa;)V", line = 55)
    public class542(class562 arg0) {
        this.field7770 = arg0;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIII)Z", line = 66)
    public static final boolean method3078(int arg0, int arg1, int arg2, int arg3) {
        if (!class601.method3362(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class8.field70;
        int var5 = arg2 << class8.field70;
        int var6 = class628.field8912[arg0].method253(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class8.field70 - 7);
        int var8 = var6 - (0xE6 << class8.field70 - 7);
        int var9 = var6 - (0xEE << class8.field70 - 7);
        if (arg3 == 1) {
            if (var4 > class461.field6410) {
                if (!class436.method2407(var4, var6, var5)) {
                    return false;
                }
                if (!class436.method2407(var4, var6, class389.field5194 + var5)) {
                    return false;
                }
                if (!class436.method2407(var4, var6, class463.field6445 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class436.method2407(var4, var7, var5)) {
                    return false;
                }
                if (!class436.method2407(var4, var7, class389.field5194 + var5)) {
                    return false;
                }
                if (!class436.method2407(var4, var7, class463.field6445 + var5)) {
                    return false;
                }
            }
            if (!class436.method2407(var4, var8, var5)) {
                return false;
            } else if (class436.method2407(var4, var8, class389.field5194 + var5)) {
                return class436.method2407(var4, var8, class463.field6445 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class351.field4599) {
                if (!class436.method2407(var4, var6, class463.field6445 + var5)) {
                    return false;
                }
                if (!class436.method2407(class389.field5194 + var4, var6, class463.field6445 + var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var6, class463.field6445 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class436.method2407(var4, var7, class463.field6445 + var5)) {
                    return false;
                }
                if (!class436.method2407(class389.field5194 + var4, var7, class463.field6445 + var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var7, class463.field6445 + var5)) {
                    return false;
                }
            }
            if (!class436.method2407(var4, var8, class463.field6445 + var5)) {
                return false;
            } else if (class436.method2407(class389.field5194 + var4, var8, class463.field6445 + var5)) {
                return class436.method2407(class463.field6445 + var4, var8, class463.field6445 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class461.field6410) {
                if (!class436.method2407(class463.field6445 + var4, var6, var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var6, class389.field5194 + var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var6, class463.field6445 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class436.method2407(class463.field6445 + var4, var7, var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var7, class389.field5194 + var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var7, class463.field6445 + var5)) {
                    return false;
                }
            }
            if (!class436.method2407(class463.field6445 + var4, var8, var5)) {
                return false;
            } else if (class436.method2407(class463.field6445 + var4, var8, class389.field5194 + var5)) {
                return class436.method2407(class463.field6445 + var4, var8, class463.field6445 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class351.field4599) {
                if (!class436.method2407(var4, var6, var5)) {
                    return false;
                }
                if (!class436.method2407(class389.field5194 + var4, var6, var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class436.method2407(var4, var7, var5)) {
                    return false;
                }
                if (!class436.method2407(class389.field5194 + var4, var7, var5)) {
                    return false;
                }
                if (!class436.method2407(class463.field6445 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class436.method2407(var4, var8, var5)) {
                return false;
            } else if (class436.method2407(class389.field5194 + var4, var8, var5)) {
                return class436.method2407(class463.field6445 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class436.method2407(class389.field5194 + var4, var9, class389.field5194 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class436.method2407(var4, var8, class463.field6445 + var5);
        } else if (arg3 == 32) {
            return class436.method2407(class463.field6445 + var4, var8, class463.field6445 + var5);
        } else if (arg3 == 64) {
            return class436.method2407(class463.field6445 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class436.method2407(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[Lfv;", line = 286)
    public static final class108[] method3079(int arg0) {
        field7777++;
        if (arg0 != -19554) {
            field7775 = -105;
        }
        return new class108[] { class414.field5500, class571.field8094, class663.field9417, class30.field352, class146.field1641, class394.field5248, class223.field2830, class539.field7759, class166.field1988, class663.field9431, class353.field4631, class397.field5315, class419.field5572, class150.field1710 };
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)Lmu;", line = 297)
    public final class270 method3080(int arg0) {
        if (arg0 != 31590) {
            this.field7770 = null;
        }
        field7776++;
        class270 var2 = this.field7770.field7992.field3394;
        if (this.field7770.field7992 == var2) {
            this.field7772 = null;
            return null;
        } else {
            this.field7772 = var2.field3394;
            return var2;
        }
    }
}
