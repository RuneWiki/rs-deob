import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class125 {

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public int field2201 = 16777215;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public int field2192 = 8;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Lck;")
    public static class264 field2197 = new class264();

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "[I")
    public static int[] field2202 = new int[200];

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field2203 = 0;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lsf;")
    public static class124 field2200 = new class124(4);

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "[Lol;")
    public static class258[] field2206 = new class258[29];

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "F")
    public static float field2204;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public int field2188;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field2189;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Lem;")
    public static class14 field2205;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Z")
    public boolean field2195;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V", line = 7)
    public static void method898(byte arg0) {
        field2206 = null;
        field2200 = null;
        if (arg0 != 88) {
            method901(92, (byte) 43);
        }
        field2205 = null;
        field2202 = null;
        field2197 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Z", line = 21)
    public static final boolean method899(byte arg0, int arg1) {
        field2199++;
        int var2 = 34 / ((17 - arg0) / 54);
        return arg1 == 4 || arg1 == 8;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILoe;I)V", line = 32)
    private final void method900(int arg0, int arg1, class146 arg2, int arg3) {
        if (arg0 == 1) {
            this.field2192 = arg2.method989(62);
        } else if (arg0 == 2) {
            this.field2195 = true;
        } else if (arg0 == 3) {
            this.field2191 = arg2.method1050(3);
            this.field2189 = arg2.method1050(3);
            this.field2188 = arg2.method1050(3);
        } else if (arg0 == 4) {
            this.field2194 = arg2.method1005((byte) 122);
        } else if (arg0 == 5) {
            this.field2190 = arg2.method989(111);
        } else if (arg0 == 6) {
            this.field2201 = arg2.method1025((byte) -117);
        }
        int var5 = -100 % ((arg1 + 57) / 52);
        field2196++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Laj;", line = 80)
    public static final class1 method901(int arg0, byte arg1) {
        class1 var2 = (class1) class173.field2874.method893((long) arg0, 117);
        field2193++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class76.field1370.method1404(36, arg0, (byte) -112);
        class1 var4 = new class1();
        var4.field33 = arg0;
        if (var3 != null) {
            var4.method1(true, new class146(var3));
        }
        int var5 = -125 % ((48 - arg1) / 35);
        class173.field2874.method888((long) arg0, var4, 111);
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILoe;)V", line = 109)
    public final void method902(int arg0, int arg1, class146 arg2) {
        field2198++;
        while (true) {
            int var4 = arg2.method1005((byte) 122);
            if (var4 == 0) {
                if (arg0 != 1) {
                    this.field2190 = -31;
                }
                return;
            }
            this.method900(var4, arg0 + 58, arg2, arg1);
        }
    }
}
