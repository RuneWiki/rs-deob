import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class306 {

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "Ld;")
    private class242 field4688 = new class242(64);

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lum;")
    private class83 field4685;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field4687;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Liv;")
    public static class292 field4682;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[[S")
    public static short[][] field4689;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V", line = 10)
    public static final void method2022(int arg0, int arg1, byte arg2) {
        field4690++;
        if (class31.method189(14, arg0)) {
            class186.method1297(-1, class237.field3555[arg0], arg1);
            if (arg2 <= 58) {
                field4689 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII)I", line = 27)
    public static final int method2023(int arg0, int arg1, int arg2, int arg3) {
        field4683++;
        if (arg0 != 5) {
            field4689 = null;
        }
        if (arg2 < arg1) {
            return arg1;
        } else if (arg3 < arg2) {
            return arg3;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BI)Lqm;", line = 39)
    public final class284 method2024(byte arg0, int arg1) {
        field4684++;
        class242 var3 = this.field4688;
        class284 var5;
        synchronized (this.field4688) {
            if (arg0 <= 10) {
                return null;
            }
            var5 = (class284) this.field4688.method1634((long) arg1, 64);
        }
        if (var5 != null) {
            return var5;
        }
        class83 var6 = this.field4685;
        byte[] var7;
        synchronized (this.field4685) {
            var7 = this.field4685.method731(0, arg1, 5);
        }
        class284 var8 = new class284();
        if (var7 != null) {
            var8.method1909(new class194(var7), (byte) -122);
        }
        class242 var9 = this.field4688;
        synchronized (this.field4688) {
            this.field4688.method1623((long) arg1, 17621, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 72)
    public static void method2025(byte arg0) {
        field4682 = null;
        if (arg0 != -75) {
            method2022(65, 8, (byte) -51);
        }
        field4689 = null;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lpt;ILum;)V", line = 86)
    public class306(class308 arg0, int arg1, class83 arg2) {
        this.field4685 = arg2;
        this.field4685.method748(5, 12408);
    }
}
