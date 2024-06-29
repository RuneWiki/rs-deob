import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class403 {

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "Lwm;")
    private class399 field6094 = new class399(16);

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "Lph;")
    private class459 field6095;

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "[I")
    public static int[] field6086 = new int[2];

    @OriginalMember(owner = "client!cv", name = "i", descriptor = "[I")
    public static int[] field6093 = new int[250];

    @OriginalMember(owner = "client!cv", name = "d", descriptor = "Lbj;")
    public static class162 field6088 = new class162(46, 3);

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "I")
    public static int field6085;

    @OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!cv", name = "e", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!cv", name = "f", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!cv", name = "g", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!cv", name = "h", descriptor = "I")
    public static int field6092;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Lso;")
    public static class331 field6096;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(II)V", line = 4)
    public final void method2509(int arg0, int arg1) {
        class399 var3 = this.field6094;
        synchronized (this.field6094) {
            if (arg0 != 29) {
                method2510((byte) 18);
            }
            this.field6094.method2471((byte) 98, arg1);
        }
        field6092++;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V", line = 19)
    public static final void method2510(byte arg0) {
        field6089++;
        if (class262.field4006 != null) {
            class146.field2446.method538(false);
            class57.method521();
            class312.method1984(-1);
            class348.method2171((byte) -24);
            class256.method1649((byte) -12);
            class35.method242(30590);
            if (class299.field4519 != null) {
                class299.field4519.method2825((byte) 72);
            }
            class301.method1936(34037);
            class170.method1191(arg0 ^ 0xFFFF8100);
            class242.method1580(16383);
            class274.method1738((byte) 39, false);
            class443.method2634(4);
            for (int var1 = 0; var1 < 2048; var1++) {
                class366 var5 = class73.field1444[var1];
                if (var5 != null) {
                    var5.field7868 = null;
                    for (int var6 = 0; var6 < var5.field7867.length; var6++) {
                        var5.field7867[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class334.field5054; var2++) {
                class163 var3 = class525.field7636[var2].field6471;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field7867.length; var4++) {
                        var3.field7867[var4] = null;
                    }
                }
            }
            class535.field7858 = null;
            class123.field2143 = null;
            class262.field4006.method1802((byte) -65);
            class262.field4006 = null;
        }
        if (arg0 != -85) {
            field6096 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V", line = 97)
    public static void method2511(int arg0) {
        field6093 = null;
        field6088 = null;
        if (arg0 != 24130) {
            field6096 = null;
        }
        field6086 = null;
        field6096 = null;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 111)
    public final void method2512(int arg0) {
        class399 var2 = this.field6094;
        synchronized (this.field6094) {
            this.field6094.method2475((byte) 67);
            if (arg0 != 29) {
                this.field6094 = null;
            }
        }
        field6087++;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BI)Lin;", line = 128)
    private final class61 method2513(byte arg0, int arg1) {
        field6090++;
        class399 var3 = this.field6094;
        class61 var4;
        synchronized (this.field6094) {
            var4 = (class61) this.field6094.method2478(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        } else if (arg0 == -80) {
            class459 var5 = this.field6095;
            byte[] var6;
            synchronized (this.field6095) {
                var6 = this.field6095.method2757(29, arg1, (byte) -127);
            }
            class61 var7 = new class61();
            if (var6 != null) {
                var7.method543(new class289(var6), 110);
            }
            class399 var8 = this.field6094;
            synchronized (this.field6094) {
                this.field6094.method2472(arg0 + 10, var7, (long) arg1);
                return var7;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V", line = 158)
    public final void method2514(byte arg0) {
        field6091++;
        if (arg0 > 123) {
            class399 var2 = this.field6094;
            synchronized (this.field6094) {
                this.field6094.method2477(-110);
            }
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(IIIILlq;I)Lsv;", line = 175)
    public final class473 method2515(int arg0, int arg1, int arg2, int arg3, class390 arg4, int arg5) {
        field6085++;
        class90[] var7 = null;
        class61 var8 = this.method2513((byte) -80, arg1);
        if (arg0 != 0) {
            return null;
        }
        if (var8.field1259 != null) {
            var7 = new class90[var8.field1259.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class281 var10 = arg4.method2406(arg0 ^ 0x1E, var8.field1259[var9]);
                var7[var9] = new class90(var10.field4244, var10.field4242, var10.field4234, var10.field4236, var10.field4238, var10.field4241, var10.field4245, var10.field4240);
            }
        }
        return new class473(var8.field1257, var7, var8.field1260, arg5, arg2, arg3);
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lkp;ILph;)V", line = 222)
    public class403(class341 arg0, int arg1, class459 arg2) {
        this.field6095 = arg2;
        this.field6095.method2763(29, -3);
    }
}
