import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class102 extends class262 {

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "I")
    private int field1642 = 0;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    private int field1646 = 0;

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "I")
    private int field1647 = 20;

    @OriginalMember(owner = "client!ji", name = "ib", descriptor = "I")
    private int field1658 = 1365;

    @OriginalMember(owner = "client!ji", name = "ab", descriptor = "[S")
    public static short[] field1650 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ji", name = "db", descriptor = "I")
    public static int field1653 = 0;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "Lok;")
    private static class146 field1648 = class235.method1724(-12908, "Please remove ");

    @OriginalMember(owner = "client!ji", name = "cb", descriptor = "Lok;")
    public static class146 field1652 = class235.method1724(-12908, "settings=");

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field1643 = 50;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "Z")
    public static boolean field1641 = true;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "Lok;")
    public static class146 field1649 = field1648;

    @OriginalMember(owner = "client!ji", name = "eb", descriptor = "Lok;")
    public static class146 field1654 = field1648;

    @OriginalMember(owner = "client!ji", name = "hb", descriptor = "Lok;")
    public static class146 field1657 = class235.method1724(-12908, "<col=ff0000>");

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!ji", name = "fb", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!ji", name = "gb", descriptor = "I")
    public static int field1656;

    @OriginalMember(owner = "client!ji", name = "jb", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ji", name = "kb", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Ltd;")
    public static class234 field1639;

    @OriginalMember(owner = "client!ji", name = "lb", descriptor = "Lr;")
    public static class264 field1661;

    @OriginalMember(owner = "client!ji", name = "bb", descriptor = "[Lhj;")
    public static class28[] field1651;

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "[[Z")
    public static boolean[][] field1645;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)I", line = 9)
    public static final int method696(int arg0) {
        int var1 = 56 % ((arg0 - 24) / 47);
        field1644++;
        return ((class236.field3936 == 0 ? 0 : 1) << 22) + ((class119.field1927 ? 1 : 0) << 19) + ((field1641 ? 1 : 0) << 13) + ((class160.field2704 ? 1 : 0) << 9) + ((class300.field5078 ? 1 : 0) << 8) + ((class195.field3252 ? 1 : 0) << 7) + ((class76.field1230 ? 1 : 0) << 5) + ((class312.field5315 ? 1 : 0) << 4) + ((class70.field1147 ? 1 : 0) << 3) + (class273.field4684 & 0x7) + ((class27.field478 & 0x3 << 11) - (-((class117.field1888 ? 1 : 0) << 15) - ((class322.field5501 ? 1 : 0) << 16) + (-((class100.field1621 == 0 ? 0 : 1) << 20) + -((class27.field479 == 0 ? 0 : 1) << 21) - (class284.method2049() << 23)))) - (-((class319.field5448 ? 1 : 0) << 6) - ((class281.field4822 ? 1 : 0) << 10));
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 19)
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lwe;BLml;I)V", line = 23)
    public static final void method697(class47 arg0, byte arg1, class129 arg2, int arg3) {
        field1659++;
        class80 var4 = new class80();
        var4.field1284 = arg0.method368(42);
        var4.field1274 = arg0.method373((byte) 36);
        var4.field1290 = new class256[var4.field1284];
        var4.field1289 = new int[var4.field1284];
        var4.field1281 = new byte[var4.field1284][][];
        var4.field1282 = new int[var4.field1284];
        var4.field1275 = new class256[var4.field1284];
        var4.field1287 = new int[var4.field1284];
        int var5 = 0;
        if (arg1 != 69) {
            return;
        }
        while (var4.field1284 > var5) {
            try {
                int var6 = arg0.method368(-93);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method337(-1).method1128(false));
                    String var8 = new String(arg0.method337(-1).method1128(false));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method373((byte) 36);
                    }
                    var4.field1282[var5] = var6;
                    var4.field1287[var5] = var9;
                    var4.field1290[var5] = arg2.method912((byte) 68, var8, class214.method1595(var7, -31652));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method337(arg1 - 70).method1128(false));
                    String var11 = new String(arg0.method337(-1).method1128(false));
                    int var12 = arg0.method368(-94);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method337(-1).method1128(false));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method373((byte) 36);
                            var15[var16] = new byte[var17];
                            arg0.method363(true, var15[var16], 0, var17);
                        }
                    }
                    var4.field1282[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class214.method1595(var13[var19], -31652);
                    }
                    var4.field1275[var5] = arg2.method916(var18, var11, class214.method1595(var10, -31652), 16);
                    var4.field1281[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field1289[var5] = -1;
            } catch (SecurityException var26) {
                var4.field1289[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field1289[var5] = -3;
            } catch (Exception var28) {
                var4.field1289[var5] = -4;
            } catch (Throwable var29) {
                var4.field1289[var5] = -5;
            }
            var5++;
        }
        class182.field3054.method1258(0, var4);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLok;)V", line = 136)
    public static final void method698(byte arg0, class146 arg1) {
        if (arg0 <= 59) {
            return;
        }
        field1655++;
        if (class258.field4283 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg1.method1123(-13726);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class258.field4283.length && class258.field4283[var2].field2883 != var3) {
            var2++;
        }
        if (var2 < class258.field4283.length && class258.field4283[var2] != null) {
            class26.field456++;
            class47.field820.method1656(169, 16);
            class47.field820.method359(class258.field4283[var2].field2883, 128);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IB)[I", line = 185)
    public final int[] method38(int arg0, byte arg1) {
        field1660++;
        if (arg1 > -85) {
            return (int[]) null;
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 101);
        if (this.field4350.field3333) {
            for (int var4 = 0; var4 < class98.field1598; var4++) {
                int var5 = (class210.field3485[var4] << 12) / this.field1658 + this.field1646;
                int var6 = (class312.field5326[arg0] << 12) / this.field1658 + this.field1642;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; var11 + var13 < 16384 && this.field1647 > var12; var13 = var8 * var8 >> 12) {
                    var12++;
                    var8 = (var7 * var8 >> 12) * 2 + var10;
                    var7 = var9 + var11 - var13;
                    var11 = var7 * var7 >> 12;
                }
                var3[var4] = this.field1647 - 1 > var12 ? (var12 << 12) / this.field1647 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILth;)V", line = 241)
    public static final void method699(int arg0, class82 arg1) {
        class287.field4924 = arg1;
        if (arg0 == 1) {
            field1640++;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lwe;II)V", line = 264)
    public final void method40(class47 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field1658 = arg0.method379(-2);
        } else if (arg2 == 1) {
            this.field1647 = arg0.method379(-2);
        } else if (arg2 == 2) {
            this.field1646 = arg0.method379(-2);
        } else if (arg2 == 3) {
            this.field1642 = arg0.method379(-2);
        }
        if (arg1 != 2048) {
            field1651 = (class28[]) null;
        }
        field1638++;
    }

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V", line = 315)
    public static final void method700(int arg0) {
        class33.field635 = null;
        field1656++;
        class96.field1553 = null;
        class303.field5206 = null;
        int var1 = 73 / ((arg0 + 47) / 32);
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)V", line = 335)
    public static void method701(byte arg0) {
        if (arg0 <= 84) {
            method699(-9, (class82) null);
        }
        field1650 = null;
        field1648 = null;
        field1649 = null;
        field1654 = null;
        field1639 = null;
        field1661 = null;
        field1657 = null;
        field1652 = null;
        field1645 = (boolean[][]) null;
        field1651 = null;
    }
}
