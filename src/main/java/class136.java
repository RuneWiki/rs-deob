import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class136 extends class180 {

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Lcd;")
    public static class35 field2115;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILj;)Ldh;", line = 13)
    public static final class151 method946(int arg0, class153 arg1) {
        int var2 = 107 % ((arg0 - 57) / 50);
        field2118++;
        return new class151(arg1.method1081((byte) -4), arg1.method1081((byte) -6), arg1.method1081((byte) -18), arg1.method1081((byte) 117), arg1.method1081((byte) -107), arg1.method1081((byte) -2), arg1.method1081((byte) 114), arg1.method1081((byte) -93), arg1.method1088(-30917), arg1.method1042((byte) 84));
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)Z", line = 26)
    public static final boolean method947(int arg0, byte arg1, int arg2) {
        if (arg1 > -101) {
            method949(true, 126, 55, -37, -95);
        }
        field2120++;
        return (arg2 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(B)V", line = 48)
    public static void method948(byte arg0) {
        if (arg0 > -116) {
            method949(false, -23, 36, -30, 46);
        }
        field2115 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZIIII)V", line = 72)
    public static final void method949(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field2116++;
        if (arg2 < -79 && class18.method83((byte) -57, arg3)) {
            class218.method1509(class272.field4582[arg3], arg0, arg4, 0, arg1, -1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[Ljc;I)V", line = 92)
    public static final void method950(int arg0, int arg1, class274[] arg2, int arg3) {
        if (arg1 > arg0) {
            int var4 = arg0 - 1;
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1 + 1;
            class274 var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            while (var4 < var6) {
                boolean var8 = true;
                do {
                    var6--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class197.field3261[var9] == 2) {
                            var11 = arg2[var6].field4604;
                            var10 = var7.field4604;
                        } else if (class197.field3261[var9] == 1) {
                            var10 = var7.field4607;
                            var11 = arg2[var6].field4607;
                            if (var10 == -1 && class113.field1771[var9] == 1) {
                                var10 = 2001;
                            }
                            if (var11 == -1 && class113.field1771[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class197.field3261[var9] == 3) {
                            var10 = var7.field4616 ? 1 : 0;
                            var11 = arg2[var6].field4616 ? 1 : 0;
                        } else {
                            var10 = var7.field4605;
                            var11 = arg2[var6].field4605;
                        }
                        if (var10 != var11) {
                            if ((class113.field1771[var9] != 1 || var11 <= var10) && (class113.field1771[var9] != 0 || var11 >= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class197.field3261[var13] == 2) {
                            var15 = var7.field4604;
                            var14 = arg2[var4].field4604;
                        } else if (class197.field3261[var13] == 1) {
                            var14 = arg2[var4].field4607;
                            if (var14 == -1 && class113.field1771[var13] == 1) {
                                var14 = 2001;
                            }
                            var15 = var7.field4607;
                            if (var15 == -1 && class113.field1771[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class197.field3261[var13] == 3) {
                            var14 = arg2[var4].field4616 ? 1 : 0;
                            var15 = var7.field4616 ? 1 : 0;
                        } else {
                            var14 = arg2[var4].field4605;
                            var15 = var7.field4605;
                        }
                        if (var14 != var15) {
                            if ((class113.field1771[var13] != 1 || var14 >= var15) && (class113.field1771[var13] != 0 || var14 <= var15)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var6 > var4) {
                    class274 var16 = arg2[var4];
                    arg2[var4] = arg2[var6];
                    arg2[var6] = var16;
                }
            }
            method950(arg0, var6, arg2, -4);
            method950(var6 + 1, arg1, arg2, -4);
        }
        field2117++;
        if (arg3 != -4) {
            method947(-9, (byte) -11, -61);
        }
    }
}
