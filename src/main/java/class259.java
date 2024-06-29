import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class259 {

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "Z")
    public boolean field4656 = false;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field4658 = 0;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "[I")
    public static int[] field4657 = new int[5];

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Lcf;")
    public static class93 field4665 = class147.method1066(":allyreq:", -48);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public int field4661;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public int field4664;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4667;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lhg;")
    public static class177 field4663;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static final void method1744(int arg0) {
        if (arg0 >= 47) {
            field4666++;
            if (class199.field3609 == 30) {
                class19.method88(25, false);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method1745(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class174[] var7 = class44.field707;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class174 var9 = var7[var8];
            if (var9 != null && var9.field3028 == 2) {
                class193.method1385((var9.field3026 - class4.field52 << 7) + var9.field3031, (-class229.field4111 + var9.field3038 << 7) - -var9.field3035, arg2, arg3 >> 1, arg4 >> 1, var9.field3032 * 2, (byte) -30, arg1);
                if (class227.field4057 > -1 && class275.field4921 % 20 < 10) {
                    class264.field4700[var9.field3025].method560(class227.field4057 + arg5 - 12, class156.field2766 + -28 + arg6);
                }
            }
        }
        if (arg0) {
            field4653++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILee;I)V")
    private final void method1746(int arg0, int arg1, class280 arg2, int arg3) {
        if (arg3 == 1) {
            this.field4664 = arg2.method1891(-116);
        } else if (arg3 == 2) {
            this.field4661 = arg2.method1893((byte) -110);
        } else if (arg3 == 3) {
            this.field4656 = true;
        } else if (arg3 == 4) {
            this.field4664 = -1;
        }
        field4655++;
        if (arg1 != -1494) {
            field4658 = -7;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)Luf;")
    public final class173 method1747(int arg0, int arg1) {
        field4654++;
        class173 var3 = (class173) class51.field834.method302((long) (this.field4664 | arg1 << 16), 0);
        if (var3 != null) {
            return var3;
        }
        class276.field4954.method1280(this.field4664, (byte) -41);
        class173 var4 = class109.method780(class276.field4954, 0, this.field4664, -505702760);
        int var5 = 127 % ((11 - arg0) / 56);
        if (var4 != null) {
            var4.method1241(class18.field244, class263.field4693, class52.field849);
            var4.field3533 = var4.field3541;
            var4.field3532 = var4.field3538;
            for (int var6 = 0; var6 < arg1; var6++) {
                var4.method1237();
            }
            class51.field834.method297((long) (arg1 << 16 | this.field4664), var4, 10414);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILee;I)V")
    public final void method1748(int arg0, class280 arg1, int arg2) {
        if (arg0 != 0) {
            method1745(false, -30, 113, -3, -77, -39, 33);
        }
        field4659++;
        while (true) {
            int var4 = arg1.method1907(arg0 ^ 0x41C0);
            if (var4 == 0) {
                return;
            }
            this.method1746(arg2, -1494, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static void method1749(byte arg0) {
        field4657 = null;
        field4663 = null;
        int var1 = 1 % ((-arg0 - 13) / 32);
        field4665 = null;
    }
}
