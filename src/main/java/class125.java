import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class125 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public int field1508 = 0;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public int field1512 = 2048;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public int field1516 = 0;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public int field1513 = 2048;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Lqfa;")
    public static class98 field1514 = new class98(69, 28);

    @OriginalMember(owner = "client!di", name = "l", descriptor = "Ljava/lang/Object;")
    public static volatile Object field1518 = null;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "Ltia;")
    public static class266 field1519 = new class266();

    @OriginalMember(owner = "client!di", name = "r", descriptor = "Lng;")
    public static class341 field1524 = null;

    @OriginalMember(owner = "client!di", name = "q", descriptor = "Lgda;")
    public static class53 field1523 = new class53(35, -1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!di", name = "p", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "Ljb;")
    public static class493 field1521;

    @OriginalMember(owner = "client!di", name = "s", descriptor = "Lhaa;")
    public static class80 field1525;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "[I")
    public static int[] field1517;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "[I")
    public static int[] field1520;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method844(boolean arg0, String arg1, byte arg2) {
        field1515++;
        if (arg1 == null) {
            return;
        }
        if (class261.field3764 >= 100) {
            class642.method3549(true, 4, class71.field935.method588((byte) 124, class549.field7669));
            return;
        }
        String var3 = class705.method3964(0, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class261.field3764; var4++) {
            String var9 = class705.method3964(0, class260.field3742[var4]);
            if (var9 != null && var9.equals(var3)) {
                class642.method3549(true, 4, arg1 + class71.field936.method588((byte) 107, class549.field7669));
                return;
            }
            if (class539.field7559[var4] != null) {
                String var10 = class705.method3964(0, class539.field7559[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class642.method3549(true, 4, arg1 + class71.field936.method588((byte) 124, class549.field7669));
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class215.field2828; var5++) {
            String var7 = class705.method3964(arg2 + 43, class703.field9786[var5]);
            if (var7 != null && var7.equals(var3)) {
                class642.method3549(true, 4, class71.field941.method588((byte) 107, class549.field7669) + arg1 + class71.field942.method588((byte) 118, class549.field7669));
                return;
            }
            if (class479.field6784[var5] != null) {
                String var8 = class705.method3964(0, class479.field6784[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class642.method3549(true, 4, class71.field941.method588((byte) 112, class549.field7669) + arg1 + class71.field942.method588((byte) 90, class549.field7669));
                    return;
                }
            }
        }
        if (arg2 != -43) {
            method847((byte) 47);
        }
        if (class705.method3964(0, class660.field9039.field3965).equals(var3)) {
            class642.method3549(true, 4, class71.field938.method588((byte) 118, class549.field7669));
            return;
        }
        class153.field2156++;
        class519 var6 = class357.method2293(class427.field5994, class102.field1216, (byte) -47);
        var6.field7384.method3694(class505.method2988(arg1, 0) + 1, -1528071456);
        var6.field7384.method3747((byte) 27, arg1);
        var6.field7384.method3694(arg0 ? 1 : 0, -1528071456);
        class151.method1027(var6, -104);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static final void method845(int arg0) {
        field1510++;
        class542.field7579.method1175((byte) 79);
        class28.field372.method4003(3);
        if (arg0 != 2) {
            method846(-50);
        }
        class1.field6.method4003(3);
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)Leia;")
    public static final class240 method846(int arg0) {
        field1509++;
        try {
            if (arg0 != 0) {
                method844(true, null, (byte) 28);
            }
            return (class240) Class.forName("mr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method847(byte arg0) {
        field1521 = null;
        field1517 = null;
        if (arg0 != 3) {
            method845(-111);
        }
        field1520 = null;
        field1514 = null;
        field1519 = null;
        field1525 = null;
        field1523 = null;
        field1518 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lee;II)V")
    private final void method848(class675 arg0, int arg1, int arg2) {
        field1507++;
        if (arg1 != -1) {
            return;
        }
        if (arg2 == 1) {
            this.field1516 = arg0.method3750((byte) 35);
        } else if (arg2 == 2) {
            this.field1513 = arg0.method3757((byte) -65);
        } else if (arg2 == 3) {
            this.field1512 = arg0.method3757((byte) -65);
        } else if (arg2 == 4) {
            this.field1508 = arg0.method3706((byte) 62);
            return;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lee;I)V")
    public final void method849(class675 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                field1511++;
                if (arg1 != 0) {
                    this.method848(null, 1, -67);
                    return;
                }
                return;
            }
            this.method848(arg0, -1, var3);
        }
    }
}
