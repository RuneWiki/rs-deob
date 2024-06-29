import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class74 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public int field1336 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public int field1335 = 2048;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public int field1340 = 2048;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public int field1342 = 0;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field1337 = 0;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IF[BFIFLqg;FIBIFI)V")
    public static final void method697(int arg0, float arg1, byte[] arg2, float arg3, int arg4, float arg5, class463 arg6, float arg7, int arg8, byte arg9, int arg10, float arg11, int arg12) {
        int var13 = 0;
        if (arg9 < 11) {
            method697(97, -1.4756906F, null, 0.7518226F, 93, -0.33127537F, null, -0.6670833F, 25, (byte) -96, 123, -1.8054857F, 43);
        }
        while (var13 < arg10) {
            class598.method3408(arg1, arg4, arg3, arg8, arg0, arg11, arg6, var13, (byte) 30, arg12, arg7, arg2, arg10, arg5);
            arg4 += arg0 * arg12;
            var13++;
        }
        field1341++;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)I")
    public static final int method698(int arg0, int arg1) {
        if (arg0 == 127) {
            field1343++;
            return arg1 & 0x7F;
        } else {
            return -32;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLcea;)V")
    public final void method699(byte arg0, class215 arg1) {
        if (arg0 != -69) {
            this.method701(-117, -120, null);
        }
        field1346++;
        while (true) {
            int var3 = arg1.method1535(255);
            if (var3 == 0) {
                return;
            }
            this.method701(var3, 4, arg1);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
    public static final void method700(String arg0, int arg1, String arg2, boolean arg3) {
        if (arg3) {
            field1338++;
            class274.field3850 = arg1;
            class640.field8799 = 2;
            class58.method613(arg2, false, arg0, (byte) -45);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILcea;)V")
    private final void method701(int arg0, int arg1, class215 arg2) {
        field1345++;
        if (arg1 != 4) {
            return;
        }
        if (arg0 == 1) {
            this.field1336 = arg2.method1535(255);
        } else if (arg0 == 2) {
            this.field1340 = arg2.method1478(arg1 + 842397940);
        } else if (arg0 == 3) {
            this.field1335 = arg2.method1478(arg1 ^ 0x3235F8FC);
            return;
        } else if (arg0 == 4) {
            this.field1342 = arg2.method1520(13638);
            return;
        }
    }
}
