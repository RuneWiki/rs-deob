import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TGYZPJQJ")
public class class55 {

    @OriginalMember(owner = "client!TGYZPJQJ", name = "h", descriptor = "I")
    public int field1324 = -1;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "j", descriptor = "[I")
    public int[] field1326 = new int[6];

    @OriginalMember(owner = "client!TGYZPJQJ", name = "k", descriptor = "[I")
    public int[] field1327 = new int[6];

    @OriginalMember(owner = "client!TGYZPJQJ", name = "l", descriptor = "I")
    public int field1328 = 128;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "m", descriptor = "I")
    public int field1329 = 128;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "q", descriptor = "LACKKZISC;")
    public static class1 field1333 = new class1(false, 30);

    @OriginalMember(owner = "client!TGYZPJQJ", name = "b", descriptor = "I")
    private int field1318;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "c", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "d", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "f", descriptor = "I")
    public int field1322;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "g", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "n", descriptor = "I")
    public int field1330;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "o", descriptor = "I")
    public int field1331;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "p", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "i", descriptor = "LLZZHVUJR;")
    public class33 field1325;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "Z")
    private static boolean field1317;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "e", descriptor = "[LTGYZPJQJ;")
    public static class55[] field1321;

    @OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "(ZLFXNTEMPE;)V")
    public static void method442(boolean arg0, class18 arg1) {
        class50 var2 = new class50(arg1.method212("spotanim.dat", null), -46859);
        field1320 = var2.method390();
        if (!arg0) {
            field1317 = !field1317;
        }
        if (field1321 == null) {
            field1321 = new class55[field1320];
        }
        for (int var3 = 0; var3 < field1320; var3++) {
            if (field1321[var3] == null) {
                field1321[var3] = new class55();
            }
            field1321[var3].field1322 = var3;
            field1321[var3].method443(var2, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "(LRSWRPCHR;B)V")
    public void method443(class50 arg0, byte arg1) {
        if (arg1 != 46) {
            this.field1319 = -115;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method388();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1323 = arg0.method390();
                } else if (var3 == 2) {
                    this.field1324 = arg0.method390();
                    if (class33.field963 != null) {
                        this.field1325 = class33.field963[this.field1324];
                    }
                } else if (var3 == 4) {
                    this.field1328 = arg0.method390();
                } else if (var3 == 5) {
                    this.field1329 = arg0.method390();
                } else if (var3 == 6) {
                    this.field1330 = arg0.method390();
                } else if (var3 == 7) {
                    this.field1331 = arg0.method388();
                } else if (var3 == 8) {
                    this.field1332 = arg0.method388();
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1326[var3 - 40] = arg0.method390();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1327[var3 - 50] = arg0.method390();
                } else {
                    System.out.println("Error unrecognised spotanim config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!TGYZPJQJ", name = "a", descriptor = "()LWRJMHIDY;")
    public class61 method444() {
        class61 var1 = (class61) field1333.method1((long) this.field1322);
        if (var1 != null) {
            return var1;
        }
        class61 var2 = class61.method466(this.field1323);
        if (var2 == null) {
            return null;
        }
        for (int var3 = 0; var3 < 6; var3++) {
            if (this.field1326[0] != 0) {
                var2.method480(this.field1326[var3], this.field1327[var3]);
            }
        }
        field1333.method2(this.field1318, (long) this.field1322, var2);
        return var2;
    }
}
