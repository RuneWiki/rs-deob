import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class98 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Lp;")
    public static class104 field2324 = new class104(30);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[I")
    public static int[] field2328 = new int[2048];

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lfc;")
    public static class39 field2327 = class90.method774("Lade Eingabe)2Steuerungsprogramm)3)3)3", -113);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lfc;")
    public static class39 field2329 = class90.method774("Von:", -91);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Lob;")
    public static class99 field2320;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2326;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[Lfc;")
    public static class39[] field2330;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[[[B")
    public static byte[][][] field2331;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method816(int arg0, int arg1) {
        field2316++;
        int var2 = 22 % ((arg0 + 82) / 36);
        return (arg1 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 18)
    public static final void method817(int arg0) {
        if (arg0 != 32) {
            field2330 = null;
        }
        field2325++;
        while (class39.field1065.method392(class128.field3275, (byte) -97) >= 11) {
            int var1 = class39.field1065.method396(11, (byte) 101);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class101.field2525[var1] == null) {
                class101.field2525[var1] = new class142();
                var2 = true;
                if (class24.field644[var1] != null) {
                    class101.field2525[var1].method1159(false, class24.field644[var1]);
                }
            }
            class31.field862[class111.field2871++] = var1;
            class142 var3 = class101.field2525[var1];
            var3.field2868 = class70.field1654;
            int var4 = class39.field1065.method396(1, (byte) 108);
            int var5 = class39.field1065.method396(5, (byte) 115);
            int var6 = class5.field165[class39.field1065.method396(3, (byte) 115)];
            if (var2) {
                var3.field2900 = var6;
            }
            if (var5 > 15) {
                var5 -= 32;
            }
            int var7 = class39.field1065.method396(5, (byte) 122);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class39.field1065.method396(1, (byte) 109);
            if (var8 == 1) {
                field2328[class68.field1626++] = var1;
            }
            var3.method975(class94.field2197.field2913[0] + var7, var4 == 1, 101, class94.field2197.field2926[0] + var5);
        }
        class39.field1065.method395((byte) 102);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 84)
    public static void method818(byte arg0) {
        field2331 = null;
        field2327 = null;
        int var1 = -109 / ((arg0 - 23) / 34);
        field2329 = null;
        field2324 = null;
        field2328 = null;
        field2330 = null;
        field2320 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILoc;Lfc;Lfc;)Lma;", line = 100)
    public static final class84 method819(int arg0, class100 arg1, class39 arg2, class39 arg3) {
        int var4 = arg1.method848(arg3, (byte) -104);
        field2317++;
        int var5 = arg1.method834(arg2, false, var4);
        if (arg0 != -2048) {
            method820(true, 79, 63);
        }
        return class60.method600(var4, var5, arg0 ^ 0xFFFFF801, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)I", line = 115)
    public static final int method820(boolean arg0, int arg1, int arg2) {
        field2323++;
        if (!arg0) {
            method820(true, -109, 75);
        }
        int var3 = class10.method139(arg1 - 1, arg2 + -1, (byte) -106) + class10.method139(arg1 + 1, arg2 + -1, (byte) -120) + class10.method139(arg1 - 1, arg2 - -1, (byte) -111) + class10.method139(arg1 + 1, arg2 - -1, (byte) -76);
        int var4 = class10.method139(arg1 - 1, arg2, (byte) -89) + class10.method139(arg1 + 1, arg2, (byte) -66) + class10.method139(arg1, arg2 - 1, (byte) -61) + class10.method139(arg1, arg2 + 1, (byte) -78);
        int var5 = class10.method139(arg1, arg2, (byte) -122);
        return var3 / 16 + var4 / 8 + var5 / 4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)I", line = 137)
    public static final int method821(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 != 11873) {
            field2320 = null;
        }
        field2322++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldc;[BI)V", line = 173)
    public final void method822(class25 arg0, byte[] arg1, int arg2) {
        if (arg2 != 21995) {
            return;
        }
        field2319++;
        if (arg0.field711[arg0.field710] != 31 || arg0.field711[arg0.field710 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2326 == null) {
            this.field2326 = new Inflater(true);
        }
        try {
            this.field2326.setInput(arg0.field711, arg0.field710 + 10, -8 - (arg0.field710 + 10 - arg0.field711.length));
            this.field2326.inflate(arg1);
        } catch (Exception var4) {
            this.field2326.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2326.reset();
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V", line = 213)
    public class98() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(III)V", line = 242)
    private class98(int arg0, int arg1, int arg2) {
    }
}
