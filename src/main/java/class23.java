import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("IXJIDLUT")
public class class23 {

    @OriginalMember(owner = "IXJIDLUT", name = "b", descriptor = "Z")
    private boolean field852 = true;

    @OriginalMember(owner = "IXJIDLUT", name = "e", descriptor = "I")
    private int field855 = 397;

    @OriginalMember(owner = "IXJIDLUT", name = "f", descriptor = "I")
    private int field856 = -393;

    @OriginalMember(owner = "IXJIDLUT", name = "k", descriptor = "[LJUIUBOIF;")
    private class27[] field861 = new class27[10];

    @OriginalMember(owner = "IXJIDLUT", name = "a", descriptor = "B")
    private static byte field851 = -27;

    @OriginalMember(owner = "IXJIDLUT", name = "c", descriptor = "Z")
    private static boolean field853 = true;

    @OriginalMember(owner = "IXJIDLUT", name = "g", descriptor = "[LIXJIDLUT;")
    private static class23[] field857 = new class23[5000];

    @OriginalMember(owner = "IXJIDLUT", name = "h", descriptor = "[I")
    public static int[] field858 = new int[5000];

    @OriginalMember(owner = "IXJIDLUT", name = "d", descriptor = "I")
    private static int field854;

    @OriginalMember(owner = "IXJIDLUT", name = "l", descriptor = "I")
    private int field862;

    @OriginalMember(owner = "IXJIDLUT", name = "m", descriptor = "I")
    private int field863;

    @OriginalMember(owner = "IXJIDLUT", name = "j", descriptor = "LXJCNBMKS;")
    private static class68 field860;

    @OriginalMember(owner = "IXJIDLUT", name = "i", descriptor = "[B")
    private static byte[] field859;

    @OriginalMember(owner = "IXJIDLUT", name = "<init>", descriptor = "(I)V")
    private class23(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "IXJIDLUT", name = "a", descriptor = "(ILXJCNBMKS;)V")
    public static final void method291(int arg0, class68 arg1) {
        if (arg0 != 0) {
            field853 = !field853;
        }
        field859 = new byte[441000];
        field860 = new class68((byte) 9, field859);
        class27.method301();
        while (true) {
            int var2 = arg1.method536();
            if (var2 == 65535) {
                return;
            }
            field857[var2] = new class23(905);
            field857[var2].method293(field851, arg1);
            field858[var2] = field857[var2].method294(3);
        }
    }

    @OriginalMember(owner = "IXJIDLUT", name = "a", descriptor = "(III)LXJCNBMKS;")
    public static final class68 method292(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field854 = 157;
        }
        if (field857[arg1] == null) {
            return null;
        } else {
            class23 var3 = field857[arg1];
            return var3.method295(arg2, 533);
        }
    }

    @OriginalMember(owner = "IXJIDLUT", name = "a", descriptor = "(BLXJCNBMKS;)V")
    private final void method293(byte arg0, class68 arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method534();
            if (var4 != 0) {
                arg1.field1643--;
                this.field861[var3] = new class27();
                this.field861[var3].method304(field851, arg1);
            }
        }
        this.field862 = arg1.method536();
        if (field851 != arg0) {
            field853 = !field853;
        }
        this.field863 = arg1.method536();
    }

    @OriginalMember(owner = "IXJIDLUT", name = "a", descriptor = "(I)I")
    private final int method294(int arg0) {
        int var2 = 9999999;
        if (arg0 < 3 || arg0 > 3) {
            return this.field856;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field861[var3] != null && this.field861[var3].field910 / 20 < var2) {
                var2 = this.field861[var3].field910 / 20;
            }
        }
        if (this.field862 < this.field863 && this.field862 / 20 < var2) {
            var2 = this.field862 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field861[var4] != null) {
                this.field861[var4].field910 -= var2 * 20;
            }
        }
        if (this.field862 < this.field863) {
            this.field862 -= var2 * 20;
            this.field863 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "IXJIDLUT", name = "a", descriptor = "(II)LXJCNBMKS;")
    private final class68 method295(int arg0, int arg1) {
        int var3 = this.method296(arg0);
        field860.field1643 = 0;
        if (arg1 <= 0) {
            this.field852 = !this.field852;
        }
        field860.method528(1380533830);
        field860.method529(0, var3 + 36);
        field860.method528(1463899717);
        field860.method528(1718449184);
        field860.method529(0, 16);
        field860.method526(1, (byte) 1);
        field860.method526(1, (byte) 1);
        field860.method529(0, 22050);
        field860.method529(0, 22050);
        field860.method526(1, (byte) 1);
        field860.method526(8, (byte) 1);
        field860.method528(1684108385);
        field860.method529(0, var3);
        field860.field1643 += var3;
        return field860;
    }

    @OriginalMember(owner = "IXJIDLUT", name = "b", descriptor = "(I)I")
    private final int method296(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field861[var3] != null && this.field861[var3].field910 + this.field861[var3].field909 > var2) {
                var2 = this.field861[var3].field910 + this.field861[var3].field909;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field862 * 22050 / 1000;
        int var6 = this.field863 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field859[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field861[var9] != null) {
                int var15 = this.field861[var9].field909 * 22050 / 1000;
                int var16 = this.field861[var9].field910 * 22050 / 1000;
                int[] var17 = this.field861[var9].method302(var15, this.field861[var9].field909);
                for (int var18 = 0; var18 < var15; var18++) {
                    field859[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field859[var10 + var11] = field859[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field859[var13 + var14] = field859[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
