import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class244 extends class182 {

    @OriginalMember(owner = "client!we", name = "S", descriptor = "I")
    public static int field4506 = 0;

    @OriginalMember(owner = "client!we", name = "I", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!we", name = "J", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!we", name = "K", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!we", name = "M", descriptor = "I")
    public int field4500;

    @OriginalMember(owner = "client!we", name = "N", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!we", name = "O", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!we", name = "P", descriptor = "I")
    public int field4503;

    @OriginalMember(owner = "client!we", name = "Q", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!we", name = "R", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!we", name = "L", descriptor = "Z")
    public static boolean field4499;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLnc;I)V")
    private final void method1569(byte arg0, class145 arg1, int arg2) {
        if (arg2 == 1) {
            this.field4496 = arg1.method1049((byte) 118);
            this.field4500 = arg1.method998(81);
            this.field4503 = arg1.method998(71);
        }
        if (arg0 <= 113) {
            field4499 = false;
        }
        field4501++;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIII)V")
    public static final void method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4504++;
        if (arg4 >= class240.field4355 && arg2 <= class146.field2678 && arg1 >= class159.field2910 && arg5 <= class224.field4040) {
            class175.method1221(arg3, arg5, arg2, arg4, arg1, true);
        } else {
            class45.method372((byte) -103, arg5, arg4, arg3, arg1, arg2);
        }
        if (arg0 != 0) {
            field4506 = 105;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIILf;)V")
    public static final void method1571(int arg0, int arg1, int arg2, int arg3, class56 arg4) {
        if (arg2 != 0) {
            field4499 = true;
        }
        field4502++;
        if (class93.field1712 == arg4 || class100.field1825 >= 400) {
            return;
        }
        class117 var5;
        if (arg4.field1156 == 0) {
            var5 = class36.method316((byte) -34, new class117[] { arg4.field1141, class88.method605(arg4.field1149, (byte) 35, class93.field1712.field1149), class39.field896, class240.field4348, class42.method358(arg4.field1149, (byte) 34), class111.field2095 });
        } else {
            var5 = class36.method316((byte) -34, new class117[] { arg4.field1141, class39.field896, class56.field1168, class42.method358(arg4.field1156, (byte) 34), class111.field2095 });
        }
        if (class86.field1623 == 1) {
            class52.field1068++;
            class61.method450(-25300, (long) arg0, class10.field358, arg1, (short) 8, arg3, class36.method316((byte) -34, new class117[] { class120.field2264, class106.field1931, var5 }));
        } else if (!class82.field1543) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class90.field1685[var6] != null) {
                    class135.field2433++;
                    short var7 = 0;
                    if (class176.field3172 == 0 && class90.field1685[var6].method789(class4.field52, arg2 ^ 0xFFFFFF8F)) {
                        if (arg4.field1149 > class93.field1712.field1149) {
                            var7 = 2000;
                        }
                        if (class93.field1712.field1128 != 0 && arg4.field1128 != 0) {
                            if (class93.field1712.field1128 == arg4.field1128) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class108.field2005[var6]) {
                        var7 = 2000;
                    }
                    boolean var8 = false;
                    short var9 = class81.field1524[var6];
                    short var10 = (short) (var7 + var9);
                    class61.method450(-25300, (long) arg0, class90.field1685[var6], arg1, var10, arg3, class36.method316((byte) -34, new class117[] { class210.field3762, var5 }));
                }
            }
        } else if ((class234.field4231 & 0x8) == 8) {
            class110.field2069++;
            class61.method450(-25300, (long) arg0, class38.field878, arg1, (short) 9, arg3, class36.method316((byte) -34, new class117[] { class80.field1509, class106.field1931, var5 }));
        }
        for (int var11 = 0; var11 < class100.field1825; var11++) {
            if (class194.field3462[var11] == 11) {
                class56.field1160[var11] = class36.method316((byte) -34, new class117[] { class210.field3762, var5 });
                return;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BLnc;)V")
    public final void method1572(byte arg0, class145 arg1) {
        while (true) {
            int var3 = arg1.method998(59);
            if (var3 == 0) {
                field4505++;
                if (arg0 != -125) {
                    field4499 = true;
                    return;
                }
                return;
            }
            this.method1569((byte) 119, arg1, var3);
        }
    }
}
