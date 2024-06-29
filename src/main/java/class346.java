import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class346 {

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
    public static int field4730 = 0;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lsm;")
    public static class249 field4724 = new class249();

    @OriginalMember(owner = "client!nj", name = "i", descriptor = "Lqq;")
    public static class189 field4731 = new class189();

    @OriginalMember(owner = "client!nj", name = "j", descriptor = "Lfn;")
    public static class52 field4732 = new class52(85, -2);

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!nj", name = "g", descriptor = "Lfc;")
    public static class343 field4729;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static final void method2065(byte arg0) {
        field4727++;
        if (arg0 > -17) {
            field4729 = null;
        }
        class290.field3988 = new class249();
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(B)V")
    public static void method2066(byte arg0) {
        if (arg0 > -14) {
            method2067((class133) null, true);
        }
        field4731 = null;
        field4729 = null;
        field4732 = null;
        field4724 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lpf;Z)V")
    public static final void method2067(class133 arg0, boolean arg1) {
        field4726++;
        int var2 = 0;
        arg0.method796(-114);
        for (int var3 = 0; var3 < class163.field2345; var3++) {
            int var15 = class482.field6800[var3];
            if ((class363.field5184[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    class363.field5184[var15] = (byte) class366.method2215(class363.field5184[var15], 2);
                    var2--;
                } else {
                    int var16 = arg0.method801((byte) -87, 1);
                    if (var16 == 0) {
                        var2 = class96.method625(arg0, (byte) 119);
                        class363.field5184[var15] = (byte) class366.method2215(class363.field5184[var15], 2);
                    } else {
                        class260.method1609(var15, (byte) -16, arg0);
                    }
                }
            }
        }
        arg0.method806((byte) -82);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method796(-106);
        for (int var4 = 0; var4 < class163.field2345; var4++) {
            int var13 = class482.field6800[var4];
            if ((class363.field5184[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    class363.field5184[var13] = (byte) class366.method2215(class363.field5184[var13], 2);
                    var2--;
                } else {
                    int var14 = arg0.method801((byte) -87, 1);
                    if (var14 == 0) {
                        var2 = class96.method625(arg0, (byte) 71);
                        class363.field5184[var13] = (byte) class366.method2215(class363.field5184[var13], 2);
                    } else {
                        class260.method1609(var13, (byte) -16, arg0);
                    }
                }
            }
        }
        arg0.method806((byte) -97);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        } else if (!arg1) {
            arg0.method796(-126);
            for (int var5 = 0; var5 < class128.field1813; var5++) {
                int var11 = class90.field1343[var5];
                if ((class363.field5184[var11] & 0x1) != 0) {
                    if (var2 > 0) {
                        var2--;
                        class363.field5184[var11] = (byte) class366.method2215(class363.field5184[var11], 2);
                    } else {
                        int var12 = arg0.method801((byte) -87, 1);
                        if (var12 == 0) {
                            var2 = class96.method625(arg0, (byte) 118);
                            class363.field5184[var11] = (byte) class366.method2215(class363.field5184[var11], 2);
                        } else if (class456.method2636(arg0, var11, (byte) -19)) {
                            class363.field5184[var11] = (byte) class366.method2215(class363.field5184[var11], 2);
                        }
                    }
                }
            }
            arg0.method806((byte) -105);
            if (var2 != 0) {
                throw new RuntimeException("nsn2");
            }
            arg0.method796(-124);
            for (int var6 = 0; var6 < class128.field1813; var6++) {
                int var9 = class90.field1343[var6];
                if ((class363.field5184[var9] & 0x1) == 0) {
                    if (var2 > 0) {
                        class363.field5184[var9] = (byte) class366.method2215(class363.field5184[var9], 2);
                        var2--;
                    } else {
                        int var10 = arg0.method801((byte) -87, 1);
                        if (var10 == 0) {
                            var2 = class96.method625(arg0, (byte) 110);
                            class363.field5184[var9] = (byte) class366.method2215(class363.field5184[var9], 2);
                        } else if (class456.method2636(arg0, var9, (byte) -19)) {
                            class363.field5184[var9] = (byte) class366.method2215(class363.field5184[var9], 2);
                        }
                    }
                }
            }
            arg0.method806((byte) -94);
            if (var2 != 0) {
                throw new RuntimeException("nsn3");
            }
            class163.field2345 = 0;
            class128.field1813 = 0;
            for (int var7 = 1; var7 < 2048; var7++) {
                class363.field5184[var7] = (byte) (class363.field5184[var7] >> 1);
                class23 var8 = class310.field4235[var7];
                if (var8 == null) {
                    class90.field1343[class128.field1813++] = var7;
                } else {
                    class482.field6800[class163.field2345++] = var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static final void method2068(int arg0) {
        class306.field4191 = 0;
        class372.field5266 = arg0;
        field4723++;
        class35.field588 = -1;
    }
}
