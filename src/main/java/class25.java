import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class25 {

    @OriginalMember(owner = "mapview!n", name = "g", descriptor = "[I")
    private int[] field366;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lna;")
    public static class26 field360 = class6.method40("Vegetable Store", 48);

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "Lna;")
    public static class26 field362 = class6.method40("Shield Shop", 48);

    @OriginalMember(owner = "mapview!n", name = "f", descriptor = "Lna;")
    public static class26 field365 = class6.method40("Transportation", 48);

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "Lna;")
    public static class26 field364 = class6.method40("Silk Trader", 48);

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "I")
    public static int field363 = 0;

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Lna;")
    public static class26 field361 = class6.method40("Mace Shop", 48);

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(II)I", line = 25)
    public final int method171(int arg0, int arg1) {
        if (arg1 != 0) {
            return 1;
        }
        int var3 = this.field366.length - 2;
        int var4 = arg0 << 1 & var3;
        while (true) {
            int var5 = this.field366[var4];
            if (arg0 == var5) {
                return this.field366[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(IZ)I", line = 52)
    public static final int method172(int arg0, boolean arg1) {
        if (arg1) {
            method172(-112, false);
        }
        if (arg0 >= 65 && arg0 <= 90) {
            arg0 += 32;
        }
        return arg0;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(I)V", line = 67)
    public static void method173(int arg0) {
        field361 = null;
        if (arg0 != 0) {
            field365 = null;
        }
        field362 = null;
        field364 = null;
        field365 = null;
        field360 = null;
    }

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(II[Lna;B)Lna;", line = 95)
    public static final class26 method174(int arg0, int arg1, class26[] arg2, byte arg3) {
        int var4 = 0;
        if (arg3 != 116) {
            return (class26) null;
        }
        for (int var5 = 0; var5 < arg1; var5++) {
            if (arg2[arg0 + var5] == null) {
                arg2[arg0 + var5] = class11.field138;
            }
            var4 += arg2[arg0 + var5].field375;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg1; var8++) {
            class26 var9 = arg2[arg0 + var8];
            class17.method109(var9.field371, 0, var6, var7, var9.field375);
            var7 += var9.field375;
        }
        class26 var10 = new class26();
        var10.field375 = var4;
        var10.field371 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "([I)V", line = 153)
    public class25(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field366 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field366[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field366[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field366[var5 + var5] = arg0[var4];
            this.field366[var5 + var5 + 1] = var4++;
        }
    }
}
