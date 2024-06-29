import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class136 {

    @OriginalMember(owner = "client!kf", name = "i", descriptor = "I")
    public int field2129 = -1;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
    public static int[] field2135 = new int[100];

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
    public static int[] field2137 = new int[50];

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public int field2121;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public int field2122;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field2124;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
    public int field2125;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public int field2126;

    @OriginalMember(owner = "client!kf", name = "g", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!kf", name = "j", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
    public int field2131;

    @OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
    public int field2132;

    @OriginalMember(owner = "client!kf", name = "m", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field2136;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field2138;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "[[Lsn;")
    public static class375[][] field2139;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIZZ)V", line = 12)
    public static final void method994(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        class156.field2449 = arg1;
        class361.field5513 = arg2;
        class374.field5649 = arg3;
        class309.field4886 = new class232[arg0][class156.field2449][class361.field5513];
        class181.field2961 = new class129[arg0];
        if (arg4) {
            class179.field2923 = new class232[1][class156.field2449][class361.field5513];
            class381.field5763 = new int[class156.field2449][class361.field5513];
            class364.field5542 = new class129[1];
        } else {
            class179.field2923 = null;
            class381.field5763 = null;
            class364.field5542 = null;
        }
        if (arg5) {
            class411.field6089 = new int[arg0][arg1][arg2];
            class27.field317 = new class369[255];
            class427.field6297 = new boolean[255];
            class134.field2101 = 0;
        } else {
            class411.field6089 = null;
            class27.field317 = null;
            class427.field6297 = null;
            class134.field2101 = 0;
        }
        class91.method539(false);
        class432.field6364 = new class262[500];
        class414.field6122 = 0;
        class43.field532 = new class262[500];
        class373.field5635 = 0;
        class79.field989 = new int[arg0][class156.field2449 + 1][class361.field5513 + 1];
        class429.field6320 = new class57[5000];
        class422.field6233 = 0;
        class241.field3991 = new boolean[class374.field5649 + class374.field5649 + 1][class374.field5649 + class374.field5649 + 1];
        class56.field706 = new boolean[class374.field5649 + class374.field5649 + 2][class374.field5649 + class374.field5649 + 2];
        class264.field4255 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V", line = 58)
    public static final void method995(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2133++;
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = arg3;
        int var9 = class21.method153(arg1 + arg2, (byte) -118, class185.field3005, class406.field6033);
        int var10 = class21.method153(arg1 - arg2, (byte) -87, class185.field3005, class406.field6033);
        class256.method1769(var9, class277.field4414[arg4], (byte) 117, arg0, var10);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class99.field1378 <= var12 && class396.field5925 >= var11) {
                    int var13 = class21.method153(arg1 + var5, (byte) -114, class185.field3005, class406.field6033);
                    int var14 = class21.method153(arg1 - var5, (byte) -119, class185.field3005, class406.field6033);
                    if (var12 <= class396.field5925) {
                        class256.method1769(var13, class277.field4414[var12], (byte) 71, arg0, var14);
                    }
                    if (var11 >= class99.field1378) {
                        class256.method1769(var13, class277.field4414[var11], (byte) 64, arg0, var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (class99.field1378 <= var16 && var15 <= class396.field5925) {
                int var17 = class21.method153(arg1 + var6, (byte) -104, class185.field3005, class406.field6033);
                int var18 = class21.method153(arg1 - var6, (byte) -125, class185.field3005, class406.field6033);
                if (class396.field5925 >= var16) {
                    class256.method1769(var17, class277.field4414[var16], (byte) 94, arg0, var18);
                }
                if (class99.field1378 <= var15) {
                    class256.method1769(var17, class277.field4414[var15], (byte) 59, arg0, var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/lang/String;ZBLmp;)V", line = 131)
    public static final void method996(String arg0, boolean arg1, byte arg2, class452 arg3) {
        if (arg2 > -64) {
            return;
        }
        field2127++;
        byte var4 = 4;
        int var5 = var4 + 6;
        int var6 = var4 + 6;
        int var7 = class31.field383.method2155((byte) 15, (class356[]) null, 250, arg0);
        int var8 = class31.field383.method2159(250, (class356[]) null, 3423, arg0) * 13;
        class284.field4547.method563(var5 - var4, var6 - var4, var7 - (-var4 - var4), var4 + var8 + var4, -16777216, 0);
        class284.field4547.method647(var5 - var4, -var4 + var6, var4 + var4 + var7, var8 - -var4 + var4, -1, 0);
        arg3.method2815(173, var6, (class356[]) null, 1, (int[]) null, (class245) null, var8, 1, var7, -1, 0, 0, arg0, var5, 0, -1);
        class59.method389(var6 - var4, var4 + var8 - -var4, var5 - var4, var7 - -var4 + var4, (byte) -106);
        if (arg1) {
            class284.field4547.method591();
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 164)
    public static void method997(int arg0) {
        field2139 = null;
        if (arg0 == 14295) {
            field2137 = null;
            field2135 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V", line = 179)
    public static final void method998(int arg0) {
        field2130++;
        for (class13 var1 = (class13) class423.field6251.method2432((byte) -103); var1 != null; var1 = (class13) class423.field6251.method2432((byte) -123)) {
            class201.method1400(var1, 27439);
        }
        client.method1139();
        if (arg0 >= -12) {
            field2123 = 3;
        }
        client.method1134();
        client.method1151();
        client.method1137();
        client.method1136();
        client.method1143();
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V", line = 218)
    public static final void method999(int arg0, int arg1) {
        class52 var2 = class248.field4056;
        synchronized (class248.field4056) {
            class248.field4056.method337(arg0, (byte) -110);
        }
        if (arg1 != -23944) {
            field2123 = -38;
        }
        field2134++;
    }
}
