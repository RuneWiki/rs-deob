import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class208 {

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Z")
    public static boolean field3721 = false;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Lcf;")
    public static class93 field3726 = class147.method1066("Chargement de la liste des serveurs", -48);

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lcf;")
    public static class93 field3727 = class147.method1066(")2", -48);

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Llj;")
    public static class25 field3722 = new class25(16);

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Lcf;")
    public static class93 field3733 = class147.method1066("blinken2:", -48);

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field3736 = -1;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public int field3719;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field3720;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public int field3723;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "[S")
    public static short[] field3734;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[[[I")
    public static int[][][] field3732;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method1465(int arg0) {
        field3726 = null;
        field3733 = null;
        int var1 = -86 % ((-arg0 - 70) / 48);
        field3734 = null;
        field3722 = null;
        field3732 = null;
        field3727 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLhg;)V")
    public static final void method1466(byte arg0, class177 arg1) {
        field3725++;
        class29.field379 = arg1;
        if (arg0 != 110) {
            method1465(-80);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V")
    public static final void method1467(int arg0, int arg1) {
        if (arg1 != 16) {
            field3735 = -101;
        }
        field3728++;
        class11 var2 = class272.field4835;
        synchronized (class272.field4835) {
            client.field2739 = arg0;
        }
    }
}
