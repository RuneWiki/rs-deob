import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class75 {

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "B")
    public byte field1028;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Llca;")
    public class137 field1022;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "Llca;")
    public class137 field1034;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Lida;")
    public class138 field1024;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Ldfa;")
    public class391 field1031;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lev;")
    public class597 field1026;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Lev;")
    public class597 field1030;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lwr;")
    public class699 field1021;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lvf;")
    public class75 field1023;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "S")
    public short field1027;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "S")
    public short field1029;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "S")
    public short field1032;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "S")
    public short field1033;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "[B")
    public static byte[] field1020;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 3)
    public static void method444(int arg0) {
        field1020 = null;
        int var1 = 24 / ((arg0 + 12) / 56);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V", line = 17)
    public final void method445(boolean arg0) {
        field1019++;
        while (this.field1024 != null) {
            class138 var2 = this.field1024.field1789;
            this.field1024.method794(-501);
            this.field1024 = var2;
        }
        if (arg0) {
            method446(-62, 13, 73, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIB)I", line = 36)
    public static final int method446(int arg0, int arg1, int arg2, byte arg3) {
        field1025++;
        if (arg0 == arg1) {
            return arg0;
        }
        int var4 = 128 - arg2;
        if (arg3 != 99) {
            method446(-17, -89, 70, (byte) -112);
        }
        int var5 = (arg0 & 0x7F) * var4 + ((arg1 & 0x7F) * arg2) >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg1 & 0x380) * arg2 >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + (arg1 & 0xFC00) * arg2 >> 7;
        return var5 & 0x7F | var7 & 0xFC00 | var6 & 0x380;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V", line = 57)
    public class75(int arg0) {
        this.field1028 = (byte) arg0;
    }
}
