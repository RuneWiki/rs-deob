import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class96 extends class445 {

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public int field1409;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "[I")
    public int[] field1411;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "[Z")
    public boolean[] field1406;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "[[I")
    public int[][] field1410;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[I")
    public int[] field1407;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1412 = new CRC32();

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "Ls;")
    public static class169 field1415 = new class169(0, 4);

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "Lmc;")
    public static class78 field1416 = new class78(45, 3);

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBZI)V")
    public static final void method597(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field1408++;
        class403.field5530 = 0L;
        if (arg2 <= 35) {
            return;
        }
        int var5 = class6.method41((byte) -121);
        if (arg1 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class98.field1432.method2085()) {
            arg3 = true;
        }
        class67.method442(false, arg4, arg0, var5, arg1, arg3);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method598(byte arg0) {
        field1416 = null;
        if (arg0 < -34) {
            field1412 = null;
            field1415 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)V")
    public static final void method599(int arg0, int arg1, byte arg2) {
        if (arg2 >= -37) {
            return;
        }
        field1413++;
        if (class409.field5600 == 1) {
            class220.method1248(class246.field3290, arg1, true, arg0);
        } else if (class409.field5600 == 2) {
            class469.method2756(arg1, false, arg0);
        }
        class409.field5600 = 0;
        class246.field3290 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(I[B)V")
    public class96(int arg0, byte[] arg1) {
        this.field1409 = arg0;
        class32 var3 = new class32(arg1);
        this.field1414 = var3.method201((byte) -118);
        this.field1411 = new int[this.field1414];
        this.field1406 = new boolean[this.field1414];
        this.field1410 = new int[this.field1414][];
        this.field1407 = new int[this.field1414];
        for (int var4 = 0; var4 < this.field1414; var4++) {
            this.field1407[var4] = var3.method201((byte) -105);
        }
        for (int var5 = 0; var5 < this.field1414; var5++) {
            this.field1406[var5] = var3.method201((byte) -115) == 1;
        }
        for (int var6 = 0; var6 < this.field1414; var6++) {
            this.field1411[var6] = var3.method215((byte) 118);
        }
        for (int var7 = 0; var7 < this.field1414; var7++) {
            this.field1410[var7] = new int[var3.method201((byte) -114)];
        }
        for (int var8 = 0; var8 < this.field1414; var8++) {
            for (int var9 = 0; var9 < this.field1410[var8].length; var9++) {
                this.field1410[var8][var9] = var3.method201((byte) -113);
            }
        }
    }
}
