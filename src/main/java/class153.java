import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class153 {

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lco;")
    private class210 field1839 = new class210(64);

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Lg;")
    private class470 field1844;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[S")
    public static short[] field1834 = new short[256];

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
    public static int[] field1837 = new int[32];

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 4)
    public final void method734(byte arg0) {
        if (arg0 != -12) {
            field1837 = null;
        }
        class210 var2 = this.field1839;
        synchronized (this.field1839) {
            this.field1839.method1169(1076);
        }
        field1841++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method735(boolean arg0) {
        if (!arg0) {
            method736(-71);
        }
        field1843++;
        if (class453.field6415 == 10) {
            class404.method2413(false, 28);
        }
        if (class453.field6415 == 30) {
            class404.method2413(false, 25);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 35)
    public static final void method736(int arg0) {
        field1835++;
        if (arg0 >= -16) {
            field1834 = null;
        }
        for (class371 var1 = (class371) class361.field5198.method802((byte) 108); var1 != null; var1 = (class371) class361.field5198.method806((byte) 104)) {
            class459 var2 = var1.field5312;
            if (var2.field6463) {
                var1.method702((byte) -114);
                var2.method2703((byte) 94);
            } else if (var2.field6462 <= class204.field2796) {
                var2.method2699(true, class263.field3805);
                if (var2.field6463) {
                    var1.method702((byte) -114);
                } else {
                    class223.method1232(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V", line = 79)
    public final void method737(int arg0, int arg1) {
        class210 var3 = this.field1839;
        synchronized (this.field1839) {
            this.field1839.method1166(arg0, (byte) -52);
            if (arg1 < 34) {
                field1837 = null;
            }
        }
        field1842++;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(II)V", line = 103)
    public static final void method738(int arg0, int arg1) {
        class297.field4436 = arg0;
        field1833++;
        class481.field6801.method1165((byte) 118);
        if (arg1 < 44) {
            method741((byte) 65);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 115)
    public final void method739(byte arg0) {
        class210 var2 = this.field1839;
        synchronized (this.field1839) {
            this.field1839.method1165((byte) 118);
        }
        int var3 = -33 / ((-arg0 - 38) / 53);
        field1836++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Lcl;", line = 127)
    public final class337 method740(int arg0, byte arg1) {
        field1840++;
        class210 var3 = this.field1839;
        class337 var4;
        synchronized (this.field1839) {
            var4 = (class337) this.field1839.method1163((byte) 124, (long) arg0);
        }
        if (arg1 != -100) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field1844.method2768(-20472, arg0, 31);
            class337 var6 = new class337();
            if (var5 != null) {
                var6.method2045(-41, new class179(var5));
            }
            class210 var7 = this.field1839;
            synchronized (this.field1839) {
                this.field1839.method1172((long) arg0, 1, var6);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V", line = 157)
    public static void method741(byte arg0) {
        if (arg0 != -81) {
            field1834 = null;
        }
        field1837 = null;
        field1834 = null;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lci;ILg;)V", line = 170)
    public class153(class421 arg0, int arg1, class470 arg2) {
        this.field1844 = arg2;
        this.field1844.method2755(-94, 31);
    }
}
