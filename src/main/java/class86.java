import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class86 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Lng;")
    private class226 field1315 = new class226(64);

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lic;")
    private class491 field1318;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
    public static int[] field1317 = new int[99];

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
    public static int[] field1323;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Z")
    public static boolean field1325;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field1322;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[Lna;")
    public static class35[] field1324;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1317[var1] = var0 / 4;
        }
        field1320 = 0;
        new class475("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field1323 = new int[25];
        field1325 = false;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V", line = 7)
    public final void method502(byte arg0) {
        field1319++;
        class226 var2 = this.field1315;
        synchronized (this.field1315) {
            this.field1315.method1539(-60);
        }
        if (arg0 < 79) {
            method504(false);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 20)
    public final void method503(int arg0) {
        class226 var2 = this.field1315;
        synchronized (this.field1315) {
            if (arg0 != 25) {
                return;
            }
            this.field1315.method1540(0);
        }
        field1316++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V", line = 35)
    public static void method504(boolean arg0) {
        field1317 = null;
        if (arg0) {
            field1324 = null;
            field1323 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V", line = 48)
    public final void method505(int arg0, int arg1) {
        class226 var3 = this.field1315;
        synchronized (this.field1315) {
            this.field1315.method1534(0, arg1);
        }
        field1321++;
        if (arg0 >= -49) {
            this.method506(true, -68);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZI)Lfg;", line = 83)
    public final class83 method506(boolean arg0, int arg1) {
        field1322++;
        class226 var3 = this.field1315;
        class83 var4;
        synchronized (this.field1315) {
            var4 = (class83) this.field1315.method1536((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field1318.method2945(11, arg1, arg0);
        class83 var6 = new class83();
        if (var5 != null) {
            var6.method489((byte) -128, new class209(var5));
        }
        class226 var7 = this.field1315;
        synchronized (this.field1315) {
            this.field1315.method1542(var6, (byte) 112, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lai;ILic;)V", line = 111)
    public class86(class423 arg0, int arg1, class491 arg2) {
        this.field1318 = arg2;
        if (this.field1318 != null) {
            this.field1318.method2942(false, 11);
        }
    }
}
