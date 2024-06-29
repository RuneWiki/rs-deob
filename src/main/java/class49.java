import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class49 {

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public int field878;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    public static int field876 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "[I")
    public static int[] field877 = new int[5];

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lda;")
    public static class22 field881;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLce;)Lce;")
    public static final class10 method360(byte arg0, class10 arg1) {
        if (arg0 < 77) {
            method361(-116);
        }
        field873++;
        if (arg1.field149 != -1) {
            return class89.method698(arg1.field149, (byte) 94);
        }
        int var2 = arg1.field155 >>> 16;
        for (class87 var3 = (class87) class132.field2304.method446(1); var3 != null; var3 = (class87) class132.field2304.method448((byte) 95)) {
            if (var3.field1678 == var2) {
                return class89.method698((int) var3.field635, (byte) 94);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public static final void method361(int arg0) {
        field872++;
        int var1 = class119.field2109.method1600(arg0 - 24559, 8);
        if (class78.field1450 > var1) {
            for (int var2 = var1; var2 < class78.field1450; var2++) {
                class104.field1896[class207.field3446++] = class60.field1116[var2];
            }
        }
        if (arg0 != 24561) {
            field877 = null;
        }
        if (class78.field1450 < var1) {
            throw new RuntimeException("gppov1");
        }
        class78.field1450 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class60.field1116[var3];
            class187 var5 = class71.field1370[var4];
            int var6 = class119.field2109.method1600(2, 1);
            if (var6 == 0) {
                class60.field1116[class78.field1450++] = var4;
                var5.field3981 = class244.field4245;
            } else {
                int var7 = class119.field2109.method1600(2, 2);
                if (var7 == 0) {
                    class60.field1116[class78.field1450++] = var4;
                    var5.field3981 = class244.field4245;
                    class249.field4322[class170.field2855++] = var4;
                } else if (var7 == 1) {
                    class60.field1116[class78.field1450++] = var4;
                    var5.field3981 = class244.field4245;
                    int var8 = class119.field2109.method1600(2, 3);
                    var5.method1607(false, var8, 1);
                    int var9 = class119.field2109.method1600(2, 1);
                    if (var9 == 1) {
                        class249.field4322[class170.field2855++] = var4;
                    }
                } else if (var7 == 2) {
                    class60.field1116[class78.field1450++] = var4;
                    var5.field3981 = class244.field4245;
                    int var10 = class119.field2109.method1600(arg0 - 24559, 3);
                    var5.method1607(true, var10, 1);
                    int var11 = class119.field2109.method1600(2, 3);
                    var5.method1607(true, var11, 1);
                    int var12 = class119.field2109.method1600(2, 1);
                    if (var12 == 1) {
                        class249.field4322[class170.field2855++] = var4;
                    }
                } else if (var7 == 3) {
                    class104.field1896[class207.field3446++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method362(byte arg0) {
        if (arg0 == 10) {
            field877 = null;
            field881 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class49() {
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lbh;)V")
    public class49(class49 arg0) {
        this.field878 = arg0.field878;
        this.field874 = arg0.field874;
        this.field879 = arg0.field879;
        this.field875 = arg0.field875;
    }
}
