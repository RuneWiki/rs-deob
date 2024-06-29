import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class36 extends class45 {

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
    public int[] field523 = new int[5];

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[Laj;")
    public class209[] field544 = new class209[5];

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public int field552 = 0;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public int field553;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public int field541;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public int field525;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "Z")
    public static boolean field521 = false;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Lji;")
    public static class315 field520 = new class315(5000);

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "[S")
    public static short[] field539 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "B")
    public byte field527;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
    public int field524;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public int field531;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public int field534;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Lia;")
    public class15 field530;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "Lob;")
    public class184 field537;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lvb;")
    public class187 field547;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Lof;")
    public static class222 field535;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Ltb;")
    public class232 field529;

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Lwf;")
    public static class250 field519;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Lwf;")
    public static class250 field551;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "Lqa;")
    public class338 field533;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Lme;")
    public class339 field526;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Laa;")
    public class36 field546;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "Lth;")
    public static class57 field522;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "Lan;")
    public class87 field538;

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "Z")
    public boolean field532;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "Z")
    public boolean field543;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "Z")
    public boolean field549;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V", line = 5)
    public static void method243(byte arg0) {
        field519 = null;
        field520 = null;
        field551 = null;
        field539 = null;
        field535 = null;
        if (arg0 >= 103) {
            field522 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lwf;B)V", line = 24)
    public static final void method244(class250 arg0, byte arg1) {
        class250 var2 = class180.method1413((byte) -23, arg0);
        field545++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class252.field4266;
            var4 = class298.field4779;
        } else {
            var3 = var2.field4157;
            var4 = var2.field4081;
        }
        class11.method45(-89, arg0, var4, false, var3);
        if (arg1 < 77) {
            field539 = (short[]) null;
        }
        class43.method315(var3, var4, (byte) -109, arg0);
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 50)
    public static final void method245(int arg0) {
        class11.field88 = null;
        field528++;
        class329.field5232 = (byte[][][]) null;
        class118.field2000 = null;
        class40.field590 = (byte[][][]) null;
        class319.field5081 = (byte[][][]) null;
        class74.field1267 = (byte[][][]) null;
        if (arg0 != -28644) {
            method245(-67);
        }
        class176.field2830 = null;
        class127.field2162 = (byte[][][]) null;
        class336.field5320 = (int[][][]) null;
        class23.field271 = null;
        class172.field2755 = null;
        class94.field1574 = null;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V", line = 73)
    public class36(int arg0, int arg1, int arg2) {
        this.field553 = arg2;
        this.field541 = this.field536 = arg0;
        this.field525 = arg1;
    }
}
