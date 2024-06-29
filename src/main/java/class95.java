import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public abstract class class95 extends class498 {

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "I")
    public int field1231;

    @OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
    private int field1236;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    private int field1227;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "F")
    public float field1228;

    @OriginalMember(owner = "client!ls", name = "A", descriptor = "I")
    public int field1239;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1226 = new Rectangle[100];

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "Leh;")
    public static class246 field1238;

    @OriginalMember(owner = "client!ls", name = "B", descriptor = "Lkn;")
    public static class530 field1240;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "[I")
    public static int[] field1242;

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "[I")
    public static int[] field1241;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!ls", name = "y", descriptor = "I")
    public static int field1237;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1226[var0] = new Rectangle();
        }
        field1238 = new class246(19, 20);
        field1240 = new class530("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");
        new class530("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
        field1242 = new int[16384];
        field1241 = new int[16384];
        double var1 = 3.834951969714103E-4D;
        for (int var3 = 0; var3 < 16384; var3++) {
            field1242[var3] = (int) (Math.sin((double) var3 * var1) * 32768.0D);
            field1241[var3] = (int) (Math.cos((double) var3 * var1) * 32768.0D);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BI)Lvf;", line = 7)
    public static final class106 method668(byte arg0, int arg1) {
        int var2 = -17 % ((-arg0 - 49) / 44);
        field1233++;
        class106 var3 = (class106) class17.field209.method1781(false, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class324.field4734.method426(arg1, (byte) 9, 0);
        if (var4 == null || var4.length <= 1) {
            return null;
        } else {
            class106 var5 = class330.method1985(0, var4);
            class17.field209.method1779(var5, (byte) -27, (long) arg1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)I", line = 33)
    public final int method669(byte arg0) {
        field1229++;
        int var2 = -42 % ((-arg0 - 31) / 40);
        return this.field1239;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 43)
    public static void method670(int arg0) {
        field1241 = null;
        field1226 = null;
        field1242 = null;
        field1238 = null;
        if (arg0 <= -127) {
            field1240 = null;
        }
    }

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "(I)I", line = 60)
    public final int method671(int arg0) {
        field1230++;
        if (arg0 != 0) {
            this.method669((byte) 17);
        }
        return this.field1227;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)I", line = 71)
    public final int method672(byte arg0) {
        field1232++;
        return arg0 == -41 ? this.field1243 : -47;
    }

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "(I)I", line = 83)
    public final int method673(int arg0) {
        if (arg0 != 10518) {
            this.field1228 = -1.1530252F;
        }
        field1235++;
        return this.field1231;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)I", line = 96)
    public final int method675(byte arg0) {
        field1237++;
        if (arg0 < 15) {
            field1241 = null;
        }
        return this.field1236;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)F", line = 126)
    public final float method676(boolean arg0) {
        if (arg0) {
            this.field1231 = -70;
        }
        field1234++;
        return this.field1228;
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIF)V", line = 156)
    public class95(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field1243 = arg0;
        this.field1231 = arg2;
        this.field1236 = arg3;
        this.field1227 = arg4;
        this.field1228 = arg5;
        this.field1239 = arg1;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)V")
    public abstract void method674(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(FI)V")
    public abstract void method677(float arg0, int arg1);
}
