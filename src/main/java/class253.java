import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class253 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lah;")
    public static class22 field4474 = new class22(30);

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[Lqj;")
    public static class196[] field4482 = new class196[1000];

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Lp;")
    public static class56 field4481;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4478;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "[Lqh;")
    public static class68[] field4484;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)V")
    public static final void method1710(int arg0, byte arg1, int arg2) {
        field4479++;
        if (class125.field1767 < 2 && class34.field416 == 0 && !class171.field2883) {
            return;
        }
        class196 var3;
        if (class34.field416 == 1 && class125.field1767 < 2) {
            var3 = class93.method572(-114, new class196[] { class80.field1150, class150.field2408, class232.field4135, class133.field1896 });
        } else if (class171.field2883 && class125.field1767 < 2) {
            var3 = class93.method572(-120, new class196[] { class57.field764, class150.field2408, class206.field3706, class133.field1896 });
        } else {
            var3 = class226.method1528(64, class125.field1767 - 1);
        }
        if (arg1 != -13) {
            return;
        }
        if (class125.field1767 > 2) {
            var3 = class93.method572(arg1 ^ 0x5E, new class196[] { var3, class22.field284, class163.method1029(class125.field1767 - 2, false), class164.field2657 });
        }
        int var4 = class23.field292.method1237(var3, arg0 + 4, arg2 - -15, 16777215, 0, class221.field3987, class49.field591);
        class166.method1070(var4 + class23.field292.method1240(var3), 15, arg0 + 4, 0, arg2);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class253() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static final void method1711(byte arg0) {
        field4476++;
        Object var1 = class20.field230;
        synchronized (class20.field230) {
            if (class127.field1800 == 0) {
                class168.field2844.method1398(5, 0, new class102());
            }
            class127.field1800 = 600;
            if (arg0 < 53) {
                method1710(20, (byte) -121, 113);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static void method1712(int arg0) {
        if (arg0 != -26490) {
            method1710(-34, (byte) 7, -95);
        }
        field4474 = null;
        field4482 = null;
        field4481 = null;
        field4484 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILp;)V")
    public static final void method1713(int arg0, class56 arg1) {
        field4477++;
        if (arg1.field693.length - arg1.field699 < 1) {
            return;
        }
        int var2 = arg1.method367(1);
        if (var2 < 0 || var2 > 2) {
            return;
        }
        byte var3;
        if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field693.length - arg1.field699 < var3) {
            return;
        }
        class50.field602 = arg1.method367(1);
        if (class50.field602 < 1) {
            class50.field602 = 1;
        } else if (class50.field602 > 4) {
            class50.field602 = 4;
        }
        class111.method661(arg1.method367(~arg0) == 1, (byte) 68);
        class240.field4271 = arg1.method367(1) == 1;
        class219.field3919 = arg1.method367(1) == 1;
        class71.field1004 = arg1.method367(1) == 1;
        class203.field3661 = arg1.method367(1) == 1;
        class133.field1898 = arg1.method367(1) == 1;
        class19.field228 = arg1.method367(1) == 1;
        class151.field2444 = arg1.method367(arg0 + 3) == 1;
        class159.field2554 = arg1.method367(1);
        if (class159.field2554 > 2) {
            class159.field2554 = 2;
        }
        if (var2 >= 2) {
            class174.field2935 = arg1.method367(arg0 + 3) == 1;
        } else {
            class174.field2935 = arg1.method367(1) == 1;
            arg1.method367(1);
        }
        class159.field2556 = ~arg1.method367(1) == arg0;
        class192.field3371 = arg1.method367(1) == 1;
        class88.field1293 = arg1.method367(1);
        if (class88.field1293 > 2) {
            class88.field1293 = 2;
        }
        class45.field543 = arg1.method367(arg0 + 3) == 1;
        class189.field3315 = arg1.method367(1);
        if (class189.field3315 > 127) {
            class189.field3315 = 127;
        }
        class211.field3801 = arg1.method367(arg0 + 3);
        class70.field977 = arg1.method367(arg0 + 3);
        if (class70.field977 > 127) {
            class70.field977 = 127;
        }
        if (var2 >= 1) {
            class132.field1890 = arg1.method318(true);
            class172.field2906 = arg1.method318(true);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[BLp;)V")
    public final void method1714(byte arg0, byte[] arg1, class56 arg2) {
        field4475++;
        if (arg2.field693[arg2.field699] != 31 || arg2.field693[arg2.field699 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4478 == null) {
            this.field4478 = new Inflater(true);
        }
        try {
            this.field4478.setInput(arg2.field693, arg2.field699 + 10, -arg2.field699 + -10 + -8 + arg2.field693.length);
            this.field4478.inflate(arg1);
            int var4 = -94 / ((-arg0 - 67) / 53);
        } catch (Exception var5) {
            this.field4478.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4478.reset();
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(III)V")
    private class253(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static final void method1715(byte arg0) {
        if (arg0 < 121) {
            field4484 = null;
        }
        class44.field520.method1173(140, 14592);
        field4480++;
        class44.field520.method346(0L, (byte) 59);
        class85.field1252++;
    }
}
