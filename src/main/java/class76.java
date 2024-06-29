import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class76 {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Lh;")
    private class571 field1199 = new class571(64);

    @OriginalMember(owner = "client!in", name = "h", descriptor = "Lan;")
    private class21 field1206;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Z")
    public static boolean field1205 = true;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "Ldv;")
    public static class566 field1208 = new class566(26, 7);

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field1202;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field1207;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)V")
    public final void method584(byte arg0) {
        field1201++;
        class571 var2 = this.field1199;
        synchronized (this.field1199) {
            int var3 = -62 % ((arg0 - 58) / 50);
            this.field1199.method3248(0);
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V")
    public static final void method585(byte arg0) {
        class353.field4780 = 0;
        field1207++;
        int var1 = (class645.field9372.field6037 >> 7) + class519.field7304;
        int var2 = (class645.field9372.field6029 >> 7) + class6.field80;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class353.field4780 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class353.field4780 = 1;
        }
        if (arg0 >= -25) {
            field1205 = true;
        }
        if (class353.field4780 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class353.field4780 = 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static void method586(int arg0) {
        if (arg0 <= 39) {
            method585((byte) 81);
        }
        field1208 = null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(B)V")
    public final void method587(byte arg0) {
        class571 var2 = this.field1199;
        synchronized (this.field1199) {
            if (arg0 != 54) {
                return;
            }
            this.field1199.method3246(false);
        }
        field1200++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)Lto;")
    public final class8 method588(int arg0, int arg1) {
        field1204++;
        class571 var3 = this.field1199;
        class8 var4;
        synchronized (this.field1199) {
            var4 = (class8) this.field1199.method3252((long) arg1, (byte) 108);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0 != 1) {
            this.field1206 = null;
        }
        class21 var5 = this.field1206;
        byte[] var6;
        synchronized (this.field1206) {
            var6 = this.field1206.method240(16, arg1, (byte) -124);
        }
        class8 var7 = new class8();
        if (var6 != null) {
            var7.method49(new class11(var6), false);
        }
        class571 var8 = this.field1199;
        synchronized (this.field1199) {
            this.field1199.method3243(var7, (long) arg1, 103);
            return var7;
        }
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lhu;ILan;)V")
    public class76(class111 arg0, int arg1, class21 arg2) {
        this.field1206 = arg2;
        if (this.field1206 == null) {
            this.field1203 = 0;
        } else {
            this.field1203 = this.field1206.method231(16, -119);
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V")
    public final void method589(int arg0, int arg1) {
        field1202++;
        if (arg1 != 3056) {
            field1205 = true;
        }
        class571 var3 = this.field1199;
        synchronized (this.field1199) {
            this.field1199.method3253(arg0, arg1 - 3179);
        }
    }
}
