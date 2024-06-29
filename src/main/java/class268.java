import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class268 extends class78 {

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "Ljava/lang/String;")
    private String field4144 = "null";

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Lsa;")
    public static class110 field4148 = new class110(8);

    @OriginalMember(owner = "client!ve", name = "Y", descriptor = "Lkb;")
    public static class34 field4160 = new class34(5000);

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "C")
    public char field4143;

    @OriginalMember(owner = "client!ve", name = "T", descriptor = "C")
    public char field4155;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    private int field4145;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
    public static int field4150;

    @OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
    public static int field4152;

    @OriginalMember(owner = "client!ve", name = "R", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ve", name = "S", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ve", name = "U", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!ve", name = "V", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ve", name = "X", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "Lsa;")
    private class110 field4151;

    @OriginalMember(owner = "client!ve", name = "W", descriptor = "Lsa;")
    public class110 field4158;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method1922(int arg0, byte arg1) {
        class221.field3539.method1828(arg0, (byte) 97);
        if (arg1 < 90) {
            field4148 = (class110) null;
        }
        field4149++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Ljava/lang/String;", line = 16)
    public final String method1923(int arg0, int arg1) {
        if (arg1 != 4) {
            return (String) null;
        }
        field4150++;
        if (this.field4158 == null) {
            return this.field4144;
        } else {
            class61 var3 = (class61) this.field4158.method833(false, (long) arg0);
            return var3 == null ? this.field4144 : var3.field950;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V", line = 42)
    public static final void method1924(int arg0, boolean arg1) {
        for (class254 var2 = (class254) class67.field1071.method1490(200); var2 != null; var2 = (class254) class67.field1071.method1487((byte) 117)) {
            if (var2.field3925 != null) {
                class128.field2045.method358(var2.field3925);
                var2.field3925 = null;
            }
            if (var2.field3935 != null) {
                class128.field2045.method358(var2.field3935);
                var2.field3935 = null;
            }
            var2.method1701(arg0 ^ 0xFFFFFF82);
        }
        if (arg0 != 5) {
            field4148 = (class110) null;
        }
        if (arg1) {
            for (class254 var3 = (class254) class139.field2216.method1490(200); var3 != null; var3 = (class254) class139.field2216.method1487((byte) 117)) {
                if (var3.field3925 != null) {
                    class128.field2045.method358(var3.field3925);
                    var3.field3925 = null;
                }
                var3.method1701(arg0 - 131);
            }
            for (class254 var4 = (class254) class94.field1553.method841(0); var4 != null; var4 = (class254) class94.field1553.method842((byte) -40)) {
                if (var4.field3925 != null) {
                    class128.field2045.method358(var4.field3925);
                    var4.field3925 = null;
                }
                var4.method1701(-78);
            }
        }
        field4153++;
    }

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)V", line = 109)
    private final void method1925(int arg0) {
        this.field4151 = new class110(this.field4158.method839(-128));
        field4154++;
        for (class61 var2 = (class61) this.field4158.method841(0); var2 != null; var2 = (class61) this.field4158.method842((byte) -40)) {
            class176 var3 = new class176(var2.field950, (int) var2.field3734);
            this.field4151.method845(var3, (byte) -103, class305.method2114((byte) 91, var2.field950));
        }
        if (arg0 != -4) {
            method1922(-103, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)V", line = 133)
    public static void method1926(int arg0) {
        field4160 = null;
        field4148 = null;
        if (arg0 != -13012) {
            field4148 = (class110) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)Z", line = 144)
    public final boolean method1927(int arg0, int arg1) {
        field4146++;
        if (this.field4158 == null) {
            return false;
        }
        if (this.field4151 == null) {
            this.method1929(true);
        }
        class250 var3 = (class250) this.field4151.method833(false, (long) arg1);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 != -4) {
                this.field4145 = 28;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IB)I", line = 172)
    public final int method1928(int arg0, byte arg1) {
        field4156++;
        if (this.field4158 == null) {
            return this.field4145;
        }
        class250 var3 = (class250) this.field4158.method833(false, (long) arg0);
        if (var3 == null) {
            return this.field4145;
        } else {
            if (arg1 >= -62) {
                method1922(-125, (byte) 115);
            }
            return var3.field3858;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)V", line = 195)
    private final void method1929(boolean arg0) {
        if (!arg0) {
            this.method1929(false);
        }
        field4147++;
        this.field4151 = new class110(this.field4158.method839(-125));
        for (class250 var2 = (class250) this.field4158.method841(0); var2 != null; var2 = (class250) this.field4158.method842((byte) -40)) {
            class250 var3 = new class250((int) var2.field3734);
            this.field4151.method845(var3, (byte) 112, (long) var2.field3858);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZLpe;)V", line = 217)
    private final void method1930(int arg0, boolean arg1, class101 arg2) {
        field4152++;
        if (!arg1) {
            this.field4158 = (class110) null;
        }
        if (arg0 == 1) {
            this.field4155 = class220.method1590((byte) 47, arg2.method727((byte) 114));
        } else if (arg0 == 2) {
            this.field4143 = class220.method1590((byte) 47, arg2.method727((byte) 113));
        } else if (arg0 == 3) {
            this.field4144 = arg2.method749((byte) -111);
        } else if (arg0 == 4) {
            this.field4145 = arg2.method775(74);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method731(!arg1);
            this.field4158 = new class110(class210.method1532(-1429694904, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method775(43);
                class240 var7;
                if (arg0 == 5) {
                    var7 = new class61(arg2.method749((byte) -117));
                } else {
                    var7 = new class250(arg2.method775(113));
                }
                this.field4158.method845(var7, (byte) -79, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lpe;I)V", line = 287)
    public final void method1931(class101 arg0, int arg1) {
        if (arg1 != 2) {
            this.method1932(100, (String) null);
        }
        while (true) {
            int var3 = arg0.method741(36);
            if (var3 == 0) {
                field4142++;
                return;
            }
            this.method1930(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 308)
    public final boolean method1932(int arg0, String arg1) {
        field4159++;
        if (this.field4158 == null) {
            return false;
        } else if (arg0 == 5000) {
            if (this.field4151 == null) {
                this.method1925(-4);
            }
            for (class176 var3 = (class176) this.field4151.method833(false, class305.method2114((byte) 71, arg1)); var3 != null; var3 = (class176) this.field4151.method838((byte) -91)) {
                if (var3.field2773.equals(arg1)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }
}
