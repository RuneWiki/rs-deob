import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class288 extends class220 {

    @OriginalMember(owner = "client!fc", name = "nc", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!fc", name = "oc", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!fc", name = "pc", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!fc", name = "qc", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!fc", name = "rc", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!fc", name = "sc", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!fc", name = "tc", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!fc", name = "uc", descriptor = "I")
    public static int field4688;

    @OriginalMember(owner = "client!fc", name = "vc", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!fc", name = "wc", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!fc", name = "xc", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!fc", name = "zc", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!fc", name = "Bc", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!fc", name = "yc", descriptor = "Lrb;")
    public class121 field4692;

    @OriginalMember(owner = "client!fc", name = "Ac", descriptor = "Lth;")
    public static class57 field4694;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIII)V", line = 7)
    public final void method445(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4683++;
        if (this.field4692 == null) {
            return;
        }
        if (!this.field3533) {
            class43 var6 = this.field3547 != -1 && this.field3559 == 0 ? class198.method1524(this.field3547, -72) : null;
            class43 var7 = this.field3544 == -1 || this.field3544 == this.method1641(0).field1737 && var6 != null ? null : class198.method1524(this.field3544, 74);
            class96 var8 = this.field4692.method953(this.field3539, this.field3558, var7, this.field3517, this.field3489, this.field3532, var6, this.field3554, this.field3576, (byte) 61);
            if (var8 == null) {
                return;
            }
            this.method1649((class96) null, -14851, var8);
        }
        if (this.field3508 != null) {
            this.field3508.method1230(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()I", line = 43)
    public final int method444() {
        field4687++;
        return this.field3534;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILrb;)V", line = 54)
    public final void method2092(int arg0, class121 arg1) {
        field4691++;
        this.field4692 = arg1;
        if (arg0 != -1) {
            this.field4692 = (class121) null;
        }
        if (this.field3508 != null) {
            this.field3508.method1239();
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V", line = 70)
    public static void method2093(boolean arg0) {
        field4694 = null;
        if (arg0) {
            method2093(false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)I", line = 85)
    public final int method1636(int arg0) {
        if (arg0 != -1) {
            return 51;
        }
        field4684++;
        if (this.field4692.field2066 != null) {
            class121 var2 = this.field4692.method958((byte) -115);
            if (var2 != null && var2.field2065 != -1) {
                return var2.field2065;
            }
        }
        return this.field3561;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)Lrn;", line = 110)
    public static final class308 method2094(int arg0, byte arg1) {
        class308 var2 = (class308) class292.field4724.method2329((byte) 107, (long) arg0);
        field4685++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class220.field3501.method472(arg0, 99, 29);
        class308 var4 = new class308();
        if (var3 != null) {
            var4.method2191(new class227(var3), -126, arg0);
        }
        class292.field4724.method2333((long) arg0, 0, var4);
        return arg1 == 42 ? var4 : (class308) null;
    }

    @OriginalMember(owner = "client!fc", name = "finalize", descriptor = "()V", line = 134)
    protected final void finalize() {
        field4690++;
        if (this.field3508 != null) {
            this.field3508.method1232();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIIJILdc;)V", line = 148)
    public final void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class158 arg10) {
        field4681++;
        if (this.field4692 == null) {
            return;
        }
        class43 var13 = this.field3547 != -1 && this.field3559 == 0 ? class198.method1524(this.field3547, 86) : null;
        class43 var14 = this.field3544 == -1 || this.field3544 == this.method1641(0).field1737 && var13 != null ? null : class198.method1524(this.field3544, 80);
        class96 var15 = this.field4692.method953(this.field3539, this.field3558, var14, this.field3517, this.field3489, this.field3532, var13, this.field3554, this.field3576, (byte) 61);
        if (var15 == null) {
            return;
        }
        this.field3534 = var15.method444();
        class121 var16 = this.field4692;
        if (var16.field2066 != null) {
            var16 = var16.method958((byte) -115);
        }
        if (client.field717 && var16.field2060) {
            class96 var17 = class59.method501(this.field4692.field2044, this.field3511, arg0, this.field4692.field2090, this.field4692.field2025, this.field3546, var14 == null ? var13 : var14, this.field4692.field2087, var15, this.field3504, this.field4692.field2078, (byte) -111, var14 == null ? this.field3517 : this.field3554, this.field3577);
            if (class42.field607) {
                float var18 = class42.method303();
                float var19 = class42.method290();
                class42.method279();
                class42.method300(var18, var19 - 150.0F);
                var17.method440(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field3508);
                class42.method282();
                class42.method300(var18, var19);
            } else {
                var17.method440(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, this.field3508);
            }
        }
        this.method1640(var15, -65);
        this.method1645(arg0, var15, (byte) -105);
        class96 var20 = null;
        if (this.field3552 != -1 && this.field3566 != -1) {
            class94 var21 = class282.method2071(this.field3552, 0);
            var20 = var21.method732(this.field3527, (byte) 80, this.field3566, this.field3499);
            if (var20 != null) {
                var20.method512(0, -this.field3509, 0);
                if (var21.field1585) {
                    if (class149.field2387 != 0) {
                        var20.method531(class149.field2387);
                    }
                    if (class252.field4264 != 0) {
                        var20.method543(class252.field4264);
                    }
                    if (class57.field966 != 0) {
                        var20.method512(0, class57.field966, 0);
                    }
                }
            }
        }
        if (!class42.field607) {
            if (var20 != null) {
                var15 = ((class62) var15).method524(var20);
            }
            this.method1649(var20, -14851, var15);
            if (this.field4692.field2025 == 1) {
                var15.field1597 = true;
            }
            var15.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3508);
            return;
        }
        this.method1649(var20, -14851, var15);
        if (this.field4692.field2025 == 1) {
            var15.field1597 = true;
        }
        var15.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3508);
        if (var20 == null) {
            return;
        }
        if (this.field4692.field2025 == 1) {
            var20.field1597 = true;
        }
        if (this.field3508 != null) {
            class337 var22 = (class337) var20;
            this.field3508.method1228(var22.field5345, var22.field5326, true, var22.field5344, var22.field5365, var22.field5332);
        }
        var20.method440(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3508);
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(B)Z", line = 271)
    public final boolean method1646(byte arg0) {
        field4695++;
        if (this.field4692 == null) {
            return false;
        } else {
            return arg0 == -7;
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I", line = 286)
    public final int method1644(byte arg0) {
        field4688++;
        if (this.field4692.field2066 != null) {
            class121 var2 = this.field4692.method958((byte) -115);
            if (var2 != null && var2.field2042 != -1) {
                return var2.field2042;
            }
        }
        if (arg0 < 94) {
            return -128;
        } else if (this.field4692.field2042 == -1) {
            return super.method1644((byte) 118);
        } else {
            return this.field4692.field2042;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I", line = 310)
    public final int method1648(int arg0) {
        field4689++;
        if (arg0 != -1) {
            field4694 = (class57) null;
        }
        if (this.field4692.field2066 != null) {
            class121 var2 = this.field4692.method958((byte) -115);
            if (var2 != null && var2.field2085 != -1) {
                return var2.field2085;
            }
        }
        return this.field4692.field2085;
    }
}
