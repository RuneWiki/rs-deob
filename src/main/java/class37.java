import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!sa")
public abstract class class37 extends class16 {

    @OriginalMember(owner = "mapview!sa", name = "x", descriptor = "Z")
    public static boolean field459 = true;

    @OriginalMember(owner = "mapview!sa", name = "A", descriptor = "I")
    public static int field462 = 1;

    @OriginalMember(owner = "mapview!sa", name = "u", descriptor = "I")
    public static int field456 = 0;

    @OriginalMember(owner = "mapview!sa", name = "z", descriptor = "I")
    public static int field461 = 0;

    @OriginalMember(owner = "mapview!sa", name = "D", descriptor = "Lua;")
    public static class41 field465 = class16.method86("Requesting", true);

    @OriginalMember(owner = "mapview!sa", name = "G", descriptor = "Lua;")
    public static class41 field468 = class16.method86("Hair Dressers", true);

    @OriginalMember(owner = "mapview!sa", name = "B", descriptor = "Lua;")
    public static class41 field463 = class16.method86("labels)3dat", true);

    @OriginalMember(owner = "mapview!sa", name = "I", descriptor = "Lua;")
    public static class41 field469 = class16.method86("75(U", true);

    @OriginalMember(owner = "mapview!sa", name = "y", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "mapview!sa", name = "C", descriptor = "I")
    public int field464;

    @OriginalMember(owner = "mapview!sa", name = "E", descriptor = "I")
    public int field466;

    @OriginalMember(owner = "mapview!sa", name = "F", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "mapview!sa", name = "w", descriptor = "[Lj;")
    public static class18[] field458;

    @OriginalMember(owner = "mapview!sa", name = "v", descriptor = "[Lua;")
    public static class41[] field457;

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(II)I", line = 12)
    public static int method206(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(I[BII)Lua;", line = 20)
    public static final class41 method207(int arg0, byte[] arg1, int arg2, int arg3) {
        class41 var4 = new class41();
        var4.field503 = 0;
        var4.field509 = new byte[arg0];
        int var5 = arg3;
        if (arg2 >= -11) {
            method211((byte) -121);
        }
        while (var5 < arg0 + arg3) {
            if (arg1[var5] != 0) {
                var4.field509[var4.field503++] = arg1[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "(B)V", line = 77)
    public static void method208(byte arg0) {
        field468 = null;
        field469 = null;
        field465 = null;
        if (arg0 < 4) {
            method209(99);
        }
        field458 = null;
        field463 = null;
        field457 = null;
    }

    @OriginalMember(owner = "mapview!sa", name = "e", descriptor = "(I)V", line = 103)
    public static final void method209(int arg0) {
        class43.field541 = null;
        class17.field150 = null;
        class1.field3 = null;
        class23.field245 = null;
        class39.field478 = null;
        class9.field95 = null;
        if (arg0 != 854741736) {
            method210((byte) -96);
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "(B)B", line = 120)
    public static final byte method210(byte arg0) {
        if (arg0 > -48) {
            field468 = null;
        }
        return class23.field247 == null ? 0 : class23.field247[class42.field514];
    }

    @OriginalMember(owner = "mapview!sa", name = "c", descriptor = "(B)B", line = 139)
    public static final byte method211(byte arg0) {
        if (arg0 == -96) {
            return class40.field493 == null ? 0 : class40.field493[class42.field514];
        } else {
            return 6;
        }
    }
}
