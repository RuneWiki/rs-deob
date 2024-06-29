import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class205 extends class194 {

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field3557;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "Loa;")
    public static class99 field3560 = class221.method1463(2844, "underlay");

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lgh;")
    public static class24 field3552 = new class24();

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Loa;")
    public static class99 field3561 = class221.method1463(2844, "Chargement des interfaces )2 ");

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "(B)V")
    public static final void method1375(byte arg0) {
        class193.field3390.method1813(-1);
        int var1 = -82 / ((arg0 - 9) / 50);
        class79.field1396.method1813(-1);
        field3553++;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)Z")
    public final boolean method53(byte arg0) {
        field3558++;
        if (arg0 != 67) {
            this.method52((byte) -64);
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public static void method1376(int arg0) {
        if (arg0 <= 42) {
            field3561 = null;
        }
        field3561 = null;
        field3560 = null;
        field3552 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
    public static final void method1377(int arg0, int arg1) {
        class65 var2 = class152.method1010(arg1, 8, (byte) -95);
        field3556++;
        if (arg0 != -1453091696) {
            method1379(-16, -16, (byte[]) null, (byte) -116);
        }
        var2.method426((byte) 116);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIII)I")
    public static final int method1378(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != -4585) {
            field3560 = null;
        }
        int var5 = 65536 - class134.field2344[arg3 * 1024 / arg1] >> 1;
        field3555++;
        return ((65536 - var5) * arg0 >> 16) + (arg4 * var5 >> 16);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II[BB)Loa;")
    public static final class99 method1379(int arg0, int arg1, byte[] arg2, byte arg3) {
        field3559++;
        class99 var4 = new class99();
        var4.field1682 = 0;
        var4.field1697 = new byte[arg1];
        for (int var5 = arg0; var5 < (arg0 + arg1); var5++) {
            if (arg2[var5] != 0) {
                var4.field1697[var4.field1682++] = arg2[var5];
            }
        }
        if (arg3 <= 60) {
            field3560 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class205(Object arg0) {
        this.field3557 = arg0;
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method52(byte arg0) {
        field3554++;
        int var2 = 18 % ((40 - arg0) / 40);
        return this.field3557;
    }
}
