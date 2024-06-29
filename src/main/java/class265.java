import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class265 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "[I")
    public int[] field3922 = new int[2];

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "[I")
    public int[] field3927 = new int[2];

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "[I")
    public int[] field3923 = new int[3];

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[I")
    public int[] field3928 = new int[3];

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "[S")
    public short[] field3926;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[S")
    public short[] field3929;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "F")
    public static float field3924;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLha;)V", line = 4)
    public static final void method1738(byte arg0, class65 arg1) {
        field3921++;
        if (arg0 != 82 || class338.field4897.method2538(42) == 0) {
            return;
        }
        if (class712.field9959.field1270.method4293(arg0 ^ 0x57) == 0) {
            for (class624 var4 = (class624) class338.field4897.method2551((byte) -108); var4 != null; var4 = (class624) class338.field4897.method2542(arg0 ^ 0xFFFFFFD6)) {
                class770.field10602.method2470(var4.field8389, false, var4.field8394 ? class551.field7456.field1050 : null, var4.field8384, var4.field8390, class541.field7353, arg1, false, var4.field8382, var4.field8387, arg1, -25958);
                var4.method792((byte) -88);
            }
            class229.method1502(0);
            return;
        }
        if (class162.field2211 == null) {
            Canvas var2 = new Canvas();
            var2.setSize(36, 32);
            class162.field2211 = class11.method89(0, class482.field6667, class691.field9695, (byte) -83, 0, var2);
            class664.field9178 = class162.field2211.method545(class564.method3157(0, class781.field10716, class691.field9699, (byte) 44), class508.method2946(class643.field8927, class691.field9699, 0), true);
        }
        for (class624 var3 = (class624) class338.field4897.method2551((byte) -108); var3 != null; var3 = (class624) class338.field4897.method2542(-113)) {
            class770.field10602.method2470(var3.field8389, false, var3.field8394 ? class551.field7456.field1050 : null, var3.field8384, var3.field8390, class664.field9178, arg1, false, var3.field8382, var3.field8387, class162.field2211, -25958);
            var3.method792((byte) -123);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLjp;)Lcea;", line = 64)
    public static final class226 method1739(byte arg0, class376 arg1) {
        field3920++;
        if (arg0 > -78) {
            field3925 = -18;
        }
        return new class226(arg1.method2355(3), arg1.method2355(3), arg1.method2355(3), arg1.method2355(3), arg1.method2373(1223262424), arg1.method2373(1223262424), arg1.method2398(-1372747256));
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lvw;)V", line = 78)
    public class265(class322 arg0) {
        this.field3923[0] = arg0.field4674;
        this.field3923[2] = arg0.field4624;
        this.field3923[1] = arg0.field4667;
        this.field3928[0] = arg0.field4697;
        this.field3928[1] = arg0.field4688;
        this.field3928[2] = arg0.field4673;
        this.field3922[0] = arg0.field4634;
        this.field3922[1] = arg0.field4646;
        this.field3927[0] = arg0.field4629;
        this.field3927[1] = arg0.field4681;
        if (arg0.field4648 != null) {
            this.field3926 = new short[arg0.field4648.length];
            class278.method1800(arg0.field4648, 0, this.field3926, 0, this.field3926.length);
        }
        if (arg0.field4656 != null) {
            this.field3929 = new short[arg0.field4656.length];
            class278.method1800(arg0.field4656, 0, this.field3929, 0, this.field3929.length);
        }
    }
}
