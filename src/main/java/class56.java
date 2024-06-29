import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class56 {

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Lga;")
    public class38 field1162 = null;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "Z")
    public boolean field1164 = false;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field1166 = -1;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "[I")
    public int[] field1156;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "[I")
    public int[] field1161;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "[I")
    public int[] field1160;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[I")
    public int[] field1159;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "[I")
    private static int[] field1163 = new int[500];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
    private static int[] field1158 = new int[500];

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "[I")
    private static int[] field1165 = new int[500];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "[I")
    private static int[] field1157 = new int[500];

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLga;)V", line = 42)
    public class56(byte[] arg0, class38 arg1) {
        this.field1162 = arg1;
        class27 var3 = new class27(arg0);
        class27 var4 = new class27(arg0);
        var3.field482 = 2;
        int var5 = var3.method231(255);
        int var6 = -1;
        int var7 = 0;
        var4.field482 = var3.field482 + var5;
        for (int var8 = 0; var8 < var5; var8++) {
            int var10 = var3.method231(255);
            if (var10 > 0) {
                if (this.field1162.field738[var8] != 0) {
                    for (int var11 = var8 - 1; var11 > var6; var11--) {
                        if (this.field1162.field738[var11] == 0) {
                            field1157[var7] = var11;
                            field1158[var7] = 0;
                            field1165[var7] = 0;
                            field1163[var7] = 0;
                            var7++;
                            break;
                        }
                    }
                }
                field1157[var7] = var8;
                short var12 = 0;
                if (this.field1162.field738[var8] == 3) {
                    var12 = 128;
                }
                if ((var10 & 0x1) == 0) {
                    field1158[var7] = var12;
                } else {
                    field1158[var7] = var4.method222((byte) 103);
                }
                if ((var10 & 0x2) == 0) {
                    field1165[var7] = var12;
                } else {
                    field1165[var7] = var4.method222((byte) 30);
                }
                if ((var10 & 0x4) == 0) {
                    field1163[var7] = var12;
                } else {
                    field1163[var7] = var4.method222((byte) 32);
                }
                var6 = var8;
                var7++;
                if (this.field1162.field738[var8] == 5) {
                    this.field1164 = true;
                }
            }
        }
        if (arg0.length != var4.field482) {
            throw new RuntimeException();
        }
        this.field1166 = var7;
        this.field1156 = new int[var7];
        this.field1161 = new int[var7];
        this.field1160 = new int[var7];
        this.field1159 = new int[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            this.field1156[var9] = field1157[var9];
            this.field1161[var9] = field1158[var9];
            this.field1160[var9] = field1165[var9];
            this.field1159[var9] = field1163[var9];
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V", line = 17)
    public static void method462() {
        field1157 = null;
        field1158 = null;
        field1165 = null;
        field1163 = null;
    }
}
