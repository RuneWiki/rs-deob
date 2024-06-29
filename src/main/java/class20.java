import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class20 {

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public int field277 = -1;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public int field278 = -1;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "Z")
    public boolean field283 = true;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public int field284 = 0;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "Le;")
    public static class191 field274 = class54.method368("welle:", 2047);

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lwe;")
    public static class147 field273 = new class147(260);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "[I")
    public static int[] field281;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method148(int arg0, int arg1) {
        field275++;
        class270.field4767 = -1;
        class270.field4767 = -1;
        if (~arg0 == arg1) {
            class216.field3808 = 3.0F;
        } else if (arg0 == 50) {
            class216.field3808 = 4.0F;
        } else if (arg0 == 75) {
            class216.field3808 = 6.0F;
        } else {
            class216.field3808 = 8.0F;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V")
    public static final void method149(int arg0) {
        class117.field1937.method992(-31);
        field272++;
        if (arg0 != -1) {
            method148(-61, 83);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)V")
    public static void method150(int arg0) {
        field273 = null;
        field274 = null;
        if (arg0 > -79) {
            field273 = null;
        }
        field281 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lji;IB)V")
    public final void method151(class225 arg0, int arg1, byte arg2) {
        field279++;
        if (arg2 <= 126) {
            this.field278 = -64;
        }
        while (true) {
            int var4 = arg0.method1580(-46);
            if (var4 == 0) {
                return;
            }
            this.method153(-120, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILe;III)V")
    public static final void method152(int arg0, class191 arg1, int arg2, int arg3, int arg4) {
        class33 var5 = class10.method74(arg2, arg3, (byte) 124);
        if (arg4 != 137) {
            method148(-85, 87);
        }
        field276++;
        if (var5 == null) {
            return;
        }
        if (var5.field542 != null) {
            class61 var6 = new class61();
            var6.field1102 = arg0;
            var6.field1089 = var5;
            var6.field1095 = arg1;
            var6.field1101 = var5.field542;
            class12.method87(var6, -12934);
        }
        boolean var7 = true;
        if (var5.field483 > 0) {
            var7 = class117.method781(var5, 338935548);
        }
        if (!var7 || !class181.method1223(3539, arg0 - 1, client.method668(var5))) {
            return;
        }
        if (arg0 == 1) {
            class53.field963.method1096(63, 0);
            class31.field433++;
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 2) {
            class53.field963.method1096(121, 0);
            class118.field1952++;
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 3) {
            class92.field1508++;
            class53.field963.method1096(137, 0);
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 4) {
            class16.field217++;
            class53.field963.method1096(149, 0);
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 5) {
            class53.field963.method1096(238, arg4 ^ 0x89);
            class41.field732++;
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 6) {
            class269.field4742++;
            class53.field963.method1096(195, 0);
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 7) {
            class270.field4754++;
            class53.field963.method1096(177, 0);
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 8) {
            class53.field963.method1096(86, arg4 - 137);
            class88.field1437++;
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 9) {
            class168.field2844++;
            class53.field963.method1096(240, 0);
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
        if (arg0 == 10) {
            class242.field4321++;
            class53.field963.method1096(105, 0);
            class53.field963.method1576(30289, arg2);
            class53.field963.method1608(arg3, false);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIILji;)V")
    private final void method153(int arg0, int arg1, int arg2, class225 arg3) {
        field280++;
        if (arg0 >= -39) {
            this.method151((class225) null, -108, (byte) -42);
        }
        if (arg1 == 1) {
            this.field284 = class81.method515((byte) -115, arg3.method1591(2));
        } else if (arg1 == 2) {
            this.field277 = arg3.method1580(-24);
        } else if (arg1 == 3) {
            this.field277 = arg3.method1593(true);
            if (this.field277 == 65535) {
                this.field277 = -1;
                return;
            }
        } else if (arg1 == 5) {
            this.field283 = false;
        } else if (arg1 == 7) {
            this.field278 = class81.method515((byte) -119, arg3.method1591(2));
            return;
        } else if (arg1 == 8) {
            class101.field1604 = arg2;
            return;
        } else {
            if (arg1 == 9) {
                arg3.method1593(true);
            } else if (arg1 != 10) {
                if (arg1 == 11) {
                    arg3.method1580(-16);
                } else if (arg1 != 12) {
                    if (arg1 == 13) {
                        arg3.method1591(2);
                        return;
                    }
                    if (arg1 == 14) {
                        arg3.method1580(-104);
                        return;
                    }
                }
                return;
            }
            return;
        }
    }
}
