import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class12 {

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lmq;")
    private class472 field200 = new class472(64);

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "Lmq;")
    public class472 field208 = new class472(60);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Ljn;")
    private class668 field197;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "Ljn;")
    public class668 field204;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lwo;")
    public static class690 field194 = new class690(19, 0);

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Ljava/lang/String;")
    public static String field203 = null;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field206 = 0;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "[I")
    public static int[] field207 = new int[1000];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lgda;")
    public static class50 field205;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method134(boolean arg0, int arg1) {
        field195++;
        class472 var3 = this.field200;
        synchronized (this.field200) {
            this.field200.method2777(arg1, 67);
        }
        class472 var4 = this.field208;
        synchronized (this.field208) {
            this.field208.method2777(arg1, 45);
            if (!arg0) {
                this.method139((byte) -116, -6);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 21)
    public final void method135(boolean arg0) {
        class472 var2 = this.field200;
        synchronized (this.field200) {
            this.field200.method2778((byte) 113);
        }
        field201++;
        class472 var3 = this.field208;
        synchronized (this.field208) {
            if (arg0) {
                this.method139((byte) 99, 43);
            }
            this.field208.method2778((byte) 111);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)Llca;", line = 37)
    public final class596 method136(int arg0, boolean arg1) {
        field193++;
        class472 var3 = this.field200;
        class596 var4;
        synchronized (this.field200) {
            var4 = (class596) this.field200.method2766(-124, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg1) {
            this.field197 = null;
        }
        class668 var5 = this.field197;
        byte[] var6;
        synchronized (this.field197) {
            var6 = this.field197.method3800(class451.method2674(arg0, 117), class516.method3056(2, arg0), (byte) -92);
        }
        class596 var7 = new class596();
        var7.field8606 = arg0;
        var7.field8612 = this;
        if (var6 != null) {
            var7.method3448(-13, new class389(var6));
        }
        class472 var8 = this.field200;
        synchronized (this.field200) {
            this.field200.method2772(var7, true, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjn;)V", line = 71)
    public static final void method137(int arg0, class668 arg1) {
        class434.field6231 = arg1;
        if (arg0 != 1) {
            method137(17, null);
        }
        field202++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 84)
    public static void method138(int arg0) {
        if (arg0 != -1) {
            field205 = null;
        }
        field207 = null;
        field194 = null;
        field203 = null;
        field205 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)V", line = 100)
    public final void method139(byte arg0, int arg1) {
        if (arg0 != -115) {
            this.method135(true);
        }
        field196++;
        this.field209 = arg1;
        class472 var3 = this.field208;
        synchronized (this.field208) {
            this.field208.method2776(false);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V", line = 115)
    public final void method140(int arg0) {
        field199++;
        class472 var2 = this.field200;
        synchronized (this.field200) {
            this.field200.method2776(false);
        }
        class472 var3 = this.field208;
        synchronized (this.field208) {
            this.field208.method2776(false);
        }
        if (arg0 > -123) {
            this.field209 = -56;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Z", line = 135)
    public static final boolean method141(int arg0, byte arg1) {
        int var2 = -75 % ((-arg1 - 22) / 49);
        field198++;
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(Ler;ILjn;Ljn;)V", line = 172)
    public class12(class90 arg0, int arg1, class668 arg2, class668 arg3) {
        this.field197 = arg2;
        this.field204 = arg3;
        int var5 = this.field197.method3779(5) - 1;
        this.field197.method3805(var5, false);
    }
}
