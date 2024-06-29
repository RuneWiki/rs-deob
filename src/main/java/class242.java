import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class242 {

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public static int field3664 = -1;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(I)V")
    public static final void method1608(int arg0) {
        class531.method3088(class44.field1094, (byte) 57);
        field3665++;
        class155.field2617++;
        if (class478.field6865 && class282.field4183) {
            if (arg0 != -2) {
                field3666 = 31;
            }
            int var1 = class410.field5945.method1931(-23081);
            int var2 = class410.field5945.method1936(126);
            int var3 = var2 - class437.field6305;
            int var4 = var1 - class396.field5779;
            if (class260.field3817 > var4) {
                var4 = class260.field3817;
            }
            if (var3 < class404.field5835) {
                var3 = class404.field5835;
            }
            if (class44.field1094.field7718 + var4 > class260.field3817 + class617.field8960.field7718) {
                var4 = class260.field3817 + class617.field8960.field7718 - class44.field1094.field7718;
            }
            if ((class404.field5835 + class617.field8960.field7652) < (class44.field1094.field7652 + var3)) {
                var3 = class404.field5835 + class617.field8960.field7652 - class44.field1094.field7652;
            }
            int var5 = var4 + class617.field8960.field7636 - class260.field3817;
            int var6 = var3 + class617.field8960.field7716 - class404.field5835;
            if (class410.field5945.method3772(arg0 ^ 0xFFFFFF94)) {
                if (class44.field1094.field7598 < class155.field2617) {
                    int var8 = var4 - class218.field3314;
                    int var9 = var3 - class631.field9088;
                    if (class44.field1094.field7612 < var8 || (-class44.field1094.field7612) > var8 || class44.field1094.field7612 < var9 || (-class44.field1094.field7612) > var9) {
                        class287.field4274 = true;
                    }
                }
                if (class44.field1094.field7705 != null && class287.field4274) {
                    class476 var10 = new class476();
                    var10.field6850 = class44.field1094;
                    var10.field6847 = var5;
                    var10.field6842 = class44.field1094.field7705;
                    var10.field6840 = var6;
                    class683.method3847(var10);
                }
            } else {
                if (class287.field4274) {
                    class612.method3511(true);
                    if (class44.field1094.field7629 != null) {
                        class476 var7 = new class476();
                        var7.field6851 = class72.field1494;
                        var7.field6842 = class44.field1094.field7629;
                        var7.field6840 = var6;
                        var7.field6847 = var5;
                        var7.field6850 = class44.field1094;
                        class683.method3847(var7);
                    }
                    if (class72.field1494 != null && client.method1823(class44.field1094) != null) {
                        class511.method3018(class72.field1494, (byte) 51, class44.field1094);
                    }
                } else if ((class75.field1532 == 1 || class662.method3769((byte) 79)) && class481.field6904 > 2) {
                    class75.method802((byte) 61, class396.field5779 + class218.field3314, class631.field9088 + class437.field6305);
                } else if (class557.method3175((byte) 117)) {
                    class75.method802((byte) 61, class396.field5779 + class218.field3314, class631.field9088 + class437.field6305);
                }
                class44.field1094 = null;
            }
        } else if (class155.field2617 > 1) {
            class44.field1094 = null;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Lgfa;[Lff;)V")
    public static final void method1609(class697 arg0, class9[] arg1) {
        if (class146.field2534) {
            int var2 = arg0.method835(arg1, (byte) 116);
            class521.field7381.method75(var2, arg1);
        }
        if (class697.field9813 == class485.field6947) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class122) {
                var5 = ((class122) arg0).field2220;
                var6 = ((class122) arg0).field2230;
            } else {
                var5 = arg0.field9806 >> class30.field940;
                var6 = arg0.field9815 >> class30.field940;
            }
            class521.field7381.method39(class185.field2987[0].method552(1, arg0.field9806, arg0.field9815), class70.method778(var5, var6), class42.method566(var5, var6), class78.method823(var5, var6));
        }
        class531 var7 = arg0.method449(92160000, class521.field7381);
        if (var7 == null) {
            return;
        }
        var7.field7450 = arg0;
        if (class701.field9863) {
            class578 var8 = class207.field3172;
            synchronized (class207.field3172) {
                boolean var9 = false;
                for (class531 var10 = (class531) class207.field3172.method3317(-121); var10 != null; var10 = (class531) class207.field3172.method3321(-121)) {
                    if (arg0.field9808 >= var10.field7450.field9808) {
                        class206.method1451(var7, (byte) -120, var10);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class207.field3172.method3322(var7, -46);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class531 var12 = (class531) class207.field3172.method3317(-121); var12 != null; var12 = (class531) class207.field3172.method3321(-121)) {
            if (arg0.field9808 >= var12.field7450.field9808) {
                class206.method1451(var7, (byte) -119, var12);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class207.field3172.method3322(var7, -72);
        }
    }
}
