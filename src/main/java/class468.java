import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class468 {

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "Lng;")
    private class226 field6897 = new class226(64);

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "Lic;")
    private class491 field6901;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "Ltk;")
    public static class228 field6899;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "[[I")
    public static int[][] field6902;

    static {
        new class475("Ok", "Okay", "OK", "Ok");
        field6899 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(IZ)V", line = 15)
    public static final void method2796(int arg0, boolean arg1) {
        field6900++;
        class521.field7721 = -1;
        class271.field3940 = arg0;
        class83.field1289 = -1;
        class34.method194((byte) -70);
        if (!arg1) {
            method2799(81);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BII)V", line = 33)
    public static final void method2797(byte arg0, int arg1, int arg2) {
        field6896++;
        class433 var3 = new class433(16);
        for (class84 var4 = (class84) class176.field2591.method2608(true); var4 != null; var4 = (class84) class176.field2591.method2603(120)) {
            var4.method2049(-116);
            int var6 = (int) (var4.field4736 >> 28);
            int var7 = (int) (var4.field4736 >> 14 & 0x3FFFL) - arg2;
            int var8 = (int) (var4.field4736 & 0x3FFFL) - arg1;
            if (var8 >= 0 && var7 >= 0 && class30.field323 > var8 && class182.field2661 > var7) {
                var3.method2606(var4, (long) (var6 << 28 | var7 << 14 | var8), 0);
            }
        }
        int var5 = -45 % ((33 - arg0) / 61);
        class176.field2591 = var3;
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(IZ)Lpt;", line = 77)
    public final class367 method2798(int arg0, boolean arg1) {
        field6898++;
        if (arg1) {
            field6902 = null;
        }
        class226 var3 = this.field6897;
        class367 var4;
        synchronized (this.field6897) {
            var4 = (class367) this.field6897.method1536((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6901.method2945(5, arg0, true);
        class367 var6 = new class367();
        if (var5 != null) {
            var6.method2277((byte) -124, new class209(var5));
        }
        class226 var7 = this.field6897;
        synchronized (this.field6897) {
            this.field6897.method1542(var6, (byte) 112, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(Lai;ILic;)V", line = 108)
    public class468(class423 arg0, int arg1, class491 arg2) {
        this.field6901 = arg2;
        this.field6901.method2942(false, 5);
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 123)
    public static void method2799(int arg0) {
        if (arg0 != 5602) {
            field6902 = null;
        }
        field6902 = null;
    }
}
