import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class194 extends class77 {

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "[I")
    private int[] field3624 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public int field3634 = -1;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "Z")
    public boolean field3628 = false;

    @OriginalMember(owner = "client!ri", name = "K", descriptor = "Z")
    public static volatile boolean field3617 = true;

    @OriginalMember(owner = "client!ri", name = "D", descriptor = "I")
    public static int field3610 = 0;

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "Ldc;")
    public static class37 field3632 = class185.method1233((byte) 86, "details)3dat");

    @OriginalMember(owner = "client!ri", name = "F", descriptor = "Ldc;")
    public static class37 field3612 = class185.method1233((byte) 86, "::gc");

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "Ldc;")
    public static class37 field3625 = class185.method1233((byte) 86, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "Ldc;")
    private static class37 field3636 = class185.method1233((byte) 86, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "Ldc;")
    public static class37 field3629 = class185.method1233((byte) 86, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "Ldc;")
    public static class37 field3627 = field3636;

    @OriginalMember(owner = "client!ri", name = "G", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ri", name = "H", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ri", name = "I", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ri", name = "J", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ri", name = "L", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!ri", name = "E", descriptor = "[I")
    private int[] field3611;

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "[S")
    private short[] field3619;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "[S")
    private short[] field3623;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "[S")
    private short[] field3630;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "[S")
    private short[] field3633;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "[[[Lbf;")
    public static class18[][][] field3620;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(I)Llg;")
    public final class126 method1287(int arg0) {
        field3635++;
        int var2 = 0;
        class126[] var3 = new class126[5];
        if (arg0 >= -3) {
            field3610 = 20;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3624[var4] != -1) {
                var3[var2++] = class126.method883(class77.field1355, this.field3624[var4], 0);
            }
        }
        class126 var5 = new class126(var3, var2);
        if (this.field3633 != null) {
            for (int var6 = 0; var6 < this.field3633.length; var6++) {
                var5.method888(this.field3633[var6], this.field3619[var6]);
            }
        }
        if (this.field3623 != null) {
            for (int var7 = 0; var7 < this.field3623.length; var7++) {
                var5.method866(this.field3623[var7], this.field3630[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILce;)V")
    public final void method1288(int arg0, class28 arg1) {
        while (true) {
            int var3 = arg1.method215(-1797813752);
            if (var3 == 0) {
                field3615++;
                int var4 = -19 % ((36 - arg0) / 57);
                return;
            }
            this.method1293(var3, -27583, arg1);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(Z)Z")
    public final boolean method1289(boolean arg0) {
        field3631++;
        if (this.field3611 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field3611.length; var3++) {
            if (!class77.field1355.method1563(-14250, this.field3611[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(B)Z")
    public static final boolean method1290(byte arg0) {
        field3618++;
        long var1 = class214.method1416(22624);
        int var3 = (int) (var1 - class52.field1045);
        if (var3 > 200) {
            var3 = 200;
        }
        class136.field2587 += var3;
        class52.field1045 = var1;
        if (arg0 > -82) {
            return true;
        } else if (class229.field4213 == 0 && class11.field147 == 0 && class147.field2798 == 0 && class28.field506 == 0) {
            return true;
        } else if (class166.field3172 == null) {
            return false;
        } else {
            try {
                if (class136.field2587 > 30000) {
                    throw new IOException();
                }
                while (class11.field147 < 20 && class28.field506 > 0) {
                    class231 var4 = (class231) class20.field331.method1042((byte) -25);
                    class28 var5 = new class28(4);
                    var5.method214((byte) 127, 1);
                    var5.method211(-483923896, (int) var4.field1066);
                    class166.field3172.method558(30000, 4, 0, var5.field502);
                    class99.field1722.method1044(var4, (byte) -14, var4.field1066);
                    class11.field147++;
                    class28.field506--;
                }
                while (class229.field4213 < 20 && class147.field2798 > 0) {
                    class231 var6 = (class231) class245.field4483.method467(128);
                    class28 var7 = new class28(4);
                    var7.method214((byte) 108, 0);
                    var7.method211(-483923896, (int) var6.field1066);
                    class166.field3172.method558(30000, 4, 0, var7.field502);
                    var6.method533(false);
                    class204.field3780.method1044(var6, (byte) -14, var6.field1066);
                    class147.field2798--;
                    class229.field4213++;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class166.field3172.method554(-46);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class136.field2587 = 0;
                    byte var10 = 0;
                    if (class5.field46 == null) {
                        var10 = 8;
                    } else if (class115.field2061 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class61.field1122.field502.length - class5.field46.field4229;
                        int var12 = 512 - class115.field2061;
                        if (var11 - class61.field1122.field526 < var12) {
                            var12 = var11 - class61.field1122.field526;
                        }
                        if (var12 > var9) {
                            var12 = var9;
                        }
                        class166.field3172.method555(var12, 126, class61.field1122.field526, class61.field1122.field502);
                        if (class215.field4010 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class61.field1122.field502[class61.field1122.field526 + var13] = (byte) class237.method1535(class61.field1122.field502[class61.field1122.field526 + var13], class215.field4010);
                            }
                        }
                        class61.field1122.field526 += var12;
                        class115.field2061 += var12;
                        if (class61.field1122.field526 == var11) {
                            if (class5.field46.field1066 == 16711935L) {
                                class203.field3761 = class61.field1122;
                                for (int var14 = 0; var14 < 256; var14++) {
                                    class44 var15 = class119.field2127[var14];
                                    if (var15 != null) {
                                        class203.field3761.field526 = var14 * 8 + 5;
                                        int var16 = class203.field3761.method226(-46);
                                        int var17 = class203.field3761.method226(-49);
                                        var15.method382(var17, 96, var16);
                                    }
                                }
                            } else {
                                class123.field2195.reset();
                                class123.field2195.update(class61.field1122.field502, 0, var11);
                                int var18 = (int) class123.field2195.getValue();
                                if (class5.field46.field4230 != var18) {
                                    try {
                                        class166.field3172.method557(false);
                                    } catch (Exception var30) {
                                    }
                                    class166.field3172 = null;
                                    class215.field4010 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class166.field3165++;
                                    return false;
                                }
                                class117.field2100 = 0;
                                class166.field3165 = 0;
                                class5.field46.field4231.method386((class5.field46.field1066 & 0xFF0000L) == 16711680L, (int) (class5.field46.field1066 & 0xFFFFL), true, class31.field631, class61.field1122.field502);
                            }
                            class5.field46.method433(0);
                            if (class31.field631) {
                                class11.field147--;
                            } else {
                                class229.field4213--;
                            }
                            class5.field46 = null;
                            class115.field2061 = 0;
                            class61.field1122 = null;
                        } else {
                            if (class115.field2061 != 512) {
                                break;
                            }
                            class115.field2061 = 0;
                        }
                    } else {
                        int var19 = var10 - class164.field3114.field526;
                        if (var19 > var9) {
                            var19 = var9;
                        }
                        class166.field3172.method555(var19, 125, class164.field3114.field526, class164.field3114.field502);
                        if (class215.field4010 != 0) {
                            for (int var20 = 0; var20 < var19; var20++) {
                                class164.field3114.field502[class164.field3114.field526 + var20] = (byte) class237.method1535(class164.field3114.field502[class164.field3114.field526 + var20], class215.field4010);
                            }
                        }
                        class164.field3114.field526 += var19;
                        if (var10 > class164.field3114.field526) {
                            break;
                        }
                        if (class5.field46 == null) {
                            class164.field3114.field526 = 0;
                            int var21 = class164.field3114.method215(-1797813752);
                            int var22 = class164.field3114.method230((byte) -105);
                            int var23 = class164.field3114.method215(-1797813752);
                            long var24 = (long) ((var21 << 16) + var22);
                            int var26 = class164.field3114.method226(-2);
                            class231 var27 = (class231) class99.field1722.method1047((byte) -120, var24);
                            class31.field631 = true;
                            if (var27 == null) {
                                var27 = (class231) class204.field3780.method1047((byte) 116, var24);
                                class31.field631 = false;
                            }
                            if (var27 == null) {
                                throw new IOException();
                            }
                            class5.field46 = var27;
                            int var28 = var23 == 0 ? 5 : 9;
                            class61.field1122 = new class28(var28 + class5.field46.field4229 + var26);
                            class61.field1122.method214((byte) 118, var23);
                            class61.field1122.method183(var26, -1137894376);
                            class115.field2061 = 8;
                            class164.field3114.field526 = 0;
                        } else if (class115.field2061 == 0) {
                            if (class164.field3114.field502[0] == -1) {
                                class115.field2061 = 1;
                                class164.field3114.field526 = 0;
                            } else {
                                class5.field46 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class166.field3172.method557(false);
                } catch (Exception var29) {
                }
                class166.field3172 = null;
                class117.field2100++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(I)Llg;")
    public final class126 method1291(int arg0) {
        field3626++;
        if (this.field3611 == null) {
            return null;
        }
        class126[] var2 = new class126[this.field3611.length];
        for (int var3 = 0; var3 < this.field3611.length; var3++) {
            var2[var3] = class126.method883(class77.field1355, this.field3611[var3], 0);
        }
        if (arg0 != -6) {
            this.method1293(-126, 1, null);
        }
        class126 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class126(var2, var2.length);
        }
        if (this.field3633 != null) {
            for (int var5 = 0; var5 < this.field3633.length; var5++) {
                var4.method888(this.field3633[var5], this.field3619[var5]);
            }
        }
        if (this.field3623 != null) {
            for (int var6 = 0; var6 < this.field3623.length; var6++) {
                var4.method866(this.field3623[var6], this.field3630[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field3612 = null;
        field3636 = null;
        field3632 = null;
        field3629 = null;
        field3627 = null;
        field3625 = null;
        if (arg0 == -1) {
            field3620 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IILce;)V")
    private final void method1293(int arg0, int arg1, class28 arg2) {
        if (arg1 != -27583) {
            this.method1296((byte) 26);
        }
        field3614++;
        if (arg0 == 1) {
            this.field3634 = arg2.method215(-1797813752);
        } else if (arg0 == 2) {
            int var8 = arg2.method215(arg1 ^ 0x6B281E49);
            this.field3611 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3611[var9] = arg2.method230((byte) -101);
            }
        } else if (arg0 == 3) {
            this.field3628 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method215(-1797813752);
            this.field3619 = new short[var6];
            this.field3633 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3633[var7] = (short) arg2.method230((byte) -99);
                this.field3619[var7] = (short) arg2.method230((byte) -112);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method215(-1797813752);
            this.field3630 = new short[var4];
            this.field3623 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3623[var5] = (short) arg2.method230((byte) -115);
                this.field3630[var5] = (short) arg2.method230((byte) -103);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field3624[arg0 - 60] = arg2.method230((byte) -119);
            return;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)Loh;")
    public static final class160 method1294(int arg0, int arg1) {
        field3622++;
        class160 var2 = (class160) class217.field4041.method87(arg1 - 1105, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (arg1 != 1221) {
            field3610 = 12;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class100.field1737.method1547(arg0, 0, 0);
        } else {
            var3 = class245.field4488.method1547(arg0 & 0x7FFF, arg1 ^ 0x4C5, 0);
        }
        class160 var4 = new class160();
        if (var3 != null) {
            var4.method1078(3342, new class28(var3));
        }
        class217.field4041.method92((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)Ldc;")
    public static final class37 method1295(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field3621++;
            return class220.field4088[arg0].method334(-61) <= 0 ? class231.field4234[arg0] : class80.method548(new class37[] { class231.field4234[arg0], class30.field570, class220.field4088[arg0] }, -110);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)Z")
    public final boolean method1296(byte arg0) {
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -8) {
            this.method1293(55, -76, null);
        }
        while (var3 < 5) {
            if (this.field3624[var3] != -1 && !class77.field1355.method1563(-14250, this.field3624[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        field3613++;
        return var2;
    }
}
