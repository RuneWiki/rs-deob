import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class247 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lau;")
    private class692 field3257 = new class692(64);

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lmv;")
    private class295 field3264;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[Lofa;")
    public static class128[] field3260 = new class128[14];

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    public static int[] field3263 = new int[14];

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 5)
    public final void method1502(int arg0) {
        field3262++;
        class692 var2 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method3891(arg0 + 13748);
            if (arg0 != -1) {
                field3260 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZI)Lcj;", line = 22)
    public final class278 method1503(boolean arg0, int arg1) {
        field3256++;
        if (!arg0) {
            return null;
        }
        class692 var3 = this.field3257;
        class278 var4;
        synchronized (this.field3257) {
            var4 = (class278) this.field3257.method3901((long) arg1, -110);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field3264;
        byte[] var6;
        synchronized (this.field3264) {
            var6 = this.field3264.method1844(11, 31330, arg1);
        }
        class278 var7 = new class278();
        if (var6 != null) {
            var7.method1649(new class540(var6), (byte) -116);
        }
        class692 var8 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 53)
    public static void method1504(byte arg0) {
        field3260 = null;
        if (arg0 == 106) {
            field3263 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V", line = 74)
    public final void method1505(int arg0, int arg1) {
        class692 var3 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method3900(arg0, 0);
            if (arg1 <= 124) {
                this.method1507(-19);
            }
        }
        field3258++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/String;", line = 91)
    public static final String method1506(String arg0, boolean arg1) {
        field3261++;
        if (arg0 == null) {
            return null;
        }
        int var2 = 0;
        if (arg1) {
            method1504((byte) 85);
        }
        int var3 = arg0.length();
        while (var2 < var3 && class119.method872(32993, arg0.charAt(var2))) {
            var2++;
        }
        while (var2 < var3 && class119.method872(32993, arg0.charAt(var3 - 1))) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg0.charAt(var6);
            if (class543.method3188(0, var7)) {
                char var8 = class347.method2160((byte) -26, var7);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 146)
    public final void method1507(int arg0) {
        class692 var2 = this.field3257;
        synchronized (this.field3257) {
            this.field3257.method3890(arg0);
        }
        field3265++;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 158)
    public class247(class373 arg0, int arg1, class295 arg2) {
        this.field3264 = arg2;
        if (this.field3264 != null) {
            this.field3264.method1845(11, true);
        }
    }
}
