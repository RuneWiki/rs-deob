import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class454 {

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "Z")
    private boolean field5975 = false;

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    private int field5978 = -1;

    @OriginalMember(owner = "client!fw", name = "l", descriptor = "[Ljava/lang/String;")
    private String[] field5985 = new String[0];

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    private int field5974;

    @OriginalMember(owner = "client!fw", name = "i", descriptor = "F")
    public static float field5982;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!fw", name = "g", descriptor = "I")
    public static int field5980;

    @OriginalMember(owner = "client!fw", name = "j", descriptor = "I")
    public static int field5983;

    @OriginalMember(owner = "client!fw", name = "k", descriptor = "I")
    public static int field5984;

    @OriginalMember(owner = "client!fw", name = "m", descriptor = "I")
    public static int field5986;

    @OriginalMember(owner = "client!fw", name = "n", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!fw", name = "h", descriptor = "[Li;")
    public static class270[] field5981;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILnu;)V")
    public static final void method2552(int arg0, class351 arg1) {
        if (arg0 != 0) {
            method2553(-111);
        }
        field5980++;
        for (class502 var2 = (class502) class598.field8232.method2506(68); var2 != null; var2 = (class502) class598.field8232.method2505(-117)) {
            if (var2.field6920 == arg1) {
                if (var2.field6915 != null) {
                    class126.field1759.method1345(var2.field6915);
                    var2.field6915 = null;
                }
                var2.method242(true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5979++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field5978; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field5985[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
    public static void method2553(int arg0) {
        if (arg0 != 1) {
            method2557(null);
        }
        field5981 = null;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method2554(String arg0, byte arg1) {
        this.method2558(1, this.field5978 + 1, arg0);
        field5986++;
        int var3 = 108 % ((arg1 - 20) / 38);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(II)I")
    private final int method2555(int arg0, int arg1) {
        field5984++;
        if (arg1 < 20) {
            this.field5974 = -94;
        }
        int var3 = this.field5985.length;
        while (var3 <= arg0) {
            if (!this.field5975) {
                var3 += this.field5974;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field5974 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method2556(int arg0) {
        field5987++;
        String[] var2 = new String[this.field5978 + 1];
        class2.method7(this.field5985, 0, var2, arg0, this.field5978 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lir;)V")
    public static final void method2557(class27 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class57.field730[var1]; var2++) {
                if (class150.field2058[var1][var2] == arg0) {
                    class2.method7(class150.field2058[var1], var2 + 1, class150.field2058[var1], var2, class57.field730[var1] - var2 - 1);
                    var10002 = class57.field730[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class629.field8709[var1]; var3++) {
                if (class648.field8957[var1][var3] == arg0) {
                    class2.method7(class648.field8957[var1], var3 + 1, class648.field8957[var1], var3, class629.field8709[var1] - var3 - 1);
                    var10002 = class629.field8709[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class189.field2627[var1]; var4++) {
                if (class100.field1206[var1][var4] == arg0) {
                    class2.method7(class100.field1206[var1], var4 + 1, class100.field1206[var1], var4, class189.field2627[var1] - var4 - 1);
                    var10002 = class189.field2627[var1]--;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILjava/lang/String;)V")
    private final void method2558(int arg0, int arg1, String arg2) {
        if (arg1 > this.field5978) {
            this.field5978 = arg1;
        }
        field5977++;
        if (arg1 >= this.field5985.length) {
            this.method2560((byte) 121, arg1);
        }
        this.field5985[arg1] = arg2;
        if (arg0 != 1) {
            this.method2554(null, (byte) 103);
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2559(int arg0, int arg1, int arg2, int arg3) {
        field5976++;
        if (!class611.field8479) {
            return false;
        } else if (class469.field6278 < 100) {
            return false;
        } else {
            int var4 = class685.field9689[arg1][arg0][arg3];
            if ((-class132.field1841) == var4) {
                return false;
            } else if (class132.field1841 == var4) {
                return true;
            } else if (class446.field5914 == class246.field3214) {
                return false;
            } else {
                int var5 = arg0 << class62.field762;
                int var6 = arg3 << class62.field762;
                if (class309.method1823(2, class246.field3214[arg1].method1611(arg0, true, arg3), class246.field3214[arg1].method1611(arg0, true, arg3 + 1), var6 + class458.field6012 - 1, class458.field6012 - 1 + var6, class246.field3214[arg1].method1611(arg0 + 1, true, arg3 + 1), arg2 + var5, var6 + 1, var5 + 1, class458.field6012 + var5 + -1) && class309.method1823(2, class246.field3214[arg1].method1611(arg0, true, arg3), class246.field3214[arg1].method1611(arg0 + 1, true, arg3 + 1), var6 + class458.field6012 - 1, var6 - -1, class246.field3214[arg1].method1611(arg0 + 1, true, arg3), var5 + 1, var6 + 1, var5 + class458.field6012 - 1, var5 + -1 + class458.field6012)) {
                    class703.field9878++;
                    class685.field9689[arg1][arg0][arg3] = class132.field1841;
                    return true;
                } else {
                    class685.field9689[arg1][arg0][arg3] = -class132.field1841;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI)V")
    private final void method2560(byte arg0, int arg1) {
        if (arg0 < 118) {
            this.field5975 = true;
        }
        field5983++;
        String[] var3 = new String[this.method2555(arg1, 56)];
        class2.method7(this.field5985, 0, var3, 0, this.field5985.length);
        this.field5985 = var3;
    }

    @OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(IZ)V")
    public class454(int arg0, boolean arg1) {
        this.field5974 = arg0;
        this.field5975 = arg1;
    }
}
