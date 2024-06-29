import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class233 {

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public int field3136 = -1;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "Lvj;")
    public static class304 field3139 = new class304("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3141 = new String[100];

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "J")
    public static long field3140;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Ldf;")
    public static class274 field3138;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lsj;")
    public class318 field3133;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    public int[] field3135;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[Ljava/lang/String;")
    public String[] field3130;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1447(byte arg0) {
        class458.field6307 = null;
        class394.field5334 = null;
        class162.field2372 = null;
        field3137++;
        class174.field2530 = null;
        class461.field6371 = null;
        class201.field2781 = null;
        class304.field4003 = null;
        if (arg0 != -94) {
            method1447((byte) 64);
        }
        class268.field3534 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lii;ILii;ZIZB)I", line = 25)
    public static final int method1448(class386 arg0, int arg1, class386 arg2, boolean arg3, int arg4, boolean arg5, byte arg6) {
        field3131++;
        if (arg6 >= -48) {
            field3139 = null;
        }
        int var7 = class209.method1328(arg4, arg0, arg2, arg5, false);
        if (var7 != 0) {
            return arg5 ? -var7 : var7;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var8 = class209.method1328(arg1, arg0, arg2, arg3, false);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)V", line = 58)
    public static final void method1449(int arg0, int arg1) {
        if (arg1 <= 124) {
            field3141 = null;
        }
        if (class522.field7720 == null || arg0 > class522.field7720.length) {
            class522.field7720 = new int[arg0];
        }
        field3132++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 85)
    public static void method1450(int arg0) {
        field3141 = null;
        field3138 = null;
        field3139 = null;
        if (arg0 != -1) {
            field3140 = -35L;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILcr;Lcr;)V", line = 100)
    public static final void method1451(int arg0, class403 arg1, class403 arg2) {
        field3134++;
        class118.method822(-80, class202.field2802);
        class55.field863++;
        class193.field2708.method2214(58, arg1.field5431);
        class193.field2708.method2214(46, arg2.field5431);
        class193.field2708.method2198(arg1.field5530, (byte) -23);
        class193.field2708.method2246(arg2.field5530, (byte) -90);
        class193.field2708.method2241(arg0 ^ arg0, arg1.field5553);
        class193.field2708.method2188(arg2.field5553, arg0 ^ 0x10);
    }
}
