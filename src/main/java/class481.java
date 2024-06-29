import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class481 implements Runnable {

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "[Ltg;")
    public volatile class140[] field6643 = new class140[2];

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Z")
    public volatile boolean field6650 = false;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "Z")
    public volatile boolean field6642 = false;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "[Lrn;")
    public static class161[] field6648 = new class161[29];

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field6647;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field6649;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public static int field6651;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "Lml;")
    public class241 field6646;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method2805(int arg0, int arg1, int arg2, int arg3) {
        class203.field2751.method199((byte) -117, arg3);
        field6649++;
        class203.field2751.method241(arg2, (byte) -44);
        class203.field2751.method229(arg0, 1309449544);
        if (arg1 != -3) {
            field6648 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BILbc;I)Ljs;", line = 20)
    public static final class199 method2806(byte arg0, int arg1, class225 arg2, int arg3) {
        field6647++;
        int var4 = arg3 << 8 | arg2.field2975;
        if (arg0 != 92) {
            method2805(2, 5, 12, -65);
        }
        class199 var5 = (class199) class384.field5309.method2635((long) var4 << 16, (byte) -73);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class262.field3477.method695(class262.field3477.method710(var4, false), 114);
        if (var6 == null) {
            int var8 = arg2.field2975 | arg1 + 65536 << 8;
            class199 var9 = (class199) class384.field5309.method2635((long) var8 << 16, (byte) -127);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class262.field3477.method695(class262.field3477.method710(var8, false), -118);
            if (var10 == null) {
                int var12 = arg2.field2975 | 0xFFFF00;
                class199 var13 = (class199) class384.field5309.method2635((long) var12 << 16, (byte) -90);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class262.field3477.method695(class262.field3477.method710(var12, false), -118);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class199 var15 = class38.method278(var14, -39);
                    var15.field2687 = arg2;
                    class384.field5309.method2638((byte) -25, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class199 var11 = class38.method278(var10, arg0 - 131);
                var11.field2687 = arg2;
                class384.field5309.method2638((byte) -72, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class199 var7 = class38.method278(var6, -39);
            var7.field2687 = arg2;
            class384.field5309.method2638((byte) -88, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIBII)V", line = 90)
    public static final void method2807(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field6644++;
        class464 var7 = class78.method519(arg2, arg3, (byte) -72);
        if (var7 == null) {
            return;
        }
        if (var7.field6336 != null) {
            class82 var8 = new class82();
            var8.field1086 = var7;
            var8.field1085 = var7.field6336;
            class382.method2340(var8);
        }
        class336.field4538 = var7.field6402;
        class97.field1417 = arg5;
        class297.field3974 = arg0;
        class38.field559 = arg3;
        class289.field3899 = true;
        if (arg4 <= 33) {
            method2807(18, 34, -28, 98, (byte) -64, -114, 87);
        }
        class210.field2841 = arg2;
        class456.field6187 = arg1;
        class72.field984 = arg6;
        class490.method2854(var7, (byte) 109);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIIII)V", line = 127)
    public static final void method2808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6645++;
        int var7 = class309.method1706(class221.field2942, arg2, 6798, class205.field2784);
        int var8 = class309.method1706(class221.field2942, arg0, 6798, class205.field2784);
        int var9 = class309.method1706(class425.field5751, arg5, 6798, class136.field1985);
        int var10 = class309.method1706(class425.field5751, arg3, 6798, class136.field1985);
        int var11 = class309.method1706(class221.field2942, arg1 + arg2, 6798, class205.field2784);
        int var12 = class309.method1706(class221.field2942, arg0 - arg1, 6798, class205.field2784);
        for (int var13 = var7; var13 < var11; var13++) {
            class330.method1834(var10, class102.field1472[var13], arg6, var9, 25084);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class330.method1834(var10, class102.field1472[var14], arg6, var9, arg4 + 25074);
        }
        int var15 = class309.method1706(class425.field5751, arg5 + arg1, 6798, class136.field1985);
        int var16 = class309.method1706(class425.field5751, arg3 - arg1, 6798, class136.field1985);
        if (arg4 != 10) {
            method2805(110, -80, -41, -46);
        }
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class102.field1472[var17];
            class330.method1834(var15, var18, arg6, var9, 25084);
            class330.method1834(var10, var18, arg6, var16, 25084);
        }
    }

    @OriginalMember(owner = "client!kn", name = "run", descriptor = "()V", line = 179)
    public final void run() {
        this.field6642 = true;
        field6651++;
        try {
            while (!this.field6650) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class140 var2 = this.field6643[var1];
                    if (var2 != null) {
                        var2.method845(256);
                    }
                }
                class374.method2298(-28114, 10L);
                class47.method339(this.field6646, (Object) null, 0);
            }
        } catch (Exception var9) {
            class228.method1278(var9, (String) null, -30116);
        } finally {
            Object var6 = null;
            this.field6642 = false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 214)
    public static void method2809(int arg0) {
        if (arg0 >= -55) {
            field6648 = null;
        }
        field6648 = null;
    }
}
