import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class80 extends class255 {

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "Leb;")
    public static class230 field1452 = class68.method589(0, "blinken1:");

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "Leb;")
    public static class230 field1453 = class68.method589(0, ":clanreq:");

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "Z")
    public static boolean field1460 = false;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "[Lke;")
    public static class106[] field1462 = new class106[50];

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    public int field1463;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "Ldc;")
    public static class226 field1454;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "[Lal;")
    public static class221[] field1456;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIB)V")
    public final void method658(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = this.field1450 << 3;
        int var7 = (arg1 << 4) + (var6 & 0xF);
        int var8 = this.field1451 << 3;
        field1461++;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        if (arg4 < -53) {
            this.method102(var6, var8, var7, var9, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static void method659(boolean arg0) {
        field1462 = null;
        field1453 = null;
        if (arg0) {
            method659(false);
        }
        field1452 = null;
        field1454 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIII)V")
    public abstract void method102(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)V")
    public abstract void method113(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(II)V")
    public abstract void method112(int arg0, int arg1);

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)V")
    public abstract void method98(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "(II)V")
    public abstract void method106(int arg0, int arg1);

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII)V")
    public abstract void method105(int arg0, int arg1, int arg2, int arg3, int arg4);
}
