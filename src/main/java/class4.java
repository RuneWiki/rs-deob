import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class4 {

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lad;")
    private class11 field25 = new class11(64);

    @OriginalMember(owner = "client!er", name = "j", descriptor = "I")
    public int field33 = 0;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "Ldn;")
    private class201 field28;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "[F")
    public static float[] field31 = new float[4];

    @OriginalMember(owner = "client!er", name = "d", descriptor = "Ljr;")
    public static class357 field27 = new class357(512);

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Lhb;")
    public static class250 field36 = new class250(66, 18);

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field37 = 0;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field24;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "Lup;")
    public static class275 field35;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)Lfs;", line = 3)
    public final class286 method20(int arg0, int arg1) {
        field29++;
        if (arg0 < 122) {
            field35 = null;
        }
        class11 var3 = this.field25;
        class286 var4;
        synchronized (this.field25) {
            var4 = (class286) this.field25.method78((long) arg1, (byte) -97);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field28.method1313((byte) -106, 4, arg1);
        class286 var6 = new class286();
        var6.field3654 = this;
        var6.field3650 = arg1;
        if (var5 != null) {
            var6.method1740(new class88(var5), (byte) -128);
        }
        var6.method1739((byte) -74);
        class11 var7 = this.field25;
        synchronized (this.field25) {
            this.field25.method88((long) arg1, 81, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 33)
    public static final void method21(byte arg0) {
        class8.field87 = class99.field1379.field3546 + class99.field1379.field3565 + 2;
        if (arg0 != -4) {
            field36 = null;
        }
        class329.field4217 = class157.field2070.field3565 + class157.field2070.field3546 + 2;
        class99.field1384 = new String[500];
        field24++;
        for (int var1 = 0; var1 < class99.field1384.length; var1++) {
            class99.field1384[var1] = "";
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(B)V", line = 57)
    public final void method22(byte arg0) {
        if (arg0 != -6) {
            field27 = null;
        }
        field26++;
        class11 var2 = this.field25;
        synchronized (this.field25) {
            this.field25.method90((byte) -27);
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)V", line = 70)
    public final void method23(int arg0, int arg1) {
        field30++;
        class11 var3 = this.field25;
        synchronized (this.field25) {
            if (arg1 >= -109) {
                this.field25 = null;
            }
            this.field25.method80(-31, arg0);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 87)
    public static void method24(int arg0) {
        field36 = null;
        field27 = null;
        int var1 = 33 / ((-arg0 - 58) / 47);
        field35 = null;
        field31 = null;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 102)
    public final void method25(int arg0) {
        field34++;
        class11 var2 = this.field25;
        synchronized (this.field25) {
            if (arg0 != 66) {
                this.field28 = null;
            }
            this.field25.method84(82);
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lgt;ILdn;)V", line = 142)
    public class4(class65 arg0, int arg1, class201 arg2) {
        this.field28 = arg2;
        this.field32 = this.field28.method1302(-128, 4);
    }
}
