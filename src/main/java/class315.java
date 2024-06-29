import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public abstract class class315 extends class513 {

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public int field4133 = 0;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field4140 = 0;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public int field4137 = 1;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public int field4146 = 2;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Z")
    public boolean field4132 = true;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    public int field4143 = 0;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Z")
    public boolean field4138 = true;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Z")
    public boolean field4142 = false;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "Z")
    public boolean field4157 = true;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public int field4147 = 0;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "Z")
    public boolean field4151 = true;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "I")
    public int field4162 = 127;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    public int field4152 = 0;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "Z")
    public boolean field4161 = true;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "Z")
    public boolean field4163 = false;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    public int field4158 = 127;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "Z")
    public boolean field4149 = false;

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "Z")
    public boolean field4165 = true;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Z")
    public boolean field4136 = true;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "Z")
    public boolean field4135 = true;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    public int field4148 = 2;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public int field4155 = 127;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public int field4154 = 2;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "I")
    public int field4164 = 2;

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "Z")
    public boolean field4159 = true;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "Z")
    public boolean field4166 = true;

    @OriginalMember(owner = "client!tk", name = "X", descriptor = "I")
    public int field4172 = 0;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "I")
    public int field4168 = 0;

    @OriginalMember(owner = "client!tk", name = "Y", descriptor = "I")
    public int field4173 = 0;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    public int field4153 = 3;

    @OriginalMember(owner = "client!tk", name = "Z", descriptor = "I")
    public int field4174 = 0;

    @OriginalMember(owner = "client!tk", name = "W", descriptor = "I")
    public int field4171 = 3;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public int field4134 = 127;

    @OriginalMember(owner = "client!tk", name = "V", descriptor = "Z")
    public boolean field4170 = true;

    @OriginalMember(owner = "client!tk", name = "bb", descriptor = "I")
    public int field4176 = 127;

    @OriginalMember(owner = "client!tk", name = "eb", descriptor = "Z")
    public boolean field4179 = true;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!tk", name = "U", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!tk", name = "cb", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!tk", name = "db", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Z")
    public boolean field4141;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "Z")
    public boolean field4150;

    @OriginalMember(owner = "client!tk", name = "ab", descriptor = "Z")
    public boolean field4175;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Z")
    public final boolean method1841(int arg0, int arg1) {
        field4177++;
        if (arg1 == 3) {
            return class12.method141(arg0, (byte) -94) ? this.field4175 : this.field4150;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V")
    public final void method1842(int arg0, int arg1, int arg2) {
        field4139++;
        if (arg2 != 0) {
            method1848((byte) -36, null);
        }
        if (class12.method141(arg1, (byte) 91)) {
            this.field4146 = arg0;
        } else {
            this.field4174 = arg0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1843(int arg0) {
        if (arg0 != 0) {
            method1848((byte) 115, null);
        }
        field4178++;
        return class361.field4805 || class590.field8544 == null ? "" : class590.field8544.field5070;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IZ)I")
    public final int method1844(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1841(86, 76);
        }
        field4145++;
        return class12.method141(arg0, (byte) -112) ? this.field4146 : this.field4174;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method1845(int arg0, int arg1, String arg2) {
        if (arg1 == 0) {
            class68.field1045 = class165.method1040(0, class206.field2483, -4, class646.field9190, class221.field2851.field4152 * 2, class561.field8099);
            if (arg2 != null) {
                class68.field1045.method323(0);
                class50 var10 = class419.method2530(class420.field5953, class524.field7694, 0, -20);
                class419 var11 = class68.field1045.method258(var10, class495.method2877(class692.field9847, class524.field7694, 0), true);
                class518.method3067(1);
                class653.method3694(class68.field1045, var11, true, 0, var10, arg2);
            }
        } else {
            class165 var3 = null;
            if (arg2 != null) {
                var3 = class165.method1040(0, class206.field2483, -4, class646.field9190, 0, class561.field8099);
                var3.method323(0);
                class50 var4 = class419.method2530(class420.field5953, class524.field7694, 0, -67);
                class419 var5 = var3.method258(var4, class495.method2877(class692.field9847, class524.field7694, 0), true);
                class518.method3067(1);
                class653.method3694(var3, var5, true, 0, var4, arg2);
            }
            try {
                class68.field1045 = class165.method1040(arg1, class206.field2483, -4, class646.field9190, class221.field2851.field4152 * 2, class561.field8099);
                if (arg2 != null) {
                    var3.method323(0);
                    class50 var6 = class419.method2530(class420.field5953, class524.field7694, 0, -115);
                    class419 var7 = var3.method258(var6, class495.method2877(class692.field9847, class524.field7694, 0), true);
                    class518.method3067(arg0 ^ 0xE0AC8782);
                    class653.method3694(var3, var7, true, arg0 ^ 0xE0AC8783, var6, arg2);
                }
                if (class68.field1045.method233()) {
                    boolean var8 = true;
                    try {
                        var8 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                    } catch (Throwable var13) {
                    }
                    class493 var9;
                    if (var8) {
                        var9 = class68.field1045.method210(146800640);
                    } else {
                        var9 = class68.field1045.method210(104857600);
                    }
                    class68.field1045.method265(var9);
                }
            } catch (Throwable var14) {
                arg1 = 0;
                class68.field1045 = class165.method1040(0, class206.field2483, -4, class646.field9190, 0, class561.field8099);
            }
            if (var3 != null) {
                try {
                    var3.method1047(1);
                } catch (Throwable var12) {
                }
            }
        }
        field4144++;
        class375.field5039 = arg1;
        class621.method3550((byte) 98);
        class68.field1045.method312(32);
        class230.field2999 = class68.field1045.method305();
        class521.field7627 = class68.field1045.method305();
        class628.method3607(105);
        class68.field1045.method295(!class221.field2851.field4157);
        if (class68.field1045.method218()) {
            class334.method1933((byte) -99, class221.field2851.field4149);
        }
        class555.method3249(class205.field2465 >> 3, class68.field1045, class473.field6604 >> 3, true);
        class221.method1337(4);
        class553.field8029 = false;
        class90.field1264 = null;
        if (arg0 != -525564029) {
            field4167 = 23;
        }
        class700.field9885 = true;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLun;)V")
    public final void method1846(byte arg0, class389 arg1) {
        arg1.method2281((byte) 58, 22);
        field4169++;
        arg1.method2281((byte) 58, this.field4171);
        arg1.method2281((byte) 58, this.field4166 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4179 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4165 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4157 ? 1 : 0);
        if (arg0 > -103) {
            return;
        }
        arg1.method2281((byte) 58, 0);
        arg1.method2281((byte) 58, this.field4136 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4135 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4132 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4146);
        arg1.method2281((byte) 58, this.field4174);
        arg1.method2281((byte) 58, this.field4175 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4150 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4159 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4170 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4147);
        arg1.method2281((byte) 58, this.field4138 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4155);
        arg1.method2281((byte) 58, this.field4176);
        arg1.method2281((byte) 58, this.field4158);
        arg1.method2281((byte) 58, this.field4134);
        arg1.method2281((byte) 58, this.field4162);
        arg1.method2261((byte) 52, this.field4133);
        arg1.method2261((byte) 61, this.field4140);
        arg1.method2281((byte) 58, class265.method1608(true));
        arg1.method2233((byte) -93, this.field4168);
        arg1.method2281((byte) 58, this.field4148);
        arg1.method2281((byte) 58, this.field4163 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4141 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4172);
        arg1.method2281((byte) 58, this.field4149 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4151 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4137);
        arg1.method2281((byte) 58, this.field4161 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4154);
        arg1.method2281((byte) 58, this.field4164);
        arg1.method2281((byte) 58, this.field4142 ? 1 : 0);
        arg1.method2281((byte) 58, this.field4153);
        arg1.method2281((byte) 58, this.field4143);
        arg1.method2281((byte) 58, this.field4173);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZI)V")
    public final void method1847(byte arg0, boolean arg1, int arg2) {
        field4156++;
        if (class12.method141(arg2, (byte) -77)) {
            this.field4175 = arg1;
        } else {
            this.field4150 = arg1;
        }
        int var4 = 120 / ((arg0 + 12) / 53);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BLec;)V")
    public static final void method1848(byte arg0, class213 arg1) {
        field4160++;
        if (arg1 instanceof class557) {
            class557 var2 = (class557) arg1;
            if (var2.field8052 != null) {
                class528.method3108((byte) 0, class206.field2472.field532 != var2.field532, var2);
            }
        } else if (arg1 instanceof class613) {
            class613 var3 = (class613) arg1;
            class659.method3729(class206.field2472.field532 != var3.field532, 125, var3);
        }
        if (arg0 > -7) {
            method1845(-101, 124, null);
        }
    }
}
