import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class528 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "J")
    public long field7761;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "Lht;")
    private class410 field7772;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Ljm;")
    public static class485 field7764 = new class485(60, 2);

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "Lsl;")
    public static class317 field7771 = new class317();

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Lof;")
    public static class438 field7773 = new class438("LIVE", 0);

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field7769;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Lvh;")
    public static class240 field7767;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "Lhn;")
    public static class506 field7770;

    @OriginalMember(owner = "client!lo", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field7772.method2436((byte) -78, this.field7761);
        field7762++;
        super.finalize();
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V", line = 12)
    public static void method3100(int arg0) {
        field7770 = null;
        field7764 = null;
        field7773 = null;
        if (arg0 > 74) {
            field7771 = null;
            field7767 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V", line = 30)
    public static final void method3101(int arg0, int arg1) {
        field7765++;
        if (!class437.field6374.field4264) {
            arg1 = -1;
        }
        if (class482.field7070 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class97 var2 = class504.field7419.method938(arg1, 125);
            class531 var3 = var2.method659(true);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class282.field3804.method2272(class474.field6924, new Point(var2.field1343, var2.field1347), var3.method3122(), 21124, var3.method3131(), var3.method3130());
                class482.field7070 = arg1;
            }
        }
        if (arg1 == -1 && class482.field7070 != -1) {
            class282.field3804.method2272(class474.field6924, new Point(), -1, 21124, null, -1);
            class482.field7070 = -1;
        }
        if (arg0 > -4) {
            field7764 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)V", line = 76)
    public static final void method3102(int arg0) {
        field7763++;
        if (class117.field1578 != null) {
            class117.field1578.method644(-85);
            class117.field1578 = null;
        }
        class193.method1169(-11544);
        class166.method1029();
        for (int var1 = 0; var1 < 4; var1++) {
            class6.field64[var1].method2467((byte) 69);
        }
        class101.method671(false, 64);
        System.gc();
        class316.method1794(2, -125);
        class208.field2948 = false;
        class444.field6455 = -1;
        class331.method1838(1540, true);
        class79.field1134 = 0;
        class297.field4107 = 0;
        class215.field3059 = 0;
        class65.field897 = 0;
        class446.field6464 = 0;
        for (int var2 = 0; var2 < class324.field4457.length; var2++) {
            class324.field4457[var2] = null;
        }
        if (arg0 >= -123) {
            field7773 = null;
        }
        class442.method2635((byte) 52);
        for (int var3 = 0; var3 < 2048; var3++) {
            class309.field4234[var3] = null;
        }
        class166.field2352 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class179.field2534[var4] = null;
        }
        class456.field6672.method992(-15728);
        class171.method1062(0);
        class514.field7551 = 0;
        class453.field6623.method1889(-16777216);
        class383.method2198(-21963);
        class520.method3059(false);
        class401.method2323(true, -4630);
        try {
            class484.method2855(class282.field3804.field5516, "loggedout", -29222);
        } catch (Throwable var5) {
        }
        class138.field1984 = null;
        class284.field3820 = 0L;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 154)
    public static final void method3103(byte arg0) {
        for (class129 var1 = (class129) class184.field2573.method3072((byte) 62); var1 != null; var1 = (class129) class184.field2573.method3066(2)) {
            if (var1.field1772) {
                var1.method844((byte) -55);
            }
        }
        field7768++;
        class129 var2 = (class129) class20.field217.method3072((byte) 117);
        if (arg0 >= -29) {
            field7771 = null;
        }
        while (var2 != null) {
            if (var2.field1772) {
                var2.method844((byte) -55);
            }
            var2 = (class129) class20.field217.method3066(2);
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lht;JI)V", line = 192)
    public class528(class410 arg0, long arg1, int arg2) {
        this.field7761 = arg1;
        this.field7772 = arg0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)I", line = 207)
    public static final int method3104(int arg0, int arg1, int arg2, int arg3) {
        field7769++;
        if (arg0 == arg3) {
            return arg0;
        }
        int var4 = 128 - arg2;
        int var5 = (arg0 & 0x7F) * var4 + (arg3 & 0x7F) * arg2 >> 7;
        int var6 = (arg0 & 0x380) * var4 + (arg3 & 0x380) * arg2 >> 7;
        int var7 = (arg0 & 0xFC00) * var4 + (arg1 & arg3) * arg2 >> 7;
        return var5 & 0x7F | var6 & 0x380 | var7 & 0xFC00;
    }
}
