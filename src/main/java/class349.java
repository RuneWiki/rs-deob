import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class349 {

    @OriginalMember(owner = "client!hr", name = "e", descriptor = "Z")
    public boolean field5143 = false;

    @OriginalMember(owner = "client!hr", name = "h", descriptor = "Lsk;")
    public static class423 field5146;

    @OriginalMember(owner = "client!hr", name = "l", descriptor = "F")
    public static float field5150;

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!hr", name = "f", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!hr", name = "g", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
    public int field5147;

    @OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!hr", name = "k", descriptor = "I")
    public int field5149;

    @OriginalMember(owner = "client!hr", name = "d", descriptor = "Lok;")
    public class160 field5142;

    static {
        new class423("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
        field5146 = new class423("glow3:", "leuchten3:", "brillant3:", "brilho3:");
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lqq;ZZI)Lig;", line = 8)
    public final class154 method2123(class318 arg0, boolean arg1, boolean arg2, int arg3) {
        if (arg1) {
            this.method2125(74, null);
        }
        field5144++;
        long var5 = (long) (arg0.field4787 << 19 | (arg2 ? 262144 : 0) | this.field5147 | arg3 << 16);
        class154 var7 = (class154) this.field5142.field2525.method1752(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field5142.field2514.method2729(this.field5147, -9055)) {
            class351 var8 = class351.method2132(this.field5142.field2514, this.field5147, 0);
            if (var8 != null) {
                var8.field5167 = var8.field5170 = var8.field5172 = var8.field5171 = 0;
                if (arg2) {
                    var8.method2134();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2139();
                }
            }
            class154 var10 = arg0.method1952(var8, true);
            if (var10 != null) {
                this.field5142.field2525.method1758(1, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILha;B)V", line = 57)
    private final void method2124(int arg0, class40 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field5147 = arg1.method254((byte) -94);
        } else if (arg0 == 2) {
            this.field5149 = arg1.method224(-2);
        } else if (arg0 == 3) {
            this.field5143 = true;
        } else if (arg0 == 4) {
            this.field5147 = -1;
        }
        field5139++;
        if (arg2 <= 44) {
            this.field5149 = 31;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(ILha;)V", line = 91)
    public final void method2125(int arg0, class40 arg1) {
        while (true) {
            int var3 = arg1.method257((byte) 52);
            if (var3 == 0) {
                field5141++;
                if (arg0 != -1) {
                    this.method2125(46, null);
                    return;
                }
                return;
            }
            this.method2124(var3, arg1, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)C", line = 113)
    public static final char method2126(int arg0, byte arg1) {
        int var2 = -10 / (-arg0 / 61);
        field5140++;
        int var3 = arg1 & 0xFF;
        if (var3 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var3, 16) + " provided");
        }
        if (var3 >= 128 && var3 < 160) {
            char var4 = class320.field4811[var3 - 128];
            if (var4 == '\u0000') {
                var4 = '?';
            }
            var3 = var4;
        }
        return (char) var3;
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)Z", line = 146)
    public final boolean method2127(byte arg0) {
        field5148++;
        int var2 = -18 % ((-arg0 - 54) / 60);
        return this.field5142.field2514.method2729(this.field5147, -9055);
    }

    @OriginalMember(owner = "client!hr", name = "b", descriptor = "(IB)V", line = 158)
    public static final void method2128(int arg0, byte arg1) {
        if (!class463.field7116.field2951) {
            arg0 = -1;
        }
        field5145++;
        if (class99.field1802 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class159 var2 = class466.field7153.method761(arg1 ^ 0x2D, arg0);
            class351 var3 = var2.method1017(-78);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class7.field86.method1572(var3.method2143(), var3.method2133(), class257.field3919, var3.method2135(), (byte) 104, new Point(var2.field2498, var2.field2509));
                class99.field1802 = arg0;
            }
        }
        if (arg1 != 12) {
            method2126(-83, (byte) 12);
        }
        if (arg0 == -1 && class99.field1802 != -1) {
            class7.field86.method1572(-1, -1, class257.field3919, null, (byte) 104, new Point());
            class99.field1802 = -1;
        }
    }

    @OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V", line = 199)
    public static void method2129(int arg0) {
        field5146 = null;
        if (arg0 != 0) {
            field5146 = null;
        }
    }
}
