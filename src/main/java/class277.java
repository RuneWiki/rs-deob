import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class277 extends class282 {

    @OriginalMember(owner = "client!a", name = "S", descriptor = "Lwe;")
    public class51 field4764;

    @OriginalMember(owner = "client!a", name = "O", descriptor = "Lni;")
    public static class24 field4760 = new class24(100);

    @OriginalMember(owner = "client!a", name = "T", descriptor = "Lpc;")
    public static class91 field4765 = new class91(64);

    @OriginalMember(owner = "client!a", name = "U", descriptor = "Ljf;")
    public static class229 field4766 = class212.method1457((byte) 109, "null");

    @OriginalMember(owner = "client!a", name = "W", descriptor = "Ljf;")
    public static class229 field4768 = class212.method1457((byte) 83, " est d-Bj-9 dans votre liste noire)3");

    @OriginalMember(owner = "client!a", name = "M", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!a", name = "Q", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 5)
    public static final void method1948() {
        GL var0 = class108.field1899;
        var0.glDisableClientState(32886);
        class108.method771(false);
        var0.glDisable(2929);
        var0.glPushAttrib(128);
        var0.glFogf(2915, 3072.0F);
        class108.method769();
        for (int var1 = 0; var1 < class1.field1[0].length; var1++) {
            class37 var2 = class1.field1[0][var1];
            if (var2.field674 >= 0 && class227.field3904.method1507(false, var2.field674) == 4) {
                var0.glColor4fv(class4.method26(255, var2.field683), 0);
                float var3 = 201.5F - (var2.field694 ? 1.0F : 0.5F);
                var2.method327(class312.field5246, var3, true);
            }
        }
        var0.glEnableClientState(32886);
        class108.method762();
        var0.glEnable(2929);
        var0.glPopAttrib();
        class108.method767();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lkh;B)Le;", line = 40)
    public static final class161 method1949(class14 arg0, byte arg1) {
        field4758++;
        class161 var2 = new class161(arg0.method105((byte) 127), arg0.method105((byte) -52), arg0.method116(-1), arg0.method116(-1), arg0.method128((byte) 4), arg0.method93(false) == 1);
        int var3 = arg0.method93(false);
        int var4 = 0;
        if (arg1 != 56) {
            field4768 = (class229) null;
        }
        while (var4 < var3) {
            var2.field2743.method2079(new class64(arg0.method116(-1), arg0.method116(-1), arg0.method116(-1), arg0.method116(-1)), 77);
            var4++;
        }
        var2.method1081((byte) -109);
        return var2;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILwl;)V", line = 68)
    public static final void method1950(int arg0, class89 arg1) {
        long var2 = 0L;
        if (arg1.field1628 == 0) {
            var2 = class104.method701(arg1.field1635, arg1.field1641, arg1.field1633);
        }
        if (arg1.field1628 == 1) {
            var2 = class31.method263(arg1.field1635, arg1.field1641, arg1.field1633);
        }
        int var4 = -1;
        field4763++;
        int var5 = 0;
        if (arg1.field1628 == 2) {
            var2 = class122.method864(arg1.field1635, arg1.field1641, arg1.field1633);
        }
        int var6 = 0;
        if (arg0 != 18315) {
            return;
        }
        if (arg1.field1628 == 3) {
            var2 = class124.method880(arg1.field1635, arg1.field1641, arg1.field1633);
        }
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var6 = ((int) var2 & 0x3BEEFF) >> 20;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        arg1.field1639 = var4;
        arg1.field1636 = var6;
        arg1.field1637 = var5;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(III)I", line = 122)
    public static final int method1951(int arg0, int arg1, int arg2) {
        field4761++;
        int var3 = 1;
        if (arg2 != -1) {
            return -122;
        }
        while (arg1 > 1) {
            if ((arg1 & 0x1) != 0) {
                var3 = arg0 * var3;
            }
            arg1 >>= 0x1;
            arg0 *= arg0;
        }
        if (arg1 == 1) {
            return arg0 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V", line = 154)
    public static void method1952(int arg0) {
        field4768 = null;
        if (arg0 != 0) {
            method1948();
        }
        field4760 = null;
        field4766 = null;
        field4765 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lih;B)V", line = 175)
    public static final void method1953(class33 arg0, byte arg1) {
        field4759++;
        class165 var2 = (class165) class115.field2069.method1890(arg0.field621.method1617(92), -97);
        if (var2 == null) {
            class172.method1171((class331) null, false, 0, arg0, arg0.field2017[0], (class83) null, class16.field254, arg0.field2018[0]);
        } else {
            var2.method1133(0);
        }
        if (arg1 > -49) {
            field4765 = (class91) null;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lwe;)V", line = 197)
    public class277(class51 arg0) {
        this.field4764 = arg0;
    }
}
