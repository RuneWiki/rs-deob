import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class88 {

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "B")
    public byte field1075 = 0;

    @OriginalMember(owner = "client!ct", name = "l", descriptor = "B")
    public byte field1074;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "B")
    public byte field1080;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "S")
    public short field1077;

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "S")
    public short field1079;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "B")
    public byte field1067;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "B")
    public byte field1069;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "B")
    public byte field1083;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "B")
    public byte field1085;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Lcs;")
    public class207 field1081;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "Luj;")
    public class237 field1078;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "Luj;")
    public class237 field1082;

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Lwm;")
    public class364 field1066;

    @OriginalMember(owner = "client!ct", name = "y", descriptor = "Lwm;")
    public class364 field1087;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "Lvg;")
    public class37 field1086;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "Lsk;")
    public class405 field1070;

    @OriginalMember(owner = "client!ct", name = "z", descriptor = "Lct;")
    public class88 field1088;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "Ld;")
    public class93 field1068;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "S")
    public short field1071;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "Z")
    public boolean field1072;

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "Z")
    public boolean field1084;

    @OriginalMember(owner = "client!ct", name = "A", descriptor = "Z")
    public boolean field1089;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "[Lvj;")
    public static class281[] field1073;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static void method491(int arg0) {
        field1073 = null;
        if (arg0 != 0) {
            field1073 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "<init>", descriptor = "(III)V")
    public class88(int arg0, int arg1, int arg2) {
        this.field1080 = this.field1074 = (byte) arg0;
        this.field1077 = (short) arg2;
        this.field1079 = (short) arg1;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(II)I")
    public static final int method492(int arg0, int arg1) {
        field1076++;
        if (arg0 != 16203) {
            method495(true, (class145) null, (byte) -125);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(JI)V")
    public static final void method493(long arg0, int arg1) {
        field1065++;
        class225.field3415.field4021 = 0;
        class225.field3415.method1753(true, class93.field1192.field1886);
        class225.field3415.method1722(arg0, true);
        class120.field1507 = 1;
        int var3 = -6 / ((-arg1 - 61) / 41);
        class166.field2435 = 0;
        class355.field5138 = -3;
        class42.field621 = 0;
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(I)V")
    public final void method494(int arg0) {
        while (this.field1068 != null) {
            class93 var2 = this.field1068.field1178;
            this.field1068.method530((byte) 29);
            this.field1068 = var2;
        }
        field1064++;
        if (arg0 == -24379) {
            this.field1075 = 0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZLdt;B)V")
    public static final void method495(boolean arg0, class145 arg1, byte arg2) {
        field1063++;
        int var3 = arg1.field2045 == 0 ? arg1.field2010 : arg1.field2045;
        int var4 = arg1.field1993 == 0 ? arg1.field2021 : arg1.field1993;
        class325.method2060(arg1.field1933, var4, var3, class112.field1421[arg1.field1933 >> 16], true, arg0);
        if (arg2 != 92) {
            method492(-109, -45);
        }
        if (arg1.field1943 != null) {
            class325.method2060(arg1.field1933, var4, var3, arg1.field1943, true, arg0);
        }
        class465 var5 = (class465) class146.field2146.method2761((long) arg1.field1933, (byte) -112);
        if (var5 != null) {
            class161.method1003(arg0, var3, var4, var5.field6502, (byte) 124);
        }
    }
}
