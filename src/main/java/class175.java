import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class175 extends class253 {

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "[B")
    public byte[] field3016;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Ljd;")
    public static class85 field3012 = class221.method1499("Nehmen", (byte) -59);

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "I")
    public static int field3011 = 0;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIZIII)V")
    public static final void method1176(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg3) {
            return;
        }
        field3014++;
        if (arg1 - arg5 >= class217.field3802 && (arg1 + arg5) <= class83.field1513 && arg6 - arg5 >= class34.field522 && (arg5 + arg6) <= class1.field6) {
            class12.method102(arg1, false, arg6, arg2, arg5, arg0, arg4);
        } else {
            class216.method1480(arg0, arg2, -10871, arg5, arg1, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)I")
    public static final int method1177(byte arg0, int arg1, int arg2) {
        field3005++;
        if (arg0 <= 91) {
            field3011 = 107;
        }
        class186 var3 = (class186) class172.field2975.method1398(1, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && var3.field3198.length > arg2) {
            return var3.field3198[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIILqb;Lqb;IIJ)V")
    public static final void method1178(int arg0, int arg1, int arg2, int arg3, class56 arg4, class56 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class233 var10 = new class233();
        var10.field4028 = arg8;
        var10.field4039 = arg1 * 128 + 64;
        var10.field4034 = arg2 * 128 + 64;
        var10.field4036 = arg3;
        var10.field4040 = arg4;
        var10.field4025 = arg5;
        var10.field4029 = arg6;
        var10.field4030 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class99.field1780[var11][arg1][arg2] == null) {
                class99.field1780[var11][arg1][arg2] = new class208(var11, arg1, arg2);
            }
        }
        class99.field1780[arg0][arg1][arg2].field3656 = var10;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLjd;I)V")
    public static final void method1179(boolean arg0, class85 arg1, int arg2) {
        if (arg0) {
            try {
                class185.field3165.getAppletContext().showDocument(arg1.method618(arg2 + 1, class185.field3165.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class185.field3165.getAppletContext().showDocument(arg1.method618(0, class185.field3165.getCodeBase()), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg2 != -1) {
            field3007 = -80;
        }
        field3015++;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
    public static void method1180(byte arg0) {
        if (arg0 <= 55) {
            method1179(true, (class85) null, -52);
        }
        field3012 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class76.field1415[arg0][var8][var14] == -class134.field2343) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class245.field4193[arg0][arg1][arg3] + arg5;
            if (!class264.method1817(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class264.method1817(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class264.method1817(var9, var11, var13)) {
                return false;
            } else if (class264.method1817(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class141.method925(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class264.method1817(var6 + 1, class245.field4193[arg0][arg1][arg3] + arg5, var7 + 1) && class264.method1817(var6 + 128 - 1, class245.field4193[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class264.method1817(var6 + 128 - 1, class245.field4193[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class264.method1817(var6 + 1, class245.field4193[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(IIIIII)V")
    public static final void method1182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 - arg5;
        field3006++;
        int var7 = arg1 - arg3;
        if (arg0 != 64) {
            field3003 = 70;
        }
        if (var6 == 0) {
            if (var7 != 0) {
                class202.method1384(arg1, arg2, arg3, arg0 ^ 0xFFFFE061, arg5);
            }
        } else if (var7 == 0) {
            class11.method95(arg4, (byte) -121, arg3, arg2, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg3 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class217.field3802 > arg5) {
                var10 = class217.field3802;
                var11 = var9 + (class217.field3802 * var8 >> 12);
            } else if (arg5 <= class83.field1513) {
                var10 = arg5;
                var11 = arg3;
            } else {
                var11 = (class83.field1513 * var8 >> 12) + var9;
                var10 = class83.field1513;
            }
            if (class34.field522 > var11) {
                var11 = class34.field522;
                var10 = (class34.field522 - var9 << 12) / var8;
            } else if (var11 > class1.field6) {
                var11 = class1.field6;
                var10 = (class1.field6 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class217.field3802 > arg4) {
                var13 = (class217.field3802 * var8 >> 12) + var9;
                var12 = class217.field3802;
            } else if (class83.field1513 < arg4) {
                var12 = class83.field1513;
                var13 = (class83.field1513 * var8 >> 12) + var9;
            } else {
                var13 = arg1;
                var12 = arg4;
            }
            if (var13 < class34.field522) {
                var12 = (class34.field522 - var9 << 12) / var8;
                var13 = class34.field522;
            } else if (var13 > class1.field6) {
                var12 = (class1.field6 - var9 << 12) / var8;
                var13 = class1.field6;
            }
            class198.method1351((byte) -102, var10, var11, var13, arg2, var12);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIZ)Llc;")
    public static final class82 method1183(int arg0, int arg1, boolean arg2) {
        field3009++;
        if (arg2) {
            return null;
        }
        for (class82 var3 = (class82) class125.field2209.method110(64); var3 != null; var3 = (class82) class125.field2209.method117((byte) 45)) {
            if (var3.field1487 && var3.method570(arg1, arg0, 61)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILjd;B)V")
    public static final void method1184(int arg0, class85 arg1, byte arg2) {
        class208.field3627++;
        int var3 = -126 % ((-arg2 - 58) / 48);
        field3013++;
        class207.field3618.method483(-24260, 99);
        class207.field3618.method1699(arg0, -22728);
        class207.field3618.method1674((byte) 101, arg1.method624(false));
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1185(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class3.field29 * arg0 + class171.field2962 * arg3 >> 16;
        int var6 = class3.field29 * arg3 - class171.field2962 * arg0 >> 16;
        int var7 = class214.field3752 * var6 + class190.field3268 * arg1 >> 16;
        int var8 = class214.field3752 * arg1 - class190.field3268 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class214.field3752 * var6 + class190.field3268 * arg2 >> 16;
        int var12 = class214.field3752 * arg2 - class190.field3268 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class148.field2511 && var13 < class148.field2511) {
            return false;
        } else if (var9 > class51.field896 && var13 > class51.field896) {
            return false;
        } else if (var10 < class194.field3317 && var14 < class194.field3317) {
            return false;
        } else {
            return var10 <= class240.field4137 || var14 <= class240.field4137;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lge;Lge;Z)V")
    public static final void method1186(class68 arg0, class68 arg1, boolean arg2) {
        class11.field169 = arg0;
        field3010++;
        class137.field2388 = arg1;
        if (arg2) {
            field3008 = 120;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)V")
    public static final void method1187(byte arg0, int arg1) {
        class268.field4776 = 50;
        field3004++;
        class61.field1115 = arg1;
        if (arg0 < 14) {
            field3012 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "([B)V")
    public class175(byte[] arg0) {
        this.field3016 = arg0;
    }
}
