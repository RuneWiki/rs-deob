import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kba")
public class class184 {

    @OriginalMember(owner = "client!kba", name = "c", descriptor = "Leda;")
    private class14 field3097 = new class14(64);

    @OriginalMember(owner = "client!kba", name = "l", descriptor = "Leda;")
    public class14 field3106 = new class14(2);

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "Lla;")
    public class422 field3095;

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "Lla;")
    private class422 field3096;

    @OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
    public static int field3102 = 0;

    @OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
    public static int field3104 = 0;

    @OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!kba", name = "f", descriptor = "Laaa;")
    public static class25 field3100;

    @OriginalMember(owner = "client!kba", name = "e", descriptor = "[[I")
    public static int[][] field3099;

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(B)V", line = 8)
    public final void method1411(byte arg0) {
        class14 var2 = this.field3097;
        synchronized (this.field3097) {
            this.field3097.method76(-96);
        }
        field3103++;
        int var3 = 68 / ((arg0 + 39) / 42);
        class14 var4 = this.field3106;
        synchronized (this.field3106) {
            this.field3106.method76(52);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(II)V", line = 24)
    public final void method1412(int arg0, int arg1) {
        if (arg1 != 33) {
            this.method1414(-49);
        }
        class14 var3 = this.field3097;
        synchronized (this.field3097) {
            this.field3097.method68(-16878, arg0);
        }
        field3101++;
        class14 var4 = this.field3106;
        synchronized (this.field3106) {
            this.field3106.method68(-16878, arg0);
        }
    }

    @OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V", line = 41)
    public static void method1413(int arg0) {
        field3099 = null;
        field3100 = null;
        if (arg0 != 33) {
            method1413(-42);
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V", line = 54)
    public final void method1414(int arg0) {
        field3098++;
        class14 var2 = this.field3097;
        synchronized (this.field3097) {
            this.field3097.method71((byte) 44);
        }
        if (arg0 == -1413) {
            class14 var3 = this.field3106;
            synchronized (this.field3106) {
                this.field3106.method71((byte) 44);
            }
        }
    }

    @OriginalMember(owner = "client!kba", name = "b", descriptor = "(II)Ldm;", line = 72)
    public final class94 method1415(int arg0, int arg1) {
        field3105++;
        class14 var3 = this.field3097;
        class94 var4;
        synchronized (this.field3097) {
            var4 = (class94) this.field3097.method80((byte) -15, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class422 var5 = this.field3096;
        byte[] var6;
        synchronized (this.field3096) {
            var6 = this.field3096.method2624(0, 33, arg0);
        }
        class94 var7 = new class94();
        var7.field1404 = this;
        if (var6 != null) {
            var7.method784(0, new class301(var6));
        }
        if (arg1 >= -67) {
            field3102 = 52;
        }
        class14 var8 = this.field3097;
        synchronized (this.field3097) {
            this.field3097.method67((long) arg0, var7, -6772);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lcr;ILla;Lla;)V", line = 121)
    public class184(class292 arg0, int arg1, class422 arg2, class422 arg3) {
        this.field3095 = arg3;
        this.field3096 = arg2;
        this.field3096.method2615(0, 33);
    }
}
