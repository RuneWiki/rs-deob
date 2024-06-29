import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kka")
public class class329 extends class281 {

    @OriginalMember(owner = "client!kka", name = "A", descriptor = "Ljw;")
    public static class581 field4765 = new class581(114, 4);

    @OriginalMember(owner = "client!kka", name = "x", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!kka", name = "z", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!kka", name = "B", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!kka", name = "C", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!kka", name = "D", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!kka", name = "E", descriptor = "I")
    public static int field4769;

    @OriginalMember(owner = "client!kka", name = "y", descriptor = "Lee;")
    private class706 field4763;

    @OriginalMember(owner = "client!kka", name = "b", descriptor = "(III)I")
    public final int method2072(int arg0, int arg1, int arg2) {
        field4766++;
        if (this.field4763 == null) {
            return arg0;
        }
        if (arg1 <= 76) {
            this.field4763 = null;
        }
        class119 var4 = (class119) this.field4763.method3953((long) arg2, 14);
        return var4 == null ? arg0 : var4.field1725;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Z)V")
    public static void method2073(boolean arg0) {
        if (arg0) {
            method2074(74, -110, null);
        }
        field4765 = null;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(II[Lor;)V")
    public static final void method2074(int arg0, int arg1, class668[] arg2) {
        if (arg0 != -10943) {
            field4765 = null;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class668 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field9353 == 0) {
                    if (var4.field9289 != null) {
                        method2074(arg0, arg1, var4.field9289);
                    }
                    class237 var5 = (class237) class609.field8283.method3953((long) var4.field9221, 14);
                    if (var5 != null) {
                        class274.method1782((byte) -47, arg1, var5.field3202);
                    }
                }
                if (arg1 == 0 && var4.field9381 != null) {
                    class12 var6 = new class12();
                    var6.field190 = var4;
                    var6.field186 = var4.field9381;
                    class173.method1235(var6);
                }
                if (arg1 == 1 && var4.field9232 != null) {
                    if (var4.field9318 >= 0) {
                        class668 var7 = class536.method3067(var4.field9221, arg0 ^ 0xFFFFD541);
                        if (var7 == null || var7.field9289 == null || var4.field9318 >= var7.field9289.length || var7.field9289[var4.field9318] != var4) {
                            continue;
                        }
                    }
                    class12 var8 = new class12();
                    var8.field186 = var4.field9232;
                    var8.field190 = var4;
                    class173.method1235(var8);
                }
            }
        }
        field4762++;
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(Ljp;I)V")
    public final void method2075(class376 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2398(-1372747256);
            if (var3 == 0) {
                field4764++;
                if (arg1 != 114) {
                    this.method2078(-101, null, 10);
                    return;
                }
                return;
            }
            this.method2076(var3, arg0, 125);
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(ILjp;I)V")
    private final void method2076(int arg0, class376 arg1, int arg2) {
        field4769++;
        int var4 = 0 / ((arg2 - 64) / 32);
        if (arg0 != 249) {
            return;
        }
        int var5 = arg1.method2398(-1372747256);
        if (this.field4763 == null) {
            int var6 = class719.method4014(var5, (byte) -100);
            this.field4763 = new class706(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg1.method2398(-1372747256) == 1;
            int var9 = arg1.method2373(1223262424);
            class101 var10;
            if (var8) {
                var10 = new class482(arg1.method2379((byte) 85));
            } else {
                var10 = new class119(arg1.method2384(89));
            }
            this.field4763.method3962((long) var9, var10, -121);
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(BLaj;)V")
    public static final void method2077(byte arg0, class333 arg1) {
        class418.field6007 = 0;
        field4768++;
        class461.field6389 = 0;
        class270.field3980 = new class15();
        class592.field7969 = new class336[1024];
        class483.field6682 = new class663[class581.field7772[class786.field10820] + 1];
        class700.field9826 = 0;
        class503.field6972 = 0;
        class537.method3070((byte) 86, arg1);
        if (arg0 < -42) {
            class628.method3533((byte) -128, arg1);
        }
    }

    @OriginalMember(owner = "client!kka", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method2078(int arg0, String arg1, int arg2) {
        field4767++;
        if (this.field4763 == null) {
            return arg1;
        }
        if (arg0 != 26689) {
            method2077((byte) -107, null);
        }
        class482 var4 = (class482) this.field4763.method3953((long) arg2, 14);
        return var4 == null ? arg1 : var4.field6664;
    }
}
