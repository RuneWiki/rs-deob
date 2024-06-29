import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class109 {

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Z")
    public boolean field1534 = true;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "C")
    private char field1539;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lqa;")
    public static class496 field1536;

    // $FF: synthetic field
    @OriginalMember(owner = "client!v", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field1542;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Ljava/lang/String;")
    public String field1541;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILri;)V")
    public static final void method718(int arg0, class309 arg1) {
        field1537++;
        if (class380.field5802 == null) {
            return;
        }
        if (arg0 != -1) {
            field1536 = null;
        }
        class196 var2 = null;
        if (arg1.field4624 == 0) {
            var2 = (class196) class456.method2743(arg1.field4635, arg1.field4623, arg1.field4636);
        }
        if (arg1.field4624 == 1) {
            var2 = (class196) class174.method1214(arg1.field4635, arg1.field4623, arg1.field4636);
        }
        if (arg1.field4624 == 2) {
            var2 = (class196) class432.method2587(arg1.field4635, arg1.field4623, arg1.field4636, field1542 == null ? (field1542 = method724("ou")) : field1542);
        }
        if (arg1.field4624 == 3) {
            var2 = (class196) class380.method2357(arg1.field4635, arg1.field4623, arg1.field4636);
        }
        if (var2 == null) {
            arg1.field4629 = 0;
            arg1.field4628 = 0;
            arg1.field4634 = -1;
        } else {
            arg1.field4634 = var2.method50(25707);
            arg1.field4628 = var2.method63((byte) 63);
            arg1.field4629 = var2.method66(-7234);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)Z")
    public static final boolean method719(byte arg0, int arg1) {
        field1535++;
        if (class270.field3738[arg1]) {
            return true;
        } else if (class70.field973.method2634(-44, arg1)) {
            int var2 = class70.field973.method2645(1, arg1);
            if (var2 == 0) {
                class270.field3738[arg1] = true;
                return true;
            }
            if (class59.field791[arg1] == null) {
                class59.field791[arg1] = new class499[var2];
            }
            if (arg0 >= -117) {
                field1536 = null;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class59.field791[arg1][var3] == null) {
                    byte[] var4 = class70.field973.method2650(var3, -58, arg1);
                    if (var4 != null) {
                        class499 var5 = class59.field791[arg1][var3] = new class499();
                        var5.field7312 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2971(new class91(var4), -256);
                    }
                }
            }
            class270.field3738[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ltl;B)V")
    public final void method720(class91 arg0, byte arg1) {
        field1540++;
        while (true) {
            int var3 = arg0.method618((byte) 100);
            if (var3 == 0) {
                if (arg1 > -94) {
                    this.method720(null, (byte) 67);
                    return;
                } else {
                    return;
                }
            }
            this.method721(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ltl;II)V")
    private final void method721(class91 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method723(29);
        }
        if (arg2 == 1) {
            this.field1539 = class396.method2437(arg0.method619((byte) -23), -5513);
        } else if (arg2 == 2) {
            this.field1532 = arg0.method626((byte) 100);
        } else if (arg2 == 4) {
            this.field1534 = false;
        } else if (arg2 == 5) {
            this.field1541 = arg0.method621(2029169511);
        }
        field1538++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method722(int arg0) {
        if (arg0 <= 36) {
            method719((byte) -59, 107);
        }
        field1536 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        field1533++;
        if (arg0 != -116) {
            this.method721(null, 26, -65);
        }
        return this.field1539 == 's';
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method724(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
