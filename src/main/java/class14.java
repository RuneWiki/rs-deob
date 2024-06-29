import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class14 extends class417 {

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "I")
    public int field138 = 0;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "J")
    public static long field141 = 0L;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public int field123;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field126;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public int field127;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "I")
    public int field129;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!ds", name = "D", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ds", name = "G", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ds", name = "H", descriptor = "I")
    public int field147;

    @OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Luh;")
    public class145 field124;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "Lks;")
    public class373 field143;

    @OriginalMember(owner = "client!ds", name = "F", descriptor = "Lica;")
    public class571 field145;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "Leg;")
    public class91 field128;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "Leg;")
    public class91 field139;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ds", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field149;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "Z")
    public boolean field140;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "[I")
    public int[] field132;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method104(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class572("Error sending message to clan chat - please try again later!", "Fehler beim Versenden der Nachricht - bitte versuch es später erneut.", "Erreur lors de l'envoi du message au canal de clan - veuillez réessayer ultérieurement.", "Erro ao enviar mensagem ao canal de clã. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lfr;", line = 7)
    public static final class350 method100(int arg0) {
        field135++;
        if (arg0 != 0) {
            return null;
        }
        try {
            return (class350) Class.forName("rda").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZIIIIII)V", line = 36)
    public static final void method101(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field125++;
        if (!arg0) {
            field141 = 88L;
        }
        if (arg6 >= field136 && class130.field1801 >= arg3 && arg1 >= class3.field25 && class100.field1452 >= arg4) {
            if (arg5 == 1) {
                class68.method531(arg2, arg3, -71, arg1, arg4, arg6);
            } else {
                class602.method3558(arg6, arg1, (byte) 110, arg2, arg3, arg5, arg4);
            }
        } else if (arg5 == 1) {
            class508.method3024(arg2, arg4, -921600, arg1, arg3, arg6);
        } else {
            class177.method1251(arg4, arg2, arg5, arg1, 1, arg3, arg6);
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V", line = 74)
    public static final void method102(int arg0) {
        if (arg0 != -1) {
            field141 = 4L;
        }
        if (class331.field4576 == 2) {
            class467.field6579 = 96;
        } else {
            try {
                Method var1 = (field149 == null ? (field149 = method104("java.lang.Runtime")) : field149).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class467.field6579 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
        field134++;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V", line = 127)
    public final void method103(byte arg0) {
        field144++;
        int var2 = this.field137;
        if (this.field124 != null) {
            class145 var5 = this.field124.method991(class556.field8280, true);
            if (var5 == null) {
                this.field132 = null;
                this.field131 = 0;
                this.field137 = -1;
                this.field127 = 0;
                this.field126 = 0;
                this.field133 = 0;
            } else {
                this.field133 = var5.field2080;
                this.field137 = var5.field2061;
                this.field127 = var5.field2050;
                this.field132 = var5.field2076;
                this.field126 = var5.field2074 << 7;
                this.field131 = var5.field2042;
            }
        } else if (this.field145 != null) {
            int var3 = class565.method3388(this.field145, (byte) -114);
            if (var2 != var3) {
                this.field137 = var3;
                class87 var4 = this.field145.field8405;
                if (var4.field1314 != null) {
                    var4 = var4.method655((byte) 108, class556.field8280);
                }
                if (var4 == null) {
                    this.field127 = this.field126 = 0;
                } else {
                    this.field127 = var4.field1301;
                    this.field126 = var4.field1242 << 7;
                }
            }
        } else if (this.field143 != null) {
            this.field137 = class335.method2046(128, this.field143);
            this.field127 = this.field143.field5139;
            this.field126 = this.field143.field5135 << 7;
        }
        if (this.field137 != var2 && this.field139 != null) {
            class155.field2316.method258(this.field139);
            this.field139 = null;
        }
        if (arg0 < 124) {
            this.method103((byte) 70);
        }
    }
}
