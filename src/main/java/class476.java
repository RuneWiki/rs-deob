import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class476 {

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "Lpca;")
    private class653 field6934 = new class653(64);

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "Lpca;")
    public class653 field6936 = new class653(64);

    @OriginalMember(owner = "client!ni", name = "i", descriptor = "Ljo;")
    public class303 field6931;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "Ljo;")
    private class303 field6926;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "[I")
    public static int[] field6935;

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "[Lwv;")
    public static class32[] field6930;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ZI)Lwe;")
    public final class370 method2773(boolean arg0, int arg1) {
        field6927++;
        class653 var3 = this.field6934;
        class370 var4;
        synchronized (this.field6934) {
            var4 = (class370) this.field6934.method3690((byte) 117, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        if (!arg0) {
            this.field6926 = null;
        }
        class303 var5 = this.field6926;
        byte[] var6;
        synchronized (this.field6926) {
            var6 = this.field6926.method1719(arg1, 34, 4);
        }
        class370 var7 = new class370();
        var7.field4810 = this;
        if (var6 != null) {
            var7.method2022(new class452(var6), (byte) 121);
        }
        class653 var8 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method3683(var7, (byte) 93, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)V")
    public final void method2774(int arg0, int arg1) {
        field6924++;
        class653 var3 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method3691(false, arg1);
        }
        class653 var4 = this.field6936;
        synchronized (this.field6936) {
            this.field6936.method3691(false, arg1);
        }
        if (arg0 < 124) {
            this.method2779(-54, -17, -30);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method2775(int arg0) {
        field6930 = null;
        field6935 = null;
        if (arg0 != 2169) {
            method2775(-91);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/awt/Canvas;Le;I)Loa;")
    public static final class635 method2776(Canvas arg0, class486 arg1, int arg2) {
        field6923++;
        if (arg2 != 34) {
            method2775(-35);
        }
        return new class56(arg0, arg1);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method2777(int arg0) {
        field6933++;
        class653 var2 = this.field6934;
        synchronized (this.field6934) {
            if (arg0 != 34) {
                this.field6931 = null;
            }
            this.field6934.method3687((byte) -10);
        }
        class653 var3 = this.field6936;
        synchronized (this.field6936) {
            this.field6936.method3687((byte) -10);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public final void method2778(byte arg0) {
        field6929++;
        class653 var2 = this.field6934;
        synchronized (this.field6934) {
            this.field6934.method3684(-17200);
            int var3 = 108 / ((43 - arg0) / 39);
        }
        class653 var4 = this.field6936;
        synchronized (this.field6936) {
            this.field6936.method3684(-17200);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    public final void method2779(int arg0, int arg1, int arg2) {
        field6925++;
        if (arg2 < 42) {
            this.method2773(false, 64);
        }
        this.field6934 = new class653(arg0);
        this.field6936 = new class653(arg1);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZLoa;)Led;")
    public static final class645 method2780(int arg0, boolean arg1, class635 arg2) {
        field6928++;
        class145 var3 = class65.method429(arg0, arg2, arg1, (byte) 47);
        return var3 == null ? null : var3.field1623;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljda;ILjo;Ljo;)V")
    public class476(class207 arg0, int arg1, class303 arg2, class303 arg3) {
        this.field6931 = arg3;
        this.field6926 = arg2;
        this.field6926.method1727(-77, 34);
    }
}
