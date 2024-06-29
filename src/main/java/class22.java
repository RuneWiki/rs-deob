import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class22 extends class324 {

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public int field393 = (int) (class375.method2193(116) / 1000L);

    @OriginalMember(owner = "client!an", name = "s", descriptor = "Ljava/lang/String;")
    public String field396;

    @OriginalMember(owner = "client!an", name = "t", descriptor = "S")
    public short field397;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "Lkaa;")
    public static class47 field394 = new class47(82, 3);

    @OriginalMember(owner = "client!an", name = "u", descriptor = "Lkaa;")
    public static class47 field398 = new class47(22, 7);

    @OriginalMember(owner = "client!an", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field399 = new BigInteger("a95bee1fdce5febeee57b1f1ca72319164191fec5223dde2db33a4f8526f5d7b77ba7964409689a064d0f2318f33b6c8ec48e8d1fbd0b10d3c6299791b2bfe21654b19c3146e13b77819363116031cef43f2b8c49874056befd4cc02c2c589760a1b836d2f40636a9a265b13a41f0d8ae22bc54893f791ddca9420efe557986ae594e717b026a4dc435b5e14bc9ae5ed7da61ac1d5da61d32493a5121ab21cfae9d7b75d42dbad28e951ccfe428328879564472b8e8f7d9f177d248ec5b2c0ebcf7a6da8c39cb69c89ebcc52636c742bcffb58e1c4fa4258e6e437b4e6744cea279bcc5f3c79f70d4eb946b3b6e9a43edb7864bd8ac298b6b21a2a4fc5d7625843dd8161a64122fe7987d79f860ca73cfa3f6a9be9945d2576bb7fbadf820d33d229ec021562c63d2bc0edd5adbdc322d0eacf1484f0d95de58fbf91e9c52ef47cb929fd1ebb2d70de6fabef5270a83c17013e811e90ff27806652cb8e1656cce20215fcc3494414c13fa5566ea0c5e30fa71d5c4eaac0372c6cbc611aab92331fd49205b64bbcbc4a195471aafd30cd243c676d17659a916f8196e56c4d59f6f997b064e34eb4ac07fb22a311f386ac8821f8d787919526a39c67a3a1e2516c7dea4626b5ef17b72fb4f1afb3d8b44801862ef4a6e86cd88b95f5ddc904df8826627d640fecc78204fff6968bf56ff5c0f260b56f0e3b9bda4753d2c238ba17", 16);

    @OriginalMember(owner = "client!an", name = "r", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!an", name = "w", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class22(String arg0, int arg1) {
        this.field396 = arg0;
        this.field397 = (short) arg1;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(III)Ljg;")
    public static final class343 method229(int arg0, int arg1, int arg2) {
        class701 var3 = class660.field8718[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class343 var4 = var3.field9740;
            var3.field9740 = null;
            class495.method2796(var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!an", name = "b", descriptor = "(B)V")
    public static void method230(byte arg0) {
        field394 = null;
        field399 = null;
        field398 = null;
        if (arg0 != -100) {
            method230((byte) -112);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(IIIILkk;I)Ljava/awt/Frame;")
    public static final Frame method231(int arg0, int arg1, int arg2, int arg3, class192 arg4, int arg5) {
        field395++;
        if (!arg4.method1302(31625)) {
            return null;
        }
        if (~arg2 == arg1) {
            class565[] var6 = class291.method1802(-342433470, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field7432 == arg0 && var6[var8].field7431 == arg5 && (arg3 == 0 || var6[var8].field7430 == arg3) && (!var7 || arg2 < var6[var8].field7438)) {
                    var7 = true;
                    arg2 = var6[var8].field7438;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class198 var9 = arg4.method1313(arg0, arg5, arg2, arg3, 209715200);
        while (var9.field2987 == 0) {
            class226.method1447((byte) -124, 10L);
        }
        Frame var10 = (Frame) var9.field2986;
        if (var10 == null) {
            return null;
        } else if (var9.field2987 == 2) {
            class515.method2874(arg4, var10, -2);
            return null;
        } else {
            return var10;
        }
    }
}
