import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class103 {

    @OriginalMember(owner = "client!st", name = "e", descriptor = "I")
    private int field1409 = -1;

    @OriginalMember(owner = "client!st", name = "g", descriptor = "I")
    private int field1411 = 0;

    @OriginalMember(owner = "client!st", name = "p", descriptor = "Ltu;")
    private class7 field1420 = new class7();

    @OriginalMember(owner = "client!st", name = "s", descriptor = "Z")
    public boolean field1423 = false;

    @OriginalMember(owner = "client!st", name = "l", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!st", name = "b", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!st", name = "c", descriptor = "[Lcp;")
    private class515[] field1407;

    @OriginalMember(owner = "client!st", name = "i", descriptor = "[[[I")
    private int[][][] field1413;

    @OriginalMember(owner = "client!st", name = "f", descriptor = "I")
    public static int field1410 = 0;

    @OriginalMember(owner = "client!st", name = "q", descriptor = "Ltu;")
    public static class7 field1421 = new class7();

    @OriginalMember(owner = "client!st", name = "a", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!st", name = "d", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!st", name = "h", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!st", name = "j", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!st", name = "k", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!st", name = "m", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!st", name = "n", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!st", name = "o", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!st", name = "r", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method688(int arg0) {
        field1414++;
        if (this.field1416 != this.field1406) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -26835) {
            this.method688(-93);
        }
        for (int var2 = 0; var2 < this.field1416; var2++) {
            this.field1407[var2] = class349.field4464;
        }
        return this.field1413;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILdn;IIZ)V")
    public static final void method689(int arg0, int arg1, int arg2, class201 arg3, int arg4, int arg5, boolean arg6) {
        class181.field2362 = arg3;
        class520.field7691 = 1;
        class298.field3864 = arg4;
        class368.field4742 = arg6;
        class411.field5487 = arg2;
        if (arg0 >= -90) {
            field1410 = 81;
        }
        class264.field3347 = arg5;
        field1417++;
        class291.field3719 = class117.field1641.method2227(13657) / arg1;
        if (class291.field3719 < 1) {
            class291.field3719 = 1;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(III)I")
    public static final int method690(int arg0, int arg1, int arg2) {
        field1415++;
        int var3 = class143.method999(arg0 - 1, arg2 - 1, -5) + class143.method999(arg0 + 1, arg2 + -1, -5) - (-class143.method999(arg0 + -1, arg2 + 1, -5) - class143.method999(arg0 + 1, arg1 + arg2, -5));
        int var4 = class143.method999(arg0 - 1, arg2, -5) - (-class143.method999(arg0 + 1, arg2, -5) - class143.method999(arg0, arg2 - 1, -5)) + class143.method999(arg0, arg2 - -1, arg1 + -6);
        int var5 = class143.method999(arg0, arg2, -5);
        return var3 / 16 + (var4 / 8 + (var5 / 4));
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
    public static void method691(int arg0) {
        int var1 = 0 % ((-arg0 - 32) / 61);
        field1421 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(B)V")
    public final void method692(byte arg0) {
        for (int var2 = 0; var2 < this.field1416; var2++) {
            this.field1413[var2][0] = null;
            this.field1413[var2][1] = null;
            this.field1413[var2][2] = null;
            this.field1413[var2] = null;
        }
        field1422++;
        if (arg0 >= -64) {
            field1421 = null;
        }
        this.field1413 = null;
        this.field1407 = null;
        this.field1420.method47(0);
        this.field1420 = null;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(ILdn;)V")
    public static final void method693(int arg0, class201 arg1) {
        field1405++;
        if (arg0 == 18411) {
            class458.field6409 = arg1;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[[I")
    public final int[][] method694(int arg0, int arg1) {
        if (arg1 != 3) {
            this.method688(-101);
        }
        field1408++;
        if (this.field1416 == this.field1406) {
            this.field1423 = this.field1407[arg0] == null;
            this.field1407[arg0] = class349.field4464;
            return this.field1413[arg0];
        } else if (this.field1416 == 1) {
            this.field1423 = this.field1409 != arg0;
            this.field1409 = arg0;
            return this.field1413[0];
        } else {
            class515 var3 = this.field1407[arg0];
            if (var3 == null) {
                this.field1423 = true;
                if (this.field1411 < this.field1416) {
                    var3 = new class515(arg0, this.field1411);
                    this.field1411++;
                } else {
                    class515 var4 = (class515) this.field1420.method39(true);
                    var3 = new class515(arg0, var4.field7572);
                    this.field1407[var4.field7569] = null;
                    var4.method3021(arg1 + 55);
                }
                this.field1407[arg0] = var3;
            } else {
                this.field1423 = false;
            }
            this.field1420.method41(-792385400, var3);
            return this.field1413[var3.field7572];
        }
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(III)V")
    public class103(int arg0, int arg1, int arg2) {
        this.field1416 = arg0;
        this.field1406 = arg1;
        this.field1407 = new class515[this.field1406];
        this.field1413 = new int[this.field1416][3][arg2];
    }
}
