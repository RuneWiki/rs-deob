import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class76 {

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    private int field1408 = 0;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    private int field1403 = -1;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "Lmb;")
    private class160 field1415 = new class160();

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Z")
    public boolean field1424 = false;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "[Lwj;")
    private class6[] field1412;

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "[[I")
    private int[][] field1399;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "Lcf;")
    public static class93 field1409 = class147.method1066(" <col=00ff80>", -48);

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "Lnh;")
    public static class54 field1402 = new class54(30);

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "Lcf;")
    public static class93 field1419 = class147.method1066("<col=00ff80>", -48);

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "Lcf;")
    private static class93 field1417 = class147.method1066(" is already on your ignore list)3", -48);

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "Lcf;")
    public static class93 field1423 = class147.method1066("Chargement des fichiers config )2 ", -48);

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "Lcf;")
    public static class93 field1420 = field1417;

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "Lcf;")
    public static class93 field1425 = class147.method1066("(U0a )2 via: ", -48);

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "Lcf;")
    public static class93 field1426 = class147.method1066(" x ", -48);

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!ng", name = "D", descriptor = "Lcf;")
    private static class93 field1428 = class147.method1066("white:", -48);

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "Lcf;")
    public static class93 field1422 = class147.method1066("Kampfstufe: ", -48);

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "Lcf;")
    public static class93 field1416 = field1428;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "Lcf;")
    public static class93 field1421 = field1428;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "Lhg;")
    public static class177 field1418;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[[I")
    public static int[][] field1406;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BZLvh;)V")
    public static final void method529(byte arg0, boolean arg1, class274 arg2) {
        field1407++;
        if (arg1) {
            int var3 = class169.field2968;
            int var4 = var3 * 956 / 503;
            class68.field1241.method563((class150.field2629 - var4) / 2, 0, var4, var3);
            class56.field930.method1235(class150.field2629 / 2 - (class56.field930.field3541 / 2), 18);
        }
        arg2.method1836(class18.field233, class150.field2629 / 2, class169.field2968 / 2 - 26, 16777215, -1);
        int var5 = class169.field2968 / 2 - 18;
        class75.method513(class150.field2629 / 2 - 152, var5, 304, 34, 9179409);
        class75.method513(class150.field2629 / 2 - 151, var5 + 1, 302, 32, 0);
        class75.method517(class150.field2629 / 2 - 150, var5 + 2, class4.field54 * 3, 30, 9179409);
        class75.method517(class150.field2629 / 2 + (class4.field54 * 3) - 150, var5 - -2, 300 - (class4.field54 * 3), 30, 0);
        arg2.method1836(class276.field4934, class150.field2629 / 2, class169.field2968 / 2 + 4, 16777215, -1);
        int var6 = 66 / ((arg0 - 15) / 61);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
    public final void method530(int arg0) {
        for (int var2 = arg0; var2 < this.field1411; var2++) {
            this.field1399[var2] = null;
        }
        field1401++;
        this.field1412 = null;
        this.field1399 = null;
        this.field1415.method1153((byte) -6);
        this.field1415 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
    public static void method531(int arg0) {
        field1422 = null;
        field1416 = null;
        field1406 = null;
        field1428 = null;
        field1425 = null;
        field1402 = null;
        field1420 = null;
        field1417 = null;
        field1418 = null;
        field1419 = null;
        field1426 = null;
        field1421 = null;
        if (arg0 != -1) {
            method533(70, 27, true, -71, -80, -20);
        }
        field1423 = null;
        field1409 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BI)[I")
    public final int[] method532(byte arg0, int arg1) {
        field1400++;
        if (arg0 <= 63) {
            this.method532((byte) -11, -89);
        }
        if (this.field1411 == this.field1405) {
            this.field1424 = this.field1412[arg1] == null;
            this.field1412[arg1] = class82.field1500;
            return this.field1399[arg1];
        } else if (this.field1411 == 1) {
            this.field1424 = this.field1403 != arg1;
            this.field1403 = arg1;
            return this.field1399[0];
        } else {
            class6 var3 = this.field1412[arg1];
            if (var3 == null) {
                this.field1424 = true;
                if (this.field1411 <= this.field1408) {
                    class6 var4 = (class6) this.field1415.method1161(-1059);
                    var3 = new class6(arg1, var4.field85);
                    this.field1412[var4.field80] = null;
                    var4.method1544((byte) -114);
                } else {
                    var3 = new class6(arg1, this.field1408);
                    this.field1408++;
                }
                this.field1412[arg1] = var3;
            } else {
                this.field1424 = false;
            }
            this.field1415.method1160(var3, false);
            return this.field1399[var3.field85];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIZIII)V")
    public static final void method533(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field1410++;
        class120.field2134 = (short) arg4;
        if (arg5 == 30679) {
            class254.field4594 = (short) arg3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)[[I")
    public final int[][] method534(int arg0) {
        field1414++;
        if (this.field1411 != this.field1405) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1411; var2++) {
            this.field1412[var2] = class82.field1500;
        }
        if (arg0 != 1) {
            this.method530(2);
        }
        return this.field1399;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(III)V")
    public class76(int arg0, int arg1, int arg2) {
        this.field1405 = arg1;
        this.field1412 = new class6[this.field1405];
        this.field1411 = arg0;
        this.field1399 = new int[this.field1411][arg2];
    }
}
