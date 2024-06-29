import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class457 extends class417 {

    @OriginalMember(owner = "client!tp", name = "s", descriptor = "Lsl;")
    public static class391 field6455 = new class391("", 12);

    @OriginalMember(owner = "client!tp", name = "x", descriptor = "Llu;")
    public static class610 field6460 = new class610(31, 2);

    @OriginalMember(owner = "client!tp", name = "C", descriptor = "Lhn;")
    public static class616 field6465 = new class616();

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public int field6446;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public int field6448;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public int field6449;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public int field6451;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public int field6452;

    @OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!tp", name = "r", descriptor = "I")
    public int field6454;

    @OriginalMember(owner = "client!tp", name = "t", descriptor = "I")
    public int field6456;

    @OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
    public int field6457;

    @OriginalMember(owner = "client!tp", name = "v", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!tp", name = "w", descriptor = "I")
    public int field6459;

    @OriginalMember(owner = "client!tp", name = "y", descriptor = "I")
    public int field6461;

    @OriginalMember(owner = "client!tp", name = "z", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!tp", name = "A", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!tp", name = "B", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!tp", name = "D", descriptor = "I")
    public int field6466;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tp", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field6467;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2775(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)I", line = 4)
    public static final int method2771(boolean arg0) {
        field6445++;
        class208 var1 = class99.field1445;
        boolean var2 = false;
        if (class526.field7533 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class208.method1382(null, false, 0, 0, null, var3);
            var2 = true;
        }
        long var4 = class598.method3538(true);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method523(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class598.method3538(arg0) - var4);
        var1.method1378(arg0, 0, -16777216, 100, 100, 0);
        if (var2) {
            var1.method1372(4);
        }
        return var7;
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(Z)[Lbn;", line = 43)
    public static final class378[] method2772(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            field6450++;
            return new class378[] { class216.field3171, class319.field4405, class405.field5535, class61.field765, class358.field4870, class68.field863, class164.field2599, class54.field637, class166.field2613, class605.field8999, class513.field7308, class185.field2771, class384.field5285, class605.field9000, class469.field6624 };
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 54)
    public static void method2773(int arg0) {
        field6455 = null;
        if (arg0 != 31) {
            method2771(false);
        }
        field6465 = null;
        field6460 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLqa;I)Lr;", line = 76)
    public final class159 method2774(byte arg0, class208 arg1, int arg2) {
        field6447++;
        if (arg0 > -92) {
            this.field6462 = 30;
        }
        int var4 = class480.field6819[this.field6452];
        class159 var5 = null;
        if (var4 == 0) {
            class113 var12 = class169.method1205(this.field6457, this.field6451, this.field6459);
            if (var12 instanceof class458) {
                class458 var13 = (class458) var12;
                if (var13.field6479 != null) {
                    var5 = ((class231) var13.field6479).method190((byte) 64, arg2, arg1);
                }
            }
        } else if (var4 == 1) {
            class323 var10 = class420.method2476(this.field6457, this.field6451, this.field6459);
            if (var10 instanceof class355) {
                class355 var11 = (class355) var10;
                if (var11.field4836 != null) {
                    var5 = ((class231) var11.field4836).method190((byte) 78, arg2, arg1);
                }
            }
        } else if (var4 == 2) {
            class577 var6 = class624.method3650(this.field6457, this.field6451, this.field6459, field6467 == null ? (field6467 = method2775("up")) : field6467);
            if (var6 instanceof class399) {
                class399 var7 = (class399) var6;
                if (var7.field5483 != null) {
                    var5 = ((class231) var7.field5483).method190((byte) 49, arg2, arg1);
                }
            }
        } else if (var4 == 3) {
            class238 var8 = class440.method2560(this.field6457, this.field6451, this.field6459);
            if (var8 instanceof class296) {
                class296 var9 = (class296) var8;
                if (var9.field4056 != null) {
                    var5 = ((class231) var9.field4056).method190((byte) 109, arg2, arg1);
                }
            }
        }
        return var5 == null ? null : var5.method94((byte) 0, arg2, true);
    }
}
