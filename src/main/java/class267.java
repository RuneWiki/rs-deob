import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class267 {

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    public int field4014 = 443;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Z")
    public boolean field4015 = false;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public int field4013 = 43594;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "[I")
    public static int[] field4018 = new int[16];

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "I")
    public int field4020;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Ljava/lang/String;")
    public String field4009;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method1715(boolean arg0) {
        field4018 = null;
        if (arg0) {
            field4018 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;II)V")
    public static final void method1716(int arg0, String arg1, String arg2, int arg3, String arg4, String arg5, int arg6, int arg7) {
        field4010++;
        class450 var8 = class262.field3960[99];
        for (int var9 = arg0; var9 > 0; var9--) {
            class262.field3960[var9] = class262.field3960[var9 - 1];
        }
        if (var8 == null) {
            var8 = new class450(arg7, arg3, arg4, arg1, arg5, arg6, arg2);
        } else {
            var8.method2681(arg5, arg6, arg2, arg3, arg4, arg0 ^ 0x63, arg1, arg7);
        }
        class182.field2679 = class426.field6113;
        class515.field7471++;
        class262.field3960[0] = var8;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(II)Lvv;")
    public static final class219 method1717(int arg0, int arg1) {
        field4019++;
        int var2 = -34 % ((arg1 - 63) / 52);
        return class92.field1483 && arg0 >= class455.field6620 && arg0 <= class22.field231 ? class488.field7055[arg0 - class455.field6620] : null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLah;)Z")
    public final boolean method1718(byte arg0, class267 arg1) {
        if (arg0 != 17) {
            return true;
        }
        field4017++;
        if (arg1 == null) {
            return false;
        } else {
            return this.field4020 == arg1.field4020 && this.field4009.equals(arg1.field4009);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
    public final int method1719(byte arg0) {
        field4012++;
        if (this.field4015) {
            return this.field4014;
        } else if (arg0 >= -118) {
            return -51;
        } else {
            return this.field4013;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)Z")
    public static final boolean method1720(int arg0, byte arg1) {
        field4016++;
        for (class341 var2 = (class341) class258.field3829.method863(-1); var2 != null; var2 = (class341) class258.field3829.method865(-1)) {
            if (class15.method85(var2.field5039, -20) && (long) arg0 == var2.field5037) {
                return true;
            }
        }
        if (arg1 != 117) {
            method1716(-22, null, null, 76, null, null, -83, -29);
        }
        return false;
    }
}
