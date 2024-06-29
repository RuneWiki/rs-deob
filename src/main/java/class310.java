import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class310 {

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[S")
    public static short[] field4686 = new short[] { 49, 10, 58, 15, 21, 18, 44, 45 };

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4685 = 0;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Z")
    public static boolean field4692 = false;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field4681 = new String[200];

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lct;")
    public static class285 field4687 = new class285(40, 5);

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field4694 = 0;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public int field4680;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public int field4689;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public int field4695;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public int field4696;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Ltr;")
    public static class229 field4690;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "[B")
    public byte[] field4682;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "[B")
    public byte[] field4697;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static final void method1927(int arg0) {
        field4691++;
        class205.method1396(101, class100.field1419);
        class35.field433++;
        if (field4692 && class360.field5458) {
            int var1 = class78.field1105.method1975(88);
            int var2 = class78.field1105.method1984((byte) -48);
            int var3 = var1 - class338.field5071;
            if (arg0 == 24600) {
                int var4 = var2 - class382.field5658;
                if (class47.field684 > var3) {
                    var3 = class47.field684;
                }
                if (var3 + class100.field1419.field2595 > class47.field684 - -class245.field3509.field2595) {
                    var3 = class47.field684 + class245.field3509.field2595 - class100.field1419.field2595;
                }
                if (var4 < class454.field6461) {
                    var4 = class454.field6461;
                }
                if ((class100.field1419.field2589 + var4) > (class454.field6461 + class245.field3509.field2589)) {
                    var4 = class454.field6461 - (class100.field1419.field2589 - class245.field3509.field2589);
                }
                int var5 = var3 + class245.field3509.field2530 - class47.field684;
                int var6 = var4 + class245.field3509.field2620 - class454.field6461;
                if (class78.field1105.method1977((byte) 125)) {
                    if (class100.field1419.field2550 < class35.field433) {
                        int var8 = var3 - class287.field4384;
                        int var9 = var4 - class123.field1694;
                        if (class100.field1419.field2637 < var8 || -class100.field1419.field2637 > var8 || var9 > class100.field1419.field2637 || var9 < (-class100.field1419.field2637)) {
                            class53.field756 = true;
                        }
                    }
                    if (class100.field1419.field2582 != null && class53.field756) {
                        class415 var10 = new class415();
                        var10.field5989 = class100.field1419.field2582;
                        var10.field5980 = var6;
                        var10.field5983 = var5;
                        var10.field5990 = class100.field1419;
                        class477.method2797(var10);
                    }
                } else {
                    if (class53.field756) {
                        class110.method809((byte) -111);
                        if (class100.field1419.field2617 != null) {
                            class415 var7 = new class415();
                            var7.field5989 = class100.field1419.field2617;
                            var7.field5983 = var5;
                            var7.field5990 = class100.field1419;
                            var7.field5979 = class349.field5313;
                            var7.field5980 = var6;
                            class477.method2797(var7);
                        }
                        if (class349.field5313 != null && client.method2772(class100.field1419) != null) {
                            class303.method1886(arg0 - 24603, class100.field1419, class349.field5313);
                        }
                    } else if ((class358.field5435 == 1 || class468.method2745(arg0 ^ 0x6041)) && class186.field2817 > 2) {
                        class384.method2336(class338.field5071 + class287.field4384, class382.field5658 + class123.field1694, true);
                    } else if (class100.method769((byte) -28)) {
                        class384.method2336(class338.field5071 + class287.field4384, class382.field5658 + class123.field1694, true);
                    }
                    class100.field1419 = null;
                }
            }
        } else if (class35.field433 > 1) {
            class100.field1419 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLtq;)V")
    public static final void method1928(byte arg0, class63 arg1) {
        if (class166.field2335) {
            class24.method213((byte) -126, arg1);
        } else {
            class169.method1172(114, arg1);
        }
        field4684++;
        if (arg0 < 18) {
            field4693 = 91;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)V")
    public static void method1929(int arg0) {
        field4686 = null;
        if (arg0 != -3) {
            field4685 = 21;
        }
        field4690 = null;
        field4681 = null;
        field4687 = null;
    }
}
