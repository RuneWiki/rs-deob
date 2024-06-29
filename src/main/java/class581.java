import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kha")
public class class581 implements class48 {

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "Loh;")
    private class404 field8210;

    @OriginalMember(owner = "client!kha", name = "e", descriptor = "Ljava/lang/String;")
    private String field8213;

    @OriginalMember(owner = "client!kha", name = "h", descriptor = "I")
    public static int field8216 = -1;

    @OriginalMember(owner = "client!kha", name = "i", descriptor = "I")
    public static int field8217 = 0;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!kha", name = "c", descriptor = "I")
    public static int field8211;

    @OriginalMember(owner = "client!kha", name = "d", descriptor = "I")
    public static int field8212;

    @OriginalMember(owner = "client!kha", name = "f", descriptor = "I")
    public static int field8214;

    @OriginalMember(owner = "client!kha", name = "g", descriptor = "I")
    public static int field8215;

    @OriginalMember(owner = "client!kha", name = "j", descriptor = "I")
    public static int field8218;

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IILha;)Lhu;", line = 4)
    public static final class131 method3344(int arg0, int arg1, class58 arg2) {
        field8214++;
        if (arg1 <= 16) {
            return null;
        }
        class456 var3 = (class456) class228.field2651.method1754(false, (long) arg0);
        if (var3 != null) {
            class315 var4 = var3.field6543.method3487(false);
            var3.field6538 = true;
            if (var4 != null) {
                return var4.method1873(0, arg2);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)Lvca;", line = 31)
    public final class279 method279(byte arg0) {
        if (arg0 != -127) {
            method3347(45, false, null, 51);
        }
        field8211++;
        return class279.field3423;
    }

    @OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)V", line = 46)
    public static final void method3345(byte arg0) {
        if (arg0 != 89) {
            return;
        }
        if (class230.field2686 == null || class412.field5620 == null) {
            class230.field2686 = new int[256];
            class412.field5620 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class230.field2686[var1] = (int) (Math.sin(var2) * 4096.0D);
                class412.field5620[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field8212++;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "([BII)[B", line = 78)
    public static final byte[] method3346(byte[] arg0, int arg1, int arg2) {
        field8218++;
        byte[] var3 = new byte[arg2];
        class143.method894(arg0, 0, var3, arg1, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)I", line = 92)
    public final int method278(boolean arg0) {
        field8215++;
        if (this.field8210.method2473((byte) 67, this.field8213)) {
            return 100;
        } else if (arg0) {
            return 0;
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!kha", name = "a", descriptor = "(IZLtp;I)V", line = 107)
    public static final void method3347(int arg0, boolean arg1, class532 arg2, int arg3) {
        field8209++;
        if (class344.field4474 != null || class149.field1652 || arg2 == null || class408.method2510(arg2, true) == null) {
            return;
        }
        class344.field4474 = arg2;
        class68.field694 = class408.method2510(arg2, true);
        class85.field903 = arg1;
        class582.field8219 = 0;
        class408.field5588 = arg0;
        class356.field4557 = arg3;
    }

    @OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Loh;Ljava/lang/String;)V", line = 128)
    public class581(class404 arg0, String arg1) {
        this.field8210 = arg0;
        this.field8213 = arg1;
    }
}
