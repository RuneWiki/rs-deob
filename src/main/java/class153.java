import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class153 extends class102 {

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "Lr;")
    private class66 field2735 = class91.field1762;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    public static int field2723 = 0;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "Lr;")
    public static class66 field2721 = class93.method641(43, "Untersuchen");

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field2737 = -1;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public int field2724;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public int field2726;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    private int field2732;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Ltg;")
    private class215 field2720;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "Ltg;")
    private class215 field2729;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lcj;")
    public static class28 field2719;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)Z")
    public final boolean method1036(byte arg0, int arg1) {
        field2733++;
        if (this.field2729 == null) {
            return false;
        }
        if (this.field2720 == null) {
            this.method1043(113);
        }
        if (arg0 > -78) {
            method1045((class66) null, 122, (class63) null);
        }
        class49 var3 = (class49) this.field2720.method1381((long) arg1, -74);
        return var3 != null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(BI)Lr;")
    public final class66 method1037(byte arg0, int arg1) {
        int var3 = -13 / ((arg0 + 51) / 55);
        field2725++;
        if (this.field2729 == null) {
            return this.field2735;
        } else {
            class134 var4 = (class134) this.field2729.method1381((long) arg1, -78);
            return var4 == null ? this.field2735 : var4.field2491;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILlh;)V")
    public final void method1038(int arg0, class249 arg1) {
        while (true) {
            int var3 = arg1.method1677(-6677);
            if (var3 == 0) {
                field2730++;
                if (arg0 != 0) {
                    this.field2726 = 28;
                    return;
                }
                return;
            }
            this.method1047(arg1, (byte) -119, var3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
    private final void method1039(int arg0) {
        this.field2720 = new class215(this.field2729.method1383(-128));
        if (arg0 != 6) {
            return;
        }
        for (class134 var2 = (class134) this.field2729.method1382(-32642); var2 != null; var2 = (class134) this.field2729.method1386((byte) -120)) {
            class175 var3 = new class175(var2.field2491, (int) var2.field1560);
            this.field2720.method1380((byte) -9, var3, var2.field2491.method450(85));
        }
        field2740++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILr;)Z")
    public final boolean method1040(int arg0, class66 arg1) {
        field2731++;
        if (arg0 < 62) {
            return true;
        } else if (this.field2729 == null) {
            return false;
        } else {
            if (this.field2720 == null) {
                this.method1039(6);
            }
            for (class175 var3 = (class175) this.field2720.method1381(arg1.method450(-85), -71); var3 != null; var3 = (class175) this.field2720.method1389(127)) {
                if (var3.field3086.method463(arg1, (byte) 117)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(II)I")
    public static final int method1041(int arg0, int arg1) {
        field2722++;
        if (arg1 < 0) {
            return 0;
        }
        class15 var2 = (class15) class84.field1631.method1381((long) arg1, arg0 - 121);
        if (var2 == null) {
            return class174.method1176((byte) 106, arg1).field3414;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field195.length; var4++) {
            if (var2.field195[var4] == -1) {
                var3++;
            }
        }
        int var5 = var3 + (class174.method1176((byte) 126, arg1).field3414 - var2.field195.length);
        if (arg0 == 2) {
            return var5;
        } else {
            return -37;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)Lsd;")
    public static final class246 method1042(int arg0) {
        field2739++;
        if (arg0 != 3253) {
            method1046(-92);
        }
        try {
            return (class246) Class.forName("hi").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "(I)V")
    private final void method1043(int arg0) {
        this.field2720 = new class215(this.field2729.method1383(-128));
        if (arg0 < 50) {
            return;
        }
        for (class49 var2 = (class49) this.field2729.method1382(-32642); var2 != null; var2 = (class49) this.field2729.method1386((byte) -117)) {
            class49 var3 = new class49((int) var2.field1560);
            this.field2720.method1380((byte) 123, var3, (long) var2.field873);
        }
        field2738++;
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(II)I")
    public final int method1044(int arg0, int arg1) {
        field2736++;
        if (this.field2729 == null) {
            return this.field2732;
        }
        class49 var3 = (class49) this.field2729.method1381((long) arg0, -84);
        if (arg1 == -32511) {
            return var3 == null ? this.field2732 : var3.field873;
        } else {
            return -78;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lr;ILha;)Lr;")
    public static final class66 method1045(class66 arg0, int arg1, class63 arg2) {
        field2734++;
        if (arg0.method465(-125, class184.field3227) != -1) {
            label62: while (true) {
                int var3 = arg0.method465(33, class86.field1687);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method465(arg1 ^ 0x6C5C, class36.field539);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method465(arg1 - 27678, class86.field1688);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method465(-126, class105.field2025);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method465(arg1 - 27855, class162.field2904);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method465(-73, class247.field4305);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class66 var9 = class85.field1679;
                                                        if (class49.field885 != null) {
                                                            var9 = class260.method1772(class49.field885.field4070, -17516);
                                                            try {
                                                                if (class49.field885.field4069 != null) {
                                                                    byte[] var10 = ((String) class49.field885.field4069).getBytes("ISO-8859-1");
                                                                    var9 = class69.method507(var10.length, var10, 43, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class212.method1372(arg1 ^ 0x6C6F, new class66[] { arg0.method477(0, (byte) -74, var8), var9, arg0.method485(var8 + 4, true) });
                                                    }
                                                }
                                                arg0 = class212.method1372(arg1 - 27755, new class66[] { arg0.method477(0, (byte) -74, var7), class68.method496(class175.method1178(4, 20, arg2), -1), arg0.method485(var7 + 2, true) });
                                            }
                                        }
                                        arg0 = class212.method1372(2, new class66[] { arg0.method477(0, (byte) -74, var6), class68.method496(class175.method1178(3, 20, arg2), -1), arg0.method485(var6 + 2, true) });
                                    }
                                }
                                arg0 = class212.method1372(2, new class66[] { arg0.method477(0, (byte) -74, var5), class68.method496(class175.method1178(2, arg1 - 27737, arg2), -1), arg0.method485(var5 + 2, true) });
                            }
                        }
                        arg0 = class212.method1372(2, new class66[] { arg0.method477(0, (byte) -74, var4), class68.method496(class175.method1178(1, 20, arg2), -1), arg0.method485(var4 + 2, true) });
                    }
                }
                arg0 = class212.method1372(2, new class66[] { arg0.method477(0, (byte) -74, var3), class68.method496(class175.method1178(0, 20, arg2), arg1 ^ 0xFFFF9392), arg0.method485(var3 + 2, true) });
            }
        }
        if (arg1 != 27757) {
            field2721 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public static void method1046(int arg0) {
        field2719 = null;
        if (arg0 != 0) {
            method1041(18, 45);
        }
        field2721 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Llh;BI)V")
    private final void method1047(class249 arg0, byte arg1, int arg2) {
        field2727++;
        if (arg1 != -119) {
            this.field2735 = null;
        }
        if (arg2 == 1) {
            this.field2724 = arg0.method1677(arg1 - 6558);
        } else if (arg2 == 2) {
            this.field2726 = arg0.method1677(-6677);
        } else if (arg2 == 3) {
            this.field2735 = arg0.method1637(127);
        } else if (arg2 == 4) {
            this.field2732 = arg0.method1652(-5528);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg0.method1674(1355769544);
            this.field2729 = new class215(class62.method413(var4, -21189));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1652(-5528);
                class80 var7;
                if (arg2 == 5) {
                    var7 = new class134(arg0.method1637(127));
                } else {
                    var7 = new class49(arg0.method1652(-5528));
                }
                this.field2729.method1380((byte) 2, var7, (long) var6);
            }
        }
    }
}
