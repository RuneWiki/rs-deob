import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class90 {

    @OriginalMember(owner = "client!er", name = "a", descriptor = "Lwf;")
    private class117 field1341 = new class117(64);

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public int field1351 = 0;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "Lkda;")
    private class328 field1349;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field1345;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field1347;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "I")
    public static int field1348;

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public static int field1350;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BII)Z")
    public static final boolean method670(byte arg0, int arg1, int arg2) {
        if (arg0 < 48) {
            field1352 = 68;
        }
        field1348++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public final void method671(int arg0) {
        class117 var2 = this.field1341;
        synchronized (this.field1341) {
            this.field1341.method846(arg0 ^ arg0);
        }
        field1345++;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method672(String arg0, int arg1) throws ClassNotFoundException {
        field1347++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg1 < 23) {
                method675(true, null, -41);
            }
            if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
    public final void method673(int arg0) {
        class117 var2 = this.field1341;
        synchronized (this.field1341) {
            this.field1341.method837(arg0 ^ 0x7E);
        }
        field1342++;
        if (arg0 != 1) {
            this.field1349 = null;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V")
    public final void method674(byte arg0, int arg1) {
        class117 var3 = this.field1341;
        synchronized (this.field1341) {
            this.field1341.method834(arg1, 0);
        }
        field1343++;
        if (arg0 >= -121) {
            this.field1346 = -72;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method675(boolean arg0, String arg1, int arg2) {
        field1344++;
        if (arg1 == null) {
            return;
        }
        if (class33.field402 >= 100) {
            class568.method3389(-114, class240.field3449.method3408(79, class63.field795));
            return;
        }
        String var3 = class533.method3214(-1, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class33.field402; var4++) {
            String var9 = class533.method3214(-1, class470.field6634[var4]);
            if (var9 != null && var9.equals(var3)) {
                class568.method3389(74, arg1 + class253.field3646.method3408(73, class63.field795));
                return;
            }
            if (class59.field744[var4] != null) {
                String var10 = class533.method3214(-1, class59.field744[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class568.method3389(127, arg1 + class253.field3646.method3408(87, class63.field795));
                    return;
                }
            }
        }
        int var5 = -103 / ((12 - arg2) / 43);
        for (int var6 = 0; var6 < class304.field4180; var6++) {
            String var7 = class533.method3214(-1, class538.field8010[var6]);
            if (var7 != null && var7.equals(var3)) {
                class568.method3389(-101, class503.field7129.method3408(127, class63.field795) + arg1 + class146.field2124.method3408(75, class63.field795));
                return;
            }
            if (class349.field4781[var6] != null) {
                String var8 = class533.method3214(-1, class349.field4781[var6]);
                if (var8 != null && var8.equals(var3)) {
                    class568.method3389(-124, class503.field7129.method3408(102, class63.field795) + arg1 + class146.field2124.method3408(126, class63.field795));
                    return;
                }
            }
        }
        if (class533.method3214(-1, class541.field8119.field5138).equals(var3)) {
            class568.method3389(15, class129.field1793.method3408(76, class63.field795));
            return;
        }
        class330.field4550++;
        class402.method2367(class9.field101, (byte) 82);
        class112.field1589.method1049(-1, class539.method3267(arg1, false) + 1);
        class112.field1589.method1050((byte) 32, arg1);
        class112.field1589.method1049(-1, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lls;")
    public final class121 method676(int arg0, int arg1) {
        field1350++;
        class117 var3 = this.field1341;
        class121 var5;
        synchronized (this.field1341) {
            if (arg0 <= 9) {
                return null;
            }
            var5 = (class121) this.field1341.method842(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class328 var6 = this.field1349;
        byte[] var7;
        synchronized (this.field1349) {
            var7 = this.field1349.method1966(arg1, 4, true);
        }
        class121 var8 = new class121();
        var8.field1712 = arg1;
        var8.field1696 = this;
        if (var7 != null) {
            var8.method864((byte) -40, new class148(var7));
        }
        var8.method867(-92);
        class117 var9 = this.field1341;
        synchronized (this.field1341) {
            this.field1341.method835((byte) 121, (long) arg1, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class90(class39 arg0, int arg1, class328 arg2) {
        this.field1349 = arg2;
        this.field1346 = this.field1349.method1975(45, 4);
    }

    static {
        new class572(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
        field1352 = -1;
    }
}
