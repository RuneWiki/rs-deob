import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class73 {

    @OriginalMember(owner = "client!rv", name = "i", descriptor = "Z")
    public boolean field1188 = false;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lge;")
    private class511 field1182 = new class511(64);

    @OriginalMember(owner = "client!rv", name = "t", descriptor = "Lge;")
    public class511 field1199 = new class511(500);

    @OriginalMember(owner = "client!rv", name = "u", descriptor = "Lge;")
    public class511 field1200 = new class511(30);

    @OriginalMember(owner = "client!rv", name = "v", descriptor = "Lge;")
    public class511 field1201 = new class511(50);

    @OriginalMember(owner = "client!rv", name = "r", descriptor = "Lci;")
    private class320 field1197;

    @OriginalMember(owner = "client!rv", name = "q", descriptor = "Lci;")
    public class320 field1196;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "Z")
    public boolean field1181;

    @OriginalMember(owner = "client!rv", name = "m", descriptor = "Lkj;")
    public static class405 field1192 = new class405("", 11);

    @OriginalMember(owner = "client!rv", name = "s", descriptor = "Lbd;")
    public static class44 field1198 = new class44("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!rv", name = "g", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!rv", name = "j", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!rv", name = "k", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!rv", name = "l", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!rv", name = "p", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!rv", name = "w", descriptor = "I")
    public int field1202;

    @OriginalMember(owner = "client!rv", name = "o", descriptor = "J")
    public static long field1194;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 3)
    public static void method563(int arg0) {
        field1192 = null;
        field1198 = null;
        if (arg0 != 4462) {
            method572(-54, 103, -40, -124, -97, null, -32, (byte) 127, 108, null, 72, -13, -69);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(II)V", line = 15)
    public final void method564(int arg0, int arg1) {
        class511 var3 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method2989(false, arg0);
        }
        field1183++;
        class511 var4 = this.field1199;
        synchronized (this.field1199) {
            this.field1199.method2989(false, arg0);
        }
        class511 var5 = this.field1200;
        synchronized (this.field1200) {
            if (arg1 >= -87) {
                this.field1181 = true;
            }
            this.field1200.method2989(false, arg0);
        }
        class511 var6 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method2989(false, arg0);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZB)V", line = 38)
    public final void method565(boolean arg0, byte arg1) {
        field1185++;
        if (arg0 == this.field1181) {
            return;
        }
        if (arg1 != 124) {
            method563(-3);
        }
        this.field1181 = arg0;
        this.method571(arg1 ^ 0xFFFFFFC0);
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BZ)V", line = 54)
    public final void method566(byte arg0, boolean arg1) {
        field1190++;
        if (arg0 < 22) {
            method563(68);
        }
        if (this.field1188 != arg1) {
            this.field1188 = arg1;
            this.method571(-94);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(BI)V", line = 70)
    public final void method567(byte arg0, int arg1) {
        this.field1182 = new class511(arg1);
        field1186++;
        if (arg0 < 3) {
            field1195 = 81;
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(II)V", line = 82)
    public final void method568(int arg0, int arg1) {
        field1193++;
        this.field1202 = arg0;
        class511 var3 = this.field1199;
        synchronized (this.field1199) {
            this.field1199.method2990((byte) -53);
        }
        if (arg1 != -12) {
            this.field1199 = null;
        }
        class511 var4 = this.field1200;
        synchronized (this.field1200) {
            this.field1200.method2990((byte) -74);
        }
        class511 var5 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method2990((byte) -48);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(BI)Lku;", line = 102)
    public final class261 method569(byte arg0, int arg1) {
        field1180++;
        if (arg0 < 46) {
            field1195 = 20;
        }
        class511 var3 = this.field1182;
        class261 var4;
        synchronized (this.field1182) {
            var4 = (class261) this.field1182.method2982(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class320 var5 = this.field1197;
        byte[] var6;
        synchronized (this.field1197) {
            var6 = this.field1197.method2037(class112.method798((byte) -52, arg1), (byte) -58, class450.method2680(27197, arg1));
        }
        class261 var7 = new class261();
        var7.field3882 = arg1;
        var7.field3884 = this;
        if (var6 != null) {
            var7.method1674(new class519(var6), false);
        }
        var7.method1673(-517);
        if (var7.field3933) {
            var7.field3883 = 0;
            var7.field3908 = false;
        }
        if (!this.field1181 && var7.field3873) {
            var7.field3901 = null;
            var7.field3891 = null;
        }
        class511 var8 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method2981(var7, 109, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(B)V", line = 150)
    public final void method570(byte arg0) {
        field1184++;
        class511 var2 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method2980(-182819096);
        }
        int var3 = -128 / ((43 - arg0) / 63);
        class511 var4 = this.field1199;
        synchronized (this.field1199) {
            this.field1199.method2980(-182819096);
        }
        class511 var5 = this.field1200;
        synchronized (this.field1200) {
            this.field1200.method2980(-182819096);
        }
        class511 var6 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method2980(-182819096);
        }
    }

    @OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lsn;IZLci;Lci;)V", line = 280)
    public class73(class453 arg0, int arg1, boolean arg2, class320 arg3, class320 arg4) {
        this.field1197 = arg3;
        this.field1196 = arg4;
        this.field1181 = arg2;
        if (this.field1197 != null) {
            int var6 = this.field1197.method2033((byte) 60) - 1;
            this.field1197.method2030(-10914, var6);
        }
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)V", line = 183)
    public final void method571(int arg0) {
        class511 var2 = this.field1182;
        synchronized (this.field1182) {
            this.field1182.method2990((byte) -109);
        }
        field1189++;
        class511 var3 = this.field1199;
        synchronized (this.field1199) {
            this.field1199.method2990((byte) -126);
            int var4 = 33 / ((-arg0 - 18) / 37);
        }
        class511 var5 = this.field1200;
        synchronized (this.field1200) {
            this.field1200.method2990((byte) -78);
        }
        class511 var6 = this.field1201;
        synchronized (this.field1201) {
            this.field1201.method2990((byte) -45);
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIIII[[[BIBILqa;III)V", line = 204)
    public static final void method572(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int arg6, byte arg7, int arg8, class167 arg9, int arg10, int arg11, int arg12) {
        field1191++;
        if (arg6 == 0 || arg2 == 0) {
            return;
        }
        if (arg6 == 9) {
            arg10 = arg10 + 1 & 0x3;
            arg6 = 1;
        }
        if (arg7 != -85) {
            method572(6, 23, 79, 65, -104, null, -17, (byte) 77, -126, null, 10, 67, 87);
        }
        if (arg6 == 10) {
            arg6 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        if (arg6 == 11) {
            arg10 = arg10 + 3 & 0x3;
            arg6 = 8;
        }
        arg9.method335(arg3, arg11, arg0, arg4, arg8, arg1, arg5[arg6 - 1][arg10], arg2, arg12);
    }

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "(B)Z", line = 249)
    public static final boolean method573(byte arg0) {
        if (arg0 <= 42) {
            method573((byte) -12);
        }
        field1187++;
        return class335.field4964;
    }
}
