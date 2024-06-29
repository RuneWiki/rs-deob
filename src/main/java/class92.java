import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class92 {

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "Lvg;")
    private class22 field1155 = new class22();

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "Lvg;")
    private class22 field1158 = new class22();

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "Lvg;")
    private class22 field1164 = new class22();

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Lvg;")
    private class22 field1165 = new class22();

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Lpd;")
    private class96 field1167 = new class96(4);

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "B")
    private byte field1172 = 0;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public volatile int field1170 = 0;

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public volatile int field1173 = 0;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Lpd;")
    private class96 field1171 = new class96(8);

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field1156 = 0;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1154 = "flash3:";

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "Lsb;")
    public static class110 field1139 = new class110(8);

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "[I")
    public static int[] field1160 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "[I")
    public static int[] field1163 = new int[2];

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1162 = " ";

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static volatile int field1161 = -1;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    private int field1166;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "J")
    private long field1168;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "Lvh;")
    private class136 field1174;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "Ltd;")
    private class175 field1169;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Lra;")
    public static class38 field1159;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILeh;IZII)V")
    public static final void method500(int arg0, int arg1, class137 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class112.field1598 = arg6;
        class190.field3070 = 1;
        if (arg1 != 24217) {
            return;
        }
        class160.field2558 = arg2;
        class4.field55 = arg0;
        class278.field4410 = arg5;
        class215.field3446 = arg3;
        field1146++;
        class216.field3473 = arg4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZBBII)Lvh;")
    public final class136 method501(boolean arg0, byte arg1, byte arg2, int arg3, int arg4) {
        field1148++;
        long var6 = (long) ((arg3 << 16) + arg4);
        class136 var8 = new class136();
        var8.field2147 = arg1;
        if (arg2 != 41) {
            this.method505(true);
        }
        var8.field3604 = arg0;
        var8.field1087 = var6;
        if (arg0) {
            if (this.method512(0) >= 20) {
                throw new RuntimeException();
            }
            this.field1155.method125(var8, -1);
        } else if (this.method502(-124) < 20) {
            this.field1164.method125(var8, -1);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I")
    private final int method502(int arg0) {
        field1147++;
        int var2 = -58 / ((arg0 + 88) / 34);
        return this.field1164.method129(0) + this.field1165.method129(0);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Z")
    public final boolean method503(int arg0) {
        field1149++;
        if (arg0 != 3) {
            this.method506(-83);
        }
        return this.method512(0) >= 20;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)Z")
    public final boolean method504(byte arg0) {
        field1153++;
        if (this.field1169 != null) {
            long var2 = class249.method1723((byte) 112);
            int var4 = (int) (var2 - this.field1168);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1166 += var4;
            this.field1168 = var2;
            if (this.field1166 > 30000) {
                try {
                    this.field1169.method1210(-1);
                } catch (Exception var27) {
                }
                this.field1169 = null;
            }
        }
        if (this.field1169 == null) {
            return this.method512(arg0 + 92) == 0 && this.method502(2) == 0;
        }
        try {
            this.field1169.method1218((byte) 100);
            for (class136 var5 = (class136) this.field1155.method124(0); var5 != null; var5 = (class136) this.field1155.method122(109)) {
                this.field1167.field1228 = 0;
                this.field1167.method580((byte) 115, 1);
                this.field1167.method582((int) var5.field1087, (byte) 127);
                this.field1169.method1211(4, true, 0, this.field1167.field1218);
                this.field1158.method125(var5, arg0 ^ 0x5B);
            }
            for (class136 var6 = (class136) this.field1164.method124(0); var6 != null; var6 = (class136) this.field1164.method122(73)) {
                this.field1167.field1228 = 0;
                this.field1167.method580((byte) 93, 0);
                this.field1167.method582((int) var6.field1087, (byte) 121);
                this.field1169.method1211(4, true, 0, this.field1167.field1218);
                this.field1165.method125(var6, -1);
            }
            if (arg0 != -92) {
                field1139 = null;
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1169.method1217(arg0 - 18);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1166 = 0;
                byte var9 = 0;
                if (this.field1174 == null) {
                    var9 = 8;
                } else if (this.field1174.field2145 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field1171.field1228;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field1169.method1209(97, var10, this.field1171.field1218, this.field1171.field1228);
                    if (this.field1172 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field1171.field1218[this.field1171.field1228 + var11] = (byte) class288.method1939(this.field1171.field1218[this.field1171.field1228 + var11], this.field1172);
                        }
                    }
                    this.field1171.field1228 += var10;
                    if (var9 <= this.field1171.field1228) {
                        if (this.field1174 == null) {
                            this.field1171.field1228 = 0;
                            int var12 = this.field1171.method584(arg0 + 347);
                            int var13 = this.field1171.method549(255);
                            int var14 = this.field1171.method584(255);
                            int var15 = this.field1171.method597(-1197332568);
                            int var16 = var14 & 0x7F;
                            Object var17 = null;
                            boolean var18 = (var14 & 0x80) != 0;
                            long var19 = (long) ((var12 << 16) + var13);
                            class136 var21;
                            if (var18) {
                                for (var21 = (class136) this.field1165.method124(0); var21 != null && var21.field1087 != var19; var21 = (class136) this.field1165.method122(76)) {
                                }
                            } else {
                                for (var21 = (class136) this.field1158.method124(arg0 ^ 0xFFFFFFA4); var21 != null && var21.field1087 != var19; var21 = (class136) this.field1158.method122(arg0 ^ 0xFFFFFFDF)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field1174 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field1174.field2144 = new class96(this.field1174.field2147 + var15 + var22);
                            this.field1174.field2144.method580((byte) 81, var16);
                            this.field1174.field2144.method574(var15, -1);
                            this.field1171.field1228 = 0;
                            this.field1174.field2145 = 8;
                        } else if (this.field1174.field2145 != 0) {
                            throw new IOException();
                        } else if (this.field1171.field1218[0] == -1) {
                            this.field1171.field1228 = 0;
                            this.field1174.field2145 = 1;
                        } else {
                            this.field1174 = null;
                        }
                    }
                } else {
                    int var23 = this.field1174.field2144.field1218.length - this.field1174.field2147;
                    int var24 = 512 - this.field1174.field2145;
                    if (var23 - this.field1174.field2144.field1228 < var24) {
                        var24 = var23 - this.field1174.field2144.field1228;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field1169.method1209(65, var24, this.field1174.field2144.field1218, this.field1174.field2144.field1228);
                    if (this.field1172 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field1174.field2144.field1218[this.field1174.field2144.field1228 + var25] = (byte) class288.method1939(this.field1174.field2144.field1218[this.field1174.field2144.field1228 + var25], this.field1172);
                        }
                    }
                    this.field1174.field2144.field1228 += var24;
                    this.field1174.field2145 += var24;
                    if (this.field1174.field2144.field1228 == var23) {
                        this.field1174.method480(80);
                        this.field1174.field3610 = false;
                        this.field1174 = null;
                    } else if (this.field1174.field2145 == 512) {
                        this.field1174.field2145 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1169.method1210(arg0 ^ 0x5B);
            } catch (Exception var26) {
            }
            this.field1173 = -2;
            this.field1170++;
            this.field1169 = null;
            return this.method512(0) == 0 && this.method502(arg0 - 36) == 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public final void method505(boolean arg0) {
        field1150++;
        if (this.field1169 == null) {
            return;
        }
        try {
            this.field1167.field1228 = 0;
            this.field1167.method580((byte) 77, 7);
            this.field1167.method582(0, (byte) 92);
            this.field1169.method1211(4, arg0, 0, this.field1167.field1218);
        } catch (IOException var3) {
            try {
                this.field1169.method1210(-1);
            } catch (Exception var2) {
            }
            this.field1170++;
            this.field1169 = null;
            this.field1173 = -2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public final void method506(int arg0) {
        if (this.field1169 != null) {
            this.field1169.method1210(-1);
        }
        field1141++;
        int var2 = -53 % ((arg0 + 15) / 48);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public final void method507(int arg0) {
        try {
            this.field1169.method1210(-1);
        } catch (Exception var2) {
        }
        if (arg0 != 1) {
            this.method509(116);
        }
        this.field1170++;
        field1151++;
        this.field1173 = -1;
        this.field1169 = null;
        this.field1172 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    private final void method508(int arg0) {
        field1138++;
        if (this.field1169 == null) {
            return;
        }
        try {
            this.field1167.field1228 = 0;
            this.field1167.method580((byte) 96, 6);
            this.field1167.method582(3, (byte) 84);
            this.field1169.method1211(4, true, arg0, this.field1167.field1218);
        } catch (IOException var3) {
            try {
                this.field1169.method1210(arg0 - 1);
            } catch (Exception var2) {
            }
            this.field1173 = -2;
            this.field1169 = null;
            this.field1170++;
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public final void method509(int arg0) {
        field1143++;
        if (this.field1169 != null) {
            this.field1169.method1215(280101936);
        }
        if (arg0 != 0) {
            field1159 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)Z")
    public final boolean method510(byte arg0) {
        field1152++;
        if (arg0 != -99) {
            this.field1169 = null;
        }
        return this.method502(arg0 ^ 0x1F) >= 20;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public static final void method511(byte arg0) {
        if (class220.field3524 < 0) {
            class166.field2666 = -1;
            class236.field3910 = -1;
            class220.field3524 = 0;
        }
        field1157++;
        if (class220.field3524 > class44.field562) {
            class166.field2666 = -1;
            class220.field3524 = class44.field562;
            class236.field3910 = -1;
        }
        if (arg0 < 17) {
            method514(102);
        }
        if (class224.field3606 < 0) {
            class236.field3910 = -1;
            class166.field2666 = -1;
            class224.field3606 = 0;
        }
        if (class224.field3606 > class7.field88) {
            class166.field2666 = -1;
            class224.field3606 = class7.field88;
            class236.field3910 = -1;
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
    public final int method512(int arg0) {
        if (arg0 == 0) {
            field1145++;
            return this.field1155.method129(0) + this.field1158.method129(arg0);
        } else {
            return 55;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZILtd;)V")
    public final void method513(boolean arg0, int arg1, class175 arg2) {
        field1140++;
        if (arg1 > -16) {
            this.field1158 = null;
        }
        if (this.field1169 != null) {
            try {
                this.field1169.method1210(-1);
            } catch (Exception var8) {
            }
            this.field1169 = null;
        }
        this.field1169 = arg2;
        this.method508(0);
        this.method515((byte) -71, arg0);
        this.field1171.field1228 = 0;
        this.field1174 = null;
        while (true) {
            class136 var4 = (class136) this.field1158.method126((byte) 107);
            if (var4 == null) {
                while (true) {
                    class136 var5 = (class136) this.field1165.method126((byte) 120);
                    if (var5 == null) {
                        if (this.field1172 != 0) {
                            try {
                                this.field1167.field1228 = 0;
                                this.field1167.method580((byte) 109, 4);
                                this.field1167.method580((byte) 95, this.field1172);
                                this.field1167.method572(true, 0);
                                this.field1169.method1211(4, true, 0, this.field1167.field1218);
                            } catch (IOException var7) {
                                try {
                                    this.field1169.method1210(-1);
                                } catch (Exception var6) {
                                }
                                this.field1169 = null;
                                this.field1170++;
                                this.field1173 = -2;
                            }
                        }
                        this.field1166 = 0;
                        this.field1168 = class249.method1723((byte) 121);
                        return;
                    }
                    this.field1164.method125(var5, -1);
                }
            }
            this.field1155.method125(var4, -1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V")
    public static final void method514(int arg0) {
        field1144++;
        class234.field3876 = arg0;
        class126.field2027 = 0;
        class225.method1593(2);
        class230.method1641(2);
        class183.method1272((byte) 83);
        for (int var1 = 0; var1 < class234.field3876; var1++) {
            int var3 = class265.field4274[var1];
            if (class73.field924 != class265.field4273[var3].field3797) {
                if (class265.field4273[var3].field3166.method1317(0)) {
                    class171.method1169((byte) -118, class265.field4273[var3]);
                }
                class265.field4273[var3].method1396((byte) 60, (class188) null);
                class265.field4273[var3] = null;
            }
        }
        if (class219.field3508 != class96.field1283.field1228) {
            throw new RuntimeException("gnp1 pos:" + class96.field1283.field1228 + " psize:" + class219.field3508);
        }
        for (int var2 = 0; var2 < class134.field2122; var2++) {
            if (class265.field4273[class11.field121[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class134.field2122);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BZ)V")
    public final void method515(byte arg0, boolean arg1) {
        field1142++;
        if (this.field1169 == null || arg0 != -71) {
            return;
        }
        try {
            this.field1167.field1228 = 0;
            this.field1167.method580((byte) 72, arg1 ? 2 : 3);
            this.field1167.method582(0, (byte) 80);
            this.field1169.method1211(4, true, 0, this.field1167.field1218);
        } catch (IOException var4) {
            try {
                this.field1169.method1210(-1);
            } catch (Exception var3) {
            }
            this.field1173 = -2;
            this.field1170++;
            this.field1169 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "(I)V")
    public static void method516(int arg0) {
        if (arg0 > -55) {
            return;
        }
        field1154 = null;
        field1160 = null;
        field1139 = null;
        field1162 = null;
        field1163 = null;
        field1159 = null;
    }
}
