import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class303 extends class61 {

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "Lwm;")
    public static class152 field5210 = class157.method1048("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100", 123);

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field5213 = 0;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "Lwm;")
    public static class152 field5211 = class157.method1048("Titelbild geladen)3", 103);

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field5214 = 0;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "I")
    public int field5208;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "I")
    public int field5219;

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public int field5223;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "Lwm;")
    public class152 field5215;

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "Lrd;")
    public static class171 field5220;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIZ)I", line = 9)
    public static final int method2113(int arg0, int arg1, boolean arg2) {
        field5222++;
        if (!arg2) {
            method2115(-121);
        }
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V", line = 37)
    public final void method2114(byte arg0) {
        this.field916 = Long.MIN_VALUE & this.field916 | class76.method507(-30994) + 500L;
        class125.field1753.method334((byte) 95, this);
        field5217++;
        if (arg0 <= 99) {
            this.method2117((byte) -44);
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V", line = 60)
    public static void method2115(int arg0) {
        if (arg0 == -127) {
            field5211 = null;
            field5220 = null;
            field5210 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)J", line = 80)
    public final long method2116(byte arg0) {
        field5224++;
        if (arg0 >= -105) {
            field5213 = 108;
        }
        return Long.MAX_VALUE & this.field916;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V", line = 94)
    public final void method2117(byte arg0) {
        this.field916 |= Long.MIN_VALUE;
        if (this.method2116((byte) -128) == 0L) {
            class283.field4814.method334((byte) 73, this);
        }
        field5212++;
        if (arg0 < 24) {
            field5211 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)I", line = 113)
    public final int method2118(int arg0) {
        int var2 = 52 / ((-arg0 - 4) / 57);
        field5216++;
        return (int) (this.field4689 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IIZ)Lak;", line = 126)
    public static final class311 method2119(int arg0, int arg1, boolean arg2) {
        field5218++;
        class311 var3 = (class311) class31.field520.method1221((byte) 48);
        if (arg2) {
            return (class311) null;
        }
        while (var3 != null) {
            if (var3.field5333 && var3.method2158(arg1, arg0, 0)) {
                return var3;
            }
            var3 = (class311) class31.field520.method1223(55);
        }
        return null;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)I", line = 151)
    public final int method2120(int arg0) {
        field5209++;
        if (arg0 != 0) {
            this.field5208 = -23;
        }
        return (int) this.field4689;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V", line = 165)
    public class303(int arg0, int arg1) {
        this.field4689 = (long) arg1 | (long) arg0 << 32;
    }
}
