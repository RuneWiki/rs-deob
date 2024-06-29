import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class153 extends class295 {

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "[B")
    public byte[] field2325;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "[I")
    public static int[] field2329 = new int[] { 3, 0, -1, 0, 0, 0, 2, 6, 15, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 7, 0, 12, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 6, 0, -1, 0, 8, 8, 0, 10, 0, 0, 0, 0, 0, 0, 5, 0, 3, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 8, -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 8, -2, 0, 0, 8, 8, 12, 0, 14, 4, 0, 0, 0, -1, 0, 0, 0, 0, 8, 0, 6, 0, 4, -1, 5, 0, 4, 0, 0, 0, 2, 15, 14, 0, -2, 3, 1, 0, 0, 1, 8, 0, -2, 6, 0, 5, 6, 0, 0, 0, 7, -1, 0, 17, 0, 0, 6, 0, 0, 12, 0, 0, 0, -1, 6, 0, 0, -2, 0, -1, 0, 0, 0, 0, -2, -2, -1, 0, 0, 0, 0, -1, -2, 0, 0, 0, -1, 0, 3, 0, 6, 8, 12, 1, -2, 0, 0, 0, 2, 10, -2, 3, 2, 0, 6, 0, 0, 12, 6, -2, 5, -1, 0, 10, 0, -1, 0, -1, 0, 0, 0, 0, 0, 7, 0, 7, 2, 20, -2, 0, -1, 0, 0, 0, 0, 28, 3, 0, -1, 0, 0, 6, 0, 10, 0, 0, 2, 0, 0, 2, 2, 0, 0, 0, 0, 8, 0, 0, 3, -1, 6, 0, 0, 0, 0, 11, 0 };

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "[I")
    public static int[] field2328 = new int[4];

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "Lnq;")
    public static class124 field2332 = new class124(8);

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!uh", name = "D", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Z")
    public static boolean field2334;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;IZII)V", line = 4)
    public static final void method1176(String arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2333++;
        class139 var5 = class44.method411(arg3, arg2, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field2073 != null) {
            class361 var6 = new class361();
            var6.field4912 = arg4;
            var6.field4899 = arg0;
            var6.field4903 = var5;
            var6.field4905 = var5.field2073;
            class18.method267(var6);
        }
        boolean var7 = true;
        if (var5.field2108 > 0) {
            var7 = class426.method2621(false, var5);
        }
        if (!var7 || !client.method1648(var5).method977(arg4 - 1, arg2)) {
            return;
        }
        if (arg4 == 1) {
            class132.field1893++;
            class355.field4828.method1801(28, (byte) -116);
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(arg2, arg3);
        }
        if (arg4 == 2) {
            class97.field1398++;
            class355.field4828.method1801(78, (byte) -103);
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(arg2, arg3);
        }
        if (arg4 == 3) {
            class204.field2867++;
            class355.field4828.method1801(129, (byte) -67);
            class355.field4828.method1854(arg1, arg2);
            class355.field4828.method1877(true, arg3);
        }
        if (arg4 == 4) {
            class355.field4828.method1801(238, (byte) -123);
            class378.field5317++;
            class355.field4828.method1854(arg1, arg2);
            class355.field4828.method1877(true, arg3);
        }
        if (arg4 == 5) {
            class355.field4828.method1801(124, (byte) -82);
            class102.field1507++;
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(true, arg3);
        }
        if (arg4 == 6) {
            class355.field4828.method1801(101, (byte) -96);
            class424.field5939++;
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(true, arg3);
        }
        if (arg4 == 7) {
            class382.field5363++;
            class355.field4828.method1801(83, (byte) -93);
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(true, arg3);
        }
        if (arg4 == 8) {
            class355.field4828.method1801(114, (byte) -61);
            class398.field5568++;
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(true, arg3);
        }
        if (arg4 == 9) {
            class355.field4828.method1801(104, (byte) -69);
            class338.field4602++;
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(true, arg3);
        }
        if (arg4 == 10) {
            class355.field4828.method1801(251, (byte) -120);
            class183.field2665++;
            class355.field4828.method1854(arg1, true);
            class355.field4828.method1877(true, arg3);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(Z)V", line = 135)
    public static final void method1177(boolean arg0) {
        class410 var1 = class244.field3366;
        synchronized (class244.field3366) {
            class244.field3366.method2533(0);
            if (arg0) {
                field2334 = false;
            }
        }
        field2331++;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "([B)V", line = 149)
    public class153(byte[] arg0) {
        this.field2325 = arg0;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZ)V", line = 157)
    public static final void method1178(byte arg0, boolean arg1) {
        field2326++;
        if (arg1 && class99.field1409 != null) {
            class406.field5635 = class99.field1409.field613;
        } else {
            class406.field5635 = -1;
        }
        int var2 = -103 % ((-arg0 - 77) / 37);
        class99.field1409 = null;
        class199.field2831 = 0;
        class71.field1081 = null;
        class30.field500 = null;
        class99.method845();
        class99.field1416.method1250(10346);
        class52.field855 = null;
        class263.field3537 = null;
        class370.field5087 = null;
        class69.field1053 = null;
        class278.field3743 = null;
        class126.field1759 = null;
        class39.field605 = -1;
        class154.field2340 = null;
        class424.field5963 = null;
        class99.field1411 = null;
        class411.field5753 = null;
        class44.field709 = -1;
        class126.method981(-758913124);
        class383.field5373 = null;
        class97.method818((byte) 127, 128, 64);
        class305.method1967(64, 3, 64);
        class21.method274(false, 64);
        class105.method884(0, 64);
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)I", line = 199)
    public static final int method1179(int arg0, int arg1, byte arg2) {
        field2330++;
        if (arg2 >= -33) {
            return -70;
        } else {
            int var3 = arg1 - 1 & arg0 >> 31;
            return (arg0 + (arg0 >>> 31)) % arg1 + var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "(I)V", line = 212)
    public static void method1180(int arg0) {
        field2329 = null;
        field2332 = null;
        if (arg0 != -5795) {
            method1180(-43);
        }
        field2328 = null;
    }
}
