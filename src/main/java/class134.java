import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public abstract class class134 extends class179 {

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "Z")
    public volatile boolean field1539 = true;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "[C")
    public static char[] field1530 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field1531 = 0;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Z")
    public boolean field1535;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Z")
    public boolean field1538;

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "[Loo;")
    public static class27[] field1537;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "[[I")
    public static int[][] field1536;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(III)V")
    public static final void method869(int arg0, int arg1, int arg2) {
        field1541++;
        class12 var3 = class390.method2422(341555040, arg2, 1);
        var3.method66(-63);
        if (arg1 > -67) {
            field1531 = -39;
        }
        var3.field144 = arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method870(boolean arg0, String arg1) {
        field1529++;
        if (arg1 == null) {
            return -1;
        } else if (arg0) {
            for (int var2 = 0; var2 < class332.field4536; var2++) {
                if (arg1.equalsIgnoreCase(class107.field1275[var2])) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)I")
    public abstract int method871(int arg0);

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V")
    public static final void method872(int arg0, byte arg1) {
        field1532++;
        class365 var2 = class321.field4308;
        synchronized (class321.field4308) {
            class321.field4308.method2286(arg0, (byte) 36);
        }
        if (arg1 <= 28) {
            method869(-13, -66, 11);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)[B")
    public abstract byte[] method873(int arg0);

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "(I)V")
    public static void method874(int arg0) {
        field1530 = null;
        if (arg0 == 24169) {
            field1536 = null;
            field1537 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method875(String arg0, String arg1, boolean arg2, String arg3) {
        field1540++;
        int var4 = arg0.indexOf(arg3);
        if (arg2) {
            method872(-114, (byte) -30);
        }
        while (var4 != -1) {
            arg0 = arg0.substring(0, var4) + arg1 + arg0.substring(arg3.length() + var4);
            var4 = arg0.indexOf(arg3, arg1.length() + var4);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method876(byte arg0, String arg1) {
        class330.method2124("", false, "", 0, 0, arg1);
        if (arg0 != -111) {
            field1537 = null;
        }
        field1534++;
    }
}
