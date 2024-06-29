import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class293 extends class179 {

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    private int field4348;

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "[I")
    public static int[] field4356 = new int[100];

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "Ldp;")
    public static class174 field4352;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "Lpo;")
    public static class202 field4355;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "[Lq;")
    public class203[] field4354;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "[[B")
    private byte[][] field4347;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method2046(int arg0, int arg1) {
        field4349++;
        if (arg1 != 65280) {
            method2048((byte) 91);
        }
        return (arg0 >> 24 & 0xFF) + "." + ((arg0 & 0xFFE293) >> 16) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)Z")
    public final boolean method2047(int arg0, int arg1) {
        if (arg1 != -423207056) {
            this.method2050((byte) 124);
        }
        field4346++;
        return this.field4354[arg0].field2951;
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(B)V")
    public static void method2048(byte arg0) {
        field4356 = null;
        field4355 = null;
        field4352 = null;
        if (arg0 <= 118) {
            method2046(-89, -98);
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(II)Z")
    public final boolean method2049(int arg0, int arg1) {
        if (arg0 > -63) {
            return true;
        } else {
            field4353++;
            return this.field4354[arg1].field2955;
        }
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(B)Z")
    public final boolean method2050(byte arg0) {
        field4350++;
        if (arg0 < 111) {
            this.method2047(-93, -93);
        }
        if (this.field4354 != null) {
            return true;
        }
        if (this.field4347 == null) {
            if (!class394.field5759.method1357(this.field4348, (byte) 17)) {
                return false;
            }
            int[] var2 = class394.field5759.method1349(this.field4348, (byte) 94);
            this.field4347 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4347[var3] = class394.field5759.method1355(var2[var3], -12607, this.field4348);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4347.length; var5++) {
            byte[] var14 = this.field4347[var5];
            int var15 = var14[1] & 0xFF | var14[0] & 0xFF << 8;
            var4 &= class153.field2329.method1348(255, var15);
        }
        if (!var4) {
            return false;
        }
        class22 var6 = new class22();
        int var7 = class394.field5759.method1333(0, this.field4348);
        this.field4354 = new class203[var7];
        int[] var8 = class394.field5759.method1349(this.field4348, (byte) 85);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field4347[var9];
            int var11 = var10[1] & 0xFF | var10[0] & 0xFF << 8;
            class122 var12 = null;
            for (class122 var13 = (class122) var6.method157((byte) -125); var13 != null; var13 = (class122) var6.method145(-111)) {
                if (var13.field1932 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class122(var11, class153.field2329.method1336(-108, var11));
                var6.method148((byte) 123, var12);
            }
            this.field4354[var8[var9]] = new class203(var10, var12);
        }
        this.field4347 = null;
        return true;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V")
    public class293(int arg0) {
        this.field4348 = arg0;
    }
}
