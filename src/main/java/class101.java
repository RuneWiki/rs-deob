import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class101 {

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Llc;")
    public static class69 field2186 = null;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "[I")
    public static int[] field2190 = new int[25];

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2196 = 0;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "Z")
    public static boolean field2194 = false;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "[Llc;")
    public static class69[] field2197 = new class69[500];

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
    public static int[] field2188 = new int[5];

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2193 = 0;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Llc;")
    public static class69 field2202 = class69.method470((byte) -121, "Please close the interface you have open before using (Wreport abuse(W");

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Llc;")
    public static class69 field2203 = class69.method470((byte) -116, "wave:");

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "[I")
    public static int[] field2195;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([II)V")
    public static final synchronized void method765(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class75.field1692 != null) {
            class75.field1692.method196(arg0, 0, var3);
        }
        class80.method579(var3, (byte) 103);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
    public void method766() {
        field2198++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(J)V")
    public void method767(long arg0) {
        field2199++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILkc;I)Z")
    public static final boolean method768(int arg0, int arg1, class63 arg2, int arg3) {
        field2201++;
        if (arg0 != 500) {
            method768(-20, 78, null, -59);
        }
        byte[] var4 = arg2.method394(arg3, arg1, (byte) -117);
        if (var4 == null) {
            return false;
        } else {
            class6.method34((byte) -88, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)V")
    public static final synchronized void method769(int arg0, byte arg1) {
        field2187++;
        if (class75.field1692 != null) {
            class75.field1692.method202(arg0);
        }
        int var2 = 23 % ((37 - arg1) / 46);
        class80.method579(arg0, (byte) 110);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static final void method770(byte arg0) {
        for (int var1 = 0; var1 < class62.field1284; var1++) {
            int var2 = class70.field1569[var1];
            class72 var3 = class112.field2434[var2];
            if (var3 != null) {
                class47.method312(-19512, var3.field1616.field1471, var3);
            }
        }
        if (arg0 != 17) {
            method769(-76, (byte) -105);
        }
        field2191++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lje;I)V")
    public static final synchronized void method771(class59 arg0, int arg1) {
        if (arg1 != 25) {
            field2197 = null;
        }
        class75.field1692 = arg0;
        field2200++;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(I)V")
    public class101(int arg0) {
        class35.field710 = arg0;
        class68.field1467 = System.currentTimeMillis();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method772(int arg0) {
        field2195 = null;
        field2186 = null;
        if (arg0 != 0) {
            method765(null, -9);
        }
        field2190 = null;
        field2203 = null;
        field2188 = null;
        field2202 = null;
        field2197 = null;
    }
}
