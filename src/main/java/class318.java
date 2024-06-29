import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class318 {

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "[I")
    public static int[] field4912 = new int[14];

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "Z")
    public static boolean field4915 = true;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[S")
    public static short[] field4923 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "[C")
    public static char[] field4922 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Loe;")
    public static class82 field4918;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 5)
    public static void method2209(byte arg0) {
        field4923 = null;
        field4912 = null;
        field4918 = null;
        field4922 = null;
        if (arg0 != 68) {
            method2212((float[]) null, false);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V", line = 25)
    public static final void method2210(int arg0) {
        for (int var1 = -1; var1 < class234.field3563; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class291.field4475[var1];
            }
            class270 var3 = class201.field3096[var2];
            if (var3 != null) {
                class324.method2251(var3.method1897(8), var3, 118);
            }
        }
        int var4 = 35 % ((arg0 + 82) / 38);
        field4921++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljd;I[Laf;)V", line = 58)
    public static final void method2211(class95 arg0, int arg1, class195[] arg2) {
        class183.field2898 = arg2;
        class311.field4829 = arg0;
        class258.field3951 = new boolean[class183.field2898.length];
        class224.field3418.method1713(0);
        int var3 = class311.field4829.method690((byte) -109, "details");
        int[] var4 = class311.field4829.method688(var3, 23201);
        field4919++;
        for (int var5 = arg1; var5 < var4.length; var5++) {
            class224.field3418.method1708((long) var4[var5], (byte) -79, class284.method1968(var4[var5], new class254(class311.field4829.method696(var4[var5], (byte) 125, var3)), (byte) 53));
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([FZ)[F", line = 82)
    public static final float[] method2212(float[] arg0, boolean arg1) {
        field4913++;
        if (arg0 == null) {
            return null;
        }
        if (!arg1) {
            method2211((class95) null, 25, (class195[]) null);
        }
        float[] var2 = new float[arg0.length];
        class126.method948(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZ)V", line = 108)
    public static final void method2213(int arg0, boolean arg1) {
        class261.field4017.method741(arg0, (byte) 110);
        if (arg1) {
            field4911 = 105;
        }
        field4920++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIB)V", line = 142)
    public static final void method2214(int arg0, int arg1, byte arg2) {
        field4914++;
        class85.field1236.method1141((byte) 40, 204);
        class298.field4583++;
        if (arg2 != -16) {
            method2209((byte) 96);
        }
        class85.field1236.method1773(arg0, false);
        class85.field1236.method1744(true, arg1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIZIILjd;)V", line = 156)
    public static final void method2215(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, class95 arg6) {
        class4.field52 = arg0;
        class220.field3364 = arg2;
        class333.field5191 = arg1;
        class77.field1135 = arg5;
        if (!arg3) {
            method2212((float[]) null, true);
        }
        class106.field1540 = 1;
        class23.field260 = arg4;
        field4917++;
        class268.field4171 = arg6;
    }
}
