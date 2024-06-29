import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class85 {

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "Ljt;")
    private class106 field1214 = new class106(64);

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "Lvd;")
    private class39 field1216;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "Lmia;")
    public static class63 field1217 = new class63(19, -1);

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
    public static int field1218;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "[Lnn;")
    public static class417[] field1210;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)Lws;")
    public final class359 method692(int arg0, int arg1) {
        field1211++;
        class106 var3 = this.field1214;
        class359 var4;
        synchronized (this.field1214) {
            var4 = (class359) this.field1214.method803(122, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 > -81) {
            this.field1216 = null;
        }
        class39 var5 = this.field1216;
        byte[] var6;
        synchronized (this.field1216) {
            var6 = this.field1216.method211(true, 31, arg1);
        }
        class359 var7 = new class359();
        if (var6 != null) {
            var7.method2243(0, new class645(var6));
        }
        class106 var8 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method801(1, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lcq;")
    public static final class468 method693(int arg0) {
        field1212++;
        if (arg0 < 23) {
            return null;
        } else if (class502.field7146 == 0) {
            return new class468();
        } else {
            return class280.field3964[--class502.field7146];
        }
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
    public static void method694(int arg0) {
        if (arg0 != -7339) {
            field1210 = null;
        }
        field1210 = null;
        field1217 = null;
    }

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "(II)V")
    public final void method695(int arg0, int arg1) {
        class106 var3 = this.field1214;
        synchronized (this.field1214) {
            if (arg1 != -12004) {
                this.method697(true);
            }
            this.field1214.method807(arg0, -1);
        }
        field1213++;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)V")
    public static final void method696(int arg0) {
        class741.field10402 = null;
        class390.field5885 = -1;
        field1218++;
        if (arg0 != -1) {
            field1217 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(Z)V")
    public final void method697(boolean arg0) {
        field1219++;
        if (arg0) {
            this.field1216 = null;
        }
        class106 var2 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method800(86);
        }
    }

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V")
    public final void method698(int arg0) {
        field1215++;
        class106 var2 = this.field1214;
        synchronized (this.field1214) {
            this.field1214.method809(true);
            if (arg0 != 31) {
                field1220 = 122;
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lqg;ILvd;)V")
    public class85(class464 arg0, int arg1, class39 arg2) {
        this.field1216 = arg2;
        this.field1216.method229(31, 0);
    }
}
