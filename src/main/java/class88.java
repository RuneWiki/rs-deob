import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class88 {

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "B")
    public byte field975;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public int field979;

    @OriginalMember(owner = "client!gv", name = "r", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Lbu;")
    public static class21 field981 = new class21(39, 7);

    @OriginalMember(owner = "client!gv", name = "v", descriptor = "Lvea;")
    public static class288 field993 = new class288(1);

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "[Lak;")
    public static class369[] field995 = new class369[14];

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "Lfba;")
    public static class27 field996 = new class27(84, 7);

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "Lfba;")
    public static class27 field997 = new class27(42, 2);

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "F")
    public static float field1000;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public int field972;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public int field974;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public int field983;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "I")
    public int field986;

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public int field988;

    @OriginalMember(owner = "client!gv", name = "s", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!gv", name = "t", descriptor = "I")
    public static int field991;

    @OriginalMember(owner = "client!gv", name = "u", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gv", name = "B", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "Liv;")
    public static class105 field998;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Lgv;")
    public class88 field977;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static void method658(byte arg0) {
        field998 = null;
        field995 = null;
        field996 = null;
        field993 = null;
        field981 = null;
        int var1 = 24 % ((arg0 - 67) / 50);
        field997 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILmea;B)Ljava/lang/String;")
    public static final String method659(int arg0, class451 arg1, byte arg2) {
        field987++;
        if (!client.method2046(arg1).method276(arg0, 0) && arg1.field6300 == null) {
            return null;
        } else if (arg1.field6180 == null || arg0 >= arg1.field6180.length || arg1.field6180[arg0] == null || arg1.field6180[arg0].trim().length() == 0) {
            return class81.field901 ? "Hidden-" + arg0 : null;
        } else {
            int var3 = -19 % ((-arg2 - 31) / 54);
            return arg1.field6180[arg0];
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILd;BILjava/awt/Canvas;)Lha;")
    public static final class65 method660(int arg0, class160 arg1, byte arg2, int arg3, Canvas arg4) {
        field980++;
        return arg2 == 107 ? new class722(arg4, arg1, arg0, arg3) : null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)Lgv;")
    public final class88 method661(int arg0, int arg1, int arg2, int arg3) {
        field994++;
        int var5 = 116 % ((arg3 - 21) / 56);
        return new class88(this.field984, arg1, arg2, arg0, this.field975);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BIII)V")
    public static final void method662(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 84) {
            method658((byte) -120);
        }
        int var4 = arg3 * class21.field353.field10078.method2896(-41) >> 8;
        field978++;
        if (var4 == 0 || arg1 == -1) {
            return;
        }
        if (!class169.field2642 && class577.field8137 != -1 && class95.method694((byte) -93) && !class257.method1673(-1)) {
            class695.field9710 = class290.method1862(1);
            class462 var5 = class391.method2423(class695.field9710, 13955);
            class460.method2735(true, var5, (byte) -116);
        }
        class370.method2306(var4, 0, class65.field790, arg1, (byte) -84, false);
        class768.method4241(255, -1, (byte) 71);
        class169.field2642 = true;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)Llu;")
    public final class741 method663(int arg0) {
        field990++;
        if (arg0 != -30963) {
            this.field977 = null;
        }
        return class530.method3203((byte) 72, this.field984);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IIIIB)V")
    public class88(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field984 = arg0;
        this.field976 = arg2;
        this.field975 = arg4;
        this.field979 = arg1;
        this.field989 = arg3;
    }
}
