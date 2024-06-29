import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class102 extends class322 {

    @OriginalMember(owner = "client!uq", name = "db", descriptor = "Lgd;")
    public static class206 field1466 = new class206("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!uq", name = "fb", descriptor = "[Z")
    public static boolean[] field1468 = new boolean[100];

    @OriginalMember(owner = "client!uq", name = "gb", descriptor = "Lgd;")
    public static class206 field1469 = new class206("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!uq", name = "hb", descriptor = "[J")
    public static long[] field1470 = new long[32];

    @OriginalMember(owner = "client!uq", name = "ib", descriptor = "I")
    public static int field1471 = 0;

    @OriginalMember(owner = "client!uq", name = "cb", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!uq", name = "eb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!uq", name = "jb", descriptor = "[[I")
    public static int[][] field1472;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1469 = null;
        field1468 = null;
        if (arg0 != 1) {
            method620(50);
        }
        field1472 = null;
        field1466 = null;
        field1470 = null;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(IB)[[I")
    public final int[][] method48(int arg0, byte arg1) {
        ++field1467;
        int[][] var3 = super.field4343.method2356(arg0, 74);
        if (arg1 > -52) {
            field1470 = null;
        }
        if (super.field4343.field5336 && this.method1787(9395)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field4294 * super.field4294;
            for (int var8 = 0; class181.field2495 > var8; ++var8) {
                int var9 = super.field4287[var8 % super.field4283 + var7];
                var6[var8] = class99.method612(var9, 255) << 4;
                var5[var8] = class99.method612(var9 >> 4, 4080);
                var4[var8] = class99.method612(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
    public static final int method621(int arg0, int arg1) {
        return class136.field1977 != null ? class136.field1977[arg0][arg1] & 16777215 : 0;
    }
}
