import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public abstract class class26 {

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field381 = 255;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Ldf;")
    public static class51 field382 = class46.method233("::tele ", 100);

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Ldf;")
    public static class51 field383 = class46.method233("; version=1; path=)4; domain=", 100);

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Z")
    public static boolean field384 = false;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field385 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field380;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I[B)V")
    public abstract void method137(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ldf;IIII)V")
    public static final void method138(class51 arg0, int arg1, int arg2, int arg3, int arg4) {
        class213 var5 = class198.method1395(arg4 - 6948, arg2, arg1);
        field380++;
        if (var5 == null) {
            return;
        }
        if (var5.field3599 != null) {
            class205 var6 = new class205();
            var6.field3423 = var5.field3599;
            var6.field3427 = arg0;
            var6.field3433 = var5;
            var6.field3422 = arg3;
            class176.method1233(var6, (byte) -58);
        }
        boolean var7 = true;
        if (var5.field3640 > 0) {
            var7 = class190.method1362(var5, -114);
        }
        if (!var7 || !class179.method1278(client.method1061(var5), arg3 - 1, 3)) {
            return;
        }
        if (arg3 == 1) {
            class95.field1575.method424((byte) 75, 175);
            class95.field1575.method870(arg1, (byte) 12);
            class185.field3074++;
            class95.field1575.method895(arg4 - 7057, arg2);
        }
        if (arg3 == 2) {
            class95.field1575.method424((byte) 82, 146);
            class31.field448++;
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(-94, arg2);
        }
        if (arg3 == 3) {
            class95.field1575.method424((byte) 119, 207);
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(arg4 ^ 0xFFFFE4C3, arg2);
            class239.field4165++;
        }
        if (arg3 == 4) {
            class95.field1575.method424((byte) 75, 173);
            class262.field4591++;
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(arg4 ^ 0xFFFFE49E, arg2);
        }
        if (arg3 == 5) {
            class95.field1575.method424((byte) 99, 45);
            class12.field181++;
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(-65, arg2);
        }
        if (arg3 == 6) {
            class132.field2204++;
            class95.field1575.method424((byte) 70, 182);
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(arg4 - 7057, arg2);
        }
        if (arg4 != 6947) {
            method138((class51) null, 6, -38, -29, -67);
        }
        if (arg3 == 7) {
            class95.field1575.method424((byte) 92, 97);
            class204.field3410++;
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(-83, arg2);
        }
        if (arg3 == 8) {
            class95.field1575.method424((byte) 113, 0);
            class95.field1575.method870(arg1, (byte) 12);
            class243.field4208++;
            class95.field1575.method895(-27, arg2);
        }
        if (arg3 == 9) {
            class95.field1575.method424((byte) 73, 94);
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(-70, arg2);
            class78.field1247++;
        }
        if (arg3 == 10) {
            class85.field1429++;
            class95.field1575.method424((byte) 123, 238);
            class95.field1575.method870(arg1, (byte) 12);
            class95.field1575.method895(-34, arg2);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)[B")
    public abstract byte[] method139(int arg0);

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public static void method140(int arg0) {
        field382 = null;
        if (arg0 < 111) {
            field381 = 60;
        }
        field383 = null;
    }
}
