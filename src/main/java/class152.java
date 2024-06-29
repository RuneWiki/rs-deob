import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class152 extends class291 {

    @OriginalMember(owner = "client!df", name = "N", descriptor = "Leg;")
    public static class37 field2548 = class174.method1167("www)2wtqa", 121);

    @OriginalMember(owner = "client!df", name = "V", descriptor = "Z")
    public static boolean field2556 = false;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "Leg;")
    public static class37 field2560 = class174.method1167("huffman", -38);

    @OriginalMember(owner = "client!df", name = "O", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!df", name = "M", descriptor = "Lpa;")
    private class140 field2547;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "Lfl;")
    public static class287 field2557;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IZI)Z")
    public static final boolean method1035(int arg0, boolean arg1, int arg2) {
        field2553++;
        if (arg1) {
            method1042(-75, -14, (class237[]) null);
        }
        return (arg0 >> arg2 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Leg;IB)Leg;")
    public final class37 method1036(class37 arg0, int arg1, byte arg2) {
        field2552++;
        if (this.field2547 == null) {
            return arg0;
        }
        class99 var4 = (class99) this.field2547.method992((byte) 125, (long) arg1);
        if (var4 == null) {
            return arg0;
        } else {
            if (arg2 >= -70) {
                field2557 = null;
            }
            return var4.field1533;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)Ltf;")
    public static final class110 method1037(int arg0, int arg1) {
        class110 var2 = (class110) class238.field4233.method1411(-40, (long) arg0);
        field2551++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class35.field508.method666(arg0, arg1, (byte) -51);
        class110 var4 = new class110();
        if (var3 != null) {
            var4.method774(0, arg0, new class187(var3));
        }
        class238.field4233.method1404((long) arg0, false, var4);
        return var4;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIB)V")
    public static final void method1038(int arg0, int arg1, byte arg2) {
        class274 var3 = class166.method1116(5, arg1, true);
        if (arg2 > -43) {
            field2548 = null;
        }
        var3.method1835(-66);
        field2555++;
        var3.field4802 = arg0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Lva;B)V")
    public final void method1039(class187 arg0, byte arg1) {
        if (arg1 != -20) {
            field2560 = null;
        }
        field2558++;
        while (true) {
            int var3 = arg0.method1268(255);
            if (var3 == 0) {
                return;
            }
            this.method1041(-79, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBI)I")
    public final int method1040(int arg0, byte arg1, int arg2) {
        field2554++;
        if (this.field2547 == null) {
            return arg2;
        }
        class120 var4 = (class120) this.field2547.method992((byte) 125, (long) arg0);
        if (arg1 >= -5) {
            return -69;
        } else if (var4 == null) {
            return arg2;
        } else {
            return var4.field2027;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILva;I)V")
    private final void method1041(int arg0, class187 arg1, int arg2) {
        if (arg2 == 249) {
            int var4 = arg1.method1268(255);
            if (this.field2547 == null) {
                int var5 = class263.method1777(var4, (byte) 90);
                this.field2547 = new class140(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg1.method1268(255) == 1;
                int var8 = arg1.method1248((byte) -89);
                class62 var9;
                if (var7) {
                    var9 = new class99(arg1.method1253(20));
                } else {
                    var9 = new class120(arg1.method1290((byte) 90));
                }
                this.field2547.method986(var9, (long) var8, -1);
            }
        }
        int var10 = 9 / ((arg0 + 26) / 46);
        field2562++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II[Lpe;)V")
    public static final void method1042(int arg0, int arg1, class237[] arg2) {
        int var3 = 0;
        int var4 = 66 % ((31 - arg1) / 35);
        while (var3 < arg2.length) {
            class237 var5 = arg2[var3];
            if (var5 != null && var5.field4171 == arg0 && (!var5.field4129 || !client.method789(var5))) {
                label97: {
                    if (var5.field4228 == 0) {
                        if (!var5.field4129 && client.method789(var5) && class232.field3995 != var5) {
                            break label97;
                        }
                        method1042(var5.field4211, 105, arg2);
                        if (var5.field4194 != null) {
                            method1042(var5.field4211, 97, var5.field4194);
                        }
                        class190 var6 = (class190) class120.field2022.method992((byte) 125, (long) var5.field4211);
                        if (var6 != null) {
                            class18.method121(-1, var6.field3259);
                        }
                    }
                    if (var5.field4228 == 6) {
                        if (var5.field4181 != -1 || var5.field4209 != -1) {
                            boolean var7 = class170.method1140(false, var5);
                            int var8;
                            if (var7) {
                                var8 = var5.field4209;
                            } else {
                                var8 = var5.field4181;
                            }
                            if (var8 != -1) {
                                class2 var9 = class186.method1242(0, var8);
                                if (var9 != null) {
                                    var5.field4110 += class259.field4588;
                                    while (var9.field46[var5.field4165] < var5.field4110) {
                                        var5.field4110 -= var9.field46[var5.field4165];
                                        var5.field4165++;
                                        if (var5.field4165 >= var9.field24.length) {
                                            var5.field4165 -= var9.field47;
                                            if (var5.field4165 < 0 || var5.field4165 >= var9.field24.length) {
                                                var5.field4165 = 0;
                                            }
                                        }
                                        class121.method856(24665, var5);
                                    }
                                }
                            }
                        }
                        if (var5.field4167 != 0 && !var5.field4129) {
                            int var10 = var5.field4167 >> 16;
                            int var11 = var5.field4167 << 16 >> 16;
                            int var12 = class259.field4588 * var10;
                            int var13 = class259.field4588 * var11;
                            var5.field4107 = var5.field4107 + var12 & 0x7FF;
                            var5.field4145 = var5.field4145 + var13 & 0x7FF;
                            class121.method856(24665, var5);
                        }
                    }
                }
            }
            var3++;
        }
        field2550++;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(I)V")
    public static void method1043(int arg0) {
        field2557 = null;
        int var1 = 31 / ((arg0 + 60) / 40);
        field2560 = null;
        field2548 = null;
    }

    @OriginalMember(owner = "client!df", name = "h", descriptor = "(I)Z")
    public static final boolean method1044(int arg0) {
        field2559++;
        return class120.field2029 == arg0 ? class73.field1158.method722(2) : true;
    }
}
