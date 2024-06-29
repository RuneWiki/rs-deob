import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class116 extends class112 {

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    private int field1633 = 0;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "I")
    private int field1638 = 16;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "I")
    private int field1640 = 0;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    private int field1639 = 2000;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    private int field1641 = 4096;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "Lwm;")
    private static class152 field1630 = class157.method1048("purple:", 119);

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "Lwm;")
    public static class152 field1628 = field1630;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "Lwm;")
    public static class152 field1634 = field1630;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lwm;")
    public static class152 field1643 = class157.method1048("<br>(X", 108);

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "Lwm;")
    public static class152 field1642 = class157.method1048("OK", 124);

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "Lwm;")
    public static class152 field1644 = class157.method1048("Spielwelt erstellt)3", 120);

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "Lwm;")
    public static class152 field1645 = class157.method1048("Choisir une option", 104);

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "Lwm;")
    public static class152 field1646 = class157.method1048("loc", 94);

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "Lwm;")
    public static class152 field1647 = class157.method1048("Versteckt", 118);

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1635 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    public static int field1631;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "[Ll;")
    public static class295[] field1629;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 12)
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method764(boolean arg0) {
        field1631++;
        if (!class217.field3516 || class157.field2489) {
            return;
        }
        class34[][][] var1 = class287.field4857;
        for (int var2 = 0; var2 < var1.length; var2++) {
            class34[][] var3 = var1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class34 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field558 != null && var6.field558.field1684 instanceof class319) {
                            class319 var7 = (class319) var6.field558.field1684;
                            if ((Long.MIN_VALUE & var6.field558.field1685) == 0L) {
                                var7.method2232(false, true, true, true, false, true, true);
                            } else {
                                var7.method2232(true, true, true, true, true, true, true);
                            }
                        }
                        if (var6.field554 != null) {
                            if (var6.field554.field4707 instanceof class319) {
                                class319 var8 = (class319) var6.field554.field4707;
                                if ((Long.MIN_VALUE & var6.field554.field4717) == 0L) {
                                    var8.method2232(false, true, true, true, false, true, true);
                                } else {
                                    var8.method2232(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field554.field4700 instanceof class319) {
                                class319 var9 = (class319) var6.field554.field4700;
                                if ((var6.field554.field4717 & Long.MIN_VALUE) == 0L) {
                                    var9.method2232(false, true, true, true, false, true, true);
                                } else {
                                    var9.method2232(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        if (var6.field573 != null) {
                            if (var6.field573.field5026 instanceof class319) {
                                class319 var10 = (class319) var6.field573.field5026;
                                if ((Long.MIN_VALUE & var6.field573.field5019) == 0L) {
                                    var10.method2232(false, true, true, true, false, true, true);
                                } else {
                                    var10.method2232(true, true, true, true, true, true, true);
                                }
                            }
                            if (var6.field573.field5028 instanceof class319) {
                                class319 var11 = (class319) var6.field573.field5028;
                                if ((Long.MIN_VALUE & var6.field573.field5019) == 0L) {
                                    var11.method2232(false, true, true, true, false, true, true);
                                } else {
                                    var11.method2232(true, true, true, true, true, true, true);
                                }
                            }
                        }
                        for (int var12 = 0; var12 < var6.field579; var12++) {
                            if (var6.field580[var12].field4144 instanceof class319) {
                                class319 var13 = (class319) var6.field580[var12].field4144;
                                if ((var6.field580[var12].field4156 & Long.MIN_VALUE) == 0L) {
                                    var13.method2232(false, true, true, true, false, true, true);
                                } else {
                                    var13.method2232(true, true, true, true, true, true, true);
                                }
                            }
                        }
                    }
                }
            }
        }
        class157.field2489 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILhi;)V", line = 165)
    public final void method52(int arg0, int arg1, class291 arg2) {
        field1637++;
        if (arg1 == 0) {
            this.field1633 = arg2.method2011(arg0 ^ 0xFFFF8611);
        } else if (arg1 == 1) {
            this.field1639 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field1638 = arg2.method2011(-67);
        } else if (arg1 == 3) {
            this.field1640 = arg2.method2021((byte) 74);
        } else if (arg1 == 4) {
            this.field1641 = arg2.method2021((byte) 74);
        }
        if (arg0 != 31164) {
            this.field1638 = -82;
        }
    }

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "(I)V", line = 229)
    public static void method765(int arg0) {
        field1635 = null;
        field1644 = null;
        if (arg0 != -12864) {
            field1647 = (class152) null;
        }
        field1643 = null;
        field1628 = null;
        field1629 = null;
        field1642 = null;
        field1630 = null;
        field1645 = null;
        field1647 = null;
        field1634 = null;
        field1646 = null;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V", line = 259)
    public final void method673(int arg0) {
        field1636++;
        class243.method1667(14);
        if (arg0 != 8) {
            method765(-42);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILah;IZII)V", line = 291)
    public static final void method766(int arg0, class205 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class89.field1252 = 1;
        class193.field3072 = arg5;
        class45.field717 = 10000;
        field1632++;
        class275.field4720 = arg2;
        class65.field986 = arg1;
        if (arg0 == 0) {
            class312.field5357 = arg3;
            class325.field5667 = arg4;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)[I", line = 311)
    public final int[] method53(byte arg0, int arg1) {
        if (arg0 != -3) {
            this.field1633 = -8;
        }
        field1648++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 105);
        if (this.field1585.field4935) {
            int var4 = this.field1641 >> 1;
            int[][] var5 = this.field1585.method1953((byte) -66);
            Random var6 = new Random((long) this.field1633);
            for (int var7 = 0; var7 < this.field1639; var7++) {
                int var8 = this.field1641 <= 0 ? this.field1640 : this.field1640 - (var4 - class137.method870(var6, this.field1641, (byte) -112));
                int var9 = var8 >> 4 & 0xFF;
                int var10 = class137.method870(var6, class58.field889, (byte) -112);
                int var11 = class137.method870(var6, class268.field4526, (byte) -112);
                int var12 = (class268.field4522[var9] * this.field1638 >> 12) + var10;
                int var13 = (class203.field3286[var9] * this.field1638 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        var11 = var17;
                        int var18 = var12;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                        var10 = var12;
                        var12 = var19;
                    }
                    int var21 = var11;
                    int var22 = var13 - var11;
                    if (var22 < 0) {
                        var22 = -var22;
                    }
                    int var23 = 1024 - (class137.method870(var6, 4096, (byte) -112) >> 2);
                    int var24 = var13 <= var11 ? -1 : 1;
                    int var25 = var12 - var10;
                    int var26 = -var25 / 2;
                    int var27 = 2048 / var25;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var26 += var22;
                        int var29 = class251.field4304 & var28;
                        int var30 = class275.field4712 & var21;
                        int var31 = (var28 - var10) * var27 + var23 + 1024;
                        if (var26 > 0) {
                            var26 -= var25;
                            var21 += var24;
                        }
                        if (var16) {
                            var5[var30][var29] = var31;
                        } else {
                            var5[var29][var30] = var31;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
