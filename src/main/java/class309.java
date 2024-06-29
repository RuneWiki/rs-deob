import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class309 {

    @OriginalMember(owner = "client!js", name = "e", descriptor = "[I")
    public static int[] field3893 = new int[13];

    @OriginalMember(owner = "client!js", name = "h", descriptor = "Z")
    public static boolean field3896 = false;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "[I")
    public static int[] field3903 = new int[6];

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public int field3897;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public int field3899;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public int field3900;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public int field3902;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Loa;")
    public static class650 field3898;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "[B")
    public byte[] field3889;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "[B")
    public byte[] field3894;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1828(int arg0) {
        field3898 = null;
        field3903 = null;
        if (arg0 >= -63) {
            field3896 = false;
        }
        field3893 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZILcu;)V")
    public static final void method1829(boolean arg0, int arg1, class207 arg2) {
        field3891++;
        if (class141.field1697 >= 50 || arg2 == null || arg2.field2439 == null || arg1 >= arg2.field2439.length || arg2.field2439[arg1] == null) {
            return;
        }
        if (!arg0) {
            method1828(53);
        }
        int var3 = arg2.field2439[arg1][0];
        int var4 = var3 >> 8;
        int var5 = (var3 & 0xEB) >> 5;
        if (arg2.field2439[arg1].length > 1) {
            int var6 = (int) ((double) arg2.field2439[arg1].length * Math.random());
            if (var6 > 0) {
                var4 = arg2.field2439[arg1][var6];
            }
        }
        if (arg2.field2448) {
            class606.method3374(var4, (byte) 102, 0, 255, false, var5);
        } else {
            class132.method852(255, (byte) -47, var4, 0, var5);
        }
    }
}
