import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class192 {

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "Lok;")
    public static class41 field3104 = class137.method956("null", 45);

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "[I")
    public static int[] field3103 = new int[5];

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "Lok;")
    public static class41 field3106 = class137.method956("Konfig geladen)3", 45);

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "[S")
    public static short[] field3105 = new short[] { 58, 6, 20, 19, 9, 32, 14, 48 };

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
    public static int field3107 = 0;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method1375(int arg0, boolean arg1) {
        class306.field5131.method138(arg0, 0);
        if (!arg1) {
            method1377((Component) null, true);
        }
        field3098++;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILlb;)V", line = 16)
    public static final void method1376(int arg0, class112 arg1) {
        field3099++;
        if (arg1.field1607.length - arg1.field1640 < 1) {
            return;
        }
        int var2 = arg1.method792(2);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        int var3 = 57 % ((arg0 - 55) / 63);
        byte var4;
        if (var2 == 7) {
            var4 = 29;
        } else if (var2 == 6) {
            var4 = 28;
        } else if (var2 == 5) {
            var4 = 28;
        } else if (var2 == 4) {
            var4 = 24;
        } else if (var2 == 3) {
            var4 = 23;
        } else if (var2 == 2) {
            var4 = 22;
        } else if (var2 == 1) {
            var4 = 23;
        } else {
            var4 = 19;
        }
        if (var4 > (arg1.field1607.length - arg1.field1640)) {
            return;
        }
        class262.field4171 = arg1.method792(2);
        if (class262.field4171 < 1) {
            class262.field4171 = 1;
        } else if (class262.field4171 > 4) {
            class262.field4171 = 4;
        }
        class290.method2019(arg1.method792(2) == 1, (byte) -88);
        class33.field499 = arg1.method792(2) == 1;
        class296.field4778 = arg1.method792(2) == 1;
        class81.field1200 = arg1.method792(2) == 1;
        class207.field3359 = arg1.method792(2) == 1;
        class14.field181 = arg1.method792(2) == 1;
        class241.field3863 = arg1.method792(2) == 1;
        class46.field722 = arg1.method792(2) == 1;
        class152.field2419 = arg1.method792(2);
        if (class152.field2419 > 2) {
            class152.field2419 = 2;
        }
        if (var2 >= 2) {
            class66.field1006 = arg1.method792(2) == 1;
        } else {
            class66.field1006 = arg1.method792(2) == 1;
            arg1.method792(2);
        }
        class27.field393 = arg1.method792(2) == 1;
        class296.field4787 = arg1.method792(2) == 1;
        class285.field4641 = arg1.method792(2);
        if (class285.field4641 > 2) {
            class285.field4641 = 2;
        }
        class235.field3760 = arg1.method792(2) == 1;
        class1.field3 = arg1.method792(2);
        if (class1.field3 > 127) {
            class1.field3 = 127;
        }
        class244.field3900 = arg1.method792(2);
        class225.field3606 = arg1.method792(2);
        if (class225.field3606 > 127) {
            class225.field3606 = 127;
        }
        if (var2 >= 1) {
            class167.field2655 = arg1.method759((byte) -66);
            class226.field3616 = arg1.method759((byte) -120);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method792(2);
        }
        if (var2 >= 4) {
            arg1.method792(2);
        }
        if (var2 >= 5) {
            class178.field2888 = arg1.method779(-27100);
        }
        if (var2 >= 6) {
            class314.field5298 = arg1.method792(2);
        }
        if (var2 >= 7) {
            class241.field3848 = arg1.method792(2) == 1;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/awt/Component;Z)V", line = 149)
    public static final void method1377(Component arg0, boolean arg1) {
        field3101++;
        arg0.addMouseListener(class43.field679);
        if (arg1) {
            field3105 = (short[]) null;
        }
        arg0.addMouseMotionListener(class43.field679);
        arg0.addFocusListener(class43.field679);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Lfa;", line = 165)
    public static final class239 method1378(int arg0, int arg1) {
        field3100++;
        class239 var2 = (class239) class306.field5128.method554((long) arg1, -97);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class139.field2133.method454(26, arg0 ^ arg0, arg1);
        class239 var4 = new class239();
        if (var3 != null) {
            var4.method1715(new class112(var3), arg0 - 22178);
        }
        class306.field5128.method555((long) arg1, (byte) -122, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V", line = 185)
    public static void method1379(int arg0) {
        field3106 = null;
        field3104 = null;
        if (arg0 <= -95) {
            field3103 = null;
            field3105 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V", line = 201)
    public static final void method1380(boolean arg0) {
        field3102++;
        if (class85.field1225[96]) {
            class22.field342 += (-class22.field342 - 24) / 2;
        } else if (class85.field1225[97]) {
            class22.field342 += (24 - class22.field342) / 2;
        } else {
            class22.field342 /= 2;
        }
        if (arg0) {
            return;
        }
        int var1 = class298.field4836 + class62.field913.field4311;
        if (class85.field1225[98]) {
            class86.field1268 += (12 - class86.field1268) / 2;
        } else if (class85.field1225[99]) {
            class86.field1268 += (-class86.field1268 - 12) / 2;
        } else {
            class86.field1268 /= 2;
        }
        class8.field101 += class22.field342 / 2;
        class286.field4658 += class86.field1268 / 2;
        int var2 = class127.field1886 + class62.field913.field4280;
        if ((class79.field1167 - var2) < -500 || (class79.field1167 - var2) > 500 || (class272.field4420 - var1) < -500 || class272.field4420 - var1 > 500) {
            class79.field1167 = var2;
            class272.field4420 = var1;
        }
        if (class272.field4420 != var1) {
            class272.field4420 += (var1 - class272.field4420) / 16;
        }
        if (class79.field1167 != var2) {
            class79.field1167 += (var2 - class79.field1167) / 16;
        }
        class140.method978((byte) -44);
    }
}
