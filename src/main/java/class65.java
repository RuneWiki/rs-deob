import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class65 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public int field1358 = -1;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Z")
    public boolean field1360 = false;

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "Lmc;")
    public class83 field1368 = null;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
    public int[] field1365;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
    public int[] field1366;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "[I")
    public int[] field1363;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[I")
    public int[] field1361;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "[I")
    private static int[] field1359 = new int[500];

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
    private static int[] field1364 = new int[500];

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "[I")
    private static int[] field1362 = new int[500];

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "[I")
    private static int[] field1367 = new int[500];

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V")
    public static void method471() {
        field1359 = null;
        field1364 = null;
        field1367 = null;
        field1362 = null;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([BLmc;)V")
    public class65(byte[] arg0, class83 arg1) {
        this.field1368 = arg1;
        class109 var3 = new class109(arg0);
        class109 var4 = new class109(arg0);
        var3.field2583 = 2;
        int var5 = var3.method838(255);
        int var6 = -1;
        int var7 = 0;
        var4.field2583 = var3.field2583 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method838(255);
            if (var10 > 0) {
                if (this.field1368.field1855[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1368.field1855[var11] == 0) {
                            field1359[var7] = var11;
                            field1364[var7] = 0;
                            field1367[var7] = 0;
                            field1362[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1359[var7] = var8;
                short var12 = 0;
                if (this.field1368.field1855[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1364[var7] = var12;
                } else {
                    field1364[var7] = var4.method830(true);
                }
                if ((var10 & 0x2) == 0) {
                    field1367[var7] = var12;
                } else {
                    field1367[var7] = var4.method830(true);
                }
                if ((var10 & 0x4) == 0) {
                    field1362[var7] = var12;
                } else {
                    field1362[var7] = var4.method830(true);
                }
                var6 = var8;
                var7++;
                if (this.field1368.field1855[var8] == 5) {
                    this.field1360 = true;
                }
            }
        }
        if (arg0.length != var4.field2583) {
            throw new RuntimeException();
        }
        this.field1358 = var7;
        this.field1365 = new int[var7];
        this.field1366 = new int[var7];
        this.field1363 = new int[var7];
        this.field1361 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1365[var9] = field1359[var9];
            this.field1366[var9] = field1364[var9];
            this.field1363[var9] = field1367[var9];
            this.field1361[var9] = field1362[var9];
        }
    }
}
