import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class65 extends class457 {

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "Lwj;")
    public static class270 field886 = new class270(36, -2);

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "Ldi;")
    public static class83 field894 = new class83(72, 7);

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "[Lgf;")
    public static class181[] field896 = new class181[6];

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "[I")
    public static int[] field898 = new int[1];

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "[I")
    public static int[] field899 = new int[1024];

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "Lwj;")
    public static class270 field897 = new class270(5, 5);

    @OriginalMember(owner = "client!iv", name = "l", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public static int field889;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field892;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    public static int field895;

    // $FF: synthetic field
    @OriginalMember(owner = "client!iv", name = "C", descriptor = "Ljava/lang/Class;")
    public static Class field900;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIZ)V")
    public final void method430(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field899 = null;
        }
        ++field890;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ZB)V")
    public final void method435(boolean arg0, byte arg1) {
        ++field883;
        if (arg1 <= 32) {
            method562((class12) null, 106);
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
    public static void method559(byte arg0) {
        if (arg0 == 49) {
            field897 = null;
            field886 = null;
            field898 = null;
            field896 = null;
            field899 = null;
            field894 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILvr;Lvr;)V")
    public static final void method560(int arg0, int arg1, int arg2, class90 arg3, class90 arg4) {
        class486 var5 = class307.method1784(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7114 = arg3;
            var5.field7118 = arg4;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lmk;II)V")
    public final void method431(class40 arg0, int arg1, int arg2) {
        super.field6706.method1996(2, arg0);
        ++field889;
        super.field6706.method1974(arg2, arg1 ^ 4993);
        if (arg1 != 384) {
            field898 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lef;)V")
    public class65(class338 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lmg;Lya;Lmg;B)V")
    public static final void method561(class101 arg0, class38 arg1, class101 arg2, byte arg3) {
        ++field893;
        class117.field1753 = class310.method1796(0, arg2, class260.field3620, (byte) 127);
        class451.field6653 = arg1.method324(class117.field1753, class4.method24(arg0, class260.field3620, 0), true);
        class278.field3809 = class310.method1796(0, arg2, class217.field3028, (byte) 127);
        class297.field4084 = arg1.method324(class278.field3809, class4.method24(arg0, class217.field3028, 0), true);
        class407.field5952 = class310.method1796(0, arg2, class113.field1701, (byte) 127);
        if (arg3 <= 3) {
            field898 = null;
        }
        class135.field1949 = arg1.method324(class407.field5952, class4.method24(arg0, class113.field1701, 0), true);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)Z")
    public final boolean method429(int arg0) {
        ++field895;
        return arg0 == 0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lds;I)V")
    public static final void method562(class12 arg0, int arg1) {
        ++field885;
        if (class89.field1305 != null) {
            class503 var2 = null;
            if (arg0.field187 == arg1) {
                var2 = (class503) class176.method1135(arg0.field189, arg0.field190, arg0.field191);
            }
            if (arg0.field187 == 1) {
                var2 = (class503) class131.method899(arg0.field189, arg0.field190, arg0.field191);
            }
            if (arg0.field187 == 2) {
                var2 = (class503) class38.method295(arg0.field189, arg0.field190, arg0.field191, field900 != null ? field900 : (field900 = method565("jn")));
            }
            if (~arg0.field187 == -4) {
                var2 = (class503) class509.method3048(arg0.field189, arg0.field190, arg0.field191);
            }
            if (var2 == null) {
                arg0.field193 = -1;
                arg0.field186 = 0;
                arg0.field178 = 0;
            } else {
                arg0.field193 = var2.method490(-29679);
                arg0.field186 = var2.method496(arg1 ^ -88);
                arg0.field178 = var2.method499(arg1 ^ -15561);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V")
    public static final void method563(byte arg0) {
        ++field892;
        if (!class94.field1448) {
            class94.field1448 = true;
            if (arg0 != -41) {
                method564(100, (byte) -78);
            }
            class463.field6805 = true;
            if (class20.field269.field7654) {
                class498.field7255 = (float) (-128 & (int) class498.field7255 + 191);
            } else {
                class78.field1128 += (-class78.field1128 + 24.0F) / 2.0F;
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Ldn;")
    public static final class357 method564(int arg0, byte arg1) {
        ++field891;
        if (arg1 != 19) {
            field896 = null;
        }
        class357[] var2 = class66.method569(128);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            class357 var4 = var2[var3];
            if (var4.field5213 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZ)V")
    public final void method434(int arg0, boolean arg1) {
        if (arg0 != 28037) {
            method564(63, (byte) 120);
        }
        ++field887;
        super.field6706.method1933(true, -19629);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public final void method433(byte arg0) {
        if (arg0 != 8) {
            field896 = null;
        }
        super.field6706.method1933(false, -19629);
        ++field888;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method565(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
