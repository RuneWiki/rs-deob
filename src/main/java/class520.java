import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class520 extends class164 {

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "Lvr;")
    public class120 field7621;

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "I")
    public static int field7623;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLkfa;)I", line = 3)
    public static final int method3085(byte arg0, class557 arg1) {
        field7624++;
        class323 var2 = arg1.field8052;
        if (var2.field4315 != null) {
            var2 = var2.method1881(class410.field5804, (byte) 119);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4308;
        class573 var4 = arg1.method1280(arg0 ^ 0x67);
        if (arg1.field2634 == -1 || arg1.field2594) {
            var3 = var2.field4293;
        } else if (arg1.field2634 == var4.field8386 || arg1.field2634 == var4.field8382 || arg1.field2634 == var4.field8398 || arg1.field2634 == var4.field8358) {
            var3 = var2.field4310;
        } else if (arg1.field2634 == var4.field8389 || arg1.field2634 == var4.field8391 || arg1.field2634 == var4.field8405 || arg1.field2634 == var4.field8377) {
            var3 = var2.field4326;
        }
        if (arg0 != -104) {
            method3085((byte) -75, null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 41)
    public static final void method3086(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= arg3) {
            class359.method2018(class678.field9722[arg0], arg2, -60, arg4, arg3);
        } else {
            class359.method2018(class678.field9722[arg0], arg3, -79, arg4, arg2);
        }
        field7622++;
        int var5 = 99 % ((-arg1 - 61) / 62);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 63)
    public static final void method3087(int arg0) {
        int var1 = -8 % ((76 - arg0) / 43);
        if (class268.field3680 != null) {
            class688[] var2 = class268.field3680;
            for (int var3 = 0; var3 < var2.length; var3++) {
                class688 var4 = var2[var3];
                var4.method3084(2280);
            }
        }
        field7623++;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lvr;)V", line = 85)
    public class520(class120 arg0) {
        this.field7621 = arg0;
    }
}
