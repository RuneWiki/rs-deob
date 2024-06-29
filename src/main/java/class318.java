import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class318 {

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "Ljv;")
    private class55 field4773 = new class55(64);

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Lbu;")
    private class17 field4779;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "[B")
    public static byte[] field4774 = new byte[520];

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "Lef;")
    public static class335 field4780 = new class335(7, 0, 1, 1);

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field4783 = -1;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Lpe;")
    public static class431 field4777;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)Lks;")
    public final class300 method2065(int arg0, int arg1) {
        field4782++;
        class55 var3 = this.field4773;
        class300 var4;
        synchronized (this.field4773) {
            var4 = (class300) this.field4773.method494(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4779.method114(arg0, 16, 123);
        class300 var6 = new class300();
        if (var5 != null) {
            var6.method1895(-16800, new class145(var5));
        }
        class55 var7 = this.field4773;
        synchronized (this.field4773) {
            this.field4773.method485((long) arg0, (byte) -125, var6);
        }
        if (arg1 != -44) {
            method2067(false);
        }
        return var6;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V")
    public final void method2066(byte arg0) {
        if (arg0 < 14) {
            return;
        }
        field4778++;
        class55 var2 = this.field4773;
        synchronized (this.field4773) {
            this.field4773.method484(-79);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Z)V")
    public static void method2067(boolean arg0) {
        field4774 = null;
        if (!arg0) {
            field4777 = null;
            field4780 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V")
    public final void method2068(byte arg0) {
        field4772++;
        class55 var2 = this.field4773;
        synchronized (this.field4773) {
            if (arg0 >= -79) {
                field4783 = -86;
            }
            this.field4773.method488(-3);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IB)V")
    public final void method2069(int arg0, byte arg1) {
        class55 var3 = this.field4773;
        synchronized (this.field4773) {
            if (arg1 >= -37) {
                field4777 = null;
            }
            this.field4773.method493(false, arg0);
        }
        field4776++;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;ZI)Z")
    public static final boolean method2070(int arg0, String arg1, boolean arg2, int arg3) {
        field4775++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        if (arg3 != -27169) {
            method2067(true);
        }
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg2) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (var11 >= arg0) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if (var10 / arg0 != var6) {
                return false;
            }
            var6 = var10;
            var5 = true;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Loq;ILbu;)V")
    public class318(class239 arg0, int arg1, class17 arg2) {
        this.field4779 = arg2;
        if (this.field4779 == null) {
            this.field4781 = 0;
        } else {
            this.field4781 = this.field4779.method119(29630, 16);
        }
    }
}
