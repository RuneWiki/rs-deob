import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class210 {

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Lku;")
    private class232 field3189 = new class232(64);

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "Lku;")
    public class232 field3194 = new class232(2);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lb;")
    public class201 field3185;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lb;")
    private class201 field3187;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field3193 = 20;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public final void method1362(int arg0) {
        field3191++;
        class232 var2 = this.field3189;
        synchronized (this.field3189) {
            this.field3189.method1478((byte) -92);
        }
        class232 var3 = this.field3194;
        synchronized (this.field3194) {
            this.field3194.method1478((byte) -119);
            if (arg0 != 20) {
                this.method1366(0, -67);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)Lfe;")
    public final class369 method1363(int arg0, int arg1) {
        field3186++;
        class232 var3 = this.field3189;
        class369 var4;
        synchronized (this.field3189) {
            var4 = (class369) this.field3189.method1479(0, (long) arg1);
        }
        if (arg0 < 29) {
            this.field3185 = null;
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3187.method1257(arg1, 33, 24558);
        class369 var6 = new class369();
        var6.field5336 = this;
        if (var5 != null) {
            var6.method2269(new class276(var5), false);
        }
        class232 var7 = this.field3189;
        synchronized (this.field3189) {
            this.field3189.method1473(var6, (long) arg1, -89);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public final void method1364(byte arg0) {
        field3190++;
        class232 var2 = this.field3189;
        synchronized (this.field3189) {
            this.field3189.method1475(0);
        }
        class232 var3 = this.field3194;
        synchronized (this.field3194) {
            if (arg0 >= 9) {
                this.field3194.method1475(0);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1365(int arg0, int arg1, String[] arg2, int arg3) {
        field3188++;
        if (arg0 == arg1) {
            return "";
        } else if (arg1 == 1) {
            String var4 = arg2[arg3];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg1 + arg3;
            int var6 = 0;
            for (int var7 = arg3; var7 < var5; var7++) {
                String var11 = arg2[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg3; var9 < var5; var9++) {
                String var10 = arg2[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
    public final void method1366(int arg0, int arg1) {
        field3192++;
        class232 var3 = this.field3189;
        synchronized (this.field3189) {
            if (arg0 < 12) {
                field3193 = -13;
            }
            this.field3189.method1486(438127120, arg1);
        }
        class232 var4 = this.field3194;
        synchronized (this.field3194) {
            this.field3194.method1486(438127120, arg1);
        }
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lea;ILb;Lb;)V")
    public class210(class353 arg0, int arg1, class201 arg2, class201 arg3) {
        this.field3185 = arg3;
        this.field3187 = arg2;
        this.field3187.method1235(0, 33);
    }
}
