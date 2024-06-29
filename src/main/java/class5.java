import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class5 extends class216 {

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    private int field76 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Luk;")
    private class155 field73 = new class155();

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "Leb;")
    public static class395 field75 = new class395();

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "[Ltg;")
    public static class304[] field84 = new class304[5];

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "Lbn;")
    public static class160 field85;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "Lct;")
    public static class104 field86;

    static {
        for (int var0 = 0; var0 < field84.length; ++var0) {
            field84[var0] = new class304();
        }
        field85 = new class160(72, -1);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)V", line = 4)
    public final void method37(int arg0, int arg1) {
        int var3 = 77 % ((arg1 - -47) / 40);
        super.field3080[super.field3085] = (byte) arg0;
        ++field72;
        ++super.field3085;
        if (~super.field3085 <= -5001) {
            super.field3085 = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 18)
    public final void method38(int arg0, int arg1) {
        ++field82;
        if (arg0 != 0) {
            field75 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Lae;I)V", line = 28)
    public static final void method39(class285[] arg0, int arg1) {
        class252.field3706 = arg0.length;
        ++field74;
        class214.field3022 = new class285[class252.field3706 + 10];
        if (arg1 == -5001) {
            class77.field979 = new int[class252.field3706 + 10];
            class224.method1538(arg0, 0, class214.field3022, 0, class252.field3706);
            for (int var2 = 0; class252.field3706 > var2; ++var2) {
                class77.field979[var2] = class214.field3022[var2].method1860();
            }
            for (int var3 = class252.field3706; ~var3 > ~class214.field3022.length; ++var3) {
                class77.field979[var3] = 12;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 57)
    public static void method40(int arg0) {
        field85 = null;
        field86 = null;
        field75 = null;
        if (arg0 != 11492) {
            method48(true, (class256) null);
        }
        field84 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)V", line = 72)
    private final void method41(byte arg0) {
        ++field71;
        int var2 = super.field3082++;
        if (super.field3082 >= 5000) {
            super.field3082 = 0;
        }
        this.field76 = super.field3080[var2];
        Object var3 = super.field3079[var2];
        super.field3079[var2] = null;
        if (this.field76 != 21) {
            if (~this.field76 != -21) {
                if (this.field76 >= 30 && ~this.field76 >= -34) {
                    class151.field2050.method81(3000.0F, super.field3078[var2] * 1.5F);
                    ((class378) var3).method1419(class145.field1969, class189.field2651, class31.field431, class57.field694, this.field76 + -30 == 0);
                } else if (~this.field76 <= -41 && ~this.field76 >= -44) {
                    class151.field2050.method81(3000.0F, super.field3078[var2] * 1.5F);
                    ((class378) var3).method1419(class145.field1969, class189.field2651, class31.field431, class276.field4081, ~(this.field76 - 40) == -1);
                } else if (this.field76 == 22) {
                    class151.field2050.method154(-1, 1583160, 40);
                } else if (this.field76 != 23) {
                    if (~this.field76 == -25) {
                        class151.field2050.method68(0, (class298[]) null);
                    }
                } else {
                    class151.field2050.method72();
                }
            } else {
                class369 var4 = (class369) var3;
                if (var4.field5335 != null) {
                    var4.field5335.method14(-7561, class151.field2050);
                }
                if (var4.field5332 != null) {
                    var4.field5332.method14(-7561, class151.field2050);
                }
                if (var4.field5327 != null) {
                    var4.field5327.method14(-7561, class151.field2050);
                }
                if (var4.field5334 != null) {
                    var4.field5334.method14(-7561, class151.field2050);
                }
                if (var4.field5346 != null) {
                    var4.field5346.method14(-7561, class151.field2050);
                }
                for (class206 var5 = var4.field5345; var5 != null; var5 = var5.field2882) {
                    var5.field2880.method14(-7561, class151.field2050);
                }
            }
        } else {
            class100.method673(this.field73, (class369) var3);
        }
        if (arg0 != -25) {
            field75 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V", line = 167)
    public final void method42(byte arg0) {
        while (super.field3085 != super.field3082) {
            this.method41((byte) -25);
        }
        if (arg0 > -120) {
            method39((class285[]) null, 77);
        }
        ++field70;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Log;B)V", line = 184)
    public final void method43(class369 arg0, byte arg1) {
        ++field80;
        super.field3080[super.field3085] = 21;
        super.field3079[super.field3085] = arg0;
        if (arg1 >= 92) {
            ++super.field3085;
            if (super.field3085 >= 5000) {
                super.field3085 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILog;)V", line = 203)
    public final void method44(int arg0, class369 arg1) {
        ++field83;
        --super.field3082;
        if (~super.field3082 > -1) {
            super.field3082 = 4999;
        }
        super.field3080[super.field3082] = 21;
        if (arg0 == -15110) {
            super.field3079[super.field3082] = arg1;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IFZILui;)V", line = 220)
    public final void method45(int arg0, float arg1, boolean arg2, int arg3, class378 arg4) {
        super.field3080[super.field3085] = (byte) (!arg2 ? arg3 + 30 : arg3 + 40);
        ++field79;
        super.field3079[super.field3085] = arg4;
        super.field3078[super.field3085] = arg1;
        if (arg0 != 24216) {
            this.method42((byte) 88);
        }
        ++super.field3085;
        if (~super.field3085 <= -5001) {
            super.field3085 = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Log;I)V", line = 250)
    public final void method46(class369 arg0, int arg1) {
        ++field81;
        super.field3080[super.field3085] = 20;
        super.field3079[super.field3085] = arg0;
        ++super.field3085;
        if (super.field3085 >= 5000) {
            super.field3085 = 0;
        }
        if (arg1 != -25826) {
            method48(false, (class256) null);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 271)
    public final void method47(int arg0) {
        if (arg0 != 5000) {
            this.method45(72, -1.1747292F, true, -102, (class378) null);
        }
        ++field77;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLat;)Ljava/lang/String;", line = 281)
    public static final String method48(boolean arg0, class256 arg1) {
        ++field78;
        return !arg0 ? null : class131.method880(arg1, 32767, (byte) -103);
    }
}
