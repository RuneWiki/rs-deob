import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class191 {

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "J")
    public long field2333;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "Ljava/lang/String;")
    public String field2334;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Ljava/lang/String;")
    public String field2330;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public int field2327;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public int field2326;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[I")
    public static int[] field2332 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;CI)I", line = 11)
    public static final int method1176(String arg0, char arg1, int arg2) {
        field2328++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1 == arg0.charAt(var5)) {
                var3++;
            }
        }
        if (arg2 <= 23) {
            method1179(123);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 43)
    public class191(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field2333 = arg4;
        this.field2334 = arg1;
        this.field2330 = arg3;
        this.field2327 = arg0;
        this.field2326 = arg2;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 55)
    public static final void method1177(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class342.method1972(arg0 ^ 0x1)) {
            if (class652.field9237 == null) {
                class658.method3725(arg0 - 2);
            }
            class636.field9115 = true;
            class112.field1433 = 0;
        }
        field2329++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BZ)V", line = 74)
    public static final void method1178(byte arg0, boolean arg1) {
        field2335++;
        class91.field1283++;
        class543 var2 = class299.method1780(class84.field1196, class189.field2306, 48);
        class511.method3028(7482, var2);
        if (arg0 >= -33) {
            method1179(-125);
        }
        for (class21 var3 = (class21) class113.field1442.method3669((byte) 28); var3 != null; var3 = (class21) class113.field1442.method3676((byte) -12)) {
            if (!var3.method3047(32)) {
                var3 = (class21) class113.field1442.method3669((byte) 28);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field541 == 0) {
                class658.method3727(arg1, 7070, true, var3);
            }
        }
        if (client.field3750 != null) {
            class314.method1836(client.field3750, false);
            client.field3750 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 115)
    public static void method1179(int arg0) {
        if (arg0 >= -127) {
            method1177(91);
        }
        field2332 = null;
    }
}
