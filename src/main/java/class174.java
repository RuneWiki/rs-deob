import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class174 extends class213 {

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Z")
    public boolean field3446 = false;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field3447 = 1;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lob;")
    public static class141 field3449 = class175.method1195(40, "mod_icons");

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field3452 = 0;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "Lob;")
    private static class141 field3456 = class175.method1195(40, "Login limit exceeded)3");

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field3448 = 0;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public static int field3461 = 1;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "Lob;")
    public static class141 field3460 = class175.method1195(40, "<img=0>");

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field3464 = 0;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Lob;")
    public static class141 field3450 = field3456;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "I")
    public int field3454;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public int field3459;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "Lkc;")
    public static class102 field3453;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Lmd;")
    public static class123 field3457;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "[Lkc;")
    public static class102[] field3451;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIILob;)V")
    public static final void method1191(int arg0, int arg1, int arg2, int arg3, class141 arg4) {
        class170 var5 = class204.method1352(arg1, (byte) 56, arg2);
        field3455++;
        if (arg0 != 23428) {
            field3461 = -53;
        }
        if (var5 == null) {
            return;
        }
        if (var5.field3288 != null) {
            class220 var6 = new class220();
            var6.field4164 = arg3;
            var6.field4154 = arg4;
            var6.field4177 = var5.field3288;
            var6.field4168 = var5;
            class224.method1441(-128, var6);
        }
        boolean var7 = true;
        if (var5.field3314 > 0) {
            var7 = class118.method768(var5, false);
        }
        if (!var7 || !class25.method177(class26.method180(var5, 18125), arg3 - 1, 1)) {
            return;
        }
        if (arg3 == 1) {
            class7.field120.method32(58, 12885);
            class197.field3771++;
            class7.field120.method970(arg2, (byte) 19);
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 2) {
            class220.field4167++;
            class7.field120.method32(222, arg0 - 10543);
            class7.field120.method970(arg2, (byte) 14);
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 3) {
            class100.field1951++;
            class7.field120.method32(97, 12885);
            class7.field120.method970(arg2, (byte) -116);
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 4) {
            class20.field346++;
            class7.field120.method32(201, arg0 - 10543);
            class7.field120.method970(arg2, (byte) -124);
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 5) {
            class39.field790++;
            class7.field120.method32(161, 12885);
            class7.field120.method970(arg2, (byte) -124);
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 6) {
            class7.field120.method32(127, 12885);
            class11.field227++;
            class7.field120.method970(arg2, (byte) -118);
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 7) {
            class144.field2775++;
            class7.field120.method32(72, 12885);
            class7.field120.method970(arg2, (byte) -124);
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 8) {
            class7.field120.method32(27, 12885);
            class7.field120.method970(arg2, (byte) 6);
            class40.field799++;
            class7.field120.method972(26894, arg1);
        }
        if (arg3 == 9) {
            class7.field120.method32(144, 12885);
            class7.field120.method970(arg2, (byte) 0);
            class7.field120.method972(26894, arg1);
            class18.field326++;
        }
        if (arg3 == 10) {
            class46.field881++;
            class7.field120.method32(249, arg0 - 10543);
            class7.field120.method970(arg2, (byte) -3);
            class7.field120.method972(arg0 + 3466, arg1);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method1192(byte arg0) {
        field3450 = null;
        if (arg0 <= 92) {
            method1191(-64, 75, 11, 45, null);
        }
        field3453 = null;
        field3449 = null;
        field3457 = null;
        field3451 = null;
        field3460 = null;
        field3456 = null;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IIIIII)V")
    public static final void method1193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3462++;
        if (arg5 != -23302) {
            method1193(33, 65, 74, 124, -125, 9);
        }
        if (arg0 == arg2) {
            class42.method275(arg5 ^ 0x5B7B, arg1, arg3, arg4, arg2);
        } else if (arg1 - arg2 >= class68.field1323 && class136.field2590 >= arg1 + arg2 && class35.field698 <= arg4 - arg0 && arg0 + arg4 <= class130.field2470) {
            class7.method46(arg4, arg2, (byte) -107, arg0, arg3, arg1);
        } else {
            class27.method192(2, arg1, arg2, arg0, arg3, arg4);
        }
    }
}
