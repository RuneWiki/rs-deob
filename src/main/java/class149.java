import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class149 extends class212 {

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "[B")
    public byte[] field2588;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field2586 = 0;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Lqe;")
    public static class168 field2594 = class66.method448("::fpsoff", 25);

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "Lqe;")
    public static class168 field2593 = class66.method448("(U2", -120);

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZLmj;)V")
    public static final void method993(int arg0, boolean arg1, class129 arg2) {
        field2589++;
        int var3 = arg2.field2271 == 0 ? arg2.field2175 : arg2.field2271;
        int var4 = arg2.field2291 == 0 ? arg2.field2210 : arg2.field2291;
        if (arg0 != 10218) {
            return;
        }
        class251.method1649((byte) -82, var4, arg2.field2222, arg1, var3, class108.field1741[arg2.field2222 >> 16]);
        if (arg2.field2263 != null) {
            class251.method1649((byte) -118, var4, arg2.field2222, arg1, var3, arg2.field2263);
        }
        class114 var5 = (class114) class176.field3079.method1527((long) arg2.field2222, (byte) -67);
        if (var5 != null) {
            class81.method541(var4, arg1, var5.field1853, -1, var3);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Z")
    public static final boolean method994(int arg0, byte arg1) {
        field2585++;
        if (arg1 >= -91) {
            return true;
        } else if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else {
            return arg0 < 129 || arg0 > 159;
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
    public class149(byte[] arg0) {
        this.field2588 = arg0;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)[Lqg;")
    public static final class217[] method995(int arg0) {
        if (arg0 != 6410) {
            method994(66, (byte) 73);
        }
        field2587++;
        class217[] var1 = new class217[class85.field1331];
        for (int var2 = 0; var2 < class85.field1331; var2++) {
            var1[var2] = new class217(class243.field4225, class150.field2597, class33.field415[var2], class54.field746[var2], class85.field1332[var2], class69.field978[var2], class7.field84[var2], class92.field1457);
        }
        class246.method1613(0);
        return var1;
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "(I)V")
    public static void method996(int arg0) {
        field2594 = null;
        field2593 = null;
        if (arg0 != 50) {
            field2593 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    public static final void method997(int arg0, int arg1) {
        class142.field2494 = arg1;
        class80.field1206 = 50;
        field2592++;
        if (arg0 != 129) {
            method996(-83);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZIZI)Lrd;")
    public static final class207 method998(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4) {
        field2591++;
        class206 var5 = null;
        if (class99.field1560 != null) {
            var5 = new class206(arg4, class99.field1560, class94.field1479[arg4], 1000000);
        }
        return arg2 == -1762 ? new class207(var5, class199.field3437, arg4, arg1, arg0, arg3) : null;
    }
}
