import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class18 {

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Lpg;")
    private class525 field199 = new class525();

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lqn;")
    public static class46 field192 = class309.method1968(0);

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "Ljava/lang/String;")
    public static String field206 = "";

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
    public static int[] field204 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lqt;")
    public static class459 field203 = new class459(6, -1);

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lqt;")
    public static class459 field207 = new class459(58, 7);

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "Lpg;")
    private class525 field202;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[[B")
    public static byte[][] field198;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)I")
    public final int method98(int arg0) {
        field200++;
        int var2 = 0;
        class525 var3 = this.field199.field7660;
        if (arg0 != -575) {
            this.field199 = null;
        }
        while (this.field199 != var3) {
            var3 = var3.field7660;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lpg;I)V")
    public final void method99(class525 arg0, int arg1) {
        if (arg1 != 5604) {
            field204 = null;
        }
        field191++;
        if (arg0.field7662 != null) {
            arg0.method3115((byte) 103);
        }
        arg0.field7660 = this.field199;
        arg0.field7662 = this.field199.field7662;
        arg0.field7662.field7660 = arg0;
        arg0.field7660.field7662 = arg0;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method100(int arg0) {
        class462.method2738((byte) 41);
        field197++;
        if (arg0 != 4194303) {
            field198 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public final void method101(byte arg0) {
        if (arg0 > -127) {
            this.method98(-3);
        }
        while (true) {
            class525 var2 = this.field199.field7660;
            if (this.field199 == var2) {
                field193++;
                this.field202 = null;
                return;
            }
            var2.method3115((byte) 103);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)Lpg;")
    public final class525 method102(int arg0) {
        if (arg0 != 1048575) {
            field201 = -1;
        }
        field194++;
        class525 var2 = this.field199.field7660;
        if (this.field199 == var2) {
            this.field202 = null;
            return null;
        } else {
            this.field202 = var2.field7660;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)Lpg;")
    public final class525 method103(int arg0) {
        if (arg0 != 1048575) {
            field198 = null;
        }
        field196++;
        class525 var2 = this.field199.field7660;
        if (this.field199 == var2) {
            return null;
        } else {
            var2.method3115((byte) 103);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
    public static void method104(byte arg0) {
        int var1 = 99 / ((70 - arg0) / 48);
        field198 = null;
        field206 = null;
        field207 = null;
        field204 = null;
        field203 = null;
        field192 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)Lpg;")
    public final class525 method105(byte arg0) {
        field195++;
        if (arg0 != 43) {
            field198 = null;
        }
        class525 var2 = this.field202;
        if (this.field199 == var2) {
            this.field202 = null;
            return null;
        } else {
            this.field202 = var2.field7660;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
    public static final void method106(byte arg0) {
        field205++;
        class284.method1832(-17067, class290.field4312);
        class413.field5848++;
        if (class506.field7305 && class477.field6949) {
            int var1 = class49.field909.method639((byte) 85);
            int var2 = class49.field909.method644(101);
            int var3 = var1 - class201.field3082;
            int var4 = var2 - class505.field7298;
            if (var3 < class97.field1533) {
                var3 = class97.field1533;
            }
            if (var4 < class299.field4462) {
                var4 = class299.field4462;
            }
            if ((class97.field1533 + class77.field1271.field3008) < (class290.field4312.field3008 + var3)) {
                var3 = class97.field1533 + class77.field1271.field3008 - class290.field4312.field3008;
            }
            if ((class299.field4462 + class77.field1271.field2988) < (var4 + class290.field4312.field2988)) {
                var4 = class299.field4462 + class77.field1271.field2988 - class290.field4312.field2988;
            }
            int var5 = var3 + class77.field1271.field2997 - class97.field1533;
            if (arg0 >= -102) {
                method106((byte) -54);
            }
            int var6 = class77.field1271.field2898 + var4 - class299.field4462;
            if (class49.field909.method636(69)) {
                if (class413.field5848 > class290.field4312.field2933) {
                    int var7 = var3 - class474.field6915;
                    int var8 = var4 - class545.field7996;
                    if (var7 > class290.field4312.field2999 || -class290.field4312.field2999 > var7 || class290.field4312.field2999 < var8 || (-class290.field4312.field2999) > var8) {
                        class142.field2186 = true;
                    }
                }
                if (class290.field4312.field2930 != null && class142.field2186) {
                    class361 var9 = new class361();
                    var9.field5254 = var6;
                    var9.field5257 = var5;
                    var9.field5252 = class290.field4312;
                    var9.field5256 = class290.field4312.field2930;
                    class281.method1805(var9);
                    return;
                }
            } else {
                if (class142.field2186) {
                    class461.method2735((byte) -113);
                    if (class290.field4312.field2958 != null) {
                        class361 var10 = new class361();
                        var10.field5260 = class320.field4773;
                        var10.field5254 = var6;
                        var10.field5256 = class290.field4312.field2958;
                        var10.field5257 = var5;
                        var10.field5252 = class290.field4312;
                        class281.method1805(var10);
                    }
                    if (class320.field4773 != null && client.method1375(class290.field4312) != null) {
                        class333.method2116(class320.field4773, class290.field4312, -1);
                    }
                } else if ((class390.field5540 == 1 || class256.method1659(-37)) && class430.field6184 > 2) {
                    class345.method2183(class474.field6915 + class201.field3082, class545.field7996 + class505.field7298, 105);
                } else if (class297.method1910(0)) {
                    class345.method2183(class474.field6915 + class201.field3082, class545.field7996 + class505.field7298, 122);
                }
                class290.field4312 = null;
            }
        } else if (class413.field5848 > 1) {
            class290.field4312 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class18() {
        this.field199.field7660 = this.field199;
        this.field199.field7662 = this.field199;
    }
}
