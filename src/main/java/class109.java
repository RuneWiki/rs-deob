import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class109 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Z")
    public static boolean field1897 = true;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "Z")
    public static boolean field1903 = false;

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field1901;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    public int field1902;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[[B")
    public static byte[][] field1900;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V", line = 23)
    public static void method972(boolean arg0) {
        field1900 = null;
        if (arg0) {
            method973(57);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 33)
    public static final void method973(int arg0) {
        class296.method1945(-9343, class591.field8071);
        field1899++;
        class404.field5937++;
        if (class216.field3134 && class422.field6093) {
            int var1 = 0;
            int var2 = 0;
            if (class241.field3529) {
                var1 = class146.method1163((byte) -124);
                var2 = class313.method2035(false);
            }
            int var3 = var1 + class284.field3963.method574(true);
            int var4 = var2 + class284.field3963.method571((byte) 80);
            int var5 = var4 - class293.field4109;
            int var6 = var3 - class228.field3310;
            if (var6 < class527.field7294) {
                var6 = class527.field7294;
            }
            if (arg0 == -30206) {
                if (var6 + class591.field8071.field5385 > class527.field7294 - -class234.field3393.field5385) {
                    var6 = class527.field7294 + class234.field3393.field5385 - class591.field8071.field5385;
                }
                if (var5 < class246.field3594) {
                    var5 = class246.field3594;
                }
                if (class591.field8071.field5465 + var5 > class246.field3594 - -class234.field3393.field5465) {
                    var5 = class246.field3594 + class234.field3393.field5465 - class591.field8071.field5465;
                }
                int var7 = var6 + class234.field3393.field5423 - class527.field7294;
                int var8 = class234.field3393.field5431 + var5 - class246.field3594;
                if (class284.field3963.method1202(94)) {
                    if (class591.field8071.field5379 < class404.field5937) {
                        int var10 = var6 - class745.field10115;
                        int var11 = var5 - class73.field1333;
                        if (class591.field8071.field5405 < var10 || -class591.field8071.field5405 > var10 || var11 > class591.field8071.field5405 || (-class591.field8071.field5405) > var11) {
                            class756.field10556 = true;
                        }
                    }
                    if (class591.field8071.field5499 != null && class756.field10556) {
                        class33 var12 = new class33();
                        var12.field847 = class591.field8071;
                        var12.field842 = var7;
                        var12.field845 = class591.field8071.field5499;
                        var12.field853 = var8;
                        class83.method788(var12);
                    }
                } else {
                    if (class756.field10556) {
                        class236.method1643(-2049);
                        if (class591.field8071.field5368 != null) {
                            class33 var9 = new class33();
                            var9.field841 = class238.field3455;
                            var9.field842 = var7;
                            var9.field845 = class591.field8071.field5368;
                            var9.field853 = var8;
                            var9.field847 = class591.field8071;
                            class83.method788(var9);
                        }
                        if (class238.field3455 != null && client.method1979(class591.field8071) != null) {
                            class351.method2199(-67, class591.field8071, class238.field3455);
                        }
                    } else if ((class424.field6109 == 1 || class424.method2599(-113)) && class192.field2844 > 2) {
                        class608.method3452(true, class745.field10115 + class228.field3310, class293.field4109 - -class73.field1333);
                    } else if (class515.method3013((byte) 127)) {
                        class608.method3452(true, class745.field10115 + class228.field3310, class73.field1333 + class293.field4109);
                    }
                    class591.field8071 = null;
                }
            }
        } else if (class404.field5937 > 1) {
            class591.field8071 = null;
        }
    }
}
