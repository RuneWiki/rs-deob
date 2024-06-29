import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class106 {

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public int field1140 = 128;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "I")
    public int field1147 = 128;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public int field1142;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public int field1137;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public int field1150;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1149 = null;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "[[I")
    public static int[][] field1145 = new int[128][128];

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "Z")
    public static boolean field1144 = false;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "Lsb;")
    public static class305 field1143 = new class305(68, -1);

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lpi;Lnp;BI)V", line = 6)
    public static final void method573(class464 arg0, class115 arg1, byte arg2, int arg3) {
        if (arg2 > -39) {
            field1145 = null;
        }
        field1141++;
        class79 var4 = new class79();
        var4.field805 = arg1.method620((byte) 86);
        var4.field802 = arg1.method631(false);
        var4.field804 = new class88[var4.field805];
        var4.field798 = new byte[var4.field805][][];
        var4.field799 = new class88[var4.field805];
        var4.field807 = new int[var4.field805];
        var4.field797 = new int[var4.field805];
        var4.field796 = new int[var4.field805];
        for (int var5 = 0; var5 < var4.field805; var5++) {
            try {
                int var6 = arg1.method620((byte) -127);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg1.method626(75);
                    String var8 = arg1.method626(84);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg1.method631(false);
                    }
                    var4.field807[var5] = var6;
                    var4.field797[var5] = var9;
                    var4.field804[var5] = arg0.method2677(class411.method2302(9659, var7), var8, -120);
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg1.method626(72);
                    String var11 = arg1.method626(103);
                    int var12 = arg1.method620((byte) -24);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg1.method626(103);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg1.method631(false);
                            var15[var16] = new byte[var17];
                            arg1.method628(0, var17, var15[var16], (byte) -105);
                        }
                    }
                    var4.field807[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class411.method2302(9659, var13[var19]);
                    }
                    var4.field799[var5] = arg0.method2670(class411.method2302(9659, var10), var11, var18, (byte) -99);
                    var4.field798[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field796[var5] = -1;
            } catch (SecurityException var21) {
                var4.field796[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field796[var5] = -3;
            } catch (Exception var23) {
                var4.field796[var5] = -4;
            } catch (Throwable var24) {
                var4.field796[var5] = -5;
            }
        }
        class298.field3718.method3425(var4, false);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)Lkq;", line = 119)
    public final class106 method574(int arg0) {
        field1138++;
        if (arg0 != 128) {
            method577(17, -49, -72);
        }
        return new class106(this.field1148, this.field1147, this.field1140, this.field1137, this.field1150, this.field1142);
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 136)
    public static void method575(int arg0) {
        field1149 = null;
        if (arg0 != 1664) {
            method579(-89, (byte) 31, 100);
        }
        field1143 = null;
        field1145 = null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Ltf;ZLtf;Lrda;Ltf;)Z", line = 148)
    public static final boolean method576(class701 arg0, boolean arg1, class701 arg2, class96 arg3, class701 arg4) {
        class291.field3642 = arg3;
        class112.field1187 = arg2;
        field1135++;
        if (!arg1) {
            method577(-67, -31, 103);
        }
        class222.field2761 = arg4;
        class597.field8422 = arg0;
        return true;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z", line = 165)
    public static final boolean method577(int arg0, int arg1, int arg2) {
        field1146++;
        if (arg0 == 0) {
            return (arg2 & 0x400) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(I)V", line = 220)
    public class106(int arg0) {
        this.field1148 = arg0;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IIIIII)V", line = 227)
    private class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1140 = arg2;
        this.field1148 = arg0;
        this.field1142 = arg5;
        this.field1147 = arg1;
        this.field1137 = arg3;
        this.field1150 = arg4;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lkq;I)V", line = 183)
    public final void method578(class106 arg0, int arg1) {
        this.field1142 = arg0.field1142;
        this.field1140 = arg0.field1140;
        this.field1150 = arg0.field1150;
        if (arg1 != -5) {
            method577(-37, -104, 65);
        }
        this.field1148 = arg0.field1148;
        this.field1137 = arg0.field1137;
        this.field1147 = arg0.field1147;
        field1151++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)Z", line = 205)
    public static final boolean method579(int arg0, byte arg1, int arg2) {
        if (arg1 == 84) {
            field1136++;
            return class5.method42(arg0, arg1 - 83, arg2) & class542.method3050(4541, arg0, arg2);
        } else {
            return false;
        }
    }
}
