import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tn")
public class class76 extends class417 {

    @OriginalMember(owner = "client!tn", name = "m", descriptor = "I")
    private int field1011;

    @OriginalMember(owner = "client!tn", name = "i", descriptor = "Z")
    private boolean field1007;

    @OriginalMember(owner = "client!tn", name = "p", descriptor = "I")
    private int field1014;

    @OriginalMember(owner = "client!tn", name = "o", descriptor = "I")
    private int field1013;

    @OriginalMember(owner = "client!tn", name = "q", descriptor = "I")
    private int field1015;

    @OriginalMember(owner = "client!tn", name = "k", descriptor = "I")
    private int field1009;

    @OriginalMember(owner = "client!tn", name = "l", descriptor = "I")
    private int field1010;

    @OriginalMember(owner = "client!tn", name = "r", descriptor = "Z")
    private boolean field1016;

    @OriginalMember(owner = "client!tn", name = "n", descriptor = "I")
    private int field1012;

    @OriginalMember(owner = "client!tn", name = "j", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!tn", name = "s", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!tn", name = "t", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!tn", name = "u", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!tn", name = "v", descriptor = "[Lvp;")
    public static class162[] field1020;

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(I)V")
    public static final void method589(int arg0) {
        field1018++;
        class633 var1 = null;
        try {
            class21 var2 = class442.field5896.method2019("2", true, true);
            while (var2.field202 == 0) {
                class236.method1513(true, 1L);
            }
            if (var2.field202 == arg0) {
                var1 = (class633) var2.field201;
                class148 var3 = new class148((class311.field4287 * 6) + 3);
                var3.method1049(-1, 1);
                var3.method1027(255, class311.field4287);
                for (int var4 = 0; var4 < class624.field9201.length; var4++) {
                    if (class428.field5753[var4]) {
                        var3.method1027(arg0 + 254, var4);
                        var3.method1058(602643080, class624.field9201[var4]);
                    }
                }
                var1.method3682((byte) -13, var3.field2146, var3.field2177, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method3685(-5948);
            }
        } catch (Exception var5) {
        }
        class9.field99 = class598.method3538(true);
        class348.field4774 = false;
    }

    @OriginalMember(owner = "client!tn", name = "b", descriptor = "(I)V")
    public static void method590(int arg0) {
        field1020 = null;
        if (arg0 != 3) {
            method590(55);
        }
    }

    @OriginalMember(owner = "client!tn", name = "<init>", descriptor = "(ZLlp;)V")
    public class76(boolean arg0, class331 arg1) {
        if (arg0) {
            if (class331.field4577.startsWith("win")) {
                this.field1011 = 1;
            } else if (class331.field4577.startsWith("mac")) {
                this.field1011 = 2;
            } else if (class331.field4577.startsWith("linux")) {
                this.field1011 = 3;
            } else {
                this.field1011 = 4;
            }
            if (class331.field4566.startsWith("amd64") || class331.field4566.startsWith("x86_64")) {
                this.field1007 = true;
            } else {
                this.field1007 = false;
            }
            if (class331.field4572.toLowerCase().indexOf("sun") != -1) {
                this.field1014 = 1;
            } else if (class331.field4572.toLowerCase().indexOf("microsoft") != -1) {
                this.field1014 = 2;
            } else if (class331.field4572.toLowerCase().indexOf("apple") == -1) {
                this.field1014 = 4;
            } else {
                this.field1014 = 3;
            }
            int var3 = 2;
            int var4 = 0;
            try {
                while (class331.field4562.length() > var3) {
                    char var5 = class331.field4562.charAt(var3);
                    if (var5 < '0' || var5 > '9') {
                        break;
                    }
                    var4 = var4 * 10 + var5 - 48;
                    var3++;
                }
            } catch (Exception var15) {
            }
            this.field1013 = var4;
            int var6 = class331.field4562.indexOf(46, 2) + 1;
            int var7 = 0;
            try {
                while (class331.field4562.length() > var6) {
                    char var8 = class331.field4562.charAt(var6);
                    if (var8 < '0' || var8 > '9') {
                        break;
                    }
                    var7 = var7 * 10 - (48 - var8);
                    var6++;
                }
            } catch (Exception var14) {
            }
            this.field1015 = var7;
            int var9 = 0;
            int var10 = class331.field4562.indexOf(95, 4) + 1;
            try {
                while (class331.field4562.length() > var10) {
                    char var11 = class331.field4562.charAt(var10);
                    if (var11 < '0' || var11 > '9') {
                        break;
                    }
                    var10++;
                    var9 = var9 * 10 + var11 - 48;
                }
            } catch (Exception var13) {
            }
            this.field1009 = class467.field6579;
            if (this.field1013 > 3) {
                this.field1010 = class132.field1814;
            } else {
                this.field1010 = 0;
            }
            if (class331.field4576 == 3) {
                this.field1016 = true;
            } else {
                this.field1016 = false;
            }
            this.field1012 = var9;
            try {
                this.field1008 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
            } catch (Throwable var12) {
                this.field1008 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tn", name = "a", descriptor = "(BLgw;)V")
    public final void method591(byte arg0, class148 arg1) {
        arg1.method1049(-1, 2);
        int var3 = -6 % ((43 - arg0) / 62);
        field1017++;
        arg1.method1049(-1, this.field1011);
        arg1.method1049(-1, this.field1007 ? 1 : 0);
        arg1.method1049(-1, this.field1014);
        arg1.method1049(-1, this.field1013);
        arg1.method1049(-1, this.field1015);
        arg1.method1049(-1, this.field1012);
        arg1.method1049(-1, this.field1016 ? 1 : 0);
        arg1.method1027(255, this.field1009);
        arg1.method1049(-1, this.field1010);
        arg1.method1056(this.field1008, false);
    }
}
