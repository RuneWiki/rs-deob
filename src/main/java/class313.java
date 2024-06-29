import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class313 extends class472 {

    @OriginalMember(owner = "client!go", name = "E", descriptor = "I")
    private int field4761;

    @OriginalMember(owner = "client!go", name = "B", descriptor = "[I")
    public static int[] field4758 = new int[32];

    @OriginalMember(owner = "client!go", name = "I", descriptor = "Ljp;")
    public static class55 field4765;

    @OriginalMember(owner = "client!go", name = "J", descriptor = "Lpn;")
    public static class49 field4766;

    @OriginalMember(owner = "client!go", name = "M", descriptor = "F")
    public static float field4768;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!go", name = "F", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!go", name = "G", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!go", name = "H", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!go", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4767;

    @OriginalMember(owner = "client!go", name = "D", descriptor = "[Ljm;")
    public class212[] field4760;

    @OriginalMember(owner = "client!go", name = "C", descriptor = "[[B")
    private byte[][] field4759;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)Z")
    public final boolean method2074(int arg0, int arg1) {
        if (arg0 != 255) {
            method2078((byte) 27);
        }
        field4764++;
        return this.field4760[arg1].field3218;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(II)Z")
    public final boolean method2075(int arg0, int arg1) {
        if (arg1 > -104) {
            method2078((byte) -21);
        }
        field4763++;
        return this.field4760[arg0].field3228;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(B)Z")
    public final boolean method2076(byte arg0) {
        field4762++;
        if (this.field4760 != null) {
            return true;
        }
        if (this.field4759 == null) {
            if (!class527.field7724.method757(true, this.field4761)) {
                return false;
            }
            int[] var2 = class527.field7724.method743(this.field4761, -439);
            this.field4759 = new byte[var2.length][];
            for (int var3 = 0; var3 < var2.length; var3++) {
                this.field4759[var3] = class527.field7724.method731(0, var2[var3], this.field4761);
            }
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field4759.length; var5++) {
            byte[] var14 = this.field4759[var5];
            int var15 = var14[1] & 0xFF | (var14[0] & 0xFF) << 8;
            var4 &= class59.field895.method739((byte) -105, var15);
        }
        if (!var4) {
            return false;
        }
        class44 var6 = new class44();
        int var7 = class527.field7724.method748(this.field4761, 12408);
        if (arg0 > -10) {
            this.field4761 = -100;
        }
        this.field4760 = new class212[var7];
        int[] var8 = class527.field7724.method743(this.field4761, -439);
        for (int var9 = 0; var9 < var8.length; var9++) {
            byte[] var10 = this.field4759[var9];
            int var11 = var10[1] & 0xFF | (var10[0] & 0xFF) << 8;
            class416 var12 = null;
            for (class416 var13 = (class416) var6.method295((byte) -73); var13 != null; var13 = (class416) var6.method296(true)) {
                if (var13.field6107 == var11) {
                    var12 = var13;
                    break;
                }
            }
            if (var12 == null) {
                var12 = new class416(var11, class59.field895.method735(var11, 0));
                var6.method292((byte) 121, var12);
            }
            this.field4760[var8[var9]] = new class212(var10, var12);
        }
        this.field4759 = null;
        return true;
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V")
    public class313(int arg0) {
        this.field4761 = arg0;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IB)Z")
    public final boolean method2077(int arg0, byte arg1) {
        int var3 = 62 % ((arg1 + 8) / 50);
        field4757++;
        return this.field4760[arg0].field3234;
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(B)V")
    public static void method2078(byte arg0) {
        field4758 = null;
        field4766 = null;
        field4767 = null;
        field4765 = null;
        if (arg0 > -18) {
            method2078((byte) -124);
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field4758[var1] = var0 - 1;
            var0 += var0;
        }
        field4765 = new class55(34, 20);
        field4766 = new class49(69, 8);
    }
}
