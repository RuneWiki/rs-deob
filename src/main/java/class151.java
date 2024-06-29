import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class151 extends class681 {

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "F")
    private float field2211 = 0.0F;

    @OriginalMember(owner = "client!wq", name = "k", descriptor = "Lst;")
    private class398 field2206;

    @OriginalMember(owner = "client!wq", name = "w", descriptor = "[Lnn;")
    public static class380[] field2218 = new class380[4];

    @OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!wq", name = "m", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        ++field2213;
        return !arg0 ? false : this.field2206.method2329((byte) -125);
    }

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "(I)V")
    public final void method740(int arg0) {
        ++field2208;
        super.field9721.method2201((byte) 116, 1);
        super.field9721.method2199(class334.field4505, arg0 ^ -9800, class334.field4505);
        super.field9721.method2264(9, class262.field3553, 0);
        super.field9721.method2223(0, class262.field3553, (byte) -82);
        super.field9721.method1077(true, 1);
        super.field9721.method2241((class218) null, (byte) 44);
        if (arg0 == -3) {
            super.field9721.method2201((byte) -30, 0);
            super.field9721.method2223(0, class262.field3553, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        super.field9721.method2199(class334.field4505, 9797, class276.field3814);
        if (arg1 == 7) {
            ++field2216;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IZIIIIIII)Z")
    public static final boolean method1091(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2215;
        int var9 = class143.field2063.field1807[0];
        int var10 = class143.field2063.field1801[0];
        if (~var9 <= -1 && var9 < class401.field5620 && var10 >= 0 && ~class257.field3508 < ~var10) {
            if (~arg5 <= -1 && class401.field5620 > arg5 && ~arg0 <= -1 && ~arg0 > ~class257.field3508) {
                int var11 = class29.method285(class143.field2063.method881(-109), arg4, var10, class65.field856, arg8, var9, arg2, arg6, field2218[class143.field2063.field4053], arg0, -6863, arg1, class125.field1815, arg7, arg5);
                if (~var11 > -2) {
                    return false;
                } else {
                    class525.field7124 = class125.field1815[var11 + -1];
                    if (arg3 != 3762) {
                        method1094(82);
                    }
                    class289.field3961 = class65.field856[var11 + -1];
                    class583.field8209 = false;
                    class428.method2458((byte) -96);
                    return true;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "(I)V")
    public static void method1092(int arg0) {
        field2218 = null;
        if (arg0 != 0) {
            field2218 = null;
        }
    }

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "(ZI)V")
    public final void method741(boolean arg0, int arg1) {
        ++field2217;
        super.field9721.method2201((byte) 116, 1);
        super.field9721.method2199(class335.field4510, 9797, class276.field3814);
        super.field9721.method1052(false, 0, true, class262.field3553, arg1 ^ 89);
        super.field9721.method2223(0, class78.field1179, (byte) -127);
        if (arg1 != 3) {
            this.field2206 = null;
        }
        super.field9721.method1077(true, 0);
        super.field9721.method2201((byte) 118, 0);
        super.field9721.method2233(false, -16777216);
        super.field9721.method2223(0, class452.field6221, (byte) -126);
        this.method745((byte) 104);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BII)Ljava/lang/String;")
    public static final String method1093(byte arg0, int arg1, int arg2) {
        ++field2209;
        int var3 = -arg1 + arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (~var3 > 2) {
            return "<col=ff7000>";
        } else if (~var3 > -1) {
            return "<col=ffb000>";
        } else if (~var3 < -10) {
            return "<col=00ff00>";
        } else if (~var3 < -7) {
            return "<col=40ff00>";
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (~var3 < -1) {
            return "<col=c0ff00>";
        } else {
            int var4 = 18 / ((6 - arg0) / 61);
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "(I)Ljava/lang/String;")
    public static final String method1094(int arg0) {
        ++field2210;
        if (arg0 > -111) {
            method1092(27);
        }
        return !class541.field7327 && class84.field1244 != null ? class84.field1244.field6786 : "";
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIB)V")
    public final void method742(int arg0, int arg1, byte arg2) {
        super.field9721.method2201((byte) 116, 1);
        ++field2214;
        if (~(arg1 & 128) == -1) {
            if ((arg0 & 1) == 1) {
                if (!this.field2206.field5595) {
                    int var4 = super.field9721.field5307 % 4000 * 16 / 4000;
                    super.field9721.method2241(this.field2206.field5600[var4], (byte) 44);
                } else {
                    this.field2211 = (float) (super.field9721.field5307 % 4000) / 4000.0F;
                    super.field9721.method2241(this.field2206.field5596, (byte) 44);
                }
            } else if (this.field2206.field5595) {
                super.field9721.method2241(this.field2206.field5596, (byte) 44);
            } else {
                super.field9721.method2241(this.field2206.field5600[0], (byte) 44);
            }
        } else {
            super.field9721.method2241((class218) null, (byte) 44);
        }
        super.field9721.method2201((byte) 126, 0);
        int var5 = 89 / ((arg2 - -38) / 35);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public final void method745(byte arg0) {
        ++field2212;
        if (arg0 >= 103) {
            if (~super.field9721.method2216(128) == -1) {
                class274 var2 = super.field9721.method2217(1);
                super.field9721.method2201((byte) -91, 1);
                class274 var3 = super.field9721.method2235(2);
                var3.method675(var2);
                var3.method1704(1.0F, 0.125F, 0.125F, 118);
                var3.method1716(0.0F, (byte) -7, this.field2211, 0.0F);
                super.field9721.method2227(class108.field1500, (byte) -106);
                super.field9721.method2201((byte) -62, 0);
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lnv;Lst;)V")
    public class151(class382 arg0, class398 arg1) {
        super(arg0);
        this.field2206 = arg1;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILrga;I)V")
    public final void method744(int arg0, class218 arg1, int arg2) {
        ++field2207;
        super.field9721.method2241(arg1, (byte) 44);
        if (arg2 != -3) {
            this.field2206 = null;
        }
    }
}
