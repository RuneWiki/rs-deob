import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class132 {

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
    public static int field2323 = 0;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public static int field2324 = -1;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "I")
    public static int field2325 = -1;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "Ljf;")
    public static class229 field2329 = class212.method1457((byte) 103, "b12_full");

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "[[[I")
    public static int[][][] field2328;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lbf;B)I", line = 5)
    public static final int method915(class331 arg0, byte arg1) {
        if (arg1 != -106) {
            field2321 = 120;
        }
        class169 var2 = arg0.field5631;
        field2330++;
        if (var2.field2950 != null) {
            var2 = var2.method1154((byte) -110);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field2933;
        if (arg0.field2025 == arg0.field1986) {
            var3 = var2.field2926;
        } else if (arg0.field2025 == arg0.field2019) {
            var3 = var2.field2898;
        }
        return var3;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)V", line = 40)
    public static final void method916(int arg0, int arg1) {
        class125 var2 = class312.field5246[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class125 var4 = class312.field5246[var3][arg0][arg1] = class312.field5246[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2195--;
                for (int var5 = 0; var5 < var4.field2201; var5++) {
                    class104 var6 = var4.field2204[var5];
                    if ((var6.field1814 >> 29 & 0x3L) == 2L && var6.field1800 == arg0 && var6.field1791 == arg1) {
                        var6.field1804--;
                    }
                }
            }
        }
        if (class312.field5246[0][arg0][arg1] == null) {
            class312.field5246[0][arg0][arg1] = new class125(0, arg0, arg1);
        }
        class312.field5246[0][arg0][arg1].field2210 = var2;
        class312.field5246[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V", line = 78)
    public static final void method917(byte arg0) {
        field2322++;
        if (arg0 > 49) {
            class305.field5161.method230(true);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZ)I", line = 99)
    public static final int method918(int arg0, boolean arg1) {
        field2327++;
        if (arg0 < 0) {
            return 0;
        }
        class187 var2 = (class187) class278.field4772.method1890((long) arg0, -102);
        if (var2 == null) {
            return class41.method350(5, arg0).field52;
        }
        int var3 = 0;
        if (!arg1) {
            method916(-45, -57);
        }
        for (int var4 = 0; var4 < var2.field3279.length; var4++) {
            if (var2.field3279[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class41.method350(5, arg0).field52 - var2.field3279.length);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 146)
    public static void method919(int arg0) {
        if (arg0 > -114) {
            field2328 = (int[][][]) ((int[][][]) null);
        }
        field2328 = (int[][][]) null;
        field2329 = null;
    }
}
