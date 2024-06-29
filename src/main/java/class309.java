import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class309 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "[Z")
    public boolean[] field4466 = new boolean[256];

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[I")
    public int[] field4470 = new int[256];

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "[I")
    public int[] field4477 = new int[16];

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[I")
    public int[] field4471 = new int[6];

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[[I")
    public int[][] field4480 = new int[6][258];

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[B")
    public byte[] field4482 = new byte[18002];

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "[B")
    public byte[] field4481 = new byte[4096];

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "[B")
    public byte[] field4484 = new byte[256];

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "[I")
    public int[] field4467 = new int[257];

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "[[B")
    public byte[][] field4488 = new byte[6][258];

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public int field4489 = 0;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "[B")
    public byte[] field4490 = new byte[18002];

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "[[I")
    public int[][] field4493 = new int[6][258];

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "[[I")
    public int[][] field4497 = new int[6][258];

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public int field4472 = 0;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "[Z")
    public boolean[] field4499 = new boolean[16];

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Lla;")
    public static class319 field4496;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "[I")
    public static int[] field4503;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "[C")
    public static char[] field4504;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "Z")
    public static boolean field4502;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "Lof;")
    public static class446 field4505;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "B")
    public byte field4498;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "I")
    public int field4474;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public int field4475;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public int field4476;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field4478;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field4483;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public int field4485;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public int field4492;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "[B")
    public byte[] field4486;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "[B")
    public byte[] field4500;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "[[I")
    public static int[][] field4506;

    static {
        new class446("Adventurer", "Abenteurer", "Aventurier", "Aventureira");
        field4501 = -1;
        field4496 = new class319(66, -1);
        field4503 = new int[5];
        field4504 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };
        field4502 = false;
        field4505 = new class446("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V", line = 14)
    public static void method1937(byte arg0) {
        field4503 = null;
        field4505 = null;
        field4506 = null;
        field4504 = null;
        if (arg0 != -101) {
            method1938(41, -104, -123);
        }
        field4496 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)Lkr;", line = 85)
    public static final class535 method1938(int arg0, int arg1, int arg2) {
        class452 var3 = class443.field6672[arg0][arg1][arg2];
        return var3 == null ? null : var3.field6812;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)V", line = 98)
    public static final void method1939(int arg0, int arg1, int arg2) {
        field4495++;
        class177 var3 = class344.method2229(arg1, arg2, (byte) 87);
        var3.method1191(arg1 - 127);
        var3.field2372 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IB[JI[I)V", line = 109)
    public static final void method1940(int arg0, byte arg1, long[] arg2, int arg3, int[] arg4) {
        field4479++;
        if (arg0 < arg3) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            int var9 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg3; var11++) {
                if (var7 + ((long) (var10 & var11)) > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    int var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var9;
            method1940(arg0, (byte) 78, arg2, var6 - 1, arg4);
            method1940(var6 + 1, (byte) 111, arg2, arg3, arg4);
        }
        if (arg1 < 51) {
            field4504 = null;
        }
    }
}
