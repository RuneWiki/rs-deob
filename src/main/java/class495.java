import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class495 {

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "Lgw;")
    private class690 field6928 = new class690(64);

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "Lgw;")
    private class690 field6939 = new class690(100);

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "Luu;")
    private class237 field6931;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "F")
    public static float field6929;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
    public static int field6938;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V", line = 3)
    public final void method2995(byte arg0) {
        field6935++;
        if (arg0 >= -81) {
            this.field6928 = null;
        }
        class690 var2 = this.field6928;
        synchronized (this.field6928) {
            this.field6928.method3902(0);
        }
        class690 var3 = this.field6939;
        synchronized (this.field6939) {
            this.field6939.method3902(0);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IB)Lro;", line = 19)
    public final class526 method2996(int arg0, byte arg1) {
        field6932++;
        class690 var3 = this.field6939;
        class526 var4;
        synchronized (this.field6939) {
            var4 = (class526) this.field6939.method3898((byte) -42, (long) arg0);
            if (var4 == null) {
                var4 = new class526(arg0);
                this.field6939.method3899(-48, var4, (long) arg0);
            }
            if (!var4.method3123(false)) {
                return null;
            }
        }
        if (arg1 > -112) {
            this.field6931 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)V", line = 44)
    public final void method2997(byte arg0) {
        class690 var2 = this.field6928;
        synchronized (this.field6928) {
            this.field6928.method3906(-125);
        }
        int var3 = -8 / ((-arg0 - 78) / 48);
        field6934++;
        class690 var4 = this.field6939;
        synchronized (this.field6939) {
            this.field6939.method3906(-124);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Ldc;B)Lrf;", line = 60)
    public static final class754 method2998(class63 arg0, byte arg1) {
        if (arg1 < 29) {
            field6929 = 0.57375723F;
        }
        field6937++;
        class549 var2 = class222.method1319(arg0, 0);
        int var3 = arg0.method468(16711680);
        return new class754(var2.field7638, var2.field7639, var2.field7632, var2.field7631, var2.field7634, var3);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BII)V", line = 76)
    public static final void method2999(byte arg0, int arg1, int arg2) {
        if (arg0 != 51) {
            method3000(-126);
        }
        field6936++;
        if (class73.field1095 != arg1) {
            class639.field8571 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class639.field8571[var3] = (var3 << 12) / arg1;
            }
            class73.field1095 = arg1;
            class708.field9888 = arg1 * 32;
            class73.field1097 = arg1 - 1;
        }
        if (class414.field5865 == arg2) {
            return;
        }
        if (class73.field1095 == arg2) {
            class515.field7103 = class639.field8571;
        } else {
            class515.field7103 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class515.field7103[var4] = (var4 << 12) / arg2;
            }
        }
        class414.field5865 = arg2;
        class415.field5878 = arg2 - 1;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 123)
    public static final void method3000(int arg0) {
        field6933++;
        if (class214.field2808 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class297.field4232.length; var2++) {
                if (class297.field4232[var2].indexOf("--> ") != -1) {
                    var1++;
                    if (class214.field2808 == var1) {
                        class445.field6173 = class297.field4232[var2].substring(class297.field4232[var2].indexOf(">") + 2);
                        break;
                    }
                }
            }
        } else {
            class445.field6173 = "";
        }
        if (arg0 > -65) {
            method2999((byte) -93, -44, 84);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(II)Lpia;", line = 162)
    public final class57 method3001(int arg0, int arg1) {
        field6938++;
        class690 var3 = this.field6928;
        class57 var4;
        synchronized (this.field6928) {
            var4 = (class57) this.field6928.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field6931;
        byte[] var6;
        synchronized (this.field6931) {
            var6 = this.field6931.method1572(class161.method998(-70, arg1), arg0 ^ arg0, class445.method2720((byte) -28, arg1));
        }
        class57 var7 = new class57();
        var7.field810 = arg1;
        var7.field801 = this;
        if (var6 != null) {
            var7.method412(new class63(var6), (byte) -117);
        }
        var7.method410(arg0 + 12575);
        class690 var8 = this.field6928;
        synchronized (this.field6928) {
            this.field6928.method3899(-106, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(BI)V", line = 195)
    public final void method3002(byte arg0, int arg1) {
        class690 var3 = this.field6928;
        synchronized (this.field6928) {
            this.field6928.method3896(1, arg1);
        }
        field6930++;
        class690 var4 = this.field6939;
        synchronized (this.field6939) {
            this.field6939.method3896(1, arg1);
            if (arg0 <= 86) {
                method2998(null, (byte) -53);
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lgp;ILuu;Luu;Luu;)V", line = 220)
    public class495(class553 arg0, int arg1, class237 arg2, class237 arg3, class237 arg4) {
        this.field6931 = arg2;
        if (this.field6931 != null) {
            int var6 = this.field6931.method1584((byte) 85) - 1;
            this.field6931.method1597(var6, 0);
        }
        class304.method1999(48, arg4, 2, arg3);
    }
}
