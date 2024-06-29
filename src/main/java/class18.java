import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class18 extends class243 {

    @OriginalMember(owner = "client!dja", name = "t", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!dja", name = "w", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!dja", name = "q", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client!dja", name = "m", descriptor = "I")
    private int field174;

    @OriginalMember(owner = "client!dja", name = "p", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "client!dja", name = "r", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client!dja", name = "z", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client!dja", name = "n", descriptor = "I")
    private int field175;

    @OriginalMember(owner = "client!dja", name = "A", descriptor = "Lst;")
    public static class335 field188 = new class335(77, -1);

    @OriginalMember(owner = "client!dja", name = "B", descriptor = "[I")
    public static int[] field189 = new int[13];

    @OriginalMember(owner = "client!dja", name = "o", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!dja", name = "s", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!dja", name = "u", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!dja", name = "v", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!dja", name = "x", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!dja", name = "y", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method86(int arg0, byte arg1) {
        ++field186;
        if (arg1 >= -88) {
            return true;
        } else {
            return arg0 == 0 || ~arg0 == -2 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIB)V", line = 15)
    public final void method87(int arg0, int arg1, byte arg2) {
        if (arg2 <= 92) {
            this.method90(91, -63, 3);
        }
        ++field183;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V", line = 28)
    public static void method88(int arg0) {
        field188 = null;
        if (arg0 != 15677) {
            field189 = null;
        }
        field189 = null;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(ZILcea;)V", line = 39)
    public static final void method89(boolean arg0, int arg1, class96 arg2) {
        ++field185;
        if (~class284.field4103 > -401) {
            if (class388.field5601 == arg2) {
                if (class160.field2235 && (class623.field8403 & 16) != 0) {
                    ++class560.field7793;
                    class300.method1979(true, class721.field10028, false, -1, class468.field6500 + " -> <col=ffffff>" + class155.field2156.method978(class120.field1576, (byte) -114), (long) arg2.field7148, (byte) 115, false, 0, 0L, 0, 60, class488.field6817);
                }
            } else {
                if (arg1 != 24897) {
                    field188 = null;
                }
                String var7;
                if (~arg2.field1356 == -1) {
                    boolean var3 = true;
                    if (~class388.field5601.field1329 != 0 && ~arg2.field1329 != 0) {
                        int var4 = arg2.field1329 <= class388.field5601.field1329 ? arg2.field1329 : class388.field5601.field1329;
                        int var5 = -arg2.field1342 + class388.field5601.field1342;
                        if (var5 < 0) {
                            var5 = -var5;
                        }
                        if (var4 < var5) {
                            var3 = false;
                        }
                    }
                    String var6 = class712.field9955 == class289.field4140 ? class155.field2149.method978(class120.field1576, (byte) -118) : class155.field2147.method978(class120.field1576, (byte) -112);
                    if (~arg2.field1342 <= ~arg2.field1314) {
                        var7 = arg2.method661(true, (byte) -118) + (!var3 ? "<col=ffffff>" : class49.method353(class388.field5601.field1342, arg2.field1342, 8089)) + " (" + var6 + arg2.field1342 + ")";
                    } else {
                        var7 = arg2.method661(true, (byte) -76) + (var3 ? class49.method353(class388.field5601.field1342, arg2.field1342, 8089) : "<col=ffffff>") + " (" + var6 + arg2.field1342 + "+" + (-arg2.field1342 + arg2.field1314) + ")";
                    }
                } else if (arg2.field1356 == -1) {
                    var7 = arg2.method661(true, (byte) -99);
                } else {
                    var7 = arg2.method661(true, (byte) -112) + " (" + class155.field2148.method978(class120.field1576, (byte) -125) + arg2.field1356 + ")";
                }
                if (class160.field2235 && !arg0 && (class623.field8403 & 8) != 0) {
                    class300.method1979(true, class721.field10028, false, -1, class468.field6500 + " -> <col=ffffff>" + var7, (long) arg2.field7148, (byte) 115, false, 0, (long) arg2.field7148, 0, 15, class488.field6817);
                    ++class206.field2699;
                }
                if (arg0) {
                    class300.method1979(false, -1, true, 0, "", (long) arg2.field7148, (byte) 115, false, 0, 0L, 0, -1, "<col=cccccc>" + var7);
                } else {
                    for (int var8 = 7; var8 >= 0; --var8) {
                        if (class414.field5868[var8] != null) {
                            short var10 = 0;
                            if (class540.field7508 == class289.field4140 && class414.field5868[var8].equalsIgnoreCase(class155.field2142.method978(class120.field1576, (byte) -107))) {
                                if (arg2.field1342 > class388.field5601.field1342) {
                                    var10 = 2000;
                                }
                                if (class388.field5601.field1317 != 0 && ~arg2.field1317 != -1) {
                                    if (~class388.field5601.field1317 == ~arg2.field1317) {
                                        var10 = 2000;
                                    } else {
                                        var10 = 0;
                                    }
                                }
                            } else if (class445.field6183[var8]) {
                                var10 = 2000;
                            }
                            short var11 = (short) (class625.field8412[var8] + var10);
                            int var12 = ~class613.field8249[var8] == 0 ? class42.field520 : class613.field8249[var8];
                            class300.method1979(true, var12, false, -1, "<col=ffffff>" + var7, (long) arg2.field7148, (byte) 115, false, 0, (long) arg2.field7148, 0, var11, class414.field5868[var8]);
                            ++class458.field6363;
                        }
                    }
                }
                if (!arg0) {
                    for (class558 var9 = (class558) class290.field4161.method3618(73); var9 != null; var9 = (class558) class290.field4161.method3619(0)) {
                        if (~var9.field7754 == -9) {
                            var9.field7763 = "<col=ffffff>" + var7;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dja", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 196)
    public class18(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field181 = arg1;
        this.field184 = arg4;
        this.field178 = arg5;
        this.field174 = arg3;
        this.field177 = arg7;
        this.field179 = arg0;
        this.field187 = arg2;
        this.field175 = arg6;
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(III)V", line = 211)
    public final void method90(int arg0, int arg1, int arg2) {
        ++field182;
        if (arg2 != 10893) {
            method88(125);
        }
    }

    @OriginalMember(owner = "client!dja", name = "a", descriptor = "(ILha;)V", line = 224)
    public static final void method91(int arg0, class548 arg1) {
        ++field180;
        if (!class484.field6743) {
            class157.method983(arg0 + -255, arg1);
        } else {
            class155.method977(false, arg1);
        }
        if (arg0 != -1) {
            method89(true, -2, (class96) null);
        }
    }

    @OriginalMember(owner = "client!dja", name = "b", descriptor = "(III)V", line = 239)
    public final void method92(int arg0, int arg1, int arg2) {
        ++field176;
        int var4 = this.field179 * arg2 >> 12;
        int var5 = this.field181 * arg0 >> 12;
        int var6 = this.field187 * arg2 >> 12;
        int var7 = this.field174 * arg0 >> 12;
        int var8 = this.field184 * arg2 >> 12;
        int var9 = this.field178 * arg0 >> 12;
        int var10 = this.field175 * arg2 >> 12;
        int var11 = 92 % ((-20 - arg1) / 33);
        int var12 = this.field177 * arg0 >> 12;
        class289.method1910(var7, var9, var12, (byte) -52, var4, var8, var5, var6, super.field3610, var10);
    }
}
