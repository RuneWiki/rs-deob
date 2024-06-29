import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class341 extends class426 {

    @OriginalMember(owner = "client!os", name = "T", descriptor = "I")
    public int field5092 = 12800;

    @OriginalMember(owner = "client!os", name = "cb", descriptor = "I")
    public int field5101 = 0;

    @OriginalMember(owner = "client!os", name = "Z", descriptor = "Z")
    public boolean field5098 = true;

    @OriginalMember(owner = "client!os", name = "db", descriptor = "I")
    public int field5102 = 12800;

    @OriginalMember(owner = "client!os", name = "fb", descriptor = "I")
    public int field5104 = -1;

    @OriginalMember(owner = "client!os", name = "Y", descriptor = "I")
    public int field5097 = -1;

    @OriginalMember(owner = "client!os", name = "nb", descriptor = "I")
    public int field5112 = 0;

    @OriginalMember(owner = "client!os", name = "S", descriptor = "Ljava/lang/String;")
    public String field5091;

    @OriginalMember(owner = "client!os", name = "eb", descriptor = "I")
    public int field5103;

    @OriginalMember(owner = "client!os", name = "ab", descriptor = "I")
    public int field5099;

    @OriginalMember(owner = "client!os", name = "hb", descriptor = "Ljava/lang/String;")
    public String field5106;

    @OriginalMember(owner = "client!os", name = "jb", descriptor = "Lsf;")
    public class398 field5108;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field5084 = 0;

    @OriginalMember(owner = "client!os", name = "U", descriptor = "Lnn;")
    public static class151 field5093 = new class151("Attack", "Angreifen", "Attaquer", "Atacar");

    @OriginalMember(owner = "client!os", name = "mb", descriptor = "Z")
    public static boolean field5111;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "I")
    public static int field5086;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    public static int field5087;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!os", name = "Q", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!os", name = "V", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!os", name = "W", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!os", name = "X", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!os", name = "bb", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!os", name = "gb", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!os", name = "ib", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!os", name = "kb", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!os", name = "lb", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "[[[B")
    public static byte[][][] field5085;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(B)V")
    public static void method2077(byte arg0) {
        if (arg0 >= -21) {
            method2083(true);
        }
        field5085 = null;
        field5093 = null;
    }

    @OriginalMember(owner = "client!os", name = "g", descriptor = "(I)V")
    public static final void method2078(int arg0) {
        field5110++;
        class37.field452.method149(127);
        for (int var1 = 0; var1 < 32; var1++) {
            class57.field765[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class320.field4835[var2] = 0L;
        }
        class80.field1051 = 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBI[I)Z")
    public final boolean method2079(int arg0, byte arg1, int arg2, int[] arg3) {
        if (arg1 <= 47) {
            return false;
        }
        field5089++;
        for (class135 var5 = (class135) this.field5108.method2514((byte) 61); var5 != null; var5 = (class135) this.field5108.method2511(-105)) {
            if (var5.method844(arg2, arg0, false)) {
                var5.method840(arg2, arg3, 80, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V")
    public static final void method2080(int arg0, boolean arg1) {
        if (arg0 <= -18) {
            class71.field935 = arg1;
            field5095++;
            class296.field4492 = !class360.method2172(86);
        }
    }

    @OriginalMember(owner = "client!os", name = "h", descriptor = "(I)V")
    public final void method2081(int arg0) {
        this.field5102 = 12800;
        this.field5092 = 12800;
        this.field5101 = arg0;
        field5086++;
        this.field5112 = 0;
        for (class135 var2 = (class135) this.field5108.method2514((byte) 61); var2 != null; var2 = (class135) this.field5108.method2511(79)) {
            if (var2.field1785 > this.field5112) {
                this.field5112 = var2.field1785;
            }
            if (var2.field1792 > this.field5101) {
                this.field5101 = var2.field1792;
            }
            if (this.field5102 > var2.field1784) {
                this.field5102 = var2.field1784;
            }
            if (var2.field1780 < this.field5092) {
                this.field5092 = var2.field1780;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z")
    public final boolean method2082(int arg0, int arg1, int arg2) {
        field5096++;
        for (class135 var4 = (class135) this.field5108.method2514((byte) 61); var4 != null; var4 = (class135) this.field5108.method2511(arg0 ^ 0xFFFFFF91)) {
            if (var4.method844(arg1, arg2, false)) {
                return true;
            }
        }
        return arg0 != -1;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)Ljava/lang/String;")
    public static final String method2083(boolean arg0) {
        field5100++;
        if (!arg0) {
            return null;
        }
        String var1 = "www";
        if (class454.field6750 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class54.field730 != null) {
            var2 = "/p=" + class54.field730;
        }
        return "http://" + var1 + "." + class466.field6855.field6037 + ".com/l=" + class27.field356 + "/a=" + class240.field3600 + var2 + "/";
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IBII[I)Z")
    public final boolean method2084(int arg0, byte arg1, int arg2, int arg3, int[] arg4) {
        if (arg1 != -114) {
            return true;
        }
        field5088++;
        for (class135 var6 = (class135) this.field5108.method2514((byte) 61); var6 != null; var6 = (class135) this.field5108.method2511(73)) {
            if (var6.method841(arg3, arg0, arg1 ^ 0x71, arg2)) {
                var6.method840(arg3, arg4, -67, arg2);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 > 67) {
            class88.method579(arg1, arg5, arg7, arg8, arg3, arg6, 0, (byte) 123, arg0, arg2);
            field5107++;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([IIII)Z")
    public final boolean method2086(int[] arg0, int arg1, int arg2, int arg3) {
        field5094++;
        for (class135 var5 = (class135) this.field5108.method2514((byte) 61); var5 != null; var5 = (class135) this.field5108.method2511(55)) {
            if (var5.method845((byte) -114, arg2, arg1)) {
                var5.method843(arg0, arg2, arg1, 17806);
                return true;
            }
        }
        if (arg3 >= -126) {
            method2077((byte) 70);
        }
        return false;
    }

    @OriginalMember(owner = "client!os", name = "i", descriptor = "(I)V")
    public static final void method2087(int arg0) {
        if (arg0 >= -8) {
            field5105 = -92;
        }
        if (class196.field2965.method393()) {
            class440.method2694(-1);
            class196.field2965.method347(class170.field2631);
            class141.method887((byte) -105);
        } else {
            class388.method2399(true, class405.field6032);
        }
        field5090++;
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class341(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field5091 = arg2;
        this.field5103 = arg0;
        this.field5098 = arg5;
        this.field5099 = arg3;
        this.field5104 = arg4;
        this.field5097 = arg6;
        this.field5106 = arg1;
        if (this.field5097 == 255) {
            this.field5097 = 0;
        }
        this.field5108 = new class398();
    }

    static {
        new class151("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
        field5111 = true;
    }
}
