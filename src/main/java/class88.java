import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class88 extends class359 {

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public int field993;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "[Z")
    public boolean[] field980;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
    public int[] field983;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "[I")
    public int[] field987;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "[[I")
    public int[][] field990;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field982 = 0;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Ljava/lang/String;")
    public static String field984 = "Started 3d Library";

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field986 = new String[5];

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
    public static final void method477(int arg0, int arg1) {
        field992++;
        class237.field3225 = -1;
        if (arg0 != -27184) {
            method477(-98, -73);
        }
        class356.field5214 = arg1;
        class237.field3225 = -1;
        class157.method1032(-6600);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public static void method478(int arg0) {
        if (arg0 != 21021) {
            method477(24, 58);
        }
        field986 = null;
        field984 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIZII)I")
    public static final int method479(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field981++;
        if (class132.field1814 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg2 >> 7;
            int var7 = arg4 >> 7;
            if (arg5 < 0 || arg1 < 0 || class279.field3935 - 1 < arg5 || arg1 > (class164.field2287 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || (class279.field3935 - 1) < var6 || var7 > (class164.field2287 - 1)) {
                return 0;
            }
            boolean var8 = (class166.field2327[1][arg2 >> 7][arg4 >> 7] & 0x2) != 0;
            if ((arg2 & 0x7F) == 0) {
                boolean var9 = (class166.field2327[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                boolean var10 = (class166.field2327[1][var6][arg4 >> 7] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class166.field2327[1][arg5][arg1] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x7F) == 0) {
                boolean var11 = (class166.field2327[1][arg2 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class166.field2327[1][arg2 >> 7][var7] & 0x2) != 0;
                if (var12 != var11) {
                    var8 = (class166.field2327[1][arg5][arg1] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        if (arg3) {
            method477(26, 119);
        }
        return class132.field1814[arg0].method1991(arg2, arg4);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZZII)Lra;")
    public static final class57 method480(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        int var5 = -107 / ((arg3 + 37) / 35);
        field988++;
        class93 var6 = null;
        if (class239.field3248 != null) {
            var6 = new class93(arg0, class239.field3248, class260.field3530[arg0], 1000000);
        }
        class59.field713[arg0] = class222.field3038.method2356(class75.field835, var6, arg0, (byte) -61);
        if (arg2) {
            class59.field713[arg0].method1840(1000);
        }
        return new class57(class59.field713[arg0], arg1, arg4);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)V")
    public static final void method481(int arg0, int arg1) {
        class123.field1638 = new int[arg1];
        class173.field2413 = new int[arg1];
        class245.field3332 = new int[arg1];
        class366.field5349 = new int[arg1];
        class217.field2969 = new int[arg1];
        if (arg0 == 0) {
            field989++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I[B)V")
    public class88(int arg0, byte[] arg1) {
        this.field985 = arg0;
        class211 var3 = new class211(arg1);
        this.field993 = var3.method1342((byte) -127);
        this.field980 = new boolean[this.field993];
        this.field983 = new int[this.field993];
        this.field987 = new int[this.field993];
        this.field990 = new int[this.field993][];
        for (int var4 = 0; var4 < this.field993; var4++) {
            this.field983[var4] = var3.method1342((byte) -126);
        }
        for (int var5 = 0; var5 < this.field993; var5++) {
            this.field980[var5] = var3.method1342((byte) -126) == 1;
        }
        for (int var6 = 0; var6 < this.field993; var6++) {
            this.field987[var6] = var3.method1355(32136);
        }
        for (int var7 = 0; var7 < this.field993; var7++) {
            this.field990[var7] = new int[var3.method1342((byte) -127)];
        }
        for (int var8 = 0; var8 < this.field993; var8++) {
            for (int var9 = 0; var9 < this.field990[var8].length; var9++) {
                this.field990[var8][var9] = var3.method1342((byte) -128);
            }
        }
    }
}
