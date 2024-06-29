import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class207 implements Runnable {

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Ltg;")
    private class345 field3134 = new class345();

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public int field3142 = 0;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Z")
    private boolean field3143 = false;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Ljava/lang/Thread;")
    private Thread field3141;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field3127 = 0;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "[Lrd;")
    public static class193[] field3139 = new class193[4];

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[S")
    public static short[] field3137 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!db", name = "r", descriptor = "[[Z")
    public static boolean[][] field3140 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "Lnk;")
    public static class16 field3130;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[[[B")
    public static byte[][][] field3132;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lj;I)V", line = 8)
    private final void method1444(class315 arg0, int arg1) {
        field3125++;
        class345 var3 = this.field3134;
        synchronized (this.field3134) {
            this.field3134.method2395(16218, arg0);
            this.field3142++;
            this.field3134.notifyAll();
        }
        if (arg1 != 2) {
            field3140 = (boolean[][]) ((boolean[][]) null);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLpj;[BI)Lj;", line = 29)
    public final class315 method1445(byte arg0, class205 arg1, byte[] arg2, int arg3) {
        field3135++;
        if (arg0 < 62) {
            return (class315) null;
        }
        class315 var5 = new class315();
        var5.field4086 = (long) arg3;
        var5.field4939 = 2;
        var5.field4938 = arg2;
        var5.field4942 = arg1;
        var5.field2688 = false;
        this.method1444(var5, 2);
        return var5;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lpj;II)Lj;", line = 48)
    public final class315 method1446(class205 arg0, int arg1, int arg2) {
        field3129++;
        class315 var4 = new class315();
        var4.field4939 = 1;
        class345 var5 = this.field3134;
        synchronized (this.field3134) {
            int var6 = 34 / ((arg1 - 48) / 51);
            class315 var7 = (class315) this.field3134.method2397((byte) 107);
            while (true) {
                if (var7 == null) {
                    break;
                }
                if ((long) arg2 == var7.field4086 && var7.field4942 == arg0 && var7.field4939 == 2) {
                    var4.field4938 = var7.field4938;
                    var4.field2683 = false;
                    return var4;
                }
                var7 = (class315) this.field3134.method2392((byte) -22);
            }
        }
        var4.field4938 = arg0.method1433(arg2, true);
        var4.field2688 = true;
        var4.field2683 = false;
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Lpj;II)Lj;", line = 83)
    public final class315 method1447(class205 arg0, int arg1, int arg2) {
        field3124++;
        class315 var4 = new class315();
        var4.field2688 = false;
        var4.field4086 = (long) arg1;
        var4.field4942 = arg0;
        var4.field4939 = 3;
        this.method1444(var4, 2);
        int var5 = 37 / ((62 - arg2) / 47);
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V", line = 104)
    public static final void method1448(int arg0, int arg1) {
        field3123++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class125.field1771[arg0];
        int var3 = class296.field4669[arg0];
        int var4 = class105.field1442[arg0];
        long var5 = class276.field4346[arg0];
        if (var4 >= 2000) {
            var4 -= 2000;
        }
        int var7 = (int) class276.field4346[arg0];
        if (var4 == 5) {
            class67 var8 = class105.field1443[var7];
            if (var8 != null) {
                class242.field3722 = class19.field223;
                class361.field5717 = class301.field4694;
                class222.field3362++;
                class7.field90 = 0;
                class20.field237 = 2;
                class328.field5282.method304(193, 19830);
                class328.field5282.method1006(85, var7);
                class328.field5282.method1010(-105, class276.field4349[82] ? 1 : 0);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var8.method412((byte) 102), class11.field113.field3786[0], 0, 0, var8.method412((byte) 119), 2);
            }
        }
        if (var4 == 18) {
            class242.field3722 = class19.field223;
            class6.field68++;
            class7.field90 = 0;
            class20.field237 = 2;
            class361.field5717 = class301.field4694;
            class328.field5282.method304(127, 19830);
            class328.field5282.method1006(107, class322.field4999 + var3);
            class328.field5282.method1006(57, class16.field160 + var2);
            class328.field5282.method1002(-250657904, var7);
            class328.field5282.method1014(class276.field4349[82] ? 1 : 0, -124);
            class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
        }
        if (var4 == 41) {
            class67 var9 = class105.field1443[var7];
            if (var9 != null) {
                class361.field5717 = class301.field4694;
                class20.field237 = 2;
                class242.field3722 = class19.field223;
                class347.field5507++;
                class7.field90 = 0;
                class328.field5282.method304(154, 19830);
                class328.field5282.method1002(-250657904, var7);
                class328.field5282.method1010(105, class276.field4349[82] ? 1 : 0);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var9.method412((byte) 104), class11.field113.field3786[0], 0, 0, var9.method412((byte) 108), 2);
            }
        }
        if (var4 == 12) {
            class298.field4678++;
            class328.field5282.method304(160, 19830);
            class328.field5282.method1006(-93, var3);
            class328.field5282.method1041(var2, -86);
            class328.field5282.method1002(-250657904, var7);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 46) {
            class67 var10 = class105.field1443[var7];
            if (var10 != null) {
                class349.field5525++;
                class361.field5717 = class301.field4694;
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class20.field237 = 2;
                class328.field5282.method304(187, 19830);
                class328.field5282.method1003(class52.field605, -2);
                class328.field5282.method1010(-109, class276.field4349[82] ? 1 : 0);
                class328.field5282.method1002(-250657904, var7);
                class328.field5282.method1052(class119.field1663, false);
                class328.field5282.method1003(class230.field3483, -2);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var10.method412((byte) 93), class11.field113.field3786[0], 0, 0, var10.method412((byte) 86), 2);
            }
        }
        if (var4 == 32) {
            class328.field5282.method304(135, 19830);
            class109.field1506++;
            class328.field5282.method1006(67, class196.field2978);
            class328.field5282.method1049(var3, (byte) -109);
            class328.field5282.method1052(var2, false);
            class328.field5282.method1041(class225.field3393, -114);
        }
        if (var4 == 51) {
            class24.field284++;
            class328.field5282.method304(109, 19830);
            class328.field5282.method1003(var3, -2);
            class328.field5282.method1052(var2, false);
            class328.field5282.method1006(-119, var7);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 1001) {
            class323 var11 = class45.method277(-12866, var2);
            if (var11 == null || var11.field5153[var3] < 100000) {
                class328.field5282.method304(114, 19830);
                class210.field3166++;
                class328.field5282.method1002(-250657904, var7);
            } else {
                class306.method2157(var11.field5153[var3] + " x " + class190.method1302(var7, (byte) -112).field4868, false, 0, "");
            }
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 9) {
            class67 var12 = class105.field1443[var7];
            if (var12 != null) {
                class351.field5594++;
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class361.field5717 = class301.field4694;
                class20.field237 = 2;
                class328.field5282.method304(195, 19830);
                class328.field5282.method1010(79, class276.field4349[82] ? 1 : 0);
                class328.field5282.method1003(var7, -2);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var12.method412((byte) 127), class11.field113.field3786[0], 0, 0, var12.method412((byte) 89), 2);
            }
        }
        if (var4 == 4) {
            class231 var13 = class251.field3974[var7];
            if (var13 != null) {
                class242.field3722 = class19.field223;
                class361.field5717 = class301.field4694;
                class20.field237 = 2;
                class225.field3402++;
                class7.field90 = 0;
                class328.field5282.method304(237, 19830);
                class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
                class328.field5282.method1006(74, var7);
                class328.field5282.method1052(class225.field3393, false);
                class328.field5282.method1002(-250657904, class196.field2978);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var13.method412((byte) 104), class11.field113.field3786[0], 0, 0, var13.method412((byte) 72), 2);
            }
        }
        if (var4 == 30) {
            class328.field5282.method304(218, 19830);
            class328.field5282.method1007(384539480, class225.field3393);
            class328.field5282.method1003(var7, -2);
            class14.field147++;
            class328.field5282.method1049(class196.field2978, (byte) -121);
            class328.field5282.method1052(var2, false);
            class328.field5282.method1002(-250657904, var3);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 36) {
            class231 var14 = class251.field3974[var7];
            if (var14 != null) {
                class361.field5717 = class301.field4694;
                class20.field237 = 2;
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class328.field5282.method304(34, 19830);
                class323.field5096++;
                class328.field5282.method1002(-250657904, var7);
                class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 117);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var14.method412((byte) 105), class11.field113.field3786[0], 0, 0, var14.method412((byte) 127), 2);
            }
        }
        if (var4 == 49) {
            class231 var15 = class251.field3974[var7];
            if (var15 != null) {
                class361.field5717 = class301.field4694;
                class20.field237 = 2;
                class220.field3305++;
                class242.field3722 = class19.field223;
                class7.field90 = 0;
                class328.field5282.method304(59, 19830);
                class328.field5282.method1002(-250657904, var7);
                class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var15.method412((byte) 110), class11.field113.field3786[0], 0, 0, var15.method412((byte) 120), 2);
            }
        }
        if (var4 == 1002) {
            class20.field237 = 2;
            class242.field3722 = class19.field223;
            class361.field5717 = class301.field4694;
            class210.field3166++;
            class7.field90 = 0;
            class328.field5282.method304(114, 19830);
            class328.field5282.method1002(-250657904, var7);
        }
        if (var4 == 50) {
            class92.method574(8180);
            class323 var16 = class45.method277(-12866, var2);
            class52.field605 = var7;
            class119.field1663 = var2;
            class119.field1662 = 1;
            class230.field3483 = var3;
            class107.method693(var16, 6);
            class201.field3074 = "<col=ff9040>" + class190.method1302(var7, (byte) -115).field4868 + "<col=ffffff>";
            if (class201.field3074 == null) {
                class201.field3074 = "null";
            }
            return;
        }
        if (var4 == 3) {
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class7.field90 = 0;
            class28.field335++;
            class361.field5717 = class301.field4694;
            class328.field5282.method304(26, 19830);
            class328.field5282.method1002(-250657904, class322.field4999 + var3);
            class328.field5282.method1006(-125, var7);
            class328.field5282.method1010(-113, class276.field4349[82] ? 1 : 0);
            class328.field5282.method1002(-250657904, class16.field160 + var2);
            class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
        }
        if (var4 == 40) {
            class7.field90 = 0;
            class20.field237 = 2;
            class135.field2011++;
            class242.field3722 = class19.field223;
            class361.field5717 = class301.field4694;
            class328.field5282.method304(100, 19830);
            class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 120);
            class328.field5282.method1006(-65, class322.field4999 + var3);
            class328.field5282.method1006(-51, class16.field160 + var2);
            class328.field5282.method1006(74, (int) (var5 >>> 32) & Integer.MAX_VALUE);
            class347.method2409(var2, 35, var3, var5);
        }
        if (var4 == 38) {
            class64.field769++;
            class328.field5282.method304(55, 19830);
            class328.field5282.method1049(var7, (byte) -96);
            class328.field5282.method1002(-250657904, var3);
            class328.field5282.method1052(var2, false);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 39) {
            class231 var17 = class251.field3974[var7];
            if (var17 != null) {
                class103.field1414++;
                class242.field3722 = class19.field223;
                class361.field5717 = class301.field4694;
                class20.field237 = 2;
                class7.field90 = 0;
                class328.field5282.method304(138, 19830);
                class328.field5282.method1006(-110, var7);
                class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 85);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var17.method412((byte) 106), class11.field113.field3786[0], 0, 0, var17.method412((byte) 127), 2);
            }
        }
        if (var4 == 57) {
            class7.field90 = 0;
            class18.field218++;
            class361.field5717 = class301.field4694;
            class20.field237 = 2;
            class242.field3722 = class19.field223;
            class328.field5282.method304(76, 19830);
            class328.field5282.method1002(-250657904, class16.field160 + var2);
            class328.field5282.method1002(-250657904, class322.field4999 + var3);
            class328.field5282.method1014(class276.field4349[82] ? 1 : 0, -128);
            class328.field5282.method1003(var7, -2);
            class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
        }
        if (var4 == 13) {
            class231 var18 = class251.field3974[var7];
            if (var18 != null) {
                class20.field237 = 2;
                class242.field3722 = class19.field223;
                class7.field90 = 0;
                class257.field4074++;
                class361.field5717 = class301.field4694;
                class328.field5282.method304(151, 19830);
                class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 121);
                class328.field5282.method1006(59, var7);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var18.method412((byte) 112), class11.field113.field3786[0], 0, 0, var18.method412((byte) 113), 2);
            }
        }
        if (var4 == 11) {
            class323 var19 = class291.method2078(var2, var3, 0);
            if (var19 != null) {
                class92.method574(8180);
                class76 var20 = client.method2013(var19);
                class80.method525(var20.method485((byte) -64), (byte) 122, var20.field986, var3, var2, var19.field5202, var19.field5163);
                class119.field1662 = 0;
                class260.field4110 = class313.method2211(var19, 66);
                if (var19.field5172) {
                    class191.field2868 = var19.field5105 + "<col=ffffff>";
                } else {
                    class191.field2868 = "<col=00ff00>" + var19.field5046 + "<col=ffffff>";
                }
                if (class260.field4110 == null) {
                    class260.field4110 = "Null";
                }
            }
            return;
        }
        if (var4 == 1010) {
            class7.field90 = 0;
            class361.field5717 = class301.field4694;
            class20.field237 = 2;
            class242.field3722 = class19.field223;
            class23.field273++;
            class328.field5282.method304(27, 19830);
            class328.field5282.method1014(class276.field4349[82] ? 1 : 0, -127);
            class328.field5282.method1049((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -88);
            class328.field5282.method1006(80, class16.field160 + var2);
            class328.field5282.method1049(var3 + class322.field4999, (byte) -121);
            class347.method2409(var2, 21, var3, var5);
        }
        if (var4 == 37) {
            class255.field4039++;
            class328.field5282.method304(220, 19830);
            class328.field5282.method1052(var2, false);
            class323 var21 = class45.method277(-12866, var2);
            if (var21.field5042 != null && var21.field5042[0][0] == 5) {
                int var22 = var21.field5042[0][1];
                if (class255.field4041[var22] != var21.field5058[0]) {
                    class255.field4041[var22] = var21.field5058[0];
                    class6.method38(-81, var22);
                }
            }
        }
        if (var4 == 23) {
            class328.field5282.method304(141, 19830);
            class328.field5282.method1003(var7, -2);
            class117.field1633++;
            class328.field5282.method1016(108, var2);
            class328.field5282.method1002(-250657904, var3);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 42) {
            class67 var23 = class105.field1443[var7];
            if (var23 != null) {
                class361.field5717 = class301.field4694;
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class151.field2390++;
                class20.field237 = 2;
                class328.field5282.method304(254, 19830);
                class328.field5282.method1049(var7, (byte) -106);
                class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var23.method412((byte) 105), class11.field113.field3786[0], 0, 0, var23.method412((byte) 107), 2);
            }
        }
        if (var4 == 47) {
            class328.field5282.method304(122, 19830);
            class328.field5282.method1003(var3, -2);
            class117.field1623++;
            class328.field5282.method1007(384539480, var2);
            class328.field5282.method1006(83, var7);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 1007 || var4 == 1005 || var4 == 1011 || var4 == 1003 || var4 == 1008) {
            class271.method1919(var7, var3, var4, (byte) -24);
        }
        if (var4 == 7) {
            class328.field5282.method304(105, 19830);
            class328.field5282.method1002(-250657904, var3);
            class328.field5282.method1052(var2, false);
            class328.field5282.method1006(-82, class230.field3483);
            class84.field1096++;
            class328.field5282.method1006(88, var7);
            class328.field5282.method1016(103, class119.field1663);
            class328.field5282.method1002(-250657904, class52.field605);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 60) {
            class361.field5717 = class301.field4694;
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class145.field2309++;
            class7.field90 = 0;
            class328.field5282.method304(35, 19830);
            class328.field5282.method1049((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -109);
            class328.field5282.method1049(class196.field2978, (byte) -107);
            class328.field5282.method1049(class16.field160 + var2, (byte) -120);
            class328.field5282.method1049(class322.field4999 + var3, (byte) -126);
            class328.field5282.method1052(class225.field3393, false);
            class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
            class347.method2409(var2, 126, var3, var5);
        }
        if (var4 == 26) {
            class328.field5282.method304(53, 19830);
            class140.field2125++;
            class328.field5282.method1041(var2, -93);
            class328.field5282.method1049(var3, (byte) -122);
            class328.field5282.method1006(124, var7);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 35) {
            class328.field5282.method304(159, 19830);
            class138.field2056++;
            class328.field5282.method1007(384539480, var2);
            class328.field5282.method1002(-250657904, var7);
            class328.field5282.method1002(-250657904, var3);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 14) {
            class67 var24 = class105.field1443[var7];
            if (var24 != null) {
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class20.field237 = 2;
                class293.field4624++;
                class361.field5717 = class301.field4694;
                class328.field5282.method304(78, 19830);
                class328.field5282.method1010(-106, class276.field4349[82] ? 1 : 0);
                class328.field5282.method1049(var7, (byte) -87);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var24.method412((byte) 74), class11.field113.field3786[0], 0, 0, var24.method412((byte) 105), 2);
            }
        }
        if (var4 == 19) {
            class323 var25 = class45.method277(-12866, var2);
            boolean var26 = true;
            if (var25.field5182 > 0) {
                var26 = class253.method1792(var25, -52);
            }
            if (var26) {
                class255.field4039++;
                class328.field5282.method304(220, 19830);
                class328.field5282.method1052(var2, false);
            }
        }
        if (var4 == 58) {
            class67 var27 = class105.field1443[var7];
            if (var27 != null) {
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class20.field237 = 2;
                class361.field5717 = class301.field4694;
                class328.field5282.method304(108, 19830);
                class31.field361++;
                class328.field5282.method1002(-250657904, var7);
                class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 83);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var27.method412((byte) 95), class11.field113.field3786[0], 0, 0, var27.method412((byte) 97), 2);
            }
        }
        if (var4 == 10) {
            if (var7 == 0) {
                class292.field4605 = 1;
                class123.method794(class219.field3290, var3, var2);
            } else if (var7 == 1) {
                class309.field4847++;
                class328.field5282.method304(235, 19830);
                class328.field5282.method1049(class16.field160 + var2, (byte) -91);
                class328.field5282.method1003(class322.field4999 + var3, -2);
                class328.field5282.method1006(-95, class196.field2978);
                class328.field5282.method1052(class225.field3393, false);
            }
        }
        if (var4 == 43) {
            class154.method1124(-106);
        }
        if (var4 == 25) {
            class231 var28 = class251.field3974[var7];
            if (var28 != null) {
                class361.field5717 = class301.field4694;
                class20.field237 = 2;
                class7.field90 = 0;
                class298.field4677++;
                class242.field3722 = class19.field223;
                class328.field5282.method304(51, 19830);
                class328.field5282.method1010(-125, class276.field4349[82] ? 1 : 0);
                class328.field5282.method1049(var7, (byte) -94);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var28.method412((byte) 96), class11.field113.field3786[0], 0, 0, var28.method412((byte) 100), 2);
            }
        }
        if (var4 == 2) {
            class328.field5282.method304(220, 19830);
            class328.field5282.method1052(var2, false);
            class323 var29 = class45.method277(-12866, var2);
            class255.field4039++;
            if (var29.field5042 != null && var29.field5042[0][0] == 5) {
                int var30 = var29.field5042[0][1];
                class255.field4041[var30] = 1 - class255.field4041[var30];
                class6.method38(-80, var30);
            }
        }
        if (var4 == 28) {
            if (var7 == 0) {
                class123.method794(class219.field3290, var3, var2);
            } else if (var7 == 1) {
                if (class100.field1350 > 0 && class276.field4349[82] && class276.field4349[81]) {
                    class123.method793(class219.field3290, class16.field160 + var2, -2266, class322.field4999 + var3);
                } else {
                    class31.method221(var3, 1, var2, -100);
                    class328.field5282.method1055(class271.field4269, 110);
                    class328.field5282.method1055(class20.field240, 103);
                    class328.field5282.method1003((int) class190.field2855, -2);
                    class328.field5282.method1055(57, 97);
                    class328.field5282.method1055(class132.field1912, 96);
                    class328.field5282.method1055(class67.field831, 79);
                    class328.field5282.method1055(89, 105);
                    class328.field5282.method1003(class11.field113.field3767, -2);
                    class328.field5282.method1003(class11.field113.field3763, -2);
                    class328.field5282.method1055(class79.field1052, 96);
                    class328.field5282.method1055(63, 79);
                    class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
                }
            }
        }
        if (var4 == 1012) {
            class361.field5717 = class301.field4694;
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class28.field332++;
            class7.field90 = 0;
            class328.field5282.method304(234, 19830);
            class328.field5282.method1006(-59, var7);
        }
        if (var4 == 8) {
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class4.field45++;
            class7.field90 = 0;
            class361.field5717 = class301.field4694;
            class328.field5282.method304(178, 19830);
            class328.field5282.method1003(var7, -2);
            class328.field5282.method1002(-250657904, var2 + class16.field160);
            class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 110);
            class328.field5282.method1049(var3 + class322.field4999, (byte) -117);
            class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
        }
        if (var4 == 59) {
            class67 var31 = class105.field1443[var7];
            if (var31 != null) {
                class20.field237 = 2;
                class242.field3722 = class19.field223;
                class11.field114++;
                class361.field5717 = class301.field4694;
                class7.field90 = 0;
                class328.field5282.method304(80, 19830);
                class328.field5282.method1006(76, var7);
                class328.field5282.method1014(class276.field4349[82] ? 1 : 0, -127);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var31.method412((byte) 110), class11.field113.field3786[0], 0, 0, var31.method412((byte) 110), 2);
            }
        }
        if (var4 == 29 || var4 == 1006) {
            class230.method1595(var7, var2, class222.field3357[arg0], -5568, var3);
        }
        if (var4 == 34) {
            class67.field808++;
            class328.field5282.method304(91, 19830);
            class328.field5282.method1016(115, var2);
            class328.field5282.method1049(var7, (byte) -120);
            class328.field5282.method1006(-103, var3);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 21) {
            class67 var32 = class105.field1443[var7];
            if (var32 != null) {
                class20.field237 = 2;
                class349.field5564++;
                class361.field5717 = class301.field4694;
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class328.field5282.method304(12, 19830);
                class328.field5282.method1003(var7, -2);
                class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 100);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var32.method412((byte) 108), class11.field113.field3786[0], 0, 0, var32.method412((byte) 80), 2);
            }
        }
        if (var4 == 44) {
            class361.field5717 = class301.field4694;
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class7.field90 = 0;
            class328.field5282.method304(66, 19830);
            class67.field839++;
            class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
            class328.field5282.method1002(-250657904, class322.field4999 + var3);
            class328.field5282.method1049(class16.field160 + var2, (byte) -103);
            class328.field5282.method1049(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -124);
            class347.method2409(var2, -93, var3, var5);
        }
        if (var4 == 20) {
            class67 var33 = class105.field1443[var7];
            if (var33 != null) {
                class20.field237 = 2;
                class7.field90 = 0;
                class242.field3722 = class19.field223;
                class361.field5717 = class301.field4694;
                class42.field455++;
                class328.field5282.method304(45, 19830);
                class328.field5282.method1003(class196.field2978, -2);
                class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
                class328.field5282.method1007(384539480, class225.field3393);
                class328.field5282.method1002(-250657904, var7);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var33.method412((byte) 127), class11.field113.field3786[0], 0, 0, var33.method412((byte) 73), 2);
            }
        }
        if (var4 == 22) {
            class242.field3722 = class19.field223;
            class181.field2730++;
            class20.field237 = 2;
            class7.field90 = 0;
            class361.field5717 = class301.field4694;
            class328.field5282.method304(140, 19830);
            class328.field5282.method1002(-250657904, class322.field4999 + var3);
            class328.field5282.method1003(var2 + class16.field160, -2);
            class328.field5282.method1049((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -91);
            class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 119);
            class347.method2409(var2, 123, var3, var5);
        }
        if (var4 == 15) {
            class231 var34 = class251.field3974[var7];
            if (var34 != null) {
                class20.field237 = 2;
                class7.field90 = 0;
                class361.field5717 = class301.field4694;
                class16.field187++;
                class242.field3722 = class19.field223;
                class328.field5282.method304(162, 19830);
                class328.field5282.method1049(var7, (byte) -116);
                class328.field5282.method1041(class119.field1663, -102);
                class328.field5282.method1006(-72, class52.field605);
                class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
                class328.field5282.method1049(class230.field3483, (byte) -107);
                class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, var34.method412((byte) 94), class11.field113.field3786[0], 0, 0, var34.method412((byte) 89), 2);
            }
        }
        if (arg1 > -79) {
            return;
        }
        if (var4 == 45 && class13.field126 == null) {
            class166.method1185(var3, (byte) -2, var2);
            class13.field126 = class291.method2078(var2, var3, 0);
            class107.method693(class13.field126, 6);
        }
        if (var4 == 48) {
            class7.field90 = 0;
            class361.field5717 = class301.field4694;
            class20.field237 = 2;
            class242.field3722 = class19.field223;
            class328.field5282.method304(49, 19830);
            class160.field2471++;
            class328.field5282.method1003(var7, -2);
            class328.field5282.method1003(class230.field3483, -2);
            class328.field5282.method1049(class52.field605, (byte) -93);
            class328.field5282.method1010(65, class276.field4349[82] ? 1 : 0);
            class328.field5282.method1002(-250657904, class322.field4999 + var3);
            class328.field5282.method1007(384539480, class119.field1663);
            class328.field5282.method1049(class16.field160 + var2, (byte) -86);
            class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
        }
        if (var4 == 33) {
            class242.field3722 = class19.field223;
            class55.field657++;
            class20.field237 = 2;
            class361.field5717 = class301.field4694;
            class7.field90 = 0;
            class328.field5282.method304(153, 19830);
            class328.field5282.method1006(120, class16.field160 + var2);
            class328.field5282.method1049(Integer.MAX_VALUE & (int) (var5 >>> 32), (byte) -87);
            class328.field5282.method1006(105, class322.field4999 + var3);
            class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 81);
            class347.method2409(var2, -119, var3, var5);
        }
        if (var4 == 24) {
            class361.field5717 = class301.field4694;
            class7.field90 = 0;
            class332.field5312++;
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class328.field5282.method304(98, 19830);
            class328.field5282.method1002(-250657904, class52.field605);
            class328.field5282.method1002(-250657904, class230.field3483);
            class328.field5282.method1002(-250657904, class16.field160 + var2);
            class328.field5282.method1003(var3 + class322.field4999, -2);
            class328.field5282.method1007(384539480, class119.field1663);
            class328.field5282.method1014(class276.field4349[82] ? 1 : 0, -127);
            class328.field5282.method1049((int) (var5 >>> 32) & Integer.MAX_VALUE, (byte) -99);
            class347.method2409(var2, -4, var3, var5);
        }
        if (var4 == 1) {
            class7.field90 = 0;
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class212.field3209++;
            class361.field5717 = class301.field4694;
            class328.field5282.method304(19, 19830);
            class328.field5282.method1016(119, class225.field3393);
            class328.field5282.method1002(-250657904, class16.field160 + var2);
            class328.field5282.method1006(70, class322.field4999 + var3);
            class328.field5282.method1003(var7, -2);
            class328.field5282.method1026(class276.field4349[82] ? 1 : 0, false);
            class328.field5282.method1002(-250657904, class196.field2978);
            class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
        }
        if (var4 == 17) {
            class20.field237 = 2;
            class7.field90 = 0;
            class295.field4647++;
            class361.field5717 = class301.field4694;
            class242.field3722 = class19.field223;
            class328.field5282.method304(31, 19830);
            class328.field5282.method1055(class276.field4349[82] ? 1 : 0, 96);
            class328.field5282.method1049(class322.field4999 + var3, (byte) -95);
            class328.field5282.method1006(-119, var2 + class16.field160);
            class328.field5282.method1003(var7, -2);
            class277.method1980(var2, class11.field113.field3747[0], 0, var3, true, 0, class11.field113.field3786[0], 0, 0, 0, 2);
        }
        if (var4 == 6) {
            if (var7 == 0) {
                class162.field2495 = 1;
                class123.method794(class219.field3290, var3, var2);
            } else if (class100.field1350 > 0 && class276.field4349[82] && class276.field4349[81]) {
                class123.method793(class219.field3290, class16.field160 + var2, -2266, class322.field4999 + var3);
            } else {
                class103.field1402++;
                class328.field5282.method304(212, 19830);
                class328.field5282.method1003(class322.field4999 + var3, -2);
                class328.field5282.method1049(class16.field160 + var2, (byte) -111);
            }
        }
        if (var4 == 31) {
            class328.field5282.method304(164, 19830);
            class328.field5282.method1007(384539480, var2);
            class344.field5447++;
            class328.field5282.method1006(84, var7);
            class328.field5282.method1049(var3, (byte) -125);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 16) {
            class73.field910++;
            class328.field5282.method304(41, 19830);
            class328.field5282.method1006(-97, var3);
            class328.field5282.method1052(var2, false);
            class328.field5282.method1002(-250657904, var7);
            class111.field1534 = 0;
            class312.field4895 = class45.method277(-12866, var2);
            class226.field3416 = var3;
        }
        if (var4 == 1004) {
            class7.field90 = 0;
            class242.field3722 = class19.field223;
            class20.field237 = 2;
            class361.field5717 = class301.field4694;
            class231 var35 = class251.field3974[var7];
            if (var35 != null) {
                class140 var36 = var35.field3503;
                if (var36.field2101 != null) {
                    var36 = var36.method961(-103);
                }
                if (var36 != null) {
                    class139.field2080++;
                    class328.field5282.method304(44, 19830);
                    class328.field5282.method1049(var36.field2094, (byte) -104);
                }
            }
        }
        if (class119.field1662 != 0) {
            class119.field1662 = 0;
            class107.method693(class45.method277(-12866, class119.field1663), 6);
        }
        if (class101.field1371) {
            class92.method574(8180);
        }
        if (class312.field4895 != null && class111.field1534 == 0) {
            class107.method693(class312.field4895, 6);
        }
    }

    @OriginalMember(owner = "client!db", name = "run", descriptor = "()V", line = 1171)
    public final void run() {
        while (!this.field3143) {
            class345 var1 = this.field3134;
            class315 var2;
            synchronized (this.field3134) {
                var2 = (class315) this.field3134.method2396(1542);
                if (var2 == null) {
                    try {
                        this.field3134.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field3142--;
            }
            try {
                if (var2.field4939 == 2) {
                    var2.field4942.method1434(var2.field4938.length, (int) var2.field4086, var2.field4938, 100);
                } else if (var2.field4939 == 3) {
                    var2.field4938 = var2.field4942.method1433((int) var2.field4086, true);
                }
            } catch (Exception var6) {
                class27.method198(var6, (byte) 62, (String) null);
            }
            var2.field2683 = false;
        }
        field3131++;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V", line = 1217)
    public static void method1449(boolean arg0) {
        field3139 = null;
        field3132 = (byte[][][]) null;
        field3140 = (boolean[][]) null;
        field3137 = null;
        if (!arg0) {
            method1454((byte) 111, 40, 27, (class16) null, (class16) null);
        }
        field3130 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 1233)
    public static final void method1450(int arg0) {
        for (int var1 = 0; var1 < class189.field2846; var1++) {
            class72 var2 = class244.method1727(-20258, var1);
            if (var2 != null && var2.field898 == 0) {
                class323.field5113[var1] = 0;
                class255.field4041[var1] = 0;
            }
        }
        field3136++;
        class181.field2727 = new class117(16);
        if (arg0 != 38) {
            method1450(-26);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Llf;Z)Lrm;", line = 1258)
    public static final class273 method1451(class143 arg0, boolean arg1) {
        field3128++;
        if (arg1) {
            method1448(111, -104);
        }
        return new class273(arg0.method1021(-1), arg0.method1021(-1), arg0.method1021(-1), arg0.method1021(-1), arg0.method1017((byte) 101), arg0.method1017((byte) 101), arg0.method1043(true));
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;", line = 1269)
    public static final String method1452(Throwable arg0, byte arg1) throws IOException {
        field3133++;
        String var3;
        if (arg0 instanceof class326) {
            class326 var2 = (class326) arg0;
            arg0 = var2.field5222;
            var3 = var2.field5221 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        if (arg1 > -45) {
            method1450(-92);
        }
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var11 = var9.indexOf(40);
            int var12 = var9.indexOf(41, var11 + 1);
            String var13;
            if (var11 == -1) {
                var13 = var9;
            } else {
                var13 = var9.substring(0, var11);
            }
            String var14 = var13.trim();
            String var15 = var14.substring(var14.lastIndexOf(32) + 1);
            String var16 = var15.substring(var15.lastIndexOf(9) + 1);
            String var17 = var3 + var16;
            if (var11 != -1 && var12 != -1) {
                int var18 = var9.indexOf(".java:", var11);
                if (var18 >= 0) {
                    var17 = var17 + var9.substring(var18 + 5, var12);
                }
            }
            var3 = var17 + ' ';
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)V", line = 1340)
    public final void method1453(boolean arg0) {
        field3126++;
        this.field3143 = arg0;
        class345 var2 = this.field3134;
        synchronized (this.field3134) {
            this.field3134.notifyAll();
        }
        try {
            this.field3141.join();
        } catch (InterruptedException var5) {
        }
        this.field3141 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BIILnk;Lnk;)Lfg;", line = 1357)
    public static final class240 method1454(byte arg0, int arg1, int arg2, class16 arg3, class16 arg4) {
        field3138++;
        if (class102.method648(arg1, -1000000000, arg2, arg3)) {
            int var5 = -23 % ((arg0 - 73) / 41);
            return class70.method437(255, arg4.method100(arg1, arg2, (byte) -107));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 1394)
    public class207() {
        class153 var1 = class156.field2451.method155(5, this, -3);
        while (var1.field2419 == 0) {
            class19.method140(10L, 16711680);
        }
        if (var1.field2419 == 2) {
            throw new RuntimeException();
        }
        this.field3141 = (Thread) var1.field2421;
    }
}
